package hg;

import i5.n;
import java.lang.reflect.Array;
/* compiled from: BarcodeMatrix.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f17595a;

    /* renamed from: b  reason: collision with root package name */
    public int f17596b;

    /* renamed from: c  reason: collision with root package name */
    public int f17597c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17598d;

    public final n a() {
        return ((n[]) this.f17598d)[this.f17595a];
    }

    public final byte[][] b(int i6, int i10) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f17596b * i10, this.f17597c * i6);
        int i11 = this.f17596b * i10;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i11 - i12) - 1;
            n nVar = ((n[]) this.f17598d)[i12 / i10];
            int length = ((byte[]) nVar.f19877v).length * i6;
            byte[] bArr2 = new byte[length];
            for (int i14 = 0; i14 < length; i14++) {
                bArr2[i14] = ((byte[]) nVar.f19877v)[i14 / i6];
            }
            bArr[i13] = bArr2;
        }
        return bArr;
    }

    public final boolean c(int i6) {
        if (((1 << i6) & this.f17595a) != 0) {
            return true;
        }
        return false;
    }

    public final void d(int i6, int i10) {
        int[] iArr = (int[]) this.f17598d;
        if (i6 >= iArr.length) {
            return;
        }
        int i11 = 1 << i6;
        this.f17595a |= i11;
        this.f17596b &= ~i11;
        this.f17597c = (~i11) & this.f17597c;
        iArr[i6] = i10;
    }

    public /* synthetic */ a(int i6, int i10) {
        n[] nVarArr = new n[i6];
        this.f17598d = nVarArr;
        int length = nVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            ((n[]) this.f17598d)[i11] = new n(((i10 + 4) * 17) + 1, 4);
        }
        this.f17597c = i10 * 17;
        this.f17596b = i6;
        this.f17595a = -1;
    }
}
