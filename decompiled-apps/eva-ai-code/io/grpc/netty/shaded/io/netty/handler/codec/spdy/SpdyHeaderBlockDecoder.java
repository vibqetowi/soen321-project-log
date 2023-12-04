package io.grpc.netty.shaded.io.netty.handler.codec.spdy;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class SpdyHeaderBlockDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void decode(ByteBufAllocator byteBufAllocator, ByteBuf byteBuf, SpdyHeadersFrame spdyHeadersFrame) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void end();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void endHeaderBlock(SpdyHeadersFrame spdyHeadersFrame) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpdyHeaderBlockDecoder newInstance(SpdyVersion spdyVersion, int i) {
        return new SpdyHeaderBlockZlibDecoder(spdyVersion, i);
    }
}
