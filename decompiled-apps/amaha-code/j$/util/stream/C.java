package j$.util.stream;
/* loaded from: classes3.dex */
abstract class C extends E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean V0() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ H parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ H sequential() {
        sequential();
        return this;
    }
}
