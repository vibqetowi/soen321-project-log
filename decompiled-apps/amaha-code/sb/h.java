package sb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import qb.j;
/* compiled from: NavigationView.java */
/* loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NavigationView f31416u;

    public h(NavigationView navigationView) {
        this.f31416u = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        boolean z11;
        boolean z12;
        Activity activity;
        boolean z13;
        boolean z14;
        boolean z15;
        int i6;
        NavigationView navigationView = this.f31416u;
        navigationView.getLocationOnScreen(navigationView.F);
        int[] iArr = navigationView.F;
        boolean z16 = true;
        if (iArr[1] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j jVar = navigationView.C;
        if (jVar.Q != z10) {
            jVar.Q = z10;
            if (jVar.f29461v.getChildCount() == 0 && jVar.Q) {
                i6 = jVar.S;
            } else {
                i6 = 0;
            }
            NavigationMenuView navigationMenuView = jVar.f29460u;
            navigationMenuView.setPadding(0, i6, 0, navigationMenuView.getPaddingBottom());
        }
        if (z10 && navigationView.I) {
            z11 = true;
        } else {
            z11 = false;
        }
        navigationView.setDrawTopInsetForeground(z11);
        int i10 = iArr[0];
        if (i10 != 0 && navigationView.getWidth() + i10 != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        navigationView.setDrawLeftInsetForeground(z12);
        Context context = navigationView.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            if (displayMetrics.heightPixels - navigationView.getHeight() == iArr[1]) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13 && z14 && navigationView.J) {
                z15 = true;
            } else {
                z15 = false;
            }
            navigationView.setDrawBottomInsetForeground(z15);
            int i11 = displayMetrics.widthPixels;
            if (i11 != iArr[0] && i11 - navigationView.getWidth() != iArr[0]) {
                z16 = false;
            }
            navigationView.setDrawRightInsetForeground(z16);
        }
    }
}
