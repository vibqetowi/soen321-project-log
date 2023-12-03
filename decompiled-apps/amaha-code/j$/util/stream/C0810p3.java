package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.AbstractC0714b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.p3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0810p3 implements j$.util.S, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f21533d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final j$.util.S f21534a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f21535b;

    /* renamed from: c  reason: collision with root package name */
    private Object f21536c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0810p3(j$.util.S s10) {
        this(s10, new ConcurrentHashMap());
    }

    private C0810p3(j$.util.S s10, ConcurrentHashMap concurrentHashMap) {
        this.f21534a = s10;
        this.f21535b = concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Consumer consumer, Object obj) {
        if (this.f21535b.putIfAbsent(obj != null ? obj : f21533d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21536c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.S
    public final int characteristics() {
        return (this.f21534a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21534a.estimateSize();
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        this.f21534a.forEachRemaining(new C0801o(6, this, consumer));
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        return this.f21534a.getComparator();
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
        while (this.f21534a.tryAdvance(this)) {
            Object obj = this.f21536c;
            if (obj == null) {
                obj = f21533d;
            }
            if (this.f21535b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f21536c);
                this.f21536c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.S
    public final j$.util.S trySplit() {
        j$.util.S trySplit = this.f21534a.trySplit();
        if (trySplit != null) {
            return new C0810p3(trySplit, this.f21535b);
        }
        return null;
    }
}
