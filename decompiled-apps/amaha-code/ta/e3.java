package ta;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32539a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32540b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32541c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32542d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j3 f32543e;

    public e3(j3 j3Var, String str, boolean z10) {
        this.f32543e = j3Var;
        v9.o.e(str);
        this.f32539a = str;
        this.f32540b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f32543e.l().edit();
        edit.putBoolean(this.f32539a, z10);
        edit.apply();
        this.f32542d = z10;
    }

    public final boolean b() {
        if (!this.f32541c) {
            this.f32541c = true;
            this.f32542d = this.f32543e.l().getBoolean(this.f32539a, this.f32540b);
        }
        return this.f32542d;
    }
}
