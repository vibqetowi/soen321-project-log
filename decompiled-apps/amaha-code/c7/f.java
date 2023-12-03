package c7;

import c7.l;
import java.util.Arrays;
/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f5041a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f5042b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5043c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5044d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5045e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final o f5046g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes.dex */
    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f5047a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f5048b;

        /* renamed from: c  reason: collision with root package name */
        public Long f5049c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f5050d;

        /* renamed from: e  reason: collision with root package name */
        public String f5051e;
        public Long f;

        /* renamed from: g  reason: collision with root package name */
        public o f5052g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f5041a = j10;
        this.f5042b = num;
        this.f5043c = j11;
        this.f5044d = bArr;
        this.f5045e = str;
        this.f = j12;
        this.f5046g = oVar;
    }

    @Override // c7.l
    public final Integer a() {
        return this.f5042b;
    }

    @Override // c7.l
    public final long b() {
        return this.f5041a;
    }

    @Override // c7.l
    public final long c() {
        return this.f5043c;
    }

    @Override // c7.l
    public final o d() {
        return this.f5046g;
    }

    @Override // c7.l
    public final byte[] e() {
        return this.f5044d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] e10;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f5041a == lVar.b() && ((num = this.f5042b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f5043c == lVar.c()) {
            if (lVar instanceof f) {
                e10 = ((f) lVar).f5044d;
            } else {
                e10 = lVar.e();
            }
            if (Arrays.equals(this.f5044d, e10) && ((str = this.f5045e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f == lVar.g()) {
                o oVar = this.f5046g;
                if (oVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c7.l
    public final String f() {
        return this.f5045e;
    }

    @Override // c7.l
    public final long g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f5041a;
        int i6 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f5042b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f5043c;
        int hashCode3 = (((((i6 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5044d)) * 1000003;
        String str = this.f5045e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f;
        int i11 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        o oVar = this.f5046g;
        if (oVar != null) {
            i10 = oVar.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5041a + ", eventCode=" + this.f5042b + ", eventUptimeMs=" + this.f5043c + ", sourceExtension=" + Arrays.toString(this.f5044d) + ", sourceExtensionJsonProto3=" + this.f5045e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f5046g + "}";
    }
}
