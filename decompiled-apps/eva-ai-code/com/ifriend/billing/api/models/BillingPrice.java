package com.ifriend.billing.api.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingProduct.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPrice;", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "Ljava/util/Currency;", "(Ljava/math/BigDecimal;Ljava/util/Currency;)V", "getCurrency", "()Ljava/util/Currency;", "getPrice", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "currencySymbol", "", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPrice {
    private final Currency currency;
    private final BigDecimal price;

    public static /* synthetic */ BillingPrice copy$default(BillingPrice billingPrice, BigDecimal bigDecimal, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = billingPrice.price;
        }
        if ((i & 2) != 0) {
            currency = billingPrice.currency;
        }
        return billingPrice.copy(bigDecimal, currency);
    }

    public final BigDecimal component1() {
        return this.price;
    }

    public final Currency component2() {
        return this.currency;
    }

    public final BillingPrice copy(BigDecimal price, Currency currency) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new BillingPrice(price, currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingPrice) {
            BillingPrice billingPrice = (BillingPrice) obj;
            return Intrinsics.areEqual(this.price, billingPrice.price) && Intrinsics.areEqual(this.currency, billingPrice.currency);
        }
        return false;
    }

    public int hashCode() {
        return (this.price.hashCode() * 31) + this.currency.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.price;
        Currency currency = this.currency;
        return "BillingPrice(price=" + bigDecimal + ", currency=" + currency + ")";
    }

    public BillingPrice(BigDecimal price, Currency currency) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.price = price;
        this.currency = currency;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String currencySymbol() {
        String symbol = this.currency.getSymbol(Locale.US);
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }
}
