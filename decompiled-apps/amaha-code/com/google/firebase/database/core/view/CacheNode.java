package com.google.firebase.database.core.view;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes.dex */
public class CacheNode {
    private final boolean filtered;
    private final boolean fullyInitialized;
    private final IndexedNode indexedNode;

    public CacheNode(IndexedNode indexedNode, boolean z10, boolean z11) {
        this.indexedNode = indexedNode;
        this.fullyInitialized = z10;
        this.filtered = z11;
    }

    public IndexedNode getIndexedNode() {
        return this.indexedNode;
    }

    public Node getNode() {
        return this.indexedNode.getNode();
    }

    public boolean isCompleteForChild(ChildKey childKey) {
        if ((isFullyInitialized() && !this.filtered) || this.indexedNode.getNode().hasChild(childKey)) {
            return true;
        }
        return false;
    }

    public boolean isCompleteForPath(Path path) {
        if (path.isEmpty()) {
            if (isFullyInitialized() && !this.filtered) {
                return true;
            }
            return false;
        }
        return isCompleteForChild(path.getFront());
    }

    public boolean isFiltered() {
        return this.filtered;
    }

    public boolean isFullyInitialized() {
        return this.fullyInitialized;
    }
}
