package d8;

import android.util.Pair;
import com.appsflyer.R;
import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: H262Reader.java */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f12403q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f12404a;

    /* renamed from: b  reason: collision with root package name */
    public u7.v f12405b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f12406c;

    /* renamed from: d  reason: collision with root package name */
    public final c9.q f12407d;

    /* renamed from: e  reason: collision with root package name */
    public final r f12408e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final a f12409g = new a();

    /* renamed from: h  reason: collision with root package name */
    public long f12410h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12411i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12412j;

    /* renamed from: k  reason: collision with root package name */
    public long f12413k;

    /* renamed from: l  reason: collision with root package name */
    public long f12414l;

    /* renamed from: m  reason: collision with root package name */
    public long f12415m;

    /* renamed from: n  reason: collision with root package name */
    public long f12416n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12417o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12418p;

    /* compiled from: H262Reader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f12419e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f12420a;

        /* renamed from: b  reason: collision with root package name */
        public int f12421b;

        /* renamed from: c  reason: collision with root package name */
        public int f12422c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f12423d = new byte[128];

        public final void a(int i6, byte[] bArr, int i10) {
            if (!this.f12420a) {
                return;
            }
            int i11 = i10 - i6;
            byte[] bArr2 = this.f12423d;
            int length = bArr2.length;
            int i12 = this.f12421b;
            if (length < i12 + i11) {
                this.f12423d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i6, this.f12423d, this.f12421b, i11);
            this.f12421b += i11;
        }
    }

    public k(e0 e0Var) {
        this.f12406c = e0Var;
        if (e0Var != null) {
            this.f12408e = new r(178);
            this.f12407d = new c9.q();
        } else {
            this.f12408e = null;
            this.f12407d = null;
        }
        this.f12414l = -9223372036854775807L;
        this.f12416n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        a aVar;
        r rVar;
        int i6;
        int i10;
        int i11;
        long j10;
        boolean z10;
        long j11;
        int i12;
        int i13;
        boolean z11;
        float f;
        int i14;
        float f2;
        int i15;
        long j12;
        int i16;
        c9.q qVar2 = qVar;
        sc.b.E(this.f12405b);
        int i17 = qVar2.f5187b;
        int i18 = qVar2.f5188c;
        byte[] bArr = qVar2.f5186a;
        int i19 = i18 - i17;
        this.f12410h += i19;
        this.f12405b.a(i19, qVar2);
        while (true) {
            int b10 = c9.m.b(bArr, i17, i18, this.f);
            aVar = this.f12409g;
            rVar = this.f12408e;
            if (b10 == i18) {
                break;
            }
            int i20 = b10 + 3;
            int i21 = qVar2.f5186a[i20] & 255;
            int i22 = b10 - i17;
            if (!this.f12412j) {
                if (i22 > 0) {
                    aVar.a(i17, bArr, b10);
                }
                if (i22 < 0) {
                    i13 = -i22;
                } else {
                    i13 = 0;
                }
                if (aVar.f12420a) {
                    int i23 = aVar.f12421b - i13;
                    aVar.f12421b = i23;
                    if (aVar.f12422c == 0 && i21 == 181) {
                        aVar.f12422c = i23;
                    } else {
                        aVar.f12420a = false;
                        z11 = true;
                        if (z11) {
                            String str = this.f12404a;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(aVar.f12423d, aVar.f12421b);
                            int i24 = copyOf[5] & 255;
                            i10 = i20;
                            int i25 = ((copyOf[4] & 255) << 4) | (i24 >> 4);
                            int i26 = (copyOf[6] & 255) | ((i24 & 15) << 8);
                            int i27 = (copyOf[7] & 240) >> 4;
                            if (i27 != 2) {
                                if (i27 != 3) {
                                    if (i27 != 4) {
                                        f2 = 1.0f;
                                        n.a aVar2 = new n.a();
                                        aVar2.f6656a = str;
                                        aVar2.f6665k = "video/mpeg2";
                                        aVar2.f6670p = i25;
                                        aVar2.f6671q = i26;
                                        aVar2.f6673t = f2;
                                        aVar2.f6667m = Collections.singletonList(copyOf);
                                        com.google.android.exoplayer2.n nVar = new com.google.android.exoplayer2.n(aVar2);
                                        i15 = (copyOf[7] & 15) - 1;
                                        if (i15 < 0 && i15 < 8) {
                                            double d10 = f12403q[i15];
                                            byte b11 = copyOf[aVar.f12422c + 9];
                                            int i28 = (b11 & 96) >> 5;
                                            if (i28 != (b11 & 31)) {
                                                i6 = i17;
                                                d10 *= (i28 + 1.0d) / (i16 + 1);
                                            } else {
                                                i6 = i17;
                                            }
                                            j12 = (long) (1000000.0d / d10);
                                        } else {
                                            i6 = i17;
                                            j12 = 0;
                                        }
                                        Pair create = Pair.create(nVar, Long.valueOf(j12));
                                        this.f12405b.e((com.google.android.exoplayer2.n) create.first);
                                        this.f12413k = ((Long) create.second).longValue();
                                        this.f12412j = true;
                                        if (rVar != null) {
                                            if (i22 > 0) {
                                                rVar.a(i6, bArr, b10);
                                                i12 = 0;
                                            } else {
                                                i12 = -i22;
                                            }
                                            if (rVar.b(i12)) {
                                                int e10 = c9.m.e(rVar.f12555d, rVar.f12556e);
                                                int i29 = c9.w.f5205a;
                                                byte[] bArr2 = rVar.f12555d;
                                                c9.q qVar3 = this.f12407d;
                                                qVar3.y(bArr2, e10);
                                                this.f12406c.a(this.f12416n, qVar3);
                                            }
                                            if (i21 == 178) {
                                                qVar2 = qVar;
                                                if (qVar2.f5186a[b10 + 2] == 1) {
                                                    rVar.d(i21);
                                                }
                                                if (i21 == 0 && i21 != 179) {
                                                    if (i21 == 184) {
                                                        this.f12417o = true;
                                                    }
                                                } else {
                                                    i11 = i18 - b10;
                                                    if (this.f12418p && this.f12412j) {
                                                        j11 = this.f12416n;
                                                        if (j11 != -9223372036854775807L) {
                                                            this.f12405b.d(j11, this.f12417o ? 1 : 0, ((int) (this.f12410h - this.f12415m)) - i11, i11, null);
                                                        }
                                                    }
                                                    if (this.f12411i || this.f12418p) {
                                                        this.f12415m = this.f12410h - i11;
                                                        j10 = this.f12414l;
                                                        if (j10 == -9223372036854775807L) {
                                                            long j13 = this.f12416n;
                                                            if (j13 != -9223372036854775807L) {
                                                                j10 = j13 + this.f12413k;
                                                            } else {
                                                                j10 = -9223372036854775807L;
                                                            }
                                                        }
                                                        this.f12416n = j10;
                                                        this.f12417o = false;
                                                        this.f12414l = -9223372036854775807L;
                                                        this.f12411i = true;
                                                    }
                                                    if (i21 != 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    this.f12418p = z10;
                                                }
                                                i17 = i10;
                                            }
                                        }
                                        qVar2 = qVar;
                                        if (i21 == 0) {
                                        }
                                        i11 = i18 - b10;
                                        if (this.f12418p) {
                                            j11 = this.f12416n;
                                            if (j11 != -9223372036854775807L) {
                                            }
                                        }
                                        if (this.f12411i) {
                                        }
                                        this.f12415m = this.f12410h - i11;
                                        j10 = this.f12414l;
                                        if (j10 == -9223372036854775807L) {
                                        }
                                        this.f12416n = j10;
                                        this.f12417o = false;
                                        this.f12414l = -9223372036854775807L;
                                        this.f12411i = true;
                                        if (i21 != 0) {
                                        }
                                        this.f12418p = z10;
                                        i17 = i10;
                                    } else {
                                        f = i26 * R.styleable.AppCompatTheme_windowFixedHeightMinor;
                                        i14 = i25 * 100;
                                    }
                                } else {
                                    f = i26 * 16;
                                    i14 = i25 * 9;
                                }
                            } else {
                                f = i26 * 4;
                                i14 = i25 * 3;
                            }
                            f2 = f / i14;
                            n.a aVar22 = new n.a();
                            aVar22.f6656a = str;
                            aVar22.f6665k = "video/mpeg2";
                            aVar22.f6670p = i25;
                            aVar22.f6671q = i26;
                            aVar22.f6673t = f2;
                            aVar22.f6667m = Collections.singletonList(copyOf);
                            com.google.android.exoplayer2.n nVar2 = new com.google.android.exoplayer2.n(aVar22);
                            i15 = (copyOf[7] & 15) - 1;
                            if (i15 < 0) {
                            }
                            i6 = i17;
                            j12 = 0;
                            Pair create2 = Pair.create(nVar2, Long.valueOf(j12));
                            this.f12405b.e((com.google.android.exoplayer2.n) create2.first);
                            this.f12413k = ((Long) create2.second).longValue();
                            this.f12412j = true;
                            if (rVar != null) {
                            }
                            qVar2 = qVar;
                            if (i21 == 0) {
                            }
                            i11 = i18 - b10;
                            if (this.f12418p) {
                            }
                            if (this.f12411i) {
                            }
                            this.f12415m = this.f12410h - i11;
                            j10 = this.f12414l;
                            if (j10 == -9223372036854775807L) {
                            }
                            this.f12416n = j10;
                            this.f12417o = false;
                            this.f12414l = -9223372036854775807L;
                            this.f12411i = true;
                            if (i21 != 0) {
                            }
                            this.f12418p = z10;
                            i17 = i10;
                        }
                    }
                } else if (i21 == 179) {
                    aVar.f12420a = true;
                }
                aVar.a(0, a.f12419e, 3);
                z11 = false;
                if (z11) {
                }
            }
            i6 = i17;
            i10 = i20;
            if (rVar != null) {
            }
            qVar2 = qVar;
            if (i21 == 0) {
            }
            i11 = i18 - b10;
            if (this.f12418p) {
            }
            if (this.f12411i) {
            }
            this.f12415m = this.f12410h - i11;
            j10 = this.f12414l;
            if (j10 == -9223372036854775807L) {
            }
            this.f12416n = j10;
            this.f12417o = false;
            this.f12414l = -9223372036854775807L;
            this.f12411i = true;
            if (i21 != 0) {
            }
            this.f12418p = z10;
            i17 = i10;
        }
        if (!this.f12412j) {
            aVar.a(i17, bArr, i18);
        }
        if (rVar != null) {
            rVar.a(i17, bArr, i18);
        }
    }

    @Override // d8.j
    public final void c() {
        c9.m.a(this.f);
        a aVar = this.f12409g;
        aVar.f12420a = false;
        aVar.f12421b = 0;
        aVar.f12422c = 0;
        r rVar = this.f12408e;
        if (rVar != null) {
            rVar.c();
        }
        this.f12410h = 0L;
        this.f12411i = false;
        this.f12414l = -9223372036854775807L;
        this.f12416n = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12404a = dVar.f12352e;
        dVar.b();
        this.f12405b = jVar.n(dVar.f12351d, 2);
        e0 e0Var = this.f12406c;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        this.f12414l = j10;
    }

    @Override // d8.j
    public final void e() {
    }
}
