package com.ifriend.presentation.features.chat.notifications.view;

import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChatNotificationUi $item$inlined;
    final /* synthetic */ Function1 $onItemClick$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$1(Function1 function1, ChatNotificationUi chatNotificationUi) {
        super(0);
        this.$onItemClick$inlined = function1;
        this.$item$inlined = chatNotificationUi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.$onItemClick$inlined.invoke(this.$item$inlined);
        return Unit.INSTANCE;
    }
}
