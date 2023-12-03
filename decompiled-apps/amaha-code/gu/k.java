package gu;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public final class k extends AbstractList<String> implements RandomAccess, l {

    /* renamed from: v  reason: collision with root package name */
    public static final t f16877v = new t(new k());

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f16878u;

    public k() {
        this.f16878u = new ArrayList();
    }

    @Override // gu.l
    public final void E(m mVar) {
        this.f16878u.add(mVar);
        ((AbstractList) this).modCount++;
    }

    @Override // gu.l
    public final c V(int i6) {
        c mVar;
        ArrayList arrayList = this.f16878u;
        Object obj = arrayList.get(i6);
        if (obj instanceof c) {
            mVar = (c) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            m mVar2 = c.f16833u;
            try {
                mVar = new m(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            m mVar3 = c.f16833u;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            mVar = new m(bArr2);
        }
        if (mVar != obj) {
            arrayList.set(i6, mVar);
        }
        return mVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        this.f16878u.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f16878u.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        String str;
        ArrayList arrayList = this.f16878u;
        Object obj = arrayList.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            try {
                str = cVar.J();
                if (cVar.s()) {
                    arrayList.set(i6, str);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = h.f16872a;
            try {
                str = new String(bArr, "UTF-8");
                boolean z10 = false;
                if (ta.v.J(0, bArr, bArr.length) == 0) {
                    z10 = true;
                }
                if (z10) {
                    arrayList.set(i6, str);
                }
            } catch (UnsupportedEncodingException e11) {
                throw new RuntimeException("UTF-8 not supported?", e11);
            }
        }
        return str;
    }

    @Override // gu.l
    public final List<?> n() {
        return Collections.unmodifiableList(this.f16878u);
    }

    @Override // gu.l
    public final t p() {
        return new t(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        Object remove = this.f16878u.remove(i6);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof c) {
            c cVar = (c) remove;
            cVar.getClass();
            try {
                return cVar.J();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = h.f16872a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        Object obj2 = this.f16878u.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            cVar.getClass();
            try {
                return cVar.J();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = h.f16872a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16878u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends String> collection) {
        if (collection instanceof l) {
            collection = ((l) collection).n();
        }
        boolean addAll = this.f16878u.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public k(l lVar) {
        this.f16878u = new ArrayList(lVar.size());
        addAll(lVar);
    }
}
