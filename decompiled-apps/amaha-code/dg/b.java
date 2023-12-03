package dg;

import java.util.Arrays;
/* compiled from: BitMatrix.java */
/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: u  reason: collision with root package name */
    public final int f12846u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12847v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12848w;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f12849x;

    public b(int i6, int i10) {
        if (i6 > 0 && i10 > 0) {
            this.f12846u = i6;
            this.f12847v = i10;
            int i11 = (i6 + 31) / 32;
            this.f12848w = i11;
            this.f12849x = new int[i11 * i10];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean a(int i6, int i10) {
        if (((this.f12849x[(i6 / 32) + (i10 * this.f12848w)] >>> (i6 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void b(int i6, int i10) {
        int i11 = (i6 / 32) + (i10 * this.f12848w);
        int[] iArr = this.f12849x;
        iArr[i11] = (1 << (i6 & 31)) | iArr[i11];
    }

    public final void c(int i6, int i10, int i11, int i12) {
        if (i10 >= 0 && i6 >= 0) {
            if (i12 > 0 && i11 > 0) {
                int i13 = i11 + i6;
                int i14 = i12 + i10;
                if (i14 <= this.f12847v && i13 <= this.f12846u) {
                    while (i10 < i14) {
                        int i15 = this.f12848w * i10;
                        for (int i16 = i6; i16 < i13; i16++) {
                            int i17 = (i16 / 32) + i15;
                            int[] iArr = this.f12849x;
                            iArr[i17] = iArr[i17] | (1 << (i16 & 31));
                        }
                        i10++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final Object clone() {
        int i6 = this.f12847v;
        int i10 = this.f12848w;
        return new b(this.f12846u, i6, i10, (int[]) this.f12849x.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12846u != bVar.f12846u || this.f12847v != bVar.f12847v || this.f12848w != bVar.f12848w || !Arrays.equals(this.f12849x, bVar.f12849x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6 = this.f12846u;
        return Arrays.hashCode(this.f12849x) + (((((((i6 * 31) + i6) * 31) + this.f12847v) * 31) + this.f12848w) * 31);
    }

    public final String toString() {
        String str;
        int i6 = this.f12846u;
        int i10 = this.f12847v;
        StringBuilder sb2 = new StringBuilder((i6 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i6; i12++) {
                if (a(i12, i11)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int i6, int i10, int i11, int[] iArr) {
        this.f12846u = i6;
        this.f12847v = i10;
        this.f12848w = i11;
        this.f12849x = iArr;
    }
}
