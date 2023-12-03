package h3;

import c3.r;
/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f17148a;

    /* renamed from: b  reason: collision with root package name */
    public final g3.b f17149b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.b f17150c;

    /* renamed from: d  reason: collision with root package name */
    public final g3.b f17151d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17152e;

    public o(String str, int i6, g3.b bVar, g3.b bVar2, g3.b bVar3, boolean z10) {
        this.f17148a = i6;
        this.f17149b = bVar;
        this.f17150c = bVar2;
        this.f17151d = bVar3;
        this.f17152e = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new r(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f17149b + ", end: " + this.f17150c + ", offset: " + this.f17151d + "}";
    }
}
