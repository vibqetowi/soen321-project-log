package d8;

import java.util.Arrays;
/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f12552a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12553b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12554c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12555d;

    /* renamed from: e  reason: collision with root package name */
    public int f12556e;

    public r(int i6) {
        this.f12552a = i6;
        byte[] bArr = new byte[131];
        this.f12555d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i6, byte[] bArr, int i10) {
        if (!this.f12553b) {
            return;
        }
        int i11 = i10 - i6;
        byte[] bArr2 = this.f12555d;
        int length = bArr2.length;
        int i12 = this.f12556e;
        if (length < i12 + i11) {
            this.f12555d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i6, this.f12555d, this.f12556e, i11);
        this.f12556e += i11;
    }

    public final boolean b(int i6) {
        if (!this.f12553b) {
            return false;
        }
        this.f12556e -= i6;
        this.f12553b = false;
        this.f12554c = true;
        return true;
    }

    public final void c() {
        this.f12553b = false;
        this.f12554c = false;
    }

    public final void d(int i6) {
        boolean z10 = true;
        sc.b.C(!this.f12553b);
        if (i6 != this.f12552a) {
            z10 = false;
        }
        this.f12553b = z10;
        if (z10) {
            this.f12556e = 3;
            this.f12554c = false;
        }
    }
}
