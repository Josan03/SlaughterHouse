package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.*;
import dk.via.slaughterhouse.model.*;
import dk.via.slaughterhouse.model.AnimalPart;
import dk.via.slaughterhouse.protobuf.animalpart.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class AnimalPartServiceImpl extends AnimalPartServiceGrpc.AnimalPartServiceImplBase {
    @Autowired
    private AnimalPartDAO animalPartDAO;
    @Autowired
    private AnimalDAO animalDAO;
    @Autowired
    private AnimalPartTypeDAO animalPartTypeDAO;
    @Autowired
    private TrayDAO trayDAO;
    @Autowired
    private ProductDAO productDAO;

    @Override
    public void createAnimalPart(CreateAnimalPartRequest request, StreamObserver<CreateAnimalPartResponse> responseObserver) {
        AnimalPart animalPart = new AnimalPart();
        animalPart.setWeight(request.getWeight());

        Animal animal = animalDAO.getAnimal(request.getAnimalId());
        if (animal != null)
            animalPart.setAnimal(animal);

        AnimalPartType animalPartType = animalPartTypeDAO.getAnimalPartType(request.getAnimalPartTypeId());
        if (animalPartType != null)
            animalPart.setAnimalPartType(animalPartType);

        Tray tray = trayDAO.getTray(request.getTrayId());
        if (tray != null)
            animalPart.setTray(tray);

        Product product = productDAO.getProduct(request.getProductId());
        if (product != null)
            animalPart.setProduct(product);

        AnimalPart resAnimalPart = animalPartDAO.createAnimalPart(animalPart);

        CreateAnimalPartResponse.Builder builder = CreateAnimalPartResponse.newBuilder();
        if (resAnimalPart == null) {
            builder.setConfirmation("Animal part could not be created");
        } else {
            builder.setConfirmation("Animal part created");
        }

        CreateAnimalPartResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalPart(GetAnimalPartRequest request, StreamObserver<GetAnimalPartResponse> responseObserver) {
        AnimalPart animalPart = animalPartDAO.getAnimalPart(request.getId());
        GetAnimalPartResponse.Builder builder = GetAnimalPartResponse.newBuilder();
        builder.setId(animalPart.getId());
        builder.setWeight(animalPart.getWeight());
        builder.setAnimalId(animalPart.getAnimal().getId());
        GetAnimalPartResponse res = builder.build();

        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
