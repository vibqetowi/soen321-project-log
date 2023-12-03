package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.p1;
import androidx.core.widget.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k0.a;
import qb.t;
import qb.w;
import t0.d0;
import t0.o0;
import t0.x;
import u0.h;
import ug.l;
@ViewPager.d
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: t0  reason: collision with root package name */
    public static final s0.e f9184t0 = new s0.e(16);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public ColorStateList F;
    public ColorStateList G;
    public ColorStateList H;
    public Drawable I;
    public int J;
    public final PorterDuff.Mode K;
    public final float L;
    public final float M;
    public final int N;
    public int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public int T;
    public final int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f9185a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f9186b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f9187d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public com.google.android.material.tabs.a f9188f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TimeInterpolator f9189g0;

    /* renamed from: h0  reason: collision with root package name */
    public c f9190h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList<c> f9191i0;

    /* renamed from: j0  reason: collision with root package name */
    public j f9192j0;

    /* renamed from: k0  reason: collision with root package name */
    public ValueAnimator f9193k0;

    /* renamed from: l0  reason: collision with root package name */
    public ViewPager f9194l0;

    /* renamed from: m0  reason: collision with root package name */
    public k2.a f9195m0;

    /* renamed from: n0  reason: collision with root package name */
    public e f9196n0;

    /* renamed from: o0  reason: collision with root package name */
    public h f9197o0;

    /* renamed from: p0  reason: collision with root package name */
    public b f9198p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f9199q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f9200r0;

    /* renamed from: s0  reason: collision with root package name */
    public final v.e f9201s0;

    /* renamed from: u  reason: collision with root package name */
    public int f9202u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<g> f9203v;

    /* renamed from: w  reason: collision with root package name */
    public g f9204w;

    /* renamed from: x  reason: collision with root package name */
    public final f f9205x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9206y;

    /* renamed from: z  reason: collision with root package name */
    public final int f9207z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9209a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, k2.a aVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9194l0 == viewPager) {
                tabLayout.m(aVar, this.f9209a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends g> {
        void a();

        void b(T t3);

        void c(T t3);
    }

    /* loaded from: classes.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayout {

        /* renamed from: x  reason: collision with root package name */
        public static final /* synthetic */ int f9212x = 0;

        /* renamed from: u  reason: collision with root package name */
        public ValueAnimator f9213u;

        /* renamed from: v  reason: collision with root package name */
        public int f9214v;

        public f(Context context) {
            super(context);
            this.f9214v = -1;
            setWillNotDraw(false);
        }

        public final void a(int i6) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9200r0 != 0) {
                return;
            }
            View childAt = getChildAt(i6);
            com.google.android.material.tabs.a aVar = tabLayout.f9188f0;
            Drawable drawable = tabLayout.I;
            aVar.getClass();
            RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
            tabLayout.f9202u = i6;
        }

        public final void b(int i6) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.I.getBounds();
            tabLayout.I.setBounds(bounds.left, 0, bounds.right, i6);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f9188f0.b(tabLayout, view, view2, f, tabLayout.I);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.I;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.I.getBounds().bottom);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }

        public final void d(int i6, int i10, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9202u == i6) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i6);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f9202u = i6;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f9213u = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.f9189g0);
                valueAnimator.setDuration(i10);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.start();
                return;
            }
            this.f9213u.removeAllUpdateListeners();
            this.f9213u.addUpdateListener(bVar);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.I.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.I.getIntrinsicHeight();
            }
            int i6 = tabLayout.V;
            if (i6 != 0) {
                if (i6 != 1) {
                    height = 0;
                    if (i6 != 2) {
                        if (i6 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (tabLayout.I.getBounds().width() > 0) {
                Rect bounds = tabLayout.I.getBounds();
                tabLayout.I.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.I.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
            super.onLayout(z10, i6, i10, i11, i12);
            ValueAnimator valueAnimator = this.f9213u;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f9202u == -1) {
                tabLayout.f9202u = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f9202u);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i6, int i10) {
            super.onMeasure(i6, i10);
            if (View.MeasureSpec.getMode(i6) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.T == 1 || tabLayout.W == 2) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        i11 = Math.max(i11, childAt.getMeasuredWidth());
                    }
                }
                if (i11 <= 0) {
                    return;
                }
                if (i11 * childCount <= getMeasuredWidth() - (((int) w.b(16, getContext())) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != i11 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i11;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    tabLayout.T = 0;
                    tabLayout.p(false);
                }
                if (z10) {
                    super.onMeasure(i6, i10);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i6) {
            super.onRtlPropertiesChanged(i6);
            if (Build.VERSION.SDK_INT < 23 && this.f9214v != i6) {
                requestLayout();
                this.f9214v = i6;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f9216a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f9217b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f9218c;

        /* renamed from: e  reason: collision with root package name */
        public View f9220e;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f9221g;

        /* renamed from: h  reason: collision with root package name */
        public i f9222h;

        /* renamed from: d  reason: collision with root package name */
        public int f9219d = -1;
        public final int f = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f9223i = -1;

        public final void a() {
            TabLayout tabLayout = this.f9221g;
            if (tabLayout != null) {
                tabLayout.l(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final void b(RobertoTextView robertoTextView) {
            this.f9220e = robertoTextView;
            i iVar = this.f9222h;
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f9224a;

        /* renamed from: b  reason: collision with root package name */
        public int f9225b;

        /* renamed from: c  reason: collision with root package name */
        public int f9226c;

        public h(TabLayout tabLayout) {
            this.f9224a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
            boolean z10;
            TabLayout tabLayout = this.f9224a.get();
            if (tabLayout != null) {
                int i10 = this.f9226c;
                boolean z11 = false;
                if (i10 == 2 && this.f9225b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.n(i6, f, z10, (i10 == 2 && this.f9225b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
            this.f9225b = this.f9226c;
            this.f9226c = i6;
            TabLayout tabLayout = this.f9224a.get();
            if (tabLayout != null) {
                tabLayout.f9200r0 = this.f9226c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            boolean z10;
            TabLayout tabLayout = this.f9224a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i6 && i6 < tabLayout.getTabCount()) {
                int i10 = this.f9226c;
                if (i10 != 0 && (i10 != 2 || this.f9225b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.l(tabLayout.h(i6), z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class i extends LinearLayout {
        public static final /* synthetic */ int F = 0;
        public TextView A;
        public ImageView B;
        public Drawable C;
        public int D;

        /* renamed from: u  reason: collision with root package name */
        public g f9227u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f9228v;

        /* renamed from: w  reason: collision with root package name */
        public ImageView f9229w;

        /* renamed from: x  reason: collision with root package name */
        public View f9230x;

        /* renamed from: y  reason: collision with root package name */
        public cb.a f9231y;

        /* renamed from: z  reason: collision with root package name */
        public View f9232z;

        public i(Context context) {
            super(context);
            x xVar;
            this.D = 2;
            e(context);
            int i6 = TabLayout.this.f9206y;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.e.k(this, i6, TabLayout.this.f9207z, TabLayout.this.A, TabLayout.this.B);
            setGravity(17);
            setOrientation(!TabLayout.this.f9185a0 ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                xVar = new x(x.a.b(context2, 1002));
            } else {
                xVar = new x(null);
            }
            if (i10 >= 24) {
                d0.k.d(this, xVar.f32388a);
            }
        }

        private cb.a getBadge() {
            return this.f9231y;
        }

        private cb.a getOrCreateBadge() {
            if (this.f9231y == null) {
                this.f9231y = new cb.a(getContext(), null);
            }
            b();
            cb.a aVar = this.f9231y;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            boolean z10;
            if (this.f9231y != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f9230x;
            if (view != null) {
                cb.a aVar = this.f9231y;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f9230x = null;
            }
        }

        public final void b() {
            boolean z10;
            g gVar;
            g gVar2;
            boolean z11 = true;
            if (this.f9231y != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            if (this.f9232z != null) {
                a();
                return;
            }
            ImageView imageView = this.f9229w;
            if (imageView != null && (gVar2 = this.f9227u) != null && gVar2.f9216a != null) {
                if (this.f9230x != imageView) {
                    a();
                    ImageView imageView2 = this.f9229w;
                    if (this.f9231y == null) {
                        z11 = false;
                    }
                    if (z11 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        cb.a aVar = this.f9231y;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.g(imageView2, null);
                        if (aVar.d() != null) {
                            aVar.d().setForeground(aVar);
                        } else {
                            imageView2.getOverlay().add(aVar);
                        }
                        this.f9230x = imageView2;
                        return;
                    }
                    return;
                }
                c(imageView);
                return;
            }
            TextView textView = this.f9228v;
            if (textView != null && (gVar = this.f9227u) != null && gVar.f == 1) {
                if (this.f9230x != textView) {
                    a();
                    TextView textView2 = this.f9228v;
                    if (this.f9231y == null) {
                        z11 = false;
                    }
                    if (z11 && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        cb.a aVar2 = this.f9231y;
                        Rect rect2 = new Rect();
                        textView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.g(textView2, null);
                        if (aVar2.d() != null) {
                            aVar2.d().setForeground(aVar2);
                        } else {
                            textView2.getOverlay().add(aVar2);
                        }
                        this.f9230x = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }

        public final void c(View view) {
            boolean z10;
            cb.a aVar = this.f9231y;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f9230x) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.g(view, null);
            }
        }

        public final void d() {
            boolean z10;
            f();
            g gVar = this.f9227u;
            boolean z11 = false;
            if (gVar != null) {
                TabLayout tabLayout = gVar.f9221g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == gVar.f9219d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z11);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.C;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.C.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i6 = tabLayout.N;
            GradientDrawable gradientDrawable = null;
            if (i6 != 0) {
                Drawable H = hc.d.H(context, i6);
                this.C = H;
                if (H != null && H.isStateful()) {
                    this.C.setState(getDrawableState());
                }
            } else {
                this.C = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (tabLayout.H != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a10 = vb.b.a(tabLayout.H);
                boolean z10 = tabLayout.e0;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a10, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(this, gradientDrawable2);
            tabLayout.invalidate();
        }

        public final void f() {
            View view;
            int i6;
            ViewParent parent;
            g gVar = this.f9227u;
            if (gVar != null) {
                view = gVar.f9220e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f9232z;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f9232z);
                    }
                    addView(view);
                }
                this.f9232z = view;
                TextView textView = this.f9228v;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9229w;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9229w.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.A = textView2;
                if (textView2 != null) {
                    this.D = k.a.b(textView2);
                }
                this.B = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f9232z;
                if (view3 != null) {
                    removeView(view3);
                    this.f9232z = null;
                }
                this.A = null;
                this.B = null;
            }
            if (this.f9232z == null) {
                if (this.f9229w == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f9229w = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f9228v == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f9228v = textView3;
                    addView(textView3);
                    this.D = k.a.b(this.f9228v);
                }
                TextView textView4 = this.f9228v;
                TabLayout tabLayout = TabLayout.this;
                k.e(textView4, tabLayout.C);
                if (isSelected() && (i6 = tabLayout.E) != -1) {
                    k.e(this.f9228v, i6);
                } else {
                    k.e(this.f9228v, tabLayout.D);
                }
                ColorStateList colorStateList = tabLayout.F;
                if (colorStateList != null) {
                    this.f9228v.setTextColor(colorStateList);
                }
                g(this.f9228v, this.f9229w, true);
                b();
                ImageView imageView3 = this.f9229w;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView3));
                }
                TextView textView5 = this.f9228v;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView5));
                }
            } else {
                TextView textView6 = this.A;
                if (textView6 != null || this.B != null) {
                    g(textView6, this.B, false);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f9218c)) {
                setContentDescription(gVar.f9218c);
            }
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i6;
            CharSequence charSequence2;
            int i10;
            Drawable drawable2;
            g gVar = this.f9227u;
            CharSequence charSequence3 = null;
            if (gVar != null && (drawable2 = gVar.f9216a) != null) {
                drawable = k0.a.g(drawable2).mutate();
            } else {
                drawable = null;
            }
            TabLayout tabLayout = TabLayout.this;
            if (drawable != null) {
                a.b.h(drawable, tabLayout.G);
                PorterDuff.Mode mode = tabLayout.K;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            g gVar2 = this.f9227u;
            if (gVar2 != null) {
                charSequence = gVar2.f9217b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                z11 = (z12 && this.f9227u.f == 1) ? false : false;
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i6 = (int) w.b(8, getContext());
                } else {
                    i6 = 0;
                }
                if (tabLayout.f9185a0) {
                    if (i6 != t0.h.b(marginLayoutParams)) {
                        t0.h.g(marginLayoutParams, i6);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i6 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i6;
                    t0.h.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f9227u;
            if (gVar3 != null) {
                charSequence3 = gVar3.f9218c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequence = charSequence3;
                }
                p1.a(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f9228v, this.f9229w, this.f9232z};
            int i6 = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i10 = Math.min(i10, view.getTop());
                    } else {
                        i10 = view.getTop();
                    }
                    if (z10) {
                        i6 = Math.max(i6, view.getBottom());
                    } else {
                        i6 = view.getBottom();
                    }
                    z10 = true;
                }
            }
            return i6 - i10;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f9228v, this.f9229w, this.f9232z};
            int i6 = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i10 = Math.min(i10, view.getLeft());
                    } else {
                        i10 = view.getLeft();
                    }
                    if (z10) {
                        i6 = Math.max(i6, view.getRight());
                    } else {
                        i6 = view.getRight();
                    }
                    z10 = true;
                }
            }
            return i6 - i10;
        }

        public g getTab() {
            return this.f9227u;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            cb.a aVar = this.f9231y;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f9231y.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h.c.a(0, 1, this.f9227u.f9219d, 1, false, isSelected()).f33748a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) h.a.f33735g.f33743a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onMeasure(int i6, int i10) {
            int size = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i6 = View.MeasureSpec.makeMeasureSpec(tabLayout.O, LinearLayoutManager.INVALID_OFFSET);
            }
            super.onMeasure(i6, i10);
            if (this.f9228v != null) {
                float f = tabLayout.L;
                int i11 = this.D;
                ImageView imageView = this.f9229w;
                boolean z10 = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    TextView textView = this.f9228v;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.M;
                    }
                }
                float textSize = this.f9228v.getTextSize();
                int lineCount = this.f9228v.getLineCount();
                int b10 = k.a.b(this.f9228v);
                int i12 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i12 != 0 || (b10 >= 0 && i11 != b10)) {
                    if (tabLayout.W == 1 && i12 > 0 && lineCount == 1) {
                        Layout layout = this.f9228v.getLayout();
                        if (layout != null) {
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f9228v.setTextSize(0, f);
                        this.f9228v.setMaxLines(i11);
                        super.onMeasure(i6, i10);
                    }
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f9227u != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f9227u.a();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f9228v;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f9229w;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f9232z;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f9227u) {
                this.f9227u = gVar;
                d();
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.tabStyle, 2132083624), attributeSet, R.attr.tabStyle);
        this.f9202u = -1;
        this.f9203v = new ArrayList<>();
        this.E = -1;
        this.J = 0;
        this.O = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.c0 = -1;
        this.f9191i0 = new ArrayList<>();
        this.f9201s0 = new v.e(12, 1);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f9205x = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = t.d(context2, attributeSet, l.M, R.attr.tabStyle, 2132083624, 24);
        if (getBackground() instanceof ColorDrawable) {
            yb.f fVar2 = new yb.f();
            fVar2.k(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar2.i(context2);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            fVar2.j(d0.i.i(this));
            d0.d.q(this, fVar2);
        }
        setSelectedTabIndicator(ub.d.c(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.B = dimensionPixelSize;
        this.A = dimensionPixelSize;
        this.f9207z = dimensionPixelSize;
        this.f9206y = dimensionPixelSize;
        this.f9206y = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9207z = d10.getDimensionPixelSize(20, dimensionPixelSize);
        this.A = d10.getDimensionPixelSize(18, dimensionPixelSize);
        this.B = d10.getDimensionPixelSize(17, dimensionPixelSize);
        if (ub.b.b(context2, R.attr.isMaterial3Theme, false)) {
            this.C = R.attr.textAppearanceTitleSmall;
        } else {
            this.C = R.attr.textAppearanceButton;
        }
        int resourceId = d10.getResourceId(24, 2132083243);
        this.D = resourceId;
        int[] iArr = kc.f.W;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.L = dimensionPixelSize2;
            this.F = ub.d.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(22)) {
                this.E = d10.getResourceId(22, resourceId);
            }
            int i6 = this.E;
            if (i6 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i6, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a10 = ub.d.a(context2, obtainStyledAttributes, 3);
                    if (a10 != null) {
                        this.F = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{a10.getColorForState(new int[]{16842913}, a10.getDefaultColor()), this.F.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d10.hasValue(25)) {
                this.F = ub.d.a(context2, d10, 25);
            }
            if (d10.hasValue(23)) {
                this.F = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d10.getColor(23, 0), this.F.getDefaultColor()});
            }
            this.G = ub.d.a(context2, d10, 3);
            this.K = w.d(d10.getInt(4, -1), null);
            this.H = ub.d.a(context2, d10, 21);
            this.U = d10.getInt(6, 300);
            this.f9189g0 = rb.a.d(context2, R.attr.motionEasingEmphasizedInterpolator, ab.a.f450b);
            this.P = d10.getDimensionPixelSize(14, -1);
            this.Q = d10.getDimensionPixelSize(13, -1);
            this.N = d10.getResourceId(0, 0);
            this.S = d10.getDimensionPixelSize(1, 0);
            this.W = d10.getInt(15, 1);
            this.T = d10.getInt(2, 0);
            this.f9185a0 = d10.getBoolean(12, false);
            this.e0 = d10.getBoolean(26, false);
            d10.recycle();
            Resources resources = getResources();
            this.M = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.R = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.f9203v;
        int size = arrayList.size();
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                g gVar = arrayList.get(i6);
                if (gVar != null && gVar.f9216a != null && !TextUtils.isEmpty(gVar.f9217b)) {
                    z10 = true;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        if (z10 && !this.f9185a0) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i6 = this.P;
        if (i6 != -1) {
            return i6;
        }
        int i10 = this.W;
        if (i10 != 0 && i10 != 2) {
            return 0;
        }
        return this.R;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9205x.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i6) {
        boolean z10;
        boolean z11;
        f fVar = this.f9205x;
        int childCount = fVar.getChildCount();
        if (i6 < childCount) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fVar.getChildAt(i10);
                boolean z12 = true;
                if ((i10 == i6 && !childAt.isSelected()) || (i10 != i6 && childAt.isSelected())) {
                    if (i10 == i6) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i10 != i6) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                } else {
                    if (i10 == i6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i10 != i6) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.f9191i0;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(g gVar, boolean z10) {
        ArrayList<g> arrayList = this.f9203v;
        int size = arrayList.size();
        if (gVar.f9221g == this) {
            gVar.f9219d = size;
            arrayList.add(size, gVar);
            int size2 = arrayList.size();
            int i6 = -1;
            for (int i10 = size + 1; i10 < size2; i10++) {
                if (arrayList.get(i10).f9219d == this.f9202u) {
                    i6 = i10;
                }
                arrayList.get(i10).f9219d = i10;
            }
            this.f9202u = i6;
            i iVar = gVar.f9222h;
            iVar.setSelected(false);
            iVar.setActivated(false);
            int i11 = gVar.f9219d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.W == 1 && this.T == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f9205x.addView(iVar, i11, layoutParams);
            if (z10) {
                gVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof cc.b) {
            cc.b bVar = (cc.b) view;
            g i6 = i();
            bVar.getClass();
            if (!TextUtils.isEmpty(bVar.getContentDescription())) {
                i6.f9218c = bVar.getContentDescription();
                i iVar = i6.f9222h;
                if (iVar != null) {
                    iVar.d();
                }
            }
            b(i6, this.f9203v.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i6) {
        boolean z10;
        if (i6 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.c(this)) {
                f fVar = this.f9205x;
                int childCount = fVar.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        if (fVar.getChildAt(i10).getWidth() <= 0) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int f2 = f(0.0f, i6);
                    if (scrollX != f2) {
                        g();
                        this.f9193k0.setIntValues(scrollX, f2);
                        this.f9193k0.start();
                    }
                    ValueAnimator valueAnimator = fVar.f9213u;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f9202u != i6) {
                        fVar.f9213u.cancel();
                    }
                    fVar.d(i6, this.U, true);
                    return;
                }
            }
        }
        n(i6, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int max;
        int i6 = this.W;
        if (i6 != 0 && i6 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.S - this.f9206y);
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        f fVar = this.f9205x;
        d0.e.k(fVar, max, 0, 0, 0);
        int i10 = this.W;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                if (this.T == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                fVar.setGravity(1);
            }
        } else {
            int i11 = this.T;
            if (i11 != 0) {
                if (i11 == 1) {
                    fVar.setGravity(1);
                }
            } else {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            }
            fVar.setGravity(8388611);
        }
        p(true);
    }

    public final int f(float f2, int i6) {
        f fVar;
        View childAt;
        View view;
        int i10 = this.W;
        int i11 = 0;
        if ((i10 != 0 && i10 != 2) || (childAt = (fVar = this.f9205x).getChildAt(i6)) == null) {
            return 0;
        }
        int i12 = i6 + 1;
        if (i12 < fVar.getChildCount()) {
            view = fVar.getChildAt(i12);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i11 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + i11) * 0.5f * f2);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.e.d(this) == 0) {
            return left + i13;
        }
        return left - i13;
    }

    public final void g() {
        if (this.f9193k0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9193k0 = valueAnimator;
            valueAnimator.setInterpolator(this.f9189g0);
            this.f9193k0.setDuration(this.U);
            this.f9193k0.addUpdateListener(new a());
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.f9204w;
        if (gVar != null) {
            return gVar.f9219d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9203v.size();
    }

    public int getTabGravity() {
        return this.T;
    }

    public ColorStateList getTabIconTint() {
        return this.G;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9187d0;
    }

    public int getTabIndicatorGravity() {
        return this.V;
    }

    public int getTabMaxWidth() {
        return this.O;
    }

    public int getTabMode() {
        return this.W;
    }

    public ColorStateList getTabRippleColor() {
        return this.H;
    }

    public Drawable getTabSelectedIndicator() {
        return this.I;
    }

    public ColorStateList getTabTextColors() {
        return this.F;
    }

    public final g h(int i6) {
        if (i6 >= 0 && i6 < getTabCount()) {
            return this.f9203v.get(i6);
        }
        return null;
    }

    public final g i() {
        i iVar;
        g gVar = (g) f9184t0.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f9221g = this;
        v.e eVar = this.f9201s0;
        if (eVar != null) {
            iVar = (i) eVar.b();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f9218c)) {
            iVar.setContentDescription(gVar.f9217b);
        } else {
            iVar.setContentDescription(gVar.f9218c);
        }
        gVar.f9222h = iVar;
        int i6 = gVar.f9223i;
        if (i6 != -1) {
            iVar.setId(i6);
        }
        return gVar;
    }

    public final void j() {
        int currentItem;
        k();
        k2.a aVar = this.f9195m0;
        if (aVar != null) {
            int g5 = aVar.g();
            for (int i6 = 0; i6 < g5; i6++) {
                g i10 = i();
                CharSequence h10 = this.f9195m0.h();
                if (TextUtils.isEmpty(i10.f9218c) && !TextUtils.isEmpty(h10)) {
                    i10.f9222h.setContentDescription(h10);
                }
                i10.f9217b = h10;
                i iVar = i10.f9222h;
                if (iVar != null) {
                    iVar.d();
                }
                b(i10, false);
            }
            ViewPager viewPager = this.f9194l0;
            if (viewPager != null && g5 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                l(h(currentItem), true);
            }
        }
    }

    public final void k() {
        f fVar = this.f9205x;
        for (int childCount = fVar.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f9201s0.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f9203v.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f9221g = null;
            next.f9222h = null;
            next.f9216a = null;
            next.f9223i = -1;
            next.f9217b = null;
            next.f9218c = null;
            next.f9219d = -1;
            next.f9220e = null;
            f9184t0.a(next);
        }
        this.f9204w = null;
    }

    public final void l(g gVar, boolean z10) {
        int i6;
        g gVar2 = this.f9204w;
        ArrayList<c> arrayList = this.f9191i0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
                d(gVar.f9219d);
                return;
            }
            return;
        }
        if (gVar != null) {
            i6 = gVar.f9219d;
        } else {
            i6 = -1;
        }
        if (z10) {
            if ((gVar2 == null || gVar2.f9219d == -1) && i6 != -1) {
                n(i6, 0.0f, true, true);
            } else {
                d(i6);
            }
            if (i6 != -1) {
                setSelectedTabView(i6);
            }
        }
        this.f9204w = gVar;
        if (gVar2 != null && gVar2.f9221g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).b(gVar);
            }
        }
    }

    public final void m(k2.a aVar, boolean z10) {
        e eVar;
        k2.a aVar2 = this.f9195m0;
        if (aVar2 != null && (eVar = this.f9196n0) != null) {
            aVar2.f22771a.unregisterObserver(eVar);
        }
        this.f9195m0 = aVar;
        if (z10 && aVar != null) {
            if (this.f9196n0 == null) {
                this.f9196n0 = new e();
            }
            aVar.f22771a.registerObserver(this.f9196n0);
        }
        j();
    }

    public final void n(int i6, float f2, boolean z10, boolean z11) {
        int f10;
        float f11 = i6 + f2;
        int round = Math.round(f11);
        if (round >= 0) {
            f fVar = this.f9205x;
            if (round < fVar.getChildCount()) {
                if (z11) {
                    fVar.getClass();
                    TabLayout.this.f9202u = Math.round(f11);
                    ValueAnimator valueAnimator = fVar.f9213u;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar.f9213u.cancel();
                    }
                    fVar.c(fVar.getChildAt(i6), fVar.getChildAt(i6 + 1), f2);
                }
                ValueAnimator valueAnimator2 = this.f9193k0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f9193k0.cancel();
                }
                if (i6 < 0) {
                    f10 = 0;
                } else {
                    f10 = f(f2, i6);
                }
                scrollTo(f10, 0);
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f9194l0;
        if (viewPager2 != null) {
            h hVar = this.f9197o0;
            if (hVar != null && (arrayList2 = viewPager2.f3102o0) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.f9198p0;
            if (bVar != null && (arrayList = this.f9194l0.f3104q0) != null) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.f9192j0;
        if (jVar != null) {
            this.f9191i0.remove(jVar);
            this.f9192j0 = null;
        }
        if (viewPager != null) {
            this.f9194l0 = viewPager;
            if (this.f9197o0 == null) {
                this.f9197o0 = new h(this);
            }
            h hVar2 = this.f9197o0;
            hVar2.f9226c = 0;
            hVar2.f9225b = 0;
            viewPager.b(hVar2);
            j jVar2 = new j(viewPager);
            this.f9192j0 = jVar2;
            a(jVar2);
            k2.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.f9198p0 == null) {
                this.f9198p0 = new b();
            }
            b bVar2 = this.f9198p0;
            bVar2.f9209a = true;
            if (viewPager.f3104q0 == null) {
                viewPager.f3104q0 = new ArrayList();
            }
            viewPager.f3104q0.add(bVar2);
            n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f9194l0 = null;
            m(null, false);
        }
        this.f9199q0 = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.Q0(this);
        if (this.f9194l0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9199q0) {
            setupWithViewPager(null);
            this.f9199q0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i6 = 0;
        while (true) {
            f fVar = this.f9205x;
            if (i6 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i6);
                if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).C) != null) {
                    drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                    iVar.C.draw(canvas);
                }
                i6++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(1, getTabCount(), 1, false).f33747a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        int round = Math.round(w.b(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i6);
        if (View.MeasureSpec.getMode(i6) != 0) {
            int i11 = this.Q;
            if (i11 <= 0) {
                i11 = (int) (size - w.b(56, getContext()));
            }
            this.O = i11;
        }
        super.onMeasure(i6, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.W;
            if (i12 != 0) {
                if (i12 != 1) {
                }
                if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10) {
        int i6 = 0;
        while (true) {
            f fVar = this.f9205x;
            if (i6 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i6);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.W == 1 && this.T == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f6.b.O0(this, f2);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f9185a0 != z10) {
            this.f9185a0 = z10;
            int i6 = 0;
            while (true) {
                f fVar = this.f9205x;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof i) {
                        i iVar = (i) childAt;
                        iVar.setOrientation(!TabLayout.this.f9185a0 ? 1 : 0);
                        TextView textView = iVar.A;
                        if (textView == null && iVar.B == null) {
                            iVar.g(iVar.f9228v, iVar.f9229w, true);
                        } else {
                            iVar.g(textView, iVar.B, false);
                        }
                    }
                    i6++;
                } else {
                    e();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i6) {
        setInlineLabel(getResources().getBoolean(i6));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f9193k0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = k0.a.g(drawable).mutate();
        this.I = mutate;
        mb.a.b(mutate, this.J);
        int i6 = this.c0;
        if (i6 == -1) {
            i6 = this.I.getIntrinsicHeight();
        }
        this.f9205x.b(i6);
    }

    public void setSelectedTabIndicatorColor(int i6) {
        this.J = i6;
        mb.a.b(this.I, i6);
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i6) {
        if (this.V != i6) {
            this.V = i6;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this.f9205x);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i6) {
        this.c0 = i6;
        this.f9205x.b(i6);
    }

    public void setTabGravity(int i6) {
        if (this.T != i6) {
            this.T = i6;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            ArrayList<g> arrayList = this.f9203v;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar = arrayList.get(i6).f9222h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i6) {
        setTabIconTint(g0.a.c(i6, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i6) {
        this.f9187d0 = i6;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    this.f9188f0 = new cc.a(1);
                    return;
                }
                throw new IllegalArgumentException(i6 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f9188f0 = new cc.a(0);
            return;
        }
        this.f9188f0 = new com.google.android.material.tabs.a();
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f9186b0 = z10;
        int i6 = f.f9212x;
        f fVar = this.f9205x;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.k(fVar);
    }

    public void setTabMode(int i6) {
        if (i6 != this.W) {
            this.W = i6;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            int i6 = 0;
            while (true) {
                f fVar = this.f9205x;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof i) {
                        Context context = getContext();
                        int i10 = i.F;
                        ((i) childAt).e(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i6) {
        setTabRippleColor(g0.a.c(i6, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            ArrayList<g> arrayList = this.f9203v;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar = arrayList.get(i6).f9222h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(k2.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.e0 != z10) {
            this.e0 = z10;
            int i6 = 0;
            while (true) {
                f fVar = this.f9205x;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof i) {
                        Context context = getContext();
                        int i10 = i.F;
                        ((i) childAt).e(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i6) {
        setUnboundedRipple(getResources().getBoolean(i6));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f9190h0;
        if (cVar2 != null) {
            this.f9191i0.remove(cVar2);
        }
        this.f9190h0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i6) {
        if (i6 != 0) {
            setSelectedTabIndicator(hc.d.H(getContext(), i6));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes.dex */
    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f9233a;

        public j(ViewPager viewPager) {
            this.f9233a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(g gVar) {
            this.f9233a.setCurrentItem(gVar.f9219d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(g gVar) {
        }
    }
}
