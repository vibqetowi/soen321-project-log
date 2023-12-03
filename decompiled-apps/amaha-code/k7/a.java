package k7;
/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f23026b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23027c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23028d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23029e;
    public final int f;

    public a(long j10, int i6, int i10, long j11, int i11) {
        this.f23026b = j10;
        this.f23027c = i6;
        this.f23028d = i10;
        this.f23029e = j11;
        this.f = i11;
    }

    @Override // k7.e
    public final int a() {
        return this.f23028d;
    }

    @Override // k7.e
    public final long b() {
        return this.f23029e;
    }

    @Override // k7.e
    public final int c() {
        return this.f23027c;
    }

    @Override // k7.e
    public final int d() {
        return this.f;
    }

    @Override // k7.e
    public final long e() {
        return this.f23026b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f23026b == eVar.e() && this.f23027c == eVar.c() && this.f23028d == eVar.a() && this.f23029e == eVar.b() && this.f == eVar.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23026b;
        long j11 = this.f23029e;
        return this.f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f23027c) * 1000003) ^ this.f23028d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f23026b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f23027c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f23028d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f23029e);
        sb2.append(", maxBlobByteSizePerRow=");
        return pl.a.g(sb2, this.f, "}");
    }
}
