package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: OrganizationExperimentOverrideData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideList;", "", "list", "", "Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideEntry;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OrganizationExperimentOverrideList {
    private final List<OrganizationExperimentOverrideEntry> list;

    public OrganizationExperimentOverrideList(List<OrganizationExperimentOverrideEntry> list) {
        i.g(list, "list");
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrganizationExperimentOverrideList copy$default(OrganizationExperimentOverrideList organizationExperimentOverrideList, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = organizationExperimentOverrideList.list;
        }
        return organizationExperimentOverrideList.copy(list);
    }

    public final List<OrganizationExperimentOverrideEntry> component1() {
        return this.list;
    }

    public final OrganizationExperimentOverrideList copy(List<OrganizationExperimentOverrideEntry> list) {
        i.g(list, "list");
        return new OrganizationExperimentOverrideList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OrganizationExperimentOverrideList) && i.b(this.list, ((OrganizationExperimentOverrideList) obj).list)) {
            return true;
        }
        return false;
    }

    public final List<OrganizationExperimentOverrideEntry> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return "OrganizationExperimentOverrideList(list=" + this.list + ')';
    }
}
