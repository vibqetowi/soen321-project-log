package j$.util.stream;
/* loaded from: classes3.dex */
final class A extends D {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21247s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC0741c abstractC0741c, int i6, int i10) {
        super(abstractC0741c, i6);
        this.f21247s = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21247s) {
            case 0:
                return interfaceC0818r2;
            case 1:
                return new Z(this, interfaceC0818r2, 3);
            default:
                return new C0772i0(this, interfaceC0818r2, 1);
        }
    }
}
