package io.grpc.netty.shaded.io.netty.handler.codec;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
/* loaded from: classes4.dex */
public final class Delimiters {
    public static ByteBuf[] nulDelimiter() {
        return new ByteBuf[]{Unpooled.wrappedBuffer(new byte[]{0})};
    }

    public static ByteBuf[] lineDelimiter() {
        return new ByteBuf[]{Unpooled.wrappedBuffer(new byte[]{13, 10}), Unpooled.wrappedBuffer(new byte[]{10})};
    }

    private Delimiters() {
    }
}
