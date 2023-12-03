package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class e5 extends AbstractList<String> implements RandomAccess, o3 {

    /* renamed from: u  reason: collision with root package name */
    public final o3 f7517u;

    public e5(o3 o3Var) {
        this.f7517u = o3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        return ((n3) this.f7517u).get(i6);
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final List<?> h() {
        return this.f7517u.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new d5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i6) {
        return new c5(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7517u.size();
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final Object y(int i6) {
        return this.f7517u.y(i6);
    }

    @Override // com.google.android.gms.internal.cast.o3
    public final o3 i() {
        return this;
    }
}
