package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.AnimalTypeClient;
import dk.via.slaughterhouse.dto.AnimalTypeDTO;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animaltype.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnimalTypeClientImpl implements AnimalTypeClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private AnimalTypeServiceGrpc.AnimalTypeServiceBlockingStub stub = AnimalTypeServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimalType(AnimalTypeDTO animalTypeDTO) {
        CreateAnimalTypeRequest req = CreateAnimalTypeRequest.newBuilder()
                .setName(animalTypeDTO.getName())
                .setDescription(animalTypeDTO.getDescription())
                .build();

        CreateAnimalTypeResponse res = stub.createAnimalType(req);
        return res.getConfirmation();
    }

    @Override
    public AnimalType getAnimalType(Long animalTypeId) {
        GetAnimalTypeRequest req = GetAnimalTypeRequest.newBuilder()
                .setId(animalTypeId)
                .build();

        GetAnimalTypeResponse res = stub.getAnimalType(req);
        AnimalType animalType = new AnimalType();
        animalType.setId(res.getId());
        animalType.setName(res.getName());
        animalType.setDescription(res.getDescription());
        return animalType;
    }
}
