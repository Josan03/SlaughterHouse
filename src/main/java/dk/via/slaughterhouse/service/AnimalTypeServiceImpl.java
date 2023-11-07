package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animaltype.*;
import dk.via.slaughterhouse.repository.AnimalTypeRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class AnimalTypeServiceImpl extends AnimalTypeServiceGrpc.AnimalTypeServiceImplBase {
    @Autowired
    private AnimalTypeRepository animalTypeRepository;

    @Override
    public void createAnimalType(CreateAnimalTypeRequest request, StreamObserver<CreateAnimalTypeResponse> responseObserver) {
        AnimalType animalType = new AnimalType();
        animalType.setName(request.getName());
        animalType.setDescription(request.getDescription());

        AnimalType resAnimalType = animalTypeRepository.save(animalType);

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
        Optional<AnimalType> animalType = animalTypeRepository.findById(request.getId());

        GetAnimalTypeResponse.Builder builder = GetAnimalTypeResponse.newBuilder();
        builder.setId(animalType.get().getId());
        builder.setName(animalType.get().getName());
        builder.setDescription(animalType.get().getDescription());

        GetAnimalTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
