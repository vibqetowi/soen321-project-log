package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferBadgesUi;
import com.ifriend.ui.components.shadow.ShadowKt;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatSubscriptionOfferItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$2$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ ChatSubscriptionOfferBadgesUi $badge;
    final /* synthetic */ float $radius;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$2$1(ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, float f) {
        super(1);
        this.$badge = chatSubscriptionOfferBadgesUi;
        this.$radius = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Modifier m7069innerShadowhy0AmR8;
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        long m6975getShadowColor0d7_KjU = this.$badge.m6975getShadowColor0d7_KjU();
        float m5607constructorimpl = Dp.m5607constructorimpl(4);
        float f = (float) 0.5d;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(f);
        m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(conditional, (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : m6975getShadowColor0d7_KjU, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : this.$radius, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : m5607constructorimpl, (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : m5607constructorimpl2);
        return m7069innerShadowhy0AmR8;
    }
}
