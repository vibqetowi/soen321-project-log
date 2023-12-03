package b9;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: SlidingPercentile.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: h  reason: collision with root package name */
    public static final p0.d f4201h = new p0.d(14);

    /* renamed from: i  reason: collision with root package name */
    public static final p0.d f4202i = new p0.d(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f4203a;

    /* renamed from: e  reason: collision with root package name */
    public int f4207e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4208g;

    /* renamed from: c  reason: collision with root package name */
    public final a[] f4205c = new a[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<a> f4204b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public int f4206d = -1;

    /* compiled from: SlidingPercentile.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4209a;

        /* renamed from: b  reason: collision with root package name */
        public int f4210b;

        /* renamed from: c  reason: collision with root package name */
        public float f4211c;
    }

    public s(int i6) {
        this.f4203a = i6;
    }

    public final void a(float f, int i6) {
        a aVar;
        int i10 = this.f4206d;
        ArrayList<a> arrayList = this.f4204b;
        if (i10 != 1) {
            Collections.sort(arrayList, f4201h);
            this.f4206d = 1;
        }
        int i11 = this.f4208g;
        a[] aVarArr = this.f4205c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f4208g = i12;
            aVar = aVarArr[i12];
        } else {
            aVar = new a();
        }
        int i13 = this.f4207e;
        this.f4207e = i13 + 1;
        aVar.f4209a = i13;
        aVar.f4210b = i6;
        aVar.f4211c = f;
        arrayList.add(aVar);
        this.f += i6;
        while (true) {
            int i14 = this.f;
            int i15 = this.f4203a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                a aVar2 = arrayList.get(0);
                int i17 = aVar2.f4210b;
                if (i17 <= i16) {
                    this.f -= i17;
                    arrayList.remove(0);
                    int i18 = this.f4208g;
                    if (i18 < 5) {
                        this.f4208g = i18 + 1;
                        aVarArr[i18] = aVar2;
                    }
                } else {
                    aVar2.f4210b = i17 - i16;
                    this.f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i6 = this.f4206d;
        ArrayList<a> arrayList = this.f4204b;
        if (i6 != 0) {
            Collections.sort(arrayList, f4202i);
            this.f4206d = 0;
        }
        float f = 0.5f * this.f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar = arrayList.get(i11);
            i10 += aVar.f4210b;
            if (i10 >= f) {
                return aVar.f4211c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f4211c;
    }
}
