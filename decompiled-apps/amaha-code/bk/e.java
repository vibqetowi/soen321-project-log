package bk;

import ak.b;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes.dex */
public final class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public a f4334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f4335b;

    public e(ViewPager viewPager) {
        this.f4335b = viewPager;
    }

    @Override // ak.b.a
    public final int a() {
        return this.f4335b.getCurrentItem();
    }

    @Override // ak.b.a
    public final void b(int i6) {
        this.f4335b.v(i6);
    }

    @Override // ak.b.a
    public final void c() {
        ArrayList arrayList;
        a aVar = this.f4334a;
        if (aVar != null && (arrayList = this.f4335b.f3102o0) != null) {
            arrayList.remove(aVar);
        }
    }

    @Override // ak.b.a
    public final boolean d() {
        int i6;
        ViewPager viewPager = this.f4335b;
        i.g(viewPager, "<this>");
        k2.a adapter = viewPager.getAdapter();
        if (adapter != null) {
            i6 = adapter.g();
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
        this.f4334a = aVar;
        this.f4335b.b(aVar);
    }

    @Override // ak.b.a
    public final int getCount() {
        k2.a adapter = this.f4335b.getAdapter();
        if (adapter != null) {
            return adapter.g();
        }
        return 0;
    }

    /* compiled from: ViewPagerAttacher.kt */
    /* loaded from: classes.dex */
    public static final class a implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ak.f f4336a;

        public a(ak.f fVar) {
            this.f4336a = fVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
            this.f4336a.b(f, i6);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
        }
    }
}
