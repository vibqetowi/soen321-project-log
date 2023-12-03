package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class m3 extends p2 {

    /* renamed from: v  reason: collision with root package name */
    public boolean f32741v;

    public m3(y3 y3Var) {
        super(y3Var);
        this.f32943u.Y++;
    }

    public final void i() {
        if (this.f32741v) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void j() {
        if (!this.f32741v) {
            if (!k()) {
                this.f32943u.e();
                this.f32741v = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean k();
}
