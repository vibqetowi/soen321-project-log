package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import w.p;
/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class d extends p {

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setAlpha(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: k  reason: collision with root package name */
        public final String f39106k;

        /* renamed from: l  reason: collision with root package name */
        public final SparseArray<b0.a> f39107l;

        /* renamed from: m  reason: collision with root package name */
        public final SparseArray<float[]> f39108m = new SparseArray<>();

        /* renamed from: n  reason: collision with root package name */
        public float[] f39109n;

        /* renamed from: o  reason: collision with root package name */
        public float[] f39110o;

        public b(String str, SparseArray<b0.a> sparseArray) {
            this.f39106k = str.split(",")[1];
            this.f39107l = sparseArray;
        }

        @Override // w.p
        public final void b(float f, float f2, float f10, int i6, int i10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // w.p
        public final void c(int i6) {
            SparseArray<b0.a> sparseArray = this.f39107l;
            int size = sparseArray.size();
            int c10 = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i10 = c10 + 2;
            this.f39109n = new float[i10];
            this.f39110o = new float[c10];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i10);
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                float[] valueAt = this.f39108m.valueAt(i11);
                dArr[i11] = keyAt * 0.01d;
                sparseArray.valueAt(i11).b(this.f39109n);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f39109n;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
                double[] dArr3 = dArr2[i11];
                dArr3[c10] = valueAt[0];
                dArr3[c10 + 1] = valueAt[1];
            }
            this.f36266a = w.b.a(i6, dArr, dArr2);
        }

        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            boolean z10;
            this.f36266a.d(f, this.f39109n);
            float[] fArr = this.f39109n;
            float f2 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j11 = j10 - this.f36273i;
            if (Float.isNaN(this.f36274j)) {
                float d10 = dVar.d(view, this.f39106k);
                this.f36274j = d10;
                if (Float.isNaN(d10)) {
                    this.f36274j = 0.0f;
                }
            }
            float f11 = (float) ((((j11 * 1.0E-9d) * f2) + this.f36274j) % 1.0d);
            this.f36274j = f11;
            this.f36273i = j10;
            float a10 = a(f11);
            this.f36272h = false;
            int i6 = 0;
            while (true) {
                float[] fArr2 = this.f39110o;
                if (i6 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f36272h;
                float f12 = this.f39109n[i6];
                if (f12 != 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f36272h = z11 | z10;
                fArr2[i6] = (f12 * a10) + f10;
                i6++;
            }
            f6.b.P0(this.f39107l.valueAt(0), view, this.f39110o);
            if (f2 != 0.0f) {
                this.f36272h = true;
            }
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class c extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setElevation(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: z.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0666d extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: k  reason: collision with root package name */
        public boolean f39111k = false;

        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f, j10, view, dVar));
            } else if (this.f39111k) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f39111k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(d(f, j10, view, dVar)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class f extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setRotation(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class g extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setRotationX(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class h extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setRotationY(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class i extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setScaleX(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class j extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setScaleY(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class k extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setTranslationX(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class l extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setTranslationY(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class m extends d {
        @Override // z.d
        public final boolean e(float f, long j10, View view, w.d dVar) {
            view.setTranslationZ(d(f, j10, view, dVar));
            return this.f36272h;
        }
    }

    public final float d(float f2, long j10, View view, w.d dVar) {
        float[] fArr = this.f36271g;
        this.f36266a.d(f2, fArr);
        boolean z10 = true;
        float f10 = fArr[1];
        int i6 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i6 == 0) {
            this.f36272h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f36274j)) {
            float d10 = dVar.d(view, this.f);
            this.f36274j = d10;
            if (Float.isNaN(d10)) {
                this.f36274j = 0.0f;
            }
        }
        float f11 = (float) (((((j10 - this.f36273i) * 1.0E-9d) * f10) + this.f36274j) % 1.0d);
        this.f36274j = f11;
        String str = this.f;
        if (!dVar.f36208a.containsKey(view)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f11});
            dVar.f36208a.put(view, hashMap);
        } else {
            HashMap hashMap2 = (HashMap) dVar.f36208a.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f11});
                dVar.f36208a.put(view, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f11;
                hashMap2.put(str, fArr2);
            }
        }
        this.f36273i = j10;
        float f12 = fArr[0];
        float a10 = (a(this.f36274j) * f12) + fArr[2];
        if (f12 == 0.0f && i6 == 0) {
            z10 = false;
        }
        this.f36272h = z10;
        return a10;
    }

    public abstract boolean e(float f2, long j10, View view, w.d dVar);
}
