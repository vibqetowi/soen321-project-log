package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class c extends w.k {

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class b extends c {
        public final SparseArray<b0.a> f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f39105g;

        public b(String str, SparseArray<b0.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f = sparseArray;
        }

        @Override // w.k
        public final void b(float f, int i6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // w.k
        public final void c(int i6) {
            SparseArray<b0.a> sparseArray = this.f;
            int size = sparseArray.size();
            int c10 = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.f39105g = new float[c10];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c10);
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = sparseArray.keyAt(i10) * 0.01d;
                sparseArray.valueAt(i10).b(this.f39105g);
                int i11 = 0;
                while (true) {
                    float[] fArr = this.f39105g;
                    if (i11 < fArr.length) {
                        dArr2[i10][i11] = fArr[i11];
                        i11++;
                    }
                }
            }
            this.f36240a = w.b.a(i6, dArr, dArr2);
        }

        @Override // z.c
        public final void d(View view, float f) {
            this.f36240a.d(f, this.f39105g);
            f6.b.P0(this.f.valueAt(0), view, this.f39105g);
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: z.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0665c extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class e extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class f extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class g extends c {
        public boolean f = false;

        @Override // z.c
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (this.f) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewSpline", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewSpline", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class h extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class i extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class j extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class k extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class l extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class m extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class n extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class o extends c {
        @Override // z.c
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // z.c
        public final void d(View view, float f) {
        }
    }
}
