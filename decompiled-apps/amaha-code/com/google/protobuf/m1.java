package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class m1<T, B> {
    public abstract void a(int i6, int i10, Object obj);

    public abstract void b(int i6, long j10, Object obj);

    public abstract void c(B b10, int i6, T t3);

    public abstract void d(B b10, int i6, h hVar);

    public abstract void e(int i6, long j10, Object obj);

    public abstract n1 f(Object obj);

    public abstract n1 g(Object obj);

    public abstract int h(T t3);

    public abstract int i(T t3);

    public abstract void j(Object obj);

    public abstract n1 k(Object obj, Object obj2);

    public final boolean l(B b10, e1 e1Var) {
        j jVar = (j) e1Var;
        int i6 = jVar.f9968b;
        int i10 = i6 >>> 3;
        int i11 = i6 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            jVar.w(5);
                            a(i10, jVar.f9967a.m(), b10);
                            return true;
                        }
                        int i12 = InvalidProtocolBufferException.f9872w;
                        throw new InvalidProtocolBufferException.InvalidWireTypeException();
                    }
                    n1 m10 = m();
                    int i13 = (i10 << 3) | 4;
                    while (jVar.a() != Integer.MAX_VALUE && l(m10, jVar)) {
                    }
                    if (i13 == jVar.f9968b) {
                        c(b10, i10, q(m10));
                        return true;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                d(b10, i10, jVar.e());
                return true;
            }
            jVar.w(1);
            b(i10, jVar.f9967a.n(), b10);
            return true;
        }
        jVar.w(0);
        e(i10, jVar.f9967a.q(), b10);
        return true;
    }

    public abstract n1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t3);

    public abstract void p();

    public abstract n1 q(Object obj);

    public abstract void r(Object obj, k kVar);

    public abstract void s(Object obj, k kVar);
}
