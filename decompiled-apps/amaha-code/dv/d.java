package dv;

import j$.util.Iterator;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.Consumer;
/* compiled from: SmartList.java */
/* loaded from: classes2.dex */
public final class d<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public int f13514u;

    /* renamed from: v  reason: collision with root package name */
    public Object f13515v;

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    public static class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public static final a f13516u = new a();

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    public class b extends c<E> implements j$.util.Iterator {

        /* renamed from: v  reason: collision with root package name */
        public final int f13517v;

        public b() {
            this.f13517v = ((AbstractList) d.this).modCount;
        }

        @Override // dv.d.c
        public final void a() {
            d dVar = d.this;
            int i6 = ((AbstractList) dVar).modCount;
            int i10 = this.f13517v;
            if (i6 == i10) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) dVar).modCount + "; expected: " + i10);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            a();
            d.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    /* loaded from: classes2.dex */
    public static abstract class c<T> implements java.util.Iterator<T> {

        /* renamed from: u  reason: collision with root package name */
        public boolean f13519u;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f13519u;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f13519u) {
                this.f13519u = true;
                a();
                return (T) d.this.f13515v;
            }
            throw new NoSuchElementException();
        }
    }

    public static /* synthetic */ void e(int i6) {
        String str;
        int i10;
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 7) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 != 5 && i6 != 6 && i6 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i6) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        int i6 = this.f13514u;
        if (i6 == 0) {
            this.f13515v = e10;
        } else if (i6 == 1) {
            this.f13515v = new Object[]{this.f13515v, e10};
        } else {
            Object[] objArr = (Object[]) this.f13515v;
            int length = objArr.length;
            if (i6 >= length) {
                int b10 = pl.a.b(length, 3, 2, 1);
                int i10 = i6 + 1;
                if (b10 < i10) {
                    b10 = i10;
                }
                Object[] objArr2 = new Object[b10];
                this.f13515v = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f13514u] = e10;
        }
        this.f13514u++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13515v = null;
        this.f13514u = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.f13514u)) {
            if (i10 == 1) {
                return (E) this.f13515v;
            }
            return (E) ((Object[]) this.f13515v)[i6];
        }
        StringBuilder u10 = defpackage.c.u("Index: ", i6, ", Size: ");
        u10.append(this.f13514u);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        int i6 = this.f13514u;
        if (i6 == 0) {
            return a.f13516u;
        }
        if (i6 == 1) {
            return new b();
        }
        java.util.Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        e(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i6) {
        int i10;
        E e10;
        if (i6 >= 0 && i6 < (i10 = this.f13514u)) {
            if (i10 == 1) {
                e10 = (E) this.f13515v;
                this.f13515v = null;
            } else {
                Object[] objArr = (Object[]) this.f13515v;
                Object obj = objArr[i6];
                if (i10 == 2) {
                    this.f13515v = objArr[1 - i6];
                } else {
                    int i11 = (i10 - i6) - 1;
                    if (i11 > 0) {
                        System.arraycopy(objArr, i6 + 1, objArr, i6, i11);
                    }
                    objArr[this.f13514u - 1] = null;
                }
                e10 = (E) obj;
            }
            this.f13514u--;
            ((AbstractList) this).modCount++;
            return e10;
        }
        StringBuilder u10 = defpackage.c.u("Index: ", i6, ", Size: ");
        u10.append(this.f13514u);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e10) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.f13514u)) {
            if (i10 == 1) {
                E e11 = (E) this.f13515v;
                this.f13515v = e10;
                return e11;
            }
            Object[] objArr = (Object[]) this.f13515v;
            E e12 = (E) objArr[i6];
            objArr[i6] = e10;
            return e12;
        }
        StringBuilder u10 = defpackage.c.u("Index: ", i6, ", Size: ");
        u10.append(this.f13514u);
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13514u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr != 0) {
            int length = tArr.length;
            int i6 = this.f13514u;
            if (i6 == 1) {
                if (length != 0) {
                    tArr[0] = this.f13515v;
                } else {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                    tArr2[0] = this.f13515v;
                    return tArr2;
                }
            } else if (length < i6) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f13515v, i6, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                e(6);
                throw null;
            } else if (i6 != 0) {
                System.arraycopy(this.f13515v, 0, tArr, 0, i6);
            }
            int i10 = this.f13514u;
            if (length > i10) {
                tArr[i10] = 0;
            }
            return tArr;
        }
        e(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e10) {
        int i10;
        if (i6 >= 0 && i6 <= (i10 = this.f13514u)) {
            if (i10 == 0) {
                this.f13515v = e10;
            } else if (i10 == 1 && i6 == 0) {
                this.f13515v = new Object[]{e10, this.f13515v};
            } else {
                Object[] objArr = new Object[i10 + 1];
                if (i10 == 1) {
                    objArr[0] = this.f13515v;
                } else {
                    Object[] objArr2 = (Object[]) this.f13515v;
                    System.arraycopy(objArr2, 0, objArr, 0, i6);
                    System.arraycopy(objArr2, i6, objArr, i6 + 1, this.f13514u - i6);
                }
                objArr[i6] = e10;
                this.f13515v = objArr;
            }
            this.f13514u++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u10 = defpackage.c.u("Index: ", i6, ", Size: ");
        u10.append(this.f13514u);
        throw new IndexOutOfBoundsException(u10.toString());
    }
}
