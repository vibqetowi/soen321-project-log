package ta;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n4 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B = null;
    public final /* synthetic */ t4 C;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f32764u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32765v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f32766w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f32767x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f32768y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f32769z;

    public n4(t4 t4Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.C = t4Var;
        this.f32764u = str;
        this.f32765v = str2;
        this.f32766w = j10;
        this.f32767x = bundle;
        this.f32768y = z10;
        this.f32769z = z11;
        this.A = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.q(this.f32764u, this.f32765v, this.f32766w, this.f32767x, this.f32768y, this.f32769z, this.A, this.B);
    }
}
