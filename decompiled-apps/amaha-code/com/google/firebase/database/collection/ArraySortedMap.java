package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import j$.util.Iterator;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {
    private final Comparator<K> comparator;
    private final K[] keys;
    private final V[] values;

    /* renamed from: com.google.firebase.database.collection.ArraySortedMap$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {
        int currentPos;
        final /* synthetic */ int val$pos;
        final /* synthetic */ boolean val$reverse;

        public AnonymousClass1(int i6, boolean z10) {
            this.val$pos = i6;
            this.val$reverse = z10;
            this.currentPos = i6;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.val$reverse) {
                if (this.currentPos >= 0) {
                    return true;
                }
            } else if (this.currentPos < ArraySortedMap.this.keys.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Map.Entry<K, V> next() {
            Object obj = ArraySortedMap.this.keys[this.currentPos];
            Object[] objArr = ArraySortedMap.this.values;
            int i6 = this.currentPos;
            Object obj2 = objArr[i6];
            this.currentPos = this.val$reverse ? i6 - 1 : i6 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }
    }

    public ArraySortedMap(Comparator<K> comparator) {
        this.keys = (K[]) new Object[0];
        this.values = (V[]) new Object[0];
        this.comparator = comparator;
    }

    private static <T> T[] addToArray(T[] tArr, int i6, T t3) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i6);
        tArr2[i6] = t3;
        System.arraycopy(tArr, i6, tArr2, i6 + 1, (length - i6) - 1);
        return tArr2;
    }

    public static <A, B, C> ArraySortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i6 = 0;
        for (A a10 : list) {
            objArr[i6] = a10;
            objArr2[i6] = map.get(keyTranslator.translate(a10));
            i6++;
        }
        return new ArraySortedMap<>(comparator, objArr, objArr2);
    }

    private int findKey(K k10) {
        int i6 = 0;
        for (K k11 : this.keys) {
            if (this.comparator.compare(k10, k11) == 0) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private int findKeyOrInsertPosition(K k10) {
        int i6 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i6 >= kArr.length || this.comparator.compare(kArr[i6], k10) >= 0) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public static <K, V> ArraySortedMap<K, V> fromMap(Map<K, V> map, Comparator<K> comparator) {
        return buildFrom(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private java.util.Iterator<Map.Entry<K, V>> iterator(int i6, boolean z10) {
        return new AnonymousClass1(i6, z10);
    }

    private static <T> T[] removeFromArray(T[] tArr, int i6) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i6);
        System.arraycopy(tArr, i6 + 1, tArr2, i6, length - i6);
        return tArr2;
    }

    private static <T> T[] replaceInArray(T[] tArr, int i6, T t3) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i6] = t3;
        return tArr2;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean containsKey(K k10) {
        if (findKey(k10) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public V get(K k10) {
        int findKey = findKey(k10);
        if (findKey != -1) {
            return this.values[findKey];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Comparator<K> getComparator() {
        return this.comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMaxKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMinKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getPredecessorKey(K k10) {
        int findKey = findKey(k10);
        if (findKey != -1) {
            if (findKey > 0) {
                return this.keys[findKey - 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getSuccessorKey(K k10) {
        int findKey = findKey(k10);
        if (findKey != -1) {
            K[] kArr = this.keys;
            if (findKey < kArr.length - 1) {
                return kArr[findKey + 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find successor of nonexistent key");
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        int i6 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i6 < kArr.length) {
                nodeVisitor.visitEntry(kArr[i6], this.values[i6]);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int indexOf(K k10) {
        return findKey(k10);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> insert(K k10, V v10) {
        int findKey = findKey(k10);
        if (findKey != -1) {
            K[] kArr = this.keys;
            if (kArr[findKey] == k10 && this.values[findKey] == v10) {
                return this;
            }
            return new ArraySortedMap(this.comparator, replaceInArray(kArr, findKey, k10), replaceInArray(this.values, findKey, v10));
        } else if (this.keys.length > 25) {
            HashMap hashMap = new HashMap(this.keys.length + 1);
            int i6 = 0;
            while (true) {
                K[] kArr2 = this.keys;
                if (i6 < kArr2.length) {
                    hashMap.put(kArr2[i6], this.values[i6]);
                    i6++;
                } else {
                    hashMap.put(k10, v10);
                    return RBTreeSortedMap.fromMap(hashMap, this.comparator);
                }
            }
        } else {
            int findKeyOrInsertPosition = findKeyOrInsertPosition(k10);
            return new ArraySortedMap(this.comparator, addToArray(this.keys, findKeyOrInsertPosition, k10), addToArray(this.values, findKeyOrInsertPosition, v10));
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean isEmpty() {
        if (this.keys.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> iteratorFrom(K k10) {
        return iterator(findKeyOrInsertPosition(k10), false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> remove(K k10) {
        int findKey = findKey(k10);
        if (findKey == -1) {
            return this;
        }
        return new ArraySortedMap(this.comparator, removeFromArray(this.keys, findKey), removeFromArray(this.values, findKey));
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> reverseIterator() {
        return iterator(this.keys.length - 1, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k10) {
        int findKeyOrInsertPosition = findKeyOrInsertPosition(k10);
        K[] kArr = this.keys;
        if (findKeyOrInsertPosition < kArr.length && this.comparator.compare(kArr[findKeyOrInsertPosition], k10) == 0) {
            return iterator(findKeyOrInsertPosition, true);
        }
        return iterator(findKeyOrInsertPosition - 1, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.keys.length;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public java.util.Iterator<Map.Entry<K, V>> iterator() {
        return iterator(0, false);
    }

    private ArraySortedMap(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.keys = kArr;
        this.values = vArr;
        this.comparator = comparator;
    }
}
