package w;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: StepCurve.java */
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: d  reason: collision with root package name */
    public final h f36253d;

    public m(String str) {
        this.f36204a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i6 = 0;
        while (indexOf2 != -1) {
            dArr[i6] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i6++;
        }
        dArr[i6] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i6 + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d10 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i10 = 0; i10 < copyOf.length; i10++) {
            double d11 = copyOf[i10];
            int i11 = i10 + length2;
            dArr2[i11][0] = d11;
            double d12 = i10 * d10;
            dArr3[i11] = d12;
            if (i10 > 0) {
                int i12 = (length2 * 2) + i10;
                dArr2[i12][0] = d11 + 1.0d;
                dArr3[i12] = d12 + 1.0d;
                int i13 = i10 - 1;
                dArr2[i13][0] = (d11 - 1.0d) - d10;
                dArr3[i13] = (d12 - 1.0d) - d10;
            }
        }
        h hVar = new h(dArr3, dArr2);
        System.out.println(" 0 " + hVar.b(0.0d));
        System.out.println(" 1 " + hVar.b(1.0d));
        this.f36253d = hVar;
    }

    @Override // w.c
    public final double a(double d10) {
        return this.f36253d.b(d10);
    }

    @Override // w.c
    public final double b(double d10) {
        return this.f36253d.h(d10);
    }
}
