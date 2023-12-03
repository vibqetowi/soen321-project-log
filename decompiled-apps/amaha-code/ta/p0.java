package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class p0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32802u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f32803v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p2 f32804w;

    public /* synthetic */ p0(p2 p2Var, long j10, int i6) {
        this.f32802u = i6;
        this.f32804w = p2Var;
        this.f32803v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32802u;
        long j10 = this.f32803v;
        p2 p2Var = this.f32804w;
        switch (i6) {
            case 0:
                ((q1) p2Var).n(j10);
                return;
            default:
                c5 c5Var = (c5) p2Var;
                c5Var.f32943u.m().k(j10);
                c5Var.f32511y = null;
                return;
        }
    }
}
