package h3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17124a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f17125b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17126c;

    public j(PointF pointF, boolean z10, List<f3.a> list) {
        this.f17125b = pointF;
        this.f17126c = z10;
        this.f17124a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f17124a.size());
        sb2.append("closed=");
        return defpackage.c.t(sb2, this.f17126c, '}');
    }

    public j() {
        this.f17124a = new ArrayList();
    }
}
