package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$5 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ State<ChatBuySubscriptionViewModel.UiState> $state$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$5(State<ChatBuySubscriptionViewModel.UiState> state) {
        super(3);
        this.$state$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope AppTranslucentButton, Composer composer, int i) {
        ChatBuySubscriptionViewModel.UiState ChatBuySubscriptionScreen$lambda$0;
        Intrinsics.checkNotNullParameter(AppTranslucentButton, "$this$AppTranslucentButton");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1515444402, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreen.<anonymous>.<anonymous>.<anonymous> (ChatBuySubscriptionScreen.kt:200)");
            }
            ChatBuySubscriptionScreen$lambda$0 = ChatBuySubscriptionScreenKt.ChatBuySubscriptionScreen$lambda$0(this.$state$delegate);
            String actionLabel = ChatBuySubscriptionScreen$lambda$0.getActionLabel();
            TextStyle button = AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getButton();
            TextKt.m2145Text4IGK_g(actionLabel, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, button, composer, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
