package ta;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32939a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32940b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32941c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f32942d;

    public x2(long j10, Bundle bundle, String str, String str2) {
        this.f32939a = str;
        this.f32940b = str2;
        this.f32942d = bundle;
        this.f32941c = j10;
    }

    public static x2 b(s sVar) {
        String str = sVar.f32858u;
        String str2 = sVar.f32860w;
        return new x2(sVar.f32861x, sVar.f32859v.f0(), str, str2);
    }

    public final s a() {
        return new s(this.f32939a, new q(new Bundle(this.f32942d)), this.f32940b, this.f32941c);
    }

    public final String toString() {
        String obj = this.f32942d.toString();
        return "origin=" + this.f32940b + ",name=" + this.f32939a + ",params=" + obj;
    }
}
