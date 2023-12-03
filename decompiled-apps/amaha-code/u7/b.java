package u7;

import android.util.Log;
/* compiled from: CeaUtil.java */
/* loaded from: classes.dex */
public final class b {
    public static void a(long j10, c9.q qVar, v[] vVarArr) {
        int i6;
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (qVar.f5188c - qVar.f5187b > 1) {
                int i11 = 0;
                while (true) {
                    if (qVar.f5188c - qVar.f5187b == 0) {
                        i6 = -1;
                        break;
                    }
                    int q10 = qVar.q();
                    i11 += q10;
                    if (q10 != 255) {
                        i6 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (qVar.f5188c - qVar.f5187b == 0) {
                        i12 = -1;
                        break;
                    }
                    int q11 = qVar.q();
                    i12 += q11;
                    if (q11 != 255) {
                        break;
                    }
                }
                int i13 = qVar.f5187b;
                int i14 = i13 + i12;
                if (i12 != -1 && i12 <= qVar.f5188c - i13) {
                    if (i6 == 4 && i12 >= 8) {
                        int q12 = qVar.q();
                        int v10 = qVar.v();
                        if (v10 == 49) {
                            i10 = qVar.c();
                        } else {
                            i10 = 0;
                        }
                        int q13 = qVar.q();
                        if (v10 == 47) {
                            qVar.B(1);
                        }
                        if (q12 == 181 && ((v10 == 49 || v10 == 47) && q13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (v10 == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, qVar, vVarArr);
                        }
                    }
                } else {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = qVar.f5188c;
                }
                qVar.A(i14);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, c9.q qVar, v[] vVarArr) {
        boolean z10;
        int q10 = qVar.q();
        if ((q10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        qVar.B(1);
        int i6 = (q10 & 31) * 3;
        int i10 = qVar.f5187b;
        for (v vVar : vVarArr) {
            qVar.A(i10);
            vVar.a(i6, qVar);
            if (j10 != -9223372036854775807L) {
                vVar.d(j10, 1, i6, 0, null);
            }
        }
    }
}
