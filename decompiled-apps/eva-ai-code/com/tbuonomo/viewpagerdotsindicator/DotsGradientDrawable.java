package com.tbuonomo.viewpagerdotsindicator;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
/* compiled from: DotsGradientDrawable.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsGradientDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "()V", "<set-?>", "", "currentColor", "getCurrentColor", "()I", "setColor", "", "argb", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsGradientDrawable extends GradientDrawable {
    private int currentColor;

    public final int getCurrentColor() {
        return this.currentColor;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(int i) {
        super.setColor(i);
        this.currentColor = i;
    }
}
