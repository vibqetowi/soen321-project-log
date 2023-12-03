package com.google.firebase.database;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.SnapshotHolder;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityUtilities;
import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class MutableData {
    private final SnapshotHolder holder;
    private final Path prefixPath;

    public MutableData child(String str) {
        Validation.validatePathString(str);
        return new MutableData(this.holder, this.prefixPath.child(new Path(str)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutableData) {
            MutableData mutableData = (MutableData) obj;
            if (this.holder.equals(mutableData.holder) && this.prefixPath.equals(mutableData.prefixPath)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<MutableData> getChildren() {
        Node node = getNode();
        if (!node.isEmpty() && !node.isLeafNode()) {
            final Iterator<NamedNode> it = IndexedNode.from(node).iterator();
            return new Iterable<MutableData>() { // from class: com.google.firebase.database.MutableData.2

                /* renamed from: com.google.firebase.database.MutableData$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public class AnonymousClass1 implements Iterator<MutableData>, j$.util.Iterator {
                    public AnonymousClass1() {
                    }

                    @Override // java.util.Iterator, j$.util.Iterator
                    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                        Iterator.CC.$default$forEachRemaining(this, consumer);
                    }

                    @Override // java.util.Iterator, j$.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator, j$.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }

                    @Override // java.util.Iterator, j$.util.Iterator
                    public MutableData next() {
                        return new MutableData(MutableData.this.holder, MutableData.this.prefixPath.child(((NamedNode) it.next()).getName()));
                    }
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<MutableData> iterator() {
                    return new AnonymousClass1();
                }
            };
        }
        return new Iterable<MutableData>() { // from class: com.google.firebase.database.MutableData.1

            /* renamed from: com.google.firebase.database.MutableData$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public class C01601 implements java.util.Iterator<MutableData>, j$.util.Iterator {
                public C01601() {
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Iterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public boolean hasNext() {
                    return false;
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("remove called on immutable collection");
                }

                @Override // java.util.Iterator, j$.util.Iterator
                public MutableData next() {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<MutableData> iterator() {
                return new C01601();
            }
        };
    }

    public long getChildrenCount() {
        return getNode().getChildCount();
    }

    public String getKey() {
        if (this.prefixPath.getBack() != null) {
            return this.prefixPath.getBack().asString();
        }
        return null;
    }

    public Node getNode() {
        return this.holder.getNode(this.prefixPath);
    }

    public Object getPriority() {
        return getNode().getPriority().getValue();
    }

    public Object getValue() {
        return getNode().getValue();
    }

    public boolean hasChild(String str) {
        return !getNode().getChild(new Path(str)).isEmpty();
    }

    public boolean hasChildren() {
        Node node = getNode();
        if (!node.isLeafNode() && !node.isEmpty()) {
            return true;
        }
        return false;
    }

    public void setPriority(Object obj) {
        this.holder.update(this.prefixPath, getNode().updatePriority(PriorityUtilities.parsePriority(this.prefixPath, obj)));
    }

    public void setValue(Object obj) {
        ValidationPath.validateWithObject(this.prefixPath, obj);
        Object convertToPlainJavaTypes = CustomClassMapper.convertToPlainJavaTypes(obj);
        Validation.validateWritableObject(convertToPlainJavaTypes);
        this.holder.update(this.prefixPath, NodeUtilities.NodeFromJSON(convertToPlainJavaTypes));
    }

    public String toString() {
        String str;
        ChildKey front = this.prefixPath.getFront();
        StringBuilder sb2 = new StringBuilder("MutableData { key = ");
        if (front != null) {
            str = front.asString();
        } else {
            str = "<none>";
        }
        sb2.append(str);
        sb2.append(", value = ");
        sb2.append(this.holder.getRootNode().getValue(true));
        sb2.append(" }");
        return sb2.toString();
    }

    public MutableData(Node node) {
        this(new SnapshotHolder(node), new Path(""));
    }

    public <T> T getValue(Class<T> cls) {
        return (T) CustomClassMapper.convertToCustomClass(getNode().getValue(), cls);
    }

    private MutableData(SnapshotHolder snapshotHolder, Path path) {
        this.holder = snapshotHolder;
        this.prefixPath = path;
        ValidationPath.validateWithObject(path, getValue());
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return (T) CustomClassMapper.convertToCustomClass(getNode().getValue(), genericTypeIndicator);
    }
}
