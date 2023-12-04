package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt$ChatNotificationsContent$2$3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ChatNotificationUi $item;
    final /* synthetic */ Function1<ChatNotificationUi, Unit> $onItemClick;
    final /* synthetic */ Function1<ChatNotificationUi, Unit> $onItemDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatNotificationsContentKt$ChatNotificationsContent$2$3(ChatNotificationUi chatNotificationUi, Function1<? super ChatNotificationUi, Unit> function1, Function1<? super ChatNotificationUi, Unit> function12) {
        super(3);
        this.$item = chatNotificationUi;
        this.$onItemClick = function1;
        this.$onItemDismiss = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1874195541, i, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContent.<anonymous>.<anonymous>.<anonymous> (ChatNotificationsContent.kt:137)");
        }
        ChatNotificationUi chatNotificationUi = this.$item;
        Function1<ChatNotificationUi, Unit> function1 = this.$onItemClick;
        composer.startReplaceableGroup(92232837);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$1(function1, chatNotificationUi);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        Function1<ChatNotificationUi, Unit> function12 = this.$onItemDismiss;
        ChatNotificationUi chatNotificationUi2 = this.$item;
        composer.startReplaceableGroup(92232837);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$2 rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ChatNotificationsContentKt$ChatNotificationsContent$2$3$invoke$$inlined$rememberAction$2(function12, chatNotificationUi2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        ChatNotificationsContentKt.ChatNotificationItem(chatNotificationUi, function0, (Function0) rememberedValue2, PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7176getSmallD9Ej5fM(), 7, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
