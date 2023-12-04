package com.ifiend.billing.impl.manager;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifiend.billing.impl.events.BillingClientEvents;
import com.ifiend.billing.impl.manager.BillingConnectionResult;
import com.ifiend.billing.impl.manager.PurchasesUpdatedState;
import com.ifriend.billing.api.exception.BillingManagerException;
import com.ifriend.billing.api.models.BillingProductsResult;
import com.ifriend.core.utils.ResettableLazy;
import com.ifriend.core.utils.ResettableLazyKt;
import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.api.events.LoggerLevel;
import com.ifriend.logger.api.events.PurchaseEvent;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001sB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J%\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0011\u00100\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J!\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u00108J'\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002070#2\u0006\u0010<\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010=J3\u0010>\u001a\u00020\u001d2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002050#0@2\u0006\u0010<\u001a\u000207H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010<\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010CJ#\u0010D\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001f2\b\b\u0002\u0010E\u001a\u00020FH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010GJ)\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ2\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001d0L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u000203H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020'H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010VJ\u0011\u0010W\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020TH\u0096\u0001J+\u0010X\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002050#0@2\u0006\u0010O\u001a\u00020YH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010ZJ\"\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001d0LH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\\\u00101J\u0011\u0010]\u001a\u00020^H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u0010_\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020^H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010`J;\u0010a\u001a\u00020\u001d2\u0006\u0010b\u001a\u0002072\u0006\u0010c\u001a\u00020)2\u0006\u0010d\u001a\u0002072\u0006\u0010e\u001a\u0002072\b\b\u0002\u0010E\u001a\u00020FH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010fJ9\u0010g\u001a\u00020\u001d2\u0006\u0010b\u001a\u0002072\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070h2\b\b\u0002\u0010i\u001a\u00020FH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010jJ:\u0010k\u001a\u0002Hl\"\u0004\b\u0000\u0010l2!\u0010m\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(q\u0012\u0004\u0012\u0002Hl0nH\u0082Hø\u0001\u0000¢\u0006\u0002\u0010rR\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006t"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingManagerImpl;", "Lcom/ifiend/billing/impl/manager/BillingManager;", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "appLoggerInteractor", "coroutineScope", "billingResponseCodeMapper", "Lcom/ifiend/billing/impl/manager/BillingResponseCodeMapper;", "(Landroid/content/Context;Lcom/ifriend/logger/api/logic/AppLoggerInteractor;Lkotlinx/coroutines/CoroutineScope;Lcom/ifiend/billing/impl/manager/BillingResponseCodeMapper;)V", "billing", "Lcom/ifriend/core/utils/ResettableLazy;", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "getBillingClient", "()Lcom/android/billingclient/api/BillingClient;", "billingProductUpdatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "getBillingProductUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "purchaseUpdatesFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "acknowledgePurchaseError", "", "acknowledgeResult", "Lcom/android/billingclient/api/BillingResult;", "(Lcom/android/billingclient/api/BillingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acknowledgePurchases", BillingManagerImpl.PURCHASES_KEY, "", "Lcom/android/billingclient/api/Purchase;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectToBillingClientWithRetry", "", "maxRetries", "", "delayInMillisForRetry", "", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeAsync", "purchase", "(Lcom/android/billingclient/api/Purchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endConnect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "product", "Lcom/android/billingclient/api/ProductDetails;", "billingProductType", "", "(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lcom/ifriend/billing/api/models/BillingProductsResult;", "productIds", "productType", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsTrackEvent", "result", "Lkotlin/Pair;", "(Lkotlin/Pair;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchases", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBillingError", "defaultLevel", "Lcom/ifriend/logger/api/events/LoggerLevel;", "(Lcom/android/billingclient/api/BillingResult;Lcom/ifriend/logger/api/events/LoggerLevel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdates", "billingResult", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBillingFlow", "Lkotlin/Result;", "activity", "Landroid/app/Activity;", NativeProtocol.WEB_DIALOG_PARAMS, "launchBillingFlow-0E7RQCE", "(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/logger/api/events/LoggerEvent;", "isHandleError", "(Lcom/ifriend/logger/api/events/LoggerEvent;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEventAsync", "queryProductDetailsAsync", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "(Lcom/android/billingclient/api/QueryProductDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startBillingConnection", "startBillingConnection-IoAF18A", "startOneTimeConnection", "Lcom/ifiend/billing/impl/manager/BillingConnectionResult;", "trackConnectionEvent", "(Lcom/ifiend/billing/impl/manager/BillingConnectionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackErrorEvent", "eventName", "responseCode", "errorMessage", "debugMessage", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/ifriend/logger/api/events/LoggerLevel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackEvent", "", FirebaseAnalytics.Param.LEVEL, "(Ljava/lang/String;Ljava/util/Map;Lcom/ifriend/logger/api/events/LoggerLevel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryConnectedIfNeed", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isConnected", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingManagerImpl implements BillingManager, AppLoggerInteractor, CoroutineScope {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_DEBUG_MESSAGE_KEY = "debug-message";
    public static final String ERROR_MESSAGE_KEY = "error-message";
    private static final String PRODUCTS_KEY = "products";
    private static final String PRODUCTS_TYPE_KEY = "products-type";
    public static final String PURCHASES_KEY = "purchases";
    public static final String PURCHASE_KEY = "purchase";
    public static final String RESPONSE_CODE_KEY = "response-code";
    private static final String TAG = "BillingClient";
    private final AppLoggerInteractor appLoggerInteractor;
    private final ResettableLazy<BillingClient> billing;
    private final BillingResponseCodeMapper billingResponseCodeMapper;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final MutableSharedFlow<PurchasesUpdatedState> purchaseUpdatesFlow;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
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

    @Inject
    public BillingManagerImpl(Context context, AppLoggerInteractor appLoggerInteractor, CoroutineScope coroutineScope, BillingResponseCodeMapper billingResponseCodeMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLoggerInteractor, "appLoggerInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(billingResponseCodeMapper, "billingResponseCodeMapper");
        this.context = context;
        this.appLoggerInteractor = appLoggerInteractor;
        this.coroutineScope = coroutineScope;
        this.billingResponseCodeMapper = billingResponseCodeMapper;
        this.purchaseUpdatesFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.billing = ResettableLazyKt.resettableLazy(new BillingManagerImpl$billing$1(this));
    }

    /* compiled from: BillingManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingManagerImpl$Companion;", "", "()V", "ERROR_DEBUG_MESSAGE_KEY", "", "ERROR_MESSAGE_KEY", "PRODUCTS_KEY", "PRODUCTS_TYPE_KEY", "PURCHASES_KEY", "PURCHASE_KEY", "RESPONSE_CODE_KEY", "TAG", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifiend.billing.impl.manager.BillingManager
    public Flow<PurchasesUpdatedState> getBillingProductUpdatesFlow() {
        return FlowKt.asSharedFlow(this.purchaseUpdatesFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingClient getBillingClient() {
        BillingClient value = this.billing.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdates(BillingResult billingResult, List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingManagerImpl$handleUpdates$1 billingManagerImpl$handleUpdates$1;
        BillingManagerImpl$handleUpdates$1 billingManagerImpl$handleUpdates$12;
        BillingManagerImpl billingManagerImpl;
        List<? extends Purchase> list2;
        BillingResult billingResult2;
        Object obj;
        BillingManagerImpl billingManagerImpl2;
        Object obj2;
        BillingResult billingResult3;
        BillingManagerImpl billingManagerImpl3;
        MutableSharedFlow<PurchasesUpdatedState> mutableSharedFlow;
        PurchasesUpdatedState.Failure failure;
        MutableSharedFlow<PurchasesUpdatedState> mutableSharedFlow2;
        PurchasesUpdatedState.Successful successful;
        if (continuation instanceof BillingManagerImpl$handleUpdates$1) {
            billingManagerImpl$handleUpdates$1 = (BillingManagerImpl$handleUpdates$1) continuation;
            if ((billingManagerImpl$handleUpdates$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$handleUpdates$1.label -= Integer.MIN_VALUE;
                billingManagerImpl$handleUpdates$12 = billingManagerImpl$handleUpdates$1;
                Object obj3 = billingManagerImpl$handleUpdates$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z = true;
                switch (billingManagerImpl$handleUpdates$12.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        String eventName = BillingClientEvents.PurchasesFlow.PurchasesUpdated.INSTANCE.getEventName();
                        String joinToString$default = list != null ? CollectionsKt.joinToString$default(list, null, null, null, 0, null, BillingManagerImpl$handleUpdates$2.INSTANCE, 31, null) : null;
                        if (joinToString$default == null) {
                            joinToString$default = "";
                        }
                        Map mapOf = MapsKt.mapOf(TuplesKt.to(PURCHASES_KEY, joinToString$default));
                        billingManagerImpl$handleUpdates$12.L$0 = this;
                        billingManagerImpl$handleUpdates$12.L$1 = billingResult;
                        billingManagerImpl$handleUpdates$12.L$2 = list;
                        billingManagerImpl$handleUpdates$12.label = 1;
                        if (trackEvent$default(this, eventName, mapOf, null, billingManagerImpl$handleUpdates$12, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingManagerImpl = this;
                        list2 = list;
                        billingResult2 = billingResult;
                        if (BillingclientKt.isSuccessful(billingResult2)) {
                            billingManagerImpl$handleUpdates$12.L$0 = billingManagerImpl;
                            billingManagerImpl$handleUpdates$12.L$1 = billingResult2;
                            billingManagerImpl$handleUpdates$12.L$2 = null;
                            billingManagerImpl$handleUpdates$12.label = 2;
                            obj2 = null;
                            if (handleBillingError$default(billingManagerImpl, billingResult2, null, billingManagerImpl$handleUpdates$12, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingResult3 = billingResult2;
                            billingManagerImpl3 = billingManagerImpl;
                            mutableSharedFlow = billingManagerImpl3.purchaseUpdatesFlow;
                            failure = new PurchasesUpdatedState.Failure(billingResult3.getResponseCode(), billingManagerImpl3.billingResponseCodeMapper.map(billingResult3.getResponseCode()));
                            billingManagerImpl$handleUpdates$12.L$0 = obj2;
                            billingManagerImpl$handleUpdates$12.L$1 = obj2;
                            billingManagerImpl$handleUpdates$12.label = 3;
                            if (mutableSharedFlow.emit(failure, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        obj = null;
                        List<? extends Purchase> list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            z = false;
                        }
                        if (z) {
                            MutableSharedFlow<PurchasesUpdatedState> mutableSharedFlow3 = billingManagerImpl.purchaseUpdatesFlow;
                            PurchasesUpdatedState.SuccessfulWithEmptyPurchase successfulWithEmptyPurchase = PurchasesUpdatedState.SuccessfulWithEmptyPurchase.INSTANCE;
                            billingManagerImpl$handleUpdates$12.L$0 = null;
                            billingManagerImpl$handleUpdates$12.L$1 = null;
                            billingManagerImpl$handleUpdates$12.L$2 = null;
                            billingManagerImpl$handleUpdates$12.label = 4;
                            if (mutableSharedFlow3.emit(successfulWithEmptyPurchase, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } else if (BillingclientKt.isSuccessful(billingResult2)) {
                            billingManagerImpl$handleUpdates$12.L$0 = billingManagerImpl;
                            billingManagerImpl$handleUpdates$12.L$1 = list2;
                            billingManagerImpl$handleUpdates$12.L$2 = null;
                            billingManagerImpl$handleUpdates$12.label = 5;
                            if (billingManagerImpl.acknowledgePurchases(list2, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            billingManagerImpl2 = billingManagerImpl;
                            mutableSharedFlow2 = billingManagerImpl2.purchaseUpdatesFlow;
                            successful = new PurchasesUpdatedState.Successful(CollectionsKt.toList(list2));
                            billingManagerImpl$handleUpdates$12.L$0 = obj;
                            billingManagerImpl$handleUpdates$12.L$1 = obj;
                            billingManagerImpl$handleUpdates$12.label = 6;
                            if (mutableSharedFlow2.emit(successful, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } else {
                            return Unit.INSTANCE;
                        }
                    case 1:
                        list2 = (List) billingManagerImpl$handleUpdates$12.L$2;
                        billingResult2 = (BillingResult) billingManagerImpl$handleUpdates$12.L$1;
                        billingManagerImpl = (BillingManagerImpl) billingManagerImpl$handleUpdates$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        if (BillingclientKt.isSuccessful(billingResult2)) {
                        }
                        break;
                    case 2:
                        billingResult3 = (BillingResult) billingManagerImpl$handleUpdates$12.L$1;
                        billingManagerImpl3 = (BillingManagerImpl) billingManagerImpl$handleUpdates$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = null;
                        mutableSharedFlow = billingManagerImpl3.purchaseUpdatesFlow;
                        failure = new PurchasesUpdatedState.Failure(billingResult3.getResponseCode(), billingManagerImpl3.billingResponseCodeMapper.map(billingResult3.getResponseCode()));
                        billingManagerImpl$handleUpdates$12.L$0 = obj2;
                        billingManagerImpl$handleUpdates$12.L$1 = obj2;
                        billingManagerImpl$handleUpdates$12.label = 3;
                        if (mutableSharedFlow.emit(failure, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    case 4:
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    case 5:
                        list2 = (List) billingManagerImpl$handleUpdates$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$handleUpdates$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = null;
                        mutableSharedFlow2 = billingManagerImpl2.purchaseUpdatesFlow;
                        successful = new PurchasesUpdatedState.Successful(CollectionsKt.toList(list2));
                        billingManagerImpl$handleUpdates$12.L$0 = obj;
                        billingManagerImpl$handleUpdates$12.L$1 = obj;
                        billingManagerImpl$handleUpdates$12.label = 6;
                        if (mutableSharedFlow2.emit(successful, billingManagerImpl$handleUpdates$12) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        billingManagerImpl$handleUpdates$1 = new BillingManagerImpl$handleUpdates$1(this, continuation);
        billingManagerImpl$handleUpdates$12 = billingManagerImpl$handleUpdates$1;
        Object obj32 = billingManagerImpl$handleUpdates$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = true;
        switch (billingManagerImpl$handleUpdates$12.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|114|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r1 = r2;
        r2 = -2147483648;
        r3 = r4;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e7: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:34:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d A[Catch: all -> 0x02de, TRY_LEAVE, TryCatch #4 {all -> 0x02de, blocks: (B:53:0x018e, B:55:0x019d, B:91:0x02d7), top: B:115:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8 A[Catch: all -> 0x0249, TRY_LEAVE, TryCatch #1 {all -> 0x0249, blocks: (B:59:0x01b0, B:61:0x01b8), top: B:109:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1 A[Catch: all -> 0x023e, TryCatch #3 {all -> 0x023e, blocks: (B:65:0x01e9, B:67:0x01f1, B:79:0x0251, B:82:0x027c, B:84:0x0284, B:88:0x02c4, B:70:0x022c), top: B:113:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c A[Catch: all -> 0x023e, TryCatch #3 {all -> 0x023e, blocks: (B:65:0x01e9, B:67:0x01f1, B:79:0x0251, B:82:0x027c, B:84:0x0284, B:88:0x02c4, B:70:0x022c), top: B:113:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284 A[Catch: all -> 0x023e, TryCatch #3 {all -> 0x023e, blocks: (B:65:0x01e9, B:67:0x01f1, B:79:0x0251, B:82:0x027c, B:84:0x0284, B:88:0x02c4, B:70:0x022c), top: B:113:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c4 A[Catch: all -> 0x023e, TRY_LEAVE, TryCatch #3 {all -> 0x023e, blocks: (B:65:0x01e9, B:67:0x01f1, B:79:0x0251, B:82:0x027c, B:84:0x0284, B:88:0x02c4, B:70:0x022c), top: B:113:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef  */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0356 -> B:104:0x0358). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x035e -> B:43:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0149 -> B:13:0x0049). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x014f -> B:13:0x0049). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acknowledgePurchases(List<? extends Purchase> list, Continuation<? super Unit> continuation) {
        BillingManagerImpl$acknowledgePurchases$1 billingManagerImpl$acknowledgePurchases$1;
        BillingManagerImpl$acknowledgePurchases$1 billingManagerImpl$acknowledgePurchases$12;
        Purchase purchase;
        Iterator<? extends Purchase> it;
        BillingManagerImpl billingManagerImpl;
        Object obj;
        String str;
        Object m7271constructorimpl;
        BillingManagerImpl billingManagerImpl2;
        Throwable m7274exceptionOrNullimpl;
        Iterator<? extends Purchase> it2;
        BillingManagerImpl billingManagerImpl3;
        int i;
        Object obj2;
        Iterator<? extends Purchase> it3;
        Purchase purchase2;
        BillingManagerImpl billingManagerImpl4;
        BillingResult billingResult;
        BillingResult billingResult2;
        List<? extends Purchase> list2;
        if (continuation instanceof BillingManagerImpl$acknowledgePurchases$1) {
            billingManagerImpl$acknowledgePurchases$1 = (BillingManagerImpl$acknowledgePurchases$1) continuation;
            ?? r2 = billingManagerImpl$acknowledgePurchases$1.label & Integer.MIN_VALUE;
            if (r2 != 0) {
                billingManagerImpl$acknowledgePurchases$1.label -= Integer.MIN_VALUE;
                billingManagerImpl$acknowledgePurchases$12 = billingManagerImpl$acknowledgePurchases$1;
                Object obj3 = billingManagerImpl$acknowledgePurchases$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = 1;
                Object obj4 = null;
                switch (billingManagerImpl$acknowledgePurchases$12.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        String eventName = BillingClientEvents.PurchasesFlow.AcknowledgePurchases.INSTANCE.getEventName();
                        billingManagerImpl$acknowledgePurchases$12.L$0 = this;
                        billingManagerImpl$acknowledgePurchases$12.L$1 = list;
                        billingManagerImpl$acknowledgePurchases$12.label = 1;
                        obj = "purchase";
                        str = TAG;
                        if (trackEvent$default(this, eventName, null, null, billingManagerImpl$acknowledgePurchases$12, 6, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        billingManagerImpl3 = this;
                        it2 = list2.iterator();
                        if (!it2.hasNext()) {
                            purchase = it2.next();
                            if (purchase.getPurchaseState() == i2 && !purchase.isAcknowledged()) {
                                billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl3;
                                billingManagerImpl$acknowledgePurchases$12.L$1 = it2;
                                billingManagerImpl$acknowledgePurchases$12.L$2 = purchase;
                                billingManagerImpl$acknowledgePurchases$12.L$3 = obj4;
                                billingManagerImpl$acknowledgePurchases$12.label = 2;
                                if (AppLoggerInteractor.DefaultImpls.logEvent$default(billingManagerImpl3, new PurchaseEvent(BillingClientEvents.PurchasesFlow.AcknowledgePurchase.INSTANCE.getEventName(), LoggerLevel.INFO, MapsKt.mapOf(TuplesKt.to(obj, purchase.getOriginalJson())), str), false, billingManagerImpl$acknowledgePurchases$12, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                billingManagerImpl = billingManagerImpl3;
                                it = it2;
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion = Result.Companion;
                                    m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                                    m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                    if (m7274exceptionOrNullimpl != null) {
                                    }
                                }
                                Result.Companion companion2 = Result.Companion;
                                BillingManagerImpl billingManagerImpl5 = billingManagerImpl;
                                if (billingManagerImpl.getBillingClient().isReady()) {
                                    billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl;
                                    billingManagerImpl$acknowledgePurchases$12.L$1 = it;
                                    billingManagerImpl$acknowledgePurchases$12.L$2 = purchase;
                                    billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl;
                                    billingManagerImpl$acknowledgePurchases$12.label = 3;
                                    obj3 = billingManagerImpl.startOneTimeConnection(billingManagerImpl$acknowledgePurchases$12);
                                    if (obj3 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    billingManagerImpl2 = billingManagerImpl;
                                    try {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        billingManagerImpl = billingManagerImpl2;
                                        Result.Companion companion3 = Result.Companion;
                                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                        if (m7274exceptionOrNullimpl != null) {
                                        }
                                    }
                                    if (((BillingConnectionResult) obj3).isConnected()) {
                                        Iterator<? extends Purchase> it4 = it;
                                        purchase2 = purchase;
                                        billingManagerImpl4 = billingManagerImpl;
                                        it3 = it4;
                                        BillingClient billingClient = billingManagerImpl4.getBillingClient();
                                        String purchaseToken = purchase2.getPurchaseToken();
                                        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                        billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                                        billingManagerImpl$acknowledgePurchases$12.label = 7;
                                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient, purchaseToken, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                                        if (obj3 == coroutine_suspended) {
                                        }
                                        billingResult = (BillingResult) obj3;
                                        if (BillingclientKt.isSuccessful(billingResult)) {
                                        }
                                        purchase = purchase2;
                                        it = it3;
                                        billingManagerImpl = billingManagerImpl2;
                                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                        if (m7274exceptionOrNullimpl != null) {
                                        }
                                    } else {
                                        BillingClient billingClient2 = billingManagerImpl.getBillingClient();
                                        String purchaseToken2 = purchase.getPurchaseToken();
                                        Intrinsics.checkNotNullExpressionValue(purchaseToken2, "getPurchaseToken(...)");
                                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                        billingManagerImpl$acknowledgePurchases$12.L$1 = it;
                                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase;
                                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl;
                                        billingManagerImpl$acknowledgePurchases$12.label = 4;
                                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient2, purchaseToken2, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                                        if (obj3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        Iterator<? extends Purchase> it5 = it;
                                        purchase2 = purchase;
                                        billingManagerImpl4 = billingManagerImpl;
                                        it3 = it5;
                                        try {
                                        } catch (Throwable th3) {
                                            th = th3;
                                            purchase = purchase2;
                                            it = it3;
                                            billingManagerImpl = billingManagerImpl2;
                                            Result.Companion companion32 = Result.Companion;
                                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                            if (m7274exceptionOrNullimpl != null) {
                                            }
                                        }
                                        billingResult2 = (BillingResult) obj3;
                                        if (BillingclientKt.isSuccessful(billingResult2)) {
                                            billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                            billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                            billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                            billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                                            billingManagerImpl$acknowledgePurchases$12.label = 6;
                                            if (billingManagerImpl4.acknowledgePurchaseError(billingResult2, billingManagerImpl$acknowledgePurchases$12) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                            billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                            billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                            billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                                            billingManagerImpl$acknowledgePurchases$12.label = 5;
                                            if (AppLoggerInteractor.DefaultImpls.logEvent$default(billingManagerImpl4, new PurchaseEvent(BillingClientEvents.PurchasesFlow.AcknowledgePurchaseSuccessful.INSTANCE.getEventName(), LoggerLevel.INFO, MapsKt.mapOf(TuplesKt.to(obj, purchase2.getOriginalJson())), str), false, billingManagerImpl$acknowledgePurchases$12, 2, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        BillingClient billingClient3 = billingManagerImpl4.getBillingClient();
                                        String purchaseToken3 = purchase2.getPurchaseToken();
                                        Intrinsics.checkNotNullExpressionValue(purchaseToken3, "getPurchaseToken(...)");
                                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                        billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                                        billingManagerImpl$acknowledgePurchases$12.label = 7;
                                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient3, purchaseToken3, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                                        if (obj3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        billingResult = (BillingResult) obj3;
                                        if (BillingclientKt.isSuccessful(billingResult)) {
                                            billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                            billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                            billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                            billingManagerImpl$acknowledgePurchases$12.L$3 = obj4;
                                            billingManagerImpl$acknowledgePurchases$12.label = 8;
                                            if (AppLoggerInteractor.DefaultImpls.logEvent$default(billingManagerImpl4, new PurchaseEvent(BillingClientEvents.PurchasesFlow.AcknowledgePurchaseSuccessful.INSTANCE.getEventName(), LoggerLevel.INFO, MapsKt.mapOf(TuplesKt.to(obj, purchase2.getOriginalJson())), str), false, billingManagerImpl$acknowledgePurchases$12, 2, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                            billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                            billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                            billingManagerImpl$acknowledgePurchases$12.L$3 = obj4;
                                            billingManagerImpl$acknowledgePurchases$12.label = 9;
                                            if (billingManagerImpl4.acknowledgePurchaseError(billingResult, billingManagerImpl$acknowledgePurchases$12) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        purchase = purchase2;
                                        it = it3;
                                        billingManagerImpl = billingManagerImpl2;
                                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                        if (m7274exceptionOrNullimpl != null) {
                                            BillingManagerImpl billingManagerImpl6 = billingManagerImpl;
                                            String eventName2 = BillingClientEvents.PurchasesFlow.AcknowledgePurchasesError.INSTANCE.getEventName();
                                            LoggerLevel loggerLevel = LoggerLevel.WARNING;
                                            Pair[] pairArr = new Pair[3];
                                            pairArr[0] = TuplesKt.to(RESPONSE_CODE_KEY, String.valueOf(CustomErrorCode.ACKNOWLEDGE_PURCHASE.getCode()));
                                            String message = m7274exceptionOrNullimpl.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            i = 1;
                                            pairArr[1] = TuplesKt.to(ERROR_MESSAGE_KEY, message);
                                            pairArr[2] = TuplesKt.to(obj, purchase.getOriginalJson());
                                            billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl;
                                            billingManagerImpl$acknowledgePurchases$12.L$1 = it;
                                            billingManagerImpl$acknowledgePurchases$12.L$2 = m7271constructorimpl;
                                            obj2 = null;
                                            billingManagerImpl$acknowledgePurchases$12.L$3 = null;
                                            billingManagerImpl$acknowledgePurchases$12.label = 10;
                                            if (AppLoggerInteractor.DefaultImpls.logEvent$default(billingManagerImpl6, new PurchaseEvent(eventName2, loggerLevel, MapsKt.mapOf(pairArr), str), false, billingManagerImpl$acknowledgePurchases$12, 2, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            it2 = it;
                                            billingManagerImpl3 = billingManagerImpl;
                                            obj4 = obj2;
                                            i2 = i;
                                            if (!it2.hasNext()) {
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            it2 = it;
                                            billingManagerImpl3 = billingManagerImpl;
                                            if (!it2.hasNext()) {
                                            }
                                        }
                                    }
                                } else {
                                    billingManagerImpl2 = billingManagerImpl;
                                    it3 = it;
                                    purchase2 = purchase;
                                    billingManagerImpl4 = billingManagerImpl2;
                                    BillingClient billingClient32 = billingManagerImpl4.getBillingClient();
                                    String purchaseToken32 = purchase2.getPurchaseToken();
                                    Intrinsics.checkNotNullExpressionValue(purchaseToken32, "getPurchaseToken(...)");
                                    billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                                    billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                                    billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                                    billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                                    billingManagerImpl$acknowledgePurchases$12.label = 7;
                                    obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient32, purchaseToken32, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                                    if (obj3 == coroutine_suspended) {
                                    }
                                    billingResult = (BillingResult) obj3;
                                    if (BillingclientKt.isSuccessful(billingResult)) {
                                    }
                                    purchase = purchase2;
                                    it = it3;
                                    billingManagerImpl = billingManagerImpl2;
                                    m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                                    m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                                    if (m7274exceptionOrNullimpl != null) {
                                    }
                                }
                            }
                            i = i2;
                            obj2 = obj4;
                            obj4 = obj2;
                            i2 = i;
                            if (!it2.hasNext()) {
                            }
                        }
                        break;
                    case 1:
                        list2 = (List) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl3 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        it2 = list2.iterator();
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 2:
                        purchase = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        Result.Companion companion22 = Result.Companion;
                        BillingManagerImpl billingManagerImpl52 = billingManagerImpl;
                        if (billingManagerImpl.getBillingClient().isReady()) {
                        }
                        break;
                    case 3:
                        BillingManagerImpl billingManagerImpl7 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$3;
                        Purchase purchase3 = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        Iterator<? extends Purchase> it6 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        billingManagerImpl = billingManagerImpl7;
                        purchase = purchase3;
                        it = it6;
                        if (((BillingConnectionResult) obj3).isConnected()) {
                        }
                        break;
                    case 4:
                        billingManagerImpl4 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$3;
                        purchase2 = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it3 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        billingResult2 = (BillingResult) obj3;
                        if (BillingclientKt.isSuccessful(billingResult2)) {
                        }
                        BillingClient billingClient322 = billingManagerImpl4.getBillingClient();
                        String purchaseToken322 = purchase2.getPurchaseToken();
                        Intrinsics.checkNotNullExpressionValue(purchaseToken322, "getPurchaseToken(...)");
                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                        billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                        billingManagerImpl$acknowledgePurchases$12.label = 7;
                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient322, purchaseToken322, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                        if (obj3 == coroutine_suspended) {
                        }
                        billingResult = (BillingResult) obj3;
                        if (BillingclientKt.isSuccessful(billingResult)) {
                        }
                        purchase = purchase2;
                        it = it3;
                        billingManagerImpl = billingManagerImpl2;
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 5:
                        billingManagerImpl4 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$3;
                        purchase2 = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it3 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        BillingClient billingClient3222 = billingManagerImpl4.getBillingClient();
                        String purchaseToken3222 = purchase2.getPurchaseToken();
                        Intrinsics.checkNotNullExpressionValue(purchaseToken3222, "getPurchaseToken(...)");
                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                        billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                        billingManagerImpl$acknowledgePurchases$12.label = 7;
                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient3222, purchaseToken3222, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                        if (obj3 == coroutine_suspended) {
                        }
                        billingResult = (BillingResult) obj3;
                        if (BillingclientKt.isSuccessful(billingResult)) {
                        }
                        purchase = purchase2;
                        it = it3;
                        billingManagerImpl = billingManagerImpl2;
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 6:
                        billingManagerImpl4 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$3;
                        purchase2 = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it3 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        BillingClient billingClient32222 = billingManagerImpl4.getBillingClient();
                        String purchaseToken32222 = purchase2.getPurchaseToken();
                        Intrinsics.checkNotNullExpressionValue(purchaseToken32222, "getPurchaseToken(...)");
                        billingManagerImpl$acknowledgePurchases$12.L$0 = billingManagerImpl2;
                        billingManagerImpl$acknowledgePurchases$12.L$1 = it3;
                        billingManagerImpl$acknowledgePurchases$12.L$2 = purchase2;
                        billingManagerImpl$acknowledgePurchases$12.L$3 = billingManagerImpl4;
                        billingManagerImpl$acknowledgePurchases$12.label = 7;
                        obj3 = BillingclientKt.acknowledgePurchaseWithRetry$default(billingClient32222, purchaseToken32222, 0, 0L, 0, billingManagerImpl$acknowledgePurchases$12, 14, null);
                        if (obj3 == coroutine_suspended) {
                        }
                        billingResult = (BillingResult) obj3;
                        if (BillingclientKt.isSuccessful(billingResult)) {
                        }
                        purchase = purchase2;
                        it = it3;
                        billingManagerImpl = billingManagerImpl2;
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 7:
                        billingManagerImpl4 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$3;
                        purchase2 = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it3 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        billingResult = (BillingResult) obj3;
                        if (BillingclientKt.isSuccessful(billingResult)) {
                        }
                        purchase = purchase2;
                        it = it3;
                        billingManagerImpl = billingManagerImpl2;
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 8:
                        purchase = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            obj = "purchase";
                            str = TAG;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = "purchase";
                            str = TAG;
                            Result.Companion companion322 = Result.Companion;
                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                            m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                            if (m7274exceptionOrNullimpl != null) {
                            }
                        }
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 9:
                        purchase = (Purchase) billingManagerImpl$acknowledgePurchases$12.L$2;
                        it = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        billingManagerImpl = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj = "purchase";
                        str = TAG;
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                        }
                        break;
                    case 10:
                        Object obj5 = billingManagerImpl$acknowledgePurchases$12.L$2;
                        billingManagerImpl3 = (BillingManagerImpl) billingManagerImpl$acknowledgePurchases$12.L$0;
                        ResultKt.throwOnFailure(obj3);
                        it2 = (Iterator) billingManagerImpl$acknowledgePurchases$12.L$1;
                        obj = "purchase";
                        str = TAG;
                        i = i2;
                        obj2 = obj4;
                        obj4 = obj2;
                        i2 = i;
                        if (!it2.hasNext()) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        billingManagerImpl$acknowledgePurchases$1 = new BillingManagerImpl$acknowledgePurchases$1(this, continuation);
        billingManagerImpl$acknowledgePurchases$12 = billingManagerImpl$acknowledgePurchases$1;
        Object obj32 = billingManagerImpl$acknowledgePurchases$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i22 = 1;
        Object obj42 = null;
        switch (billingManagerImpl$acknowledgePurchases$12.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acknowledgePurchaseError(BillingResult billingResult, Continuation<? super Unit> continuation) {
        int responseCode = billingResult.getResponseCode();
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this, new PurchaseEvent(BillingClientEvents.PurchasesFlow.AcknowledgePurchasesError.INSTANCE.getEventName(), LoggerLevel.ERROR, MapsKt.mapOf(TuplesKt.to(RESPONSE_CODE_KEY, String.valueOf(responseCode)), TuplesKt.to(ERROR_MESSAGE_KEY, this.billingResponseCodeMapper.map(responseCode))), TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    private final <T> Object tryConnectedIfNeed(Function1<? super Boolean, ? extends T> function1, Continuation<? super T> continuation) {
        if (!getBillingClient().isReady()) {
            InlineMarker.mark(0);
            Object startOneTimeConnection = startOneTimeConnection(continuation);
            InlineMarker.mark(1);
            function1.invoke(Boolean.valueOf(((BillingConnectionResult) startOneTimeConnection).isConnected()));
        }
        return function1.invoke(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startOneTimeConnection(Continuation<? super BillingConnectionResult> continuation) {
        BillingManagerImpl$startOneTimeConnection$1 billingManagerImpl$startOneTimeConnection$1;
        Object coroutine_suspended;
        int i;
        BillingManagerImpl billingManagerImpl;
        Object result;
        if (continuation instanceof BillingManagerImpl$startOneTimeConnection$1) {
            billingManagerImpl$startOneTimeConnection$1 = (BillingManagerImpl$startOneTimeConnection$1) continuation;
            if ((billingManagerImpl$startOneTimeConnection$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$startOneTimeConnection$1.label -= Integer.MIN_VALUE;
                Object obj = billingManagerImpl$startOneTimeConnection$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$startOneTimeConnection$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String eventName = BillingClientEvents.StartBillingConnection.StartConnection.INSTANCE.getEventName();
                    billingManagerImpl$startOneTimeConnection$1.L$0 = this;
                    billingManagerImpl$startOneTimeConnection$1.label = 1;
                    if (trackEvent$default(this, eventName, null, null, billingManagerImpl$startOneTimeConnection$1, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingManagerImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            BillingConnectionResult billingConnectionResult = (BillingConnectionResult) billingManagerImpl$startOneTimeConnection$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return billingConnectionResult;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$startOneTimeConnection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BillingConnectionResult billingConnectionResult2 = (BillingConnectionResult) obj;
                    billingManagerImpl$startOneTimeConnection$1.L$0 = billingConnectionResult2;
                    billingManagerImpl$startOneTimeConnection$1.label = 3;
                    return billingManagerImpl.trackConnectionEvent(billingConnectionResult2, billingManagerImpl$startOneTimeConnection$1) != coroutine_suspended ? coroutine_suspended : billingConnectionResult2;
                } else {
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$startOneTimeConnection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingManagerImpl$startOneTimeConnection$1.L$0 = billingManagerImpl;
                billingManagerImpl$startOneTimeConnection$1.label = 2;
                BillingManagerImpl$startOneTimeConnection$1 billingManagerImpl$startOneTimeConnection$12 = billingManagerImpl$startOneTimeConnection$1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$startOneTimeConnection$12), 1);
                cancellableContinuationImpl.initCancellability();
                final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                billingManagerImpl.getBillingClient().startConnection(new BillingClientStateListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$startOneTimeConnection$result$1$1
                    @Override // com.android.billingclient.api.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResult billingResult) {
                        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        if (cancellableContinuationImpl2.isActive()) {
                            if (billingResult.getResponseCode() == 0) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingConnected.INSTANCE));
                                return;
                            }
                            Result.Companion companion2 = Result.Companion;
                            cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(new BillingConnectionResult.BillingConnectionError(billingResult)));
                        }
                    }

                    @Override // com.android.billingclient.api.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        if (cancellableContinuationImpl2.isActive()) {
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingServiceDisconnected.INSTANCE));
                        }
                    }
                });
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(billingManagerImpl$startOneTimeConnection$12);
                }
                if (result != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = result;
                BillingConnectionResult billingConnectionResult22 = (BillingConnectionResult) obj;
                billingManagerImpl$startOneTimeConnection$1.L$0 = billingConnectionResult22;
                billingManagerImpl$startOneTimeConnection$1.label = 3;
                if (billingManagerImpl.trackConnectionEvent(billingConnectionResult22, billingManagerImpl$startOneTimeConnection$1) != coroutine_suspended) {
                }
            }
        }
        billingManagerImpl$startOneTimeConnection$1 = new BillingManagerImpl$startOneTimeConnection$1(this, continuation);
        Object obj2 = billingManagerImpl$startOneTimeConnection$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$startOneTimeConnection$1.label;
        if (i != 0) {
        }
        billingManagerImpl$startOneTimeConnection$1.L$0 = billingManagerImpl;
        billingManagerImpl$startOneTimeConnection$1.label = 2;
        BillingManagerImpl$startOneTimeConnection$1 billingManagerImpl$startOneTimeConnection$122 = billingManagerImpl$startOneTimeConnection$1;
        CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$startOneTimeConnection$122), 1);
        cancellableContinuationImpl3.initCancellability();
        final CancellableContinuation<? super BillingConnectionResult> cancellableContinuationImpl22 = cancellableContinuationImpl3;
        billingManagerImpl.getBillingClient().startConnection(new BillingClientStateListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$startOneTimeConnection$result$1$1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (cancellableContinuationImpl22.isActive()) {
                    if (billingResult.getResponseCode() == 0) {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl22.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingConnected.INSTANCE));
                        return;
                    }
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl22.resumeWith(Result.m7271constructorimpl(new BillingConnectionResult.BillingConnectionError(billingResult)));
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                if (cancellableContinuationImpl22.isActive()) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl22.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingServiceDisconnected.INSTANCE));
                }
            }
        });
        result = cancellableContinuationImpl3.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (result != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackConnectionEvent(BillingConnectionResult billingConnectionResult, Continuation<? super Unit> continuation) {
        if (Intrinsics.areEqual(billingConnectionResult, BillingConnectionResult.BillingConnected.INSTANCE)) {
            Object trackEvent$default = trackEvent$default(this, BillingClientEvents.StartBillingConnection.Connected.INSTANCE.getEventName(), null, null, continuation, 6, null);
            return trackEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trackEvent$default : Unit.INSTANCE;
        } else if (billingConnectionResult instanceof BillingConnectionResult.BillingConnectionError) {
            Object handleBillingError$default = handleBillingError$default(this, ((BillingConnectionResult.BillingConnectionError) billingConnectionResult).getBillingResult(), null, continuation, 2, null);
            return handleBillingError$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? handleBillingError$default : Unit.INSTANCE;
        } else if (Intrinsics.areEqual(billingConnectionResult, BillingConnectionResult.BillingServiceDisconnected.INSTANCE)) {
            Object trackEvent$default2 = trackEvent$default(this, BillingClientEvents.StartBillingConnection.ServiceDisconnected.INSTANCE.getEventName(), null, LoggerLevel.WARNING, continuation, 2, null);
            return trackEvent$default2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trackEvent$default2 : Unit.INSTANCE;
        } else {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // com.ifiend.billing.impl.manager.BillingManager
    /* renamed from: startBillingConnection-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6784startBillingConnectionIoAF18A(Continuation<? super Result<Unit>> continuation) {
        BillingManagerImpl$startBillingConnection$1 billingManagerImpl$startBillingConnection$1;
        int i;
        BillingManagerImpl billingManagerImpl;
        if (continuation instanceof BillingManagerImpl$startBillingConnection$1) {
            billingManagerImpl$startBillingConnection$1 = (BillingManagerImpl$startBillingConnection$1) continuation;
            if ((billingManagerImpl$startBillingConnection$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$startBillingConnection$1.label -= Integer.MIN_VALUE;
                BillingManagerImpl$startBillingConnection$1 billingManagerImpl$startBillingConnection$12 = billingManagerImpl$startBillingConnection$1;
                Object obj = billingManagerImpl$startBillingConnection$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$startBillingConnection$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getBillingClient().isReady()) {
                        Result.Companion companion = Result.Companion;
                        return Result.m7271constructorimpl(Unit.INSTANCE);
                    }
                    billingManagerImpl$startBillingConnection$12.L$0 = this;
                    billingManagerImpl$startBillingConnection$12.label = 1;
                    if (connectToBillingClientWithRetry$default(this, 0, 0L, billingManagerImpl$startBillingConnection$12, 3, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingManagerImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$startBillingConnection$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!billingManagerImpl.getBillingClient().isReady()) {
                    Result.Companion companion2 = Result.Companion;
                    return Result.m7271constructorimpl(Unit.INSTANCE);
                }
                String map = billingManagerImpl.billingResponseCodeMapper.map(CustomErrorCode.RETRY_SERVICE_DISCONNECTED.getCode());
                Result.Companion companion3 = Result.Companion;
                return Result.m7271constructorimpl(ResultKt.createFailure(new BillingManagerException.BillingClientCanNotConnectionException(map)));
            }
        }
        billingManagerImpl$startBillingConnection$1 = new BillingManagerImpl$startBillingConnection$1(this, continuation);
        BillingManagerImpl$startBillingConnection$1 billingManagerImpl$startBillingConnection$122 = billingManagerImpl$startBillingConnection$1;
        Object obj2 = billingManagerImpl$startBillingConnection$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$startBillingConnection$122.label;
        if (i != 0) {
        }
        if (!billingManagerImpl.getBillingClient().isReady()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101 A[RETURN] */
    @Override // com.ifiend.billing.impl.manager.BillingManager
    /* renamed from: launchBillingFlow-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6783launchBillingFlow0E7RQCE(Activity activity, BillingFlowParams billingFlowParams, Continuation<? super Result<Unit>> continuation) {
        BillingManagerImpl$launchBillingFlow$1 billingManagerImpl$launchBillingFlow$1;
        BillingManagerImpl$launchBillingFlow$1 billingManagerImpl$launchBillingFlow$12;
        Object coroutine_suspended;
        int i;
        Activity activity2;
        BillingFlowParams billingFlowParams2;
        BillingManagerImpl billingManagerImpl;
        Activity activity3;
        BillingFlowParams billingFlowParams3;
        String eventName;
        if (continuation instanceof BillingManagerImpl$launchBillingFlow$1) {
            billingManagerImpl$launchBillingFlow$1 = (BillingManagerImpl$launchBillingFlow$1) continuation;
            if ((billingManagerImpl$launchBillingFlow$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$launchBillingFlow$1.label -= Integer.MIN_VALUE;
                billingManagerImpl$launchBillingFlow$12 = billingManagerImpl$launchBillingFlow$1;
                Object obj = billingManagerImpl$launchBillingFlow$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$launchBillingFlow$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String eventName2 = BillingClientEvents.LaunchBillingFlow.Launch.INSTANCE.getEventName();
                    billingManagerImpl$launchBillingFlow$12.L$0 = this;
                    activity2 = activity;
                    billingManagerImpl$launchBillingFlow$12.L$1 = activity2;
                    billingFlowParams2 = billingFlowParams;
                    billingManagerImpl$launchBillingFlow$12.L$2 = billingFlowParams2;
                    billingManagerImpl$launchBillingFlow$12.label = 1;
                    if (trackEvent$default(this, eventName2, null, null, billingManagerImpl$launchBillingFlow$12, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingManagerImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion = Result.Companion;
                            return Result.m7271constructorimpl(ResultKt.createFailure(BillingManagerException.BillingClientNotReadyException.INSTANCE));
                        } else if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion2 = Result.Companion;
                            return Result.m7271constructorimpl(Unit.INSTANCE);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    billingFlowParams3 = (BillingFlowParams) billingManagerImpl$launchBillingFlow$12.L$2;
                    activity3 = (Activity) billingManagerImpl$launchBillingFlow$12.L$1;
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$launchBillingFlow$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((BillingConnectionResult) obj).isConnected()) {
                        String eventName3 = BillingClientEvents.LaunchBillingFlow.BillingNotReady.INSTANCE.getEventName();
                        LoggerLevel loggerLevel = LoggerLevel.WARNING;
                        billingManagerImpl$launchBillingFlow$12.L$0 = null;
                        billingManagerImpl$launchBillingFlow$12.L$1 = null;
                        billingManagerImpl$launchBillingFlow$12.L$2 = null;
                        billingManagerImpl$launchBillingFlow$12.label = 3;
                        if (trackEvent$default(billingManagerImpl, eventName3, null, loggerLevel, billingManagerImpl$launchBillingFlow$12, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result.Companion companion3 = Result.Companion;
                        return Result.m7271constructorimpl(ResultKt.createFailure(BillingManagerException.BillingClientNotReadyException.INSTANCE));
                    }
                    billingFlowParams2 = billingFlowParams3;
                    activity2 = activity3;
                    billingManagerImpl.getBillingClient().launchBillingFlow(activity2, billingFlowParams2);
                    eventName = BillingClientEvents.LaunchBillingFlow.Launched.INSTANCE.getEventName();
                    billingManagerImpl$launchBillingFlow$12.L$0 = null;
                    billingManagerImpl$launchBillingFlow$12.L$1 = null;
                    billingManagerImpl$launchBillingFlow$12.L$2 = null;
                    billingManagerImpl$launchBillingFlow$12.label = 4;
                    if (trackEvent$default(billingManagerImpl, eventName, null, null, billingManagerImpl$launchBillingFlow$12, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result.Companion companion22 = Result.Companion;
                    return Result.m7271constructorimpl(Unit.INSTANCE);
                } else {
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$launchBillingFlow$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    billingFlowParams2 = (BillingFlowParams) billingManagerImpl$launchBillingFlow$12.L$2;
                    activity2 = (Activity) billingManagerImpl$launchBillingFlow$12.L$1;
                }
                if (!billingManagerImpl.getBillingClient().isReady()) {
                    billingManagerImpl$launchBillingFlow$12.L$0 = billingManagerImpl;
                    billingManagerImpl$launchBillingFlow$12.L$1 = activity2;
                    billingManagerImpl$launchBillingFlow$12.L$2 = billingFlowParams2;
                    billingManagerImpl$launchBillingFlow$12.label = 2;
                    obj = billingManagerImpl.startOneTimeConnection(billingManagerImpl$launchBillingFlow$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    activity3 = activity2;
                    billingFlowParams3 = billingFlowParams2;
                    if (((BillingConnectionResult) obj).isConnected()) {
                    }
                }
                billingManagerImpl.getBillingClient().launchBillingFlow(activity2, billingFlowParams2);
                eventName = BillingClientEvents.LaunchBillingFlow.Launched.INSTANCE.getEventName();
                billingManagerImpl$launchBillingFlow$12.L$0 = null;
                billingManagerImpl$launchBillingFlow$12.L$1 = null;
                billingManagerImpl$launchBillingFlow$12.L$2 = null;
                billingManagerImpl$launchBillingFlow$12.label = 4;
                if (trackEvent$default(billingManagerImpl, eventName, null, null, billingManagerImpl$launchBillingFlow$12, 6, null) == coroutine_suspended) {
                }
                Result.Companion companion222 = Result.Companion;
                return Result.m7271constructorimpl(Unit.INSTANCE);
            }
        }
        billingManagerImpl$launchBillingFlow$1 = new BillingManagerImpl$launchBillingFlow$1(this, continuation);
        billingManagerImpl$launchBillingFlow$12 = billingManagerImpl$launchBillingFlow$1;
        Object obj2 = billingManagerImpl$launchBillingFlow$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$launchBillingFlow$12.label;
        if (i != 0) {
        }
        if (!billingManagerImpl.getBillingClient().isReady()) {
        }
        billingManagerImpl.getBillingClient().launchBillingFlow(activity2, billingFlowParams2);
        eventName = BillingClientEvents.LaunchBillingFlow.Launched.INSTANCE.getEventName();
        billingManagerImpl$launchBillingFlow$12.L$0 = null;
        billingManagerImpl$launchBillingFlow$12.L$1 = null;
        billingManagerImpl$launchBillingFlow$12.L$2 = null;
        billingManagerImpl$launchBillingFlow$12.label = 4;
        if (trackEvent$default(billingManagerImpl, eventName, null, null, billingManagerImpl$launchBillingFlow$12, 6, null) == coroutine_suspended) {
        }
        Result.Companion companion2222 = Result.Companion;
        return Result.m7271constructorimpl(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // com.ifiend.billing.impl.manager.BillingManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object endConnect(Continuation<? super Unit> continuation) {
        BillingManagerImpl$endConnect$1 billingManagerImpl$endConnect$1;
        int i;
        BillingManagerImpl billingManagerImpl;
        if (continuation instanceof BillingManagerImpl$endConnect$1) {
            billingManagerImpl$endConnect$1 = (BillingManagerImpl$endConnect$1) continuation;
            if ((billingManagerImpl$endConnect$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$endConnect$1.label -= Integer.MIN_VALUE;
                BillingManagerImpl$endConnect$1 billingManagerImpl$endConnect$12 = billingManagerImpl$endConnect$1;
                Object obj = billingManagerImpl$endConnect$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$endConnect$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getBillingClient().isReady()) {
                        String eventName = BillingClientEvents.EndBillingConnection.INSTANCE.getEventName();
                        billingManagerImpl$endConnect$12.L$0 = this;
                        billingManagerImpl$endConnect$12.label = 1;
                        if (trackEvent$default(this, eventName, null, null, billingManagerImpl$endConnect$12, 6, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingManagerImpl = this;
                    } else {
                        billingManagerImpl = this;
                        if (billingManagerImpl.billing.isInitialized()) {
                            billingManagerImpl.billing.reset();
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$endConnect$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingManagerImpl.getBillingClient().endConnection();
                if (billingManagerImpl.billing.isInitialized()) {
                }
                return Unit.INSTANCE;
            }
        }
        billingManagerImpl$endConnect$1 = new BillingManagerImpl$endConnect$1(this, continuation);
        BillingManagerImpl$endConnect$1 billingManagerImpl$endConnect$122 = billingManagerImpl$endConnect$1;
        Object obj2 = billingManagerImpl$endConnect$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$endConnect$122.label;
        if (i != 0) {
        }
        billingManagerImpl.getBillingClient().endConnection();
        if (billingManagerImpl.billing.isInitialized()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[LOOP:0: B:46:0x0163->B:48:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    @Override // com.ifiend.billing.impl.manager.BillingManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getProducts(List<String> list, String str, Continuation<? super BillingProductsResult> continuation) {
        BillingManagerImpl$getProducts$1 billingManagerImpl$getProducts$1;
        int i;
        List<String> list2;
        String str2;
        BillingManagerImpl billingManagerImpl;
        Object startOneTimeConnection;
        List<String> list3;
        BillingManagerImpl billingManagerImpl2;
        Pair<BillingResult, ? extends List<ProductDetails>> pair;
        String str3;
        Pair<BillingResult, ? extends List<ProductDetails>> pair2;
        BillingManagerImpl billingManagerImpl3;
        Pair<BillingResult, ? extends List<ProductDetails>> pair3;
        Pair<BillingResult, ? extends List<ProductDetails>> pair4;
        if (continuation instanceof BillingManagerImpl$getProducts$1) {
            billingManagerImpl$getProducts$1 = (BillingManagerImpl$getProducts$1) continuation;
            if ((billingManagerImpl$getProducts$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$getProducts$1.label -= Integer.MIN_VALUE;
                Object obj = billingManagerImpl$getProducts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$getProducts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getBillingClient().isReady()) {
                        list2 = list;
                        str2 = str;
                        billingManagerImpl = this;
                        List<String> list4 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                        while (r1.hasNext()) {
                        }
                        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        billingManagerImpl$getProducts$1.L$0 = billingManagerImpl;
                        billingManagerImpl$getProducts$1.L$1 = str2;
                        billingManagerImpl$getProducts$1.L$2 = null;
                        billingManagerImpl$getProducts$1.L$3 = null;
                        billingManagerImpl$getProducts$1.label = 4;
                        obj = billingManagerImpl.queryProductDetailsAsync(build, billingManagerImpl$getProducts$1);
                        if (obj != coroutine_suspended) {
                        }
                    } else {
                        billingManagerImpl$getProducts$1.L$0 = this;
                        list2 = list;
                        billingManagerImpl$getProducts$1.L$1 = list2;
                        str2 = str;
                        billingManagerImpl$getProducts$1.L$2 = str2;
                        billingManagerImpl$getProducts$1.label = 1;
                        startOneTimeConnection = startOneTimeConnection(billingManagerImpl$getProducts$1);
                        if (startOneTimeConnection == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingManagerImpl = this;
                    }
                } else if (i == 1) {
                    str2 = (String) billingManagerImpl$getProducts$1.L$2;
                    List<String> list5 = (List) billingManagerImpl$getProducts$1.L$1;
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$getProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    startOneTimeConnection = obj;
                    list2 = list5;
                } else if (i == 2) {
                    str2 = (String) billingManagerImpl$getProducts$1.L$2;
                    list3 = (List) billingManagerImpl$getProducts$1.L$1;
                    billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$getProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    pair = (Pair) obj;
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl2;
                    billingManagerImpl$getProducts$1.L$1 = list3;
                    billingManagerImpl$getProducts$1.L$2 = str2;
                    billingManagerImpl$getProducts$1.L$3 = pair;
                    billingManagerImpl$getProducts$1.label = 3;
                    if (billingManagerImpl2.getProductsTrackEvent(pair, str2, billingManagerImpl$getProducts$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    pair2 = pair;
                    new BillingProductsResult(BillingclientKt.isSuccessful(pair2.getFirst()), pair2.getSecond());
                    str2 = str3;
                    list2 = list3;
                    billingManagerImpl = billingManagerImpl2;
                    List<String> list42 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
                    while (r1.hasNext()) {
                    }
                    QueryProductDetailsParams build2 = QueryProductDetailsParams.newBuilder().setProductList(arrayList2).build();
                    Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl;
                    billingManagerImpl$getProducts$1.L$1 = str2;
                    billingManagerImpl$getProducts$1.L$2 = null;
                    billingManagerImpl$getProducts$1.L$3 = null;
                    billingManagerImpl$getProducts$1.label = 4;
                    obj = billingManagerImpl.queryProductDetailsAsync(build2, billingManagerImpl$getProducts$1);
                    if (obj != coroutine_suspended) {
                    }
                } else if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            pair4 = (Pair) billingManagerImpl$getProducts$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return new BillingProductsResult(BillingclientKt.isSuccessful(pair4.getFirst()), pair4.getSecond());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) billingManagerImpl$getProducts$1.L$1;
                    billingManagerImpl3 = (BillingManagerImpl) billingManagerImpl$getProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    pair3 = (Pair) obj;
                    billingManagerImpl$getProducts$1.L$0 = pair3;
                    billingManagerImpl$getProducts$1.L$1 = null;
                    billingManagerImpl$getProducts$1.label = 5;
                    if (billingManagerImpl3.getProductsTrackEvent(pair3, str2, billingManagerImpl$getProducts$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pair4 = pair3;
                    return new BillingProductsResult(BillingclientKt.isSuccessful(pair4.getFirst()), pair4.getSecond());
                } else {
                    pair2 = (Pair) billingManagerImpl$getProducts$1.L$3;
                    str3 = (String) billingManagerImpl$getProducts$1.L$2;
                    list3 = (List) billingManagerImpl$getProducts$1.L$1;
                    billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$getProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    new BillingProductsResult(BillingclientKt.isSuccessful(pair2.getFirst()), pair2.getSecond());
                    str2 = str3;
                    list2 = list3;
                    billingManagerImpl = billingManagerImpl2;
                    List<String> list422 = list2;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list422, 10));
                    for (String str4 : list422) {
                        arrayList22.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str4).setProductType(str2).build());
                    }
                    QueryProductDetailsParams build22 = QueryProductDetailsParams.newBuilder().setProductList(arrayList22).build();
                    Intrinsics.checkNotNullExpressionValue(build22, "build(...)");
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl;
                    billingManagerImpl$getProducts$1.L$1 = str2;
                    billingManagerImpl$getProducts$1.L$2 = null;
                    billingManagerImpl$getProducts$1.L$3 = null;
                    billingManagerImpl$getProducts$1.label = 4;
                    obj = billingManagerImpl.queryProductDetailsAsync(build22, billingManagerImpl$getProducts$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingManagerImpl3 = billingManagerImpl;
                    pair3 = (Pair) obj;
                    billingManagerImpl$getProducts$1.L$0 = pair3;
                    billingManagerImpl$getProducts$1.L$1 = null;
                    billingManagerImpl$getProducts$1.label = 5;
                    if (billingManagerImpl3.getProductsTrackEvent(pair3, str2, billingManagerImpl$getProducts$1) != coroutine_suspended) {
                    }
                }
                if (((BillingConnectionResult) startOneTimeConnection).isConnected()) {
                    new BillingProductsResult(false, CollectionsKt.emptyList());
                    List<String> list4222 = list2;
                    ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4222, 10));
                    while (r1.hasNext()) {
                    }
                    QueryProductDetailsParams build222 = QueryProductDetailsParams.newBuilder().setProductList(arrayList222).build();
                    Intrinsics.checkNotNullExpressionValue(build222, "build(...)");
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl;
                    billingManagerImpl$getProducts$1.L$1 = str2;
                    billingManagerImpl$getProducts$1.L$2 = null;
                    billingManagerImpl$getProducts$1.L$3 = null;
                    billingManagerImpl$getProducts$1.label = 4;
                    obj = billingManagerImpl.queryProductDetailsAsync(build222, billingManagerImpl$getProducts$1);
                    if (obj != coroutine_suspended) {
                    }
                } else {
                    List<String> list6 = list2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    for (String str5 : list6) {
                        arrayList3.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str5).setProductType(str2).build());
                    }
                    QueryProductDetailsParams build3 = QueryProductDetailsParams.newBuilder().setProductList(arrayList3).build();
                    Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl;
                    billingManagerImpl$getProducts$1.L$1 = list2;
                    billingManagerImpl$getProducts$1.L$2 = str2;
                    billingManagerImpl$getProducts$1.label = 2;
                    Object queryProductDetailsAsync = billingManagerImpl.queryProductDetailsAsync(build3, billingManagerImpl$getProducts$1);
                    if (queryProductDetailsAsync == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                    obj = queryProductDetailsAsync;
                    billingManagerImpl2 = billingManagerImpl;
                    pair = (Pair) obj;
                    billingManagerImpl$getProducts$1.L$0 = billingManagerImpl2;
                    billingManagerImpl$getProducts$1.L$1 = list3;
                    billingManagerImpl$getProducts$1.L$2 = str2;
                    billingManagerImpl$getProducts$1.L$3 = pair;
                    billingManagerImpl$getProducts$1.label = 3;
                    if (billingManagerImpl2.getProductsTrackEvent(pair, str2, billingManagerImpl$getProducts$1) != coroutine_suspended) {
                    }
                }
            }
        }
        billingManagerImpl$getProducts$1 = new BillingManagerImpl$getProducts$1(this, continuation);
        Object obj2 = billingManagerImpl$getProducts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$getProducts$1.label;
        if (i != 0) {
        }
        if (((BillingConnectionResult) startOneTimeConnection).isConnected()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getProductsTrackEvent(Pair<BillingResult, ? extends List<ProductDetails>> pair, String str, Continuation<? super Unit> continuation) {
        if (BillingclientKt.isSuccessful(pair.getFirst())) {
            Object trackEvent$default = trackEvent$default(this, BillingClientEvents.GetProducts.QueryProductDetails.INSTANCE.getEventName(), MapsKt.mapOf(TuplesKt.to(PRODUCTS_TYPE_KEY, str), TuplesKt.to(PRODUCTS_KEY, CollectionsKt.joinToString$default(pair.getSecond(), null, null, null, 0, null, BillingManagerImpl$getProductsTrackEvent$2.INSTANCE, 31, null))), null, continuation, 4, null);
            return trackEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trackEvent$default : Unit.INSTANCE;
        }
        Object handleBillingError$default = handleBillingError$default(this, pair.getFirst(), null, continuation, 2, null);
        return handleBillingError$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? handleBillingError$default : Unit.INSTANCE;
    }

    static /* synthetic */ Object handleBillingError$default(BillingManagerImpl billingManagerImpl, BillingResult billingResult, LoggerLevel loggerLevel, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            loggerLevel = LoggerLevel.ERROR;
        }
        return billingManagerImpl.handleBillingError(billingResult, loggerLevel, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleBillingError(BillingResult billingResult, LoggerLevel loggerLevel, Continuation<? super Unit> continuation) {
        String eventName = BillingClientEvents.BillingError.INSTANCE.getEventName();
        int responseCode = billingResult.getResponseCode();
        String map = this.billingResponseCodeMapper.map(billingResult.getResponseCode());
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        Object trackErrorEvent = trackErrorEvent(eventName, responseCode, map, debugMessage, loggerLevel, continuation);
        return trackErrorEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trackErrorEvent : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object trackEvent$default(BillingManagerImpl billingManagerImpl, String str, Map map, LoggerLevel loggerLevel, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            loggerLevel = LoggerLevel.INFO;
        }
        return billingManagerImpl.trackEvent(str, map, loggerLevel, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackEvent(String str, Map<String, String> map, LoggerLevel loggerLevel, Continuation<? super Unit> continuation) {
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this, new PurchaseEvent(str, loggerLevel, map, TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    static /* synthetic */ Object trackErrorEvent$default(BillingManagerImpl billingManagerImpl, String str, int i, String str2, String str3, LoggerLevel loggerLevel, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            loggerLevel = LoggerLevel.ERROR;
        }
        return billingManagerImpl.trackErrorEvent(str, i, str2, str3, loggerLevel, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackErrorEvent(String str, int i, String str2, String str3, LoggerLevel loggerLevel, Continuation<? super Unit> continuation) {
        if (i == 1) {
            loggerLevel = LoggerLevel.WARNING;
        }
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(this, new PurchaseEvent(str, loggerLevel, MapsKt.mapOf(TuplesKt.to(RESPONSE_CODE_KEY, String.valueOf(i)), TuplesKt.to(ERROR_MESSAGE_KEY, str2), TuplesKt.to(ERROR_DEBUG_MESSAGE_KEY, str3)), TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0139 -> B:44:0x0140). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x014b -> B:27:0x00c2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object connectToBillingClientWithRetry(int i, long j, Continuation<? super Boolean> continuation) {
        BillingManagerImpl$connectToBillingClientWithRetry$1 billingManagerImpl$connectToBillingClientWithRetry$1;
        int i2;
        int i3;
        BillingManagerImpl billingManagerImpl;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        BillingManagerImpl billingManagerImpl2;
        BillingConnectionResult billingConnectionResult;
        int i9;
        if (continuation instanceof BillingManagerImpl$connectToBillingClientWithRetry$1) {
            billingManagerImpl$connectToBillingClientWithRetry$1 = (BillingManagerImpl$connectToBillingClientWithRetry$1) continuation;
            if ((billingManagerImpl$connectToBillingClientWithRetry$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$connectToBillingClientWithRetry$1.label -= Integer.MIN_VALUE;
                BillingManagerImpl$connectToBillingClientWithRetry$1 billingManagerImpl$connectToBillingClientWithRetry$12 = billingManagerImpl$connectToBillingClientWithRetry$1;
                Object obj = billingManagerImpl$connectToBillingClientWithRetry$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = billingManagerImpl$connectToBillingClientWithRetry$12.label;
                int i10 = 2;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String eventName = BillingClientEvents.StartBillingConnection.StartConnection.INSTANCE.getEventName();
                    billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = this;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i;
                    billingManagerImpl$connectToBillingClientWithRetry$12.J$0 = j;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$1 = 0;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$2 = 0;
                    billingManagerImpl$connectToBillingClientWithRetry$12.label = 1;
                    if (trackEvent$default(this, eventName, null, null, billingManagerImpl$connectToBillingClientWithRetry$12, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = i;
                    billingManagerImpl = this;
                    j2 = j;
                    i4 = 0;
                    i5 = 0;
                } else if (i2 == 1) {
                    i4 = billingManagerImpl$connectToBillingClientWithRetry$12.I$2;
                    i5 = billingManagerImpl$connectToBillingClientWithRetry$12.I$1;
                    j2 = billingManagerImpl$connectToBillingClientWithRetry$12.J$0;
                    i3 = billingManagerImpl$connectToBillingClientWithRetry$12.I$0;
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$connectToBillingClientWithRetry$12.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    i7 = billingManagerImpl$connectToBillingClientWithRetry$12.I$1;
                    j3 = billingManagerImpl$connectToBillingClientWithRetry$12.J$0;
                    i8 = billingManagerImpl$connectToBillingClientWithRetry$12.I$0;
                    billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$connectToBillingClientWithRetry$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    billingConnectionResult = (BillingConnectionResult) obj;
                    boolean z = billingConnectionResult instanceof BillingConnectionResult.BillingConnected;
                    billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = billingManagerImpl2;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i8;
                    billingManagerImpl$connectToBillingClientWithRetry$12.J$0 = j3;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$1 = i7;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$2 = z ? 1 : 0;
                    billingManagerImpl$connectToBillingClientWithRetry$12.label = 3;
                    if (billingManagerImpl2.trackConnectionEvent(billingConnectionResult, billingManagerImpl$connectToBillingClientWithRetry$12) != coroutine_suspended) {
                    }
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            i9 = billingManagerImpl$connectToBillingClientWithRetry$12.I$0;
                            ResultKt.throwOnFailure(obj);
                            i6 = i9;
                            return Boxing.boxBoolean(i6 != 0);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i11 = billingManagerImpl$connectToBillingClientWithRetry$12.I$2;
                    int i12 = billingManagerImpl$connectToBillingClientWithRetry$12.I$1;
                    long j4 = billingManagerImpl$connectToBillingClientWithRetry$12.J$0;
                    int i13 = billingManagerImpl$connectToBillingClientWithRetry$12.I$0;
                    ResultKt.throwOnFailure(obj);
                    i6 = i11;
                    BillingManagerImpl billingManagerImpl3 = (BillingManagerImpl) billingManagerImpl$connectToBillingClientWithRetry$12.L$0;
                    i10 = 2;
                    int i14 = i13;
                    billingManagerImpl2 = billingManagerImpl3;
                    i7 = i12 + 1;
                    j3 = j4;
                    i8 = i14;
                    if (i7 < i8 || i6 != 0) {
                        if (i6 == 0) {
                            billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = null;
                            billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i6;
                            billingManagerImpl$connectToBillingClientWithRetry$12.label = 5;
                            if (AppLoggerInteractor.DefaultImpls.logEvent$default(billingManagerImpl2, new PurchaseEvent(BillingClientEvents.BillingRetryConnectionError.INSTANCE.getEventName(), LoggerLevel.ERROR, MapsKt.mapOf(TuplesKt.to(RESPONSE_CODE_KEY, String.valueOf(CustomErrorCode.RETRY_SERVICE_DISCONNECTED.getCode()))), TAG), false, billingManagerImpl$connectToBillingClientWithRetry$12, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i9 = i6;
                            i6 = i9;
                        }
                        return Boxing.boxBoolean(i6 != 0);
                    }
                    billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = billingManagerImpl2;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i8;
                    billingManagerImpl$connectToBillingClientWithRetry$12.J$0 = j3;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$1 = i7;
                    billingManagerImpl$connectToBillingClientWithRetry$12.label = i10;
                    BillingManagerImpl$connectToBillingClientWithRetry$1 billingManagerImpl$connectToBillingClientWithRetry$13 = billingManagerImpl$connectToBillingClientWithRetry$12;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$connectToBillingClientWithRetry$13), 1);
                    cancellableContinuationImpl.initCancellability();
                    final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    billingManagerImpl2.getBillingClient().startConnection(new BillingClientStateListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$connectToBillingClientWithRetry$result$1$listener$1
                        @Override // com.android.billingclient.api.BillingClientStateListener
                        public void onBillingSetupFinished(BillingResult billingResult) {
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            if (cancellableContinuationImpl2.isActive()) {
                                if (billingResult.getResponseCode() == 0) {
                                    Result.Companion companion = Result.Companion;
                                    cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingConnected.INSTANCE));
                                    return;
                                }
                                Result.Companion companion2 = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(new BillingConnectionResult.BillingConnectionError(billingResult)));
                            }
                        }

                        @Override // com.android.billingclient.api.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            if (cancellableContinuationImpl2.isActive()) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(BillingConnectionResult.BillingServiceDisconnected.INSTANCE));
                            }
                        }
                    });
                    cancellableContinuationImpl2.invokeOnCancellation(new BillingManagerImpl$connectToBillingClientWithRetry$result$1$1(billingManagerImpl2));
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(billingManagerImpl$connectToBillingClientWithRetry$13);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = result;
                    billingConnectionResult = (BillingConnectionResult) obj;
                    boolean z2 = billingConnectionResult instanceof BillingConnectionResult.BillingConnected;
                    billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = billingManagerImpl2;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i8;
                    billingManagerImpl$connectToBillingClientWithRetry$12.J$0 = j3;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$1 = i7;
                    billingManagerImpl$connectToBillingClientWithRetry$12.I$2 = z2 ? 1 : 0;
                    billingManagerImpl$connectToBillingClientWithRetry$12.label = 3;
                    if (billingManagerImpl2.trackConnectionEvent(billingConnectionResult, billingManagerImpl$connectToBillingClientWithRetry$12) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i6 = z2 ? 1 : 0;
                    if (i6 != 0) {
                        billingManagerImpl$connectToBillingClientWithRetry$12.L$0 = billingManagerImpl2;
                        billingManagerImpl$connectToBillingClientWithRetry$12.I$0 = i8;
                        billingManagerImpl$connectToBillingClientWithRetry$12.J$0 = j3;
                        billingManagerImpl$connectToBillingClientWithRetry$12.I$1 = i7;
                        billingManagerImpl$connectToBillingClientWithRetry$12.I$2 = i6;
                        billingManagerImpl$connectToBillingClientWithRetry$12.label = 4;
                        if (DelayKt.delay(j3, billingManagerImpl$connectToBillingClientWithRetry$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j5 = j3;
                        i12 = i7;
                        billingManagerImpl3 = billingManagerImpl2;
                        i13 = i8;
                        j4 = j5;
                        i10 = 2;
                        int i142 = i13;
                        billingManagerImpl2 = billingManagerImpl3;
                        i7 = i12 + 1;
                        j3 = j4;
                        i8 = i142;
                        if (i7 < i8) {
                        }
                        if (i6 == 0) {
                        }
                        return Boxing.boxBoolean(i6 != 0);
                    }
                    i10 = 2;
                    if (i7 < i8) {
                    }
                    if (i6 == 0) {
                    }
                    return Boxing.boxBoolean(i6 != 0);
                } else {
                    int i15 = billingManagerImpl$connectToBillingClientWithRetry$12.I$2;
                    int i16 = billingManagerImpl$connectToBillingClientWithRetry$12.I$1;
                    long j6 = billingManagerImpl$connectToBillingClientWithRetry$12.J$0;
                    int i17 = billingManagerImpl$connectToBillingClientWithRetry$12.I$0;
                    ResultKt.throwOnFailure(obj);
                    i6 = i15;
                    i7 = i16;
                    j3 = j6;
                    i8 = i17;
                    billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$connectToBillingClientWithRetry$12.L$0;
                    if (i6 != 0) {
                    }
                }
                i6 = i4;
                i7 = i5;
                j3 = j2;
                i8 = i3;
                billingManagerImpl2 = billingManagerImpl;
                if (i7 < i8) {
                }
                if (i6 == 0) {
                }
                return Boxing.boxBoolean(i6 != 0);
            }
        }
        billingManagerImpl$connectToBillingClientWithRetry$1 = new BillingManagerImpl$connectToBillingClientWithRetry$1(this, continuation);
        BillingManagerImpl$connectToBillingClientWithRetry$1 billingManagerImpl$connectToBillingClientWithRetry$122 = billingManagerImpl$connectToBillingClientWithRetry$1;
        Object obj2 = billingManagerImpl$connectToBillingClientWithRetry$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = billingManagerImpl$connectToBillingClientWithRetry$122.label;
        int i102 = 2;
        if (i2 != 0) {
        }
        i6 = i4;
        i7 = i5;
        j3 = j2;
        i8 = i3;
        billingManagerImpl2 = billingManagerImpl;
        if (i7 < i8) {
        }
        if (i6 == 0) {
        }
        return Boxing.boxBoolean(i6 != 0);
    }

    static /* synthetic */ Object connectToBillingClientWithRetry$default(BillingManagerImpl billingManagerImpl, int i, long j, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        if ((i2 & 2) != 0) {
            j = 500;
        }
        return billingManagerImpl.connectToBillingClientWithRetry(i, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115 A[RETURN] */
    @Override // com.ifiend.billing.impl.manager.BillingManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPurchases(String str, Continuation<? super List<? extends Purchase>> continuation) {
        BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$1;
        Object coroutine_suspended;
        int i;
        BillingManagerImpl billingManagerImpl;
        Object result;
        if (continuation instanceof BillingManagerImpl$getPurchases$1) {
            billingManagerImpl$getPurchases$1 = (BillingManagerImpl$getPurchases$1) continuation;
            if ((billingManagerImpl$getPurchases$1.label & Integer.MIN_VALUE) != 0) {
                billingManagerImpl$getPurchases$1.label -= Integer.MIN_VALUE;
                Object obj = billingManagerImpl$getPurchases$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingManagerImpl$getPurchases$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getBillingClient().isReady()) {
                        billingManagerImpl = this;
                        billingManagerImpl$getPurchases$1.L$0 = billingManagerImpl;
                        billingManagerImpl$getPurchases$1.L$1 = str;
                        billingManagerImpl$getPurchases$1.L$2 = billingManagerImpl$getPurchases$1;
                        billingManagerImpl$getPurchases$1.label = 3;
                        BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$12 = billingManagerImpl$getPurchases$1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$getPurchases$12), 1);
                        cancellableContinuationImpl.initCancellability();
                        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(str).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        billingManagerImpl.getBillingClient().queryPurchasesAsync(build, new PurchasesResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$getPurchases$2$1$1
                            @Override // com.android.billingclient.api.PurchasesResponseListener
                            public final void onQueryPurchasesResponse(BillingResult result2, List<Purchase> purchase) {
                                Intrinsics.checkNotNullParameter(result2, "result");
                                Intrinsics.checkNotNullParameter(purchase, "purchase");
                                if (BillingclientKt.isSuccessful(result2)) {
                                    Result.Companion companion = Result.Companion;
                                    cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(purchase));
                                    return;
                                }
                                Result.Companion companion2 = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(CollectionsKt.emptyList()));
                            }
                        });
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        }
                        if (obj == coroutine_suspended) {
                        }
                        return (List) obj;
                    }
                    billingManagerImpl$getPurchases$1.L$0 = this;
                    billingManagerImpl$getPurchases$1.L$1 = str;
                    billingManagerImpl$getPurchases$1.label = 1;
                    obj = startOneTimeConnection(billingManagerImpl$getPurchases$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingManagerImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$13 = (BillingManagerImpl$getPurchases$1) billingManagerImpl$getPurchases$1.L$2;
                            String str2 = (String) billingManagerImpl$getPurchases$1.L$1;
                            BillingManagerImpl billingManagerImpl2 = (BillingManagerImpl) billingManagerImpl$getPurchases$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return (List) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$14 = (BillingManagerImpl$getPurchases$1) billingManagerImpl$getPurchases$1.L$2;
                    str = (String) billingManagerImpl$getPurchases$1.L$1;
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$getPurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    List list = (List) obj;
                    billingManagerImpl$getPurchases$1.L$0 = billingManagerImpl;
                    billingManagerImpl$getPurchases$1.L$1 = str;
                    billingManagerImpl$getPurchases$1.L$2 = billingManagerImpl$getPurchases$1;
                    billingManagerImpl$getPurchases$1.label = 3;
                    BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$122 = billingManagerImpl$getPurchases$1;
                    CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$getPurchases$122), 1);
                    cancellableContinuationImpl3.initCancellability();
                    final CancellableContinuation<? super List<? extends Purchase>> cancellableContinuationImpl22 = cancellableContinuationImpl3;
                    QueryPurchasesParams build2 = QueryPurchasesParams.newBuilder().setProductType(str).build();
                    Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    billingManagerImpl.getBillingClient().queryPurchasesAsync(build2, new PurchasesResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$getPurchases$2$1$1
                        @Override // com.android.billingclient.api.PurchasesResponseListener
                        public final void onQueryPurchasesResponse(BillingResult result2, List<Purchase> purchase) {
                            Intrinsics.checkNotNullParameter(result2, "result");
                            Intrinsics.checkNotNullParameter(purchase, "purchase");
                            if (BillingclientKt.isSuccessful(result2)) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl22.resumeWith(Result.m7271constructorimpl(purchase));
                                return;
                            }
                            Result.Companion companion2 = Result.Companion;
                            cancellableContinuationImpl22.resumeWith(Result.m7271constructorimpl(CollectionsKt.emptyList()));
                        }
                    });
                    obj = cancellableContinuationImpl3.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(billingManagerImpl$getPurchases$122);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (List) obj;
                } else {
                    str = (String) billingManagerImpl$getPurchases$1.L$1;
                    billingManagerImpl = (BillingManagerImpl) billingManagerImpl$getPurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ((BillingConnectionResult) obj).isConnected();
                billingManagerImpl$getPurchases$1.L$0 = billingManagerImpl;
                billingManagerImpl$getPurchases$1.L$1 = str;
                billingManagerImpl$getPurchases$1.L$2 = billingManagerImpl$getPurchases$1;
                billingManagerImpl$getPurchases$1.label = 2;
                BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$15 = billingManagerImpl$getPurchases$1;
                CancellableContinuationImpl cancellableContinuationImpl4 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$getPurchases$15), 1);
                cancellableContinuationImpl4.initCancellability();
                final CancellableContinuationImpl cancellableContinuationImpl5 = cancellableContinuationImpl4;
                QueryPurchasesParams build3 = QueryPurchasesParams.newBuilder().setProductType(str).build();
                Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
                billingManagerImpl.getBillingClient().queryPurchasesAsync(build3, new PurchasesResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$getPurchases$2$1$1
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult result2, List<Purchase> purchase) {
                        Intrinsics.checkNotNullParameter(result2, "result");
                        Intrinsics.checkNotNullParameter(purchase, "purchase");
                        if (BillingclientKt.isSuccessful(result2)) {
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl5.resumeWith(Result.m7271constructorimpl(purchase));
                            return;
                        }
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuationImpl5.resumeWith(Result.m7271constructorimpl(CollectionsKt.emptyList()));
                    }
                });
                result = cancellableContinuationImpl4.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(billingManagerImpl$getPurchases$15);
                }
                if (result != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = result;
                List list2 = (List) obj;
                billingManagerImpl$getPurchases$1.L$0 = billingManagerImpl;
                billingManagerImpl$getPurchases$1.L$1 = str;
                billingManagerImpl$getPurchases$1.L$2 = billingManagerImpl$getPurchases$1;
                billingManagerImpl$getPurchases$1.label = 3;
                BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$1222 = billingManagerImpl$getPurchases$1;
                CancellableContinuationImpl cancellableContinuationImpl32 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$getPurchases$1222), 1);
                cancellableContinuationImpl32.initCancellability();
                final CancellableContinuation<? super List<? extends Purchase>> cancellableContinuationImpl222 = cancellableContinuationImpl32;
                QueryPurchasesParams build22 = QueryPurchasesParams.newBuilder().setProductType(str).build();
                Intrinsics.checkNotNullExpressionValue(build22, "build(...)");
                billingManagerImpl.getBillingClient().queryPurchasesAsync(build22, new PurchasesResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$getPurchases$2$1$1
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult result2, List<Purchase> purchase) {
                        Intrinsics.checkNotNullParameter(result2, "result");
                        Intrinsics.checkNotNullParameter(purchase, "purchase");
                        if (BillingclientKt.isSuccessful(result2)) {
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl222.resumeWith(Result.m7271constructorimpl(purchase));
                            return;
                        }
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuationImpl222.resumeWith(Result.m7271constructorimpl(CollectionsKt.emptyList()));
                    }
                });
                obj = cancellableContinuationImpl32.getResult();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (obj == coroutine_suspended) {
                }
                return (List) obj;
            }
        }
        billingManagerImpl$getPurchases$1 = new BillingManagerImpl$getPurchases$1(this, continuation);
        Object obj2 = billingManagerImpl$getPurchases$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingManagerImpl$getPurchases$1.label;
        if (i != 0) {
        }
        ((BillingConnectionResult) obj2).isConnected();
        billingManagerImpl$getPurchases$1.L$0 = billingManagerImpl;
        billingManagerImpl$getPurchases$1.L$1 = str;
        billingManagerImpl$getPurchases$1.L$2 = billingManagerImpl$getPurchases$1;
        billingManagerImpl$getPurchases$1.label = 2;
        BillingManagerImpl$getPurchases$1 billingManagerImpl$getPurchases$152 = billingManagerImpl$getPurchases$1;
        CancellableContinuationImpl cancellableContinuationImpl42 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(billingManagerImpl$getPurchases$152), 1);
        cancellableContinuationImpl42.initCancellability();
        final CancellableContinuation<? super List<? extends Purchase>> cancellableContinuationImpl52 = cancellableContinuationImpl42;
        QueryPurchasesParams build32 = QueryPurchasesParams.newBuilder().setProductType(str).build();
        Intrinsics.checkNotNullExpressionValue(build32, "build(...)");
        billingManagerImpl.getBillingClient().queryPurchasesAsync(build32, new PurchasesResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$getPurchases$2$1$1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult result2, List<Purchase> purchase) {
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(purchase, "purchase");
                if (BillingclientKt.isSuccessful(result2)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl52.resumeWith(Result.m7271constructorimpl(purchase));
                    return;
                }
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl52.resumeWith(Result.m7271constructorimpl(CollectionsKt.emptyList()));
            }
        });
        result = cancellableContinuationImpl42.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (result != coroutine_suspended) {
        }
    }

    @Override // com.ifiend.billing.impl.manager.BillingManager
    public Object getBillingFlowParams(ProductDetails productDetails, String str, Continuation<? super BillingFlowParams> continuation) {
        BillingFlowParams.ProductDetailsParams build;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        if (Intrinsics.areEqual(str, "inapp")) {
            build = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build();
        } else {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
            String offerToken = (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List<? extends Object>) subscriptionOfferDetails2)) == null) ? null : subscriptionOfferDetails.getOfferToken();
            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
            if (offerToken == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            build = productDetails2.setOfferToken(offerToken).build();
        }
        Intrinsics.checkNotNull(build);
        BillingFlowParams build2 = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt.listOf(build)).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, Continuation<? super Pair<BillingResult, ? extends List<ProductDetails>>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        getBillingClient().queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$queryProductDetailsAsync$2$1
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> purchaseList) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(TuplesKt.to(billingResult, purchaseList)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.ifiend.billing.impl.manager.BillingManager
    public Object consumeAsync(Purchase purchase, Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        getBillingClient().consumeAsync(build, new ConsumeResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$consumeAsync$2$1
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult result, String str) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                if (BillingclientKt.isSuccessful(result)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(true));
                    return;
                }
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(false));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
