package com.ifriend.presentation.features.purchases.billing.analytics;

import com.android.billingclient.api.Purchase;
import com.appsflyer.AFInAppEventParameterName;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.api.events.AnnalsAnalyticsEvent;
import com.ifriend.analytics.api.events.AppsFlyerEvent;
import com.ifriend.analytics.api.events.FirebaseAnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.common_utils.Constants;
import com.ifriend.common_utils.extensions.DoubleKt;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.presentation.analytics.CommonAnalyticsKeys;
import com.ifriend.presentation.features.purchases.billing.ext.BillingproductKt;
import com.ifriend.presentation.features.purchases.billing.models.BillingPurchase;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingPurchaseProductAnalytics.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JT\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002JT\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J2\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J2\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J0\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"J\u001e\u0010(\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/analytics/BillingPurchaseProductAnalytics;", "", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "createAppsFlyerParams", "", "", "localPrice", "", "backendPrice", "localCurrencyCode", "backendCurrency", "isSubscription", "", "credits", "", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "createFirebaseParams", "value", FirebaseAnalytics.Param.CURRENCY, "transactionId", "paymentNumber", "getCurrencyCode", "trackFirstPurchase", "", "product", "Lcom/ifriend/billing/api/models/BillingProduct;", "purchase", "Lcom/android/billingclient/api/Purchase;", Constants.PURCHASE_AMOUNT, "userGender", "Lcom/ifriend/domain/models/profile/Gender;", "trackPurchase", "trackPurchaseProductEvent", "billingPurchase", "Lcom/ifriend/presentation/features/purchases/billing/models/BillingPurchase;", "isCustomer", "trackRegistrationPurchase", "total", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchaseProductAnalytics {
    private static final String AF_CONTENT_TYPE__CREDITS = "CNProductManagerCredits";
    private static final String AF_CONTENT_TYPE__MEMBERSHIP = "CNProductManagerMembership";
    private static final String PAYMENT_SYSTEM__INAPP = "INAAP";
    private static final String PAYMENT_TYPE__CREDIT = "CREDIT";
    private static final String PAYMENT_TYPE__MEMBERSHIP = "MEMBERSHIP";
    private static final String RECURRENT_PAYMENT__NO = "NO";
    private static final String RECURRENT_PAYMENT__YES = "YES";
    private final AnalyticsInteractor analyticsInteractor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public BillingPurchaseProductAnalytics(AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.analyticsInteractor = analyticsInteractor;
    }

    /* compiled from: BillingPurchaseProductAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/analytics/BillingPurchaseProductAnalytics$Companion;", "", "()V", "AF_CONTENT_TYPE__CREDITS", "", "AF_CONTENT_TYPE__MEMBERSHIP", "PAYMENT_SYSTEM__INAPP", "PAYMENT_TYPE__CREDIT", "PAYMENT_TYPE__MEMBERSHIP", "RECURRENT_PAYMENT__NO", "RECURRENT_PAYMENT__YES", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void trackPurchaseProductEvent(BillingPurchase billingPurchase, int i, PurchaseSource purchaseSource, boolean z, Gender gender) {
        Intrinsics.checkNotNullParameter(billingPurchase, "billingPurchase");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        BillingProduct product = billingPurchase.getProduct();
        Purchase purchase = billingPurchase.getPurchase();
        if (!z) {
            trackFirstPurchase(product, purchase, purchaseSource, i, gender);
        }
        trackPurchase(product, purchase, purchaseSource, i, gender);
    }

    public final void trackRegistrationPurchase(BillingProduct product, PurchaseSource purchaseSource, float f) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.CARD_PURCHASE.getValue(), MapsKt.plus(createAppsFlyerParams(product.priceInLocalCurrency(), product.backendPrice(), product.localCurrency(), product.backendCurrency(), product.isSubscription(), BillingproductKt.getAmountFromProductIdSafe(product), purchaseSource, product.getProductId()), TuplesKt.to("af_total", String.valueOf(f)))));
    }

    private final void trackFirstPurchase(BillingProduct billingProduct, Purchase purchase, PurchaseSource purchaseSource, int i, Gender gender) {
        AnalyticsInteractor analyticsInteractor = this.analyticsInteractor;
        String value = CommonAnalyticsKeys.ECOMMERCE_PURCHASE_FIRST.getValue();
        double backendPrice = billingProduct.backendPrice();
        String backendCurrency = billingProduct.backendCurrency();
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        analyticsInteractor.trackEvent(new FirebaseAnalyticsEvent(value, createFirebaseParams(backendPrice, backendCurrency, orderId, purchaseSource, billingProduct.isSubscription(), BillingproductKt.getAmountFromProductIdSafe(billingProduct), i, billingProduct.getProductId())));
        Map<String, String> createAppsFlyerParams = createAppsFlyerParams(billingProduct.priceInLocalCurrency(), billingProduct.backendPrice(), billingProduct.localCurrency(), billingProduct.backendCurrency(), billingProduct.isSubscription(), BillingproductKt.getAmountFromProductIdSafe(billingProduct), purchaseSource, billingProduct.getProductId());
        this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.FIRST_PURCHASE.getValue(), createAppsFlyerParams));
        if (gender == Gender.MALE) {
            this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.MALE_FIRST_PURCHASE.getValue(), createAppsFlyerParams));
        }
    }

    private final void trackPurchase(BillingProduct billingProduct, Purchase purchase, PurchaseSource purchaseSource, int i, Gender gender) {
        if (billingProduct.isSubscription()) {
            AnalyticsInteractor analyticsInteractor = this.analyticsInteractor;
            String value = CommonAnalyticsKeys.ECOMMERCE_PURCHASE.getValue();
            double backendPrice = billingProduct.backendPrice();
            String backendCurrency = billingProduct.backendCurrency();
            String orderId = purchase.getOrderId();
            if (orderId == null) {
                orderId = "";
            }
            analyticsInteractor.trackEvent(new FirebaseAnalyticsEvent(value, createFirebaseParams(backendPrice, backendCurrency, orderId, purchaseSource, true, 0, i, billingProduct.getProductId())));
        }
        Map<String, String> createAppsFlyerParams = createAppsFlyerParams(billingProduct.priceInLocalCurrency(), billingProduct.backendPrice(), billingProduct.localCurrency(), billingProduct.backendCurrency(), billingProduct.isSubscription(), BillingproductKt.getAmountFromProductIdSafe(billingProduct), purchaseSource, billingProduct.getProductId());
        if (gender == Gender.MALE) {
            this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.AF_MALE_PURCHASE.getValue(), createAppsFlyerParams));
        }
        this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.AF_PURCHASE.getValue(), createAppsFlyerParams));
        if (billingProduct.isSubscription()) {
            this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.PREMIUM_PURCHASE.getValue(), createAppsFlyerParams));
            return;
        }
        this.analyticsInteractor.trackEvent(new AppsFlyerEvent(CommonAnalyticsKeys.NEURONS_PURCHASE.getValue(), createAppsFlyerParams));
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent(CommonAnalyticsKeys.NEURONS_PURCHASE.getValue(), createAppsFlyerParams));
    }

    private final Map<String, String> createFirebaseParams(double d, String str, String str2, PurchaseSource purchaseSource, boolean z, int i, int i2, String str3) {
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.to("value", String.valueOf(d));
        pairArr[1] = TuplesKt.to(FirebaseAnalytics.Param.CURRENCY, getCurrencyCode(str));
        pairArr[2] = TuplesKt.to(FirebaseAnalytics.Param.TRANSACTION_ID, str2);
        pairArr[3] = TuplesKt.to("SOURCE_FROM", purchaseSource.name());
        pairArr[4] = TuplesKt.to("PAYMENT_TYPE", z ? PAYMENT_TYPE__MEMBERSHIP : PAYMENT_TYPE__CREDIT);
        pairArr[5] = TuplesKt.to("CREDITS", String.valueOf(i));
        pairArr[6] = TuplesKt.to("PAYMENT_NUMBER", String.valueOf(i2));
        pairArr[7] = TuplesKt.to("RECURRENT_PAYMENT", z ? RECURRENT_PAYMENT__YES : RECURRENT_PAYMENT__NO);
        pairArr[8] = TuplesKt.to("PACKAGE", str3);
        pairArr[9] = TuplesKt.to("PAYMENT_SYSTEM", PAYMENT_SYSTEM__INAPP);
        return MapsKt.mapOf(pairArr);
    }

    private final Map<String, String> createAppsFlyerParams(double d, double d2, String str, String str2, boolean z, int i, PurchaseSource purchaseSource, String str3) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to(AFInAppEventParameterName.REVENUE, DoubleKt.toPrecision$default(d2, 0, 1, null));
        pairArr[1] = TuplesKt.to("af_revenue_locale", DoubleKt.toPrecision$default(d, 0, 1, null));
        pairArr[2] = TuplesKt.to(AFInAppEventParameterName.CURRENCY, getCurrencyCode(str2));
        pairArr[3] = TuplesKt.to("af_currency_locale", str);
        pairArr[4] = TuplesKt.to(AFInAppEventParameterName.CONTENT_ID, str3);
        pairArr[5] = TuplesKt.to("af_source_from", purchaseSource.name());
        if (z) {
            i = 1;
        }
        pairArr[6] = TuplesKt.to(AFInAppEventParameterName.QUANTITY, String.valueOf(i));
        pairArr[7] = TuplesKt.to(AFInAppEventParameterName.CONTENT_TYPE, z ? AF_CONTENT_TYPE__MEMBERSHIP : AF_CONTENT_TYPE__CREDITS);
        return MapsKt.mapOf(pairArr);
    }

    private final String getCurrencyCode(String str) {
        return Intrinsics.areEqual(str, "$") ? "USD" : Intrinsics.areEqual(str, "€") ? "EUR" : str;
    }
}
