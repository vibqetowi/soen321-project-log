package com.google.firebase.database.collection;

import java.util.Comparator;
/* loaded from: classes.dex */
public interface LLRBNode<K, V> {

    /* loaded from: classes.dex */
    public enum Color {
        RED,
        BLACK
    }

    /* loaded from: classes.dex */
    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
        @Override // com.google.firebase.database.collection.LLRBNode.ShortCircuitingNodeVisitor
        public boolean shouldContinue(K k10, V v10) {
            visitEntry(k10, v10);
            return true;
        }

        public abstract void visitEntry(K k10, V v10);
    }

    /* loaded from: classes.dex */
    public interface ShortCircuitingNodeVisitor<K, V> {
        boolean shouldContinue(K k10, V v10);
    }

    LLRBNode<K, V> copy(K k10, V v10, Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    K getKey();

    LLRBNode<K, V> getLeft();

    LLRBNode<K, V> getMax();

    LLRBNode<K, V> getMin();

    LLRBNode<K, V> getRight();

    V getValue();

    void inOrderTraversal(NodeVisitor<K, V> nodeVisitor);

    LLRBNode<K, V> insert(K k10, V v10, Comparator<K> comparator);

    boolean isEmpty();

    boolean isRed();

    LLRBNode<K, V> remove(K k10, Comparator<K> comparator);

    boolean shortCircuitingInOrderTraversal(ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor);

    boolean shortCircuitingReverseOrderTraversal(ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor);

    int size();
}
