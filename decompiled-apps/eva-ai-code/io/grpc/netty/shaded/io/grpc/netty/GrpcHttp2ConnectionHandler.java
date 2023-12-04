package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.Attributes;
import io.grpc.InternalChannelz;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2ConnectionDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2ConnectionEncoder;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Settings;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public abstract class GrpcHttp2ConnectionHandler extends Http2ConnectionHandler {
    @Nullable
    protected final ChannelPromise channelUnused;

    public void handleProtocolNegotiationCompleted(Attributes attributes, InternalChannelz.Security security) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GrpcHttp2ConnectionHandler(ChannelPromise channelPromise, Http2ConnectionDecoder http2ConnectionDecoder, Http2ConnectionEncoder http2ConnectionEncoder, Http2Settings http2Settings) {
        super(http2ConnectionDecoder, http2ConnectionEncoder, http2Settings);
        this.channelUnused = channelPromise;
    }

    @Deprecated
    public void handleProtocolNegotiationCompleted(Attributes attributes) {
        handleProtocolNegotiationCompleted(attributes, null);
    }

    public void notifyUnused() {
        this.channelUnused.setSuccess((Void) null);
    }

    public Attributes getEagAttributes() {
        return Attributes.EMPTY;
    }

    public String getAuthority() {
        throw new UnsupportedOperationException();
    }
}
