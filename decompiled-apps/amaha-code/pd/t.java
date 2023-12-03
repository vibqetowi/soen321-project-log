package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes.dex */
public final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f28354a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28355b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28356c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28357d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28358e;
    public final long f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f28359a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f28360b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f28361c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f28362d;

        /* renamed from: e  reason: collision with root package name */
        public Long f28363e;
        public Long f;

        public final t a() {
            String str;
            if (this.f28360b == null) {
                str = " batteryVelocity";
            } else {
                str = "";
            }
            if (this.f28361c == null) {
                str = str.concat(" proximityOn");
            }
            if (this.f28362d == null) {
                str = pl.a.f(str, " orientation");
            }
            if (this.f28363e == null) {
                str = pl.a.f(str, " ramUsed");
            }
            if (this.f == null) {
                str = pl.a.f(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new t(this.f28359a, this.f28360b.intValue(), this.f28361c.booleanValue(), this.f28362d.intValue(), this.f28363e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public t(Double d10, int i6, boolean z10, int i10, long j10, long j11) {
        this.f28354a = d10;
        this.f28355b = i6;
        this.f28356c = z10;
        this.f28357d = i10;
        this.f28358e = j10;
        this.f = j11;
    }

    @Override // pd.b0.e.d.c
    public final Double a() {
        return this.f28354a;
    }

    @Override // pd.b0.e.d.c
    public final int b() {
        return this.f28355b;
    }

    @Override // pd.b0.e.d.c
    public final long c() {
        return this.f;
    }

    @Override // pd.b0.e.d.c
    public final int d() {
        return this.f28357d;
    }

    @Override // pd.b0.e.d.c
    public final long e() {
        return this.f28358e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.c)) {
            return false;
        }
        b0.e.d.c cVar = (b0.e.d.c) obj;
        Double d10 = this.f28354a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f28355b == cVar.b() && this.f28356c == cVar.f() && this.f28357d == cVar.d() && this.f28358e == cVar.e() && this.f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // pd.b0.e.d.c
    public final boolean f() {
        return this.f28356c;
    }

    public final int hashCode() {
        int hashCode;
        int i6;
        Double d10 = this.f28354a;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f28355b) * 1000003;
        if (this.f28356c) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        long j10 = this.f28358e;
        long j11 = this.f;
        return ((((((i10 ^ i6) * 1000003) ^ this.f28357d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f28354a + ", batteryVelocity=" + this.f28355b + ", proximityOn=" + this.f28356c + ", orientation=" + this.f28357d + ", ramUsed=" + this.f28358e + ", diskUsed=" + this.f + "}";
    }
}
