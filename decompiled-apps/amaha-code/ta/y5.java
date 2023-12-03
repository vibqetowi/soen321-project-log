package ta;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public abstract class y5 extends x5 {

    /* renamed from: w  reason: collision with root package name */
    public boolean f32959w;

    public y5(d6 d6Var) {
        super(d6Var);
        this.f32947v.K++;
    }

    public final void i() {
        if (this.f32959w) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void j() {
        if (!this.f32959w) {
            k();
            this.f32947v.L++;
            this.f32959w = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void k();
}
