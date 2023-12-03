package com.google.android.material.snackbar;

import ac.h;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.theinnerhour.b2b.R;
import java.util.List;
import java.util.WeakHashMap;
import k0.a;
import qb.t;
import qb.w;
import t0.d0;
import t0.o0;
import ug.l;
import yb.i;
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9137a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9138b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9139c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f9140d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f9141e;
    public final TimeInterpolator f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f9142g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f9143h;

    /* renamed from: i  reason: collision with root package name */
    public final e f9144i;

    /* renamed from: j  reason: collision with root package name */
    public final h f9145j;

    /* renamed from: k  reason: collision with root package name */
    public int f9146k;

    /* renamed from: m  reason: collision with root package name */
    public int f9148m;

    /* renamed from: n  reason: collision with root package name */
    public int f9149n;

    /* renamed from: o  reason: collision with root package name */
    public int f9150o;

    /* renamed from: p  reason: collision with root package name */
    public int f9151p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9152q;
    public final AccessibilityManager r;

    /* renamed from: t  reason: collision with root package name */
    public static final i1.b f9131t = ab.a.f450b;

    /* renamed from: u  reason: collision with root package name */
    public static final LinearInterpolator f9132u = ab.a.f449a;

    /* renamed from: v  reason: collision with root package name */
    public static final i1.c f9133v = ab.a.f452d;

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f9135x = {R.attr.snackbarStyle};

    /* renamed from: y  reason: collision with root package name */
    public static final String f9136y = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: w  reason: collision with root package name */
    public static final Handler f9134w = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: l  reason: collision with root package name */
    public final b f9147l = new b();

    /* renamed from: s  reason: collision with root package name */
    public final c f9153s = new c();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j  reason: collision with root package name */
        public final d f9154j = new d(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean a(View view) {
            this.f9154j.getClass();
            return view instanceof e;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            d dVar = this.f9154j;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g.b().e(dVar.f9157a);
                }
            } else if (coordinatorLayout.j(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g b10 = g.b();
                c cVar = dVar.f9157a;
                synchronized (b10.f9176a) {
                    if (b10.c(cVar)) {
                        g.c cVar2 = b10.f9178c;
                        if (!cVar2.f9183c) {
                            cVar2.f9183c = true;
                            b10.f9177b.removeCallbacksAndMessages(cVar2);
                        }
                    }
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean z10;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i10 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.r;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    e eVar = baseTransientBottomBar.f9144i;
                    if (eVar.getVisibility() == 0) {
                        if (eVar.getAnimationMode() == 1) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat.setInterpolator(baseTransientBottomBar.f9140d);
                            ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                            ofFloat.setDuration(baseTransientBottomBar.f9138b);
                            ofFloat.addListener(new ac.a(baseTransientBottomBar, i10));
                            ofFloat.start();
                        } else {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int[] iArr = new int[2];
                            iArr[0] = 0;
                            int height = eVar.getHeight();
                            ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            }
                            iArr[1] = height;
                            valueAnimator.setIntValues(iArr);
                            valueAnimator.setInterpolator(baseTransientBottomBar.f9141e);
                            valueAnimator.setDuration(baseTransientBottomBar.f9139c);
                            valueAnimator.addListener(new ac.c(baseTransientBottomBar, i10));
                            valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                            valueAnimator.start();
                        }
                        return true;
                    }
                }
                baseTransientBottomBar.c();
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            e eVar2 = baseTransientBottomBar2.f9144i;
            if (eVar2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = eVar2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.f) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams2;
                    Behavior behavior = new Behavior();
                    d dVar = behavior.f9154j;
                    dVar.getClass();
                    dVar.f9157a = baseTransientBottomBar2.f9153s;
                    behavior.f8804b = new com.google.android.material.snackbar.e(baseTransientBottomBar2);
                    fVar.b(behavior);
                    fVar.f1934g = 80;
                }
                eVar2.E = true;
                baseTransientBottomBar2.f9142g.addView(eVar2);
                eVar2.E = false;
                eVar2.setVisibility(4);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.c(eVar2)) {
                baseTransientBottomBar2.e();
            } else {
                baseTransientBottomBar2.f9152q = true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f9144i != null && (context = baseTransientBottomBar.f9143h) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i6 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                e eVar = baseTransientBottomBar.f9144i;
                eVar.getLocationOnScreen(iArr);
                int height = (i6 - (eVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f9144i.getTranslationY());
                if (height >= baseTransientBottomBar.f9151p) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f9144i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f9136y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (baseTransientBottomBar.f9151p - height) + marginLayoutParams.bottomMargin;
                baseTransientBottomBar.f9144i.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void b() {
            Handler handler = BaseTransientBottomBar.f9134w;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void c(int i6) {
            Handler handler = BaseTransientBottomBar.f9134w;
            handler.sendMessage(handler.obtainMessage(1, i6, 0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f9157a;

        public d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f8808g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f8809h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f8807e = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends FrameLayout {
        public static final a F = new a();
        public final int A;
        public ColorStateList B;
        public PorterDuff.Mode C;
        public Rect D;
        public boolean E;

        /* renamed from: u  reason: collision with root package name */
        public BaseTransientBottomBar<?> f9158u;

        /* renamed from: v  reason: collision with root package name */
        public final i f9159v;

        /* renamed from: w  reason: collision with root package name */
        public int f9160w;

        /* renamed from: x  reason: collision with root package name */
        public final float f9161x;

        /* renamed from: y  reason: collision with root package name */
        public final float f9162y;

        /* renamed from: z  reason: collision with root package name */
        public final int f9163z;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Context context, AttributeSet attributeSet) {
            super(fc.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Drawable g5;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.L);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f9160w = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f9159v = new i(i.b(context2, attributeSet, 0, 0));
            }
            this.f9161x = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(ub.d.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(w.d(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f9162y = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f9163z = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.A = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(F);
            setFocusable(true);
            if (getBackground() == null) {
                int L0 = f6.b.L0(getBackgroundOverlayColorAlpha(), f6.b.C0(R.attr.colorSurface, this), f6.b.C0(R.attr.colorOnSurface, this));
                i iVar = this.f9159v;
                if (iVar != null) {
                    i1.b bVar = BaseTransientBottomBar.f9131t;
                    yb.f fVar = new yb.f(iVar);
                    fVar.k(ColorStateList.valueOf(L0));
                    gradientDrawable = fVar;
                } else {
                    Resources resources = getResources();
                    i1.b bVar2 = BaseTransientBottomBar.f9131t;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(L0);
                    gradientDrawable = gradientDrawable2;
                }
                if (this.B != null) {
                    g5 = k0.a.g(gradientDrawable);
                    a.b.h(g5, this.B);
                } else {
                    g5 = k0.a.g(gradientDrawable);
                }
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                d0.d.q(this, g5);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f9158u = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f9162y;
        }

        public int getAnimationMode() {
            return this.f9160w;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f9161x;
        }

        public int getMaxInlineActionWidth() {
            return this.A;
        }

        public int getMaxWidth() {
            return this.f9163z;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Insets mandatorySystemGestureInsets;
            int i6;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9158u;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f9144i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                        i6 = mandatorySystemGestureInsets.bottom;
                        baseTransientBottomBar.f9151p = i6;
                        baseTransientBottomBar.f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.h.c(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDetachedFromWindow() {
            boolean z10;
            boolean z11;
            boolean z12;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9158u;
            if (baseTransientBottomBar != null) {
                g b10 = g.b();
                c cVar = baseTransientBottomBar.f9153s;
                synchronized (b10.f9176a) {
                    try {
                        z10 = true;
                        if (!b10.c(cVar)) {
                            g.c cVar2 = b10.f9179d;
                            if (cVar2 != null) {
                                if (cVar != null && cVar2.f9181a.get() == cVar) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z11 = true;
                                    if (z11) {
                                        z10 = false;
                                    }
                                }
                            }
                            z11 = false;
                            if (z11) {
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    BaseTransientBottomBar.f9134w.post(new ac.f(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
            super.onLayout(z10, i6, i10, i11, i12);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9158u;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f9152q) {
                baseTransientBottomBar.e();
                baseTransientBottomBar.f9152q = false;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i6, int i10) {
            super.onMeasure(i6, i10);
            int i11 = this.f9163z;
            if (i11 > 0 && getMeasuredWidth() > i11) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
            }
        }

        public void setAnimationMode(int i6) {
            this.f9160w = i6;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.B != null) {
                drawable = k0.a.g(drawable.mutate());
                a.b.h(drawable, this.B);
                a.b.i(drawable, this.C);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.B = colorStateList;
            if (getBackground() != null) {
                Drawable g5 = k0.a.g(getBackground().mutate());
                a.b.h(g5, colorStateList);
                a.b.i(g5, this.C);
                if (g5 != getBackground()) {
                    super.setBackgroundDrawable(g5);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.C = mode;
            if (getBackground() != null) {
                Drawable g5 = k0.a.g(getBackground().mutate());
                a.b.i(g5, mode);
                if (g5 != getBackground()) {
                    super.setBackgroundDrawable(g5);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.E && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.D = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f9158u;
                if (baseTransientBottomBar != null) {
                    i1.b bVar = BaseTransientBottomBar.f9131t;
                    baseTransientBottomBar.f();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            a aVar;
            if (onClickListener != null) {
                aVar = null;
            } else {
                aVar = F;
            }
            setOnTouchListener(aVar);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z10;
        int i6;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f9142g = viewGroup;
                this.f9145j = snackbarContentLayout2;
                this.f9143h = context;
                t.c(context, t.f29509a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f9135x);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i6 = R.layout.mtrl_layout_snackbar;
                } else {
                    i6 = R.layout.design_layout_snackbar;
                }
                e eVar = (e) from.inflate(i6, viewGroup, false);
                this.f9144i = eVar;
                eVar.setBaseTransientBottomBar(this);
                float actionTextColorAlpha = eVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f9166v.setTextColor(f6.b.L0(actionTextColorAlpha, f6.b.C0(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.f9166v.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(eVar.getMaxInlineActionWidth());
                eVar.addView(snackbarContentLayout);
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.g.f(eVar, 1);
                d0.d.s(eVar, 1);
                eVar.setFitsSystemWindows(true);
                d0.i.u(eVar, new ac.d(this));
                d0.q(eVar, new ac.e(this));
                this.r = (AccessibilityManager) context.getSystemService("accessibility");
                this.f9139c = rb.a.c(context, R.attr.motionDurationLong2, 250);
                this.f9137a = rb.a.c(context, R.attr.motionDurationLong2, 150);
                this.f9138b = rb.a.c(context, R.attr.motionDurationMedium1, 75);
                this.f9140d = rb.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f9132u);
                this.f = rb.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f9133v);
                this.f9141e = rb.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f9131t);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public void a() {
        b(3);
    }

    public final void b(int i6) {
        boolean z10;
        g b10 = g.b();
        c cVar = this.f9153s;
        synchronized (b10.f9176a) {
            if (b10.c(cVar)) {
                b10.a(b10.f9178c, i6);
            } else {
                g.c cVar2 = b10.f9179d;
                boolean z11 = false;
                if (cVar2 != null) {
                    if (cVar != null && cVar2.f9181a.get() == cVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    b10.a(b10.f9179d, i6);
                }
            }
        }
    }

    public final void c() {
        g b10 = g.b();
        c cVar = this.f9153s;
        synchronized (b10.f9176a) {
            try {
                if (b10.c(cVar)) {
                    b10.f9178c = null;
                    g.c cVar2 = b10.f9179d;
                    if (cVar2 != null && cVar2 != null) {
                        b10.f9178c = cVar2;
                        b10.f9179d = null;
                        g.b bVar = cVar2.f9181a.get();
                        if (bVar != null) {
                            bVar.b();
                        } else {
                            b10.f9178c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f9144i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f9144i);
        }
    }

    public final void d() {
        g b10 = g.b();
        c cVar = this.f9153s;
        synchronized (b10.f9176a) {
            if (b10.c(cVar)) {
                b10.f(b10.f9178c);
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        e eVar = this.f9144i;
        if (z10) {
            eVar.post(new f(this));
            return;
        }
        if (eVar.getParent() != null) {
            eVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        boolean z10;
        e eVar = this.f9144i;
        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && eVar.D != null) {
            if (eVar.getParent() == null) {
                return;
            }
            int i6 = this.f9148m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = eVar.D;
            marginLayoutParams.bottomMargin = rect.bottom + i6;
            marginLayoutParams.leftMargin = rect.left + this.f9149n;
            marginLayoutParams.rightMargin = rect.right + this.f9150o;
            marginLayoutParams.topMargin = rect.top;
            eVar.requestLayout();
            if (Build.VERSION.SDK_INT >= 29) {
                boolean z11 = false;
                if (this.f9151p > 0) {
                    ViewGroup.LayoutParams layoutParams2 = eVar.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).f1929a instanceof SwipeDismissBehavior)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    b bVar = this.f9147l;
                    eVar.removeCallbacks(bVar);
                    eVar.post(bVar);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(f9136y, "Unable to update margins because layout params are not MarginLayoutParams");
    }
}
