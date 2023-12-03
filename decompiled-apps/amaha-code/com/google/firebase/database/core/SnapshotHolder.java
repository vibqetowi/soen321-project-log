package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes.dex */
public class SnapshotHolder {
    private Node rootNode;

    public SnapshotHolder() {
        this.rootNode = EmptyNode.Empty();
    }

    public Node getNode(Path path) {
        return this.rootNode.getChild(path);
    }

    public Node getRootNode() {
        return this.rootNode;
    }

    public void update(Path path, Node node) {
        this.rootNode = this.rootNode.updateChild(path, node);
    }

    public SnapshotHolder(Node node) {
        this.rootNode = node;
    }
}
