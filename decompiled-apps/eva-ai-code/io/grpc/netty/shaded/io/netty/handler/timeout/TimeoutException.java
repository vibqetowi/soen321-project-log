package io.grpc.netty.shaded.io.netty.handler.timeout;

import io.grpc.netty.shaded.io.netty.channel.ChannelException;
/* loaded from: classes4.dex */
public class TimeoutException extends ChannelException {
    private static final long serialVersionUID = 4673641882869672533L;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutException() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutException(boolean z) {
        super(null, null, z);
    }
}
