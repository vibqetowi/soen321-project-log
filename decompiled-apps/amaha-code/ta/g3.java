package ta;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32571a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32572b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32573c;

    /* renamed from: d  reason: collision with root package name */
    public long f32574d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j3 f32575e;

    public g3(j3 j3Var, String str, long j10) {
        this.f32575e = j3Var;
        v9.o.e(str);
        this.f32571a = str;
        this.f32572b = j10;
    }

    public final long a() {
        if (!this.f32573c) {
            this.f32573c = true;
            this.f32574d = this.f32575e.l().getLong(this.f32571a, this.f32572b);
        }
        return this.f32574d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f32575e.l().edit();
        edit.putLong(this.f32571a, j10);
        edit.apply();
        this.f32574d = j10;
    }
}
