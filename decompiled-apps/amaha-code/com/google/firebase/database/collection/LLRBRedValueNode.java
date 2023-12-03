package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
/* loaded from: classes.dex */
public class LLRBRedValueNode<K, V> extends LLRBValueNode<K, V> {
    public LLRBRedValueNode(K k10, V v10) {
        super(k10, v10, LLRBEmptyNode.getInstance(), LLRBEmptyNode.getInstance());
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public LLRBValueNode<K, V> copy(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k10 == null) {
            k10 = getKey();
        }
        if (v10 == null) {
            v10 = getValue();
        }
        if (lLRBNode == null) {
            lLRBNode = getLeft();
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = getRight();
        }
        return new LLRBRedValueNode(k10, v10, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public LLRBNode.Color getColor() {
        return LLRBNode.Color.RED;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean isRed() {
        return true;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int size() {
        return getRight().size() + getLeft().size() + 1;
    }

    public LLRBRedValueNode(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k10, v10, lLRBNode, lLRBNode2);
    }
}
