package m1;

import android.content.Context;
/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f24771a;

    /* renamed from: b  reason: collision with root package name */
    public a<D> f24772b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24773c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24774d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24775e = true;
    public boolean f = false;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public final void a() {
        m1.a aVar = (m1.a) this;
        if (aVar.f24769h != null) {
            if (!aVar.f24773c) {
                aVar.f = true;
            }
            if (aVar.f24770i != null) {
                aVar.f24769h.getClass();
                aVar.f24769h = null;
                return;
            }
            aVar.f24769h.getClass();
            m1.a<D>.RunnableC0398a runnableC0398a = aVar.f24769h;
            runnableC0398a.f24780x.set(true);
            if (runnableC0398a.f24778v.cancel(false)) {
                aVar.f24770i = aVar.f24769h;
            }
            aVar.f24769h = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        ca.a.r(this, sb2);
        sb2.append(" id=");
        return pl.a.g(sb2, this.f24771a, "}");
    }
}
