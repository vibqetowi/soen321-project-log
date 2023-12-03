package c8;

import android.util.Log;
import c8.h;
import c9.q;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import java.util.ArrayList;
import java.util.Arrays;
import u7.x;
import u7.y;
/* compiled from: VorbisReader.java */
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: n  reason: collision with root package name */
    public a f5118n;

    /* renamed from: o  reason: collision with root package name */
    public int f5119o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5120p;

    /* renamed from: q  reason: collision with root package name */
    public y.c f5121q;
    public y.a r;

    /* compiled from: VorbisReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y.c f5122a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f5123b;

        /* renamed from: c  reason: collision with root package name */
        public final y.b[] f5124c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5125d;

        public a(y.c cVar, byte[] bArr, y.b[] bVarArr, int i6) {
            this.f5122a = cVar;
            this.f5123b = bArr;
            this.f5124c = bVarArr;
            this.f5125d = i6;
        }
    }

    @Override // c8.h
    public final void a(long j10) {
        boolean z10;
        this.f5109g = j10;
        int i6 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5120p = z10;
        y.c cVar = this.f5121q;
        if (cVar != null) {
            i6 = cVar.f33934e;
        }
        this.f5119o = i6;
    }

    @Override // c8.h
    public final long b(q qVar) {
        int i6;
        int i10 = 0;
        byte b10 = qVar.f5186a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f5118n;
        sc.b.E(aVar);
        boolean z10 = aVar.f5124c[(b10 >> 1) & (255 >>> (8 - aVar.f5125d))].f33929a;
        y.c cVar = aVar.f5122a;
        if (!z10) {
            i6 = cVar.f33934e;
        } else {
            i6 = cVar.f;
        }
        if (this.f5120p) {
            i10 = (this.f5119o + i6) / 4;
        }
        long j10 = i10;
        byte[] bArr = qVar.f5186a;
        int length = bArr.length;
        int i11 = qVar.f5188c + 4;
        if (length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            qVar.y(copyOf, copyOf.length);
        } else {
            qVar.z(i11);
        }
        byte[] bArr2 = qVar.f5186a;
        int i12 = qVar.f5188c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f5120p = true;
        this.f5119o = i6;
        return j10;
    }

    @Override // c8.h
    public final boolean c(q qVar, long j10, h.a aVar) {
        a aVar2;
        int i6;
        int i10;
        int i11;
        int i12;
        if (this.f5118n != null) {
            aVar.f5116a.getClass();
            return false;
        }
        y.c cVar = this.f5121q;
        if (cVar == null) {
            y.b(1, qVar, false);
            qVar.h();
            int q10 = qVar.q();
            int h10 = qVar.h();
            int e10 = qVar.e();
            if (e10 <= 0) {
                i11 = -1;
            } else {
                i11 = e10;
            }
            int e11 = qVar.e();
            if (e11 <= 0) {
                i12 = -1;
            } else {
                i12 = e11;
            }
            qVar.e();
            int q11 = qVar.q();
            qVar.q();
            this.f5121q = new y.c(q10, h10, i11, i12, (int) Math.pow(2.0d, q11 & 15), (int) Math.pow(2.0d, (q11 & 240) >> 4), Arrays.copyOf(qVar.f5186a, qVar.f5188c));
        } else if (this.r == null) {
            this.r = y.a(qVar, true, true);
        } else {
            int i13 = qVar.f5188c;
            byte[] bArr = new byte[i13];
            System.arraycopy(qVar.f5186a, 0, bArr, 0, i13);
            int i14 = 5;
            y.b(5, qVar, false);
            int q12 = qVar.q() + 1;
            x xVar = new x(qVar.f5186a, 0, 0);
            xVar.r(qVar.f5187b * 8);
            int i15 = 0;
            while (true) {
                int i16 = 16;
                if (i15 < q12) {
                    if (xVar.i(24) == 5653314) {
                        int i17 = xVar.i(16);
                        int i18 = xVar.i(24);
                        long[] jArr = new long[i18];
                        long j11 = 0;
                        if (!xVar.h()) {
                            boolean h11 = xVar.h();
                            int i19 = 0;
                            while (i19 < i18) {
                                if (h11) {
                                    if (xVar.h()) {
                                        jArr[i19] = xVar.i(i14) + 1;
                                    } else {
                                        jArr[i19] = 0;
                                    }
                                } else {
                                    jArr[i19] = xVar.i(5) + 1;
                                }
                                i19++;
                                i14 = 5;
                            }
                        } else {
                            int i20 = xVar.i(5) + 1;
                            int i21 = 0;
                            while (i21 < i18) {
                                int i22 = 0;
                                for (int i23 = i18 - i21; i23 > 0; i23 >>>= 1) {
                                    i22++;
                                }
                                int i24 = 0;
                                for (int i25 = xVar.i(i22); i24 < i25 && i21 < i18; i25 = i25) {
                                    jArr[i21] = i20;
                                    i21++;
                                    i24++;
                                    bArr = bArr;
                                }
                                i20++;
                                bArr = bArr;
                            }
                        }
                        byte[] bArr2 = bArr;
                        int i26 = xVar.i(4);
                        if (i26 <= 2) {
                            if (i26 == 1 || i26 == 2) {
                                xVar.r(32);
                                xVar.r(32);
                                int i27 = xVar.i(4) + 1;
                                xVar.r(1);
                                if (i26 == 1) {
                                    if (i17 != 0) {
                                        j11 = (long) Math.floor(Math.pow(i18, 1.0d / i17));
                                    }
                                } else {
                                    j11 = i18 * i17;
                                }
                                xVar.r((int) (i27 * j11));
                            }
                            i15++;
                            bArr = bArr2;
                            i14 = 5;
                        } else {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(i26);
                            throw ParserException.a(sb2.toString(), null);
                        }
                    } else {
                        int g5 = xVar.g();
                        StringBuilder sb3 = new StringBuilder(66);
                        sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb3.append(g5);
                        throw ParserException.a(sb3.toString(), null);
                    }
                } else {
                    byte[] bArr3 = bArr;
                    int i28 = 6;
                    int i29 = xVar.i(6) + 1;
                    for (int i30 = 0; i30 < i29; i30++) {
                        if (xVar.i(16) != 0) {
                            throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                        }
                    }
                    int i31 = 1;
                    int i32 = xVar.i(6) + 1;
                    int i33 = 0;
                    while (true) {
                        int i34 = 3;
                        if (i33 < i32) {
                            int i35 = xVar.i(i16);
                            if (i35 != 0) {
                                if (i35 == i31) {
                                    int i36 = xVar.i(5);
                                    int[] iArr = new int[i36];
                                    int i37 = -1;
                                    for (int i38 = 0; i38 < i36; i38++) {
                                        int i39 = xVar.i(4);
                                        iArr[i38] = i39;
                                        if (i39 > i37) {
                                            i37 = i39;
                                        }
                                    }
                                    int i40 = i37 + 1;
                                    int[] iArr2 = new int[i40];
                                    int i41 = 0;
                                    while (i41 < i40) {
                                        iArr2[i41] = xVar.i(i34) + 1;
                                        int i42 = xVar.i(2);
                                        int i43 = 8;
                                        if (i42 > 0) {
                                            xVar.r(8);
                                        }
                                        int i44 = 0;
                                        for (int i45 = 1; i44 < (i45 << i42); i45 = 1) {
                                            xVar.r(i43);
                                            i44++;
                                            i43 = 8;
                                        }
                                        i41++;
                                        i34 = 3;
                                    }
                                    xVar.r(2);
                                    int i46 = xVar.i(4);
                                    int i47 = 0;
                                    int i48 = 0;
                                    for (int i49 = 0; i49 < i36; i49++) {
                                        i47 += iArr2[iArr[i49]];
                                        while (i48 < i47) {
                                            xVar.r(i46);
                                            i48++;
                                        }
                                    }
                                } else {
                                    StringBuilder sb4 = new StringBuilder(52);
                                    sb4.append("floor type greater than 1 not decodable: ");
                                    sb4.append(i35);
                                    throw ParserException.a(sb4.toString(), null);
                                }
                            } else {
                                int i50 = 8;
                                xVar.r(8);
                                xVar.r(16);
                                xVar.r(16);
                                xVar.r(6);
                                xVar.r(8);
                                int i51 = xVar.i(4) + 1;
                                int i52 = 0;
                                while (i52 < i51) {
                                    xVar.r(i50);
                                    i52++;
                                    i50 = 8;
                                }
                            }
                            i33++;
                            i28 = 6;
                            i16 = 16;
                            i31 = 1;
                        } else {
                            int i53 = 1;
                            int i54 = xVar.i(i28) + 1;
                            int i55 = 0;
                            while (i55 < i54) {
                                if (xVar.i(16) <= 2) {
                                    xVar.r(24);
                                    xVar.r(24);
                                    xVar.r(24);
                                    int i56 = xVar.i(i28) + i53;
                                    int i57 = 8;
                                    xVar.r(8);
                                    int[] iArr3 = new int[i56];
                                    for (int i58 = 0; i58 < i56; i58++) {
                                        int i59 = xVar.i(3);
                                        if (xVar.h()) {
                                            i10 = xVar.i(5);
                                        } else {
                                            i10 = 0;
                                        }
                                        iArr3[i58] = (i10 * 8) + i59;
                                    }
                                    int i60 = 0;
                                    while (i60 < i56) {
                                        int i61 = 0;
                                        while (i61 < i57) {
                                            if ((iArr3[i60] & (1 << i61)) != 0) {
                                                xVar.r(i57);
                                            }
                                            i61++;
                                            i57 = 8;
                                        }
                                        i60++;
                                        i57 = 8;
                                    }
                                    i55++;
                                    i28 = 6;
                                    i53 = 1;
                                } else {
                                    throw ParserException.a("residueType greater than 2 is not decodable", null);
                                }
                            }
                            int i62 = xVar.i(i28) + 1;
                            for (int i63 = 0; i63 < i62; i63++) {
                                int i64 = xVar.i(16);
                                if (i64 != 0) {
                                    StringBuilder sb5 = new StringBuilder(52);
                                    sb5.append("mapping type other than 0 not supported: ");
                                    sb5.append(i64);
                                    Log.e("VorbisUtil", sb5.toString());
                                } else {
                                    if (xVar.h()) {
                                        i6 = xVar.i(4) + 1;
                                    } else {
                                        i6 = 1;
                                    }
                                    boolean h12 = xVar.h();
                                    int i65 = cVar.f33930a;
                                    if (h12) {
                                        int i66 = xVar.i(8) + 1;
                                        for (int i67 = 0; i67 < i66; i67++) {
                                            int i68 = i65 - 1;
                                            int i69 = 0;
                                            for (int i70 = i68; i70 > 0; i70 >>>= 1) {
                                                i69++;
                                            }
                                            xVar.r(i69);
                                            int i71 = 0;
                                            while (i68 > 0) {
                                                i71++;
                                                i68 >>>= 1;
                                            }
                                            xVar.r(i71);
                                        }
                                    }
                                    if (xVar.i(2) == 0) {
                                        if (i6 > 1) {
                                            for (int i72 = 0; i72 < i65; i72++) {
                                                xVar.r(4);
                                            }
                                        }
                                        for (int i73 = 0; i73 < i6; i73++) {
                                            xVar.r(8);
                                            xVar.r(8);
                                            xVar.r(8);
                                        }
                                    } else {
                                        throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                                    }
                                }
                            }
                            int i74 = xVar.i(6) + 1;
                            y.b[] bVarArr = new y.b[i74];
                            for (int i75 = 0; i75 < i74; i75++) {
                                boolean h13 = xVar.h();
                                xVar.i(16);
                                xVar.i(16);
                                xVar.i(8);
                                bVarArr[i75] = new y.b(h13);
                            }
                            if (xVar.h()) {
                                int i76 = 0;
                                for (int i77 = i74 - 1; i77 > 0; i77 >>>= 1) {
                                    i76++;
                                }
                                aVar2 = new a(cVar, bArr3, bVarArr, i76);
                            } else {
                                throw ParserException.a("framing bit after modes not set as expected", null);
                            }
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.f5118n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y.c cVar2 = aVar2.f5122a;
        arrayList.add(cVar2.f33935g);
        arrayList.add(aVar2.f5123b);
        n.a aVar3 = new n.a();
        aVar3.f6665k = "audio/vorbis";
        aVar3.f = cVar2.f33933d;
        aVar3.f6661g = cVar2.f33932c;
        aVar3.f6677x = cVar2.f33930a;
        aVar3.f6678y = cVar2.f33931b;
        aVar3.f6667m = arrayList;
        aVar.f5116a = new n(aVar3);
        return true;
    }

    @Override // c8.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f5118n = null;
            this.f5121q = null;
            this.r = null;
        }
        this.f5119o = 0;
        this.f5120p = false;
    }
}
