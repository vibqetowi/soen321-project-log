package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferBadgesUi;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatSubscriptionOfferItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ ChatSubscriptionOfferBadgesUi $badge;
    final /* synthetic */ float $radius;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$1$1(ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, float f) {
        super(1);
        this.$badge = chatSubscriptionOfferBadgesUi;
        this.$radius = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return ButtonWidgetsKt.m7024innerButtonGradientTIErZ5U$default(conditional, this.$badge.m6975getShadowColor0d7_KjU(), 0.7f, this.$radius, 0.0f, 0.0f, 24, null);
    }
}
