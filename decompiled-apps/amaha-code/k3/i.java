package k3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public final class i implements a0<h3.c> {

    /* renamed from: u  reason: collision with root package name */
    public int f22787u;

    public i(int i6) {
        this.f22787u = i6;
    }

    @Override // k3.a0
    public final h3.c W(l3.c cVar, float f) {
        boolean z10;
        int i6;
        double d10;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (cVar.J() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        while (cVar.m()) {
            arrayList.add(Float.valueOf((float) cVar.s()));
        }
        if (z10) {
            cVar.g();
        }
        if (this.f22787u == -1) {
            this.f22787u = arrayList.size() / 4;
        }
        int i11 = this.f22787u;
        float[] fArr = new float[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i6 = this.f22787u * 4;
            if (i12 >= i6) {
                break;
            }
            int i15 = i12 / 4;
            double floatValue = ((Float) arrayList.get(i12)).floatValue();
            int i16 = i12 % 4;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            iArr[i15] = Color.argb(255, i13, i14, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i14 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i13 = (int) (floatValue * 255.0d);
                }
            } else {
                fArr[i15] = (float) floatValue;
            }
            i12++;
        }
        h3.c cVar2 = new h3.c(fArr, iArr);
        if (arrayList.size() > i6) {
            int size = (arrayList.size() - i6) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i17 = 0;
            while (i6 < arrayList.size()) {
                if (i6 % 2 == 0) {
                    dArr[i17] = ((Float) arrayList.get(i6)).floatValue();
                } else {
                    dArr2[i17] = ((Float) arrayList.get(i6)).floatValue();
                    i17++;
                }
                i6++;
            }
            while (true) {
                int[] iArr2 = cVar2.f17084b;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i18 = iArr2[i10];
                double d11 = cVar2.f17083a[i10];
                int i19 = 1;
                while (true) {
                    if (i19 < size) {
                        int i20 = i19 - 1;
                        double d12 = dArr[i20];
                        double d13 = dArr[i19];
                        if (d13 >= d11) {
                            double d14 = dArr2[i20];
                            double d15 = dArr2[i19];
                            PointF pointF = m3.f.f24798a;
                            d10 = (((d15 - d14) * ((d11 - d12) / (d13 - d12))) + d14) * 255.0d;
                            break;
                        }
                        i19++;
                    } else {
                        d10 = dArr2[size - 1] * 255.0d;
                        break;
                    }
                }
                iArr2[i10] = Color.argb((int) d10, Color.red(i18), Color.green(i18), Color.blue(i18));
                i10++;
            }
        }
        return cVar2;
    }
}
