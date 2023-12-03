package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j1  reason: invalid package */
/* loaded from: classes.dex */
public enum j1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(h0.class, h0.f7869v),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: u  reason: collision with root package name */
    public final Object f7907u;

    j1(Class cls, Serializable serializable) {
        this.f7907u = serializable;
    }
}
