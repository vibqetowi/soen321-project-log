package com.ifriend.chat.new_chat.list.ui.recycler.decorator;

import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
/* compiled from: DateChatDecorationRule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/DateChatDecorationRule;", "Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecorationRule;", "()V", "marginBottom", "", "getMarginBottom", "()I", "marginBottomOuter", "getMarginBottomOuter", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginTop", "getMarginTop", "marginTopOuter", "getMarginTopOuter", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateChatDecorationRule implements ChatDecorationRule {
    public static final int $stable = 0;
    public static final DateChatDecorationRule INSTANCE = new DateChatDecorationRule();

    private DateChatDecorationRule() {
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginTopOuter() {
        return getMarginTop();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginBottomOuter() {
        return getMarginBottom();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginTop() {
        return (int) UIUtils.INSTANCE.getToPx((Number) 32);
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginBottom() {
        return (int) UIUtils.INSTANCE.getToPx((Number) 24);
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginLeft() {
        return DefaultChatDecorationRule.INSTANCE.getMarginLeft();
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecorationRule
    public int getMarginRight() {
        return DefaultChatDecorationRule.INSTANCE.getMarginRight();
    }
}
