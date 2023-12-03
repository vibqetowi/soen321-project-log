package com.google.android.gms.internal.measurement;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f8305a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8306b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8307c;

    public b(String str, long j10, HashMap hashMap) {
        this.f8305a = str;
        this.f8306b = j10;
        HashMap hashMap2 = new HashMap();
        this.f8307c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.f8305a, this.f8306b, new HashMap(this.f8307c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8306b != bVar.f8306b || !this.f8305a.equals(bVar.f8305a)) {
            return false;
        }
        return this.f8307c.equals(bVar.f8307c);
    }

    public final int hashCode() {
        long j10 = this.f8306b;
        return this.f8307c.hashCode() + (((this.f8305a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f8305a;
        String obj = this.f8307c.toString();
        StringBuilder g5 = defpackage.d.g("Event{name='", str, "', timestamp=");
        g5.append(this.f8306b);
        g5.append(", params=");
        g5.append(obj);
        g5.append("}");
        return g5.toString();
    }
}
