package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class w extends c0 {

    /* renamed from: d  reason: collision with root package name */
    public u f3058d;

    /* renamed from: e  reason: collision with root package name */
    public t f3059e;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends q {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q
        public final int calculateTimeForScrolling(int i6) {
            return Math.min(100, super.calculateTimeForScrolling(i6));
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.x
        public final void onTargetFound(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            w wVar = w.this;
            int[] b10 = wVar.b(wVar.f2912a.getLayoutManager(), view);
            int i6 = b10[0];
            int i10 = b10[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i6), Math.abs(i10)));
            if (calculateTimeForDeceleration > 0) {
                DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                aVar.f2806a = i6;
                aVar.f2807b = i10;
                aVar.f2808c = calculateTimeForDeceleration;
                aVar.f2810e = decelerateInterpolator;
                aVar.f = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.canScrollHorizontally()) {
            iArr[0] = g(view, i(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.canScrollVertically()) {
            iArr[1] = g(view, j(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c0
    public final RecyclerView.x c(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new a(this.f2912a.getContext());
    }

    @Override // androidx.recyclerview.widget.c0
    public View d(RecyclerView.m mVar) {
        if (mVar.canScrollVertically()) {
            return h(mVar, j(mVar));
        }
        if (mVar.canScrollHorizontally()) {
            return h(mVar, i(mVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.c0
    public final int e(RecyclerView.m mVar, int i6, int i10) {
        v vVar;
        boolean z10;
        PointF computeScrollVectorForPosition;
        int itemCount = mVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (mVar.canScrollVertically()) {
            vVar = j(mVar);
        } else if (mVar.canScrollHorizontally()) {
            vVar = i(mVar);
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return -1;
        }
        int childCount = mVar.getChildCount();
        boolean z11 = false;
        View view2 = null;
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        int i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = mVar.getChildAt(i13);
            if (childAt != null) {
                int g5 = g(childAt, vVar);
                if (g5 <= 0 && g5 > i11) {
                    view2 = childAt;
                    i11 = g5;
                }
                if (g5 >= 0 && g5 < i12) {
                    view = childAt;
                    i12 = g5;
                }
            }
        }
        int i14 = 1;
        if (!mVar.canScrollHorizontally() ? i10 > 0 : i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && view != null) {
            return mVar.getPosition(view);
        }
        if (!z10 && view2 != null) {
            return mVar.getPosition(view2);
        }
        if (z10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = mVar.getPosition(view);
        int itemCount2 = mVar.getItemCount();
        if ((mVar instanceof RecyclerView.x.b) && (computeScrollVectorForPosition = ((RecyclerView.x.b) mVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z11 = true;
        }
        if (z11 == z10) {
            i14 = -1;
        }
        int i15 = position + i14;
        if (i15 < 0 || i15 >= itemCount) {
            return -1;
        }
        return i15;
    }

    public final int g(View view, v vVar) {
        return ((vVar.c(view) / 2) + vVar.e(view)) - ((vVar.l() / 2) + vVar.k());
    }

    public final View h(RecyclerView.m mVar, v vVar) {
        int childCount = mVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l2 = (vVar.l() / 2) + vVar.k();
        int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mVar.getChildAt(i10);
            int abs = Math.abs(((vVar.c(childAt) / 2) + vVar.e(childAt)) - l2);
            if (abs < i6) {
                view = childAt;
                i6 = abs;
            }
        }
        return view;
    }

    public final v i(RecyclerView.m mVar) {
        t tVar = this.f3059e;
        if (tVar == null || tVar.f3055a != mVar) {
            this.f3059e = new t(mVar);
        }
        return this.f3059e;
    }

    public final v j(RecyclerView.m mVar) {
        u uVar = this.f3058d;
        if (uVar == null || uVar.f3055a != mVar) {
            this.f3058d = new u(mVar);
        }
        return this.f3058d;
    }
}
