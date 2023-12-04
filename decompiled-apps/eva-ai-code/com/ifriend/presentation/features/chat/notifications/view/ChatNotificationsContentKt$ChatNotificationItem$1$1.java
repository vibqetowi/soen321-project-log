package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.material3.DismissValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "Landroidx/compose/material3/DismissValue;", "invoke", "(Landroidx/compose/material3/DismissValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatNotificationsContentKt$ChatNotificationItem$1$1 extends Lambda implements Function1<DismissValue, Boolean> {
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationItem$1$1(Function0<Unit> function0) {
        super(1);
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DismissValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != DismissValue.Default) {
            this.$onDismiss.invoke();
        }
        return true;
    }
}
