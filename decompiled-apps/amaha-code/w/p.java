package w;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public b f36266a;

    /* renamed from: e  reason: collision with root package name */
    public int f36270e;
    public String f;

    /* renamed from: i  reason: collision with root package name */
    public long f36273i;

    /* renamed from: b  reason: collision with root package name */
    public int f36267b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f36268c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public final float[][] f36269d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public final float[] f36271g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f36272h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f36274j = Float.NaN;

    public final float a(float f) {
        float abs;
        switch (this.f36267b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void b(float f, float f2, float f10, int i6, int i10) {
        int i11 = this.f36270e;
        this.f36268c[i11] = i6;
        float[] fArr = this.f36269d[i11];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f10;
        this.f36267b = Math.max(this.f36267b, i10);
        this.f36270e++;
    }

    public void c(int i6) {
        float[][] fArr;
        int i10 = this.f36270e;
        if (i10 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        int[] iArr = this.f36268c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i10 - 1;
        iArr2[1] = 0;
        int i11 = 2;
        while (true) {
            fArr = this.f36269d;
            if (i11 <= 0) {
                break;
            }
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
                        float[] fArr2 = fArr[i17];
                        fArr[i17] = fArr[i16];
                        fArr[i16] = fArr2;
                        i17++;
                    }
                    i16++;
                }
                int i20 = iArr[i17];
                iArr[i17] = iArr[i14];
                iArr[i14] = i20;
                float[] fArr3 = fArr[i17];
                fArr[i17] = fArr[i14];
                fArr[i14] = fArr3;
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
        int i24 = 0;
        for (int i25 = 1; i25 < iArr.length; i25++) {
            if (iArr[i25] != iArr[i25 - 1]) {
                i24++;
            }
        }
        if (i24 == 0) {
            i24 = 1;
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i24, 3);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f36270e; i27++) {
            if (i27 <= 0 || iArr[i27] != iArr[i27 - 1]) {
                dArr[i26] = iArr[i27] * 0.01d;
                double[] dArr3 = dArr2[i26];
                float[] fArr4 = fArr[i27];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i26++;
            }
        }
        this.f36266a = b.a(i6, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i6 = 0; i6 < this.f36270e; i6++) {
            StringBuilder d10 = v.g.d(str, "[");
            d10.append(this.f36268c[i6]);
            d10.append(" , ");
            d10.append(decimalFormat.format(this.f36269d[i6]));
            d10.append("] ");
            str = d10.toString();
        }
        return str;
    }
}
