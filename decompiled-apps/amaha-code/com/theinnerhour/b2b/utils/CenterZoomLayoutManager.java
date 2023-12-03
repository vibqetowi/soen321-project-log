package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import kotlin.Metadata;
/* compiled from: LinearLayoutUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0018\u00010\u0007R\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/theinnerhour/b2b/utils/CenterZoomLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollVertically", "canScrollHorizontally", "", "dx", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "scrollHorizontallyBy", "recyclerView", Constants.DAYMODEL_POSITION, "Lhs/k;", "smoothScrollToPosition", "", "shrinkAmount", "F", "shrinkDistance", "overrideSpeed", "Ljava/lang/Float;", "getOverrideSpeed", "()Ljava/lang/Float;", "", "TAG", "Ljava/lang/String;", "MILLISECONDS_PER_INCH", "isScrollEnabled", "Z", "()Z", "setScrollEnabled", "(Z)V", "Landroid/content/Context;", "context", "orientation", "reverseLayout", "<init>", "(Landroid/content/Context;IZFFLjava/lang/Float;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CenterZoomLayoutManager extends LinearLayoutManager {
    private final float MILLISECONDS_PER_INCH;
    private final String TAG;
    private boolean isScrollEnabled;
    private final Float overrideSpeed;
    private final float shrinkAmount;
    private final float shrinkDistance;

    public CenterZoomLayoutManager(Context context, int i6, boolean z10, float f, float f2, Float f10) {
        super(context, i6, z10);
        this.shrinkAmount = f;
        this.shrinkDistance = f2;
        this.overrideSpeed = f10;
        this.TAG = LogHelper.INSTANCE.makeLogTag("CenterZoomLayoutManager");
        this.MILLISECONDS_PER_INCH = f10 != null ? f10.floatValue() : 85.0f;
        this.isScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean canScrollHorizontally() {
        if (this.isScrollEnabled && super.canScrollHorizontally()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean canScrollVertically() {
        if (this.isScrollEnabled && super.canScrollVertically()) {
            return true;
        }
        return false;
    }

    public final Float getOverrideSpeed() {
        return this.overrideSpeed;
    }

    public final boolean isScrollEnabled() {
        return this.isScrollEnabled;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (tVar != null && yVar != null) {
            try {
                if (getOrientation() == 0) {
                    float width = getWidth() / 2.0f;
                    float f = this.shrinkDistance * width;
                    float f2 = 1.0f - this.shrinkAmount;
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = getChildAt(i10);
                        if (childAt != null) {
                            float min = (((Math.min(f, Math.abs(width - ((getDecoratedRight(childAt) + getDecoratedLeft(childAt)) / 2))) - 0.0f) * (f2 - 1.0f)) / (f - 0.0f)) + 1.0f;
                            childAt.setScaleX(min);
                            childAt.setScaleY(min);
                        }
                    }
                    return super.scrollHorizontallyBy(i6, tVar, yVar);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        return 0;
    }

    public final void setScrollEnabled(boolean z10) {
        this.isScrollEnabled = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, final int i6) {
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            q qVar = new q(context) { // from class: com.theinnerhour.b2b.utils.CenterZoomLayoutManager$smoothScrollToPosition$1$linearSmoothScroller$1
                @Override // androidx.recyclerview.widget.q
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    kotlin.jvm.internal.i.g(displayMetrics, "displayMetrics");
                    f = CenterZoomLayoutManager.this.MILLISECONDS_PER_INCH;
                    return f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.q
                public int getHorizontalSnapPreference() {
                    if (i6 > CenterZoomLayoutManager.this.findFirstVisibleItemPosition()) {
                        return -1;
                    }
                    return 1;
                }
            };
            qVar.setTargetPosition(i6);
            startSmoothScroll(qVar);
            return;
        }
        super.smoothScrollToPosition(recyclerView, yVar, i6);
    }

    public /* synthetic */ CenterZoomLayoutManager(Context context, int i6, boolean z10, float f, float f2, Float f10, int i10, kotlin.jvm.internal.d dVar) {
        this(context, i6, z10, (i10 & 8) != 0 ? 0.3f : f, (i10 & 16) != 0 ? 0.6f : f2, (i10 & 32) != 0 ? null : f10);
    }
}
