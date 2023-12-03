package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.v0;
/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public class f extends v0 {

    /* renamed from: w  reason: collision with root package name */
    public final a f23670w;

    public f(long j10, int i6, int i10) {
        this.f23670w = new a(j10, "DefaultDispatcher", i6, i10);
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.B;
        this.f23670w.e(runnable, j.f, false);
    }
}
