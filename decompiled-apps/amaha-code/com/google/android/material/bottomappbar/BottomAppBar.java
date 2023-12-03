package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import db.c;
import db.d;
import db.e;
import db.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k0.a;
import qb.w;
import t.h;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int D0 = 0;
    public int A0;
    public boolean B0;
    public Behavior C0;

    /* renamed from: r0  reason: collision with root package name */
    public Integer f8818r0;

    /* renamed from: s0  reason: collision with root package name */
    public Animator f8819s0;

    /* renamed from: t0  reason: collision with root package name */
    public Animator f8820t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f8821u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f8822v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f8823w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f8824x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f8825y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f8826z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f8832u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f8833v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f8834w;

        public a(ActionMenuView actionMenuView, int i6, boolean z10) {
            this.f8832u = actionMenuView;
            this.f8833v = i6;
            this.f8834w = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = this.f8833v;
            boolean z10 = this.f8834w;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f8832u;
            actionMenuView.setTranslationX(bottomAppBar.x(actionMenuView, i6, z10));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends z0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f8836w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f8837x;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Toolbar.i iVar) {
            super(iVar);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f8836w);
            parcel.writeInt(this.f8837x ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8836w = parcel.readInt();
            this.f8837x = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return rb.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return y(this.f8821u0);
    }

    private float getFabTranslationY() {
        if (this.f8823w0 == 1) {
            return -getTopEdgeTreatment().f12732x;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final void A() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.B0) {
            z();
        }
        throw null;
    }

    public final void B(int i6) {
        float f = i6;
        if (f == getTopEdgeTreatment().f12731w) {
            return;
        }
        getTopEdgeTreatment().f12731w = f;
        throw null;
    }

    public final void C(ActionMenuView actionMenuView, int i6, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i6, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f12732x;
    }

    public int getFabAlignmentMode() {
        return this.f8821u0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f8824x0;
    }

    public int getFabAnchorMode() {
        return this.f8823w0;
    }

    public int getFabAnimationMode() {
        return this.f8822v0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f12730v;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f12729u;
    }

    public boolean getHideOnScroll() {
        return this.f8826z0;
    }

    public int getMenuAlignmentMode() {
        return this.f8825y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.R0(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10) {
            Animator animator = this.f8820t0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f8819s0;
            if (animator2 != null) {
                animator2.cancel();
            }
            A();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f8820t0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!z()) {
                C(actionMenuView, 0, false, false);
            } else {
                C(actionMenuView, this.f8821u0, this.B0, false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f39113u);
        this.f8821u0 = bVar.f8836w;
        this.B0 = bVar.f8837x;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.i) super.onSaveInstanceState());
        bVar.f8836w = this.f8821u0;
        bVar.f8837x = this.B0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.f12732x = f;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i6) {
        int i10;
        this.A0 = 0;
        boolean z10 = this.B0;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (!d0.g.c(this)) {
            int i11 = this.A0;
            if (i11 != 0) {
                this.A0 = 0;
                getMenu().clear();
                k(i11);
            }
        } else {
            Animator animator = this.f8820t0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!z()) {
                z10 = false;
                i10 = 0;
            } else {
                i10 = i6;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
                if (Math.abs(actionMenuView.getTranslationX() - x(actionMenuView, i10, z10)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                    ofFloat2.addListener(new d(this, actionMenuView, i10, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f8820t0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f8820t0.start();
        }
        if (this.f8821u0 != i6 && d0.g.c(this)) {
            Animator animator2 = this.f8819s0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            FloatingActionButton floatingActionButton = null;
            if (this.f8822v0 == 1) {
                View w10 = w();
                if (w10 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) w10;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, "translationX", y(i6));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View w11 = w();
                if (w11 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) w11;
                }
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new db.b(this, i6), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(rb.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f449a));
            this.f8819s0 = animatorSet3;
            animatorSet3.addListener(new db.a(this));
            this.f8819s0.start();
        }
        this.f8821u0 = i6;
    }

    public void setFabAlignmentModeEndMargin(int i6) {
        if (this.f8824x0 == i6) {
            return;
        }
        this.f8824x0 = i6;
        A();
        throw null;
    }

    public void setFabAnchorMode(int i6) {
        this.f8823w0 = i6;
        A();
        throw null;
    }

    public void setFabAnimationMode(int i6) {
        this.f8822v0 = i6;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().f12733y) {
            return;
        }
        getTopEdgeTreatment().f12733y = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f12730v = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f12729u = f;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f8826z0 = z10;
    }

    public void setMenuAlignmentMode(int i6) {
        if (this.f8825y0 != i6) {
            this.f8825y0 = i6;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                C(actionMenuView, this.f8821u0, z(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f8818r0 != null) {
            drawable = k0.a.g(drawable.mutate());
            a.b.g(drawable, this.f8818r0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f8818r0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View w() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((h) coordinatorLayout.f1922v.f34632w).getOrDefault(this, null);
        ArrayList arrayList = coordinatorLayout.f1924x;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    public final int x(ActionMenuView actionMenuView, int i6, boolean z10) {
        int i10;
        int left;
        int i11;
        boolean z11;
        if (this.f8825y0 != 1 && (i6 != 1 || !z10)) {
            return 0;
        }
        boolean c10 = w.c(this);
        if (c10) {
            i10 = getMeasuredWidth();
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f16001a & 8388615) == 8388611) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (c10) {
                    i10 = Math.min(i10, childAt.getLeft());
                } else {
                    i10 = Math.max(i10, childAt.getRight());
                }
            }
        }
        if (c10) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (getNavigationIcon() == null) {
            i11 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!c10) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        return i10 - ((left + 0) + i11);
    }

    public final float y(int i6) {
        boolean c10 = w.c(this);
        int i10 = 1;
        if (i6 == 1) {
            View w10 = w();
            int i11 = 0;
            if (this.f8824x0 != -1 && w10 != null) {
                i11 = 0 + (w10.getMeasuredWidth() / 2) + this.f8824x0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - i11;
            if (c10) {
                i10 = -1;
            }
            return measuredWidth * i10;
        }
        return 0.0f;
    }

    public final boolean z() {
        FloatingActionButton floatingActionButton;
        View w10 = w();
        if (w10 instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton) w10;
        } else {
            floatingActionButton = null;
        }
        if (floatingActionButton != null && floatingActionButton.j()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.C0 == null) {
            this.C0 = new Behavior();
        }
        return this.C0;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f8827j;

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<BottomAppBar> f8828k;

        /* renamed from: l  reason: collision with root package name */
        public int f8829l;

        /* renamed from: m  reason: collision with root package name */
        public final a f8830m;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f8828k.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        int measuredWidth = floatingActionButton.getMeasuredWidth();
                        int measuredHeight = floatingActionButton.getMeasuredHeight();
                        Rect rect = behavior.f8827j;
                        rect.set(0, 0, measuredWidth, measuredHeight);
                        floatingActionButton.k(rect);
                        int height2 = rect.height();
                        bottomAppBar.B(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f38456e.a(new RectF(rect)));
                        height = height2;
                    }
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (behavior.f8829l == 0) {
                        int measuredHeight2 = (view.getMeasuredHeight() - height) / 2;
                        int i17 = bottomAppBar.f8823w0;
                        if (i17 == 1) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight2);
                        } else if (i17 == 0) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (w.c(view)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += 0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += 0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f8830m = new a();
            this.f8827j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i6) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f8828k = new WeakReference<>(bottomAppBar);
            int i10 = BottomAppBar.D0;
            View w10 = bottomAppBar.w();
            if (w10 != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (!d0.g.c(w10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) w10.getLayoutParams();
                    fVar.f1932d = 17;
                    int i11 = bottomAppBar.f8823w0;
                    if (i11 == 1) {
                        fVar.f1932d = 49;
                    }
                    if (i11 == 0) {
                        fVar.f1932d |= 80;
                    }
                    this.f8829l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) w10.getLayoutParams())).bottomMargin;
                    if (w10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) w10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d();
                        floatingActionButton.e(new e(bottomAppBar));
                        floatingActionButton.f();
                    }
                    w10.addOnLayoutChangeListener(this.f8830m);
                    bottomAppBar.A();
                    throw null;
                }
            }
            coordinatorLayout.l(i6, bottomAppBar);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i6);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i6, i10)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8830m = new a();
            this.f8827j = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
