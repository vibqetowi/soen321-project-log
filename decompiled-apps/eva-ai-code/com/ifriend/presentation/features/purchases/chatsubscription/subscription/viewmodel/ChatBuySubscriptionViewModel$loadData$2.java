package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.R;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import com.ifriend.ui.components.ext.StringKt;
import com.ifriend.ui.theme.AppColors;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$loadData$2", f = "ChatBuySubscriptionViewModel.kt", i = {0, 1, 3, 3, 4, 4, 5, 5, 5}, l = {178, 180, 187, 195, 196, 226, 238}, m = "invokeSuspend", n = {"$this$safeLaunch", "$this$safeLaunch", "$this$safeLaunch", "offers", "$this$safeLaunch", "offers", "offers", "chatConfig", "gradientColor"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "J$0"})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$loadData$2(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBuySubscriptionViewModel$loadData$2 chatBuySubscriptionViewModel$loadData$2 = new ChatBuySubscriptionViewModel$loadData$2(this.this$0, continuation);
        chatBuySubscriptionViewModel$loadData$2.L$0 = obj;
        return chatBuySubscriptionViewModel$loadData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$loadData$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState state) {
            ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
            Intrinsics.checkNotNullParameter(state, "state");
            m6983copypAZo6Ak = state.m6983copypAZo6Ak((r26 & 1) != 0 ? state.isLoading : true, (r26 & 2) != 0 ? state.isPurchased : false, (r26 & 4) != 0 ? state.gradientColor : 0L, (r26 & 8) != 0 ? state.gradientDarkerColor : 0L, (r26 & 16) != 0 ? state.interestsLabels : null, (r26 & 32) != 0 ? state.chatName : null, (r26 & 64) != 0 ? state.screenTitleLabel : null, (r26 & 128) != 0 ? state.screenDescriptionLabel : null, (r26 & 256) != 0 ? state.actionLabel : null, (r26 & 512) != 0 ? state.offers : null);
            return m6983copypAZo6Ak;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0233  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object purchaseProducts;
        List list;
        ChatsConfigurationInteractor chatsConfigurationInteractor;
        Object chatConfigurationFlow;
        CoroutineScope coroutineScope2;
        List list2;
        AnalyticsInteractor analyticsInteractor;
        FlowObserverEmitter flowObserverEmitter;
        Object firstOrNull;
        Color m7271constructorimpl;
        ChatAnalyticsInteractor chatAnalyticsInteractor;
        ChatConfig chatConfig;
        List list3;
        long j;
        ChatConfig.SubscriptionInfo.Style style;
        ChatConfig.Descriptions descriptions;
        ChatConfig.Descriptions descriptions2;
        String postconditionTitle;
        List<ChatConfig.SubscriptionBadges> badges;
        Object m6979updateProducts9LQNqLg;
        ChatConfig.SubscriptionInfo subscriptionInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate = this.this$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.label = 2;
                purchaseProducts = this.this$0.getPurchaseProducts(this);
                if (purchaseProducts == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) purchaseProducts;
                if (list.size() < 3) {
                    analyticsInteractor = this.this$0.analyticsInteractor;
                    analyticsInteractor.trackException("Plans count is less than 3", new IllegalStateException("Plans count is less than 3"));
                    flowObserverEmitter = this.this$0.exceptionsEmitter;
                    this.L$0 = null;
                    this.label = 3;
                    if (flowObserverEmitter.emit(new IllegalStateException("Invalid Products count!"), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                List take = CollectionsKt.take(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$loadData$2$invokeSuspend$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((BillingProduct) t).getSubscriptionMonths()), Integer.valueOf(((BillingProduct) t2).getSubscriptionMonths()));
                    }
                }), 3);
                chatsConfigurationInteractor = this.this$0.chatsConfigurationInteractor;
                this.L$0 = coroutineScope;
                this.L$1 = take;
                this.label = 4;
                chatConfigurationFlow = chatsConfigurationInteractor.getChatConfigurationFlow(this.this$0.params.getChatId(), this);
                if (chatConfigurationFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                list2 = take;
                this.L$0 = coroutineScope2;
                this.L$1 = list2;
                this.label = 5;
                firstOrNull = FlowKt.firstOrNull((Flow) chatConfigurationFlow, this);
                if (firstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list4 = list2;
                if (firstOrNull != null) {
                    ChatsConfiguration chatsConfiguration = (ChatsConfiguration) firstOrNull;
                    ChatInfo chatInfo = chatsConfiguration.getChatInfo();
                    ChatConfig chatConfig2 = chatsConfiguration.getChatConfig();
                    ChatConfig.SubscriptionInfo subscriptionInfo2 = chatConfig2 != null ? chatConfig2.getSubscriptionInfo() : null;
                    String string = (chatConfig2 == null || (descriptions2 = chatConfig2.getDescriptions()) == null || (postconditionTitle = descriptions2.getPostconditionTitle()) == null) ? this.this$0.getString(R.string.chat_subscription__title, chatInfo.getName()) : postconditionTitle;
                    String postconditionDescription = (chatConfig2 == null || (descriptions = chatConfig2.getDescriptions()) == null) ? null : descriptions.getPostconditionDescription();
                    String str = postconditionDescription == null ? "" : postconditionDescription;
                    String hexBackgroundGradient = (subscriptionInfo2 == null || (style = subscriptionInfo2.getStyle()) == null) ? null : style.getHexBackgroundGradient();
                    long m7040hexToColorSafe4WTKRHQ = StringKt.m7040hexToColorSafe4WTKRHQ(hexBackgroundGradient != null ? hexBackgroundGradient : "", AppColors.Companion.m7133getAppVioletGradient0d7_KjU());
                    try {
                        Result.Companion companion = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(Color.m3281boximpl(ColorKt.Color$default(Color.m3297getRedimpl(m7040hexToColorSafe4WTKRHQ) * 0.8f, Color.m3296getGreenimpl(m7040hexToColorSafe4WTKRHQ) * 0.8f, Color.m3294getBlueimpl(m7040hexToColorSafe4WTKRHQ) * 0.8f, 0.0f, null, 24, null)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                    }
                    Color m3281boximpl = Color.m3281boximpl(m7040hexToColorSafe4WTKRHQ);
                    if (Result.m7277isFailureimpl(m7271constructorimpl)) {
                        m7271constructorimpl = m3281boximpl;
                    }
                    long m3301unboximpl = ((Color) m7271constructorimpl).m3301unboximpl();
                    chatAnalyticsInteractor = this.this$0.chatAnalyticsInteractor;
                    chatAnalyticsInteractor.trackShowSubscriptionPopup(this.this$0.params.getChatId(), chatInfo.getName());
                    UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate2 = this.this$0;
                    this.L$0 = list4;
                    this.L$1 = chatConfig2;
                    this.J$0 = m7040hexToColorSafe4WTKRHQ;
                    this.label = 6;
                    if (uiStateDelegate2.updateUiState(uiStateDelegate2, new AnonymousClass2(chatInfo, m7040hexToColorSafe4WTKRHQ, m3301unboximpl, string, str), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatConfig = chatConfig2;
                    list3 = list4;
                    j = m7040hexToColorSafe4WTKRHQ;
                    badges = (chatConfig != null || (subscriptionInfo = chatConfig.getSubscriptionInfo()) == null) ? null : subscriptionInfo.getBadges();
                    if (badges == null) {
                        badges = CollectionsKt.emptyList();
                    }
                    ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 7;
                    m6979updateProducts9LQNqLg = chatBuySubscriptionViewModel.m6979updateProducts9LQNqLg(badges, list3, j, this);
                    if (m6979updateProducts9LQNqLg == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.label = 2;
                purchaseProducts = this.this$0.getPurchaseProducts(this);
                if (purchaseProducts == coroutine_suspended) {
                }
                list = (List) purchaseProducts;
                if (list.size() < 3) {
                }
                break;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                purchaseProducts = obj;
                list = (List) purchaseProducts;
                if (list.size() < 3) {
                }
                break;
            case 3:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                list2 = (List) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                chatConfigurationFlow = obj;
                this.L$0 = coroutineScope2;
                this.L$1 = list2;
                this.label = 5;
                firstOrNull = FlowKt.firstOrNull((Flow) chatConfigurationFlow, this);
                if (firstOrNull == coroutine_suspended) {
                }
                List list42 = list2;
                if (firstOrNull != null) {
                }
                break;
            case 5:
                list2 = (List) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                firstOrNull = obj;
                List list422 = list2;
                if (firstOrNull != null) {
                }
                break;
            case 6:
                long j2 = this.J$0;
                chatConfig = (ChatConfig) this.L$1;
                ResultKt.throwOnFailure(obj);
                list3 = (List) this.L$0;
                j = j2;
                if (chatConfig != null) {
                    break;
                }
                if (badges == null) {
                }
                ChatBuySubscriptionViewModel chatBuySubscriptionViewModel2 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 7;
                m6979updateProducts9LQNqLg = chatBuySubscriptionViewModel2.m6979updateProducts9LQNqLg(badges, list3, j, this);
                if (m6979updateProducts9LQNqLg == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$loadData$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
        final /* synthetic */ ChatInfo $chatInfo;
        final /* synthetic */ long $gradientColor;
        final /* synthetic */ long $gradientDarkerColor;
        final /* synthetic */ String $screenDescriptionLabel;
        final /* synthetic */ String $screenTitleLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatInfo chatInfo, long j, long j2, String str, String str2) {
            super(1);
            this.$chatInfo = chatInfo;
            this.$gradientColor = j;
            this.$gradientDarkerColor = j2;
            this.$screenTitleLabel = str;
            this.$screenDescriptionLabel = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState state) {
            ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
            Intrinsics.checkNotNullParameter(state, "state");
            m6983copypAZo6Ak = state.m6983copypAZo6Ak((r26 & 1) != 0 ? state.isLoading : false, (r26 & 2) != 0 ? state.isPurchased : false, (r26 & 4) != 0 ? state.gradientColor : this.$gradientColor, (r26 & 8) != 0 ? state.gradientDarkerColor : this.$gradientDarkerColor, (r26 & 16) != 0 ? state.interestsLabels : null, (r26 & 32) != 0 ? state.chatName : this.$chatInfo.getName(), (r26 & 64) != 0 ? state.screenTitleLabel : this.$screenTitleLabel, (r26 & 128) != 0 ? state.screenDescriptionLabel : this.$screenDescriptionLabel, (r26 & 256) != 0 ? state.actionLabel : null, (r26 & 512) != 0 ? state.offers : null);
            return m6983copypAZo6Ak;
        }
    }
}
