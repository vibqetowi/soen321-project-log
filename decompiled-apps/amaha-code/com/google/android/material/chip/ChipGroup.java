package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import qb.f;
import qb.h;
import qb.t;
import t0.d0;
import t0.o0;
import u0.h;
import ug.l;
/* loaded from: classes.dex */
public class ChipGroup extends f {
    public d A;
    public final qb.b<Chip> B;
    public final int C;
    public final e D;

    /* renamed from: y  reason: collision with root package name */
    public int f8890y;

    /* renamed from: z  reason: collision with root package name */
    public int f8891z;

    /* loaded from: classes.dex */
    public class a implements d {
        public a() {
        }

        @Override // com.google.android.material.chip.ChipGroup.d
        public final void n(ChipGroup chipGroup, ArrayList arrayList) {
            ChipGroup chipGroup2 = ChipGroup.this;
            if (!chipGroup2.B.f29410d) {
                return;
            }
            chipGroup2.getCheckedChipId();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b() {
            super(-2, -2);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void n(ChipGroup chipGroup, ArrayList arrayList);
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f8893u;

        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    view2.setId(d0.e.a());
                }
                qb.b<Chip> bVar = chipGroup.B;
                Chip chip = (Chip) view2;
                bVar.f29407a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new qb.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8893u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                qb.b<Chip> bVar = chipGroup.B;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f29407a.remove(Integer.valueOf(chip.getId()));
                bVar.f29408b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8893u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.chipGroupStyle, 2132083825), attributeSet, R.attr.chipGroupStyle);
        qb.b<Chip> bVar = new qb.b<>();
        this.B = bVar;
        e eVar = new e();
        this.D = eVar;
        TypedArray d10 = t.d(getContext(), attributeSet, l.f34125h, R.attr.chipGroupStyle, 2132083825, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        this.C = d10.getResourceId(0, -1);
        d10.recycle();
        bVar.f29409c = new com.google.android.material.chip.b(this);
        super.setOnHierarchyChangeListener(eVar);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 1);
    }

    private int getVisibleChipCount() {
        boolean z10;
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof Chip) {
                if (getChildAt(i10).getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i6++;
                }
            }
        }
        return i6;
    }

    @Override // qb.f
    public final boolean a() {
        return this.f29458w;
    }

    public final void b(int i6) {
        qb.b<Chip> bVar = this.B;
        h<Chip> hVar = (h) bVar.f29407a.get(Integer.valueOf(i6));
        if (hVar != null && bVar.a(hVar)) {
            bVar.e();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof b)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.B.d();
    }

    public List<Integer> getCheckedChipIds() {
        return this.B.c(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f8890y;
    }

    public int getChipSpacingVertical() {
        return this.f8891z;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.C;
        if (i6 != -1) {
            qb.b<Chip> bVar = this.B;
            h<Chip> hVar = (h) bVar.f29407a.get(Integer.valueOf(i6));
            if (hVar != null && bVar.a(hVar)) {
                bVar.e();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29458w) {
            i6 = getVisibleChipCount();
        } else {
            i6 = -1;
        }
        int rowCount = getRowCount();
        if (this.B.f29410d) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(rowCount, i6, i10, false).f33747a);
    }

    public void setChipSpacing(int i6) {
        setChipSpacingHorizontal(i6);
        setChipSpacingVertical(i6);
    }

    public void setChipSpacingHorizontal(int i6) {
        if (this.f8890y != i6) {
            this.f8890y = i6;
            setItemSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i6) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingResource(int i6) {
        setChipSpacing(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingVertical(int i6) {
        if (this.f8891z != i6) {
            this.f8891z = i6;
            setLineSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i6) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i6));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i6) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a());
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.A = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.D.f8893u = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.B.f29411e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // qb.f
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        qb.b<Chip> bVar = this.B;
        if (bVar.f29410d != z10) {
            bVar.f29410d = z10;
            bVar.b();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleLine(int i6) {
        setSingleLine(getResources().getBoolean(i6));
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }
}
