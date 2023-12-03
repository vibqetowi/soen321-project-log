package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n3 extends h2<String> implements RandomAccess, o3 {

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f7606v;

    static {
        new n3(10).f7545u = false;
    }

    public n3() {
        this(10);
    }

    @Override // com.google.android.gms.internal.cast.j3
    public final /* bridge */ /* synthetic */ j3 D(int i6) {
        if (i6 >= size()) {
            ArrayList arrayList = new ArrayList(i6);
            arrayList.addAll(this.f7606v);
            return new n3(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        e();
        this.f7606v.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends String> collection) {
        e();
        if (collection instanceof o3) {
            collection = ((o3) collection).h();
        }
        boolean addAll = this.f7606v.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f7606v.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i6) {
        String r;
        ArrayList arrayList = this.f7606v;
        Object obj = arrayList.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof n2) {
            n2 n2Var = (n2) obj;
            Charset charset = k3.f7570a;
            if (n2Var.m() == 0) {
                r = "";
            } else {
                r = n2Var.r(charset);
            }
            if (n2Var.s()) {
                arrayList.set(i6, r);
            }
            return r;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, k3.f7570a);
        tr.r rVar = k5.f7572a;
        int length = bArr.length;
        rVar.getClass();
        if (tr.r.G(bArr, length)) {
            arrayList.set(i6, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final List<?> h() {
        return Collections.unmodifiableList(this.f7606v);
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final o3 i() {
        if (this.f7545u) {
            return new e5(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        e();
        Object remove = this.f7606v.remove(i6);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof n2) {
            n2 n2Var = (n2) remove;
            Charset charset = k3.f7570a;
            if (n2Var.m() == 0) {
                return "";
            }
            return n2Var.r(charset);
        }
        return new String((byte[]) remove, k3.f7570a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        Object obj2 = this.f7606v.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof n2) {
            n2 n2Var = (n2) obj2;
            Charset charset = k3.f7570a;
            if (n2Var.m() == 0) {
                return "";
            }
            return n2Var.r(charset);
        }
        return new String((byte[]) obj2, k3.f7570a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7606v.size();
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final Object y(int i6) {
        return this.f7606v.get(i6);
    }

    public n3(int i6) {
        this.f7606v = new ArrayList(i6);
    }

    public n3(ArrayList<Object> arrayList) {
        this.f7606v = arrayList;
    }

    @Override // com.google.android.gms.internal.cast.h2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
