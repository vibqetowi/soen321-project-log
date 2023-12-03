package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class b extends y.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f3144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3145b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f3146c;

    public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.f3146c = fragmentStateAdapter;
        this.f3144a = fragment;
        this.f3145b = frameLayout;
    }

    @Override // androidx.fragment.app.y.k
    public final void c(y yVar, Fragment fragment, View view) {
        if (fragment == this.f3144a) {
            yVar.p0(this);
            this.f3146c.getClass();
            FragmentStateAdapter.v(view, this.f3145b);
        }
    }
}
