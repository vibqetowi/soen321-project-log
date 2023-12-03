package w;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public a f36209a;

    /* renamed from: b  reason: collision with root package name */
    public String f36210b;

    /* renamed from: c  reason: collision with root package name */
    public int f36211c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f36212d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f36213e = 0;
    public final ArrayList<b> f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f36214a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f36215b;

        /* renamed from: c  reason: collision with root package name */
        public final double[] f36216c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f36217d;

        /* renamed from: e  reason: collision with root package name */
        public final float[] f36218e;
        public final float[] f;

        /* renamed from: g  reason: collision with root package name */
        public w.b f36219g;

        /* renamed from: h  reason: collision with root package name */
        public double[] f36220h;

        public a(String str, int i6, int i10) {
            long j10;
            i iVar = new i();
            this.f36214a = iVar;
            iVar.f36237e = i6;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int indexOf = str.indexOf(40) + 1;
                int indexOf2 = str.indexOf(44, indexOf);
                char c10 = 0;
                int i11 = 0;
                while (indexOf2 != -1) {
                    dArr[i11] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(44, indexOf);
                    i11++;
                }
                dArr[i11] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i11 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d10 = 1.0d / length2;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i12 = 0;
                while (i12 < copyOf.length) {
                    double d11 = copyOf[i12];
                    int i13 = i12 + length2;
                    dArr2[i13][c10] = d11;
                    double d12 = i12 * d10;
                    dArr3[i13] = d12;
                    if (i12 > 0) {
                        int i14 = (length2 * 2) + i12;
                        j10 = 4607182418800017408L;
                        dArr2[i14][0] = d11 + 1.0d;
                        dArr3[i14] = d12 + 1.0d;
                        int i15 = i12 - 1;
                        dArr2[i15][0] = (d11 - 1.0d) - d10;
                        dArr3[i15] = (d12 - 1.0d) - d10;
                    } else {
                        j10 = 4607182418800017408L;
                    }
                    i12++;
                    c10 = 0;
                }
                iVar.f36236d = new h(dArr3, dArr2);
            }
            this.f36215b = new float[i10];
            this.f36216c = new double[i10];
            this.f36217d = new float[i10];
            this.f36218e = new float[i10];
            this.f = new float[i10];
            float[] fArr = new float[i10];
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f36221a;

        /* renamed from: b  reason: collision with root package name */
        public final float f36222b;

        /* renamed from: c  reason: collision with root package name */
        public final float f36223c;

        /* renamed from: d  reason: collision with root package name */
        public final float f36224d;

        /* renamed from: e  reason: collision with root package name */
        public final float f36225e;

        public b(int i6, float f, float f2, float f10, float f11) {
            this.f36221a = i6;
            this.f36222b = f11;
            this.f36223c = f2;
            this.f36224d = f;
            this.f36225e = f10;
        }
    }

    public final float a(float f) {
        double signum;
        double d10;
        double abs;
        a aVar = this.f36209a;
        w.b bVar = aVar.f36219g;
        if (bVar != null) {
            bVar.c(f, aVar.f36220h);
        } else {
            double[] dArr = aVar.f36220h;
            dArr[0] = aVar.f36218e[0];
            dArr[1] = aVar.f[0];
            dArr[2] = aVar.f36215b[0];
        }
        double[] dArr2 = aVar.f36220h;
        double d11 = dArr2[0];
        double d12 = dArr2[1];
        double d13 = f;
        i iVar = aVar.f36214a;
        iVar.getClass();
        double d14 = 0.0d;
        if (d13 < 0.0d) {
            d13 = 0.0d;
        } else if (d13 > 1.0d) {
            d13 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(iVar.f36234b, d13);
        if (binarySearch > 0) {
            d14 = 1.0d;
        } else if (binarySearch != 0) {
            int i6 = (-binarySearch) - 1;
            float[] fArr = iVar.f36233a;
            float f2 = fArr[i6];
            int i10 = i6 - 1;
            float f10 = fArr[i10];
            double d15 = f2 - f10;
            double[] dArr3 = iVar.f36234b;
            double d16 = dArr3[i6];
            double d17 = dArr3[i10];
            double d18 = d15 / (d16 - d17);
            d14 = ((((d13 * d13) - (d17 * d17)) * d18) / 2.0d) + ((d13 - d17) * (f10 - (d18 * d17))) + iVar.f36235c[i10];
        }
        double d19 = d14 + d12;
        switch (iVar.f36237e) {
            case 1:
                signum = Math.signum(0.5d - (d19 % 1.0d));
                break;
            case 2:
                d10 = 1.0d;
                abs = Math.abs((((d19 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = d10 - abs;
                break;
            case 3:
                signum = (((d19 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                signum = 1.0d - (((d19 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                signum = Math.cos((d12 + d19) * 6.283185307179586d);
                break;
            case 6:
                d10 = 1.0d;
                double abs2 = 1.0d - Math.abs(((d19 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = d10 - abs;
                break;
            case 7:
                signum = iVar.f36236d.b(d19 % 1.0d);
                break;
            default:
                signum = Math.sin(d19 * 6.283185307179586d);
                break;
        }
        return (float) ((signum * aVar.f36220h[2]) + d11);
    }

    public final void c() {
        float[] fArr;
        float[] fArr2;
        int i6;
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new e());
        double[] dArr = new double[size];
        char c10 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.f36209a = new a(this.f36212d, this.f36211c, size);
        Iterator<b> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b next = it.next();
            float f = next.f36224d;
            dArr[i10] = f * 0.01d;
            double[] dArr3 = dArr2[i10];
            float f2 = next.f36222b;
            dArr3[c10] = f2;
            float f10 = next.f36223c;
            dArr3[1] = f10;
            float f11 = next.f36225e;
            dArr3[2] = f11;
            a aVar = this.f36209a;
            aVar.f36216c[i10] = next.f36221a / 100.0d;
            aVar.f36217d[i10] = f;
            aVar.f36218e[i10] = f10;
            aVar.f[i10] = f11;
            aVar.f36215b[i10] = f2;
            i10++;
            c10 = 0;
        }
        a aVar2 = this.f36209a;
        double[] dArr4 = aVar2.f36216c;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, dArr4.length, 3);
        float[] fArr3 = aVar2.f36215b;
        aVar2.f36220h = new double[fArr3.length + 2];
        double[] dArr6 = new double[fArr3.length + 2];
        double d10 = dArr4[0];
        float[] fArr4 = aVar2.f36217d;
        i iVar = aVar2.f36214a;
        if (d10 > 0.0d) {
            iVar.a(0.0d, fArr4[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            iVar.a(1.0d, fArr4[length]);
        }
        for (int i11 = 0; i11 < dArr5.length; i11++) {
            double[] dArr7 = dArr5[i11];
            dArr7[0] = aVar2.f36218e[i11];
            dArr7[1] = aVar2.f[i11];
            dArr7[2] = fArr3[i11];
            iVar.a(dArr4[i11], fArr4[i11]);
        }
        int i12 = 0;
        double d11 = 0.0d;
        while (true) {
            if (i12 >= iVar.f36233a.length) {
                break;
            }
            d11 += fArr[i12];
            i12++;
        }
        int i13 = 1;
        double d12 = 0.0d;
        while (true) {
            float[] fArr5 = iVar.f36233a;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f12 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double[] dArr8 = iVar.f36234b;
            d12 = ((dArr8[i13] - dArr8[i14]) * f12) + d12;
            i13++;
        }
        int i15 = 0;
        while (true) {
            float[] fArr6 = iVar.f36233a;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = (float) (fArr6[i15] * (d11 / d12));
            i15++;
            dArr5 = dArr5;
        }
        double[][] dArr9 = dArr5;
        iVar.f36235c[0] = 0.0d;
        int i16 = 1;
        while (true) {
            if (i16 >= iVar.f36233a.length) {
                break;
            }
            int i17 = i16 - 1;
            double[] dArr10 = iVar.f36234b;
            double d13 = dArr10[i16] - dArr10[i17];
            double[] dArr11 = iVar.f36235c;
            dArr11[i16] = (d13 * ((fArr2[i17] + fArr2[i16]) / 2.0f)) + dArr11[i17];
            i16++;
        }
        if (dArr4.length > 1) {
            i6 = 0;
            aVar2.f36219g = w.b.a(0, dArr4, dArr9);
        } else {
            i6 = 0;
            aVar2.f36219g = null;
        }
        w.b.a(i6, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f36210b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder d10 = v.g.d(str, "[");
            d10.append(next.f36221a);
            d10.append(" , ");
            d10.append(decimalFormat.format(next.f36222b));
            d10.append("] ");
            str = d10.toString();
        }
        return str;
    }

    public void b(b0.a aVar) {
    }
}
