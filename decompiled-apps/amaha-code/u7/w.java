package u7;

import u7.v;
/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f33917a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f33918b;

    /* renamed from: c  reason: collision with root package name */
    public int f33919c;

    /* renamed from: d  reason: collision with root package name */
    public long f33920d;

    /* renamed from: e  reason: collision with root package name */
    public int f33921e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f33922g;

    public final void a(v vVar, v.a aVar) {
        if (this.f33919c > 0) {
            vVar.d(this.f33920d, this.f33921e, this.f, this.f33922g, aVar);
            this.f33919c = 0;
        }
    }

    public final void b(v vVar, long j10, int i6, int i10, int i11, v.a aVar) {
        boolean z10;
        if (this.f33922g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f33918b) {
                return;
            }
            int i12 = this.f33919c;
            int i13 = i12 + 1;
            this.f33919c = i13;
            if (i12 == 0) {
                this.f33920d = j10;
                this.f33921e = i6;
                this.f = 0;
            }
            this.f += i10;
            this.f33922g = i11;
            if (i13 >= 16) {
                a(vVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(i iVar) {
        char c10;
        if (this.f33918b) {
            return;
        }
        int i6 = 0;
        byte[] bArr = this.f33917a;
        iVar.b(0, bArr, 10);
        iVar.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    i6 = 1;
                }
                if (i6 != 0) {
                    c10 = '\t';
                } else {
                    c10 = '\b';
                }
                i6 = 40 << ((bArr[c10] >> 4) & 7);
            }
        }
        if (i6 == 0) {
            return;
        }
        this.f33918b = true;
    }
}
