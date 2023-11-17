package dk.via.slaughterhouse.service;

import dk.via.slaughterhouse.dao.interfaces.TrayDAO;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.protobuf.tray.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class TrayServiceImpl extends TrayServiceGrpc.TrayServiceImplBase {
    @Autowired
    private TrayDAO trayDAO;

    @Override
    public void createTray(CreateTrayRequest request, StreamObserver<CreateTrayResponse> responseObserver) {
        Tray tray = new Tray();
        tray.setDescription(request.getDescription());
        tray.setMaxWeight(request.getMaxWeight());
        Tray resTray = trayDAO.createTray(tray);

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
        Tray tray = trayDAO.getTray(request.getId());

        GetTrayResponse.Builder builder = GetTrayResponse.newBuilder();
        builder.setId(tray.getId());
        builder.setDescription(tray.getDescription());
        builder.setMaxWeight(tray.getMaxWeight());

        GetTrayResponse res = builder.build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
