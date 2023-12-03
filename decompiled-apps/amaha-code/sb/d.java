package sb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.k;
import com.theinnerhour.b2b.R;
import java.util.HashSet;
import java.util.WeakHashMap;
import qb.r;
import t0.d0;
import t0.o0;
import u0.h;
import yb.i;
/* compiled from: NavigationBarMenuView.java */
/* loaded from: classes.dex */
public abstract class d extends ViewGroup implements k {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f31395a0 = {16842912};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f31396b0 = {-16842910};
    public int A;
    public int B;
    public ColorStateList C;
    public int D;
    public ColorStateList E;
    public final ColorStateList F;
    public int G;
    public int H;
    public Drawable I;
    public ColorStateList J;
    public int K;
    public final SparseArray<cb.a> L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public i S;
    public boolean T;
    public ColorStateList U;
    public e V;
    public androidx.appcompat.view.menu.f W;

    /* renamed from: u  reason: collision with root package name */
    public final h2.a f31397u;

    /* renamed from: v  reason: collision with root package name */
    public final a f31398v;

    /* renamed from: w  reason: collision with root package name */
    public final s0.e f31399w;

    /* renamed from: x  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f31400x;

    /* renamed from: y  reason: collision with root package name */
    public int f31401y;

    /* renamed from: z  reason: collision with root package name */
    public sb.a[] f31402z;

    /* compiled from: NavigationBarMenuView.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d f31403u;

        public a(eb.b bVar) {
            this.f31403u = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h itemData = ((sb.a) view).getItemData();
            d dVar = this.f31403u;
            if (!dVar.W.q(itemData, dVar.V, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public d(Context context) {
        super(context);
        this.f31399w = new s0.e(5);
        this.f31400x = new SparseArray<>(5);
        this.A = 0;
        this.B = 0;
        this.L = new SparseArray<>(5);
        this.M = -1;
        this.N = -1;
        this.T = false;
        this.F = c();
        if (isInEditMode()) {
            this.f31397u = null;
        } else {
            h2.a aVar = new h2.a();
            this.f31397u = aVar;
            aVar.P(0);
            aVar.C(rb.a.c(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            aVar.E(rb.a.d(getContext(), R.attr.motionEasingStandard, ab.a.f450b));
            aVar.L(new r());
        }
        this.f31398v = new a((eb.b) this);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 1);
    }

    private sb.a getNewItem() {
        sb.a aVar = (sb.a) this.f31399w.b();
        if (aVar == null) {
            return e(getContext());
        }
        return aVar;
    }

    private void setBadgeIfNeeded(sb.a aVar) {
        boolean z10;
        cb.a aVar2;
        int id2 = aVar.getId();
        if (id2 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar2 = this.L.get(id2)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    public final void a() {
        boolean z10;
        boolean z11;
        removeAllViews();
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f31399w.a(aVar);
                    if (aVar.f31382a0 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        ImageView imageView = aVar.G;
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            cb.a aVar2 = aVar.f31382a0;
                            if (aVar2 != null) {
                                if (aVar2.d() != null) {
                                    aVar2.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.f31382a0 = null;
                    }
                    aVar.L = null;
                    aVar.R = 0.0f;
                    aVar.f31383u = false;
                }
            }
        }
        if (this.W.size() == 0) {
            this.A = 0;
            this.B = 0;
            this.f31402z = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < this.W.size(); i6++) {
            hashSet.add(Integer.valueOf(this.W.getItem(i6).getItemId()));
        }
        int i10 = 0;
        while (true) {
            SparseArray<cb.a> sparseArray = this.L;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i10);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i10++;
        }
        this.f31402z = new sb.a[this.W.size()];
        int i11 = this.f31401y;
        int size = this.W.l().size();
        if (i11 != -1 ? i11 == 0 : size > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i12 = 0; i12 < this.W.size(); i12++) {
            this.V.f31405v = true;
            this.W.getItem(i12).setCheckable(true);
            this.V.f31405v = false;
            sb.a newItem = getNewItem();
            this.f31402z[i12] = newItem;
            newItem.setIconTintList(this.C);
            newItem.setIconSize(this.D);
            newItem.setTextColor(this.F);
            newItem.setTextAppearanceInactive(this.G);
            newItem.setTextAppearanceActive(this.H);
            newItem.setTextColor(this.E);
            int i13 = this.M;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.N;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.P);
            newItem.setActiveIndicatorHeight(this.Q);
            newItem.setActiveIndicatorMarginHorizontal(this.R);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.T);
            newItem.setActiveIndicatorEnabled(this.O);
            Drawable drawable = this.I;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.K);
            }
            newItem.setItemRippleColor(this.J);
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f31401y);
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) this.W.getItem(i12);
            newItem.c(hVar);
            newItem.setItemPosition(i12);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f31400x;
            int i15 = hVar.f1118a;
            newItem.setOnTouchListener(sparseArray2.get(i15));
            newItem.setOnClickListener(this.f31398v);
            int i16 = this.A;
            if (i16 != 0 && i15 == i16) {
                this.B = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.W.size() - 1, this.B);
        this.B = min;
        this.W.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.W = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList c10 = g0.a.c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = c10.getDefaultColor();
        int[] iArr = f31396b0;
        return new ColorStateList(new int[][]{iArr, f31395a0, ViewGroup.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    public final yb.f d() {
        if (this.S != null && this.U != null) {
            yb.f fVar = new yb.f(this.S);
            fVar.k(this.U);
            return fVar;
        }
        return null;
    }

    public abstract eb.a e(Context context);

    public SparseArray<cb.a> getBadgeDrawables() {
        return this.L;
    }

    public ColorStateList getIconTintList() {
        return this.C;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.U;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.O;
    }

    public int getItemActiveIndicatorHeight() {
        return this.Q;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.R;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.S;
    }

    public int getItemActiveIndicatorWidth() {
        return this.P;
    }

    public Drawable getItemBackground() {
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null && aVarArr.length > 0) {
            return aVarArr[0].getBackground();
        }
        return this.I;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.K;
    }

    public int getItemIconSize() {
        return this.D;
    }

    public int getItemPaddingBottom() {
        return this.N;
    }

    public int getItemPaddingTop() {
        return this.M;
    }

    public ColorStateList getItemRippleColor() {
        return this.J;
    }

    public int getItemTextAppearanceActive() {
        return this.H;
    }

    public int getItemTextAppearanceInactive() {
        return this.G;
    }

    public ColorStateList getItemTextColor() {
        return this.E;
    }

    public int getLabelVisibilityMode() {
        return this.f31401y;
    }

    public androidx.appcompat.view.menu.f getMenu() {
        return this.W;
    }

    public int getSelectedItemId() {
        return this.A;
    }

    public int getSelectedItemPosition() {
        return this.B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(1, this.W.l().size(), 1, false).f33747a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.U = colorStateList;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.O = z10;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.Q = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i6);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.R = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i6);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.T = z10;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.S = iVar;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.P = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i6);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.I = drawable;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i6) {
        this.K = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setItemBackground(i6);
            }
        }
    }

    public void setItemIconSize(int i6) {
        this.D = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setIconSize(i6);
            }
        }
    }

    public void setItemPaddingBottom(int i6) {
        this.N = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i6);
            }
        }
    }

    public void setItemPaddingTop(int i6) {
        this.M = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i6);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i6) {
        this.H = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i6);
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.G = i6;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i6);
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        sb.a[] aVarArr = this.f31402z;
        if (aVarArr != null) {
            for (sb.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i6) {
        this.f31401y = i6;
    }

    public void setPresenter(e eVar) {
        this.V = eVar;
    }
}
