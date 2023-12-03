package cg;
/* compiled from: BinaryShiftToken.java */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    public final short f5269c;

    /* renamed from: d  reason: collision with root package name */
    public final short f5270d;

    public b(g gVar, int i6, int i10) {
        super(gVar);
        this.f5269c = (short) i6;
        this.f5270d = (short) i10;
    }

    @Override // cg.g
    public final void a(dg.a aVar, byte[] bArr) {
        int i6 = 0;
        while (true) {
            short s10 = this.f5270d;
            if (i6 < s10) {
                if (i6 == 0 || (i6 == 31 && s10 <= 62)) {
                    aVar.b(31, 5);
                    if (s10 > 62) {
                        aVar.b(s10 - 31, 16);
                    } else if (i6 == 0) {
                        aVar.b(Math.min((int) s10, 31), 5);
                    } else {
                        aVar.b(s10 - 31, 5);
                    }
                }
                aVar.b(bArr[this.f5269c + i6], 8);
                i6++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        short s10 = this.f5269c;
        sb2.append((int) s10);
        sb2.append("::");
        sb2.append((s10 + this.f5270d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
