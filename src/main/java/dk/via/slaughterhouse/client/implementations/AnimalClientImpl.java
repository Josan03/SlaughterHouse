package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.AnimalClient;
import dk.via.slaughterhouse.dto.AnimalDTO;
import dk.via.slaughterhouse.model.Animal;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.protobuf.animal.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class AnimalClientImpl implements AnimalClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private AnimalServiceGrpc.AnimalServiceBlockingStub stub = AnimalServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimal(AnimalDTO animalDTO) {
        CreateAnimalRequest req = CreateAnimalRequest.newBuilder()
                .setAnimalTypeId(Long.parseLong(animalDTO.getAnimalTypeId()))
                .setWeight(animalDTO.getWeight())
                .setRegistrationDate(animalDTO.getRegistrationDate())
                .build();

        CreateAnimalResponse res = stub.createAnimal(req);
        return res.getConfirmation();
    }

    @Override
    public Animal getAnimal(Long animalId) {
        GetAnimalRequest req = GetAnimalRequest.newBuilder()
                .setAnimalId(animalId)
                .build();

        GetAnimalResponse res = stub.getAnimal(req);
        AnimalType animalType = new AnimalType();
        animalType.setId(res.getAnimalTypeId());
        return new Animal(res.getAnimalId(), animalType, res.getWeight(), res.getRegistrationDate());
    }

    @Override
    public List<Long> getAnimals(Long productId) {
        GetAnimalIdsRequest req = GetAnimalIdsRequest.newBuilder()
                .setProductId(productId)
                .build();

        GetAnimalIdsResponse res = stub.getAnimalIds(req);
        return res.getAnimalIdsList();
    }
}
