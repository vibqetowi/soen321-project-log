package pd;

import pd.d0;
/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes.dex */
public final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f28214a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28215b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28216c;

    public a0(String str, String str2, boolean z10) {
        if (str != null) {
            this.f28214a = str;
            if (str2 != null) {
                this.f28215b = str2;
                this.f28216c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // pd.d0.c
    public final boolean a() {
        return this.f28216c;
    }

    @Override // pd.d0.c
    public final String b() {
        return this.f28215b;
    }

    @Override // pd.d0.c
    public final String c() {
        return this.f28214a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.c)) {
            return false;
        }
        d0.c cVar = (d0.c) obj;
        if (this.f28214a.equals(cVar.c()) && this.f28215b.equals(cVar.b()) && this.f28216c == cVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = (((this.f28214a.hashCode() ^ 1000003) * 1000003) ^ this.f28215b.hashCode()) * 1000003;
        if (this.f28216c) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return hashCode ^ i6;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f28214a + ", osCodeName=" + this.f28215b + ", isRooted=" + this.f28216c + "}";
    }
}
