package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
public final class p extends PopupWindow {
    public p(Context context, AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.R, i6, i10);
        if (obtainStyledAttributes.hasValue(2)) {
            androidx.core.widget.j.a(this, obtainStyledAttributes.getBoolean(2, false));
        }
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = hc.d.H(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i6, int i10) {
        super.showAsDropDown(view, i6, i10);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i6, int i10, int i11, int i12) {
        super.update(view, i6, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i6, int i10, int i11) {
        super.showAsDropDown(view, i6, i10, i11);
    }
}
