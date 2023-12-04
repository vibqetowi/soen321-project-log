package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatSubscriptionOfferItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChatSubscriptionOfferUi $offer;
    final /* synthetic */ Function1<String, Unit> $onItemClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$1$1(Function1<? super String, Unit> function1, ChatSubscriptionOfferUi chatSubscriptionOfferUi) {
        super(0);
        this.$onItemClick = function1;
        this.$offer = chatSubscriptionOfferUi;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemClick.invoke(this.$offer.getProductId());
    }
}
