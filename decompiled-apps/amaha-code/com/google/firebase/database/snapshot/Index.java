package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class Index implements Comparator<NamedNode> {
    public static Index fromQueryDefinition(String str) {
        if (str.equals(".value")) {
            return ValueIndex.getInstance();
        }
        if (str.equals(".key")) {
            return KeyIndex.getInstance();
        }
        if (!str.equals(".priority")) {
            return new PathIndex(new Path(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public int compare(NamedNode namedNode, NamedNode namedNode2, boolean z10) {
        if (z10) {
            return compare(namedNode2, namedNode);
        }
        return compare(namedNode, namedNode2);
    }

    public abstract String getQueryDefinition();

    public boolean indexedValueChanged(Node node, Node node2) {
        if (compare(new NamedNode(ChildKey.getMinName(), node), new NamedNode(ChildKey.getMinName(), node2)) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isDefinedOn(Node node);

    public abstract NamedNode makePost(ChildKey childKey, Node node);

    public abstract NamedNode maxPost();

    public NamedNode minPost() {
        return NamedNode.getMinNode();
    }
}
