package eb;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import sb.d;
import t0.d0;
import t0.o0;
/* compiled from: BottomNavigationMenuView.java */
/* loaded from: classes.dex */
public final class b extends d {
    public final int c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f13931d0;
    public final int e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f13932f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f13933g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f13934h0;

    public b(Context context) {
        super(context);
        this.f13934h0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.c0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f13931d0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.e0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f13932f0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // sb.d
    public final a e(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i6;
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.e.d(this) == 1) {
                    int i17 = i13 - i15;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i14);
                } else {
                    childAt.layout(i15, 0, childAt.getMeasuredWidth() + i15, i14);
                }
                i15 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i6);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f13934h0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i14 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = this.e0;
        if (z10 && this.f13933g0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i16 = this.f13932f0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec);
                i16 = Math.max(i16, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i17 = size2 - i12;
            int min = Math.min(size - (this.f13931d0 * i17), Math.min(i16, i15));
            int i18 = size - min;
            if (i17 != 0) {
                i14 = i17;
            }
            int min2 = Math.min(i18 / i14, this.c0);
            int i19 = i18 - (i17 * min2);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() != 8) {
                    if (i20 == getSelectedItemPosition()) {
                        i13 = min;
                    } else {
                        i13 = min2;
                    }
                    if (i19 > 0) {
                        i13++;
                        i19--;
                    }
                } else {
                    i13 = 0;
                }
                arrayList.add(Integer.valueOf(i13));
            }
        } else {
            if (size2 != 0) {
                i14 = size2;
            }
            int min3 = Math.min(size / i14, i15);
            int i21 = size - (size2 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    if (i21 > 0) {
                        i11 = min3 + 1;
                        i21--;
                    } else {
                        i11 = min3;
                    }
                } else {
                    i11 = 0;
                }
                arrayList.add(Integer.valueOf(i11));
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i24)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 = childAt2.getMeasuredWidth() + i23;
            }
        }
        setMeasuredDimension(i23, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f13933g0 = z10;
    }
}
