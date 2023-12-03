package com.google.android.material.snackbar;

import ac.h;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements h {

    /* renamed from: u  reason: collision with root package name */
    public TextView f9165u;

    /* renamed from: v  reason: collision with root package name */
    public Button f9166v;

    /* renamed from: w  reason: collision with root package name */
    public final TimeInterpolator f9167w;

    /* renamed from: x  reason: collision with root package name */
    public int f9168x;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9167w = rb.a.d(context, R.attr.motionEasingEmphasizedInterpolator, ab.a.f450b);
    }

    public final boolean a(int i6, int i10, int i11) {
        boolean z10;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9165u.getPaddingTop() == i10 && this.f9165u.getPaddingBottom() == i11) {
            return z10;
        }
        TextView textView = this.f9165u;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.e.g(textView)) {
            d0.e.k(textView, d0.e.f(textView), i10, d0.e.e(textView), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f9166v;
    }

    public TextView getMessageView() {
        return this.f9165u;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9165u = (TextView) findViewById(R.id.snackbar_text);
        this.f9166v = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (a(1, r0, r0 - r2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (a(0, r0, r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        super.onMeasure(i6, i10);
        boolean z11 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f9165u.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f9168x <= 0 || this.f9166v.getMeasuredWidth() <= this.f9168x) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f9168x = i6;
    }
}
