package le;

import ke.r;
/* compiled from: Precondition.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f24227c = new l(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final r f24228a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f24229b;

    public l(r rVar, Boolean bool) {
        boolean z10;
        if (rVar != null && bool != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f24228a = rVar;
        this.f24229b = bool;
    }

    public final boolean a(ke.n nVar) {
        boolean z10;
        r rVar = this.f24228a;
        if (rVar != null) {
            if (nVar.b() && nVar.f23287d.equals(rVar)) {
                return true;
            }
            return false;
        }
        Boolean bool = this.f24229b;
        if (bool != null) {
            if (bool.booleanValue() == nVar.b()) {
                return true;
            }
            return false;
        }
        if (rVar == null && bool == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Precondition should be empty", new Object[0]);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        r rVar = lVar.f24228a;
        r rVar2 = this.f24228a;
        if (rVar2 == null ? rVar != null : !rVar2.equals(rVar)) {
            return false;
        }
        Boolean bool = lVar.f24229b;
        Boolean bool2 = this.f24229b;
        if (bool2 != null) {
            return bool2.equals(bool);
        }
        if (bool == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = 0;
        r rVar = this.f24228a;
        if (rVar != null) {
            i6 = rVar.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = i6 * 31;
        Boolean bool = this.f24229b;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        boolean z10;
        Boolean bool = this.f24229b;
        r rVar = this.f24228a;
        if (rVar == null && bool == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "Precondition{<none>}";
        }
        if (rVar != null) {
            return "Precondition{updateTime=" + rVar + "}";
        } else if (bool != null) {
            return "Precondition{exists=" + bool + "}";
        } else {
            ca.a.V("Invalid Precondition", new Object[0]);
            throw null;
        }
    }
}
