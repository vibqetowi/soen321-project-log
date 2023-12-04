package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: InAppPurchaseBillingClientWrapper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0005()*+,B«\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001fJ\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001fH\u0002J(\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0&2\u0006\u0010#\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "", "context", "Landroid/content/Context;", "billingClient", "billingClientClazz", "Ljava/lang/Class;", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "queryPurchasesMethod", "Ljava/lang/reflect/Method;", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "inAppPurchaseSkuDetailsWrapper", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;)V", "historyPurchaseSet", "", "", "queryPurchase", "", "skuType", "querySkuRunnable", "Ljava/lang/Runnable;", "queryPurchaseHistory", "queryPurchaseHistoryRunnable", InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, "runnable", InAppPurchaseBillingClientWrapper.METHOD_QUERY_SKU_DETAILS_ASYNC, "skuIDs", "", InAppPurchaseBillingClientWrapper.METHOD_START_CONNECTION, "BillingClientStateListenerWrapper", "Companion", "PurchaseHistoryResponseListenerWrapper", "PurchasesUpdatedListenerWrapper", "SkuDetailsResponseListenerWrapper", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseBillingClientWrapper {
    private static final String CLASSNAME_BILLING_CLIENT = "com.android.billingclient.api.BillingClient";
    private static final String CLASSNAME_BILLING_CLIENT_BUILDER = "com.android.billingclient.api.BillingClient$Builder";
    private static final String CLASSNAME_BILLING_CLIENT_STATE_LISTENER = "com.android.billingclient.api.BillingClientStateListener";
    private static final String CLASSNAME_PURCHASE = "com.android.billingclient.api.Purchase";
    private static final String CLASSNAME_PURCHASES_RESULT = "com.android.billingclient.api.Purchase$PurchasesResult";
    private static final String CLASSNAME_PURCHASE_HISTORY_RECORD = "com.android.billingclient.api.PurchaseHistoryRecord";
    private static final String CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER = "com.android.billingclient.api.PurchaseHistoryResponseListener";
    private static final String CLASSNAME_PURCHASE_UPDATED_LISTENER = "com.android.billingclient.api.PurchasesUpdatedListener";
    private static final String CLASSNAME_SKU_DETAILS = "com.android.billingclient.api.SkuDetails";
    private static final String CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER = "com.android.billingclient.api.SkuDetailsResponseListener";
    private static final String IN_APP = "inapp";
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_ENABLE_PENDING_PURCHASES = "enablePendingPurchases";
    private static final String METHOD_GET_ORIGINAL_JSON = "getOriginalJson";
    private static final String METHOD_GET_PURCHASE_LIST = "getPurchasesList";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_ON_BILLING_SERVICE_DISCONNECTED = "onBillingServiceDisconnected";
    private static final String METHOD_ON_BILLING_SETUP_FINISHED = "onBillingSetupFinished";
    private static final String METHOD_ON_PURCHASE_HISTORY_RESPONSE = "onPurchaseHistoryResponse";
    private static final String METHOD_ON_SKU_DETAILS_RESPONSE = "onSkuDetailsResponse";
    private static final String METHOD_QUERY_PURCHASES = "queryPurchases";
    private static final String METHOD_QUERY_PURCHASE_HISTORY_ASYNC = "queryPurchaseHistoryAsync";
    private static final String METHOD_QUERY_SKU_DETAILS_ASYNC = "querySkuDetailsAsync";
    private static final String METHOD_SET_LISTENER = "setListener";
    private static final String METHOD_START_CONNECTION = "startConnection";
    private static final String PACKAGE_NAME = "packageName";
    private static final String PRODUCT_ID = "productId";
    private static InAppPurchaseBillingClientWrapper instance;
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Context context;
    private final Method getOriginalJsonMethod;
    private final Method getOriginalJsonPurchaseHistoryMethod;
    private final Method getOriginalJsonSkuMethod;
    private final Method getPurchaseListMethod;
    private final Set<String> historyPurchaseSet;
    private final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final Class<?> purchaseClazz;
    private final Class<?> purchaseHistoryRecordClazz;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchaseResultClazz;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchasesMethod;
    private final Method querySkuDetailsAsyncMethod;
    private final Class<?> skuDetailsClazz;
    private final Class<?> skuDetailsResponseListenerClazz;
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map<String, JSONObject> purchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> skuDetailsMap = new ConcurrentHashMap();

    public /* synthetic */ InAppPurchaseBillingClientWrapper(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper);
    }

    @JvmStatic
    public static final synchronized InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context) {
        synchronized (InAppPurchaseBillingClientWrapper.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
                return null;
            }
            return Companion.getOrCreateInstance(context);
        }
    }

    private InAppPurchaseBillingClientWrapper(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        this.context = context;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper;
        this.historyPurchaseSet = new CopyOnWriteArraySet();
    }

    public static final /* synthetic */ Context access$getContext$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.context;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonPurchaseHistoryMethod$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonSkuMethod$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Set access$getHistoryPurchaseSet$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.historyPurchaseSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$getInitialized$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseBillingClientWrapper access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getPurchaseDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return purchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getPurchaseHistoryRecordClazz$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.purchaseHistoryRecordClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getSkuDetailsClazz$p(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.skuDetailsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSkuDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return skuDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isServiceConnected$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            instance = inAppPurchaseBillingClientWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
        }
    }

    public static final /* synthetic */ void access$startConnection(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapper.startConnection();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
        }
    }

    public final void queryPurchaseHistory(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            queryPurchaseHistoryAsync(skuType, new Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseBillingClientWrapper.m6338queryPurchaseHistory$lambda0(InAppPurchaseBillingClientWrapper.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: queryPurchaseHistory$lambda-0  reason: not valid java name */
    public static final void m6338queryPurchaseHistory$lambda0(InAppPurchaseBillingClientWrapper this$0, Runnable queryPurchaseHistoryRunnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapper.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.querySkuDetailsAsync("inapp", new ArrayList(this$0.historyPurchaseSet), queryPurchaseHistoryRunnable);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapper.class);
        }
    }

    public final void queryPurchase(String skuType, Runnable querySkuRunnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, "inapp");
            InAppPurchaseUtils inAppPurchaseUtils2 = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.purchaseResultClazz, this.getPurchaseListMethod, invokeMethod, new Object[0]);
            List list = invokeMethod2 instanceof List ? (List) invokeMethod2 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    InAppPurchaseUtils inAppPurchaseUtils3 = InAppPurchaseUtils.INSTANCE;
                    Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.getOriginalJsonMethod, obj, new Object[0]);
                    String str = invokeMethod3 instanceof String ? (String) invokeMethod3 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(PRODUCT_ID)) {
                            String skuID = jSONObject.getString(PRODUCT_ID);
                            arrayList.add(skuID);
                            Map<String, JSONObject> map = purchaseDetailsMap;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                querySkuDetailsAsync(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void querySkuDetailsAsync(String str, List<String> list, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this.skuDetailsResponseListenerClazz}, new SkuDetailsResponseListenerWrapper(this, runnable));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf(skuDetailsResponseListenerClazz),\n            SkuDetailsResponseListenerWrapper(runnable))");
            Object skuDetailsParams = this.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(str, list);
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, skuDetailsParams, newProxyInstance);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void queryPurchaseHistoryAsync(String str, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this.purchaseHistoryResponseListenerClazz}, new PurchaseHistoryResponseListenerWrapper(this, runnable));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf(purchaseHistoryResponseListenerClazz),\n            PurchaseHistoryResponseListenerWrapper(runnable))");
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, str, newProxyInstance);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startConnection() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Class<?> cls = InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
            if (cls == null) {
                return;
            }
            InAppPurchaseUtils inAppPurchaseUtils2 = InAppPurchaseUtils.INSTANCE;
            Method method = InAppPurchaseUtils.getMethod(this.billingClientClazz, METHOD_START_CONNECTION, cls);
            if (method == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BillingClientStateListenerWrapper());
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            listenerClazz.classLoader, arrayOf(listenerClazz), BillingClientStateListenerWrapper())");
            InAppPurchaseUtils inAppPurchaseUtils3 = InAppPurchaseUtils.INSTANCE;
            InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, this.billingClient, newProxyInstance);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$BillingClientStateListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BillingClientStateListenerWrapper implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m, "m");
                if (Intrinsics.areEqual(m.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SETUP_FINISHED)) {
                    InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(true);
                } else {
                    String name = m.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.endsWith$default(name, InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SERVICE_DISCONNECTED, false, 2, (Object) null)) {
                        InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchasesUpdatedListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PurchasesUpdatedListenerWrapper implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m, "m");
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J0\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0002\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchaseHistoryResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "getPurchaseHistoryRecord", "", "purchaseHistoryRecordList", "", "invoke", "", "proxy", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public final class PurchaseHistoryResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final /* synthetic */ InAppPurchaseBillingClientWrapper this$0;

        public PurchaseHistoryResponseListenerWrapper(InAppPurchaseBillingClientWrapper this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = this$0;
            this.runnable = runnable;
        }

        public final Runnable getRunnable() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void setRunnable(Runnable runnable) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.runnable = runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        getPurchaseHistoryRecord((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        private final void getPurchaseHistoryRecord(List<?> list) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                        Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$getPurchaseHistoryRecordClazz$p(this.this$0), InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonPurchaseHistoryMethod$p(this.this$0), obj, new Object[0]);
                        String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", InAppPurchaseBillingClientWrapper.access$getContext$p(this.this$0).getPackageName());
                            if (jSONObject.has(InAppPurchaseBillingClientWrapper.PRODUCT_ID)) {
                                String skuID = jSONObject.getString(InAppPurchaseBillingClientWrapper.PRODUCT_ID);
                                InAppPurchaseBillingClientWrapper.access$getHistoryPurchaseSet$p(this.this$0).add(skuID);
                                Map<String, JSONObject> purchaseDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getPurchaseDetailsMap();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                purchaseDetailsMap.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$SkuDetailsResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parseSkuDetails", "", "skuDetailsObjectList", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public final class SkuDetailsResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final /* synthetic */ InAppPurchaseBillingClientWrapper this$0;

        public SkuDetailsResponseListenerWrapper(InAppPurchaseBillingClientWrapper this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = this$0;
            this.runnable = runnable;
        }

        public final Runnable getRunnable() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return this.runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void setRunnable(Runnable runnable) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(runnable, "<set-?>");
                this.runnable = runnable;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m, "m");
                if (Intrinsics.areEqual(m.getName(), InAppPurchaseBillingClientWrapper.METHOD_ON_SKU_DETAILS_RESPONSE)) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        parseSkuDetails((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final void parseSkuDetails(List<?> skuDetailsObjectList) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
                        Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$getSkuDetailsClazz$p(this.this$0), InAppPurchaseBillingClientWrapper.access$getGetOriginalJsonSkuMethod$p(this.this$0), obj, new Object[0]);
                        String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has(InAppPurchaseBillingClientWrapper.PRODUCT_ID)) {
                                String skuID = jSONObject.getString(InAppPurchaseBillingClientWrapper.PRODUCT_ID);
                                Map<String, JSONObject> skuDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getSkuDetailsMap();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                skuDetailsMap.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.runnable.run();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010.2\n\u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)¨\u00064"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$Companion;", "", "()V", "CLASSNAME_BILLING_CLIENT", "", "CLASSNAME_BILLING_CLIENT_BUILDER", "CLASSNAME_BILLING_CLIENT_STATE_LISTENER", "CLASSNAME_PURCHASE", "CLASSNAME_PURCHASES_RESULT", "CLASSNAME_PURCHASE_HISTORY_RECORD", "CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER", "CLASSNAME_PURCHASE_UPDATED_LISTENER", "CLASSNAME_SKU_DETAILS", "CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER", "IN_APP", "METHOD_BUILD", "METHOD_ENABLE_PENDING_PURCHASES", "METHOD_GET_ORIGINAL_JSON", "METHOD_GET_PURCHASE_LIST", "METHOD_NEW_BUILDER", "METHOD_ON_BILLING_SERVICE_DISCONNECTED", "METHOD_ON_BILLING_SETUP_FINISHED", "METHOD_ON_PURCHASE_HISTORY_RESPONSE", "METHOD_ON_SKU_DETAILS_RESPONSE", "METHOD_QUERY_PURCHASES", "METHOD_QUERY_PURCHASE_HISTORY_ASYNC", "METHOD_QUERY_SKU_DETAILS_ASYNC", "METHOD_SET_LISTENER", "METHOD_START_CONNECTION", "PACKAGE_NAME", "PRODUCT_ID", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "isServiceConnected", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "purchaseDetailsMap", "", "Lorg/json/JSONObject;", "getPurchaseDetailsMap", "()Ljava/util/Map;", "skuDetailsMap", "getSkuDetailsMap", "createBillingClient", "context", "Landroid/content/Context;", "billingClientClazz", "Ljava/lang/Class;", "createInstance", "", "getOrCreateInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapper.access$isServiceConnected$cp();
        }

        public final Map<String, JSONObject> getPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapper.access$getPurchaseDetailsMap$cp();
        }

        public final Map<String, JSONObject> getSkuDetailsMap() {
            return InAppPurchaseBillingClientWrapper.access$getSkuDetailsMap$cp();
        }

        @JvmStatic
        public final synchronized InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (InAppPurchaseBillingClientWrapper.access$getInitialized$cp().get()) {
                return InAppPurchaseBillingClientWrapper.access$getInstance$cp();
            }
            createInstance(context);
            InAppPurchaseBillingClientWrapper.access$getInitialized$cp().set(true);
            return InAppPurchaseBillingClientWrapper.access$getInstance$cp();
        }

        private final void createInstance(Context context) {
            Object createBillingClient;
            InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.Companion.getOrCreateInstance();
            if (orCreateInstance == null) {
                return;
            }
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT);
            InAppPurchaseUtils inAppPurchaseUtils2 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE);
            InAppPurchaseUtils inAppPurchaseUtils3 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASES_RESULT);
            InAppPurchaseUtils inAppPurchaseUtils4 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls4 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS);
            InAppPurchaseUtils inAppPurchaseUtils5 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls5 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RECORD);
            InAppPurchaseUtils inAppPurchaseUtils6 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls6 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER);
            InAppPurchaseUtils inAppPurchaseUtils7 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls7 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
            if (cls == null || cls3 == null || cls2 == null || cls4 == null || cls6 == null || cls5 == null || cls7 == null) {
                return;
            }
            InAppPurchaseUtils inAppPurchaseUtils8 = InAppPurchaseUtils.INSTANCE;
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASES, String.class);
            InAppPurchaseUtils inAppPurchaseUtils9 = InAppPurchaseUtils.INSTANCE;
            Method method2 = InAppPurchaseUtils.getMethod(cls3, InAppPurchaseBillingClientWrapper.METHOD_GET_PURCHASE_LIST, new Class[0]);
            InAppPurchaseUtils inAppPurchaseUtils10 = InAppPurchaseUtils.INSTANCE;
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            InAppPurchaseUtils inAppPurchaseUtils11 = InAppPurchaseUtils.INSTANCE;
            Method method4 = InAppPurchaseUtils.getMethod(cls4, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            InAppPurchaseUtils inAppPurchaseUtils12 = InAppPurchaseUtils.INSTANCE;
            Method method5 = InAppPurchaseUtils.getMethod(cls5, InAppPurchaseBillingClientWrapper.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            InAppPurchaseUtils inAppPurchaseUtils13 = InAppPurchaseUtils.INSTANCE;
            Method method6 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseBillingClientWrapper.METHOD_QUERY_SKU_DETAILS_ASYNC, orCreateInstance.getSkuDetailsParamsClazz(), cls6);
            InAppPurchaseUtils inAppPurchaseUtils14 = InAppPurchaseUtils.INSTANCE;
            Method method7 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseBillingClientWrapper.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, String.class, cls7);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null || (createBillingClient = createBillingClient(context, cls)) == null) {
                return;
            }
            InAppPurchaseBillingClientWrapper.access$setInstance$cp(new InAppPurchaseBillingClientWrapper(context, createBillingClient, cls, cls3, cls2, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, orCreateInstance, null));
            InAppPurchaseBillingClientWrapper access$getInstance$cp = InAppPurchaseBillingClientWrapper.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            InAppPurchaseBillingClientWrapper.access$startConnection(access$getInstance$cp);
        }

        private final Object createBillingClient(Context context, Class<?> cls) {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_BILLING_CLIENT_BUILDER);
            InAppPurchaseUtils inAppPurchaseUtils2 = InAppPurchaseUtils.INSTANCE;
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseBillingClientWrapper.CLASSNAME_PURCHASE_UPDATED_LISTENER);
            if (cls2 == null || cls3 == null) {
                return null;
            }
            InAppPurchaseUtils inAppPurchaseUtils3 = InAppPurchaseUtils.INSTANCE;
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseBillingClientWrapper.METHOD_NEW_BUILDER, Context.class);
            InAppPurchaseUtils inAppPurchaseUtils4 = InAppPurchaseUtils.INSTANCE;
            Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
            InAppPurchaseUtils inAppPurchaseUtils5 = InAppPurchaseUtils.INSTANCE;
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_SET_LISTENER, cls3);
            InAppPurchaseUtils inAppPurchaseUtils6 = InAppPurchaseUtils.INSTANCE;
            Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseBillingClientWrapper.METHOD_BUILD, new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null) {
                return null;
            }
            InAppPurchaseUtils inAppPurchaseUtils7 = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(cls, method, null, context);
            if (invokeMethod == null) {
                return null;
            }
            Object newProxyInstance = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new PurchasesUpdatedListenerWrapper());
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n              listenerClazz.classLoader, arrayOf(listenerClazz), PurchasesUpdatedListenerWrapper())");
            InAppPurchaseUtils inAppPurchaseUtils8 = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, newProxyInstance);
            if (invokeMethod2 == null) {
                return null;
            }
            InAppPurchaseUtils inAppPurchaseUtils9 = InAppPurchaseUtils.INSTANCE;
            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(cls2, method2, invokeMethod2, new Object[0]);
            if (invokeMethod3 == null) {
                return null;
            }
            InAppPurchaseUtils inAppPurchaseUtils10 = InAppPurchaseUtils.INSTANCE;
            return InAppPurchaseUtils.invokeMethod(cls2, method4, invokeMethod3, new Object[0]);
        }
    }
}
