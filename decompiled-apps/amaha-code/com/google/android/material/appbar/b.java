package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import u0.l;
/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f8787u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8788v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f8789w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f8790x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f8791y;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6) {
        this.f8791y = baseBehavior;
        this.f8787u = coordinatorLayout;
        this.f8788v = appBarLayout;
        this.f8789w = view;
        this.f8790x = i6;
    }

    @Override // u0.l
    public final boolean a(View view) {
        this.f8791y.m(this.f8787u, this.f8788v, this.f8789w, this.f8790x, new int[]{0, 0});
        return true;
    }
}
