package com.ifriend.chat.new_chat.list.ui.recycler.decorator;

import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DefaultChatDecorationRule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultChatDecorationRule$horizontalMargin$2 extends Lambda implements Function0<Integer> {
    public static final DefaultChatDecorationRule$horizontalMargin$2 INSTANCE = new DefaultChatDecorationRule$horizontalMargin$2();

    DefaultChatDecorationRule$horizontalMargin$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf((int) UIUtils.INSTANCE.getToPx((Number) 24));
    }
}
