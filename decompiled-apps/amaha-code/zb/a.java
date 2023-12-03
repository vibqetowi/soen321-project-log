package zb;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: RightSheetDelegate.java */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f39358a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f39358a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f39358a;
        return Math.max(0, sideSheetBehavior.f9118m - sideSheetBehavior.f9117l);
    }
}
