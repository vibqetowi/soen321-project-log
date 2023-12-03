package c3;

import android.graphics.Path;
import d3.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public final class p implements l, a.InterfaceC0183a {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4867b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.j f4868c;

    /* renamed from: d  reason: collision with root package name */
    public final d3.a<?, Path> f4869d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4870e;

    /* renamed from: a  reason: collision with root package name */
    public final Path f4866a = new Path();
    public final k1.c f = new k1.c(1);

    public p(a3.j jVar, i3.b bVar, h3.m mVar) {
        mVar.getClass();
        this.f4867b = mVar.f17138d;
        this.f4868c = jVar;
        d3.a<?, Path> k10 = mVar.f17137c.k();
        this.f4869d = k10;
        bVar.f(k10);
        k10.a(this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4870e = false;
        this.f4868c.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i6 < arrayList.size()) {
                b bVar = (b) arrayList.get(i6);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f4877c == 1) {
                        this.f.f22768a.add(rVar);
                        rVar.a(this);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // c3.l
    public final Path getPath() {
        boolean z10 = this.f4870e;
        Path path = this.f4866a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f4867b) {
            this.f4870e = true;
            return path;
        }
        path.set(this.f4869d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.f4870e = true;
        return path;
    }
}
