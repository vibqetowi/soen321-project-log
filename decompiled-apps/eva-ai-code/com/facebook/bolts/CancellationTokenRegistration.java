package com.facebook.bolts;

import com.facebook.internal.NativeProtocol;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CancellationTokenRegistration.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\r\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0002\b\fJ\b\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/bolts/CancellationTokenRegistration;", "Ljava/io/Closeable;", "tokenSource", "Lcom/facebook/bolts/CancellationTokenSource;", NativeProtocol.WEB_DIALOG_ACTION, "Ljava/lang/Runnable;", "(Lcom/facebook/bolts/CancellationTokenSource;Ljava/lang/Runnable;)V", "closed", "", "close", "", "runAction", "runAction$facebook_bolts_release", "throwIfClosed", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource tokenSource, Runnable runnable) {
        Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.action = runnable;
        this.tokenSource = tokenSource;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            CancellationTokenSource cancellationTokenSource = this.tokenSource;
            if (cancellationTokenSource != null) {
                cancellationTokenSource.unregister$facebook_bolts_release(this);
            }
            this.tokenSource = null;
            this.action = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void runAction$facebook_bolts_release() {
        synchronized (this) {
            throwIfClosed();
            Runnable runnable = this.action;
            if (runnable != null) {
                runnable.run();
            }
            close();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }
}
