package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import java.util.Map;
/* loaded from: classes.dex */
public class Tree<T> {
    private ChildKey name;
    private TreeNode<T> node;
    private Tree<T> parent;

    /* loaded from: classes.dex */
    public interface TreeFilter<T> {
        boolean filterTreeNode(Tree<T> tree);
    }

    /* loaded from: classes.dex */
    public interface TreeVisitor<T> {
        void visitTree(Tree<T> tree);
    }

    public Tree(ChildKey childKey, Tree<T> tree, TreeNode<T> treeNode) {
        this.name = childKey;
        this.parent = tree;
        this.node = treeNode;
    }

    private void updateChild(ChildKey childKey, Tree<T> tree) {
        boolean isEmpty = tree.isEmpty();
        boolean containsKey = this.node.children.containsKey(childKey);
        if (isEmpty && containsKey) {
            this.node.children.remove(childKey);
            updateParents();
        } else if (!isEmpty && !containsKey) {
            this.node.children.put(childKey, tree.node);
            updateParents();
        }
    }

    private void updateParents() {
        Tree<T> tree = this.parent;
        if (tree != null) {
            tree.updateChild(this.name, this);
        }
    }

    public boolean forEachAncestor(TreeFilter<T> treeFilter) {
        return forEachAncestor(treeFilter, false);
    }

    public void forEachChild(TreeVisitor<T> treeVisitor) {
        for (Object obj : this.node.children.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            treeVisitor.visitTree(new Tree<>((ChildKey) entry.getKey(), this, (TreeNode) entry.getValue()));
        }
    }

    public void forEachDescendant(TreeVisitor<T> treeVisitor) {
        forEachDescendant(treeVisitor, false, false);
    }

    public ChildKey getName() {
        return this.name;
    }

    public Tree<T> getParent() {
        return this.parent;
    }

    public Path getPath() {
        boolean z10 = false;
        if (this.parent != null) {
            if (this.name != null) {
                z10 = true;
            }
            Utilities.hardAssert(z10);
            return this.parent.getPath().child(this.name);
        } else if (this.name != null) {
            return new Path(this.name);
        } else {
            return Path.getEmptyPath();
        }
    }

    public T getValue() {
        return this.node.value;
    }

    public boolean hasChildren() {
        return !this.node.children.isEmpty();
    }

    public boolean isEmpty() {
        TreeNode<T> treeNode = this.node;
        if (treeNode.value == null && treeNode.children.isEmpty()) {
            return true;
        }
        return false;
    }

    public TreeNode<T> lastNodeOnPath(Path path) {
        TreeNode<T> treeNode;
        TreeNode<T> treeNode2 = this.node;
        ChildKey front = path.getFront();
        while (front != null) {
            if (treeNode2.children.containsKey(front)) {
                treeNode = treeNode2.children.get(front);
            } else {
                treeNode = null;
            }
            if (treeNode == null) {
                return treeNode2;
            }
            path = path.popFront();
            TreeNode<T> treeNode3 = treeNode;
            front = path.getFront();
            treeNode2 = treeNode3;
        }
        return treeNode2;
    }

    public void setValue(T t3) {
        this.node.value = t3;
        updateParents();
    }

    public Tree<T> subTree(Path path) {
        TreeNode<T> treeNode;
        ChildKey front = path.getFront();
        Tree<T> tree = this;
        while (front != null) {
            if (tree.node.children.containsKey(front)) {
                treeNode = tree.node.children.get(front);
            } else {
                treeNode = new TreeNode<>();
            }
            Tree<T> tree2 = new Tree<>(front, tree, treeNode);
            path = path.popFront();
            front = path.getFront();
            tree = tree2;
        }
        return tree;
    }

    public String toString() {
        return toString("");
    }

    public boolean forEachAncestor(TreeFilter<T> treeFilter, boolean z10) {
        for (Tree<T> tree = z10 ? this : this.parent; tree != null; tree = tree.parent) {
            if (treeFilter.filterTreeNode(tree)) {
                return true;
            }
        }
        return false;
    }

    public void forEachDescendant(TreeVisitor<T> treeVisitor, boolean z10) {
        forEachDescendant(treeVisitor, z10, false);
    }

    public String toString(String str) {
        ChildKey childKey = this.name;
        String asString = childKey == null ? "<anon>" : childKey.asString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(asString);
        sb2.append("\n");
        TreeNode<T> treeNode = this.node;
        sb2.append(treeNode.toString(str + "\t"));
        return sb2.toString();
    }

    public void forEachDescendant(final TreeVisitor<T> treeVisitor, boolean z10, final boolean z11) {
        if (z10 && !z11) {
            treeVisitor.visitTree(this);
        }
        forEachChild(new TreeVisitor<T>() { // from class: com.google.firebase.database.core.utilities.Tree.1
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public void visitTree(Tree<T> tree) {
                tree.forEachDescendant(treeVisitor, true, z11);
            }
        });
        if (z10 && z11) {
            treeVisitor.visitTree(this);
        }
    }

    public Tree() {
        this(null, null, new TreeNode());
    }
}
