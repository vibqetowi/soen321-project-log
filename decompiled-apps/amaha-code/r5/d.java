package r5;

import kotlin.jvm.internal.i;
import r5.a;
/* compiled from: Operator.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f30481a = 0;

    static {
        new d();
    }

    public static final void a(a x10, a b10) {
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            i.g(x10, "x");
            i.g(b10, "b");
            int[] iArr = x10.f30452a;
            int i6 = iArr[0];
            int i10 = iArr[1];
            int i11 = iArr[2];
            float[] fArr = x10.f30454c;
            float[] fArr2 = b10.f30454c;
            if (i6 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i10 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    int i17 = i16 + 1;
                                    int i18 = (i14 * i11) + (i12 * i10 * i11) + i16;
                                    fArr[i18] = fArr[i18] + fArr2[i16];
                                    if (i17 >= i11) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i15 >= i10) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 < i6) {
                        i12 = i13;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
        }
    }

    public static final a b(a[] aVarArr) {
        int i6;
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            int i10 = aVarArr[0].f30452a[0];
            int length = aVarArr.length - 1;
            if (length >= 0) {
                int i11 = 0;
                i6 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    i6 += aVarArr[i11].f30452a[1];
                    if (i12 > length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                i6 = 0;
            }
            a aVar = new a(new int[]{i10, i6});
            float[] fArr = aVar.f30454c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    int i15 = i13 * i6;
                    int length2 = aVarArr.length - 1;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            a aVar2 = aVarArr[i16];
                            float[] fArr2 = aVar2.f30454c;
                            int i18 = aVar2.f30452a[1];
                            System.arraycopy(fArr2, i13 * i18, fArr, i15, i18);
                            i15 += i18;
                            if (i17 > length2) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final a c(a x10, a w10) {
        Class<d> cls;
        Class<d> cls2;
        a aVar;
        Class<d> cls3 = d.class;
        if (b6.a.b(cls3)) {
            return null;
        }
        try {
            i.g(x10, "x");
            i.g(w10, "w");
            try {
                int[] iArr = x10.f30452a;
                int i6 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int[] iArr2 = w10.f30452a;
                int i12 = iArr2[0];
                int i13 = (i10 - i12) + 1;
                int i14 = iArr2[2];
                a aVar2 = new a(new int[]{i6, i13, i14});
                float[] fArr = x10.f30454c;
                float[] fArr2 = aVar2.f30454c;
                float[] fArr3 = w10.f30454c;
                if (i6 > 0) {
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        if (i14 > 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                if (i13 > 0) {
                                    int i19 = 0;
                                    while (true) {
                                        int i20 = i19 + 1;
                                        float f = 0.0f;
                                        if (i12 > 0) {
                                            int i21 = 0;
                                            while (true) {
                                                cls2 = cls3;
                                                int i22 = i21 + 1;
                                                if (i11 > 0) {
                                                    int i23 = 0;
                                                    while (true) {
                                                        aVar = aVar2;
                                                        int i24 = i23 + 1;
                                                        try {
                                                            f = (fArr[((i21 + i19) * i11) + (i10 * i11 * i15) + i23] * fArr3[(((i21 * i11) + i23) * i14) + i17]) + f;
                                                            if (i24 >= i11) {
                                                                break;
                                                            }
                                                            i23 = i24;
                                                            aVar2 = aVar;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            cls = cls2;
                                                            b6.a.a(cls, th);
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    aVar = aVar2;
                                                }
                                                if (i22 >= i12) {
                                                    break;
                                                }
                                                i21 = i22;
                                                cls3 = cls2;
                                                aVar2 = aVar;
                                            }
                                        } else {
                                            cls2 = cls3;
                                            aVar = aVar2;
                                        }
                                        fArr2[(i19 * i14) + (i13 * i14 * i15) + i17] = f;
                                        if (i20 >= i13) {
                                            break;
                                        }
                                        i19 = i20;
                                        cls3 = cls2;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls2 = cls3;
                                    aVar = aVar2;
                                }
                                if (i18 >= i14) {
                                    break;
                                }
                                i17 = i18;
                                cls3 = cls2;
                                aVar2 = aVar;
                            }
                        } else {
                            cls2 = cls3;
                            aVar = aVar2;
                        }
                        if (i16 < i6) {
                            i15 = i16;
                            cls3 = cls2;
                            aVar2 = aVar;
                        } else {
                            return aVar;
                        }
                    }
                } else {
                    return aVar2;
                }
            } catch (Throwable th3) {
                th = th3;
                cls2 = cls3;
            }
        } catch (Throwable th4) {
            th = th4;
            cls = cls3;
        }
    }

    public static final a d(a x10, a w10, a b10) {
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            i.g(x10, "x");
            i.g(w10, "w");
            i.g(b10, "b");
            int i6 = x10.f30452a[0];
            int i10 = b10.f30452a[0];
            a h10 = h(x10, w10);
            float[] fArr = b10.f30454c;
            float[] fArr2 = h10.f30454c;
            if (i6 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * i10) + i13;
                            fArr2[i15] = fArr2[i15] + fArr[i13];
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= i6) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return h10;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final a e(String[] strArr, a w10) {
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            i.g(w10, "w");
            int length = strArr.length;
            int i6 = w10.f30452a[1];
            a aVar = new a(new int[]{length, 128, i6});
            float[] fArr = aVar.f30454c;
            float[] fArr2 = w10.f30454c;
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    int[] c10 = e.f30482a.c(strArr[i10]);
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        System.arraycopy(fArr2, c10[i12] * i6, fArr, (i12 * i6) + (i6 * 128 * i10), i6);
                        if (i13 >= 128) {
                            break;
                        }
                        i12 = i13;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final void f(a x10) {
        int i6;
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            i.g(x10, "x");
            int[] iArr = x10.f30452a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i10 = 1;
                i6 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    i6 *= x10.f30452a[i10];
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            } else {
                i6 = 1;
            }
            int[] iArr2 = {x10.f30452a[0], i6};
            x10.f30452a = iArr2;
            int a10 = a.C0517a.a(iArr2);
            float[] fArr = new float[a10];
            System.arraycopy(x10.f30454c, 0, fArr, 0, Math.min(x10.f30453b, a10));
            x10.f30454c = fArr;
            x10.f30453b = a10;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
        }
    }

    public static final a g(a x10, int i6) {
        int i10;
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            i.g(x10, "x");
            int[] iArr = x10.f30452a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = (i12 - i6) + 1;
            a aVar = new a(new int[]{i11, i14, i13});
            float[] fArr = x10.f30454c;
            float[] fArr2 = aVar.f30454c;
            if (i11 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    if (i13 > 0) {
                        int i17 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            if (i14 > 0) {
                                int i19 = 0;
                                while (true) {
                                    int i20 = i19 + 1;
                                    int i21 = i19 * i13;
                                    int i22 = (i15 * i14 * i13) + i21 + i17;
                                    int i23 = (i15 * i12 * i13) + i21 + i17;
                                    fArr2[i22] = Float.MIN_VALUE;
                                    if (i6 > 0) {
                                        int i24 = 0;
                                        while (true) {
                                            int i25 = i24 + 1;
                                            i10 = i12;
                                            fArr2[i22] = Math.max(fArr2[i22], fArr[(i24 * i13) + i23]);
                                            if (i25 >= i6) {
                                                break;
                                            }
                                            i24 = i25;
                                            i12 = i10;
                                        }
                                    } else {
                                        i10 = i12;
                                    }
                                    if (i20 >= i14) {
                                        break;
                                    }
                                    i19 = i20;
                                    i12 = i10;
                                }
                            } else {
                                i10 = i12;
                            }
                            if (i18 >= i13) {
                                break;
                            }
                            i17 = i18;
                            i12 = i10;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (i16 >= i11) {
                        break;
                    }
                    i15 = i16;
                    i12 = i10;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final a h(a x10, a w10) {
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            i.g(x10, "x");
            i.g(w10, "w");
            int i6 = x10.f30452a[0];
            int[] iArr = w10.f30452a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            a aVar = new a(new int[]{i6, i11});
            float[] fArr = x10.f30454c;
            float[] fArr2 = w10.f30454c;
            float[] fArr3 = aVar.f30454c;
            if (i6 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            int i16 = (i12 * i11) + i14;
                            fArr3[i16] = 0.0f;
                            if (i10 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    fArr3[i16] = (fArr[(i12 * i10) + i17] * fArr2[(i17 * i11) + i14]) + fArr3[i16];
                                    if (i18 >= i10) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i6) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final void i(a x10) {
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            i.g(x10, "x");
            float[] fArr = x10.f30454c;
            int length = fArr.length - 1;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    if (fArr[i6] < 0.0f) {
                        fArr[i6] = 0.0f;
                    }
                    if (i10 <= length) {
                        i6 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
        }
    }

    public static final void j(a x10) {
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            i.g(x10, "x");
            int[] iArr = x10.f30452a;
            int i6 = 0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr = x10.f30454c;
            if (i10 <= 0) {
                return;
            }
            while (true) {
                int i12 = i6 + 1;
                int i13 = i6 * i11;
                int i14 = i13 + i11;
                float f = Float.MIN_VALUE;
                if (i13 < i14) {
                    int i15 = i13;
                    while (true) {
                        int i16 = i15 + 1;
                        float f2 = fArr[i15];
                        if (f2 > f) {
                            f = f2;
                        }
                        if (i16 >= i14) {
                            break;
                        }
                        i15 = i16;
                    }
                }
                float f10 = 0.0f;
                if (i13 < i14) {
                    int i17 = i13;
                    while (true) {
                        int i18 = i17 + 1;
                        float exp = (float) Math.exp(fArr[i17] - f);
                        fArr[i17] = exp;
                        f10 += exp;
                        if (i18 >= i14) {
                            break;
                        }
                        i17 = i18;
                    }
                }
                if (i13 < i14) {
                    while (true) {
                        int i19 = i13 + 1;
                        fArr[i13] = fArr[i13] / f10;
                        if (i19 >= i14) {
                            break;
                        }
                        i13 = i19;
                    }
                }
                if (i12 < i10) {
                    i6 = i12;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
        }
    }

    public static final a k(a aVar) {
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f30452a;
            int i6 = iArr[0];
            int i10 = iArr[1];
            a aVar2 = new a(new int[]{i10, i6});
            float[] fArr = aVar.f30454c;
            float[] fArr2 = aVar2.f30454c;
            if (i6 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            fArr2[(i13 * i6) + i11] = fArr[(i11 * i10) + i13];
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= i6) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    public static final a l(a aVar) {
        if (b6.a.b(d.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f30452a;
            int i6 = iArr[0];
            int i10 = iArr[1];
            int i11 = iArr[2];
            a aVar2 = new a(new int[]{i11, i10, i6});
            float[] fArr = aVar.f30454c;
            float[] fArr2 = aVar2.f30454c;
            if (i6 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i10 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            if (i11 > 0) {
                                int i16 = 0;
                                while (true) {
                                    int i17 = i16 + 1;
                                    fArr2[(i14 * i6) + (i16 * i6 * i10) + i12] = fArr[(i14 * i11) + (i12 * i10 * i11) + i16];
                                    if (i17 >= i11) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i15 >= i10) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i6) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }
}
