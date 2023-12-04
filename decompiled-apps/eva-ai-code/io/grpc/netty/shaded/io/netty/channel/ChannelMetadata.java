package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public final class ChannelMetadata {
    private final int defaultMaxMessagesPerRead;
    private final boolean hasDisconnect;

    public ChannelMetadata(boolean z) {
        this(z, 1);
    }

    public ChannelMetadata(boolean z, int i) {
        ObjectUtil.checkPositive(i, "defaultMaxMessagesPerRead");
        this.hasDisconnect = z;
        this.defaultMaxMessagesPerRead = i;
    }

    public boolean hasDisconnect() {
        return this.hasDisconnect;
    }

    public int defaultMaxMessagesPerRead() {
        return this.defaultMaxMessagesPerRead;
    }
}
