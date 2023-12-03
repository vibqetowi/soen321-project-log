package k2;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import t0.d0;
import t0.s0;
import t0.t;
/* compiled from: ViewPager.java */
/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: u  reason: collision with root package name */
    public final Rect f22773u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ViewPager f22774v;

    public b(ViewPager viewPager) {
        this.f22774v = viewPager;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        s0 l2 = d0.l(view, s0Var);
        if (l2.f32351a.m()) {
            return l2;
        }
        int b10 = l2.b();
        Rect rect = this.f22773u;
        rect.left = b10;
        rect.top = l2.d();
        rect.right = l2.c();
        rect.bottom = l2.a();
        ViewPager viewPager = this.f22774v;
        int childCount = viewPager.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            s0 b11 = d0.b(viewPager.getChildAt(i6), l2);
            rect.left = Math.min(b11.b(), rect.left);
            rect.top = Math.min(b11.d(), rect.top);
            rect.right = Math.min(b11.c(), rect.right);
            rect.bottom = Math.min(b11.a(), rect.bottom);
        }
        return l2.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
