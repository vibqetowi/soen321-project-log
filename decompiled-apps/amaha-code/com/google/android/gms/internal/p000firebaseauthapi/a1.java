package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a1  reason: invalid package */
/* loaded from: classes.dex */
public final class a1 implements a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f7699a = new a1();

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final z1 a(Class cls) {
        if (e1.class.isAssignableFrom(cls)) {
            try {
                return (z1) e1.r(cls.asSubclass(e1.class)).m(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a2
    public final boolean b(Class cls) {
        return e1.class.isAssignableFrom(cls);
    }
}
