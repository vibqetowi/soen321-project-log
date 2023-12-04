package com.ifriend.presentation.features.purchases.common.model;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SubscriptionBenefits.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsUiParams;", "", "titleLabel", "", "titleFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "descriptionLabel", "descriptionFontWeight", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;)V", "getDescriptionFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getDescriptionLabel", "()Ljava/lang/String;", "getTitleFontWeight", "getTitleLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsUiParams {
    public static final int $stable = 0;
    private final FontWeight descriptionFontWeight;
    private final String descriptionLabel;
    private final FontWeight titleFontWeight;
    private final String titleLabel;

    public static /* synthetic */ SubscriptionBenefitsUiParams copy$default(SubscriptionBenefitsUiParams subscriptionBenefitsUiParams, String str, FontWeight fontWeight, String str2, FontWeight fontWeight2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionBenefitsUiParams.titleLabel;
        }
        if ((i & 2) != 0) {
            fontWeight = subscriptionBenefitsUiParams.titleFontWeight;
        }
        if ((i & 4) != 0) {
            str2 = subscriptionBenefitsUiParams.descriptionLabel;
        }
        if ((i & 8) != 0) {
            fontWeight2 = subscriptionBenefitsUiParams.descriptionFontWeight;
        }
        return subscriptionBenefitsUiParams.copy(str, fontWeight, str2, fontWeight2);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final FontWeight component2() {
        return this.titleFontWeight;
    }

    public final String component3() {
        return this.descriptionLabel;
    }

    public final FontWeight component4() {
        return this.descriptionFontWeight;
    }

    public final SubscriptionBenefitsUiParams copy(String titleLabel, FontWeight titleFontWeight, String descriptionLabel, FontWeight descriptionFontWeight) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(titleFontWeight, "titleFontWeight");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(descriptionFontWeight, "descriptionFontWeight");
        return new SubscriptionBenefitsUiParams(titleLabel, titleFontWeight, descriptionLabel, descriptionFontWeight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriptionBenefitsUiParams) {
            SubscriptionBenefitsUiParams subscriptionBenefitsUiParams = (SubscriptionBenefitsUiParams) obj;
            return Intrinsics.areEqual(this.titleLabel, subscriptionBenefitsUiParams.titleLabel) && Intrinsics.areEqual(this.titleFontWeight, subscriptionBenefitsUiParams.titleFontWeight) && Intrinsics.areEqual(this.descriptionLabel, subscriptionBenefitsUiParams.descriptionLabel) && Intrinsics.areEqual(this.descriptionFontWeight, subscriptionBenefitsUiParams.descriptionFontWeight);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.titleLabel.hashCode() * 31) + this.titleFontWeight.hashCode()) * 31) + this.descriptionLabel.hashCode()) * 31) + this.descriptionFontWeight.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        FontWeight fontWeight = this.titleFontWeight;
        String str2 = this.descriptionLabel;
        FontWeight fontWeight2 = this.descriptionFontWeight;
        return "SubscriptionBenefitsUiParams(titleLabel=" + str + ", titleFontWeight=" + fontWeight + ", descriptionLabel=" + str2 + ", descriptionFontWeight=" + fontWeight2 + ")";
    }

    public SubscriptionBenefitsUiParams(String titleLabel, FontWeight titleFontWeight, String descriptionLabel, FontWeight descriptionFontWeight) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(titleFontWeight, "titleFontWeight");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(descriptionFontWeight, "descriptionFontWeight");
        this.titleLabel = titleLabel;
        this.titleFontWeight = titleFontWeight;
        this.descriptionLabel = descriptionLabel;
        this.descriptionFontWeight = descriptionFontWeight;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public /* synthetic */ SubscriptionBenefitsUiParams(String str, FontWeight fontWeight, String str2, FontWeight fontWeight2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? FontWeight.Companion.getSemiBold() : fontWeight, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? FontWeight.Companion.getNormal() : fontWeight2);
    }

    public final FontWeight getTitleFontWeight() {
        return this.titleFontWeight;
    }

    public final String getDescriptionLabel() {
        return this.descriptionLabel;
    }

    public final FontWeight getDescriptionFontWeight() {
        return this.descriptionFontWeight;
    }
}
