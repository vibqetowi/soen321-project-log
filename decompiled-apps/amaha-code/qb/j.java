package qb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: NavigationMenuPresenter.java */
/* loaded from: classes.dex */
public final class j implements androidx.appcompat.view.menu.j {
    public ColorStateList B;
    public ColorStateList D;
    public ColorStateList E;
    public Drawable F;
    public RippleDrawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int R;
    public int S;
    public int T;

    /* renamed from: u  reason: collision with root package name */
    public NavigationMenuView f29460u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f29461v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f29462w;

    /* renamed from: x  reason: collision with root package name */
    public int f29463x;

    /* renamed from: y  reason: collision with root package name */
    public c f29464y;

    /* renamed from: z  reason: collision with root package name */
    public LayoutInflater f29465z;
    public int A = 0;
    public int C = 0;
    public boolean Q = true;
    public int U = -1;
    public final a V = new a();

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            j jVar = j.this;
            c cVar = jVar.f29464y;
            boolean z10 = true;
            if (cVar != null) {
                cVar.f29469z = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            boolean q10 = jVar.f29462w.q(itemData, jVar, 0);
            if (itemData != null && itemData.isCheckable() && q10) {
                jVar.f29464y.w(itemData);
            } else {
                z10 = false;
            }
            c cVar2 = jVar.f29464y;
            if (cVar2 != null) {
                cVar2.f29469z = false;
            }
            if (z10) {
                jVar.d(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.e<l> {

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<e> f29467x = new ArrayList<>();

        /* renamed from: y  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f29468y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f29469z;

        public c() {
            v();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f29467x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final long g(int i6) {
            return i6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int h(int i6) {
            e eVar = this.f29467x.get(i6);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                if (((g) eVar).f29472a.hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(l lVar, int i6) {
            Drawable drawable;
            int h10 = h(i6);
            ArrayList<e> arrayList = this.f29467x;
            View view = lVar.f2751a;
            j jVar = j.this;
            if (h10 != 0) {
                if (h10 != 1) {
                    if (h10 != 2) {
                        if (h10 == 3) {
                            d0.q(view, new qb.k(this, i6, true));
                            return;
                        }
                        return;
                    }
                    f fVar = (f) arrayList.get(i6);
                    view.setPadding(jVar.L, fVar.f29470a, jVar.M, fVar.f29471b);
                    return;
                }
                TextView textView = (TextView) view;
                textView.setText(((g) arrayList.get(i6)).f29472a.f1122e);
                int i10 = jVar.A;
                if (i10 != 0) {
                    androidx.core.widget.k.e(textView, i10);
                }
                textView.setPadding(jVar.N, textView.getPaddingTop(), jVar.O, textView.getPaddingBottom());
                ColorStateList colorStateList = jVar.B;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                d0.q(textView, new qb.k(this, i6, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            navigationMenuItemView.setIconTintList(jVar.E);
            int i11 = jVar.C;
            if (i11 != 0) {
                navigationMenuItemView.setTextAppearance(i11);
            }
            ColorStateList colorStateList2 = jVar.D;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = jVar.F;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = jVar.G;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) arrayList.get(i6);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f29473b);
            int i12 = jVar.H;
            int i13 = jVar.I;
            navigationMenuItemView.setPadding(i12, i13, i12, i13);
            navigationMenuItemView.setIconPadding(jVar.J);
            if (jVar.P) {
                navigationMenuItemView.setIconSize(jVar.K);
            }
            navigationMenuItemView.setMaxLines(jVar.R);
            navigationMenuItemView.c(gVar.f29472a);
            d0.q(navigationMenuItemView, new qb.k(this, i6, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
            j jVar = j.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return null;
                        }
                        return new b(jVar.f29461v);
                    }
                    return new C0497j(jVar.f29465z, recyclerView);
                }
                return new k(jVar.f29465z, recyclerView);
            }
            return new i(jVar.f29465z, recyclerView, jVar.V);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void t(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.f2751a;
                FrameLayout frameLayout = navigationMenuItemView.T;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.S.setCompoundDrawables(null, null, null, null);
            }
        }

        public final void v() {
            if (this.f29469z) {
                return;
            }
            this.f29469z = true;
            ArrayList<e> arrayList = this.f29467x;
            arrayList.clear();
            arrayList.add(new d());
            j jVar = j.this;
            int size = jVar.f29462w.l().size();
            boolean z10 = false;
            int i6 = -1;
            int i10 = 0;
            boolean z11 = false;
            int i11 = 0;
            while (i10 < size) {
                androidx.appcompat.view.menu.h hVar = jVar.f29462w.l().get(i10);
                if (hVar.isChecked()) {
                    w(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.f(z10);
                }
                if (hVar.hasSubMenu()) {
                    androidx.appcompat.view.menu.m mVar = hVar.f1131o;
                    if (mVar.hasVisibleItems()) {
                        if (i10 != 0) {
                            arrayList.add(new f(jVar.T, z10 ? 1 : 0));
                        }
                        arrayList.add(new g(hVar));
                        int size2 = mVar.size();
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 < size2) {
                            androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i12);
                            if (hVar2.isVisible()) {
                                if (!z12 && hVar2.getIcon() != null) {
                                    z12 = true;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.f(z10);
                                }
                                if (hVar.isChecked()) {
                                    w(hVar);
                                }
                                arrayList.add(new g(hVar2));
                            }
                            i12++;
                            z10 = false;
                        }
                        if (z12) {
                            int size3 = arrayList.size();
                            for (int size4 = arrayList.size(); size4 < size3; size4++) {
                                ((g) arrayList.get(size4)).f29473b = true;
                            }
                        }
                    }
                } else {
                    int i13 = hVar.f1119b;
                    if (i13 != i6) {
                        i11 = arrayList.size();
                        if (hVar.getIcon() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 != 0) {
                            i11++;
                            int i14 = jVar.T;
                            arrayList.add(new f(i14, i14));
                        }
                    } else if (!z11 && hVar.getIcon() != null) {
                        int size5 = arrayList.size();
                        for (int i15 = i11; i15 < size5; i15++) {
                            ((g) arrayList.get(i15)).f29473b = true;
                        }
                        z11 = true;
                        g gVar = new g(hVar);
                        gVar.f29473b = z11;
                        arrayList.add(gVar);
                        i6 = i13;
                    }
                    g gVar2 = new g(hVar);
                    gVar2.f29473b = z11;
                    arrayList.add(gVar2);
                    i6 = i13;
                }
                i10++;
                z10 = false;
            }
            this.f29469z = false;
        }

        public final void w(androidx.appcompat.view.menu.h hVar) {
            if (this.f29468y != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f29468y;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f29468y = hVar;
                hVar.setChecked(true);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f29470a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29471b;

        public f(int i6, int i10) {
            this.f29470a = i6;
            this.f29471b = i10;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f29472a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29473b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.f29472a = hVar;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class h extends z {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.z, t0.a
        public final void d(View view, u0.h hVar) {
            int i6;
            int i10;
            super.d(view, hVar);
            j jVar = j.this;
            if (jVar.f29461v.getChildCount() == 0) {
                i6 = 0;
                i10 = 0;
            } else {
                i6 = 0;
                i10 = 1;
            }
            while (i6 < jVar.f29464y.f()) {
                int h10 = jVar.f29464y.h(i6);
                if (h10 == 0 || h10 == 1) {
                    i10++;
                }
                i6++;
            }
            hVar.f33731a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class i extends l {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(LayoutInflater layoutInflater, RecyclerView recyclerView, a aVar) {
            super(r3);
            View inflate = layoutInflater.inflate(R.layout.design_navigation_item, (ViewGroup) recyclerView, false);
            inflate.setOnClickListener(aVar);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: qb.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0497j extends l {
        public C0497j(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, (ViewGroup) recyclerView, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, (ViewGroup) recyclerView, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static abstract class l extends RecyclerView.c0 {
        public l(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        c cVar = this.f29464y;
        if (cVar != null) {
            cVar.v();
            cVar.i();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f29463x;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f29465z = LayoutInflater.from(context);
        this.f29462w = fVar;
        this.T = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        m mVar;
        androidx.appcompat.view.menu.h hVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f29460u.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f29464y;
                cVar.getClass();
                int i6 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f29467x;
                if (i6 != 0) {
                    cVar.f29469z = true;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        e eVar = arrayList.get(i10);
                        if ((eVar instanceof g) && (hVar2 = ((g) eVar).f29472a) != null && hVar2.f1118a == i6) {
                            cVar.w(hVar2);
                            break;
                        }
                        i10++;
                    }
                    cVar.f29469z = false;
                    cVar.v();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        e eVar2 = arrayList.get(i11);
                        if ((eVar2 instanceof g) && (hVar = ((g) eVar2).f29472a) != null && (actionView = hVar.getActionView()) != null && (mVar = (m) sparseParcelableArray2.get(hVar.f1118a)) != null) {
                            actionView.restoreHierarchyState(mVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f29461v.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f29460u != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f29460u.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f29464y;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar = cVar.f29468y;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f1118a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<e> arrayList = cVar.f29467x;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                e eVar = arrayList.get(i6);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h hVar2 = ((g) eVar).f29472a;
                    if (hVar2 != null) {
                        view = hVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        m mVar = new m();
                        view.saveHierarchyState(mVar);
                        sparseArray2.put(hVar2.f1118a, mVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f29461v != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f29461v.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }
}
