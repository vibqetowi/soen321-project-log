package com.ifriend.presentation.features.purchases.billing.delegate;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.Purchase;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingProductFilter;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.api.events.LoggerLevel;
import com.ifriend.logger.api.events.PurchaseEvent;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.state.InternalStateDelegateImpl;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParamsKt;
import com.ifriend.presentation.features.purchases.billing.analytics.BillingPurchaseProductAnalytics;
import com.ifriend.presentation.features.purchases.billing.events.BillingInAppPurchaseEvents;
import com.ifriend.presentation.features.purchases.billing.models.BillingPurchase;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002rsB\u007f\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\u001b\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J'\u00106\u001a\u0002022\u0006\u0010\u0007\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010;J\u001f\u0010<\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=J\u001f\u0010>\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010BJ\u001b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010A\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010BJ\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020D09H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u001f\u0010G\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=J\u001f\u0010H\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002R\u00020I¢\u0006\u0002\u0010JJ\u0011\u0010K\u001a\u000202H\u0016R\u00020I¢\u0006\u0002\u0010LJ#\u0010M\u001a\u0002022\u0006\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020)H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u0011\u0010R\u001a\u0002022\u0006\u0010N\u001a\u00020OH\u0096\u0001J\u0011\u0010S\u001a\u00020TH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010FJ9\u0010U\u001a\u0002022\u0006\u0010N\u001a\u00020V2\b\b\u0002\u0010W\u001a\u00020X2\u0014\b\u0002\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0ZH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010[J!\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u00020\b2\u0006\u0010^\u001a\u00020_H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010`J\u001f\u0010a\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=J\u001f\u0010b\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=J\u0019\u0010c\u001a\u0002022\u0006\u0010d\u001a\u00020eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010fJ>\u0010g\u001a\u00020h*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010i\u001a\u00020j2!\u0010k\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(o\u0012\u0004\u0012\u00020\u00030lH\u0096\u0001J>\u0010p\u001a\u000202*\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010k\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(o\u0012\u0004\u0012\u00020\u00030lH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010qR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020#0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030.*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006t"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl$PurchaseState;", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "billingPurchaseProductType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "chatId", "", "appLoggerInteractor", "billingInteractor", "Lcom/ifriend/billing/api/logic/BillingInteractor;", "buyChatMessagesInteractor", "Lcom/ifriend/domain/logic/chat/buy/BuyChatMessagesInteractor;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "billingPurchaseProductAnalytics", "Lcom/ifriend/presentation/features/purchases/billing/analytics/BillingPurchaseProductAnalytics;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;Ljava/lang/String;Lcom/ifriend/logger/api/logic/AppLoggerInteractor;Lcom/ifriend/billing/api/logic/BillingInteractor;Lcom/ifriend/domain/logic/chat/buy/BuyChatMessagesInteractor;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/presentation/features/purchases/billing/analytics/BillingPurchaseProductAnalytics;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/TagsProvider;Lcom/ifriend/domain/data/UserRepository;)V", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", "billingPurchaseState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "isCustomer", "", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl$PurchaseState;", "internalStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "awaitUpdateBalanceIfNeed", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyChatMessages", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;", "purchases", "", "Lcom/android/billingclient/api/Purchase;", "(Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyProductSuccessful", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAvatar", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBuyChatSubscriptionSuccessful", "handleSuccessfulPurchasesUpdated", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;Ljava/util/List;)V", "initPurchasesProductUpdates", "(Landroidx/lifecycle/ViewModel;)V", "logEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/logger/api/events/LoggerEvent;", "isHandleError", "(Lcom/ifriend/logger/api/events/LoggerEvent;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEventAsync", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "trackEvent", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", FirebaseAnalytics.Param.LEVEL, "Lcom/ifriend/logger/api/events/LoggerLevel;", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;Lcom/ifriend/logger/api/events/LoggerLevel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackInAppPurchaseError", "reason", "throwable", "", "(Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackInAppPurchaseProductSuccessful", "trackPurchaseProduct", "trackPurchaseProductEvent", "billingPurchase", "Lcom/ifriend/presentation/features/purchases/billing/models/BillingPurchase;", "(Lcom/ifriend/presentation/features/purchases/billing/models/BillingPurchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "updateInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "PurchaseState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl implements BillingPurchaseDelegate, InternalStateDelegate<PurchaseState>, AppLoggerInteractor {
    private static final long AWAIT_UPDATE_BALANCE = 5000;
    private static final String ERROR_MESSAGE_KEY = "error-message";
    private static final String ERROR_STACK_TRACE_KEY = "error-stack-trace";
    private static final long LOG_REGISTRATION_EVENT__THRESHOLD;
    private static final String PRODUCT_TYPE_KEY = "product-type";
    private static final String PURCHASES_KEY = "purchases";
    private static final String PURCHASE_REASON_KEY = "purchase-reason";
    private static final String SUBSCRIPTION_KEY = ".subscription";
    private static final String TAG = "BillingPurchaseDelegate";
    private final /* synthetic */ InternalStateDelegateImpl<PurchaseState> $$delegate_0;
    private final AppLoggerInteractor appLoggerInteractor;
    private final BillingInteractor billingInteractor;
    private final BillingPurchaseProductAnalytics billingPurchaseProductAnalytics;
    private final BillingPurchaseProductType billingPurchaseProductType;
    private final MutableSharedFlow<ProductPurchaseEvent> billingPurchaseState;
    private final BuyChatMessagesInteractor buyChatMessagesInteractor;
    private final ChatEventsInteractor chatEventsInteractor;
    private final String chatId;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private boolean isCustomer;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final TagsProvider tagsProvider;
    private final UserBalanceRepository userBalanceRepository;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<PurchaseState> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super PurchaseState, ? extends PurchaseState> transform) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateInternalState(internalStateDelegate, coroutineScope, transform);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public PurchaseState getInternalState(InternalStateDelegate<PurchaseState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalState(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<PurchaseState> getInternalStateFlow(InternalStateDelegate<PurchaseState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalStateFlow(internalStateDelegate);
    }

    @Override // com.ifriend.logger.api.logic.AppLoggerInteractor
    public Object logEvent(LoggerEvent loggerEvent, boolean z, Continuation<? super Unit> continuation) {
        return this.appLoggerInteractor.logEvent(loggerEvent, z, continuation);
    }

    @Override // com.ifriend.logger.api.logic.AppLoggerInteractor
    public void logEventAsync(LoggerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.appLoggerInteractor.logEventAsync(event);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Object updateInternalState(InternalStateDelegate<PurchaseState> internalStateDelegate, Function1<? super PurchaseState, ? extends PurchaseState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateInternalState(internalStateDelegate, function1, continuation);
    }

    @AssistedInject
    public BillingPurchaseDelegateImpl(@Assisted BillingPurchaseProductType billingPurchaseProductType, @Assisted PurchaseReason purchaseReason, @Assisted PurchaseSource purchaseSource, @Assisted String chatId, AppLoggerInteractor appLoggerInteractor, BillingInteractor billingInteractor, BuyChatMessagesInteractor buyChatMessagesInteractor, ChatEventsInteractor chatEventsInteractor, UserBalanceRepository userBalanceRepository, BillingPurchaseProductAnalytics billingPurchaseProductAnalytics, UserProfileRepository userProfileRepository, ChatsInfoInteractor chatsInfoInteractor, TagsProvider tagsProvider, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(billingPurchaseProductType, "billingPurchaseProductType");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(appLoggerInteractor, "appLoggerInteractor");
        Intrinsics.checkNotNullParameter(billingInteractor, "billingInteractor");
        Intrinsics.checkNotNullParameter(buyChatMessagesInteractor, "buyChatMessagesInteractor");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(billingPurchaseProductAnalytics, "billingPurchaseProductAnalytics");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.billingPurchaseProductType = billingPurchaseProductType;
        this.purchaseReason = purchaseReason;
        this.purchaseSource = purchaseSource;
        this.chatId = chatId;
        this.appLoggerInteractor = appLoggerInteractor;
        this.billingInteractor = billingInteractor;
        this.buyChatMessagesInteractor = buyChatMessagesInteractor;
        this.chatEventsInteractor = chatEventsInteractor;
        this.userBalanceRepository = userBalanceRepository;
        this.billingPurchaseProductAnalytics = billingPurchaseProductAnalytics;
        this.userProfileRepository = userProfileRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.tagsProvider = tagsProvider;
        this.userRepository = userRepository;
        this.$$delegate_0 = new InternalStateDelegateImpl<>(null, new PurchaseState(null, 1, null), 1, null);
        this.billingPurchaseState = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    /* compiled from: BillingPurchaseDelegate.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl$Companion;", "", "()V", "AWAIT_UPDATE_BALANCE", "", "ERROR_MESSAGE_KEY", "", "ERROR_STACK_TRACE_KEY", "LOG_REGISTRATION_EVENT__THRESHOLD", "Lkotlin/time/Duration;", "J", "PRODUCT_TYPE_KEY", "PURCHASES_KEY", "PURCHASE_REASON_KEY", "SUBSCRIPTION_KEY", "TAG", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        LOG_REGISTRATION_EVENT__THRESHOLD = DurationKt.toDuration(72, DurationUnit.HOURS);
    }

    /* compiled from: BillingPurchaseDelegate.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl$PurchaseState;", "", "lastProductId", "", "(Ljava/lang/String;)V", "getLastProductId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PurchaseState {
        public static final int $stable = 0;
        private final String lastProductId;

        public PurchaseState() {
            this(null, 1, null);
        }

        public static /* synthetic */ PurchaseState copy$default(PurchaseState purchaseState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = purchaseState.lastProductId;
            }
            return purchaseState.copy(str);
        }

        public final String component1() {
            return this.lastProductId;
        }

        public final PurchaseState copy(String lastProductId) {
            Intrinsics.checkNotNullParameter(lastProductId, "lastProductId");
            return new PurchaseState(lastProductId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PurchaseState) && Intrinsics.areEqual(this.lastProductId, ((PurchaseState) obj).lastProductId);
        }

        public int hashCode() {
            return this.lastProductId.hashCode();
        }

        public String toString() {
            String str = this.lastProductId;
            return "PurchaseState(lastProductId=" + str + ")";
        }

        public PurchaseState(String lastProductId) {
            Intrinsics.checkNotNullParameter(lastProductId, "lastProductId");
            this.lastProductId = lastProductId;
        }

        public /* synthetic */ PurchaseState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final String getLastProductId() {
            return this.lastProductId;
        }
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Flow<ProductPurchaseEvent> getBillingPurchaseFlow() {
        return FlowKt.asSharedFlow(this.billingPurchaseState);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public void initPurchasesProductUpdates(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        FlowKt.launchIn(FlowKt.onEach(this.billingInteractor.getBillingProductUpdatesFlow(), new BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1(this, context_receiver_0, null)), ViewModelKt.getViewModelScope(context_receiver_0));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessfulPurchasesUpdated(ViewModel viewModel, List<? extends Purchase> list) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1(this, null), null, new BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2(this, list, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPurchaseProducts(Continuation<? super List<BillingProduct>> continuation) {
        BillingPurchaseDelegateImpl$getPurchaseProducts$1 billingPurchaseDelegateImpl$getPurchaseProducts$1;
        int i;
        Object mo6782startBillingConnectionIoAF18A;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        if (continuation instanceof BillingPurchaseDelegateImpl$getPurchaseProducts$1) {
            billingPurchaseDelegateImpl$getPurchaseProducts$1 = (BillingPurchaseDelegateImpl$getPurchaseProducts$1) continuation;
            if ((billingPurchaseDelegateImpl$getPurchaseProducts$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$getPurchaseProducts$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$getPurchaseProducts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$getPurchaseProducts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BillingInteractor billingInteractor = this.billingInteractor;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0 = this;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.label = 1;
                    mo6782startBillingConnectionIoAF18A = billingInteractor.mo6782startBillingConnectionIoAF18A(billingPurchaseDelegateImpl$getPurchaseProducts$1);
                    if (mo6782startBillingConnectionIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                    }
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    String replace$default = StringsKt.replace$default(((ChatInfo) obj).getUId(), "-", "", false, 4, (Object) null);
                    BillingInteractor billingInteractor2 = billingPurchaseDelegateImpl.billingInteractor;
                    BillingProductFilter billingProductFilter = new BillingProductFilter(billingPurchaseDelegateImpl.billingPurchaseProductType, replace$default + SUBSCRIPTION_KEY);
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0 = null;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.label = 3;
                    obj = billingInteractor2.getProducts(billingProductFilter, billingPurchaseDelegateImpl$getPurchaseProducts$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                } else {
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mo6782startBillingConnectionIoAF18A = ((Result) obj).m7280unboximpl();
                }
                ResultKt.throwOnFailure(mo6782startBillingConnectionIoAF18A);
                if (!(!StringsKt.isBlank(billingPurchaseDelegateImpl.chatId))) {
                    ChatsInfoInteractor chatsInfoInteractor = billingPurchaseDelegateImpl.chatsInfoInteractor;
                    String str = billingPurchaseDelegateImpl.chatId;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0 = billingPurchaseDelegateImpl;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.label = 2;
                    obj = chatsInfoInteractor.getChatInfo(str, billingPurchaseDelegateImpl$getPurchaseProducts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj != null) {
                    }
                } else {
                    BillingInteractor billingInteractor3 = billingPurchaseDelegateImpl.billingInteractor;
                    BillingPurchaseProductType billingPurchaseProductType = billingPurchaseDelegateImpl.billingPurchaseProductType;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.L$0 = null;
                    billingPurchaseDelegateImpl$getPurchaseProducts$1.label = 4;
                    obj = billingInteractor3.getAppProducts(billingPurchaseProductType, billingPurchaseDelegateImpl$getPurchaseProducts$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
            }
        }
        billingPurchaseDelegateImpl$getPurchaseProducts$1 = new BillingPurchaseDelegateImpl$getPurchaseProducts$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$getPurchaseProducts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$getPurchaseProducts$1.label;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(mo6782startBillingConnectionIoAF18A);
        if (!(!StringsKt.isBlank(billingPurchaseDelegateImpl.chatId))) {
        }
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getPurchaseProduct(String str, Continuation<? super BillingProduct> continuation) {
        return this.billingInteractor.getProduct(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x006b, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBillingFlowParams(String str, Continuation<? super BillingFlowParams> continuation) {
        BillingPurchaseDelegateImpl$getBillingFlowParams$1 billingPurchaseDelegateImpl$getBillingFlowParams$1;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        if (continuation instanceof BillingPurchaseDelegateImpl$getBillingFlowParams$1) {
            billingPurchaseDelegateImpl$getBillingFlowParams$1 = (BillingPurchaseDelegateImpl$getBillingFlowParams$1) continuation;
            if ((billingPurchaseDelegateImpl$getBillingFlowParams$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$getBillingFlowParams$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$getBillingFlowParams$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$getBillingFlowParams$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    billingPurchaseDelegateImpl$getBillingFlowParams$1.L$0 = this;
                    billingPurchaseDelegateImpl$getBillingFlowParams$1.L$1 = str;
                    billingPurchaseDelegateImpl$getBillingFlowParams$1.label = 1;
                    if (updateInternalState(this, new BillingPurchaseDelegateImpl$getBillingFlowParams$2(str), billingPurchaseDelegateImpl$getBillingFlowParams$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    str = (String) billingPurchaseDelegateImpl$getBillingFlowParams$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$getBillingFlowParams$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                BillingInteractor billingInteractor = billingPurchaseDelegateImpl.billingInteractor;
                BillingPurchaseProductType billingPurchaseProductType = billingPurchaseDelegateImpl.billingPurchaseProductType;
                billingPurchaseDelegateImpl$getBillingFlowParams$1.L$0 = null;
                billingPurchaseDelegateImpl$getBillingFlowParams$1.L$1 = null;
                billingPurchaseDelegateImpl$getBillingFlowParams$1.label = 2;
                obj = billingInteractor.getBillingFlowParams(str, billingPurchaseProductType, billingPurchaseDelegateImpl$getBillingFlowParams$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        billingPurchaseDelegateImpl$getBillingFlowParams$1 = new BillingPurchaseDelegateImpl$getBillingFlowParams$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$getBillingFlowParams$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$getBillingFlowParams$1.label;
        if (i != 0) {
        }
        BillingInteractor billingInteractor2 = billingPurchaseDelegateImpl.billingInteractor;
        BillingPurchaseProductType billingPurchaseProductType2 = billingPurchaseDelegateImpl.billingPurchaseProductType;
        billingPurchaseDelegateImpl$getBillingFlowParams$1.L$0 = null;
        billingPurchaseDelegateImpl$getBillingFlowParams$1.L$1 = null;
        billingPurchaseDelegateImpl$getBillingFlowParams$1.label = 2;
        obj2 = billingInteractor2.getBillingFlowParams(str, billingPurchaseProductType2, billingPurchaseDelegateImpl$getBillingFlowParams$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateAvatar(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$generateAvatar$1 billingPurchaseDelegateImpl$generateAvatar$1;
        Object coroutine_suspended;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        if (continuation instanceof BillingPurchaseDelegateImpl$generateAvatar$1) {
            billingPurchaseDelegateImpl$generateAvatar$1 = (BillingPurchaseDelegateImpl$generateAvatar$1) continuation;
            if ((billingPurchaseDelegateImpl$generateAvatar$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$generateAvatar$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$generateAvatar$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$generateAvatar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    billingPurchaseDelegateImpl$generateAvatar$1.L$0 = this;
                    billingPurchaseDelegateImpl$generateAvatar$1.L$1 = list;
                    billingPurchaseDelegateImpl$generateAvatar$1.label = 1;
                    if (awaitUpdateBalanceIfNeed(5000L, billingPurchaseDelegateImpl$generateAvatar$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) billingPurchaseDelegateImpl$generateAvatar$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$generateAvatar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingPurchaseDelegateImpl$generateAvatar$1.L$0 = null;
                billingPurchaseDelegateImpl$generateAvatar$1.L$1 = null;
                billingPurchaseDelegateImpl$generateAvatar$1.label = 2;
                if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$generateAvatar$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        billingPurchaseDelegateImpl$generateAvatar$1 = new BillingPurchaseDelegateImpl$generateAvatar$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$generateAvatar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$generateAvatar$1.label;
        if (i != 0) {
        }
        billingPurchaseDelegateImpl$generateAvatar$1.L$0 = null;
        billingPurchaseDelegateImpl$generateAvatar$1.L$1 = null;
        billingPurchaseDelegateImpl$generateAvatar$1.label = 2;
        if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$generateAvatar$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyChatMessages(PurchaseReason.BuyMessage buyMessage, List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$buyChatMessages$1 billingPurchaseDelegateImpl$buyChatMessages$1;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        PurchaseReason.BuyMessage buyMessage2;
        List<? extends Purchase> list2;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl2;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl3;
        List<? extends Purchase> list3;
        MutableSharedFlow<ProductPurchaseEvent> mutableSharedFlow;
        ProductPurchaseEvent.InAppPurchaseFailure inAppPurchaseFailure;
        if (continuation instanceof BillingPurchaseDelegateImpl$buyChatMessages$1) {
            billingPurchaseDelegateImpl$buyChatMessages$1 = (BillingPurchaseDelegateImpl$buyChatMessages$1) continuation;
            if ((billingPurchaseDelegateImpl$buyChatMessages$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$buyChatMessages$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$buyChatMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (billingPurchaseDelegateImpl$buyChatMessages$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        BillingInAppPurchaseEvents.BuyChatMessage.StartBuyChatMessage startBuyChatMessage = BillingInAppPurchaseEvents.BuyChatMessage.StartBuyChatMessage.INSTANCE;
                        Map mapOf = MapsKt.mapOf(TuplesKt.to(PURCHASE_REASON_KEY, buyMessage.toString()));
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = this;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = buyMessage;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = list;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 1;
                        if (trackEvent$default(this, startBuyChatMessage, null, mapOf, billingPurchaseDelegateImpl$buyChatMessages$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingPurchaseDelegateImpl = this;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = buyMessage;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = list;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 2;
                        if (billingPurchaseDelegateImpl.awaitUpdateBalanceIfNeed(5000L, billingPurchaseDelegateImpl$buyChatMessages$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        List<? extends Purchase> list4 = list;
                        buyMessage2 = buyMessage;
                        list2 = list4;
                        BuyChatMessagesInteractor buyChatMessagesInteractor = billingPurchaseDelegateImpl.buyChatMessagesInteractor;
                        MessageIds messageIdsParams = MessageIdsParamsKt.toMessageIdsParams(buyMessage2.getMessageIds());
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = buyMessage2;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = list2;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 3;
                        obj = buyChatMessagesInteractor.buyMessage(messageIdsParams, billingPurchaseDelegateImpl$buyChatMessages$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PurchaseReason.BuyMessage buyMessage3 = buyMessage2;
                        List<? extends Purchase> list5 = list2;
                        billingPurchaseDelegateImpl2 = billingPurchaseDelegateImpl;
                        if (((Boolean) obj).booleanValue()) {
                            Map mapOf2 = MapsKt.mapOf(TuplesKt.to(PURCHASE_REASON_KEY, buyMessage3.toString()));
                            billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl2;
                            billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = list5;
                            billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = null;
                            billingPurchaseDelegateImpl$buyChatMessages$1.label = 4;
                            if (trackEvent$default(billingPurchaseDelegateImpl2, BillingInAppPurchaseEvents.BuyChatMessage.SuccessfulBuyChatMessage.INSTANCE, null, mapOf2, billingPurchaseDelegateImpl$buyChatMessages$1, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingPurchaseDelegateImpl3 = billingPurchaseDelegateImpl2;
                            list3 = list5;
                            billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = null;
                            billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = null;
                            billingPurchaseDelegateImpl$buyChatMessages$1.label = 5;
                            if (billingPurchaseDelegateImpl3.buyProductSuccessful(list3, billingPurchaseDelegateImpl$buyChatMessages$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        BillingInAppPurchaseEvents.BuyChatMessage.ErrorBuyChatMessage errorBuyChatMessage = BillingInAppPurchaseEvents.BuyChatMessage.ErrorBuyChatMessage.INSTANCE;
                        Map mapOf3 = MapsKt.mapOf(TuplesKt.to(PURCHASE_REASON_KEY, buyMessage3.toString()));
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl2;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 6;
                        if (trackEvent$default(billingPurchaseDelegateImpl2, errorBuyChatMessage, null, mapOf3, billingPurchaseDelegateImpl$buyChatMessages$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableSharedFlow = billingPurchaseDelegateImpl2.billingPurchaseState;
                        inAppPurchaseFailure = ProductPurchaseEvent.InAppPurchaseFailure.INSTANCE;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 7;
                        if (mutableSharedFlow.emit(inAppPurchaseFailure, billingPurchaseDelegateImpl$buyChatMessages$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        list = (List) billingPurchaseDelegateImpl$buyChatMessages$1.L$2;
                        buyMessage = (PurchaseReason.BuyMessage) billingPurchaseDelegateImpl$buyChatMessages$1.L$1;
                        billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyChatMessages$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = buyMessage;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = list;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 2;
                        if (billingPurchaseDelegateImpl.awaitUpdateBalanceIfNeed(5000L, billingPurchaseDelegateImpl$buyChatMessages$1) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        list2 = (List) billingPurchaseDelegateImpl$buyChatMessages$1.L$2;
                        buyMessage2 = (PurchaseReason.BuyMessage) billingPurchaseDelegateImpl$buyChatMessages$1.L$1;
                        billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyChatMessages$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        BuyChatMessagesInteractor buyChatMessagesInteractor2 = billingPurchaseDelegateImpl.buyChatMessagesInteractor;
                        MessageIds messageIdsParams2 = MessageIdsParamsKt.toMessageIdsParams(buyMessage2.getMessageIds());
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = billingPurchaseDelegateImpl;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = buyMessage2;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$2 = list2;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 3;
                        obj = buyChatMessagesInteractor2.buyMessage(messageIdsParams2, billingPurchaseDelegateImpl$buyChatMessages$1);
                        if (obj == coroutine_suspended) {
                        }
                        PurchaseReason.BuyMessage buyMessage32 = buyMessage2;
                        List<? extends Purchase> list52 = list2;
                        billingPurchaseDelegateImpl2 = billingPurchaseDelegateImpl;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        list2 = (List) billingPurchaseDelegateImpl$buyChatMessages$1.L$2;
                        buyMessage2 = (PurchaseReason.BuyMessage) billingPurchaseDelegateImpl$buyChatMessages$1.L$1;
                        billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyChatMessages$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        PurchaseReason.BuyMessage buyMessage322 = buyMessage2;
                        List<? extends Purchase> list522 = list2;
                        billingPurchaseDelegateImpl2 = billingPurchaseDelegateImpl;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 4:
                        list3 = (List) billingPurchaseDelegateImpl$buyChatMessages$1.L$1;
                        billingPurchaseDelegateImpl3 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyChatMessages$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$1 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 5;
                        if (billingPurchaseDelegateImpl3.buyProductSuccessful(list3, billingPurchaseDelegateImpl$buyChatMessages$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        billingPurchaseDelegateImpl2 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyChatMessages$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableSharedFlow = billingPurchaseDelegateImpl2.billingPurchaseState;
                        inAppPurchaseFailure = ProductPurchaseEvent.InAppPurchaseFailure.INSTANCE;
                        billingPurchaseDelegateImpl$buyChatMessages$1.L$0 = null;
                        billingPurchaseDelegateImpl$buyChatMessages$1.label = 7;
                        if (mutableSharedFlow.emit(inAppPurchaseFailure, billingPurchaseDelegateImpl$buyChatMessages$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        billingPurchaseDelegateImpl$buyChatMessages$1 = new BillingPurchaseDelegateImpl$buyChatMessages$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$buyChatMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (billingPurchaseDelegateImpl$buyChatMessages$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBuyChatSubscriptionSuccessful(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1 billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1;
        Object coroutine_suspended;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        if (continuation instanceof BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) {
            billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1 = (BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) continuation;
            if ((billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl2 = this;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0 = this;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1 = list;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label = 1;
                        obj = TimeoutKt.withTimeout(5000L, new BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$2$1(this, null), billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingPurchaseDelegateImpl = this;
                    } catch (Throwable th) {
                        th = th;
                        billingPurchaseDelegateImpl = this;
                        Result.Companion companion2 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0 = null;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1 = null;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label = 2;
                        if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0 = null;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1 = null;
                        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label = 2;
                        if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                Result.m7271constructorimpl((ChatInfo) obj);
                billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0 = null;
                billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1 = null;
                billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label = 2;
                if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1 = new BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl((ChatInfo) obj2);
        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$0 = null;
        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.L$1 = null;
        billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1.label = 2;
        if (billingPurchaseDelegateImpl.buyProductSuccessful(list, billingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyProductSuccessful(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$buyProductSuccessful$1 billingPurchaseDelegateImpl$buyProductSuccessful$1;
        Object coroutine_suspended;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        MutableSharedFlow<ProductPurchaseEvent> mutableSharedFlow;
        ProductPurchaseEvent.BuyProductSuccessful buyProductSuccessful;
        if (continuation instanceof BillingPurchaseDelegateImpl$buyProductSuccessful$1) {
            billingPurchaseDelegateImpl$buyProductSuccessful$1 = (BillingPurchaseDelegateImpl$buyProductSuccessful$1) continuation;
            if ((billingPurchaseDelegateImpl$buyProductSuccessful$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$buyProductSuccessful$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$buyProductSuccessful$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$buyProductSuccessful$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = this;
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = list;
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 1;
                    if (trackPurchaseProduct(list, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableSharedFlow = billingPurchaseDelegateImpl.billingPurchaseState;
                    buyProductSuccessful = new ProductPurchaseEvent.BuyProductSuccessful(list);
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = null;
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = null;
                    billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 3;
                    if (mutableSharedFlow.emit(buyProductSuccessful, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    list = (List) billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = billingPurchaseDelegateImpl;
                billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = list;
                billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 2;
                if (billingPurchaseDelegateImpl.trackInAppPurchaseProductSuccessful(list, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableSharedFlow = billingPurchaseDelegateImpl.billingPurchaseState;
                buyProductSuccessful = new ProductPurchaseEvent.BuyProductSuccessful(list);
                billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = null;
                billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = null;
                billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 3;
                if (mutableSharedFlow.emit(buyProductSuccessful, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        billingPurchaseDelegateImpl$buyProductSuccessful$1 = new BillingPurchaseDelegateImpl$buyProductSuccessful$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$buyProductSuccessful$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$buyProductSuccessful$1.label;
        if (i != 0) {
        }
        billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = billingPurchaseDelegateImpl;
        billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = list;
        billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 2;
        if (billingPurchaseDelegateImpl.trackInAppPurchaseProductSuccessful(list, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
        }
        mutableSharedFlow = billingPurchaseDelegateImpl.billingPurchaseState;
        buyProductSuccessful = new ProductPurchaseEvent.BuyProductSuccessful(list);
        billingPurchaseDelegateImpl$buyProductSuccessful$1.L$0 = null;
        billingPurchaseDelegateImpl$buyProductSuccessful$1.L$1 = null;
        billingPurchaseDelegateImpl$buyProductSuccessful$1.label = 3;
        if (mutableSharedFlow.emit(buyProductSuccessful, billingPurchaseDelegateImpl$buyProductSuccessful$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackInAppPurchaseProductSuccessful(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this.appLoggerInteractor, new PurchaseEvent(BillingInAppPurchaseEvents.InAppPurchaseProductSuccessful.INSTANCE.getEvent(), LoggerLevel.INFO, MapsKt.mapOf(TuplesKt.to(PURCHASE_REASON_KEY, this.purchaseReason.toString()), TuplesKt.to(PRODUCT_TYPE_KEY, this.billingPurchaseProductType.name()), TuplesKt.to("purchases", CollectionsKt.joinToString$default(list, null, null, null, 0, null, BillingPurchaseDelegateImpl$trackInAppPurchaseProductSuccessful$2.INSTANCE, 31, null))), TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|13|14))(1:27))(2:35|(1:37)(1:38))|28|(2:30|31)(7:32|(1:34)|20|21|(0)|13|14)))|41|6|7|(0)(0)|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        r12 = kotlin.Result.Companion;
        r11 = kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r11));
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x0040, B:33:0x008c, B:30:0x0074), top: B:43:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitUpdateBalanceIfNeed(long j, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1 billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1;
        int i;
        Object m7271constructorimpl;
        Object obj;
        long j2;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        if (continuation instanceof BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1) {
            billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1 = (BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1) continuation;
            if ((billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1.label -= Integer.MIN_VALUE;
                BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1 billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1;
                Object obj2 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    UserBalanceRepository userBalanceRepository = this.userBalanceRepository;
                    billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0 = this;
                    billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.J$0 = j;
                    billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.label = 1;
                    Object balance = userBalanceRepository.getBalance(billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12);
                    if (balance == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = balance;
                    j2 = j;
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Object obj3 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0;
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    BillingPurchaseDelegateImpl billingPurchaseDelegateImpl2 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    j = billingPurchaseDelegateImpl2;
                    m7271constructorimpl = Result.m7271constructorimpl((MessagesSourceMessage.NeuronesChanged) obj2);
                    BillingPurchaseDelegateImpl billingPurchaseDelegateImpl3 = j;
                    BillingPurchaseDelegateImpl billingPurchaseDelegateImpl4 = billingPurchaseDelegateImpl3;
                    if (Result.m7274exceptionOrNullimpl(m7271constructorimpl) != null) {
                        LoggerLevel loggerLevel = LoggerLevel.WARNING;
                        billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0 = m7271constructorimpl;
                        billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.label = 3;
                        if (trackEvent$default(billingPurchaseDelegateImpl4, BillingInAppPurchaseEvents.AwaitUpdateBalanceFailure.INSTANCE, loggerLevel, null, billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    long j3 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.J$0;
                    BillingPurchaseDelegateImpl billingPurchaseDelegateImpl5 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    j2 = j3;
                    billingPurchaseDelegateImpl = billingPurchaseDelegateImpl5;
                }
                if (((UserBalance) obj).getNeurons() <= 0) {
                    return Unit.INSTANCE;
                }
                Result.Companion companion = Result.Companion;
                BillingPurchaseDelegateImpl billingPurchaseDelegateImpl6 = billingPurchaseDelegateImpl;
                billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.L$0 = billingPurchaseDelegateImpl;
                billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12.label = 2;
                obj2 = TimeoutKt.withTimeout(j2, new BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$2$1(billingPurchaseDelegateImpl, null), billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$12);
                j = billingPurchaseDelegateImpl;
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7271constructorimpl = Result.m7271constructorimpl((MessagesSourceMessage.NeuronesChanged) obj2);
                BillingPurchaseDelegateImpl billingPurchaseDelegateImpl32 = j;
                BillingPurchaseDelegateImpl billingPurchaseDelegateImpl42 = billingPurchaseDelegateImpl32;
                if (Result.m7274exceptionOrNullimpl(m7271constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            }
        }
        billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1 = new BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1(this, continuation);
        BillingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1 billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$122 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$1;
        Object obj22 = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$awaitUpdateBalanceIfNeed$122.label;
        if (i != 0) {
        }
        if (((UserBalance) obj).getNeurons() <= 0) {
        }
    }

    static /* synthetic */ Object awaitUpdateBalanceIfNeed$default(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        return billingPurchaseDelegateImpl.awaitUpdateBalanceIfNeed(j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackInAppPurchaseError(PurchaseReason purchaseReason, Throwable th, Continuation<? super Unit> continuation) {
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this, new PurchaseEvent(BillingInAppPurchaseEvents.InAppPurchaseProductFailure.INSTANCE.getEvent(), LoggerLevel.ERROR, MapsKt.mapOf(TuplesKt.to(PURCHASE_REASON_KEY, purchaseReason.toString()), TuplesKt.to("error-message", th.toString()), TuplesKt.to(ERROR_STACK_TRACE_KEY, ExceptionsKt.stackTraceToString(th))), TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object trackEvent$default(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, BillingInAppPurchaseEvents billingInAppPurchaseEvents, LoggerLevel loggerLevel, Map map, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            loggerLevel = LoggerLevel.DEBUG;
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return billingPurchaseDelegateImpl.trackEvent(billingInAppPurchaseEvents, loggerLevel, map, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackEvent(BillingInAppPurchaseEvents billingInAppPurchaseEvents, LoggerLevel loggerLevel, Map<String, String> map, Continuation<? super Unit> continuation) {
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this, new PurchaseEvent(billingInAppPurchaseEvents.getEvent(), loggerLevel, map, TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:33:0x00b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b4 -> B:32:0x00b5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackPurchaseProduct(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$trackPurchaseProduct$1 billingPurchaseDelegateImpl$trackPurchaseProduct$1;
        int i;
        List<? extends Purchase> list2;
        Iterator it;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        Purchase purchase;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl2;
        Object obj;
        Iterable iterable;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl3;
        BillingProduct billingProduct;
        List<? extends Purchase> list3;
        if (continuation instanceof BillingPurchaseDelegateImpl$trackPurchaseProduct$1) {
            billingPurchaseDelegateImpl$trackPurchaseProduct$1 = (BillingPurchaseDelegateImpl$trackPurchaseProduct$1) continuation;
            if ((billingPurchaseDelegateImpl$trackPurchaseProduct$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$trackPurchaseProduct$1.label -= Integer.MIN_VALUE;
                Object obj2 = billingPurchaseDelegateImpl$trackPurchaseProduct$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$trackPurchaseProduct$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    list2 = list;
                    it = list2.iterator();
                    billingPurchaseDelegateImpl = this;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    purchase = (Purchase) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$3;
                    ResultKt.throwOnFailure(obj2);
                    billingPurchaseDelegateImpl2 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$0;
                    obj = obj2;
                    it = (Iterator) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$2;
                    iterable = (Iterable) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$1;
                    billingPurchaseDelegateImpl3 = billingPurchaseDelegateImpl2;
                    billingProduct = (BillingProduct) obj;
                    list3 = iterable;
                    if (billingProduct != null) {
                    }
                    list2 = list3;
                    billingPurchaseDelegateImpl = billingPurchaseDelegateImpl3;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 2) {
                    Iterator it2 = (Iterator) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$2;
                    iterable = (Iterable) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$1;
                    billingPurchaseDelegateImpl3 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    it = it2;
                    list3 = iterable;
                    list2 = list3;
                    billingPurchaseDelegateImpl = billingPurchaseDelegateImpl3;
                    while (it.hasNext()) {
                        Purchase purchase2 = (Purchase) it.next();
                        List<String> products = purchase2.getProducts();
                        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                        String str = (String) CollectionsKt.firstOrNull((List<? extends Object>) products);
                        if (str != null) {
                            BillingInteractor billingInteractor = billingPurchaseDelegateImpl.billingInteractor;
                            billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$0 = billingPurchaseDelegateImpl;
                            billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$1 = list2;
                            billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$2 = it;
                            billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$3 = purchase2;
                            billingPurchaseDelegateImpl$trackPurchaseProduct$1.label = 1;
                            obj = billingInteractor.getProduct(str, billingPurchaseDelegateImpl$trackPurchaseProduct$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingPurchaseDelegateImpl2 = billingPurchaseDelegateImpl;
                            iterable = list2;
                            purchase = purchase2;
                            billingPurchaseDelegateImpl3 = billingPurchaseDelegateImpl2;
                            billingProduct = (BillingProduct) obj;
                            list3 = iterable;
                            if (billingProduct != null) {
                                BillingPurchase billingPurchase = new BillingPurchase(purchase, billingProduct);
                                billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$0 = billingPurchaseDelegateImpl3;
                                billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$1 = iterable;
                                billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$2 = it;
                                billingPurchaseDelegateImpl$trackPurchaseProduct$1.L$3 = null;
                                billingPurchaseDelegateImpl$trackPurchaseProduct$1.label = 2;
                                if (billingPurchaseDelegateImpl3.trackPurchaseProductEvent(billingPurchase, billingPurchaseDelegateImpl$trackPurchaseProduct$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = it;
                                it = it2;
                                list3 = iterable;
                            }
                            list2 = list3;
                            billingPurchaseDelegateImpl = billingPurchaseDelegateImpl3;
                            while (it.hasNext()) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        billingPurchaseDelegateImpl$trackPurchaseProduct$1 = new BillingPurchaseDelegateImpl$trackPurchaseProduct$1(this, continuation);
        Object obj22 = billingPurchaseDelegateImpl$trackPurchaseProduct$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$trackPurchaseProduct$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object restoreBillingPurchases(Continuation<? super RestorePurchasesResult> continuation) {
        BillingPurchaseDelegateImpl$restoreBillingPurchases$1 billingPurchaseDelegateImpl$restoreBillingPurchases$1;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        List<? extends Purchase> list;
        if (continuation instanceof BillingPurchaseDelegateImpl$restoreBillingPurchases$1) {
            billingPurchaseDelegateImpl$restoreBillingPurchases$1 = (BillingPurchaseDelegateImpl$restoreBillingPurchases$1) continuation;
            if ((billingPurchaseDelegateImpl$restoreBillingPurchases$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$restoreBillingPurchases$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$restoreBillingPurchases$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$restoreBillingPurchases$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BillingInteractor billingInteractor = this.billingInteractor;
                    billingPurchaseDelegateImpl$restoreBillingPurchases$1.L$0 = this;
                    billingPurchaseDelegateImpl$restoreBillingPurchases$1.label = 1;
                    obj = billingInteractor.restorePurchases(billingPurchaseDelegateImpl$restoreBillingPurchases$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return RestorePurchasesResult.Successful.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$restoreBillingPurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return RestorePurchasesResult.NoPurchases.INSTANCE;
                }
                billingPurchaseDelegateImpl$restoreBillingPurchases$1.L$0 = null;
                billingPurchaseDelegateImpl$restoreBillingPurchases$1.label = 2;
                if (billingPurchaseDelegateImpl.trackPurchaseProduct(list, billingPurchaseDelegateImpl$restoreBillingPurchases$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return RestorePurchasesResult.Successful.INSTANCE;
            }
        }
        billingPurchaseDelegateImpl$restoreBillingPurchases$1 = new BillingPurchaseDelegateImpl$restoreBillingPurchases$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$restoreBillingPurchases$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$restoreBillingPurchases$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (r14 == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackPurchaseProductEvent(BillingPurchase billingPurchase, Continuation<? super Unit> continuation) {
        BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1 billingPurchaseDelegateImpl$trackPurchaseProductEvent$1;
        Object coroutine_suspended;
        int i;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl;
        UserProfileRepository userProfileRepository;
        int i2;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl2;
        BillingPurchase billingPurchase2;
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl3;
        int i3;
        boolean z;
        Long registrationDate;
        BillingProduct billingProduct;
        BillingPurchaseProductAnalytics billingPurchaseProductAnalytics;
        PurchaseSource purchaseSource;
        if (continuation instanceof BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1) {
            billingPurchaseDelegateImpl$trackPurchaseProductEvent$1 = (BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1) continuation;
            if ((billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label & Integer.MIN_VALUE) != 0) {
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label -= Integer.MIN_VALUE;
                Object obj = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserProfileRepository userProfileRepository2 = this.userProfileRepository;
                    billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = this;
                    billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = billingPurchase;
                    billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 1;
                    obj = userProfileRepository2.getPurchaseCount(billingPurchaseDelegateImpl$trackPurchaseProductEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingPurchaseDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        int i5 = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0;
                        billingPurchase2 = (BillingPurchase) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1;
                        billingPurchaseDelegateImpl2 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i5;
                        User currentUser = billingPurchaseDelegateImpl2.userRepository.getCurrentUser();
                        billingPurchaseDelegateImpl2.billingPurchaseProductAnalytics.trackPurchaseProductEvent(billingPurchase2, i2, billingPurchaseDelegateImpl2.purchaseSource, billingPurchaseDelegateImpl2.isCustomer, currentUser == null ? currentUser.getGender() : null);
                        if (billingPurchaseDelegateImpl2.isCustomer) {
                            if (currentUser != null && (registrationDate = currentUser.getRegistrationDate()) != null) {
                                long longValue = registrationDate.longValue();
                                Duration.Companion companion = Duration.Companion;
                                if (Duration.m8639compareToLRDsOJo(DurationKt.toDuration(System.currentTimeMillis() - longValue, DurationUnit.MILLISECONDS), LOG_REGISTRATION_EVENT__THRESHOLD) < 0) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        i4 = 0;
                        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = billingPurchaseDelegateImpl2;
                        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = billingPurchase2;
                        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0 = i4;
                        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 3;
                        if (billingPurchaseDelegateImpl2.userProfileRepository.incPurchaseTotal((float) billingPurchase2.getProduct().backendPrice(), billingPurchaseDelegateImpl$trackPurchaseProductEvent$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingPurchaseDelegateImpl3 = billingPurchaseDelegateImpl2;
                        i3 = i4;
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    } else if (i != 3) {
                        if (i == 4) {
                            purchaseSource = (PurchaseSource) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$2;
                            billingProduct = (BillingProduct) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1;
                            billingPurchaseProductAnalytics = (BillingPurchaseProductAnalytics) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            billingPurchaseProductAnalytics.trackRegistrationPurchase(billingProduct, purchaseSource, ((Number) obj).floatValue());
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i3 = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0;
                        billingPurchase2 = (BillingPurchase) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1;
                        billingPurchaseDelegateImpl3 = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (i3 != 0) {
                            BillingPurchaseProductAnalytics billingPurchaseProductAnalytics2 = billingPurchaseDelegateImpl3.billingPurchaseProductAnalytics;
                            BillingProduct product = billingPurchase2.getProduct();
                            PurchaseSource purchaseSource2 = billingPurchaseDelegateImpl3.purchaseSource;
                            UserProfileRepository userProfileRepository3 = billingPurchaseDelegateImpl3.userProfileRepository;
                            billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = billingPurchaseProductAnalytics2;
                            billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = product;
                            billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$2 = purchaseSource2;
                            billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 4;
                            Object purchaseTotal = userProfileRepository3.getPurchaseTotal(billingPurchaseDelegateImpl$trackPurchaseProductEvent$1);
                            if (purchaseTotal == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingProduct = product;
                            obj = purchaseTotal;
                            billingPurchaseProductAnalytics = billingPurchaseProductAnalytics2;
                            purchaseSource = purchaseSource2;
                            billingPurchaseProductAnalytics.trackRegistrationPurchase(billingProduct, purchaseSource, ((Number) obj).floatValue());
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    billingPurchase = (BillingPurchase) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1;
                    billingPurchaseDelegateImpl = (BillingPurchaseDelegateImpl) billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                int intValue = ((Number) obj).intValue();
                userProfileRepository = billingPurchaseDelegateImpl.userProfileRepository;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = billingPurchaseDelegateImpl;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = billingPurchase;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0 = intValue;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 2;
                if (userProfileRepository.purchaseCountInc(billingPurchaseDelegateImpl$trackPurchaseProductEvent$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = intValue;
                billingPurchaseDelegateImpl2 = billingPurchaseDelegateImpl;
                billingPurchase2 = billingPurchase;
                User currentUser2 = billingPurchaseDelegateImpl2.userRepository.getCurrentUser();
                billingPurchaseDelegateImpl2.billingPurchaseProductAnalytics.trackPurchaseProductEvent(billingPurchase2, i2, billingPurchaseDelegateImpl2.purchaseSource, billingPurchaseDelegateImpl2.isCustomer, currentUser2 == null ? currentUser2.getGender() : null);
                if (billingPurchaseDelegateImpl2.isCustomer) {
                }
                i4 = 0;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = billingPurchaseDelegateImpl2;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = billingPurchase2;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0 = i4;
                billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 3;
                if (billingPurchaseDelegateImpl2.userProfileRepository.incPurchaseTotal((float) billingPurchase2.getProduct().backendPrice(), billingPurchaseDelegateImpl$trackPurchaseProductEvent$1) != coroutine_suspended) {
                }
            }
        }
        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1 = new BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1(this, continuation);
        Object obj2 = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        userProfileRepository = billingPurchaseDelegateImpl.userProfileRepository;
        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$0 = billingPurchaseDelegateImpl;
        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.L$1 = billingPurchase;
        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.I$0 = intValue2;
        billingPurchaseDelegateImpl$trackPurchaseProductEvent$1.label = 2;
        if (userProfileRepository.purchaseCountInc(billingPurchaseDelegateImpl$trackPurchaseProductEvent$1) != coroutine_suspended) {
        }
    }
}
