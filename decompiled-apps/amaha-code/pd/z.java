package pd;

import pd.d0;
/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes.dex */
public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f28382a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28383b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28384c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28385d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28386e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28387g;

    /* renamed from: h  reason: collision with root package name */
    public final String f28388h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28389i;

    public z(int i6, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f28382a = i6;
        if (str != null) {
            this.f28383b = str;
            this.f28384c = i10;
            this.f28385d = j10;
            this.f28386e = j11;
            this.f = z10;
            this.f28387g = i11;
            if (str2 != null) {
                this.f28388h = str2;
                if (str3 != null) {
                    this.f28389i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // pd.d0.b
    public final int a() {
        return this.f28382a;
    }

    @Override // pd.d0.b
    public final int b() {
        return this.f28384c;
    }

    @Override // pd.d0.b
    public final long c() {
        return this.f28386e;
    }

    @Override // pd.d0.b
    public final boolean d() {
        return this.f;
    }

    @Override // pd.d0.b
    public final String e() {
        return this.f28388h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        if (this.f28382a == bVar.a() && this.f28383b.equals(bVar.f()) && this.f28384c == bVar.b() && this.f28385d == bVar.i() && this.f28386e == bVar.c() && this.f == bVar.d() && this.f28387g == bVar.h() && this.f28388h.equals(bVar.e()) && this.f28389i.equals(bVar.g())) {
            return true;
        }
        return false;
    }

    @Override // pd.d0.b
    public final String f() {
        return this.f28383b;
    }

    @Override // pd.d0.b
    public final String g() {
        return this.f28389i;
    }

    @Override // pd.d0.b
    public final int h() {
        return this.f28387g;
    }

    public final int hashCode() {
        int i6;
        long j10 = this.f28385d;
        long j11 = this.f28386e;
        int hashCode = (((((((((this.f28382a ^ 1000003) * 1000003) ^ this.f28383b.hashCode()) * 1000003) ^ this.f28384c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return ((((((hashCode ^ i6) * 1000003) ^ this.f28387g) * 1000003) ^ this.f28388h.hashCode()) * 1000003) ^ this.f28389i.hashCode();
    }

    @Override // pd.d0.b
    public final long i() {
        return this.f28385d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f28382a);
        sb2.append(", model=");
        sb2.append(this.f28383b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f28384c);
        sb2.append(", totalRam=");
        sb2.append(this.f28385d);
        sb2.append(", diskSpace=");
        sb2.append(this.f28386e);
        sb2.append(", isEmulator=");
        sb2.append(this.f);
        sb2.append(", state=");
        sb2.append(this.f28387g);
        sb2.append(", manufacturer=");
        sb2.append(this.f28388h);
        sb2.append(", modelClass=");
        return r1.b0.b(sb2, this.f28389i, "}");
    }
}
