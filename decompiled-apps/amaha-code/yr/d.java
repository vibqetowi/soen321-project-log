package yr;

import zv.i;
/* compiled from: Header.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final i f38924d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f38925e;
    public static final i f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f38926g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f38927h;

    /* renamed from: a  reason: collision with root package name */
    public final i f38928a;

    /* renamed from: b  reason: collision with root package name */
    public final i f38929b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38930c;

    static {
        i iVar = i.f39888x;
        f38924d = i.a.c(":status");
        f38925e = i.a.c(":method");
        f = i.a.c(":path");
        f38926g = i.a.c(":scheme");
        f38927h = i.a.c(":authority");
        i.a.c(":host");
        i.a.c(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(i.a.c(str), i.a.c(str2));
        i iVar = i.f39888x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f38928a.equals(dVar.f38928a) || !this.f38929b.equals(dVar.f38929b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f38929b.hashCode() + ((this.f38928a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f38928a.u(), this.f38929b.u());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str) {
        this(iVar, i.a.c(str));
        i iVar2 = i.f39888x;
    }

    public d(i iVar, i iVar2) {
        this.f38928a = iVar;
        this.f38929b = iVar2;
        this.f38930c = iVar2.h() + iVar.h() + 32;
    }
}
