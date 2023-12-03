package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.j3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0780j3 extends AbstractC0795m3 implements DoubleConsumer {

    /* renamed from: c  reason: collision with root package name */
    final double[] f21499c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0780j3(int i6) {
        this.f21499c = new double[i6];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0795m3
    public final void a(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i6 = 0; i6 < j10; i6++) {
            doubleConsumer.accept(this.f21499c[i6]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i6 = this.f21508b;
        this.f21508b = i6 + 1;
        this.f21499c[i6] = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }
}
