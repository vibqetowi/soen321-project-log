package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.compose.ui.graphics.Color;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.domain.logic.purchase.PurchaseType;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.AppUiParamsKt;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers.ChatBuySubscriptionOfferUiMapper;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0006\u008e\u0001\u008f\u0001\u0090\u0001B\u008c\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0015\u0010\u0011\u001a\u0011\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012j\u0002`\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&J\u0011\u0010<\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000202H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\b\u0001\u0010E\u001a\u00020FH\u0096\u0001J\u0013\u0010G\u001a\u00020H2\b\b\u0001\u0010I\u001a\u00020FH\u0096\u0001J\u0013\u0010J\u001a\u00020F2\b\b\u0001\u0010K\u001a\u00020FH\u0097\u0001J\u0015\u0010L\u001a\u0004\u0018\u00010M2\b\b\u0001\u0010E\u001a\u00020FH\u0096\u0001J\u0013\u0010N\u001a\u00020F2\b\b\u0001\u0010E\u001a\u00020FH\u0096\u0001J\u0019\u0010O\u001a\b\u0012\u0004\u0012\u00020F0P2\b\b\u0001\u0010E\u001a\u00020FH\u0096\u0001J\u001b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010A\u001a\u000202H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010BJ\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020R0PH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010>J\u001b\u0010T\u001a\u0002022\b\b\u0001\u0010U\u001a\u00020F2\u0006\u0010V\u001a\u00020FH\u0096\u0001J4\u0010T\u001a\u0002022\b\b\u0001\u0010U\u001a\u00020F2\u0006\u0010V\u001a\u00020F2\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020Y0X\"\u00020YH\u0096\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u0002022\b\b\u0001\u0010U\u001a\u00020FH\u0096\u0001J,\u0010[\u001a\u0002022\b\b\u0001\u0010U\u001a\u00020F2\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020Y0X\"\u00020YH\u0096\u0001¢\u0006\u0002\u0010\\J\u0019\u0010]\u001a\b\u0012\u0004\u0012\u0002020P2\b\b\u0001\u0010U\u001a\u00020FH\u0096\u0001J\b\u0010^\u001a\u00020=H\u0002J\b\u0010_\u001a\u00020=H\u0002J\u001a\u0010`\u001a\u00020=2\u0006\u0010a\u001a\u000202H\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010bJ\u0012\u0010c\u001a\u00020=H\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020=H\u0002J\b\u0010f\u001a\u00020=H\u0014J\u0006\u0010g\u001a\u00020=J\u000e\u0010h\u001a\u00020=2\u0006\u0010A\u001a\u000202J\u001c\u0010i\u001a\u00020=2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020=0kø\u0001\u0000¢\u0006\u0002\u0010lJ\u0006\u0010m\u001a\u00020=J\u0006\u0010n\u001a\u00020=J\u0006\u0010o\u001a\u00020=J\u0011\u0010p\u001a\u00020qH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010>J\u0010\u0010r\u001a\u00020=2\u0006\u0010s\u001a\u00020tH\u0002J=\u0010u\u001a\u00020=2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020w0P2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020R0P2\u0006\u0010y\u001a\u00020zH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b{\u0010|J4\u0010}\u001a\u00020=*\u00020~2%\u0010\u007f\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\b\u0081\u0001\u0012\n\b\u0082\u0001\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u00020\u00060\u0080\u0001H\u0097\u0001JL\u0010\u0084\u0001\u001a\u00030\u0085\u0001*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0007\u0010\u0086\u0001\u001a\u00020~2&\u0010\u0087\u0001\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\b\u0081\u0001\u0012\n\b\u0082\u0001\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u00020\u00060\u0080\u0001H\u0096\u0001JJ\u0010\u0088\u0001\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052%\u0010\u007f\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\b\u0081\u0001\u0012\n\b\u0082\u0001\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u00020\u00060\u0080\u0001H\u0097Aø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J,\u0010\u008a\u0001\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0007\u0010\u008b\u0001\u001a\u00020\u0007H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u008c\u0001JJ\u0010\u008d\u0001\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052%\u0010\u0087\u0001\u001a \u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b\u0081\u0001\u0012\t\b\u0082\u0001\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00060\u0080\u0001H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u0011\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u000202X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010+R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00100R\"\u00109\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "chatHeaderDelegate", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "chatPanelActionsInteractor", "Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "billingPurchaseDelegate", "resourceProvider", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "subscriptionOfferUiMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/mappers/ChatBuySubscriptionOfferUiMapper;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "refreshConfigurationUseCase", "Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "chatAnalyticsInteractor", "Lcom/ifriend/presentation/analytics/ChatAnalyticsInteractor;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/mappers/ChatBuySubscriptionOfferUiMapper;Lcom/ifriend/platform/tools/api/AppInfoProvider;Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/presentation/analytics/ChatAnalyticsInteractor;)V", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", "chatHeaderState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "getChatHeaderState", "()Lkotlinx/coroutines/flow/StateFlow;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "singleEvents", "getSingleEvents", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "buyProductSuccessful", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "handleBuyProductFailure", "handleBuyProductSuccessful", "initChatHeader", "chatId", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "initPurchasesProductUpdates", "(Landroidx/lifecycle/ViewModel;)V", "loadData", "onCleared", "onContinueClick", "onItemClick", "onLaunchBillingFlow", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "onPrivacyClick", "onRestoreClick", "onTermsClick", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "updateActionLabel", "item", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "updateProducts", "badges", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadges;", "offers", "shadowColor", "Landroidx/compose/ui/graphics/Color;", "updateProducts-9LQNqLg", "(Ljava/util/List;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel extends ViewModel implements ResourceProvider, BillingPurchaseDelegate, ChatHeaderDelegate, UiStateDelegate<UiState, Event> {
    private static final int PRODUCTS_COUNT = 3;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_3;
    private final AnalyticsInteractor analyticsInteractor;
    private final AppEventsEmitter appEventsEmitter;
    private final AppInfoProvider appInfoProvider;
    private final BillingPurchaseDelegate billingPurchaseDelegate;
    private final ChatAnalyticsInteractor chatAnalyticsInteractor;
    private final ChatHeaderDelegate chatHeaderDelegate;
    private final ChatPanelActionsInteractor chatPanelActionsInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final BuyChatSubscriptionBillingUiParams params;
    private final PaymentResultEmitter paymentResultEmitter;
    private final ChatsRefreshConfigurationUseCase refreshConfigurationUseCase;
    private final ResourceProvider resourceProvider;
    private final ChatBuySubscriptionOfferUiMapper subscriptionOfferUiMapper;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_3.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_3.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getBillingFlowParams(String str, Continuation<? super BillingFlowParams> continuation) {
        return this.billingPurchaseDelegate.getBillingFlowParams(str, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Flow<ProductPurchaseEvent> getBillingPurchaseFlow() {
        return this.billingPurchaseDelegate.getBillingPurchaseFlow();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public StateFlow<ChatHeaderUiState> getChatHeaderState() {
        return this.chatHeaderDelegate.getChatHeaderState();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getPurchaseProduct(String str, Continuation<? super BillingProduct> continuation) {
        return this.billingPurchaseDelegate.getPurchaseProduct(str, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object getPurchaseProducts(Continuation<? super List<BillingProduct>> continuation) {
        return this.billingPurchaseDelegate.getPurchaseProducts(continuation);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_3.getSingleEvents();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_3.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_3.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public void initChatHeader(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatHeaderDelegate.initChatHeader(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public void initPurchasesProductUpdates(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.billingPurchaseDelegate.initPurchasesProductUpdates(context_receiver_0);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object restoreBillingPurchases(Continuation<? super RestorePurchasesResult> continuation) {
        return this.billingPurchaseDelegate.restoreBillingPurchases(continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public ChatBuySubscriptionViewModel(BuyChatSubscriptionBillingUiParams params, ChatHeaderDelegate chatHeaderDelegate, ChatsConfigurationInteractor chatsConfigurationInteractor, ChatPanelActionsInteractor chatPanelActionsInteractor, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> exceptionsEmitter, BillingPurchaseDelegate billingPurchaseDelegate, ResourceProvider resourceProvider, AnalyticsInteractor analyticsInteractor, ChatBuySubscriptionOfferUiMapper subscriptionOfferUiMapper, AppInfoProvider appInfoProvider, ChatsRefreshConfigurationUseCase refreshConfigurationUseCase, ChatsInfoInteractor chatsInfoInteractor, PaymentResultEmitter paymentResultEmitter, ChatAnalyticsInteractor chatAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(chatHeaderDelegate, "chatHeaderDelegate");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(chatPanelActionsInteractor, "chatPanelActionsInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionOfferUiMapper, "subscriptionOfferUiMapper");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(refreshConfigurationUseCase, "refreshConfigurationUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(chatAnalyticsInteractor, "chatAnalyticsInteractor");
        this.params = params;
        this.chatHeaderDelegate = chatHeaderDelegate;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.chatPanelActionsInteractor = chatPanelActionsInteractor;
        this.appEventsEmitter = appEventsEmitter;
        this.exceptionsEmitter = exceptionsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.resourceProvider = resourceProvider;
        this.analyticsInteractor = analyticsInteractor;
        this.subscriptionOfferUiMapper = subscriptionOfferUiMapper;
        this.appInfoProvider = appInfoProvider;
        this.refreshConfigurationUseCase = refreshConfigurationUseCase;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.paymentResultEmitter = paymentResultEmitter;
        this.chatAnalyticsInteractor = chatAnalyticsInteractor;
        this.$$delegate_3 = new UiStateDelegateImpl<>(new UiState(false, false, 0L, 0L, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null), 0, null, 6, null);
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = this;
        initChatHeader(chatBuySubscriptionViewModel, params.getChatId());
        initPurchasesProductUpdates(chatBuySubscriptionViewModel);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatBuySubscriptionViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt.launch(ViewModelKt.getViewModelScope(chatBuySubscriptionViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatBuySubscriptionViewModel$special$$inlined$collectIn$default$1(getBillingPurchaseFlow(), null, this));
        loadData();
    }

    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Companion;", "", "()V", "PRODUCTS_COUNT", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bx\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0019\u0010$\u001a\u00020\u0006HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0017J\u0019\u0010&\u001a\u00020\u0006HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\nHÖ\u0001R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "", "isLoading", "", "isPurchased", "gradientColor", "Landroidx/compose/ui/graphics/Color;", "gradientDarkerColor", "interestsLabels", "", "", "chatName", "screenTitleLabel", "screenDescriptionLabel", "actionLabel", "offers", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "(ZZJJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionLabel", "()Ljava/lang/String;", "getChatName", "getGradientColor-0d7_KjU", "()J", "J", "getGradientDarkerColor-0d7_KjU", "getInterestsLabels", "()Ljava/util/List;", "()Z", "getOffers", "()Lkotlinx/collections/immutable/ImmutableList;", "getScreenDescriptionLabel", "getScreenTitleLabel", "component1", "component10", "component2", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component6", "component7", "component8", "component9", "copy", "copy-pAZo6Ak", "(ZZJJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final String actionLabel;
        private final String chatName;
        private final long gradientColor;
        private final long gradientDarkerColor;
        private final List<String> interestsLabels;
        private final boolean isLoading;
        private final boolean isPurchased;
        private final ImmutableList<ChatSubscriptionOfferUi> offers;
        private final String screenDescriptionLabel;
        private final String screenTitleLabel;

        public /* synthetic */ UiState(boolean z, boolean z2, long j, long j2, List list, String str, String str2, String str3, String str4, ImmutableList immutableList, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, j, j2, list, str, str2, str3, str4, immutableList);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final ImmutableList<ChatSubscriptionOfferUi> component10() {
            return this.offers;
        }

        public final boolean component2() {
            return this.isPurchased;
        }

        /* renamed from: component3-0d7_KjU  reason: not valid java name */
        public final long m6981component30d7_KjU() {
            return this.gradientColor;
        }

        /* renamed from: component4-0d7_KjU  reason: not valid java name */
        public final long m6982component40d7_KjU() {
            return this.gradientDarkerColor;
        }

        public final List<String> component5() {
            return this.interestsLabels;
        }

        public final String component6() {
            return this.chatName;
        }

        public final String component7() {
            return this.screenTitleLabel;
        }

        public final String component8() {
            return this.screenDescriptionLabel;
        }

        public final String component9() {
            return this.actionLabel;
        }

        /* renamed from: copy-pAZo6Ak  reason: not valid java name */
        public final UiState m6983copypAZo6Ak(boolean z, boolean z2, long j, long j2, List<String> interestsLabels, String chatName, String screenTitleLabel, String screenDescriptionLabel, String actionLabel, ImmutableList<ChatSubscriptionOfferUi> offers) {
            Intrinsics.checkNotNullParameter(interestsLabels, "interestsLabels");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitleLabel, "screenTitleLabel");
            Intrinsics.checkNotNullParameter(screenDescriptionLabel, "screenDescriptionLabel");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            Intrinsics.checkNotNullParameter(offers, "offers");
            return new UiState(z, z2, j, j2, interestsLabels, chatName, screenTitleLabel, screenDescriptionLabel, actionLabel, offers, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && this.isPurchased == uiState.isPurchased && Color.m3292equalsimpl0(this.gradientColor, uiState.gradientColor) && Color.m3292equalsimpl0(this.gradientDarkerColor, uiState.gradientDarkerColor) && Intrinsics.areEqual(this.interestsLabels, uiState.interestsLabels) && Intrinsics.areEqual(this.chatName, uiState.chatName) && Intrinsics.areEqual(this.screenTitleLabel, uiState.screenTitleLabel) && Intrinsics.areEqual(this.screenDescriptionLabel, uiState.screenDescriptionLabel) && Intrinsics.areEqual(this.actionLabel, uiState.actionLabel) && Intrinsics.areEqual(this.offers, uiState.offers);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.isPurchased;
            return ((((((((((((((((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Color.m3298hashCodeimpl(this.gradientColor)) * 31) + Color.m3298hashCodeimpl(this.gradientDarkerColor)) * 31) + this.interestsLabels.hashCode()) * 31) + this.chatName.hashCode()) * 31) + this.screenTitleLabel.hashCode()) * 31) + this.screenDescriptionLabel.hashCode()) * 31) + this.actionLabel.hashCode()) * 31) + this.offers.hashCode();
        }

        public String toString() {
            boolean z = this.isLoading;
            boolean z2 = this.isPurchased;
            String m3299toStringimpl = Color.m3299toStringimpl(this.gradientColor);
            String m3299toStringimpl2 = Color.m3299toStringimpl(this.gradientDarkerColor);
            List<String> list = this.interestsLabels;
            String str = this.chatName;
            String str2 = this.screenTitleLabel;
            String str3 = this.screenDescriptionLabel;
            String str4 = this.actionLabel;
            ImmutableList<ChatSubscriptionOfferUi> immutableList = this.offers;
            return "UiState(isLoading=" + z + ", isPurchased=" + z2 + ", gradientColor=" + m3299toStringimpl + ", gradientDarkerColor=" + m3299toStringimpl2 + ", interestsLabels=" + list + ", chatName=" + str + ", screenTitleLabel=" + str2 + ", screenDescriptionLabel=" + str3 + ", actionLabel=" + str4 + ", offers=" + immutableList + ")";
        }

        private UiState(boolean z, boolean z2, long j, long j2, List<String> interestsLabels, String chatName, String screenTitleLabel, String screenDescriptionLabel, String actionLabel, ImmutableList<ChatSubscriptionOfferUi> offers) {
            Intrinsics.checkNotNullParameter(interestsLabels, "interestsLabels");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitleLabel, "screenTitleLabel");
            Intrinsics.checkNotNullParameter(screenDescriptionLabel, "screenDescriptionLabel");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            Intrinsics.checkNotNullParameter(offers, "offers");
            this.isLoading = z;
            this.isPurchased = z2;
            this.gradientColor = j;
            this.gradientDarkerColor = j2;
            this.interestsLabels = interestsLabels;
            this.chatName = chatName;
            this.screenTitleLabel = screenTitleLabel;
            this.screenDescriptionLabel = screenDescriptionLabel;
            this.actionLabel = actionLabel;
            this.offers = offers;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isPurchased() {
            return this.isPurchased;
        }

        public /* synthetic */ UiState(boolean z, boolean z2, long j, long j2, List list, String str, String str2, String str3, String str4, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j, (i & 8) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? ExtensionsKt.persistentListOf() : immutableList, null);
        }

        /* renamed from: getGradientColor-0d7_KjU  reason: not valid java name */
        public final long m6984getGradientColor0d7_KjU() {
            return this.gradientColor;
        }

        /* renamed from: getGradientDarkerColor-0d7_KjU  reason: not valid java name */
        public final long m6985getGradientDarkerColor0d7_KjU() {
            return this.gradientDarkerColor;
        }

        public final List<String> getInterestsLabels() {
            return this.interestsLabels;
        }

        public final String getChatName() {
            return this.chatName;
        }

        public final String getScreenTitleLabel() {
            return this.screenTitleLabel;
        }

        public final String getScreenDescriptionLabel() {
            return this.screenDescriptionLabel;
        }

        public final String getActionLabel() {
            return this.actionLabel;
        }

        public final ImmutableList<ChatSubscriptionOfferUi> getOffers() {
            return this.offers;
        }
    }

    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event;", "", "CloseFeature", "LaunchBillingFlow", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event$LaunchBillingFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ChatBuySubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class CloseFeature implements Event {
            public static final int $stable = 0;
            public static final CloseFeature INSTANCE = new CloseFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof CloseFeature) {
                    CloseFeature closeFeature = (CloseFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1821713512;
            }

            public String toString() {
                return "CloseFeature";
            }

            private CloseFeature() {
            }
        }

        /* compiled from: ChatBuySubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event$LaunchBillingFlow;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "(Lcom/android/billingclient/api/BillingFlowParams;)V", "getParams", "()Lcom/android/billingclient/api/BillingFlowParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class LaunchBillingFlow implements Event {
            public static final int $stable = 8;
            private final BillingFlowParams params;

            public static /* synthetic */ LaunchBillingFlow copy$default(LaunchBillingFlow launchBillingFlow, BillingFlowParams billingFlowParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    billingFlowParams = launchBillingFlow.params;
                }
                return launchBillingFlow.copy(billingFlowParams);
            }

            public final BillingFlowParams component1() {
                return this.params;
            }

            public final LaunchBillingFlow copy(BillingFlowParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new LaunchBillingFlow(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchBillingFlow) && Intrinsics.areEqual(this.params, ((LaunchBillingFlow) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BillingFlowParams billingFlowParams = this.params;
                return "LaunchBillingFlow(params=" + billingFlowParams + ")";
            }

            public LaunchBillingFlow(BillingFlowParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BillingFlowParams getParams() {
                return this.params;
            }
        }
    }

    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$1", f = "ChatBuySubscriptionViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatBuySubscriptionViewModel.this.chatPanelActionsInteractor.getChatTopicFlow(ChatBuySubscriptionViewModel.this.params.getChatId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt.launch(ViewModelKt.getViewModelScope(ChatBuySubscriptionViewModel.this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatBuySubscriptionViewModel$1$invokeSuspend$$inlined$collectIn$default$1((Flow) obj, null, ChatBuySubscriptionViewModel.this));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductFailure() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatBuySubscriptionViewModel$handleBuyProductFailure$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductSuccessful() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1(this, null), null, new ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2(this, null), 2, null).invokeOnCompletion(new ChatBuySubscriptionViewModel$handleBuyProductSuccessful$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyProductSuccessful(Continuation<? super Unit> continuation) {
        ChatBuySubscriptionViewModel$buyProductSuccessful$1 chatBuySubscriptionViewModel$buyProductSuccessful$1;
        Object coroutine_suspended;
        int i;
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel;
        if (continuation instanceof ChatBuySubscriptionViewModel$buyProductSuccessful$1) {
            chatBuySubscriptionViewModel$buyProductSuccessful$1 = (ChatBuySubscriptionViewModel$buyProductSuccessful$1) continuation;
            if ((chatBuySubscriptionViewModel$buyProductSuccessful$1.label & Integer.MIN_VALUE) != 0) {
                chatBuySubscriptionViewModel$buyProductSuccessful$1.label -= Integer.MIN_VALUE;
                Object obj = chatBuySubscriptionViewModel$buyProductSuccessful$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatBuySubscriptionViewModel$buyProductSuccessful$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.appEventsEmitter.emit(new AppEvents.Billing.PurchaseCompleted(PurchaseType.SUBSCRIPTION));
                    this.appEventsEmitter.emit(new AppEvents.ShowInAppNotification(getString(R.string.buy_subscriotion__subscription_activate)));
                    chatBuySubscriptionViewModel$buyProductSuccessful$1.L$0 = this;
                    chatBuySubscriptionViewModel$buyProductSuccessful$1.label = 1;
                    if (updateUiState(this, ChatBuySubscriptionViewModel$buyProductSuccessful$2.INSTANCE, chatBuySubscriptionViewModel$buyProductSuccessful$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatBuySubscriptionViewModel = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatBuySubscriptionViewModel = (ChatBuySubscriptionViewModel) chatBuySubscriptionViewModel$buyProductSuccessful$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatBuySubscriptionViewModel$buyProductSuccessful$1.L$0 = null;
                chatBuySubscriptionViewModel$buyProductSuccessful$1.label = 2;
                if (chatBuySubscriptionViewModel.sendEvent2((UiStateDelegate<UiState, Event>) chatBuySubscriptionViewModel, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) chatBuySubscriptionViewModel$buyProductSuccessful$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatBuySubscriptionViewModel$buyProductSuccessful$1 = new ChatBuySubscriptionViewModel$buyProductSuccessful$1(this, continuation);
        Object obj2 = chatBuySubscriptionViewModel$buyProductSuccessful$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatBuySubscriptionViewModel$buyProductSuccessful$1.label;
        if (i != 0) {
        }
        chatBuySubscriptionViewModel$buyProductSuccessful$1.L$0 = null;
        chatBuySubscriptionViewModel$buyProductSuccessful$1.label = 2;
        if (chatBuySubscriptionViewModel.sendEvent2((UiStateDelegate<UiState, Event>) chatBuySubscriptionViewModel, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) chatBuySubscriptionViewModel$buyProductSuccessful$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final void loadData() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatBuySubscriptionViewModel$loadData$1(this, null), null, new ChatBuySubscriptionViewModel$loadData$2(this, null), 2, null).invokeOnCompletion(new ChatBuySubscriptionViewModel$loadData$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: updateProducts-9LQNqLg  reason: not valid java name */
    public final Object m6979updateProducts9LQNqLg(List<ChatConfig.SubscriptionBadges> list, List<BillingProduct> list2, long j, Continuation<? super Unit> continuation) {
        ChatSubscriptionOfferUi chatSubscriptionOfferUi;
        ChatSubscriptionOfferUi chatSubscriptionOfferUi2;
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        ChatSubscriptionOfferUi[] chatSubscriptionOfferUiArr = new ChatSubscriptionOfferUi[3];
        BillingProduct billingProduct = (BillingProduct) CollectionsKt.getOrNull(list2, 0);
        ChatSubscriptionOfferUi chatSubscriptionOfferUi3 = null;
        if (billingProduct != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (billingProduct.getSubscriptionMonths() == ((ChatConfig.SubscriptionBadges) obj2).getSubscriptionMonths()) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            chatSubscriptionOfferUi = ChatBuySubscriptionOfferUiMapper.m6968map9LQNqLg$default(this.subscriptionOfferUiMapper, billingProduct, false, j, (ChatConfig.SubscriptionBadges) obj2, 2, null);
        } else {
            chatSubscriptionOfferUi = null;
        }
        chatSubscriptionOfferUiArr[0] = chatSubscriptionOfferUi;
        BillingProduct billingProduct2 = (BillingProduct) CollectionsKt.getOrNull(list2, 2);
        if (billingProduct2 != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (billingProduct2.getSubscriptionMonths() == ((ChatConfig.SubscriptionBadges) obj).getSubscriptionMonths()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            chatSubscriptionOfferUi2 = this.subscriptionOfferUiMapper.m6969map9LQNqLg(billingProduct2, true, j, (ChatConfig.SubscriptionBadges) obj);
            updateActionLabel(chatSubscriptionOfferUi2);
        } else {
            chatSubscriptionOfferUi2 = null;
        }
        chatSubscriptionOfferUiArr[1] = chatSubscriptionOfferUi2;
        BillingProduct billingProduct3 = (BillingProduct) CollectionsKt.getOrNull(list2, 1);
        if (billingProduct3 != null) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (billingProduct3.getSubscriptionMonths() == ((ChatConfig.SubscriptionBadges) next).getSubscriptionMonths()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    chatSubscriptionOfferUi3 = next;
                    break;
                }
            }
            chatSubscriptionOfferUi3 = ChatBuySubscriptionOfferUiMapper.m6968map9LQNqLg$default(this.subscriptionOfferUiMapper, billingProduct3, false, j, (ChatConfig.SubscriptionBadges) chatSubscriptionOfferUi3, 2, null);
        }
        chatSubscriptionOfferUiArr[2] = chatSubscriptionOfferUi3;
        Object updateUiState = updateUiState(this, new ChatBuySubscriptionViewModel$updateProducts$2(CollectionsKt.listOfNotNull((Object[]) chatSubscriptionOfferUiArr)), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActionLabel(ChatSubscriptionOfferUi chatSubscriptionOfferUi) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatBuySubscriptionViewModel$updateActionLabel$1(this, chatSubscriptionOfferUi, null), 3, null);
    }

    public final void onContinueClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatBuySubscriptionViewModel$onContinueClick$1(this, null), null, new ChatBuySubscriptionViewModel$onContinueClick$2(this, null), 2, null);
    }

    public final void onPrivacyClick() {
        this.appEventsEmitter.emit(AppEvents.PurchaseInfo.ShowPrivacyPolicy.INSTANCE);
    }

    public final void onTermsClick() {
        this.appEventsEmitter.emit(AppEvents.PurchaseInfo.ShowTermsOfConditions.INSTANCE);
    }

    public final void onRestoreClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatBuySubscriptionViewModel$onRestoreClick$1(this.exceptionsEmitter), null, new ChatBuySubscriptionViewModel$onRestoreClick$2(this, null), 2, null).invokeOnCompletion(new ChatBuySubscriptionViewModel$onRestoreClick$3(this));
    }

    public final void onItemClick(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatBuySubscriptionViewModel$onItemClick$1(this, productId, null), 3, null);
    }

    public final void onLaunchBillingFlow(Object obj) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatBuySubscriptionViewModel$onLaunchBillingFlow$1(obj, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = this;
        if (getUiState((UiStateDelegate<UiState, Event>) chatBuySubscriptionViewModel).isPurchased() || !this.params.getGoToBuyNeuronsAfterUpgrade()) {
            this.paymentResultEmitter.onPaymentComplete(this.params.getRequestId(), getUiState((UiStateDelegate<UiState, Event>) chatBuySubscriptionViewModel).isPurchased());
        } else {
            this.appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(AppUiParamsKt.toBuyNeurons$default(this.params, false, 1, null)));
        }
        super.onCleared();
    }
}
