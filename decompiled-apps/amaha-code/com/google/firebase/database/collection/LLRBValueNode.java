package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {
    private final K key;
    private LLRBNode<K, V> left;
    private final LLRBNode<K, V> right;
    private final V value;

    public LLRBValueNode(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.key = k10;
        this.value = v10;
        this.left = lLRBNode == null ? LLRBEmptyNode.getInstance() : lLRBNode;
        this.right = lLRBNode2 == null ? LLRBEmptyNode.getInstance() : lLRBNode2;
    }

    private LLRBValueNode<K, V> colorFlip() {
        LLRBNode<K, V> lLRBNode = this.left;
        LLRBNode<K, V> copy = lLRBNode.copy(null, null, oppositeColor(lLRBNode), null, null);
        LLRBNode<K, V> lLRBNode2 = this.right;
        return copy((LLRBValueNode<K, V>) null, (K) null, oppositeColor(this), (LLRBNode<LLRBValueNode<K, V>, K>) copy, (LLRBNode<LLRBValueNode<K, V>, K>) lLRBNode2.copy(null, null, oppositeColor(lLRBNode2), null, null));
    }

    private LLRBValueNode<K, V> fixUp() {
        LLRBValueNode<K, V> lLRBValueNode;
        if (this.right.isRed() && !this.left.isRed()) {
            lLRBValueNode = rotateLeft();
        } else {
            lLRBValueNode = this;
        }
        if (lLRBValueNode.left.isRed() && ((LLRBValueNode) lLRBValueNode.left).left.isRed()) {
            lLRBValueNode = lLRBValueNode.rotateRight();
        }
        if (lLRBValueNode.left.isRed() && lLRBValueNode.right.isRed()) {
            return lLRBValueNode.colorFlip();
        }
        return lLRBValueNode;
    }

    private LLRBValueNode<K, V> moveRedLeft() {
        LLRBValueNode<K, V> colorFlip = colorFlip();
        if (colorFlip.getRight().getLeft().isRed()) {
            return colorFlip.copy(null, null, null, ((LLRBValueNode) colorFlip.getRight()).rotateRight()).rotateLeft().colorFlip();
        }
        return colorFlip;
    }

    private LLRBValueNode<K, V> moveRedRight() {
        LLRBValueNode<K, V> colorFlip = colorFlip();
        if (colorFlip.getLeft().getLeft().isRed()) {
            return colorFlip.rotateRight().colorFlip();
        }
        return colorFlip;
    }

    private static LLRBNode.Color oppositeColor(LLRBNode lLRBNode) {
        if (lLRBNode.isRed()) {
            return LLRBNode.Color.BLACK;
        }
        return LLRBNode.Color.RED;
    }

    private LLRBNode<K, V> removeMin() {
        LLRBValueNode<K, V> lLRBValueNode;
        if (this.left.isEmpty()) {
            return LLRBEmptyNode.getInstance();
        }
        if (!getLeft().isRed() && !getLeft().getLeft().isRed()) {
            lLRBValueNode = moveRedLeft();
        } else {
            lLRBValueNode = this;
        }
        return lLRBValueNode.copy(null, null, ((LLRBValueNode) lLRBValueNode.left).removeMin(), null).fixUp();
    }

    private LLRBValueNode<K, V> rotateLeft() {
        return (LLRBValueNode) this.right.copy(null, null, getColor(), copy((LLRBValueNode<K, V>) null, (K) null, LLRBNode.Color.RED, (LLRBNode<LLRBValueNode<K, V>, K>) null, (LLRBNode<LLRBValueNode<K, V>, K>) ((LLRBValueNode) this.right).left), null);
    }

    private LLRBValueNode<K, V> rotateRight() {
        return (LLRBValueNode) this.left.copy(null, null, getColor(), null, copy((LLRBValueNode<K, V>) null, (K) null, LLRBNode.Color.RED, (LLRBNode<LLRBValueNode<K, V>, K>) ((LLRBValueNode) this.left).right, (LLRBNode<LLRBValueNode<K, V>, K>) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.database.collection.LLRBNode
    public /* bridge */ /* synthetic */ LLRBNode copy(Object obj, Object obj2, LLRBNode.Color color, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        return copy((LLRBValueNode<K, V>) obj, obj2, color, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode2);
    }

    public abstract LLRBValueNode<K, V> copy(K k10, V v10, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    public abstract LLRBNode.Color getColor();

    @Override // com.google.firebase.database.collection.LLRBNode
    public K getKey() {
        return this.key;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> getLeft() {
        return this.left;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> getMax() {
        if (this.right.isEmpty()) {
            return this;
        }
        return this.right.getMax();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> getMin() {
        if (this.left.isEmpty()) {
            return this;
        }
        return this.left.getMin();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> getRight() {
        return this.right;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public V getValue() {
        return this.value;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.left.inOrderTraversal(nodeVisitor);
        nodeVisitor.visitEntry(this.key, this.value);
        this.right.inOrderTraversal(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> insert(K k10, V v10, Comparator<K> comparator) {
        LLRBValueNode<K, V> copy;
        int compare = comparator.compare(k10, this.key);
        if (compare < 0) {
            copy = copy(null, null, this.left.insert(k10, v10, comparator), null);
        } else if (compare == 0) {
            copy = copy(k10, v10, null, null);
        } else {
            copy = copy(null, null, null, this.right.insert(k10, v10, comparator));
        }
        return copy.fixUp();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> remove(K k10, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNode;
        LLRBValueNode<K, V> copy;
        LLRBValueNode<K, V> lLRBValueNode2;
        if (comparator.compare(k10, this.key) < 0) {
            if (!this.left.isEmpty() && !this.left.isRed() && !((LLRBValueNode) this.left).left.isRed()) {
                lLRBValueNode2 = moveRedLeft();
            } else {
                lLRBValueNode2 = this;
            }
            copy = lLRBValueNode2.copy(null, null, lLRBValueNode2.left.remove(k10, comparator), null);
        } else {
            if (this.left.isRed()) {
                lLRBValueNode = rotateRight();
            } else {
                lLRBValueNode = this;
            }
            if (!lLRBValueNode.right.isEmpty() && !lLRBValueNode.right.isRed() && !((LLRBValueNode) lLRBValueNode.right).left.isRed()) {
                lLRBValueNode = lLRBValueNode.moveRedRight();
            }
            if (comparator.compare(k10, lLRBValueNode.key) == 0) {
                if (lLRBValueNode.right.isEmpty()) {
                    return LLRBEmptyNode.getInstance();
                }
                LLRBNode<K, V> min = lLRBValueNode.right.getMin();
                lLRBValueNode = lLRBValueNode.copy(min.getKey(), min.getValue(), null, ((LLRBValueNode) lLRBValueNode.right).removeMin());
            }
            copy = lLRBValueNode.copy(null, null, null, lLRBValueNode.right.remove(k10, comparator));
        }
        return copy.fixUp();
    }

    public void setLeft(LLRBNode<K, V> lLRBNode) {
        this.left = lLRBNode;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.left.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return this.right.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.right.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return this.left.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBValueNode<K, V> copy(K k10, V v10, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k10 == null) {
            k10 = this.key;
        }
        if (v10 == null) {
            v10 = this.value;
        }
        if (lLRBNode == null) {
            lLRBNode = this.left;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.right;
        }
        if (color == LLRBNode.Color.RED) {
            return new LLRBRedValueNode(k10, v10, lLRBNode, lLRBNode2);
        }
        return new LLRBBlackValueNode(k10, v10, lLRBNode, lLRBNode2);
    }
}
