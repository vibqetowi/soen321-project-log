package androidx.lifecycle;

import java.io.Closeable;
/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class d implements Closeable, kotlinx.coroutines.d0 {

    /* renamed from: u  reason: collision with root package name */
    public final ls.f f2394u;

    public d(ls.f context) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f2394u = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sp.b.d(this.f2394u, null);
    }

    @Override // kotlinx.coroutines.d0
    public final ls.f f0() {
        return this.f2394u;
    }
}
