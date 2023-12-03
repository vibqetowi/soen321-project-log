package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class e4 extends x3 {

    /* renamed from: v  reason: collision with root package name */
    public boolean f32544v;

    public e4(y3 y3Var) {
        super(y3Var, 1);
        this.f32943u.Y++;
    }

    public abstract boolean i();

    public final void j() {
        if (this.f32544v) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void k() {
        if (!this.f32544v) {
            if (!i()) {
                this.f32943u.e();
                this.f32544v = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
