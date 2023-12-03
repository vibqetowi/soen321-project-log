package j$.util.concurrent;

import java.util.Map;
/* loaded from: classes3.dex */
final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f21149a;

    /* renamed from: b  reason: collision with root package name */
    Object f21150b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap f21151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f21149a = obj;
        this.f21150b = obj2;
        this.f21151c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f21149a) || key.equals(obj2)) && (value == (obj3 = this.f21150b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21149a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21150b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21149a.hashCode() ^ this.f21150b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f21150b;
        this.f21150b = obj;
        this.f21151c.put(this.f21149a, obj);
        return obj2;
    }

    public final String toString() {
        return n.a(this.f21149a, this.f21150b);
    }
}
