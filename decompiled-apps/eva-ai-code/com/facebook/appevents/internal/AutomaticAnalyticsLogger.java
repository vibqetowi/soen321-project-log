package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.iap.InAppPurchaseEventManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AutomaticAnalyticsLogger.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J.\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger;", "", "()V", "APP_EVENTS_IF_AUTO_LOG_SUBS", "", "TAG", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "getPurchaseLoggingParameters", "Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "purchase", "skuDetails", "extraParameter", "", "isImplicitPurchaseLoggingEnabled", "", "logActivateAppEvent", "", "logActivityTimeSpentEvent", "activityName", "timeSpentInSeconds", "", "logPurchase", "isSubscription", "PurchaseLoggingParameters", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger;

    private AutomaticAnalyticsLogger() {
    }

    static {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
    }

    @JvmStatic
    public static final void logActivateAppEvent() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        FacebookSdk facebookSdk3 = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            if (applicationContext instanceof Application) {
                AppEventsLogger.Companion.activateApp((Application) applicationContext, applicationId);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    @JvmStatic
    public static final void logActivityTimeSpentEvent(String str, long j) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
        if (queryAppSettings == null || !queryAppSettings.getAutomaticLoggingEnabled() || j <= 0) {
            return;
        }
        InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, str);
        internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, j, bundle);
    }

    @JvmStatic
    public static final void logPurchase(String purchase, String skuDetails, boolean z) {
        PurchaseLoggingParameters purchaseLoggingParameters;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        AutomaticAnalyticsLogger automaticAnalyticsLogger = INSTANCE;
        if (isImplicitPurchaseLoggingEnabled() && (purchaseLoggingParameters = automaticAnalyticsLogger.getPurchaseLoggingParameters(purchase, skuDetails)) != null) {
            boolean z2 = false;
            if (z) {
                FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_IF_AUTO_LOG_SUBS, FacebookSdk.getApplicationId(), false)) {
                    z2 = true;
                }
            }
            if (z2) {
                internalAppEventsLogger.logEventImplicitly(InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(skuDetails) ? AppEventsConstants.EVENT_NAME_START_TRIAL : AppEventsConstants.EVENT_NAME_SUBSCRIBE, purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
            } else {
                internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
            }
        }
    }

    @JvmStatic
    public static final boolean isImplicitPurchaseLoggingEnabled() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
        if (appSettingsWithoutQuery != null) {
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled()) {
                return true;
            }
        }
        return false;
    }

    private final PurchaseLoggingParameters getPurchaseLoggingParameters(String str, String str2) {
        return getPurchaseLoggingParameters(str, str2, new HashMap());
    }

    private final PurchaseLoggingParameters getPurchaseLoggingParameters(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(Constants.IAP_PRODUCT_ID, jSONObject.getString("productId"));
            bundle.putCharSequence(Constants.IAP_PURCHASE_TIME, jSONObject.getString("purchaseTime"));
            bundle.putCharSequence(Constants.IAP_PURCHASE_TOKEN, jSONObject.getString("purchaseToken"));
            bundle.putCharSequence(Constants.IAP_PACKAGE_NAME, jSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME));
            bundle.putCharSequence(Constants.IAP_PRODUCT_TITLE, jSONObject2.optString("title"));
            bundle.putCharSequence(Constants.IAP_PRODUCT_DESCRIPTION, jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence(Constants.IAP_PRODUCT_TYPE, optString);
            if (Intrinsics.areEqual(optString, "subs")) {
                bundle.putCharSequence(Constants.IAP_SUBSCRIPTION_AUTORENEWING, Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence(Constants.IAP_SUBSCRIPTION_PERIOD, jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence(Constants.IAP_FREE_TRIAL_PERIOD, jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence(Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence(Constants.IAP_INTRO_PRICE_CYCLES, introductoryPriceCycles);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new PurchaseLoggingParameters(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutomaticAnalyticsLogger.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "", com.ifriend.common_utils.Constants.PURCHASE_AMOUNT, "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "Ljava/util/Currency;", "param", "Landroid/os/Bundle;", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getParam", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "getPurchaseAmount", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PurchaseLoggingParameters {
        private Currency currency;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            this.purchaseAmount = purchaseAmount;
            this.currency = currency;
            this.param = param;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(Currency currency) {
            Intrinsics.checkNotNullParameter(currency, "<set-?>");
            this.currency = currency;
        }

        public final void setParam(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.param = bundle;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }
    }
}
