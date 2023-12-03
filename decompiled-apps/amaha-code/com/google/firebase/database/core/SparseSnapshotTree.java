package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.Node;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SparseSnapshotTree {
    private Node value = null;
    private Map<ChildKey, SparseSnapshotTree> children = null;

    /* loaded from: classes.dex */
    public interface SparseSnapshotChildVisitor {
        void visitChild(ChildKey childKey, SparseSnapshotTree sparseSnapshotTree);
    }

    /* loaded from: classes.dex */
    public interface SparseSnapshotTreeVisitor {
        void visitTree(Path path, Node node);
    }

    public void forEachChild(SparseSnapshotChildVisitor sparseSnapshotChildVisitor) {
        Map<ChildKey, SparseSnapshotTree> map = this.children;
        if (map != null) {
            for (Map.Entry<ChildKey, SparseSnapshotTree> entry : map.entrySet()) {
                sparseSnapshotChildVisitor.visitChild(entry.getKey(), entry.getValue());
            }
        }
    }

    public void forEachTree(final Path path, final SparseSnapshotTreeVisitor sparseSnapshotTreeVisitor) {
        Node node = this.value;
        if (node != null) {
            sparseSnapshotTreeVisitor.visitTree(path, node);
        } else {
            forEachChild(new SparseSnapshotChildVisitor() { // from class: com.google.firebase.database.core.SparseSnapshotTree.2
                @Override // com.google.firebase.database.core.SparseSnapshotTree.SparseSnapshotChildVisitor
                public void visitChild(ChildKey childKey, SparseSnapshotTree sparseSnapshotTree) {
                    sparseSnapshotTree.forEachTree(path.child(childKey), sparseSnapshotTreeVisitor);
                }
            });
        }
    }

    public boolean forget(final Path path) {
        if (path.isEmpty()) {
            this.value = null;
            this.children = null;
            return true;
        }
        Node node = this.value;
        if (node != null) {
            if (node.isLeafNode()) {
                return false;
            }
            this.value = null;
            ((ChildrenNode) this.value).forEachChild(new ChildrenNode.ChildVisitor() { // from class: com.google.firebase.database.core.SparseSnapshotTree.1
                @Override // com.google.firebase.database.snapshot.ChildrenNode.ChildVisitor
                public void visitChild(ChildKey childKey, Node node2) {
                    SparseSnapshotTree.this.remember(path.child(childKey), node2);
                }
            });
            return forget(path);
        } else if (this.children == null) {
            return true;
        } else {
            ChildKey front = path.getFront();
            Path popFront = path.popFront();
            if (this.children.containsKey(front) && this.children.get(front).forget(popFront)) {
                this.children.remove(front);
            }
            if (!this.children.isEmpty()) {
                return false;
            }
            this.children = null;
            return true;
        }
    }

    public void remember(Path path, Node node) {
        if (path.isEmpty()) {
            this.value = node;
            this.children = null;
            return;
        }
        Node node2 = this.value;
        if (node2 != null) {
            this.value = node2.updateChild(path, node);
            return;
        }
        if (this.children == null) {
            this.children = new HashMap();
        }
        ChildKey front = path.getFront();
        if (!this.children.containsKey(front)) {
            this.children.put(front, new SparseSnapshotTree());
        }
        this.children.get(front).remember(path.popFront(), node);
    }
}
