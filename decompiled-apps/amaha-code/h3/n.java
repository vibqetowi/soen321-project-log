package h3;

import c3.q;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17139a;

    /* renamed from: b  reason: collision with root package name */
    public final g3.b f17140b;

    /* renamed from: c  reason: collision with root package name */
    public final List<g3.b> f17141c;

    /* renamed from: d  reason: collision with root package name */
    public final g3.a f17142d;

    /* renamed from: e  reason: collision with root package name */
    public final g3.a f17143e;
    public final g3.b f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17144g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17145h;

    /* renamed from: i  reason: collision with root package name */
    public final float f17146i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17147j;

    public n(String str, g3.b bVar, ArrayList arrayList, g3.a aVar, g3.a aVar2, g3.b bVar2, int i6, int i10, float f, boolean z10) {
        this.f17139a = str;
        this.f17140b = bVar;
        this.f17141c = arrayList;
        this.f17142d = aVar;
        this.f17143e = aVar2;
        this.f = bVar2;
        this.f17144g = i6;
        this.f17145h = i10;
        this.f17146i = f;
        this.f17147j = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new q(jVar, bVar, this);
    }
}
