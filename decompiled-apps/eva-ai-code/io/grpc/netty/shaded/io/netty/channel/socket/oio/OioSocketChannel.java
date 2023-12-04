package io.grpc.netty.shaded.io.netty.channel.socket.oio;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelException;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelFutureListener;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.channel.ConnectTimeoutException;
import io.grpc.netty.shaded.io.netty.channel.EventLoop;
import io.grpc.netty.shaded.io.netty.channel.oio.OioByteStreamChannel;
import io.grpc.netty.shaded.io.netty.channel.socket.ServerSocketChannel;
import io.grpc.netty.shaded.io.netty.channel.socket.SocketChannel;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.internal.SocketUtils;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
@Deprecated
/* loaded from: classes4.dex */
public class OioSocketChannel extends OioByteStreamChannel implements SocketChannel {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(OioSocketChannel.class);
    private final OioSocketChannelConfig config;
    private final Socket socket;

    public OioSocketChannel() {
        this(new Socket());
    }

    public OioSocketChannel(Socket socket) {
        this(null, socket);
    }

    public OioSocketChannel(Channel channel, Socket socket) {
        super(channel);
        this.socket = socket;
        this.config = new DefaultOioSocketChannelConfig(this, socket);
        try {
            try {
                if (socket.isConnected()) {
                    activate(socket.getInputStream(), socket.getOutputStream());
                }
                socket.setSoTimeout(1000);
            } catch (Throwable th) {
                try {
                    socket.close();
                } catch (IOException e) {
                    logger.warn("Failed to close a socket.", (Throwable) e);
                }
                throw th;
            }
        } catch (Exception e2) {
            throw new ChannelException("failed to initialize a socket", e2);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public ServerSocketChannel parent() {
        return (ServerSocketChannel) super.parent();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    public OioSocketChannelConfig config() {
        return this.config;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    public boolean isOpen() {
        return !this.socket.isClosed();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.OioByteStreamChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public boolean isActive() {
        return !this.socket.isClosed() && this.socket.isConnected();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public boolean isOutputShutdown() {
        return this.socket.isOutputShutdown() || !isActive();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioByteChannel, io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public boolean isInputShutdown() {
        return this.socket.isInputShutdown() || !isActive();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public boolean isShutdown() {
        return (this.socket.isInputShutdown() && this.socket.isOutputShutdown()) || !isActive();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected final void doShutdownOutput() throws Exception {
        shutdownOutput0();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdownOutput() {
        return shutdownOutput(newPromise());
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioByteChannel, io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdownInput() {
        return shutdownInput(newPromise());
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdown() {
        return shutdown(newPromise());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.oio.OioByteStreamChannel, io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioByteChannel
    public int doReadBytes(ByteBuf byteBuf) throws Exception {
        if (this.socket.isClosed()) {
            return -1;
        }
        try {
            return super.doReadBytes(byteBuf);
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdownOutput(final ChannelPromise channelPromise) {
        EventLoop eventLoop = eventLoop();
        if (eventLoop.inEventLoop()) {
            shutdownOutput0(channelPromise);
        } else {
            eventLoop.execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.channel.socket.oio.OioSocketChannel.1
                @Override // java.lang.Runnable
                public void run() {
                    OioSocketChannel.this.shutdownOutput0(channelPromise);
                }
            });
        }
        return channelPromise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdownOutput0(ChannelPromise channelPromise) {
        try {
            shutdownOutput0();
            channelPromise.setSuccess();
        } catch (Throwable th) {
            channelPromise.setFailure(th);
        }
    }

    private void shutdownOutput0() throws IOException {
        this.socket.shutdownOutput();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdownInput(final ChannelPromise channelPromise) {
        EventLoop eventLoop = eventLoop();
        if (eventLoop.inEventLoop()) {
            shutdownInput0(channelPromise);
        } else {
            eventLoop.execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.channel.socket.oio.OioSocketChannel.2
                @Override // java.lang.Runnable
                public void run() {
                    OioSocketChannel.this.shutdownInput0(channelPromise);
                }
            });
        }
        return channelPromise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdownInput0(ChannelPromise channelPromise) {
        try {
            this.socket.shutdownInput();
            channelPromise.setSuccess();
        } catch (Throwable th) {
            channelPromise.setFailure(th);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.socket.DuplexChannel
    public ChannelFuture shutdown(final ChannelPromise channelPromise) {
        ChannelFuture shutdownOutput = shutdownOutput();
        if (shutdownOutput.isDone()) {
            shutdownOutputDone(shutdownOutput, channelPromise);
        } else {
            shutdownOutput.addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.netty.channel.socket.oio.OioSocketChannel.3
                @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                public void operationComplete(ChannelFuture channelFuture) throws Exception {
                    OioSocketChannel.this.shutdownOutputDone(channelFuture, channelPromise);
                }
            });
        }
        return channelPromise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdownOutputDone(final ChannelFuture channelFuture, final ChannelPromise channelPromise) {
        ChannelFuture shutdownInput = shutdownInput();
        if (shutdownInput.isDone()) {
            shutdownDone(channelFuture, shutdownInput, channelPromise);
        } else {
            shutdownInput.addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.netty.channel.socket.oio.OioSocketChannel.4
                @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                public void operationComplete(ChannelFuture channelFuture2) throws Exception {
                    OioSocketChannel.shutdownDone(channelFuture, channelFuture2, channelPromise);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void shutdownDone(ChannelFuture channelFuture, ChannelFuture channelFuture2, ChannelPromise channelPromise) {
        Throwable cause = channelFuture.cause();
        Throwable cause2 = channelFuture2.cause();
        if (cause != null) {
            if (cause2 != null) {
                logger.debug("Exception suppressed because a previous exception occurred.", cause2);
            }
            channelPromise.setFailure(cause);
        } else if (cause2 != null) {
            channelPromise.setFailure(cause2);
        } else {
            channelPromise.setSuccess();
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public InetSocketAddress localAddress() {
        return (InetSocketAddress) super.localAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress) super.remoteAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected SocketAddress localAddress0() {
        return this.socket.getLocalSocketAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected SocketAddress remoteAddress0() {
        return this.socket.getRemoteSocketAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected void doBind(SocketAddress socketAddress) throws Exception {
        SocketUtils.bind(this.socket, socketAddress);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(SocketAddress socketAddress, SocketAddress socketAddress2) throws Exception {
        if (socketAddress2 != null) {
            SocketUtils.bind(this.socket, socketAddress2);
        }
        try {
            try {
                SocketUtils.connect(this.socket, socketAddress, config().getConnectTimeoutMillis());
                activate(this.socket.getInputStream(), this.socket.getOutputStream());
            } catch (SocketTimeoutException e) {
                ConnectTimeoutException connectTimeoutException = new ConnectTimeoutException("connection timed out: " + socketAddress);
                connectTimeoutException.setStackTrace(e.getStackTrace());
                throw connectTimeoutException;
            }
        } catch (Throwable th) {
            doClose();
            throw th;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected void doDisconnect() throws Exception {
        doClose();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.OioByteStreamChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected void doClose() throws Exception {
        this.socket.close();
    }

    protected boolean checkInputShutdown() {
        if (isInputShutdown()) {
            try {
                Thread.sleep(config().getSoTimeout());
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioChannel
    @Deprecated
    public void setReadPending(boolean z) {
        super.setReadPending(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clearReadPending0() {
        clearReadPending();
    }
}
