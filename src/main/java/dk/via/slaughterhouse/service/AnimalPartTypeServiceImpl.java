package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.AnimalPartTypeDAO;
import dk.via.slaughterhouse.protobuf.animalparttype.*;
import dk.via.slaughterhouse.model.AnimalPartType;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class AnimalPartTypeServiceImpl extends AnimalPartTypeServiceGrpc.AnimalPartTypeServiceImplBase {
    @Autowired
    private AnimalPartTypeDAO animalPartTypeDAO;

    @Override
    public void createAnimalPartType(CreateAnimalPartTypeRequest request, StreamObserver<CreateAnimalPartTypeResponse> responseObserver) {
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setName(request.getName());
        animalPartType.setDescription(request.getDescription());

        AnimalPartType resAnimalPartType = animalPartTypeDAO.createAnimalPartType(animalPartType);

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
        AnimalPartType animalPartType = animalPartTypeDAO.getAnimalPartType(request.getId());

        GetAnimalPartTypeResponse.Builder builder = GetAnimalPartTypeResponse.newBuilder();
        builder.setId(animalPartType.getId());
        builder.setName(animalPartType.getName());
        builder.setDescription(animalPartType.getDescription());

        GetAnimalPartTypeResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
