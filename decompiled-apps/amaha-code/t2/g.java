package t2;

import android.content.Context;
import g.v;
import is.u;
import java.util.LinkedHashSet;
/* compiled from: ConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y2.a f32394a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f32395b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f32396c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<r2.a<T>> f32397d;

    /* renamed from: e  reason: collision with root package name */
    public T f32398e;

    public g(Context context, y2.b bVar) {
        this.f32394a = bVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "context.applicationContext");
        this.f32395b = applicationContext;
        this.f32396c = new Object();
        this.f32397d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(s2.b listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        synchronized (this.f32396c) {
            if (this.f32397d.remove(listener) && this.f32397d.isEmpty()) {
                e();
            }
            hs.k kVar = hs.k.f19476a;
        }
    }

    public final void c(T t3) {
        synchronized (this.f32396c) {
            T t10 = this.f32398e;
            if (t10 != null && kotlin.jvm.internal.i.b(t10, t3)) {
                return;
            }
            this.f32398e = t3;
            ((y2.b) this.f32394a).f38190c.execute(new v(u.I2(this.f32397d), 8, this));
            hs.k kVar = hs.k.f19476a;
        }
    }

    public abstract void d();

    public abstract void e();
}
