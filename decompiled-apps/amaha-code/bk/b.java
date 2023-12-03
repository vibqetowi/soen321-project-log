package bk;

import ak.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.i;
/* compiled from: ViewPager2Attacher.kt */
/* loaded from: classes.dex */
public final class b implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public a f4330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f4331b;

    /* compiled from: ViewPager2Attacher.kt */
    /* loaded from: classes.dex */
    public static final class a extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ak.f f4332a;

        public a(ak.f fVar) {
            this.f4332a = fVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void b(float f, int i6, int i10) {
            this.f4332a.b(f, i6);
        }
    }

    public b(ViewPager2 viewPager2) {
        this.f4331b = viewPager2;
    }

    @Override // ak.b.a
    public final int a() {
        return this.f4331b.getCurrentItem();
    }

    @Override // ak.b.a
    public final void b(int i6) {
        this.f4331b.b(i6, true);
    }

    @Override // ak.b.a
    public final void c() {
        a aVar = this.f4330a;
        if (aVar != null) {
            this.f4331b.f3153w.f3171a.remove(aVar);
        }
    }

    @Override // ak.b.a
    public final boolean d() {
        int i6;
        ViewPager2 viewPager2 = this.f4331b;
        i.g(viewPager2, "<this>");
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter != null) {
            i6 = adapter.f();
        } else {
            i6 = 0;
        }
        if (i6 <= 0) {
            return false;
        }
        return true;
    }

    @Override // ak.b.a
    public final void e(ak.f onPageChangeListenerHelper) {
        i.g(onPageChangeListenerHelper, "onPageChangeListenerHelper");
        a aVar = new a(onPageChangeListenerHelper);
        this.f4330a = aVar;
        this.f4331b.f3153w.f3171a.add(aVar);
    }

    @Override // ak.b.a
    public final int getCount() {
        RecyclerView.e adapter = this.f4331b.getAdapter();
        if (adapter != null) {
            return adapter.f();
        }
        return 0;
    }
}
