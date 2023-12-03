package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.k3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0785k3 extends AbstractC0795m3 implements IntConsumer {

    /* renamed from: c  reason: collision with root package name */
    final int[] f21502c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0785k3(int i6) {
        this.f21502c = new int[i6];
    }

    @Override // j$.util.stream.AbstractC0795m3
    public final void a(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i6 = 0; i6 < j10; i6++) {
            intConsumer.accept(this.f21502c[i6]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        int i10 = this.f21508b;
        this.f21508b = i10 + 1;
        this.f21502c[i10] = i6;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }
}
