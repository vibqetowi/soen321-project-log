package he;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewSnapshot.java */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f17519a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.k f17520b;

    /* renamed from: c  reason: collision with root package name */
    public final ke.k f17521c;

    /* renamed from: d  reason: collision with root package name */
    public final List<h> f17522d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17523e;
    public final ImmutableSortedSet<ke.i> f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17524g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17525h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17526i;

    public h0(y yVar, ke.k kVar, ke.k kVar2, ArrayList arrayList, boolean z10, ImmutableSortedSet immutableSortedSet, boolean z11, boolean z12, boolean z13) {
        this.f17519a = yVar;
        this.f17520b = kVar;
        this.f17521c = kVar2;
        this.f17522d = arrayList;
        this.f17523e = z10;
        this.f = immutableSortedSet;
        this.f17524g = z11;
        this.f17525h = z12;
        this.f17526i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f17523e != h0Var.f17523e || this.f17524g != h0Var.f17524g || this.f17525h != h0Var.f17525h || !this.f17519a.equals(h0Var.f17519a) || !this.f.equals(h0Var.f) || !this.f17520b.equals(h0Var.f17520b) || !this.f17521c.equals(h0Var.f17521c) || this.f17526i != h0Var.f17526i) {
            return false;
        }
        return this.f17522d.equals(h0Var.f17522d);
    }

    public final int hashCode() {
        int hashCode = this.f17520b.hashCode();
        int hashCode2 = this.f17521c.hashCode();
        int hashCode3 = this.f17522d.hashCode();
        return ((((((((this.f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f17519a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f17523e ? 1 : 0)) * 31) + (this.f17524g ? 1 : 0)) * 31) + (this.f17525h ? 1 : 0)) * 31) + (this.f17526i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f17519a + ", " + this.f17520b + ", " + this.f17521c + ", " + this.f17522d + ", isFromCache=" + this.f17523e + ", mutatedKeys=" + this.f.size() + ", didSyncStateChange=" + this.f17524g + ", excludesMetadataChanges=" + this.f17525h + ", hasCachedResults=" + this.f17526i + ")";
    }
}
