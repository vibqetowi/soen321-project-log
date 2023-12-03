package he;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: FieldFilter.java */
/* loaded from: classes.dex */
public class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final a f17537a;

    /* renamed from: b  reason: collision with root package name */
    public final rf.s f17538b;

    /* renamed from: c  reason: collision with root package name */
    public final ke.m f17539c;

    /* compiled from: FieldFilter.java */
    /* loaded from: classes.dex */
    public enum a {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f17545u;

        a(String str) {
            this.f17545u = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f17545u;
        }
    }

    public k(ke.m mVar, a aVar, rf.s sVar) {
        this.f17539c = mVar;
        this.f17537a = aVar;
        this.f17538b = sVar;
    }

    public static k f(ke.m mVar, a aVar, rf.s sVar) {
        boolean z10;
        boolean v10 = mVar.v();
        a aVar2 = a.ARRAY_CONTAINS_ANY;
        a aVar3 = a.NOT_IN;
        a aVar4 = a.IN;
        a aVar5 = a.ARRAY_CONTAINS;
        if (v10) {
            if (aVar == aVar4) {
                return new q(mVar, sVar);
            }
            if (aVar == aVar3) {
                return new r(mVar, sVar);
            }
            if (aVar != aVar5 && aVar != aVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, r1.b0.b(new StringBuilder(), aVar.f17545u, "queries don't make sense on document keys"), new Object[0]);
            return new p(mVar, aVar, sVar);
        } else if (aVar == aVar5) {
            return new c(mVar, sVar);
        } else {
            if (aVar == aVar4) {
                return new o(mVar, sVar);
            }
            if (aVar == aVar2) {
                return new b(mVar, sVar);
            }
            if (aVar == aVar3) {
                return new v(mVar, sVar);
            }
            return new k(mVar, aVar, sVar);
        }
    }

    @Override // he.l
    public final String a() {
        return this.f17539c.h() + this.f17537a.f17545u + ke.t.a(this.f17538b);
    }

    @Override // he.l
    public final List<l> b() {
        return Collections.singletonList(this);
    }

    @Override // he.l
    public final ke.m c() {
        if (g()) {
            return this.f17539c;
        }
        return null;
    }

    @Override // he.l
    public final List<k> d() {
        return Collections.singletonList(this);
    }

    @Override // he.l
    public boolean e(ke.g gVar) {
        rf.s e10 = gVar.e(this.f17539c);
        a aVar = a.NOT_EQUAL;
        a aVar2 = this.f17537a;
        rf.s sVar = this.f17538b;
        if (aVar2 == aVar) {
            if (e10 == null || !h(ke.t.c(e10, sVar))) {
                return false;
            }
            return true;
        } else if (e10 == null || ke.t.m(e10) != ke.t.m(sVar) || !h(ke.t.c(e10, sVar))) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f17537a != kVar.f17537a || !this.f17539c.equals(kVar.f17539c) || !this.f17538b.equals(kVar.f17538b)) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return Arrays.asList(a.LESS_THAN, a.LESS_THAN_OR_EQUAL, a.GREATER_THAN, a.GREATER_THAN_OR_EQUAL, a.NOT_EQUAL, a.NOT_IN).contains(this.f17537a);
    }

    public final boolean h(int i6) {
        a aVar = this.f17537a;
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (i6 < 0) {
                                    return false;
                                }
                                return true;
                            }
                            ca.a.V("Unknown FieldFilter operator: %s", aVar);
                            throw null;
                        } else if (i6 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (i6 == 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i6 != 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (i6 > 0) {
                return false;
            } else {
                return true;
            }
        } else if (i6 >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        int hashCode = this.f17539c.hashCode();
        return this.f17538b.hashCode() + ((hashCode + ((this.f17537a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
