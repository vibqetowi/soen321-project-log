package h3;

import android.graphics.PointF;
/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17110a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17111b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.b f17112c;

    /* renamed from: d  reason: collision with root package name */
    public final g3.e<PointF, PointF> f17113d;

    /* renamed from: e  reason: collision with root package name */
    public final g3.b f17114e;
    public final g3.b f;

    /* renamed from: g  reason: collision with root package name */
    public final g3.b f17115g;

    /* renamed from: h  reason: collision with root package name */
    public final g3.b f17116h;

    /* renamed from: i  reason: collision with root package name */
    public final g3.b f17117i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17118j;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Lg3/b;Lg3/e<Landroid/graphics/PointF;Landroid/graphics/PointF;>;Lg3/b;Lg3/b;Lg3/b;Lg3/b;Lg3/b;Z)V */
    public h(String str, int i6, g3.b bVar, g3.e eVar, g3.b bVar2, g3.b bVar3, g3.b bVar4, g3.b bVar5, g3.b bVar6, boolean z10) {
        this.f17110a = str;
        this.f17111b = i6;
        this.f17112c = bVar;
        this.f17113d = eVar;
        this.f17114e = bVar2;
        this.f = bVar3;
        this.f17115g = bVar4;
        this.f17116h = bVar5;
        this.f17117i = bVar6;
        this.f17118j = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new c3.m(jVar, bVar, this);
    }
}
