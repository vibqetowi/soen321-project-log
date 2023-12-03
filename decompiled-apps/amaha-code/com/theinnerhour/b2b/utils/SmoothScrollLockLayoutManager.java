package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: LinearLayoutUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J$\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/utils/SmoothScrollLockLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollVertically", "canScrollHorizontally", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "", Constants.DAYMODEL_POSITION, "Lhs/k;", "smoothScrollToPosition", "isScrollEnabled", "Z", "()Z", "setScrollEnabled", "(Z)V", "Landroid/content/Context;", "context", "orientation", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SmoothScrollLockLayoutManager extends LinearLayoutManager {
    public static final Companion Companion = new Companion(null);
    public static final float MILLISECONDS_PER_INCH = 85.0f;
    private boolean isScrollEnabled;

    /* compiled from: LinearLayoutUtils.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/utils/SmoothScrollLockLayoutManager$Companion;", "", "()V", "MILLISECONDS_PER_INCH", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }
    }

    public SmoothScrollLockLayoutManager(Context context, int i6, boolean z10) {
        super(context, i6, z10);
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

    public final boolean isScrollEnabled() {
        return this.isScrollEnabled;
    }

    public final void setScrollEnabled(boolean z10) {
        this.isScrollEnabled = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, final int i6) {
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            q qVar = new q(context) { // from class: com.theinnerhour.b2b.utils.SmoothScrollLockLayoutManager$smoothScrollToPosition$1$linearSmoothScroller$1
                @Override // androidx.recyclerview.widget.q
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    kotlin.jvm.internal.i.g(displayMetrics, "displayMetrics");
                    return 85.0f / displayMetrics.densityDpi;
                }

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
            return;
        }
        super.smoothScrollToPosition(recyclerView, yVar, i6);
    }
}
