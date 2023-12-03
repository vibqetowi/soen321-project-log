package com.google.android.material.appbar;

import android.view.View;
import u0.l;
/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8792u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f8793v;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f8792u = appBarLayout;
        this.f8793v = z10;
    }

    @Override // u0.l
    public final boolean a(View view) {
        this.f8792u.setExpanded(this.f8793v);
        return true;
    }
}
