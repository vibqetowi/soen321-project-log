package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.b0;
import androidx.core.widget.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import r0.d;
/* compiled from: AppCompatTextView.java */
/* loaded from: classes.dex */
public class i0 extends TextView implements androidx.core.widget.p {
    public Future<r0.d> A;

    /* renamed from: u  reason: collision with root package name */
    public final e f1430u;

    /* renamed from: v  reason: collision with root package name */
    public final c0 f1431v;

    /* renamed from: w  reason: collision with root package name */
    public final b0 f1432w;

    /* renamed from: x  reason: collision with root package name */
    public m f1433x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1434y;

    /* renamed from: z  reason: collision with root package name */
    public b f1435z;

    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i6);

        void b(int i6);
    }

    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.i0.b, androidx.appcompat.widget.i0.a
        public final void a(int i6) {
            i0.super.setLastBaselineToBottomHeight(i6);
        }

        @Override // androidx.appcompat.widget.i0.b, androidx.appcompat.widget.i0.a
        public final void b(int i6) {
            i0.super.setFirstBaselineToTopHeight(i6);
        }
    }

    public i0() {
        throw null;
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1433x == null) {
            this.f1433x = new m(this);
        }
        return this.f1433x;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1430u;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u1.f1564b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1374i.f1449a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f1435z == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                this.f1435z = new c();
            } else if (i6 >= 26) {
                this.f1435z = new b();
            }
        }
        return this.f1435z;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1430u;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1430u;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1431v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1431v.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<r0.d> future = this.A;
        if (future != null) {
            try {
                this.A = null;
                androidx.core.widget.k.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f1432w) != null) {
            TextClassifier textClassifier = b0Var.f1349b;
            if (textClassifier == null) {
                return b0.a.a(b0Var.f1348a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public d.a getTextMetricsParamsCompat() {
        return androidx.core.widget.k.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1431v.getClass();
        c0.h(this, onCreateInputConnection, editorInfo);
        kc.f.Q(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        c0 c0Var = this.f1431v;
        if (c0Var != null && !u1.f1564b) {
            c0Var.f1374i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i10) {
        Future<r0.d> future = this.A;
        if (future != null) {
            try {
                this.A = null;
                androidx.core.widget.k.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        super.onTextChanged(charSequence, i6, i10, i11);
        boolean z11 = false;
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
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
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1430u;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1430u;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1431v;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i6);
        } else {
            androidx.core.widget.k.b(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i6);
        } else {
            androidx.core.widget.k.c(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        kc.f.o(i6);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i6 != fontMetricsInt) {
            setLineSpacing(i6 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(r0.d dVar) {
        androidx.core.widget.k.d(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1430u;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1430u;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1431v;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1431v;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.g(i6, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1432w) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.f1349b = textClassifier;
        }
    }

    public void setTextFuture(Future<r0.d> future) {
        this.A = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextMetricsParamsCompat(d.a aVar) {
        int i6;
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f30174b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i6 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i6 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i6 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i6 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i6 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i6 = 7;
            }
            k.b.h(this, i6);
            TextPaint textPaint = aVar.f30173a;
            if (i10 >= 23) {
                float textScaleX = textPaint.getTextScaleX();
                getPaint().set(textPaint);
                if (textScaleX == getTextScaleX()) {
                    setTextScaleX((textScaleX / 2.0f) + 1.0f);
                }
                setTextScaleX(textScaleX);
                return;
            }
            getPaint().set(textPaint);
            k.c.e(this, aVar.f30175c);
            k.c.h(this, aVar.f30176d);
            return;
        }
        i6 = 1;
        k.b.h(this, i6);
        TextPaint textPaint2 = aVar.f30173a;
        if (i10 >= 23) {
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
        c0 c0Var = this.f1431v;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i6) {
        Typeface typeface2;
        if (this.f1434y) {
            return;
        }
        if (typeface != null && i6 > 0) {
            Context context = getContext();
            j0.o oVar = j0.h.f21630a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i6);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f1434y = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f1434y = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        i1.a(context);
        this.f1434y = false;
        this.f1435z = null;
        g1.a(getContext(), this);
        e eVar = new e(this);
        this.f1430u = eVar;
        eVar.d(attributeSet, i6);
        c0 c0Var = new c0(this);
        this.f1431v = c0Var;
        c0Var.f(attributeSet, i6);
        c0Var.b();
        this.f1432w = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? hc.d.H(context, i6) : null, i10 != 0 ? hc.d.H(context, i10) : null, i11 != 0 ? hc.d.H(context, i11) : null, i12 != 0 ? hc.d.H(context, i12) : null);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? hc.d.H(context, i6) : null, i10 != 0 ? hc.d.H(context, i10) : null, i11 != 0 ? hc.d.H(context, i11) : null, i12 != 0 ? hc.d.H(context, i12) : null);
        c0 c0Var = this.f1431v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.i0.a
        public void a(int i6) {
        }

        @Override // androidx.appcompat.widget.i0.a
        public void b(int i6) {
        }
    }
}
