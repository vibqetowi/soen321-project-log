package io.grpc.netty.shaded.io.netty.handler.codec;

import io.grpc.netty.shaded.io.netty.util.Signal;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class DecoderResult {
    protected static final Signal SIGNAL_SUCCESS;
    protected static final Signal SIGNAL_UNFINISHED;
    public static final DecoderResult SUCCESS;
    public static final DecoderResult UNFINISHED;
    private final Throwable cause;

    static {
        Signal valueOf = Signal.valueOf(DecoderResult.class, "UNFINISHED");
        SIGNAL_UNFINISHED = valueOf;
        Signal valueOf2 = Signal.valueOf(DecoderResult.class, "SUCCESS");
        SIGNAL_SUCCESS = valueOf2;
        UNFINISHED = new DecoderResult(valueOf);
        SUCCESS = new DecoderResult(valueOf2);
    }

    public static DecoderResult failure(Throwable th) {
        return new DecoderResult((Throwable) ObjectUtil.checkNotNull(th, "cause"));
    }

    protected DecoderResult(Throwable th) {
        this.cause = (Throwable) ObjectUtil.checkNotNull(th, "cause");
    }

    public boolean isFinished() {
        return this.cause != SIGNAL_UNFINISHED;
    }

    public boolean isSuccess() {
        return this.cause == SIGNAL_SUCCESS;
    }

    public boolean isFailure() {
        Throwable th = this.cause;
        return (th == SIGNAL_SUCCESS || th == SIGNAL_UNFINISHED) ? false : true;
    }

    public Throwable cause() {
        if (isFailure()) {
            return this.cause;
        }
        return null;
    }

    public String toString() {
        if (isFinished()) {
            if (isSuccess()) {
                return "success";
            }
            String th = cause().toString();
            StringBuilder sb = new StringBuilder(th.length() + 17);
            sb.append("failure(");
            sb.append(th);
            sb.append(')');
            return sb.toString();
        }
        return "unfinished";
    }
}
