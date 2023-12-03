package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: ProviderDetailHolderModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ProviderDetailExperience;", "", "year", "", "(I)V", "getYear", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderDetailExperience {
    private final int year;

    public ProviderDetailExperience(int i6) {
        this.year = i6;
    }

    public static /* synthetic */ ProviderDetailExperience copy$default(ProviderDetailExperience providerDetailExperience, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = providerDetailExperience.year;
        }
        return providerDetailExperience.copy(i6);
    }

    public final int component1() {
        return this.year;
    }

    public final ProviderDetailExperience copy(int i6) {
        return new ProviderDetailExperience(i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ProviderDetailExperience) && this.year == ((ProviderDetailExperience) obj).year) {
            return true;
        }
        return false;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.year;
    }

    public String toString() {
        return c.s(new StringBuilder("ProviderDetailExperience(year="), this.year, ')');
    }
}
