package v9;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f34940a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34941b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f34942c;

    public r0(b bVar, Boolean bool) {
        this.f34942c = bVar;
        this.f34940a = bool;
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        synchronized (this) {
            this.f34940a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f34942c.G) {
            this.f34942c.G.remove(this);
        }
    }
}
