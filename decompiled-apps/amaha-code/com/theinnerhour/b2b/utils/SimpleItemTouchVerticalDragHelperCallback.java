package com.theinnerhour.b2b.utils;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: SimpleItemTouchVerticalDragHelperCallback.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0016J@\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/utils/SimpleItemTouchVerticalDragHelperCallback;", "Landroidx/recyclerview/widget/k$d;", "", "isLongPressDragEnabled", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$c0;", "viewHolder", "", "getMovementFlags", "source", "target", "onMove", "i", "Lhs/k;", "onSwiped", "Landroid/graphics/Canvas;", "c", "", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "onSelectedChanged", "clearView", "Lkr/a;", "mAdapter", "Lkr/a;", "<init>", "(Lkr/a;)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SimpleItemTouchVerticalDragHelperCallback extends k.d {
    public static final float ALPHA_FULL = 1.0f;
    public static final Companion Companion = new Companion(null);
    private final kr.a mAdapter;

    /* compiled from: SimpleItemTouchVerticalDragHelperCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/utils/SimpleItemTouchVerticalDragHelperCallback$Companion;", "", "()V", "ALPHA_FULL", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }
    }

    public SimpleItemTouchVerticalDragHelperCallback(kr.a mAdapter) {
        kotlin.jvm.internal.i.g(mAdapter, "mAdapter");
        this.mAdapter = mAdapter;
    }

    @Override // androidx.recyclerview.widget.k.d
    public void clearView(RecyclerView recyclerView, RecyclerView.c0 viewHolder) {
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        viewHolder.f2751a.setAlpha(1.0f);
        if (viewHolder instanceof kr.b) {
            ((kr.b) viewHolder).a();
        }
    }

    @Override // androidx.recyclerview.widget.k.d
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.c0 viewHolder) {
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.g(viewHolder, "viewHolder");
        return k.d.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.k.d
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.k.d
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.k.d
    public void onChildDraw(Canvas c10, RecyclerView recyclerView, RecyclerView.c0 viewHolder, float f, float f2, int i6, boolean z10) {
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.g(viewHolder, "viewHolder");
        if (i6 == 1) {
            float abs = Math.abs(f);
            View view = viewHolder.f2751a;
            view.setAlpha(1.0f - (abs / view.getWidth()));
            view.setTranslationX(f);
            return;
        }
        super.onChildDraw(c10, recyclerView, viewHolder, f, f2, i6, z10);
    }

    @Override // androidx.recyclerview.widget.k.d
    public boolean onMove(RecyclerView recyclerView, RecyclerView.c0 source, RecyclerView.c0 target) {
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.g(source, "source");
        kotlin.jvm.internal.i.g(target, "target");
        if (source.f != target.f) {
            return false;
        }
        this.mAdapter.e(source.f(), target.f());
        return true;
    }

    @Override // androidx.recyclerview.widget.k.d
    public void onSelectedChanged(RecyclerView.c0 c0Var, int i6) {
        if (i6 != 0 && (c0Var instanceof kr.b)) {
            ((kr.b) c0Var).b();
        }
        super.onSelectedChanged(c0Var, i6);
    }

    @Override // androidx.recyclerview.widget.k.d
    public void onSwiped(RecyclerView.c0 viewHolder, int i6) {
        kotlin.jvm.internal.i.g(viewHolder, "viewHolder");
        this.mAdapter.d(viewHolder.f());
    }
}
