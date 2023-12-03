package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.google.android.material.navigation.NavigationView;
/* compiled from: NavigationView.java */
/* loaded from: classes.dex */
public final class a implements f.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NavigationView f9095u;

    public a(NavigationView navigationView) {
        this.f9095u = navigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        NavigationView.a aVar = this.f9095u.D;
        if (aVar != null) {
            aVar.c(menuItem);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
    }
}
