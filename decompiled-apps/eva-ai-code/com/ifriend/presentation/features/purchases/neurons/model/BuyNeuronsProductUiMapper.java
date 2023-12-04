package com.ifriend.presentation.features.purchases.neurons.model;

import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.extensions.FormattedstringKt;
import com.ifriend.presentation.features.purchases.billing.ext.BillingproductKt;
import java.math.BigDecimal;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyNeuronsProductUiMapper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiMapper;", "", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "map", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "product", "Lcom/ifriend/billing/api/models/BillingProduct;", "iconRes", "", "isSelected", "", "isPopular", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsProductUiMapper {
    public static final int $stable = 8;
    private final ResourceProvider resources;

    @Inject
    public BuyNeuronsProductUiMapper(ResourceProvider resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    public static /* synthetic */ BuyNeuronsProductUiParams map$default(BuyNeuronsProductUiMapper buyNeuronsProductUiMapper, BillingProduct billingProduct, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return buyNeuronsProductUiMapper.map(billingProduct, i, z, z2);
    }

    public final BuyNeuronsProductUiParams map(BillingProduct product, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BuyNeuronsProductUiParams(product.getProductId(), i, this.resources.getString(R.string.buy_neurons__card_title, FormattedstringKt.toFormattedString$default(new BigDecimal(BillingproductKt.getAmountFromProductIdSafe(product)), null, 1, null)), product.getPriceLabel(), z2, z);
    }
}
