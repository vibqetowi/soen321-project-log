package ie;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.l1;
import java.util.Map;
import ke.p;
import ke.t;
import r1.b0;
import rf.n;
import rf.s;
import v.h;
/* compiled from: FirestoreIndexValueWriter.java */
/* loaded from: classes.dex */
public final class b {
    public static void a(s sVar, com.android.volley.toolbox.a aVar) {
        long j10;
        switch (h.d(sVar.i0())) {
            case 0:
                aVar.x(5);
                return;
            case 1:
                aVar.x(10);
                if (sVar.Y()) {
                    j10 = 1;
                } else {
                    j10 = 0;
                }
                aVar.x(j10);
                return;
            case 2:
                aVar.x(15);
                aVar.u(sVar.d0());
                return;
            case 3:
                double b02 = sVar.b0();
                if (Double.isNaN(b02)) {
                    aVar.x(13);
                    return;
                }
                aVar.x(15);
                if (b02 == -0.0d) {
                    aVar.u(0.0d);
                    return;
                } else {
                    aVar.u(b02);
                    return;
                }
            case 4:
                l1 h02 = sVar.h0();
                aVar.x(20);
                aVar.x(h02.Q());
                aVar.x(h02.P());
                return;
            case 5:
                String g02 = sVar.g0();
                aVar.x(25);
                aVar.y(g02);
                aVar.x(2L);
                return;
            case 6:
                aVar.x(30);
                aVar.t(sVar.Z());
                aVar.x(2L);
                return;
            case 7:
                String f02 = sVar.f0();
                aVar.x(37);
                p u10 = p.u(f02);
                int p10 = u10.p();
                for (int i6 = 5; i6 < p10; i6++) {
                    String l2 = u10.l(i6);
                    aVar.x(60);
                    aVar.y(l2);
                }
                return;
            case 8:
                ag.a c0 = sVar.c0();
                aVar.x(45);
                aVar.u(c0.P());
                aVar.u(c0.Q());
                return;
            case 9:
                rf.a X = sVar.X();
                aVar.x(50);
                for (s sVar2 : X.p()) {
                    a(sVar2, aVar);
                }
                aVar.x(2L);
                return;
            case 10:
                s sVar3 = t.f23299a;
                if (t.f23302d.equals(sVar.e0().P().get("__type__"))) {
                    aVar.x((long) SubsamplingScaleImageView.TILE_SIZE_AUTO);
                    return;
                }
                n e0 = sVar.e0();
                aVar.x(55);
                for (Map.Entry<String, s> entry : e0.P().entrySet()) {
                    aVar.x(25);
                    aVar.y(entry.getKey());
                    a(entry.getValue(), aVar);
                }
                aVar.x(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type ".concat(b0.e(sVar.i0())));
        }
    }
}
