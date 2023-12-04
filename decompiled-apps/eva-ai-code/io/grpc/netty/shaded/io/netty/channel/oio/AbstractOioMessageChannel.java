package io.grpc.netty.shaded.io.netty.channel.oio;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelConfig;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes4.dex */
public abstract class AbstractOioMessageChannel extends AbstractOioChannel {
    private final List<Object> readBuf;

    protected abstract int doReadMessages(List<Object> list) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractOioMessageChannel(Channel channel) {
        super(channel);
        this.readBuf = new ArrayList();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioChannel
    protected void doRead() {
        Throwable th;
        boolean z;
        if (this.readPending) {
            boolean z2 = false;
            this.readPending = false;
            ChannelConfig config = config();
            ChannelPipeline pipeline = pipeline();
            RecvByteBufAllocator.Handle recvBufAllocHandle = unsafe().recvBufAllocHandle();
            recvBufAllocHandle.reset(config);
            do {
                try {
                    int doReadMessages = doReadMessages(this.readBuf);
                    if (doReadMessages == 0) {
                        break;
                    } else if (doReadMessages < 0) {
                        z = true;
                        break;
                    } else {
                        recvBufAllocHandle.incMessagesRead(doReadMessages);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } while (recvBufAllocHandle.continueReading());
            z = false;
            th = null;
            int size = this.readBuf.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    this.readPending = false;
                    pipeline.fireChannelRead(this.readBuf.get(i));
                }
                this.readBuf.clear();
                recvBufAllocHandle.readComplete();
                pipeline.fireChannelReadComplete();
                z2 = true;
            }
            if (th != null) {
                boolean z3 = th instanceof IOException ? true : z;
                pipeline.fireExceptionCaught(th);
                z = z3;
            }
            if (z) {
                if (isOpen()) {
                    unsafe().close(unsafe().voidPromise());
                }
            } else if (this.readPending || config.isAutoRead() || (!z2 && isActive())) {
                read();
            }
        }
    }
}
