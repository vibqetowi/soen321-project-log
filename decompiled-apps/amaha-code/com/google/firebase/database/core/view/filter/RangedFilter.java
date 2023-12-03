package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.Path;
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
public class RangedFilter implements NodeFilter {
    private final NamedNode endPost;
    private final Index index;
    private final IndexedFilter indexedFilter;
    private final NamedNode startPost;

    public RangedFilter(QueryParams queryParams) {
        this.indexedFilter = new IndexedFilter(queryParams.getIndex());
        this.index = queryParams.getIndex();
        this.startPost = getStartPost(queryParams);
        this.endPost = getEndPost(queryParams);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public boolean filtersNodes() {
        return true;
    }

    public NamedNode getEndPost() {
        return this.endPost;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public Index getIndex() {
        return this.index;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public NodeFilter getIndexedFilter() {
        return this.indexedFilter;
    }

    public NamedNode getStartPost() {
        return this.startPost;
    }

    public boolean matches(NamedNode namedNode) {
        if (this.index.compare(getStartPost(), namedNode) <= 0 && this.index.compare(namedNode, getEndPost()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateChild(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        if (!matches(new NamedNode(childKey, node))) {
            node = EmptyNode.Empty();
        }
        return this.indexedFilter.updateChild(indexedNode, childKey, node, path, completeChildSource, childChangeAccumulator);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateFullNode(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        IndexedNode indexedNode3;
        if (indexedNode2.getNode().isLeafNode()) {
            indexedNode3 = IndexedNode.from(EmptyNode.Empty(), this.index);
        } else {
            IndexedNode updatePriority = indexedNode2.updatePriority(PriorityUtilities.NullPriority());
            Iterator<NamedNode> it = indexedNode2.iterator();
            while (it.hasNext()) {
                NamedNode next = it.next();
                if (!matches(next)) {
                    updatePriority = updatePriority.updateChild(next.getName(), EmptyNode.Empty());
                }
            }
            indexedNode3 = updatePriority;
        }
        return this.indexedFilter.updateFullNode(indexedNode, indexedNode3, childChangeAccumulator);
    }

    private static NamedNode getEndPost(QueryParams queryParams) {
        if (queryParams.hasEnd()) {
            return queryParams.getIndex().makePost(queryParams.getIndexEndName(), queryParams.getIndexEndValue());
        }
        return queryParams.getIndex().maxPost();
    }

    private static NamedNode getStartPost(QueryParams queryParams) {
        if (queryParams.hasStart()) {
            return queryParams.getIndex().makePost(queryParams.getIndexStartName(), queryParams.getIndexStartValue());
        }
        return queryParams.getIndex().minPost();
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updatePriority(IndexedNode indexedNode, Node node) {
        return indexedNode;
    }
}
