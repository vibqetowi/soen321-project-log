package io.grpc.netty.shaded.io.netty.channel;

import java.nio.channels.ClosedChannelException;
/* loaded from: classes4.dex */
final class ExtendedClosedChannelException extends ClosedChannelException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    ExtendedClosedChannelException(Throwable th) {
        if (th != null) {
            initCause(th);
        }
    }
}
