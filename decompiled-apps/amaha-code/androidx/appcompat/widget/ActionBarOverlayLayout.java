package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
import g.k;
import java.util.WeakHashMap;
import t0.d0;
import t0.s0;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements n0, t0.q, t0.r {
    public static final int[] V = {R.attr.actionBarSize, 16842841};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final Rect H;
    public final Rect I;
    public final Rect J;
    public t0.s0 K;
    public t0.s0 L;
    public t0.s0 M;
    public t0.s0 N;
    public d O;
    public OverScroller P;
    public ViewPropertyAnimator Q;
    public final a R;
    public final b S;
    public final c T;
    public final t0.s U;

    /* renamed from: u  reason: collision with root package name */
    public int f1170u;

    /* renamed from: v  reason: collision with root package name */
    public int f1171v;

    /* renamed from: w  reason: collision with root package name */
    public ContentFrameLayout f1172w;

    /* renamed from: x  reason: collision with root package name */
    public ActionBarContainer f1173x;

    /* renamed from: y  reason: collision with root package name */
    public o0 f1174y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f1175z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = null;
            actionBarOverlayLayout.E = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = null;
            actionBarOverlayLayout.E = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.Q = actionBarOverlayLayout.f1173x.animate().translationY(0.0f).setListener(actionBarOverlayLayout.R);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.Q = actionBarOverlayLayout.f1173x.animate().translationY(-actionBarOverlayLayout.f1173x.getHeight()).setListener(actionBarOverlayLayout.R);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e() {
            super(-1, -1);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1171v = 0;
        this.H = new Rect();
        this.I = new Rect();
        this.J = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        t0.s0 s0Var = t0.s0.f32350b;
        this.K = s0Var;
        this.L = s0Var;
        this.M = s0Var;
        this.N = s0Var;
        this.R = new a();
        this.S = new b();
        this.T = new c();
        l(context);
        this.U = new t0.s();
    }

    public static boolean j(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i6 != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean a() {
        m();
        return this.f1174y.a();
    }

    @Override // androidx.appcompat.widget.n0
    public final void b() {
        m();
        this.f1174y.b();
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean c() {
        m();
        return this.f1174y.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.n0
    public final void d(androidx.appcompat.view.menu.f fVar, k.c cVar) {
        m();
        this.f1174y.d(fVar, cVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        if (this.f1175z != null && !this.A) {
            if (this.f1173x.getVisibility() == 0) {
                i6 = (int) (this.f1173x.getTranslationY() + this.f1173x.getBottom() + 0.5f);
            } else {
                i6 = 0;
            }
            this.f1175z.setBounds(0, i6, getWidth(), this.f1175z.getIntrinsicHeight() + i6);
            this.f1175z.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean e() {
        m();
        return this.f1174y.e();
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean f() {
        m();
        return this.f1174y.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean g() {
        m();
        return this.f1174y.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1173x;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t0.s sVar = this.U;
        return sVar.f32349b | sVar.f32348a;
    }

    public CharSequence getTitle() {
        m();
        return this.f1174y.getTitle();
    }

    @Override // androidx.appcompat.widget.n0
    public final void h(int i6) {
        m();
        if (i6 != 2) {
            if (i6 != 5) {
                if (i6 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f1174y.s();
            return;
        }
        this.f1174y.r();
    }

    @Override // androidx.appcompat.widget.n0
    public final void i() {
        m();
        this.f1174y.h();
    }

    public final void k() {
        removeCallbacks(this.S);
        removeCallbacks(this.T);
        ViewPropertyAnimator viewPropertyAnimator = this.Q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(V);
        boolean z11 = false;
        this.f1170u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1175z = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.A = z11;
        this.P = new OverScroller(context);
    }

    public final void m() {
        o0 wrapper;
        if (this.f1172w == null) {
            this.f1172w = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1173x = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof o0) {
                wrapper = (o0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f1174y = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        t0.s0 h10 = t0.s0.h(windowInsets, this);
        boolean j10 = j(this.f1173x, new Rect(h10.b(), h10.d(), h10.c(), h10.a()), false);
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        Rect rect = this.H;
        d0.i.b(this, h10, rect);
        int i6 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        s0.k kVar = h10.f32351a;
        t0.s0 l2 = kVar.l(i6, i10, i11, i12);
        this.K = l2;
        boolean z10 = true;
        if (!this.L.equals(l2)) {
            this.L = this.K;
            j10 = true;
        }
        Rect rect2 = this.I;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = j10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f32351a.c().f32351a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        d0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int measuredHeight;
        s0.e bVar;
        m();
        measureChildWithMargins(this.f1173x, i6, 0, i10, 0);
        e eVar = (e) this.f1173x.getLayoutParams();
        int max = Math.max(0, this.f1173x.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1173x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1173x.getMeasuredState());
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if ((d0.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f1170u;
            if (this.C && this.f1173x.getTabContainer() != null) {
                measuredHeight += this.f1170u;
            }
        } else {
            measuredHeight = this.f1173x.getVisibility() != 8 ? this.f1173x.getMeasuredHeight() : 0;
        }
        Rect rect = this.H;
        Rect rect2 = this.J;
        rect2.set(rect);
        t0.s0 s0Var = this.K;
        this.M = s0Var;
        if (!this.B && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.M = s0Var.f32351a.l(0, measuredHeight, 0, 0);
        } else {
            j0.e a10 = j0.e.a(s0Var.b(), this.M.d() + measuredHeight, this.M.c(), this.M.a() + 0);
            t0.s0 s0Var2 = this.M;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                bVar = new s0.d(s0Var2);
            } else if (i11 >= 29) {
                bVar = new s0.c(s0Var2);
            } else {
                bVar = new s0.b(s0Var2);
            }
            bVar.d(a10);
            this.M = bVar.b();
        }
        j(this.f1172w, rect2, true);
        if (!this.N.equals(this.M)) {
            t0.s0 s0Var3 = this.M;
            this.N = s0Var3;
            t0.d0.b(this.f1172w, s0Var3);
        }
        measureChildWithMargins(this.f1172w, i6, 0, i10, 0);
        e eVar2 = (e) this.f1172w.getLayoutParams();
        int max3 = Math.max(max, this.f1172w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1172w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1172w.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i6, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z10) {
        boolean z11 = false;
        if (!this.D || !z10) {
            return false;
        }
        this.P.fling(0, 0, 0, (int) f2, 0, 0, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        if (this.P.getFinalY() > this.f1173x.getHeight()) {
            z11 = true;
        }
        if (z11) {
            k();
            this.T.run();
        } else {
            k();
            this.S.run();
        }
        this.E = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr) {
    }

    @Override // t0.r
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        onNestedScroll(view, i6, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        g.c0 c0Var;
        k.g gVar;
        this.U.f32348a = i6;
        this.F = getActionBarHideOffset();
        k();
        d dVar = this.O;
        if (dVar == null || (gVar = (c0Var = (g.c0) dVar).f16035t) == null) {
            return;
        }
        gVar.a();
        c0Var.f16035t = null;
    }

    @Override // t0.q
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // t0.q
    public final void onStopNestedScroll(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i6) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i6);
        m();
        int i10 = this.G ^ i6;
        this.G = i6;
        if ((i6 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i6 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.O;
        if (dVar != null) {
            ((g.c0) dVar).f16032p = !z11;
            if (!z10 && z11) {
                g.c0 c0Var = (g.c0) dVar;
                if (!c0Var.f16033q) {
                    c0Var.f16033q = true;
                    c0Var.u(true);
                }
            } else {
                g.c0 c0Var2 = (g.c0) dVar;
                if (c0Var2.f16033q) {
                    c0Var2.f16033q = false;
                    c0Var2.u(true);
                }
            }
        }
        if ((i10 & 256) != 0 && this.O != null) {
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            d0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f1171v = i6;
        d dVar = this.O;
        if (dVar != null) {
            ((g.c0) dVar).f16031o = i6;
        }
    }

    public void setActionBarHideOffset(int i6) {
        k();
        this.f1173x.setTranslationY(-Math.max(0, Math.min(i6, this.f1173x.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.O = dVar;
        if (getWindowToken() != null) {
            ((g.c0) this.O).f16031o = this.f1171v;
            int i6 = this.G;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                d0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.C = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            if (!z10) {
                k();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i6) {
        m();
        this.f1174y.setIcon(i6);
    }

    public void setLogo(int i6) {
        m();
        this.f1174y.m(i6);
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.B = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A = z11;
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f1174y.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f1174y.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // t0.q
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i6, i10, iArr);
        }
    }

    @Override // t0.q
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i6, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f1173x.getVisibility() != 0) {
            return false;
        }
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.D || this.E) {
            return;
        }
        if (this.F <= this.f1173x.getHeight()) {
            k();
            postDelayed(this.S, 600L);
            return;
        }
        k();
        postDelayed(this.T, 600L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12) {
        int i13 = this.F + i10;
        this.F = i13;
        setActionBarHideOffset(i13);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f1174y.setIcon(drawable);
    }

    @Override // t0.q
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i6) {
    }
}
