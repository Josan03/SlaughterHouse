package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.tray.*;
import dk.via.slaughterhouse.repository.TrayRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class TrayServiceImpl extends TrayServiceGrpc.TrayServiceImplBase {
    @Autowired
    private TrayRepository trayRepository;

    @Override
    public void createTray(CreateTrayRequest request, StreamObserver<CreateTrayResponse> responseObserver) {
        Tray tray = new Tray();
        tray.setDescription(request.getDescription());
        tray.setMaxWeight(request.getMaxWeight());
        Tray resTray = trayRepository.save(tray);

        CreateTrayResponse.Builder builder = CreateTrayResponse.newBuilder();

        if (resTray == null) {
            builder.setConfirmation("Tray could not be created");
        } else {
            builder.setConfirmation("Tray created");
        }

        CreateTrayResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getTray(GetTrayRequest request, StreamObserver<GetTrayResponse> responseObserver) {
        Optional<Tray> tray = trayRepository.findById(request.getId());

        GetTrayResponse.Builder builder = GetTrayResponse.newBuilder();
        builder.setId(tray.get().getId());
        builder.setDescription(tray.get().getDescription());
        builder.setMaxWeight(tray.get().getMaxWeight());

        GetTrayResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
