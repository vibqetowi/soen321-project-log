package com.theinnerhour.b2b.utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import kotlin.Metadata;
/* compiled from: LinearLayoutUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/utils/NoBounceLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "", Constants.DAYMODEL_POSITION, "Lhs/k;", "smoothScrollToPosition", "Landroid/content/Context;", "context", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NoBounceLinearLayoutManager extends LinearLayoutManager {
    public NoBounceLinearLayoutManager(Context context, int i6, boolean z10) {
        super(context, i6, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y state, final int i6) {
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.g(state, "state");
        final Context context = recyclerView.getContext();
        q qVar = new q(context) { // from class: com.theinnerhour.b2b.utils.NoBounceLinearLayoutManager$smoothScrollToPosition$linearSmoothScroller$1
            @Override // androidx.recyclerview.widget.q
            public int getHorizontalSnapPreference() {
                if (i6 > this.findFirstVisibleItemPosition()) {
                    return -1;
                }
                return 1;
            }
        };
        qVar.setTargetPosition(i6);
        startSmoothScroll(qVar);
    }
}
