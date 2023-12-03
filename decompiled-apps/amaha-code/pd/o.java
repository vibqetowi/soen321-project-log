package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes.dex */
public final class o extends b0.e.d.a.b.AbstractC0474a {

    /* renamed from: a  reason: collision with root package name */
    public final long f28325a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28326b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28327c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28328d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.d.a.b.AbstractC0474a.AbstractC0475a {

        /* renamed from: a  reason: collision with root package name */
        public Long f28329a;

        /* renamed from: b  reason: collision with root package name */
        public Long f28330b;

        /* renamed from: c  reason: collision with root package name */
        public String f28331c;

        /* renamed from: d  reason: collision with root package name */
        public String f28332d;

        public final o a() {
            String str;
            if (this.f28329a == null) {
                str = " baseAddress";
            } else {
                str = "";
            }
            if (this.f28330b == null) {
                str = str.concat(" size");
            }
            if (this.f28331c == null) {
                str = pl.a.f(str, " name");
            }
            if (str.isEmpty()) {
                return new o(this.f28329a.longValue(), this.f28330b.longValue(), this.f28331c, this.f28332d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public o(long j10, long j11, String str, String str2) {
        this.f28325a = j10;
        this.f28326b = j11;
        this.f28327c = str;
        this.f28328d = str2;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0474a
    public final long a() {
        return this.f28325a;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0474a
    public final String b() {
        return this.f28327c;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0474a
    public final long c() {
        return this.f28326b;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0474a
    public final String d() {
        return this.f28328d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0474a)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0474a abstractC0474a = (b0.e.d.a.b.AbstractC0474a) obj;
        if (this.f28325a == abstractC0474a.a() && this.f28326b == abstractC0474a.c() && this.f28327c.equals(abstractC0474a.b())) {
            String str = this.f28328d;
            if (str == null) {
                if (abstractC0474a.d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0474a.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f28325a;
        long j11 = this.f28326b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f28327c.hashCode()) * 1000003;
        String str = this.f28328d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f28325a);
        sb2.append(", size=");
        sb2.append(this.f28326b);
        sb2.append(", name=");
        sb2.append(this.f28327c);
        sb2.append(", uuid=");
        return r1.b0.b(sb2, this.f28328d, "}");
    }
}
