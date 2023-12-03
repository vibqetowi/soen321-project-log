package kotlinx.coroutines;

import java.util.concurrent.Future;
/* compiled from: Future.kt */
/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23575u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f23576v;

    public /* synthetic */ g(int i6, Object obj) {
        this.f23575u = i6;
        this.f23576v = obj;
    }

    @Override // kotlinx.coroutines.i
    public final void a(Throwable th2) {
        int i6 = this.f23575u;
        Object obj = this.f23576v;
        switch (i6) {
            case 0:
                if (th2 != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            case 1:
                ((p0) obj).i();
                return;
            default:
                ((ss.l) obj).invoke(th2);
                return;
        }
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        switch (this.f23575u) {
            case 0:
                a(th2);
                return hs.k.f19476a;
            case 1:
                a(th2);
                return hs.k.f19476a;
            default:
                a(th2);
                return hs.k.f19476a;
        }
    }

    public final String toString() {
        int i6 = this.f23575u;
        Object obj = this.f23576v;
        switch (i6) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "DisposeOnCancel[" + ((p0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((ss.l) obj).getClass().getSimpleName() + '@' + e0.q(this) + ']';
        }
    }
}
