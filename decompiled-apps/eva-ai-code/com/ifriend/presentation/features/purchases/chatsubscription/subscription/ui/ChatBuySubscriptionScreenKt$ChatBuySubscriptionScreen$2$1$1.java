package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.purchases.chatsubscription.common.ChatSubscriptionCommonKt;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onQuestionClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$1(Function0<Unit> function0, int i) {
        super(3);
        this.$onQuestionClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope ChatHeaderContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ChatHeaderContent, "$this$ChatHeaderContent");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(69420654, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreen.<anonymous>.<anonymous>.<anonymous> (ChatBuySubscriptionScreen.kt:123)");
            }
            ChatSubscriptionCommonKt.m6961ChatSubscriptionCardActionww6aTOc(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 11, null), this.$onQuestionClick, R.drawable.ic_question_with_circle_white, 0L, composer, (this.$$dirty >> 6) & 112, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
