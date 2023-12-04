package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection;
/* loaded from: classes4.dex */
public class Http2ConnectionAdapter implements Http2Connection.Listener {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onGoAwayReceived(int i, long j, ByteBuf byteBuf) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onGoAwaySent(int i, long j, ByteBuf byteBuf) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamActive(Http2Stream http2Stream) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamAdded(Http2Stream http2Stream) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamClosed(Http2Stream http2Stream) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamHalfClosed(Http2Stream http2Stream) {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Connection.Listener
    public void onStreamRemoved(Http2Stream http2Stream) {
    }
}
