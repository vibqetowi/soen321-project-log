package io.grpc.netty.shaded.io.netty.channel.local;

import io.grpc.netty.shaded.io.netty.channel.DefaultEventLoopGroup;
import java.util.concurrent.ThreadFactory;
@Deprecated
/* loaded from: classes4.dex */
public class LocalEventLoopGroup extends DefaultEventLoopGroup {
    public LocalEventLoopGroup() {
    }

    public LocalEventLoopGroup(int i) {
        super(i);
    }

    public LocalEventLoopGroup(ThreadFactory threadFactory) {
        super(0, threadFactory);
    }

    public LocalEventLoopGroup(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }
}
