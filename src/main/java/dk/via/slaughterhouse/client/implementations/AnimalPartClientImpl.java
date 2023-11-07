package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.AnimalPartClient;
import dk.via.slaughterhouse.dto.AnimalPartDTO;
import dk.via.slaughterhouse.model.Animal;
import dk.via.slaughterhouse.model.AnimalPart;
import dk.via.slaughterhouse.protobuf.animalpart.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnimalPartClientImpl implements AnimalPartClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private AnimalPartServiceGrpc.AnimalPartServiceBlockingStub stub = AnimalPartServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimalPart(AnimalPartDTO animalPartDTO) {
        CreateAnimalPartRequest req = CreateAnimalPartRequest.newBuilder()
                .setWeight(animalPartDTO.getWeight())
                .setAnimalId(Long.parseLong(animalPartDTO.getAnimalId()))
                .setTrayId(Long.parseLong(animalPartDTO.getTrayId()))
                .setAnimalPartTypeId(Long.parseLong(animalPartDTO.getAnimalPartTypeId()))
                .setProductId(Long.parseLong(animalPartDTO.getProductId()))
                .build();

        CreateAnimalPartResponse res = stub.createAnimalPart(req);
        return res.getConfirmation();
    }

    @Override
    public AnimalPart getAnimalPart(Long animalPartId) {
        GetAnimalPartRequest req = GetAnimalPartRequest.newBuilder()
                .setId(animalPartId)
                .build();

        GetAnimalPartResponse res = stub.getAnimalPart(req);
        Animal animal = new Animal();
        animal.setId(res.getAnimalId());
        return new AnimalPart(res.getId(), res.getWeight(), animal);
    }
}
