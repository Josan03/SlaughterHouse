package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.model.*;
import dk.via.slaughterhouse.model.AnimalPart;
import dk.via.slaughterhouse.protobuf.animalpart.*;
import dk.via.slaughterhouse.repository.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class AnimalPartServiceImpl extends AnimalPartServiceGrpc.AnimalPartServiceImplBase {
    @Autowired
    private AnimalPartRepository animalPartRepository;
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private AnimalPartTypeRepository animalPartTypeRepository;
    @Autowired
    private TrayRepository trayRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createAnimalPart(CreateAnimalPartRequest request, StreamObserver<CreateAnimalPartResponse> responseObserver) {
        AnimalPart animalPart = new AnimalPart();
        animalPart.setWeight(request.getWeight());
        animalRepository.findById(request.getAnimalId()).ifPresent(animalPart::setAnimal);
        animalPartTypeRepository.findById(request.getAnimalPartTypeId()).ifPresent(animalPart::setAnimalPartType);
        trayRepository.findById(request.getTrayId()).ifPresent(animalPart::setTray);
        productRepository.findById(request.getProductId()).ifPresent(animalPart::setProduct);
        AnimalPart resAnimalPart = animalPartRepository.save(animalPart);

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
        Optional<AnimalPart> animalPart = animalPartRepository.findById(request.getId());
        GetAnimalPartResponse.Builder builder = GetAnimalPartResponse.newBuilder();
        builder.setId(animalPart.get().getId());
        builder.setWeight(animalPart.get().getWeight());
        builder.setAnimalId(animalPart.get().getAnimal().getId());
        GetAnimalPartResponse res = builder.build();

        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
