package d8;

import android.util.Log;
import com.appsflyer.R;
import com.google.android.exoplayer2.n;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.utils.Constants;
import d8.d0;
import java.util.Arrays;
import java.util.Collections;
import q7.a;
/* compiled from: AdtsReader.java */
/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f12366v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12367a;

    /* renamed from: d  reason: collision with root package name */
    public final String f12370d;

    /* renamed from: e  reason: collision with root package name */
    public String f12371e;
    public u7.v f;

    /* renamed from: g  reason: collision with root package name */
    public u7.v f12372g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12376k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12377l;

    /* renamed from: o  reason: collision with root package name */
    public int f12380o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12381p;
    public int r;

    /* renamed from: t  reason: collision with root package name */
    public u7.v f12384t;

    /* renamed from: u  reason: collision with root package name */
    public long f12385u;

    /* renamed from: b  reason: collision with root package name */
    public final u7.x f12368b = new u7.x(new byte[7], 1, 0);

    /* renamed from: c  reason: collision with root package name */
    public final c9.q f12369c = new c9.q(Arrays.copyOf(f12366v, 10));

    /* renamed from: h  reason: collision with root package name */
    public int f12373h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f12374i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f12375j = 256;

    /* renamed from: m  reason: collision with root package name */
    public int f12378m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f12379n = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f12382q = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f12383s = -9223372036854775807L;

    public f(boolean z10, String str) {
        this.f12367a = z10;
        this.f12370d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x025d, code lost:
        if (((r5 & 8) >> 3) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027a, code lost:
        if (r5[r10] != 51) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0281 A[EDGE_INSN: B:174:0x0281->B:125:0x0281 ?: BREAK  , SYNTHETIC] */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.f.getClass();
        int i13 = c9.w.f5205a;
        while (true) {
            int i14 = qVar.f5188c;
            int i15 = qVar.f5187b;
            int i16 = i14 - i15;
            if (i16 > 0) {
                int i17 = this.f12373h;
                int i18 = 13;
                int i19 = 4;
                c9.q qVar2 = this.f12369c;
                u7.x xVar = this.f12368b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 == 4) {
                                    int min = Math.min(i16, this.r - this.f12374i);
                                    this.f12384t.a(min, qVar);
                                    int i20 = this.f12374i + min;
                                    this.f12374i = i20;
                                    int i21 = this.r;
                                    if (i20 == i21) {
                                        long j10 = this.f12383s;
                                        if (j10 != -9223372036854775807L) {
                                            this.f12384t.d(j10, 1, i21, 0, null);
                                            this.f12383s += this.f12385u;
                                        }
                                        this.f12373h = 0;
                                        this.f12374i = 0;
                                        this.f12375j = 256;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                if (this.f12376k) {
                                    i6 = 7;
                                } else {
                                    i6 = 5;
                                }
                                if (b(i6, qVar, xVar.f33924b)) {
                                    xVar.o(0);
                                    if (!this.f12381p) {
                                        int i22 = xVar.i(2) + 1;
                                        if (i22 != 2) {
                                            StringBuilder sb2 = new StringBuilder(61);
                                            sb2.append("Detected audio object type: ");
                                            sb2.append(i22);
                                            sb2.append(", but assuming AAC LC.");
                                            Log.w("AdtsReader", sb2.toString());
                                            i22 = 2;
                                        }
                                        xVar.r(5);
                                        int i23 = xVar.i(3);
                                        int i24 = this.f12379n;
                                        byte[] bArr = {(byte) (((i22 << 3) & 248) | ((i24 >> 1) & 7)), (byte) (((i24 << 7) & 128) | ((i23 << 3) & R.styleable.AppCompatTheme_windowFixedHeightMajor))};
                                        a.C0493a c10 = q7.a.c(bArr);
                                        n.a aVar = new n.a();
                                        aVar.f6656a = this.f12371e;
                                        aVar.f6665k = "audio/mp4a-latm";
                                        aVar.f6662h = c10.f29232c;
                                        aVar.f6677x = c10.f29231b;
                                        aVar.f6678y = c10.f29230a;
                                        aVar.f6667m = Collections.singletonList(bArr);
                                        aVar.f6658c = this.f12370d;
                                        com.google.android.exoplayer2.n nVar = new com.google.android.exoplayer2.n(aVar);
                                        this.f12382q = 1024000000 / nVar.T;
                                        this.f.e(nVar);
                                        this.f12381p = true;
                                    } else {
                                        xVar.r(10);
                                    }
                                    xVar.r(4);
                                    int i25 = (xVar.i(13) - 2) - 5;
                                    if (this.f12376k) {
                                        i25 -= 2;
                                    }
                                    u7.v vVar = this.f;
                                    long j11 = this.f12382q;
                                    this.f12373h = 4;
                                    this.f12374i = 0;
                                    this.f12384t = vVar;
                                    this.f12385u = j11;
                                    this.r = i25;
                                }
                            }
                        } else if (b(10, qVar, qVar2.f5186a)) {
                            this.f12372g.a(10, qVar2);
                            qVar2.A(6);
                            u7.v vVar2 = this.f12372g;
                            this.f12373h = 4;
                            this.f12374i = 10;
                            this.f12384t = vVar2;
                            this.f12385u = 0L;
                            this.r = qVar2.p() + 10;
                        }
                    } else if (i16 != 0) {
                        xVar.f33924b[0] = qVar.f5186a[i15];
                        xVar.o(2);
                        int i26 = xVar.i(4);
                        int i27 = this.f12379n;
                        if (i27 != -1 && i26 != i27) {
                            this.f12377l = false;
                            this.f12373h = 0;
                            this.f12374i = 0;
                            this.f12375j = 256;
                        } else {
                            if (!this.f12377l) {
                                this.f12377l = true;
                                this.f12378m = this.f12380o;
                                this.f12379n = i26;
                            }
                            this.f12373h = 3;
                            this.f12374i = 0;
                        }
                    }
                } else {
                    byte[] bArr2 = qVar.f5186a;
                    while (true) {
                        if (i15 < i14) {
                            i10 = i15 + 1;
                            i11 = bArr2[i15] & 255;
                            if (this.f12375j == 512) {
                                if ((((((byte) i11) & 255) | 65280) & 65526) == 65520) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (this.f12377l) {
                                        break;
                                    }
                                    int i28 = i10 - 2;
                                    qVar.A(i28 + 1);
                                    byte[] bArr3 = xVar.f33924b;
                                    if (qVar.f5188c - qVar.f5187b < 1) {
                                        z12 = false;
                                    } else {
                                        qVar.b(0, bArr3, 1);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        xVar.o(i19);
                                        int i29 = xVar.i(1);
                                        int i30 = this.f12378m;
                                        if (i30 == -1 || i29 == i30) {
                                            if (this.f12379n != -1) {
                                                byte[] bArr4 = xVar.f33924b;
                                                if (qVar.f5188c - qVar.f5187b < 1) {
                                                    z16 = false;
                                                } else {
                                                    qVar.b(0, bArr4, 1);
                                                    z16 = true;
                                                }
                                                if (z16) {
                                                    xVar.o(2);
                                                    if (xVar.i(i19) == this.f12379n) {
                                                        qVar.A(i28 + 2);
                                                    }
                                                }
                                                z13 = true;
                                                if (z13) {
                                                    break;
                                                }
                                                int i31 = this.f12375j;
                                                i12 = i11 | i31;
                                                if (i12 != 329) {
                                                    if (i12 != 511) {
                                                        if (i12 != 836) {
                                                            if (i12 != 1075) {
                                                                if (i31 != 256) {
                                                                    this.f12375j = 256;
                                                                    i15 = i10 - 1;
                                                                    i18 = 13;
                                                                    i19 = 4;
                                                                }
                                                            } else {
                                                                this.f12373h = 2;
                                                                this.f12374i = 3;
                                                                this.r = 0;
                                                                qVar2.A(0);
                                                                qVar.A(i10);
                                                                break;
                                                            }
                                                        } else {
                                                            this.f12375j = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                                        }
                                                    } else {
                                                        this.f12375j = 512;
                                                    }
                                                } else {
                                                    this.f12375j = ValidationPath.MAX_PATH_LENGTH_BYTES;
                                                }
                                                i15 = i10;
                                                i18 = 13;
                                                i19 = 4;
                                            }
                                            byte[] bArr5 = xVar.f33924b;
                                            if (qVar.f5188c - qVar.f5187b < i19) {
                                                z14 = false;
                                            } else {
                                                qVar.b(0, bArr5, i19);
                                                z14 = true;
                                            }
                                            if (z14) {
                                                xVar.o(14);
                                                int i32 = xVar.i(i18);
                                                if (i32 >= 7) {
                                                    byte[] bArr6 = qVar.f5186a;
                                                    int i33 = qVar.f5188c;
                                                    int i34 = i28 + i32;
                                                    if (i34 < i33) {
                                                        byte b10 = bArr6[i34];
                                                        if (b10 == -1) {
                                                            int i35 = i34 + 1;
                                                            if (i35 != i33) {
                                                                byte b11 = bArr6[i35];
                                                                if ((((b11 & 255) | 65280) & 65526) == 65520) {
                                                                    z15 = true;
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                                if (z15) {
                                                                }
                                                                z13 = false;
                                                            }
                                                            z13 = true;
                                                        } else {
                                                            if (b10 == 73) {
                                                                int i36 = i34 + 1;
                                                                if (i36 != i33) {
                                                                    if (bArr6[i36] == 68) {
                                                                        int i37 = i34 + 2;
                                                                        if (i37 != i33) {
                                                                        }
                                                                    }
                                                                }
                                                                z13 = true;
                                                            }
                                                            z13 = false;
                                                        }
                                                        if (z13) {
                                                        }
                                                        int i312 = this.f12375j;
                                                        i12 = i11 | i312;
                                                        if (i12 != 329) {
                                                        }
                                                        i15 = i10;
                                                        i18 = 13;
                                                        i19 = 4;
                                                    }
                                                }
                                            }
                                            z13 = true;
                                            if (z13) {
                                            }
                                            int i3122 = this.f12375j;
                                            i12 = i11 | i3122;
                                            if (i12 != 329) {
                                            }
                                            i15 = i10;
                                            i18 = 13;
                                            i19 = 4;
                                        }
                                    }
                                    z13 = false;
                                    if (z13) {
                                    }
                                    int i31222 = this.f12375j;
                                    i12 = i11 | i31222;
                                    if (i12 != 329) {
                                    }
                                    i15 = i10;
                                    i18 = 13;
                                    i19 = 4;
                                }
                            }
                            int i312222 = this.f12375j;
                            i12 = i11 | i312222;
                            if (i12 != 329) {
                            }
                            i15 = i10;
                            i18 = 13;
                            i19 = 4;
                        } else {
                            qVar.A(i15);
                            break;
                        }
                    }
                    this.f12380o = (i11 & 8) >> 3;
                    if ((i11 & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f12376k = z11;
                    if (!this.f12377l) {
                        this.f12373h = 1;
                        this.f12374i = 0;
                    } else {
                        this.f12373h = 3;
                        this.f12374i = 0;
                    }
                    qVar.A(i10);
                }
            } else {
                return;
            }
        }
    }

    public final boolean b(int i6, c9.q qVar, byte[] bArr) {
        int min = Math.min(qVar.f5188c - qVar.f5187b, i6 - this.f12374i);
        qVar.b(this.f12374i, bArr, min);
        int i10 = this.f12374i + min;
        this.f12374i = i10;
        if (i10 == i6) {
            return true;
        }
        return false;
    }

    @Override // d8.j
    public final void c() {
        this.f12383s = -9223372036854775807L;
        this.f12377l = false;
        this.f12373h = 0;
        this.f12374i = 0;
        this.f12375j = 256;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12371e = dVar.f12352e;
        dVar.b();
        u7.v n10 = jVar.n(dVar.f12351d, 1);
        this.f = n10;
        this.f12384t = n10;
        if (this.f12367a) {
            dVar.a();
            dVar.b();
            u7.v n11 = jVar.n(dVar.f12351d, 5);
            this.f12372g = n11;
            n.a aVar = new n.a();
            dVar.b();
            aVar.f6656a = dVar.f12352e;
            aVar.f6665k = "application/id3";
            n11.e(new com.google.android.exoplayer2.n(aVar));
            return;
        }
        this.f12372g = new u7.g();
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12383s = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
