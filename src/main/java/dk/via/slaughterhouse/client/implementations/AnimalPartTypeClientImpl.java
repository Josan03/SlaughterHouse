package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.AnimalPartTypeClient;
import dk.via.slaughterhouse.dto.AnimalPartTypeDTO;
import dk.via.slaughterhouse.model.AnimalPartType;
import dk.via.slaughterhouse.protobuf.animalparttype.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnimalPartTypeClientImpl implements AnimalPartTypeClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private AnimalPartTypeServiceGrpc.AnimalPartTypeServiceBlockingStub stub = AnimalPartTypeServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimalPartType(AnimalPartTypeDTO animalPartTypeDTO) {
        CreateAnimalPartTypeRequest req = CreateAnimalPartTypeRequest.newBuilder()
                .setName(animalPartTypeDTO.getName())
                .setDescription(animalPartTypeDTO.getDescription())
                .build();

        CreateAnimalPartTypeResponse res = stub.createAnimalPartType(req);
        return res.getConfirmation();
    }

    @Override
    public AnimalPartType getAnimalPartType(Long animalPartTypeId) {
        GetAnimalPartTypeRequest req = GetAnimalPartTypeRequest.newBuilder()
                .setId(animalPartTypeId)
                .build();

        GetAnimalPartTypeResponse res = stub.getAnimalPartType(req);
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setId(res.getId());
        animalPartType.setName(res.getName());
        animalPartType.setDescription(res.getDescription());
        return animalPartType;
    }
}
