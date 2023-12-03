package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.cast.c5;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b3  reason: invalid package */
/* loaded from: classes.dex */
public final class b3 extends AbstractList implements RandomAccess, m1 {

    /* renamed from: u  reason: collision with root package name */
    public final m1 f7724u;

    public b3(m1 m1Var) {
        this.f7724u = m1Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final void e0(g0 g0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final List f() {
        return this.f7724u.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        return ((l1) this.f7724u).get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a3(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final Object j(int i6) {
        return this.f7724u.j(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new c5(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7724u.size();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m1
    public final m1 d() {
        return this;
    }
}
