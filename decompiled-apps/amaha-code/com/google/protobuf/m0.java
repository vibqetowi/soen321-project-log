package com.google.protobuf;

import com.google.protobuf.j0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class m0 implements l0 {
    @Override // com.google.protobuf.l0
    public final k0 a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f9996u) {
                k0Var = k0Var.c();
            }
            k0Var.b();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    @Override // com.google.protobuf.l0
    public final Object b(Object obj) {
        ((k0) obj).f9996u = false;
        return obj;
    }

    @Override // com.google.protobuf.l0
    public final j0.a<?, ?> c(Object obj) {
        return ((j0) obj).f9971a;
    }

    @Override // com.google.protobuf.l0
    public final k0 d() {
        return k0.f9995v.c();
    }

    @Override // com.google.protobuf.l0
    public final k0 e(Object obj) {
        return (k0) obj;
    }

    @Override // com.google.protobuf.l0
    public final int f(Object obj, int i6, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i10 = 0;
        if (!k0Var.isEmpty()) {
            for (Map.Entry entry : k0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                j0Var.getClass();
                int c0 = CodedOutputStream.c0(i6);
                int a10 = j0.a(j0Var.f9971a, key, value);
                i10 += CodedOutputStream.e0(a10) + a10 + c0;
            }
        }
        return i10;
    }

    @Override // com.google.protobuf.l0
    public final boolean g(Object obj) {
        return !((k0) obj).f9996u;
    }

    @Override // com.google.protobuf.l0
    public final k0 h(Object obj) {
        return (k0) obj;
    }
}
