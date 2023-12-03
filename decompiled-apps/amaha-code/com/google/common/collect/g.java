package com.google.common.collect;

import com.google.common.collect.e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: AbstractMultimap.java */
/* loaded from: classes.dex */
public abstract class g<K, V> implements f0<K, V> {

    /* renamed from: u  reason: collision with root package name */
    public transient e.c f9385u;

    /* renamed from: v  reason: collision with root package name */
    public transient a f9386v;

    /* renamed from: w  reason: collision with root package name */
    public transient e.a f9387w;

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection<V> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g f9388u;

        public a(e eVar) {
            this.f9388u = eVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((e) this.f9388u).b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<V> it = ((d0) this.f9388u.a().values()).iterator();
            while (it.hasNext()) {
                if (((Collection) it.next()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e eVar = (e) this.f9388u;
            eVar.getClass();
            return new d(eVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((e) this.f9388u).f9353y;
        }
    }

    @Override // com.google.common.collect.f0
    public abstract e.a a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            return ((c) this).a().equals(((f0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
