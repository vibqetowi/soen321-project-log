package h3;

import android.graphics.Path;
/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17127a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f17128b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17129c;

    /* renamed from: d  reason: collision with root package name */
    public final g3.a f17130d;

    /* renamed from: e  reason: collision with root package name */
    public final g3.a f17131e;
    public final boolean f;

    public k(String str, boolean z10, Path.FillType fillType, g3.a aVar, g3.a aVar2, boolean z11) {
        this.f17129c = str;
        this.f17127a = z10;
        this.f17128b = fillType;
        this.f17130d = aVar;
        this.f17131e = aVar2;
        this.f = z11;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new c3.f(jVar, bVar, this);
    }

    public final String toString() {
        return defpackage.c.t(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f17127a, '}');
    }
}
