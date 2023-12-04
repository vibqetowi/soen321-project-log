package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GridSpacingItemDecoration.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GridSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spanCount", "", "horizontal", "vertical", "startTop", "endBottom", "startHorizontal", "endHorizontal", "(IIIIIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private final int endBottom;
    private final int endHorizontal;
    private final int horizontal;
    private final int spanCount;
    private final int startHorizontal;
    private final int startTop;
    private final int vertical;

    public /* synthetic */ GridSpacingItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) == 0 ? i7 : 0);
    }

    public GridSpacingItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.spanCount = i;
        this.horizontal = i2;
        this.vertical = i3;
        this.startTop = i4;
        this.endBottom = i5;
        this.startHorizontal = i6;
        this.endHorizontal = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        if (i2 == 0) {
            outRect.left = this.startHorizontal;
        } else {
            outRect.left = (this.horizontal * i2) / i;
        }
        int i3 = this.spanCount;
        if (i2 == i3 - 1) {
            outRect.right = this.endHorizontal;
        } else {
            int i4 = this.horizontal;
            outRect.right = i4 - (((i2 + 1) * i4) / i3);
        }
        if (childAdapterPosition >= this.spanCount) {
            outRect.top = this.vertical;
        } else {
            outRect.top = this.startTop;
        }
        int itemCount = state.getItemCount();
        int i5 = this.spanCount;
        int i6 = itemCount % i5;
        if (i6 != 0) {
            i5 = i6;
        }
        if (childAdapterPosition >= state.getItemCount() - i5) {
            outRect.bottom = this.endBottom;
        } else {
            outRect.bottom = 0;
        }
    }
}
