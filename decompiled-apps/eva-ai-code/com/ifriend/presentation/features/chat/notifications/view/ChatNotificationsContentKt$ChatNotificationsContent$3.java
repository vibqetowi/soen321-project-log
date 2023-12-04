package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt$ChatNotificationsContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ImmutableList<ChatNotificationUi> $items;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<ChatNotificationUi, Unit> $onItemClick;
    final /* synthetic */ Function1<ChatNotificationUi, Unit> $onItemDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatNotificationsContentKt$ChatNotificationsContent$3(ImmutableList<ChatNotificationUi> immutableList, Function1<? super ChatNotificationUi, Unit> function1, Function1<? super ChatNotificationUi, Unit> function12, Modifier modifier, int i, int i2) {
        super(2);
        this.$items = immutableList;
        this.$onItemClick = function1;
        this.$onItemDismiss = function12;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatNotificationsContentKt.ChatNotificationsContent(this.$items, this.$onItemClick, this.$onItemDismiss, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
