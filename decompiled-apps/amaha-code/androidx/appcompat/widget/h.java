package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import k0.a;
/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f1420a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1421b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1422c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1423d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1424e = false;
    public boolean f;

    public h(CheckedTextView checkedTextView) {
        this.f1420a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f1420a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1423d || this.f1424e) {
                Drawable mutate = k0.a.g(checkMarkDrawable).mutate();
                if (this.f1423d) {
                    a.b.h(mutate, this.f1421b);
                }
                if (this.f1424e) {
                    a.b.i(mutate, this.f1422c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
