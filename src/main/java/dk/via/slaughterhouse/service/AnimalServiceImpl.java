package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.model.Animal;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animal.*;
import dk.via.slaughterhouse.repository.AnimalRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void createAnimal(CreateAnimalRequest request, StreamObserver<CreateAnimalResponse> responseObserver) {
        Animal animal = new Animal();
        AnimalType animalType = new AnimalType();
        animalType.setId(request.getAnimalTypeId());
        animal.setAnimalType(animalType);
        animal.setWeight(request.getWeight());
        animal.setRegistrationDate(request.getRegistrationDate());
        Animal resAnimal = animalRepository.save(animal);

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
        Optional<Animal> animal = animalRepository.findById(request.getAnimalId());
        AnimalType animalType = new AnimalType();
        animalType.setId(animal.get().getAnimalType().getId());

        GetAnimalResponse.Builder builder = GetAnimalResponse.newBuilder();
        builder.setAnimalId(animal.get().getId());
        builder.setAnimalTypeId(animal.get().getAnimalType().getId());
        builder.setWeight(animal.get().getWeight());
        builder.setRegistrationDate(animal.get().getRegistrationDate());

        GetAnimalResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver) {
        List<Long> list = animalRepository.findAnimalIdsByProductId(request.getProductId());

        GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();

        for (Long id : list) {
            builder.addAnimalIds(id);
        }

        GetAnimalIdsResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
