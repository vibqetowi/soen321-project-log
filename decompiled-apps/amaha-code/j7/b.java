package j7;

import j7.d;
import java.util.Set;
/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class b extends d.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f21691a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21692b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<d.b> f21693c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes.dex */
    public static final class a extends d.a.AbstractC0323a {

        /* renamed from: a  reason: collision with root package name */
        public Long f21694a;

        /* renamed from: b  reason: collision with root package name */
        public Long f21695b;

        /* renamed from: c  reason: collision with root package name */
        public Set<d.b> f21696c;

        public final b a() {
            String str;
            if (this.f21694a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f21695b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f21696c == null) {
                str = pl.a.f(str, " flags");
            }
            if (str.isEmpty()) {
                return new b(this.f21694a.longValue(), this.f21695b.longValue(), this.f21696c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(long j10, long j11, Set set) {
        this.f21691a = j10;
        this.f21692b = j11;
        this.f21693c = set;
    }

    @Override // j7.d.a
    public final long a() {
        return this.f21691a;
    }

    @Override // j7.d.a
    public final Set<d.b> b() {
        return this.f21693c;
    }

    @Override // j7.d.a
    public final long c() {
        return this.f21692b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d.a)) {
            return false;
        }
        d.a aVar = (d.a) obj;
        if (this.f21691a == aVar.a() && this.f21692b == aVar.c() && this.f21693c.equals(aVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f21691a;
        long j11 = this.f21692b;
        return this.f21693c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f21691a + ", maxAllowedDelay=" + this.f21692b + ", flags=" + this.f21693c + "}";
    }
}
