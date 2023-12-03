package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class r extends c0 {

    /* renamed from: d  reason: collision with root package name */
    public u f3052d;

    /* renamed from: e  reason: collision with root package name */
    public t f3053e;

    @Override // androidx.recyclerview.widget.c0
    public int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.canScrollHorizontally()) {
            v i6 = i(mVar);
            iArr[0] = ((i6.c(view) / 2) + i6.e(view)) - ((i6.l() / 2) + i6.k());
        } else {
            iArr[0] = 0;
        }
        if (mVar.canScrollVertically()) {
            v j10 = j(mVar);
            iArr[1] = ((j10.c(view) / 2) + j10.e(view)) - ((j10.l() / 2) + j10.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c0
    public final View d(RecyclerView.m mVar) {
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
        int itemCount;
        View d10;
        int position;
        int i11;
        PointF computeScrollVectorForPosition;
        int i12;
        int i13;
        if (!(mVar instanceof RecyclerView.x.b) || (itemCount = mVar.getItemCount()) == 0 || (d10 = d(mVar)) == null || (position = mVar.getPosition(d10)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.x.b) mVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        int i14 = 0;
        if (mVar.canScrollHorizontally()) {
            i12 = g(mVar, i(mVar), i6, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        if (mVar.canScrollVertically()) {
            i13 = g(mVar, j(mVar), 0, i10);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (mVar.canScrollVertically()) {
            i12 = i13;
        }
        if (i12 == 0) {
            return -1;
        }
        int i15 = position + i12;
        if (i15 >= 0) {
            i14 = i15;
        }
        if (i14 < itemCount) {
            return i14;
        }
        return i11;
    }

    public final int g(RecyclerView.m mVar, v vVar, int i6, int i10) {
        int i11;
        int max;
        this.f2913b.fling(0, 0, i6, i10, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        int[] iArr = {this.f2913b.getFinalX(), this.f2913b.getFinalY()};
        int childCount = mVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            View view2 = null;
            int i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i13 = LinearLayoutManager.INVALID_OFFSET;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = mVar.getChildAt(i14);
                int position = mVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i12) {
                        view = childAt;
                        i12 = position;
                    }
                    if (position > i13) {
                        view2 = childAt;
                        i13 = position;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(vVar.b(view), vVar.b(view2)) - Math.min(vVar.e(view), vVar.e(view2))) != 0) {
                f = (max * 1.0f) / ((i13 - i12) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i11 = iArr[0];
        } else {
            i11 = iArr[1];
        }
        return Math.round(i11 / f);
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
        t tVar = this.f3053e;
        if (tVar == null || tVar.f3055a != mVar) {
            this.f3053e = new t(mVar);
        }
        return this.f3053e;
    }

    public final v j(RecyclerView.m mVar) {
        u uVar = this.f3052d;
        if (uVar == null || uVar.f3055a != mVar) {
            this.f3052d = new u(mVar);
        }
        return this.f3052d;
    }
}
