package com.ifriend.chat.domain.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PremiumBenefit.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/chat/domain/models/PremiumBenefit;", "", "benefit", "", "(Ljava/lang/String;)V", "getBenefit", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumBenefit {
    private final String benefit;

    public static /* synthetic */ PremiumBenefit copy$default(PremiumBenefit premiumBenefit, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = premiumBenefit.benefit;
        }
        return premiumBenefit.copy(str);
    }

    public final String component1() {
        return this.benefit;
    }

    public final PremiumBenefit copy(String benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        return new PremiumBenefit(benefit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PremiumBenefit) && Intrinsics.areEqual(this.benefit, ((PremiumBenefit) obj).benefit);
    }

    public int hashCode() {
        return this.benefit.hashCode();
    }

    public String toString() {
        String str = this.benefit;
        return "PremiumBenefit(benefit=" + str + ")";
    }

    public PremiumBenefit(String benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        this.benefit = benefit;
    }

    public final String getBenefit() {
        return this.benefit;
    }
}
