package com.google.protobuf;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final Map.Entry<K, c0> f9891u;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f9891u = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f9891u.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            c0 value = this.f9891u.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof q0) {
                c0 value = this.f9891u.getValue();
                q0 q0Var = value.f9898a;
                value.f9899b = null;
                value.f9898a = (q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f9892u;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f9892u = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f9892u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f9892u.next();
            if (next.getValue() instanceof c0) {
                return new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.f9892u.remove();
        }
    }

    @Override // com.google.protobuf.d0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.google.protobuf.d0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
