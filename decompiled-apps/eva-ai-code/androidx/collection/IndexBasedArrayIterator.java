package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class IndexBasedArrayIterator<T> implements Iterator<T> {
    private boolean mCanRemove;
    private int mIndex;
    private int mSize;

    protected abstract T elementAt(int i);

    protected abstract void removeAt(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexBasedArrayIterator(int i) {
        this.mSize = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.mIndex < this.mSize;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T elementAt = elementAt(this.mIndex);
        this.mIndex++;
        this.mCanRemove = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.mCanRemove) {
            throw new IllegalStateException();
        }
        int i = this.mIndex - 1;
        this.mIndex = i;
        removeAt(i);
        this.mSize--;
        this.mCanRemove = false;
    }
}
