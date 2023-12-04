package io.grpc.netty.shaded.io.netty.handler.timeout;

import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
/* loaded from: classes4.dex */
public final class WriteTimeoutException extends TimeoutException {
    public static final WriteTimeoutException INSTANCE;
    private static final long serialVersionUID = -144786655770296065L;

    static {
        INSTANCE = PlatformDependent.javaVersion() >= 7 ? new WriteTimeoutException(true) : new WriteTimeoutException();
    }

    private WriteTimeoutException() {
    }

    private WriteTimeoutException(boolean z) {
        super(z);
    }
}
