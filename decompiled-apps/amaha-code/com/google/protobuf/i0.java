package com.google.protobuf;

import java.nio.charset.Charset;
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9964b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final p0 f9965a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class a implements p0 {
        @Override // com.google.protobuf.p0
        public final o0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.p0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class b implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public final p0[] f9966a;

        public b(p0... p0VarArr) {
            this.f9966a = p0VarArr;
        }

        @Override // com.google.protobuf.p0
        public final o0 a(Class<?> cls) {
            p0[] p0VarArr;
            for (p0 p0Var : this.f9966a) {
                if (p0Var.b(cls)) {
                    return p0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.protobuf.p0
        public final boolean b(Class<?> cls) {
            for (p0 p0Var : this.f9966a) {
                if (p0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public i0() {
        p0 p0Var;
        p0[] p0VarArr = new p0[2];
        p0VarArr[0] = u.f10067a;
        try {
            p0Var = (p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f9964b;
        }
        p0VarArr[1] = p0Var;
        b bVar = new b(p0VarArr);
        Charset charset = y.f10086a;
        this.f9965a = bVar;
    }
}
