package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: u  reason: collision with root package name */
    public boolean f1217u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1218v;

    /* renamed from: w  reason: collision with root package name */
    public int f1219w;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1219w = -1;
        int[] iArr = kc.f.J;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        t0.d0.p(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1217u = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1217u);
        }
    }

    private void setStacked(boolean z10) {
        int i6;
        int i10;
        if (this.f1218v != z10) {
            if (!z10 || this.f1217u) {
                this.f1218v = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i6 = 8388613;
                } else {
                    i6 = 80;
                }
                setGravity(i6);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 4;
                    }
                    findViewById.setVisibility(i10);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        boolean z10;
        int i12;
        int paddingBottom;
        boolean z11;
        int size = View.MeasureSpec.getSize(i6);
        int i13 = 0;
        if (this.f1217u) {
            if (size > this.f1219w && this.f1218v) {
                setStacked(false);
            }
            this.f1219w = size;
        }
        if (!this.f1218v && View.MeasureSpec.getMode(i6) == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(size, LinearLayoutManager.INVALID_OFFSET);
            z10 = true;
        } else {
            i11 = i6;
            z10 = false;
        }
        super.onMeasure(i11, i10);
        if (this.f1217u && !this.f1218v) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i6, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 < childCount) {
                if (getChildAt(i14).getVisibility() == 0) {
                    break;
                }
                i14++;
            } else {
                i14 = -1;
                break;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i13 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1218v) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    } else if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i12 >= 0) {
                    paddingBottom = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i13 += paddingBottom;
        }
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (d0.d.d(this) != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i6, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1217u != z10) {
            this.f1217u = z10;
            if (!z10 && this.f1218v) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
