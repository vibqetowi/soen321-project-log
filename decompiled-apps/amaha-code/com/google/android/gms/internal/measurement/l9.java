package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class l9 implements k9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8461a;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        e4Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        e4Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f8461a = e4Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e4Var.a(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    @Override // com.google.android.gms.internal.measurement.k9
    public final boolean a() {
        return ((Boolean) f8461a.b()).booleanValue();
    }
}
