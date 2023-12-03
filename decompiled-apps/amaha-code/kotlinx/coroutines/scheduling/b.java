package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.v0;
/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class b extends v0 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public static final b f23666w = new b();

    /* renamed from: x  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.e f23667x;

    static {
        k kVar = k.f23680w;
        int i6 = s.f23616a;
        if (64 >= i6) {
            i6 = 64;
        }
        boolean z10 = false;
        int b02 = sp.b.b0("kotlinx.coroutines.io.parallelism", i6, 0, 0, 12);
        kVar.getClass();
        if (b02 >= 1) {
            z10 = true;
        }
        if (z10) {
            f23667x = new kotlinx.coroutines.internal.e(kVar, b02);
            return;
        }
        throw new IllegalArgumentException(defpackage.c.p("Expected positive parallelism level, but got ", b02).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f0(ls.g.f24521u, runnable);
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        f23667x.f0(fVar, runnable);
    }

    @Override // kotlinx.coroutines.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
