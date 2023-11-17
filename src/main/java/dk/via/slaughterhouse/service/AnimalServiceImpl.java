package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.AnimalDAO;
import dk.via.slaughterhouse.model.Animal;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animal.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {
    @Autowired
    private AnimalDAO animalDAO;

    @Override
    public void createAnimal(CreateAnimalRequest request, StreamObserver<CreateAnimalResponse> responseObserver) {
        Animal animal = new Animal();
        AnimalType animalType = new AnimalType();
        animalType.setId(request.getAnimalTypeId());
        animal.setAnimalType(animalType);
        animal.setWeight(request.getWeight());
        animal.setRegistrationDate(request.getRegistrationDate());
        Animal resAnimal = animalDAO.createAnimal(animal);

        CreateAnimalResponse.Builder builder = CreateAnimalResponse.newBuilder();
        if (resAnimal == null) {
            builder.setConfirmation("Animal could not be created");
        } else {
            builder.setConfirmation("Animal created");
        }

        CreateAnimalResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimal(GetAnimalRequest request, StreamObserver<GetAnimalResponse> responseObserver) {
        Animal animal = animalDAO.getAnimal(request.getAnimalId());
        AnimalType animalType = new AnimalType();
        animalType.setId(animal.getAnimalType().getId());

        GetAnimalResponse.Builder builder = GetAnimalResponse.newBuilder();
        builder.setAnimalId(animal.getId());
        builder.setAnimalTypeId(animal.getAnimalType().getId());
        builder.setWeight(animal.getWeight());
        builder.setRegistrationDate(animal.getRegistrationDate());

        GetAnimalResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver) {
        List<Long> list = animalDAO.findAnimalIdsByProductId(request.getProductId());

        GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();

        for (Long id : list) {
            builder.addAnimalIds(id);
        }

        GetAnimalIdsResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
