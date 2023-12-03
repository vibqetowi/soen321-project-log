package ta;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32620a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32621b;

    /* renamed from: c  reason: collision with root package name */
    public String f32622c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j3 f32623d;

    public i3(j3 j3Var, String str) {
        this.f32623d = j3Var;
        v9.o.e(str);
        this.f32620a = str;
    }

    public final String a() {
        if (!this.f32621b) {
            this.f32621b = true;
            this.f32622c = this.f32623d.l().getString(this.f32620a, null);
        }
        return this.f32622c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f32623d.l().edit();
        edit.putString(this.f32620a, str);
        edit.apply();
        this.f32622c = str;
    }
}
