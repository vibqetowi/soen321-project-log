package k3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import l3.c;
/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22793a = c.a.a("x", "y");

    public static int a(l3.c cVar) {
        cVar.a();
        int s10 = (int) (cVar.s() * 255.0d);
        int s11 = (int) (cVar.s() * 255.0d);
        int s12 = (int) (cVar.s() * 255.0d);
        while (cVar.m()) {
            cVar.e0();
        }
        cVar.g();
        return Color.argb(255, s10, s11, s12);
    }

    public static PointF b(l3.c cVar, float f) {
        int d10 = v.h.d(cVar.J());
        if (d10 != 0) {
            if (d10 != 2) {
                if (d10 == 6) {
                    float s10 = (float) cVar.s();
                    float s11 = (float) cVar.s();
                    while (cVar.m()) {
                        cVar.e0();
                    }
                    return new PointF(s10 * f, s11 * f);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(defpackage.b.E(cVar.J())));
            }
            cVar.e();
            float f2 = 0.0f;
            float f10 = 0.0f;
            while (cVar.m()) {
                int R = cVar.R(f22793a);
                if (R != 0) {
                    if (R != 1) {
                        cVar.c0();
                        cVar.e0();
                    } else {
                        f10 = d(cVar);
                    }
                } else {
                    f2 = d(cVar);
                }
            }
            cVar.h();
            return new PointF(f2 * f, f10 * f);
        }
        cVar.a();
        float s12 = (float) cVar.s();
        float s13 = (float) cVar.s();
        while (cVar.J() != 2) {
            cVar.e0();
        }
        cVar.g();
        return new PointF(s12 * f, s13 * f);
    }

    public static ArrayList c(l3.c cVar, float f) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.J() == 1) {
            cVar.a();
            arrayList.add(b(cVar, f));
            cVar.g();
        }
        cVar.g();
        return arrayList;
    }

    public static float d(l3.c cVar) {
        int J = cVar.J();
        int d10 = v.h.d(J);
        if (d10 != 0) {
            if (d10 == 6) {
                return (float) cVar.s();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(defpackage.b.E(J)));
        }
        cVar.a();
        float s10 = (float) cVar.s();
        while (cVar.m()) {
            cVar.e0();
        }
        cVar.g();
        return s10;
    }
}
