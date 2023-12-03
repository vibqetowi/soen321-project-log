package cg;
/* compiled from: State.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final f f5278e = new f(g.f5283b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f5279a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5280b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5281c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5282d;

    public f(g gVar, int i6, int i10, int i11) {
        this.f5280b = gVar;
        this.f5279a = i6;
        this.f5281c = i10;
        this.f5282d = i11;
    }

    public final f a(int i6) {
        int i10;
        g gVar = this.f5280b;
        int i11 = this.f5279a;
        int i12 = this.f5282d;
        if (i11 == 4 || i11 == 2) {
            int[] iArr = d.f5272c[i11];
            i11 = 0;
            int i13 = iArr[0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar.getClass();
            i12 += i15;
            gVar = new e(gVar, i14, i15);
        }
        int i16 = this.f5281c;
        if (i16 != 0 && i16 != 31) {
            if (i16 == 62) {
                i10 = 9;
            } else {
                i10 = 8;
            }
        } else {
            i10 = 18;
        }
        int i17 = i16 + 1;
        f fVar = new f(gVar, i11, i17, i12 + i10);
        if (i17 == 2078) {
            return fVar.b(i6 + 1);
        }
        return fVar;
    }

    public final f b(int i6) {
        int i10 = this.f5281c;
        if (i10 == 0) {
            return this;
        }
        g gVar = this.f5280b;
        gVar.getClass();
        return new f(new b(gVar, i6 - i10, i10), this.f5279a, 0, this.f5282d);
    }

    public final boolean c(f fVar) {
        int i6;
        int i10 = this.f5282d + (d.f5272c[this.f5279a][fVar.f5279a] >> 16);
        int i11 = fVar.f5281c;
        if (i11 > 0 && ((i6 = this.f5281c) == 0 || i6 > i11)) {
            i10 += 10;
        }
        if (i10 <= fVar.f5282d) {
            return true;
        }
        return false;
    }

    public final f d(int i6, int i10) {
        int i11;
        int i12 = this.f5282d;
        g gVar = this.f5280b;
        int i13 = this.f5279a;
        if (i6 != i13) {
            int i14 = d.f5272c[i13][i6];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar.getClass();
            i12 += i16;
            gVar = new e(gVar, i15, i16);
        }
        if (i6 == 2) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        gVar.getClass();
        return new f(new e(gVar, i10, i11), i6, 0, i12 + i11);
    }

    public final f e(int i6, int i10) {
        int i11;
        int i12 = this.f5279a;
        if (i12 == 2) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        int i13 = d.f5274e[i12][i6];
        g gVar = this.f5280b;
        gVar.getClass();
        return new f(new e(new e(gVar, i13, i11), i10, 5), i12, 0, this.f5282d + i11 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", d.f5271b[this.f5279a], Integer.valueOf(this.f5282d), Integer.valueOf(this.f5281c));
    }
}
