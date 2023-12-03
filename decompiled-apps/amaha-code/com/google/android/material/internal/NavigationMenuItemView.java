package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.p1;
import androidx.core.widget.k;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import i0.f;
import java.util.WeakHashMap;
import k0.a;
import qb.g;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements k.a {
    public static final int[] c0 = {16842912};
    public int P;
    public boolean Q;
    public boolean R;
    public final CheckedTextView S;
    public FrameLayout T;
    public h U;
    public ColorStateList V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f9090a0;

    /* renamed from: b0  reason: collision with root package name */
    public final a f9091b0;

    /* loaded from: classes.dex */
    public class a extends t0.a {
        public a() {
        }

        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.R);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.T == null) {
                this.T = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.T.removeAllViews();
            this.T.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i6;
        StateListDrawable stateListDrawable;
        this.U = hVar;
        int i10 = hVar.f1118a;
        if (i10 > 0) {
            setId(i10);
        }
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(c0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f1122e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f1133q);
        p1.a(this, hVar.r);
        h hVar2 = this.U;
        z10 = (hVar2.f1122e == null && hVar2.getIcon() == null && this.U.getActionView() != null) ? false : false;
        CheckedTextView checkedTextView = this.S;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.T;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.T.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.T;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.T.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        h hVar = this.U;
        if (hVar != null && hVar.isCheckable() && this.U.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, c0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.R != z10) {
            this.R = z10;
            this.f9091b0.h(this.S, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.S;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = k0.a.g(drawable).mutate();
                a.b.h(drawable, this.V);
            }
            int i6 = this.P;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.Q) {
            if (this.f9090a0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f19628a;
                Drawable a10 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.f9090a0 = a10;
                if (a10 != null) {
                    int i10 = this.P;
                    a10.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f9090a0;
        }
        k.b.e(this.S, drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.S.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.P = i6;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.V = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        h hVar = this.U;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.S.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.Q = z10;
    }

    public void setTextAppearance(int i6) {
        androidx.core.widget.k.e(this.S, i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.S.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f9091b0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.S = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        d0.q(checkedTextView, aVar);
    }
}
