package ve;

import v.h;
/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f34977a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34978b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34979c;

    /* renamed from: d  reason: collision with root package name */
    public final f f34980d;

    /* renamed from: e  reason: collision with root package name */
    public final int f34981e;

    public a(String str, String str2, String str3, f fVar, int i6) {
        this.f34977a = str;
        this.f34978b = str2;
        this.f34979c = str3;
        this.f34980d = fVar;
        this.f34981e = i6;
    }

    @Override // ve.d
    public final f a() {
        return this.f34980d;
    }

    @Override // ve.d
    public final String b() {
        return this.f34978b;
    }

    @Override // ve.d
    public final String c() {
        return this.f34979c;
    }

    @Override // ve.d
    public final int d() {
        return this.f34981e;
    }

    @Override // ve.d
    public final String e() {
        return this.f34977a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f34977a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f34978b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f34979c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f34980d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i6 = this.f34981e;
                        if (i6 == 0) {
                            if (dVar.d() == 0) {
                                return true;
                            }
                        } else if (h.b(i6, dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i6 = 0;
        String str = this.f34977a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f34978b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f34979c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        f fVar = this.f34980d;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.f34981e;
        if (i14 != 0) {
            i6 = h.d(i14);
        }
        return i6 ^ i13;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f34977a + ", fid=" + this.f34978b + ", refreshToken=" + this.f34979c + ", authToken=" + this.f34980d + ", responseCode=" + ri.e.i(this.f34981e) + "}";
    }
}
