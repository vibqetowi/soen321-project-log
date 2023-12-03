package l3;

import com.appsflyer.R;
import java.io.EOFException;
import l3.c;
import zv.e;
import zv.h;
import zv.i;
import zv.t;
/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class d extends c {
    public static final i F;
    public static final i G;
    public static final i H;
    public final e A;
    public int B = 0;
    public long C;
    public int D;
    public String E;

    /* renamed from: z  reason: collision with root package name */
    public final h f24011z;

    static {
        i iVar = i.f39888x;
        F = i.a.c("'\\");
        G = i.a.c("\"\\");
        H = i.a.c("{}[]:, \n\t\r\f/\\;#=");
        i.a.c("\n\r");
        i.a.c("*/");
    }

    public d(t tVar) {
        this.f24011z = tVar;
        this.A = tVar.f39915v;
        O(6);
    }

    public final char B0() {
        int i6;
        int i10;
        h hVar = this.f24011z;
        if (hVar.d0(1L)) {
            e eVar = this.A;
            byte readByte = eVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (hVar.d0(4L)) {
                                        char c10 = 0;
                                        for (int i11 = 0; i11 < 4; i11++) {
                                            byte m10 = eVar.m(i11);
                                            char c11 = (char) (c10 << 4);
                                            if (m10 >= 48 && m10 <= 57) {
                                                i10 = m10 - 48;
                                            } else {
                                                if (m10 >= 97 && m10 <= 102) {
                                                    i6 = m10 - 97;
                                                } else if (m10 < 65 || m10 > 70) {
                                                    f0("\\u".concat(eVar.l0(4L)));
                                                    throw null;
                                                } else {
                                                    i6 = m10 - 65;
                                                }
                                                i10 = i6 + 10;
                                            }
                                            c10 = (char) (i10 + c11);
                                        }
                                        eVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + j());
                                }
                                f0("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        f0("Unterminated escape sequence");
        throw null;
    }

    @Override // l3.c
    public final int G() {
        String w02;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 16) {
            long j10 = this.C;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.B = 0;
                int[] iArr = this.f24008x;
                int i11 = this.f24005u - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.C + " at path " + j());
        }
        if (i6 == 17) {
            this.E = this.A.l0(this.D);
        } else if (i6 != 9 && i6 != 8) {
            if (i6 != 11) {
                throw new a("Expected an int but was " + defpackage.b.E(J()) + " at path " + j());
            }
        } else {
            if (i6 == 9) {
                w02 = w0(G);
            } else {
                w02 = w0(F);
            }
            this.E = w02;
            try {
                int parseInt = Integer.parseInt(w02);
                this.B = 0;
                int[] iArr2 = this.f24008x;
                int i12 = this.f24005u - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        try {
            double parseDouble = Double.parseDouble(this.E);
            int i13 = (int) parseDouble;
            if (i13 == parseDouble) {
                this.E = null;
                this.B = 0;
                int[] iArr3 = this.f24008x;
                int i14 = this.f24005u - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            throw new a("Expected an int but was " + this.E + " at path " + j());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.E + " at path " + j());
        }
    }

    @Override // l3.c
    public final String I() {
        String l02;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 10) {
            l02 = y0();
        } else if (i6 == 9) {
            l02 = w0(G);
        } else if (i6 == 8) {
            l02 = w0(F);
        } else if (i6 == 11) {
            l02 = this.E;
            this.E = null;
        } else if (i6 == 16) {
            l02 = Long.toString(this.C);
        } else if (i6 == 17) {
            l02 = this.A.l0(this.D);
        } else {
            throw new a("Expected a string but was " + defpackage.b.E(J()) + " at path " + j());
        }
        this.B = 0;
        int[] iArr = this.f24008x;
        int i10 = this.f24005u - 1;
        iArr[i10] = iArr[i10] + 1;
        return l02;
    }

    @Override // l3.c
    public final int J() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        switch (i6) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void K0(i iVar) {
        while (true) {
            long u10 = this.f24011z.u(iVar);
            if (u10 != -1) {
                e eVar = this.A;
                if (eVar.m(u10) == 92) {
                    eVar.skip(u10 + 1);
                    B0();
                } else {
                    eVar.skip(u10 + 1);
                    return;
                }
            } else {
                f0("Unterminated string");
                throw null;
            }
        }
    }

    @Override // l3.c
    public final int R(c.a aVar) {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 < 12 || i6 > 15) {
            return -1;
        }
        if (i6 == 15) {
            return l0(this.E, aVar);
        }
        int F0 = this.f24011z.F0(aVar.f24010b);
        if (F0 != -1) {
            this.B = 0;
            this.f24007w[this.f24005u - 1] = aVar.f24009a[F0];
            return F0;
        }
        String str = this.f24007w[this.f24005u - 1];
        String q02 = q0();
        int l02 = l0(q02, aVar);
        if (l02 == -1) {
            this.B = 15;
            this.E = q02;
            this.f24007w[this.f24005u - 1] = str;
        }
        return l02;
    }

    @Override // l3.c
    public final void a() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 3) {
            O(1);
            this.f24008x[this.f24005u - 1] = 0;
            this.B = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + defpackage.b.E(J()) + " at path " + j());
    }

    @Override // l3.c
    public final void c0() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 14) {
            long u10 = this.f24011z.u(H);
            e eVar = this.A;
            if (u10 == -1) {
                u10 = eVar.f39885v;
            }
            eVar.skip(u10);
        } else if (i6 == 13) {
            K0(G);
        } else if (i6 == 12) {
            K0(F);
        } else if (i6 != 15) {
            throw new a("Expected a name but was " + defpackage.b.E(J()) + " at path " + j());
        }
        this.B = 0;
        this.f24007w[this.f24005u - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = 0;
        this.f24006v[0] = 8;
        this.f24005u = 1;
        this.A.a();
        this.f24011z.close();
    }

    @Override // l3.c
    public final void e() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 1) {
            O(3);
            this.B = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + defpackage.b.E(J()) + " at path " + j());
    }

    @Override // l3.c
    public final void e0() {
        int i6 = 0;
        do {
            int i10 = this.B;
            if (i10 == 0) {
                i10 = k0();
            }
            if (i10 == 3) {
                O(1);
            } else if (i10 == 1) {
                O(3);
            } else {
                if (i10 == 4) {
                    i6--;
                    if (i6 >= 0) {
                        this.f24005u--;
                    } else {
                        throw new a("Expected a value but was " + defpackage.b.E(J()) + " at path " + j());
                    }
                } else if (i10 == 2) {
                    i6--;
                    if (i6 >= 0) {
                        this.f24005u--;
                    } else {
                        throw new a("Expected a value but was " + defpackage.b.E(J()) + " at path " + j());
                    }
                } else {
                    e eVar = this.A;
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 9 && i10 != 13) {
                            if (i10 != 8 && i10 != 12) {
                                if (i10 == 17) {
                                    eVar.skip(this.D);
                                } else if (i10 == 18) {
                                    throw new a("Expected a value but was " + defpackage.b.E(J()) + " at path " + j());
                                }
                            } else {
                                K0(F);
                            }
                        } else {
                            K0(G);
                        }
                    } else {
                        long u10 = this.f24011z.u(H);
                        if (u10 == -1) {
                            u10 = eVar.f39885v;
                        }
                        eVar.skip(u10);
                    }
                }
                this.B = 0;
            }
            i6++;
            this.B = 0;
        } while (i6 != 0);
        int[] iArr = this.f24008x;
        int i11 = this.f24005u;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f24007w[i11 - 1] = "null";
    }

    @Override // l3.c
    public final void g() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 4) {
            int i10 = this.f24005u - 1;
            this.f24005u = i10;
            int[] iArr = this.f24008x;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + defpackage.b.E(J()) + " at path " + j());
    }

    @Override // l3.c
    public final void h() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 2) {
            int i10 = this.f24005u - 1;
            this.f24005u = i10;
            this.f24007w[i10] = null;
            int[] iArr = this.f24008x;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + defpackage.b.E(J()) + " at path " + j());
    }

    public final void h0() {
        f0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x018e, code lost:
        if (p0(r14) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0190, code lost:
        if (r6 != 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0192, code lost:
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0198, code lost:
        if (r9 != Long.MIN_VALUE) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x019a, code lost:
        if (r11 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019e, code lost:
        if (r9 != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a0, code lost:
        if (r11 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01a2, code lost:
        if (r11 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a6, code lost:
        r18.C = r9;
        r5.skip(r3);
        r13 = 16;
        r18.B = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01b1, code lost:
        if (r6 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b4, code lost:
        if (r6 == 4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b7, code lost:
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b9, code lost:
        r18.D = r3;
        r13 = 17;
        r18.B = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k0() {
        int v02;
        String str;
        String str2;
        int i6;
        byte m10;
        int i10;
        boolean z10;
        int[] iArr = this.f24006v;
        int i11 = this.f24005u;
        int i12 = iArr[i11 - 1];
        e eVar = this.A;
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int v03 = v0(true);
            eVar.readByte();
            if (v03 != 44) {
                if (v03 != 59) {
                    if (v03 == 93) {
                        this.B = 4;
                        return 4;
                    }
                    f0("Unterminated array");
                    throw null;
                }
                h0();
                throw null;
            }
        } else if (i12 != 3 && i12 != 5) {
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int v04 = v0(true);
                eVar.readByte();
                if (v04 != 58) {
                    if (v04 != 61) {
                        f0("Expected ':'");
                        throw null;
                    }
                    h0();
                    throw null;
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (v0(false) == -1) {
                    this.B = 18;
                    return 18;
                }
                h0();
                throw null;
            } else {
                if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                v02 = v0(true);
                if (v02 == 34) {
                    if (v02 != 39) {
                        if (v02 != 44 && v02 != 59) {
                            if (v02 != 91) {
                                if (v02 != 93) {
                                    if (v02 != 123) {
                                        byte m11 = eVar.m(0L);
                                        h hVar = this.f24011z;
                                        if (m11 != 116 && m11 != 84) {
                                            if (m11 != 102 && m11 != 70) {
                                                if (m11 == 110 || m11 == 78) {
                                                    str = "null";
                                                    str2 = "NULL";
                                                    i6 = 7;
                                                }
                                                i6 = 0;
                                                if (i6 == 0) {
                                                    return i6;
                                                }
                                                long j10 = 0;
                                                int i13 = 0;
                                                char c10 = 0;
                                                boolean z11 = true;
                                                boolean z12 = false;
                                                while (true) {
                                                    int i14 = i13 + 1;
                                                    if (!hVar.d0(i14)) {
                                                        break;
                                                    }
                                                    byte m12 = eVar.m(i13);
                                                    if (m12 != 43) {
                                                        if (m12 != 69 && m12 != 101) {
                                                            if (m12 != 45) {
                                                                if (m12 != 46) {
                                                                    if (m12 < 48 || m12 > 57) {
                                                                        break;
                                                                    }
                                                                    if (c10 != 1 && c10 != 0) {
                                                                        if (c10 == 2) {
                                                                            if (j10 == 0) {
                                                                                break;
                                                                            }
                                                                            long j11 = (10 * j10) - (m12 - 48);
                                                                            int i15 = (j10 > (-922337203685477580L) ? 1 : (j10 == (-922337203685477580L) ? 0 : -1));
                                                                            if (i15 <= 0 && (i15 != 0 || j11 >= j10)) {
                                                                                z10 = false;
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                            z11 = z10 & z11;
                                                                            j10 = j11;
                                                                        } else if (c10 == 3) {
                                                                            c10 = 4;
                                                                        } else if (c10 == 5 || c10 == 6) {
                                                                            c10 = 7;
                                                                        }
                                                                    } else {
                                                                        j10 = -(m12 - 48);
                                                                        c10 = 2;
                                                                    }
                                                                    i13 = i14;
                                                                } else if (c10 != 2) {
                                                                    break;
                                                                } else {
                                                                    c10 = 3;
                                                                    i13 = i14;
                                                                }
                                                            } else if (c10 == 0) {
                                                                c10 = 1;
                                                                z12 = true;
                                                                i13 = i14;
                                                            } else {
                                                                if (c10 != 5) {
                                                                    break;
                                                                }
                                                                c10 = 6;
                                                                i13 = i14;
                                                            }
                                                        } else if (c10 != 2 && c10 != 4) {
                                                            break;
                                                        } else {
                                                            c10 = 5;
                                                            i13 = i14;
                                                        }
                                                        if (i10 == 0) {
                                                            return i10;
                                                        }
                                                        if (!p0(eVar.m(0L))) {
                                                            f0("Expected value");
                                                            throw null;
                                                        }
                                                        h0();
                                                        throw null;
                                                    }
                                                    if (c10 != 5) {
                                                        break;
                                                    }
                                                    c10 = 6;
                                                    i13 = i14;
                                                }
                                                i10 = 0;
                                                if (i10 == 0) {
                                                }
                                            } else {
                                                str = "false";
                                                str2 = "FALSE";
                                                i6 = 6;
                                            }
                                        } else {
                                            str = "true";
                                            str2 = "TRUE";
                                            i6 = 5;
                                        }
                                        int length = str.length();
                                        int i16 = 1;
                                        while (true) {
                                            if (i16 < length) {
                                                int i17 = i16 + 1;
                                                if (!hVar.d0(i17) || ((m10 = eVar.m(i16)) != str.charAt(i16) && m10 != str2.charAt(i16))) {
                                                    break;
                                                }
                                                i16 = i17;
                                            } else if (!hVar.d0(length + 1) || !p0(eVar.m(length))) {
                                                eVar.skip(length);
                                                this.B = i6;
                                            }
                                        }
                                        i6 = 0;
                                        if (i6 == 0) {
                                        }
                                    } else {
                                        eVar.readByte();
                                        this.B = 1;
                                        return 1;
                                    }
                                } else if (i12 == 1) {
                                    eVar.readByte();
                                    this.B = 4;
                                    return 4;
                                }
                            } else {
                                eVar.readByte();
                                this.B = 3;
                                return 3;
                            }
                        }
                        if (i12 != 1 && i12 != 2) {
                            f0("Unexpected value");
                            throw null;
                        }
                        h0();
                        throw null;
                    }
                    h0();
                    throw null;
                }
                eVar.readByte();
                this.B = 9;
                return 9;
            }
        } else {
            iArr[i11 - 1] = 4;
            if (i12 == 5) {
                int v05 = v0(true);
                eVar.readByte();
                if (v05 != 44) {
                    if (v05 != 59) {
                        if (v05 == 125) {
                            this.B = 2;
                            return 2;
                        }
                        f0("Unterminated object");
                        throw null;
                    }
                    h0();
                    throw null;
                }
            }
            int v06 = v0(true);
            if (v06 != 34) {
                if (v06 != 39) {
                    if (v06 == 125) {
                        if (i12 != 5) {
                            eVar.readByte();
                            this.B = 2;
                            return 2;
                        }
                        f0("Expected name");
                        throw null;
                    }
                    h0();
                    throw null;
                }
                eVar.readByte();
                h0();
                throw null;
            }
            eVar.readByte();
            this.B = 13;
            return 13;
        }
        v02 = v0(true);
        if (v02 == 34) {
        }
    }

    public final int l0(String str, c.a aVar) {
        int length = aVar.f24009a.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(aVar.f24009a[i6])) {
                this.B = 0;
                this.f24007w[this.f24005u - 1] = str;
                return i6;
            }
        }
        return -1;
    }

    @Override // l3.c
    public final boolean m() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 != 2 && i6 != 4 && i6 != 18) {
            return true;
        }
        return false;
    }

    @Override // l3.c
    public final boolean o() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 5) {
            this.B = 0;
            int[] iArr = this.f24008x;
            int i10 = this.f24005u - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i6 == 6) {
            this.B = 0;
            int[] iArr2 = this.f24008x;
            int i11 = this.f24005u - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + defpackage.b.E(J()) + " at path " + j());
        }
    }

    public final boolean p0(int i6) {
        if (i6 != 9 && i6 != 10 && i6 != 12 && i6 != 13 && i6 != 32) {
            if (i6 != 35) {
                if (i6 != 44) {
                    if (i6 != 47 && i6 != 61) {
                        if (i6 != 123 && i6 != 125 && i6 != 58) {
                            if (i6 != 59) {
                                switch (i6) {
                                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                        return false;
                                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            h0();
            throw null;
        }
        return false;
    }

    public final String q0() {
        String str;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 14) {
            str = y0();
        } else if (i6 == 13) {
            str = w0(G);
        } else if (i6 == 12) {
            str = w0(F);
        } else if (i6 == 15) {
            str = this.E;
        } else {
            throw new a("Expected a name but was " + defpackage.b.E(J()) + " at path " + j());
        }
        this.B = 0;
        this.f24007w[this.f24005u - 1] = str;
        return str;
    }

    @Override // l3.c
    public final double s() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = k0();
        }
        if (i6 == 16) {
            this.B = 0;
            int[] iArr = this.f24008x;
            int i10 = this.f24005u - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i6 == 17) {
            this.E = this.A.l0(this.D);
        } else if (i6 == 9) {
            this.E = w0(G);
        } else if (i6 == 8) {
            this.E = w0(F);
        } else if (i6 == 10) {
            this.E = y0();
        } else if (i6 != 11) {
            throw new a("Expected a double but was " + defpackage.b.E(J()) + " at path " + j());
        }
        this.B = 11;
        try {
            double parseDouble = Double.parseDouble(this.E);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.E = null;
                this.B = 0;
                int[] iArr2 = this.f24008x;
                int i11 = this.f24005u - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + j());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.E + " at path " + j());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f24011z + ")";
    }

    public final int v0(boolean z10) {
        int i6 = 0;
        while (true) {
            int i10 = i6 + 1;
            h hVar = this.f24011z;
            if (hVar.d0(i10)) {
                long j10 = i6;
                e eVar = this.A;
                byte m10 = eVar.m(j10);
                if (m10 != 10 && m10 != 32 && m10 != 13 && m10 != 9) {
                    eVar.skip(i10 - 1);
                    if (m10 == 47) {
                        if (!hVar.d0(2L)) {
                            return m10;
                        }
                        h0();
                        throw null;
                    } else if (m10 != 35) {
                        return m10;
                    } else {
                        h0();
                        throw null;
                    }
                }
                i6 = i10;
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String w0(i iVar) {
        StringBuilder sb2 = null;
        while (true) {
            long u10 = this.f24011z.u(iVar);
            if (u10 != -1) {
                e eVar = this.A;
                if (eVar.m(u10) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(eVar.l0(u10));
                    eVar.readByte();
                    sb2.append(B0());
                } else if (sb2 == null) {
                    String l02 = eVar.l0(u10);
                    eVar.readByte();
                    return l02;
                } else {
                    sb2.append(eVar.l0(u10));
                    eVar.readByte();
                    return sb2.toString();
                }
            } else {
                f0("Unterminated string");
                throw null;
            }
        }
    }

    public final String y0() {
        long u10 = this.f24011z.u(H);
        e eVar = this.A;
        if (u10 != -1) {
            return eVar.l0(u10);
        }
        return eVar.k0();
    }
}
