package dk.via.slaughterhouse.client.implementations;

import dk.via.slaughterhouse.client.interfaces.TrayClient;
import dk.via.slaughterhouse.dto.TrayDTO;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.tray.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TrayClientImpl implements TrayClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
    private TrayServiceGrpc.TrayServiceBlockingStub stub = TrayServiceGrpc.newBlockingStub(channel);

    @Override
    public String createTray(TrayDTO trayDTO) {
        CreateTrayRequest req = CreateTrayRequest.newBuilder()
                .setDescription(trayDTO.getDescription())
                .setMaxWeight(trayDTO.getMaxWeight())
                .build();

        CreateTrayResponse res = stub.createTray(req);
        return res.getConfirmation();
    }

    @Override
    public Tray getTray(Long trayId) {
        GetTrayRequest req = GetTrayRequest.newBuilder()
                .setId(trayId)
                .build();

        GetTrayResponse res = stub.getTray(req);
        return new Tray(res.getId(), res.getDescription(), res.getMaxWeight());
    }
}
