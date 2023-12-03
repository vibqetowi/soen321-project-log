package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.Arrays;
/* compiled from: DtsReader.java */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: b  reason: collision with root package name */
    public final String f12389b;

    /* renamed from: c  reason: collision with root package name */
    public String f12390c;

    /* renamed from: d  reason: collision with root package name */
    public u7.v f12391d;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12393g;

    /* renamed from: h  reason: collision with root package name */
    public long f12394h;

    /* renamed from: i  reason: collision with root package name */
    public com.google.android.exoplayer2.n f12395i;

    /* renamed from: j  reason: collision with root package name */
    public int f12396j;

    /* renamed from: a  reason: collision with root package name */
    public final c9.q f12388a = new c9.q(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    public int f12392e = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f12397k = -9223372036854775807L;

    public h(String str) {
        this.f12389b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        boolean z10;
        int i6;
        int i10;
        byte b10;
        boolean z11;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        byte b13;
        boolean z12;
        u7.x xVar;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        sc.b.E(this.f12391d);
        while (true) {
            int i19 = qVar.f5188c - qVar.f5187b;
            if (i19 > 0) {
                int i20 = this.f12392e;
                int i21 = 8;
                int i22 = 2;
                c9.q qVar2 = this.f12388a;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            int min = Math.min(i19, this.f12396j - this.f);
                            this.f12391d.a(min, qVar);
                            int i23 = this.f + min;
                            this.f = i23;
                            int i24 = this.f12396j;
                            if (i23 == i24) {
                                long j10 = this.f12397k;
                                if (j10 != -9223372036854775807L) {
                                    this.f12391d.d(j10, 1, i24, 0, null);
                                    this.f12397k += this.f12394h;
                                }
                                this.f12392e = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        byte[] bArr = qVar2.f5186a;
                        int min2 = Math.min(i19, 18 - this.f);
                        qVar.b(this.f, bArr, min2);
                        int i25 = this.f + min2;
                        this.f = i25;
                        if (i25 == 18) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            byte[] bArr2 = qVar2.f5186a;
                            if (this.f12395i == null) {
                                String str = this.f12390c;
                                if (bArr2[0] == Byte.MAX_VALUE) {
                                    xVar = new u7.x(bArr2, 1, 0);
                                } else {
                                    byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                                    byte b14 = copyOf[0];
                                    if (b14 != -2 && b14 != -1) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        for (int i26 = 0; i26 < copyOf.length - 1; i26 += 2) {
                                            byte b15 = copyOf[i26];
                                            int i27 = i26 + 1;
                                            copyOf[i26] = copyOf[i27];
                                            copyOf[i27] = b15;
                                        }
                                    }
                                    u7.x xVar2 = new u7.x(copyOf, 1, 0);
                                    if (copyOf[0] == 31) {
                                        u7.x xVar3 = new u7.x(copyOf, 1, 0);
                                        while (xVar3.b() >= 16) {
                                            xVar3.r(i22);
                                            int i28 = xVar3.i(14) & 16383;
                                            int min3 = Math.min(8 - xVar2.f33926d, 14);
                                            int i29 = xVar2.f33926d;
                                            int i30 = (8 - i29) - min3;
                                            byte[] bArr3 = xVar2.f33924b;
                                            int i31 = xVar2.f33925c;
                                            byte b16 = (byte) (((65280 >> i29) | ((1 << i30) - 1)) & bArr3[i31]);
                                            bArr3[i31] = b16;
                                            int i32 = 14 - min3;
                                            bArr3[i31] = (byte) (b16 | ((i28 >>> i32) << i30));
                                            int i33 = i31 + 1;
                                            while (i32 > i21) {
                                                i32 -= 8;
                                                xVar2.f33924b[i33] = (byte) (i28 >>> i32);
                                                i33++;
                                                i21 = 8;
                                            }
                                            byte[] bArr4 = xVar2.f33924b;
                                            byte b17 = (byte) (bArr4[i33] & ((1 << i15) - 1));
                                            bArr4[i33] = b17;
                                            bArr4[i33] = (byte) (((i28 & ((1 << i32) - 1)) << (8 - i32)) | b17);
                                            xVar2.r(14);
                                            xVar2.a();
                                            i21 = 8;
                                            i22 = 2;
                                        }
                                    }
                                    xVar2.n(copyOf, copyOf.length);
                                    xVar = xVar2;
                                }
                                xVar.r(60);
                                int i34 = q7.o.f29290a[xVar.i(6)];
                                int i35 = q7.o.f29291b[xVar.i(4)];
                                int i36 = xVar.i(5);
                                if (i36 >= 29) {
                                    i17 = -1;
                                    i16 = 2;
                                } else {
                                    i16 = 2;
                                    i17 = (q7.o.f29292c[i36] * 1000) / 2;
                                }
                                xVar.r(10);
                                if (xVar.i(i16) > 0) {
                                    i18 = 1;
                                } else {
                                    i18 = 0;
                                }
                                int i37 = i34 + i18;
                                n.a aVar = new n.a();
                                aVar.f6656a = str;
                                aVar.f6665k = "audio/vnd.dts";
                                aVar.f = i17;
                                aVar.f6677x = i37;
                                aVar.f6678y = i35;
                                aVar.f6668n = null;
                                aVar.f6658c = this.f12389b;
                                com.google.android.exoplayer2.n nVar = new com.google.android.exoplayer2.n(aVar);
                                this.f12395i = nVar;
                                this.f12391d.e(nVar);
                            }
                            byte b18 = bArr2[0];
                            if (b18 != -2) {
                                if (b18 != -1) {
                                    if (b18 != 31) {
                                        i6 = 4;
                                        i10 = ((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4);
                                        b10 = bArr2[7];
                                    } else {
                                        i14 = ((3 & bArr2[6]) << 12) | ((bArr2[7] & 255) << 4);
                                        b13 = bArr2[8];
                                    }
                                } else {
                                    i14 = ((3 & bArr2[7]) << 12) | ((bArr2[6] & 255) << 4);
                                    b13 = bArr2[9];
                                }
                                i11 = (i14 | ((b13 & 60) >> 2)) + 1;
                                z11 = true;
                                if (z11) {
                                    i11 = (i11 * 16) / 14;
                                }
                                this.f12396j = i11;
                                if (b18 == -2) {
                                    if (b18 != -1) {
                                        if (b18 != 31) {
                                            i12 = (bArr2[4] & 1) << 6;
                                            b11 = bArr2[5];
                                        } else {
                                            i12 = (7 & bArr2[5]) << 4;
                                            b12 = bArr2[6];
                                        }
                                    } else {
                                        b12 = bArr2[7];
                                        i12 = (bArr2[4] & 7) << 4;
                                    }
                                    i13 = b12 & 60;
                                    this.f12394h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.f12395i.T);
                                    qVar2.A(0);
                                    this.f12391d.a(18, qVar2);
                                    this.f12392e = 2;
                                } else {
                                    i12 = (bArr2[5] & 1) << 6;
                                    b11 = bArr2[4];
                                }
                                i13 = b11 & 252;
                                this.f12394h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.f12395i.T);
                                qVar2.A(0);
                                this.f12391d.a(18, qVar2);
                                this.f12392e = 2;
                            } else {
                                i6 = 4;
                                i10 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b10 = bArr2[6];
                            }
                            i11 = (i10 | ((b10 & 240) >> i6)) + 1;
                            z11 = false;
                            if (z11) {
                            }
                            this.f12396j = i11;
                            if (b18 == -2) {
                            }
                            i13 = b11 & 252;
                            this.f12394h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.f12395i.T);
                            qVar2.A(0);
                            this.f12391d.a(18, qVar2);
                            this.f12392e = 2;
                        }
                    }
                } else {
                    while (true) {
                        if (qVar.f5188c - qVar.f5187b > 0) {
                            int i38 = this.f12393g << 8;
                            this.f12393g = i38;
                            int q10 = i38 | qVar.q();
                            this.f12393g = q10;
                            if (q10 != 2147385345 && q10 != -25230976 && q10 != 536864768 && q10 != -14745368) {
                                z14 = false;
                                continue;
                            } else {
                                z14 = true;
                                continue;
                            }
                            if (z14) {
                                byte[] bArr5 = qVar2.f5186a;
                                bArr5[0] = (byte) ((q10 >> 24) & 255);
                                bArr5[1] = (byte) ((q10 >> 16) & 255);
                                bArr5[2] = (byte) ((q10 >> 8) & 255);
                                bArr5[3] = (byte) (q10 & 255);
                                this.f = 4;
                                this.f12393g = 0;
                                z13 = true;
                                break;
                            }
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (z13) {
                        this.f12392e = 1;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // d8.j
    public final void c() {
        this.f12392e = 0;
        this.f = 0;
        this.f12393g = 0;
        this.f12397k = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12390c = dVar.f12352e;
        dVar.b();
        this.f12391d = jVar.n(dVar.f12351d, 1);
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12397k = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
