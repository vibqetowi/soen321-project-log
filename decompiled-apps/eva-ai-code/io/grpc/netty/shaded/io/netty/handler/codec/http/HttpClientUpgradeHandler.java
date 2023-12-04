package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.ReferenceCountUtil;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes4.dex */
public class HttpClientUpgradeHandler extends HttpObjectAggregator implements ChannelOutboundHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final SourceCodec sourceCodec;
    private final UpgradeCodec upgradeCodec;
    private boolean upgradeRequested;

    /* loaded from: classes4.dex */
    public interface SourceCodec {
        void prepareUpgradeFrom(ChannelHandlerContext channelHandlerContext);

        void upgradeFrom(ChannelHandlerContext channelHandlerContext);
    }

    /* loaded from: classes4.dex */
    public interface UpgradeCodec {
        CharSequence protocol();

        Collection<CharSequence> setUpgradeHeaders(ChannelHandlerContext channelHandlerContext, HttpRequest httpRequest);

        void upgradeTo(ChannelHandlerContext channelHandlerContext, FullHttpResponse fullHttpResponse) throws Exception;
    }

    /* loaded from: classes4.dex */
    public enum UpgradeEvent {
        UPGRADE_ISSUED,
        UPGRADE_SUCCESSFUL,
        UPGRADE_REJECTED
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator, io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageDecoder
    public /* bridge */ /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object obj, List list) throws Exception {
        decode(channelHandlerContext, (HttpObject) obj, (List<Object>) list);
    }

    public HttpClientUpgradeHandler(SourceCodec sourceCodec, UpgradeCodec upgradeCodec, int i) {
        super(i);
        this.sourceCodec = (SourceCodec) ObjectUtil.checkNotNull(sourceCodec, "sourceCodec");
        this.upgradeCodec = (UpgradeCodec) ObjectUtil.checkNotNull(upgradeCodec, "upgradeCodec");
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void bind(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, ChannelPromise channelPromise) throws Exception {
        channelHandlerContext.bind(socketAddress, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void connect(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) throws Exception {
        channelHandlerContext.connect(socketAddress, socketAddress2, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void disconnect(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        channelHandlerContext.disconnect(channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void close(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        channelHandlerContext.close(channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void deregister(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        channelHandlerContext.deregister(channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void read(ChannelHandlerContext channelHandlerContext) throws Exception {
        channelHandlerContext.read();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void write(ChannelHandlerContext channelHandlerContext, Object obj, ChannelPromise channelPromise) throws Exception {
        if (!(obj instanceof HttpRequest)) {
            channelHandlerContext.write(obj, channelPromise);
        } else if (this.upgradeRequested) {
            channelPromise.setFailure((Throwable) new IllegalStateException("Attempting to write HTTP request with upgrade in progress"));
        } else {
            this.upgradeRequested = true;
            setUpgradeRequestHeaders(channelHandlerContext, (HttpRequest) obj);
            channelHandlerContext.write(obj, channelPromise);
            channelHandlerContext.fireUserEventTriggered((Object) UpgradeEvent.UPGRADE_ISSUED);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void flush(ChannelHandlerContext channelHandlerContext) throws Exception {
        channelHandlerContext.flush();
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, HttpObject httpObject, List<Object> list) throws Exception {
        FullHttpResponse fullHttpResponse;
        FullHttpResponse fullHttpResponse2 = null;
        try {
            if (!this.upgradeRequested) {
                throw new IllegalStateException("Read HTTP response without requesting protocol switch");
            }
            if ((httpObject instanceof HttpResponse) && !HttpResponseStatus.SWITCHING_PROTOCOLS.equals(((HttpResponse) httpObject).status())) {
                channelHandlerContext.fireUserEventTriggered((Object) UpgradeEvent.UPGRADE_REJECTED);
                removeThisHandler(channelHandlerContext);
                channelHandlerContext.fireChannelRead((Object) httpObject);
                return;
            }
            if (httpObject instanceof FullHttpResponse) {
                fullHttpResponse = (FullHttpResponse) httpObject;
                try {
                    fullHttpResponse.retain();
                    list.add(fullHttpResponse);
                } catch (Throwable th) {
                    fullHttpResponse2 = fullHttpResponse;
                    th = th;
                    ReferenceCountUtil.release(fullHttpResponse2);
                    channelHandlerContext.fireExceptionCaught(th);
                    removeThisHandler(channelHandlerContext);
                    return;
                }
            } else {
                super.decode(channelHandlerContext, (ChannelHandlerContext) httpObject, list);
                if (list.isEmpty()) {
                    return;
                }
                fullHttpResponse = (FullHttpResponse) list.get(0);
            }
            FullHttpResponse fullHttpResponse3 = fullHttpResponse;
            String str = fullHttpResponse3.headers().get(HttpHeaderNames.UPGRADE);
            if (str != null && !AsciiString.contentEqualsIgnoreCase(this.upgradeCodec.protocol(), str)) {
                throw new IllegalStateException("Switching Protocols response with unexpected UPGRADE protocol: " + ((Object) str));
            }
            this.sourceCodec.prepareUpgradeFrom(channelHandlerContext);
            this.upgradeCodec.upgradeTo(channelHandlerContext, fullHttpResponse3);
            channelHandlerContext.fireUserEventTriggered((Object) UpgradeEvent.UPGRADE_SUCCESSFUL);
            this.sourceCodec.upgradeFrom(channelHandlerContext);
            fullHttpResponse3.release();
            list.clear();
            removeThisHandler(channelHandlerContext);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void removeThisHandler(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.pipeline().remove(channelHandlerContext.name());
    }

    private void setUpgradeRequestHeaders(ChannelHandlerContext channelHandlerContext, HttpRequest httpRequest) {
        httpRequest.headers().set(HttpHeaderNames.UPGRADE, this.upgradeCodec.protocol());
        LinkedHashSet<CharSequence> linkedHashSet = new LinkedHashSet(2);
        linkedHashSet.addAll(this.upgradeCodec.setUpgradeHeaders(channelHandlerContext, httpRequest));
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence : linkedHashSet) {
            sb.append(charSequence);
            sb.append(',');
        }
        sb.append((CharSequence) HttpHeaderValues.UPGRADE);
        httpRequest.headers().add(HttpHeaderNames.CONNECTION, sb.toString());
    }
}
