package ta;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class z3 implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32969u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32970v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f32971w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f32972x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d4 f32973y;

    public /* synthetic */ z3(d4 d4Var, String str, String str2, String str3, int i6) {
        this.f32969u = i6;
        this.f32973y = d4Var;
        this.f32970v = str;
        this.f32971w = str2;
        this.f32972x = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f32969u;
        String str = this.f32970v;
        String str2 = this.f32972x;
        String str3 = this.f32971w;
        d4 d4Var = this.f32973y;
        switch (i6) {
            case 0:
                d4Var.f32521a.e();
                k kVar = d4Var.f32521a.f32532w;
                d6.H(kVar);
                return kVar.M(str, str3, str2);
            case 1:
                d4Var.f32521a.e();
                k kVar2 = d4Var.f32521a.f32532w;
                d6.H(kVar2);
                return kVar2.M(str, str3, str2);
            case 2:
                d4Var.f32521a.e();
                k kVar3 = d4Var.f32521a.f32532w;
                d6.H(kVar3);
                return kVar3.J(str, str3, str2);
            default:
                d4Var.f32521a.e();
                k kVar4 = d4Var.f32521a.f32532w;
                d6.H(kVar4);
                return kVar4.J(str, str3, str2);
        }
    }
}
