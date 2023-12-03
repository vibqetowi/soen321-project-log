package com.google.firebase.database.snapshot;
/* loaded from: classes.dex */
public class ValueIndex extends Index {
    private static final ValueIndex INSTANCE = new ValueIndex();

    private ValueIndex() {
    }

    public static ValueIndex getInstance() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof ValueIndex;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public String getQueryDefinition() {
        return ".value";
    }

    public int hashCode() {
        return 4;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public boolean isDefinedOn(Node node) {
        return true;
    }

    @Override // com.google.firebase.database.snapshot.Index
    public NamedNode makePost(ChildKey childKey, Node node) {
        return new NamedNode(childKey, node);
    }

    @Override // com.google.firebase.database.snapshot.Index
    public NamedNode maxPost() {
        return new NamedNode(ChildKey.getMaxName(), Node.MAX_NODE);
    }

    public String toString() {
        return "ValueIndex";
    }

    @Override // java.util.Comparator
    public int compare(NamedNode namedNode, NamedNode namedNode2) {
        int compareTo = namedNode.getNode().compareTo(namedNode2.getNode());
        return compareTo == 0 ? namedNode.getName().compareTo(namedNode2.getName()) : compareTo;
    }
}
