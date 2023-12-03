package com.google.protobuf;

import com.google.protobuf.n;
import com.google.protobuf.v;
import com.google.protobuf.y;
/* compiled from: ArrayDecoders.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ArrayDecoders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9905a;

        /* renamed from: b  reason: collision with root package name */
        public long f9906b;

        /* renamed from: c  reason: collision with root package name */
        public Object f9907c;

        /* renamed from: d  reason: collision with root package name */
        public final n f9908d;

        public a(n nVar) {
            nVar.getClass();
            this.f9908d = nVar;
        }
    }

    public static int A(byte[] bArr, int i6, a aVar) {
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a;
        if (i10 >= 0) {
            if (i10 == 0) {
                aVar.f9907c = "";
                return G;
            }
            aVar.f9907c = new String(bArr, G, i10, y.f10086a);
            return G + i10;
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        int G = G(bArr, i10, aVar);
        int i12 = aVar.f9905a;
        if (i12 >= 0) {
            if (i12 == 0) {
                dVar.add("");
                while (G < i11) {
                    int G2 = G(bArr, G, aVar);
                    if (i6 != aVar.f9905a) {
                        break;
                    }
                    G = G(bArr, G2, aVar);
                    i12 = aVar.f9905a;
                    if (i12 >= 0) {
                        if (i12 == 0) {
                            dVar.add("");
                        } else {
                            dVar.add(new String(bArr, G, i12, y.f10086a));
                            G += i12;
                            while (G < i11) {
                            }
                        }
                    } else {
                        throw InvalidProtocolBufferException.f();
                    }
                }
                return G;
            }
            dVar.add(new String(bArr, G, i12, y.f10086a));
            G += i12;
            while (G < i11) {
            }
            return G;
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int C(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        int i12;
        int G = G(bArr, i10, aVar);
        int i13 = aVar.f9905a;
        if (i13 >= 0) {
            if (i13 == 0) {
                dVar.add("");
                while (G < i11) {
                    int G2 = G(bArr, G, aVar);
                    if (i6 != aVar.f9905a) {
                        break;
                    }
                    G = G(bArr, G2, aVar);
                    int i14 = aVar.f9905a;
                    if (i14 >= 0) {
                        if (i14 == 0) {
                            dVar.add("");
                        } else {
                            i12 = G + i14;
                            if (r1.f(G, bArr, i12)) {
                                dVar.add(new String(bArr, G, i14, y.f10086a));
                                G = i12;
                                while (G < i11) {
                                }
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        }
                    } else {
                        throw InvalidProtocolBufferException.f();
                    }
                }
                return G;
            }
            i12 = G + i13;
            if (r1.f(G, bArr, i12)) {
                dVar.add(new String(bArr, G, i13, y.f10086a));
                G = i12;
                while (G < i11) {
                }
                return G;
            }
            throw InvalidProtocolBufferException.c();
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int D(byte[] bArr, int i6, a aVar) {
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a;
        if (i10 >= 0) {
            if (i10 == 0) {
                aVar.f9907c = "";
                return G;
            }
            aVar.f9907c = r1.f10029a.a(G, bArr, i10);
            return G + i10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int E(int i6, byte[] bArr, int i10, int i11, n1 n1Var, a aVar) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                n1Var.c(i6, Integer.valueOf(g(bArr, i10)));
                                return i10 + 4;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        n1 n1Var2 = new n1();
                        int i13 = (i6 & (-8)) | 4;
                        int i14 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int G = G(bArr, i10, aVar);
                            int i15 = aVar.f9905a;
                            if (i15 == i13) {
                                i14 = i15;
                                i10 = G;
                                break;
                            }
                            i14 = i15;
                            i10 = E(i15, bArr, G, i11, n1Var2, aVar);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            n1Var.c(i6, n1Var2);
                            return i10;
                        }
                        throw InvalidProtocolBufferException.g();
                    }
                    int G2 = G(bArr, i10, aVar);
                    int i16 = aVar.f9905a;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - G2) {
                            if (i16 == 0) {
                                n1Var.c(i6, h.f9922v);
                            } else {
                                n1Var.c(i6, h.r(G2, bArr, i16));
                            }
                            return G2 + i16;
                        }
                        throw InvalidProtocolBufferException.h();
                    }
                    throw InvalidProtocolBufferException.f();
                }
                n1Var.c(i6, Long.valueOf(i(bArr, i10)));
                return i10 + 8;
            }
            int I = I(bArr, i10, aVar);
            n1Var.c(i6, Long.valueOf(aVar.f9906b));
            return I;
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int F(int i6, byte[] bArr, int i10, a aVar) {
        int i11 = i6 & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            aVar.f9905a = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            aVar.f9905a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            aVar.f9905a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            aVar.f9905a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                aVar.f9905a = i19;
                return i20;
            }
        }
    }

    public static int G(byte[] bArr, int i6, a aVar) {
        int i10 = i6 + 1;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            aVar.f9905a = b10;
            return i10;
        }
        return F(b10, bArr, i10, aVar);
    }

    public static int H(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        int G = G(bArr, i10, aVar);
        xVar.g(aVar.f9905a);
        while (G < i11) {
            int G2 = G(bArr, G, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            G = G(bArr, G2, aVar);
            xVar.g(aVar.f9905a);
        }
        return G;
    }

    public static int I(byte[] bArr, int i6, a aVar) {
        byte b10;
        int i10 = i6 + 1;
        long j10 = bArr[i6];
        if (j10 >= 0) {
            aVar.f9906b = j10;
            return i10;
        }
        int i11 = i10 + 1;
        byte b11 = bArr[i10];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b11 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i12;
            b11 = bArr[i11];
            i11 = i13;
        }
        aVar.f9906b = j11;
        return i11;
    }

    public static int J(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        int I = I(bArr, i10, aVar);
        h0Var.g(aVar.f9906b);
        while (I < i11) {
            int G = G(bArr, I, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            I = I(bArr, G, aVar);
            h0Var.g(aVar.f9906b);
        }
        return I;
    }

    public static int K(Object obj, g1 g1Var, byte[] bArr, int i6, int i10, int i11, a aVar) {
        int K = ((t0) g1Var).K(obj, bArr, i6, i10, i11, aVar);
        aVar.f9907c = obj;
        return K;
    }

    public static int L(Object obj, g1 g1Var, byte[] bArr, int i6, int i10, a aVar) {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = F(i12, bArr, i11, aVar);
            i12 = aVar.f9905a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            g1Var.f(obj, bArr, i13, i14, aVar);
            aVar.f9907c = obj;
            return i14;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int M(int i6, byte[] bArr, int i10, int i11, a aVar) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                return i10 + 4;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        int i13 = (i6 & (-8)) | 4;
                        int i14 = 0;
                        while (i10 < i11) {
                            i10 = G(bArr, i10, aVar);
                            i14 = aVar.f9905a;
                            if (i14 == i13) {
                                break;
                            }
                            i10 = M(i14, bArr, i10, i11, aVar);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            return i10;
                        }
                        throw InvalidProtocolBufferException.g();
                    }
                    return G(bArr, i10, aVar) + aVar.f9905a;
                }
                return i10 + 8;
            }
            return I(bArr, i10, aVar);
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int a(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        boolean z10;
        boolean z11;
        g gVar = (g) dVar;
        int I = I(bArr, i10, aVar);
        if (aVar.f9906b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        gVar.g(z10);
        while (I < i11) {
            int G = G(bArr, I, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            I = I(bArr, G, aVar);
            if (aVar.f9906b != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            gVar.g(z11);
        }
        return I;
    }

    public static int b(byte[] bArr, int i6, a aVar) {
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - G) {
                if (i10 == 0) {
                    aVar.f9907c = h.f9922v;
                    return G;
                }
                aVar.f9907c = h.r(G, bArr, i10);
                return G + i10;
            }
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        int G = G(bArr, i10, aVar);
        int i12 = aVar.f9905a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - G) {
                if (i12 == 0) {
                    dVar.add(h.f9922v);
                    while (G < i11) {
                        int G2 = G(bArr, G, aVar);
                        if (i6 != aVar.f9905a) {
                            break;
                        }
                        G = G(bArr, G2, aVar);
                        i12 = aVar.f9905a;
                        if (i12 >= 0) {
                            if (i12 <= bArr.length - G) {
                                if (i12 == 0) {
                                    dVar.add(h.f9922v);
                                } else {
                                    dVar.add(h.r(G, bArr, i12));
                                    G += i12;
                                    while (G < i11) {
                                    }
                                }
                            } else {
                                throw InvalidProtocolBufferException.h();
                            }
                        } else {
                            throw InvalidProtocolBufferException.f();
                        }
                    }
                    return G;
                }
                dVar.add(h.r(G, bArr, i12));
                G += i12;
                while (G < i11) {
                }
                return G;
            }
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.f();
    }

    public static double d(byte[] bArr, int i6) {
        return Double.longBitsToDouble(i(bArr, i6));
    }

    public static int e(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        l lVar = (l) dVar;
        lVar.g(Double.longBitsToDouble(i(bArr, i10)));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int G = G(bArr, i12, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            lVar.g(Double.longBitsToDouble(i(bArr, G)));
            i12 = G + 8;
        }
        return i12;
    }

    public static int f(int i6, byte[] bArr, int i10, int i11, Object obj, q0 q0Var, a aVar) {
        n nVar = aVar.f9908d;
        nVar.getClass();
        if (nVar.f10002a.get(new n.a(i6 >>> 3, q0Var)) == null) {
            return E(i6, bArr, i10, i11, t0.r(obj), aVar);
        }
        v.c cVar = (v.c) obj;
        r<v.d> rVar = cVar.extensions;
        if (rVar.f10027b) {
            cVar.extensions = rVar.clone();
        }
        throw null;
    }

    public static int g(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public static int h(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        xVar.g(g(bArr, i10));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int G = G(bArr, i12, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            xVar.g(g(bArr, G));
            i12 = G + 4;
        }
        return i12;
    }

    public static long i(byte[] bArr, int i6) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    public static int j(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        h0Var.g(i(bArr, i10));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int G = G(bArr, i12, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            h0Var.g(i(bArr, G));
            i12 = G + 8;
        }
        return i12;
    }

    public static float k(byte[] bArr, int i6) {
        return Float.intBitsToFloat(g(bArr, i6));
    }

    public static int l(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        t tVar = (t) dVar;
        tVar.g(Float.intBitsToFloat(g(bArr, i10)));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int G = G(bArr, i12, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            tVar.g(Float.intBitsToFloat(g(bArr, G)));
            i12 = G + 4;
        }
        return i12;
    }

    public static int m(g1 g1Var, int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        int i12 = (i6 & (-8)) | 4;
        Object i13 = g1Var.i();
        int K = K(i13, g1Var, bArr, i10, i11, i12, aVar);
        g1Var.c(i13);
        aVar.f9907c = i13;
        dVar.add(i13);
        while (K < i11) {
            int G = G(bArr, K, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            Object i14 = g1Var.i();
            int K2 = K(i14, g1Var, bArr, G, i11, i12, aVar);
            g1Var.c(i14);
            aVar.f9907c = i14;
            dVar.add(i14);
            K = K2;
        }
        return K;
    }

    public static int n(g1 g1Var, byte[] bArr, int i6, int i10, a aVar) {
        Object i11 = g1Var.i();
        int L = L(i11, g1Var, bArr, i6, i10, aVar);
        g1Var.c(i11);
        aVar.f9907c = i11;
        return L;
    }

    public static int o(g1<?> g1Var, int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        int n10 = n(g1Var, bArr, i10, i11, aVar);
        dVar.add(aVar.f9907c);
        while (n10 < i11) {
            int G = G(bArr, n10, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            n10 = n(g1Var, bArr, G, i11, aVar);
            dVar.add(aVar.f9907c);
        }
        return n10;
    }

    public static int p(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        boolean z10;
        g gVar = (g) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            G = I(bArr, G, aVar);
            if (aVar.f9906b != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.g(z10);
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int q(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        l lVar = (l) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            lVar.g(Double.longBitsToDouble(i(bArr, G)));
            G += 8;
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int r(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            xVar.g(g(bArr, G));
            G += 4;
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int s(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            h0Var.g(i(bArr, G));
            G += 8;
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int t(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        t tVar = (t) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            tVar.g(Float.intBitsToFloat(g(bArr, G)));
            G += 4;
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int u(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            G = G(bArr, G, aVar);
            xVar.g(i.b(aVar.f9905a));
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int v(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            G = I(bArr, G, aVar);
            h0Var.g(i.c(aVar.f9906b));
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int w(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            G = G(bArr, G, aVar);
            xVar.g(aVar.f9905a);
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int x(byte[] bArr, int i6, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        int G = G(bArr, i6, aVar);
        int i10 = aVar.f9905a + G;
        while (G < i10) {
            G = I(bArr, G, aVar);
            h0Var.g(aVar.f9906b);
        }
        if (G == i10) {
            return G;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int y(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        x xVar = (x) dVar;
        int G = G(bArr, i10, aVar);
        xVar.g(i.b(aVar.f9905a));
        while (G < i11) {
            int G2 = G(bArr, G, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            G = G(bArr, G2, aVar);
            xVar.g(i.b(aVar.f9905a));
        }
        return G;
    }

    public static int z(int i6, byte[] bArr, int i10, int i11, y.d<?> dVar, a aVar) {
        h0 h0Var = (h0) dVar;
        int I = I(bArr, i10, aVar);
        h0Var.g(i.c(aVar.f9906b));
        while (I < i11) {
            int G = G(bArr, I, aVar);
            if (i6 != aVar.f9905a) {
                break;
            }
            I = I(bArr, G, aVar);
            h0Var.g(i.c(aVar.f9906b));
        }
        return I;
    }
}
