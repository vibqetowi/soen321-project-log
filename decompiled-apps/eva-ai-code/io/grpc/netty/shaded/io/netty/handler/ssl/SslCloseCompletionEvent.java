package io.grpc.netty.shaded.io.netty.handler.ssl;
/* loaded from: classes4.dex */
public final class SslCloseCompletionEvent extends SslCompletionEvent {
    public static final SslCloseCompletionEvent SUCCESS = new SslCloseCompletionEvent();

    private SslCloseCompletionEvent() {
    }

    public SslCloseCompletionEvent(Throwable th) {
        super(th);
    }
}
