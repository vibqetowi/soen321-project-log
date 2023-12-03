package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, androidx.appcompat.view.menu.k {
    public androidx.appcompat.view.menu.f J;
    public Context K;
    public int L;
    public boolean M;
    public androidx.appcompat.widget.c N;
    public j.a O;
    public f.a P;
    public boolean Q;
    public int R;
    public final int S;
    public final int T;
    public e U;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1179a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1180b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1181c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1182d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1183e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1179a = cVar.f1179a;
        }

        public c() {
            super(-2, -2);
            this.f1179a = false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            boolean z10;
            boolean z11;
            e eVar = ActionMenuView.this.U;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<t0.n> it = toolbar.f1301d0.f32332b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a(menuItem)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                Toolbar.h hVar = toolbar.f1302f0;
                if (hVar != null) {
                    z11 = g.z.this.f16152b.onMenuItemSelected(0, menuItem);
                } else {
                    z11 = false;
                }
            }
            if (!z11) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            f.a aVar = ActionMenuView.this.P;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.S = (int) (56.0f * f);
        this.T = (int) (f * 4.0f);
        this.K = context;
        this.L = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.J.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.J = fVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final LinearLayoutCompat.a f() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final LinearLayoutCompat.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.J == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.J = fVar;
            fVar.f1097e = new d();
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.N = cVar;
            cVar.G = true;
            cVar.H = true;
            j.a aVar = this.O;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f1061y = aVar;
            this.J.b(cVar, this.K);
            androidx.appcompat.widget.c cVar2 = this.N;
            cVar2.B = this;
            this.J = cVar2.f1059w;
        }
        return this.J;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.N;
        c.d dVar = cVar.D;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.F) {
            return cVar.E;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.L;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i6) {
        boolean z10 = false;
        if (i6 == 0) {
            return false;
        }
        View childAt = getChildAt(i6 - 1);
        View childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        if (i6 > 0 && (childAt2 instanceof a)) {
            return z10 | ((a) childAt2).b();
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.N;
        if (cVar != null) {
            cVar.d(false);
            if (this.N.j()) {
                this.N.b();
                this.N.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.N;
        if (cVar != null) {
            cVar.b();
            c.a aVar = cVar.O;
            if (aVar != null && aVar.b()) {
                aVar.f1151j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        if (!this.Q) {
            super.onLayout(z10, i6, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i6;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = u1.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1179a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    k(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        if (i23 > 0) {
            i13 = paddingRight / i23;
        } else {
            i13 = 0;
        }
        int max = Math.max(0, i13);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1179a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1179a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        int i13;
        int i14;
        int i15;
        int i16;
        ?? r42;
        boolean z15;
        int i17;
        int i18;
        int i19;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i20;
        boolean z17;
        androidx.appcompat.view.menu.f fVar;
        boolean z18 = this.Q;
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z10;
        if (z18 != z10) {
            this.R = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.Q && (fVar = this.J) != null && size != this.R) {
            this.R = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (this.Q && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i6);
            int size3 = View.MeasureSpec.getSize(i10);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
            int i21 = size2 - paddingRight;
            int i22 = this.S;
            int i23 = i21 / i22;
            int i24 = i21 % i22;
            if (i23 == 0) {
                setMeasuredDimension(i21, 0);
                return;
            }
            int i25 = (i24 / i23) + i22;
            int childCount2 = getChildCount();
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            boolean z19 = false;
            long j10 = 0;
            int i30 = 0;
            while (true) {
                i11 = this.T;
                if (i29 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i29);
                int i31 = size3;
                int i32 = i21;
                if (childAt.getVisibility() == 8) {
                    i18 = mode;
                    i19 = paddingBottom;
                } else {
                    boolean z20 = childAt instanceof ActionMenuItemView;
                    int i33 = i27 + 1;
                    if (z20) {
                        childAt.setPadding(i11, 0, i11, 0);
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f = false;
                    cVar.f1181c = 0;
                    cVar.f1180b = 0;
                    cVar.f1182d = false;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                    if (z20 && ((ActionMenuItemView) childAt).l()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    cVar.f1183e = z15;
                    if (cVar.f1179a) {
                        i17 = 1;
                    } else {
                        i17 = i23;
                    }
                    c cVar2 = (c) childAt.getLayoutParams();
                    i18 = mode;
                    i19 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z20) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i17 > 0 && (!z16 || i17 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i25, LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i20 = measuredWidth / i25;
                        if (measuredWidth % i25 != 0) {
                            i20++;
                        }
                        if (z16 && i20 < 2) {
                            i20 = 2;
                        }
                    } else {
                        i20 = 0;
                    }
                    if (!cVar2.f1179a && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    cVar2.f1182d = z17;
                    cVar2.f1180b = i20;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i20, 1073741824), makeMeasureSpec);
                    i28 = Math.max(i28, i20);
                    if (cVar.f1182d) {
                        i30++;
                    }
                    if (cVar.f1179a) {
                        z19 = true;
                    }
                    i23 -= i20;
                    i26 = Math.max(i26, childAt.getMeasuredHeight());
                    if (i20 == 1) {
                        j10 |= 1 << i29;
                    }
                    i27 = i33;
                }
                i29++;
                size3 = i31;
                i21 = i32;
                paddingBottom = i19;
                mode = i18;
            }
            int i34 = mode;
            int i35 = i21;
            int i36 = size3;
            if (z19 && i27 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = false;
            while (i30 > 0 && i23 > 0) {
                int i37 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                int i38 = 0;
                int i39 = 0;
                long j11 = 0;
                while (i39 < childCount2) {
                    c cVar3 = (c) getChildAt(i39).getLayoutParams();
                    boolean z22 = z21;
                    if (cVar3.f1182d) {
                        int i40 = cVar3.f1180b;
                        if (i40 < i37) {
                            j11 = 1 << i39;
                            i37 = i40;
                            i38 = 1;
                        } else if (i40 == i37) {
                            j11 |= 1 << i39;
                            i38++;
                        }
                    }
                    i39++;
                    z21 = z22;
                }
                z12 = z21;
                j10 |= j11;
                if (i38 > i23) {
                    break;
                }
                int i41 = i37 + 1;
                int i42 = 0;
                while (i42 < childCount2) {
                    View childAt2 = getChildAt(i42);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i43 = i26;
                    int i44 = childMeasureSpec;
                    int i45 = childCount2;
                    long j12 = 1 << i42;
                    if ((j11 & j12) == 0) {
                        if (cVar4.f1180b == i41) {
                            j10 |= j12;
                        }
                    } else {
                        if (z11 && cVar4.f1183e) {
                            r42 = 1;
                            r42 = 1;
                            if (i23 == 1) {
                                childAt2.setPadding(i11 + i25, 0, i11, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        cVar4.f1180b += r42;
                        cVar4.f = r42;
                        i23--;
                    }
                    i42++;
                    childMeasureSpec = i44;
                    i26 = i43;
                    childCount2 = i45;
                }
                z21 = true;
            }
            z12 = z21;
            int i46 = i26;
            int i47 = childMeasureSpec;
            int i48 = childCount2;
            if (!z19 && i27 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i23 > 0 && j10 != 0 && (i23 < i27 - 1 || z13 || i28 > 1)) {
                float bitCount = Long.bitCount(j10);
                if (!z13) {
                    if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1183e) {
                        bitCount -= 0.5f;
                    }
                    int i49 = i48 - 1;
                    if ((j10 & (1 << i49)) != 0 && !((c) getChildAt(i49).getLayoutParams()).f1183e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i16 = (int) ((i23 * i25) / bitCount);
                } else {
                    i16 = 0;
                }
                boolean z23 = z12;
                i12 = i48;
                for (int i50 = 0; i50 < i12; i50++) {
                    if ((j10 & (1 << i50)) != 0) {
                        View childAt3 = getChildAt(i50);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.f1181c = i16;
                            cVar5.f = true;
                            if (i50 == 0 && !cVar5.f1183e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i16) / 2;
                            }
                        } else if (cVar5.f1179a) {
                            cVar5.f1181c = i16;
                            cVar5.f = true;
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i16) / 2;
                        } else {
                            if (i50 != 0) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = i16 / 2;
                            }
                            if (i50 != i12 - 1) {
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = i16 / 2;
                            }
                        }
                        z23 = true;
                    }
                }
                z14 = z23;
            } else {
                i12 = i48;
                z14 = z12;
            }
            if (z14) {
                int i51 = 0;
                while (i51 < i12) {
                    View childAt4 = getChildAt(i51);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (!cVar6.f) {
                        i15 = i47;
                    } else {
                        i15 = i47;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f1180b * i25) + cVar6.f1181c, 1073741824), i15);
                    }
                    i51++;
                    i47 = i15;
                }
            }
            if (i34 != 1073741824) {
                i14 = i35;
                i13 = i46;
            } else {
                i13 = i36;
                i14 = i35;
            }
            setMeasuredDimension(i14, i13);
            return;
        }
        for (int i52 = 0; i52 < childCount; i52++) {
            c cVar7 = (c) getChildAt(i52).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i6, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.N.L = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.U = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.N;
        c.d dVar = cVar.D;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.F = true;
        cVar.E = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.M = z10;
    }

    public void setPopupTheme(int i6) {
        if (this.L != i6) {
            this.L = i6;
            if (i6 == 0) {
                this.K = getContext();
            } else {
                this.K = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.N = cVar;
        cVar.B = this;
        this.J = cVar.f1059w;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }
    }
}
