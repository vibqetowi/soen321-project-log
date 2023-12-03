package i0;

import java.util.ArrayList;
/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f19626a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f19627b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f19626a = new int[size];
        this.f19627b = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            this.f19626a[i6] = ((Integer) arrayList.get(i6)).intValue();
            this.f19627b[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }

    public e(int i6, int i10) {
        this.f19626a = new int[]{i6, i10};
        this.f19627b = new float[]{0.0f, 1.0f};
    }

    public e(int i6, int i10, int i11) {
        this.f19626a = new int[]{i6, i10, i11};
        this.f19627b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
