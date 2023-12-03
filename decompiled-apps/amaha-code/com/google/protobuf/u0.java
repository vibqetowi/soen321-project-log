package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.f;
import com.google.protobuf.r;
import com.google.protobuf.v;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
public final class u0<T> implements g1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f10068a;

    /* renamed from: b  reason: collision with root package name */
    public final m1<?, ?> f10069b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10070c;

    /* renamed from: d  reason: collision with root package name */
    public final o<?> f10071d;

    public u0(m1<?, ?> m1Var, o<?> oVar, q0 q0Var) {
        this.f10069b = m1Var;
        this.f10070c = oVar.e(q0Var);
        this.f10071d = oVar;
        this.f10068a = q0Var;
    }

    @Override // com.google.protobuf.g1
    public final void a(T t3, T t10) {
        Class<?> cls = h1.f9933a;
        m1<?, ?> m1Var = this.f10069b;
        m1Var.o(t3, m1Var.k(m1Var.g(t3), m1Var.g(t10)));
        if (this.f10070c) {
            h1.B(this.f10071d, t3, t10);
        }
    }

    @Override // com.google.protobuf.g1
    public final void b(Object obj, k kVar) {
        Iterator<Map.Entry<?, Object>> k10 = this.f10071d.c(obj).k();
        while (k10.hasNext()) {
            Map.Entry<?, Object> next = k10.next();
            r.a aVar = (r.a) next.getKey();
            if (aVar.o() == t1.D) {
                aVar.g();
                aVar.q();
                if (next instanceof c0.a) {
                    aVar.e();
                    kVar.l(0, ((c0.a) next).f9891u.getValue().b());
                } else {
                    aVar.e();
                    kVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m1<?, ?> m1Var = this.f10069b;
        m1Var.r(m1Var.g(obj), kVar);
    }

    @Override // com.google.protobuf.g1
    public final void c(T t3) {
        this.f10069b.j(t3);
        this.f10071d.f(t3);
    }

    @Override // com.google.protobuf.g1
    public final boolean d(T t3) {
        return this.f10071d.c(t3).i();
    }

    @Override // com.google.protobuf.g1
    public final void e(T t3, e1 e1Var, n nVar) {
        j jVar;
        m1 m1Var = this.f10069b;
        n1 f = m1Var.f(t3);
        o oVar = this.f10071d;
        r<ET> d10 = oVar.d(t3);
        do {
            try {
                jVar = (j) e1Var;
                if (jVar.a() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                m1Var.n(t3, f);
            }
        } while (k(jVar, nVar, oVar, d10, m1Var, f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        r10.c((r1 << 3) | 2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r1 = r3;
        r11 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad A[EDGE_INSN: B:61:0x00ad->B:43:0x00ad ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(T t3, byte[] bArr, int i6, int i10, f.a aVar) {
        Throwable th2;
        v vVar = (v) t3;
        n1 n1Var = vVar.unknownFields;
        if (n1Var == n1.f) {
            n1Var = new n1();
            vVar.unknownFields = n1Var;
        }
        n1 n1Var2 = n1Var;
        v.c cVar = (v.c) t3;
        r<v.d> rVar = cVar.extensions;
        if (rVar.f10027b) {
            cVar.extensions = rVar.clone();
        }
        Throwable th3 = null;
        int i11 = i6;
        v.e eVar = null;
        while (i11 < i10) {
            int G = f.G(bArr, i11, aVar);
            int i12 = aVar.f9905a;
            int i13 = 2;
            q0 q0Var = this.f10068a;
            o<?> oVar = this.f10071d;
            n nVar = aVar.f9908d;
            if (i12 != 11) {
                if ((i12 & 7) == 2) {
                    v.e b10 = oVar.b(nVar, q0Var, i12 >>> 3);
                    if (b10 == null) {
                        i11 = f.E(i12, bArr, G, i10, n1Var2, aVar);
                        eVar = b10;
                    } else {
                        b1 b1Var = b1.f9887c;
                        throw th3;
                    }
                } else {
                    i11 = f.M(i12, bArr, G, i10, aVar);
                }
            } else {
                int i14 = 0;
                Throwable th4 = th3;
                while (true) {
                    if (G < i10) {
                        G = f.G(bArr, G, aVar);
                        int i15 = aVar.f9905a;
                        int i16 = i15 >>> 3;
                        int i17 = i15 & 7;
                        if (i16 != i13) {
                            if (i16 == 3) {
                                if (eVar == null) {
                                    if (i17 == 2) {
                                        G = f.b(bArr, G, aVar);
                                        th4 = (h) aVar.f9907c;
                                        th2 = null;
                                        th3 = th2;
                                        i13 = 2;
                                    }
                                } else {
                                    b1 b1Var2 = b1.f9887c;
                                    throw null;
                                }
                            }
                            th2 = null;
                            if (i15 != 12) {
                                break;
                            }
                            G = f.M(i15, bArr, G, i10, aVar);
                            th3 = th2;
                            i13 = 2;
                        } else {
                            th2 = null;
                            if (i17 == 0) {
                                int G2 = f.G(bArr, G, aVar);
                                int i18 = aVar.f9905a;
                                G = G2;
                                i14 = i18;
                                eVar = oVar.b(nVar, q0Var, i18);
                                th3 = th2;
                                i13 = 2;
                            }
                            if (i15 != 12) {
                            }
                        }
                    } else {
                        th2 = th3;
                        break;
                    }
                }
            }
        }
        if (i11 == i10) {
            return;
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.protobuf.g1
    public final boolean g(T t3, T t10) {
        m1<?, ?> m1Var = this.f10069b;
        if (!m1Var.g(t3).equals(m1Var.g(t10))) {
            return false;
        }
        if (this.f10070c) {
            o<?> oVar = this.f10071d;
            return oVar.c(t3).equals(oVar.c(t10));
        }
        return true;
    }

    @Override // com.google.protobuf.g1
    public final int h(T t3) {
        j1<?, Object> j1Var;
        m1<?, ?> m1Var = this.f10069b;
        int i6 = 0;
        int i10 = m1Var.i(m1Var.g(t3)) + 0;
        if (this.f10070c) {
            r<?> c10 = this.f10071d.c(t3);
            int i11 = 0;
            while (true) {
                j1Var = c10.f10026a;
                if (i6 >= j1Var.d()) {
                    break;
                }
                i11 += r.f(j1Var.c(i6));
                i6++;
            }
            for (Map.Entry<?, Object> entry : j1Var.f()) {
                i11 += r.f(entry);
            }
            return i10 + i11;
        }
        return i10;
    }

    @Override // com.google.protobuf.g1
    public final T i() {
        q0 q0Var = this.f10068a;
        if (q0Var instanceof v) {
            return (T) ((v) ((v) q0Var).y(v.f.NEW_MUTABLE_INSTANCE));
        }
        return (T) q0Var.c().t();
    }

    @Override // com.google.protobuf.g1
    public final int j(T t3) {
        int hashCode = this.f10069b.g(t3).hashCode();
        if (this.f10070c) {
            return (hashCode * 53) + this.f10071d.c(t3).hashCode();
        }
        return hashCode;
    }

    public final <UT, UB, ET extends r.a<ET>> boolean k(e1 e1Var, n nVar, o<ET> oVar, r<ET> rVar, m1<UT, UB> m1Var, UB ub2) {
        j jVar = (j) e1Var;
        int i6 = jVar.f9968b;
        q0 q0Var = this.f10068a;
        if (i6 != 11) {
            if ((i6 & 7) == 2) {
                v.e b10 = oVar.b(nVar, q0Var, i6 >>> 3);
                if (b10 != null) {
                    oVar.h(b10);
                    return true;
                }
                return m1Var.l(ub2, e1Var);
            }
            return jVar.x();
        }
        v.e eVar = null;
        h hVar = null;
        int i10 = 0;
        while (jVar.a() != Integer.MAX_VALUE) {
            int i11 = jVar.f9968b;
            if (i11 == 16) {
                jVar.w(0);
                i10 = jVar.f9967a.y();
                eVar = oVar.b(nVar, q0Var, i10);
            } else if (i11 == 26) {
                if (eVar != null) {
                    oVar.h(eVar);
                } else {
                    hVar = jVar.e();
                }
            } else if (!jVar.x()) {
                break;
            }
        }
        if (jVar.f9968b == 12) {
            if (hVar != null) {
                if (eVar != null) {
                    oVar.i(eVar);
                } else {
                    m1Var.d(ub2, i10, hVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.a();
    }
}
