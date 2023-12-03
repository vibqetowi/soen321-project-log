package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: OrganizationExperimentOverrideData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideData;", "", "data", "Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideList;", "(Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideList;)V", "getData", "()Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OrganizationExperimentOverrideData {
    private final OrganizationExperimentOverrideList data;

    public OrganizationExperimentOverrideData(OrganizationExperimentOverrideList data) {
        i.g(data, "data");
        this.data = data;
    }

    public static /* synthetic */ OrganizationExperimentOverrideData copy$default(OrganizationExperimentOverrideData organizationExperimentOverrideData, OrganizationExperimentOverrideList organizationExperimentOverrideList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            organizationExperimentOverrideList = organizationExperimentOverrideData.data;
        }
        return organizationExperimentOverrideData.copy(organizationExperimentOverrideList);
    }

    public final OrganizationExperimentOverrideList component1() {
        return this.data;
    }

    public final OrganizationExperimentOverrideData copy(OrganizationExperimentOverrideList data) {
        i.g(data, "data");
        return new OrganizationExperimentOverrideData(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OrganizationExperimentOverrideData) && i.b(this.data, ((OrganizationExperimentOverrideData) obj).data)) {
            return true;
        }
        return false;
    }

    public final OrganizationExperimentOverrideList getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "OrganizationExperimentOverrideData(data=" + this.data + ')';
    }
}
