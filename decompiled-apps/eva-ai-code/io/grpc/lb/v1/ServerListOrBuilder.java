package io.grpc.lb.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes4.dex */
public interface ServerListOrBuilder extends MessageOrBuilder {
    Server getServers(int i);

    int getServersCount();

    List<Server> getServersList();

    ServerOrBuilder getServersOrBuilder(int i);

    List<? extends ServerOrBuilder> getServersOrBuilderList();
}
