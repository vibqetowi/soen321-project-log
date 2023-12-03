package com.google.protobuf;

import java.util.Arrays;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class o1 extends m1<n1, n1> {
    @Override // com.google.protobuf.m1
    public final void a(int i6, int i10, Object obj) {
        ((n1) obj).c((i6 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.protobuf.m1
    public final void b(int i6, long j10, Object obj) {
        ((n1) obj).c((i6 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.protobuf.m1
    public final void c(n1 n1Var, int i6, n1 n1Var2) {
        n1Var.c((i6 << 3) | 3, n1Var2);
    }

    @Override // com.google.protobuf.m1
    public final void d(n1 n1Var, int i6, h hVar) {
        n1Var.c((i6 << 3) | 2, hVar);
    }

    @Override // com.google.protobuf.m1
    public final void e(int i6, long j10, Object obj) {
        ((n1) obj).c((i6 << 3) | 0, Long.valueOf(j10));
    }

    @Override // com.google.protobuf.m1
    public final n1 f(Object obj) {
        v vVar = (v) obj;
        n1 n1Var = vVar.unknownFields;
        if (n1Var == n1.f) {
            n1 n1Var2 = new n1();
            vVar.unknownFields = n1Var2;
            return n1Var2;
        }
        return n1Var;
    }

    @Override // com.google.protobuf.m1
    public final n1 g(Object obj) {
        return ((v) obj).unknownFields;
    }

    @Override // com.google.protobuf.m1
    public final int h(n1 n1Var) {
        return n1Var.b();
    }

    @Override // com.google.protobuf.m1
    public final int i(n1 n1Var) {
        n1 n1Var2 = n1Var;
        int i6 = n1Var2.f10010d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < n1Var2.f10007a; i11++) {
                int d02 = CodedOutputStream.d0(2, n1Var2.f10008b[i11] >>> 3);
                i10 += CodedOutputStream.K(3, (h) n1Var2.f10009c[i11]) + d02 + (CodedOutputStream.c0(1) * 2);
            }
            n1Var2.f10010d = i10;
            return i10;
        }
        return i6;
    }

    @Override // com.google.protobuf.m1
    public final void j(Object obj) {
        ((v) obj).unknownFields.f10011e = false;
    }

    @Override // com.google.protobuf.m1
    public final n1 k(Object obj, Object obj2) {
        n1 n1Var = (n1) obj;
        n1 n1Var2 = (n1) obj2;
        n1 n1Var3 = n1.f;
        if (!n1Var3.equals(n1Var2)) {
            if (n1Var3.equals(n1Var)) {
                int i6 = n1Var.f10007a + n1Var2.f10007a;
                int[] copyOf = Arrays.copyOf(n1Var.f10008b, i6);
                System.arraycopy(n1Var2.f10008b, 0, copyOf, n1Var.f10007a, n1Var2.f10007a);
                Object[] copyOf2 = Arrays.copyOf(n1Var.f10009c, i6);
                System.arraycopy(n1Var2.f10009c, 0, copyOf2, n1Var.f10007a, n1Var2.f10007a);
                return new n1(i6, copyOf, copyOf2, true);
            }
            n1Var.getClass();
            if (!n1Var2.equals(n1Var3)) {
                if (n1Var.f10011e) {
                    int i10 = n1Var.f10007a + n1Var2.f10007a;
                    n1Var.a(i10);
                    System.arraycopy(n1Var2.f10008b, 0, n1Var.f10008b, n1Var.f10007a, n1Var2.f10007a);
                    System.arraycopy(n1Var2.f10009c, 0, n1Var.f10009c, n1Var.f10007a, n1Var2.f10007a);
                    n1Var.f10007a = i10;
                    return n1Var;
                }
                throw new UnsupportedOperationException();
            }
            return n1Var;
        }
        return n1Var;
    }

    @Override // com.google.protobuf.m1
    public final n1 m() {
        return new n1();
    }

    @Override // com.google.protobuf.m1
    public final void n(Object obj, n1 n1Var) {
        ((v) obj).unknownFields = n1Var;
    }

    @Override // com.google.protobuf.m1
    public final void o(Object obj, n1 n1Var) {
        ((v) obj).unknownFields = n1Var;
    }

    @Override // com.google.protobuf.m1
    public final n1 q(Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.f10011e = false;
        return n1Var;
    }

    @Override // com.google.protobuf.m1
    public final void r(Object obj, k kVar) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        kVar.getClass();
        for (int i6 = 0; i6 < n1Var.f10007a; i6++) {
            kVar.l(n1Var.f10008b[i6] >>> 3, n1Var.f10009c[i6]);
        }
    }

    @Override // com.google.protobuf.m1
    public final void s(Object obj, k kVar) {
        ((n1) obj).d(kVar);
    }

    @Override // com.google.protobuf.m1
    public final void p() {
    }
}
