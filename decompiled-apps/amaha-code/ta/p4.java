package ta;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class p4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32809u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f32810v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t4 f32811w;

    public /* synthetic */ p4(t4 t4Var, AtomicReference atomicReference, int i6) {
        this.f32809u = i6;
        this.f32811w = t4Var;
        this.f32810v = atomicReference;
    }

    private final void a() {
        String str;
        synchronized (this.f32810v) {
            AtomicReference atomicReference = this.f32810v;
            y3 y3Var = this.f32811w.f32943u;
            f fVar = y3Var.A;
            String m10 = y3Var.p().m();
            i2 i2Var = j2.L;
            if (m10 == null) {
                fVar.getClass();
                str = (String) i2Var.a(null);
            } else {
                str = (String) i2Var.a(fVar.f32551w.e(m10, i2Var.f32615a));
            }
            atomicReference.set(str);
            this.f32810v.notify();
        }
    }

    private final void b() {
        synchronized (this.f32810v) {
            AtomicReference atomicReference = this.f32810v;
            y3 y3Var = this.f32811w.f32943u;
            atomicReference.set(Long.valueOf(y3Var.A.n(y3Var.p().m(), j2.M)));
            this.f32810v.notify();
        }
    }

    private final void c() {
        synchronized (this.f32810v) {
            AtomicReference atomicReference = this.f32810v;
            y3 y3Var = this.f32811w.f32943u;
            atomicReference.set(Integer.valueOf(y3Var.A.l(y3Var.p().m(), j2.N)));
            this.f32810v.notify();
        }
    }

    private final void d() {
        synchronized (this.f32810v) {
            AtomicReference atomicReference = this.f32810v;
            y3 y3Var = this.f32811w.f32943u;
            atomicReference.set(Double.valueOf(y3Var.A.j(y3Var.p().m(), j2.O)));
            this.f32810v.notify();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32809u) {
            case 0:
                synchronized (this.f32810v) {
                    AtomicReference atomicReference = this.f32810v;
                    y3 y3Var = this.f32811w.f32943u;
                    atomicReference.set(Boolean.valueOf(y3Var.A.q(y3Var.p().m(), j2.K)));
                    this.f32810v.notify();
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            default:
                d();
                return;
        }
    }
}
