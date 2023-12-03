package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import kotlin.Metadata;
/* compiled from: LinearLayoutUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/utils/SmoothScrollingLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "", Constants.DAYMODEL_POSITION, "Lhs/k;", "smoothScrollToPosition", "", "MILLISECONDS_PER_INCH", "F", "Landroid/content/Context;", "context", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SmoothScrollingLayoutManager extends LinearLayoutManager {
    private final float MILLISECONDS_PER_INCH;

    public SmoothScrollingLayoutManager(Context context, int i6, boolean z10) {
        super(context, i6, z10);
        this.MILLISECONDS_PER_INCH = 85.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, final int i6) {
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            q qVar = new q(context) { // from class: com.theinnerhour.b2b.utils.SmoothScrollingLayoutManager$smoothScrollToPosition$1$linearSmoothScroller$1
                @Override // androidx.recyclerview.widget.q
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    kotlin.jvm.internal.i.g(displayMetrics, "displayMetrics");
                    f = SmoothScrollingLayoutManager.this.MILLISECONDS_PER_INCH;
                    return f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.q
                public int getHorizontalSnapPreference() {
                    if (i6 > SmoothScrollingLayoutManager.this.findFirstVisibleItemPosition()) {
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
}
