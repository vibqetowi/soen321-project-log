package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l1  reason: invalid package */
/* loaded from: classes.dex */
public final class l1 extends x implements RandomAccess, m1 {

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f7954v;

    static {
        new l1(10).f8233u = false;
    }

    public l1() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i6, Object obj) {
        e();
        this.f7954v.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        e();
        if (collection instanceof m1) {
            collection = ((m1) collection).f();
        }
        boolean addAll = this.f7954v.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f7954v.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final m1 d() {
        if (this.f8233u) {
            return new b3(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final void e0(g0 g0Var) {
        e();
        this.f7954v.add(g0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final List f() {
        return Collections.unmodifiableList(this.f7954v);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i6) {
        String t3;
        ArrayList arrayList = this.f7954v;
        Object obj = arrayList.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            Charset charset = i1.f7886a;
            if (h0Var.m() == 0) {
                t3 = "";
            } else {
                t3 = h0Var.t(charset);
            }
            if (h0Var.z()) {
                arrayList.set(i6, t3);
            }
            return t3;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, i1.f7886a);
        h3 h3Var = j3.f7911a;
        int length = bArr.length;
        h3Var.getClass();
        if (g3.a(0, bArr, length)) {
            arrayList.set(i6, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final Object j(int i6) {
        return this.f7954v.get(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final /* bridge */ /* synthetic */ h1 k(int i6) {
        if (i6 >= size()) {
            ArrayList arrayList = new ArrayList(i6);
            arrayList.addAll(this.f7954v);
            return new l1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        e();
        Object remove = this.f7954v.remove(i6);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof h0) {
            h0 h0Var = (h0) remove;
            Charset charset = i1.f7886a;
            if (h0Var.m() == 0) {
                return "";
            }
            return h0Var.t(charset);
        }
        return new String((byte[]) remove, i1.f7886a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        e();
        Object obj2 = this.f7954v.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof h0) {
            h0 h0Var = (h0) obj2;
            Charset charset = i1.f7886a;
            if (h0Var.m() == 0) {
                return "";
            }
            return h0Var.t(charset);
        }
        return new String((byte[]) obj2, i1.f7886a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7954v.size();
    }

    public l1(int i6) {
        this.f7954v = new ArrayList(i6);
    }

    public l1(ArrayList arrayList) {
        this.f7954v = arrayList;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
