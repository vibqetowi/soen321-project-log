package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder;
/* loaded from: classes4.dex */
interface PemEncoded extends ByteBufHolder {
    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    PemEncoded copy();

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    PemEncoded duplicate();

    boolean isSensitive();

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    PemEncoded replace(ByteBuf byteBuf);

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    PemEncoded retain();

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    PemEncoded retain(int i);

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    PemEncoded retainedDuplicate();

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    PemEncoded touch();

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    PemEncoded touch(Object obj);
}
