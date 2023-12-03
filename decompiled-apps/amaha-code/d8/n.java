package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.Collections;
/* compiled from: H265Reader.java */
/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final z f12492a;

    /* renamed from: b  reason: collision with root package name */
    public String f12493b;

    /* renamed from: c  reason: collision with root package name */
    public u7.v f12494c;

    /* renamed from: d  reason: collision with root package name */
    public a f12495d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12496e;

    /* renamed from: l  reason: collision with root package name */
    public long f12502l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final r f12497g = new r(32);

    /* renamed from: h  reason: collision with root package name */
    public final r f12498h = new r(33);

    /* renamed from: i  reason: collision with root package name */
    public final r f12499i = new r(34);

    /* renamed from: j  reason: collision with root package name */
    public final r f12500j = new r(39);

    /* renamed from: k  reason: collision with root package name */
    public final r f12501k = new r(40);

    /* renamed from: m  reason: collision with root package name */
    public long f12503m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final c9.q f12504n = new c9.q();

    /* compiled from: H265Reader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final u7.v f12505a;

        /* renamed from: b  reason: collision with root package name */
        public long f12506b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12507c;

        /* renamed from: d  reason: collision with root package name */
        public int f12508d;

        /* renamed from: e  reason: collision with root package name */
        public long f12509e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12510g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12511h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12512i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12513j;

        /* renamed from: k  reason: collision with root package name */
        public long f12514k;

        /* renamed from: l  reason: collision with root package name */
        public long f12515l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12516m;

        public a(u7.v vVar) {
            this.f12505a = vVar;
        }
    }

    public n(z zVar) {
        this.f12492a = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        int i6;
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        boolean z10;
        r rVar;
        long j10;
        r rVar2;
        r rVar3;
        int i13;
        long j11;
        int i14;
        boolean b10;
        long j12;
        r rVar4;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        long j13;
        int i18;
        int i19;
        int i20;
        c9.q qVar2 = qVar;
        sc.b.E(this.f12494c);
        int i21 = c9.w.f5205a;
        while (true) {
            int i22 = qVar2.f5188c;
            int i23 = qVar2.f5187b;
            int i24 = i22 - i23;
            if (i24 > 0) {
                byte[] bArr2 = qVar2.f5186a;
                this.f12502l += i24;
                this.f12494c.a(i24, qVar2);
                while (i23 < i22) {
                    int b11 = c9.m.b(bArr2, i23, i22, this.f);
                    if (b11 == i22) {
                        b(i23, bArr2, i22);
                        return;
                    }
                    int i25 = b11 + 3;
                    int i26 = (bArr2[i25] & 126) >> 1;
                    int i27 = b11 - i23;
                    if (i27 > 0) {
                        b(i23, bArr2, b11);
                    }
                    int i28 = i22 - b11;
                    long j14 = this.f12502l - i28;
                    if (i27 < 0) {
                        i6 = -i27;
                    } else {
                        i6 = 0;
                    }
                    long j15 = this.f12503m;
                    a aVar = this.f12495d;
                    boolean z15 = this.f12496e;
                    if (aVar.f12513j && aVar.f12510g) {
                        aVar.f12516m = aVar.f12507c;
                        aVar.f12513j = false;
                    } else if (aVar.f12511h || aVar.f12510g) {
                        if (z15 && aVar.f12512i) {
                            i10 = i22;
                            long j16 = aVar.f12506b;
                            bArr = bArr2;
                            i11 = i25;
                            int i29 = ((int) (j14 - j16)) + i28;
                            long j17 = aVar.f12515l;
                            if (j17 != -9223372036854775807L) {
                                i12 = i28;
                                aVar.f12505a.d(j17, aVar.f12516m ? 1 : 0, (int) (j16 - aVar.f12514k), i29, null);
                                aVar.f12514k = aVar.f12506b;
                                aVar.f12515l = aVar.f12509e;
                                aVar.f12516m = aVar.f12507c;
                                aVar.f12512i = true;
                                z10 = this.f12496e;
                                r rVar5 = this.f12499i;
                                r rVar6 = this.f12498h;
                                r rVar7 = this.f12497g;
                                if (!z10) {
                                    rVar7.b(i6);
                                    rVar6.b(i6);
                                    rVar5.b(i6);
                                    if (rVar7.f12554c && rVar6.f12554c && rVar5.f12554c) {
                                        u7.v vVar = this.f12494c;
                                        String str = this.f12493b;
                                        int i30 = rVar7.f12556e;
                                        byte[] bArr3 = new byte[rVar6.f12556e + i30 + rVar5.f12556e];
                                        i14 = i12;
                                        System.arraycopy(rVar7.f12555d, 0, bArr3, 0, i30);
                                        i13 = i26;
                                        System.arraycopy(rVar6.f12555d, 0, bArr3, rVar7.f12556e, rVar6.f12556e);
                                        System.arraycopy(rVar5.f12555d, 0, bArr3, rVar7.f12556e + rVar6.f12556e, rVar5.f12556e);
                                        u7.x xVar = new u7.x(0, rVar6.f12555d, rVar6.f12556e);
                                        xVar.r(44);
                                        int i31 = xVar.i(3);
                                        xVar.q();
                                        int i32 = xVar.i(2);
                                        boolean h10 = xVar.h();
                                        int i33 = xVar.i(5);
                                        int i34 = 0;
                                        int i35 = 0;
                                        for (int i36 = 32; i34 < i36; i36 = 32) {
                                            if (xVar.h()) {
                                                i35 |= 1 << i34;
                                            }
                                            i34++;
                                        }
                                        int[] iArr = new int[6];
                                        rVar = rVar5;
                                        rVar2 = rVar6;
                                        for (int i37 = 0; i37 < 6; i37++) {
                                            iArr[i37] = xVar.i(8);
                                        }
                                        int i38 = xVar.i(8);
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < i31; i40++) {
                                            if (xVar.h()) {
                                                i39 += 89;
                                            }
                                            if (xVar.h()) {
                                                i39 += 8;
                                            }
                                        }
                                        xVar.r(i39);
                                        if (i31 > 0) {
                                            xVar.r((8 - i31) * 2);
                                        }
                                        xVar.l();
                                        int l2 = xVar.l();
                                        if (l2 == 3) {
                                            xVar.q();
                                        }
                                        int l10 = xVar.l();
                                        int l11 = xVar.l();
                                        if (xVar.h()) {
                                            int l12 = xVar.l();
                                            int l13 = xVar.l();
                                            int l14 = xVar.l();
                                            int l15 = xVar.l();
                                            rVar3 = rVar7;
                                            if (l2 != 1 && l2 != 2) {
                                                i19 = 1;
                                            } else {
                                                i19 = 2;
                                            }
                                            j10 = j14;
                                            if (l2 == 1) {
                                                i20 = 2;
                                            } else {
                                                i20 = 1;
                                            }
                                            l10 -= (l12 + l13) * i19;
                                            l11 -= (l14 + l15) * i20;
                                        } else {
                                            j10 = j14;
                                            rVar3 = rVar7;
                                        }
                                        xVar.l();
                                        xVar.l();
                                        int l16 = xVar.l();
                                        if (xVar.h()) {
                                            i16 = 0;
                                        } else {
                                            i16 = i31;
                                        }
                                        while (i16 <= i31) {
                                            xVar.l();
                                            xVar.l();
                                            xVar.l();
                                            i16++;
                                        }
                                        xVar.l();
                                        xVar.l();
                                        xVar.l();
                                        xVar.l();
                                        xVar.l();
                                        xVar.l();
                                        if (xVar.h() && xVar.h()) {
                                            int i41 = 0;
                                            for (int i42 = 4; i41 < i42; i42 = 4) {
                                                int i43 = 6;
                                                int i44 = 0;
                                                while (i44 < i43) {
                                                    if (!xVar.h()) {
                                                        xVar.l();
                                                        j13 = j15;
                                                    } else {
                                                        j13 = j15;
                                                        int min = Math.min(64, 1 << ((i41 << 1) + 4));
                                                        if (i41 > 1) {
                                                            xVar.m();
                                                        }
                                                        for (int i45 = 0; i45 < min; i45++) {
                                                            xVar.m();
                                                        }
                                                    }
                                                    if (i41 == 3) {
                                                        i18 = 3;
                                                    } else {
                                                        i18 = 1;
                                                    }
                                                    i44 += i18;
                                                    i43 = 6;
                                                    j15 = j13;
                                                }
                                                i41++;
                                            }
                                        }
                                        j11 = j15;
                                        xVar.r(2);
                                        if (xVar.h()) {
                                            xVar.r(8);
                                            xVar.l();
                                            xVar.l();
                                            xVar.q();
                                        }
                                        int l17 = xVar.l();
                                        boolean z16 = false;
                                        int i46 = 0;
                                        int i47 = 0;
                                        while (i46 < l17) {
                                            if (i46 != 0) {
                                                z16 = xVar.h();
                                            }
                                            if (z16) {
                                                xVar.q();
                                                xVar.l();
                                                for (int i48 = 0; i48 <= i47; i48++) {
                                                    if (xVar.h()) {
                                                        xVar.q();
                                                    }
                                                }
                                                i17 = l17;
                                            } else {
                                                int l18 = xVar.l();
                                                int l19 = xVar.l();
                                                int i49 = l18 + l19;
                                                i17 = l17;
                                                for (int i50 = 0; i50 < l18; i50++) {
                                                    xVar.l();
                                                    xVar.q();
                                                }
                                                for (int i51 = 0; i51 < l19; i51++) {
                                                    xVar.l();
                                                    xVar.q();
                                                }
                                                i47 = i49;
                                            }
                                            i46++;
                                            l17 = i17;
                                        }
                                        if (xVar.h()) {
                                            for (int i52 = 0; i52 < xVar.l(); i52++) {
                                                xVar.r(l16 + 4 + 1);
                                            }
                                        }
                                        xVar.r(2);
                                        float f = 1.0f;
                                        if (xVar.h()) {
                                            if (xVar.h()) {
                                                int i53 = xVar.i(8);
                                                if (i53 == 255) {
                                                    int i54 = xVar.i(16);
                                                    int i55 = xVar.i(16);
                                                    if (i54 != 0 && i55 != 0) {
                                                        f = i54 / i55;
                                                    }
                                                } else {
                                                    float[] fArr = c9.m.f5156b;
                                                    if (i53 < 17) {
                                                        f = fArr[i53];
                                                    } else {
                                                        defpackage.d.k(46, "Unexpected aspect_ratio_idc value: ", i53, "H265Reader");
                                                    }
                                                }
                                            }
                                            if (xVar.h()) {
                                                xVar.q();
                                            }
                                            if (xVar.h()) {
                                                xVar.r(4);
                                                if (xVar.h()) {
                                                    xVar.r(24);
                                                }
                                            }
                                            if (xVar.h()) {
                                                xVar.l();
                                                xVar.l();
                                            }
                                            xVar.q();
                                            if (xVar.h()) {
                                                l11 *= 2;
                                            }
                                        }
                                        String h11 = kotlin.jvm.internal.h.h(i32, h10, i33, i35, iArr, i38);
                                        n.a aVar2 = new n.a();
                                        aVar2.f6656a = str;
                                        aVar2.f6665k = "video/hevc";
                                        aVar2.f6662h = h11;
                                        aVar2.f6670p = l10;
                                        aVar2.f6671q = l11;
                                        aVar2.f6673t = f;
                                        aVar2.f6667m = Collections.singletonList(bArr3);
                                        vVar.e(new com.google.android.exoplayer2.n(aVar2));
                                        this.f12496e = true;
                                        r rVar8 = this.f12500j;
                                        b10 = rVar8.b(i6);
                                        z zVar = this.f12492a;
                                        c9.q qVar3 = this.f12504n;
                                        if (!b10) {
                                            qVar3.y(rVar8.f12555d, c9.m.e(rVar8.f12555d, rVar8.f12556e));
                                            qVar3.B(5);
                                            j12 = j11;
                                            u7.b.a(j12, qVar3, zVar.f12602b);
                                        } else {
                                            j12 = j11;
                                        }
                                        rVar4 = this.f12501k;
                                        if (rVar4.b(i6)) {
                                            qVar3.y(rVar4.f12555d, c9.m.e(rVar4.f12555d, rVar4.f12556e));
                                            qVar3.B(5);
                                            u7.b.a(j12, qVar3, zVar.f12602b);
                                        }
                                        long j18 = this.f12503m;
                                        a aVar3 = this.f12495d;
                                        boolean z17 = this.f12496e;
                                        aVar3.f12510g = false;
                                        aVar3.f12511h = false;
                                        aVar3.f12509e = j18;
                                        aVar3.f12508d = 0;
                                        long j19 = j10;
                                        aVar3.f12506b = j19;
                                        i15 = i13;
                                        if (i15 < 32 && i15 != 40) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (aVar3.f12512i && !aVar3.f12513j) {
                                                if (z17) {
                                                    long j20 = aVar3.f12515l;
                                                    if (j20 != -9223372036854775807L) {
                                                        boolean z18 = aVar3.f12516m;
                                                        int i56 = (int) (j19 - aVar3.f12514k);
                                                        z12 = false;
                                                        aVar3.f12505a.d(j20, z18 ? 1 : 0, i56, i14, null);
                                                        aVar3.f12512i = z12;
                                                    }
                                                }
                                                z12 = false;
                                                aVar3.f12512i = z12;
                                            } else {
                                                z12 = false;
                                            }
                                            if ((32 <= i15 && i15 <= 35) || i15 == 39) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                aVar3.f12511h = !aVar3.f12513j;
                                                aVar3.f12513j = true;
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        if (i15 < 16 && i15 <= 21) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        aVar3.f12507c = z13;
                                        aVar3.f = (!z13 || i15 <= 9) ? true : true;
                                        if (this.f12496e) {
                                            rVar3.d(i15);
                                            rVar2.d(i15);
                                            rVar.d(i15);
                                        }
                                        rVar8.d(i15);
                                        rVar4.d(i15);
                                        i22 = i10;
                                        bArr2 = bArr;
                                        i23 = i11;
                                    }
                                }
                                rVar = rVar5;
                                j10 = j14;
                                rVar2 = rVar6;
                                rVar3 = rVar7;
                                i13 = i26;
                                j11 = j15;
                                i14 = i12;
                                r rVar82 = this.f12500j;
                                b10 = rVar82.b(i6);
                                z zVar2 = this.f12492a;
                                c9.q qVar32 = this.f12504n;
                                if (!b10) {
                                }
                                rVar4 = this.f12501k;
                                if (rVar4.b(i6)) {
                                }
                                long j182 = this.f12503m;
                                a aVar32 = this.f12495d;
                                boolean z172 = this.f12496e;
                                aVar32.f12510g = false;
                                aVar32.f12511h = false;
                                aVar32.f12509e = j182;
                                aVar32.f12508d = 0;
                                long j192 = j10;
                                aVar32.f12506b = j192;
                                i15 = i13;
                                if (i15 < 32) {
                                }
                                z11 = true;
                                if (z11) {
                                }
                                if (i15 < 16) {
                                }
                                z13 = false;
                                aVar32.f12507c = z13;
                                aVar32.f = (!z13 || i15 <= 9) ? true : true;
                                if (this.f12496e) {
                                }
                                rVar82.d(i15);
                                rVar4.d(i15);
                                i22 = i10;
                                bArr2 = bArr;
                                i23 = i11;
                            }
                        } else {
                            i10 = i22;
                            bArr = bArr2;
                            i11 = i25;
                        }
                        i12 = i28;
                        aVar.f12514k = aVar.f12506b;
                        aVar.f12515l = aVar.f12509e;
                        aVar.f12516m = aVar.f12507c;
                        aVar.f12512i = true;
                        z10 = this.f12496e;
                        r rVar52 = this.f12499i;
                        r rVar62 = this.f12498h;
                        r rVar72 = this.f12497g;
                        if (!z10) {
                        }
                        rVar = rVar52;
                        j10 = j14;
                        rVar2 = rVar62;
                        rVar3 = rVar72;
                        i13 = i26;
                        j11 = j15;
                        i14 = i12;
                        r rVar822 = this.f12500j;
                        b10 = rVar822.b(i6);
                        z zVar22 = this.f12492a;
                        c9.q qVar322 = this.f12504n;
                        if (!b10) {
                        }
                        rVar4 = this.f12501k;
                        if (rVar4.b(i6)) {
                        }
                        long j1822 = this.f12503m;
                        a aVar322 = this.f12495d;
                        boolean z1722 = this.f12496e;
                        aVar322.f12510g = false;
                        aVar322.f12511h = false;
                        aVar322.f12509e = j1822;
                        aVar322.f12508d = 0;
                        long j1922 = j10;
                        aVar322.f12506b = j1922;
                        i15 = i13;
                        if (i15 < 32) {
                        }
                        z11 = true;
                        if (z11) {
                        }
                        if (i15 < 16) {
                        }
                        z13 = false;
                        aVar322.f12507c = z13;
                        aVar322.f = (!z13 || i15 <= 9) ? true : true;
                        if (this.f12496e) {
                        }
                        rVar822.d(i15);
                        rVar4.d(i15);
                        i22 = i10;
                        bArr2 = bArr;
                        i23 = i11;
                    }
                    i10 = i22;
                    bArr = bArr2;
                    i11 = i25;
                    i12 = i28;
                    z10 = this.f12496e;
                    r rVar522 = this.f12499i;
                    r rVar622 = this.f12498h;
                    r rVar722 = this.f12497g;
                    if (!z10) {
                    }
                    rVar = rVar522;
                    j10 = j14;
                    rVar2 = rVar622;
                    rVar3 = rVar722;
                    i13 = i26;
                    j11 = j15;
                    i14 = i12;
                    r rVar8222 = this.f12500j;
                    b10 = rVar8222.b(i6);
                    z zVar222 = this.f12492a;
                    c9.q qVar3222 = this.f12504n;
                    if (!b10) {
                    }
                    rVar4 = this.f12501k;
                    if (rVar4.b(i6)) {
                    }
                    long j18222 = this.f12503m;
                    a aVar3222 = this.f12495d;
                    boolean z17222 = this.f12496e;
                    aVar3222.f12510g = false;
                    aVar3222.f12511h = false;
                    aVar3222.f12509e = j18222;
                    aVar3222.f12508d = 0;
                    long j19222 = j10;
                    aVar3222.f12506b = j19222;
                    i15 = i13;
                    if (i15 < 32) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                    if (i15 < 16) {
                    }
                    z13 = false;
                    aVar3222.f12507c = z13;
                    aVar3222.f = (!z13 || i15 <= 9) ? true : true;
                    if (this.f12496e) {
                    }
                    rVar8222.d(i15);
                    rVar4.d(i15);
                    i22 = i10;
                    bArr2 = bArr;
                    i23 = i11;
                }
                qVar2 = qVar;
            } else {
                return;
            }
        }
    }

    public final void b(int i6, byte[] bArr, int i10) {
        boolean z10;
        a aVar = this.f12495d;
        if (aVar.f) {
            int i11 = aVar.f12508d;
            int i12 = (i6 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.f12510g = z10;
                aVar.f = false;
            } else {
                aVar.f12508d = (i10 - i6) + i11;
            }
        }
        if (!this.f12496e) {
            this.f12497g.a(i6, bArr, i10);
            this.f12498h.a(i6, bArr, i10);
            this.f12499i.a(i6, bArr, i10);
        }
        this.f12500j.a(i6, bArr, i10);
        this.f12501k.a(i6, bArr, i10);
    }

    @Override // d8.j
    public final void c() {
        this.f12502l = 0L;
        this.f12503m = -9223372036854775807L;
        c9.m.a(this.f);
        this.f12497g.c();
        this.f12498h.c();
        this.f12499i.c();
        this.f12500j.c();
        this.f12501k.c();
        a aVar = this.f12495d;
        if (aVar != null) {
            aVar.f = false;
            aVar.f12510g = false;
            aVar.f12511h = false;
            aVar.f12512i = false;
            aVar.f12513j = false;
        }
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12493b = dVar.f12352e;
        dVar.b();
        u7.v n10 = jVar.n(dVar.f12351d, 2);
        this.f12494c = n10;
        this.f12495d = new a(n10);
        this.f12492a.a(jVar, dVar);
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12503m = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
