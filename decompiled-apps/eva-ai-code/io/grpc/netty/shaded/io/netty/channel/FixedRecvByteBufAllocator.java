package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class FixedRecvByteBufAllocator extends DefaultMaxMessagesRecvByteBufAllocator {
    private final int bufferSize;

    /* loaded from: classes4.dex */
    private final class HandleImpl extends DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle {
        private final int bufferSize;

        HandleImpl(int i) {
            super();
            this.bufferSize = i;
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
            return this.bufferSize;
        }
    }

    public FixedRecvByteBufAllocator(int i) {
        ObjectUtil.checkPositive(i, "bufferSize");
        this.bufferSize = i;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator
    public RecvByteBufAllocator.Handle newHandle() {
        return new HandleImpl(this.bufferSize);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public FixedRecvByteBufAllocator respectMaybeMoreData(boolean z) {
        super.respectMaybeMoreData(z);
        return this;
    }
}
