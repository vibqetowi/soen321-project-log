package bb;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes.dex */
public abstract class i extends j<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4239c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4240d;

    /* renamed from: e  reason: collision with root package name */
    public int f4241e;
    public int f;

    public i() {
        this.f4239c = new Rect();
        this.f4240d = new Rect();
        this.f4241e = 0;
    }

    @Override // bb.j
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i6) {
        int i10;
        AppBarLayout c10 = c(coordinatorLayout.e(view));
        int i11 = 0;
        if (c10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = c10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f4239c;
            rect.set(paddingLeft, bottom, width, ((c10.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            s0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.d.b(coordinatorLayout) && !d0.d.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f4240d;
            int i12 = fVar.f1931c;
            if (i12 == 0) {
                i10 = 8388659;
            } else {
                i10 = i12;
            }
            t0.f.b(i10, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i6);
            if (this.f != 0) {
                float d10 = d(c10);
                int i13 = this.f;
                i11 = hc.d.j((int) (d10 * i13), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            this.f4241e = rect2.top - c10.getBottom();
            return;
        }
        coordinatorLayout.l(i6, view);
        this.f4241e = 0;
    }

    public abstract AppBarLayout c(ArrayList arrayList);

    public float d(View view) {
        return 1.0f;
    }

    public int e(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int i12) {
        AppBarLayout c10;
        int i13;
        s0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (c10 = c(coordinatorLayout.e(view))) != null) {
            int size = View.MeasureSpec.getSize(i11);
            if (size > 0) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.d.b(c10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int e10 = e(c10) + size;
            int measuredHeight = c10.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                e10 -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = LinearLayoutManager.INVALID_OFFSET;
            }
            coordinatorLayout.m(view, i6, i10, View.MeasureSpec.makeMeasureSpec(e10, i13), i12);
            return true;
        }
        return false;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4239c = new Rect();
        this.f4240d = new Rect();
        this.f4241e = 0;
    }
}
