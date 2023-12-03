package n;

import java.util.HashMap;
import n.b;
/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f25761y = new HashMap<>();

    @Override // n.b
    public final b.c<K, V> e(K k10) {
        return this.f25761y.get(k10);
    }

    @Override // n.b
    public final V g(K k10, V v10) {
        b.c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f25767v;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f25761y;
        b.c<K, V> cVar = new b.c<>(k10, v10);
        this.f25765x++;
        b.c<K, V> cVar2 = this.f25763v;
        if (cVar2 == null) {
            this.f25762u = cVar;
            this.f25763v = cVar;
        } else {
            cVar2.f25768w = cVar;
            cVar.f25769x = cVar2;
            this.f25763v = cVar;
        }
        hashMap.put(k10, cVar);
        return null;
    }

    @Override // n.b
    public final V m(K k10) {
        V v10 = (V) super.m(k10);
        this.f25761y.remove(k10);
        return v10;
    }
}
