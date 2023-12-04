package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ List $items;
    final /* synthetic */ State $state$delegate$inlined;
    final /* synthetic */ ChatBuySubscriptionViewModel $viewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$5(List list, ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, State state) {
        super(4);
        this.$items = list;
        this.$viewModel$inlined = chatBuySubscriptionViewModel;
        this.$state$delegate$inlined = state;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyGridItemScope items, int i, Composer composer, int i2) {
        int i3;
        ChatBuySubscriptionViewModel.UiState ChatBuySubscriptionScreen$lambda$0;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation(composer, "C455@19203L22:LazyGridDsl.kt#7791vq");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:454)");
        }
        ChatBuySubscriptionScreen$lambda$0 = ChatBuySubscriptionScreenKt.ChatBuySubscriptionScreen$lambda$0(this.$state$delegate$inlined);
        ChatSubscriptionOfferItemKt.m6977ChatSubscriptionOfferItemContentcf5BqRc(null, (ChatSubscriptionOfferUi) this.$items.get(i), ChatBuySubscriptionScreen$lambda$0.m6985getGradientDarkerColor0d7_KjU(), new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$2$1(this.$viewModel$inlined), composer, i3 & 14 & 112, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
