package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.theinnerhour.b2b.R;
/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public final class g extends CheckedTextView implements androidx.core.widget.p {

    /* renamed from: u  reason: collision with root package name */
    public final h f1410u;

    /* renamed from: v  reason: collision with root package name */
    public final e f1411v;

    /* renamed from: w  reason: collision with root package name */
    public final c0 f1412w;

    /* renamed from: x  reason: collision with root package name */
    public m f1413x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:12:0x0064, B:14:0x006a, B:16:0x0070, B:17:0x007b, B:19:0x0082, B:20:0x0089, B:22:0x0090), top: B:28:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:12:0x0064, B:14:0x006a, B:16:0x0070, B:17:0x007b, B:19:0x0082, B:20:0x0089, B:22:0x0090), top: B:28:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int i6;
        int i10;
        i1.a(context);
        g1.a(getContext(), this);
        c0 c0Var = new c0(this);
        this.f1412w = c0Var;
        c0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        c0Var.b();
        e eVar = new e(this);
        this.f1411v = eVar;
        eVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f1410u = new h(this);
        Context context2 = getContext();
        int[] iArr = kc.f.K;
        l1 m10 = l1.m(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        t0.d0.p(this, getContext(), iArr, attributeSet, m10.f1474b, R.attr.checkedTextViewStyle);
        boolean z10 = true;
        try {
            if (m10.l(1) && (i10 = m10.i(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(hc.d.H(getContext(), i10));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z10 && m10.l(0) && (i6 = m10.i(0, 0)) != 0) {
                    setCheckMarkDrawable(hc.d.H(getContext(), i6));
                }
                if (m10.l(2)) {
                    setCheckMarkTintList(m10.b(2));
                }
                if (m10.l(3)) {
                    setCheckMarkTintMode(q0.c(m10.h(3, -1), null));
                }
                m10.n();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            z10 = false;
            if (!z10) {
                setCheckMarkDrawable(hc.d.H(getContext(), i6));
            }
            if (m10.l(2)) {
            }
            if (m10.l(3)) {
            }
            m10.n();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th2) {
            m10.n();
            throw th2;
        }
    }

    private m getEmojiTextViewHelper() {
        if (this.f1413x == null) {
            this.f1413x = new m(this);
        }
        return this.f1413x;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.f1412w;
        if (c0Var != null) {
            c0Var.b();
        }
        e eVar = this.f1411v;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.f1410u;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1411v;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1411v;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f1410u;
        if (hVar != null) {
            return hVar.f1421b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f1410u;
        if (hVar != null) {
            return hVar.f1422c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1412w.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1412w.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kc.f.Q(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1411v;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1411v;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f1410u;
        if (hVar != null) {
            if (hVar.f) {
                hVar.f = false;
                return;
            }
            hVar.f = true;
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1412w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1412w;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1411v;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1411v;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f1410u;
        if (hVar != null) {
            hVar.f1421b = colorStateList;
            hVar.f1423d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1410u;
        if (hVar != null) {
            hVar.f1422c = mode;
            hVar.f1424e = true;
            hVar.a();
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1412w;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1412w;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f1412w;
        if (c0Var != null) {
            c0Var.g(i6, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(hc.d.H(getContext(), i6));
    }
}
