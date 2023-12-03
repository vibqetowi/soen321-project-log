package dc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.v0;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.a;
import t0.d0;
import t0.o0;
/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public final class q extends androidx.appcompat.widget.d {
    public final Rect A;
    public final int B;
    public final float C;
    public int D;
    public ColorStateList E;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f12799y;

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f12800z;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes.dex */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: u  reason: collision with root package name */
        public ColorStateList f12801u;

        /* renamed from: v  reason: collision with root package name */
        public ColorStateList f12802v;

        public a(Context context, int i6, String[] strArr) {
            super(context, i6, strArr);
            b();
        }

        public final void b() {
            boolean z10;
            ColorStateList colorStateList;
            boolean z11;
            boolean z12;
            q qVar = q.this;
            ColorStateList colorStateList2 = qVar.E;
            if (colorStateList2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z10) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f12802v = colorStateList;
            if (qVar.D != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (qVar.E != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{j0.d.f(qVar.E.getColorForState(iArr3, 0), qVar.D), j0.d.f(qVar.E.getColorForState(iArr2, 0), qVar.D), qVar.D});
                }
            }
            this.f12801u = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            boolean z10;
            View view2 = super.getView(i6, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                q qVar = q.this;
                RippleDrawable rippleDrawable = null;
                if (qVar.getText().toString().contentEquals(textView.getText())) {
                    if (qVar.D != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ColorDrawable colorDrawable = new ColorDrawable(qVar.D);
                        if (this.f12802v != null) {
                            a.b.h(colorDrawable, this.f12801u);
                            rippleDrawable = new RippleDrawable(this.f12802v, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public q(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.A = new Rect();
        Context context2 = getContext();
        TypedArray d10 = qb.t.d(context2, attributeSet, ug.l.r, R.attr.autoCompleteTextViewStyle, com.appsflyer.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.B = d10.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.C = d10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.D = d10.getColor(3, 0);
        this.E = ub.d.a(context2, d10, 4);
        this.f12800z = (AccessibilityManager) context2.getSystemService("accessibility");
        v0 v0Var = new v0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f12799y = v0Var;
        v0Var.S = true;
        androidx.appcompat.widget.p pVar = v0Var.T;
        pVar.setFocusable(true);
        v0Var.I = this;
        pVar.setInputMethodMode(2);
        v0Var.p(getAdapter());
        v0Var.J = new p(this);
        if (d10.hasValue(5)) {
            setSimpleItems(d10.getResourceId(5, 0));
        }
        d10.recycle();
    }

    public static void a(q qVar, Object obj) {
        qVar.setText(qVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f12800z;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12799y.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.W) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.C;
    }

    public int getSimpleItemSelectedColor() {
        return this.D;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.E;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.W && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12799y.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int selectedItemPosition;
        super.onMeasure(i6, i10);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i11 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                v0 v0Var = this.f12799y;
                if (!v0Var.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = v0Var.f1567w.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable h10 = v0Var.h();
                if (h10 != null) {
                    Rect rect = this.A;
                    h10.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b10.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        AccessibilityManager accessibilityManager = this.f12800z;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t3) {
        super.setAdapter(t3);
        this.f12799y.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        v0 v0Var = this.f12799y;
        if (v0Var != null) {
            v0Var.k(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12799y.K = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.D = i6;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f12800z;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12799y.b();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.B, strArr));
    }
}
