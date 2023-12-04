package com.ifriend.chat.new_chat.list.ui.recycler.decorator;

import com.ifriend.ui.utils.UIUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
/* compiled from: DefaultChatDecorationRule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/DefaultChatDecorationRule;", "Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecorationRule;", "()V", "horizontalMargin", "", "getHorizontalMargin", "()I", "horizontalMargin$delegate", "Lkotlin/Lazy;", "marginBottom", "getMarginBottom", "marginBottomOuter", "getMarginBottomOuter", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginTop", "getMarginTop", "marginTopOuter", "getMarginTopOuter", "verticalMargin", "getVerticalMargin", "verticalMargin$delegate", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultChatDecorationRule implements ChatDecorationRule {
    public static final DefaultChatDecorationRule INSTANCE = new DefaultChatDecorationRule();
    private static final Lazy verticalMargin$delegate = LazyKt.lazy(DefaultChatDecorationRule$verticalMargin$2.INSTANCE);
    private static final Lazy horizontalMargin$delegate = LazyKt.lazy(DefaultChatDecorationRule$horizontalMargin$2.INSTANCE);
    public static final int $stable = 8;

    private DefaultChatDecorationRule() {
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginTopOuter() {
        return getVerticalMargin() + ((int) UIUtils.INSTANCE.getToPx((Number) 8));
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginBottomOuter() {
        return getVerticalMargin();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginBottom() {
        return getVerticalMargin() / 2;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginLeft() {
        return getHorizontalMargin();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginRight() {
        return getHorizontalMargin();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginTop() {
        return getVerticalMargin() / 2;
    }

    private final int getVerticalMargin() {
        return ((Number) verticalMargin$delegate.getValue()).intValue();
    }

    private final int getHorizontalMargin() {
        return ((Number) horizontalMargin$delegate.getValue()).intValue();
    }
}
