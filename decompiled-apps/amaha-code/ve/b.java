package ve;

import r1.b0;
import v.h;
/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f34982a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34983b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34984c;

    public b(String str, long j10, int i6) {
        this.f34982a = str;
        this.f34983b = j10;
        this.f34984c = i6;
    }

    @Override // ve.f
    public final int a() {
        return this.f34984c;
    }

    @Override // ve.f
    public final String b() {
        return this.f34982a;
    }

    @Override // ve.f
    public final long c() {
        return this.f34983b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f34982a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f34983b == fVar.c()) {
                int i6 = this.f34984c;
                if (i6 == 0) {
                    if (fVar.a() == 0) {
                        return true;
                    }
                } else if (h.b(i6, fVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f34982a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f34983b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f34984c;
        if (i11 != 0) {
            i6 = h.d(i11);
        }
        return i6 ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f34982a + ", tokenExpirationTimestamp=" + this.f34983b + ", responseCode=" + b0.h(this.f34984c) + "}";
    }
}
