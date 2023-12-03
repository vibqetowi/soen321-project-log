package androidx.constraintlayout.motion.widget;

import a0.k;
import a0.m;
import a0.n;
import a0.o;
import a0.p;
import a0.q;
import a0.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import androidx.core.widget.NestedScrollView;
import b0.b;
import b0.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t0.r;
import x.e;
import x.j;
import x.l;
import y.b;
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements r {
    public static boolean Y0;
    public float A0;
    public int B0;
    public float C0;
    public boolean D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public androidx.constraintlayout.motion.widget.a K;
    public float K0;
    public p L;
    public final w.d L0;
    public Interpolator M;
    public boolean M0;
    public float N;
    public g N0;
    public int O;
    public Runnable O0;
    public int P;
    public final Rect P0;
    public int Q;
    public boolean Q0;
    public int R;
    public i R0;
    public int S;
    public final e S0;
    public boolean T;
    public boolean T0;
    public final HashMap<View, n> U;
    public final RectF U0;
    public long V;
    public View V0;
    public float W;
    public Matrix W0;
    public final ArrayList<Integer> X0;

    /* renamed from: a0  reason: collision with root package name */
    public float f1593a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f1594b0;
    public long c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f1595d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1596f0;

    /* renamed from: g0  reason: collision with root package name */
    public h f1597g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1598h0;

    /* renamed from: i0  reason: collision with root package name */
    public d f1599i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1600j0;

    /* renamed from: k0  reason: collision with root package name */
    public final z.a f1601k0;

    /* renamed from: l0  reason: collision with root package name */
    public final c f1602l0;

    /* renamed from: m0  reason: collision with root package name */
    public a0.b f1603m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f1604n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1605o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f1606p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f1607q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f1608r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f1609s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f1610t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1611u0;

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList<o> f1612v0;

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList<o> f1613w0;

    /* renamed from: x0  reason: collision with root package name */
    public CopyOnWriteArrayList<h> f1614x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f1615y0;

    /* renamed from: z0  reason: collision with root package name */
    public long f1616z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ View f1617u;

        public a(View view) {
            this.f1617u = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f1617u.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.N0.a();
        }
    }

    /* loaded from: classes.dex */
    public class c extends p {

        /* renamed from: a  reason: collision with root package name */
        public float f1619a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1620b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1621c;

        public c() {
        }

        @Override // a0.p
        public final float a() {
            return MotionLayout.this.N;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.f1619a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > 0.0f) {
                float f10 = this.f1621c;
                if (f2 / f10 < f) {
                    f = f2 / f10;
                }
                motionLayout.N = f2 - (f10 * f);
                return ((f2 * f) - (((f10 * f) * f) / 2.0f)) + this.f1620b;
            }
            float f11 = this.f1621c;
            if ((-f2) / f11 < f) {
                f = (-f2) / f11;
            }
            motionLayout.N = (f11 * f) + f2;
            return (((f11 * f) * f) / 2.0f) + (f2 * f) + this.f1620b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1623a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1624b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f1625c;

        /* renamed from: d  reason: collision with root package name */
        public Path f1626d;

        /* renamed from: e  reason: collision with root package name */
        public final Paint f1627e;
        public final Paint f;

        /* renamed from: g  reason: collision with root package name */
        public final Paint f1628g;

        /* renamed from: h  reason: collision with root package name */
        public final Paint f1629h;

        /* renamed from: i  reason: collision with root package name */
        public final Paint f1630i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f1631j;

        /* renamed from: k  reason: collision with root package name */
        public int f1632k;

        /* renamed from: l  reason: collision with root package name */
        public final Rect f1633l = new Rect();

        /* renamed from: m  reason: collision with root package name */
        public final int f1634m = 1;

        public d() {
            Paint paint = new Paint();
            this.f1627e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1628g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1629h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1631j = new float[8];
            Paint paint5 = new Paint();
            this.f1630i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f1625c = new float[100];
            this.f1624b = new int[50];
        }

        public final void a(Canvas canvas, int i6, int i10, n nVar) {
            int i11;
            int i12;
            Paint paint;
            float f;
            float f2;
            int i13;
            Paint paint2 = this.f1628g;
            int[] iArr = this.f1624b;
            int i14 = 4;
            if (i6 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i15 = 0; i15 < this.f1632k; i15++) {
                    int i16 = iArr[i15];
                    if (i16 == 1) {
                        z10 = true;
                    }
                    if (i16 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f1623a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint2);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i6 == 2) {
                float[] fArr2 = this.f1623a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint2);
            }
            if (i6 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f1623a, this.f1627e);
            View view = nVar.f98b;
            if (view != null) {
                i11 = view.getWidth();
                i12 = nVar.f98b.getHeight();
            } else {
                i11 = 0;
                i12 = 0;
            }
            int i17 = 1;
            while (i17 < i10 - 1) {
                if (i6 == i14 && iArr[i17 - 1] == 0) {
                    i13 = i17;
                } else {
                    int i18 = i17 * 2;
                    float[] fArr3 = this.f1625c;
                    float f10 = fArr3[i18];
                    float f11 = fArr3[i18 + 1];
                    this.f1626d.reset();
                    this.f1626d.moveTo(f10, f11 + 10.0f);
                    this.f1626d.lineTo(f10 + 10.0f, f11);
                    this.f1626d.lineTo(f10, f11 - 10.0f);
                    this.f1626d.lineTo(f10 - 10.0f, f11);
                    this.f1626d.close();
                    int i19 = i17 - 1;
                    nVar.f115u.get(i19);
                    Paint paint3 = this.f1630i;
                    if (i6 == i14) {
                        int i20 = iArr[i19];
                        if (i20 == 1) {
                            d(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i20 == 0) {
                            c(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i20 == 2) {
                            paint = paint3;
                            f = f11;
                            f2 = f10;
                            i13 = i17;
                            e(canvas, f10 - 0.0f, f11 - 0.0f, i11, i12);
                            canvas.drawPath(this.f1626d, paint);
                        }
                        paint = paint3;
                        f = f11;
                        f2 = f10;
                        i13 = i17;
                        canvas.drawPath(this.f1626d, paint);
                    } else {
                        paint = paint3;
                        f = f11;
                        f2 = f10;
                        i13 = i17;
                    }
                    if (i6 == 2) {
                        d(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i6 == 3) {
                        c(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i6 == 6) {
                        e(canvas, f2 - 0.0f, f - 0.0f, i11, i12);
                    }
                    canvas.drawPath(this.f1626d, paint);
                }
                i17 = i13 + 1;
                i14 = 4;
            }
            float[] fArr4 = this.f1623a;
            if (fArr4.length > 1) {
                float f12 = fArr4[0];
                float f13 = fArr4[1];
                Paint paint4 = this.f;
                canvas.drawCircle(f12, f13, 8.0f, paint4);
                float[] fArr5 = this.f1623a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint4);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f1623a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            float min = Math.min(f, f10);
            float max = Math.max(f2, f11);
            float max2 = Math.max(f, f10);
            float max3 = Math.max(f2, f11);
            Paint paint = this.f1628g;
            canvas.drawLine(min, max, max2, max3, paint);
            canvas.drawLine(Math.min(f, f10), Math.min(f2, f11), Math.min(f, f10), Math.max(f2, f11), paint);
        }

        public final void c(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1623a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float min = Math.min(f10, f12);
            float max = Math.max(f11, f13);
            float min2 = f - Math.min(f10, f12);
            float max2 = Math.max(f11, f13) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f12 - f10)) + 0.5d)) / 100.0f);
            Paint paint = this.f1629h;
            f(paint, str);
            Rect rect = this.f1633l;
            canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f2 - 20.0f, paint);
            float min3 = Math.min(f10, f12);
            Paint paint2 = this.f1628g;
            canvas.drawLine(f, f2, min3, f2, paint2);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f13 - f11)) + 0.5d)) / 100.0f);
            f(paint, str2);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f11, f13), paint2);
        }

        public final void d(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1623a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f10 - f12, f11 - f13);
            float f14 = f12 - f10;
            float f15 = f13 - f11;
            float f16 = (((f2 - f11) * f15) + ((f - f10) * f14)) / (hypot * hypot);
            float f17 = f10 + (f14 * f16);
            float f18 = f11 + (f16 * f15);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f17, f18);
            float hypot2 = (float) Math.hypot(f17 - f, f18 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            Paint paint = this.f1629h;
            f(paint, str);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f1633l.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f17, f18, this.f1628g);
        }

        public final void e(Canvas canvas, float f, float f2, int i6, int i10) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) ((((f - (i6 / 2)) * 100.0f) / (motionLayout.getWidth() - i6)) + 0.5d)) / 100.0f);
            String sb3 = sb2.toString();
            Paint paint = this.f1629h;
            f(paint, sb3);
            Rect rect = this.f1633l;
            canvas.drawText(sb3, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
            float min = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f1628g;
            canvas.drawLine(f, f2, min, f2, paint2);
            String str = "" + (((int) ((((f2 - (i10 / 2)) * 100.0f) / (motionLayout.getHeight() - i10)) + 0.5d)) / 100.0f);
            f(paint, str);
            canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
        }

        public final void f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f1633l);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public x.f f1636a = new x.f();

        /* renamed from: b  reason: collision with root package name */
        public x.f f1637b = new x.f();

        /* renamed from: c  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f1638c = null;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f1639d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1640e;
        public int f;

        public e() {
        }

        public static void c(x.f fVar, x.f fVar2) {
            x.e eVar;
            ArrayList<x.e> arrayList = fVar.f37443w0;
            HashMap<x.e, x.e> hashMap = new HashMap<>();
            hashMap.put(fVar, fVar2);
            fVar2.f37443w0.clear();
            fVar2.j(fVar, hashMap);
            Iterator<x.e> it = arrayList.iterator();
            while (it.hasNext()) {
                x.e next = it.next();
                if (next instanceof x.a) {
                    eVar = new x.a();
                } else if (next instanceof x.h) {
                    eVar = new x.h();
                } else if (next instanceof x.g) {
                    eVar = new x.g();
                } else if (next instanceof l) {
                    eVar = new l();
                } else if (next instanceof x.i) {
                    eVar = new j();
                } else {
                    eVar = new x.e();
                }
                fVar2.f37443w0.add(eVar);
                x.e eVar2 = eVar.W;
                if (eVar2 != null) {
                    ((x.n) eVar2).f37443w0.remove(eVar);
                    eVar.G();
                }
                eVar.W = fVar2;
                hashMap.put(next, eVar);
            }
            Iterator<x.e> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                x.e next2 = it2.next();
                hashMap.get(next2).j(next2, hashMap);
            }
        }

        public static x.e d(x.f fVar, View view) {
            if (fVar.f37374i0 == view) {
                return fVar;
            }
            ArrayList<x.e> arrayList = fVar.f37443w0;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                x.e eVar = arrayList.get(i6);
                if (eVar.f37374i0 == view) {
                    return eVar;
                }
            }
            return null;
        }

        public final void a() {
            int i6;
            HashMap<View, n> hashMap;
            SparseArray sparseArray;
            int[] iArr;
            int i10;
            Rect rect;
            Rect rect2;
            Interpolator loadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap<View, n> hashMap2 = motionLayout.U;
            hashMap2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout.getChildAt(i11);
                n nVar = new n(childAt);
                int id2 = childAt.getId();
                iArr2[i11] = id2;
                sparseArray2.put(id2, nVar);
                hashMap2.put(childAt, nVar);
            }
            int i12 = 0;
            while (i12 < childCount) {
                View childAt2 = motionLayout.getChildAt(i12);
                n nVar2 = hashMap2.get(childAt2);
                if (nVar2 == null) {
                    i6 = childCount;
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i10 = i12;
                } else {
                    androidx.constraintlayout.widget.b bVar = this.f1638c;
                    Rect rect3 = nVar2.f97a;
                    if (bVar != null) {
                        x.e d10 = d(this.f1636a, childAt2);
                        if (d10 != null) {
                            Rect l2 = MotionLayout.l(motionLayout, d10);
                            androidx.constraintlayout.widget.b bVar2 = this.f1638c;
                            hashMap = hashMap2;
                            int width = motionLayout.getWidth();
                            sparseArray = sparseArray2;
                            int height = motionLayout.getHeight();
                            iArr = iArr2;
                            int i13 = bVar2.f1816c;
                            if (i13 != 0) {
                                n.e(l2, rect3, i13, width, height);
                            }
                            q qVar = nVar2.f;
                            qVar.f123w = 0.0f;
                            qVar.f124x = 0.0f;
                            nVar2.d(qVar);
                            i6 = childCount;
                            i10 = i12;
                            rect = rect3;
                            qVar.i(l2.left, l2.top, l2.width(), l2.height());
                            b.a k10 = bVar2.k(nVar2.f99c);
                            qVar.d(k10);
                            b.c cVar = k10.f1822d;
                            nVar2.f107l = cVar.f1882g;
                            nVar2.f103h.h(l2, bVar2, i13, nVar2.f99c);
                            nVar2.C = k10.f.f1902i;
                            nVar2.E = cVar.f1885j;
                            nVar2.F = cVar.f1884i;
                            Context context = nVar2.f98b.getContext();
                            int i14 = cVar.f1887l;
                            String str = cVar.f1886k;
                            int i15 = cVar.f1888m;
                            if (i14 != -2) {
                                if (i14 != -1) {
                                    if (i14 != 0) {
                                        if (i14 != 1) {
                                            if (i14 != 2) {
                                                if (i14 != 4) {
                                                    if (i14 != 5) {
                                                        loadInterpolator = null;
                                                    } else {
                                                        loadInterpolator = new OvershootInterpolator();
                                                    }
                                                } else {
                                                    loadInterpolator = new BounceInterpolator();
                                                }
                                            } else {
                                                loadInterpolator = new DecelerateInterpolator();
                                            }
                                        } else {
                                            loadInterpolator = new AccelerateInterpolator();
                                        }
                                    } else {
                                        loadInterpolator = new AccelerateDecelerateInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new m(w.c.c(str));
                                }
                            } else {
                                loadInterpolator = AnimationUtils.loadInterpolator(context, i15);
                            }
                            nVar2.G = loadInterpolator;
                        } else {
                            i6 = childCount;
                            hashMap = hashMap2;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i10 = i12;
                            rect = rect3;
                            if (motionLayout.f1598h0 != 0) {
                                Log.e("MotionLayout", a0.a.b() + "no widget for  " + a0.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i6 = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i10 = i12;
                        rect = rect3;
                    }
                    if (this.f1639d != null) {
                        x.e d11 = d(this.f1637b, childAt2);
                        if (d11 != null) {
                            Rect l10 = MotionLayout.l(motionLayout, d11);
                            androidx.constraintlayout.widget.b bVar3 = this.f1639d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i16 = bVar3.f1816c;
                            if (i16 != 0) {
                                Rect rect4 = rect;
                                n.e(l10, rect4, i16, width2, height2);
                                rect2 = rect4;
                            } else {
                                rect2 = l10;
                            }
                            q qVar2 = nVar2.f102g;
                            qVar2.f123w = 1.0f;
                            qVar2.f124x = 1.0f;
                            nVar2.d(qVar2);
                            qVar2.i(rect2.left, rect2.top, rect2.width(), rect2.height());
                            qVar2.d(bVar3.k(nVar2.f99c));
                            nVar2.f104i.h(rect2, bVar3, i16, nVar2.f99c);
                        } else if (motionLayout.f1598h0 != 0) {
                            Log.e("MotionLayout", a0.a.b() + "no widget for  " + a0.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i12 = i10 + 1;
                hashMap2 = hashMap;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
                childCount = i6;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i17 = childCount;
            int i18 = 0;
            while (i18 < i17) {
                SparseArray sparseArray4 = sparseArray3;
                n nVar3 = (n) sparseArray4.get(iArr3[i18]);
                int i19 = nVar3.f.E;
                if (i19 != -1) {
                    n nVar4 = (n) sparseArray4.get(i19);
                    nVar3.f.k(nVar4, nVar4.f);
                    nVar3.f102g.k(nVar4, nVar4.f102g);
                }
                i18++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i6, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.P == motionLayout.getStartState()) {
                x.f fVar = this.f1637b;
                androidx.constraintlayout.widget.b bVar = this.f1639d;
                if (bVar != null && bVar.f1816c != 0) {
                    i14 = i10;
                } else {
                    i14 = i6;
                }
                if (bVar != null && bVar.f1816c != 0) {
                    i15 = i6;
                } else {
                    i15 = i10;
                }
                motionLayout.i(fVar, optimizationLevel, i14, i15);
                androidx.constraintlayout.widget.b bVar2 = this.f1638c;
                if (bVar2 != null) {
                    x.f fVar2 = this.f1636a;
                    int i17 = bVar2.f1816c;
                    if (i17 == 0) {
                        i16 = i6;
                    } else {
                        i16 = i10;
                    }
                    if (i17 == 0) {
                        i6 = i10;
                    }
                    motionLayout.i(fVar2, optimizationLevel, i16, i6);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.b bVar3 = this.f1638c;
            if (bVar3 != null) {
                x.f fVar3 = this.f1636a;
                int i18 = bVar3.f1816c;
                if (i18 == 0) {
                    i12 = i6;
                } else {
                    i12 = i10;
                }
                if (i18 == 0) {
                    i13 = i10;
                } else {
                    i13 = i6;
                }
                motionLayout.i(fVar3, optimizationLevel, i12, i13);
            }
            x.f fVar4 = this.f1637b;
            androidx.constraintlayout.widget.b bVar4 = this.f1639d;
            if (bVar4 != null && bVar4.f1816c != 0) {
                i11 = i10;
            } else {
                i11 = i6;
            }
            if (bVar4 == null || bVar4.f1816c == 0) {
                i6 = i10;
            }
            motionLayout.i(fVar4, optimizationLevel, i11, i6);
        }

        public final void e(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.widget.b bVar2) {
            this.f1638c = bVar;
            this.f1639d = bVar2;
            this.f1636a = new x.f();
            x.f fVar = new x.f();
            this.f1637b = fVar;
            x.f fVar2 = this.f1636a;
            boolean z10 = MotionLayout.Y0;
            MotionLayout motionLayout = MotionLayout.this;
            x.f fVar3 = motionLayout.f1753w;
            b.InterfaceC0647b interfaceC0647b = fVar3.A0;
            fVar2.A0 = interfaceC0647b;
            fVar2.f37410y0.f = interfaceC0647b;
            b.InterfaceC0647b interfaceC0647b2 = fVar3.A0;
            fVar.A0 = interfaceC0647b2;
            fVar.f37410y0.f = interfaceC0647b2;
            fVar2.f37443w0.clear();
            this.f1637b.f37443w0.clear();
            x.f fVar4 = this.f1636a;
            x.f fVar5 = motionLayout.f1753w;
            c(fVar5, fVar4);
            c(fVar5, this.f1637b);
            if (motionLayout.f1594b0 > 0.5d) {
                if (bVar != null) {
                    g(this.f1636a, bVar);
                }
                g(this.f1637b, bVar2);
            } else {
                g(this.f1637b, bVar2);
                if (bVar != null) {
                    g(this.f1636a, bVar);
                }
            }
            this.f1636a.B0 = motionLayout.f();
            x.f fVar6 = this.f1636a;
            fVar6.f37409x0.c(fVar6);
            this.f1637b.B0 = motionLayout.f();
            x.f fVar7 = this.f1637b;
            fVar7.f37409x0.c(fVar7);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i6 = layoutParams.width;
                e.a aVar = e.a.WRAP_CONTENT;
                if (i6 == -2) {
                    this.f1636a.P(aVar);
                    this.f1637b.P(aVar);
                }
                if (layoutParams.height == -2) {
                    this.f1636a.Q(aVar);
                    this.f1637b.Q(aVar);
                }
            }
        }

        public final void f() {
            boolean z10;
            int i6;
            boolean z11;
            boolean z12;
            HashMap<View, n> hashMap;
            int i10;
            float f;
            boolean z13;
            float f2;
            float f10;
            boolean z14;
            MotionLayout motionLayout = MotionLayout.this;
            int i11 = motionLayout.R;
            int i12 = motionLayout.S;
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            motionLayout.I0 = mode;
            motionLayout.J0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i11, i12);
            int i13 = 0;
            boolean z15 = true;
            if ((motionLayout.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                b(i11, i12);
                motionLayout.E0 = this.f1636a.u();
                motionLayout.F0 = this.f1636a.o();
                motionLayout.G0 = this.f1637b.u();
                int o10 = this.f1637b.o();
                motionLayout.H0 = o10;
                if (motionLayout.E0 == motionLayout.G0 && motionLayout.F0 == o10) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                motionLayout.D0 = z14;
            }
            int i14 = motionLayout.E0;
            int i15 = motionLayout.F0;
            int i16 = motionLayout.I0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i14 = (int) ((motionLayout.K0 * (motionLayout.G0 - i14)) + i14);
            }
            int i17 = i14;
            int i18 = motionLayout.J0;
            if (i18 != Integer.MIN_VALUE && i18 != 0) {
                i6 = i15;
            } else {
                i6 = (int) ((motionLayout.K0 * (motionLayout.H0 - i15)) + i15);
            }
            x.f fVar = this.f1636a;
            if (!fVar.K0 && !this.f1637b.K0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!fVar.L0 && !this.f1637b.L0) {
                z12 = false;
            } else {
                z12 = true;
            }
            motionLayout.h(i11, i12, i17, i6, z11, z12);
            int childCount = motionLayout.getChildCount();
            motionLayout.S0.a();
            motionLayout.f1596f0 = true;
            SparseArray sparseArray = new SparseArray();
            int i19 = 0;
            while (true) {
                hashMap = motionLayout.U;
                if (i19 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i19);
                sparseArray.put(childAt.getId(), hashMap.get(childAt));
                i19++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            a.b bVar = motionLayout.K.f1656c;
            if (bVar != null) {
                i10 = bVar.f1686p;
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar = hashMap.get(motionLayout.getChildAt(i20));
                    if (nVar != null) {
                        nVar.B = i10;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[hashMap.size()];
            int i21 = 0;
            for (int i22 = 0; i22 < childCount; i22++) {
                n nVar2 = hashMap.get(motionLayout.getChildAt(i22));
                int i23 = nVar2.f.E;
                if (i23 != -1) {
                    sparseBooleanArray.put(i23, true);
                    iArr[i21] = nVar2.f.E;
                    i21++;
                }
            }
            for (int i24 = 0; i24 < i21; i24++) {
                n nVar3 = hashMap.get(motionLayout.findViewById(iArr[i24]));
                if (nVar3 != null) {
                    motionLayout.K.e(nVar3);
                    nVar3.f(width, height, motionLayout.getNanoTime());
                }
            }
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt2 = motionLayout.getChildAt(i25);
                n nVar4 = hashMap.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar4 != null) {
                    motionLayout.K.e(nVar4);
                    nVar4.f(width, height, motionLayout.getNanoTime());
                }
            }
            a.b bVar2 = motionLayout.K.f1656c;
            if (bVar2 != null) {
                f = bVar2.f1679i;
            } else {
                f = 0.0f;
            }
            if (f != 0.0f) {
                if (f < 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float abs = Math.abs(f);
                float f11 = Float.MAX_VALUE;
                float f12 = -3.4028235E38f;
                int i26 = 0;
                float f13 = Float.MAX_VALUE;
                float f14 = -3.4028235E38f;
                while (true) {
                    if (i26 < childCount) {
                        n nVar5 = hashMap.get(motionLayout.getChildAt(i26));
                        if (!Float.isNaN(nVar5.f107l)) {
                            break;
                        }
                        q qVar = nVar5.f102g;
                        float f15 = qVar.f125y;
                        float f16 = qVar.f126z;
                        if (z13) {
                            f10 = f16 - f15;
                        } else {
                            f10 = f16 + f15;
                        }
                        f13 = Math.min(f13, f10);
                        f14 = Math.max(f14, f10);
                        i26++;
                    } else {
                        z15 = false;
                        break;
                    }
                }
                if (z15) {
                    for (int i27 = 0; i27 < childCount; i27++) {
                        n nVar6 = hashMap.get(motionLayout.getChildAt(i27));
                        if (!Float.isNaN(nVar6.f107l)) {
                            f11 = Math.min(f11, nVar6.f107l);
                            f12 = Math.max(f12, nVar6.f107l);
                        }
                    }
                    while (i13 < childCount) {
                        n nVar7 = hashMap.get(motionLayout.getChildAt(i13));
                        if (!Float.isNaN(nVar7.f107l)) {
                            nVar7.f109n = 1.0f / (1.0f - abs);
                            if (z13) {
                                nVar7.f108m = abs - (((f12 - nVar7.f107l) / (f12 - f11)) * abs);
                            } else {
                                nVar7.f108m = abs - (((nVar7.f107l - f11) * abs) / (f12 - f11));
                            }
                        }
                        i13++;
                    }
                    return;
                }
                while (i13 < childCount) {
                    n nVar8 = hashMap.get(motionLayout.getChildAt(i13));
                    q qVar2 = nVar8.f102g;
                    float f17 = qVar2.f125y;
                    float f18 = qVar2.f126z;
                    if (z13) {
                        f2 = f18 - f17;
                    } else {
                        f2 = f18 + f17;
                    }
                    nVar8.f109n = 1.0f / (1.0f - abs);
                    nVar8.f108m = abs - (((f2 - f13) * abs) / (f14 - f13));
                    i13++;
                }
            }
        }

        public final void g(x.f fVar, androidx.constraintlayout.widget.b bVar) {
            b.a aVar;
            b.a aVar2;
            SparseArray<x.e> sparseArray = new SparseArray<>();
            c.a aVar3 = new c.a();
            sparseArray.clear();
            sparseArray.put(0, fVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), fVar);
            if (bVar != null && bVar.f1816c != 0) {
                x.f fVar2 = this.f1637b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z10 = MotionLayout.Y0;
                motionLayout.i(fVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<x.e> it = fVar.f37443w0.iterator();
            while (it.hasNext()) {
                x.e next = it.next();
                next.f37378k0 = true;
                sparseArray.put(((View) next.f37374i0).getId(), next);
            }
            Iterator<x.e> it2 = fVar.f37443w0.iterator();
            while (it2.hasNext()) {
                x.e next2 = it2.next();
                View view = (View) next2.f37374i0;
                int id2 = view.getId();
                HashMap<Integer, b.a> hashMap = bVar.f;
                if (hashMap.containsKey(Integer.valueOf(id2)) && (aVar2 = hashMap.get(Integer.valueOf(id2))) != null) {
                    aVar2.a(aVar3);
                }
                next2.R(bVar.k(view.getId()).f1823e.f1842c);
                next2.O(bVar.k(view.getId()).f1823e.f1843d);
                if (view instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar4 = (androidx.constraintlayout.widget.a) view;
                    int id3 = aVar4.getId();
                    HashMap<Integer, b.a> hashMap2 = bVar.f;
                    if (hashMap2.containsKey(Integer.valueOf(id3)) && (aVar = hashMap2.get(Integer.valueOf(id3))) != null && (next2 instanceof j)) {
                        aVar4.n(aVar, (j) next2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).q();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z11 = MotionLayout.Y0;
                motionLayout2.b(false, view, next2, aVar3, sparseArray);
                if (bVar.k(view.getId()).f1821c.f1891c == 1) {
                    next2.f37376j0 = view.getVisibility();
                } else {
                    next2.f37376j0 = bVar.k(view.getId()).f1821c.f1890b;
                }
            }
            Iterator<x.e> it3 = fVar.f37443w0.iterator();
            while (it3.hasNext()) {
                x.e next3 = it3.next();
                if (next3 instanceof x.m) {
                    androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) next3.f37374i0;
                    x.i iVar = (x.i) next3;
                    aVar5.getClass();
                    iVar.a();
                    for (int i6 = 0; i6 < aVar5.f1806v; i6++) {
                        iVar.b(sparseArray.get(aVar5.f1805u[i6]));
                    }
                    x.m mVar = (x.m) iVar;
                    for (int i10 = 0; i10 < mVar.f37439x0; i10++) {
                        x.e eVar = mVar.f37438w0[i10];
                        if (eVar != null) {
                            eVar.H = true;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: b  reason: collision with root package name */
        public static final f f1642b = new f();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f1643a;
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public float f1644a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f1645b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f1646c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1647d = -1;

        public g() {
        }

        public final void a() {
            int i6 = this.f1646c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i6 != -1 || this.f1647d != -1) {
                if (i6 == -1) {
                    motionLayout.B(this.f1647d);
                } else {
                    int i10 = this.f1647d;
                    if (i10 == -1) {
                        motionLayout.x(i6);
                    } else {
                        motionLayout.y(i6, i10);
                    }
                }
                motionLayout.setState(i.SETUP);
            }
            if (Float.isNaN(this.f1645b)) {
                if (Float.isNaN(this.f1644a)) {
                    return;
                }
                motionLayout.setProgress(this.f1644a);
                return;
            }
            float f = this.f1644a;
            float f2 = this.f1645b;
            if (!motionLayout.isAttachedToWindow()) {
                if (motionLayout.N0 == null) {
                    motionLayout.N0 = new g();
                }
                g gVar = motionLayout.N0;
                gVar.f1644a = f;
                gVar.f1645b = f2;
            } else {
                motionLayout.setProgress(f);
                motionLayout.setState(i.MOVING);
                motionLayout.N = f2;
                float f10 = 1.0f;
                int i11 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    if (i11 <= 0) {
                        f10 = 0.0f;
                    }
                    motionLayout.m(f10);
                } else if (f != 0.0f && f != 1.0f) {
                    if (f <= 0.5f) {
                        f10 = 0.0f;
                    }
                    motionLayout.m(f10);
                }
            }
            this.f1644a = Float.NaN;
            this.f1645b = Float.NaN;
            this.f1646c = -1;
            this.f1647d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(int i6);

        void b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public enum i {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.constraintlayout.motion.widget.a aVar;
        this.M = null;
        this.N = 0.0f;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = 0;
        this.S = 0;
        this.T = true;
        this.U = new HashMap<>();
        this.V = 0L;
        this.W = 1.0f;
        this.f1593a0 = 0.0f;
        this.f1594b0 = 0.0f;
        this.f1595d0 = 0.0f;
        this.f1596f0 = false;
        this.f1598h0 = 0;
        this.f1600j0 = false;
        this.f1601k0 = new z.a();
        this.f1602l0 = new c();
        this.f1606p0 = false;
        this.f1611u0 = false;
        this.f1612v0 = null;
        this.f1613w0 = null;
        this.f1614x0 = null;
        this.f1615y0 = 0;
        this.f1616z0 = -1L;
        this.A0 = 0.0f;
        this.B0 = 0;
        this.C0 = 0.0f;
        this.D0 = false;
        this.L0 = new w.d(0);
        this.M0 = false;
        this.O0 = null;
        new HashMap();
        this.P0 = new Rect();
        this.Q0 = false;
        this.R0 = i.UNDEFINED;
        this.S0 = new e();
        this.T0 = false;
        this.U0 = new RectF();
        this.V0 = null;
        this.W0 = null;
        this.X0 = new ArrayList<>();
        Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.r.K);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 2) {
                    this.K = new androidx.constraintlayout.motion.widget.a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.P = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f1595d0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1596f0 = true;
                } else if (index == 0) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f1598h0 == 0) {
                        this.f1598h0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f1598h0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.K == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.K = null;
            }
        }
        if (this.f1598h0 != 0) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.K;
            if (aVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g5 = aVar2.g();
                androidx.constraintlayout.motion.widget.a aVar3 = this.K;
                androidx.constraintlayout.widget.b b10 = aVar3.b(aVar3.g());
                String c10 = a0.a.c(g5, getContext());
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder g10 = defpackage.d.g("CHECK: ", c10, " ALL VIEWS SHOULD HAVE ID's ");
                        g10.append(childAt.getClass().getName());
                        g10.append(" does not!");
                        Log.w("MotionLayout", g10.toString());
                    }
                    if (b10.l(id2) == null) {
                        StringBuilder g11 = defpackage.d.g("CHECK: ", c10, " NO CONSTRAINTS for ");
                        g11.append(a0.a.d(childAt));
                        Log.w("MotionLayout", g11.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b10.f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i11 = 0; i11 < length; i11++) {
                    iArr[i11] = numArr[i11].intValue();
                }
                for (int i12 = 0; i12 < length; i12++) {
                    int i13 = iArr[i12];
                    String c11 = a0.a.c(i13, getContext());
                    if (findViewById(iArr[i12]) == null) {
                        Log.w("MotionLayout", "CHECK: " + c10 + " NO View matches id " + c11);
                    }
                    if (b10.k(i13).f1823e.f1843d == -1) {
                        Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
                    }
                    if (b10.k(i13).f1823e.f1842c == -1) {
                        Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator<a.b> it = this.K.f1657d.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next == this.K.f1656c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (next.f1675d == next.f1674c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i14 = next.f1675d;
                    int i15 = next.f1674c;
                    String c12 = a0.a.c(i14, getContext());
                    String c13 = a0.a.c(i15, getContext());
                    if (sparseIntArray.get(i14) == i15) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c12 + "->" + c13);
                    }
                    if (sparseIntArray2.get(i15) == i14) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c12 + "->" + c13);
                    }
                    sparseIntArray.put(i14, i15);
                    sparseIntArray2.put(i15, i14);
                    if (this.K.b(i14) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + c12);
                    }
                    if (this.K.b(i15) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + c12);
                    }
                }
            }
        }
        if (this.P == -1 && (aVar = this.K) != null) {
            this.P = aVar.g();
            this.O = this.K.g();
            a.b bVar = this.K.f1656c;
            this.Q = bVar != null ? bVar.f1674c : -1;
        }
    }

    public static Rect l(MotionLayout motionLayout, x.e eVar) {
        motionLayout.getClass();
        int w10 = eVar.w();
        Rect rect = motionLayout.P0;
        rect.top = w10;
        rect.left = eVar.v();
        rect.right = eVar.u() + rect.left;
        rect.bottom = eVar.o() + rect.top;
        return rect;
    }

    public final void A() {
        m(1.0f);
        this.O0 = null;
    }

    public final void B(int i6) {
        int i10;
        float f2;
        float alpha;
        b0.f fVar;
        if (!isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new g();
            }
            this.N0.f1647d = i6;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && (fVar = aVar.f1655b) != null) {
            int i11 = this.P;
            float f10 = -1;
            f.a aVar2 = fVar.f3927b.get(i6);
            if (aVar2 == null) {
                i11 = i6;
            } else {
                ArrayList<f.b> arrayList = aVar2.f3929b;
                int i12 = aVar2.f3930c;
                int i13 = (f10 > (-1.0f) ? 1 : (f10 == (-1.0f) ? 0 : -1));
                if (i13 != 0 && i13 != 0) {
                    Iterator<f.b> it = arrayList.iterator();
                    f.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            f.b next = it.next();
                            if (next.a(f10, f10)) {
                                if (i11 == next.f3935e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else if (bVar != null) {
                            i11 = bVar.f3935e;
                        }
                    }
                } else if (i12 != i11) {
                    Iterator<f.b> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i11 == it2.next().f3935e) {
                            break;
                        }
                    }
                    i11 = i12;
                }
            }
            if (i11 != -1) {
                i6 = i11;
            }
        }
        int i14 = this.P;
        if (i14 != i6) {
            if (this.O == i6) {
                m(0.0f);
            } else if (this.Q == i6) {
                m(1.0f);
            } else {
                this.Q = i6;
                if (i14 != -1) {
                    y(i14, i6);
                    m(1.0f);
                    this.f1594b0 = 0.0f;
                    A();
                    return;
                }
                this.f1600j0 = false;
                this.f1595d0 = 1.0f;
                this.f1593a0 = 0.0f;
                this.f1594b0 = 0.0f;
                this.c0 = getNanoTime();
                this.V = getNanoTime();
                this.e0 = false;
                this.L = null;
                androidx.constraintlayout.motion.widget.a aVar3 = this.K;
                a.b bVar2 = aVar3.f1656c;
                if (bVar2 != null) {
                    i10 = bVar2.f1678h;
                } else {
                    i10 = aVar3.f1662j;
                }
                this.W = i10 / 1000.0f;
                this.O = -1;
                aVar3.m(-1, this.Q);
                SparseArray sparseArray = new SparseArray();
                int childCount = getChildCount();
                HashMap<View, n> hashMap = this.U;
                hashMap.clear();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    hashMap.put(childAt, new n(childAt));
                    sparseArray.put(childAt.getId(), hashMap.get(childAt));
                }
                this.f1596f0 = true;
                androidx.constraintlayout.widget.b b10 = this.K.b(i6);
                e eVar = this.S0;
                eVar.e(null, b10);
                w();
                eVar.a();
                int childCount2 = getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt2 = getChildAt(i16);
                    n nVar = hashMap.get(childAt2);
                    if (nVar != null) {
                        q qVar = nVar.f;
                        qVar.f123w = 0.0f;
                        qVar.f124x = 0.0f;
                        qVar.i(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                        a0.l lVar = nVar.f103h;
                        lVar.getClass();
                        childAt2.getX();
                        childAt2.getY();
                        childAt2.getWidth();
                        childAt2.getHeight();
                        lVar.f92w = childAt2.getVisibility();
                        if (childAt2.getVisibility() != 0) {
                            alpha = 0.0f;
                        } else {
                            alpha = childAt2.getAlpha();
                        }
                        lVar.f90u = alpha;
                        lVar.f93x = childAt2.getElevation();
                        lVar.f94y = childAt2.getRotation();
                        lVar.f95z = childAt2.getRotationX();
                        lVar.A = childAt2.getRotationY();
                        lVar.B = childAt2.getScaleX();
                        lVar.C = childAt2.getScaleY();
                        lVar.D = childAt2.getPivotX();
                        lVar.E = childAt2.getPivotY();
                        lVar.F = childAt2.getTranslationX();
                        lVar.G = childAt2.getTranslationY();
                        lVar.H = childAt2.getTranslationZ();
                    }
                }
                int width = getWidth();
                int height = getHeight();
                for (int i17 = 0; i17 < childCount; i17++) {
                    n nVar2 = hashMap.get(getChildAt(i17));
                    if (nVar2 != null) {
                        this.K.e(nVar2);
                        nVar2.f(width, height, getNanoTime());
                    }
                }
                a.b bVar3 = this.K.f1656c;
                if (bVar3 != null) {
                    f2 = bVar3.f1679i;
                } else {
                    f2 = 0.0f;
                }
                if (f2 != 0.0f) {
                    float f11 = Float.MAX_VALUE;
                    float f12 = -3.4028235E38f;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        q qVar2 = hashMap.get(getChildAt(i18)).f102g;
                        float f13 = qVar2.f126z + qVar2.f125y;
                        f11 = Math.min(f11, f13);
                        f12 = Math.max(f12, f13);
                    }
                    for (int i19 = 0; i19 < childCount; i19++) {
                        n nVar3 = hashMap.get(getChildAt(i19));
                        q qVar3 = nVar3.f102g;
                        float f14 = qVar3.f125y;
                        float f15 = qVar3.f126z;
                        nVar3.f109n = 1.0f / (1.0f - f2);
                        nVar3.f108m = f2 - ((((f14 + f15) - f11) * f2) / (f12 - f11));
                    }
                }
                this.f1593a0 = 0.0f;
                this.f1594b0 = 0.0f;
                this.f1596f0 = true;
                invalidate();
            }
        }
    }

    public final void C(int i6, androidx.constraintlayout.widget.b bVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            aVar.f1659g.put(i6, bVar);
        }
        this.S0.e(this.K.b(this.O), this.K.b(this.Q));
        w();
        if (this.P == i6) {
            bVar.b(this);
        }
    }

    public final void D(int i6, View... viewArr) {
        String str;
        androidx.constraintlayout.widget.b b10;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.f1669q;
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.constraintlayout.motion.widget.c> it = dVar.f1747b.iterator();
            androidx.constraintlayout.motion.widget.c cVar = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = dVar.f1749d;
                if (!hasNext) {
                    break;
                }
                androidx.constraintlayout.motion.widget.c next = it.next();
                if (next.f1715a == i6) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = dVar.f1746a;
                        int currentState = motionLayout.getCurrentState();
                        if (next.f1719e != 2) {
                            if (currentState == -1) {
                                Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                            } else {
                                androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.K;
                                if (aVar2 == null) {
                                    b10 = null;
                                } else {
                                    b10 = aVar2.b(currentState);
                                }
                                if (b10 != null) {
                                    next.a(dVar, dVar.f1746a, currentState, b10, viewArr2);
                                }
                            }
                        } else {
                            next.a(dVar, dVar.f1746a, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    }
                    cVar = next;
                }
            }
            if (cVar == null) {
                Log.e(str, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i6;
        MotionLayout motionLayout;
        Iterator<n> it;
        int i10;
        Canvas canvas2;
        int i11;
        int i12;
        Paint paint;
        z.c cVar;
        z.c cVar2;
        z.b bVar;
        z.b bVar2;
        Paint paint2;
        q qVar;
        Paint paint3;
        q qVar2;
        int i13;
        Paint paint4;
        Paint paint5;
        double d10;
        float f2;
        String e10;
        long j10;
        androidx.constraintlayout.motion.widget.d dVar;
        ArrayList<c.a> arrayList;
        Canvas canvas3 = canvas;
        char c10 = 0;
        o(false);
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && (dVar = aVar.f1669q) != null && (arrayList = dVar.f1750e) != null) {
            Iterator<c.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            ArrayList<c.a> arrayList2 = dVar.f1750e;
            ArrayList<c.a> arrayList3 = dVar.f;
            arrayList2.removeAll(arrayList3);
            arrayList3.clear();
            if (dVar.f1750e.isEmpty()) {
                dVar.f1750e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.K == null) {
            return;
        }
        if ((this.f1598h0 & 1) == 1 && !isInEditMode()) {
            this.f1615y0++;
            long nanoTime = getNanoTime();
            long j11 = this.f1616z0;
            if (j11 != -1) {
                if (nanoTime - j11 > 200000000) {
                    this.A0 = ((int) ((this.f1615y0 / (((float) j10) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f1615y0 = 0;
                    this.f1616z0 = nanoTime;
                }
            } else {
                this.f1616z0 = nanoTime;
            }
            Paint paint6 = new Paint();
            paint6.setTextSize(42.0f);
            StringBuilder c11 = v.h.c(this.A0 + " fps " + a0.a.e(this.O, this) + " -> ");
            c11.append(a0.a.e(this.Q, this));
            c11.append(" (progress: ");
            c11.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
            c11.append(" ) state=");
            int i14 = this.P;
            if (i14 == -1) {
                e10 = "undefined";
            } else {
                e10 = a0.a.e(i14, this);
            }
            c11.append(e10);
            String sb2 = c11.toString();
            paint6.setColor(-16777216);
            canvas3.drawText(sb2, 11.0f, getHeight() - 29, paint6);
            paint6.setColor(-7864184);
            canvas3.drawText(sb2, 10.0f, getHeight() - 30, paint6);
        }
        if (this.f1598h0 > 1) {
            if (this.f1599i0 == null) {
                this.f1599i0 = new d();
            }
            d dVar2 = this.f1599i0;
            HashMap<View, n> hashMap = this.U;
            androidx.constraintlayout.motion.widget.a aVar2 = this.K;
            a.b bVar3 = aVar2.f1656c;
            if (bVar3 != null) {
                i6 = bVar3.f1678h;
            } else {
                i6 = aVar2.f1662j;
            }
            int i15 = this.f1598h0;
            dVar2.getClass();
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                boolean isInEditMode = MotionLayout.this.isInEditMode();
                Paint paint7 = dVar2.f1627e;
                if (!isInEditMode && (i15 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.Q) + ":" + motionLayout.getProgress();
                    canvas3.drawText(str, 10.0f, motionLayout.getHeight() - 30, dVar2.f1629h);
                    canvas3.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint7);
                }
                Iterator<n> it3 = hashMap.values().iterator();
                Canvas canvas4 = canvas3;
                d dVar3 = dVar2;
                while (it3.hasNext()) {
                    n next = it3.next();
                    int i16 = next.f.f122v;
                    ArrayList<q> arrayList4 = next.f115u;
                    Iterator<q> it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        i16 = Math.max(i16, it4.next().f122v);
                    }
                    int max = Math.max(i16, next.f102g.f122v);
                    if (i15 > 0 && max == 0) {
                        max = 1;
                    }
                    if (max != 0) {
                        float[] fArr = dVar3.f1625c;
                        if (fArr != null) {
                            double[] f10 = next.f105j[c10].f();
                            int[] iArr = dVar3.f1624b;
                            if (iArr != null) {
                                Iterator<q> it5 = arrayList4.iterator();
                                int i17 = 0;
                                while (it5.hasNext()) {
                                    iArr[i17] = it5.next().I;
                                    i17++;
                                }
                            }
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < f10.length) {
                                float[] fArr2 = fArr;
                                next.f105j[0].c(f10[i18], next.f111p);
                                next.f.h(f10[i18], next.f110o, next.f111p, fArr2, i19);
                                i19 += 2;
                                i18++;
                                it3 = it3;
                                f10 = f10;
                                fArr = fArr2;
                            }
                            it = it3;
                            i10 = i19 / 2;
                        } else {
                            it = it3;
                            i10 = 0;
                        }
                        dVar3.f1632k = i10;
                        if (max >= 1) {
                            int i20 = i6 / 16;
                            float[] fArr3 = dVar3.f1623a;
                            if (fArr3 == null || fArr3.length != i20 * 2) {
                                dVar3.f1623a = new float[i20 * 2];
                                dVar3.f1626d = new Path();
                            }
                            int i21 = dVar3.f1634m;
                            float f11 = i21;
                            canvas4.translate(f11, f11);
                            paint7.setColor(1996488704);
                            Paint paint8 = dVar3.f1630i;
                            paint8.setColor(1996488704);
                            Paint paint9 = dVar3.f;
                            paint9.setColor(1996488704);
                            Paint paint10 = dVar3.f1628g;
                            paint10.setColor(1996488704);
                            float[] fArr4 = dVar3.f1623a;
                            float f12 = 1.0f / (i20 - 1);
                            HashMap<String, z.c> hashMap2 = next.f119y;
                            i11 = i6;
                            if (hashMap2 == null) {
                                cVar = null;
                            } else {
                                cVar = hashMap2.get("translationX");
                            }
                            i12 = i15;
                            HashMap<String, z.c> hashMap3 = next.f119y;
                            if (hashMap3 == null) {
                                cVar2 = null;
                            } else {
                                cVar2 = hashMap3.get("translationY");
                            }
                            HashMap<String, z.b> hashMap4 = next.f120z;
                            if (hashMap4 == null) {
                                bVar = null;
                            } else {
                                bVar = hashMap4.get("translationX");
                            }
                            HashMap<String, z.b> hashMap5 = next.f120z;
                            if (hashMap5 == null) {
                                bVar2 = null;
                            } else {
                                bVar2 = hashMap5.get("translationY");
                            }
                            int i22 = 0;
                            while (true) {
                                float f13 = Float.NaN;
                                paint2 = paint8;
                                qVar = next.f;
                                if (i22 >= i20) {
                                    break;
                                }
                                int i23 = i20;
                                float f14 = i22 * f12;
                                float f15 = f12;
                                float f16 = next.f109n;
                                if (f16 != 1.0f) {
                                    paint5 = paint9;
                                    float f17 = next.f108m;
                                    if (f14 < f17) {
                                        f14 = 0.0f;
                                    }
                                    i13 = max;
                                    paint4 = paint7;
                                    if (f14 > f17 && f14 < 1.0d) {
                                        f14 = Math.min((f14 - f17) * f16, 1.0f);
                                    }
                                } else {
                                    i13 = max;
                                    paint4 = paint7;
                                    paint5 = paint9;
                                }
                                double d11 = f14;
                                w.c cVar3 = qVar.f121u;
                                Iterator<q> it6 = arrayList4.iterator();
                                float f18 = 0.0f;
                                while (it6.hasNext()) {
                                    double d12 = d11;
                                    q next2 = it6.next();
                                    w.c cVar4 = next2.f121u;
                                    if (cVar4 != null) {
                                        float f19 = next2.f123w;
                                        if (f19 < f14) {
                                            f18 = f19;
                                            cVar3 = cVar4;
                                        } else if (Float.isNaN(f13)) {
                                            f13 = next2.f123w;
                                        }
                                    }
                                    d11 = d12;
                                }
                                double d13 = d11;
                                if (cVar3 != null) {
                                    if (Float.isNaN(f13)) {
                                        f13 = 1.0f;
                                    }
                                    d10 = (((float) cVar3.a((f14 - f18) / f2)) * (f13 - f18)) + f18;
                                } else {
                                    d10 = d13;
                                }
                                next.f105j[0].c(d10, next.f111p);
                                w.a aVar3 = next.f106k;
                                if (aVar3 != null) {
                                    double[] dArr = next.f111p;
                                    if (dArr.length > 0) {
                                        aVar3.c(d10, dArr);
                                    }
                                }
                                int i24 = i22 * 2;
                                next.f.h(d10, next.f110o, next.f111p, fArr4, i24);
                                if (bVar != null) {
                                    fArr4[i24] = bVar.a(f14) + fArr4[i24];
                                } else if (cVar != null) {
                                    fArr4[i24] = cVar.a(f14) + fArr4[i24];
                                }
                                if (bVar2 != null) {
                                    int i25 = i24 + 1;
                                    fArr4[i25] = bVar2.a(f14) + fArr4[i25];
                                } else if (cVar2 != null) {
                                    int i26 = i24 + 1;
                                    fArr4[i26] = cVar2.a(f14) + fArr4[i26];
                                }
                                i22++;
                                paint8 = paint2;
                                i20 = i23;
                                f12 = f15;
                                paint9 = paint5;
                                paint7 = paint4;
                                max = i13;
                            }
                            dVar2.a(canvas3, max, dVar2.f1632k, next);
                            Paint paint11 = paint7;
                            paint11.setColor(-21965);
                            paint9.setColor(-2067046);
                            paint2.setColor(-2067046);
                            paint10.setColor(-13391360);
                            float f20 = -i21;
                            canvas3.translate(f20, f20);
                            dVar2.a(canvas3, max, dVar2.f1632k, next);
                            if (max == 5) {
                                dVar2.f1626d.reset();
                                int i27 = 0;
                                while (i27 <= 50) {
                                    next.f105j[0].c(next.a(i27 / 50, null), next.f111p);
                                    int[] iArr2 = next.f110o;
                                    double[] dArr2 = next.f111p;
                                    float f21 = qVar.f125y;
                                    float f22 = qVar.f126z;
                                    float f23 = qVar.A;
                                    float f24 = qVar.B;
                                    for (int i28 = 0; i28 < iArr2.length; i28++) {
                                        float f25 = (float) dArr2[i28];
                                        int i29 = iArr2[i28];
                                        if (i29 != 1) {
                                            if (i29 != 2) {
                                                if (i29 != 3) {
                                                    if (i29 == 4) {
                                                        f24 = f25;
                                                    }
                                                } else {
                                                    f23 = f25;
                                                }
                                            } else {
                                                f22 = f25;
                                            }
                                        } else {
                                            f21 = f25;
                                        }
                                    }
                                    if (qVar.G != null) {
                                        double d14 = 0.0f;
                                        double d15 = f21;
                                        double d16 = f22;
                                        qVar2 = qVar;
                                        paint3 = paint11;
                                        f22 = (float) ((d14 - (Math.cos(d16) * d15)) - (f24 / 2.0f));
                                        f21 = (float) (((Math.sin(d16) * d15) + d14) - (f23 / 2.0f));
                                    } else {
                                        paint3 = paint11;
                                        qVar2 = qVar;
                                    }
                                    float f26 = f23 + f21;
                                    float f27 = f24 + f22;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f28 = f21 + 0.0f;
                                    float f29 = f22 + 0.0f;
                                    float f30 = f26 + 0.0f;
                                    float f31 = f27 + 0.0f;
                                    float[] fArr5 = dVar2.f1631j;
                                    fArr5[0] = f28;
                                    fArr5[1] = f29;
                                    fArr5[2] = f30;
                                    fArr5[3] = f29;
                                    fArr5[4] = f30;
                                    fArr5[5] = f31;
                                    fArr5[6] = f28;
                                    fArr5[7] = f31;
                                    dVar2.f1626d.moveTo(f28, f29);
                                    dVar2.f1626d.lineTo(fArr5[2], fArr5[3]);
                                    dVar2.f1626d.lineTo(fArr5[4], fArr5[5]);
                                    dVar2.f1626d.lineTo(fArr5[6], fArr5[7]);
                                    dVar2.f1626d.close();
                                    i27++;
                                    qVar = qVar2;
                                    paint11 = paint3;
                                }
                                paint = paint11;
                                paint.setColor(1140850688);
                                canvas2 = canvas;
                                canvas2.translate(2.0f, 2.0f);
                                canvas2.drawPath(dVar2.f1626d, paint);
                                canvas2.translate(-2.0f, -2.0f);
                                paint.setColor(-65536);
                                canvas2.drawPath(dVar2.f1626d, paint);
                            } else {
                                canvas2 = canvas3;
                                paint = paint11;
                            }
                            canvas4 = canvas2;
                            dVar3 = dVar2;
                        } else {
                            canvas2 = canvas3;
                            i11 = i6;
                            i12 = i15;
                            paint = paint7;
                        }
                        paint7 = paint;
                        canvas3 = canvas2;
                        i6 = i11;
                        i15 = i12;
                        it3 = it;
                        c10 = 0;
                    }
                }
                canvas.restore();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void g(int i6) {
        this.E = null;
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.f1659g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = sparseArray.keyAt(i6);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.P;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.f1657d;
    }

    public a0.b getDesignTool() {
        if (this.f1603m0 == null) {
            this.f1603m0 = new a0.b();
        }
        return this.f1603m0;
    }

    public int getEndState() {
        return this.Q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1594b0;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.K;
    }

    public int getStartState() {
        return this.O;
    }

    public float getTargetPosition() {
        return this.f1595d0;
    }

    public Bundle getTransitionState() {
        if (this.N0 == null) {
            this.N0 = new g();
        }
        g gVar = this.N0;
        MotionLayout motionLayout = MotionLayout.this;
        gVar.f1647d = motionLayout.Q;
        gVar.f1646c = motionLayout.O;
        gVar.f1645b = motionLayout.getVelocity();
        gVar.f1644a = motionLayout.getProgress();
        g gVar2 = this.N0;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.f1644a);
        bundle.putFloat("motion.velocity", gVar2.f1645b);
        bundle.putInt("motion.StartState", gVar2.f1646c);
        bundle.putInt("motion.EndState", gVar2.f1647d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        int i6;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            a.b bVar = aVar.f1656c;
            if (bVar != null) {
                i6 = bVar.f1678h;
            } else {
                i6 = aVar.f1662j;
            }
            this.W = i6 / 1000.0f;
        }
        return this.W * 1000.0f;
    }

    public float getVelocity() {
        return this.N;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void m(float f2) {
        int i6;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar == null) {
            return;
        }
        float f10 = this.f1594b0;
        float f11 = this.f1593a0;
        if (f10 != f11 && this.e0) {
            this.f1594b0 = f11;
        }
        float f12 = this.f1594b0;
        if (f12 == f2) {
            return;
        }
        this.f1600j0 = false;
        this.f1595d0 = f2;
        a.b bVar = aVar.f1656c;
        if (bVar != null) {
            i6 = bVar.f1678h;
        } else {
            i6 = aVar.f1662j;
        }
        this.W = i6 / 1000.0f;
        setProgress(f2);
        this.L = null;
        this.M = this.K.d();
        this.e0 = false;
        this.V = getNanoTime();
        this.f1596f0 = true;
        this.f1593a0 = f12;
        this.f1594b0 = f12;
        invalidate();
    }

    public final void n(boolean z10) {
        float f2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            n nVar = this.U.get(getChildAt(i6));
            if (nVar != null && "button".equals(a0.a.d(nVar.f98b)) && nVar.A != null) {
                int i10 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i10 < kVarArr.length) {
                        k kVar = kVarArr[i10];
                        if (z10) {
                            f2 = -100.0f;
                        } else {
                            f2 = 100.0f;
                        }
                        kVar.g(nVar.f98b, f2);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z10) {
        float f2;
        boolean z11;
        float f10;
        char c10;
        i iVar;
        int childCount;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i6;
        boolean z12;
        int i10;
        if (this.c0 == -1) {
            this.c0 = getNanoTime();
        }
        float f11 = this.f1594b0;
        if (f11 > 0.0f && f11 < 1.0f) {
            this.P = -1;
        }
        boolean z13 = false;
        boolean z14 = true;
        if (this.f1611u0 || (this.f1596f0 && (z10 || this.f1595d0 != f11))) {
            float signum = Math.signum(this.f1595d0 - f11);
            long nanoTime = getNanoTime();
            p pVar = this.L;
            if (!(pVar instanceof p)) {
                f2 = ((((float) (nanoTime - this.c0)) * signum) * 1.0E-9f) / this.W;
            } else {
                f2 = 0.0f;
            }
            float f12 = this.f1594b0 + f2;
            if (this.e0) {
                f12 = this.f1595d0;
            }
            int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i11 > 0 && f12 >= this.f1595d0) || (signum <= 0.0f && f12 <= this.f1595d0)) {
                f12 = this.f1595d0;
                this.f1596f0 = false;
                z11 = true;
            } else {
                z11 = false;
            }
            this.f1594b0 = f12;
            this.f1593a0 = f12;
            this.c0 = nanoTime;
            if (pVar != null && !z11) {
                if (this.f1600j0) {
                    f10 = pVar.getInterpolation(((float) (nanoTime - this.V)) * 1.0E-9f);
                    p pVar2 = this.L;
                    z.a aVar = this.f1601k0;
                    if (pVar2 == aVar) {
                        if (aVar.f39101c.a()) {
                            c10 = 2;
                        } else {
                            c10 = 1;
                        }
                    } else {
                        c10 = 0;
                    }
                    this.f1594b0 = f10;
                    this.c0 = nanoTime;
                    p pVar3 = this.L;
                    if (pVar3 instanceof p) {
                        float a10 = pVar3.a();
                        this.N = a10;
                        if (Math.abs(a10) * this.W <= 1.0E-5f && c10 == 2) {
                            this.f1596f0 = false;
                        }
                        if (a10 > 0.0f && f10 >= 1.0f) {
                            this.f1594b0 = 1.0f;
                            this.f1596f0 = false;
                            f10 = 1.0f;
                        }
                        if (a10 < 0.0f && f10 <= 0.0f) {
                            this.f1594b0 = 0.0f;
                            this.f1596f0 = false;
                            f10 = 0.0f;
                        }
                    }
                    if (Math.abs(this.N) > 1.0E-5f) {
                        setState(i.MOVING);
                    }
                    iVar = i.FINISHED;
                    if (c10 != 1) {
                        if ((i11 > 0 && f10 >= this.f1595d0) || (signum <= 0.0f && f10 <= this.f1595d0)) {
                            f10 = this.f1595d0;
                            this.f1596f0 = false;
                        }
                        if (f10 >= 1.0f || f10 <= 0.0f) {
                            this.f1596f0 = false;
                            setState(iVar);
                        }
                    }
                    childCount = getChildCount();
                    this.f1611u0 = false;
                    long nanoTime2 = getNanoTime();
                    this.K0 = f10;
                    interpolator = this.M;
                    if (interpolator != null) {
                        interpolation = f10;
                    } else {
                        interpolation = interpolator.getInterpolation(f10);
                    }
                    interpolator2 = this.M;
                    if (interpolator2 != null) {
                        float interpolation2 = interpolator2.getInterpolation((signum / this.W) + f10);
                        this.N = interpolation2;
                        this.N = interpolation2 - this.M.getInterpolation(f10);
                    }
                    for (i6 = 0; i6 < childCount; i6++) {
                        View childAt = getChildAt(i6);
                        n nVar = this.U.get(childAt);
                        if (nVar != null) {
                            this.f1611u0 = nVar.c(interpolation, nanoTime2, childAt, this.L0) | this.f1611u0;
                        }
                    }
                    if ((i11 <= 0 && f10 >= this.f1595d0) || (signum <= 0.0f && f10 <= this.f1595d0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!this.f1611u0 && !this.f1596f0 && z12) {
                        setState(iVar);
                    }
                    if (this.D0) {
                        requestLayout();
                    }
                    this.f1611u0 = (!z12) | this.f1611u0;
                    if (f10 > 0.0f && (i10 = this.O) != -1 && this.P != i10) {
                        this.P = i10;
                        this.K.b(i10).a(this);
                        setState(iVar);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (f10 >= 1.0d) {
                        int i12 = this.P;
                        int i13 = this.Q;
                        if (i12 != i13) {
                            this.P = i13;
                            this.K.b(i13).a(this);
                            setState(iVar);
                            z13 = true;
                        }
                    }
                    if (this.f1611u0 && !this.f1596f0) {
                        if ((i11 > 0 && f10 == 1.0f) || (signum < 0.0f && f10 == 0.0f)) {
                            setState(iVar);
                        }
                    } else {
                        invalidate();
                    }
                    if (!this.f1611u0 && !this.f1596f0 && ((i11 > 0 && f10 == 1.0f) || (signum < 0.0f && f10 == 0.0f))) {
                        u();
                    }
                } else {
                    float interpolation3 = pVar.getInterpolation(f12);
                    p pVar4 = this.L;
                    if (pVar4 instanceof p) {
                        this.N = pVar4.a();
                    } else {
                        this.N = ((pVar4.getInterpolation(f12 + f2) - interpolation3) * signum) / f2;
                    }
                    f12 = interpolation3;
                }
            } else {
                this.N = f2;
            }
            f10 = f12;
            c10 = 0;
            if (Math.abs(this.N) > 1.0E-5f) {
            }
            iVar = i.FINISHED;
            if (c10 != 1) {
            }
            childCount = getChildCount();
            this.f1611u0 = false;
            long nanoTime22 = getNanoTime();
            this.K0 = f10;
            interpolator = this.M;
            if (interpolator != null) {
            }
            interpolator2 = this.M;
            if (interpolator2 != null) {
            }
            while (i6 < childCount) {
            }
            if (i11 <= 0) {
            }
            z12 = false;
            if (!this.f1611u0) {
                setState(iVar);
            }
            if (this.D0) {
            }
            this.f1611u0 = (!z12) | this.f1611u0;
            if (f10 > 0.0f) {
            }
            z13 = false;
            if (f10 >= 1.0d) {
            }
            if (this.f1611u0) {
            }
            invalidate();
            if (!this.f1611u0) {
                u();
            }
        }
        float f13 = this.f1594b0;
        if (f13 >= 1.0f) {
            int i14 = this.P;
            int i15 = this.Q;
            if (i14 == i15) {
                z14 = z13;
            }
            this.P = i15;
        } else {
            if (f13 <= 0.0f) {
                int i16 = this.P;
                int i17 = this.O;
                if (i16 == i17) {
                    z14 = z13;
                }
                this.P = i17;
            }
            this.T0 |= z13;
            if (z13 && !this.M0) {
                requestLayout();
            }
            this.f1593a0 = this.f1594b0;
        }
        z13 = z14;
        this.T0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.f1593a0 = this.f1594b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a.b bVar;
        int i6;
        boolean z10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && (i6 = this.P) != -1) {
            androidx.constraintlayout.widget.b b10 = aVar.b(i6);
            androidx.constraintlayout.motion.widget.a aVar2 = this.K;
            int i10 = 0;
            while (true) {
                SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar2.f1659g;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                int keyAt = sparseArray.keyAt(i10);
                SparseIntArray sparseIntArray = aVar2.f1661i;
                int i11 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i11 > 0) {
                    if (i11 != keyAt) {
                        int i12 = size - 1;
                        if (size >= 0) {
                            i11 = sparseIntArray.get(i11);
                            size = i12;
                        }
                    }
                    z10 = true;
                    break;
                }
                z10 = false;
                if (z10) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break;
                } else {
                    aVar2.l(keyAt, this);
                    i10++;
                }
            }
            if (b10 != null) {
                b10.b(this);
            }
            this.O = this.P;
        }
        u();
        g gVar = this.N0;
        if (gVar != null) {
            if (this.Q0) {
                post(new b());
                return;
            } else {
                gVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.K;
        if (aVar3 != null && (bVar = aVar3.f1656c) != null && bVar.f1684n == 4) {
            A();
            setState(i.SETUP);
            setState(i.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVar;
        int i6;
        RectF b10;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.widget.b b11;
        boolean z10;
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && this.T) {
            androidx.constraintlayout.motion.widget.d dVar = aVar.f1669q;
            if (dVar != null && (currentState = (motionLayout = dVar.f1746a).getCurrentState()) != -1) {
                HashSet<View> hashSet = dVar.f1748c;
                ArrayList<androidx.constraintlayout.motion.widget.c> arrayList = dVar.f1747b;
                if (hashSet == null) {
                    dVar.f1748c = new HashSet<>();
                    Iterator<androidx.constraintlayout.motion.widget.c> it = arrayList.iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.motion.widget.c next = it.next();
                        int childCount = motionLayout.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = motionLayout.getChildAt(i10);
                            if (next.c(childAt)) {
                                childAt.getId();
                                dVar.f1748c.add(childAt);
                            }
                        }
                    }
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<c.a> arrayList2 = dVar.f1750e;
                int i11 = 2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<c.a> it2 = dVar.f1750e.iterator();
                    while (it2.hasNext()) {
                        c.a next2 = it2.next();
                        if (action != 1) {
                            if (action != 2) {
                                next2.getClass();
                            } else {
                                View view = next2.f1736c.f98b;
                                Rect rect2 = next2.f1744l;
                                view.getHitRect(rect2);
                                if (!rect2.contains((int) x10, (int) y10) && !next2.f1740h) {
                                    next2.b();
                                }
                            }
                        } else if (!next2.f1740h) {
                            next2.b();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.K;
                    if (aVar2 == null) {
                        b11 = null;
                    } else {
                        b11 = aVar2.b(currentState);
                    }
                    Iterator<androidx.constraintlayout.motion.widget.c> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.motion.widget.c next3 = it3.next();
                        int i12 = next3.f1716b;
                        if (i12 != 1 ? !(i12 != i11 ? i12 != 3 || action != 0 : action != 1) : action == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            Iterator<View> it4 = dVar.f1748c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y10)) {
                                        cVar = next3;
                                        next3.a(dVar, dVar.f1746a, currentState, b11, next4);
                                    } else {
                                        cVar = next3;
                                    }
                                    next3 = cVar;
                                    i11 = 2;
                                }
                            }
                        }
                    }
                }
            }
            a.b bVar2 = this.K.f1656c;
            if (bVar2 != null && (!bVar2.f1685o) && (bVar = bVar2.f1682l) != null) {
                if ((motionEvent.getAction() != 0 || (b10 = bVar.b(this, new RectF())) == null || b10.contains(motionEvent.getX(), motionEvent.getY())) && (i6 = bVar.f1695e) != -1) {
                    View view2 = this.V0;
                    if (view2 == null || view2.getId() != i6) {
                        this.V0 = findViewById(i6);
                    }
                    View view3 = this.V0;
                    if (view3 != null) {
                        RectF rectF = this.U0;
                        rectF.set(view3.getLeft(), this.V0.getTop(), this.V0.getRight(), this.V0.getBottom());
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !t(this.V0.getLeft(), this.V0.getTop(), motionEvent, this.V0)) {
                            return onTouchEvent(motionEvent);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        this.M0 = true;
        try {
            if (this.K == null) {
                super.onLayout(z10, i6, i10, i11, i12);
                return;
            }
            int i13 = i11 - i6;
            int i14 = i12 - i10;
            if (this.f1604n0 != i13 || this.f1605o0 != i14) {
                w();
                o(true);
            }
            this.f1604n0 = i13;
            this.f1605o0 = i14;
        } finally {
            this.M0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r10 != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        p pVar;
        float f2;
        float f10;
        int i14;
        int childCount;
        Interpolator interpolator;
        boolean z12;
        if (this.K == null) {
            super.onMeasure(i6, i10);
            return;
        }
        boolean z13 = true;
        if (this.R == i6 && this.S == i10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.T0) {
            this.T0 = false;
            u();
            v();
            z10 = true;
        }
        if (this.B) {
            z10 = true;
        }
        this.R = i6;
        this.S = i10;
        int g5 = this.K.g();
        a.b bVar = this.K.f1656c;
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = bVar.f1674c;
        }
        e eVar = this.S0;
        if (!z10) {
            if (g5 == eVar.f1640e && i11 == eVar.f) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        if (this.O != -1) {
            super.onMeasure(i6, i10);
            eVar.e(this.K.b(g5), this.K.b(i11));
            eVar.f();
            eVar.f1640e = g5;
            eVar.f = i11;
            z11 = false;
            if (!this.D0 || z11) {
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingRight = getPaddingRight() + getPaddingLeft();
                x.f fVar = this.f1753w;
                int u10 = fVar.u() + paddingRight;
                int o10 = fVar.o() + paddingBottom;
                i12 = this.I0;
                if (i12 != Integer.MIN_VALUE || i12 == 0) {
                    int i15 = this.E0;
                    u10 = (int) ((this.K0 * (this.G0 - i15)) + i15);
                    requestLayout();
                }
                i13 = this.J0;
                if (i13 != Integer.MIN_VALUE || i13 == 0) {
                    int i16 = this.F0;
                    o10 = (int) ((this.K0 * (this.H0 - i16)) + i16);
                    requestLayout();
                }
                setMeasuredDimension(u10, o10);
            }
            float signum = Math.signum(this.f1595d0 - this.f1594b0);
            long nanoTime = getNanoTime();
            pVar = this.L;
            if (pVar instanceof z.a) {
                f2 = ((((float) (nanoTime - this.c0)) * signum) * 1.0E-9f) / this.W;
            } else {
                f2 = 0.0f;
            }
            f10 = this.f1594b0 + f2;
            if (this.e0) {
                f10 = this.f1595d0;
            }
            i14 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i14 <= 0 && f10 >= this.f1595d0) || (signum <= 0.0f && f10 <= this.f1595d0)) {
                f10 = this.f1595d0;
            } else {
                z13 = false;
            }
            if (pVar != null && !z13) {
                if (!this.f1600j0) {
                    f10 = pVar.getInterpolation(((float) (nanoTime - this.V)) * 1.0E-9f);
                } else {
                    f10 = pVar.getInterpolation(f10);
                }
            }
            if ((i14 > 0 && f10 >= this.f1595d0) || (signum <= 0.0f && f10 <= this.f1595d0)) {
                f10 = this.f1595d0;
            }
            this.K0 = f10;
            childCount = getChildCount();
            long nanoTime2 = getNanoTime();
            interpolator = this.M;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                n nVar = this.U.get(childAt);
                if (nVar != null) {
                    nVar.c(f10, nanoTime2, childAt, this.L0);
                }
            }
            if (this.D0) {
                requestLayout();
                return;
            }
            return;
        }
        if (z10) {
            super.onMeasure(i6, i10);
        }
        z11 = true;
        if (!this.D0) {
        }
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        x.f fVar2 = this.f1753w;
        int u102 = fVar2.u() + paddingRight2;
        int o102 = fVar2.o() + paddingBottom2;
        i12 = this.I0;
        if (i12 != Integer.MIN_VALUE) {
        }
        int i152 = this.E0;
        u102 = (int) ((this.K0 * (this.G0 - i152)) + i152);
        requestLayout();
        i13 = this.J0;
        if (i13 != Integer.MIN_VALUE) {
        }
        int i162 = this.F0;
        o102 = (int) ((this.K0 * (this.H0 - i162)) + i162);
        requestLayout();
        setMeasuredDimension(u102, o102);
        float signum2 = Math.signum(this.f1595d0 - this.f1594b0);
        long nanoTime3 = getNanoTime();
        pVar = this.L;
        if (pVar instanceof z.a) {
        }
        f10 = this.f1594b0 + f2;
        if (this.e0) {
        }
        i14 = (signum2 > 0.0f ? 1 : (signum2 == 0.0f ? 0 : -1));
        if (i14 <= 0) {
        }
        z13 = false;
        if (pVar != null) {
            if (!this.f1600j0) {
            }
        }
        if (i14 > 0) {
            f10 = this.f1595d0;
            this.K0 = f10;
            childCount = getChildCount();
            long nanoTime22 = getNanoTime();
            interpolator = this.M;
            if (interpolator != null) {
            }
            while (i17 < childCount) {
            }
            if (this.D0) {
            }
        }
        f10 = this.f1595d0;
        this.K0 = f10;
        childCount = getChildCount();
        long nanoTime222 = getNanoTime();
        interpolator = this.M;
        if (interpolator != null) {
        }
        while (i17 < childCount) {
        }
        if (this.D0) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f10) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // t0.q
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr, int i11) {
        a.b bVar;
        boolean z10;
        boolean z11;
        ?? r12;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f2;
        float f10;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i12;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && (bVar = aVar.f1656c) != null && (!bVar.f1685o)) {
            int i13 = -1;
            if (z10 && (bVar5 = bVar.f1682l) != null && (i12 = bVar5.f1695e) != -1 && view.getId() != i12) {
                return;
            }
            a.b bVar6 = aVar.f1656c;
            if (bVar6 != null && (bVar4 = bVar6.f1682l) != null) {
                z11 = bVar4.f1709u;
            } else {
                z11 = false;
            }
            if (z11) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.f1682l;
                if (bVar7 != null && (bVar7.f1711w & 4) != 0) {
                    i13 = i10;
                }
                float f11 = this.f1593a0;
                if ((f11 == 1.0f || f11 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.f1682l;
            if (bVar8 != null && (bVar8.f1711w & 1) != 0) {
                float f12 = i6;
                float f13 = i10;
                a.b bVar9 = aVar.f1656c;
                if (bVar9 != null && (bVar3 = bVar9.f1682l) != null) {
                    bVar3.r.r(bVar3.f1694d, bVar3.r.getProgress(), bVar3.f1697h, bVar3.f1696g, bVar3.f1703n);
                    float f14 = bVar3.f1700k;
                    float[] fArr = bVar3.f1703n;
                    if (f14 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f10 = (f12 * f14) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f10 = (f13 * bVar3.f1701l) / fArr[1];
                    }
                } else {
                    f10 = 0.0f;
                }
                float f15 = this.f1594b0;
                if ((f15 <= 0.0f && f10 < 0.0f) || (f15 >= 1.0f && f10 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f16 = this.f1593a0;
            long nanoTime = getNanoTime();
            float f17 = i6;
            this.f1607q0 = f17;
            float f18 = i10;
            this.f1608r0 = f18;
            this.f1610t0 = (float) ((nanoTime - this.f1609s0) * 1.0E-9d);
            this.f1609s0 = nanoTime;
            a.b bVar10 = aVar.f1656c;
            if (bVar10 != null && (bVar2 = bVar10.f1682l) != null) {
                MotionLayout motionLayout = bVar2.r;
                float progress = motionLayout.getProgress();
                if (!bVar2.f1702m) {
                    bVar2.f1702m = true;
                    motionLayout.setProgress(progress);
                }
                bVar2.r.r(bVar2.f1694d, progress, bVar2.f1697h, bVar2.f1696g, bVar2.f1703n);
                float f19 = bVar2.f1700k;
                float[] fArr2 = bVar2.f1703n;
                if (Math.abs((bVar2.f1701l * fArr2[1]) + (f19 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f20 = bVar2.f1700k;
                if (f20 != 0.0f) {
                    f2 = (f17 * f20) / fArr2[0];
                } else {
                    f2 = (f18 * bVar2.f1701l) / fArr2[1];
                }
                float max = Math.max(Math.min(progress + f2, 1.0f), 0.0f);
                if (max != motionLayout.getProgress()) {
                    motionLayout.setProgress(max);
                }
            }
            if (f16 != this.f1593a0) {
                iArr[0] = i6;
                r12 = 1;
                iArr[1] = i10;
            } else {
                r12 = 1;
            }
            o(false);
            if (iArr[0] != 0 || iArr[r12] != 0) {
                this.f1606p0 = r12;
            }
        }
    }

    @Override // t0.q
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13) {
    }

    @Override // t0.q
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i10) {
        this.f1609s0 = getNanoTime();
        this.f1610t0 = 0.0f;
        this.f1607q0 = 0.0f;
        this.f1608r0 = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            boolean f2 = f();
            aVar.f1668p = f2;
            a.b bVar2 = aVar.f1656c;
            if (bVar2 != null && (bVar = bVar2.f1682l) != null) {
                bVar.c(f2);
            }
        }
    }

    @Override // t0.q
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i10) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null && (bVar = aVar.f1656c) != null && (bVar2 = bVar.f1682l) != null && (bVar2.f1711w & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // t0.q
    public final void onStopNestedScroll(View view, int i6) {
        androidx.constraintlayout.motion.widget.b bVar;
        float f2;
        boolean z10;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            float f10 = this.f1610t0;
            float f11 = 0.0f;
            if (f10 != 0.0f) {
                float f12 = this.f1607q0 / f10;
                float f13 = this.f1608r0 / f10;
                a.b bVar2 = aVar.f1656c;
                if (bVar2 != null && (bVar = bVar2.f1682l) != null) {
                    boolean z11 = false;
                    bVar.f1702m = false;
                    MotionLayout motionLayout = bVar.r;
                    float progress = motionLayout.getProgress();
                    bVar.r.r(bVar.f1694d, progress, bVar.f1697h, bVar.f1696g, bVar.f1703n);
                    float f14 = bVar.f1700k;
                    float[] fArr = bVar.f1703n;
                    float f15 = fArr[0];
                    float f16 = bVar.f1701l;
                    float f17 = fArr[1];
                    if (f14 != 0.0f) {
                        f2 = (f12 * f14) / f15;
                    } else {
                        f2 = (f13 * f16) / f17;
                    }
                    if (!Float.isNaN(f2)) {
                        progress += f2 / 3.0f;
                    }
                    if (progress != 0.0f) {
                        if (progress != 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = bVar.f1693c;
                        if (i10 != 3) {
                            z11 = true;
                        }
                        if (z11 & z10) {
                            if (progress >= 0.5d) {
                                f11 = 1.0f;
                            }
                            motionLayout.z(f11, f2, i10);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (r8.contains(r14.getX(), r14.getY()) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0810 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.a aVar;
        MotionLayout motionLayout;
        f fVar;
        f fVar2;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f2;
        float f10;
        char c10;
        char c11;
        float f11;
        float f12;
        int i6;
        float f13;
        char c12;
        char c13;
        float f14;
        boolean z10;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float right;
        float f20;
        int top;
        int bottom;
        float rawY;
        int i10;
        float degrees;
        float f21;
        int i11;
        float f22;
        View findViewById;
        double atan2;
        char c14;
        boolean z11;
        float f23;
        float f24;
        a.b bVar3;
        boolean z12;
        MotionEvent motionEvent2;
        RectF rectF;
        a.b bVar4;
        boolean z13;
        int i12;
        RectF rectF2;
        Iterator it;
        a.b bVar5;
        float f25;
        float f26;
        MotionEvent motionEvent3;
        RectF rectF3;
        androidx.constraintlayout.motion.widget.b bVar6;
        float f27;
        float f28;
        float f29;
        androidx.constraintlayout.motion.widget.a aVar2 = this.K;
        if (aVar2 != null && this.T && aVar2.n()) {
            androidx.constraintlayout.motion.widget.a aVar3 = this.K;
            if (aVar3.f1656c != null && !(!bVar.f1685o)) {
                return super.onTouchEvent(motionEvent);
            }
            int currentState = getCurrentState();
            RectF rectF4 = new RectF();
            f fVar3 = aVar3.f1667o;
            MotionLayout motionLayout2 = aVar3.f1654a;
            if (fVar3 == null) {
                motionLayout2.getClass();
                f fVar4 = f.f1642b;
                fVar4.f1643a = VelocityTracker.obtain();
                aVar3.f1667o = fVar4;
            }
            VelocityTracker velocityTracker = aVar3.f1667o.f1643a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (currentState != -1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2 && !aVar3.f1665m) {
                        float rawY2 = motionEvent.getRawY() - aVar3.f1670s;
                        float rawX = motionEvent.getRawX() - aVar3.r;
                        if ((rawX != 0.0d || rawY2 != 0.0d) && (motionEvent2 = aVar3.f1664l) != null) {
                            if (currentState != -1) {
                                b0.f fVar5 = aVar3.f1655b;
                                if (fVar5 == null || (i12 = fVar5.a(currentState)) == -1) {
                                    i12 = currentState;
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator<a.b> it2 = aVar3.f1657d.iterator();
                                while (it2.hasNext()) {
                                    a.b next = it2.next();
                                    if (next.f1675d == i12 || next.f1674c == i12) {
                                        arrayList.add(next);
                                    }
                                }
                                RectF rectF5 = new RectF();
                                Iterator it3 = arrayList.iterator();
                                float f30 = 0.0f;
                                bVar4 = null;
                                while (it3.hasNext()) {
                                    a.b bVar7 = (a.b) it3.next();
                                    if (!bVar7.f1685o && (bVar6 = bVar7.f1682l) != null) {
                                        bVar6.c(aVar3.f1668p);
                                        RectF b10 = bVar7.f1682l.b(motionLayout2, rectF5);
                                        if (b10 != null) {
                                            it = it3;
                                        } else {
                                            it = it3;
                                        }
                                        RectF a10 = bVar7.f1682l.a(motionLayout2, rectF5);
                                        if (a10 == null || a10.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                            androidx.constraintlayout.motion.widget.b bVar8 = bVar7.f1682l;
                                            float f31 = (bVar8.f1701l * rawY2) + (bVar8.f1700k * rawX);
                                            if (bVar8.f1699j) {
                                                float x10 = motionEvent2.getX();
                                                bVar7.f1682l.getClass();
                                                float y10 = motionEvent2.getY();
                                                rectF2 = rectF5;
                                                bVar7.f1682l.getClass();
                                                bVar5 = bVar4;
                                                f25 = rawY2;
                                                f26 = rawX;
                                                motionEvent3 = motionEvent2;
                                                double atan22 = Math.atan2(rawY2 + f29, rawX + f28);
                                                double d10 = x10 - 0.5f;
                                                rectF3 = rectF4;
                                                f31 = ((float) (atan22 - Math.atan2(d10, y10 - 0.5f))) * 10.0f;
                                            } else {
                                                rectF2 = rectF5;
                                                rectF3 = rectF4;
                                                bVar5 = bVar4;
                                                f25 = rawY2;
                                                f26 = rawX;
                                                motionEvent3 = motionEvent2;
                                            }
                                            if (bVar7.f1674c == currentState) {
                                                f27 = -1.0f;
                                            } else {
                                                f27 = 1.1f;
                                            }
                                            float f32 = f27 * f31;
                                            if (f32 > f30) {
                                                f30 = f32;
                                                bVar4 = bVar7;
                                                rectF4 = rectF3;
                                                rawX = f26;
                                                it3 = it;
                                                rectF5 = rectF2;
                                                rawY2 = f25;
                                                motionEvent2 = motionEvent3;
                                            }
                                        }
                                        rectF2 = rectF5;
                                        rectF3 = rectF4;
                                        bVar5 = bVar4;
                                        f25 = rawY2;
                                        f26 = rawX;
                                        motionEvent3 = motionEvent2;
                                    } else {
                                        rectF2 = rectF5;
                                        it = it3;
                                        bVar5 = bVar4;
                                        f25 = rawY2;
                                        f26 = rawX;
                                        motionEvent3 = motionEvent2;
                                        rectF3 = rectF4;
                                    }
                                    bVar4 = bVar5;
                                    rectF4 = rectF3;
                                    rawX = f26;
                                    it3 = it;
                                    rectF5 = rectF2;
                                    rawY2 = f25;
                                    motionEvent2 = motionEvent3;
                                }
                                rectF = rectF4;
                            } else {
                                rectF = rectF4;
                                bVar4 = aVar3.f1656c;
                            }
                            if (bVar4 != null) {
                                setTransition(bVar4);
                                RectF b11 = aVar3.f1656c.f1682l.b(motionLayout2, rectF);
                                if (b11 != null && !b11.contains(aVar3.f1664l.getX(), aVar3.f1664l.getY())) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                aVar3.f1666n = z13;
                                androidx.constraintlayout.motion.widget.b bVar9 = aVar3.f1656c.f1682l;
                                float f33 = aVar3.r;
                                float f34 = aVar3.f1670s;
                                bVar9.f1705p = f33;
                                bVar9.f1706q = f34;
                                bVar9.f1702m = false;
                            }
                        }
                    }
                } else {
                    aVar3.r = motionEvent.getRawX();
                    aVar3.f1670s = motionEvent.getRawY();
                    aVar3.f1664l = motionEvent;
                    aVar3.f1665m = false;
                    androidx.constraintlayout.motion.widget.b bVar10 = aVar3.f1656c.f1682l;
                    if (bVar10 != null) {
                        RectF a11 = bVar10.a(motionLayout2, rectF4);
                        if (a11 != null && !a11.contains(aVar3.f1664l.getX(), aVar3.f1664l.getY())) {
                            aVar3.f1664l = null;
                            aVar3.f1665m = true;
                        } else {
                            RectF b12 = aVar3.f1656c.f1682l.b(motionLayout2, rectF4);
                            if (b12 != null && !b12.contains(aVar3.f1664l.getX(), aVar3.f1664l.getY())) {
                                aVar3.f1666n = true;
                            } else {
                                aVar3.f1666n = false;
                            }
                            androidx.constraintlayout.motion.widget.b bVar11 = aVar3.f1656c.f1682l;
                            float f35 = aVar3.r;
                            float f36 = aVar3.f1670s;
                            bVar11.f1705p = f35;
                            bVar11.f1706q = f36;
                        }
                    }
                }
                motionLayout = this;
                bVar3 = motionLayout.K.f1656c;
                if ((bVar3.r & 4) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return bVar3.f1682l.f1702m;
                }
                return true;
            }
            if (!aVar3.f1665m) {
                a.b bVar12 = aVar3.f1656c;
                if (bVar12 != null && (bVar2 = bVar12.f1682l) != null && !aVar3.f1666n) {
                    f fVar6 = aVar3.f1667o;
                    boolean z14 = bVar2.f1699j;
                    i iVar = i.FINISHED;
                    float[] fArr = bVar2.f1703n;
                    MotionLayout motionLayout3 = bVar2.r;
                    if (z14) {
                        VelocityTracker velocityTracker2 = fVar6.f1643a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        int action2 = motionEvent.getAction();
                        if (action2 != 0) {
                            int[] iArr = bVar2.f1704o;
                            if (action2 != 1) {
                                if (action2 == 2) {
                                    motionEvent.getRawY();
                                    motionEvent.getRawX();
                                    float width = motionLayout3.getWidth() / 2.0f;
                                    float height = motionLayout3.getHeight() / 2.0f;
                                    int i13 = bVar2.f1698i;
                                    if (i13 != -1) {
                                        View findViewById2 = motionLayout3.findViewById(i13);
                                        motionLayout3.getLocationOnScreen(iArr);
                                        height = ((findViewById2.getBottom() + findViewById2.getTop()) / 2.0f) + iArr[1];
                                        width = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                    } else {
                                        int i14 = bVar2.f1694d;
                                        if (i14 != -1) {
                                            if (motionLayout3.findViewById(motionLayout3.U.get(motionLayout3.findViewById(i14)).f.E) == null) {
                                                Log.e("TouchResponse", "could not find view to animate to");
                                            } else {
                                                motionLayout3.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                                height = iArr[1] + ((findViewById.getBottom() + findViewById.getTop()) / 2.0f);
                                            }
                                        }
                                    }
                                    float rawX2 = motionEvent.getRawX() - width;
                                    float rawY3 = motionEvent.getRawY() - height;
                                    float atan23 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(bVar2.f1706q - height, bVar2.f1705p - width)) * 180.0d) / 3.141592653589793d);
                                    if (atan23 > 330.0f) {
                                        atan23 -= 360.0f;
                                    } else if (atan23 < -330.0f) {
                                        atan23 += 360.0f;
                                    }
                                    if (Math.abs(atan23) > 0.01d || bVar2.f1702m) {
                                        float progress = motionLayout3.getProgress();
                                        if (!bVar2.f1702m) {
                                            bVar2.f1702m = true;
                                            motionLayout3.setProgress(progress);
                                        }
                                        int i15 = bVar2.f1694d;
                                        if (i15 != -1) {
                                            aVar = aVar3;
                                            bVar2.r.r(i15, progress, bVar2.f1697h, bVar2.f1696g, bVar2.f1703n);
                                            c14 = 1;
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            aVar = aVar3;
                                            c14 = 1;
                                            fArr[1] = 360.0f;
                                        }
                                        float max = Math.max(Math.min(((atan23 * bVar2.f1710v) / fArr[c14]) + progress, 1.0f), 0.0f);
                                        float progress2 = motionLayout3.getProgress();
                                        if (max != progress2) {
                                            int i16 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                                            if (i16 == 0 || progress2 == 1.0f) {
                                                if (i16 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                motionLayout3.n(z11);
                                            }
                                            motionLayout3.setProgress(max);
                                            VelocityTracker velocityTracker3 = fVar6.f1643a;
                                            if (velocityTracker3 != null) {
                                                velocityTracker3.computeCurrentVelocity(1000);
                                            }
                                            VelocityTracker velocityTracker4 = fVar6.f1643a;
                                            if (velocityTracker4 != null) {
                                                f23 = velocityTracker4.getXVelocity();
                                            } else {
                                                f23 = 0.0f;
                                            }
                                            VelocityTracker velocityTracker5 = fVar6.f1643a;
                                            if (velocityTracker5 != null) {
                                                f24 = velocityTracker5.getYVelocity();
                                            } else {
                                                f24 = 0.0f;
                                            }
                                            double d11 = f24;
                                            double d12 = f23;
                                            motionLayout3.N = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d11, d12) - atan2) * Math.hypot(d11, d12)) / Math.hypot(rawX2, rawY3)));
                                        } else {
                                            motionLayout3.N = 0.0f;
                                        }
                                        bVar2.f1705p = motionEvent.getRawX();
                                        bVar2.f1706q = motionEvent.getRawY();
                                    }
                                }
                                aVar = aVar3;
                            } else {
                                aVar = aVar3;
                                bVar2.f1702m = false;
                                VelocityTracker velocityTracker6 = fVar6.f1643a;
                                if (velocityTracker6 != null) {
                                    velocityTracker6.computeCurrentVelocity(16);
                                }
                                VelocityTracker velocityTracker7 = fVar6.f1643a;
                                if (velocityTracker7 != null) {
                                    f18 = velocityTracker7.getXVelocity();
                                } else {
                                    f18 = 0.0f;
                                }
                                VelocityTracker velocityTracker8 = fVar6.f1643a;
                                if (velocityTracker8 != null) {
                                    f19 = velocityTracker8.getYVelocity();
                                } else {
                                    f19 = 0.0f;
                                }
                                float progress3 = motionLayout3.getProgress();
                                float width2 = motionLayout3.getWidth() / 2.0f;
                                float height2 = motionLayout3.getHeight() / 2.0f;
                                int i17 = bVar2.f1698i;
                                if (i17 != -1) {
                                    View findViewById3 = motionLayout3.findViewById(i17);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f) + iArr[0];
                                    f20 = iArr[1];
                                    top = findViewById3.getTop();
                                    bottom = findViewById3.getBottom();
                                } else {
                                    int i18 = bVar2.f1694d;
                                    if (i18 != -1) {
                                        View findViewById4 = motionLayout3.findViewById(motionLayout3.U.get(motionLayout3.findViewById(i18)).f.E);
                                        motionLayout3.getLocationOnScreen(iArr);
                                        right = ((findViewById4.getRight() + findViewById4.getLeft()) / 2.0f) + iArr[0];
                                        f20 = iArr[1];
                                        top = findViewById4.getTop();
                                        bottom = findViewById4.getBottom();
                                    }
                                    float rawX3 = motionEvent.getRawX() - width2;
                                    double degrees2 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX3));
                                    i10 = bVar2.f1694d;
                                    if (i10 == -1) {
                                        bVar2.r.r(i10, progress3, bVar2.f1697h, bVar2.f1696g, bVar2.f1703n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(f19 + rawY, f18 + rawX3)) - degrees2)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f21 = (((degrees * 3.0f) * bVar2.f1710v) / fArr[1]) + progress3;
                                    } else {
                                        f21 = progress3;
                                    }
                                    if (f21 == 0.0f && f21 != 1.0f && (i11 = bVar2.f1693c) != 3) {
                                        float f37 = (degrees * bVar2.f1710v) / fArr[1];
                                        if (f21 < 0.5d) {
                                            f22 = 0.0f;
                                        } else {
                                            f22 = 1.0f;
                                        }
                                        if (i11 == 6) {
                                            if (progress3 + f37 < 0.0f) {
                                                f37 = Math.abs(f37);
                                            }
                                            f22 = 1.0f;
                                        }
                                        if (bVar2.f1693c == 7) {
                                            if (progress3 + f37 > 1.0f) {
                                                f37 = -Math.abs(f37);
                                            }
                                            f22 = 0.0f;
                                        }
                                        motionLayout3.z(f22, f37 * 3.0f, bVar2.f1693c);
                                        if (0.0f >= progress3 || 1.0f <= progress3) {
                                            motionLayout3.setState(iVar);
                                        }
                                    } else if (0.0f < f21 || 1.0f <= f21) {
                                        motionLayout3.setState(iVar);
                                    }
                                }
                                height2 = f20 + ((bottom + top) / 2.0f);
                                width2 = right;
                                float rawX32 = motionEvent.getRawX() - width2;
                                double degrees22 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX32));
                                i10 = bVar2.f1694d;
                                if (i10 == -1) {
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(f19 + rawY, f18 + rawX32)) - degrees22)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                }
                                if (f21 == 0.0f) {
                                }
                                if (0.0f < f21) {
                                }
                                motionLayout3.setState(iVar);
                            }
                        } else {
                            aVar = aVar3;
                            bVar2.f1705p = motionEvent.getRawX();
                            bVar2.f1706q = motionEvent.getRawY();
                            bVar2.f1702m = false;
                        }
                    } else {
                        aVar = aVar3;
                        VelocityTracker velocityTracker9 = fVar6.f1643a;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        int action3 = motionEvent.getAction();
                        if (action3 != 0) {
                            if (action3 != 1) {
                                if (action3 == 2) {
                                    float rawY4 = motionEvent.getRawY() - bVar2.f1706q;
                                    float rawX4 = motionEvent.getRawX() - bVar2.f1705p;
                                    if (Math.abs((bVar2.f1701l * rawY4) + (bVar2.f1700k * rawX4)) > bVar2.f1712x || bVar2.f1702m) {
                                        float progress4 = motionLayout3.getProgress();
                                        if (!bVar2.f1702m) {
                                            bVar2.f1702m = true;
                                            motionLayout3.setProgress(progress4);
                                        }
                                        int i19 = bVar2.f1694d;
                                        if (i19 != -1) {
                                            bVar2.r.r(i19, progress4, bVar2.f1697h, bVar2.f1696g, bVar2.f1703n);
                                            c13 = 0;
                                            c12 = 1;
                                        } else {
                                            float min = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                            c12 = 1;
                                            fArr[1] = bVar2.f1701l * min;
                                            c13 = 0;
                                            fArr[0] = min * bVar2.f1700k;
                                        }
                                        if (Math.abs(((bVar2.f1701l * fArr[c12]) + (bVar2.f1700k * fArr[c13])) * bVar2.f1710v) < 0.01d) {
                                            fArr[0] = 0.01f;
                                            fArr[c12] = 0.01f;
                                        }
                                        if (bVar2.f1700k != 0.0f) {
                                            f14 = rawX4 / fArr[0];
                                        } else {
                                            f14 = rawY4 / fArr[c12];
                                        }
                                        float max2 = Math.max(Math.min(progress4 + f14, 1.0f), 0.0f);
                                        if (bVar2.f1693c == 6) {
                                            max2 = Math.max(max2, 0.01f);
                                        }
                                        if (bVar2.f1693c == 7) {
                                            max2 = Math.min(max2, 0.99f);
                                        }
                                        float progress5 = motionLayout3.getProgress();
                                        if (max2 != progress5) {
                                            int i20 = (progress5 > 0.0f ? 1 : (progress5 == 0.0f ? 0 : -1));
                                            if (i20 == 0 || progress5 == 1.0f) {
                                                if (i20 == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                motionLayout3.n(z10);
                                            }
                                            motionLayout3.setProgress(max2);
                                            VelocityTracker velocityTracker10 = fVar6.f1643a;
                                            if (velocityTracker10 != null) {
                                                velocityTracker10.computeCurrentVelocity(1000);
                                            }
                                            VelocityTracker velocityTracker11 = fVar6.f1643a;
                                            if (velocityTracker11 != null) {
                                                f15 = velocityTracker11.getXVelocity();
                                            } else {
                                                f15 = 0.0f;
                                            }
                                            VelocityTracker velocityTracker12 = fVar6.f1643a;
                                            if (velocityTracker12 != null) {
                                                f16 = velocityTracker12.getYVelocity();
                                            } else {
                                                f16 = 0.0f;
                                            }
                                            if (bVar2.f1700k != 0.0f) {
                                                f17 = f15 / fArr[0];
                                            } else {
                                                f17 = f16 / fArr[1];
                                            }
                                            motionLayout3.N = f17;
                                        } else {
                                            motionLayout3.N = 0.0f;
                                        }
                                        bVar2.f1705p = motionEvent.getRawX();
                                        bVar2.f1706q = motionEvent.getRawY();
                                    }
                                }
                            } else {
                                bVar2.f1702m = false;
                                VelocityTracker velocityTracker13 = fVar6.f1643a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker14 = fVar6.f1643a;
                                if (velocityTracker14 != null) {
                                    f2 = velocityTracker14.getXVelocity();
                                } else {
                                    f2 = 0.0f;
                                }
                                VelocityTracker velocityTracker15 = fVar6.f1643a;
                                if (velocityTracker15 != null) {
                                    f10 = velocityTracker15.getYVelocity();
                                } else {
                                    f10 = 0.0f;
                                }
                                float progress6 = motionLayout3.getProgress();
                                int i21 = bVar2.f1694d;
                                if (i21 != -1) {
                                    bVar2.r.r(i21, progress6, bVar2.f1697h, bVar2.f1696g, bVar2.f1703n);
                                    c11 = 0;
                                    c10 = 1;
                                } else {
                                    float min2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                    c10 = 1;
                                    fArr[1] = bVar2.f1701l * min2;
                                    c11 = 0;
                                    fArr[0] = min2 * bVar2.f1700k;
                                }
                                float f38 = bVar2.f1700k;
                                float f39 = fArr[c11];
                                float f40 = fArr[c10];
                                if (f38 != 0.0f) {
                                    f11 = f2 / f39;
                                } else {
                                    f11 = f10 / f40;
                                }
                                if (!Float.isNaN(f11)) {
                                    f12 = (f11 / 3.0f) + progress6;
                                } else {
                                    f12 = progress6;
                                }
                                if (f12 != 0.0f && f12 != 1.0f && (i6 = bVar2.f1693c) != 3) {
                                    if (f12 < 0.5d) {
                                        f13 = 0.0f;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    if (i6 == 6) {
                                        if (progress6 + f11 < 0.0f) {
                                            f11 = Math.abs(f11);
                                        }
                                        f13 = 1.0f;
                                    }
                                    if (bVar2.f1693c == 7) {
                                        if (progress6 + f11 > 1.0f) {
                                            f11 = -Math.abs(f11);
                                        }
                                        f13 = 0.0f;
                                    }
                                    motionLayout3.z(f13, f11, bVar2.f1693c);
                                    if (0.0f >= progress6 || 1.0f <= progress6) {
                                        motionLayout3.setState(iVar);
                                    }
                                } else if (0.0f >= f12 || 1.0f <= f12) {
                                    motionLayout3.setState(iVar);
                                }
                            }
                        } else {
                            bVar2.f1705p = motionEvent.getRawX();
                            bVar2.f1706q = motionEvent.getRawY();
                            bVar2.f1702m = false;
                            androidx.constraintlayout.motion.widget.a aVar4 = aVar;
                            aVar4.r = motionEvent.getRawX();
                            aVar4.f1670s = motionEvent.getRawY();
                            if (motionEvent.getAction() != 1 && (fVar = aVar4.f1667o) != null) {
                                VelocityTracker velocityTracker16 = fVar.f1643a;
                                if (velocityTracker16 != null) {
                                    velocityTracker16.recycle();
                                    fVar2 = null;
                                    fVar.f1643a = null;
                                } else {
                                    fVar2 = null;
                                }
                                aVar4.f1667o = fVar2;
                                motionLayout = this;
                                int i22 = motionLayout.P;
                                if (i22 != -1) {
                                    aVar4.a(i22, motionLayout);
                                }
                            } else {
                                motionLayout = this;
                            }
                            bVar3 = motionLayout.K.f1656c;
                            if ((bVar3.r & 4) == 0) {
                            }
                            if (!z12) {
                            }
                        }
                    }
                } else {
                    aVar = aVar3;
                }
                androidx.constraintlayout.motion.widget.a aVar42 = aVar;
                aVar42.r = motionEvent.getRawX();
                aVar42.f1670s = motionEvent.getRawY();
                if (motionEvent.getAction() != 1) {
                }
                motionLayout = this;
                bVar3 = motionLayout.K.f1656c;
                if ((bVar3.r & 4) == 0) {
                }
                if (!z12) {
                }
            }
            motionLayout = this;
            bVar3 = motionLayout.K.f1656c;
            if ((bVar3.r & 4) == 0) {
            }
            if (!z12) {
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof o) {
            o oVar = (o) view;
            if (this.f1614x0 == null) {
                this.f1614x0 = new CopyOnWriteArrayList<>();
            }
            this.f1614x0.add(oVar);
            if (oVar.C) {
                if (this.f1612v0 == null) {
                    this.f1612v0 = new ArrayList<>();
                }
                this.f1612v0.add(oVar);
            }
            if (oVar.D) {
                if (this.f1613w0 == null) {
                    this.f1613w0 = new ArrayList<>();
                }
                this.f1613w0.add(oVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<o> arrayList = this.f1612v0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<o> arrayList2 = this.f1613w0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.f1597g0 != null || ((copyOnWriteArrayList = this.f1614x0) != null && !copyOnWriteArrayList.isEmpty())) && this.C0 != this.f1593a0) {
            if (this.B0 != -1) {
                h hVar = this.f1597g0;
                if (hVar != null) {
                    hVar.c();
                }
                CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.f1614x0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<h> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                }
            }
            this.B0 = -1;
            this.C0 = this.f1593a0;
            h hVar2 = this.f1597g0;
            if (hVar2 != null) {
                hVar2.b();
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList3 = this.f1614x0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<h> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().b();
                }
            }
        }
    }

    public final void q() {
        int i6;
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.f1597g0 != null || ((copyOnWriteArrayList = this.f1614x0) != null && !copyOnWriteArrayList.isEmpty())) && this.B0 == -1) {
            this.B0 = this.P;
            ArrayList<Integer> arrayList = this.X0;
            if (!arrayList.isEmpty()) {
                i6 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i6 = -1;
            }
            int i10 = this.P;
            if (i6 != i10 && i10 != -1) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        v();
        Runnable runnable = this.O0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void r(int i6, float f2, float f10, float f11, float[] fArr) {
        String resourceName;
        double[] dArr;
        HashMap<View, n> hashMap = this.U;
        View c10 = c(i6);
        n nVar = hashMap.get(c10);
        if (nVar != null) {
            float[] fArr2 = nVar.f116v;
            float a10 = nVar.a(f2, fArr2);
            w.b[] bVarArr = nVar.f105j;
            q qVar = nVar.f;
            int i10 = 0;
            if (bVarArr != null) {
                double d10 = a10;
                bVarArr[0].e(d10, nVar.f112q);
                nVar.f105j[0].c(d10, nVar.f111p);
                float f12 = fArr2[0];
                while (true) {
                    dArr = nVar.f112q;
                    if (i10 >= dArr.length) {
                        break;
                    }
                    dArr[i10] = dArr[i10] * f12;
                    i10++;
                }
                w.a aVar = nVar.f106k;
                if (aVar != null) {
                    double[] dArr2 = nVar.f111p;
                    if (dArr2.length > 0) {
                        aVar.c(d10, dArr2);
                        nVar.f106k.e(d10, nVar.f112q);
                        int[] iArr = nVar.f110o;
                        double[] dArr3 = nVar.f112q;
                        double[] dArr4 = nVar.f111p;
                        qVar.getClass();
                        q.j(f10, f11, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    int[] iArr2 = nVar.f110o;
                    double[] dArr5 = nVar.f111p;
                    qVar.getClass();
                    q.j(f10, f11, fArr, iArr2, dArr, dArr5);
                }
            } else {
                q qVar2 = nVar.f102g;
                float f13 = qVar2.f125y - qVar.f125y;
                float f14 = qVar2.f126z - qVar.f126z;
                fArr[0] = (((qVar2.A - qVar.A) + f13) * f10) + ((1.0f - f10) * f13);
                fArr[1] = (((qVar2.B - qVar.B) + f14) * f11) + ((1.0f - f11) * f14);
            }
            c10.getY();
            return;
        }
        if (c10 == null) {
            resourceName = defpackage.c.p("", i6);
        } else {
            resourceName = c10.getContext().getResources().getResourceName(i6);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (!this.D0 && this.P == -1 && (aVar = this.K) != null && (bVar = aVar.f1656c) != null) {
            int i6 = bVar.f1687q;
            if (i6 == 0) {
                return;
            }
            if (i6 == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    this.U.get(getChildAt(i10)).f100d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final a.b s(int i6) {
        Iterator<a.b> it = this.K.f1657d.iterator();
        while (it.hasNext()) {
            a.b next = it.next();
            if (next.f1672a == i6) {
                return next;
            }
        }
        return null;
    }

    public void setDebugMode(int i6) {
        this.f1598h0 = i6;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.Q0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.T = z10;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.K != null) {
            setState(i.MOVING);
            Interpolator d10 = this.K.d();
            if (d10 != null) {
                setProgress(d10.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<o> arrayList = this.f1613w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f1613w0.get(i6).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<o> arrayList = this.f1612v0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f1612v0.get(i6).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i6 < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new g();
            }
            this.N0.f1644a = f2;
            return;
        }
        i iVar = i.FINISHED;
        i iVar2 = i.MOVING;
        if (i6 <= 0) {
            if (this.f1594b0 == 1.0f && this.P == this.Q) {
                setState(iVar2);
            }
            this.P = this.O;
            if (this.f1594b0 == 0.0f) {
                setState(iVar);
            }
        } else if (f2 >= 1.0f) {
            if (this.f1594b0 == 0.0f && this.P == this.O) {
                setState(iVar2);
            }
            this.P = this.Q;
            if (this.f1594b0 == 1.0f) {
                setState(iVar);
            }
        } else {
            this.P = -1;
            setState(iVar2);
        }
        if (this.K == null) {
            return;
        }
        this.e0 = true;
        this.f1595d0 = f2;
        this.f1593a0 = f2;
        this.c0 = -1L;
        this.V = -1L;
        this.L = null;
        this.f1596f0 = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.K = aVar;
        boolean f2 = f();
        aVar.f1668p = f2;
        a.b bVar2 = aVar.f1656c;
        if (bVar2 != null && (bVar = bVar2.f1682l) != null) {
            bVar.c(f2);
        }
        w();
    }

    public void setStartState(int i6) {
        if (!isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new g();
            }
            g gVar = this.N0;
            gVar.f1646c = i6;
            gVar.f1647d = i6;
            return;
        }
        this.P = i6;
    }

    public void setState(i iVar) {
        i iVar2 = i.FINISHED;
        if (iVar == iVar2 && this.P == -1) {
            return;
        }
        i iVar3 = this.R0;
        this.R0 = iVar;
        i iVar4 = i.MOVING;
        if (iVar3 == iVar4 && iVar == iVar4) {
            p();
        }
        int ordinal = iVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && iVar == iVar2) {
                q();
                return;
            }
            return;
        }
        if (iVar == iVar4) {
            p();
        }
        if (iVar == iVar2) {
            q();
        }
    }

    public void setTransition(int i6) {
        float f2;
        if (this.K != null) {
            a.b s10 = s(i6);
            this.O = s10.f1675d;
            this.Q = s10.f1674c;
            if (!isAttachedToWindow()) {
                if (this.N0 == null) {
                    this.N0 = new g();
                }
                g gVar = this.N0;
                gVar.f1646c = this.O;
                gVar.f1647d = this.Q;
                return;
            }
            int i10 = this.P;
            if (i10 == this.O) {
                f2 = 0.0f;
            } else {
                f2 = i10 == this.Q ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.a aVar = this.K;
            aVar.f1656c = s10;
            androidx.constraintlayout.motion.widget.b bVar = s10.f1682l;
            if (bVar != null) {
                bVar.c(aVar.f1668p);
            }
            this.S0.e(this.K.b(this.O), this.K.b(this.Q));
            w();
            if (this.f1594b0 != f2) {
                if (f2 == 0.0f) {
                    n(true);
                    this.K.b(this.O).b(this);
                } else if (f2 == 1.0f) {
                    n(false);
                    this.K.b(this.Q).b(this);
                }
            }
            this.f1594b0 = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v("MotionLayout", a0.a.b() + " transitionToStart ");
                m(0.0f);
                return;
            }
            setProgress(f2);
        }
    }

    public void setTransitionDuration(int i6) {
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        a.b bVar = aVar.f1656c;
        if (bVar != null) {
            bVar.f1678h = Math.max(i6, 8);
        } else {
            aVar.f1662j = i6;
        }
    }

    public void setTransitionListener(h hVar) {
        this.f1597g0 = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.N0 == null) {
            this.N0 = new g();
        }
        g gVar = this.N0;
        gVar.getClass();
        gVar.f1644a = bundle.getFloat("motion.progress");
        gVar.f1645b = bundle.getFloat("motion.velocity");
        gVar.f1646c = bundle.getInt("motion.StartState");
        gVar.f1647d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.N0.a();
        }
    }

    public final boolean t(float f2, float f10, MotionEvent motionEvent, View view) {
        boolean z10;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (t((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f10) - view.getScrollY(), motionEvent, viewGroup.getChildAt(childCount))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            RectF rectF = this.U0;
            rectF.set(f2, f10, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f10) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f11 = -f2;
                float f12 = -f10;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f11, f12);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f11, -f12);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f11, f12);
                    if (this.W0 == null) {
                        this.W0 = new Matrix();
                    }
                    matrix.invert(this.W0);
                    obtain.transform(this.W0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return a0.a.c(this.O, context) + "->" + a0.a.c(this.Q, context) + " (pos:" + this.f1594b0 + " Dpos/Dt:" + this.N;
    }

    public final void u() {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        View view;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar == null) {
            return;
        }
        if (aVar.a(this.P, this)) {
            requestLayout();
            return;
        }
        int i6 = this.P;
        if (i6 != -1) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.K;
            ArrayList<a.b> arrayList = aVar2.f1657d;
            Iterator<a.b> it = arrayList.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                if (next.f1683m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0024a> it2 = next.f1683m.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this);
                    }
                }
            }
            ArrayList<a.b> arrayList2 = aVar2.f;
            Iterator<a.b> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                a.b next2 = it3.next();
                if (next2.f1683m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0024a> it4 = next2.f1683m.iterator();
                    while (it4.hasNext()) {
                        it4.next().b(this);
                    }
                }
            }
            Iterator<a.b> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                a.b next3 = it5.next();
                if (next3.f1683m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0024a> it6 = next3.f1683m.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this, i6, next3);
                    }
                }
            }
            Iterator<a.b> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                a.b next4 = it7.next();
                if (next4.f1683m.size() > 0) {
                    Iterator<a.b.View$OnClickListenerC0024a> it8 = next4.f1683m.iterator();
                    while (it8.hasNext()) {
                        it8.next().a(this, i6, next4);
                    }
                }
            }
        }
        if (this.K.n() && (bVar = this.K.f1656c) != null && (bVar2 = bVar.f1682l) != null) {
            int i10 = bVar2.f1694d;
            if (i10 != -1) {
                MotionLayout motionLayout = bVar2.r;
                view = motionLayout.findViewById(i10);
                if (view == null) {
                    Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + a0.a.c(bVar2.f1694d, motionLayout.getContext()));
                }
            } else {
                view = null;
            }
            if (view instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                nestedScrollView.setOnTouchListener(new a0.r());
                nestedScrollView.setOnScrollChangeListener(new s());
            }
        }
    }

    public final void v() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if (this.f1597g0 == null && ((copyOnWriteArrayList = this.f1614x0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.X0;
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            h hVar = this.f1597g0;
            if (hVar != null) {
                hVar.a(next.intValue());
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.f1614x0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<h> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().a(next.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void w() {
        this.S0.f();
        invalidate();
    }

    public final void x(int i6) {
        androidx.constraintlayout.widget.b bVar;
        b.a aVar;
        androidx.constraintlayout.widget.b bVar2;
        setState(i.SETUP);
        this.P = i6;
        this.O = -1;
        this.Q = -1;
        b0.b bVar3 = this.E;
        if (bVar3 != null) {
            float f2 = -1;
            int i10 = bVar3.f3912b;
            SparseArray<b.a> sparseArray = bVar3.f3914d;
            int i11 = 0;
            ConstraintLayout constraintLayout = bVar3.f3911a;
            if (i10 == i6) {
                if (i6 == -1) {
                    aVar = sparseArray.valueAt(0);
                } else {
                    aVar = sparseArray.get(i10);
                }
                int i12 = bVar3.f3913c;
                if (i12 == -1 || !aVar.f3917b.get(i12).a(f2, f2)) {
                    while (true) {
                        ArrayList<b.C0072b> arrayList = aVar.f3917b;
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11).a(f2, f2)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (bVar3.f3913c != i11) {
                        ArrayList<b.C0072b> arrayList2 = aVar.f3917b;
                        if (i11 == -1) {
                            bVar2 = null;
                        } else {
                            bVar2 = arrayList2.get(i11).f;
                        }
                        if (i11 != -1) {
                            int i13 = arrayList2.get(i11).f3924e;
                        }
                        if (bVar2 != null) {
                            bVar3.f3913c = i11;
                            bVar2.b(constraintLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            bVar3.f3912b = i6;
            b.a aVar2 = sparseArray.get(i6);
            while (true) {
                ArrayList<b.C0072b> arrayList3 = aVar2.f3917b;
                if (i11 < arrayList3.size()) {
                    if (arrayList3.get(i11).a(f2, f2)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            ArrayList<b.C0072b> arrayList4 = aVar2.f3917b;
            if (i11 == -1) {
                bVar = aVar2.f3919d;
            } else {
                bVar = arrayList4.get(i11).f;
            }
            if (i11 != -1) {
                int i14 = arrayList4.get(i11).f3924e;
            }
            if (bVar == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i6 + ", dim =-1.0, -1.0");
                return;
            }
            bVar3.f3913c = i11;
            bVar.b(constraintLayout);
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.K;
        if (aVar3 != null) {
            aVar3.b(i6).b(this);
        }
    }

    public final void y(int i6, int i10) {
        if (!isAttachedToWindow()) {
            if (this.N0 == null) {
                this.N0 = new g();
            }
            g gVar = this.N0;
            gVar.f1646c = i6;
            gVar.f1647d = i10;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        if (aVar != null) {
            this.O = i6;
            this.Q = i10;
            aVar.m(i6, i10);
            this.S0.e(this.K.b(i6), this.K.b(i10));
            w();
            this.f1594b0 = 0.0f;
            m(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r19 != 7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if ((((r18 * r6) - (((r3 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        if ((((((r3 * r6) * r6) / 2.0f) + (r18 * r6)) + r1) < 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r2 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        r1 = r16.f1594b0;
        r2 = r16.K.f();
        r10.f1619a = r18;
        r10.f1620b = r1;
        r10.f1621c = r2;
        r16.L = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        r1 = r16.f1601k0;
        r2 = r16.f1594b0;
        r5 = r16.W;
        r6 = r16.K.f();
        r3 = r16.K.f1656c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r3 = r3.f1682l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r7 = r3.f1707s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r1.b(r2, r17, r18, r5, r6, r7);
        r16.N = 0.0f;
        r1 = r16.P;
        r16.f1595d0 = r8;
        r16.P = r1;
        r16.L = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(float f2, float f10, int i6) {
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        androidx.constraintlayout.motion.widget.b bVar6;
        androidx.constraintlayout.motion.widget.b bVar7;
        float f15 = f2;
        if (this.K == null || this.f1594b0 == f15) {
            return;
        }
        boolean z10 = true;
        this.f1600j0 = true;
        this.V = getNanoTime();
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        a.b bVar8 = aVar.f1656c;
        if (bVar8 != null) {
            i10 = bVar8.f1678h;
        } else {
            i10 = aVar.f1662j;
        }
        float f16 = i10 / 1000.0f;
        this.W = f16;
        this.f1595d0 = f15;
        this.f1596f0 = true;
        z.a aVar2 = this.f1601k0;
        float f17 = 0.0f;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            c cVar = this.f1602l0;
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 != 6) {
                    }
                } else {
                    float f18 = this.f1594b0;
                    float f19 = aVar.f();
                    if (f10 > 0.0f) {
                        float f20 = f10 / f19;
                    } else {
                        float f21 = (-f10) / f19;
                    }
                }
            } else {
                float f22 = this.f1594b0;
                float f23 = aVar.f();
                cVar.f1619a = f10;
                cVar.f1620b = f22;
                cVar.f1621c = f23;
                this.L = cVar;
            }
            this.e0 = false;
            this.V = getNanoTime();
            invalidate();
        }
        if (i6 != 1 && i6 != 7) {
            if (i6 == 2 || i6 == 6) {
                f15 = 1.0f;
            }
        } else {
            f15 = 0.0f;
        }
        if (bVar8 != null && (bVar7 = bVar8.f1682l) != null) {
            i11 = bVar7.D;
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            float f24 = this.f1594b0;
            float f25 = aVar.f();
            a.b bVar9 = this.K.f1656c;
            if (bVar9 != null && (bVar6 = bVar9.f1682l) != null) {
                f17 = bVar6.f1707s;
            }
            aVar2.b(f24, f15, f10, f16, f25, f17);
        } else {
            float f26 = this.f1594b0;
            if (bVar8 != null && (bVar5 = bVar8.f1682l) != null) {
                f11 = bVar5.f1714z;
            } else {
                f11 = 0.0f;
            }
            if (bVar8 != null && (bVar4 = bVar8.f1682l) != null) {
                f12 = bVar4.A;
            } else {
                f12 = 0.0f;
            }
            if (bVar8 != null && (bVar3 = bVar8.f1682l) != null) {
                f13 = bVar3.f1713y;
            } else {
                f13 = 0.0f;
            }
            if (bVar8 != null && (bVar2 = bVar8.f1682l) != null) {
                f14 = bVar2.B;
            } else {
                f14 = 0.0f;
            }
            if (bVar8 != null && (bVar = bVar8.f1682l) != null) {
                i12 = bVar.C;
            } else {
                i12 = 0;
            }
            if (aVar2.f39100b == null) {
                aVar2.f39100b = new w.l();
            }
            w.l lVar = aVar2.f39100b;
            aVar2.f39101c = lVar;
            lVar.f36247c = f15;
            lVar.f36245a = f13;
            lVar.f36249e = f26;
            lVar.f36246b = f12;
            lVar.f36250g = f11;
            lVar.f36251h = f14;
            lVar.f36252i = i12;
            lVar.f36248d = 0.0f;
        }
        int i13 = this.P;
        this.f1595d0 = f15;
        this.P = i13;
        this.L = aVar2;
        this.e0 = false;
        this.V = getNanoTime();
        invalidate();
    }

    @Override // t0.r
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.f1606p0 || i6 != 0 || i10 != 0) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }
        this.f1606p0 = false;
    }

    public void setTransition(a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.K;
        aVar.f1656c = bVar;
        if (bVar != null && (bVar2 = bVar.f1682l) != null) {
            bVar2.c(aVar.f1668p);
        }
        setState(i.SETUP);
        int i6 = this.P;
        a.b bVar3 = this.K.f1656c;
        if (i6 == (bVar3 == null ? -1 : bVar3.f1674c)) {
            this.f1594b0 = 1.0f;
            this.f1593a0 = 1.0f;
            this.f1595d0 = 1.0f;
        } else {
            this.f1594b0 = 0.0f;
            this.f1593a0 = 0.0f;
            this.f1595d0 = 0.0f;
        }
        this.c0 = (bVar.r & 1) != 0 ? -1L : getNanoTime();
        int g5 = this.K.g();
        androidx.constraintlayout.motion.widget.a aVar2 = this.K;
        a.b bVar4 = aVar2.f1656c;
        int i10 = bVar4 != null ? bVar4.f1674c : -1;
        if (g5 == this.O && i10 == this.Q) {
            return;
        }
        this.O = g5;
        this.Q = i10;
        aVar2.m(g5, i10);
        androidx.constraintlayout.widget.b b10 = this.K.b(this.O);
        androidx.constraintlayout.widget.b b11 = this.K.b(this.Q);
        e eVar = this.S0;
        eVar.e(b10, b11);
        int i11 = this.O;
        int i12 = this.Q;
        eVar.f1640e = i11;
        eVar.f = i12;
        eVar.f();
        w();
    }
}
