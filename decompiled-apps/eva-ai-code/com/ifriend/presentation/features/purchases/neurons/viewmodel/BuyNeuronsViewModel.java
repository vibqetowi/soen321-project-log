package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiMapper;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.protocol.HTTP;
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0003xyzBt\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0015\u0010\u0019\u001a\u0011\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001aj\u0002`\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0002\u0010 J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u00020(H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000e2\b\b\u0001\u00109\u001a\u00020:H\u0096\u0001J\u0013\u0010;\u001a\u00020<2\b\b\u0001\u0010=\u001a\u00020:H\u0096\u0001J\u0013\u0010>\u001a\u00020:2\b\b\u0001\u0010?\u001a\u00020:H\u0097\u0001J\u0015\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0001\u00109\u001a\u00020:H\u0096\u0001J\u0013\u0010B\u001a\u00020:2\b\b\u0001\u00109\u001a\u00020:H\u0096\u0001J\u0019\u0010C\u001a\b\u0012\u0004\u0012\u00020:0D2\b\b\u0001\u00109\u001a\u00020:H\u0096\u0001J\u001b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u00106\u001a\u00020(H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020F0DH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010HJ\u001b\u0010I\u001a\u00020(2\b\b\u0001\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020:H\u0096\u0001J4\u0010I\u001a\u00020(2\b\b\u0001\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020:2\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020N0M\"\u00020NH\u0096\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020(2\b\b\u0001\u0010J\u001a\u00020:H\u0096\u0001J,\u0010P\u001a\u00020(2\b\b\u0001\u0010J\u001a\u00020:2\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020N0M\"\u00020NH\u0096\u0001¢\u0006\u0002\u0010QJ\u0019\u0010R\u001a\b\u0012\u0004\u0012\u00020(0D2\b\b\u0001\u0010J\u001a\u00020:H\u0096\u0001J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020TH\u0002J\u0012\u0010V\u001a\u00020TH\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020TH\u0014J\u0006\u0010Y\u001a\u00020TJ\u000e\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020\\J\u001c\u0010]\u001a\u00020T2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020T0_ø\u0001\u0000¢\u0006\u0002\u0010`J\u0006\u0010a\u001a\u00020TJ\u0006\u0010b\u001a\u00020TJ\u0006\u0010c\u001a\u00020TJ\u0011\u0010d\u001a\u00020eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010HJ\u0010\u0010f\u001a\u00020T2\u0006\u0010[\u001a\u00020\\H\u0002J0\u0010g\u001a\u00020T*\u00020h2!\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020\u00050jH\u0097\u0001JD\u0010n\u001a\u00020o*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010p\u001a\u00020h2!\u0010q\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020\u00050jH\u0096\u0001JD\u0010r\u001a\u00020T*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020\u00050jH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010sJ)\u0010t\u001a\u00020T*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010u\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010vJD\u0010w\u001a\u00020T*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010q\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00050jH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010sR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u0011\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001aj\u0002`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010%R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\"\u00101\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006{"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", "requestId", "Ljava/util/UUID;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "goToUpgrade", "", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "analyticsOpenSubscriptionScreenUseCase", "Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "buyNeuronsProductUiMapper", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiMapper;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "billingPurchaseDelegate", "resourceProvider", "(Ljava/util/UUID;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;ZLcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiMapper;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", "isPurchased", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "singleEvents", "getSingleEvents", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoolean", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "handleBuyProductFailure", "", "handleBuyProductSuccessful", "initPurchasesProductUpdates", "(Landroidx/lifecycle/ViewModel;)V", "onCleared", "onContinueClick", "onItemClick", "item", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "onLaunchBillingFlow", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "onPrivacyClick", "onRestoreClick", "onTermsClick", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "updateActionLabel", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel extends ViewModel implements ResourceProvider, BillingPurchaseDelegate, UiStateDelegate<UiState, Event> {
    private static final int PRODUCTS_COUNT = 3;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_2;
    private final AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final BillingPurchaseDelegate billingPurchaseDelegate;
    private final BuyNeuronsProductUiMapper buyNeuronsProductUiMapper;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final boolean goToUpgrade;
    private boolean isPurchased;
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

    public BuyNeuronsViewModel(UUID requestId, PaymentResultEmitter paymentResultEmitter, PurchaseReason purchaseReason, boolean z, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyNeuronsProductUiMapper buyNeuronsProductUiMapper, PurchaseSource purchaseSource, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> exceptionsEmitter, BillingPurchaseDelegate billingPurchaseDelegate, ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(analyticsOpenSubscriptionScreenUseCase, "analyticsOpenSubscriptionScreenUseCase");
        Intrinsics.checkNotNullParameter(buyNeuronsProductUiMapper, "buyNeuronsProductUiMapper");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.requestId = requestId;
        this.paymentResultEmitter = paymentResultEmitter;
        this.purchaseReason = purchaseReason;
        this.goToUpgrade = z;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.analyticsOpenSubscriptionScreenUseCase = analyticsOpenSubscriptionScreenUseCase;
        this.buyNeuronsProductUiMapper = buyNeuronsProductUiMapper;
        this.purchaseSource = purchaseSource;
        this.appEventsEmitter = appEventsEmitter;
        this.exceptionsEmitter = exceptionsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.resourceProvider = resourceProvider;
        this.$$delegate_2 = new UiStateDelegateImpl<>(new UiState(null, false, null, 7, null), 0, null, 6, null);
        BuyNeuronsViewModel buyNeuronsViewModel = this;
        initPurchasesProductUpdates(buyNeuronsViewModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(buyNeuronsViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt.launch(ViewModelKt.getViewModelScope(buyNeuronsViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new BuyNeuronsViewModel$special$$inlined$collectIn$default$1(getBillingPurchaseFlow(), null, this));
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(buyNeuronsViewModel), new AnonymousClass3(null), null, new AnonymousClass4(null), 2, null).invokeOnCompletion(new AnonymousClass5());
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Companion;", "", "()V", "PRODUCTS_COUNT", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "", "products", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "isLoading", "", "actionLabel", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;)V", "getActionLabel", "()Ljava/lang/String;", "isContentVisible", "()Z", "isContinueEnabled", "getProducts", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final String actionLabel;
        private final boolean isContentVisible;
        private final boolean isContinueEnabled;
        private final boolean isLoading;
        private final ImmutableList<BuyNeuronsProductUiParams> products;

        public UiState() {
            this(null, false, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, ImmutableList immutableList, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = uiState.products;
            }
            if ((i & 2) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 4) != 0) {
                str = uiState.actionLabel;
            }
            return uiState.copy(immutableList, z, str);
        }

        public final ImmutableList<BuyNeuronsProductUiParams> component1() {
            return this.products;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final String component3() {
            return this.actionLabel;
        }

        public final UiState copy(ImmutableList<BuyNeuronsProductUiParams> products, boolean z, String actionLabel) {
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            return new UiState(products, z, actionLabel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.products, uiState.products) && this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.actionLabel, uiState.actionLabel);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.products.hashCode() * 31;
            boolean z = this.isLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.actionLabel.hashCode();
        }

        public String toString() {
            ImmutableList<BuyNeuronsProductUiParams> immutableList = this.products;
            boolean z = this.isLoading;
            String str = this.actionLabel;
            return "UiState(products=" + immutableList + ", isLoading=" + z + ", actionLabel=" + str + ")";
        }

        public UiState(ImmutableList<BuyNeuronsProductUiParams> products, boolean z, String actionLabel) {
            boolean z2;
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            this.products = products;
            this.isLoading = z;
            this.actionLabel = actionLabel;
            ImmutableList<BuyNeuronsProductUiParams> immutableList = products;
            boolean z3 = false;
            if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                for (BuyNeuronsProductUiParams buyNeuronsProductUiParams : immutableList) {
                    if (buyNeuronsProductUiParams.isSelected()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2 && !this.isLoading) {
                z3 = true;
            }
            this.isContinueEnabled = z3;
            this.isContentVisible = !this.products.isEmpty();
        }

        public /* synthetic */ UiState(PersistentList persistentList, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str);
        }

        public final ImmutableList<BuyNeuronsProductUiParams> getProducts() {
            return this.products;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String getActionLabel() {
            return this.actionLabel;
        }

        public final boolean isContinueEnabled() {
            return this.isContinueEnabled;
        }

        public final boolean isContentVisible() {
            return this.isContentVisible;
        }
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", "", HTTP.CONN_CLOSE, "LaunchBillingFlow", "OpenLink", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$Close;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$LaunchBillingFlow;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$OpenLink;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$Close;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Close implements Event {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Close) {
                    Close close = (Close) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1188574555;
            }

            public String toString() {
                return HTTP.CONN_CLOSE;
            }

            private Close() {
            }
        }

        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$OpenLink;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", "link", "", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenLink implements Event {
            public static final int $stable = 0;
            private final String link;

            public static /* synthetic */ OpenLink copy$default(OpenLink openLink, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openLink.link;
                }
                return openLink.copy(str);
            }

            public final String component1() {
                return this.link;
            }

            public final OpenLink copy(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new OpenLink(link);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenLink) && Intrinsics.areEqual(this.link, ((OpenLink) obj).link);
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            public String toString() {
                String str = this.link;
                return "OpenLink(link=" + str + ")";
            }

            public OpenLink(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public final String getLink() {
                return this.link;
            }
        }

        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event$LaunchBillingFlow;", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "(Lcom/android/billingclient/api/BillingFlowParams;)V", "getParams", "()Lcom/android/billingclient/api/BillingFlowParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$1", f = "BuyNeuronsViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$1  reason: invalid class name */
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
                obj = BuyNeuronsViewModel.this.chatsInfoConfigurationRepository.getLastActiveChatId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            BuyNeuronsViewModel.this.analyticsOpenSubscriptionScreenUseCase.handle(BuyNeuronsViewModel.this.purchaseSource, (String) obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$3", f = "BuyNeuronsViewModel.kt", i = {0}, l = {100, 101}, m = "invokeSuspend", n = {"throwable"}, s = {"L$0"})
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                th = (Throwable) this.L$0;
                UiStateDelegate<UiState, Event> uiStateDelegate = BuyNeuronsViewModel.this;
                this.L$0 = th;
                this.label = 1;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.Close.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                th = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (BuyNeuronsViewModel.this.exceptionsEmitter.emit(th, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$4", f = "BuyNeuronsViewModel.kt", i = {}, l = {103, LocationRequestCompat.QUALITY_LOW_POWER, 107, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$4$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, null, true, null, 5, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            UiStateDelegate<UiState, Event> uiStateDelegate;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<UiState, Event> uiStateDelegate2 = BuyNeuronsViewModel.this;
                this.label = 1;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        uiStateDelegate = BuyNeuronsViewModel.this;
                        this.label = 4;
                        if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.Close.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } else if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else if (i == 5) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list.size() >= 3) {
                    this.label = 3;
                    if (BuyNeuronsViewModel.this.exceptionsEmitter.emit(new IllegalStateException("Invalid Products count!"), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uiStateDelegate = BuyNeuronsViewModel.this;
                    this.label = 4;
                    if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.Close.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                List take = CollectionsKt.take(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$4$invokeSuspend$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((BillingProduct) t).getPrice().getPrice(), ((BillingProduct) t2).getPrice().getPrice());
                    }
                }), 3);
                BuyNeuronsProductUiParams map = BuyNeuronsViewModel.this.buyNeuronsProductUiMapper.map((BillingProduct) take.get(0), R.drawable.ic_buy_neurons_small_amount, true, true);
                BuyNeuronsViewModel.this.updateActionLabel(map);
                Unit unit = Unit.INSTANCE;
                PersistentList persistentListOf = ExtensionsKt.persistentListOf(BuyNeuronsProductUiMapper.map$default(BuyNeuronsViewModel.this.buyNeuronsProductUiMapper, (BillingProduct) take.get(2), R.drawable.ic_buy_neurons_large_amount, false, false, 12, null), map, BuyNeuronsProductUiMapper.map$default(BuyNeuronsViewModel.this.buyNeuronsProductUiMapper, (BillingProduct) take.get(1), R.drawable.ic_buy_neurons_medium_amount, false, false, 12, null));
                UiStateDelegate<UiState, Event> uiStateDelegate3 = BuyNeuronsViewModel.this;
                this.label = 5;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, new AnonymousClass2(persistentListOf), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            obj = BuyNeuronsViewModel.this.getPurchaseProducts(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) obj;
            if (list.size() >= 3) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$4$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<UiState, UiState> {
            final /* synthetic */ PersistentList<BuyNeuronsProductUiParams> $products;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PersistentList<BuyNeuronsProductUiParams> persistentList) {
                super(1);
                this.$products = persistentList;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, this.$products, false, null, 6, null);
            }
        }
    }

    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass5 extends Lambda implements Function1<Throwable, Unit> {
        AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$5$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, null, false, null, 5, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            UiStateDelegate<UiState, Event> uiStateDelegate = BuyNeuronsViewModel.this;
            uiStateDelegate.asyncUpdateUiState(uiStateDelegate, ViewModelKt.getViewModelScope((ViewModel) uiStateDelegate), AnonymousClass1.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductFailure() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyNeuronsViewModel$handleBuyProductFailure$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBuyProductSuccessful() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyNeuronsViewModel$handleBuyProductSuccessful$1(this, null), null, new BuyNeuronsViewModel$handleBuyProductSuccessful$2(this, null), 2, null);
    }

    public final void onItemClick(BuyNeuronsProductUiParams item) {
        Intrinsics.checkNotNullParameter(item, "item");
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new BuyNeuronsViewModel$onItemClick$1(item));
        updateActionLabel(item);
    }

    public final void onContinueClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyNeuronsViewModel$onContinueClick$1(this, null), null, new BuyNeuronsViewModel$onContinueClick$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActionLabel(BuyNeuronsProductUiParams buyNeuronsProductUiParams) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyNeuronsViewModel$updateActionLabel$1(this, buyNeuronsProductUiParams, null), 3, null);
    }

    public final void onRestoreClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new BuyNeuronsViewModel$onRestoreClick$1(this.exceptionsEmitter), null, new BuyNeuronsViewModel$onRestoreClick$2(this, null), 2, null).invokeOnCompletion(new BuyNeuronsViewModel$onRestoreClick$3(this));
    }

    public final void onTermsClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyNeuronsViewModel$onTermsClick$1(this, null), 3, null);
    }

    public final void onPrivacyClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyNeuronsViewModel$onPrivacyClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        UpgradeType upgradeType;
        boolean z = this.isPurchased;
        if (z || !this.goToUpgrade) {
            this.paymentResultEmitter.onPaymentComplete(this.requestId, z);
        } else {
            UUID uuid = this.requestId;
            if (this.purchaseSource == PurchaseSource.GENERATE_AVATAR) {
                upgradeType = UpgradeType.GENERATE_AVATAR;
            } else {
                upgradeType = UpgradeType.FREE_NEURONS;
            }
            this.appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(uuid, false, upgradeType, this.purchaseReason, 2, null)));
        }
        super.onCleared();
    }

    public final void onLaunchBillingFlow(Object obj) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyNeuronsViewModel$onLaunchBillingFlow$1(obj, this, null), 3, null);
    }
}
