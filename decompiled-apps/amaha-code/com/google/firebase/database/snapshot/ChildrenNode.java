package com.google.firebase.database.snapshot;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.Node;
import j$.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class ChildrenNode implements Node {
    public static Comparator<ChildKey> NAME_ONLY_COMPARATOR = new Comparator<ChildKey>() { // from class: com.google.firebase.database.snapshot.ChildrenNode.1
        @Override // java.util.Comparator
        public int compare(ChildKey childKey, ChildKey childKey2) {
            return childKey.compareTo(childKey2);
        }
    };
    private final ImmutableSortedMap<ChildKey, Node> children;
    private String lazyHash;
    private final Node priority;

    /* loaded from: classes.dex */
    public static abstract class ChildVisitor extends LLRBNode.NodeVisitor<ChildKey, Node> {
        public abstract void visitChild(ChildKey childKey, Node node);

        @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
        public void visitEntry(ChildKey childKey, Node node) {
            visitChild(childKey, node);
        }
    }

    /* loaded from: classes.dex */
    public static class NamedNodeIterator implements Iterator<NamedNode>, j$.util.Iterator {
        private final Iterator<Map.Entry<ChildKey, Node>> iterator;

        public NamedNodeIterator(Iterator<Map.Entry<ChildKey, Node>> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.iterator.remove();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public NamedNode next() {
            Map.Entry<ChildKey, Node> next = this.iterator.next();
            return new NamedNode(next.getKey(), next.getValue());
        }
    }

    public ChildrenNode() {
        this.lazyHash = null;
        this.children = ImmutableSortedMap.Builder.emptyMap(NAME_ONLY_COMPARATOR);
        this.priority = PriorityUtilities.NullPriority();
    }

    private static void addIndentation(StringBuilder sb2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            sb2.append(" ");
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChildrenNode)) {
            return false;
        }
        ChildrenNode childrenNode = (ChildrenNode) obj;
        if (!getPriority().equals(childrenNode.getPriority()) || this.children.size() != childrenNode.children.size()) {
            return false;
        }
        java.util.Iterator<Map.Entry<ChildKey, Node>> it = this.children.iterator();
        java.util.Iterator<Map.Entry<ChildKey, Node>> it2 = childrenNode.children.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<ChildKey, Node> next = it.next();
            Map.Entry<ChildKey, Node> next2 = it2.next();
            if (next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                return false;
            }
            while (it.hasNext()) {
                Map.Entry<ChildKey, Node> next3 = it.next();
                Map.Entry<ChildKey, Node> next22 = it2.next();
                if (next3.getKey().equals(next22.getKey())) {
                }
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    public void forEachChild(ChildVisitor childVisitor) {
        forEachChild(childVisitor, false);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node getChild(Path path) {
        ChildKey front = path.getFront();
        if (front == null) {
            return this;
        }
        return getImmediateChild(front).getChild(path.popFront());
    }

    @Override // com.google.firebase.database.snapshot.Node
    public int getChildCount() {
        return this.children.size();
    }

    public ChildKey getFirstChildKey() {
        return this.children.getMinKey();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHash() {
        String sha1HexDigest;
        if (this.lazyHash == null) {
            String hashRepresentation = getHashRepresentation(Node.HashVersion.V1);
            if (hashRepresentation.isEmpty()) {
                sha1HexDigest = "";
            } else {
                sha1HexDigest = Utilities.sha1HexDigest(hashRepresentation);
            }
            this.lazyHash = sha1HexDigest;
        }
        return this.lazyHash;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        boolean z10;
        Node.HashVersion hashVersion2 = Node.HashVersion.V1;
        if (hashVersion == hashVersion2) {
            StringBuilder sb2 = new StringBuilder();
            if (!this.priority.isEmpty()) {
                sb2.append("priority:");
                sb2.append(this.priority.getHashRepresentation(hashVersion2));
                sb2.append(":");
            }
            ArrayList arrayList = new ArrayList();
            java.util.Iterator<NamedNode> it = iterator();
            loop0: while (true) {
                z10 = false;
                while (it.hasNext()) {
                    NamedNode next = it.next();
                    arrayList.add(next);
                    if (z10 || !next.getNode().getPriority().isEmpty()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Collections.sort(arrayList, PriorityIndex.getInstance());
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NamedNode namedNode = (NamedNode) it2.next();
                String hash = namedNode.getNode().getHash();
                if (!hash.equals("")) {
                    sb2.append(":");
                    sb2.append(namedNode.getName().asString());
                    sb2.append(":");
                    sb2.append(hash);
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node getImmediateChild(ChildKey childKey) {
        if (childKey.isPriorityChildName() && !this.priority.isEmpty()) {
            return this.priority;
        }
        if (this.children.containsKey(childKey)) {
            return this.children.get(childKey);
        }
        return EmptyNode.Empty();
    }

    public ChildKey getLastChildKey() {
        return this.children.getMaxKey();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public ChildKey getPredecessorChildKey(ChildKey childKey) {
        return this.children.getPredecessorKey(childKey);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node getPriority() {
        return this.priority;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public ChildKey getSuccessorChildKey(ChildKey childKey) {
        return this.children.getSuccessorKey(childKey);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return getValue(false);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean hasChild(ChildKey childKey) {
        return !getImmediateChild(childKey).isEmpty();
    }

    public int hashCode() {
        java.util.Iterator<NamedNode> it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            NamedNode next = it.next();
            int hashCode = next.getName().hashCode();
            i6 = next.getNode().hashCode() + ((hashCode + (i6 * 31)) * 17);
        }
        return i6;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean isEmpty() {
        return this.children.isEmpty();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean isLeafNode() {
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<NamedNode> iterator() {
        return new NamedNodeIterator(this.children.iterator());
    }

    @Override // com.google.firebase.database.snapshot.Node
    public java.util.Iterator<NamedNode> reverseIterator() {
        return new NamedNodeIterator(this.children.reverseIterator());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        toString(sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node updateChild(Path path, Node node) {
        ChildKey front = path.getFront();
        if (front == null) {
            return node;
        }
        if (front.isPriorityChildName()) {
            Utilities.hardAssert(PriorityUtilities.isValidPriority(node));
            return updatePriority(node);
        }
        return updateImmediateChild(front, getImmediateChild(front).updateChild(path.popFront(), node));
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node updateImmediateChild(ChildKey childKey, Node node) {
        if (childKey.isPriorityChildName()) {
            return updatePriority(node);
        }
        ImmutableSortedMap<ChildKey, Node> immutableSortedMap = this.children;
        if (immutableSortedMap.containsKey(childKey)) {
            immutableSortedMap = immutableSortedMap.remove(childKey);
        }
        if (!node.isEmpty()) {
            immutableSortedMap = immutableSortedMap.insert(childKey, node);
        }
        if (immutableSortedMap.isEmpty()) {
            return EmptyNode.Empty();
        }
        return new ChildrenNode(immutableSortedMap, this.priority);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node updatePriority(Node node) {
        if (this.children.isEmpty()) {
            return EmptyNode.Empty();
        }
        return new ChildrenNode(this.children, node);
    }

    @Override // java.lang.Comparable
    public int compareTo(Node node) {
        if (isEmpty()) {
            return node.isEmpty() ? 0 : -1;
        } else if (node.isLeafNode() || node.isEmpty()) {
            return 1;
        } else {
            return node == Node.MAX_NODE ? -1 : 0;
        }
    }

    public void forEachChild(final ChildVisitor childVisitor, boolean z10) {
        if (z10 && !getPriority().isEmpty()) {
            this.children.inOrderTraversal(new LLRBNode.NodeVisitor<ChildKey, Node>() { // from class: com.google.firebase.database.snapshot.ChildrenNode.2
                boolean passedPriorityKey = false;

                @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
                public void visitEntry(ChildKey childKey, Node node) {
                    if (!this.passedPriorityKey && childKey.compareTo(ChildKey.getPriorityKey()) > 0) {
                        this.passedPriorityKey = true;
                        childVisitor.visitChild(ChildKey.getPriorityKey(), ChildrenNode.this.getPriority());
                    }
                    childVisitor.visitChild(childKey, node);
                }
            });
        } else {
            this.children.inOrderTraversal(childVisitor);
        }
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue(boolean z10) {
        Integer tryParseInt;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        java.util.Iterator<Map.Entry<ChildKey, Node>> it = this.children.iterator();
        int i6 = 0;
        boolean z11 = true;
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry<ChildKey, Node> next = it.next();
            String asString = next.getKey().asString();
            hashMap.put(asString, next.getValue().getValue(z10));
            i6++;
            if (z11) {
                if ((asString.length() > 1 && asString.charAt(0) == '0') || (tryParseInt = Utilities.tryParseInt(asString)) == null || tryParseInt.intValue() < 0) {
                    z11 = false;
                } else if (tryParseInt.intValue() > i10) {
                    i10 = tryParseInt.intValue();
                }
            }
        }
        if (!z10 && z11 && i10 < i6 * 2) {
            ArrayList arrayList = new ArrayList(i10 + 1);
            for (int i11 = 0; i11 <= i10; i11++) {
                arrayList.add(hashMap.get("" + i11));
            }
            return arrayList;
        }
        if (z10 && !this.priority.isEmpty()) {
            hashMap.put(".priority", this.priority.getValue());
        }
        return hashMap;
    }

    private void toString(StringBuilder sb2, int i6) {
        if (this.children.isEmpty() && this.priority.isEmpty()) {
            sb2.append("{ }");
            return;
        }
        sb2.append("{\n");
        java.util.Iterator<Map.Entry<ChildKey, Node>> it = this.children.iterator();
        while (it.hasNext()) {
            Map.Entry<ChildKey, Node> next = it.next();
            int i10 = i6 + 2;
            addIndentation(sb2, i10);
            sb2.append(next.getKey().asString());
            sb2.append("=");
            if (next.getValue() instanceof ChildrenNode) {
                ((ChildrenNode) next.getValue()).toString(sb2, i10);
            } else {
                sb2.append(next.getValue().toString());
            }
            sb2.append("\n");
        }
        if (!this.priority.isEmpty()) {
            addIndentation(sb2, i6 + 2);
            sb2.append(".priority=");
            sb2.append(this.priority.toString());
            sb2.append("\n");
        }
        addIndentation(sb2, i6);
        sb2.append("}");
    }

    public ChildrenNode(ImmutableSortedMap<ChildKey, Node> immutableSortedMap, Node node) {
        this.lazyHash = null;
        if (immutableSortedMap.isEmpty() && !node.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.priority = node;
        this.children = immutableSortedMap;
    }
}
