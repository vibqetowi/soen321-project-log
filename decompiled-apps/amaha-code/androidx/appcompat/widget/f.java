package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.theinnerhour.b2b.R;
/* compiled from: AppCompatButton.java */
/* loaded from: classes.dex */
public class f extends Button implements androidx.core.widget.p {

    /* renamed from: u  reason: collision with root package name */
    public final e f1402u;

    /* renamed from: v  reason: collision with root package name */
    public final c0 f1403v;

    /* renamed from: w  reason: collision with root package name */
    public m f1404w;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1404w == null) {
            this.f1404w = new m(this);
        }
        return this.f1404w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1402u;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u1.f1564b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            return Math.round(c0Var.f1374i.f1453e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u1.f1564b) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            return Math.round(c0Var.f1374i.f1452d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u1.f1564b) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            return Math.round(c0Var.f1374i.f1451c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u1.f1564b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            return c0Var.f1374i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (u1.f1564b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        c0 c0Var = this.f1403v;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1374i.f1449a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1402u;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1402u;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1403v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1403v.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        c0 c0Var = this.f1403v;
        if (c0Var != null && !u1.f1564b) {
            c0Var.f1374i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        super.onTextChanged(charSequence, i6, i10, i11);
        boolean z11 = false;
        c0 c0Var = this.f1403v;
        if (c0Var != null && !u1.f1564b) {
            j0 j0Var = c0Var.f1374i;
            if (j0Var.i() && j0Var.f1449a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            c0Var.f1374i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i10, int i11, int i12) {
        if (u1.f1564b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
            return;
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.i(i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (u1.f1564b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (u1.f1564b) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1402u;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1402u;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.f1367a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1402u;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1402u;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1403v;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1403v;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f1403v;
        if (c0Var != null) {
            c0Var.g(i6, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f) {
        boolean z10;
        boolean z11 = u1.f1564b;
        if (z11) {
            super.setTextSize(i6, f);
            return;
        }
        c0 c0Var = this.f1403v;
        if (c0Var != null && !z11) {
            j0 j0Var = c0Var.f1374i;
            if (j0Var.i() && j0Var.f1449a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                j0Var.f(f, i6);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        i1.a(context);
        g1.a(getContext(), this);
        e eVar = new e(this);
        this.f1402u = eVar;
        eVar.d(attributeSet, i6);
        c0 c0Var = new c0(this);
        this.f1403v = c0Var;
        c0Var.f(attributeSet, i6);
        c0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i6);
    }
}
