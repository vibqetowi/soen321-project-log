package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t8 implements s8 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8614a;

    /* renamed from: b  reason: collision with root package name */
    public static final b4 f8615b;

    static {
        e4 e4Var = new e4(x3.a(), true, true);
        e4Var.c("measurement.collection.event_safelist", true);
        f8614a = e4Var.c("measurement.service.store_null_safelist", true);
        f8615b = e4Var.c("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean b() {
        return ((Boolean) f8614a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean c() {
        return ((Boolean) f8615b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final void a() {
    }
}
