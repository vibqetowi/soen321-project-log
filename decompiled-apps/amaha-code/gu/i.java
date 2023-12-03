package gu;

import j$.util.Iterator;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public final class i extends j {

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final Map.Entry<K, i> f16873u;

        public a(Map.Entry entry) {
            this.f16873u = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16873u.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            i value = this.f16873u.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof n) {
                i value = this.f16873u.getValue();
                n nVar = value.f16876b;
                value.f16876b = (n) obj;
                value.f16875a = true;
                return nVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f16874u;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f16874u = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f16874u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f16874u.next();
            if (next.getValue() instanceof i) {
                return new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.f16874u.remove();
        }
    }

    public final n a() {
        if (this.f16876b == null) {
            synchronized (this) {
                if (this.f16876b == null) {
                    try {
                        this.f16876b = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f16876b;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
