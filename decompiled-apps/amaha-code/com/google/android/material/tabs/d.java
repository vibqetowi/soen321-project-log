package com.google.android.material.tabs;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
/* compiled from: TabLayoutMediator.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f9239a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f9240b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9241c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.e<?> f9242d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9243e;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i6, int i10, Bundle bundle) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i6, int i10) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i6, int i10) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i6, int i10) {
            d.this.b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public interface b {
        void c(TabLayout.g gVar, int i6);
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public static class c extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f9245a;

        /* renamed from: c  reason: collision with root package name */
        public int f9247c = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f9246b = 0;

        public c(TabLayout tabLayout) {
            this.f9245a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void a(int i6) {
            this.f9246b = this.f9247c;
            this.f9247c = i6;
            TabLayout tabLayout = this.f9245a.get();
            if (tabLayout != null) {
                tabLayout.f9200r0 = this.f9247c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void b(float f, int i6, int i10) {
            boolean z10;
            TabLayout tabLayout = this.f9245a.get();
            if (tabLayout != null) {
                int i11 = this.f9247c;
                boolean z11 = false;
                if (i11 == 2 && this.f9246b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.n(i6, f, z10, (i11 == 2 && this.f9246b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i6) {
            boolean z10;
            TabLayout tabLayout = this.f9245a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i6 && i6 < tabLayout.getTabCount()) {
                int i10 = this.f9247c;
                if (i10 != 0 && (i10 != 2 || this.f9246b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.l(tabLayout.h(i6), z10);
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this.f9239a = tabLayout;
        this.f9240b = viewPager2;
        this.f9241c = bVar;
    }

    public final void a() {
        if (!this.f9243e) {
            ViewPager2 viewPager2 = this.f9240b;
            RecyclerView.e<?> adapter = viewPager2.getAdapter();
            this.f9242d = adapter;
            if (adapter != null) {
                this.f9243e = true;
                TabLayout tabLayout = this.f9239a;
                viewPager2.f3153w.f3171a.add(new c(tabLayout));
                tabLayout.a(new C0152d(viewPager2, true));
                this.f9242d.u(new a());
                b();
                tabLayout.n(viewPager2.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void b() {
        TabLayout tabLayout = this.f9239a;
        tabLayout.k();
        RecyclerView.e<?> eVar = this.f9242d;
        if (eVar != null) {
            int f = eVar.f();
            for (int i6 = 0; i6 < f; i6++) {
                TabLayout.g i10 = tabLayout.i();
                this.f9241c.c(i10, i6);
                tabLayout.b(i10, false);
            }
            if (f > 0) {
                int min = Math.min(this.f9240b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.l(tabLayout.h(min), true);
                }
            }
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0152d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f9248a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9249b;

        public C0152d(ViewPager2 viewPager2, boolean z10) {
            this.f9248a = viewPager2;
            this.f9249b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            this.f9248a.b(gVar.f9219d, this.f9249b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(TabLayout.g gVar) {
        }
    }
}
