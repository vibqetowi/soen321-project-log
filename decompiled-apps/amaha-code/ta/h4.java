package ta;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32592a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32593b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32594c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32595d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f32596e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.t0 f32597g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32598h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f32599i;

    /* renamed from: j  reason: collision with root package name */
    public final String f32600j;

    public h4(Context context, com.google.android.gms.internal.measurement.t0 t0Var, Long l2) {
        this.f32598h = true;
        v9.o.h(context);
        Context applicationContext = context.getApplicationContext();
        v9.o.h(applicationContext);
        this.f32592a = applicationContext;
        this.f32599i = l2;
        if (t0Var != null) {
            this.f32597g = t0Var;
            this.f32593b = t0Var.f8610z;
            this.f32594c = t0Var.f8609y;
            this.f32595d = t0Var.f8608x;
            this.f32598h = t0Var.f8607w;
            this.f = t0Var.f8606v;
            this.f32600j = t0Var.B;
            Bundle bundle = t0Var.A;
            if (bundle != null) {
                this.f32596e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
