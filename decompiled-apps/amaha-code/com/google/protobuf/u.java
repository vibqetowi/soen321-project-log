package com.google.protobuf;

import com.google.protobuf.v;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class u implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u f10067a = new u();

    @Override // com.google.protobuf.p0
    public final o0 a(Class<?> cls) {
        if (v.class.isAssignableFrom(cls)) {
            try {
                return (o0) v.z(cls.asSubclass(v.class)).y(v.f.BUILD_MESSAGE_INFO);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.p0
    public final boolean b(Class<?> cls) {
        return v.class.isAssignableFrom(cls);
    }
}
