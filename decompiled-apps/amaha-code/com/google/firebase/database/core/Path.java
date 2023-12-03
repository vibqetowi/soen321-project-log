package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
import j$.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public class Path implements Iterable<ChildKey>, Comparable<Path> {
    private static final Path EMPTY_PATH = new Path("");
    private final int end;
    private final ChildKey[] pieces;
    private final int start;

    /* renamed from: com.google.firebase.database.core.Path$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Iterator<ChildKey>, j$.util.Iterator {
        int offset;

        public AnonymousClass1() {
            this.offset = Path.this.start;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.offset < Path.this.end) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public ChildKey next() {
            if (hasNext()) {
                ChildKey[] childKeyArr = Path.this.pieces;
                int i6 = this.offset;
                ChildKey childKey = childKeyArr[i6];
                this.offset = i6 + 1;
                return childKey;
            }
            throw new NoSuchElementException("No more elements.");
        }
    }

    public Path(ChildKey... childKeyArr) {
        this.pieces = (ChildKey[]) Arrays.copyOf(childKeyArr, childKeyArr.length);
        this.start = 0;
        this.end = childKeyArr.length;
        for (ChildKey childKey : childKeyArr) {
            Utilities.hardAssert(childKey != null, "Can't construct a path with a null value!");
        }
    }

    public static Path getEmptyPath() {
        return EMPTY_PATH;
    }

    public static Path getRelative(Path path, Path path2) {
        ChildKey front = path.getFront();
        ChildKey front2 = path2.getFront();
        if (front == null) {
            return path2;
        }
        if (front.equals(front2)) {
            return getRelative(path.popFront(), path2.popFront());
        }
        throw new DatabaseException("INTERNAL ERROR: " + path2 + " is not contained in " + path);
    }

    public List<String> asList() {
        ArrayList arrayList = new ArrayList(size());
        java.util.Iterator<ChildKey> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().asString());
        }
        return arrayList;
    }

    public Path child(Path path) {
        int size = path.size() + size();
        ChildKey[] childKeyArr = new ChildKey[size];
        System.arraycopy(this.pieces, this.start, childKeyArr, 0, size());
        System.arraycopy(path.pieces, path.start, childKeyArr, size(), path.size());
        return new Path(childKeyArr, 0, size);
    }

    public boolean contains(Path path) {
        if (size() > path.size()) {
            return false;
        }
        int i6 = this.start;
        int i10 = path.start;
        while (i6 < this.end) {
            if (!this.pieces[i6].equals(path.pieces[i10])) {
                return false;
            }
            i6++;
            i10++;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Path)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Path path = (Path) obj;
        if (size() != path.size()) {
            return false;
        }
        int i6 = this.start;
        for (int i10 = path.start; i6 < this.end && i10 < path.end; i10++) {
            if (!this.pieces[i6].equals(path.pieces[i10])) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public ChildKey getBack() {
        if (!isEmpty()) {
            return this.pieces[this.end - 1];
        }
        return null;
    }

    public ChildKey getFront() {
        if (isEmpty()) {
            return null;
        }
        return this.pieces[this.start];
    }

    public Path getParent() {
        if (isEmpty()) {
            return null;
        }
        return new Path(this.pieces, this.start, this.end - 1);
    }

    public int hashCode() {
        int i6 = 0;
        for (int i10 = this.start; i10 < this.end; i10++) {
            i6 = (i6 * 37) + this.pieces[i10].hashCode();
        }
        return i6;
    }

    public boolean isEmpty() {
        if (this.start >= this.end) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<ChildKey> iterator() {
        return new AnonymousClass1();
    }

    public Path popFront() {
        int i6 = this.start;
        if (!isEmpty()) {
            i6++;
        }
        return new Path(this.pieces, i6, this.end);
    }

    public int size() {
        return this.end - this.start;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = this.start; i6 < this.end; i6++) {
            sb2.append("/");
            sb2.append(this.pieces[i6].asString());
        }
        return sb2.toString();
    }

    public String wireFormat() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = this.start; i6 < this.end; i6++) {
            if (i6 > this.start) {
                sb2.append("/");
            }
            sb2.append(this.pieces[i6].asString());
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Path path) {
        int i6;
        int i10 = this.start;
        int i11 = path.start;
        while (true) {
            i6 = this.end;
            if (i10 >= i6 || i11 >= path.end) {
                break;
            }
            int compareTo = this.pieces[i10].compareTo(path.pieces[i11]);
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
            i11++;
        }
        if (i10 == i6 && i11 == path.end) {
            return 0;
        }
        return i10 == i6 ? -1 : 1;
    }

    public Path child(ChildKey childKey) {
        int size = size();
        int i6 = size + 1;
        ChildKey[] childKeyArr = new ChildKey[i6];
        System.arraycopy(this.pieces, this.start, childKeyArr, 0, size);
        childKeyArr[size] = childKey;
        return new Path(childKeyArr, 0, i6);
    }

    public Path(List<String> list) {
        this.pieces = new ChildKey[list.size()];
        int i6 = 0;
        for (String str : list) {
            this.pieces[i6] = ChildKey.fromString(str);
            i6++;
        }
        this.start = 0;
        this.end = list.size();
    }

    public Path(String str) {
        String[] split = str.split("/", -1);
        int i6 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i6++;
            }
        }
        this.pieces = new ChildKey[i6];
        int i10 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.pieces[i10] = ChildKey.fromString(str3);
                i10++;
            }
        }
        this.start = 0;
        this.end = this.pieces.length;
    }

    private Path(ChildKey[] childKeyArr, int i6, int i10) {
        this.pieces = childKeyArr;
        this.start = i6;
        this.end = i10;
    }
}
