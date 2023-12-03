package ne;

import com.google.protobuf.y;
import java.util.List;
import tr.i0;
/* compiled from: WatchChange.java */
/* loaded from: classes.dex */
public abstract class c0 {

    /* compiled from: WatchChange.java */
    /* loaded from: classes.dex */
    public static final class a extends c0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<Integer> f26185a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f26186b;

        /* renamed from: c  reason: collision with root package name */
        public final ke.i f26187c;

        /* renamed from: d  reason: collision with root package name */
        public final ke.n f26188d;

        public a(List list, y.c cVar, ke.i iVar, ke.n nVar) {
            this.f26185a = list;
            this.f26186b = cVar;
            this.f26187c = iVar;
            this.f26188d = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f26185a.equals(aVar.f26185a) || !this.f26186b.equals(aVar.f26186b) || !this.f26187c.equals(aVar.f26187c)) {
                return false;
            }
            ke.n nVar = aVar.f26188d;
            ke.n nVar2 = this.f26188d;
            if (nVar2 != null) {
                return nVar2.equals(nVar);
            }
            if (nVar == null) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            int hashCode = this.f26186b.hashCode();
            int hashCode2 = (this.f26187c.hashCode() + ((hashCode + (this.f26185a.hashCode() * 31)) * 31)) * 31;
            ke.n nVar = this.f26188d;
            if (nVar != null) {
                i6 = nVar.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode2 + i6;
        }

        public final String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f26185a + ", removedTargetIds=" + this.f26186b + ", key=" + this.f26187c + ", newDocument=" + this.f26188d + '}';
        }
    }

    /* compiled from: WatchChange.java */
    /* loaded from: classes.dex */
    public static final class b extends c0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f26189a;

        /* renamed from: b  reason: collision with root package name */
        public final vd.a f26190b;

        public b(int i6, vd.a aVar) {
            this.f26189a = i6;
            this.f26190b = aVar;
        }

        public final String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f26189a + ", existenceFilter=" + this.f26190b + '}';
        }
    }

    /* compiled from: WatchChange.java */
    /* loaded from: classes.dex */
    public static final class c extends c0 {

        /* renamed from: a  reason: collision with root package name */
        public final d f26191a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f26192b;

        /* renamed from: c  reason: collision with root package name */
        public final com.google.protobuf.h f26193c;

        /* renamed from: d  reason: collision with root package name */
        public final i0 f26194d;

        public c(d dVar, y.c cVar, com.google.protobuf.h hVar, i0 i0Var) {
            boolean z10;
            if (i0Var != null && dVar != d.Removed) {
                z10 = false;
            } else {
                z10 = true;
            }
            ca.a.u0(z10, "Got cause for a target change that was not a removal", new Object[0]);
            this.f26191a = dVar;
            this.f26192b = cVar;
            this.f26193c = hVar;
            if (i0Var != null && !i0Var.e()) {
                this.f26194d = i0Var;
            } else {
                this.f26194d = null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f26191a != cVar.f26191a || !this.f26192b.equals(cVar.f26192b) || !this.f26193c.equals(cVar.f26193c)) {
                return false;
            }
            i0 i0Var = cVar.f26194d;
            i0 i0Var2 = this.f26194d;
            if (i0Var2 != null) {
                if (i0Var != null && i0Var2.f33491a.equals(i0Var.f33491a)) {
                    return true;
                }
                return false;
            } else if (i0Var == null) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            int i6;
            int hashCode = this.f26192b.hashCode();
            int hashCode2 = (this.f26193c.hashCode() + ((hashCode + (this.f26191a.hashCode() * 31)) * 31)) * 31;
            i0 i0Var = this.f26194d;
            if (i0Var != null) {
                i6 = i0Var.f33491a.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode2 + i6;
        }

        public final String toString() {
            return "WatchTargetChange{changeType=" + this.f26191a + ", targetIds=" + this.f26192b + '}';
        }
    }

    /* compiled from: WatchChange.java */
    /* loaded from: classes.dex */
    public enum d {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }
}
