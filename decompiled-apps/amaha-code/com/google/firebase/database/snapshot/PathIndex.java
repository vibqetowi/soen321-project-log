package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
/* loaded from: classes.dex */
public final class PathIndex extends Index {
    private final Path indexPath;

    public PathIndex(Path path) {
        if (path.size() == 1 && path.getFront().isPriorityChildName()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.indexPath = path;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathIndex.class == obj.getClass() && this.indexPath.equals(((PathIndex) obj).indexPath)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public String getQueryDefinition() {
        return this.indexPath.wireFormat();
    }

    public int hashCode() {
        return this.indexPath.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.Index
    public boolean isDefinedOn(Node node) {
        return !node.getChild(this.indexPath).isEmpty();
    }

    @Override // com.google.firebase.database.snapshot.Index
    public NamedNode makePost(ChildKey childKey, Node node) {
        return new NamedNode(childKey, EmptyNode.Empty().updateChild(this.indexPath, node));
    }

    @Override // com.google.firebase.database.snapshot.Index
    public NamedNode maxPost() {
        return new NamedNode(ChildKey.getMaxName(), EmptyNode.Empty().updateChild(this.indexPath, Node.MAX_NODE));
    }

    @Override // java.util.Comparator
    public int compare(NamedNode namedNode, NamedNode namedNode2) {
        int compareTo = namedNode.getNode().getChild(this.indexPath).compareTo(namedNode2.getNode().getChild(this.indexPath));
        return compareTo == 0 ? namedNode.getName().compareTo(namedNode2.getName()) : compareTo;
    }
}
