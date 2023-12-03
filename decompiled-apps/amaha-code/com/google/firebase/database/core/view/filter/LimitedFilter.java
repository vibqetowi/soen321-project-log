package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.PriorityUtilities;
import java.util.Iterator;
/* loaded from: classes.dex */
public class LimitedFilter implements NodeFilter {
    private final Index index;
    private final int limit;
    private final RangedFilter rangedFilter;
    private final boolean reverse;

    public LimitedFilter(QueryParams queryParams) {
        this.rangedFilter = new RangedFilter(queryParams);
        this.index = queryParams.getIndex();
        this.limit = queryParams.getLimit();
        this.reverse = !queryParams.isViewFromLeft();
    }

    private IndexedNode fullLimitUpdateChild(IndexedNode indexedNode, ChildKey childKey, Node node, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        boolean z10;
        NamedNode lastChild;
        int compare;
        boolean z11;
        boolean z12 = false;
        if (indexedNode.getNode().getChildCount() == this.limit) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.hardAssert(z10);
        NamedNode namedNode = new NamedNode(childKey, node);
        if (this.reverse) {
            lastChild = indexedNode.getFirstChild();
        } else {
            lastChild = indexedNode.getLastChild();
        }
        boolean matches = this.rangedFilter.matches(namedNode);
        if (indexedNode.getNode().hasChild(childKey)) {
            Node immediateChild = indexedNode.getNode().getImmediateChild(childKey);
            NamedNode childAfterChild = completeChildSource.getChildAfterChild(this.index, lastChild, this.reverse);
            while (childAfterChild != null && (childAfterChild.getName().equals(childKey) || indexedNode.getNode().hasChild(childAfterChild.getName()))) {
                childAfterChild = completeChildSource.getChildAfterChild(this.index, childAfterChild, this.reverse);
            }
            if (childAfterChild == null) {
                compare = 1;
            } else {
                compare = this.index.compare(childAfterChild, namedNode, this.reverse);
            }
            if (matches && !node.isEmpty() && compare >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (childChangeAccumulator != null) {
                    childChangeAccumulator.trackChildChange(Change.childChangedChange(childKey, node, immediateChild));
                }
                return indexedNode.updateChild(childKey, node);
            }
            if (childChangeAccumulator != null) {
                childChangeAccumulator.trackChildChange(Change.childRemovedChange(childKey, immediateChild));
            }
            IndexedNode updateChild = indexedNode.updateChild(childKey, EmptyNode.Empty());
            if (childAfterChild != null && this.rangedFilter.matches(childAfterChild)) {
                z12 = true;
            }
            if (z12) {
                if (childChangeAccumulator != null) {
                    childChangeAccumulator.trackChildChange(Change.childAddedChange(childAfterChild.getName(), childAfterChild.getNode()));
                }
                return updateChild.updateChild(childAfterChild.getName(), childAfterChild.getNode());
            }
            return updateChild;
        } else if (node.isEmpty()) {
            return indexedNode;
        } else {
            if (matches && this.index.compare(lastChild, namedNode, this.reverse) >= 0) {
                if (childChangeAccumulator != null) {
                    childChangeAccumulator.trackChildChange(Change.childRemovedChange(lastChild.getName(), lastChild.getNode()));
                    childChangeAccumulator.trackChildChange(Change.childAddedChange(childKey, node));
                }
                return indexedNode.updateChild(childKey, node).updateChild(lastChild.getName(), EmptyNode.Empty());
            }
            return indexedNode;
        }
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public boolean filtersNodes() {
        return true;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public Index getIndex() {
        return this.index;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public NodeFilter getIndexedFilter() {
        return this.rangedFilter.getIndexedFilter();
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateChild(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        if (!this.rangedFilter.matches(new NamedNode(childKey, node))) {
            node = EmptyNode.Empty();
        }
        Node node2 = node;
        if (indexedNode.getNode().getImmediateChild(childKey).equals(node2)) {
            return indexedNode;
        }
        if (indexedNode.getNode().getChildCount() < this.limit) {
            return this.rangedFilter.getIndexedFilter().updateChild(indexedNode, childKey, node2, path, completeChildSource, childChangeAccumulator);
        }
        return fullLimitUpdateChild(indexedNode, childKey, node2, completeChildSource, childChangeAccumulator);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateFullNode(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        IndexedNode from;
        Iterator<NamedNode> it;
        NamedNode startPost;
        NamedNode endPost;
        int i6;
        boolean z10;
        if (!indexedNode2.getNode().isLeafNode() && !indexedNode2.getNode().isEmpty()) {
            from = indexedNode2.updatePriority(PriorityUtilities.NullPriority());
            if (this.reverse) {
                it = indexedNode2.reverseIterator();
                startPost = this.rangedFilter.getEndPost();
                endPost = this.rangedFilter.getStartPost();
                i6 = -1;
            } else {
                it = indexedNode2.iterator();
                startPost = this.rangedFilter.getStartPost();
                endPost = this.rangedFilter.getEndPost();
                i6 = 1;
            }
            boolean z11 = false;
            int i10 = 0;
            while (it.hasNext()) {
                NamedNode next = it.next();
                if (!z11 && this.index.compare(startPost, next) * i6 <= 0) {
                    z11 = true;
                }
                if (z11 && i10 < this.limit && this.index.compare(next, endPost) * i6 <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10++;
                } else {
                    from = from.updateChild(next.getName(), EmptyNode.Empty());
                }
            }
        } else {
            from = IndexedNode.from(EmptyNode.Empty(), this.index);
        }
        return this.rangedFilter.getIndexedFilter().updateFullNode(indexedNode, from, childChangeAccumulator);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updatePriority(IndexedNode indexedNode, Node node) {
        return indexedNode;
    }
}
