package h3;

import android.graphics.PointF;
/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17078a;

    /* renamed from: b  reason: collision with root package name */
    public final g3.e<PointF, PointF> f17079b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.a f17080c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17081d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17082e;

    public a(String str, g3.e<PointF, PointF> eVar, g3.a aVar, boolean z10, boolean z11) {
        this.f17078a = str;
        this.f17079b = eVar;
        this.f17080c = aVar;
        this.f17081d = z10;
        this.f17082e = z11;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new c3.e(jVar, bVar, this);
    }
}
