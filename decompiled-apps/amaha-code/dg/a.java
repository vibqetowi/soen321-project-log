package dg;

import java.util.Arrays;
/* compiled from: BitArray.java */
/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: u  reason: collision with root package name */
    public int[] f12844u;

    /* renamed from: v  reason: collision with root package name */
    public int f12845v;

    public a() {
        this.f12845v = 0;
        this.f12844u = new int[1];
    }

    public final void a(boolean z10) {
        c(this.f12845v + 1);
        if (z10) {
            int[] iArr = this.f12844u;
            int i6 = this.f12845v;
            int i10 = i6 / 32;
            iArr[i10] = (1 << (i6 & 31)) | iArr[i10];
        }
        this.f12845v++;
    }

    public final void b(int i6, int i10) {
        if (i10 >= 0 && i10 <= 32) {
            c(this.f12845v + i10);
            while (i10 > 0) {
                boolean z10 = true;
                if (((i6 >> (i10 - 1)) & 1) != 1) {
                    z10 = false;
                }
                a(z10);
                i10--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i6) {
        int[] iArr = this.f12844u;
        if (i6 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i6 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12844u = iArr2;
        }
    }

    public final Object clone() {
        return new a((int[]) this.f12844u.clone(), this.f12845v);
    }

    public final boolean d(int i6) {
        if (((1 << (i6 & 31)) & this.f12844u[i6 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12845v != aVar.f12845v || !Arrays.equals(this.f12844u, aVar.f12844u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12844u) + (this.f12845v * 31);
    }

    public final String toString() {
        char c10;
        int i6 = this.f12845v;
        StringBuilder sb2 = new StringBuilder((i6 / 8) + i6 + 1);
        for (int i10 = 0; i10 < this.f12845v; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i10)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public a(int[] iArr, int i6) {
        this.f12844u = iArr;
        this.f12845v = i6;
    }
}
