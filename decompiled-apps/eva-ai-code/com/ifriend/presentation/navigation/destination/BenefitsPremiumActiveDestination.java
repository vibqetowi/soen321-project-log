package com.ifriend.presentation.navigation.destination;

import kotlin.Metadata;
/* compiled from: BenefitsPremiumActiveDestination.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/BenefitsPremiumActiveDestination;", "Lcom/ifriend/presentation/navigation/destination/NavigationDestination;", "()V", "destination", "", "getDestination", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BenefitsPremiumActiveDestination implements NavigationDestination {
    public static final int $stable = 0;
    public static final BenefitsPremiumActiveDestination INSTANCE = new BenefitsPremiumActiveDestination();
    private static final String destination = "benefits_premium_active_destination";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BenefitsPremiumActiveDestination) {
            BenefitsPremiumActiveDestination benefitsPremiumActiveDestination = (BenefitsPremiumActiveDestination) obj;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 2007402439;
    }

    public String toString() {
        return "BenefitsPremiumActiveDestination";
    }

    private BenefitsPremiumActiveDestination() {
    }

    @Override // com.ifriend.presentation.navigation.destination.NavigationDestination
    public String getDestination() {
        return destination;
    }
}
