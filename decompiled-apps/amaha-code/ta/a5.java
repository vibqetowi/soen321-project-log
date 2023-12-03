package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class a5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z4 f32469u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z4 f32470v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f32471w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f32472x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c5 f32473y;

    public a5(c5 c5Var, z4 z4Var, z4 z4Var2, long j10, boolean z10) {
        this.f32473y = c5Var;
        this.f32469u = z4Var;
        this.f32470v = z4Var2;
        this.f32471w = j10;
        this.f32472x = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32473y.l(this.f32469u, this.f32470v, this.f32471w, this.f32472x, null);
    }
}
