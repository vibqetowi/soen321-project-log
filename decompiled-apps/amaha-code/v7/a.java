package v7;

import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import java.io.EOFException;
import java.util.Arrays;
import sc.b;
import u7.d;
import u7.h;
import u7.i;
import u7.j;
import u7.s;
import u7.t;
import u7.v;
/* compiled from: AmrExtractor.java */
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f34817q;

    /* renamed from: t  reason: collision with root package name */
    public static final int f34819t;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34822c;

    /* renamed from: d  reason: collision with root package name */
    public long f34823d;

    /* renamed from: e  reason: collision with root package name */
    public int f34824e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f34825g;

    /* renamed from: h  reason: collision with root package name */
    public long f34826h;

    /* renamed from: j  reason: collision with root package name */
    public int f34828j;

    /* renamed from: k  reason: collision with root package name */
    public long f34829k;

    /* renamed from: l  reason: collision with root package name */
    public j f34830l;

    /* renamed from: m  reason: collision with root package name */
    public v f34831m;

    /* renamed from: n  reason: collision with root package name */
    public t f34832n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f34833o;

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f34816p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] r = w.u("#!AMR\n");

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f34818s = w.u("#!AMR-WB\n");

    /* renamed from: b  reason: collision with root package name */
    public final int f34821b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f34820a = new byte[1];

    /* renamed from: i  reason: collision with root package name */
    public int f34827i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f34817q = iArr;
        f34819t = iArr[8];
    }

    @Override // u7.h
    public final boolean b(i iVar) {
        return d(iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(i iVar) {
        String str;
        boolean z10;
        boolean z11;
        iVar.k();
        boolean z12 = false;
        byte[] bArr = this.f34820a;
        iVar.b(0, bArr, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i6 = (b10 >> 3) & 15;
            if (i6 >= 0 && i6 <= 15) {
                boolean z13 = this.f34822c;
                if (z13 && (i6 < 10 || i6 > 13)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (!z13 && (i6 < 12 || i6 > 14)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = true;
            }
            if (!z12) {
                if (this.f34822c) {
                    str = "WB";
                } else {
                    str = "NB";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 35);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i6);
                throw ParserException.a(sb2.toString(), null);
            } else if (this.f34822c) {
                return f34817q[i6];
            } else {
                return f34816p[i6];
            }
        }
        StringBuilder sb3 = new StringBuilder(42);
        sb3.append("Invalid padding bits for frame header ");
        sb3.append((int) b10);
        throw ParserException.a(sb3.toString(), null);
    }

    public final boolean d(i iVar) {
        iVar.k();
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        iVar.b(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f34822c = false;
            iVar.l(bArr.length);
            return true;
        }
        iVar.k();
        byte[] bArr3 = f34818s;
        byte[] bArr4 = new byte[bArr3.length];
        iVar.b(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f34822c = true;
        iVar.l(bArr3.length);
        return true;
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f34830l = jVar;
        this.f34831m = jVar.n(0, 1);
        jVar.e();
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.f34823d = 0L;
        this.f34824e = 0;
        this.f = 0;
        if (j10 != 0) {
            t tVar = this.f34832n;
            if (tVar instanceof d) {
                d dVar = (d) tVar;
                this.f34829k = ((Math.max(0L, j10 - dVar.f33864b) * 8) * 1000000) / dVar.f33867e;
                return;
            }
        }
        this.f34829k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(i iVar, s sVar) {
        int i6;
        int i10;
        boolean z10;
        String str;
        int i11;
        b.E(this.f34831m);
        int i12 = w.f5205a;
        if (iVar.getPosition() == 0 && !d(iVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        if (!this.f34833o) {
            this.f34833o = true;
            boolean z11 = this.f34822c;
            if (z11) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z11) {
                i11 = 16000;
            } else {
                i11 = 8000;
            }
            v vVar = this.f34831m;
            n.a aVar = new n.a();
            aVar.f6665k = str;
            aVar.f6666l = f34819t;
            aVar.f6677x = 1;
            aVar.f6678y = i11;
            vVar.e(new n(aVar));
        }
        if (this.f == 0) {
            try {
                int c10 = c(iVar);
                this.f34824e = c10;
                this.f = c10;
                if (this.f34827i == -1) {
                    this.f34826h = iVar.getPosition();
                    this.f34827i = this.f34824e;
                }
                if (this.f34827i == this.f34824e) {
                    this.f34828j++;
                }
            } catch (EOFException unused) {
            }
        }
        int c11 = this.f34831m.c(iVar, this.f, true);
        if (c11 != -1) {
            int i13 = this.f - c11;
            this.f = i13;
            if (i13 <= 0) {
                this.f34831m.d(this.f34829k + this.f34823d, 1, this.f34824e, 0, null);
                this.f34823d += 20000;
            }
            i6 = 0;
            long length = iVar.getLength();
            if (!this.f34825g) {
                int i14 = this.f34821b;
                if ((i14 & 1) != 0 && length != -1 && ((i10 = this.f34827i) == -1 || i10 == this.f34824e)) {
                    if (this.f34828j >= 20 || i6 == -1) {
                        if ((i14 & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d dVar = new d((int) (((i10 * 8) * 1000000) / 20000), i10, length, this.f34826h, z10);
                        this.f34832n = dVar;
                        this.f34830l.i(dVar);
                        this.f34825g = true;
                    }
                } else {
                    t.b bVar = new t.b(-9223372036854775807L);
                    this.f34832n = bVar;
                    this.f34830l.i(bVar);
                    this.f34825g = true;
                }
            }
            return i6;
        }
        i6 = -1;
        long length2 = iVar.getLength();
        if (!this.f34825g) {
        }
        return i6;
    }

    @Override // u7.h
    public final void a() {
    }
}
