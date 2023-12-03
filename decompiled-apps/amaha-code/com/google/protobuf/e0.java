package com.google.protobuf;

import com.google.protobuf.r1;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public final class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f9904v;

    static {
        new e0(10).f9890u = false;
    }

    public e0(int i6) {
        this(new ArrayList(i6));
    }

    @Override // com.google.protobuf.y.d
    public final y.d A(int i6) {
        if (i6 >= size()) {
            ArrayList arrayList = new ArrayList(i6);
            arrayList.addAll(this.f9904v);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.f0
    public final void B(h hVar) {
        e();
        this.f9904v.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        e();
        this.f9904v.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.f0
    public final Object b0(int i6) {
        return this.f9904v.get(i6);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f9904v.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        String str;
        ArrayList arrayList = this.f9904v;
        Object obj = arrayList.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.getClass();
            Charset charset = y.f10086a;
            if (hVar.size() == 0) {
                str = "";
            } else {
                str = hVar.O(charset);
            }
            if (hVar.C()) {
                arrayList.set(i6, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, y.f10086a);
            r1.b bVar = r1.f10029a;
            boolean z10 = false;
            if (r1.f10029a.e(0, 0, bArr.length, bArr) == 0) {
                z10 = true;
            }
            if (z10) {
                arrayList.set(i6, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.f0
    public final List<?> n() {
        return Collections.unmodifiableList(this.f9904v);
    }

    @Override // com.google.protobuf.f0
    public final f0 p() {
        if (this.f9890u) {
            return new p1(this);
        }
        return this;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        e();
        Object remove = this.f9904v.remove(i6);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof h) {
            h hVar = (h) remove;
            hVar.getClass();
            Charset charset = y.f10086a;
            if (hVar.size() == 0) {
                return "";
            }
            return hVar.O(charset);
        }
        return new String((byte[]) remove, y.f10086a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        Object obj2 = this.f9904v.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof h) {
            h hVar = (h) obj2;
            hVar.getClass();
            Charset charset = y.f10086a;
            if (hVar.size() == 0) {
                return "";
            }
            return hVar.O(charset);
        }
        return new String((byte[]) obj2, y.f10086a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9904v.size();
    }

    public e0(ArrayList<Object> arrayList) {
        this.f9904v = arrayList;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends String> collection) {
        e();
        if (collection instanceof f0) {
            collection = ((f0) collection).n();
        }
        boolean addAll = this.f9904v.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
