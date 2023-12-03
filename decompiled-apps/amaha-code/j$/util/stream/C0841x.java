package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0841x extends AbstractC0757f0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21584s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f21585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0841x(AbstractC0741c abstractC0741c, int i6, Object obj, int i10) {
        super(abstractC0741c, i6);
        this.f21584s = i10;
        this.f21585t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21584s) {
            case 0:
                return new C0829u(this, interfaceC0818r2, 2);
            case 1:
                return new Z(this, interfaceC0818r2, 1);
            case 2:
                return new Z(this, interfaceC0818r2, 4);
            case 3:
                return new C0737b0(this, interfaceC0818r2);
            case 4:
                return new Z(this, interfaceC0818r2, 7);
            case 5:
                return new C0772i0(this, interfaceC0818r2, 3);
            case 6:
                return new C0744c2(this, interfaceC0818r2, 3);
            default:
                return new C0806p(this, interfaceC0818r2);
        }
    }
}
