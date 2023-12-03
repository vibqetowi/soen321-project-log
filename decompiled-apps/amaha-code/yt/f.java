package yt;

import java.util.ArrayList;
import yt.g;
import yt.o;
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class f implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o.a f39010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o.a f39011b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.a f39012c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ fu.e f39013d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList<ht.c> f39014e;

    public f(h hVar, g.a aVar, fu.e eVar, ArrayList arrayList) {
        this.f39011b = hVar;
        this.f39012c = aVar;
        this.f39013d = eVar;
        this.f39014e = arrayList;
        this.f39010a = hVar;
    }

    @Override // yt.o.a
    public final void a() {
        this.f39011b.a();
        this.f39012c.g(this.f39013d, new ku.a((ht.c) is.u.y2(this.f39014e)));
    }

    @Override // yt.o.a
    public final void b(Object obj, fu.e eVar) {
        this.f39010a.b(obj, eVar);
    }

    @Override // yt.o.a
    public final o.b c(fu.e eVar) {
        return this.f39010a.c(eVar);
    }

    @Override // yt.o.a
    public final o.a d(fu.b bVar, fu.e eVar) {
        return this.f39010a.d(bVar, eVar);
    }

    @Override // yt.o.a
    public final void e(fu.e eVar, ku.f fVar) {
        this.f39010a.e(eVar, fVar);
    }

    @Override // yt.o.a
    public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
        this.f39010a.f(eVar, bVar, eVar2);
    }
}
