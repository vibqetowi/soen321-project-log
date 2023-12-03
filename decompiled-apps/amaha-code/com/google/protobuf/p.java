package com.google.protobuf;

import com.google.protobuf.n;
import com.google.protobuf.v;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
public final class p extends o<v.d> {
    @Override // com.google.protobuf.o
    public final void a(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
    }

    @Override // com.google.protobuf.o
    public final v.e b(n nVar, q0 q0Var, int i6) {
        nVar.getClass();
        return nVar.f10002a.get(new n.a(i6, q0Var));
    }

    @Override // com.google.protobuf.o
    public final r<v.d> c(Object obj) {
        return ((v.c) obj).extensions;
    }

    @Override // com.google.protobuf.o
    public final r<v.d> d(Object obj) {
        v.c cVar = (v.c) obj;
        r<v.d> rVar = cVar.extensions;
        if (rVar.f10027b) {
            cVar.extensions = rVar.clone();
        }
        return cVar.extensions;
    }

    @Override // com.google.protobuf.o
    public final boolean e(q0 q0Var) {
        return q0Var instanceof v.c;
    }

    @Override // com.google.protobuf.o
    public final void f(Object obj) {
        ((v.c) obj).extensions.l();
    }

    @Override // com.google.protobuf.o
    public final Object g(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    @Override // com.google.protobuf.o
    public final void h(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    @Override // com.google.protobuf.o
    public final void i(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    @Override // com.google.protobuf.o
    public final void j(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
        throw null;
    }
}
