package o6;

import r6.c;
/* compiled from: BarBuffer.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public final float[] f27174b;

    /* renamed from: c  reason: collision with root package name */
    public float f27175c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f27176d = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    public int f27173a = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27177e = false;
    public float f = 1.0f;

    public a(int i6, boolean z10) {
        this.f27174b = new float[i6];
    }

    public void a(v6.a aVar) {
        float f;
        float f2;
        float c0 = aVar.c0() * this.f27175c;
        float f10 = this.f / 2.0f;
        for (int i6 = 0; i6 < c0; i6++) {
            c cVar = (c) aVar.x(i6);
            if (cVar != null) {
                float f11 = cVar.f30503u;
                float f12 = cVar.f30521w;
                float f13 = f12 - f10;
                float f14 = f12 + f10;
                if (this.f27177e) {
                    if (f11 >= 0.0f) {
                        f2 = f11;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                } else {
                    if (f11 >= 0.0f) {
                        f = f11;
                    } else {
                        f = 0.0f;
                    }
                    if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    float f15 = f;
                    f2 = f11;
                    f11 = f15;
                }
                if (f11 > 0.0f) {
                    f11 *= this.f27176d;
                } else {
                    f2 *= this.f27176d;
                }
                int i10 = this.f27173a;
                int i11 = i10 + 1;
                float[] fArr = this.f27174b;
                fArr[i10] = f13;
                int i12 = i11 + 1;
                fArr[i11] = f11;
                int i13 = i12 + 1;
                fArr[i12] = f14;
                this.f27173a = i13 + 1;
                fArr[i13] = f2;
            }
        }
        this.f27173a = 0;
    }
}
