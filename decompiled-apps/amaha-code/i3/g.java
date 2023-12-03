package i3;

import a3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import h3.l;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: v  reason: collision with root package name */
    public final c3.c f19791v;

    public g(j jVar, e eVar) {
        super(jVar, eVar);
        c3.c cVar = new c3.c(jVar, this, new l("__container", eVar.f19771a, false));
        this.f19791v = cVar;
        cVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // i3.b, c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.f19791v.e(rectF, this.f19753l, z10);
    }

    @Override // i3.b
    public final void j(Canvas canvas, Matrix matrix, int i6) {
        this.f19791v.g(canvas, matrix, i6);
    }

    @Override // i3.b
    public final void n(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        this.f19791v.a(eVar, i6, arrayList, eVar2);
    }
}
