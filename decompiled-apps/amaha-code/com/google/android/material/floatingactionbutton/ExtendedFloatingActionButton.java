package com.google.android.material.floatingactionbutton;

import ab.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import qb.e;
import t0.d0;
import t0.o0;
import ug.l;
/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            return Float.valueOf(d0.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int intValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.e.k(view2, intValue, paddingTop, d0.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            return Float.valueOf(d0.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.e.k(view2, d0.e.f(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i6) {
        extendedFloatingActionButton.getClass();
        if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 3) {
            throw new IllegalStateException(defpackage.c.p("Unknown strategy type: ", i6));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i6) {
        setExtendMotionSpec(g.b(i6, getContext()));
    }

    public void setExtended(boolean z10) {
        if (!z10) {
            return;
        }
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(g.b(i6, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        super.setPadding(i6, i10, i11, i12);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
        super.setPaddingRelative(i6, i10, i11, i12);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(g.b(i6, getContext()));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i6) {
        setShrinkMotionSpec(g.b(i6, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i6) {
        super.setTextColor(i6);
        getTextColors();
    }

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f9020a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9021b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9022c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9021b = false;
            this.f9022c = true;
        }

        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f9021b;
            int i6 = 1;
            int i10 = 0;
            boolean z12 = this.f9022c;
            if ((!z11 && !z12) || fVar.f != appBarLayout.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
            if (this.f9020a == null) {
                this.f9020a = new Rect();
            }
            Rect rect = this.f9020a;
            e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z12) {
                    i6 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i6);
                throw null;
            }
            if (z12) {
                i10 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            throw null;
        }

        public final void b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f9021b;
            int i6 = 1;
            int i10 = 0;
            boolean z12 = this.f9022c;
            if ((!z11 && !z12) || fVar.f != view.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z12) {
                    i6 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i6);
                throw null;
            }
            if (z12) {
                i10 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.f1935h == 0) {
                fVar.f1935h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f1929a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList e10 = coordinatorLayout.e(extendedFloatingActionButton);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) e10.get(i10);
                if (view2 instanceof AppBarLayout) {
                    a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f1929a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.l(i6, extendedFloatingActionButton);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34130m);
            this.f9021b = obtainStyledAttributes.getBoolean(0, false);
            this.f9022c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }
}
