package j$.util;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0713a implements S {

    /* renamed from: a  reason: collision with root package name */
    private final List f21117a;

    /* renamed from: b  reason: collision with root package name */
    private int f21118b;

    /* renamed from: c  reason: collision with root package name */
    private int f21119c;

    private C0713a(C0713a c0713a, int i6, int i10) {
        this.f21117a = c0713a.f21117a;
        this.f21118b = i6;
        this.f21119c = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0713a(List list) {
        this.f21117a = list;
        this.f21118b = 0;
        this.f21119c = -1;
    }

    private int a() {
        int i6 = this.f21119c;
        if (i6 < 0) {
            int size = this.f21117a.size();
            this.f21119c = size;
            return size;
        }
        return i6;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return a() - this.f21118b;
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a10 = a();
        this.f21118b = a10;
        for (int i6 = this.f21118b; i6 < a10; i6++) {
            try {
                consumer.accept(this.f21117a.get(i6));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.S
    public final java.util.Comparator getComparator() {
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
        int a10 = a();
        int i6 = this.f21118b;
        if (i6 < a10) {
            this.f21118b = i6 + 1;
            try {
                consumer.accept(this.f21117a.get(i6));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.S
    public final S trySplit() {
        int a10 = a();
        int i6 = this.f21118b;
        int i10 = (a10 + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f21118b = i10;
        return new C0713a(this, i6, i10);
    }
}
