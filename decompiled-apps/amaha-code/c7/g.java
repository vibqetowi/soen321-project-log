package c7;

import java.util.List;
/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f5053a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5054b;

    /* renamed from: c  reason: collision with root package name */
    public final k f5055c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f5056d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5057e;
    public final List<l> f;

    /* renamed from: g  reason: collision with root package name */
    public final p f5058g;

    public g() {
        throw null;
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f5053a = j10;
        this.f5054b = j11;
        this.f5055c = kVar;
        this.f5056d = num;
        this.f5057e = str;
        this.f = list;
        this.f5058g = pVar;
    }

    @Override // c7.m
    public final k a() {
        return this.f5055c;
    }

    @Override // c7.m
    public final List<l> b() {
        return this.f;
    }

    @Override // c7.m
    public final Integer c() {
        return this.f5056d;
    }

    @Override // c7.m
    public final String d() {
        return this.f5057e;
    }

    @Override // c7.m
    public final p e() {
        return this.f5058g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f5053a == mVar.f() && this.f5054b == mVar.g() && ((kVar = this.f5055c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f5056d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f5057e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f5058g;
            if (pVar == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // c7.m
    public final long f() {
        return this.f5053a;
    }

    @Override // c7.m
    public final long g() {
        return this.f5054b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f5053a;
        long j11 = this.f5054b;
        int i6 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int i10 = 0;
        k kVar = this.f5055c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i11 = (i6 ^ hashCode) * 1000003;
        Integer num = this.f5056d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str = this.f5057e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        List<l> list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        p pVar = this.f5058g;
        if (pVar != null) {
            i10 = pVar.hashCode();
        }
        return i14 ^ i10;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5053a + ", requestUptimeMs=" + this.f5054b + ", clientInfo=" + this.f5055c + ", logSource=" + this.f5056d + ", logSourceName=" + this.f5057e + ", logEvents=" + this.f + ", qosTier=" + this.f5058g + "}";
    }
}
