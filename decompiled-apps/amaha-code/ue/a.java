package ue;

import r1.b0;
import ri.e;
import ue.d;
import v.h;
/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f34026b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34027c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34028d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34029e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f34030g;

    /* renamed from: h  reason: collision with root package name */
    public final String f34031h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: ue.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0569a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f34032a;

        /* renamed from: b  reason: collision with root package name */
        public int f34033b;

        /* renamed from: c  reason: collision with root package name */
        public String f34034c;

        /* renamed from: d  reason: collision with root package name */
        public String f34035d;

        /* renamed from: e  reason: collision with root package name */
        public Long f34036e;
        public Long f;

        /* renamed from: g  reason: collision with root package name */
        public String f34037g;

        public C0569a() {
        }

        public final a a() {
            String str;
            if (this.f34033b == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f34036e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f == null) {
                str = pl.a.f(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f34032a, this.f34033b, this.f34034c, this.f34035d, this.f34036e.longValue(), this.f.longValue(), this.f34037g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0569a b(int i6) {
            if (i6 != 0) {
                this.f34033b = i6;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C0569a(d dVar) {
            this.f34032a = dVar.c();
            this.f34033b = dVar.f();
            this.f34034c = dVar.a();
            this.f34035d = dVar.e();
            this.f34036e = Long.valueOf(dVar.b());
            this.f = Long.valueOf(dVar.g());
            this.f34037g = dVar.d();
        }
    }

    public a(String str, int i6, String str2, String str3, long j10, long j11, String str4) {
        this.f34026b = str;
        this.f34027c = i6;
        this.f34028d = str2;
        this.f34029e = str3;
        this.f = j10;
        this.f34030g = j11;
        this.f34031h = str4;
    }

    @Override // ue.d
    public final String a() {
        return this.f34028d;
    }

    @Override // ue.d
    public final long b() {
        return this.f;
    }

    @Override // ue.d
    public final String c() {
        return this.f34026b;
    }

    @Override // ue.d
    public final String d() {
        return this.f34031h;
    }

    @Override // ue.d
    public final String e() {
        return this.f34029e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f34026b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (h.b(this.f34027c, dVar.f()) && ((str = this.f34028d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f34029e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f == dVar.b() && this.f34030g == dVar.g()) {
                String str4 = this.f34031h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ue.d
    public final int f() {
        return this.f34027c;
    }

    @Override // ue.d
    public final long g() {
        return this.f34030g;
    }

    public final C0569a h() {
        return new C0569a(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i6 = 0;
        String str = this.f34026b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = (((hashCode ^ 1000003) * 1000003) ^ h.d(this.f34027c)) * 1000003;
        String str2 = this.f34028d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (d10 ^ hashCode2) * 1000003;
        String str3 = this.f34029e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f;
        long j11 = this.f34030g;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f34031h;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i6 ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f34026b);
        sb2.append(", registrationStatus=");
        sb2.append(e.h(this.f34027c));
        sb2.append(", authToken=");
        sb2.append(this.f34028d);
        sb2.append(", refreshToken=");
        sb2.append(this.f34029e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f34030g);
        sb2.append(", fisError=");
        return b0.b(sb2, this.f34031h, "}");
    }
}
