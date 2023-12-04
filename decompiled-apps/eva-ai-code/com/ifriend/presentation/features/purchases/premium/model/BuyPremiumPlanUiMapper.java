package com.ifriend.presentation.features.purchases.premium.model;

import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
/* compiled from: BuyPremiumPlanUiMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiMapper;", "", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "map", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "product", "Lcom/ifriend/billing/api/models/BillingProduct;", "maxPrice", "", "isSelected", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumPlanUiMapper {
    public static final int $stable = 8;
    private final ResourceProvider resources;

    @Inject
    public BuyPremiumPlanUiMapper(ResourceProvider resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    public static /* synthetic */ BuyPremiumPlanUiParams map$default(BuyPremiumPlanUiMapper buyPremiumPlanUiMapper, BillingProduct billingProduct, double d, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return buyPremiumPlanUiMapper.map(billingProduct, d, z);
    }

    public final BuyPremiumPlanUiParams map(BillingProduct product, double d, boolean z) {
        Intrinsics.checkNotNullParameter(product, "product");
        double priceForOneMonth = product.getPriceForOneMonth();
        String string = !((priceForOneMonth > d ? 1 : (priceForOneMonth == d ? 0 : -1)) == 0) ? this.resources.getString(R.string.buy_premium__save_label, Integer.valueOf(100 - MathKt.roundToInt((priceForOneMonth / d) * 100))) : "";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(priceForOneMonth)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        Currency currency = product.getPrice().getCurrency();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String productId = product.getProductId();
        String valueOf = String.valueOf(product.getSubscriptionMonths());
        String upperCase = this.resources.getQuantityString(R.plurals.month, product.getSubscriptionMonths()).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        ResourceProvider resourceProvider = this.resources;
        int i = R.string.buy_premium__per_month;
        String symbol = currency.getSymbol();
        String string2 = resourceProvider.getString(i, symbol + " " + format);
        String priceLabel = product.getPriceLabel();
        String upperCase2 = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return new BuyPremiumPlanUiParams(uuid, productId, valueOf, upperCase, string2, priceLabel, upperCase2, z);
    }
}
