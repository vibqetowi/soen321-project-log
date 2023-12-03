package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f3187a;

    public d(ViewPager2 viewPager2) {
        this.f3187a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i6) {
        if (i6 == 0) {
            this.f3187a.d();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i6) {
        ViewPager2 viewPager2 = this.f3187a;
        if (viewPager2.f3154x != i6) {
            viewPager2.f3154x = i6;
            viewPager2.N.b();
        }
    }
}
