package d3;

import android.graphics.PointF;
import d3.a;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class j extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f12161i;

    /* renamed from: j  reason: collision with root package name */
    public final a<Float, Float> f12162j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f12163k;

    public j(c cVar, c cVar2) {
        super(Collections.emptyList());
        this.f12161i = new PointF();
        this.f12162j = cVar;
        this.f12163k = cVar2;
        i(this.f12141d);
    }

    @Override // d3.a
    public final PointF f() {
        return this.f12161i;
    }

    @Override // d3.a
    public final PointF g(n3.a<PointF> aVar, float f) {
        return this.f12161i;
    }

    @Override // d3.a
    public final void i(float f) {
        a<Float, Float> aVar = this.f12162j;
        aVar.i(f);
        a<Float, Float> aVar2 = this.f12163k;
        aVar2.i(f);
        this.f12161i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f12138a;
            if (i6 < arrayList.size()) {
                ((a.InterfaceC0183a) arrayList.get(i6)).b();
                i6++;
            } else {
                return;
            }
        }
    }
}
