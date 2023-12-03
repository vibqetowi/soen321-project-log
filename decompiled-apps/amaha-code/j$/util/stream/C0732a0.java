package j$.util.stream;
/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0732a0 extends AbstractC0792m0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21419s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0732a0(AbstractC0741c abstractC0741c, int i6, int i10) {
        super(abstractC0741c, i6);
        this.f21419s = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21419s) {
            case 0:
                return new Z(this, interfaceC0818r2, 2);
            default:
                return interfaceC0818r2;
        }
    }
}
