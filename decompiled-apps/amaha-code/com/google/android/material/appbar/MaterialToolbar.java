package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k0.a;
import qb.t;
import qb.u;
import t0.d0;
import t0.o0;
import ug.l;
import yb.f;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: w0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f8778w0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: r0  reason: collision with root package name */
    public Integer f8779r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f8780s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f8781t0;

    /* renamed from: u0  reason: collision with root package name */
    public ImageView.ScaleType f8782u0;

    /* renamed from: v0  reason: collision with root package name */
    public Boolean f8783v0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.toolbarStyle, 2132083907), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d10 = t.d(context2, attributeSet, l.B, R.attr.toolbarStyle, 2132083907, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.f8780s0 = d10.getBoolean(4, false);
        this.f8781t0 = d10.getBoolean(3, false);
        int i6 = d10.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f8778w0;
            if (i6 < scaleTypeArr.length) {
                this.f8782u0 = scaleTypeArr[i6];
            }
        }
        if (d10.hasValue(0)) {
            this.f8783v0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            fVar.i(context2);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            fVar.j(d0.i.i(this));
            d0.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f8782u0;
    }

    public Integer getNavigationIconTint() {
        return this.f8779r0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.Q0(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i6, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f8780s0 || this.f8781t0) {
            ArrayList b10 = u.b(this, getTitle());
            boolean isEmpty = b10.isEmpty();
            u.a aVar = u.f29511a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(b10, aVar);
            }
            ArrayList b11 = u.b(this, getSubtitle());
            if (b11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(b11, aVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f8780s0 && textView != null) {
                    t(textView, pair);
                }
                if (this.f8781t0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f8783v0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f8782u0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f6.b.O0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f8783v0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f8783v0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f8782u0 != scaleType) {
            this.f8782u0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f8779r0 != null) {
            drawable = k0.a.g(drawable.mutate());
            a.b.g(drawable, this.f8779r0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f8779r0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f8781t0 != z10) {
            this.f8781t0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f8780s0 != z10) {
            this.f8780s0 = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i6;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i6 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i6, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i6, textView.getTop(), i10, textView.getBottom());
    }
}
