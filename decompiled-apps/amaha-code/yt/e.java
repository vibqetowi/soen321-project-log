package yt;

import java.util.ArrayList;
import yt.d;
import yt.o;
/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes2.dex */
public final class e implements o.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d<Object, d.a<Object>> f39008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Object> f39009b;

    public e(d<Object, d.a<Object>> dVar, ArrayList<Object> arrayList) {
        this.f39008a = dVar;
        this.f39009b = arrayList;
    }

    @Override // yt.o.c
    public final o.a b(fu.b bVar, mt.a aVar) {
        return this.f39008a.r(bVar, aVar, this.f39009b);
    }

    @Override // yt.o.c
    public final void a() {
    }
}
