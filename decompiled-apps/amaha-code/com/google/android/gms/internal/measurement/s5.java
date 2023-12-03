package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class s5 implements u6 {

    /* renamed from: a  reason: collision with root package name */
    public static final s5 f8592a = new s5();

    @Override // com.google.android.gms.internal.measurement.u6
    public final t6 a(Class cls) {
        if (w5.class.isAssignableFrom(cls)) {
            try {
                return (t6) w5.s(cls.asSubclass(w5.class)).t(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final boolean b(Class cls) {
        return w5.class.isAssignableFrom(cls);
    }
}
