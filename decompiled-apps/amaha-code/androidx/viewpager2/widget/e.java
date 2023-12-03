package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class e extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f3188a;

    public e(ViewPager2 viewPager2) {
        this.f3188a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i6) {
        ViewPager2 viewPager2 = this.f3188a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.D.requestFocus(2);
        }
    }
}
