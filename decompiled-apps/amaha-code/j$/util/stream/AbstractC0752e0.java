package j$.util.stream;
/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0752e0 extends AbstractC0762g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0752e0(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean V0() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
