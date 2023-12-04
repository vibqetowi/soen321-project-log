package com.ifiend.billing.impl.data;

import com.android.billingclient.api.ProductDetails;
import com.ifriend.billing.api.models.BillingPrice;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.common_utils.extensions.BigdecimalKt;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.remote.datasources.billing.models.BillingProductRemote;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.threeten.bp.Period;
/* compiled from: BillingProductMapper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/ifiend/billing/impl/data/BillingProductMapper;", "", "()V", "calculatePriceAndCurrency", "Lcom/ifriend/billing/api/models/BillingPrice;", "offerDetails", "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "pricingPhases", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "map", "Lcom/ifriend/billing/api/models/BillingProduct;", "productRemote", "Lcom/ifriend/core/remote/datasources/billing/models/BillingProductRemote;", "product", "Lcom/android/billingclient/api/ProductDetails;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingProductMapper {
    public static final double AMOUNT_MICROS = 1000000.0d;
    public static final Companion Companion = new Companion(null);

    /* compiled from: BillingProductMapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifiend/billing/impl/data/BillingProductMapper$Companion;", "", "()V", "AMOUNT_MICROS", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final BillingProduct map(BillingProductRemote productRemote, ProductDetails product) {
        int i;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        ProductDetails.PricingPhase pricingPhase;
        ProductDetails.PricingPhases pricingPhases2;
        List<ProductDetails.PricingPhase> pricingPhaseList2;
        ProductDetails.PricingPhase pricingPhase2;
        Intrinsics.checkNotNullParameter(productRemote, "productRemote");
        Intrinsics.checkNotNullParameter(product, "product");
        BigDecimal bigDecimalOrZero = BigdecimalKt.toBigDecimalOrZero(productRemote.getPrice());
        Currency currency = Currency.getInstance(productRemote.getCurrency());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        BillingPrice billingPrice = new BillingPrice(bigDecimalOrZero, currency);
        if (Intrinsics.areEqual(product.getProductType(), "inapp")) {
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = product.getOneTimePurchaseOfferDetails();
            if (oneTimePurchaseOfferDetails == null) {
                return null;
            }
            BillingPrice calculatePriceAndCurrency = calculatePriceAndCurrency(oneTimePurchaseOfferDetails);
            String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
            Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
            return new BillingProduct(productRemote.getProductId(), billingPrice, calculatePriceAndCurrency, product, formattedPrice, 0);
        }
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = product.getSubscriptionOfferDetails();
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = subscriptionOfferDetails != null ? (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List<? extends Object>) subscriptionOfferDetails) : null;
        String billingPeriod = (subscriptionOfferDetails2 == null || (pricingPhases2 = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList2 = pricingPhases2.getPricingPhaseList()) == null || (pricingPhase2 = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List<? extends Object>) pricingPhaseList2)) == null) ? null : pricingPhase2.getBillingPeriod();
        if (billingPeriod == null) {
            billingPeriod = "";
        }
        String str = billingPeriod;
        if (!StringsKt.isBlank(str)) {
            Period parse = Period.parse(str);
            i = parse.getMonths() + (parse.getYears() * 12);
        } else {
            i = 0;
        }
        if (subscriptionOfferDetails2 == null || (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null || (pricingPhase = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List<? extends Object>) pricingPhaseList)) == null) {
            return null;
        }
        BillingPrice calculatePriceAndCurrency2 = calculatePriceAndCurrency(pricingPhase);
        String productId = productRemote.getProductId();
        String formattedPrice2 = pricingPhase.getFormattedPrice();
        Intrinsics.checkNotNull(formattedPrice2);
        return new BillingProduct(productId, billingPrice, calculatePriceAndCurrency2, product, formattedPrice2, i);
    }

    private final BillingPrice calculatePriceAndCurrency(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        BigDecimal bigDecimal = new BigDecimal(ommonKt.orZero(Long.valueOf(oneTimePurchaseOfferDetails.getPriceAmountMicros())) / 1000000.0d);
        Currency currency = Currency.getInstance(priceCurrencyCode);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return new BillingPrice(bigDecimal, currency);
    }

    private final BillingPrice calculatePriceAndCurrency(ProductDetails.PricingPhase pricingPhase) {
        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        BigDecimal bigDecimal = new BigDecimal(ommonKt.orZero(Long.valueOf(pricingPhase.getPriceAmountMicros())) / 1000000.0d);
        Currency currency = Currency.getInstance(priceCurrencyCode);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return new BillingPrice(bigDecimal, currency);
    }
}
