package h3;

import c3.p;
/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17135a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17136b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.a f17137c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17138d;

    public m(String str, int i6, g3.a aVar, boolean z10) {
        this.f17135a = str;
        this.f17136b = i6;
        this.f17137c = aVar;
        this.f17138d = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new p(jVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f17135a);
        sb2.append(", index=");
        return defpackage.c.s(sb2, this.f17136b, '}');
    }
}
