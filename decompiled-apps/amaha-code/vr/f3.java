package vr;

import java.io.Closeable;
import vr.h2;
import vr.i3;
/* compiled from: SquelchLateMessagesAvailableDeframerListener.java */
/* loaded from: classes2.dex */
public final class f3 extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public final h2.a f35616a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35617b;

    public f3(x0 x0Var) {
        this.f35616a = x0Var;
    }

    @Override // vr.h2.a
    public final void a(i3.a aVar) {
        if (this.f35617b) {
            if (aVar instanceof Closeable) {
                u0.b((Closeable) aVar);
                return;
            }
            return;
        }
        this.f35616a.a(aVar);
    }

    @Override // vr.h2.a
    public final void c(boolean z10) {
        this.f35617b = true;
        this.f35616a.c(z10);
    }

    @Override // vr.h2.a
    public final void e(Throwable th2) {
        this.f35617b = true;
        this.f35616a.e(th2);
    }
}
