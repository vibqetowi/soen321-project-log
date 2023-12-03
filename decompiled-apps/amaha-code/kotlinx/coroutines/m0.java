package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public abstract class m0<T> extends kotlinx.coroutines.scheduling.g {

    /* renamed from: w  reason: collision with root package name */
    public int f23637w;

    public m0(int i6) {
        this.f23637w = i6;
    }

    public abstract ls.d<T> e();

    public Throwable f(Object obj) {
        u uVar;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        return uVar.f23703a;
    }

    public final void h(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            ca.a.h(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.d(th2);
        ta.v.z(e().getContext(), new hs.e("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r6 = (kotlinx.coroutines.c1) r6.e(kotlinx.coroutines.c1.b.f23496u);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object j10;
        w1<?> w1Var;
        Object j11;
        kotlinx.coroutines.scheduling.h hVar = this.f23672v;
        try {
            kotlinx.coroutines.internal.d dVar = (kotlinx.coroutines.internal.d) e();
            ls.d<T> dVar2 = dVar.f23589y;
            Object obj = dVar.A;
            ls.f context = dVar2.getContext();
            Object c10 = kotlinx.coroutines.internal.t.c(context, obj);
            if (c10 != kotlinx.coroutines.internal.t.f23617a) {
                w1Var = y.c(dVar2, context, c10);
            } else {
                w1Var = null;
            }
            ls.f context2 = dVar2.getContext();
            Object j12 = j();
            Throwable f = f(j12);
            if (f == null) {
                int i6 = this.f23637w;
                boolean z10 = true;
                if (i6 != 1 && i6 != 2) {
                    z10 = false;
                }
            }
            c1 c1Var = null;
            if (c1Var != null && !c1Var.a()) {
                CancellationException I = c1Var.I();
                b(j12, I);
                dVar2.resumeWith(sp.b.j(I));
            } else if (f != null) {
                dVar2.resumeWith(sp.b.j(f));
            } else {
                dVar2.resumeWith(g(j12));
            }
            hs.k kVar = hs.k.f19476a;
            if (w1Var == null || w1Var.t0()) {
                kotlinx.coroutines.internal.t.a(context, c10);
            }
            try {
                hVar.a();
                j11 = hs.k.f19476a;
            } catch (Throwable th2) {
                j11 = sp.b.j(th2);
            }
            h(null, hs.g.a(j11));
        } catch (Throwable th3) {
            try {
                hVar.a();
                j10 = hs.k.f19476a;
            } catch (Throwable th4) {
                j10 = sp.b.j(th4);
            }
            h(th3, hs.g.a(j10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public void b(Object obj, CancellationException cancellationException) {
    }
}
