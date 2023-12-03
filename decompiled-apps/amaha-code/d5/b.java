package d5;
/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends t.b<K, V> {
    public int C;

    @Override // t.h, java.util.Map, j$.util.Map
    public final void clear() {
        this.C = 0;
        super.clear();
    }

    @Override // t.h, java.util.Map, j$.util.Map
    public final int hashCode() {
        if (this.C == 0) {
            this.C = super.hashCode();
        }
        return this.C;
    }

    @Override // t.h
    public final void j(t.b bVar) {
        this.C = 0;
        super.j(bVar);
    }

    @Override // t.h
    public final V k(int i6) {
        this.C = 0;
        return (V) super.k(i6);
    }

    @Override // t.h
    public final V l(int i6, V v10) {
        this.C = 0;
        return (V) super.l(i6, v10);
    }

    @Override // t.h, java.util.Map, j$.util.Map
    public final V put(K k10, V v10) {
        this.C = 0;
        return (V) super.put(k10, v10);
    }
}
