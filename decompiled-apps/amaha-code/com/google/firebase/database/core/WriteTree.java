package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.Predicate;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.CacheNode;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class WriteTree {
    private static final Predicate<UserWriteRecord> DEFAULT_FILTER = new Predicate<UserWriteRecord>() { // from class: com.google.firebase.database.core.WriteTree.2
        @Override // com.google.firebase.database.core.utilities.Predicate
        public boolean evaluate(UserWriteRecord userWriteRecord) {
            return userWriteRecord.isVisible();
        }
    };
    private CompoundWrite visibleWrites = CompoundWrite.emptyWrite();
    private List<UserWriteRecord> allWrites = new ArrayList();
    private Long lastWriteId = -1L;

    private static CompoundWrite layerTree(List<UserWriteRecord> list, Predicate<UserWriteRecord> predicate, Path path) {
        CompoundWrite emptyWrite = CompoundWrite.emptyWrite();
        for (UserWriteRecord userWriteRecord : list) {
            if (predicate.evaluate(userWriteRecord)) {
                Path path2 = userWriteRecord.getPath();
                if (userWriteRecord.isOverwrite()) {
                    if (path.contains(path2)) {
                        emptyWrite = emptyWrite.addWrite(Path.getRelative(path, path2), userWriteRecord.getOverwrite());
                    } else if (path2.contains(path)) {
                        emptyWrite = emptyWrite.addWrite(Path.getEmptyPath(), userWriteRecord.getOverwrite().getChild(Path.getRelative(path2, path)));
                    }
                } else if (path.contains(path2)) {
                    emptyWrite = emptyWrite.addWrites(Path.getRelative(path, path2), userWriteRecord.getMerge());
                } else if (path2.contains(path)) {
                    Path relative = Path.getRelative(path2, path);
                    if (relative.isEmpty()) {
                        emptyWrite = emptyWrite.addWrites(Path.getEmptyPath(), userWriteRecord.getMerge());
                    } else {
                        Node completeNode = userWriteRecord.getMerge().getCompleteNode(relative);
                        if (completeNode != null) {
                            emptyWrite = emptyWrite.addWrite(Path.getEmptyPath(), completeNode);
                        }
                    }
                }
            }
        }
        return emptyWrite;
    }

    private boolean recordContainsPath(UserWriteRecord userWriteRecord, Path path) {
        if (userWriteRecord.isOverwrite()) {
            return userWriteRecord.getPath().contains(path);
        }
        Iterator<Map.Entry<Path, Node>> it = userWriteRecord.getMerge().iterator();
        while (it.hasNext()) {
            if (userWriteRecord.getPath().child(it.next().getKey()).contains(path)) {
                return true;
            }
        }
        return false;
    }

    private void resetTree() {
        this.visibleWrites = layerTree(this.allWrites, DEFAULT_FILTER, Path.getEmptyPath());
        if (this.allWrites.size() > 0) {
            List<UserWriteRecord> list = this.allWrites;
            this.lastWriteId = Long.valueOf(list.get(list.size() - 1).getWriteId());
            return;
        }
        this.lastWriteId = -1L;
    }

    public void addMerge(Path path, CompoundWrite compoundWrite, Long l2) {
        boolean z10;
        if (l2.longValue() > this.lastWriteId.longValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.hardAssert(z10);
        this.allWrites.add(new UserWriteRecord(l2.longValue(), path, compoundWrite));
        this.visibleWrites = this.visibleWrites.addWrites(path, compoundWrite);
        this.lastWriteId = l2;
    }

    public void addOverwrite(Path path, Node node, Long l2, boolean z10) {
        boolean z11;
        if (l2.longValue() > this.lastWriteId.longValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Utilities.hardAssert(z11);
        this.allWrites.add(new UserWriteRecord(l2.longValue(), path, node, z10));
        if (z10) {
            this.visibleWrites = this.visibleWrites.addWrite(path, node);
        }
        this.lastWriteId = l2;
    }

    public Node calcCompleteChild(Path path, ChildKey childKey, CacheNode cacheNode) {
        Path child = path.child(childKey);
        Node completeNode = this.visibleWrites.getCompleteNode(child);
        if (completeNode != null) {
            return completeNode;
        }
        if (cacheNode.isCompleteForChild(childKey)) {
            return this.visibleWrites.childCompoundWrite(child).apply(cacheNode.getNode().getImmediateChild(childKey));
        }
        return null;
    }

    public Node calcCompleteEventCache(Path path, Node node) {
        return calcCompleteEventCache(path, node, new ArrayList());
    }

    public Node calcCompleteEventChildren(Path path, Node node) {
        Node Empty = EmptyNode.Empty();
        Node completeNode = this.visibleWrites.getCompleteNode(path);
        if (completeNode != null) {
            if (!completeNode.isLeafNode()) {
                for (NamedNode namedNode : completeNode) {
                    Empty = Empty.updateImmediateChild(namedNode.getName(), namedNode.getNode());
                }
            }
            return Empty;
        }
        CompoundWrite childCompoundWrite = this.visibleWrites.childCompoundWrite(path);
        for (NamedNode namedNode2 : node) {
            Empty = Empty.updateImmediateChild(namedNode2.getName(), childCompoundWrite.childCompoundWrite(new Path(namedNode2.getName())).apply(namedNode2.getNode()));
        }
        for (NamedNode namedNode3 : childCompoundWrite.getCompleteChildren()) {
            Empty = Empty.updateImmediateChild(namedNode3.getName(), namedNode3.getNode());
        }
        return Empty;
    }

    public Node calcEventCacheAfterServerOverwrite(Path path, Path path2, Node node, Node node2) {
        boolean z10;
        if (node == null && node2 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Utilities.hardAssert(z10, "Either existingEventSnap or existingServerSnap must exist");
        Path child = path.child(path2);
        if (this.visibleWrites.hasCompleteWrite(child)) {
            return null;
        }
        CompoundWrite childCompoundWrite = this.visibleWrites.childCompoundWrite(child);
        if (childCompoundWrite.isEmpty()) {
            return node2.getChild(path2);
        }
        return childCompoundWrite.apply(node2.getChild(path2));
    }

    public NamedNode calcNextNodeAfterPost(Path path, Node node, NamedNode namedNode, boolean z10, Index index) {
        CompoundWrite childCompoundWrite = this.visibleWrites.childCompoundWrite(path);
        Node completeNode = childCompoundWrite.getCompleteNode(Path.getEmptyPath());
        NamedNode namedNode2 = null;
        if (completeNode == null) {
            if (node != null) {
                completeNode = childCompoundWrite.apply(node);
            }
            return namedNode2;
        }
        for (NamedNode namedNode3 : completeNode) {
            if (index.compare(namedNode3, namedNode, z10) > 0 && (namedNode2 == null || index.compare(namedNode3, namedNode2, z10) < 0)) {
                namedNode2 = namedNode3;
            }
        }
        return namedNode2;
    }

    public WriteTreeRef childWrites(Path path) {
        return new WriteTreeRef(path, this);
    }

    public Node getCompleteWriteData(Path path) {
        return this.visibleWrites.getCompleteNode(path);
    }

    public UserWriteRecord getWrite(long j10) {
        for (UserWriteRecord userWriteRecord : this.allWrites) {
            if (userWriteRecord.getWriteId() == j10) {
                return userWriteRecord;
            }
        }
        return null;
    }

    public List<UserWriteRecord> purgeAllWrites() {
        ArrayList arrayList = new ArrayList(this.allWrites);
        this.visibleWrites = CompoundWrite.emptyWrite();
        this.allWrites = new ArrayList();
        return arrayList;
    }

    public boolean removeWrite(long j10) {
        UserWriteRecord userWriteRecord;
        boolean z10;
        Iterator<UserWriteRecord> it = this.allWrites.iterator();
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                userWriteRecord = it.next();
                if (userWriteRecord.getWriteId() == j10) {
                    break;
                }
                i6++;
            } else {
                userWriteRecord = null;
                break;
            }
        }
        if (userWriteRecord != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.hardAssert(z10, "removeWrite called with nonexistent writeId");
        this.allWrites.remove(userWriteRecord);
        boolean isVisible = userWriteRecord.isVisible();
        boolean z11 = false;
        for (int size = this.allWrites.size() - 1; isVisible && size >= 0; size--) {
            UserWriteRecord userWriteRecord2 = this.allWrites.get(size);
            if (userWriteRecord2.isVisible()) {
                if (size >= i6 && recordContainsPath(userWriteRecord2, userWriteRecord.getPath())) {
                    isVisible = false;
                } else if (userWriteRecord.getPath().contains(userWriteRecord2.getPath())) {
                    z11 = true;
                }
            }
        }
        if (!isVisible) {
            return false;
        }
        if (z11) {
            resetTree();
            return true;
        }
        if (userWriteRecord.isOverwrite()) {
            this.visibleWrites = this.visibleWrites.removeWrite(userWriteRecord.getPath());
        } else {
            Iterator<Map.Entry<Path, Node>> it2 = userWriteRecord.getMerge().iterator();
            while (it2.hasNext()) {
                this.visibleWrites = this.visibleWrites.removeWrite(userWriteRecord.getPath().child(it2.next().getKey()));
            }
        }
        return true;
    }

    public Node shadowingWrite(Path path) {
        return this.visibleWrites.getCompleteNode(path);
    }

    public Node calcCompleteEventCache(Path path, Node node, List<Long> list) {
        return calcCompleteEventCache(path, node, list, false);
    }

    public Node calcCompleteEventCache(final Path path, Node node, final List<Long> list, final boolean z10) {
        if (list.isEmpty() && !z10) {
            Node completeNode = this.visibleWrites.getCompleteNode(path);
            if (completeNode != null) {
                return completeNode;
            }
            CompoundWrite childCompoundWrite = this.visibleWrites.childCompoundWrite(path);
            if (childCompoundWrite.isEmpty()) {
                return node;
            }
            if (node != null || childCompoundWrite.hasCompleteWrite(Path.getEmptyPath())) {
                if (node == null) {
                    node = EmptyNode.Empty();
                }
                return childCompoundWrite.apply(node);
            }
            return null;
        }
        CompoundWrite childCompoundWrite2 = this.visibleWrites.childCompoundWrite(path);
        if (z10 || !childCompoundWrite2.isEmpty()) {
            if (z10 || node != null || childCompoundWrite2.hasCompleteWrite(Path.getEmptyPath())) {
                CompoundWrite layerTree = layerTree(this.allWrites, new Predicate<UserWriteRecord>() { // from class: com.google.firebase.database.core.WriteTree.1
                    @Override // com.google.firebase.database.core.utilities.Predicate
                    public boolean evaluate(UserWriteRecord userWriteRecord) {
                        return (userWriteRecord.isVisible() || z10) && !list.contains(Long.valueOf(userWriteRecord.getWriteId())) && (userWriteRecord.getPath().contains(path) || path.contains(userWriteRecord.getPath()));
                    }
                }, path);
                if (node == null) {
                    node = EmptyNode.Empty();
                }
                return layerTree.apply(node);
            }
            return null;
        }
        return node;
    }
}
