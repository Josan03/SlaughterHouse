package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.protobuf.animalparttype.*;
import dk.via.slaughterhouse.model.AnimalPartType;
import dk.via.slaughterhouse.repository.AnimalPartTypeRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class AnimalPartTypeServiceImpl extends AnimalPartTypeServiceGrpc.AnimalPartTypeServiceImplBase {
    @Autowired
    private AnimalPartTypeRepository animalPartTypeRepository;

    @Override
    public void createAnimalPartType(CreateAnimalPartTypeRequest request, StreamObserver<CreateAnimalPartTypeResponse> responseObserver) {
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setName(request.getName());
        animalPartType.setDescription(request.getDescription());

        AnimalPartType resAnimalPartType = animalPartTypeRepository.save(animalPartType);

        CreateAnimalPartTypeResponse.Builder builder = CreateAnimalPartTypeResponse.newBuilder();

        if (resAnimalPartType == null) {
            builder.setConfirmation("Animal part type could not be created");
        } else {
            builder.setConfirmation("Animal part type created");
        }

        CreateAnimalPartTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalPartType(GetAnimalPartTypeRequest request, StreamObserver<GetAnimalPartTypeResponse> responseObserver) {
        Optional<AnimalPartType> animalPartType = animalPartTypeRepository.findById(request.getId());

        GetAnimalPartTypeResponse.Builder builder = GetAnimalPartTypeResponse.newBuilder();
        builder.setId(animalPartType.get().getId());
        builder.setName(animalPartType.get().getName());
        builder.setDescription(animalPartType.get().getDescription());

        GetAnimalPartTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
