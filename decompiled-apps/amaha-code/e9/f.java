package e9;

import c9.q;
import c9.w;
import e9.e;
import java.util.ArrayList;
import java.util.zip.Inflater;
import u7.x;
/* compiled from: ProjectionDecoder.java */
/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<e.a> a(q qVar) {
        ArrayList<e.a> arrayList;
        int i6;
        e.a aVar;
        ArrayList<e.a> arrayList2;
        q qVar2 = qVar;
        e.a aVar2 = null;
        if (qVar.q() != 0) {
            return null;
        }
        qVar2.B(7);
        int c10 = qVar.c();
        int i10 = 1;
        if (c10 == 1684433976) {
            q qVar3 = new q();
            Inflater inflater = new Inflater(true);
            try {
                if (!w.v(qVar2, qVar3, inflater)) {
                    return null;
                }
                inflater.end();
                qVar2 = qVar3;
            } finally {
                inflater.end();
            }
        } else if (c10 != 1918990112) {
            return null;
        }
        ArrayList<e.a> arrayList3 = new ArrayList<>();
        int i11 = qVar2.f5187b;
        int i12 = qVar2.f5188c;
        while (i11 < i12) {
            int c11 = qVar2.c() + i11;
            if (c11 > i11 && c11 <= i12) {
                if (qVar2.c() == 1835365224) {
                    int c12 = qVar2.c();
                    if (c12 <= 10000) {
                        float[] fArr = new float[c12];
                        for (int i13 = 0; i13 < c12; i13++) {
                            fArr[i13] = Float.intBitsToFloat(qVar2.c());
                        }
                        int c13 = qVar2.c();
                        if (c13 <= 32000) {
                            double log = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int ceil = (int) Math.ceil(Math.log(c12 * 2.0d) / log);
                            x xVar = new x(qVar2.f5186a, i10, 0);
                            xVar.o(qVar2.f5187b * 8);
                            float[] fArr2 = new float[c13 * 5];
                            int i14 = 5;
                            int[] iArr = new int[5];
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < c13) {
                                    int i17 = 0;
                                    while (i17 < i14) {
                                        int i18 = iArr[i17];
                                        int i19 = xVar.i(ceil);
                                        int i20 = ((-(i19 & 1)) ^ (i19 >> 1)) + i18;
                                        if (i20 >= c12 || i20 < 0) {
                                            break;
                                        }
                                        fArr2[i16] = fArr[i20];
                                        iArr[i17] = i20;
                                        i17++;
                                        i16++;
                                        i14 = 5;
                                    }
                                    i15++;
                                    i14 = 5;
                                } else {
                                    xVar.o((xVar.g() + 7) & (-8));
                                    int i21 = 32;
                                    int i22 = xVar.i(32);
                                    e.b[] bVarArr = new e.b[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        int i24 = xVar.i(8);
                                        int i25 = xVar.i(8);
                                        int i26 = xVar.i(i21);
                                        if (i26 <= 128000) {
                                            i6 = i12;
                                            int ceil2 = (int) Math.ceil(Math.log(c13 * 2.0d) / log);
                                            float[] fArr3 = new float[i26 * 3];
                                            float[] fArr4 = new float[i26 * 2];
                                            int i27 = 0;
                                            int i28 = 0;
                                            while (i27 < i26) {
                                                int i29 = xVar.i(ceil2);
                                                int i30 = i29 >> 1;
                                                x xVar2 = xVar;
                                                int i31 = i29 & 1;
                                                int i32 = i22;
                                                float[] fArr5 = fArr4;
                                                int i33 = ((-i31) ^ i30) + i28;
                                                if (i33 >= 0 && i33 < c13) {
                                                    int i34 = i27 * 3;
                                                    int i35 = i33 * 5;
                                                    fArr3[i34] = fArr2[i35];
                                                    fArr3[i34 + 1] = fArr2[i35 + 1];
                                                    fArr3[i34 + 2] = fArr2[i35 + 2];
                                                    int i36 = i27 * 2;
                                                    fArr5[i36] = fArr2[i35 + 3];
                                                    fArr5[i36 + 1] = fArr2[i35 + 4];
                                                    i27++;
                                                    i28 = i33;
                                                    fArr4 = fArr5;
                                                    i22 = i32;
                                                    xVar = xVar2;
                                                }
                                            }
                                            bVarArr[i23] = new e.b(i24, fArr3, fArr4, i25);
                                            i23++;
                                            i12 = i6;
                                            i22 = i22;
                                            i21 = 32;
                                        }
                                    }
                                    i6 = i12;
                                    aVar = new e.a(bVarArr);
                                }
                            }
                            i6 = i12;
                            aVar = null;
                            if (aVar == null) {
                                arrayList = arrayList2;
                                arrayList.add(aVar);
                            }
                        }
                    }
                    aVar = aVar2;
                    arrayList2 = arrayList3;
                    i6 = i12;
                    if (aVar == null) {
                    }
                } else {
                    arrayList = arrayList3;
                    i6 = i12;
                }
                qVar2.A(c11);
                arrayList3 = arrayList;
                i11 = c11;
                i12 = i6;
                aVar2 = null;
                i10 = 1;
            }
            return null;
        }
        return arrayList3;
    }
}
