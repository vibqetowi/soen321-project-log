package com.google.android.material.transformation;

import ab.g;
import ab.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import hc.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jb.d;
import t0.d0;
import t0.o0;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f9325c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f9326d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f9327e;
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public float f9328g;

    /* renamed from: h  reason: collision with root package name */
    public float f9329h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9330a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f9331b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f9332c;

        public a(boolean z10, View view, View view2) {
            this.f9330a = z10;
            this.f9331b = view;
            this.f9332c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f9330a) {
                this.f9331b.setVisibility(4);
                View view = this.f9332c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f9330a) {
                this.f9331b.setVisibility(0);
                View view = this.f9332c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f9333a;

        /* renamed from: b  reason: collision with root package name */
        public d f9334b;
    }

    public FabTransformationBehavior() {
        this.f9325c = new Rect();
        this.f9326d = new RectF();
        this.f9327e = new RectF();
        this.f = new int[2];
    }

    public static Pair c(float f, float f2, boolean z10, b bVar) {
        h d10;
        h d11;
        int i6;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z10 && f2 < 0.0f) || (!z10 && i6 > 0)) {
                d10 = bVar.f9333a.d("translationXCurveUpwards");
                d11 = bVar.f9333a.d("translationYCurveUpwards");
            } else {
                d10 = bVar.f9333a.d("translationXCurveDownwards");
                d11 = bVar.f9333a.d("translationYCurveDownwards");
            }
        } else {
            d10 = bVar.f9333a.d("translationXLinear");
            d11 = bVar.f9333a.d("translationYLinear");
        }
        return new Pair(d10, d11);
    }

    public static float f(b bVar, h hVar, float f) {
        long j10 = hVar.f463a;
        h d10 = bVar.f9333a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d10.f463a + d10.f464b) + 17) - j10)) / ((float) hVar.f464b));
        LinearInterpolator linearInterpolator = ab.a.f449a;
        return e.e(0.0f, f, interpolation, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0401 A[LOOP:0: B:123:0x03ff->B:124:0x0401, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037c  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet b(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        float f;
        float f2;
        float f10;
        ArrayList arrayList2;
        boolean z12;
        ArrayList arrayList3;
        b bVar;
        AnimatorSet animatorSet;
        ArrayList arrayList4;
        int i6;
        boolean z13;
        ObjectAnimator ofInt;
        b bVar2;
        boolean z14;
        int size;
        int i10;
        ObjectAnimator ofFloat4;
        ObjectAnimator ofInt2;
        b h10 = h(z10, view2.getContext());
        if (z10) {
            this.f9328g = view.getTranslationX();
            this.f9329h = view.getTranslationY();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        float i11 = d0.i.i(view2) - d0.i.i(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-i11);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -i11);
        }
        h10.f9333a.d("elevation").a(ofFloat);
        arrayList5.add(ofFloat);
        RectF rectF = this.f9326d;
        float d10 = d(view, view2, h10.f9334b);
        float e10 = e(view, view2, h10.f9334b);
        Pair c10 = c(d10, e10, z10, h10);
        h hVar = (h) c10.first;
        h hVar2 = (h) c10.second;
        RectF rectF2 = this.f9327e;
        Rect rect = this.f9325c;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-d10);
                view2.setTranslationY(-e10);
            }
            arrayList = arrayList6;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float f11 = f(h10, hVar, -d10);
            float f12 = f(h10, hVar2, -e10);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            g(view2, rectF2);
            rectF2.offset(f11, f12);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList6;
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -d10);
            ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -e10);
        }
        hVar.a(ofFloat2);
        hVar2.a(ofFloat3);
        arrayList5.add(ofFloat2);
        arrayList5.add(ofFloat3);
        float width = rectF.width();
        float height = rectF.height();
        float d11 = d(view, view2, h10.f9334b);
        float e11 = e(view, view2, h10.f9334b);
        Pair c11 = c(d11, e11, z10, h10);
        h hVar3 = (h) c11.first;
        h hVar4 = (h) c11.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z10) {
            f = d11;
        } else {
            f = this.f9328g;
        }
        fArr[0] = f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (z10) {
            f2 = e11;
        } else {
            f2 = this.f9329h;
        }
        fArr2[0] = f2;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, property2, fArr2);
        hVar3.a(ofFloat7);
        hVar4.a(ofFloat8);
        arrayList5.add(ofFloat7);
        arrayList5.add(ofFloat8);
        boolean z15 = view2 instanceof jb.d;
        if (z15 && (view instanceof ImageView)) {
            jb.d dVar = (jb.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, ab.d.f456a, 0);
                    f10 = width;
                } else {
                    f10 = width;
                    ofInt2 = ObjectAnimator.ofInt(drawable, ab.d.f456a, 255);
                }
                ofInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                h10.f9333a.d("iconFade").a(ofInt2);
                arrayList5.add(ofInt2);
                com.google.android.material.transformation.b bVar3 = new com.google.android.material.transformation.b(dVar, drawable);
                arrayList2 = arrayList;
                arrayList2.add(bVar3);
                if (z15) {
                    bVar = h10;
                    z12 = z15;
                    arrayList4 = arrayList2;
                } else {
                    jb.d dVar2 = (jb.d) view2;
                    d dVar3 = h10.f9334b;
                    g(view, rectF);
                    rectF.offset(this.f9328g, this.f9329h);
                    g(view2, rectF2);
                    rectF2.offset(-d(view, view2, dVar3), 0.0f);
                    float centerX = rectF.centerX() - rectF2.left;
                    d dVar4 = h10.f9334b;
                    g(view, rectF);
                    rectF.offset(this.f9328g, this.f9329h);
                    g(view2, rectF2);
                    rectF2.offset(0.0f, -e(view, view2, dVar4));
                    float centerY = rectF.centerY() - rectF2.top;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    if (d0.g.c(floatingActionButton)) {
                        rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                        floatingActionButton.k(rect);
                    }
                    float width2 = rect.width() / 2.0f;
                    h d12 = h10.f9333a.d("expansion");
                    if (z10) {
                        if (!z11) {
                            dVar2.setRevealInfo(new d.C0325d(centerX, centerY, width2));
                        }
                        if (z11) {
                            width2 = dVar2.getRevealInfo().f21779c;
                        }
                        double d13 = 0.0f - centerX;
                        double d14 = 0.0f - centerY;
                        z12 = z15;
                        arrayList3 = arrayList2;
                        float hypot = (float) Math.hypot(d13, d14);
                        double d15 = f10 - centerX;
                        float hypot2 = (float) Math.hypot(d15, d14);
                        double d16 = height - centerY;
                        float hypot3 = (float) Math.hypot(d15, d16);
                        float hypot4 = (float) Math.hypot(d13, d16);
                        if (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) {
                            if (hypot2 > hypot3 && hypot2 > hypot4) {
                                hypot = hypot2;
                            } else if (hypot3 > hypot4) {
                                hypot = hypot3;
                            } else {
                                hypot = hypot4;
                            }
                        }
                        animatorSet = jb.b.a(dVar2, centerX, centerY, hypot);
                        animatorSet.addListener(new c(dVar2));
                        long j10 = d12.f463a;
                        int i12 = (int) centerX;
                        int i13 = (int) centerY;
                        if (j10 > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i12, i13, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(j10);
                            arrayList5.add(createCircularReveal);
                        }
                        bVar = h10;
                    } else {
                        z12 = z15;
                        arrayList3 = arrayList2;
                        float f13 = dVar2.getRevealInfo().f21779c;
                        AnimatorSet a10 = jb.b.a(dVar2, centerX, centerY, width2);
                        long j11 = d12.f463a;
                        int i14 = (int) centerX;
                        int i15 = (int) centerY;
                        if (j11 > 0) {
                            Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, f13, f13);
                            createCircularReveal2.setStartDelay(0L);
                            createCircularReveal2.setDuration(j11);
                            arrayList5.add(createCircularReveal2);
                        }
                        b bVar4 = h10;
                        t.h<String, h> hVar5 = bVar4.f9333a.f461a;
                        int i16 = hVar5.f32260w;
                        long j12 = 0;
                        int i17 = 0;
                        while (i17 < i16) {
                            h m10 = hVar5.m(i17);
                            j12 = Math.max(j12, m10.f463a + m10.f464b);
                            i17++;
                            hVar5 = hVar5;
                            i16 = i16;
                            a10 = a10;
                            bVar4 = bVar4;
                        }
                        bVar = bVar4;
                        AnimatorSet animatorSet2 = a10;
                        long j13 = d12.f463a + d12.f464b;
                        if (j13 < j12) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, width2, width2);
                            createCircularReveal3.setStartDelay(j13);
                            createCircularReveal3.setDuration(j12 - j13);
                            arrayList5.add(createCircularReveal3);
                        }
                        animatorSet = animatorSet2;
                    }
                    d12.a(animatorSet);
                    arrayList5.add(animatorSet);
                    arrayList4 = arrayList3;
                    arrayList4.add(new jb.a(dVar2));
                }
                if (z12) {
                    z13 = z10;
                    bVar2 = bVar;
                } else {
                    jb.d dVar5 = (jb.d) view2;
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    ColorStateList g5 = d0.i.g(view);
                    if (g5 != null) {
                        i6 = g5.getColorForState(view.getDrawableState(), g5.getDefaultColor());
                    } else {
                        i6 = 0;
                    }
                    int i18 = 16777215 & i6;
                    z13 = z10;
                    if (z13) {
                        if (!z11) {
                            dVar5.setCircularRevealScrimColor(i6);
                        }
                        ofInt = ObjectAnimator.ofInt(dVar5, d.c.f21776a, i18);
                    } else {
                        ofInt = ObjectAnimator.ofInt(dVar5, d.c.f21776a, i6);
                    }
                    ofInt.setEvaluator(ab.b.f454a);
                    bVar2 = bVar;
                    bVar2.f9333a.d("color").a(ofInt);
                    arrayList5.add(ofInt);
                }
                z14 = view2 instanceof ViewGroup;
                if (z14) {
                    View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById != null) {
                        if (findViewById instanceof ViewGroup) {
                            viewGroup = (ViewGroup) findViewById;
                        }
                    } else if (!(view2 instanceof gc.c) && !(view2 instanceof gc.b)) {
                        if (z14) {
                            viewGroup = (ViewGroup) view2;
                        }
                    } else {
                        View childAt = ((ViewGroup) view2).getChildAt(0);
                        if (childAt instanceof ViewGroup) {
                            viewGroup = (ViewGroup) childAt;
                        }
                    }
                    if (viewGroup != null) {
                        if (z13) {
                            if (!z11) {
                                ab.c.f455a.set(viewGroup, Float.valueOf(0.0f));
                            }
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ab.c.f455a, 1.0f);
                        } else {
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ab.c.f455a, 0.0f);
                        }
                        bVar2.f9333a.d("contentFade").a(ofFloat4);
                        arrayList5.add(ofFloat4);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        kotlin.jvm.internal.h.V(animatorSet3, arrayList5);
                        animatorSet3.addListener(new a(z13, view2, view));
                        size = arrayList4.size();
                        for (i10 = 0; i10 < size; i10++) {
                            animatorSet3.addListener((Animator.AnimatorListener) arrayList4.get(i10));
                        }
                        return animatorSet3;
                    }
                }
                AnimatorSet animatorSet32 = new AnimatorSet();
                kotlin.jvm.internal.h.V(animatorSet32, arrayList5);
                animatorSet32.addListener(new a(z13, view2, view));
                size = arrayList4.size();
                while (i10 < size) {
                }
                return animatorSet32;
            }
        }
        f10 = width;
        arrayList2 = arrayList;
        if (z15) {
        }
        if (z12) {
        }
        z14 = view2 instanceof ViewGroup;
        if (z14) {
        }
        AnimatorSet animatorSet322 = new AnimatorSet();
        kotlin.jvm.internal.h.V(animatorSet322, arrayList5);
        animatorSet322.addListener(new a(z13, view2, view));
        size = arrayList4.size();
        while (i10 < size) {
        }
        return animatorSet322;
    }

    public final float d(View view, View view2, hc.d dVar) {
        RectF rectF = this.f9326d;
        RectF rectF2 = this.f9327e;
        g(view, rectF);
        rectF.offset(this.f9328g, this.f9329h);
        g(view2, rectF2);
        dVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float e(View view, View view2, hc.d dVar) {
        RectF rectF = this.f9326d;
        RectF rectF2 = this.f9327e;
        g(view, rectF);
        rectF.offset(this.f9328g, this.f9329h);
        g(view2, rectF2);
        dVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void g(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b h(boolean z10, Context context);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        if (fVar.f1935h == 0) {
            fVar.f1935h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9325c = new Rect();
        this.f9326d = new RectF();
        this.f9327e = new RectF();
        this.f = new int[2];
    }
}
