package v1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Palette.java */
/* loaded from: classes.dex */
public final class b {
    public static final a f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f34680a;

    /* renamed from: b  reason: collision with root package name */
    public final List<v1.c> f34681b;

    /* renamed from: e  reason: collision with root package name */
    public final d f34684e;

    /* renamed from: d  reason: collision with root package name */
    public final SparseBooleanArray f34683d = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    public final t.b f34682c = new t.b();

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // v1.b.c
        public final boolean a(float[] fArr) {
            boolean z10;
            boolean z11;
            boolean z12;
            float f = fArr[2];
            if (f >= 0.95f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            if (f <= 0.05f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return false;
            }
            float f2 = fArr[0];
            if (f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: v1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0588b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f34685a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f34686b;

        /* renamed from: c  reason: collision with root package name */
        public int f34687c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34688d;

        /* renamed from: e  reason: collision with root package name */
        public final int f34689e;
        public final ArrayList f;

        public C0588b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f34686b = arrayList;
            this.f34687c = 16;
            this.f34688d = 12544;
            this.f34689e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (!bitmap.isRecycled()) {
                arrayList2.add(b.f);
                this.f34685a = bitmap;
                arrayList.add(v1.c.f34698e);
                arrayList.add(v1.c.f);
                arrayList.add(v1.c.f34699g);
                arrayList.add(v1.c.f34700h);
                arrayList.add(v1.c.f34701i);
                arrayList.add(v1.c.f34702j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b a() {
            int max;
            double d10;
            Bitmap createScaledBitmap;
            c[] cVarArr;
            boolean z10;
            int i6;
            ArrayList arrayList;
            int i10;
            char c10;
            float f;
            float f2;
            float f10;
            Bitmap bitmap = this.f34685a;
            if (bitmap != null) {
                int i11 = this.f34688d;
                if (i11 > 0) {
                    int height = bitmap.getHeight() * bitmap.getWidth();
                    if (height > i11) {
                        d10 = Math.sqrt(i11 / height);
                    }
                    d10 = -1.0d;
                } else {
                    int i12 = this.f34689e;
                    if (i12 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i12) {
                        d10 = i12 / max;
                    }
                    d10 = -1.0d;
                }
                char c11 = 0;
                if (d10 <= 0.0d) {
                    createScaledBitmap = bitmap;
                } else {
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d10), (int) Math.ceil(bitmap.getHeight() * d10), false);
                }
                int width = createScaledBitmap.getWidth();
                int height2 = createScaledBitmap.getHeight();
                int[] iArr = new int[width * height2];
                createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
                int i13 = this.f34687c;
                ArrayList arrayList2 = this.f;
                if (arrayList2.isEmpty()) {
                    cVarArr = null;
                } else {
                    cVarArr = (c[]) arrayList2.toArray(new c[arrayList2.size()]);
                }
                v1.a aVar = new v1.a(iArr, i13, cVarArr);
                if (createScaledBitmap != bitmap) {
                    createScaledBitmap.recycle();
                }
                ArrayList arrayList3 = aVar.f34668c;
                ArrayList arrayList4 = this.f34686b;
                b bVar = new b(arrayList3, arrayList4);
                int size = arrayList4.size();
                int i14 = 0;
                while (true) {
                    SparseBooleanArray sparseBooleanArray = bVar.f34683d;
                    if (i14 < size) {
                        v1.c cVar = (v1.c) arrayList4.get(i14);
                        float[] fArr = cVar.f34705c;
                        float f11 = 0.0f;
                        for (float f12 : fArr) {
                            if (f12 > 0.0f) {
                                f11 += f12;
                            }
                        }
                        if (f11 != 0.0f) {
                            int length = fArr.length;
                            for (int i15 = 0; i15 < length; i15++) {
                                float f13 = fArr[i15];
                                if (f13 > 0.0f) {
                                    fArr[i15] = f13 / f11;
                                }
                            }
                        }
                        t.b bVar2 = bVar.f34682c;
                        List<d> list = bVar.f34680a;
                        int size2 = list.size();
                        int i16 = 0;
                        d dVar = null;
                        float f14 = 0.0f;
                        while (i16 < size2) {
                            d dVar2 = list.get(i16);
                            float[] b10 = dVar2.b();
                            float f15 = b10[1];
                            float[] fArr2 = cVar.f34703a;
                            float f16 = fArr2[c11];
                            float[] fArr3 = cVar.f34704b;
                            if (f15 >= f16 && f15 <= fArr2[2]) {
                                float f17 = b10[2];
                                if (f17 >= fArr3[0] && f17 <= fArr3[2] && !sparseBooleanArray.get(dVar2.f34693d)) {
                                    z10 = true;
                                    if (!z10) {
                                        float[] b11 = dVar2.b();
                                        i6 = size;
                                        d dVar3 = bVar.f34684e;
                                        if (dVar3 != null) {
                                            i10 = dVar3.f34694e;
                                            arrayList = arrayList4;
                                        } else {
                                            arrayList = arrayList4;
                                            i10 = 1;
                                        }
                                        float[] fArr4 = cVar.f34705c;
                                        float f18 = fArr4[0];
                                        if (f18 > 0.0f) {
                                            c10 = 1;
                                            f = (1.0f - Math.abs(b11[1] - fArr2[1])) * f18;
                                        } else {
                                            c10 = 1;
                                            f = 0.0f;
                                        }
                                        float f19 = fArr4[c10];
                                        if (f19 > 0.0f) {
                                            f2 = (1.0f - Math.abs(b11[2] - fArr3[c10])) * f19;
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        float f20 = fArr4[2];
                                        if (f20 > 0.0f) {
                                            f10 = (dVar2.f34694e / i10) * f20;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        float f21 = f + f2 + f10;
                                        if (dVar == null || f21 > f14) {
                                            f14 = f21;
                                            dVar = dVar2;
                                        }
                                    } else {
                                        i6 = size;
                                        arrayList = arrayList4;
                                    }
                                    i16++;
                                    size = i6;
                                    arrayList4 = arrayList;
                                    c11 = 0;
                                }
                            }
                            z10 = false;
                            if (!z10) {
                            }
                            i16++;
                            size = i6;
                            arrayList4 = arrayList;
                            c11 = 0;
                        }
                        int i17 = size;
                        ArrayList arrayList5 = arrayList4;
                        if (dVar != null && cVar.f34706d) {
                            sparseBooleanArray.append(dVar.f34693d, true);
                        }
                        bVar2.put(cVar, dVar);
                        i14++;
                        size = i17;
                        arrayList4 = arrayList5;
                        c11 = 0;
                    } else {
                        sparseBooleanArray.clear();
                        return bVar;
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(float[] fArr);
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f34690a;

        /* renamed from: b  reason: collision with root package name */
        public final int f34691b;

        /* renamed from: c  reason: collision with root package name */
        public final int f34692c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34693d;

        /* renamed from: e  reason: collision with root package name */
        public final int f34694e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public int f34695g;

        /* renamed from: h  reason: collision with root package name */
        public int f34696h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f34697i;

        public d(int i6, int i10) {
            this.f34690a = Color.red(i6);
            this.f34691b = Color.green(i6);
            this.f34692c = Color.blue(i6);
            this.f34693d = i6;
            this.f34694e = i10;
        }

        public final void a() {
            int h10;
            int h11;
            if (!this.f) {
                int i6 = this.f34693d;
                int e10 = j0.d.e(4.5f, -1, i6);
                int e11 = j0.d.e(3.0f, -1, i6);
                if (e10 != -1 && e11 != -1) {
                    this.f34696h = j0.d.h(-1, e10);
                    this.f34695g = j0.d.h(-1, e11);
                    this.f = true;
                    return;
                }
                int e12 = j0.d.e(4.5f, -16777216, i6);
                int e13 = j0.d.e(3.0f, -16777216, i6);
                if (e12 != -1 && e13 != -1) {
                    this.f34696h = j0.d.h(-16777216, e12);
                    this.f34695g = j0.d.h(-16777216, e13);
                    this.f = true;
                    return;
                }
                if (e10 != -1) {
                    h10 = j0.d.h(-1, e10);
                } else {
                    h10 = j0.d.h(-16777216, e12);
                }
                this.f34696h = h10;
                if (e11 != -1) {
                    h11 = j0.d.h(-1, e11);
                } else {
                    h11 = j0.d.h(-16777216, e13);
                }
                this.f34695g = h11;
                this.f = true;
            }
        }

        public final float[] b() {
            if (this.f34697i == null) {
                this.f34697i = new float[3];
            }
            j0.d.a(this.f34690a, this.f34691b, this.f34692c, this.f34697i);
            return this.f34697i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f34694e == dVar.f34694e && this.f34693d == dVar.f34693d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f34693d * 31) + this.f34694e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.f34693d));
            sb2.append("] [HSL: ");
            sb2.append(Arrays.toString(b()));
            sb2.append("] [Population: ");
            sb2.append(this.f34694e);
            sb2.append("] [Title Text: #");
            a();
            sb2.append(Integer.toHexString(this.f34695g));
            sb2.append("] [Body Text: #");
            a();
            sb2.append(Integer.toHexString(this.f34696h));
            sb2.append(']');
            return sb2.toString();
        }
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f34680a = arrayList;
        this.f34681b = arrayList2;
        int size = arrayList.size();
        int i6 = LinearLayoutManager.INVALID_OFFSET;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = (d) arrayList.get(i10);
            int i11 = dVar2.f34694e;
            if (i11 > i6) {
                dVar = dVar2;
                i6 = i11;
            }
        }
        this.f34684e = dVar;
    }
}
