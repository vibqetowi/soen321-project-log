package ya;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final v f38392a = new v();

    public i() {
    }

    public final void a(Exception exc) {
        this.f38392a.a(exc);
    }

    public final void b(TResult tresult) {
        this.f38392a.b(tresult);
    }

    public final boolean c(Exception exc) {
        v vVar = this.f38392a;
        vVar.getClass();
        if (exc != null) {
            synchronized (vVar.f38416a) {
                if (vVar.f38418c) {
                    return false;
                }
                vVar.f38418c = true;
                vVar.f = exc;
                vVar.f38417b.h(vVar);
                return true;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void d(Object obj) {
        v vVar = this.f38392a;
        synchronized (vVar.f38416a) {
            if (!vVar.f38418c) {
                vVar.f38418c = true;
                vVar.f38420e = obj;
                vVar.f38417b.h(vVar);
            }
        }
    }

    public i(m mVar) {
        ((v) mVar.f38396u).addOnSuccessListener(j.f38393a, new l(new m(this)));
    }
}
