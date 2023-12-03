package db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12723a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f12724b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12725c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f12726d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f12727e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i6, boolean z10) {
        this.f12727e = bottomAppBar;
        this.f12724b = actionMenuView;
        this.f12725c = i6;
        this.f12726d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12723a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f12723a) {
            BottomAppBar bottomAppBar = this.f12727e;
            int i6 = bottomAppBar.A0;
            if (i6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i6 != 0) {
                bottomAppBar.A0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i6);
            }
            bottomAppBar.C(this.f12724b, this.f12725c, this.f12726d, z10);
        }
    }
}
