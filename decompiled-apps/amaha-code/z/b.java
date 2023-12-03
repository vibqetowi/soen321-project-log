package z;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class b extends w.f {

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: z.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0664b extends b {

        /* renamed from: g  reason: collision with root package name */
        public final float[] f39102g = new float[1];

        /* renamed from: h  reason: collision with root package name */
        public b0.a f39103h;

        @Override // w.f
        public final void b(b0.a aVar) {
            this.f39103h = aVar;
        }

        @Override // z.b
        public final void d(View view, float f) {
            float a10 = a(f);
            float[] fArr = this.f39102g;
            fArr[0] = a10;
            f6.b.P0(this.f39103h, view, fArr);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class e extends b {

        /* renamed from: g  reason: collision with root package name */
        public boolean f39104g = false;

        @Override // z.b
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (this.f39104g) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f39104g = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewOscillator", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewOscillator", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class f extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class g extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class h extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class i extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class j extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class k extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class l extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class m extends b {
        @Override // z.b
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class d extends b {
        @Override // z.b
        public final void d(View view, float f) {
        }
    }
}
