package io.grpc.netty.shaded.io.netty.channel.epoll;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelOutboundBuffer;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel;
import io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollStreamChannel;
import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketAddress;
import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketChannel;
import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketReadMode;
import io.grpc.netty.shaded.io.netty.channel.unix.FileDescriptor;
import io.grpc.netty.shaded.io.netty.channel.unix.PeerCredentials;
import java.io.IOException;
import java.net.SocketAddress;
/* loaded from: classes4.dex */
public final class EpollDomainSocketChannel extends AbstractEpollStreamChannel implements DomainSocketChannel {
    private final EpollDomainSocketChannelConfig config;
    private volatile DomainSocketAddress local;
    private volatile DomainSocketAddress remote;

    public EpollDomainSocketChannel() {
        super(LinuxSocket.newSocketDomain(), false);
        this.config = new EpollDomainSocketChannelConfig(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EpollDomainSocketChannel(Channel channel, FileDescriptor fileDescriptor) {
        super(channel, new LinuxSocket(fileDescriptor.intValue()));
        this.config = new EpollDomainSocketChannelConfig(this);
    }

    public EpollDomainSocketChannel(int i) {
        super(i);
        this.config = new EpollDomainSocketChannelConfig(this);
    }

    public EpollDomainSocketChannel(Channel channel, LinuxSocket linuxSocket) {
        super(channel, linuxSocket);
        this.config = new EpollDomainSocketChannelConfig(this);
    }

    public EpollDomainSocketChannel(int i, boolean z) {
        super(new LinuxSocket(i), z);
        this.config = new EpollDomainSocketChannelConfig(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollStreamChannel, io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
        return new EpollDomainUnsafe(this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public DomainSocketAddress localAddress0() {
        return this.local;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public DomainSocketAddress remoteAddress0() {
        return this.remote;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public void doBind(SocketAddress socketAddress) throws Exception {
        this.socket.bind(socketAddress);
        this.local = (DomainSocketAddress) socketAddress;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public EpollDomainSocketChannelConfig config() {
        return this.config;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel
    public boolean doConnect(SocketAddress socketAddress, SocketAddress socketAddress2) throws Exception {
        if (super.doConnect(socketAddress, socketAddress2)) {
            this.local = (DomainSocketAddress) socketAddress2;
            this.remote = (DomainSocketAddress) socketAddress;
            return true;
        }
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public DomainSocketAddress remoteAddress() {
        return (DomainSocketAddress) super.remoteAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel, io.grpc.netty.shaded.io.netty.channel.Channel
    public DomainSocketAddress localAddress() {
        return (DomainSocketAddress) super.localAddress();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollStreamChannel
    public int doWriteSingle(ChannelOutboundBuffer channelOutboundBuffer) throws Exception {
        Object current = channelOutboundBuffer.current();
        if ((current instanceof FileDescriptor) && this.socket.sendFd(((FileDescriptor) current).intValue()) > 0) {
            channelOutboundBuffer.remove();
            return 1;
        }
        return super.doWriteSingle(channelOutboundBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollStreamChannel, io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public Object filterOutboundMessage(Object obj) {
        return obj instanceof FileDescriptor ? obj : super.filterOutboundMessage(obj);
    }

    public PeerCredentials peerCredentials() throws IOException {
        return this.socket.getPeerCredentials();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class EpollDomainUnsafe extends AbstractEpollStreamChannel.EpollStreamUnsafe {
        private EpollDomainUnsafe() {
            super();
        }

        /* synthetic */ EpollDomainUnsafe(EpollDomainSocketChannel epollDomainSocketChannel, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe, io.grpc.netty.shaded.io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        public void epollInReady() {
            int i = AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode[EpollDomainSocketChannel.this.config().getReadMode().ordinal()];
            if (i == 1) {
                super.epollInReady();
            } else if (i == 2) {
                epollInReadFd();
            } else {
                throw new Error();
            }
        }

        private void epollInReadFd() {
            if (EpollDomainSocketChannel.this.socket.isInputShutdown()) {
                clearEpollIn0();
                return;
            }
            EpollDomainSocketChannelConfig config = EpollDomainSocketChannel.this.config();
            EpollRecvByteAllocatorHandle recvBufAllocHandle = recvBufAllocHandle();
            recvBufAllocHandle.edgeTriggered(EpollDomainSocketChannel.this.isFlagSet(Native.EPOLLET));
            ChannelPipeline pipeline = EpollDomainSocketChannel.this.pipeline();
            recvBufAllocHandle.reset(config);
            epollInBefore();
            do {
                try {
                    recvBufAllocHandle.lastBytesRead(EpollDomainSocketChannel.this.socket.recvFd());
                    int lastBytesRead = recvBufAllocHandle.lastBytesRead();
                    if (lastBytesRead == -1) {
                        close(voidPromise());
                        return;
                    } else if (lastBytesRead == 0) {
                        break;
                    } else {
                        recvBufAllocHandle.incMessagesRead(1);
                        this.readPending = false;
                        pipeline.fireChannelRead((Object) new FileDescriptor(recvBufAllocHandle.lastBytesRead()));
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            } while (recvBufAllocHandle.continueReading());
            recvBufAllocHandle.readComplete();
            pipeline.fireChannelReadComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.netty.channel.epoll.EpollDomainSocketChannel$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$unix$DomainSocketReadMode;

        static {
            int[] iArr = new int[DomainSocketReadMode.values().length];
            $SwitchMap$io$netty$channel$unix$DomainSocketReadMode = iArr;
            try {
                iArr[DomainSocketReadMode.BYTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$channel$unix$DomainSocketReadMode[DomainSocketReadMode.FILE_DESCRIPTORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
