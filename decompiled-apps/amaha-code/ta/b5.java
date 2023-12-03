package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class b5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32484u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c5 f32485v;

    public /* synthetic */ b5(c5 c5Var, int i6) {
        this.f32484u = i6;
        this.f32485v = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32484u;
        c5 c5Var = this.f32485v;
        switch (i6) {
            case 0:
                c5Var.f32511y = c5Var.D;
                return;
            default:
                c5Var.D = null;
                return;
        }
    }
}
