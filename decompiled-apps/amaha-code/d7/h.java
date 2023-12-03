package d7;

import d7.n;
import java.util.Map;
/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f12226a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f12227b;

    /* renamed from: c  reason: collision with root package name */
    public final m f12228c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12229d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12230e;
    public final Map<String, String> f;

    /* compiled from: AutoValue_EventInternal.java */
    /* loaded from: classes.dex */
    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12231a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12232b;

        /* renamed from: c  reason: collision with root package name */
        public m f12233c;

        /* renamed from: d  reason: collision with root package name */
        public Long f12234d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12235e;
        public Map<String, String> f;

        public final h b() {
            String str;
            if (this.f12231a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f12233c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f12234d == null) {
                str = pl.a.f(str, " eventMillis");
            }
            if (this.f12235e == null) {
                str = pl.a.f(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = pl.a.f(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f12231a, this.f12232b, this.f12233c, this.f12234d.longValue(), this.f12235e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f12233c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f12231a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f12226a = str;
        this.f12227b = num;
        this.f12228c = mVar;
        this.f12229d = j10;
        this.f12230e = j11;
        this.f = map;
    }

    @Override // d7.n
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // d7.n
    public final Integer c() {
        return this.f12227b;
    }

    @Override // d7.n
    public final m d() {
        return this.f12228c;
    }

    @Override // d7.n
    public final long e() {
        return this.f12229d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f12226a.equals(nVar.g()) && ((num = this.f12227b) != null ? num.equals(nVar.c()) : nVar.c() == null) && this.f12228c.equals(nVar.d()) && this.f12229d == nVar.e() && this.f12230e == nVar.h() && this.f.equals(nVar.b())) {
            return true;
        }
        return false;
    }

    @Override // d7.n
    public final String g() {
        return this.f12226a;
    }

    @Override // d7.n
    public final long h() {
        return this.f12230e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f12226a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12227b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.f12229d;
        long j11 = this.f12230e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f12228c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f12226a + ", code=" + this.f12227b + ", encodedPayload=" + this.f12228c + ", eventMillis=" + this.f12229d + ", uptimeMillis=" + this.f12230e + ", autoMetadata=" + this.f + "}";
    }
}
