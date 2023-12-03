package qb;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: VisibilityAwareImageButton.java */
/* loaded from: classes.dex */
public class y extends ImageButton {

    /* renamed from: u  reason: collision with root package name */
    public int f29519u;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i6, boolean z10) {
        super.setVisibility(i6);
        if (z10) {
            this.f29519u = i6;
        }
    }

    public final int getUserSetVisibility() {
        return this.f29519u;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        b(i6, true);
    }

    public y(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f29519u = getVisibility();
    }
}
