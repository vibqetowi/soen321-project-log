package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onItemClick$1", f = "ChatBuySubscriptionViewModel.kt", i = {0}, l = {349}, m = "invokeSuspend", n = {"offers"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$onItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $productId;
    Object L$0;
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$onItemClick$1(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, String str, Continuation<? super ChatBuySubscriptionViewModel$onItemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBuySubscriptionViewModel$onItemClick$1(this.this$0, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$onItemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImmutableList<ChatSubscriptionOfferUi> immutableList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate = this.this$0;
            ImmutableList<ChatSubscriptionOfferUi> offers = uiStateDelegate.getUiState(uiStateDelegate).getOffers();
            String str = this.$productId;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(offers, 10));
            for (ChatSubscriptionOfferUi chatSubscriptionOfferUi : offers) {
                arrayList.add(ChatSubscriptionOfferUi.copy$default(chatSubscriptionOfferUi, null, null, null, null, null, Intrinsics.areEqual(chatSubscriptionOfferUi.getProductId(), str), null, 95, null));
            }
            ImmutableList immutableList2 = ExtensionsKt.toImmutableList(arrayList);
            UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate2 = this.this$0;
            this.L$0 = immutableList2;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, new AnonymousClass1(immutableList2), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            immutableList = immutableList2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            immutableList = (ImmutableList) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = this.this$0;
        for (ChatSubscriptionOfferUi chatSubscriptionOfferUi2 : immutableList) {
            if (chatSubscriptionOfferUi2.isSelected()) {
                chatBuySubscriptionViewModel.updateActionLabel(chatSubscriptionOfferUi2);
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onItemClick$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
        final /* synthetic */ ImmutableList<ChatSubscriptionOfferUi> $offers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImmutableList<ChatSubscriptionOfferUi> immutableList) {
            super(1);
            this.$offers = immutableList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState state) {
            ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
            Intrinsics.checkNotNullParameter(state, "state");
            m6983copypAZo6Ak = state.m6983copypAZo6Ak((r26 & 1) != 0 ? state.isLoading : false, (r26 & 2) != 0 ? state.isPurchased : false, (r26 & 4) != 0 ? state.gradientColor : 0L, (r26 & 8) != 0 ? state.gradientDarkerColor : 0L, (r26 & 16) != 0 ? state.interestsLabels : null, (r26 & 32) != 0 ? state.chatName : null, (r26 & 64) != 0 ? state.screenTitleLabel : null, (r26 & 128) != 0 ? state.screenDescriptionLabel : null, (r26 & 256) != 0 ? state.actionLabel : null, (r26 & 512) != 0 ? state.offers : this.$offers);
            return m6983copypAZo6Ak;
        }
    }
}
