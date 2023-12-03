package a0;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r1.b0;
import z.b;
import z.c;
import z.d;
/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public final class n {
    public k[] A;

    /* renamed from: b  reason: collision with root package name */
    public View f98b;

    /* renamed from: c  reason: collision with root package name */
    public int f99c;

    /* renamed from: j  reason: collision with root package name */
    public w.b[] f105j;

    /* renamed from: k  reason: collision with root package name */
    public w.a f106k;

    /* renamed from: o  reason: collision with root package name */
    public int[] f110o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f111p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f112q;
    public String[] r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f113s;

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, z.d> f118x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, z.c> f119y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, z.b> f120z;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f97a = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public boolean f100d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f101e = -1;
    public final q f = new q();

    /* renamed from: g  reason: collision with root package name */
    public final q f102g = new q();

    /* renamed from: h  reason: collision with root package name */
    public final l f103h = new l();

    /* renamed from: i  reason: collision with root package name */
    public final l f104i = new l();

    /* renamed from: l  reason: collision with root package name */
    public float f107l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f108m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f109n = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f114t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<q> f115u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public final float[] f116v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<d> f117w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n(View view) {
        this.f98b = view;
        this.f99c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).getClass();
        }
    }

    public static void e(Rect rect, Rect rect2, int i6, int i10, int i11) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        int i12 = rect.left + rect.right;
                        rect2.left = i10 - ((rect.width() + (rect.bottom + rect.top)) / 2);
                        rect2.top = (i12 - rect.height()) / 2;
                        rect2.right = rect.width() + rect2.left;
                        rect2.bottom = rect.height() + rect2.top;
                        return;
                    }
                    return;
                }
                int i13 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i13 / 2);
                rect2.top = i11 - ((rect.height() + i13) / 2);
                rect2.right = rect.width() + rect2.left;
                rect2.bottom = rect.height() + rect2.top;
                return;
            }
            int i14 = rect.left + rect.right;
            rect2.left = i10 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        int i15 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i11 - ((rect.height() + i15) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f10 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f11 = this.f109n;
            if (f11 != 1.0d) {
                float f12 = this.f108m;
                if (f < f12) {
                    f = 0.0f;
                }
                if (f > f12 && f < 1.0d) {
                    f = Math.min((f - f12) * f11, 1.0f);
                }
            }
        }
        w.c cVar = this.f.f121u;
        Iterator<q> it = this.f115u.iterator();
        float f13 = Float.NaN;
        while (it.hasNext()) {
            q next = it.next();
            w.c cVar2 = next.f121u;
            if (cVar2 != null) {
                float f14 = next.f123w;
                if (f14 < f) {
                    cVar = cVar2;
                    f2 = f14;
                } else if (Float.isNaN(f13)) {
                    f13 = next.f123w;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f13)) {
                f10 = f13;
            }
            float f15 = f10 - f2;
            double d10 = (f - f2) / f15;
            f = (((float) cVar.a(d10)) * f15) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f;
    }

    public final void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f105j[0].c(d10, dArr);
        this.f105j[0].e(d10, dArr2);
        float f = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f110o;
        q qVar = this.f;
        float f2 = qVar.f125y;
        float f10 = qVar.f126z;
        float f11 = qVar.A;
        float f12 = qVar.B;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f16 = (float) dArr[i6];
            float f17 = (float) dArr2[i6];
            int i10 = iArr[i6];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f12 = f16;
                            f15 = f17;
                        }
                    } else {
                        f11 = f16;
                        f14 = f17;
                    }
                } else {
                    f10 = f16;
                    f13 = f17;
                }
            } else {
                f2 = f16;
                f = f17;
            }
        }
        float f18 = 2.0f;
        float f19 = (f14 / 2.0f) + f;
        float f20 = (f15 / 2.0f) + f13;
        n nVar = qVar.G;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.b(d10, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d11 = f2;
            double d12 = f10;
            float cos = (float) ((f22 - (Math.cos(d12) * d11)) - (f12 / 2.0f));
            double d13 = f23;
            double d14 = f;
            double sin = (Math.sin(d12) * d14) + d13;
            double d15 = f13;
            f20 = (float) ((Math.sin(d12) * d15) + (f24 - (Math.cos(d12) * d14)));
            f10 = cos;
            f19 = (float) ((Math.cos(d12) * d15) + sin);
            f2 = (float) (((Math.sin(d12) * d11) + f21) - (f11 / 2.0f));
            f18 = 2.0f;
        }
        fArr[0] = (f11 / f18) + f2 + 0.0f;
        fArr[1] = (f12 / f18) + f10 + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = f20;
    }

    public final boolean c(float f, long j10, View view, w.d dVar) {
        boolean z10;
        d.C0666d c0666d;
        float f2;
        n nVar;
        boolean z11;
        float f10;
        q qVar;
        d.C0666d c0666d2;
        boolean z12;
        double d10;
        float f11;
        View view2;
        float f12;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        float a10 = a(f, null);
        int i6 = this.E;
        if (i6 != -1) {
            float f15 = 1.0f / i6;
            float floor = ((float) Math.floor(a10 / f15)) * f15;
            float f16 = (a10 % f15) / f15;
            if (!Float.isNaN(this.F)) {
                f16 = (f16 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                f14 = interpolator.getInterpolation(f16);
            } else if (f16 > 0.5d) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            a10 = (f14 * f15) + floor;
        }
        float f17 = a10;
        HashMap<String, z.c> hashMap = this.f119y;
        if (hashMap != null) {
            for (z.c cVar : hashMap.values()) {
                cVar.d(view, f17);
            }
        }
        HashMap<String, z.d> hashMap2 = this.f118x;
        if (hashMap2 != null) {
            c0666d = null;
            z10 = false;
            for (z.d dVar2 : hashMap2.values()) {
                if (dVar2 instanceof d.C0666d) {
                    c0666d = (d.C0666d) dVar2;
                } else {
                    z10 |= dVar2.e(f17, j10, view, dVar);
                }
            }
        } else {
            z10 = false;
            c0666d = null;
        }
        w.b[] bVarArr = this.f105j;
        q qVar2 = this.f;
        if (bVarArr != null) {
            double d11 = f17;
            bVarArr[0].c(d11, this.f111p);
            this.f105j[0].e(d11, this.f112q);
            w.a aVar = this.f106k;
            if (aVar != null) {
                double[] dArr = this.f111p;
                if (dArr.length > 0) {
                    aVar.c(d11, dArr);
                    this.f106k.e(d11, this.f112q);
                }
            }
            if (!this.H) {
                int[] iArr = this.f110o;
                double[] dArr2 = this.f111p;
                double[] dArr3 = this.f112q;
                boolean z15 = this.f100d;
                float f18 = qVar2.f125y;
                float f19 = qVar2.f126z;
                float f20 = qVar2.A;
                float f21 = qVar2.B;
                if (iArr.length != 0) {
                    f12 = f19;
                    if (qVar2.J.length <= iArr[iArr.length - 1]) {
                        int i10 = iArr[iArr.length - 1] + 1;
                        qVar2.J = new double[i10];
                        qVar2.K = new double[i10];
                    }
                } else {
                    f12 = f19;
                }
                c0666d2 = c0666d;
                z12 = z10;
                Arrays.fill(qVar2.J, Double.NaN);
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    double[] dArr4 = qVar2.J;
                    int i12 = iArr[i11];
                    dArr4[i12] = dArr2[i11];
                    qVar2.K[i12] = dArr3[i11];
                }
                float f22 = Float.NaN;
                float f23 = 0.0f;
                int i13 = 0;
                float f24 = f18;
                float f25 = f20;
                float f26 = f21;
                float f27 = f12;
                float f28 = 0.0f;
                float f29 = 0.0f;
                f10 = f17;
                float f30 = 0.0f;
                while (true) {
                    double[] dArr5 = qVar2.J;
                    z13 = z15;
                    if (i13 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i13])) {
                        f13 = f22;
                    } else {
                        double d12 = 0.0d;
                        if (!Double.isNaN(qVar2.J[i13])) {
                            d12 = qVar2.J[i13] + 0.0d;
                        }
                        f13 = f22;
                        float f31 = (float) d12;
                        float f32 = (float) qVar2.K[i13];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4) {
                                        if (i13 == 5) {
                                            f22 = f31;
                                        }
                                    } else {
                                        f29 = f32;
                                        f26 = f31;
                                    }
                                } else {
                                    f28 = f32;
                                    f25 = f31;
                                }
                            } else {
                                f30 = f32;
                                f27 = f31;
                            }
                        } else {
                            f22 = f13;
                            f23 = f32;
                            f24 = f31;
                        }
                        i13++;
                        z15 = z13;
                    }
                    f22 = f13;
                    i13++;
                    z15 = z13;
                }
                float f33 = f22;
                n nVar2 = qVar2.G;
                if (nVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar2.b(d11, fArr, fArr2);
                    float f34 = fArr[0];
                    float f35 = fArr[1];
                    float f36 = fArr2[0];
                    float f37 = fArr2[1];
                    qVar = qVar2;
                    double d13 = f34;
                    double d14 = f24;
                    d10 = d11;
                    double d15 = f27;
                    float sin = (float) (((Math.sin(d15) * d14) + d13) - (f25 / 2.0f));
                    float cos = (float) ((f35 - (Math.cos(d15) * d14)) - (f26 / 2.0f));
                    double d16 = f23;
                    double d17 = f30;
                    float cos2 = (float) ((Math.cos(d15) * d14 * d17) + (Math.sin(d15) * d16) + f36);
                    float sin2 = (float) ((Math.sin(d15) * d14 * d17) + (f37 - (Math.cos(d15) * d16)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin2;
                    }
                    if (!Float.isNaN(f33)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f33));
                    }
                    f24 = sin;
                    f27 = cos;
                } else {
                    qVar = qVar2;
                    d10 = d11;
                    if (!Float.isNaN(f33)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f29 / 2.0f) + f30, (f28 / 2.0f) + f23)) + f33 + 0.0f));
                    }
                }
                if (view instanceof c) {
                    ((c) view).a();
                } else {
                    float f38 = f24 + 0.5f;
                    int i14 = (int) f38;
                    float f39 = f27 + 0.5f;
                    int i15 = (int) f39;
                    int i16 = (int) (f38 + f25);
                    int i17 = (int) (f39 + f26);
                    int i18 = i16 - i14;
                    int i19 = i17 - i15;
                    if (i18 == view.getMeasuredWidth() && i19 == view.getMeasuredHeight()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14 || z13) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    }
                    view.layout(i14, i15, i16, i17);
                }
                nVar = this;
                nVar.f100d = false;
            } else {
                f10 = f17;
                qVar = qVar2;
                c0666d2 = c0666d;
                z12 = z10;
                d10 = d11;
                nVar = this;
            }
            if (nVar.C != -1) {
                if (nVar.D == null) {
                    nVar.D = ((View) view.getParent()).findViewById(nVar.C);
                }
                if (nVar.D != null) {
                    float bottom = (nVar.D.getBottom() + view2.getTop()) / 2.0f;
                    float right = (nVar.D.getRight() + nVar.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, z.c> hashMap3 = nVar.f119y;
            if (hashMap3 != null) {
                for (z.c cVar2 : hashMap3.values()) {
                    if (cVar2 instanceof c.d) {
                        double[] dArr6 = nVar.f112q;
                        if (dArr6.length > 1) {
                            f11 = f10;
                            view.setRotation(((c.d) cVar2).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                            f10 = f11;
                        }
                    }
                    f11 = f10;
                    f10 = f11;
                }
            }
            f2 = f10;
            if (c0666d2 != null) {
                double[] dArr7 = nVar.f112q;
                view.setRotation(c0666d2.d(f2, j10, view, dVar) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z11 = z12 | c0666d2.f36272h;
            } else {
                z11 = z12;
            }
            int i20 = 1;
            while (true) {
                w.b[] bVarArr2 = nVar.f105j;
                if (i20 >= bVarArr2.length) {
                    break;
                }
                w.b bVar = bVarArr2[i20];
                float[] fArr3 = nVar.f114t;
                bVar.d(d10, fArr3);
                f6.b.P0(qVar.H.get(nVar.r[i20 - 1]), view, fArr3);
                i20++;
            }
            l lVar = nVar.f103h;
            if (lVar.f91v == 0) {
                if (f2 <= 0.0f) {
                    view.setVisibility(lVar.f92w);
                } else {
                    l lVar2 = nVar.f104i;
                    if (f2 >= 1.0f) {
                        view.setVisibility(lVar2.f92w);
                    } else if (lVar2.f92w != lVar.f92w) {
                        view.setVisibility(0);
                    }
                }
            }
            if (nVar.A != null) {
                int i21 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i21 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i21].g(view, f2);
                    i21++;
                }
            }
        } else {
            f2 = f17;
            boolean z16 = z10;
            nVar = this;
            float f40 = qVar2.f125y;
            q qVar3 = nVar.f102g;
            float e10 = defpackage.e.e(qVar3.f125y, f40, f2, f40);
            float f41 = qVar2.f126z;
            float e11 = defpackage.e.e(qVar3.f126z, f41, f2, f41);
            float f42 = qVar2.A;
            float f43 = qVar3.A;
            float e12 = defpackage.e.e(f43, f42, f2, f42);
            float f44 = qVar2.B;
            float f45 = qVar3.B;
            float f46 = e10 + 0.5f;
            int i22 = (int) f46;
            float f47 = e11 + 0.5f;
            int i23 = (int) f47;
            int i24 = (int) (f46 + e12);
            int e13 = (int) (f47 + defpackage.e.e(f45, f44, f2, f44));
            int i25 = i24 - i22;
            int i26 = e13 - i23;
            if (f43 != f42 || f45 != f44 || nVar.f100d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), View.MeasureSpec.makeMeasureSpec(i26, 1073741824));
                nVar.f100d = false;
            }
            view.layout(i22, i23, i24, e13);
            z11 = z16;
        }
        HashMap<String, z.b> hashMap4 = nVar.f120z;
        if (hashMap4 != null) {
            for (z.b bVar2 : hashMap4.values()) {
                if (bVar2 instanceof b.d) {
                    double[] dArr8 = nVar.f112q;
                    view.setRotation(((b.d) bVar2).a(f2) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    bVar2.d(view, f2);
                }
            }
        }
        return z11;
    }

    public final void d(q qVar) {
        qVar.i((int) this.f98b.getX(), (int) this.f98b.getY(), this.f98b.getWidth(), this.f98b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f(int i6, int i10, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        Object obj;
        Object obj2;
        String str6;
        ArrayList<q> arrayList2;
        Object obj3;
        Object obj4;
        n nVar;
        ArrayList<d> arrayList3;
        Object obj5;
        Object obj6;
        String str7;
        String str8;
        Object obj7;
        String str9;
        Object obj8;
        boolean z10;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        String str10;
        String str11;
        Object obj13;
        String str12;
        String str13;
        String str14;
        String str15;
        char c10;
        z.b gVar;
        Iterator<String> it;
        b.C0664b c0664b;
        boolean z11;
        String str16;
        String str17;
        Object obj14;
        Object obj15;
        String str18;
        q qVar;
        String str19;
        double d10;
        float f;
        q qVar2;
        String str20;
        String str21;
        double[] dArr;
        double[][] dArr2;
        int c11;
        int i11;
        float[] fArr;
        b0.a aVar;
        HashSet<String> hashSet3;
        int i12;
        Object obj16;
        Object obj17;
        Object obj18;
        char c12;
        Object obj19;
        Object obj20;
        j jVar;
        Iterator<String> it2;
        String str22;
        Object obj21;
        Object obj22;
        String str23;
        String str24;
        String str25;
        Object obj23;
        char c13;
        z.d gVar2;
        HashMap<String, Integer> hashMap;
        Object obj24;
        d.b bVar;
        Object obj25;
        b0.a aVar2;
        int i13;
        Integer num;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        Iterator<String> it3;
        Object obj26;
        Object obj27;
        String str26;
        String str27;
        ArrayList<q> arrayList4;
        Object obj28;
        Object obj29;
        char c14;
        String str28;
        String str29;
        z.c iVar;
        Object obj30;
        c.b bVar2;
        b0.a aVar3;
        String str30;
        String str31;
        String str32;
        int binarySearch;
        n nVar2 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int i14 = nVar2.B;
        q qVar3 = nVar2.f;
        if (i14 != -1) {
            qVar3.D = i14;
        }
        l lVar = nVar2.f103h;
        float f2 = lVar.f90u;
        l lVar2 = nVar2.f104i;
        String str33 = "alpha";
        if (l.f(f2, lVar2.f90u)) {
            hashSet7.add("alpha");
        }
        String str34 = "elevation";
        if (l.f(lVar.f93x, lVar2.f93x)) {
            hashSet7.add("elevation");
        }
        int i15 = lVar.f92w;
        int i16 = lVar2.f92w;
        if (i15 != i16 && lVar.f91v == 0 && (i15 == 0 || i16 == 0)) {
            hashSet7.add("alpha");
        }
        String str35 = "rotation";
        if (l.f(lVar.f94y, lVar2.f94y)) {
            hashSet7.add("rotation");
        }
        if (!Float.isNaN(lVar.I) || !Float.isNaN(lVar2.I)) {
            hashSet7.add("transitionPathRotate");
        }
        if (!Float.isNaN(lVar.J) || !Float.isNaN(lVar2.J)) {
            hashSet7.add(Constants.SCREEN_PROGRESS);
        }
        if (l.f(lVar.f95z, lVar2.f95z)) {
            hashSet7.add("rotationX");
        }
        if (l.f(lVar.A, lVar2.A)) {
            hashSet7.add("rotationY");
        }
        q qVar4 = qVar3;
        String str36 = "transformPivotX";
        if (l.f(lVar.D, lVar2.D)) {
            hashSet7.add("transformPivotX");
        }
        Object obj31 = "rotationX";
        String str37 = "transformPivotY";
        if (l.f(lVar.E, lVar2.E)) {
            hashSet7.add("transformPivotY");
        }
        Object obj32 = "rotationY";
        if (l.f(lVar.B, lVar2.B)) {
            hashSet7.add("scaleX");
        }
        float f10 = lVar.C;
        Object obj33 = Constants.SCREEN_PROGRESS;
        String str38 = "scaleY";
        if (l.f(f10, lVar2.C)) {
            hashSet7.add("scaleY");
        }
        Object obj34 = "scaleX";
        if (l.f(lVar.F, lVar2.F)) {
            hashSet7.add("translationX");
        }
        Object obj35 = "translationX";
        String str39 = "translationY";
        if (l.f(lVar.G, lVar2.G)) {
            hashSet7.add("translationY");
        }
        String str40 = "translationZ";
        if (l.f(lVar.H, lVar2.H)) {
            hashSet7.add("translationZ");
        }
        ArrayList<d> arrayList5 = nVar2.f117w;
        ArrayList<q> arrayList6 = nVar2.f115u;
        if (arrayList5 == null) {
            str = "translationZ";
            str2 = "transformPivotX";
            str3 = "scaleY";
            str4 = "transformPivotY";
            str5 = "translationY";
            arrayList = null;
        } else {
            Iterator<d> it4 = arrayList5.iterator();
            ArrayList arrayList7 = null;
            while (it4.hasNext()) {
                String str41 = str39;
                d next = it4.next();
                String str42 = str40;
                if (next instanceof h) {
                    h hVar = (h) next;
                    str31 = str38;
                    str30 = str36;
                    q qVar5 = new q(i6, i10, hVar, nVar2.f, nVar2.f102g);
                    if (Collections.binarySearch(arrayList6, qVar5) == 0) {
                        str32 = str37;
                        Log.e("MotionController", " KeyPath position \"" + qVar5.f124x + "\" outside of range");
                    } else {
                        str32 = str37;
                    }
                    arrayList6.add((-binarySearch) - 1, qVar5);
                    int i17 = hVar.f55e;
                    if (i17 != -1) {
                        nVar2.f101e = i17;
                    }
                } else {
                    str30 = str36;
                    str31 = str38;
                    str32 = str37;
                    if (next instanceof f) {
                        next.d(hashSet8);
                    } else if (next instanceof j) {
                        next.d(hashSet6);
                    } else if (next instanceof k) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        ArrayList arrayList8 = arrayList7;
                        arrayList8.add((k) next);
                        arrayList7 = arrayList8;
                    } else {
                        next.f(hashMap2);
                        next.d(hashSet7);
                    }
                }
                str40 = str42;
                str39 = str41;
                str37 = str32;
                str38 = str31;
                str36 = str30;
            }
            str = str40;
            str2 = str36;
            str3 = str38;
            str4 = str37;
            str5 = str39;
            arrayList = arrayList7;
        }
        if (arrayList != null) {
            nVar2.A = (k[]) arrayList.toArray(new k[0]);
        }
        String str43 = ",";
        String str44 = "CUSTOM,";
        if (!hashSet7.isEmpty()) {
            nVar2.f119y = new HashMap<>();
            Iterator<String> it5 = hashSet7.iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    it3 = it5;
                    String str45 = next2.split(",")[1];
                    Iterator<d> it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        HashSet<String> hashSet9 = hashSet8;
                        d next3 = it6.next();
                        HashSet<String> hashSet10 = hashSet7;
                        HashMap<String, b0.a> hashMap3 = next3.f10d;
                        if (hashMap3 != null && (aVar3 = hashMap3.get(str45)) != null) {
                            sparseArray.append(next3.f7a, aVar3);
                        }
                        hashSet7 = hashSet10;
                        hashSet8 = hashSet9;
                    }
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    c.b bVar3 = new c.b(next2, sparseArray);
                    obj27 = obj34;
                    str26 = str;
                    str27 = str3;
                    arrayList4 = arrayList6;
                    bVar2 = bVar3;
                    obj26 = obj33;
                    obj29 = obj32;
                    obj30 = obj31;
                } else {
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    it3 = it5;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            if (next2.equals(obj28)) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1249320805:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            Object obj36 = obj32;
                            if (!next2.equals(obj36)) {
                                obj29 = obj36;
                                obj28 = obj31;
                                c14 = 65535;
                                break;
                            } else {
                                obj29 = obj36;
                                obj28 = obj31;
                                c14 = 1;
                                break;
                            }
                        case -1225497657:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            Object obj37 = obj35;
                            if (!next2.equals(obj37)) {
                                obj35 = obj37;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 65535;
                                break;
                            } else {
                                obj35 = obj37;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 2;
                                break;
                            }
                        case -1225497656:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            String str46 = str5;
                            if (!next2.equals(str46)) {
                                str5 = str46;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 65535;
                                break;
                            } else {
                                str5 = str46;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 3;
                                break;
                            }
                        case -1225497655:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            if (next2.equals(str26)) {
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 4;
                                break;
                            }
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case -1001078227:
                            obj26 = obj33;
                            obj27 = obj34;
                            str27 = str3;
                            String str47 = str2;
                            if (!next2.equals(obj26)) {
                                str2 = str47;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                str26 = str;
                                c14 = 65535;
                                break;
                            } else {
                                str2 = str47;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                str26 = str;
                                c14 = 5;
                                break;
                            }
                        case -908189618:
                            obj27 = obj34;
                            String str48 = str4;
                            str27 = str3;
                            String str49 = str2;
                            if (!next2.equals(obj27)) {
                                str4 = str48;
                                str2 = str49;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj26 = obj33;
                                str26 = str;
                                obj29 = obj32;
                                c14 = 65535;
                                break;
                            } else {
                                str4 = str48;
                                str2 = str49;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj26 = obj33;
                                str26 = str;
                                c14 = 6;
                                obj29 = obj32;
                                break;
                            }
                        case -908189617:
                            String str50 = str4;
                            str27 = str3;
                            String str51 = str2;
                            if (!next2.equals(str27)) {
                                str4 = str50;
                                str2 = str51;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 65535;
                                break;
                            } else {
                                str4 = str50;
                                str2 = str51;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 7;
                                break;
                            }
                        case -797520672:
                            str28 = str4;
                            str29 = str2;
                            if (next2.equals("waveVariesBy")) {
                                str4 = str28;
                                str2 = str29;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = '\b';
                                break;
                            }
                            str4 = str28;
                            str2 = str29;
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case -760884510:
                            str28 = str4;
                            str29 = str2;
                            if (next2.equals(str29)) {
                                str4 = str28;
                                str2 = str29;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = '\t';
                                break;
                            }
                            str4 = str28;
                            str2 = str29;
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case -760884509:
                            String str52 = str4;
                            if (!next2.equals(str52)) {
                                str4 = str52;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 65535;
                                break;
                            } else {
                                str4 = str52;
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = '\n';
                                break;
                            }
                        case -40300674:
                            if (next2.equals("rotation")) {
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 11;
                                break;
                            }
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = '\f';
                                break;
                            }
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = '\r';
                                break;
                            }
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 14;
                                break;
                            }
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                obj26 = obj33;
                                obj27 = obj34;
                                str26 = str;
                                str27 = str3;
                                arrayList4 = arrayList6;
                                obj28 = obj31;
                                obj29 = obj32;
                                c14 = 15;
                                break;
                            }
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                        default:
                            obj26 = obj33;
                            obj27 = obj34;
                            str26 = str;
                            str27 = str3;
                            arrayList4 = arrayList6;
                            obj28 = obj31;
                            obj29 = obj32;
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            iVar = new c.i();
                            break;
                        case 1:
                            iVar = new c.j();
                            break;
                        case 2:
                            iVar = new c.m();
                            break;
                        case 3:
                            iVar = new c.n();
                            break;
                        case 4:
                            iVar = new c.o();
                            break;
                        case 5:
                            iVar = new c.g();
                            break;
                        case 6:
                            iVar = new c.k();
                            break;
                        case 7:
                            iVar = new c.l();
                            break;
                        case '\b':
                            iVar = new c.a();
                            break;
                        case '\t':
                            iVar = new c.e();
                            break;
                        case '\n':
                            iVar = new c.f();
                            break;
                        case 11:
                            iVar = new c.h();
                            break;
                        case '\f':
                            iVar = new c.C0665c();
                            break;
                        case '\r':
                            iVar = new c.d();
                            break;
                        case 14:
                            iVar = new c.a();
                            break;
                        case 15:
                            iVar = new c.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    obj30 = obj28;
                    bVar2 = iVar;
                }
                if (bVar2 == null) {
                    str = str26;
                } else {
                    bVar2.f36244e = next2;
                    str = str26;
                    nVar2.f119y.put(next2, bVar2);
                }
                str3 = str27;
                obj31 = obj30;
                obj32 = obj29;
                arrayList6 = arrayList4;
                it5 = it3;
                hashSet8 = hashSet5;
                obj33 = obj26;
                obj34 = obj27;
                hashSet7 = hashSet4;
            }
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            obj = obj33;
            obj2 = obj34;
            str6 = str3;
            arrayList2 = arrayList6;
            obj3 = obj32;
            obj4 = obj31;
            if (arrayList5 != null) {
                Iterator<d> it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    d next4 = it7.next();
                    if (next4 instanceof e) {
                        next4.a(nVar2.f119y);
                    }
                }
            }
            lVar.d(nVar2.f119y, 0);
            lVar2.d(nVar2.f119y, 100);
            Iterator<String> it8 = nVar2.f119y.keySet().iterator();
            while (it8.hasNext()) {
                String next5 = it8.next();
                if (hashMap2.containsKey(next5) && (num = hashMap2.get(next5)) != null) {
                    i13 = num.intValue();
                } else {
                    i13 = 0;
                }
                Iterator<String> it9 = it8;
                z.c cVar = nVar2.f119y.get(next5);
                if (cVar != null) {
                    cVar.c(i13);
                }
                it8 = it9;
            }
        } else {
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            obj = obj33;
            obj2 = obj34;
            str6 = str3;
            arrayList2 = arrayList6;
            obj3 = obj32;
            obj4 = obj31;
        }
        if (!hashSet6.isEmpty()) {
            if (nVar2.f118x == null) {
                nVar2.f118x = new HashMap<>();
            }
            Iterator<String> it10 = hashSet6.iterator();
            while (it10.hasNext()) {
                String next6 = it10.next();
                if (!nVar2.f118x.containsKey(next6)) {
                    if (next6.startsWith(str44)) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str53 = next6.split(str43)[1];
                        Iterator<d> it11 = arrayList5.iterator();
                        while (it11.hasNext()) {
                            Iterator<String> it12 = it10;
                            d next7 = it11.next();
                            String str54 = str43;
                            HashMap<String, b0.a> hashMap4 = next7.f10d;
                            if (hashMap4 != null && (aVar2 = hashMap4.get(str53)) != null) {
                                sparseArray2.append(next7.f7a, aVar2);
                            }
                            str43 = str54;
                            it10 = it12;
                        }
                        it2 = it10;
                        str22 = str43;
                        d.b bVar4 = new d.b(next6, sparseArray2);
                        obj25 = obj3;
                        obj22 = obj35;
                        str24 = str5;
                        str25 = str44;
                        obj24 = obj4;
                        hashMap = hashMap2;
                        bVar = bVar4;
                        str23 = str;
                    } else {
                        it2 = it10;
                        str22 = str43;
                        switch (next6.hashCode()) {
                            case -1249320806:
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                if (next6.equals(obj23)) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case -1249320805:
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                if (next6.equals(obj21)) {
                                    c13 = 1;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case -1225497657:
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                if (!next6.equals(obj22)) {
                                    obj21 = obj3;
                                    str25 = str44;
                                    obj23 = obj4;
                                    c13 = 65535;
                                    break;
                                } else {
                                    obj21 = obj3;
                                    c13 = 2;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                            case -1225497656:
                                str23 = str;
                                str24 = str5;
                                if (!next6.equals(str24)) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str25 = str44;
                                    obj23 = obj4;
                                    c13 = 65535;
                                    break;
                                } else {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    c13 = 3;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                            case -1225497655:
                                str23 = str;
                                if (!next6.equals(str23)) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str24 = str5;
                                    str25 = str44;
                                    obj23 = obj4;
                                    c13 = 65535;
                                    break;
                                } else {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str24 = str5;
                                    c13 = 4;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                            case -1001078227:
                                if (next6.equals(obj)) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = 5;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals(obj2)) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = 6;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals(str6)) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = 7;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals("rotation")) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = '\b';
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals("elevation")) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = '\t';
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals("transitionPathRotate")) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = '\n';
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    obj21 = obj3;
                                    obj22 = obj35;
                                    str23 = str;
                                    str24 = str5;
                                    c13 = 11;
                                    str25 = str44;
                                    obj23 = obj4;
                                    break;
                                }
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                            default:
                                obj21 = obj3;
                                obj22 = obj35;
                                str23 = str;
                                str24 = str5;
                                str25 = str44;
                                obj23 = obj4;
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                gVar2 = new d.g();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 1:
                                gVar2 = new d.h();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 2:
                                gVar2 = new d.k();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 3:
                                gVar2 = new d.l();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 4:
                                gVar2 = new d.m();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 5:
                                gVar2 = new d.e();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 6:
                                gVar2 = new d.i();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 7:
                                gVar2 = new d.j();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case '\b':
                                gVar2 = new d.f();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case '\t':
                                gVar2 = new d.c();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case '\n':
                                gVar2 = new d.C0666d();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            case 11:
                                gVar2 = new d.a();
                                hashMap = hashMap2;
                                obj24 = obj23;
                                bVar = gVar2;
                                obj25 = obj21;
                                bVar.f36273i = j10;
                                break;
                            default:
                                hashMap = hashMap2;
                                obj24 = obj23;
                                obj25 = obj21;
                                bVar = null;
                                break;
                        }
                    }
                    if (bVar != null) {
                        bVar.f = next6;
                        nVar2.f118x.put(next6, bVar);
                    }
                    str = str23;
                    str5 = str24;
                    hashMap2 = hashMap;
                    str44 = str25;
                    obj4 = obj24;
                    str43 = str22;
                    it10 = it2;
                    obj35 = obj22;
                    obj3 = obj25;
                }
            }
            Object obj38 = obj3;
            Object obj39 = obj35;
            str7 = str;
            str8 = str5;
            str9 = str44;
            Object obj40 = obj4;
            HashMap<String, Integer> hashMap5 = hashMap2;
            if (arrayList5 != null) {
                Iterator<d> it13 = arrayList5.iterator();
                while (it13.hasNext()) {
                    d next8 = it13.next();
                    if (next8 instanceof j) {
                        j jVar2 = (j) next8;
                        HashMap<String, z.d> hashMap6 = nVar2.f118x;
                        jVar2.getClass();
                        Iterator<String> it14 = hashMap6.keySet().iterator();
                        while (it14.hasNext()) {
                            Iterator<d> it15 = it13;
                            String next9 = it14.next();
                            z.d dVar = hashMap6.get(next9);
                            if (dVar == null) {
                                it13 = it15;
                            } else {
                                HashMap<String, z.d> hashMap7 = hashMap6;
                                if (next9.startsWith("CUSTOM")) {
                                    b0.a aVar4 = jVar2.f10d.get(next9.substring(7));
                                    if (aVar4 != null) {
                                        d.b bVar5 = (d.b) dVar;
                                        Iterator<String> it16 = it14;
                                        int i18 = jVar2.f7a;
                                        ArrayList<d> arrayList9 = arrayList5;
                                        float f11 = jVar2.f68s;
                                        int i19 = jVar2.r;
                                        Object obj41 = obj39;
                                        float f12 = jVar2.f69t;
                                        bVar5.f39107l.append(i18, aVar4);
                                        bVar5.f39108m.append(i18, new float[]{f11, f12});
                                        bVar5.f36267b = Math.max(bVar5.f36267b, i19);
                                        it13 = it15;
                                        it14 = it16;
                                        hashMap6 = hashMap7;
                                        arrayList5 = arrayList9;
                                        obj39 = obj41;
                                        jVar2 = jVar2;
                                    } else {
                                        it13 = it15;
                                        hashMap6 = hashMap7;
                                    }
                                } else {
                                    j jVar3 = jVar2;
                                    ArrayList<d> arrayList10 = arrayList5;
                                    Object obj42 = obj39;
                                    Iterator<String> it17 = it14;
                                    switch (next9.hashCode()) {
                                        case -1249320806:
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            if (next9.equals(obj17)) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1249320805:
                                            obj16 = obj38;
                                            obj18 = obj42;
                                            if (next9.equals(obj16)) {
                                                obj17 = obj40;
                                                c12 = 1;
                                                break;
                                            }
                                            obj17 = obj40;
                                            c12 = 65535;
                                            break;
                                        case -1225497657:
                                            obj18 = obj42;
                                            if (!next9.equals(obj18)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                c12 = 65535;
                                                break;
                                            } else {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                c12 = 2;
                                                break;
                                            }
                                        case -1225497656:
                                            if (next9.equals(str8)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 3;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -1225497655:
                                            if (next9.equals(str7)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 4;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -1001078227:
                                            if (next9.equals(obj)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 5;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -908189618:
                                            if (next9.equals(obj2)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 6;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -908189617:
                                            if (next9.equals(str6)) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 7;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -40300674:
                                            if (next9.equals("rotation")) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = '\b';
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case -4379043:
                                            if (next9.equals("elevation")) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = '\t';
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case 37232917:
                                            if (next9.equals("transitionPathRotate")) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = '\n';
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        case 92909918:
                                            if (next9.equals("alpha")) {
                                                obj16 = obj38;
                                                obj17 = obj40;
                                                obj18 = obj42;
                                                c12 = 11;
                                                break;
                                            }
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                        default:
                                            obj16 = obj38;
                                            obj17 = obj40;
                                            obj18 = obj42;
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f59i)) {
                                                dVar.b(jVar.f59i, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f60j)) {
                                                dVar.b(jVar.f60j, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f64n)) {
                                                dVar.b(jVar.f64n, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f65o)) {
                                                dVar.b(jVar.f65o, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 4:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f66p)) {
                                                dVar.b(jVar.f66p, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f67q)) {
                                                dVar.b(jVar.f67q, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f62l)) {
                                                dVar.b(jVar.f62l, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f63m)) {
                                                dVar.b(jVar.f63m, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case '\b':
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f58h)) {
                                                dVar.b(jVar.f58h, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case '\t':
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f57g)) {
                                                dVar.b(jVar.f57g, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case '\n':
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f61k)) {
                                                dVar.b(jVar.f61k, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            jVar = jVar3;
                                            if (!Float.isNaN(jVar.f)) {
                                                obj20 = obj17;
                                                obj19 = obj16;
                                                dVar.b(jVar.f, jVar.f68s, jVar.f69t, jVar.f7a, jVar.r);
                                                break;
                                            } else {
                                                obj19 = obj16;
                                                obj20 = obj17;
                                                break;
                                            }
                                        default:
                                            obj19 = obj16;
                                            obj20 = obj17;
                                            jVar = jVar3;
                                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next9 + "\"");
                                            break;
                                    }
                                    it13 = it15;
                                    it14 = it17;
                                    jVar2 = jVar;
                                    hashMap6 = hashMap7;
                                    arrayList5 = arrayList10;
                                    obj39 = obj18;
                                    Object obj43 = obj19;
                                    obj40 = obj20;
                                    obj38 = obj43;
                                }
                            }
                        }
                    }
                    it13 = it13;
                    obj39 = obj39;
                    arrayList5 = arrayList5;
                    nVar2 = this;
                    obj40 = obj40;
                    obj38 = obj38;
                }
            }
            arrayList3 = arrayList5;
            obj6 = obj39;
            Object obj44 = obj40;
            obj7 = obj38;
            obj5 = obj44;
            nVar = this;
            for (String str55 : nVar.f118x.keySet()) {
                HashMap<String, Integer> hashMap8 = hashMap5;
                if (hashMap8.containsKey(str55)) {
                    i12 = hashMap8.get(str55).intValue();
                } else {
                    i12 = 0;
                }
                nVar.f118x.get(str55).c(i12);
                hashMap5 = hashMap8;
            }
        } else {
            nVar = nVar2;
            arrayList3 = arrayList5;
            obj5 = obj4;
            obj6 = obj35;
            str7 = str;
            str8 = str5;
            obj7 = obj3;
            str9 = "CUSTOM,";
        }
        int size = arrayList2.size() + 2;
        q[] qVarArr = new q[size];
        qVarArr[0] = qVar4;
        q qVar6 = nVar.f102g;
        qVarArr[size - 1] = qVar6;
        if (arrayList2.size() > 0) {
            obj8 = obj6;
            if (nVar.f101e == -1) {
                nVar.f101e = 0;
            }
        } else {
            obj8 = obj6;
        }
        Iterator<q> it18 = arrayList2.iterator();
        int i20 = 1;
        while (it18.hasNext()) {
            qVarArr[i20] = it18.next();
            i20++;
        }
        HashSet hashSet11 = new HashSet();
        Iterator<String> it19 = qVar6.H.keySet().iterator();
        while (it19.hasNext()) {
            String next10 = it19.next();
            Iterator<String> it20 = it19;
            q qVar7 = qVar4;
            if (qVar7.H.containsKey(next10)) {
                qVar4 = qVar7;
                hashSet3 = hashSet;
                if (!hashSet3.contains(str9 + next10)) {
                    hashSet11.add(next10);
                }
            } else {
                qVar4 = qVar7;
                hashSet3 = hashSet;
            }
            it19 = it20;
            hashSet = hashSet3;
        }
        String[] strArr = (String[]) hashSet11.toArray(new String[0]);
        nVar.r = strArr;
        nVar.f113s = new int[strArr.length];
        int i21 = 0;
        while (true) {
            String[] strArr2 = nVar.r;
            if (i21 < strArr2.length) {
                String str56 = strArr2[i21];
                nVar.f113s[i21] = 0;
                int i22 = 0;
                while (true) {
                    if (i22 >= size) {
                        break;
                    } else if (qVarArr[i22].H.containsKey(str56) && (aVar = qVarArr[i22].H.get(str56)) != null) {
                        int[] iArr = nVar.f113s;
                        iArr[i21] = aVar.c() + iArr[i21];
                    } else {
                        i22++;
                    }
                }
                i21++;
            } else {
                if (qVarArr[0].D != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i23 = 1;
                while (i23 < size) {
                    String str57 = str8;
                    q qVar8 = qVarArr[i23];
                    String str58 = str7;
                    q qVar9 = qVarArr[i23 - 1];
                    Object obj45 = obj;
                    boolean f13 = q.f(qVar8.f125y, qVar9.f125y);
                    String str59 = str6;
                    boolean f14 = q.f(qVar8.f126z, qVar9.f126z);
                    zArr[0] = q.f(qVar8.f124x, qVar9.f124x) | zArr[0];
                    boolean z12 = f13 | f14 | z10;
                    zArr[1] = zArr[1] | z12;
                    zArr[2] = z12 | zArr[2];
                    zArr[3] = zArr[3] | q.f(qVar8.A, qVar9.A);
                    zArr[4] = q.f(qVar8.B, qVar9.B) | zArr[4];
                    i23++;
                    obj2 = obj2;
                    obj = obj45;
                    str35 = str35;
                    str7 = str58;
                    str8 = str57;
                    str34 = str34;
                    str6 = str59;
                }
                String str60 = str7;
                Object obj46 = obj;
                String str61 = str6;
                String str62 = str8;
                String str63 = str34;
                String str64 = str35;
                Object obj47 = obj2;
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        i24++;
                    }
                }
                nVar.f110o = new int[i24];
                int max = Math.max(2, i24);
                nVar.f111p = new double[max];
                nVar.f112q = new double[max];
                int i26 = 0;
                for (int i27 = 1; i27 < length; i27++) {
                    if (zArr[i27]) {
                        nVar.f110o[i26] = i27;
                        i26++;
                    }
                }
                double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, size, nVar.f110o.length);
                double[] dArr4 = new double[size];
                for (int i28 = 0; i28 < size; i28++) {
                    q qVar10 = qVarArr[i28];
                    double[] dArr5 = dArr3[i28];
                    int[] iArr2 = nVar.f110o;
                    float[] fArr2 = {qVar10.f124x, qVar10.f125y, qVar10.f126z, qVar10.A, qVar10.B, qVar10.C};
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < iArr2.length) {
                        if (iArr2[i29] < 6) {
                            fArr = fArr2;
                            dArr5[i30] = fArr2[i11];
                            i30++;
                        } else {
                            fArr = fArr2;
                        }
                        i29++;
                        fArr2 = fArr;
                    }
                    dArr4[i28] = qVarArr[i28].f123w;
                }
                int i31 = 0;
                while (true) {
                    int[] iArr3 = nVar.f110o;
                    if (i31 < iArr3.length) {
                        if (iArr3[i31] < 6) {
                            String b10 = b0.b(new StringBuilder(), q.L[nVar.f110o[i31]], " [");
                            for (int i32 = 0; i32 < size; i32++) {
                                StringBuilder c15 = v.h.c(b10);
                                c15.append(dArr3[i32][i31]);
                                b10 = c15.toString();
                            }
                        }
                        i31++;
                    } else {
                        nVar.f105j = new w.b[nVar.r.length + 1];
                        int i33 = 0;
                        while (true) {
                            String[] strArr3 = nVar.r;
                            if (i33 < strArr3.length) {
                                String str65 = strArr3[i33];
                                int i34 = 0;
                                int i35 = 0;
                                double[] dArr6 = null;
                                double[][] dArr7 = null;
                                while (i34 < size) {
                                    if (qVarArr[i34].H.containsKey(str65)) {
                                        if (dArr7 == null) {
                                            dArr6 = new double[size];
                                            b0.a aVar5 = qVarArr[i34].H.get(str65);
                                            if (aVar5 == null) {
                                                c11 = 0;
                                            } else {
                                                c11 = aVar5.c();
                                            }
                                            dArr7 = (double[][]) Array.newInstance(Double.TYPE, size, c11);
                                        }
                                        q qVar11 = qVarArr[i34];
                                        dArr6[i35] = qVar11.f123w;
                                        double[] dArr8 = dArr7[i35];
                                        b0.a aVar6 = qVar11.H.get(str65);
                                        if (aVar6 == null) {
                                            str20 = str65;
                                            str21 = str33;
                                            dArr = dArr6;
                                            dArr2 = dArr7;
                                        } else {
                                            str20 = str65;
                                            if (aVar6.c() == 1) {
                                                dArr = dArr6;
                                                dArr2 = dArr7;
                                                dArr8[0] = aVar6.a();
                                            } else {
                                                dArr = dArr6;
                                                dArr2 = dArr7;
                                                int c16 = aVar6.c();
                                                float[] fArr3 = new float[c16];
                                                aVar6.b(fArr3);
                                                int i36 = 0;
                                                int i37 = 0;
                                                while (i36 < c16) {
                                                    dArr8[i37] = fArr3[i36];
                                                    i36++;
                                                    c16 = c16;
                                                    i37++;
                                                    str33 = str33;
                                                    fArr3 = fArr3;
                                                }
                                            }
                                            str21 = str33;
                                        }
                                        i35++;
                                        dArr6 = dArr;
                                        dArr7 = dArr2;
                                    } else {
                                        str20 = str65;
                                        str21 = str33;
                                    }
                                    i34++;
                                    str65 = str20;
                                    str33 = str21;
                                }
                                i33++;
                                nVar.f105j[i33] = w.b.a(nVar.f101e, Arrays.copyOf(dArr6, i35), (double[][]) Arrays.copyOf(dArr7, i35));
                                str33 = str33;
                            } else {
                                String str66 = str33;
                                nVar.f105j[0] = w.b.a(nVar.f101e, dArr4, dArr3);
                                if (qVarArr[0].D != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr9 = new double[size];
                                    double[][] dArr10 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
                                    for (int i38 = 0; i38 < size; i38++) {
                                        iArr4[i38] = qVarArr[i38].D;
                                        dArr9[i38] = qVar2.f123w;
                                        double[] dArr11 = dArr10[i38];
                                        dArr11[0] = qVar2.f125y;
                                        dArr11[1] = qVar2.f126z;
                                    }
                                    nVar.f106k = new w.a(iArr4, dArr9, dArr10);
                                }
                                nVar.f120z = new HashMap<>();
                                if (arrayList3 != null) {
                                    Iterator<String> it21 = hashSet2.iterator();
                                    float f15 = Float.NaN;
                                    while (it21.hasNext()) {
                                        String next11 = it21.next();
                                        if (next11.startsWith("CUSTOM")) {
                                            it = it21;
                                            c0664b = new b.C0664b();
                                            obj9 = obj5;
                                            obj10 = obj47;
                                            obj11 = obj46;
                                            obj12 = obj7;
                                            str10 = str64;
                                            str11 = str66;
                                            obj13 = obj8;
                                            str12 = str60;
                                            str13 = str62;
                                            str14 = str63;
                                            str15 = str61;
                                        } else {
                                            switch (next11.hashCode()) {
                                                case -1249320806:
                                                    obj9 = obj5;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    obj12 = obj7;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (next11.equals(obj9)) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -1249320805:
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    obj12 = obj7;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (!next11.equals(obj12)) {
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    } else {
                                                        obj9 = obj5;
                                                        c10 = 1;
                                                        break;
                                                    }
                                                case -1225497657:
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (!next11.equals(obj13)) {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        c10 = 65535;
                                                        break;
                                                    } else {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        c10 = 2;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (!next11.equals(str13)) {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        c10 = 65535;
                                                        break;
                                                    } else {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        c10 = 3;
                                                        break;
                                                    }
                                                case -1225497655:
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str12 = str60;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (next11.equals(str12)) {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str13 = str62;
                                                        c10 = 4;
                                                        break;
                                                    }
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -1001078227:
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (next11.equals(obj11)) {
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        c10 = 5;
                                                        break;
                                                    }
                                                    str12 = str60;
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -908189618:
                                                    obj10 = obj47;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (next11.equals(obj10)) {
                                                        obj9 = obj5;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        c10 = 6;
                                                        break;
                                                    }
                                                    obj11 = obj46;
                                                    str12 = str60;
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -908189617:
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    if (next11.equals(str15)) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        c10 = 7;
                                                        break;
                                                    }
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str12 = str60;
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -797520672:
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str14 = str63;
                                                    if (next11.equals("waveVariesBy")) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str15 = str61;
                                                        c10 = '\b';
                                                        break;
                                                    }
                                                    str15 = str61;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str12 = str60;
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -40300674:
                                                    str10 = str64;
                                                    str11 = str66;
                                                    str14 = str63;
                                                    if (next11.equals(str10)) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str15 = str61;
                                                        c10 = '\t';
                                                        break;
                                                    }
                                                    str15 = str61;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    str12 = str60;
                                                    obj9 = obj5;
                                                    obj12 = obj7;
                                                    obj13 = obj8;
                                                    str13 = str62;
                                                    c10 = 65535;
                                                    break;
                                                case -4379043:
                                                    str11 = str66;
                                                    str14 = str63;
                                                    if (!next11.equals(str14)) {
                                                        str10 = str64;
                                                        str15 = str61;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        str12 = str60;
                                                        obj9 = obj5;
                                                        obj12 = obj7;
                                                        obj13 = obj8;
                                                        str13 = str62;
                                                        c10 = 65535;
                                                        break;
                                                    } else {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        str10 = str64;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str15 = str61;
                                                        c10 = '\n';
                                                        break;
                                                    }
                                                case 37232917:
                                                    str11 = str66;
                                                    if (next11.equals("transitionPathRotate")) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        str10 = str64;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str14 = str63;
                                                        str15 = str61;
                                                        c10 = 11;
                                                        break;
                                                    }
                                                    obj9 = obj5;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    obj12 = obj7;
                                                    str10 = str64;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    c10 = 65535;
                                                    break;
                                                case 92909918:
                                                    str11 = str66;
                                                    if (next11.equals(str11)) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        str10 = str64;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str14 = str63;
                                                        str15 = str61;
                                                        c10 = '\f';
                                                        break;
                                                    }
                                                    obj9 = obj5;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    obj12 = obj7;
                                                    str10 = str64;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    c10 = 65535;
                                                    break;
                                                case 156108012:
                                                    if (next11.equals("waveOffset")) {
                                                        obj9 = obj5;
                                                        obj10 = obj47;
                                                        obj11 = obj46;
                                                        obj12 = obj7;
                                                        str10 = str64;
                                                        str11 = str66;
                                                        obj13 = obj8;
                                                        str12 = str60;
                                                        str13 = str62;
                                                        str14 = str63;
                                                        str15 = str61;
                                                        c10 = '\r';
                                                        break;
                                                    }
                                                default:
                                                    obj9 = obj5;
                                                    obj10 = obj47;
                                                    obj11 = obj46;
                                                    obj12 = obj7;
                                                    str10 = str64;
                                                    str11 = str66;
                                                    obj13 = obj8;
                                                    str12 = str60;
                                                    str13 = str62;
                                                    str14 = str63;
                                                    str15 = str61;
                                                    c10 = 65535;
                                                    break;
                                            }
                                            switch (c10) {
                                                case 0:
                                                    gVar = new b.g();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 1:
                                                    gVar = new b.h();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 2:
                                                    gVar = new b.k();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 3:
                                                    gVar = new b.l();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 4:
                                                    gVar = new b.m();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 5:
                                                    gVar = new b.e();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 6:
                                                    gVar = new b.i();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 7:
                                                    gVar = new b.j();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case '\b':
                                                    gVar = new b.a();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case '\t':
                                                    gVar = new b.f();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case '\n':
                                                    gVar = new b.c();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case 11:
                                                    gVar = new b.d();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case '\f':
                                                    gVar = new b.a();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                case '\r':
                                                    gVar = new b.a();
                                                    it = it21;
                                                    c0664b = gVar;
                                                    break;
                                                default:
                                                    it = it21;
                                                    c0664b = null;
                                                    break;
                                            }
                                        }
                                        if (c0664b == null) {
                                            str66 = str11;
                                            str63 = str14;
                                            str16 = str10;
                                            str17 = str15;
                                            obj14 = obj10;
                                            obj15 = obj11;
                                            str18 = str12;
                                            qVar = qVar4;
                                        } else {
                                            str66 = str11;
                                            str63 = str14;
                                            if (c0664b.f36213e == 1) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11 && Float.isNaN(f15)) {
                                                float[] fArr4 = new float[2];
                                                float f16 = 1.0f / 99;
                                                double d11 = 0.0d;
                                                float f17 = 0.0f;
                                                str16 = str10;
                                                str17 = str15;
                                                double d12 = 0.0d;
                                                int i39 = 0;
                                                while (i39 < 100) {
                                                    float f18 = i39 * f16;
                                                    Object obj48 = obj10;
                                                    Object obj49 = obj11;
                                                    double d13 = f18;
                                                    float f19 = f16;
                                                    q qVar12 = qVar4;
                                                    w.c cVar2 = qVar12.f121u;
                                                    Iterator<q> it22 = arrayList2.iterator();
                                                    float f20 = Float.NaN;
                                                    float f21 = 0.0f;
                                                    while (it22.hasNext()) {
                                                        q qVar13 = qVar12;
                                                        q next12 = it22.next();
                                                        Iterator<q> it23 = it22;
                                                        w.c cVar3 = next12.f121u;
                                                        if (cVar3 != null) {
                                                            float f22 = next12.f123w;
                                                            if (f22 < f18) {
                                                                f21 = f22;
                                                                cVar2 = cVar3;
                                                            } else if (Float.isNaN(f20)) {
                                                                f20 = next12.f123w;
                                                            }
                                                        }
                                                        it22 = it23;
                                                        qVar12 = qVar13;
                                                    }
                                                    q qVar14 = qVar12;
                                                    if (cVar2 != null) {
                                                        if (Float.isNaN(f20)) {
                                                            f20 = 1.0f;
                                                        }
                                                        str19 = str12;
                                                        d10 = (((float) cVar2.a((f18 - f21) / f)) * (f20 - f21)) + f21;
                                                    } else {
                                                        str19 = str12;
                                                        d10 = d13;
                                                    }
                                                    nVar.f105j[0].c(d10, nVar.f111p);
                                                    String str67 = str19;
                                                    nVar.f.h(d10, nVar.f110o, nVar.f111p, fArr4, 0);
                                                    if (i39 > 0) {
                                                        f17 = (float) (Math.hypot(d11 - fArr4[1], d12 - fArr4[0]) + f17);
                                                    }
                                                    i39++;
                                                    f16 = f19;
                                                    d12 = fArr4[0];
                                                    d11 = fArr4[1];
                                                    obj10 = obj48;
                                                    obj11 = obj49;
                                                    qVar4 = qVar14;
                                                    str12 = str67;
                                                }
                                                obj14 = obj10;
                                                obj15 = obj11;
                                                str18 = str12;
                                                qVar = qVar4;
                                                f15 = f17;
                                            } else {
                                                str16 = str10;
                                                str17 = str15;
                                                obj14 = obj10;
                                                obj15 = obj11;
                                                str18 = str12;
                                                qVar = qVar4;
                                            }
                                            c0664b.f36210b = next11;
                                            nVar.f120z.put(next11, c0664b);
                                        }
                                        it21 = it;
                                        obj7 = obj12;
                                        obj5 = obj9;
                                        str64 = str16;
                                        str61 = str17;
                                        obj47 = obj14;
                                        obj46 = obj15;
                                        qVar4 = qVar;
                                        str60 = str18;
                                        str62 = str13;
                                        obj8 = obj13;
                                    }
                                    Iterator<d> it24 = arrayList3.iterator();
                                    while (it24.hasNext()) {
                                        d next13 = it24.next();
                                        if (next13 instanceof f) {
                                            ((f) next13).g(nVar.f120z);
                                        }
                                    }
                                    for (z.b bVar6 : nVar.f120z.values()) {
                                        bVar6.c();
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        q qVar = this.f;
        sb2.append(qVar.f125y);
        sb2.append(" y: ");
        sb2.append(qVar.f126z);
        sb2.append(" end: x: ");
        q qVar2 = this.f102g;
        sb2.append(qVar2.f125y);
        sb2.append(" y: ");
        sb2.append(qVar2.f126z);
        return sb2.toString();
    }
}
