package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.theinnerhour.b2b.R;
/* loaded from: classes.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] A = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f9164z;

    /* loaded from: classes.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.e {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i6, int i10) {
            super.onMeasure(i6, i10);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f9164z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Snackbar h(ViewGroup viewGroup, String str, int i6) {
        ViewGroup viewGroup2;
        int i10;
        ViewGroup viewGroup3 = null;
        while (true) {
            if (viewGroup instanceof CoordinatorLayout) {
                viewGroup2 = (ViewGroup) viewGroup;
                break;
            }
            if (viewGroup instanceof FrameLayout) {
                if (viewGroup.getId() == 16908290) {
                    viewGroup2 = (ViewGroup) viewGroup;
                    break;
                }
                viewGroup3 = viewGroup;
            }
            if (viewGroup != 0) {
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof View) {
                    viewGroup = (View) parent;
                    continue;
                } else {
                    viewGroup = 0;
                    continue;
                }
            }
            if (viewGroup == 0) {
                viewGroup2 = viewGroup3;
                break;
            }
        }
        if (viewGroup2 != null) {
            Context context = viewGroup2.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z10 = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if ((resourceId == -1 || resourceId2 == -1) ? false : false) {
                i10 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i10 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i10, viewGroup2, false);
            Snackbar snackbar = new Snackbar(context, viewGroup2, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f9144i.getChildAt(0)).getMessageView().setText(str);
            snackbar.f9146k = i6;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    public final int g() {
        int recommendedTimeoutMillis;
        int i6 = this.f9146k;
        if (i6 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.f9164z.getRecommendedTimeoutMillis(i6, 3);
            return recommendedTimeoutMillis;
        }
        return i6;
    }

    public final void i() {
        boolean z10;
        g b10 = g.b();
        int g5 = g();
        BaseTransientBottomBar.c cVar = this.f9153s;
        synchronized (b10.f9176a) {
            if (b10.c(cVar)) {
                g.c cVar2 = b10.f9178c;
                cVar2.f9182b = g5;
                b10.f9177b.removeCallbacksAndMessages(cVar2);
                b10.f(b10.f9178c);
                return;
            }
            g.c cVar3 = b10.f9179d;
            boolean z11 = false;
            if (cVar3 != null) {
                if (cVar != null && cVar3.f9181a.get() == cVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (z11) {
                b10.f9179d.f9182b = g5;
            } else {
                b10.f9179d = new g.c(g5, cVar);
            }
            g.c cVar4 = b10.f9178c;
            if (cVar4 == null || !b10.a(cVar4, 4)) {
                b10.f9178c = null;
                g.c cVar5 = b10.f9179d;
                if (cVar5 != null) {
                    b10.f9178c = cVar5;
                    b10.f9179d = null;
                    g.b bVar = cVar5.f9181a.get();
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        b10.f9178c = null;
                    }
                }
            }
        }
    }
}
