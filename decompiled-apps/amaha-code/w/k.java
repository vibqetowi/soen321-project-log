package w;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public b f36240a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f36241b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f36242c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f36243d;

    /* renamed from: e  reason: collision with root package name */
    public String f36244e;

    public final float a(float f) {
        return (float) this.f36240a.b(f);
    }

    public void b(float f, int i6) {
        int[] iArr = this.f36241b;
        if (iArr.length < this.f36243d + 1) {
            this.f36241b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f36242c;
            this.f36242c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f36241b;
        int i10 = this.f36243d;
        iArr2[i10] = i6;
        this.f36242c[i10] = f;
        this.f36243d = i10 + 1;
    }

    public void c(int i6) {
        int i10 = this.f36243d;
        if (i10 == 0) {
            return;
        }
        int[] iArr = this.f36241b;
        float[] fArr = this.f36242c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i10 - 1;
        iArr2[1] = 0;
        int i11 = 2;
        while (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = iArr2[i12];
            i11 = i12 - 1;
            int i14 = iArr2[i11];
            if (i13 < i14) {
                int i15 = iArr[i14];
                int i16 = i13;
                int i17 = i16;
                while (i16 < i14) {
                    int i18 = iArr[i16];
                    if (i18 <= i15) {
                        int i19 = iArr[i17];
                        iArr[i17] = i18;
                        iArr[i16] = i19;
                        float f = fArr[i17];
                        fArr[i17] = fArr[i16];
                        fArr[i16] = f;
                        i17++;
                    }
                    i16++;
                }
                int i20 = iArr[i17];
                iArr[i17] = iArr[i14];
                iArr[i14] = i20;
                float f2 = fArr[i17];
                fArr[i17] = fArr[i14];
                fArr[i14] = f2;
                int i21 = i11 + 1;
                iArr2[i11] = i17 - 1;
                int i22 = i21 + 1;
                iArr2[i21] = i13;
                int i23 = i22 + 1;
                iArr2[i22] = i14;
                i11 = i23 + 1;
                iArr2[i23] = i17 + 1;
            }
        }
        int i24 = 1;
        for (int i25 = 1; i25 < this.f36243d; i25++) {
            int[] iArr3 = this.f36241b;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i24, 1);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f36243d; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.f36241b;
                if (iArr4[i27] == iArr4[i27 - 1]) {
                }
            }
            dArr[i26] = this.f36241b[i27] * 0.01d;
            dArr2[i26][0] = this.f36242c[i27];
            i26++;
        }
        this.f36240a = b.a(i6, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f36244e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i6 = 0; i6 < this.f36243d; i6++) {
            StringBuilder d10 = v.g.d(str, "[");
            d10.append(this.f36241b[i6]);
            d10.append(" , ");
            d10.append(decimalFormat.format(this.f36242c[i6]));
            d10.append("] ");
            str = d10.toString();
        }
        return str;
    }
}
