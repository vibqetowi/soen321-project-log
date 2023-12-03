package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import j$.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {
    private Comparator<K> comparator;
    private LLRBNode<K, V> root;

    /* loaded from: classes.dex */
    public static class Builder<A, B, C> {
        private final ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator;
        private final List<A> keys;
        private LLRBValueNode<A, C> leaf;
        private LLRBValueNode<A, C> root;
        private final Map<B, C> values;

        /* loaded from: classes.dex */
        public static class Base1_2 implements Iterable<BooleanChunk> {
            private final int length;
            private long value;

            /* renamed from: com.google.firebase.database.collection.RBTreeSortedMap$Builder$Base1_2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Iterator<BooleanChunk>, j$.util.Iterator {
                private int current;

                public AnonymousClass1() {
                    this.current = Base1_2.this.length - 1;
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Iterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public boolean hasNext() {
                    if (this.current >= 0) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public BooleanChunk next() {
                    BooleanChunk booleanChunk = new BooleanChunk();
                    booleanChunk.isOne = (Base1_2.this.value & ((long) (1 << this.current))) == 0;
                    booleanChunk.chunkSize = (int) Math.pow(2.0d, this.current);
                    this.current--;
                    return booleanChunk;
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public void remove() {
                }
            }

            public Base1_2(int i6) {
                int i10 = i6 + 1;
                int floor = (int) Math.floor(Math.log(i10) / Math.log(2.0d));
                this.length = floor;
                this.value = (((long) Math.pow(2.0d, floor)) - 1) & i10;
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<BooleanChunk> iterator() {
                return new AnonymousClass1();
            }
        }

        /* loaded from: classes.dex */
        public static class BooleanChunk {
            public int chunkSize;
            public boolean isOne;
        }

        private Builder(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator) {
            this.keys = list;
            this.values = map;
            this.keyTranslator = keyTranslator;
        }

        private LLRBNode<A, C> buildBalancedTree(int i6, int i10) {
            if (i10 == 0) {
                return LLRBEmptyNode.getInstance();
            }
            if (i10 == 1) {
                A a10 = this.keys.get(i6);
                return new LLRBBlackValueNode(a10, getValue(a10), null, null);
            }
            int i11 = i10 / 2;
            int i12 = i6 + i11;
            LLRBNode<A, C> buildBalancedTree = buildBalancedTree(i6, i11);
            LLRBNode<A, C> buildBalancedTree2 = buildBalancedTree(i12 + 1, i11);
            A a11 = this.keys.get(i12);
            return new LLRBBlackValueNode(a11, getValue(a11), buildBalancedTree, buildBalancedTree2);
        }

        public static <A, B, C> RBTreeSortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            Builder builder = new Builder(list, map, keyTranslator);
            Collections.sort(list, comparator);
            java.util.Iterator<BooleanChunk> it = new Base1_2(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                BooleanChunk next = it.next();
                int i6 = next.chunkSize;
                size -= i6;
                if (next.isOne) {
                    builder.buildPennant(LLRBNode.Color.BLACK, i6, size);
                } else {
                    builder.buildPennant(LLRBNode.Color.BLACK, i6, size);
                    int i10 = next.chunkSize;
                    size -= i10;
                    builder.buildPennant(LLRBNode.Color.RED, i10, size);
                }
            }
            LLRBNode lLRBNode = builder.root;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.getInstance();
            }
            return new RBTreeSortedMap<>(lLRBNode, comparator);
        }

        private void buildPennant(LLRBNode.Color color, int i6, int i10) {
            LLRBValueNode<A, C> lLRBBlackValueNode;
            LLRBNode<A, C> buildBalancedTree = buildBalancedTree(i10 + 1, i6 - 1);
            A a10 = this.keys.get(i10);
            if (color == LLRBNode.Color.RED) {
                lLRBBlackValueNode = new LLRBRedValueNode<>(a10, getValue(a10), null, buildBalancedTree);
            } else {
                lLRBBlackValueNode = new LLRBBlackValueNode<>(a10, getValue(a10), null, buildBalancedTree);
            }
            if (this.root == null) {
                this.root = lLRBBlackValueNode;
                this.leaf = lLRBBlackValueNode;
                return;
            }
            this.leaf.setLeft(lLRBBlackValueNode);
            this.leaf = lLRBBlackValueNode;
        }

        private C getValue(A a10) {
            return this.values.get(this.keyTranslator.translate(a10));
        }
    }

    public static <A, B, C> RBTreeSortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        return Builder.buildFrom(list, map, keyTranslator, comparator);
    }

    public static <A, B> RBTreeSortedMap<A, B> fromMap(Map<A, B> map, Comparator<A> comparator) {
        return Builder.buildFrom(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private LLRBNode<K, V> getNode(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else if (compare == 0) {
                return lLRBNode;
            } else {
                lLRBNode = lLRBNode.getRight();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean containsKey(K k10) {
        if (getNode(k10) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public V get(K k10) {
        LLRBNode<K, V> node = getNode(k10);
        if (node != null) {
            return node.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Comparator<K> getComparator() {
        return this.comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMaxKey() {
        return this.root.getMax().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMinKey() {
        return this.root.getMin().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getPredecessorKey(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare == 0) {
                if (!lLRBNode.getLeft().isEmpty()) {
                    LLRBNode<K, V> left = lLRBNode.getLeft();
                    while (!left.getRight().isEmpty()) {
                        left = left.getRight();
                    }
                    return left.getKey();
                } else if (lLRBNode2 == null) {
                    return null;
                } else {
                    return lLRBNode2.getKey();
                }
            } else if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getRight();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + k10);
    }

    public LLRBNode<K, V> getRoot() {
        return this.root;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getSuccessorKey(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        LLRBNode<K, V> lLRBNode2 = null;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(lLRBNode.getKey(), k10);
            if (compare == 0) {
                if (!lLRBNode.getRight().isEmpty()) {
                    LLRBNode<K, V> right = lLRBNode.getRight();
                    while (!right.getLeft().isEmpty()) {
                        right = right.getLeft();
                    }
                    return right.getKey();
                } else if (lLRBNode2 == null) {
                    return null;
                } else {
                    return lLRBNode2.getKey();
                }
            } else if (compare < 0) {
                lLRBNode = lLRBNode.getRight();
            } else {
                lLRBNode2 = lLRBNode;
                lLRBNode = lLRBNode.getLeft();
            }
        }
        throw new IllegalArgumentException("Couldn't find successor key of non-present key: " + k10);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.root.inOrderTraversal(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int indexOf(K k10) {
        LLRBNode<K, V> lLRBNode = this.root;
        int i6 = 0;
        while (!lLRBNode.isEmpty()) {
            int compare = this.comparator.compare(k10, lLRBNode.getKey());
            if (compare == 0) {
                return lLRBNode.getLeft().size() + i6;
            }
            if (compare < 0) {
                lLRBNode = lLRBNode.getLeft();
            } else {
                lLRBNode = lLRBNode.getRight();
                i6 = lLRBNode.getLeft().size() + 1 + i6;
            }
        }
        return -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> insert(K k10, V v10) {
        return new RBTreeSortedMap(this.root.insert(k10, v10, this.comparator).copy(null, null, LLRBNode.Color.BLACK, null, null), this.comparator);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean isEmpty() {
        return this.root.isEmpty();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public java.util.Iterator<Map.Entry<K, V>> iterator() {
        return new ImmutableSortedMapIterator(this.root, null, this.comparator, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> iteratorFrom(K k10) {
        return new ImmutableSortedMapIterator(this.root, k10, this.comparator, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> remove(K k10) {
        if (!containsKey(k10)) {
            return this;
        }
        return new RBTreeSortedMap(this.root.remove(k10, this.comparator).copy(null, null, LLRBNode.Color.BLACK, null, null), this.comparator);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> reverseIterator() {
        return new ImmutableSortedMapIterator(this.root, null, this.comparator, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public java.util.Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k10) {
        return new ImmutableSortedMapIterator(this.root, k10, this.comparator, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.root.size();
    }

    public RBTreeSortedMap(Comparator<K> comparator) {
        this.root = LLRBEmptyNode.getInstance();
        this.comparator = comparator;
    }

    private RBTreeSortedMap(LLRBNode<K, V> lLRBNode, Comparator<K> comparator) {
        this.root = lLRBNode;
        this.comparator = comparator;
    }
}
