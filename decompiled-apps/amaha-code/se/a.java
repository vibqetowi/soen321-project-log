package se;
/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final String f31464a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31465b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31466c;

    public a(String str, long j10, long j11) {
        this.f31464a = str;
        this.f31465b = j10;
        this.f31466c = j11;
    }

    @Override // se.g
    public final String a() {
        return this.f31464a;
    }

    @Override // se.g
    public final long b() {
        return this.f31466c;
    }

    @Override // se.g
    public final long c() {
        return this.f31465b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f31464a.equals(gVar.a()) && this.f31465b == gVar.c() && this.f31466c == gVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31465b;
        long j11 = this.f31466c;
        return ((((this.f31464a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f31464a + ", tokenExpirationTimestamp=" + this.f31465b + ", tokenCreationTimestamp=" + this.f31466c + "}";
    }
}
