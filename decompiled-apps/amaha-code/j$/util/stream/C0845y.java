package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0845y extends AbstractC0792m0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21590s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f21591t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0845y(AbstractC0741c abstractC0741c, int i6, Object obj, int i10) {
        super(abstractC0741c, i6);
        this.f21590s = i10;
        this.f21591t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21590s) {
            case 0:
                return new C0829u(this, interfaceC0818r2, 3);
            case 1:
                return new Z(this, interfaceC0818r2, 5);
            case 2:
                return new C0772i0(this, interfaceC0818r2, 2);
            case 3:
                return new C0777j0(this, interfaceC0818r2);
            case 4:
                return new C0772i0(this, interfaceC0818r2, 5);
            case 5:
                return new C0772i0(this, interfaceC0818r2, 6);
            case 6:
                return new C0806p(this, interfaceC0818r2);
            default:
                return new C0744c2(this, interfaceC0818r2, 4);
        }
    }
}
