package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.IntSupplier;
/* loaded from: classes4.dex */
public interface SelectStrategy {
    public static final int BUSY_WAIT = -3;
    public static final int CONTINUE = -2;
    public static final int SELECT = -1;

    int calculateStrategy(IntSupplier intSupplier, boolean z) throws Exception;
}
