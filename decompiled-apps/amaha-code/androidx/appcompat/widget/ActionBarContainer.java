package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A;
    public final boolean B;
    public boolean C;
    public final int D;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1163u;

    /* renamed from: v  reason: collision with root package name */
    public e1 f1164v;

    /* renamed from: w  reason: collision with root package name */
    public View f1165w;

    /* renamed from: x  reason: collision with root package name */
    public View f1166x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f1167y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f1168z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        d0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.f23236z);
        boolean z10 = false;
        this.f1167y = obtainStyledAttributes.getDrawable(0);
        this.f1168z = obtainStyledAttributes.getDrawable(2);
        this.D = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.B = true;
            this.A = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.B ? !(this.f1167y != null || this.f1168z != null) : this.A == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1167y;
        if (drawable != null && drawable.isStateful()) {
            this.f1167y.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1168z;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1168z.setState(getDrawableState());
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null && drawable3.isStateful()) {
            this.A.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1164v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1167y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1168z;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1165w = findViewById(R.id.action_bar);
        this.f1166x = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1163u && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        Drawable drawable;
        super.onLayout(z10, i6, i10, i11, i12);
        e1 e1Var = this.f1164v;
        boolean z12 = true;
        boolean z13 = false;
        if (e1Var != null && e1Var.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (e1Var != null && e1Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i13 = ((FrameLayout.LayoutParams) e1Var.getLayoutParams()).bottomMargin;
            e1Var.layout(i6, (measuredHeight - e1Var.getMeasuredHeight()) - i13, i11, measuredHeight - i13);
        }
        if (this.B) {
            Drawable drawable2 = this.A;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = false;
            }
        } else {
            if (this.f1167y != null) {
                if (this.f1165w.getVisibility() == 0) {
                    this.f1167y.setBounds(this.f1165w.getLeft(), this.f1165w.getTop(), this.f1165w.getRight(), this.f1165w.getBottom());
                } else {
                    View view = this.f1166x;
                    if (view != null && view.getVisibility() == 0) {
                        this.f1167y.setBounds(this.f1166x.getLeft(), this.f1166x.getTop(), this.f1166x.getRight(), this.f1166x.getBottom());
                    } else {
                        this.f1167y.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.C = z11;
            if (z11 && (drawable = this.f1168z) != null) {
                drawable.setBounds(e1Var.getLeft(), e1Var.getTop(), e1Var.getRight(), e1Var.getBottom());
            } else {
                z12 = z13;
            }
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (this.f1165w == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i12 = this.D) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i6, i10);
        if (this.f1165w == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        e1 e1Var = this.f1164v;
        if (e1Var != null && e1Var.getVisibility() != 8 && mode != 1073741824) {
            View view = this.f1165w;
            boolean z11 = true;
            int i13 = 0;
            if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i13 = a(this.f1165w);
            } else {
                View view2 = this.f1166x;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    i13 = a(this.f1166x);
                }
            }
            if (mode == Integer.MIN_VALUE) {
                i11 = View.MeasureSpec.getSize(i10);
            } else {
                i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f1164v) + i13, i11));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1167y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1167y);
        }
        this.f1167y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1165w;
            if (view != null) {
                this.f1167y.setBounds(view.getLeft(), this.f1165w.getTop(), this.f1165w.getRight(), this.f1165w.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.B ? this.f1167y != null || this.f1168z != null : this.A != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A);
        }
        this.A = drawable;
        boolean z10 = this.B;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.A) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f1167y != null || this.f1168z != null) : this.A == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2;
        Drawable drawable3 = this.f1168z;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1168z);
        }
        this.f1168z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.C && (drawable2 = this.f1168z) != null) {
                drawable2.setBounds(this.f1164v.getLeft(), this.f1164v.getTop(), this.f1164v.getRight(), this.f1164v.getBottom());
            }
        }
        if (!this.B ? !(this.f1167y != null || this.f1168z != null) : this.A == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(e1 e1Var) {
        e1 e1Var2 = this.f1164v;
        if (e1Var2 != null) {
            removeView(e1Var2);
        }
        this.f1164v = e1Var;
        if (e1Var != null) {
            addView(e1Var);
            ViewGroup.LayoutParams layoutParams = e1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            e1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        int i6;
        this.f1163u = z10;
        if (z10) {
            i6 = 393216;
        } else {
            i6 = 262144;
        }
        setDescendantFocusability(i6);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        boolean z10;
        super.setVisibility(i6);
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f1167y;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1168z;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1167y;
        boolean z10 = this.B;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f1168z && this.C) || ((drawable == this.A && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }
}
