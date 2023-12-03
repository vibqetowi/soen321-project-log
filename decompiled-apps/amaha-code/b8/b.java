package b8;

import android.util.Log;
import android.util.Pair;
import b8.a;
import c9.q;
import c9.w;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q7.a;
import u7.p;
/* compiled from: AtomParsers.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3970a = w.u("OpusHead");

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3971a;

        /* renamed from: b  reason: collision with root package name */
        public int f3972b;

        /* renamed from: c  reason: collision with root package name */
        public int f3973c;

        /* renamed from: d  reason: collision with root package name */
        public long f3974d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3975e;
        public final q f;

        /* renamed from: g  reason: collision with root package name */
        public final q f3976g;

        /* renamed from: h  reason: collision with root package name */
        public int f3977h;

        /* renamed from: i  reason: collision with root package name */
        public int f3978i;

        public a(q qVar, q qVar2, boolean z10) {
            this.f3976g = qVar;
            this.f = qVar2;
            this.f3975e = z10;
            qVar2.A(12);
            this.f3971a = qVar2.t();
            qVar.A(12);
            this.f3978i = qVar.t();
            hc.d.i("first_chunk must be 1", qVar.c() == 1);
            this.f3972b = -1;
        }

        public final boolean a() {
            long r;
            int i6;
            int i10 = this.f3972b + 1;
            this.f3972b = i10;
            if (i10 == this.f3971a) {
                return false;
            }
            boolean z10 = this.f3975e;
            q qVar = this.f;
            if (z10) {
                r = qVar.u();
            } else {
                r = qVar.r();
            }
            this.f3974d = r;
            if (this.f3972b == this.f3977h) {
                q qVar2 = this.f3976g;
                this.f3973c = qVar2.t();
                qVar2.B(4);
                int i11 = this.f3978i - 1;
                this.f3978i = i11;
                if (i11 > 0) {
                    i6 = qVar2.t() - 1;
                } else {
                    i6 = -1;
                }
                this.f3977h = i6;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers.java */
    /* renamed from: b8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0078b {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k[] f3979a;

        /* renamed from: b  reason: collision with root package name */
        public n f3980b;

        /* renamed from: c  reason: collision with root package name */
        public int f3981c;

        /* renamed from: d  reason: collision with root package name */
        public int f3982d = 0;

        public c(int i6) {
            this.f3979a = new k[i6];
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0078b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3983a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3984b;

        /* renamed from: c  reason: collision with root package name */
        public final q f3985c;

        public d(a.b bVar, n nVar) {
            q qVar = bVar.f3969b;
            this.f3985c = qVar;
            qVar.A(12);
            int t3 = qVar.t();
            if ("audio/raw".equals(nVar.F)) {
                int q10 = w.q(nVar.U, nVar.S);
                if (t3 == 0 || t3 % q10 != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(q10);
                    sb2.append(", stsz sample size: ");
                    sb2.append(t3);
                    Log.w("AtomParsers", sb2.toString());
                    t3 = q10;
                }
            }
            this.f3983a = t3 == 0 ? -1 : t3;
            this.f3984b = qVar.t();
        }

        @Override // b8.b.InterfaceC0078b
        public final int a() {
            return this.f3983a;
        }

        @Override // b8.b.InterfaceC0078b
        public final int b() {
            return this.f3984b;
        }

        @Override // b8.b.InterfaceC0078b
        public final int c() {
            int i6 = this.f3983a;
            if (i6 == -1) {
                return this.f3985c.t();
            }
            return i6;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC0078b {

        /* renamed from: a  reason: collision with root package name */
        public final q f3986a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3987b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3988c;

        /* renamed from: d  reason: collision with root package name */
        public int f3989d;

        /* renamed from: e  reason: collision with root package name */
        public int f3990e;

        public e(a.b bVar) {
            q qVar = bVar.f3969b;
            this.f3986a = qVar;
            qVar.A(12);
            this.f3988c = qVar.t() & 255;
            this.f3987b = qVar.t();
        }

        @Override // b8.b.InterfaceC0078b
        public final int a() {
            return -1;
        }

        @Override // b8.b.InterfaceC0078b
        public final int b() {
            return this.f3987b;
        }

        @Override // b8.b.InterfaceC0078b
        public final int c() {
            q qVar = this.f3986a;
            int i6 = this.f3988c;
            if (i6 == 8) {
                return qVar.q();
            }
            if (i6 == 16) {
                return qVar.v();
            }
            int i10 = this.f3989d;
            this.f3989d = i10 + 1;
            if (i10 % 2 == 0) {
                int q10 = qVar.q();
                this.f3990e = q10;
                return (q10 & 240) >> 4;
            }
            return this.f3990e & 15;
        }
    }

    public static Pair a(int i6, q qVar) {
        qVar.A(i6 + 8 + 4);
        qVar.B(1);
        b(qVar);
        qVar.B(2);
        int q10 = qVar.q();
        if ((q10 & 128) != 0) {
            qVar.B(2);
        }
        if ((q10 & 64) != 0) {
            qVar.B(qVar.v());
        }
        if ((q10 & 32) != 0) {
            qVar.B(2);
        }
        qVar.B(1);
        b(qVar);
        String d10 = c9.l.d(qVar.q());
        if (!"audio/mpeg".equals(d10) && !"audio/vnd.dts".equals(d10) && !"audio/vnd.dts.hd".equals(d10)) {
            qVar.B(12);
            qVar.B(1);
            int b10 = b(qVar);
            byte[] bArr = new byte[b10];
            qVar.b(0, bArr, b10);
            return Pair.create(d10, bArr);
        }
        return Pair.create(d10, null);
    }

    public static int b(q qVar) {
        int q10 = qVar.q();
        int i6 = q10 & 127;
        while ((q10 & 128) == 128) {
            q10 = qVar.q();
            i6 = (i6 << 7) | (q10 & 127);
        }
        return i6;
    }

    public static Pair<Integer, k> c(q qVar, int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        k kVar;
        Pair<Integer, k> create;
        int i11;
        int i12;
        boolean z13;
        byte[] bArr;
        int i13 = qVar.f5187b;
        while (i13 - i6 < i10) {
            qVar.A(i13);
            int c10 = qVar.c();
            boolean z14 = true;
            if (c10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hc.d.i("childAtomSize must be positive", z10);
            if (qVar.c() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = -1;
                int i16 = 0;
                String str = null;
                Integer num2 = null;
                while (i14 - i13 < c10) {
                    qVar.A(i14);
                    int c11 = qVar.c();
                    int c12 = qVar.c();
                    if (c12 == 1718775137) {
                        num2 = Integer.valueOf(qVar.c());
                    } else if (c12 == 1935894637) {
                        qVar.B(4);
                        str = qVar.n(4);
                    } else if (c12 == 1935894633) {
                        i15 = i14;
                        i16 = c11;
                    }
                    i14 += c11;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hc.d.i("frma atom is mandatory", z11);
                    if (i15 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hc.d.i("schi atom is mandatory", z12);
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 < i16) {
                            qVar.A(i17);
                            int c13 = qVar.c();
                            if (qVar.c() == 1952804451) {
                                int c14 = (qVar.c() >> 24) & 255;
                                qVar.B(1);
                                if (c14 == 0) {
                                    qVar.B(1);
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    int q10 = qVar.q();
                                    i11 = q10 & 15;
                                    i12 = (q10 & 240) >> 4;
                                }
                                if (qVar.q() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int q11 = qVar.q();
                                byte[] bArr2 = new byte[16];
                                qVar.b(0, bArr2, 16);
                                if (z13 && q11 == 0) {
                                    int q12 = qVar.q();
                                    byte[] bArr3 = new byte[q12];
                                    qVar.b(0, bArr3, q12);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                kVar = new k(z13, str, q11, bArr2, i12, i11, bArr);
                            } else {
                                i17 += c13;
                            }
                        } else {
                            num = num2;
                            kVar = null;
                            break;
                        }
                    }
                    if (kVar == null) {
                        z14 = false;
                    }
                    hc.d.i("tenc atom is mandatory", z14);
                    int i18 = w.f5205a;
                    create = Pair.create(num, kVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += c10;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:527:0x0a76, code lost:
        if (r22 == null) goto L361;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c d(q qVar, int i6, int i10, String str, com.google.android.exoplayer2.drm.b bVar, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        com.google.android.exoplayer2.drm.b bVar2;
        int i16;
        int i17;
        c cVar;
        byte[] bArr;
        int i18;
        int i19;
        int i20;
        int i21;
        c cVar2;
        int i22;
        c cVar3;
        int i23;
        int i24;
        int i25;
        int i26;
        float f;
        int i27;
        l0 l0Var;
        String str2;
        List<byte[]> list;
        String str3;
        int i28;
        int i29;
        int v10;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        com.google.android.exoplayer2.drm.b bVar3;
        String str4;
        String str5;
        int i35;
        int i36;
        int i37;
        int i38;
        String str6;
        List<byte[]> list2;
        int i39;
        String str7;
        String str8;
        int i40;
        String str9;
        int i41;
        int i42;
        String str10;
        int i43;
        int i44;
        int intValue;
        List<byte[]> K;
        String str11;
        l0 l0Var2;
        String str12 = str;
        com.google.android.exoplayer2.drm.b bVar4 = bVar;
        qVar.A(12);
        int c10 = qVar.c();
        c cVar4 = new c(c10);
        int i45 = 0;
        while (i45 < c10) {
            int i46 = qVar.f5187b;
            int c11 = qVar.c();
            String str13 = "childAtomSize must be positive";
            hc.d.i("childAtomSize must be positive", c11 > 0);
            int c12 = qVar.c();
            k[] kVarArr = cVar4.f3979a;
            if (c12 == 1635148593 || c12 == 1635148595 || c12 == 1701733238 || c12 == 1831958048 || c12 == 1836070006 || c12 == 1752589105 || c12 == 1751479857 || c12 == 1932670515 || c12 == 1211250227 || c12 == 1987063864 || c12 == 1987063865 || c12 == 1635135537 || c12 == 1685479798 || c12 == 1685479729 || c12 == 1685481573 || c12 == 1685481521) {
                i11 = c10;
                i12 = i45;
                qVar.A(i46 + 8 + 8);
                qVar.B(16);
                int v11 = qVar.v();
                int v12 = qVar.v();
                qVar.B(50);
                int i47 = qVar.f5187b;
                if (c12 == 1701733238) {
                    i13 = c11;
                    i14 = i46;
                    Pair<Integer, k> c13 = c(qVar, i14, i13);
                    if (c13 != null) {
                        int intValue2 = ((Integer) c13.first).intValue();
                        bVar2 = bVar == null ? null : bVar.a(((k) c13.second).f4082b);
                        kVarArr[i12] = (k) c13.second;
                        i15 = intValue2;
                    } else {
                        i15 = c12;
                        bVar2 = bVar;
                    }
                    qVar.A(i47);
                } else {
                    i13 = c11;
                    i14 = i46;
                    i15 = c12;
                    bVar2 = bVar;
                }
                String str14 = i15 == 1831958048 ? "video/mpeg" : i15 == 1211250227 ? "video/3gpp" : null;
                int i48 = i47;
                com.google.android.exoplayer2.drm.b bVar5 = bVar2;
                int i49 = -1;
                byte[] bArr2 = null;
                String str15 = null;
                float f2 = 1.0f;
                ByteBuffer byteBuffer = null;
                int i50 = -1;
                int i51 = -1;
                int i52 = -1;
                boolean z11 = false;
                l0 l0Var3 = null;
                while (true) {
                    if (i48 - i14 >= i13) {
                        i16 = i49;
                        i17 = v11;
                        cVar = cVar4;
                        bArr = bArr2;
                        break;
                    }
                    qVar.A(i48);
                    int i53 = qVar.f5187b;
                    i16 = i49;
                    int c14 = qVar.c();
                    bArr = bArr2;
                    if (c14 == 0 && qVar.f5187b - i14 == i13) {
                        i17 = v11;
                        cVar = cVar4;
                        break;
                    }
                    hc.d.i(str13, c14 > 0);
                    int c15 = qVar.c();
                    String str16 = str13;
                    if (c15 == 1635148611) {
                        hc.d.i(null, str14 == null);
                        qVar.A(i53 + 8);
                        d9.a a10 = d9.a.a(qVar);
                        cVar4.f3981c = a10.f12604b;
                        if (!z11) {
                            f2 = a10.f12607e;
                        }
                        str2 = "video/avc";
                        list = a10.f12603a;
                        str3 = a10.f;
                    } else if (c15 == 1752589123) {
                        hc.d.i(null, str14 == null);
                        qVar.A(i53 + 8);
                        d9.f a11 = d9.f.a(qVar);
                        cVar4.f3981c = a11.f12641b;
                        if (!z11) {
                            f2 = a11.f12642c;
                        }
                        str2 = "video/hevc";
                        list = a11.f12640a;
                        str3 = a11.f12643d;
                    } else {
                        if (c15 == 1685480259 || c15 == 1685485123) {
                            i22 = v11;
                            cVar3 = cVar4;
                            i23 = v12;
                            i24 = i14;
                            i25 = i13;
                            i26 = i15;
                            f = f2;
                            d9.c a12 = d9.c.a(qVar);
                            if (a12 != null) {
                                str15 = a12.f12615b;
                                str14 = "video/dolby-vision";
                            }
                        } else {
                            if (c15 == 1987076931) {
                                hc.d.i(null, str14 == null);
                                str14 = i15 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            } else if (c15 == 1635135811) {
                                hc.d.i(null, str14 == null);
                                str14 = "video/av01";
                            } else if (c15 == 1668050025) {
                                ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                order.position(21);
                                order.putShort(qVar.m());
                                order.putShort(qVar.m());
                                byteBuffer = order;
                            } else if (c15 == 1835295606) {
                                if (byteBuffer == null) {
                                    byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                }
                                ByteBuffer byteBuffer2 = byteBuffer;
                                short m10 = qVar.m();
                                short m11 = qVar.m();
                                i26 = i15;
                                short m12 = qVar.m();
                                i24 = i14;
                                short m13 = qVar.m();
                                i25 = i13;
                                short m14 = qVar.m();
                                cVar3 = cVar4;
                                short m15 = qVar.m();
                                float f10 = f2;
                                short m16 = qVar.m();
                                i23 = v12;
                                short m17 = qVar.m();
                                long r = qVar.r();
                                long r10 = qVar.r();
                                i22 = v11;
                                byteBuffer2.position(1);
                                byteBuffer2.putShort(m14);
                                byteBuffer2.putShort(m15);
                                byteBuffer2.putShort(m10);
                                byteBuffer2.putShort(m11);
                                byteBuffer2.putShort(m12);
                                byteBuffer2.putShort(m13);
                                byteBuffer2.putShort(m16);
                                byteBuffer2.putShort(m17);
                                byteBuffer2.putShort((short) (r / 10000));
                                byteBuffer2.putShort((short) (r10 / 10000));
                                byteBuffer = byteBuffer2;
                                l0Var = l0Var3;
                                f2 = f10;
                                l0Var3 = l0Var;
                                f = f2;
                                bArr2 = bArr;
                                i48 += c14;
                                i49 = i16;
                                str13 = str16;
                                i15 = i26;
                                i14 = i24;
                                i13 = i25;
                                cVar4 = cVar3;
                                f2 = f;
                                v12 = i23;
                                v11 = i22;
                            } else {
                                i22 = v11;
                                cVar3 = cVar4;
                                i23 = v12;
                                i24 = i14;
                                i25 = i13;
                                i26 = i15;
                                f = f2;
                                if (c15 == 1681012275) {
                                    hc.d.i(null, str14 == null);
                                    str14 = "video/3gpp";
                                } else if (c15 == 1702061171) {
                                    hc.d.i(null, str14 == null);
                                    Pair a13 = a(i53, qVar);
                                    String str17 = (String) a13.first;
                                    byte[] bArr3 = (byte[]) a13.second;
                                    l0 K2 = bArr3 != null ? s.K(bArr3) : l0Var3;
                                    str14 = str17;
                                    l0Var3 = K2;
                                } else if (c15 == 1885434736) {
                                    qVar.A(i53 + 8);
                                    f = qVar.t() / qVar.t();
                                    bArr2 = bArr;
                                    z11 = true;
                                    i48 += c14;
                                    i49 = i16;
                                    str13 = str16;
                                    i15 = i26;
                                    i14 = i24;
                                    i13 = i25;
                                    cVar4 = cVar3;
                                    f2 = f;
                                    v12 = i23;
                                    v11 = i22;
                                } else if (c15 == 1937126244) {
                                    int i54 = i53 + 8;
                                    while (true) {
                                        if (i54 - i53 >= c14) {
                                            bArr2 = null;
                                            break;
                                        }
                                        qVar.A(i54);
                                        int c16 = qVar.c();
                                        if (qVar.c() == 1886547818) {
                                            bArr2 = Arrays.copyOfRange(qVar.f5186a, i54, c16 + i54);
                                            break;
                                        }
                                        i54 += c16;
                                    }
                                    i48 += c14;
                                    i49 = i16;
                                    str13 = str16;
                                    i15 = i26;
                                    i14 = i24;
                                    i13 = i25;
                                    cVar4 = cVar3;
                                    f2 = f;
                                    v12 = i23;
                                    v11 = i22;
                                } else if (c15 == 1936995172) {
                                    int q10 = qVar.q();
                                    qVar.B(3);
                                    if (q10 == 0) {
                                        int q11 = qVar.q();
                                        if (q11 == 0) {
                                            i16 = 0;
                                        } else if (q11 == 1) {
                                            i16 = 1;
                                        } else if (q11 == 2) {
                                            i16 = 2;
                                        } else if (q11 == 3) {
                                            i16 = 3;
                                        }
                                    }
                                } else if (c15 == 1668246642) {
                                    int c17 = qVar.c();
                                    if (c17 != 1852009592 && c17 != 1852009571) {
                                        String valueOf = String.valueOf(b8.a.a(c17));
                                        Log.w("AtomParsers", valueOf.length() != 0 ? "Unsupported color type: ".concat(valueOf) : new String("Unsupported color type: "));
                                    } else {
                                        int v13 = qVar.v();
                                        int v14 = qVar.v();
                                        qVar.B(2);
                                        boolean z12 = c14 == 19 && (qVar.q() & 128) != 0;
                                        int i55 = v13 != 1 ? v13 != 9 ? (v13 == 4 || v13 == 5 || v13 == 6 || v13 == 7) ? 2 : -1 : 6 : 1;
                                        int i56 = z12 ? 1 : 2;
                                        if (v14 != 1) {
                                            if (v14 != 16) {
                                                i27 = 7;
                                                if (v14 != 18) {
                                                    if (v14 != 6 && v14 != 7) {
                                                        i27 = -1;
                                                    }
                                                }
                                            } else {
                                                i27 = 6;
                                            }
                                            i50 = i27;
                                            i52 = i55;
                                            i51 = i56;
                                        }
                                        i27 = 3;
                                        i50 = i27;
                                        i52 = i55;
                                        i51 = i56;
                                    }
                                }
                            }
                            l0Var = l0Var3;
                            i22 = v11;
                            cVar3 = cVar4;
                            i23 = v12;
                            i24 = i14;
                            i25 = i13;
                            i26 = i15;
                            l0Var3 = l0Var;
                            f = f2;
                            bArr2 = bArr;
                            i48 += c14;
                            i49 = i16;
                            str13 = str16;
                            i15 = i26;
                            i14 = i24;
                            i13 = i25;
                            cVar4 = cVar3;
                            f2 = f;
                            v12 = i23;
                            v11 = i22;
                        }
                        bArr2 = bArr;
                        i48 += c14;
                        i49 = i16;
                        str13 = str16;
                        i15 = i26;
                        i14 = i24;
                        i13 = i25;
                        cVar4 = cVar3;
                        f2 = f;
                        v12 = i23;
                        v11 = i22;
                    }
                    l0Var = list;
                    str15 = str3;
                    str14 = str2;
                    i22 = v11;
                    cVar3 = cVar4;
                    i23 = v12;
                    i24 = i14;
                    i25 = i13;
                    i26 = i15;
                    l0Var3 = l0Var;
                    f = f2;
                    bArr2 = bArr;
                    i48 += c14;
                    i49 = i16;
                    str13 = str16;
                    i15 = i26;
                    i14 = i24;
                    i13 = i25;
                    cVar4 = cVar3;
                    f2 = f;
                    v12 = i23;
                    v11 = i22;
                }
                int i57 = v12;
                i18 = i14;
                i19 = i13;
                float f11 = f2;
                if (str14 == null) {
                    cVar2 = cVar;
                } else {
                    n.a aVar = new n.a();
                    aVar.b(i6);
                    aVar.f6665k = str14;
                    aVar.f6662h = str15;
                    aVar.f6670p = i17;
                    aVar.f6671q = i57;
                    aVar.f6673t = f11;
                    aVar.f6672s = i10;
                    aVar.f6674u = bArr;
                    aVar.f6675v = i16;
                    aVar.f6667m = l0Var3;
                    aVar.f6668n = bVar5;
                    int i58 = i52;
                    if (i58 == -1) {
                        i21 = i51;
                        i20 = i50;
                        if (i21 == -1) {
                            if (i20 == -1) {
                            }
                        }
                    } else {
                        i20 = i50;
                        i21 = i51;
                    }
                    aVar.f6676w = new d9.b(i58, i21, i20, byteBuffer != null ? byteBuffer.array() : null);
                    n nVar = new n(aVar);
                    cVar2 = cVar;
                    cVar2.f3980b = nVar;
                }
            } else if (c12 == 1836069985 || c12 == 1701733217 || c12 == 1633889587 || c12 == 1700998451 || c12 == 1633889588 || c12 == 1835823201 || c12 == 1685353315 || c12 == 1685353317 || c12 == 1685353320 || c12 == 1685353324 || c12 == 1685353336 || c12 == 1935764850 || c12 == 1935767394 || c12 == 1819304813 || c12 == 1936684916 || c12 == 1953984371 || c12 == 778924082 || c12 == 778924083 || c12 == 1835557169 || c12 == 1835560241 || c12 == 1634492771 || c12 == 1634492791 || c12 == 1970037111 || c12 == 1332770163 || c12 == 1716281667) {
                qVar.A(i46 + 8 + 8);
                if (z10) {
                    i28 = qVar.v();
                    qVar.B(6);
                } else {
                    qVar.B(8);
                    i28 = 0;
                }
                if (i28 == 0 || i28 == 1) {
                    i29 = c12;
                    v10 = qVar.v();
                    qVar.B(6);
                    byte[] bArr4 = qVar.f5186a;
                    int i59 = qVar.f5187b;
                    int i60 = i59 + 1;
                    int i61 = (bArr4[i60] & 255) | ((bArr4[i59] & 255) << 8);
                    int i62 = i60 + 1 + 2;
                    qVar.f5187b = i62;
                    qVar.A(i62 - 4);
                    int c18 = qVar.c();
                    if (i28 == 1) {
                        qVar.B(16);
                    }
                    i30 = i61;
                    i31 = c18;
                } else if (i28 == 2) {
                    qVar.B(16);
                    i29 = c12;
                    i30 = (int) Math.round(Double.longBitsToDouble(qVar.j()));
                    v10 = qVar.t();
                    qVar.B(20);
                    i31 = 0;
                } else {
                    i11 = c10;
                    i12 = i45;
                    i32 = i46;
                    i33 = c11;
                    cVar2 = cVar4;
                    i19 = i33;
                    i18 = i32;
                }
                int i63 = qVar.f5187b;
                i11 = c10;
                int i64 = i29;
                if (i64 == 1701733217) {
                    Pair<Integer, k> c19 = c(qVar, i46, c11);
                    if (c19 != null) {
                        i64 = ((Integer) c19.first).intValue();
                        if (bVar4 == null) {
                            i34 = i30;
                            bVar3 = null;
                        } else {
                            i34 = i30;
                            bVar3 = bVar4.a(((k) c19.second).f4082b);
                        }
                        kVarArr[i45] = (k) c19.second;
                    } else {
                        i34 = i30;
                        bVar3 = bVar4;
                    }
                    qVar.A(i63);
                } else {
                    i34 = i30;
                    bVar3 = bVar4;
                }
                String str18 = "audio/ac4";
                int i65 = v10;
                String str19 = "audio/ac3";
                if (i64 == 1633889587) {
                    str4 = "audio/ac3";
                } else if (i64 == 1700998451) {
                    str4 = "audio/eac3";
                } else if (i64 == 1633889588) {
                    str4 = "audio/ac4";
                } else if (i64 == 1685353315) {
                    str4 = "audio/vnd.dts";
                } else if (i64 == 1685353320 || i64 == 1685353324) {
                    str4 = "audio/vnd.dts.hd";
                } else if (i64 == 1685353317) {
                    str4 = "audio/vnd.dts.hd;profile=lbr";
                } else if (i64 == 1685353336) {
                    str4 = "audio/vnd.dts.uhd;profile=p2";
                } else if (i64 == 1935764850) {
                    str4 = "audio/3gpp";
                } else if (i64 == 1935767394) {
                    str4 = "audio/amr-wb";
                } else {
                    str5 = "audio/raw";
                    if (i64 == 1819304813 || i64 == 1936684916) {
                        i35 = 2;
                    } else if (i64 == 1953984371) {
                        i35 = 268435456;
                    } else if (i64 == 778924082 || i64 == 778924083) {
                        str4 = "audio/mpeg";
                    } else if (i64 == 1835557169) {
                        str4 = "audio/mha1";
                    } else if (i64 == 1835560241) {
                        str4 = "audio/mhm1";
                    } else if (i64 == 1634492771) {
                        str4 = "audio/alac";
                    } else if (i64 == 1634492791) {
                        str4 = "audio/g711-alaw";
                    } else if (i64 == 1970037111) {
                        str4 = "audio/g711-mlaw";
                    } else if (i64 == 1332770163) {
                        str4 = "audio/opus";
                    } else if (i64 == 1716281667) {
                        str4 = "audio/flac";
                    } else if (i64 == 1835823201) {
                        str4 = "audio/true-hd";
                    } else {
                        i35 = -1;
                        str5 = null;
                    }
                    i12 = i45;
                    i36 = i63;
                    i37 = i34;
                    i38 = i65;
                    str6 = null;
                    list2 = null;
                    i39 = i35;
                    str7 = str5;
                    while (i36 - i46 < c11) {
                        qVar.A(i36);
                        int c20 = qVar.c();
                        int i66 = c11;
                        hc.d.i(str13, c20 > 0);
                        int c21 = qVar.c();
                        int i67 = i46;
                        if (c21 == 1835557187) {
                            int i68 = c20 - 13;
                            byte[] bArr5 = new byte[i68];
                            str8 = str13;
                            qVar.A(i36 + 13);
                            qVar.b(0, bArr5, i68);
                            list2 = s.K(bArr5);
                            i44 = c20;
                        } else {
                            str8 = str13;
                            int i69 = 1702061171;
                            if (c21 == 1702061171) {
                                i40 = c20;
                                str9 = str19;
                            } else if (z10 && c21 == 2002876005) {
                                i40 = c20;
                                str9 = str19;
                                i69 = 1702061171;
                            } else {
                                int[] iArr = q7.b.f29236d;
                                int[] iArr2 = q7.b.f29234b;
                                i44 = c20;
                                if (c21 == 1684103987) {
                                    qVar.A(i36 + 8);
                                    String num = Integer.toString(i6);
                                    int i70 = iArr2[(qVar.q() & 192) >> 6];
                                    int q12 = qVar.q();
                                    int i71 = iArr[(q12 & 56) >> 3];
                                    if ((q12 & 4) != 0) {
                                        i71++;
                                    }
                                    n.a aVar2 = new n.a();
                                    aVar2.f6656a = num;
                                    aVar2.f6665k = str19;
                                    aVar2.f6677x = i71;
                                    aVar2.f6678y = i70;
                                    aVar2.f6668n = bVar3;
                                    aVar2.f6658c = str12;
                                    cVar4.f3980b = new n(aVar2);
                                } else {
                                    if (c21 == 1684366131) {
                                        qVar.A(i36 + 8);
                                        String num2 = Integer.toString(i6);
                                        qVar.B(2);
                                        int i72 = iArr2[(qVar.q() & 192) >> 6];
                                        int q13 = qVar.q();
                                        int i73 = iArr[(q13 & 14) >> 1];
                                        if ((q13 & 1) != 0) {
                                            i73++;
                                        }
                                        if (((qVar.q() & 30) >> 1) > 0 && (qVar.q() & 2) != 0) {
                                            i73 += 2;
                                        }
                                        str9 = str19;
                                        String str20 = (qVar.f5188c - qVar.f5187b <= 0 || (qVar.q() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
                                        n.a aVar3 = new n.a();
                                        aVar3.f6656a = num2;
                                        aVar3.f6665k = str20;
                                        aVar3.f6677x = i73;
                                        aVar3.f6678y = i72;
                                        aVar3.f6668n = bVar3;
                                        aVar3.f6658c = str12;
                                        cVar4.f3980b = new n(aVar3);
                                    } else {
                                        str9 = str19;
                                        if (c21 == 1684103988) {
                                            qVar.A(i36 + 8);
                                            String num3 = Integer.toString(i6);
                                            qVar.B(1);
                                            int i74 = ((qVar.q() & 32) >> 5) == 1 ? 48000 : 44100;
                                            n.a aVar4 = new n.a();
                                            aVar4.f6656a = num3;
                                            aVar4.f6665k = str18;
                                            aVar4.f6677x = 2;
                                            aVar4.f6678y = i74;
                                            aVar4.f6668n = bVar3;
                                            aVar4.f6658c = str12;
                                            cVar4.f3980b = new n(aVar4);
                                        } else {
                                            if (c21 == 1684892784) {
                                                if (i31 <= 0) {
                                                    StringBuilder sb2 = new StringBuilder(60);
                                                    sb2.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                    sb2.append(i31);
                                                    throw ParserException.a(sb2.toString(), null);
                                                }
                                                i37 = i31;
                                                i38 = 2;
                                            } else if (c21 == 1684305011) {
                                                n.a aVar5 = new n.a();
                                                aVar5.b(i6);
                                                aVar5.f6665k = str7;
                                                aVar5.f6677x = i38;
                                                aVar5.f6678y = i37;
                                                aVar5.f6668n = bVar3;
                                                aVar5.f6658c = str12;
                                                cVar4.f3980b = new n(aVar5);
                                            } else if (c21 == 1682927731) {
                                                int i75 = i44 - 8;
                                                byte[] bArr6 = f3970a;
                                                byte[] copyOf = Arrays.copyOf(bArr6, bArr6.length + i75);
                                                qVar.A(i36 + 8);
                                                qVar.b(bArr6.length, copyOf, i75);
                                                list2 = sc.b.l(copyOf);
                                            } else if (c21 == 1684425825) {
                                                int i76 = i44 - 12;
                                                byte[] bArr7 = new byte[i76 + 4];
                                                bArr7[0] = 102;
                                                bArr7[1] = 76;
                                                bArr7[2] = 97;
                                                bArr7[3] = 67;
                                                qVar.A(i36 + 12);
                                                qVar.b(4, bArr7, i76);
                                                list2 = s.K(bArr7);
                                            } else if (c21 == 1634492771) {
                                                int i77 = i44 - 12;
                                                byte[] bArr8 = new byte[i77];
                                                qVar.A(i36 + 12);
                                                qVar.b(0, bArr8, i77);
                                                q qVar2 = new q(bArr8);
                                                qVar2.A(9);
                                                int q14 = qVar2.q();
                                                qVar2.A(20);
                                                Pair create = Pair.create(Integer.valueOf(qVar2.t()), Integer.valueOf(q14));
                                                intValue = ((Integer) create.first).intValue();
                                                i38 = ((Integer) create.second).intValue();
                                                K = s.K(bArr8);
                                                list2 = K;
                                                i37 = intValue;
                                                i42 = i44;
                                                str13 = str8;
                                                str10 = str18;
                                                i36 += i42;
                                                str18 = str10;
                                                c11 = i66;
                                                i46 = i67;
                                                str19 = str9;
                                            }
                                            intValue = i37;
                                            K = list2;
                                            list2 = K;
                                            i37 = intValue;
                                            i42 = i44;
                                            str13 = str8;
                                            str10 = str18;
                                            i36 += i42;
                                            str18 = str10;
                                            c11 = i66;
                                            i46 = i67;
                                            str19 = str9;
                                        }
                                    }
                                    intValue = i37;
                                    K = list2;
                                    list2 = K;
                                    i37 = intValue;
                                    i42 = i44;
                                    str13 = str8;
                                    str10 = str18;
                                    i36 += i42;
                                    str18 = str10;
                                    c11 = i66;
                                    i46 = i67;
                                    str19 = str9;
                                }
                            }
                            boolean z13 = false;
                            if (c21 == i69) {
                                i41 = i36;
                                i42 = i40;
                                str13 = str8;
                                i43 = -1;
                                str10 = str18;
                            } else {
                                i41 = qVar.f5187b;
                                hc.d.i(null, i41 >= i36);
                                while (true) {
                                    i42 = i40;
                                    if (i41 - i36 >= i42) {
                                        str10 = str18;
                                        str13 = str8;
                                        i41 = -1;
                                        break;
                                    }
                                    qVar.A(i41);
                                    int c22 = qVar.c();
                                    str13 = str8;
                                    if (c22 > 0) {
                                        z13 = true;
                                    }
                                    hc.d.i(str13, z13);
                                    str10 = str18;
                                    if (qVar.c() == 1702061171) {
                                        break;
                                    }
                                    i41 += c22;
                                    str8 = str13;
                                    str18 = str10;
                                    z13 = false;
                                    i40 = i42;
                                }
                                i43 = -1;
                            }
                            if (i41 != i43) {
                                Pair a14 = a(i41, qVar);
                                String str21 = (String) a14.first;
                                byte[] bArr9 = (byte[]) a14.second;
                                if (bArr9 != null) {
                                    if ("audio/mp4a-latm".equals(str21)) {
                                        a.C0493a c23 = q7.a.c(bArr9);
                                        int i78 = c23.f29230a;
                                        int i79 = c23.f29231b;
                                        str6 = c23.f29232c;
                                        i37 = i78;
                                        i38 = i79;
                                    }
                                    list2 = s.K(bArr9);
                                }
                                str6 = str6;
                                str7 = str21;
                            }
                            i36 += i42;
                            str18 = str10;
                            c11 = i66;
                            i46 = i67;
                            str19 = str9;
                        }
                        str9 = str19;
                        intValue = i37;
                        K = list2;
                        list2 = K;
                        i37 = intValue;
                        i42 = i44;
                        str13 = str8;
                        str10 = str18;
                        i36 += i42;
                        str18 = str10;
                        c11 = i66;
                        i46 = i67;
                        str19 = str9;
                    }
                    i32 = i46;
                    i33 = c11;
                    if (cVar4.f3980b == null && str7 != null) {
                        n.a aVar6 = new n.a();
                        aVar6.b(i6);
                        aVar6.f6665k = str7;
                        aVar6.f6662h = str6;
                        aVar6.f6677x = i38;
                        aVar6.f6678y = i37;
                        aVar6.f6679z = i39;
                        aVar6.f6667m = list2;
                        aVar6.f6668n = bVar3;
                        aVar6.f6658c = str12;
                        cVar4.f3980b = new n(aVar6);
                    }
                    cVar2 = cVar4;
                    i19 = i33;
                    i18 = i32;
                }
                str5 = str4;
                i35 = -1;
                i12 = i45;
                i36 = i63;
                i37 = i34;
                i38 = i65;
                str6 = null;
                list2 = null;
                i39 = i35;
                str7 = str5;
                while (i36 - i46 < c11) {
                }
                i32 = i46;
                i33 = c11;
                if (cVar4.f3980b == null) {
                    n.a aVar62 = new n.a();
                    aVar62.b(i6);
                    aVar62.f6665k = str7;
                    aVar62.f6662h = str6;
                    aVar62.f6677x = i38;
                    aVar62.f6678y = i37;
                    aVar62.f6679z = i39;
                    aVar62.f6667m = list2;
                    aVar62.f6668n = bVar3;
                    aVar62.f6658c = str12;
                    cVar4.f3980b = new n(aVar62);
                }
                cVar2 = cVar4;
                i19 = i33;
                i18 = i32;
            } else {
                if (c12 == 1414810956 || c12 == 1954034535 || c12 == 2004251764 || c12 == 1937010800 || c12 == 1664495672) {
                    qVar.A(i46 + 8 + 8);
                    String str22 = "application/ttml+xml";
                    long j10 = Long.MAX_VALUE;
                    if (c12 != 1414810956) {
                        if (c12 == 1954034535) {
                            int i80 = (c11 - 8) - 8;
                            byte[] bArr10 = new byte[i80];
                            qVar.b(0, bArr10, i80);
                            l0Var2 = s.K(bArr10);
                            str11 = "application/x-quicktime-tx3g";
                            n.a aVar7 = new n.a();
                            aVar7.b(i6);
                            aVar7.f6665k = str11;
                            aVar7.f6658c = str12;
                            aVar7.f6669o = j10;
                            aVar7.f6667m = l0Var2;
                            cVar4.f3980b = new n(aVar7);
                        } else if (c12 == 2004251764) {
                            str22 = "application/x-mp4-vtt";
                        } else if (c12 == 1937010800) {
                            j10 = 0;
                        } else if (c12 == 1664495672) {
                            cVar4.f3982d = 1;
                            str22 = "application/x-mp4-cea-608";
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    str11 = str22;
                    l0Var2 = null;
                    n.a aVar72 = new n.a();
                    aVar72.b(i6);
                    aVar72.f6665k = str11;
                    aVar72.f6658c = str12;
                    aVar72.f6669o = j10;
                    aVar72.f6667m = l0Var2;
                    cVar4.f3980b = new n(aVar72);
                } else if (c12 == 1835365492) {
                    qVar.A(i46 + 8 + 8);
                    if (c12 == 1835365492) {
                        qVar.k();
                        String k10 = qVar.k();
                        if (k10 != null) {
                            n.a aVar8 = new n.a();
                            aVar8.b(i6);
                            aVar8.f6665k = k10;
                            cVar4.f3980b = new n(aVar8);
                        }
                    }
                } else if (c12 == 1667329389) {
                    n.a aVar9 = new n.a();
                    aVar9.b(i6);
                    aVar9.f6665k = "application/x-camera-motion";
                    cVar4.f3980b = new n(aVar9);
                }
                i11 = c10;
                cVar2 = cVar4;
                i12 = i45;
                i18 = i46;
                i19 = c11;
            }
            qVar.A(i18 + i19);
            i45 = i12 + 1;
            bVar4 = bVar;
            cVar4 = cVar2;
            c10 = i11;
            str12 = str;
        }
        return cVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(a.C0077a c0077a, p pVar, long j10, com.google.android.exoplayer2.drm.b bVar, boolean z10, boolean z11, nc.e eVar) {
        int i6;
        int i10;
        boolean z12;
        long u10;
        int i11;
        int c10;
        int i12;
        q qVar;
        int i13;
        long j11;
        int c11;
        int i14;
        int i15;
        int i16;
        c d10;
        ArrayList arrayList;
        long j12;
        long[] jArr;
        long[] jArr2;
        j jVar;
        nc.e eVar2;
        a.C0077a b10;
        Pair create;
        long r;
        long j13;
        long c12;
        j jVar2;
        InterfaceC0078b eVar3;
        boolean z13;
        q qVar2;
        q qVar3;
        int i17;
        int i18;
        q qVar4;
        int i19;
        int i20;
        int i21;
        int a10;
        boolean z14;
        int[] iArr;
        n nVar;
        int i22;
        boolean z15;
        int i23;
        String str;
        long[] jArr3;
        int[] iArr2;
        int i24;
        long[] jArr4;
        long j14;
        int i25;
        int i26;
        long[] jArr5;
        int i27;
        int[] iArr3;
        int i28;
        long[] jArr6;
        int[] iArr4;
        boolean z16;
        long[] jArr7;
        int[] iArr5;
        int[] iArr6;
        m mVar;
        int[] iArr7;
        long[] jArr8;
        int[] iArr8;
        int[] iArr9;
        int i29;
        long[] jArr9;
        int i30;
        int i31;
        boolean z17;
        boolean z18;
        ArrayList arrayList2;
        a.C0077a c0077a2 = c0077a;
        ArrayList arrayList3 = new ArrayList();
        int i32 = 0;
        while (true) {
            ArrayList arrayList4 = c0077a2.f3968d;
            if (i32 < arrayList4.size()) {
                a.C0077a c0077a3 = (a.C0077a) arrayList4.get(i32);
                if (c0077a3.f3965a != 1953653099) {
                    arrayList2 = arrayList3;
                    i16 = i32;
                } else {
                    a.b c13 = c0077a2.c(1836476516);
                    c13.getClass();
                    a.C0077a b11 = c0077a3.b(1835297121);
                    b11.getClass();
                    a.b c14 = b11.c(1751411826);
                    c14.getClass();
                    q qVar5 = c14.f3969b;
                    qVar5.A(16);
                    int c15 = qVar5.c();
                    if (c15 == 1936684398) {
                        i6 = 1;
                    } else if (c15 == 1986618469) {
                        i6 = 2;
                    } else if (c15 != 1952807028 && c15 != 1935832172 && c15 != 1937072756 && c15 != 1668047728) {
                        if (c15 == 1835365473) {
                            i6 = 5;
                        } else {
                            i6 = -1;
                        }
                    } else {
                        i6 = 3;
                    }
                    if (i6 == -1) {
                        arrayList = arrayList3;
                        i16 = i32;
                    } else {
                        a.b c16 = c0077a3.c(1953196132);
                        c16.getClass();
                        q qVar6 = c16.f3969b;
                        int i33 = 8;
                        qVar6.A(8);
                        int c17 = (qVar6.c() >> 24) & 255;
                        if (c17 != 0) {
                            i33 = 16;
                        }
                        qVar6.B(i33);
                        int c18 = qVar6.c();
                        qVar6.B(4);
                        int i34 = qVar6.f5187b;
                        if (c17 == 0) {
                            i10 = 4;
                        } else {
                            i10 = 8;
                        }
                        int i35 = 0;
                        while (true) {
                            if (i35 < i10) {
                                if (qVar6.f5186a[i34 + i35] != -1) {
                                    z12 = false;
                                    break;
                                }
                                i35++;
                            } else {
                                z12 = true;
                                break;
                            }
                        }
                        if (z12) {
                            qVar6.B(i10);
                        } else {
                            if (c17 == 0) {
                                u10 = qVar6.r();
                            } else {
                                u10 = qVar6.u();
                            }
                            if (u10 != 0) {
                                i11 = 16;
                                qVar6.B(i11);
                                c10 = qVar6.c();
                                int c19 = qVar6.c();
                                qVar6.B(4);
                                int c20 = qVar6.c();
                                int c21 = qVar6.c();
                                if (c10 != 0 && c19 == 65536 && c20 == -65536 && c21 == 0) {
                                    i12 = 90;
                                } else if (c10 != 0 && c19 == -65536 && c20 == 65536 && c21 == 0) {
                                    i12 = SubsamplingScaleImageView.ORIENTATION_270;
                                } else if (c10 != -65536 && c19 == 0 && c20 == 0 && c21 == -65536) {
                                    i12 = SubsamplingScaleImageView.ORIENTATION_180;
                                } else {
                                    i12 = 0;
                                }
                                if (j10 != -9223372036854775807L) {
                                    u10 = j10;
                                }
                                qVar = c13.f3969b;
                                qVar.A(8);
                                if (((qVar.c() >> 24) & 255) != 0) {
                                    i13 = 8;
                                } else {
                                    i13 = 16;
                                }
                                qVar.B(i13);
                                long r10 = qVar.r();
                                j11 = -9223372036854775807L;
                                if (u10 != -9223372036854775807L) {
                                    j11 = w.C(u10, 1000000L, r10);
                                }
                                a.C0077a b12 = b11.b(1835626086);
                                b12.getClass();
                                a.C0077a b13 = b12.b(1937007212);
                                b13.getClass();
                                a.b c22 = b11.c(1835296868);
                                c22.getClass();
                                q qVar7 = c22.f3969b;
                                qVar7.A(8);
                                c11 = (qVar7.c() >> 24) & 255;
                                if (c11 != 0) {
                                    i14 = 8;
                                } else {
                                    i14 = 16;
                                }
                                qVar7.B(i14);
                                long r11 = qVar7.r();
                                if (c11 != 0) {
                                    i15 = 4;
                                } else {
                                    i15 = 8;
                                }
                                qVar7.B(i15);
                                int v10 = qVar7.v();
                                i16 = i32;
                                StringBuilder sb2 = new StringBuilder(3);
                                sb2.append((char) (((v10 >> 10) & 31) + 96));
                                sb2.append((char) (((v10 >> 5) & 31) + 96));
                                sb2.append((char) ((v10 & 31) + 96));
                                Pair create2 = Pair.create(Long.valueOf(r11), sb2.toString());
                                a.b c23 = b13.c(1937011556);
                                c23.getClass();
                                d10 = d(c23.f3969b, c18, i12, (String) create2.second, bVar, z11);
                                if (z10 && (b10 = c0077a3.b(1701082227)) != null) {
                                    a.b c24 = b10.c(1701606260);
                                    if (c24 == null) {
                                        arrayList = arrayList3;
                                        j12 = j11;
                                        create = null;
                                    } else {
                                        q qVar8 = c24.f3969b;
                                        qVar8.A(8);
                                        int c25 = (qVar8.c() >> 24) & 255;
                                        int t3 = qVar8.t();
                                        long[] jArr10 = new long[t3];
                                        long[] jArr11 = new long[t3];
                                        arrayList = arrayList3;
                                        int i36 = 0;
                                        while (i36 < t3) {
                                            int i37 = t3;
                                            if (c25 == 1) {
                                                r = qVar8.u();
                                            } else {
                                                r = qVar8.r();
                                            }
                                            jArr10[i36] = r;
                                            if (c25 == 1) {
                                                c12 = qVar8.j();
                                                j13 = j11;
                                            } else {
                                                j13 = j11;
                                                c12 = qVar8.c();
                                            }
                                            jArr11[i36] = c12;
                                            if (qVar8.m() == 1) {
                                                qVar8.B(2);
                                                i36++;
                                                t3 = i37;
                                                j11 = j13;
                                            } else {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                        }
                                        j12 = j11;
                                        create = Pair.create(jArr10, jArr11);
                                    }
                                    if (create != null) {
                                        jArr2 = (long[]) create.second;
                                        jArr = (long[]) create.first;
                                        if (d10.f3980b != null) {
                                            jVar = new j(c18, i6, ((Long) create2.first).longValue(), r10, j12, d10.f3980b, d10.f3982d, d10.f3979a, d10.f3981c, jArr, jArr2);
                                            eVar2 = eVar;
                                            jVar2 = (j) eVar2.apply(jVar);
                                            if (jVar2 != null) {
                                                arrayList2 = arrayList;
                                            } else {
                                                a.C0077a b14 = c0077a3.b(1835297121);
                                                b14.getClass();
                                                a.C0077a b15 = b14.b(1835626086);
                                                b15.getClass();
                                                a.C0077a b16 = b15.b(1937007212);
                                                b16.getClass();
                                                a.b c26 = b16.c(1937011578);
                                                n nVar2 = jVar2.f;
                                                if (c26 != null) {
                                                    eVar3 = new d(c26, nVar2);
                                                } else {
                                                    a.b c27 = b16.c(1937013298);
                                                    if (c27 != null) {
                                                        eVar3 = new e(c27);
                                                    } else {
                                                        throw ParserException.a("Track has no sample table size information", null);
                                                    }
                                                }
                                                int b17 = eVar3.b();
                                                if (b17 == 0) {
                                                    mVar = new m(jVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                                } else {
                                                    a.b c28 = b16.c(1937007471);
                                                    if (c28 == null) {
                                                        c28 = b16.c(1668232756);
                                                        c28.getClass();
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    a.b c29 = b16.c(1937011555);
                                                    c29.getClass();
                                                    a.b c30 = b16.c(1937011827);
                                                    c30.getClass();
                                                    a.b c31 = b16.c(1937011571);
                                                    if (c31 != null) {
                                                        qVar2 = c31.f3969b;
                                                    } else {
                                                        qVar2 = null;
                                                    }
                                                    a.b c32 = b16.c(1668576371);
                                                    if (c32 != null) {
                                                        qVar3 = c32.f3969b;
                                                    } else {
                                                        qVar3 = null;
                                                    }
                                                    a aVar = new a(c29.f3969b, c28.f3969b, z13);
                                                    q qVar9 = c30.f3969b;
                                                    qVar9.A(12);
                                                    int t10 = qVar9.t() - 1;
                                                    int t11 = qVar9.t();
                                                    int t12 = qVar9.t();
                                                    if (qVar3 != null) {
                                                        qVar3.A(12);
                                                        i17 = qVar3.t();
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    if (qVar2 != null) {
                                                        qVar2.A(12);
                                                        i19 = qVar2.t();
                                                        if (i19 > 0) {
                                                            i18 = -1;
                                                            i20 = t11;
                                                            i21 = qVar2.t() - 1;
                                                            a10 = eVar3.a();
                                                            int i38 = i21;
                                                            String str2 = nVar2.F;
                                                            if (a10 == i18 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && t10 == 0 && i17 == 0 && i19 == 0)) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            if (!z14) {
                                                                int i39 = aVar.f3971a;
                                                                long[] jArr12 = new long[i39];
                                                                int[] iArr10 = new int[i39];
                                                                while (aVar.a()) {
                                                                    int i40 = aVar.f3972b;
                                                                    jArr12[i40] = aVar.f3974d;
                                                                    iArr10[i40] = aVar.f3973c;
                                                                }
                                                                long j15 = t12;
                                                                int i41 = 8192 / a10;
                                                                int i42 = 0;
                                                                for (int i43 = 0; i43 < i39; i43++) {
                                                                    int i44 = iArr10[i43];
                                                                    int i45 = w.f5205a;
                                                                    i42 += ((i44 + i41) - 1) / i41;
                                                                }
                                                                long[] jArr13 = new long[i42];
                                                                int[] iArr11 = new int[i42];
                                                                jArr4 = new long[i42];
                                                                int[] iArr12 = new int[i42];
                                                                int i46 = 0;
                                                                int i47 = 0;
                                                                i24 = 0;
                                                                int i48 = 0;
                                                                while (i47 < i39) {
                                                                    int i49 = iArr10[i47];
                                                                    long j16 = jArr12[i47];
                                                                    int i50 = i48;
                                                                    int i51 = i39;
                                                                    int i52 = i24;
                                                                    int i53 = i50;
                                                                    long[] jArr14 = jArr12;
                                                                    int i54 = i49;
                                                                    while (i54 > 0) {
                                                                        int min = Math.min(i41, i54);
                                                                        jArr13[i53] = j16;
                                                                        int[] iArr13 = iArr10;
                                                                        int i55 = a10 * min;
                                                                        iArr11[i53] = i55;
                                                                        i52 = Math.max(i52, i55);
                                                                        jArr4[i53] = i46 * j15;
                                                                        iArr12[i53] = 1;
                                                                        j16 += iArr11[i53];
                                                                        i46 += min;
                                                                        i54 -= min;
                                                                        i53++;
                                                                        iArr10 = iArr13;
                                                                        i41 = i41;
                                                                    }
                                                                    i47++;
                                                                    jArr12 = jArr14;
                                                                    int i56 = i53;
                                                                    i24 = i52;
                                                                    i39 = i51;
                                                                    i48 = i56;
                                                                }
                                                                nVar = nVar2;
                                                                j14 = j15 * i46;
                                                                jArr3 = jArr13;
                                                                iArr = iArr12;
                                                                iArr2 = iArr11;
                                                            } else {
                                                                long[] jArr15 = new long[b17];
                                                                int[] iArr14 = new int[b17];
                                                                long[] jArr16 = new long[b17];
                                                                iArr = new int[b17];
                                                                int i57 = t10;
                                                                int i58 = 0;
                                                                int i59 = 0;
                                                                int i60 = 0;
                                                                long j17 = 0;
                                                                long j18 = 0;
                                                                int i61 = 0;
                                                                int i62 = 0;
                                                                nVar = nVar2;
                                                                int i63 = i38;
                                                                int i64 = i17;
                                                                int i65 = t12;
                                                                int i66 = i20;
                                                                int i67 = i64;
                                                                while (true) {
                                                                    if (i59 < b17) {
                                                                        boolean z19 = true;
                                                                        while (i60 == 0) {
                                                                            z19 = aVar.a();
                                                                            if (!z19) {
                                                                                break;
                                                                            }
                                                                            int i68 = i66;
                                                                            long j19 = aVar.f3974d;
                                                                            i60 = aVar.f3973c;
                                                                            j18 = j19;
                                                                            i66 = i68;
                                                                            i65 = i65;
                                                                            b17 = b17;
                                                                        }
                                                                        int i69 = b17;
                                                                        i22 = i66;
                                                                        int i70 = i65;
                                                                        if (!z19) {
                                                                            Log.w("AtomParsers", "Unexpected end of chunk data");
                                                                            jArr15 = Arrays.copyOf(jArr15, i59);
                                                                            iArr14 = Arrays.copyOf(iArr14, i59);
                                                                            jArr16 = Arrays.copyOf(jArr16, i59);
                                                                            iArr = Arrays.copyOf(iArr, i59);
                                                                            b17 = i59;
                                                                            break;
                                                                        }
                                                                        if (qVar3 != null) {
                                                                            while (i62 == 0 && i67 > 0) {
                                                                                i62 = qVar3.t();
                                                                                i61 = qVar3.c();
                                                                                i67--;
                                                                            }
                                                                            i62--;
                                                                        }
                                                                        int i71 = i61;
                                                                        jArr15[i59] = j18;
                                                                        int c33 = eVar3.c();
                                                                        iArr14[i59] = c33;
                                                                        if (c33 > i58) {
                                                                            i58 = c33;
                                                                        }
                                                                        jArr16[i59] = j17 + i71;
                                                                        if (qVar2 == null) {
                                                                            i25 = 1;
                                                                        } else {
                                                                            i25 = 0;
                                                                        }
                                                                        iArr[i59] = i25;
                                                                        if (i59 == i63) {
                                                                            iArr[i59] = 1;
                                                                            i19--;
                                                                            if (i19 > 0) {
                                                                                qVar2.getClass();
                                                                                i63 = qVar2.t() - 1;
                                                                            }
                                                                        }
                                                                        int i72 = i63;
                                                                        j17 += i70;
                                                                        int i73 = i22 - 1;
                                                                        if (i73 == 0 && i57 > 0) {
                                                                            i73 = qVar9.t();
                                                                            i26 = qVar9.c();
                                                                            i57--;
                                                                        } else {
                                                                            i26 = i70;
                                                                        }
                                                                        i66 = i73;
                                                                        j18 += iArr14[i59];
                                                                        i60--;
                                                                        i59++;
                                                                        i61 = i71;
                                                                        jArr15 = jArr15;
                                                                        iArr14 = iArr14;
                                                                        b17 = i69;
                                                                        i65 = i26;
                                                                        i63 = i72;
                                                                    } else {
                                                                        i22 = i66;
                                                                        break;
                                                                    }
                                                                }
                                                                int i74 = i60;
                                                                long j20 = j17 + i61;
                                                                if (qVar3 != null) {
                                                                    while (i67 > 0) {
                                                                        if (qVar3.t() != 0) {
                                                                            z15 = false;
                                                                            break;
                                                                        }
                                                                        qVar3.c();
                                                                        i67--;
                                                                    }
                                                                }
                                                                z15 = true;
                                                                if (i19 == 0 && i22 == 0 && i74 == 0 && i57 == 0) {
                                                                    i23 = i62;
                                                                    if (i23 == 0 && z15) {
                                                                        jVar2 = jVar2;
                                                                        jArr3 = jArr15;
                                                                        iArr2 = iArr14;
                                                                        i24 = i58;
                                                                        jArr4 = jArr16;
                                                                        j14 = j20;
                                                                    }
                                                                } else {
                                                                    i23 = i62;
                                                                }
                                                                if (!z15) {
                                                                    str = ", ctts invalid";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                StringBuilder sb3 = new StringBuilder(str.length() + 262);
                                                                sb3.append("Inconsistent stbl box for track ");
                                                                jVar2 = jVar2;
                                                                sb3.append(jVar2.f4071a);
                                                                sb3.append(": remainingSynchronizationSamples ");
                                                                sb3.append(i19);
                                                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                                                sb3.append(i22);
                                                                sb3.append(", remainingSamplesInChunk ");
                                                                sb3.append(i74);
                                                                sb3.append(", remainingTimestampDeltaChanges ");
                                                                sb3.append(i57);
                                                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                                                sb3.append(i23);
                                                                sb3.append(str);
                                                                Log.w("AtomParsers", sb3.toString());
                                                                jArr3 = jArr15;
                                                                iArr2 = iArr14;
                                                                i24 = i58;
                                                                jArr4 = jArr16;
                                                                j14 = j20;
                                                            }
                                                            long C = w.C(j14, 1000000L, jVar2.f4073c);
                                                            long j21 = jVar2.f4073c;
                                                            jArr5 = jVar2.f4077h;
                                                            if (jArr5 != null) {
                                                                w.D(jArr4, j21);
                                                                mVar = new m(jVar2, jArr3, iArr2, i24, jArr4, iArr, C);
                                                            } else {
                                                                int length = jArr5.length;
                                                                int i75 = jVar2.f4072b;
                                                                long[] jArr17 = jVar2.f4078i;
                                                                if (length == 1 && i75 == 1 && jArr4.length >= 2) {
                                                                    jArr17.getClass();
                                                                    long j22 = jArr17[0];
                                                                    i28 = i75;
                                                                    i27 = b17;
                                                                    iArr3 = iArr2;
                                                                    long C2 = w.C(jArr5[0], jVar2.f4073c, jVar2.f4074d) + j22;
                                                                    int length2 = jArr4.length - 1;
                                                                    jArr6 = jArr17;
                                                                    int h10 = w.h(4, 0, length2);
                                                                    iArr4 = iArr;
                                                                    int h11 = w.h(jArr4.length - 4, 0, length2);
                                                                    long j23 = jArr4[0];
                                                                    if (j23 <= j22 && j22 < jArr4[h10] && jArr4[h11] < C2 && C2 <= j14) {
                                                                        z18 = true;
                                                                    } else {
                                                                        z18 = false;
                                                                    }
                                                                    if (z18) {
                                                                        long j24 = j14 - C2;
                                                                        int i76 = nVar.T;
                                                                        long C3 = w.C(j22 - j23, i76, jVar2.f4073c);
                                                                        long C4 = w.C(j24, i76, jVar2.f4073c);
                                                                        if ((C3 != 0 || C4 != 0) && C3 <= 2147483647L && C4 <= 2147483647L) {
                                                                            pVar.f33898a = (int) C3;
                                                                            pVar.f33899b = (int) C4;
                                                                            w.D(jArr4, j21);
                                                                            mVar = new m(jVar2, jArr3, iArr3, i24, jArr4, iArr4, w.C(jArr5[0], 1000000L, jVar2.f4074d));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i27 = b17;
                                                                    iArr3 = iArr2;
                                                                    i28 = i75;
                                                                    jArr6 = jArr17;
                                                                    iArr4 = iArr;
                                                                }
                                                                if (jArr5.length == 1 && jArr5[0] == 0) {
                                                                    jArr6.getClass();
                                                                    long j25 = jArr6[0];
                                                                    for (int i77 = 0; i77 < jArr4.length; i77++) {
                                                                        jArr4[i77] = w.C(jArr4[i77] - j25, 1000000L, jVar2.f4073c);
                                                                    }
                                                                    mVar = new m(jVar2, jArr3, iArr3, i24, jArr4, iArr4, w.C(j14 - j25, 1000000L, jVar2.f4073c));
                                                                }
                                                                if (i28 == 1) {
                                                                    z16 = true;
                                                                } else {
                                                                    z16 = false;
                                                                }
                                                                int[] iArr15 = new int[jArr5.length];
                                                                int[] iArr16 = new int[jArr5.length];
                                                                jArr6.getClass();
                                                                int i78 = 0;
                                                                boolean z20 = false;
                                                                int i79 = 0;
                                                                int i80 = 0;
                                                                while (i78 < jArr5.length) {
                                                                    long j26 = jArr6[i78];
                                                                    if (j26 != -1) {
                                                                        i29 = i78;
                                                                        jArr9 = jArr5;
                                                                        int i81 = i80;
                                                                        long C5 = w.C(jArr5[i78], jVar2.f4073c, jVar2.f4074d);
                                                                        iArr15[i29] = w.f(jArr4, j26, true);
                                                                        iArr16[i29] = w.b(jArr4, j26 + C5, z16);
                                                                        while (true) {
                                                                            i30 = iArr15[i29];
                                                                            i31 = iArr16[i29];
                                                                            if (i30 >= i31 || (iArr4[i30] & 1) != 0) {
                                                                                break;
                                                                            }
                                                                            iArr15[i29] = i30 + 1;
                                                                        }
                                                                        int i82 = (i31 - i30) + i79;
                                                                        if (i81 != i30) {
                                                                            z17 = true;
                                                                        } else {
                                                                            z17 = false;
                                                                        }
                                                                        z20 = z17 | z20;
                                                                        i79 = i82;
                                                                        i80 = i31;
                                                                    } else {
                                                                        i29 = i78;
                                                                        jArr9 = jArr5;
                                                                    }
                                                                    i78 = i29 + 1;
                                                                    jArr5 = jArr9;
                                                                }
                                                                long[] jArr18 = jArr5;
                                                                boolean z21 = true;
                                                                if (i79 == i27) {
                                                                    z21 = false;
                                                                }
                                                                boolean z22 = z20 | z21;
                                                                if (z22) {
                                                                    jArr7 = new long[i79];
                                                                } else {
                                                                    jArr7 = jArr3;
                                                                }
                                                                if (z22) {
                                                                    iArr5 = new int[i79];
                                                                } else {
                                                                    iArr5 = iArr3;
                                                                }
                                                                if (z22) {
                                                                    i24 = 0;
                                                                }
                                                                if (z22) {
                                                                    iArr6 = new int[i79];
                                                                } else {
                                                                    iArr6 = iArr4;
                                                                }
                                                                long[] jArr19 = new long[i79];
                                                                int i83 = i24;
                                                                int i84 = 0;
                                                                int i85 = 0;
                                                                long j27 = 0;
                                                                while (i84 < jArr18.length) {
                                                                    long j28 = jArr6[i84];
                                                                    int i86 = iArr15[i84];
                                                                    int[] iArr17 = iArr15;
                                                                    int i87 = iArr16[i84];
                                                                    if (z22) {
                                                                        iArr7 = iArr16;
                                                                        int i88 = i87 - i86;
                                                                        System.arraycopy(jArr3, i86, jArr7, i85, i88);
                                                                        jArr8 = jArr3;
                                                                        iArr9 = iArr3;
                                                                        System.arraycopy(iArr9, i86, iArr5, i85, i88);
                                                                        iArr8 = iArr4;
                                                                        System.arraycopy(iArr8, i86, iArr6, i85, i88);
                                                                    } else {
                                                                        iArr7 = iArr16;
                                                                        jArr8 = jArr3;
                                                                        iArr8 = iArr4;
                                                                        iArr9 = iArr3;
                                                                    }
                                                                    while (i86 < i87) {
                                                                        int i89 = i87;
                                                                        long[] jArr20 = jArr4;
                                                                        int[] iArr18 = iArr8;
                                                                        int[] iArr19 = iArr6;
                                                                        int i90 = i86;
                                                                        jArr19[i85] = w.C(j27, 1000000L, jVar2.f4074d) + w.C(Math.max(0L, jArr4[i86] - j28), 1000000L, jVar2.f4073c);
                                                                        if (z22 && iArr5[i85] > i83) {
                                                                            i83 = iArr9[i90];
                                                                        }
                                                                        i85++;
                                                                        i86 = i90 + 1;
                                                                        i87 = i89;
                                                                        iArr6 = iArr19;
                                                                        jArr4 = jArr20;
                                                                        iArr8 = iArr18;
                                                                    }
                                                                    j27 += jArr18[i84];
                                                                    i84++;
                                                                    iArr15 = iArr17;
                                                                    iArr16 = iArr7;
                                                                    iArr6 = iArr6;
                                                                    iArr4 = iArr8;
                                                                    iArr3 = iArr9;
                                                                    jArr3 = jArr8;
                                                                }
                                                                mVar = new m(jVar2, jArr7, iArr5, i83, jArr19, iArr6, w.C(j27, 1000000L, jVar2.f4074d));
                                                            }
                                                        } else {
                                                            i18 = -1;
                                                            qVar4 = null;
                                                        }
                                                    } else {
                                                        i18 = -1;
                                                        qVar4 = qVar2;
                                                        i19 = 0;
                                                    }
                                                    i20 = t11;
                                                    qVar2 = qVar4;
                                                    i21 = -1;
                                                    a10 = eVar3.a();
                                                    int i382 = i21;
                                                    String str22 = nVar2.F;
                                                    if (a10 == i18) {
                                                    }
                                                    z14 = false;
                                                    if (!z14) {
                                                    }
                                                    long C6 = w.C(j14, 1000000L, jVar2.f4073c);
                                                    long j212 = jVar2.f4073c;
                                                    jArr5 = jVar2.f4077h;
                                                    if (jArr5 != null) {
                                                    }
                                                }
                                                arrayList2 = arrayList;
                                                arrayList2.add(mVar);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                    j12 = j11;
                                }
                                jArr = null;
                                jArr2 = null;
                                if (d10.f3980b != null) {
                                }
                            }
                        }
                        i11 = 16;
                        u10 = -9223372036854775807L;
                        qVar6.B(i11);
                        c10 = qVar6.c();
                        int c192 = qVar6.c();
                        qVar6.B(4);
                        int c202 = qVar6.c();
                        int c212 = qVar6.c();
                        if (c10 != 0) {
                        }
                        if (c10 != 0) {
                        }
                        if (c10 != -65536) {
                        }
                        i12 = 0;
                        if (j10 != -9223372036854775807L) {
                        }
                        qVar = c13.f3969b;
                        qVar.A(8);
                        if (((qVar.c() >> 24) & 255) != 0) {
                        }
                        qVar.B(i13);
                        long r102 = qVar.r();
                        j11 = -9223372036854775807L;
                        if (u10 != -9223372036854775807L) {
                        }
                        a.C0077a b122 = b11.b(1835626086);
                        b122.getClass();
                        a.C0077a b132 = b122.b(1937007212);
                        b132.getClass();
                        a.b c222 = b11.c(1835296868);
                        c222.getClass();
                        q qVar72 = c222.f3969b;
                        qVar72.A(8);
                        c11 = (qVar72.c() >> 24) & 255;
                        if (c11 != 0) {
                        }
                        qVar72.B(i14);
                        long r112 = qVar72.r();
                        if (c11 != 0) {
                        }
                        qVar72.B(i15);
                        int v102 = qVar72.v();
                        i16 = i32;
                        StringBuilder sb22 = new StringBuilder(3);
                        sb22.append((char) (((v102 >> 10) & 31) + 96));
                        sb22.append((char) (((v102 >> 5) & 31) + 96));
                        sb22.append((char) ((v102 & 31) + 96));
                        Pair create22 = Pair.create(Long.valueOf(r112), sb22.toString());
                        a.b c232 = b132.c(1937011556);
                        c232.getClass();
                        d10 = d(c232.f3969b, c18, i12, (String) create22.second, bVar, z11);
                        if (z10) {
                        }
                        arrayList = arrayList3;
                        j12 = j11;
                        jArr = null;
                        jArr2 = null;
                        if (d10.f3980b != null) {
                        }
                    }
                    eVar2 = eVar;
                    jVar = null;
                    jVar2 = (j) eVar2.apply(jVar);
                    if (jVar2 != null) {
                    }
                }
                i32 = i16 + 1;
                arrayList3 = arrayList2;
                c0077a2 = c0077a;
            } else {
                return arrayList3;
            }
        }
    }
}
