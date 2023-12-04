package com.ifriend.presentation.features.purchases.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: SubscriptionBenefits.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", "", "titleLabel", "", "benefits", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsUiParams;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getBenefits", "()Lkotlinx/collections/immutable/ImmutableList;", "getTitleLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsGroupUiParams {
    public static final int $stable = 0;
    private final ImmutableList<SubscriptionBenefitsUiParams> benefits;
    private final String titleLabel;

    public SubscriptionBenefitsGroupUiParams() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionBenefitsGroupUiParams copy$default(SubscriptionBenefitsGroupUiParams subscriptionBenefitsGroupUiParams, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionBenefitsGroupUiParams.titleLabel;
        }
        if ((i & 2) != 0) {
            immutableList = subscriptionBenefitsGroupUiParams.benefits;
        }
        return subscriptionBenefitsGroupUiParams.copy(str, immutableList);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final ImmutableList<SubscriptionBenefitsUiParams> component2() {
        return this.benefits;
    }

    public final SubscriptionBenefitsGroupUiParams copy(String titleLabel, ImmutableList<SubscriptionBenefitsUiParams> benefits) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new SubscriptionBenefitsGroupUiParams(titleLabel, benefits);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriptionBenefitsGroupUiParams) {
            SubscriptionBenefitsGroupUiParams subscriptionBenefitsGroupUiParams = (SubscriptionBenefitsGroupUiParams) obj;
            return Intrinsics.areEqual(this.titleLabel, subscriptionBenefitsGroupUiParams.titleLabel) && Intrinsics.areEqual(this.benefits, subscriptionBenefitsGroupUiParams.benefits);
        }
        return false;
    }

    public int hashCode() {
        return (this.titleLabel.hashCode() * 31) + this.benefits.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        ImmutableList<SubscriptionBenefitsUiParams> immutableList = this.benefits;
        return "SubscriptionBenefitsGroupUiParams(titleLabel=" + str + ", benefits=" + immutableList + ")";
    }

    public SubscriptionBenefitsGroupUiParams(String titleLabel, ImmutableList<SubscriptionBenefitsUiParams> benefits) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.titleLabel = titleLabel;
        this.benefits = benefits;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public /* synthetic */ SubscriptionBenefitsGroupUiParams(String str, PersistentList persistentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ExtensionsKt.persistentListOf() : persistentList);
    }

    public final ImmutableList<SubscriptionBenefitsUiParams> getBenefits() {
        return this.benefits;
    }
}
