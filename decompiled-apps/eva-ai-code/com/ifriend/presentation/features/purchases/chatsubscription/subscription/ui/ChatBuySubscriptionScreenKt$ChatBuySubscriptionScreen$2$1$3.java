package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3 extends Lambda implements Function1<LazyGridScope, Unit> {
    final /* synthetic */ State<ChatBuySubscriptionViewModel.UiState> $state$delegate;
    final /* synthetic */ ChatBuySubscriptionViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3(State<ChatBuySubscriptionViewModel.UiState> state, ChatBuySubscriptionViewModel chatBuySubscriptionViewModel) {
        super(1);
        this.$state$delegate = state;
        this.$viewModel = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
        invoke2(lazyGridScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "offer", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatSubscriptionOfferUi, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ChatSubscriptionOfferUi offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            return offer.getProductId();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyGridScope LazyVerticalGrid) {
        ChatBuySubscriptionViewModel.UiState ChatBuySubscriptionScreen$lambda$0;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        ChatBuySubscriptionScreen$lambda$0 = ChatBuySubscriptionScreenKt.ChatBuySubscriptionScreen$lambda$0(this.$state$delegate);
        ImmutableList<ChatSubscriptionOfferUi> offers = ChatBuySubscriptionScreen$lambda$0.getOffers();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = this.$viewModel;
        State<ChatBuySubscriptionViewModel.UiState> state = this.$state$delegate;
        LazyVerticalGrid.items(offers.size(), anonymousClass1 != null ? new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$2(anonymousClass1, offers) : null, null, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$4(ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$1.INSTANCE, offers), ComposableLambdaKt.composableLambdaInstance(699646206, true, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$invoke$$inlined$items$default$5(offers, chatBuySubscriptionViewModel, state)));
    }
}
