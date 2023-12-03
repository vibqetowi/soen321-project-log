package pe;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f28390a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f28391b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f28390a = str;
            this.f28391b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // pe.i
    public final List<String> a() {
        return this.f28391b;
    }

    @Override // pe.i
    public final String b() {
        return this.f28390a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f28390a.equals(iVar.b()) && this.f28391b.equals(iVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28390a.hashCode() ^ 1000003) * 1000003) ^ this.f28391b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f28390a + ", usedDates=" + this.f28391b + "}";
    }
}
