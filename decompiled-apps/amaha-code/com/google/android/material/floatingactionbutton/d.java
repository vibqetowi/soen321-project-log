package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import k0.a;
import qb.o;
import yb.m;
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class d {
    public static final i1.a C = ab.a.f451c;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {16842919, 16842910};
    public static final int[] I = {16843623, 16842908, 16842910};
    public static final int[] J = {16842908, 16842910};
    public static final int[] K = {16843623, 16842910};
    public static final int[] L = {16842910};
    public static final int[] M = new int[0];
    public pb.c B;

    /* renamed from: a  reason: collision with root package name */
    public yb.i f9040a;

    /* renamed from: b  reason: collision with root package name */
    public yb.f f9041b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f9042c;

    /* renamed from: d  reason: collision with root package name */
    public pb.a f9043d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f9044e;
    public boolean f;

    /* renamed from: h  reason: collision with root package name */
    public float f9046h;

    /* renamed from: i  reason: collision with root package name */
    public float f9047i;

    /* renamed from: j  reason: collision with root package name */
    public float f9048j;

    /* renamed from: k  reason: collision with root package name */
    public int f9049k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f9050l;

    /* renamed from: m  reason: collision with root package name */
    public ab.g f9051m;

    /* renamed from: n  reason: collision with root package name */
    public ab.g f9052n;

    /* renamed from: o  reason: collision with root package name */
    public float f9053o;

    /* renamed from: q  reason: collision with root package name */
    public int f9055q;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9056s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9057t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<f> f9058u;

    /* renamed from: v  reason: collision with root package name */
    public final FloatingActionButton f9059v;

    /* renamed from: w  reason: collision with root package name */
    public final xb.b f9060w;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9045g = true;

    /* renamed from: p  reason: collision with root package name */
    public float f9054p = 1.0f;
    public int r = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f9061x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f9062y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f9063z = new RectF();
    public final Matrix A = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class a extends ab.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            d.this.f9054p = f;
            float[] fArr = this.f458a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f459b;
            matrix2.getValues(fArr2);
            for (int i6 = 0; i6 < 9; i6++) {
                float f2 = fArr2[i6];
                float f10 = fArr[i6];
                fArr2[i6] = defpackage.e.e(f2, f10, f, f10);
            }
            Matrix matrix3 = this.f460c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9065a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f9066b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f9067c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f9068d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f9069e;
        public final /* synthetic */ float f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f9070g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f9071h;

        public b(float f, float f2, float f10, float f11, float f12, float f13, float f14, Matrix matrix) {
            this.f9065a = f;
            this.f9066b = f2;
            this.f9067c = f10;
            this.f9068d = f11;
            this.f9069e = f12;
            this.f = f13;
            this.f9070g = f14;
            this.f9071h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f9059v.setAlpha(ab.a.a(this.f9065a, this.f9066b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f9059v;
            float f = this.f9068d;
            float f2 = this.f9067c;
            floatingActionButton.setScaleX(((f - f2) * floatValue) + f2);
            FloatingActionButton floatingActionButton2 = dVar.f9059v;
            float f10 = this.f9069e;
            floatingActionButton2.setScaleY(((f - f10) * floatValue) + f10);
            float f11 = this.f9070g;
            float f12 = this.f;
            dVar.f9054p = defpackage.e.e(f11, f12, floatValue, f12);
            float e10 = defpackage.e.e(f11, f12, floatValue, f12);
            Matrix matrix = this.f9071h;
            dVar.a(e10, matrix);
            dVar.f9059v.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class c extends i {
        public c(pb.d dVar) {
            super(dVar);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0148d extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f9073e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0148d(pb.d dVar) {
            super(dVar);
            this.f9073e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f9073e;
            return dVar.f9046h + dVar.f9047i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class e extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f9074e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pb.d dVar) {
            super(dVar);
            this.f9074e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f9074e;
            return dVar.f9046h + dVar.f9048j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public class h extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f9075e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(pb.d dVar) {
            super(dVar);
            this.f9075e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f9075e.f9046h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9076a;

        /* renamed from: b  reason: collision with root package name */
        public float f9077b;

        /* renamed from: c  reason: collision with root package name */
        public float f9078c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f9079d;

        public i(pb.d dVar) {
            this.f9079d = dVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = (int) this.f9078c;
            yb.f fVar = this.f9079d.f9041b;
            if (fVar != null) {
                fVar.j(f);
            }
            this.f9076a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            boolean z10 = this.f9076a;
            d dVar = this.f9079d;
            if (!z10) {
                yb.f fVar = dVar.f9041b;
                if (fVar == null) {
                    f = 0.0f;
                } else {
                    f = fVar.f38424u.f38443n;
                }
                this.f9077b = f;
                this.f9078c = a();
                this.f9076a = true;
            }
            float f2 = this.f9077b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f9078c - f2)) + f2);
            yb.f fVar2 = dVar.f9041b;
            if (fVar2 != null) {
                fVar2.j(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f9059v = floatingActionButton;
        this.f9060w = bVar;
        o oVar = new o();
        pb.d dVar = (pb.d) this;
        oVar.a(H, d(new e(dVar)));
        oVar.a(I, d(new C0148d(dVar)));
        oVar.a(J, d(new C0148d(dVar)));
        oVar.a(K, d(new C0148d(dVar)));
        oVar.a(L, d(new h(dVar)));
        oVar.a(M, d(new c(dVar)));
        this.f9053o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f9059v.getDrawable();
        if (drawable != null && this.f9055q != 0) {
            RectF rectF = this.f9062y;
            RectF rectF2 = this.f9063z;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i6 = this.f9055q;
            rectF2.set(0.0f, 0.0f, i6, i6);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i10 = this.f9055q;
            matrix.postScale(f2, f2, i10 / 2.0f, i10 / 2.0f);
        }
    }

    public final AnimatorSet b(ab.g gVar, float f2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.f9059v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f10);
        gVar.d("scale").a(ofFloat2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 == 26) {
            ofFloat2.setEvaluator(new pb.b());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f10);
        gVar.d("scale").a(ofFloat3);
        if (i6 == 26) {
            ofFloat3.setEvaluator(new pb.b());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f11, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new ab.e(), new a(), new Matrix(matrix));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        kotlin.jvm.internal.h.V(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f10, float f11, int i6, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f9059v;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f2, floatingActionButton.getScaleX(), f10, floatingActionButton.getScaleY(), this.f9054p, f11, new Matrix(this.A)));
        arrayList.add(ofFloat);
        kotlin.jvm.internal.h.V(animatorSet, arrayList);
        animatorSet.setDuration(rb.a.c(floatingActionButton.getContext(), i6, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(rb.a.d(floatingActionButton.getContext(), i10, ab.a.f450b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i6;
        float f2;
        if (this.f) {
            i6 = (this.f9049k - this.f9059v.getSizeDimension()) / 2;
        } else {
            i6 = 0;
        }
        if (this.f9045g) {
            f2 = e() + this.f9048j;
        } else {
            f2 = 0.0f;
        }
        int max = Math.max(i6, (int) Math.ceil(f2));
        int max2 = Math.max(i6, (int) Math.ceil(f2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i6) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f2, float f10, float f11) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f9058u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f9042c;
        if (drawable != null) {
            a.b.h(drawable, vb.b.c(colorStateList));
        }
    }

    public final void n(yb.i iVar) {
        this.f9040a = iVar;
        yb.f fVar = this.f9041b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        Drawable drawable = this.f9042c;
        if (drawable instanceof m) {
            ((m) drawable).setShapeAppearanceModel(iVar);
        }
        pb.a aVar = this.f9043d;
        if (aVar != null) {
            aVar.f28095o = iVar;
            aVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f9061x;
        f(rect);
        kc.f.q(this.f9044e, "Didn't initialize content background");
        boolean o10 = o();
        xb.b bVar = this.f9060w;
        if (o10) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9044e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f9044e;
            FloatingActionButton.b bVar2 = (FloatingActionButton.b) bVar;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar2.getClass();
            }
        }
        int i6 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.F.set(i6, i10, i11, i12);
        int i13 = floatingActionButton.C;
        floatingActionButton.setPadding(i6 + i13, i10 + i13, i11 + i13, i12 + i13);
    }
}
