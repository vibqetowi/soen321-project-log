package yb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import yb.l;
/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class k extends l.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f38486c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f38487d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f38486c = arrayList;
        this.f38487d = matrix;
    }

    @Override // yb.l.f
    public final void a(Matrix matrix, xb.a aVar, int i6, Canvas canvas) {
        for (l.f fVar : this.f38486c) {
            fVar.a(this.f38487d, aVar, i6, canvas);
        }
    }
}
