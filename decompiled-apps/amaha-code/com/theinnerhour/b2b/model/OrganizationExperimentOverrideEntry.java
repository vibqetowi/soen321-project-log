package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: OrganizationExperimentOverrideData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/OrganizationExperimentOverrideEntry;", "", "experimentName", "", "experimentValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getExperimentName", "()Ljava/lang/String;", "getExperimentValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OrganizationExperimentOverrideEntry {
    @b("experiment_name")
    private final String experimentName;
    @b("experiment_value")
    private final String experimentValue;

    public OrganizationExperimentOverrideEntry(String experimentName, String experimentValue) {
        i.g(experimentName, "experimentName");
        i.g(experimentValue, "experimentValue");
        this.experimentName = experimentName;
        this.experimentValue = experimentValue;
    }

    public static /* synthetic */ OrganizationExperimentOverrideEntry copy$default(OrganizationExperimentOverrideEntry organizationExperimentOverrideEntry, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = organizationExperimentOverrideEntry.experimentName;
        }
        if ((i6 & 2) != 0) {
            str2 = organizationExperimentOverrideEntry.experimentValue;
        }
        return organizationExperimentOverrideEntry.copy(str, str2);
    }

    public final String component1() {
        return this.experimentName;
    }

    public final String component2() {
        return this.experimentValue;
    }

    public final OrganizationExperimentOverrideEntry copy(String experimentName, String experimentValue) {
        i.g(experimentName, "experimentName");
        i.g(experimentValue, "experimentValue");
        return new OrganizationExperimentOverrideEntry(experimentName, experimentValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationExperimentOverrideEntry)) {
            return false;
        }
        OrganizationExperimentOverrideEntry organizationExperimentOverrideEntry = (OrganizationExperimentOverrideEntry) obj;
        if (i.b(this.experimentName, organizationExperimentOverrideEntry.experimentName) && i.b(this.experimentValue, organizationExperimentOverrideEntry.experimentValue)) {
            return true;
        }
        return false;
    }

    public final String getExperimentName() {
        return this.experimentName;
    }

    public final String getExperimentValue() {
        return this.experimentValue;
    }

    public int hashCode() {
        return this.experimentValue.hashCode() + (this.experimentName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrganizationExperimentOverrideEntry(experimentName=");
        sb2.append(this.experimentName);
        sb2.append(", experimentValue=");
        return g.c(sb2, this.experimentValue, ')');
    }
}
