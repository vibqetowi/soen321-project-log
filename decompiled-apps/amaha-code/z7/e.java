package z7;

import u7.i;
/* compiled from: VarintReader.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f39262d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f39263a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f39264b;

    /* renamed from: c  reason: collision with root package name */
    public int f39265c;

    public static long a(byte[] bArr, int i6, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f39262d[i6 - 1];
        }
        for (int i10 = 1; i10 < i6; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }

    public final long b(i iVar, boolean z10, boolean z11, int i6) {
        int i10;
        int i11 = this.f39264b;
        byte[] bArr = this.f39263a;
        if (i11 == 0) {
            if (!iVar.a(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 < 8) {
                    if ((f39262d[i13] & i12) != 0) {
                        i10 = i13 + 1;
                        break;
                    }
                    i13++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            this.f39265c = i10;
            if (i10 != -1) {
                this.f39264b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i14 = this.f39265c;
        if (i14 > i6) {
            this.f39264b = 0;
            return -2L;
        }
        if (i14 != 1) {
            iVar.readFully(bArr, 1, i14 - 1);
        }
        this.f39264b = 0;
        return a(bArr, this.f39265c, z11);
    }
}
