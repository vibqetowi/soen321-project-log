package io.grpc;

import java.io.Closeable;
/* loaded from: classes4.dex */
public abstract class BinaryLog implements Closeable {
    public abstract Channel wrapChannel(Channel channel);

    public abstract <ReqT, RespT> ServerMethodDefinition<?, ?> wrapMethodDefinition(ServerMethodDefinition<ReqT, RespT> serverMethodDefinition);
}
