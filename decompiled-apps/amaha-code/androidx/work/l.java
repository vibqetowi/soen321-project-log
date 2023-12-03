package androidx.work;

import java.util.concurrent.CancellationException;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m<Object> f3324u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m<Object> mVar) {
        super(1);
        this.f3324u = mVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        Throwable th3 = th2;
        m<Object> mVar = this.f3324u;
        if (th3 == null) {
            if (!mVar.f3326v.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th3 instanceof CancellationException) {
            mVar.f3326v.cancel(true);
        } else {
            x2.c<Object> cVar = mVar.f3326v;
            Throwable cause = th3.getCause();
            if (cause != null) {
                th3 = cause;
            }
            cVar.j(th3);
        }
        return hs.k.f19476a;
    }
}
