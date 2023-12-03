package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.S;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f extends q implements S {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f21143i;

    /* renamed from: j  reason: collision with root package name */
    long f21144j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i6, int i10, int i11, long j10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i6, i10, i11);
        this.f21143i = concurrentHashMap;
        this.f21144j = j10;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21144j;
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a10 = a();
            if (a10 == null) {
                return;
            }
            consumer.accept(new k(a10.f21153b, a10.f21154c, this.f21143i));
        }
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a10 = a();
        if (a10 == null) {
            return false;
        }
        consumer.accept(new k(a10.f21153b, a10.f21154c, this.f21143i));
        return true;
    }

    @Override // j$.util.S
    public final S trySplit() {
        int i6 = this.f;
        int i10 = this.f21165g;
        int i11 = (i6 + i10) >>> 1;
        if (i11 <= i6) {
            return null;
        }
        l[] lVarArr = this.f21160a;
        int i12 = this.f21166h;
        this.f21165g = i11;
        long j10 = this.f21144j >>> 1;
        this.f21144j = j10;
        return new f(lVarArr, i12, i11, i10, j10, this.f21143i);
    }
}
