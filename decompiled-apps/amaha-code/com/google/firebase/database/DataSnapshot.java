package com.google.firebase.database;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class DataSnapshot {
    private final IndexedNode node;
    private final DatabaseReference query;

    public DataSnapshot(DatabaseReference databaseReference, IndexedNode indexedNode) {
        this.node = indexedNode;
        this.query = databaseReference;
    }

    public DataSnapshot child(String str) {
        return new DataSnapshot(this.query.child(str), IndexedNode.from(this.node.getNode().getChild(new Path(str))));
    }

    public boolean exists() {
        return !this.node.getNode().isEmpty();
    }

    public Iterable<DataSnapshot> getChildren() {
        final Iterator<NamedNode> it = this.node.iterator();
        return new Iterable<DataSnapshot>() { // from class: com.google.firebase.database.DataSnapshot.1

            /* renamed from: com.google.firebase.database.DataSnapshot$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public class C01591 implements Iterator<DataSnapshot>, j$.util.Iterator {
                public C01591() {
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
                public DataSnapshot next() {
                    NamedNode namedNode = (NamedNode) it.next();
                    return new DataSnapshot(DataSnapshot.this.query.child(namedNode.getName().asString()), IndexedNode.from(namedNode.getNode()));
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<DataSnapshot> iterator() {
                return new C01591();
            }
        };
    }

    public long getChildrenCount() {
        return this.node.getNode().getChildCount();
    }

    public String getKey() {
        return this.query.getKey();
    }

    public Object getPriority() {
        Object value = this.node.getNode().getPriority().getValue();
        if (value instanceof Long) {
            return Double.valueOf(((Long) value).longValue());
        }
        return value;
    }

    public DatabaseReference getRef() {
        return this.query;
    }

    public Object getValue() {
        return this.node.getNode().getValue();
    }

    public boolean hasChild(String str) {
        if (this.query.getParent() == null) {
            Validation.validateRootPathString(str);
        } else {
            Validation.validatePathString(str);
        }
        return !this.node.getNode().getChild(new Path(str)).isEmpty();
    }

    public boolean hasChildren() {
        if (this.node.getNode().getChildCount() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DataSnapshot { key = " + this.query.getKey() + ", value = " + this.node.getNode().getValue(true) + " }";
    }

    public Object getValue(boolean z10) {
        return this.node.getNode().getValue(z10);
    }

    public <T> T getValue(Class<T> cls) {
        return (T) CustomClassMapper.convertToCustomClass(this.node.getNode().getValue(), cls);
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return (T) CustomClassMapper.convertToCustomClass(this.node.getNode().getValue(), genericTypeIndicator);
    }
}
