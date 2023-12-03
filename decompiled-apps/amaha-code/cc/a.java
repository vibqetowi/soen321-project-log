package cc;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public final class a extends com.google.android.material.tabs.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5242a;

    public /* synthetic */ a(int i6) {
        this.f5242a = i6;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float a10;
        boolean z10;
        float cos;
        float sin;
        switch (this.f5242a) {
            case 0:
                RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view);
                RectF a12 = com.google.android.material.tabs.a.a(tabLayout, view2);
                if (a11.left < a12.left) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    double d10 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d10));
                    cos = (float) Math.sin(d10);
                } else {
                    double d11 = (f * 3.141592653589793d) / 2.0d;
                    cos = (float) (1.0d - Math.cos(d11));
                    sin = (float) Math.sin(d11);
                }
                drawable.setBounds(ab.a.b(sin, (int) a11.left, (int) a12.left), drawable.getBounds().top, ab.a.b(cos, (int) a11.right, (int) a12.right), drawable.getBounds().bottom);
                return;
            default:
                int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                if (i6 >= 0) {
                    view = view2;
                }
                RectF a13 = com.google.android.material.tabs.a.a(tabLayout, view);
                if (i6 < 0) {
                    a10 = ab.a.a(1.0f, 0.0f, 0.0f, 0.5f, f);
                } else {
                    a10 = ab.a.a(0.0f, 1.0f, 0.5f, 1.0f, f);
                }
                drawable.setBounds((int) a13.left, drawable.getBounds().top, (int) a13.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (a10 * 255.0f));
                return;
        }
    }
}
