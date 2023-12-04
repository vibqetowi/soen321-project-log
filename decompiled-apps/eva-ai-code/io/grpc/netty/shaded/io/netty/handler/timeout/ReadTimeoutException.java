package io.grpc.netty.shaded.io.netty.handler.timeout;

import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
/* loaded from: classes4.dex */
public final class ReadTimeoutException extends TimeoutException {
    public static final ReadTimeoutException INSTANCE;
    private static final long serialVersionUID = 169287984113283421L;

    static {
        INSTANCE = PlatformDependent.javaVersion() >= 7 ? new ReadTimeoutException(true) : new ReadTimeoutException();
    }

    ReadTimeoutException() {
    }

    private ReadTimeoutException(boolean z) {
        super(z);
    }
}
