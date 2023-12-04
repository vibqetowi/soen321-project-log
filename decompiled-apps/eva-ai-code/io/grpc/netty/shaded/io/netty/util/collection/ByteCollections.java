package io.grpc.netty.shaded.io.netty.util.collection;

import io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes4.dex */
public final class ByteCollections {
    private static final ByteObjectMap<Object> EMPTY_MAP = new EmptyMap();

    private ByteCollections() {
    }

    public static <V> ByteObjectMap<V> emptyMap() {
        return (ByteObjectMap<V>) EMPTY_MAP;
    }

    public static <V> ByteObjectMap<V> unmodifiableMap(ByteObjectMap<V> byteObjectMap) {
        return new UnmodifiableMap(byteObjectMap);
    }

    /* loaded from: classes4.dex */
    private static final class EmptyMap implements ByteObjectMap<Object> {
        @Override // java.util.Map
        public void clear() {
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public boolean containsKey(byte b) {
            return false;
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return false;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return false;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public Object get(byte b) {
            return null;
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return null;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return true;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public Object remove(byte b) {
            return null;
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            return null;
        }

        @Override // java.util.Map
        public int size() {
            return 0;
        }

        private EmptyMap() {
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public Object put(byte b, Object obj) {
            throw new UnsupportedOperationException("put");
        }

        @Override // java.util.Map
        public Set<Byte> keySet() {
            return Collections.emptySet();
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public Iterable<ByteObjectMap.PrimitiveEntry<Object>> entries() {
            return Collections.emptySet();
        }

        @Override // java.util.Map
        public Object put(Byte b, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends Byte, ?> map) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Collection<Object> values() {
            return Collections.emptyList();
        }

        @Override // java.util.Map
        public Set<Map.Entry<Byte, Object>> entrySet() {
            return Collections.emptySet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class UnmodifiableMap<V> implements ByteObjectMap<V> {
        private Iterable<ByteObjectMap.PrimitiveEntry<V>> entries;
        private Set<Map.Entry<Byte, V>> entrySet;
        private Set<Byte> keySet;
        private final ByteObjectMap<V> map;
        private Collection<V> values;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object put(Byte b, Object obj) {
            return put2(b, (Byte) obj);
        }

        UnmodifiableMap(ByteObjectMap<V> byteObjectMap) {
            this.map = byteObjectMap;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public V get(byte b) {
            return this.map.get(b);
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public V put(byte b, V v) {
            throw new UnsupportedOperationException("put");
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public V remove(byte b) {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.util.Map
        public int size() {
            return this.map.size();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("clear");
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public boolean containsKey(byte b) {
            return this.map.containsKey(b);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.map.get(obj);
        }

        /* renamed from: put  reason: avoid collision after fix types in other method */
        public V put2(Byte b, V v) {
            throw new UnsupportedOperationException("put");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends Byte, ? extends V> map) {
            throw new UnsupportedOperationException("putAll");
        }

        @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap
        public Iterable<ByteObjectMap.PrimitiveEntry<V>> entries() {
            if (this.entries == null) {
                this.entries = new Iterable<ByteObjectMap.PrimitiveEntry<V>>() { // from class: io.grpc.netty.shaded.io.netty.util.collection.ByteCollections.UnmodifiableMap.1
                    @Override // java.lang.Iterable
                    public Iterator<ByteObjectMap.PrimitiveEntry<V>> iterator() {
                        UnmodifiableMap unmodifiableMap = UnmodifiableMap.this;
                        return new IteratorImpl(unmodifiableMap.map.entries().iterator());
                    }
                };
            }
            return this.entries;
        }

        @Override // java.util.Map
        public Set<Byte> keySet() {
            if (this.keySet == null) {
                this.keySet = Collections.unmodifiableSet(this.map.keySet());
            }
            return this.keySet;
        }

        @Override // java.util.Map
        public Set<Map.Entry<Byte, V>> entrySet() {
            if (this.entrySet == null) {
                this.entrySet = Collections.unmodifiableSet(this.map.entrySet());
            }
            return this.entrySet;
        }

        @Override // java.util.Map
        public Collection<V> values() {
            if (this.values == null) {
                this.values = Collections.unmodifiableCollection(this.map.values());
            }
            return this.values;
        }

        /* loaded from: classes4.dex */
        private class IteratorImpl implements Iterator<ByteObjectMap.PrimitiveEntry<V>> {
            final Iterator<ByteObjectMap.PrimitiveEntry<V>> iter;

            IteratorImpl(Iterator<ByteObjectMap.PrimitiveEntry<V>> it) {
                this.iter = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.Iterator
            public ByteObjectMap.PrimitiveEntry<V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return new EntryImpl(this.iter.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class EntryImpl implements ByteObjectMap.PrimitiveEntry<V> {
            private final ByteObjectMap.PrimitiveEntry<V> entry;

            EntryImpl(ByteObjectMap.PrimitiveEntry<V> primitiveEntry) {
                this.entry = primitiveEntry;
            }

            @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap.PrimitiveEntry
            public byte key() {
                return this.entry.key();
            }

            @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap.PrimitiveEntry
            public V value() {
                return this.entry.value();
            }

            @Override // io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap.PrimitiveEntry
            public void setValue(V v) {
                throw new UnsupportedOperationException("setValue");
            }
        }
    }
}
