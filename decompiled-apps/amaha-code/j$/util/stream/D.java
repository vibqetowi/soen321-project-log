package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class D extends E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean V0() {
        return false;
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
