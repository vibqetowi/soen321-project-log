package e8;

import android.util.Log;
import android.util.Pair;
import c9.q;
import c9.w;
import com.appsflyer.R;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import e8.c;
import u7.h;
import u7.i;
import u7.j;
import u7.s;
import u7.v;
/* compiled from: WavExtractor.java */
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public j f13830a;

    /* renamed from: b  reason: collision with root package name */
    public v f13831b;

    /* renamed from: d  reason: collision with root package name */
    public b f13833d;

    /* renamed from: c  reason: collision with root package name */
    public int f13832c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f13834e = -1;
    public long f = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: e8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0217a implements b {

        /* renamed from: m  reason: collision with root package name */
        public static final int[] f13835m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        public static final int[] f13836n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        public final j f13837a;

        /* renamed from: b  reason: collision with root package name */
        public final v f13838b;

        /* renamed from: c  reason: collision with root package name */
        public final e8.b f13839c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13840d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f13841e;
        public final q f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13842g;

        /* renamed from: h  reason: collision with root package name */
        public final n f13843h;

        /* renamed from: i  reason: collision with root package name */
        public int f13844i;

        /* renamed from: j  reason: collision with root package name */
        public long f13845j;

        /* renamed from: k  reason: collision with root package name */
        public int f13846k;

        /* renamed from: l  reason: collision with root package name */
        public long f13847l;

        public C0217a(j jVar, v vVar, e8.b bVar) {
            this.f13837a = jVar;
            this.f13838b = vVar;
            this.f13839c = bVar;
            int i6 = bVar.f13856b;
            int max = Math.max(1, i6 / 10);
            this.f13842g = max;
            byte[] bArr = bVar.f13859e;
            int length = bArr.length;
            byte b10 = bArr[0];
            byte b11 = bArr[1];
            int i10 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f13840d = i10;
            int i11 = bVar.f13855a;
            int i12 = bVar.f13857c;
            int i13 = (((i12 - (i11 * 4)) * 8) / (bVar.f13858d * i11)) + 1;
            if (i10 == i13) {
                int i14 = w.f5205a;
                int i15 = ((max + i10) - 1) / i10;
                this.f13841e = new byte[i15 * i12];
                this.f = new q(i10 * 2 * i11 * i15);
                int i16 = ((i12 * i6) * 8) / i10;
                n.a aVar = new n.a();
                aVar.f6665k = "audio/raw";
                aVar.f = i16;
                aVar.f6661g = i16;
                aVar.f6666l = max * 2 * i11;
                aVar.f6677x = i11;
                aVar.f6678y = i6;
                aVar.f6679z = 2;
                this.f13843h = new n(aVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i13);
            sb2.append("; got: ");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        }

        @Override // e8.a.b
        public final void a(long j10) {
            this.f13844i = 0;
            this.f13845j = j10;
            this.f13846k = 0;
            this.f13847l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:12:0x004a). Please submit an issue!!! */
        @Override // e8.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(i iVar, long j10) {
            int i6;
            boolean z10;
            long j11;
            int i10;
            i iVar2;
            byte[] bArr;
            int i11;
            boolean z11;
            int i12;
            int i13;
            q qVar;
            int i14;
            int i15;
            int read;
            int i16 = this.f13846k;
            e8.b bVar = this.f13839c;
            int i17 = i16 / (bVar.f13855a * 2);
            int i18 = this.f13842g;
            int i19 = w.f5205a;
            int i20 = this.f13840d;
            int i21 = ((((i18 - i17) + i20) - 1) / i20) * bVar.f13857c;
            e8.b bVar2 = bVar;
            int i22 = i18;
            if (j10 == 0) {
                i6 = i20;
                j11 = j10;
                i10 = i21;
                iVar2 = iVar;
                z10 = true;
                while (true) {
                    bArr = this.f13841e;
                    if (!!z10 || (i15 = this.f13844i) >= i10) {
                        break;
                    }
                    read = iVar2.read(bArr, this.f13844i, (int) Math.min(i10 - i15, j11));
                    if (read == -1) {
                        break;
                    }
                    this.f13844i += read;
                }
                i11 = this.f13844i / bVar2.f13857c;
                e8.b bVar3 = this.f13839c;
                if (i11 <= 0) {
                    int i23 = 0;
                    while (true) {
                        i13 = bVar2.f13857c;
                        qVar = this.f;
                        if (i23 >= i11) {
                            break;
                        }
                        int i24 = 0;
                        while (true) {
                            int i25 = bVar2.f13855a;
                            if (i24 < i25) {
                                byte[] bArr2 = qVar.f5186a;
                                int i26 = (i24 * 4) + (i23 * i13);
                                int i27 = (i25 * 4) + i26;
                                int i28 = (i13 / i25) - 4;
                                int i29 = (short) ((bArr[i26] & 255) | ((bArr[i26 + 1] & 255) << 8));
                                e8.b bVar4 = bVar2;
                                int min = Math.min(bArr[i26 + 2] & 255, 88);
                                int[] iArr = f13836n;
                                int i30 = iArr[min];
                                int i31 = ((i23 * i6 * i25) + i24) * 2;
                                bArr2[i31] = (byte) (i29 & 255);
                                bArr2[i31 + 1] = (byte) (i29 >> 8);
                                int i32 = min;
                                boolean z12 = z10;
                                int i33 = 0;
                                while (i33 < i28 * 2) {
                                    int i34 = bArr[((i33 / 8) * i25 * 4) + i27 + ((i33 / 2) % 4)] & 255;
                                    if (i33 % 2 == 0) {
                                        i14 = i34 & 15;
                                    } else {
                                        i14 = i34 >> 4;
                                    }
                                    int i35 = (((i14 & 7) * 2) + 1) * i30;
                                    byte[] bArr3 = bArr;
                                    int i36 = i35 >> 3;
                                    if ((i14 & 8) != 0) {
                                        i36 = -i36;
                                    }
                                    i29 = w.h(i29 + i36, -32768, 32767);
                                    i31 = (i25 * 2) + i31;
                                    bArr2[i31] = (byte) (i29 & 255);
                                    bArr2[i31 + 1] = (byte) (i29 >> 8);
                                    i32 = w.h(i32 + f13835m[i14], 0, 88);
                                    i33++;
                                    bArr = bArr3;
                                    i22 = i22;
                                    i30 = iArr[i32];
                                }
                                i24++;
                                z10 = z12;
                                bVar2 = bVar4;
                            }
                        }
                        i23++;
                    }
                    int i37 = i22;
                    z11 = z10;
                    qVar.A(0);
                    qVar.z(i6 * i11 * 2 * bVar3.f13855a);
                    this.f13844i -= i11 * i13;
                    int i38 = qVar.f5188c;
                    this.f13838b.a(i38, qVar);
                    int i39 = this.f13846k + i38;
                    this.f13846k = i39;
                    if (i39 / (bVar3.f13855a * 2) >= i37) {
                        d(i37);
                    }
                } else {
                    z11 = z10;
                }
                if (z11 && (i12 = this.f13846k / (bVar3.f13855a * 2)) > 0) {
                    d(i12);
                }
                return z11;
            }
            i6 = i20;
            z10 = false;
            j11 = j10;
            i10 = i21;
            iVar2 = iVar;
            while (true) {
                bArr = this.f13841e;
                if (!z10) {
                    break;
                }
                break;
                this.f13844i += read;
            }
            i11 = this.f13844i / bVar2.f13857c;
            e8.b bVar32 = this.f13839c;
            if (i11 <= 0) {
            }
            if (z11) {
                d(i12);
            }
            return z11;
        }

        @Override // e8.a.b
        public final void c(int i6, long j10) {
            this.f13837a.i(new d(this.f13839c, this.f13840d, i6, j10));
            this.f13838b.e(this.f13843h);
        }

        public final void d(int i6) {
            long j10 = this.f13845j;
            long j11 = this.f13847l;
            e8.b bVar = this.f13839c;
            long C = j10 + w.C(j11, 1000000L, bVar.f13856b);
            int i10 = i6 * 2 * bVar.f13855a;
            this.f13838b.d(C, 1, i10, this.f13846k - i10, null);
            this.f13847l += i6;
            this.f13846k -= i10;
        }
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(long j10);

        boolean b(i iVar, long j10);

        void c(int i6, long j10);
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final j f13848a;

        /* renamed from: b  reason: collision with root package name */
        public final v f13849b;

        /* renamed from: c  reason: collision with root package name */
        public final e8.b f13850c;

        /* renamed from: d  reason: collision with root package name */
        public final n f13851d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13852e;
        public long f;

        /* renamed from: g  reason: collision with root package name */
        public int f13853g;

        /* renamed from: h  reason: collision with root package name */
        public long f13854h;

        public c(j jVar, v vVar, e8.b bVar, String str, int i6) {
            this.f13848a = jVar;
            this.f13849b = vVar;
            this.f13850c = bVar;
            int i10 = bVar.f13858d;
            int i11 = bVar.f13855a;
            int i12 = (i10 * i11) / 8;
            int i13 = bVar.f13857c;
            if (i13 == i12) {
                int i14 = bVar.f13856b;
                int i15 = i14 * i12;
                int i16 = i15 * 8;
                int max = Math.max(i12, i15 / 10);
                this.f13852e = max;
                n.a aVar = new n.a();
                aVar.f6665k = str;
                aVar.f = i16;
                aVar.f6661g = i16;
                aVar.f6666l = max;
                aVar.f6677x = i11;
                aVar.f6678y = i14;
                aVar.f6679z = i6;
                this.f13851d = new n(aVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i12);
            sb2.append("; got: ");
            sb2.append(i13);
            throw ParserException.a(sb2.toString(), null);
        }

        @Override // e8.a.b
        public final void a(long j10) {
            this.f = j10;
            this.f13853g = 0;
            this.f13854h = 0L;
        }

        @Override // e8.a.b
        public final boolean b(i iVar, long j10) {
            int i6;
            e8.b bVar;
            int i10;
            int i11;
            long j11 = j10;
            while (true) {
                i6 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i6 <= 0 || (i10 = this.f13853g) >= (i11 = this.f13852e)) {
                    break;
                }
                int c10 = this.f13849b.c(iVar, (int) Math.min(i11 - i10, j11), true);
                if (c10 == -1) {
                    j11 = 0;
                } else {
                    this.f13853g += c10;
                    j11 -= c10;
                }
            }
            int i12 = this.f13850c.f13857c;
            int i13 = this.f13853g / i12;
            if (i13 > 0) {
                int i14 = i13 * i12;
                int i15 = this.f13853g - i14;
                this.f13849b.d(this.f + w.C(this.f13854h, 1000000L, bVar.f13856b), 1, i14, i15, null);
                this.f13854h += i13;
                this.f13853g = i15;
            }
            if (i6 <= 0) {
                return true;
            }
            return false;
        }

        @Override // e8.a.b
        public final void c(int i6, long j10) {
            this.f13848a.i(new d(this.f13850c, 1, i6, j10));
            this.f13849b.e(this.f13851d);
        }
    }

    @Override // u7.h
    public final boolean b(i iVar) {
        return e8.c.a(iVar);
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f13830a = jVar;
        this.f13831b = jVar.n(0, 1);
        jVar.e();
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        int i6;
        if (j10 == 0) {
            i6 = 0;
        } else {
            i6 = 3;
        }
        this.f13832c = i6;
        b bVar = this.f13833d;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(i iVar, s sVar) {
        boolean z10;
        long j10;
        boolean z11;
        byte[] bArr;
        int p10;
        int i6;
        sc.b.E(this.f13831b);
        int i10 = w.f5205a;
        int i11 = this.f13832c;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.f == -1) {
                            z12 = false;
                        }
                        sc.b.C(z12);
                        b bVar = this.f13833d;
                        bVar.getClass();
                        if (bVar.b(iVar, this.f - iVar.getPosition())) {
                            return -1;
                        }
                        return 0;
                    }
                    throw new IllegalStateException();
                }
                iVar.k();
                q qVar = new q(8);
                c.a a10 = c.a.a(iVar, qVar);
                while (true) {
                    int i12 = a10.f13860a;
                    long j11 = a10.f13861b;
                    if (i12 != 1684108385) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Ignoring unknown WAV chunk: ");
                        sb2.append(i12);
                        Log.w("WavHeaderReader", sb2.toString());
                        long j12 = j11 + 8;
                        if (j12 <= 2147483647L) {
                            iVar.l((int) j12);
                            a10 = c.a.a(iVar, qVar);
                        } else {
                            StringBuilder sb3 = new StringBuilder(51);
                            sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                            sb3.append(a10.f13860a);
                            throw ParserException.b(sb3.toString());
                        }
                    } else {
                        iVar.l(8);
                        long position = iVar.getPosition();
                        long j13 = j11 + position;
                        long length = iVar.getLength();
                        if (length != -1 && j13 > length) {
                            StringBuilder sb4 = new StringBuilder(69);
                            sb4.append("Data exceeds input length: ");
                            sb4.append(j13);
                            sb4.append(", ");
                            sb4.append(length);
                            Log.w("WavHeaderReader", sb4.toString());
                            j13 = length;
                        }
                        Pair create = Pair.create(Long.valueOf(position), Long.valueOf(j13));
                        this.f13834e = ((Long) create.first).intValue();
                        this.f = ((Long) create.second).longValue();
                        b bVar2 = this.f13833d;
                        bVar2.getClass();
                        bVar2.c(this.f13834e, this.f);
                        this.f13832c = 3;
                        return 0;
                    }
                }
            } else {
                q qVar2 = new q(16);
                c.a a11 = c.a.a(iVar, qVar2);
                while (true) {
                    int i13 = a11.f13860a;
                    j10 = a11.f13861b;
                    if (i13 == 1718449184) {
                        break;
                    }
                    iVar.l(((int) j10) + 8);
                    a11 = c.a.a(iVar, qVar2);
                }
                if (j10 >= 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.C(z11);
                iVar.b(0, qVar2.f5186a, 16);
                qVar2.A(0);
                int i14 = qVar2.i();
                int i15 = qVar2.i();
                int h10 = qVar2.h();
                qVar2.h();
                int i16 = qVar2.i();
                int i17 = qVar2.i();
                int i18 = ((int) j10) - 16;
                if (i18 > 0) {
                    bArr = new byte[i18];
                    iVar.b(0, bArr, i18);
                } else {
                    bArr = w.f;
                }
                iVar.l((int) (iVar.e() - iVar.getPosition()));
                e8.b bVar3 = new e8.b(i14, i15, h10, i16, i17, bArr);
                if (i14 == 17) {
                    this.f13833d = new C0217a(this.f13830a, this.f13831b, bVar3);
                } else if (i14 == 6) {
                    this.f13833d = new c(this.f13830a, this.f13831b, bVar3, "audio/g711-alaw", -1);
                } else if (i14 == 7) {
                    this.f13833d = new c(this.f13830a, this.f13831b, bVar3, "audio/g711-mlaw", -1);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            if (i14 != 65534) {
                                i6 = 0;
                                if (i6 != 0) {
                                    this.f13833d = new c(this.f13830a, this.f13831b, bVar3, "audio/raw", i6);
                                } else {
                                    StringBuilder sb5 = new StringBuilder(40);
                                    sb5.append("Unsupported WAV format type: ");
                                    sb5.append(i14);
                                    throw ParserException.b(sb5.toString());
                                }
                            }
                        } else {
                            if (i17 == 32) {
                                p10 = 4;
                            } else {
                                p10 = 0;
                            }
                            i6 = p10;
                            if (i6 != 0) {
                            }
                        }
                    }
                    p10 = w.p(i17);
                    i6 = p10;
                    if (i6 != 0) {
                    }
                }
                this.f13832c = 2;
                return 0;
            }
        } else {
            if (iVar.getPosition() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            int i19 = this.f13834e;
            if (i19 != -1) {
                iVar.l(i19);
                this.f13832c = 3;
            } else if (e8.c.a(iVar)) {
                iVar.l((int) (iVar.e() - iVar.getPosition()));
                this.f13832c = 1;
            } else {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            return 0;
        }
    }

    @Override // u7.h
    public final void a() {
    }
}
