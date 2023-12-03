package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class f6 extends s4 implements RandomAccess, g6 {

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f8377v;

    static {
        new f6(10).f8591u = false;
    }

    public f6() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void P(b5 b5Var) {
        e();
        this.f8377v.add(b5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        e();
        this.f8377v.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        e();
        if (collection instanceof g6) {
            collection = ((g6) collection).f();
        }
        boolean addAll = this.f8377v.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f8377v.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final g6 d() {
        if (this.f8591u) {
            return new u7(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final List f() {
        return Collections.unmodifiableList(this.f8377v);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i6) {
        String r;
        ArrayList arrayList = this.f8377v;
        Object obj = arrayList.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof b5) {
            b5 b5Var = (b5) obj;
            Charset charset = c6.f8318a;
            if (b5Var.m() == 0) {
                r = "";
            } else {
                r = b5Var.r(charset);
            }
            if (b5Var.t()) {
                arrayList.set(i6, r);
            }
            return r;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, c6.f8318a);
        a8 a8Var = c8.f8320a;
        int length = bArr.length;
        a8Var.getClass();
        if (z7.a(0, bArr, length)) {
            arrayList.set(i6, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final Object j(int i6) {
        return this.f8377v.get(i6);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final /* bridge */ /* synthetic */ b6 k(int i6) {
        if (i6 >= size()) {
            ArrayList arrayList = new ArrayList(i6);
            arrayList.addAll(this.f8377v);
            return new f6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        e();
        Object remove = this.f8377v.remove(i6);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof b5) {
            b5 b5Var = (b5) remove;
            Charset charset = c6.f8318a;
            if (b5Var.m() == 0) {
                return "";
            }
            return b5Var.r(charset);
        }
        return new String((byte[]) remove, c6.f8318a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        Object obj2 = this.f8377v.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof b5) {
            b5 b5Var = (b5) obj2;
            Charset charset = c6.f8318a;
            if (b5Var.m() == 0) {
                return "";
            }
            return b5Var.r(charset);
        }
        return new String((byte[]) obj2, c6.f8318a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8377v.size();
    }

    public f6(int i6) {
        this.f8377v = new ArrayList(i6);
    }

    public f6(ArrayList arrayList) {
        this.f8377v = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
