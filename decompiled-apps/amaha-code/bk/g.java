package bk;

import ak.b;
import androidx.viewpager.widget.ViewPager;
import bk.a;
import kotlin.jvm.internal.i;
/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes.dex */
public final class g extends a<ViewPager, k2.a> {
    @Override // bk.a
    public final b.a a(ViewPager viewPager, k2.a aVar) {
        ViewPager attachable = viewPager;
        i.g(attachable, "attachable");
        return new e(attachable);
    }

    @Override // bk.a
    public final k2.a b(ViewPager viewPager) {
        ViewPager attachable = viewPager;
        i.g(attachable, "attachable");
        return attachable.getAdapter();
    }

    @Override // bk.a
    public final void c(Object obj, Object obj2, a.C0083a c0083a) {
        ViewPager attachable = (ViewPager) obj;
        i.g(attachable, "attachable");
        ((k2.a) obj2).f22771a.registerObserver(new f(c0083a));
    }
}
