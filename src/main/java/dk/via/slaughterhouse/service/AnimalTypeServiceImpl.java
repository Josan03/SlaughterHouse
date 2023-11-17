package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.AnimalTypeDAO;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animaltype.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GRpcService
public class AnimalTypeServiceImpl extends AnimalTypeServiceGrpc.AnimalTypeServiceImplBase {
    @Autowired
    private AnimalTypeDAO animalTypeDAO;

    @Override
    public void createAnimalType(CreateAnimalTypeRequest request, StreamObserver<CreateAnimalTypeResponse> responseObserver) {
        AnimalType animalType = new AnimalType();
        animalType.setName(request.getName());
        animalType.setDescription(request.getDescription());

        AnimalType resAnimalType = animalTypeDAO.createAnimalType(animalType);

        CreateAnimalTypeResponse.Builder builder = CreateAnimalTypeResponse.newBuilder();

        if (resAnimalType == null) {
            builder.setConfirmation("Animal type could not be created");
        } else {
            builder.setConfirmation("Animal type created");
        }

        CreateAnimalTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalType(GetAnimalTypeRequest request, StreamObserver<GetAnimalTypeResponse> responseObserver) {
        AnimalType animalType = animalTypeDAO.getAnimalType(request.getId());

        GetAnimalTypeResponse.Builder builder = GetAnimalTypeResponse.newBuilder();
        builder.setId(animalType.getId());
        builder.setName(animalType.getName());
        builder.setDescription(animalType.getDescription());

        GetAnimalTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
