package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class u7 extends AbstractList implements RandomAccess, g6 {

    /* renamed from: u  reason: collision with root package name */
    public final g6 f8622u;

    public u7(g6 g6Var) {
        this.f8622u = g6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void P(b5 b5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final List f() {
        return this.f8622u.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        return ((f6) this.f8622u).get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new com.google.android.gms.internal.cast.d5(this);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final Object j(int i6) {
        return this.f8622u.j(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new com.google.android.gms.internal.cast.c5(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8622u.size();
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final g6 d() {
        return this;
    }
}
