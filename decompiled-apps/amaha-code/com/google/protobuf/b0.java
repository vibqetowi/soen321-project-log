package com.google.protobuf;

import java.io.Serializable;
/* compiled from: JavaType.java */
/* loaded from: classes.dex */
public enum b0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(h.class, h.f9922v),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: u  reason: collision with root package name */
    public final Object f9886u;

    b0(Class cls, Serializable serializable) {
        this.f9886u = serializable;
    }
}
