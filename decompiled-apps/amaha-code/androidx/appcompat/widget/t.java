package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.theinnerhour.b2b.R;
/* compiled from: AppCompatRadioButton.java */
/* loaded from: classes.dex */
public class t extends RadioButton implements androidx.core.widget.o, androidx.core.widget.p {

    /* renamed from: u  reason: collision with root package name */
    public final i f1548u;

    /* renamed from: v  reason: collision with root package name */
    public final e f1549v;

    /* renamed from: w  reason: collision with root package name */
    public final c0 f1550w;

    /* renamed from: x  reason: collision with root package name */
    public m f1551x;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1551x == null) {
            this.f1551x = new m(this);
        }
        return this.f1551x;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1549v;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f1550w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1548u;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1549v;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1549v;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1548u;
        if (iVar != null) {
            return iVar.f1426b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1548u;
        if (iVar != null) {
            return iVar.f1427c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1550w.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1550w.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1549v;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1549v;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f1548u;
        if (iVar != null) {
            if (iVar.f) {
                iVar.f = false;
                return;
            }
            iVar.f = true;
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1550w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1550w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1549v;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1549v;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f1548u;
        if (iVar != null) {
            iVar.f1426b = colorStateList;
            iVar.f1428d = true;
            iVar.a();
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1548u;
        if (iVar != null) {
            iVar.f1427c = mode;
            iVar.f1429e = true;
            iVar.a();
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1550w;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1550w;
        c0Var.m(mode);
        c0Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        i1.a(context);
        g1.a(getContext(), this);
        i iVar = new i(this);
        this.f1548u = iVar;
        iVar.b(attributeSet, R.attr.radioButtonStyle);
        e eVar = new e(this);
        this.f1549v = eVar;
        eVar.d(attributeSet, R.attr.radioButtonStyle);
        c0 c0Var = new c0(this);
        this.f1550w = c0Var;
        c0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(hc.d.H(getContext(), i6));
    }
}
