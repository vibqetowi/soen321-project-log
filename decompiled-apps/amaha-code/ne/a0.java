package ne;

import com.google.firebase.database.collection.ImmutableSortedSet;
/* compiled from: TargetChange.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.protobuf.h f26152a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26153b;

    /* renamed from: c  reason: collision with root package name */
    public final ImmutableSortedSet<ke.i> f26154c;

    /* renamed from: d  reason: collision with root package name */
    public final ImmutableSortedSet<ke.i> f26155d;

    /* renamed from: e  reason: collision with root package name */
    public final ImmutableSortedSet<ke.i> f26156e;

    public a0(com.google.protobuf.h hVar, boolean z10, ImmutableSortedSet<ke.i> immutableSortedSet, ImmutableSortedSet<ke.i> immutableSortedSet2, ImmutableSortedSet<ke.i> immutableSortedSet3) {
        this.f26152a = hVar;
        this.f26153b = z10;
        this.f26154c = immutableSortedSet;
        this.f26155d = immutableSortedSet2;
        this.f26156e = immutableSortedSet3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f26153b != a0Var.f26153b || !this.f26152a.equals(a0Var.f26152a) || !this.f26154c.equals(a0Var.f26154c) || !this.f26155d.equals(a0Var.f26155d)) {
            return false;
        }
        return this.f26156e.equals(a0Var.f26156e);
    }

    public final int hashCode() {
        int hashCode = this.f26154c.hashCode();
        int hashCode2 = this.f26155d.hashCode();
        return this.f26156e.hashCode() + ((hashCode2 + ((hashCode + (((this.f26152a.hashCode() * 31) + (this.f26153b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
