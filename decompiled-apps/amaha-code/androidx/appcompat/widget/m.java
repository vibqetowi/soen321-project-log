package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1476a;

    /* renamed from: b  reason: collision with root package name */
    public final e1.f f1477b;

    public m(TextView textView) {
        this.f1476a = textView;
        this.f1477b = new e1.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1477b.f13713a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = this.f1476a.getContext().obtainStyledAttributes(attributeSet, kc.f.H, i6, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        this.f1477b.f13713a.c(z10);
    }

    public final void d(boolean z10) {
        this.f1477b.f13713a.d(z10);
    }
}
