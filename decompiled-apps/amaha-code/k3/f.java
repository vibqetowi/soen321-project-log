package k3;

import l3.c;
/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public final class f implements a0<f3.b> {

    /* renamed from: u  reason: collision with root package name */
    public static final f f22782u = new f();

    /* renamed from: v  reason: collision with root package name */
    public static final c.a f22783v = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // k3.a0
    public final f3.b W(l3.c cVar, float f) {
        cVar.e();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i6 = 3;
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        float f12 = 0.0f;
        boolean z10 = true;
        while (cVar.m()) {
            switch (cVar.R(f22783v)) {
                case 0:
                    str = cVar.I();
                    break;
                case 1:
                    str2 = cVar.I();
                    break;
                case 2:
                    f2 = (float) cVar.s();
                    break;
                case 3:
                    int G = cVar.G();
                    if (G <= 2 && G >= 0) {
                        i6 = v.h.e(3)[G];
                        break;
                    } else {
                        i6 = 3;
                        break;
                    }
                case 4:
                    i10 = cVar.G();
                    break;
                case 5:
                    f10 = (float) cVar.s();
                    break;
                case 6:
                    f11 = (float) cVar.s();
                    break;
                case 7:
                    i11 = l.a(cVar);
                    break;
                case 8:
                    i12 = l.a(cVar);
                    break;
                case 9:
                    f12 = (float) cVar.s();
                    break;
                case 10:
                    z10 = cVar.o();
                    break;
                default:
                    cVar.c0();
                    cVar.e0();
                    break;
            }
        }
        cVar.h();
        return new f3.b(str, str2, f2, i6, i10, f10, f11, i11, i12, f12, z10);
    }
}
