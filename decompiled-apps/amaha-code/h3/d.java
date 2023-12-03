package h3;

import android.graphics.Path;
/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f17085a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f17086b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.a f17087c;

    /* renamed from: d  reason: collision with root package name */
    public final g3.a f17088d;

    /* renamed from: e  reason: collision with root package name */
    public final g3.a f17089e;
    public final g3.a f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17090g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17091h;

    public d(String str, int i6, Path.FillType fillType, g3.a aVar, g3.a aVar2, g3.a aVar3, g3.a aVar4, boolean z10) {
        this.f17085a = i6;
        this.f17086b = fillType;
        this.f17087c = aVar;
        this.f17088d = aVar2;
        this.f17089e = aVar3;
        this.f = aVar4;
        this.f17090g = str;
        this.f17091h = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new c3.g(jVar, bVar, this);
    }
}
