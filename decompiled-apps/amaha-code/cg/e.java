package cg;
/* compiled from: SimpleToken.java */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    public final short f5276c;

    /* renamed from: d  reason: collision with root package name */
    public final short f5277d;

    public e(g gVar, int i6, int i10) {
        super(gVar);
        this.f5276c = (short) i6;
        this.f5277d = (short) i10;
    }

    @Override // cg.g
    public final void a(dg.a aVar, byte[] bArr) {
        aVar.b(this.f5276c, this.f5277d);
    }

    public final String toString() {
        short s10 = this.f5277d;
        int i6 = (((1 << s10) - 1) & this.f5276c) | (1 << s10);
        return "<" + Integer.toBinaryString((1 << s10) | i6).substring(1) + '>';
    }
}
