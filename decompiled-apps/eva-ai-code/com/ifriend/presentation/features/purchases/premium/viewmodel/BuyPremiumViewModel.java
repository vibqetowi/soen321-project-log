package com.ifriend.presentation.features.purchases.premium.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u009c\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0015\u0010\u001d\u001a\u0011\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001ej\u0002`!\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)¢\u0006\u0002\u0010*J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u000e2\b\b\u0001\u0010B\u001a\u00020CH\u0096\u0001J\u0013\u0010D\u001a\u00020E2\b\b\u0001\u0010F\u001a\u00020CH\u0096\u0001J\u0013\u0010G\u001a\u00020C2\b\b\u0001\u0010H\u001a\u00020CH\u0097\u0001J\u0015\u0010I\u001a\u0004\u0018\u00010J2\b\b\u0001\u0010B\u001a\u00020CH\u0096\u0001J\u0013\u0010K\u001a\u00020C2\b\b\u0001\u0010B\u001a\u00020CH\u0096\u0001J\u0019\u0010L\u001a\b\u0012\u0004\u0012\u00020C0M2\b\b\u0001\u0010B\u001a\u00020CH\u0096\u0001J\u001b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010?\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020O0MH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u0002012\b\b\u0001\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020CH\u0096\u0001J4\u0010R\u001a\u0002012\b\b\u0001\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020C2\u0012\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020W0V\"\u00020WH\u0096\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u0002012\b\b\u0001\u0010S\u001a\u00020CH\u0096\u0001J,\u0010Y\u001a\u0002012\b\b\u0001\u0010S\u001a\u00020C2\u0012\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020W0V\"\u00020WH\u0096\u0001¢\u0006\u0002\u0010ZJ\u0019\u0010[\u001a\b\u0012\u0004\u0012\u0002010M2\b\b\u0001\u0010S\u001a\u00020CH\u0096\u0001J\b\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020]H\u0002J\u0012\u0010_\u001a\u00020]H\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020]H\u0002J\b\u0010b\u001a\u00020]H\u0002J\b\u0010c\u001a\u00020]H\u0002J\b\u0010d\u001a\u00020]H\u0014J\u0006\u0010e\u001a\u00020]J\u000e\u0010f\u001a\u00020]2\u0006\u0010g\u001a\u00020hJ\u001c\u0010i\u001a\u00020]2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020]0kø\u0001\u0000¢\u0006\u0002\u0010lJ\u0006\u0010m\u001a\u00020]J\u0006\u0010n\u001a\u00020]J\u0006\u0010o\u001a\u00020]J\u0011\u0010p\u001a\u00020qH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u0010\u0010r\u001a\u00020]2\u0006\u0010g\u001a\u00020hH\u0002J0\u0010s\u001a\u00020]*\u00020t2!\u0010u\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bw\u0012\b\bx\u0012\u0004\b\b(y\u0012\u0004\u0012\u00020\u00050vH\u0097\u0001JD\u0010z\u001a\u00020{*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010|\u001a\u00020t2!\u0010}\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bw\u0012\b\bx\u0012\u0004\b\b(y\u0012\u0004\u0012\u00020\u00050vH\u0096\u0001JD\u0010~\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010u\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bw\u0012\b\bx\u0012\u0004\b\b(y\u0012\u0004\u0012\u00020\u00050vH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u007fJ,\u0010\u0080\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0007\u0010\u0081\u0001\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u0082\u0001JE\u0010\u0083\u0001\u001a\u00020]*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010}\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bw\u0012\b\bx\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u00050vH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u007fR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u0011\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001ej\u0002`!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u000201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010/R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u000507X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\"\u0010:\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event;", "requestId", "Ljava/util/UUID;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "goToNeurons", "", "getBenefitsUseCase", "Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "analyticsOpenSubscriptionScreenUseCase", "Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "mapper", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiMapper;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "billingPurchaseDelegate", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "resourceProvider", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "benefitsMapper", "Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;", "(Ljava/util/UUID;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;ZLcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiMapper;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;)V", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "singleEvents", "getSingleEvents", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoolean", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "handleBuyProductFailure", "", "handleBuyProductSuccessful", "initPurchasesProductUpdates", "(Landroidx/lifecycle/ViewModel;)V", "loadBenefits", "loadProducts", "logAnalytics", "onCleared", "onContinueClick", "onItemClick", "item", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "onLaunchBillingFlow", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "onPrivacyClick", "onRestoreClick", "onTermsClick", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "updateActionLabel", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel extends ViewModel implements ResourceProvider, BillingPurchaseDelegate, UiStateDelegate<UiState, Event> {
    private static final int PRODUCTS_COUNT = 3;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_2;
    private final AnalyticsInteractor analyticsInteractor;
    private final AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final SubscriptionBenefitsUiMapper benefitsMapper;
    private final BillingPurchaseDelegate billingPurchaseDelegate;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final DispatcherProvider dispatchers;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetAllPremiumBenefitsUseCase getBenefitsUseCase;
    private final GetUserUseCase getUserUseCase;
    private final boolean goToNeurons;
    private final BuyPremiumPlanUiMapper mapper;
    private final PaymentResultEmitter paymentResultEmitter;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final UUID requestId;
    private final ResourceProvider resourceProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_2.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_2.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
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
        return this.$$delegate_2.getSingleEvents();
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
        return this.$$delegate_2.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_2.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public void initPurchasesProductUpdates(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.billingPurchaseDelegate.initPurchasesProductUpdates(context_receiver_0);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_2.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate
    public Object restoreBillingPurchases(Continuation<? super RestorePurchasesResult> continuation) {
        return this.billingPurchaseDelegate.restoreBillingPurchases(continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_2.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_2.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public BuyPremiumViewModel(UUID requestId, PurchaseReason purchaseReason, PurchaseSource purchaseSource, boolean z, GetAllPremiumBenefitsUseCase getBenefitsUseCase, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyPremiumPlanUiMapper mapper, PaymentResultEmitter paymentResultEmitter, AppEventsEmitter appEventsEmitter, AnalyticsInteractor analyticsInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, BillingPurchaseDelegate billingPurchaseDelegate, GetUserUseCase getUserUseCase, ResourceProvider resourceProvider, DispatcherProvider dispatchers, SubscriptionBenefitsUiMapper benefitsMapper) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(getBenefitsUseCase, "getBenefitsUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(analyticsOpenSubscriptionScreenUseCase, "analyticsOpenSubscriptionScreenUseCase");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(benefitsMapper, "benefitsMapper");
        this.requestId = requestId;
        this.purchaseReason = purchaseReason;
        this.purchaseSource = purchaseSource;
        this.goToNeurons = z;
        this.getBenefitsUseCase = getBenefitsUseCase;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.analyticsOpenSubscriptionScreenUseCase = analyticsOpenSubscriptionScreenUseCase;
        this.mapper = mapper;
        this.paymentResultEmitter = paymentResultEmitter;
        this.appEventsEmitter = appEventsEmitter;
        this.analyticsInteractor = analyticsInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.getUserUseCase = getUserUseCase;
        this.resourceProvider = resourceProvider;
        this.dispatchers = dispatchers;
        this.benefitsMapper = benefitsMapper;
        this.$$delegate_2 = new UiStateDelegateImpl<>(new UiState(null, null, null, null, false, false, null, 127, null), 0, null, 6, null);
        BuyPremiumViewModel buyPremiumViewModel = this;
        initPurchasesProductUpdates(buyPremiumViewModel);
        loadProducts();
        loadBenefits();
        logAnalytics();
        BuildersKt.launch(ViewModelKt.getViewModelScope(buyPremiumViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new BuyPremiumViewModel$special$$inlined$collectIn$default$1(getBillingPurchaseFlow(), null, this));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(buyPremiumViewModel), null, null, new AnonymousClass2(null), 3, null);
    }

    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Companion;", "", "()V", "PRODUCTS_COUNT", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "", "userName", "", "benefitLabel", "benefits", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", FirebaseAnalytics.Param.ITEMS, "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "isLoading", "", "isPurchased", "actionLabel", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZLjava/lang/String;)V", "getActionLabel", "()Ljava/lang/String;", "getBenefitLabel", "getBenefits", "()Lkotlinx/collections/immutable/ImmutableList;", "isContinueButtonEnabled", "()Z", "isInfoButtonVisible", "getItems", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final String actionLabel;
        private final String benefitLabel;
        private final ImmutableList<SubscriptionBenefitsGroupUiParams> benefits;
        private final boolean isContinueButtonEnabled;
        private final boolean isInfoButtonVisible;
        private final boolean isLoading;
        private final boolean isPurchased;
        private final ImmutableList<BuyPremiumPlanUiParams> items;
        private final String userName;

        public UiState() {
            this(null, null, null, null, false, false, null, 127, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, String str2, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.userName;
            }
            if ((i & 2) != 0) {
                str2 = uiState.benefitLabel;
            }
            String str4 = str2;
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList3 = immutableList;
            if ((i & 4) != 0) {
                immutableList3 = uiState.benefits;
            }
            ImmutableList immutableList4 = immutableList3;
            ImmutableList<BuyPremiumPlanUiParams> immutableList5 = immutableList2;
            if ((i & 8) != 0) {
                immutableList5 = uiState.items;
            }
            ImmutableList immutableList6 = immutableList5;
            if ((i & 16) != 0) {
                z = uiState.isLoading;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = uiState.isPurchased;
            }
            boolean z4 = z2;
            if ((i & 64) != 0) {
                str3 = uiState.actionLabel;
            }
            return uiState.copy(str, str4, immutableList4, immutableList6, z3, z4, str3);
        }

        public final String component1() {
            return this.userName;
        }

        public final String component2() {
            return this.benefitLabel;
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> component3() {
            return this.benefits;
        }

        public final ImmutableList<BuyPremiumPlanUiParams> component4() {
            return this.items;
        }

        public final boolean component5() {
            return this.isLoading;
        }

        public final boolean component6() {
            return this.isPurchased;
        }

        public final String component7() {
            return this.actionLabel;
        }

        public final UiState copy(String userName, String benefitLabel, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits, ImmutableList<BuyPremiumPlanUiParams> items, boolean z, boolean z2, String actionLabel) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(benefitLabel, "benefitLabel");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            return new UiState(userName, benefitLabel, benefits, items, z, z2, actionLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.userName, uiState.userName) && Intrinsics.areEqual(this.benefitLabel, uiState.benefitLabel) && Intrinsics.areEqual(this.benefits, uiState.benefits) && Intrinsics.areEqual(this.items, uiState.items) && this.isLoading == uiState.isLoading && this.isPurchased == uiState.isPurchased && Intrinsics.areEqual(this.actionLabel, uiState.actionLabel);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.userName.hashCode() * 31) + this.benefitLabel.hashCode()) * 31) + this.benefits.hashCode()) * 31) + this.items.hashCode()) * 31;
            boolean z = this.isLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.isPurchased;
            return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.actionLabel.hashCode();
        }

        public String toString() {
            String str = this.userName;
            String str2 = this.benefitLabel;
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList = this.benefits;
            ImmutableList<BuyPremiumPlanUiParams> immutableList2 = this.items;
            boolean z = this.isLoading;
            boolean z2 = this.isPurchased;
            String str3 = this.actionLabel;
            return "UiState(userName=" + str + ", benefitLabel=" + str2 + ", benefits=" + immutableList + ", items=" + immutableList2 + ", isLoading=" + z + ", isPurchased=" + z2 + ", actionLabel=" + str3 + ")";
        }

        public UiState(String userName, String benefitLabel, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits, ImmutableList<BuyPremiumPlanUiParams> items, boolean z, boolean z2, String actionLabel) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(benefitLabel, "benefitLabel");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            this.userName = userName;
            this.benefitLabel = benefitLabel;
            this.benefits = benefits;
            this.items = items;
            this.isLoading = z;
            this.isPurchased = z2;
            this.actionLabel = actionLabel;
            ImmutableList<BuyPremiumPlanUiParams> immutableList = items;
            boolean z3 = false;
            if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                Iterator<BuyPremiumPlanUiParams> it = immutableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().isSelected()) {
                        z3 = true;
                        break;
                    }
                }
            }
            this.isContinueButtonEnabled = z3;
            this.isInfoButtonVisible = !this.benefits.isEmpty();
        }

        public final String getUserName() {
            return this.userName;
        }

        public final String getBenefitLabel() {
            return this.benefitLabel;
        }

        public /* synthetic */ UiState(String str, String str2, PersistentList persistentList, PersistentList persistentList2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 8) != 0 ? ExtensionsKt.persistentListOf() : persistentList2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str3);
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> getBenefits() {
            return this.benefits;
        }

        public final ImmutableList<BuyPremiumPlanUiParams> getItems() {
            return this.items;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isPurchased() {
            return this.isPurchased;
        }

        public final String getActionLabel() {
            return this.actionLabel;
        }

        public final boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final boolean isInfoButtonVisible() {
            return this.isInfoButtonVisible;
        }
    }

    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event;", "", "CloseFeature", "LaunchBillingFlow", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event$LaunchBillingFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: BuyPremiumViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
                return 1328951675;
            }

            public String toString() {
                return "CloseFeature";
            }

            private CloseFeature() {
            }
        }

        /* compiled from: BuyPremiumViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event$LaunchBillingFlow;", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "(Lcom/android/billingclient/api/BillingFlowParams;)V", "getParams", "()Lcom/android/billingclient/api/BillingFlowParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$2", f = "BuyPremiumViewModel.kt", i = {}, l = {111, 113}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BuyPremiumViewModel.this.getUserUseCase.flow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Flow filterNotNull = FlowKt.filterNotNull((Flow) obj);
            final BuyPremiumViewModel buyPremiumViewModel = BuyPremiumViewModel.this;
            this.label = 2;
            if (filterNotNull.collect(new FlowCollector<User>() { // from class: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel.2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(User user, Continuation continuation) {
                    return emit2(user, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(User user, Continuation<? super Unit> continuation) {
                    UiStateDelegate<UiState, Event> uiStateDelegate = BuyPremiumViewModel.this;
                    Object updateUiState = uiStateDelegate.updateUiState(uiStateDelegate, new BuyPremiumViewModel$2$1$emit$2(user), continuation);
                    return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadProducts() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyPremiumViewModel$loadProducts$1(this.exceptionsEmitter), null, new BuyPremiumViewModel$loadProducts$2(this, null), 2, null).invokeOnCompletion(new BuyPremiumViewModel$loadProducts$3(this));
    }

    private final void loadBenefits() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, this.dispatchers.background(), new BuyPremiumViewModel$loadBenefits$1(this, null), 1, null);
    }

    private final void logAnalytics() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$logAnalytics$1(this, null), 3, null);
    }

    public final void onItemClick(BuyPremiumPlanUiParams item) {
        Intrinsics.checkNotNullParameter(item, "item");
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new BuyPremiumViewModel$onItemClick$1(this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActionLabel(BuyPremiumPlanUiParams buyPremiumPlanUiParams) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$updateActionLabel$1(this, buyPremiumPlanUiParams, null), 3, null);
    }

    public final void onContinueClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyPremiumViewModel$onContinueClick$1(this, null), null, new BuyPremiumViewModel$onContinueClick$2(this, null), 2, null);
    }

    public final void onTermsClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$onTermsClick$1(this, null), 3, null);
    }

    public final void onRestoreClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyPremiumViewModel$onRestoreClick$1(this.exceptionsEmitter), null, new BuyPremiumViewModel$onRestoreClick$2(this, null), 2, null).invokeOnCompletion(new BuyPremiumViewModel$onRestoreClick$3(this));
    }

    public final void onPrivacyClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$onPrivacyClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        BuyPremiumViewModel buyPremiumViewModel = this;
        if (getUiState((UiStateDelegate<UiState, Event>) buyPremiumViewModel).isPurchased() || !this.goToNeurons) {
            this.paymentResultEmitter.onPaymentComplete(this.requestId, getUiState((UiStateDelegate<UiState, Event>) buyPremiumViewModel).isPurchased());
        } else {
            this.appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, this.purchaseReason, this.purchaseSource, this.requestId, 1, null)));
        }
        super.onCleared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductFailure() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$handleBuyProductFailure$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductSuccessful() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$handleBuyProductSuccessful$1(this, null), 3, null);
    }

    public final void onLaunchBillingFlow(Object obj) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPremiumViewModel$onLaunchBillingFlow$1(obj, this, null), 3, null);
    }
}
