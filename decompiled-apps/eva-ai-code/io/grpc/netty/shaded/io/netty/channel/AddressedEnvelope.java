package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import java.net.SocketAddress;
/* loaded from: classes4.dex */
public interface AddressedEnvelope<M, A extends SocketAddress> extends ReferenceCounted {
    M content();

    A recipient();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    AddressedEnvelope<M, A> retain();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    AddressedEnvelope<M, A> retain(int i);

    A sender();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    AddressedEnvelope<M, A> touch();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    AddressedEnvelope<M, A> touch(Object obj);
}
