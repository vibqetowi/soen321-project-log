package com.ifriend.presentation.features.purchases.neurons.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyNeuronsProductUiParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "", "productId", "", "iconRes", "", "titleLabel", "priceLabel", "isMostPopular", "", "isSelected", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V", "getIconRes", "()I", "()Z", "getPriceLabel", "()Ljava/lang/String;", "getProductId", "getTitleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsProductUiParams {
    public static final int $stable = 0;
    private final int iconRes;
    private final boolean isMostPopular;
    private final boolean isSelected;
    private final String priceLabel;
    private final String productId;
    private final String titleLabel;

    public static /* synthetic */ BuyNeuronsProductUiParams copy$default(BuyNeuronsProductUiParams buyNeuronsProductUiParams, String str, int i, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buyNeuronsProductUiParams.productId;
        }
        if ((i2 & 2) != 0) {
            i = buyNeuronsProductUiParams.iconRes;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = buyNeuronsProductUiParams.titleLabel;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = buyNeuronsProductUiParams.priceLabel;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            z = buyNeuronsProductUiParams.isMostPopular;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = buyNeuronsProductUiParams.isSelected;
        }
        return buyNeuronsProductUiParams.copy(str, i3, str4, str5, z3, z2);
    }

    public final String component1() {
        return this.productId;
    }

    public final int component2() {
        return this.iconRes;
    }

    public final String component3() {
        return this.titleLabel;
    }

    public final String component4() {
        return this.priceLabel;
    }

    public final boolean component5() {
        return this.isMostPopular;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final BuyNeuronsProductUiParams copy(String productId, int i, String titleLabel, String priceLabel, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        return new BuyNeuronsProductUiParams(productId, i, titleLabel, priceLabel, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyNeuronsProductUiParams) {
            BuyNeuronsProductUiParams buyNeuronsProductUiParams = (BuyNeuronsProductUiParams) obj;
            return Intrinsics.areEqual(this.productId, buyNeuronsProductUiParams.productId) && this.iconRes == buyNeuronsProductUiParams.iconRes && Intrinsics.areEqual(this.titleLabel, buyNeuronsProductUiParams.titleLabel) && Intrinsics.areEqual(this.priceLabel, buyNeuronsProductUiParams.priceLabel) && this.isMostPopular == buyNeuronsProductUiParams.isMostPopular && this.isSelected == buyNeuronsProductUiParams.isSelected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.productId.hashCode() * 31) + this.iconRes) * 31) + this.titleLabel.hashCode()) * 31) + this.priceLabel.hashCode()) * 31;
        boolean z = this.isMostPopular;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isSelected;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.productId;
        int i = this.iconRes;
        String str2 = this.titleLabel;
        String str3 = this.priceLabel;
        boolean z = this.isMostPopular;
        boolean z2 = this.isSelected;
        return "BuyNeuronsProductUiParams(productId=" + str + ", iconRes=" + i + ", titleLabel=" + str2 + ", priceLabel=" + str3 + ", isMostPopular=" + z + ", isSelected=" + z2 + ")";
    }

    public BuyNeuronsProductUiParams(String productId, int i, String titleLabel, String priceLabel, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        this.productId = productId;
        this.iconRes = i;
        this.titleLabel = titleLabel;
        this.priceLabel = priceLabel;
        this.isMostPopular = z;
        this.isSelected = z2;
    }

    public /* synthetic */ BuyNeuronsProductUiParams(String str, int i, String str2, String str3, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final boolean isMostPopular() {
        return this.isMostPopular;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
