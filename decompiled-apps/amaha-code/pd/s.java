package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes.dex */
public final class s extends b0.e.d.a.b.AbstractC0477d.AbstractC0478a {

    /* renamed from: a  reason: collision with root package name */
    public final long f28344a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28345b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28346c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28347d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28348e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.d.a.b.AbstractC0477d.AbstractC0478a.AbstractC0479a {

        /* renamed from: a  reason: collision with root package name */
        public Long f28349a;

        /* renamed from: b  reason: collision with root package name */
        public String f28350b;

        /* renamed from: c  reason: collision with root package name */
        public String f28351c;

        /* renamed from: d  reason: collision with root package name */
        public Long f28352d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f28353e;

        public final s a() {
            String str;
            if (this.f28349a == null) {
                str = " pc";
            } else {
                str = "";
            }
            if (this.f28350b == null) {
                str = str.concat(" symbol");
            }
            if (this.f28352d == null) {
                str = pl.a.f(str, " offset");
            }
            if (this.f28353e == null) {
                str = pl.a.f(str, " importance");
            }
            if (str.isEmpty()) {
                return new s(this.f28349a.longValue(), this.f28350b, this.f28351c, this.f28352d.longValue(), this.f28353e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public s(long j10, String str, String str2, long j11, int i6) {
        this.f28344a = j10;
        this.f28345b = str;
        this.f28346c = str2;
        this.f28347d = j11;
        this.f28348e = i6;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d.AbstractC0478a
    public final String a() {
        return this.f28346c;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d.AbstractC0478a
    public final int b() {
        return this.f28348e;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d.AbstractC0478a
    public final long c() {
        return this.f28347d;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d.AbstractC0478a
    public final long d() {
        return this.f28344a;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d.AbstractC0478a
    public final String e() {
        return this.f28345b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0477d.AbstractC0478a)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0477d.AbstractC0478a abstractC0478a = (b0.e.d.a.b.AbstractC0477d.AbstractC0478a) obj;
        if (this.f28344a == abstractC0478a.d() && this.f28345b.equals(abstractC0478a.e()) && ((str = this.f28346c) != null ? str.equals(abstractC0478a.a()) : abstractC0478a.a() == null) && this.f28347d == abstractC0478a.c() && this.f28348e == abstractC0478a.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f28344a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f28345b.hashCode()) * 1000003;
        String str = this.f28346c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.f28347d;
        return this.f28348e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f28344a);
        sb2.append(", symbol=");
        sb2.append(this.f28345b);
        sb2.append(", file=");
        sb2.append(this.f28346c);
        sb2.append(", offset=");
        sb2.append(this.f28347d);
        sb2.append(", importance=");
        return pl.a.g(sb2, this.f28348e, "}");
    }
}
