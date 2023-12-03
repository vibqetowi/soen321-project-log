package com.google.common.collect;

import com.google.common.collect.s0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
/* compiled from: Sets.java */
/* loaded from: classes.dex */
public final class r0 extends s0.b<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Set f9444u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Set f9445v;

    public r0(u uVar, u uVar2) {
        this.f9444u = uVar;
        this.f9445v = uVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f9444u.contains(obj) && this.f9445v.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (this.f9444u.containsAll(collection) && this.f9445v.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f9445v, this.f9444u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new q0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i6 = 0;
        for (Object obj : this.f9444u) {
            if (this.f9445v.contains(obj)) {
                i6++;
            }
        }
        return i6;
    }
}
