package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import g.a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements t0.i {
    public final CharSequence A;
    public AppCompatImageButton B;
    public View C;
    public Context D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public d1 N;
    public int O;
    public int P;
    public final int Q;
    public CharSequence R;
    public CharSequence S;
    public ColorStateList T;
    public ColorStateList U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<View> f1299a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList<View> f1300b0;
    public final int[] c0;

    /* renamed from: d0  reason: collision with root package name */
    public final t0.l f1301d0;
    public ArrayList<MenuItem> e0;

    /* renamed from: f0  reason: collision with root package name */
    public h f1302f0;

    /* renamed from: g0  reason: collision with root package name */
    public final a f1303g0;

    /* renamed from: h0  reason: collision with root package name */
    public o1 f1304h0;

    /* renamed from: i0  reason: collision with root package name */
    public androidx.appcompat.widget.c f1305i0;

    /* renamed from: j0  reason: collision with root package name */
    public f f1306j0;

    /* renamed from: k0  reason: collision with root package name */
    public j.a f1307k0;

    /* renamed from: l0  reason: collision with root package name */
    public f.a f1308l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1309m0;

    /* renamed from: n0  reason: collision with root package name */
    public OnBackInvokedCallback f1310n0;

    /* renamed from: o0  reason: collision with root package name */
    public OnBackInvokedDispatcher f1311o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f1312p0;

    /* renamed from: q0  reason: collision with root package name */
    public final b f1313q0;

    /* renamed from: u  reason: collision with root package name */
    public ActionMenuView f1314u;

    /* renamed from: v  reason: collision with root package name */
    public i0 f1315v;

    /* renamed from: w  reason: collision with root package name */
    public i0 f1316w;

    /* renamed from: x  reason: collision with root package name */
    public AppCompatImageButton f1317x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatImageView f1318y;

    /* renamed from: z  reason: collision with root package name */
    public final Drawable f1319z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f1314u;
            if (actionMenuView != null && (cVar = actionMenuView.N) != null) {
                cVar.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.f1308l0;
            if (aVar != null && aVar.a(fVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            boolean z10;
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.c cVar = toolbar.f1314u.N;
            if (cVar != null && cVar.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Iterator<t0.n> it = toolbar.f1301d0.f32332b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            f.a aVar = toolbar.f1308l0;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            f fVar = Toolbar.this.f1306j0;
            if (fVar == null) {
                hVar = null;
            } else {
                hVar = fVar.f1325v;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.i(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0242a) {
            return new g((a.C0242a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return t0.h.b(marginLayoutParams) + t0.h.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i6, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (d0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, d0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1327b == 0 && r(childAt)) {
                    int i11 = gVar.f16001a;
                    WeakHashMap<View, t0.o0> weakHashMap2 = t0.d0.f32288a;
                    int d10 = d0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, d10) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1327b == 0 && r(childAt2)) {
                int i13 = gVar2.f16001a;
                WeakHashMap<View, t0.o0> weakHashMap3 = t0.d0.f32288a;
                int d11 = d0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, d11) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // t0.i
    public final void addMenuProvider(t0.n nVar) {
        t0.l lVar = this.f1301d0;
        lVar.f32332b.add(nVar);
        lVar.f32331a.run();
    }

    public final void b(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = g(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f1327b = 1;
        if (z10 && this.C != null) {
            view.setLayoutParams(gVar);
            this.f1300b0.add(view);
            return;
        }
        addView(view, gVar);
    }

    public final void c() {
        if (this.B == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.B = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1319z);
            this.B.setContentDescription(this.A);
            g gVar = new g();
            gVar.f16001a = (this.H & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            gVar.f1327b = 2;
            this.B.setLayoutParams(gVar);
            this.B.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f1314u;
        if (actionMenuView.J == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f1306j0 == null) {
                this.f1306j0 = new f();
            }
            this.f1314u.setExpandedActionViewsExclusive(true);
            fVar.b(this.f1306j0, this.D);
            s();
        }
    }

    public final void e() {
        if (this.f1314u == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1314u = actionMenuView;
            actionMenuView.setPopupTheme(this.E);
            this.f1314u.setOnMenuItemClickListener(this.f1303g0);
            ActionMenuView actionMenuView2 = this.f1314u;
            j.a aVar = this.f1307k0;
            c cVar = new c();
            actionMenuView2.O = aVar;
            actionMenuView2.P = cVar;
            g gVar = new g();
            gVar.f16001a = (this.H & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388613;
            this.f1314u.setLayoutParams(gVar);
            b(this.f1314u, false);
        }
    }

    public final void f() {
        if (this.f1317x == null) {
            this.f1317x = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f16001a = (this.H & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            this.f1317x.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.B;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.B;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        d1 d1Var = this.N;
        if (d1Var != null) {
            if (d1Var.f1395g) {
                return d1Var.f1390a;
            }
            return d1Var.f1391b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.P;
        if (i6 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i6;
    }

    public int getContentInsetLeft() {
        d1 d1Var = this.N;
        if (d1Var != null) {
            return d1Var.f1390a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        d1 d1Var = this.N;
        if (d1Var != null) {
            return d1Var.f1391b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        d1 d1Var = this.N;
        if (d1Var != null) {
            if (d1Var.f1395g) {
                return d1Var.f1391b;
            }
            return d1Var.f1390a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.O;
        if (i6 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i6;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f1314u;
        if (actionMenuView != null && (fVar = actionMenuView.J) != null && fVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.P, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (d0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (d0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.O, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1318y;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1318y;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f1314u.getMenu();
    }

    public View getNavButtonView() {
        return this.f1317x;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1317x;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1317x;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f1305i0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f1314u.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.D;
    }

    public int getPopupTheme() {
        return this.E;
    }

    public CharSequence getSubtitle() {
        return this.S;
    }

    public final TextView getSubtitleTextView() {
        return this.f1316w;
    }

    public CharSequence getTitle() {
        return this.R;
    }

    public int getTitleMarginBottom() {
        return this.M;
    }

    public int getTitleMarginEnd() {
        return this.K;
    }

    public int getTitleMarginStart() {
        return this.J;
    }

    public int getTitleMarginTop() {
        return this.L;
    }

    public final TextView getTitleTextView() {
        return this.f1315v;
    }

    public o0 getWrapper() {
        if (this.f1304h0 == null) {
            this.f1304h0 = new o1(this, true);
        }
        return this.f1304h0;
    }

    public final int h(int i6, View view) {
        int i10;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i6 > 0) {
            i10 = (measuredHeight - i6) / 2;
        } else {
            i10 = 0;
        }
        int i11 = gVar.f16001a & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.Q & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        }
        if (i11 != 48) {
            if (i11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i10;
        }
        return getPaddingTop() - i10;
    }

    public void k(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.e0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<t0.n> it2 = this.f1301d0.f32332b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.e0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.f1300b0.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i6, int i10, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i6;
        iArr[0] = Math.max(0, -i11);
        int h10 = h(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int o(View view, int i6, int i10, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i6 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int h10 = h(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1313q0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.W = false;
        }
        if (!this.W) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.W = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.W = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0292 A[LOOP:0: B:102:0x0290->B:103:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae A[LOOP:1: B:105:0x02ac->B:106:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cd A[LOOP:2: B:108:0x02cb->B:109:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031b A[LOOP:3: B:117:0x0319->B:118:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean r;
        boolean r10;
        int i16;
        int i17;
        int i18;
        i0 i0Var;
        i0 i0Var2;
        boolean z12;
        int i19;
        int i20;
        int i21;
        int paddingTop;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int size;
        int i28;
        int i29;
        int size2;
        int i30;
        int size3;
        int i31;
        int i32;
        int i33;
        int size4;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (d0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i34 = width - paddingRight;
        int[] iArr = this.c0;
        iArr[1] = 0;
        iArr[0] = 0;
        int d10 = d0.d.d(this);
        if (d10 >= 0) {
            i13 = Math.min(d10, i12 - i10);
        } else {
            i13 = 0;
        }
        if (r(this.f1317x)) {
            if (z11) {
                i15 = o(this.f1317x, i34, i13, iArr);
                i14 = paddingLeft;
                if (r(this.B)) {
                    if (z11) {
                        i15 = o(this.B, i15, i13, iArr);
                    } else {
                        i14 = n(this.B, i14, i13, iArr);
                    }
                }
                if (r(this.f1314u)) {
                    if (z11) {
                        i14 = n(this.f1314u, i14, i13, iArr);
                    } else {
                        i15 = o(this.f1314u, i15, i13, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i14);
                iArr[1] = Math.max(0, currentContentInsetRight - (i34 - i15));
                int max = Math.max(i14, currentContentInsetLeft);
                int min = Math.min(i15, i34 - currentContentInsetRight);
                if (r(this.C)) {
                    if (z11) {
                        min = o(this.C, min, i13, iArr);
                    } else {
                        max = n(this.C, max, i13, iArr);
                    }
                }
                if (r(this.f1318y)) {
                    if (z11) {
                        min = o(this.f1318y, min, i13, iArr);
                    } else {
                        max = n(this.f1318y, max, i13, iArr);
                    }
                }
                r = r(this.f1315v);
                r10 = r(this.f1316w);
                if (!r) {
                    g gVar = (g) this.f1315v.getLayoutParams();
                    i16 = paddingRight;
                    i17 = this.f1315v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + 0;
                } else {
                    i16 = paddingRight;
                    i17 = 0;
                }
                if (!r10) {
                    g gVar2 = (g) this.f1316w.getLayoutParams();
                    i18 = width;
                    i17 += this.f1316w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                } else {
                    i18 = width;
                }
                if (r && !r10) {
                    i20 = paddingLeft;
                    i21 = i13;
                } else {
                    if (!r) {
                        i0Var = this.f1315v;
                    } else {
                        i0Var = this.f1316w;
                    }
                    if (!r10) {
                        i0Var2 = this.f1316w;
                    } else {
                        i0Var2 = this.f1315v;
                    }
                    g gVar3 = (g) i0Var.getLayoutParams();
                    g gVar4 = (g) i0Var2.getLayoutParams();
                    if ((!r && this.f1315v.getMeasuredWidth() > 0) || (r10 && this.f1316w.getMeasuredWidth() > 0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i19 = this.Q & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    i20 = paddingLeft;
                    if (i19 == 48) {
                        if (i19 != 80) {
                            int i35 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                            i21 = i13;
                            int i36 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.L;
                            if (i35 < i36) {
                                i35 = i36;
                            } else {
                                int i37 = (((height - paddingBottom) - i17) - i35) - paddingTop2;
                                int i38 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                                int i39 = this.M;
                                if (i37 < i38 + i39) {
                                    i35 = Math.max(0, i35 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i39) - i37));
                                }
                            }
                            paddingTop = paddingTop2 + i35;
                        } else {
                            i21 = i13;
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.M) - i17;
                        }
                    } else {
                        i21 = i13;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.L;
                    }
                    if (!z11) {
                        if (z12) {
                            i25 = this.J;
                        } else {
                            i25 = 0;
                        }
                        int i40 = i25 - iArr[1];
                        min -= Math.max(0, i40);
                        iArr[1] = Math.max(0, -i40);
                        if (r) {
                            int measuredWidth = min - this.f1315v.getMeasuredWidth();
                            int measuredHeight = this.f1315v.getMeasuredHeight() + paddingTop;
                            this.f1315v.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i26 = measuredWidth - this.K;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((g) this.f1315v.getLayoutParams())).bottomMargin;
                        } else {
                            i26 = min;
                        }
                        if (r10) {
                            int i41 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1316w.getLayoutParams())).topMargin;
                            this.f1316w.layout(min - this.f1316w.getMeasuredWidth(), i41, min, this.f1316w.getMeasuredHeight() + i41);
                            i27 = min - this.K;
                        } else {
                            i27 = min;
                        }
                        if (z12) {
                            min = Math.min(i26, i27);
                        }
                    } else {
                        if (z12) {
                            i22 = this.J;
                        } else {
                            i22 = 0;
                        }
                        int i42 = i22 - iArr[0];
                        max += Math.max(0, i42);
                        iArr[0] = Math.max(0, -i42);
                        if (r) {
                            int measuredWidth2 = this.f1315v.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f1315v.getMeasuredHeight() + paddingTop;
                            this.f1315v.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i23 = measuredWidth2 + this.K;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((g) this.f1315v.getLayoutParams())).bottomMargin;
                        } else {
                            i23 = max;
                        }
                        if (r10) {
                            int i43 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1316w.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f1316w.getMeasuredWidth() + max;
                            this.f1316w.layout(max, i43, measuredWidth3, this.f1316w.getMeasuredHeight() + i43);
                            i24 = measuredWidth3 + this.K;
                        } else {
                            i24 = max;
                        }
                        if (z12) {
                            max = Math.max(i23, i24);
                        }
                    }
                }
                ArrayList<View> arrayList = this.f1299a0;
                a(3, arrayList);
                size = arrayList.size();
                i28 = max;
                for (i29 = 0; i29 < size; i29++) {
                    i28 = n(arrayList.get(i29), i28, i21, iArr);
                }
                int i44 = i21;
                a(5, arrayList);
                size2 = arrayList.size();
                for (i30 = 0; i30 < size2; i30++) {
                    min = o(arrayList.get(i30), min, i44, iArr);
                }
                a(1, arrayList);
                int i45 = iArr[0];
                int i46 = iArr[1];
                size3 = arrayList.size();
                int i47 = i45;
                i31 = 0;
                int i48 = 0;
                while (i31 < size3) {
                    View view = arrayList.get(i31);
                    g gVar5 = (g) view.getLayoutParams();
                    int i49 = ((ViewGroup.MarginLayoutParams) gVar5).leftMargin - i47;
                    int i50 = ((ViewGroup.MarginLayoutParams) gVar5).rightMargin - i46;
                    int max2 = Math.max(0, i49);
                    int max3 = Math.max(0, i50);
                    int max4 = Math.max(0, -i49);
                    int max5 = Math.max(0, -i50);
                    i48 += view.getMeasuredWidth() + max2 + max3;
                    i31++;
                    i46 = max5;
                    i47 = max4;
                }
                i33 = ((((i18 - i20) - i16) / 2) + i20) - (i48 / 2);
                int i51 = i48 + i33;
                if (i33 >= i28) {
                    if (i51 > min) {
                        i28 = i33 - (i51 - min);
                    } else {
                        i28 = i33;
                    }
                }
                size4 = arrayList.size();
                for (i32 = 0; i32 < size4; i32++) {
                    i28 = n(arrayList.get(i32), i28, i44, iArr);
                }
                arrayList.clear();
            }
            i14 = n(this.f1317x, paddingLeft, i13, iArr);
        } else {
            i14 = paddingLeft;
        }
        i15 = i34;
        if (r(this.B)) {
        }
        if (r(this.f1314u)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i14);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i34 - i15));
        int max6 = Math.max(i14, currentContentInsetLeft2);
        int min2 = Math.min(i15, i34 - currentContentInsetRight2);
        if (r(this.C)) {
        }
        if (r(this.f1318y)) {
        }
        r = r(this.f1315v);
        r10 = r(this.f1316w);
        if (!r) {
        }
        if (!r10) {
        }
        if (r) {
        }
        if (!r) {
        }
        if (!r10) {
        }
        g gVar32 = (g) i0Var.getLayoutParams();
        g gVar42 = (g) i0Var2.getLayoutParams();
        if (!r) {
        }
        z12 = false;
        i19 = this.Q & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        i20 = paddingLeft;
        if (i19 == 48) {
        }
        if (!z11) {
        }
        ArrayList<View> arrayList2 = this.f1299a0;
        a(3, arrayList2);
        size = arrayList2.size();
        i28 = max6;
        while (i29 < size) {
        }
        int i442 = i21;
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i30 < size2) {
        }
        a(1, arrayList2);
        int i452 = iArr[0];
        int i462 = iArr[1];
        size3 = arrayList2.size();
        int i472 = i452;
        i31 = 0;
        int i482 = 0;
        while (i31 < size3) {
        }
        i33 = ((((i18 - i20) - i16) / 2) + i20) - (i482 / 2);
        int i512 = i482 + i33;
        if (i33 >= i28) {
        }
        size4 = arrayList2.size();
        while (i32 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean a10 = u1.a(this);
        int i18 = !a10 ? 1 : 0;
        int i19 = 0;
        if (r(this.f1317x)) {
            q(this.f1317x, i6, 0, i10, this.I);
            i11 = i(this.f1317x) + this.f1317x.getMeasuredWidth();
            i12 = Math.max(0, j(this.f1317x) + this.f1317x.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f1317x.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (r(this.B)) {
            q(this.B, i6, 0, i10, this.I);
            i11 = i(this.B) + this.B.getMeasuredWidth();
            i12 = Math.max(i12, j(this.B) + this.B.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.B.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11) + 0;
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.c0;
        iArr[a10 ? 1 : 0] = max2;
        if (r(this.f1314u)) {
            q(this.f1314u, i6, max, i10, this.I);
            i14 = i(this.f1314u) + this.f1314u.getMeasuredWidth();
            i12 = Math.max(i12, j(this.f1314u) + this.f1314u.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f1314u.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[i18] = Math.max(0, currentContentInsetEnd - i14);
        if (r(this.C)) {
            max3 += p(this.C, i6, max3, i10, 0, iArr);
            i12 = Math.max(i12, j(this.C) + this.C.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.C.getMeasuredState());
        }
        if (r(this.f1318y)) {
            max3 += p(this.f1318y, i6, max3, i10, 0, iArr);
            i12 = Math.max(i12, j(this.f1318y) + this.f1318y.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f1318y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f1327b == 0 && r(childAt)) {
                max3 += p(childAt, i6, max3, i10, 0, iArr);
                i12 = Math.max(i12, j(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        int i21 = this.L + this.M;
        int i22 = this.J + this.K;
        if (r(this.f1315v)) {
            p(this.f1315v, i6, max3 + i22, i10, i21, iArr);
            int i23 = i(this.f1315v) + this.f1315v.getMeasuredWidth();
            i17 = j(this.f1315v) + this.f1315v.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i13, this.f1315v.getMeasuredState());
            i16 = i23;
        } else {
            i15 = i13;
            i16 = 0;
            i17 = 0;
        }
        if (r(this.f1316w)) {
            i16 = Math.max(i16, p(this.f1316w, i6, max3 + i22, i10, i17 + i21, iArr));
            i17 += j(this.f1316w) + this.f1316w.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i15, this.f1316w.getMeasuredState());
        }
        int max4 = Math.max(i12, i17);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i16, getSuggestedMinimumWidth()), i6, (-16777216) & i15);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i15 << 16);
        if (this.f1309m0) {
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            z10 = true;
            if (!z10) {
                i19 = resolveSizeAndState2;
            }
            setMeasuredDimension(resolveSizeAndState, i19);
        }
        z10 = false;
        if (!z10) {
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f39113u);
        ActionMenuView actionMenuView = this.f1314u;
        if (actionMenuView != null) {
            fVar = actionMenuView.J;
        } else {
            fVar = null;
        }
        int i6 = iVar.f1328w;
        if (i6 != 0 && this.f1306j0 != null && fVar != null && (findItem = fVar.findItem(i6)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f1329x) {
            b bVar = this.f1313q0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.N == null) {
            this.N = new d1();
        }
        d1 d1Var = this.N;
        boolean z10 = true;
        if (i6 != 1) {
            z10 = false;
        }
        if (z10 != d1Var.f1395g) {
            d1Var.f1395g = z10;
            if (d1Var.f1396h) {
                if (z10) {
                    int i10 = d1Var.f1393d;
                    if (i10 == Integer.MIN_VALUE) {
                        i10 = d1Var.f1394e;
                    }
                    d1Var.f1390a = i10;
                    int i11 = d1Var.f1392c;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = d1Var.f;
                    }
                    d1Var.f1391b = i11;
                    return;
                }
                int i12 = d1Var.f1392c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = d1Var.f1394e;
                }
                d1Var.f1390a = i12;
                int i13 = d1Var.f1393d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = d1Var.f;
                }
                d1Var.f1391b = i13;
                return;
            }
            d1Var.f1390a = d1Var.f1394e;
            d1Var.f1391b = d1Var.f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f1306j0;
        if (fVar != null && (hVar = fVar.f1325v) != null) {
            iVar.f1328w = hVar.f1118a;
        }
        ActionMenuView actionMenuView = this.f1314u;
        boolean z11 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.N;
            if (cVar != null && cVar.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        iVar.f1329x = z11;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = false;
        }
        if (!this.V) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.V = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V = false;
        }
        return true;
    }

    public final int p(View view, int i6, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i6, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // t0.i
    public final void removeMenuProvider(t0.n nVar) {
        this.f1301d0.a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.f1306j0;
            boolean z11 = false;
            if (fVar != null && fVar.f1325v != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && a10 != null) {
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                if (d0.g.b(this) && this.f1312p0) {
                    z11 = true;
                }
            }
            if (z11 && this.f1311o0 == null) {
                if (this.f1310n0 == null) {
                    this.f1310n0 = e.b(new m1(this, 1));
                }
                e.c(a10, this.f1310n0);
                this.f1311o0 = a10;
            } else if (!z11 && (onBackInvokedDispatcher = this.f1311o0) != null) {
                e.d(onBackInvokedDispatcher, this.f1310n0);
                this.f1311o0 = null;
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1312p0 != z10) {
            this.f1312p0 = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(hc.d.H(getContext(), i6));
    }

    public void setCollapsible(boolean z10) {
        this.f1309m0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i6 != this.P) {
            this.P = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i6 != this.O) {
            this.O = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(hc.d.H(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(hc.d.H(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1317x.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f1302f0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f1314u.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.E != i6) {
            this.E = i6;
            if (i6 == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.M = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.K = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.J = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.L = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0242a {

        /* renamed from: b  reason: collision with root package name */
        public int f1327b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1327b = 0;
        }

        public g() {
            this.f1327b = 0;
            this.f16001a = 8388627;
        }

        public g(g gVar) {
            super((a.C0242a) gVar);
            this.f1327b = 0;
            this.f1327b = gVar.f1327b;
        }

        public g(a.C0242a c0242a) {
            super(c0242a);
            this.f1327b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1327b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1327b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.Q = 8388627;
        this.f1299a0 = new ArrayList<>();
        this.f1300b0 = new ArrayList<>();
        this.c0 = new int[2];
        this.f1301d0 = new t0.l(new m1(this, 0));
        this.e0 = new ArrayList<>();
        this.f1303g0 = new a();
        this.f1313q0 = new b();
        Context context2 = getContext();
        int[] iArr = kc.f.X;
        l1 m10 = l1.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        t0.d0.p(this, context, iArr, attributeSet, m10.f1474b, R.attr.toolbarStyle);
        this.F = m10.i(28, 0);
        this.G = m10.i(19, 0);
        TypedArray typedArray = m10.f1474b;
        this.Q = typedArray.getInteger(0, 8388627);
        this.H = typedArray.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.M = c10;
        this.L = c10;
        this.K = c10;
        this.J = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.J = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.K = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.L = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.M = c14;
        }
        this.I = m10.d(13, -1);
        int c15 = m10.c(9, LinearLayoutManager.INVALID_OFFSET);
        int c16 = m10.c(5, LinearLayoutManager.INVALID_OFFSET);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.N == null) {
            this.N = new d1();
        }
        d1 d1Var = this.N;
        d1Var.f1396h = false;
        if (d10 != Integer.MIN_VALUE) {
            d1Var.f1394e = d10;
            d1Var.f1390a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            d1Var.f = d11;
            d1Var.f1391b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            d1Var.a(c15, c16);
        }
        this.O = m10.c(10, LinearLayoutManager.INVALID_OFFSET);
        this.P = m10.c(6, LinearLayoutManager.INVALID_OFFSET);
        this.f1319z = m10.e(4);
        this.A = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.D = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.n();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.B;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.B.setImageDrawable(drawable);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.B;
        if (appCompatImageButton != null) {
            appCompatImageButton.setImageDrawable(this.f1319z);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1318y == null) {
                this.f1318y = new AppCompatImageView(getContext(), null);
            }
            if (!m(this.f1318y)) {
                b(this.f1318y, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1318y;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f1318y);
                this.f1300b0.remove(this.f1318y);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1318y;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1318y == null) {
            this.f1318y = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1318y;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.f1317x;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            p1.a(this.f1317x, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1317x)) {
                b(this.f1317x, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1317x;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.f1317x);
                this.f1300b0.remove(this.f1317x);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1317x;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1316w == null) {
                Context context = getContext();
                i0 i0Var = new i0(context, null);
                this.f1316w = i0Var;
                i0Var.setSingleLine();
                this.f1316w.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.G;
                if (i6 != 0) {
                    this.f1316w.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.U;
                if (colorStateList != null) {
                    this.f1316w.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1316w)) {
                b(this.f1316w, true);
            }
        } else {
            i0 i0Var2 = this.f1316w;
            if (i0Var2 != null && m(i0Var2)) {
                removeView(this.f1316w);
                this.f1300b0.remove(this.f1316w);
            }
        }
        i0 i0Var3 = this.f1316w;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.S = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.U = colorStateList;
        i0 i0Var = this.f1316w;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1315v == null) {
                Context context = getContext();
                i0 i0Var = new i0(context, null);
                this.f1315v = i0Var;
                i0Var.setSingleLine();
                this.f1315v.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.F;
                if (i6 != 0) {
                    this.f1315v.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.T;
                if (colorStateList != null) {
                    this.f1315v.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1315v)) {
                b(this.f1315v, true);
            }
        } else {
            i0 i0Var2 = this.f1315v;
            if (i0Var2 != null && m(i0Var2)) {
                removeView(this.f1315v);
                this.f1300b0.remove(this.f1315v);
            }
        }
        i0 i0Var3 = this.f1315v;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.R = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        i0 i0Var = this.f1315v;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends z0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f1328w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f1329x;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new i[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1328w = parcel.readInt();
            this.f1329x = parcel.readInt() != 0;
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f1328w);
            parcel.writeInt(this.f1329x ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.j {

        /* renamed from: u  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f1324u;

        /* renamed from: v  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f1325v;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void d(boolean z10) {
            if (this.f1325v != null) {
                androidx.appcompat.view.menu.f fVar = this.f1324u;
                boolean z11 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        } else if (this.f1324u.getItem(i6) == this.f1325v) {
                            z11 = true;
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                if (!z11) {
                    g(this.f1325v);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.C;
            if (view instanceof k.b) {
                ((k.b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.C);
            toolbar.removeView(toolbar.B);
            toolbar.C = null;
            ArrayList<View> arrayList = toolbar.f1300b0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f1325v = null;
                    toolbar.requestLayout();
                    hVar.C = false;
                    hVar.f1130n.p(false);
                    toolbar.s();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f1324u;
            if (fVar2 != null && (hVar = this.f1325v) != null) {
                fVar2.d(hVar);
            }
            this.f1324u = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable l() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.B.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.B);
                }
                toolbar.addView(toolbar.B);
            }
            View actionView = hVar.getActionView();
            toolbar.C = actionView;
            this.f1325v = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.C);
                }
                g gVar = new g();
                gVar.f16001a = (toolbar.H & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
                gVar.f1327b = 2;
                toolbar.C.setLayoutParams(gVar);
                toolbar.addView(toolbar.C);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f1327b != 2 && childAt != toolbar.f1314u) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f1300b0.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.f1130n.p(false);
            View view = toolbar.C;
            if (view instanceof k.b) {
                ((k.b) view).onActionViewExpanded();
            }
            toolbar.s();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }
    }
}
