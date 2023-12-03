package ta;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class v5 extends m3 {

    /* renamed from: w  reason: collision with root package name */
    public com.google.android.gms.internal.measurement.f0 f32915w;

    /* renamed from: x  reason: collision with root package name */
    public final u5 f32916x;

    /* renamed from: y  reason: collision with root package name */
    public final mh.e f32917y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.appcompat.widget.l f32918z;

    public v5(y3 y3Var) {
        super(y3Var);
        this.f32916x = new u5(this);
        this.f32917y = new mh.e(this);
        this.f32918z = new androidx.appcompat.widget.l(this);
    }

    @Override // ta.m3
    public final boolean k() {
        return false;
    }

    public final void l() {
        h();
        if (this.f32915w == null) {
            this.f32915w = new com.google.android.gms.internal.measurement.f0(Looper.getMainLooper());
        }
    }
}
