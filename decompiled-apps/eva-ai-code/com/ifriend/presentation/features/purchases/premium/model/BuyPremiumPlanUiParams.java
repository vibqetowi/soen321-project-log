package com.ifriend.presentation.features.purchases.premium.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: BuyPremiumPlanUiParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "", "id", "", "sku", "durationTitle", "durationSubtitle", "monthPriceLabel", "priceLabel", "saveLabel", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDurationSubtitle", "()Ljava/lang/String;", "getDurationTitle", "getId", "()Z", "isVisibleSaveLabel", "getMonthPriceLabel", "getPriceLabel", "getSaveLabel", "getSku", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumPlanUiParams {
    public static final int $stable = 0;
    private final String durationSubtitle;
    private final String durationTitle;
    private final String id;
    private final boolean isSelected;
    private final boolean isVisibleSaveLabel;
    private final String monthPriceLabel;
    private final String priceLabel;
    private final String saveLabel;
    private final String sku;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.sku;
    }

    public final String component3() {
        return this.durationTitle;
    }

    public final String component4() {
        return this.durationSubtitle;
    }

    public final String component5() {
        return this.monthPriceLabel;
    }

    public final String component6() {
        return this.priceLabel;
    }

    public final String component7() {
        return this.saveLabel;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    public final BuyPremiumPlanUiParams copy(String id, String sku, String durationTitle, String durationSubtitle, String monthPriceLabel, String priceLabel, String saveLabel, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(durationTitle, "durationTitle");
        Intrinsics.checkNotNullParameter(durationSubtitle, "durationSubtitle");
        Intrinsics.checkNotNullParameter(monthPriceLabel, "monthPriceLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        Intrinsics.checkNotNullParameter(saveLabel, "saveLabel");
        return new BuyPremiumPlanUiParams(id, sku, durationTitle, durationSubtitle, monthPriceLabel, priceLabel, saveLabel, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyPremiumPlanUiParams) {
            BuyPremiumPlanUiParams buyPremiumPlanUiParams = (BuyPremiumPlanUiParams) obj;
            return Intrinsics.areEqual(this.id, buyPremiumPlanUiParams.id) && Intrinsics.areEqual(this.sku, buyPremiumPlanUiParams.sku) && Intrinsics.areEqual(this.durationTitle, buyPremiumPlanUiParams.durationTitle) && Intrinsics.areEqual(this.durationSubtitle, buyPremiumPlanUiParams.durationSubtitle) && Intrinsics.areEqual(this.monthPriceLabel, buyPremiumPlanUiParams.monthPriceLabel) && Intrinsics.areEqual(this.priceLabel, buyPremiumPlanUiParams.priceLabel) && Intrinsics.areEqual(this.saveLabel, buyPremiumPlanUiParams.saveLabel) && this.isSelected == buyPremiumPlanUiParams.isSelected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.id.hashCode() * 31) + this.sku.hashCode()) * 31) + this.durationTitle.hashCode()) * 31) + this.durationSubtitle.hashCode()) * 31) + this.monthPriceLabel.hashCode()) * 31) + this.priceLabel.hashCode()) * 31) + this.saveLabel.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.sku;
        String str3 = this.durationTitle;
        String str4 = this.durationSubtitle;
        String str5 = this.monthPriceLabel;
        String str6 = this.priceLabel;
        String str7 = this.saveLabel;
        boolean z = this.isSelected;
        return "BuyPremiumPlanUiParams(id=" + str + ", sku=" + str2 + ", durationTitle=" + str3 + ", durationSubtitle=" + str4 + ", monthPriceLabel=" + str5 + ", priceLabel=" + str6 + ", saveLabel=" + str7 + ", isSelected=" + z + ")";
    }

    public BuyPremiumPlanUiParams(String id, String sku, String durationTitle, String durationSubtitle, String monthPriceLabel, String priceLabel, String saveLabel, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(durationTitle, "durationTitle");
        Intrinsics.checkNotNullParameter(durationSubtitle, "durationSubtitle");
        Intrinsics.checkNotNullParameter(monthPriceLabel, "monthPriceLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        Intrinsics.checkNotNullParameter(saveLabel, "saveLabel");
        this.id = id;
        this.sku = sku;
        this.durationTitle = durationTitle;
        this.durationSubtitle = durationSubtitle;
        this.monthPriceLabel = monthPriceLabel;
        this.priceLabel = priceLabel;
        this.saveLabel = saveLabel;
        this.isSelected = z;
        this.isVisibleSaveLabel = !StringsKt.isBlank(saveLabel);
    }

    public /* synthetic */ BuyPremiumPlanUiParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? false : z);
    }

    public final String getId() {
        return this.id;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getDurationTitle() {
        return this.durationTitle;
    }

    public final String getDurationSubtitle() {
        return this.durationSubtitle;
    }

    public final String getMonthPriceLabel() {
        return this.monthPriceLabel;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final String getSaveLabel() {
        return this.saveLabel;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isVisibleSaveLabel() {
        return this.isVisibleSaveLabel;
    }
}
