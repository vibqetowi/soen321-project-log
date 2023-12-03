package com.google.firebase.database.snapshot;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import v9.m;
/* loaded from: classes.dex */
public class IndexedNode implements Iterable<NamedNode> {
    private static final ImmutableSortedSet<NamedNode> FALLBACK_INDEX = new ImmutableSortedSet<>(Collections.emptyList(), null);
    private final Index index;
    private ImmutableSortedSet<NamedNode> indexed;
    private final Node node;

    private IndexedNode(Node node, Index index) {
        this.index = index;
        this.node = node;
        this.indexed = null;
    }

    private void ensureIndexed() {
        if (this.indexed == null) {
            if (this.index.equals(KeyIndex.getInstance())) {
                this.indexed = FALLBACK_INDEX;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (NamedNode namedNode : this.node) {
                if (!z10 && !this.index.isDefinedOn(namedNode.getNode())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                arrayList.add(new NamedNode(namedNode.getName(), namedNode.getNode()));
            }
            if (z10) {
                this.indexed = new ImmutableSortedSet<>(arrayList, this.index);
            } else {
                this.indexed = FALLBACK_INDEX;
            }
        }
    }

    public static IndexedNode from(Node node) {
        return new IndexedNode(node, PriorityIndex.getInstance());
    }

    public NamedNode getFirstChild() {
        if (!(this.node instanceof ChildrenNode)) {
            return null;
        }
        ensureIndexed();
        if (m.a(this.indexed, FALLBACK_INDEX)) {
            ChildKey firstChildKey = ((ChildrenNode) this.node).getFirstChildKey();
            return new NamedNode(firstChildKey, this.node.getImmediateChild(firstChildKey));
        }
        return this.indexed.getMinEntry();
    }

    public NamedNode getLastChild() {
        if (!(this.node instanceof ChildrenNode)) {
            return null;
        }
        ensureIndexed();
        if (m.a(this.indexed, FALLBACK_INDEX)) {
            ChildKey lastChildKey = ((ChildrenNode) this.node).getLastChildKey();
            return new NamedNode(lastChildKey, this.node.getImmediateChild(lastChildKey));
        }
        return this.indexed.getMaxEntry();
    }

    public Node getNode() {
        return this.node;
    }

    public ChildKey getPredecessorChildName(ChildKey childKey, Node node, Index index) {
        if (!this.index.equals(KeyIndex.getInstance()) && !this.index.equals(index)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        ensureIndexed();
        if (m.a(this.indexed, FALLBACK_INDEX)) {
            return this.node.getPredecessorChildKey(childKey);
        }
        NamedNode predecessorEntry = this.indexed.getPredecessorEntry(new NamedNode(childKey, node));
        if (predecessorEntry != null) {
            return predecessorEntry.getName();
        }
        return null;
    }

    public boolean hasIndex(Index index) {
        if (this.index == index) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<NamedNode> iterator() {
        ensureIndexed();
        if (m.a(this.indexed, FALLBACK_INDEX)) {
            return this.node.iterator();
        }
        return this.indexed.iterator();
    }

    public Iterator<NamedNode> reverseIterator() {
        ensureIndexed();
        if (m.a(this.indexed, FALLBACK_INDEX)) {
            return this.node.reverseIterator();
        }
        return this.indexed.reverseIterator();
    }

    public IndexedNode updateChild(ChildKey childKey, Node node) {
        Node updateImmediateChild = this.node.updateImmediateChild(childKey, node);
        ImmutableSortedSet<NamedNode> immutableSortedSet = this.indexed;
        ImmutableSortedSet<NamedNode> immutableSortedSet2 = FALLBACK_INDEX;
        if (m.a(immutableSortedSet, immutableSortedSet2) && !this.index.isDefinedOn(node)) {
            return new IndexedNode(updateImmediateChild, this.index, immutableSortedSet2);
        }
        ImmutableSortedSet<NamedNode> immutableSortedSet3 = this.indexed;
        if (immutableSortedSet3 != null && !m.a(immutableSortedSet3, immutableSortedSet2)) {
            ImmutableSortedSet<NamedNode> remove = this.indexed.remove(new NamedNode(childKey, this.node.getImmediateChild(childKey)));
            if (!node.isEmpty()) {
                remove = remove.insert(new NamedNode(childKey, node));
            }
            return new IndexedNode(updateImmediateChild, this.index, remove);
        }
        return new IndexedNode(updateImmediateChild, this.index, null);
    }

    public IndexedNode updatePriority(Node node) {
        return new IndexedNode(this.node.updatePriority(node), this.index, this.indexed);
    }

    public static IndexedNode from(Node node, Index index) {
        return new IndexedNode(node, index);
    }

    private IndexedNode(Node node, Index index, ImmutableSortedSet<NamedNode> immutableSortedSet) {
        this.index = index;
        this.node = node;
        this.indexed = immutableSortedSet;
    }
}
