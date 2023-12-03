package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class z2 implements b4 {

    /* renamed from: a  reason: collision with root package name */
    public static final z2 f7688a = new z2();

    @Override // com.google.android.gms.internal.cast.b4
    public final boolean a(Class<?> cls) {
        return c3.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.cast.b4
    public final a4 b(Class<?> cls) {
        String str;
        String str2;
        if (!c3.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (a4) c3.e(cls.asSubclass(c3.class)).c(null, 3);
        } catch (Exception e10) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e10);
        }
    }
}
