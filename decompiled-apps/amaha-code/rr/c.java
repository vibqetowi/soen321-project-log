package rr;

import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
/* compiled from: CustomScroller.java */
/* loaded from: classes2.dex */
public final class c extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    public final int f30997a;

    public c(Context context, LinearInterpolator linearInterpolator) {
        super(context, linearInterpolator);
        this.f30997a = 0;
        this.f30997a = 400;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i6, int i10, int i11, int i12, int i13) {
        super.startScroll(i6, i10, i11, i12, this.f30997a);
    }
}
