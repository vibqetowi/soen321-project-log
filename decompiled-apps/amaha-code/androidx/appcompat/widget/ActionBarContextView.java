package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    public CharSequence C;
    public CharSequence D;
    public View E;
    public View F;
    public View G;
    public LinearLayout H;
    public TextView I;
    public TextView J;
    public final int K;
    public final int L;
    public boolean M;
    public final int N;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k.a f1169u;

        public a(k.a aVar) {
            this.f1169u = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f1169u.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.C, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = hc.d.H(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        d0.d.q(this, drawable);
        this.K = obtainStyledAttributes.getResourceId(5, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.f1338y = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.N = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void f(k.a aVar) {
        View view = this.E;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.N, (ViewGroup) this, false);
            this.E = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.E);
        }
        View findViewById = this.E.findViewById(R.id.action_mode_close_button);
        this.F = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        androidx.appcompat.view.menu.f e10 = aVar.e();
        c cVar = this.f1337x;
        if (cVar != null) {
            cVar.b();
            c.a aVar2 = cVar.O;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f1151j.dismiss();
            }
        }
        c cVar2 = new c(getContext());
        this.f1337x = cVar2;
        cVar2.G = true;
        cVar2.H = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f1337x, this.f1335v);
        c cVar3 = this.f1337x;
        androidx.appcompat.view.menu.k kVar = cVar3.B;
        if (kVar == null) {
            androidx.appcompat.view.menu.k kVar2 = (androidx.appcompat.view.menu.k) cVar3.f1060x.inflate(cVar3.f1062z, (ViewGroup) this, false);
            cVar3.B = kVar2;
            kVar2.b(cVar3.f1059w);
            cVar3.d(true);
        }
        androidx.appcompat.view.menu.k kVar3 = cVar3.B;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f1336w = actionMenuView;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        d0.d.q(actionMenuView, null);
        addView(this.f1336w, layoutParams);
    }

    public final void g() {
        int i6;
        if (this.H == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.H = linearLayout;
            this.I = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.J = (TextView) this.H.findViewById(R.id.action_bar_subtitle);
            int i10 = this.K;
            if (i10 != 0) {
                this.I.setTextAppearance(getContext(), i10);
            }
            int i11 = this.L;
            if (i11 != 0) {
                this.J.setTextAppearance(getContext(), i11);
            }
        }
        this.I.setText(this.C);
        this.J.setText(this.D);
        boolean z10 = !TextUtils.isEmpty(this.C);
        boolean z11 = !TextUtils.isEmpty(this.D);
        TextView textView = this.J;
        int i12 = 0;
        if (z11) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        textView.setVisibility(i6);
        LinearLayout linearLayout2 = this.H;
        if (!z10 && !z11) {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        if (this.H.getParent() == null) {
            addView(this.H);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public final void h() {
        removeAllViews();
        this.G = null;
        this.f1336w = null;
        this.f1337x = null;
        View view = this.F;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1337x;
        if (cVar != null) {
            cVar.b();
            c.a aVar = this.f1337x.O;
            if (aVar != null && aVar.b()) {
                aVar.f1151j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean a10 = u1.a(this);
        if (a10) {
            paddingLeft = (i11 - i6) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.E;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            if (a10) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i15 = paddingLeft - i13;
            } else {
                i15 = paddingLeft + i13;
            }
            int d10 = androidx.appcompat.widget.a.d(i15, paddingTop, paddingTop2, this.E, a10) + i15;
            if (a10) {
                i16 = d10 - i14;
            } else {
                i16 = d10 + i14;
            }
            paddingLeft = i16;
        }
        LinearLayout linearLayout = this.H;
        if (linearLayout != null && this.G == null && linearLayout.getVisibility() != 8) {
            paddingLeft += androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, this.H, a10);
        }
        View view2 = this.G;
        if (view2 != null) {
            androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, view2, a10);
        }
        if (a10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i11 - i6) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1336w;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 0) {
                int size = View.MeasureSpec.getSize(i6);
                int i14 = this.f1338y;
                if (i14 <= 0) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i15 = i14 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, LinearLayoutManager.INVALID_OFFSET);
                View view = this.E;
                if (view != null) {
                    int c10 = androidx.appcompat.widget.a.c(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
                    paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1336w;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = androidx.appcompat.widget.a.c(this.f1336w, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.H;
                if (linearLayout != null && this.G == null) {
                    if (this.M) {
                        this.H.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.H.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.H;
                        if (z10) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout2.setVisibility(i12);
                    } else {
                        paddingLeft = androidx.appcompat.widget.a.c(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.G;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i16 = layoutParams.width;
                    if (i16 != -2) {
                        i11 = 1073741824;
                    } else {
                        i11 = LinearLayoutManager.INVALID_OFFSET;
                    }
                    if (i16 >= 0) {
                        paddingLeft = Math.min(i16, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    if (i17 == -2) {
                        i13 = LinearLayoutManager.INVALID_OFFSET;
                    }
                    if (i17 >= 0) {
                        i15 = Math.min(i17, i15);
                    }
                    this.G.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i15, i13));
                }
                if (this.f1338y <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i14);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i6) {
        this.f1338y = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.G;
        if (view2 != null) {
            removeView(view2);
        }
        this.G = view;
        if (view != null && (linearLayout = this.H) != null) {
            removeView(linearLayout);
            this.H = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.D = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.C = charSequence;
        g();
        t0.d0.r(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.M) {
            requestLayout();
        }
        this.M = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
