package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3141u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f3142v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f3143w;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f3143w = fragmentStateAdapter;
        this.f3141u = frameLayout;
        this.f3142v = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        FrameLayout frameLayout = this.f3141u;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f3143w.A(this.f3142v);
        }
    }
}
