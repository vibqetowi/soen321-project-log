package w;

import java.util.Arrays;
/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public float[] f36233a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f36234b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    public double[] f36235c;

    /* renamed from: d  reason: collision with root package name */
    public h f36236d;

    /* renamed from: e  reason: collision with root package name */
    public int f36237e;

    public final void a(double d10, float f) {
        int length = this.f36233a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f36234b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f36234b = Arrays.copyOf(this.f36234b, length);
        this.f36233a = Arrays.copyOf(this.f36233a, length);
        this.f36235c = new double[length];
        double[] dArr = this.f36234b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f36234b[binarySearch] = d10;
        this.f36233a[binarySearch] = f;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f36234b) + " period=" + Arrays.toString(this.f36233a);
    }
}
