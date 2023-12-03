package t;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import t.g;
/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class b<K, V> extends h<K, V> implements Map<K, V>, j$.util.Map {
    public a B;

    public b() {
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.B == null) {
            this.B = new a(this);
        }
        a aVar = this.B;
        if (aVar.f32240a == null) {
            aVar.f32240a = new g.b();
        }
        return aVar.f32240a;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<K> keySet() {
        if (this.B == null) {
            this.B = new a(this);
        }
        a aVar = this.B;
        if (aVar.f32241b == null) {
            aVar.f32241b = new g.c();
        }
        return aVar.f32241b;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        b(map.size() + this.f32260w);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection<V> values() {
        if (this.B == null) {
            this.B = new a(this);
        }
        a aVar = this.B;
        if (aVar.f32242c == null) {
            aVar.f32242c = new g.e();
        }
        return aVar.f32242c;
    }

    public b(int i6) {
        super(i6);
    }

    public b(b bVar) {
        if (bVar != null) {
            j(bVar);
        }
    }
}
