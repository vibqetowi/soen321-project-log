package zv;

import java.security.MessageDigest;
/* compiled from: SegmentedByteString.kt */
/* loaded from: classes2.dex */
public final class w extends i {

    /* renamed from: y  reason: collision with root package name */
    public final transient byte[][] f39927y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int[] f39928z;

    public w(byte[][] bArr, int[] iArr) {
        super(i.f39888x.f39889u);
        this.f39927y = bArr;
        this.f39928z = iArr;
    }

    private final Object writeReplace() {
        return new i(t());
    }

    @Override // zv.i
    public final String d() {
        throw null;
    }

    @Override // zv.i
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (iVar.h() != h() || !p(iVar, h())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // zv.i
    public final i f(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f39927y;
        int length = bArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            int[] iArr = this.f39928z;
            int i11 = iArr[length + i6];
            int i12 = iArr[i6];
            messageDigest.update(bArr[i6], i11, i12 - i10);
            i6++;
            i10 = i12;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.i.f(digestBytes, "digestBytes");
        return new i(digestBytes);
    }

    @Override // zv.i
    public final int h() {
        return this.f39928z[this.f39927y.length - 1];
    }

    @Override // zv.i
    public final int hashCode() {
        int i6 = this.f39890v;
        if (i6 == 0) {
            byte[][] bArr = this.f39927y;
            int length = bArr.length;
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            while (i10 < length) {
                int[] iArr = this.f39928z;
                int i13 = iArr[length + i10];
                int i14 = iArr[i10];
                byte[] bArr2 = bArr[i10];
                int i15 = (i14 - i12) + i13;
                while (i13 < i15) {
                    i11 = (i11 * 31) + bArr2[i13];
                    i13++;
                }
                i10++;
                i12 = i14;
            }
            this.f39890v = i11;
            return i11;
        }
        return i6;
    }

    @Override // zv.i
    public final String i() {
        return new i(t()).i();
    }

    @Override // zv.i
    public final byte[] j() {
        return t();
    }

    @Override // zv.i
    public final byte k(int i6) {
        int i10;
        byte[][] bArr = this.f39927y;
        int[] iArr = this.f39928z;
        ta.v.m(iArr[bArr.length - 1], i6, 1L);
        int W = sp.b.W(this, i6);
        if (W == 0) {
            i10 = 0;
        } else {
            i10 = iArr[W - 1];
        }
        return bArr[W][(i6 - i10) + iArr[bArr.length + W]];
    }

    @Override // zv.i
    public final boolean n(int i6, int i10, int i11, byte[] other) {
        int i12;
        kotlin.jvm.internal.i.g(other, "other");
        if (i6 < 0 || i6 > h() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i13 = i11 + i6;
        int W = sp.b.W(this, i6);
        while (i6 < i13) {
            int[] iArr = this.f39928z;
            if (W == 0) {
                i12 = 0;
            } else {
                i12 = iArr[W - 1];
            }
            byte[][] bArr = this.f39927y;
            int i14 = iArr[bArr.length + W];
            int min = Math.min(i13, (iArr[W] - i12) + i12) - i6;
            if (!ta.v.f((i6 - i12) + i14, i10, min, bArr[W], other)) {
                return false;
            }
            i10 += min;
            i6 += min;
            W++;
        }
        return true;
    }

    @Override // zv.i
    public final boolean p(i other, int i6) {
        int i10;
        kotlin.jvm.internal.i.g(other, "other");
        if (h() - i6 < 0) {
            return false;
        }
        int i11 = i6 + 0;
        int W = sp.b.W(this, 0);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int[] iArr = this.f39928z;
            if (W == 0) {
                i10 = 0;
            } else {
                i10 = iArr[W - 1];
            }
            byte[][] bArr = this.f39927y;
            int i14 = iArr[bArr.length + W];
            int min = Math.min(i11, (iArr[W] - i10) + i10) - i12;
            if (!other.n(i13, (i12 - i10) + i14, min, bArr[W])) {
                return false;
            }
            i13 += min;
            i12 += min;
            W++;
        }
        return true;
    }

    @Override // zv.i
    public final i r() {
        return new i(t()).r();
    }

    @Override // zv.i
    public final byte[] t() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.f39927y;
        int length = bArr2.length;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < length) {
            int[] iArr = this.f39928z;
            int i12 = iArr[length + i6];
            int i13 = iArr[i6];
            int i14 = i13 - i10;
            is.i.I1(i11, i12, i12 + i14, bArr2[i6], bArr);
            i11 += i14;
            i6++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // zv.i
    public final String toString() {
        return new i(t()).toString();
    }

    @Override // zv.i
    public final void v(e buffer, int i6) {
        int i10;
        kotlin.jvm.internal.i.g(buffer, "buffer");
        int i11 = 0 + i6;
        int W = sp.b.W(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int[] iArr = this.f39928z;
            if (W == 0) {
                i10 = 0;
            } else {
                i10 = iArr[W - 1];
            }
            byte[][] bArr = this.f39927y;
            int i13 = iArr[bArr.length + W];
            int min = Math.min(i11, (iArr[W] - i10) + i10) - i12;
            int i14 = (i12 - i10) + i13;
            u uVar = new u(bArr[W], i14, i14 + min, true);
            u uVar2 = buffer.f39884u;
            if (uVar2 == null) {
                uVar.f39923g = uVar;
                uVar.f = uVar;
                buffer.f39884u = uVar;
            } else {
                u uVar3 = uVar2.f39923g;
                kotlin.jvm.internal.i.d(uVar3);
                uVar3.b(uVar);
            }
            i12 += min;
            W++;
        }
        buffer.f39885v += i6;
    }
}
