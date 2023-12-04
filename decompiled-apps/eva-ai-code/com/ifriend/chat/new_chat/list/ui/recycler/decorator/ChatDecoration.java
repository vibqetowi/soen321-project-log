package com.ifriend.chat.new_chat.list.ui.recycler.decorator;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.list.ui.model.PaidTextMessageFromBotUi;
import com.ifriend.ui.recyclerView.audio.dateView.ChatDateView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatDecoration.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "chatSextingBackgroundDrawer", "Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatSextingBackgroundDrawer;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "initMargins", "decorationRule", "Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecorationRule;", "position", "", "itemCount", "isSexting", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onDraw", "c", "Landroid/graphics/Canvas;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private final ChatSextingBackgroundDrawer chatSextingBackgroundDrawer = new ChatSextingBackgroundDrawer(DefaultChatDecorationRule.INSTANCE);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : parent.getChildViewHolder(view).getOldPosition();
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0) {
            itemCount = state.getItemCount();
        }
        if (view instanceof ChatDateView) {
            initMargins$default(this, outRect, DateChatDecorationRule.INSTANCE, intValue, itemCount, false, 16, null);
            return;
        }
        RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(view);
        Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
        initMargins(outRect, DefaultChatDecorationRule.INSTANCE, intValue, itemCount, isSexting(childViewHolder));
    }

    static /* synthetic */ void initMargins$default(ChatDecoration chatDecoration, Rect rect, ChatDecorationRule chatDecorationRule, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        chatDecoration.initMargins(rect, chatDecorationRule, i, i2, z);
    }

    private final void initMargins(Rect rect, ChatDecorationRule chatDecorationRule, int i, int i2, boolean z) {
        int marginTopOuter;
        int marginBottomOuter;
        if (i > 0) {
            marginTopOuter = chatDecorationRule.getMarginTop();
        } else {
            marginTopOuter = chatDecorationRule.getMarginTopOuter();
        }
        if (i < i2 - 1) {
            marginBottomOuter = chatDecorationRule.getMarginBottom();
        } else if (z) {
            marginBottomOuter = chatDecorationRule.getMarginBottomOuter() + chatDecorationRule.getMarginBottom();
        } else {
            marginBottomOuter = chatDecorationRule.getMarginBottomOuter();
        }
        rect.top = marginTopOuter;
        rect.bottom = marginBottomOuter;
        rect.left = chatDecorationRule.getMarginLeft();
        rect.right = chatDecorationRule.getMarginRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        this.chatSextingBackgroundDrawer.draw(parent, c);
    }

    private final boolean isSexting(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder = viewHolder instanceof AdapterDelegateViewBindingViewHolder ? (AdapterDelegateViewBindingViewHolder) viewHolder : null;
        if (adapterDelegateViewBindingViewHolder == null) {
            return false;
        }
        return adapterDelegateViewBindingViewHolder.getItem() instanceof PaidTextMessageFromBotUi;
    }
}
