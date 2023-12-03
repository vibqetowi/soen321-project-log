package m3;

import android.graphics.PointF;
import c3.j;
import java.util.ArrayList;
/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f24798a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f10) {
        return Math.max(f2, Math.min(f10, f));
    }

    public static int c(float f, float f2) {
        boolean z10;
        int i6 = (int) f;
        int i10 = (int) f2;
        int i11 = i6 / i10;
        if ((i6 ^ i10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = i6 % i10;
        if (!z10 && i12 != 0) {
            i11--;
        }
        return i6 - (i10 * i11);
    }

    public static void d(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2, j jVar) {
        if (eVar.a(i6, jVar.getName())) {
            String name = jVar.getName();
            eVar2.getClass();
            f3.e eVar3 = new f3.e(eVar2);
            eVar3.f14775a.add(name);
            f3.e eVar4 = new f3.e(eVar3);
            eVar4.f14776b = jVar;
            arrayList.add(eVar4);
        }
    }
}
