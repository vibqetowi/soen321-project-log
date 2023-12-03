package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class a1 extends d1 {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23483z = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: y  reason: collision with root package name */
    public final ss.l<Throwable, hs.k> f23484y;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(ss.l<? super Throwable, hs.k> lVar) {
        this.f23484y = lVar;
    }

    @Override // kotlinx.coroutines.w
    public final void B(Throwable th2) {
        if (f23483z.compareAndSet(this, 0, 1)) {
            this.f23484y.invoke(th2);
        }
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        B(th2);
        return hs.k.f19476a;
    }
}
