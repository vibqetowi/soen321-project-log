package ta;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32587a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32588b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32589c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32590d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j3 f32591e;

    public /* synthetic */ h3(j3 j3Var, long j10) {
        boolean z10;
        this.f32591e = j3Var;
        v9.o.e("health_monitor");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.b(z10);
        this.f32587a = "health_monitor:start";
        this.f32588b = "health_monitor:count";
        this.f32589c = "health_monitor:value";
        this.f32590d = j10;
    }

    public final void a() {
        j3 j3Var = this.f32591e;
        j3Var.h();
        j3Var.f32943u.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = j3Var.l().edit();
        edit.remove(this.f32588b);
        edit.remove(this.f32589c);
        edit.putLong(this.f32587a, currentTimeMillis);
        edit.apply();
    }
}
