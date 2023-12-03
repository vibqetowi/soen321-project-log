package l8;

import android.util.Log;
import c9.q;
import c9.w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import u7.x;
/* compiled from: Id3Decoder.java */
/* loaded from: classes.dex */
public final class g extends androidx.work.k {

    /* renamed from: c  reason: collision with root package name */
    public static final p7.e f24125c = new p7.e(15);

    /* renamed from: b  reason: collision with root package name */
    public final a f24126b;

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f24127a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24128b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24129c;

        public b(int i6, int i10, boolean z10) {
            this.f24127a = i6;
            this.f24128b = z10;
            this.f24129c = i10;
        }
    }

    public g(p7.e eVar) {
        this.f24126b = eVar;
    }

    public static l8.a E(q qVar, int i6, int i10) {
        int V;
        String str;
        byte[] copyOfRange;
        int q10 = qVar.q();
        String S = S(q10);
        int i11 = i6 - 1;
        byte[] bArr = new byte[i11];
        qVar.b(0, bArr, i11);
        if (i10 == 2) {
            String valueOf = String.valueOf(sc.b.h0(new String(bArr, 0, 3, "ISO-8859-1")));
            if (valueOf.length() != 0) {
                str = "image/".concat(valueOf);
            } else {
                str = new String("image/");
            }
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            V = 2;
        } else {
            V = V(bArr, 0);
            String h02 = sc.b.h0(new String(bArr, 0, V, "ISO-8859-1"));
            if (h02.indexOf(47) == -1) {
                if (h02.length() != 0) {
                    str = "image/".concat(h02);
                } else {
                    str = new String("image/");
                }
            } else {
                str = h02;
            }
        }
        int i12 = bArr[V + 1] & 255;
        int i13 = V + 2;
        int U = U(i13, bArr, q10);
        String str2 = new String(bArr, i13, U - i13, S);
        int R = R(q10) + U;
        if (i11 <= R) {
            copyOfRange = w.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, R, i11);
        }
        return new l8.a(str, str2, i12, copyOfRange);
    }

    public static c F(q qVar, int i6, int i10, boolean z10, int i11, a aVar) {
        long j10;
        long j11;
        int i12 = qVar.f5187b;
        int V = V(qVar.f5186a, i12);
        String str = new String(qVar.f5186a, i12, V - i12, "ISO-8859-1");
        qVar.A(V + 1);
        int c10 = qVar.c();
        int c11 = qVar.c();
        long r = qVar.r();
        if (r == 4294967295L) {
            j10 = -1;
        } else {
            j10 = r;
        }
        long r10 = qVar.r();
        if (r10 == 4294967295L) {
            j11 = -1;
        } else {
            j11 = r10;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i6;
        while (qVar.f5187b < i13) {
            h I = I(i10, qVar, z10, i11, aVar);
            if (I != null) {
                arrayList.add(I);
            }
        }
        return new c(str, c10, c11, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    public static d G(q qVar, int i6, int i10, boolean z10, int i11, a aVar) {
        boolean z11;
        boolean z12;
        int i12 = qVar.f5187b;
        int V = V(qVar.f5186a, i12);
        String str = new String(qVar.f5186a, i12, V - i12, "ISO-8859-1");
        qVar.A(V + 1);
        int q10 = qVar.q();
        if ((q10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((q10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int q11 = qVar.q();
        String[] strArr = new String[q11];
        for (int i13 = 0; i13 < q11; i13++) {
            int i14 = qVar.f5187b;
            int V2 = V(qVar.f5186a, i14);
            strArr[i13] = new String(qVar.f5186a, i14, V2 - i14, "ISO-8859-1");
            qVar.A(V2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i6;
        while (qVar.f5187b < i15) {
            h I = I(i10, qVar, z10, i11, aVar);
            if (I != null) {
                arrayList.add(I);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e H(int i6, q qVar) {
        if (i6 < 4) {
            return null;
        }
        int q10 = qVar.q();
        String S = S(q10);
        byte[] bArr = new byte[3];
        qVar.b(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i6 - 4;
        byte[] bArr2 = new byte[i10];
        qVar.b(0, bArr2, i10);
        int U = U(0, bArr2, q10);
        String str2 = new String(bArr2, 0, U, S);
        int R = R(q10) + U;
        return new e(str, str2, M(R, U(R, bArr2, q10), S, bArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a7, code lost:
        if (r11 == 67) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0215 A[Catch: all -> 0x0149, UnsupportedEncodingException -> 0x0243, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0243, blocks: (B:104:0x0135, B:174:0x0215, B:107:0x013f, B:116:0x0158, B:118:0x0160, B:126:0x017a, B:135:0x0190, B:146:0x01a9, B:152:0x01b9, B:158:0x01c8, B:164:0x01e2, B:171:0x01fe, B:172:0x0203), top: B:184:0x012b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h I(int i6, q qVar, boolean z10, int i10, a aVar) {
        int i11;
        int s10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        h bVar;
        boolean z19;
        boolean z20;
        int q10 = qVar.q();
        int q11 = qVar.q();
        int q12 = qVar.q();
        if (i6 >= 3) {
            i11 = qVar.q();
        } else {
            i11 = 0;
        }
        if (i6 == 4) {
            s10 = qVar.t();
            if (!z10) {
                s10 = (((s10 >> 24) & 255) << 21) | (s10 & 255) | (((s10 >> 8) & 255) << 7) | (((s10 >> 16) & 255) << 14);
            }
        } else if (i6 == 3) {
            s10 = qVar.t();
        } else {
            s10 = qVar.s();
        }
        if (i6 >= 3) {
            i12 = qVar.v();
        } else {
            i12 = 0;
        }
        if (q10 == 0 && q11 == 0 && q12 == 0 && i11 == 0 && s10 == 0 && i12 == 0) {
            qVar.A(qVar.f5188c);
            return null;
        }
        int i13 = qVar.f5187b + s10;
        if (i13 > qVar.f5188c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            qVar.A(qVar.f5188c);
            return null;
        }
        if (aVar != null) {
            switch (((p7.e) aVar).f27953u) {
                case 3:
                    if ((q10 == 67 && q11 == 79 && q12 == 77 && (i11 == 77 || i6 == 2)) || (q10 == 77 && q11 == 76 && q12 == 76 && (i11 == 84 || i6 == 2))) {
                        z20 = true;
                        break;
                    }
                default:
                    z20 = false;
                    break;
            }
            if (!z20) {
                qVar.A(i13);
                return null;
            }
        }
        if (i6 == 3) {
            if ((i12 & 128) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if ((i12 & 32) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z14 = z19;
            z15 = false;
            z13 = z12;
        } else if (i6 == 4) {
            if ((i12 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i12 & 8) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i12 & 4) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i12 & 2) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i12 & 1) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z21 = z17;
            z13 = z18;
            z11 = z16;
            z12 = z21;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (!z12 && !z14) {
            if (z11) {
                s10--;
                qVar.B(1);
            }
            if (z13) {
                s10 -= 4;
                qVar.B(4);
            }
            if (z15) {
                s10 = W(s10, qVar);
            }
            int i14 = s10;
            int i15 = 84;
            try {
                try {
                    if (q10 == 84) {
                        if (q11 == 88 && q12 == 88 && (i6 == 2 || i11 == 88)) {
                            bVar = O(i14, qVar);
                            if (bVar == null) {
                                String T = T(i6, q10, q11, q12, i11);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(T).length() + 50);
                                sb2.append("Failed to decode frame: id=");
                                sb2.append(T);
                                sb2.append(", frameSize=");
                                sb2.append(i14);
                                Log.w("Id3Decoder", sb2.toString());
                            }
                            qVar.A(i13);
                            return bVar;
                        }
                        i15 = 84;
                    }
                    if (q10 == i15) {
                        bVar = N(i14, qVar, T(i6, q10, q11, q12, i11));
                    } else if (q10 == 87 && q11 == 88 && q12 == 88 && (i6 == 2 || i11 == 88)) {
                        bVar = Q(i14, qVar);
                    } else if (q10 == 87) {
                        bVar = P(i14, qVar, T(i6, q10, q11, q12, i11));
                    } else if (q10 == 80 && q11 == 82 && q12 == 73 && i11 == 86) {
                        bVar = L(i14, qVar);
                    } else if (q10 == 71 && q11 == 69 && q12 == 79 && (i11 == 66 || i6 == 2)) {
                        bVar = J(i14, qVar);
                    } else if (i6 == 2) {
                        if (q10 == 80 && q11 == 73 && q12 == 67) {
                            bVar = E(qVar, i14, i6);
                        }
                        if (q10 != 67 && q11 == 79 && q12 == 77 && (i11 == 77 || i6 == 2)) {
                            bVar = H(i14, qVar);
                        } else if (q10 != 67 && q11 == 72 && q12 == 65 && i11 == 80) {
                            bVar = F(qVar, i14, i6, z10, i10, aVar);
                        } else if (q10 != 67 && q11 == 84 && q12 == 79 && i11 == 67) {
                            bVar = G(qVar, i14, i6, z10, i10, aVar);
                        } else if (q10 != 77 && q11 == 76 && q12 == 76 && i11 == 84) {
                            bVar = K(i14, qVar);
                        } else {
                            String T2 = T(i6, q10, q11, q12, i11);
                            byte[] bArr = new byte[i14];
                            qVar.b(0, bArr, i14);
                            bVar = new l8.b(T2, bArr);
                        }
                    } else {
                        if (q10 == 65) {
                            if (q11 == 80) {
                                if (q12 == 73) {
                                }
                            }
                        }
                        if (q10 != 67) {
                        }
                        if (q10 != 67) {
                        }
                        if (q10 != 67) {
                        }
                        if (q10 != 77) {
                        }
                        String T22 = T(i6, q10, q11, q12, i11);
                        byte[] bArr2 = new byte[i14];
                        qVar.b(0, bArr2, i14);
                        bVar = new l8.b(T22, bArr2);
                    }
                    if (bVar == null) {
                    }
                    qVar.A(i13);
                    return bVar;
                } catch (UnsupportedEncodingException unused) {
                    Log.w("Id3Decoder", "Unsupported character encoding");
                    qVar.A(i13);
                    return null;
                }
            } catch (Throwable th2) {
                qVar.A(i13);
                throw th2;
            }
        }
        Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        qVar.A(i13);
        return null;
    }

    public static f J(int i6, q qVar) {
        byte[] copyOfRange;
        int q10 = qVar.q();
        String S = S(q10);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        qVar.b(0, bArr, i10);
        int V = V(bArr, 0);
        String str = new String(bArr, 0, V, "ISO-8859-1");
        int i11 = V + 1;
        int U = U(i11, bArr, q10);
        String M = M(i11, U, S, bArr);
        int R = R(q10) + U;
        int U2 = U(R, bArr, q10);
        String M2 = M(R, U2, S, bArr);
        int R2 = R(q10) + U2;
        if (i10 <= R2) {
            copyOfRange = w.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, R2, i10);
        }
        return new f(str, M, M2, copyOfRange);
    }

    public static j K(int i6, q qVar) {
        int v10 = qVar.v();
        int s10 = qVar.s();
        int s11 = qVar.s();
        int q10 = qVar.q();
        int q11 = qVar.q();
        x xVar = new x();
        xVar.n(qVar.f5186a, qVar.f5188c);
        xVar.o(qVar.f5187b * 8);
        int i10 = ((i6 - 10) * 8) / (q10 + q11);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.i(q10);
            int i13 = xVar.i(q11);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new j(v10, s10, iArr, iArr2, s11);
    }

    public static k L(int i6, q qVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i6];
        qVar.b(0, bArr, i6);
        int V = V(bArr, 0);
        String str = new String(bArr, 0, V, "ISO-8859-1");
        int i10 = V + 1;
        if (i6 <= i10) {
            copyOfRange = w.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i10, i6);
        }
        return new k(str, copyOfRange);
    }

    public static String M(int i6, int i10, String str, byte[] bArr) {
        if (i10 > i6 && i10 <= bArr.length) {
            return new String(bArr, i6, i10 - i6, str);
        }
        return "";
    }

    public static l N(int i6, q qVar, String str) {
        if (i6 < 1) {
            return null;
        }
        int q10 = qVar.q();
        String S = S(q10);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        qVar.b(0, bArr, i10);
        return new l(str, null, new String(bArr, 0, U(0, bArr, q10), S));
    }

    public static l O(int i6, q qVar) {
        if (i6 < 1) {
            return null;
        }
        int q10 = qVar.q();
        String S = S(q10);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        qVar.b(0, bArr, i10);
        int U = U(0, bArr, q10);
        String str = new String(bArr, 0, U, S);
        int R = R(q10) + U;
        return new l("TXXX", str, M(R, U(R, bArr, q10), S, bArr));
    }

    public static m P(int i6, q qVar, String str) {
        byte[] bArr = new byte[i6];
        qVar.b(0, bArr, i6);
        return new m(str, null, new String(bArr, 0, V(bArr, 0), "ISO-8859-1"));
    }

    public static m Q(int i6, q qVar) {
        if (i6 < 1) {
            return null;
        }
        int q10 = qVar.q();
        String S = S(q10);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        qVar.b(0, bArr, i10);
        int U = U(0, bArr, q10);
        String str = new String(bArr, 0, U, S);
        int R = R(q10) + U;
        return new m("WXXX", str, M(R, V(bArr, R), "ISO-8859-1", bArr));
    }

    public static int R(int i6) {
        if (i6 != 0 && i6 != 3) {
            return 2;
        }
        return 1;
    }

    public static String S(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return "ISO-8859-1";
                }
                return "UTF-8";
            }
            return "UTF-16BE";
        }
        return "UTF-16";
    }

    public static String T(int i6, int i10, int i11, int i12, int i13) {
        if (i6 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int U(int i6, byte[] bArr, int i10) {
        int V = V(bArr, i6);
        if (i10 != 0 && i10 != 3) {
            while (V < bArr.length - 1) {
                if ((V - i6) % 2 == 0 && bArr[V + 1] == 0) {
                    return V;
                }
                V = V(bArr, V + 1);
            }
            return bArr.length;
        }
        return V;
    }

    public static int V(byte[] bArr, int i6) {
        while (i6 < bArr.length) {
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
        return bArr.length;
    }

    public static int W(int i6, q qVar) {
        byte[] bArr = qVar.f5186a;
        int i10 = qVar.f5187b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i6) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i6 - (i11 - i10)) - 2);
                    i6--;
                }
                i11 = i12;
            } else {
                return i6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean X(q qVar, int i6, int i10, boolean z10) {
        int s10;
        long s11;
        int i11;
        int i12;
        int i13 = qVar.f5187b;
        while (true) {
            try {
                boolean z11 = true;
                if (qVar.f5188c - qVar.f5187b < i10) {
                    return true;
                }
                if (i6 >= 3) {
                    s10 = qVar.c();
                    s11 = qVar.r();
                    i11 = qVar.v();
                } else {
                    s10 = qVar.s();
                    s11 = qVar.s();
                    i11 = 0;
                }
                if (s10 == 0 && s11 == 0 && i11 == 0) {
                    return true;
                }
                if (i6 == 4 && !z10) {
                    if ((8421504 & s11) != 0) {
                        return false;
                    }
                    s11 = (((s11 >> 24) & 255) << 21) | (s11 & 255) | (((s11 >> 8) & 255) << 7) | (((s11 >> 16) & 255) << 14);
                }
                if (i6 == 4) {
                    if ((i11 & 64) != 0) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                } else {
                    if (i6 == 3) {
                        if ((i11 & 32) != 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                    } else {
                        i12 = 0;
                    }
                    z11 = false;
                    if (z11) {
                        i12 += 4;
                    }
                    if (s11 < i12) {
                        return false;
                    }
                    if (qVar.f5188c - qVar.f5187b < s11) {
                        return false;
                    }
                    qVar.B((int) s11);
                }
            } finally {
                qVar.A(i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g8.a D(byte[] bArr, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        b bVar;
        boolean z14;
        String str;
        ArrayList arrayList = new ArrayList();
        q qVar = new q(bArr, i6);
        int i10 = 10;
        boolean z15 = false;
        if (qVar.f5188c - qVar.f5187b < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int s10 = qVar.s();
            if (s10 != 4801587) {
                String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(s10)));
                if (valueOf.length() != 0) {
                    str = "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf);
                } else {
                    str = new String("Unexpected first three bytes of ID3 tag header: 0x");
                }
                Log.w("Id3Decoder", str);
            } else {
                int q10 = qVar.q();
                qVar.B(1);
                int q11 = qVar.q();
                int p10 = qVar.p();
                if (q10 == 2) {
                    if ((q11 & 64) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    if (q10 >= 4 && (q11 & 128) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar = new b(q10, p10, z13);
                } else {
                    if (q10 == 3) {
                        if ((q11 & 64) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            int c10 = qVar.c();
                            qVar.B(c10);
                            p10 -= c10 + 4;
                        }
                    } else if (q10 == 4) {
                        if ((q11 & 64) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            int p11 = qVar.p();
                            qVar.B(p11 - 4);
                            p10 -= p11;
                        }
                        if ((q11 & 16) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            p10 -= 10;
                        }
                    } else {
                        defpackage.d.k(57, "Skipped ID3 tag with unsupported majorVersion=", q10, "Id3Decoder");
                    }
                    if (q10 >= 4) {
                    }
                    z13 = false;
                    bVar = new b(q10, p10, z13);
                }
                if (bVar != null) {
                    return null;
                }
                int i11 = qVar.f5187b;
                int i12 = bVar.f24127a;
                if (i12 == 2) {
                    i10 = 6;
                }
                boolean z16 = bVar.f24128b;
                int i13 = bVar.f24129c;
                if (z16) {
                    i13 = W(i13, qVar);
                }
                qVar.z(i11 + i13);
                if (!X(qVar, i12, i10, false)) {
                    if (i12 == 4 && X(qVar, 4, i10, true)) {
                        z15 = true;
                    } else {
                        defpackage.d.k(56, "Failed to validate ID3 tag with majorVersion=", i12, "Id3Decoder");
                        return null;
                    }
                }
                while (qVar.f5188c - qVar.f5187b >= i10) {
                    h I = I(i12, qVar, z15, i10, this.f24126b);
                    if (I != null) {
                        arrayList.add(I);
                    }
                }
                return new g8.a(arrayList);
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // androidx.work.k
    public final g8.a k(g8.d dVar, ByteBuffer byteBuffer) {
        return D(byteBuffer.array(), byteBuffer.limit());
    }
}
