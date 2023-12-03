package v1;

import android.graphics.Color;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import v1.b;
/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes.dex */
public final class a {
    public static final C0587a f = new C0587a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f34666a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f34667b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f34668c;

    /* renamed from: d  reason: collision with root package name */
    public final b.c[] f34669d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f34670e = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0587a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            return (((bVar4.f34678i - bVar4.f34677h) + 1) * (((bVar4.f34676g - bVar4.f) + 1) * ((bVar4.f34675e - bVar4.f34674d) + 1))) - (((bVar3.f34678i - bVar3.f34677h) + 1) * (((bVar3.f34676g - bVar3.f) + 1) * ((bVar3.f34675e - bVar3.f34674d) + 1)));
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f34671a;

        /* renamed from: b  reason: collision with root package name */
        public int f34672b;

        /* renamed from: c  reason: collision with root package name */
        public int f34673c;

        /* renamed from: d  reason: collision with root package name */
        public int f34674d;

        /* renamed from: e  reason: collision with root package name */
        public int f34675e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f34676g;

        /* renamed from: h  reason: collision with root package name */
        public int f34677h;

        /* renamed from: i  reason: collision with root package name */
        public int f34678i;

        public b(int i6, int i10) {
            this.f34671a = i6;
            this.f34672b = i10;
            a();
        }

        public final void a() {
            a aVar = a.this;
            int[] iArr = aVar.f34666a;
            int[] iArr2 = aVar.f34667b;
            int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i12 = LinearLayoutManager.INVALID_OFFSET;
            int i13 = LinearLayoutManager.INVALID_OFFSET;
            int i14 = LinearLayoutManager.INVALID_OFFSET;
            int i15 = 0;
            for (int i16 = this.f34671a; i16 <= this.f34672b; i16++) {
                int i17 = iArr[i16];
                i15 += iArr2[i17];
                int i18 = (i17 >> 10) & 31;
                int i19 = (i17 >> 5) & 31;
                int i20 = i17 & 31;
                if (i18 > i12) {
                    i12 = i18;
                }
                if (i18 < i6) {
                    i6 = i18;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i10) {
                    i10 = i19;
                }
                if (i20 > i14) {
                    i14 = i20;
                }
                if (i20 < i11) {
                    i11 = i20;
                }
            }
            this.f34674d = i6;
            this.f34675e = i12;
            this.f = i10;
            this.f34676g = i13;
            this.f34677h = i11;
            this.f34678i = i14;
            this.f34673c = i15;
        }
    }

    public a(int[] iArr, int i6, b.c[] cVarArr) {
        boolean z10;
        b bVar;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        this.f34669d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f34667b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int b10 = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = b10;
            iArr2[b10] = iArr2[b10] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int rgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                ThreadLocal<double[]> threadLocal = d.f21621a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.f34670e;
                d.a(red, green, blue, fArr);
                b.c[] cVarArr2 = this.f34669d;
                if (cVarArr2 != null && cVarArr2.length > 0) {
                    for (b.c cVar : cVarArr2) {
                        if (!cVar.a(fArr)) {
                            z13 = true;
                            break;
                        }
                    }
                }
                z13 = false;
                if (z13) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f34666a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i6) {
            this.f34668c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                this.f34668c.add(new b.d(Color.rgb(b((i18 >> 10) & 31, 5, 8), b((i18 >> 5) & 31, 5, 8), b(i18 & 31, 5, 8)), iArr2[i18]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i6, f);
        priorityQueue.offer(new b(0, this.f34666a.length - 1));
        while (priorityQueue.size() < i6 && (bVar = (b) priorityQueue.poll()) != null) {
            int i19 = bVar.f34672b;
            int i20 = bVar.f34671a;
            if ((i19 + 1) - i20 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            if ((i19 + 1) - i20 > 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i21 = bVar.f34675e - bVar.f34674d;
                int i22 = bVar.f34676g - bVar.f;
                int i23 = bVar.f34678i - bVar.f34677h;
                if (i21 >= i22 && i21 >= i23) {
                    i10 = -3;
                } else if (i22 >= i21 && i22 >= i23) {
                    i10 = -2;
                } else {
                    i10 = -1;
                }
                a aVar = a.this;
                int[] iArr4 = aVar.f34666a;
                a(i10, i20, i19, iArr4);
                Arrays.sort(iArr4, i20, bVar.f34672b + 1);
                a(i10, i20, bVar.f34672b, iArr4);
                int i24 = bVar.f34673c / 2;
                int i25 = i20;
                int i26 = 0;
                while (true) {
                    int i27 = bVar.f34672b;
                    if (i25 <= i27) {
                        i26 += aVar.f34667b[iArr4[i25]];
                        if (i26 >= i24) {
                            i20 = Math.min(i27 - 1, i25);
                            break;
                        }
                        i25++;
                    }
                }
                b bVar2 = new b(i20 + 1, bVar.f34672b);
                bVar.f34672b = i20;
                bVar.a();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            a aVar2 = a.this;
            int[] iArr5 = aVar2.f34666a;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = bVar3.f34671a; i32 <= bVar3.f34672b; i32++) {
                int i33 = iArr5[i32];
                int i34 = aVar2.f34667b[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f2 = i29;
            b.d dVar = new b.d(Color.rgb(b(Math.round(i28 / f2), 5, 8), b(Math.round(i30 / f2), 5, 8), b(Math.round(i31 / f2), 5, 8)), i29);
            float[] b11 = dVar.b();
            b.c[] cVarArr3 = this.f34669d;
            if (cVarArr3 != null && cVarArr3.length > 0) {
                for (b.c cVar2 : cVarArr3) {
                    if (!cVar2.a(b11)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                arrayList.add(dVar);
            }
        }
        this.f34668c = arrayList;
    }

    public static void a(int i6, int i10, int i11, int[] iArr) {
        if (i6 != -2) {
            if (i6 == -1) {
                while (i10 <= i11) {
                    int i12 = iArr[i10];
                    iArr[i10] = ((i12 >> 10) & 31) | ((i12 & 31) << 10) | (((i12 >> 5) & 31) << 5);
                    i10++;
                }
                return;
            }
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
            i10++;
        }
    }

    public static int b(int i6, int i10, int i11) {
        int i12;
        if (i11 > i10) {
            i12 = i6 << (i11 - i10);
        } else {
            i12 = i6 >> (i10 - i11);
        }
        return i12 & ((1 << i11) - 1);
    }
}
