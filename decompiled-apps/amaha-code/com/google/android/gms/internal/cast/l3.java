package com.google.android.gms.internal.cast;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public enum l3 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(n2.class, n2.f7604v),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: u  reason: collision with root package name */
    public final Object f7582u;

    l3(Class cls, Serializable serializable) {
        this.f7582u = serializable;
    }
}
