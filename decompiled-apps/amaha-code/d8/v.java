package d8;
/* compiled from: PsDurationReader.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public boolean f12575c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12576d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12577e;

    /* renamed from: a  reason: collision with root package name */
    public final c9.v f12573a = new c9.v(0);
    public long f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f12578g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f12579h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12574b = new c9.q();

    public static int b(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }

    public static long c(c9.q qVar) {
        int i6 = qVar.f5187b;
        if (qVar.f5188c - i6 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        qVar.b(0, bArr, 9);
        qVar.A(i6);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(u7.i iVar) {
        byte[] bArr = c9.w.f;
        c9.q qVar = this.f12574b;
        qVar.getClass();
        qVar.y(bArr, bArr.length);
        this.f12575c = true;
        iVar.k();
    }
}
