package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public enum d6 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(b5.class, b5.f8311v),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: u  reason: collision with root package name */
    public final Object f8337u;

    d6(Class cls, Serializable serializable) {
        this.f8337u = serializable;
    }
}
