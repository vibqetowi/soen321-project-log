package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import u0.l;
/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f8817u;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f8817u = swipeDismissBehavior;
    }

    @Override // u0.l
    public final boolean a(View view) {
        boolean z10;
        SwipeDismissBehavior swipeDismissBehavior = this.f8817u;
        boolean z11 = false;
        if (!swipeDismissBehavior.a(view)) {
            return false;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i6 = swipeDismissBehavior.f8807e;
        if ((i6 == 0 && z10) || (i6 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        d0.j(width, view);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f8804b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
