package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: TabLayout.java */
/* loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f9237u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f9238v;

    public c(TabLayout.i iVar, View view) {
        this.f9238v = iVar;
        this.f9237u = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f9237u;
        if (view2.getVisibility() == 0) {
            this.f9238v.c(view2);
        }
    }
}
