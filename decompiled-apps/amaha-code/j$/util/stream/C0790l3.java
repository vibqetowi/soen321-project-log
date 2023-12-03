package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.l3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0790l3 extends AbstractC0795m3 implements LongConsumer {

    /* renamed from: c  reason: collision with root package name */
    final long[] f21505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0790l3(int i6) {
        this.f21505c = new long[i6];
    }

    @Override // j$.util.stream.AbstractC0795m3
    public final void a(Object obj, long j10) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i6 = 0; i6 < j10; i6++) {
            longConsumer.accept(this.f21505c[i6]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        int i6 = this.f21508b;
        this.f21508b = i6 + 1;
        this.f21505c[i6] = j10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }
}
