package uj;

import android.widget.ImageView;
/* compiled from: ImageWidget.kt */
/* loaded from: classes.dex */
public final class i extends r {
    public final ImageView.ScaleType f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, ImageView.ScaleType scaleType) {
        super(rVar);
        kotlin.jvm.internal.i.g(scaleType, "scaleType");
        this.f = scaleType;
    }

    @Override // uj.r
    public final String toString() {
        return "ImageWidget(widget= " + super.toString() + ",scaleType= " + this.f + ')';
    }
}
