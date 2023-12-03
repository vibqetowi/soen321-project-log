package j$.util.stream;

import j$.util.Collection$EL;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f21331a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(Collection collection) {
        this.f21331a = collection;
    }

    @Override // j$.util.stream.I0
    public final I0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21331a.size();
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        Collection$EL.a(this.f21331a, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.S(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void j(Object[] objArr, int i6) {
        for (Object obj : this.f21331a) {
            objArr[i6] = obj;
            i6++;
        }
    }

    @Override // j$.util.stream.I0
    public final Object[] k(IntFunction intFunction) {
        Collection collection = this.f21331a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return Collection$EL.stream(this.f21331a).spliterator();
    }

    public final String toString() {
        Collection collection = this.f21331a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
