package bk;

import ak.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bk.a;
import kotlin.jvm.internal.i;
/* compiled from: ViewPager2Attacher.kt */
/* loaded from: classes.dex */
public final class d extends a<ViewPager2, RecyclerView.e<?>> {
    @Override // bk.a
    public final b.a a(ViewPager2 viewPager2, RecyclerView.e<?> eVar) {
        ViewPager2 attachable = viewPager2;
        i.g(attachable, "attachable");
        return new b(attachable);
    }

    @Override // bk.a
    public final RecyclerView.e<?> b(ViewPager2 viewPager2) {
        ViewPager2 attachable = viewPager2;
        i.g(attachable, "attachable");
        return attachable.getAdapter();
    }

    @Override // bk.a
    public final void c(Object obj, Object obj2, a.C0083a c0083a) {
        ViewPager2 attachable = (ViewPager2) obj;
        i.g(attachable, "attachable");
        ((RecyclerView.e) obj2).u(new c(c0083a));
    }
}
