package io.grpc.netty.shaded.io.netty.channel.epoll;

import io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator;
/* loaded from: classes4.dex */
final class EpollRecvByteAllocatorStreamingHandle extends EpollRecvByteAllocatorHandle {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EpollRecvByteAllocatorStreamingHandle(RecvByteBufAllocator.ExtendedHandle extendedHandle) {
        super(extendedHandle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.grpc.netty.shaded.io.netty.channel.epoll.EpollRecvByteAllocatorHandle
    public boolean maybeMoreDataToRead() {
        return lastBytesRead() == attemptedBytesRead() || isReceivedRdHup();
    }
}
