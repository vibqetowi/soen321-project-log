package sv;

import zv.i;
/* compiled from: Header.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final zv.i f32097d;

    /* renamed from: e  reason: collision with root package name */
    public static final zv.i f32098e;
    public static final zv.i f;

    /* renamed from: g  reason: collision with root package name */
    public static final zv.i f32099g;

    /* renamed from: h  reason: collision with root package name */
    public static final zv.i f32100h;

    /* renamed from: i  reason: collision with root package name */
    public static final zv.i f32101i;

    /* renamed from: a  reason: collision with root package name */
    public final zv.i f32102a;

    /* renamed from: b  reason: collision with root package name */
    public final zv.i f32103b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32104c;

    static {
        zv.i iVar = zv.i.f39888x;
        f32097d = i.a.c(":");
        f32098e = i.a.c(":status");
        f = i.a.c(":method");
        f32099g = i.a.c(":path");
        f32100h = i.a.c(":scheme");
        f32101i = i.a.c(":authority");
    }

    public b(zv.i name, zv.i value) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(value, "value");
        this.f32102a = name;
        this.f32103b = value;
        this.f32104c = value.h() + name.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.i.b(this.f32102a, bVar.f32102a) && kotlin.jvm.internal.i.b(this.f32103b, bVar.f32103b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32103b.hashCode() + (this.f32102a.hashCode() * 31);
    }

    public final String toString() {
        return this.f32102a.u() + ": " + this.f32103b.u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String name, String value) {
        this(i.a.c(name), i.a.c(value));
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(value, "value");
        zv.i iVar = zv.i.f39888x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(zv.i name, String value) {
        this(name, i.a.c(value));
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(value, "value");
        zv.i iVar = zv.i.f39888x;
    }
}
