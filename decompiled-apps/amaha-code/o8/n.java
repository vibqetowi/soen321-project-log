package o8;

import android.util.SparseArray;
/* compiled from: SpannedData.java */
/* loaded from: classes.dex */
public final class n<V> {

    /* renamed from: c  reason: collision with root package name */
    public final c9.e<V> f27300c;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<V> f27299b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public int f27298a = -1;

    public n(p7.e eVar) {
        this.f27300c = eVar;
    }

    public final V a(int i6) {
        SparseArray<V> sparseArray;
        if (this.f27298a == -1) {
            this.f27298a = 0;
        }
        while (true) {
            int i10 = this.f27298a;
            sparseArray = this.f27299b;
            if (i10 <= 0 || i6 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f27298a--;
        }
        while (this.f27298a < sparseArray.size() - 1 && i6 >= sparseArray.keyAt(this.f27298a + 1)) {
            this.f27298a++;
        }
        return sparseArray.valueAt(this.f27298a);
    }
}
