package j7;

import j7.d;
import java.util.Map;
/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final m7.a f21689a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<a7.d, d.a> f21690b;

    public a(m7.a aVar, Map<a7.d, d.a> map) {
        if (aVar != null) {
            this.f21689a = aVar;
            if (map != null) {
                this.f21690b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // j7.d
    public final m7.a a() {
        return this.f21689a;
    }

    @Override // j7.d
    public final Map<a7.d, d.a> c() {
        return this.f21690b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f21689a.equals(dVar.a()) && this.f21690b.equals(dVar.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21689a.hashCode() ^ 1000003) * 1000003) ^ this.f21690b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f21689a + ", values=" + this.f21690b + "}";
    }
}
