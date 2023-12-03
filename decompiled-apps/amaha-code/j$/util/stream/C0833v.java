package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0833v extends AbstractC0774i2 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21563s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f21564t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0833v(AbstractC0741c abstractC0741c, int i6, Object obj, int i10) {
        super(abstractC0741c, i6);
        this.f21563s = i10;
        this.f21564t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21563s) {
            case 0:
                return new C0829u(this, interfaceC0818r2, 0);
            case 1:
                return new Z(this, interfaceC0818r2, 0);
            case 2:
                return new C0772i0(this, interfaceC0818r2, 0);
            case 3:
                return new C0744c2(this, interfaceC0818r2, 0);
            default:
                return new C0744c2(this, interfaceC0818r2, 1);
        }
    }
}
