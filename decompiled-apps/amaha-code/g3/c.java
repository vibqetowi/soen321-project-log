package g3;

import android.graphics.PointF;
import d3.j;
import java.util.List;
/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public final class c implements e<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f16170a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16171b;

    public c(b bVar, b bVar2) {
        this.f16170a = bVar;
        this.f16171b = bVar2;
    }

    @Override // g3.e
    public final boolean j() {
        if (this.f16170a.j() && this.f16171b.j()) {
            return true;
        }
        return false;
    }

    @Override // g3.e
    public final d3.a<PointF, PointF> k() {
        return new j((d3.c) this.f16170a.k(), (d3.c) this.f16171b.k());
    }

    @Override // g3.e
    public final List<n3.a<PointF>> l() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
