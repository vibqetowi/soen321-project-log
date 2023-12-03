package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import qb.t;
import qb.w;
import t0.d0;
import t0.o0;
import u0.h;
import ug.l;
import yb.i;
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public final int C;
    public HashSet D;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f8872u;

    /* renamed from: v  reason: collision with root package name */
    public final e f8873v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashSet<d> f8874w;

    /* renamed from: x  reason: collision with root package name */
    public final a f8875x;

    /* renamed from: y  reason: collision with root package name */
    public Integer[] f8876y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8877z;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* loaded from: classes.dex */
    public class b extends t0.a {
        public b() {
        }

        @Override // t0.a
        public final void d(View view, h hVar) {
            int i6;
            this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
            int i10 = MaterialButtonToggleGroup.E;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i6 = 0;
                for (int i11 = 0; i11 < materialButtonToggleGroup.getChildCount(); i11++) {
                    if (materialButtonToggleGroup.getChildAt(i11) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.d(i11)) {
                        i6++;
                    }
                }
            }
            i6 = -1;
            hVar.h(h.c.a(0, 1, i6, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final yb.a f8880e = new yb.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final yb.c f8881a;

        /* renamed from: b  reason: collision with root package name */
        public final yb.c f8882b;

        /* renamed from: c  reason: collision with root package name */
        public final yb.c f8883c;

        /* renamed from: d  reason: collision with root package name */
        public final yb.c f8884d;

        public c(yb.c cVar, yb.c cVar2, yb.c cVar3, yb.c cVar4) {
            this.f8881a = cVar;
            this.f8882b = cVar3;
            this.f8883c = cVar4;
            this.f8884d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083839), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f8872u = new ArrayList();
        this.f8873v = new e();
        this.f8874w = new LinkedHashSet<>();
        this.f8875x = new a();
        this.f8877z = false;
        this.D = new HashSet();
        TypedArray d10 = t.d(getContext(), attributeSet, l.f34136t, R.attr.materialButtonToggleGroupStyle, 2132083839, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.C = d10.getResourceId(1, -1);
        this.B = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (d(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && d(i10)) {
                i6++;
            }
        }
        return i6;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            materialButton.setId(d0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f8873v);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            MaterialButton c10 = c(i6);
            int min = Math.min(c10.getStrokeWidth(), c(i6 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                t0.h.g(layoutParams, 0);
                t0.h.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                t0.h.h(layoutParams, 0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            t0.h.g(layoutParams3, 0);
            t0.h.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f8872u.add(new c(shapeAppearanceModel.f38456e, shapeAppearanceModel.f38458h, shapeAppearanceModel.f, shapeAppearanceModel.f38457g));
        materialButton.setEnabled(isEnabled());
        d0.q(materialButton, new b());
    }

    public final void b(int i6, boolean z10) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.D);
        if (z10 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.A && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i6))) {
            if (!this.B || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i6) {
        return (MaterialButton) getChildAt(i6);
    }

    public final boolean d(int i6) {
        if (getChildAt(i6).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f8875x);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put(c(i6), Integer.valueOf(i6));
        }
        this.f8876y = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.D;
        this.D = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id2 = c(i6).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f8877z = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f8877z = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f8874w.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i6 = 0; i6 < childCount; i6++) {
            MaterialButton c10 = c(i6);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f8872u.get(i6);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.a aVar2 = c.f8880e;
                    if (i6 == firstVisibleChildIndex) {
                        if (z10) {
                            if (w.c(this)) {
                                cVar = new c(aVar2, aVar2, cVar2.f8882b, cVar2.f8883c);
                            } else {
                                cVar = new c(cVar2.f8881a, cVar2.f8884d, aVar2, aVar2);
                            }
                        } else {
                            cVar = new c(cVar2.f8881a, aVar2, cVar2.f8882b, aVar2);
                        }
                    } else if (i6 == lastVisibleChildIndex) {
                        if (z10) {
                            if (w.c(this)) {
                                cVar = new c(cVar2.f8881a, cVar2.f8884d, aVar2, aVar2);
                            } else {
                                cVar = new c(aVar2, aVar2, cVar2.f8882b, cVar2.f8883c);
                            }
                        } else {
                            cVar = new c(aVar2, cVar2.f8884d, aVar2, cVar2.f8883c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f38467e = cVar2.f8881a;
                    aVar.f38469h = cVar2.f8884d;
                    aVar.f = cVar2.f8882b;
                    aVar.f38468g = cVar2.f8883c;
                }
                c10.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.A && !this.D.isEmpty()) {
            return ((Integer) this.D.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id2 = c(i6).getId();
            if (this.D.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        Integer[] numArr = this.f8876y;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.C;
        if (i6 != -1) {
            e(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.A) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(1, visibleButtonCount, i6, false).f33747a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        f();
        a();
        super.onMeasure(i6, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f8872u.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            c(i6).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.B = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }
}
