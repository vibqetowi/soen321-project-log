package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: RegionalOfflineCenterLocationsModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/RegionalOfflineCenterLocationsListModel;", "", "locationList", "", "Lcom/theinnerhour/b2b/components/telecommunications/model/CenterLocationModel;", "(Ljava/util/List;)V", "getLocationList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class RegionalOfflineCenterLocationsListModel {
    @b("data")
    private final List<CenterLocationModel> locationList;

    public RegionalOfflineCenterLocationsListModel(List<CenterLocationModel> list) {
        this.locationList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionalOfflineCenterLocationsListModel copy$default(RegionalOfflineCenterLocationsListModel regionalOfflineCenterLocationsListModel, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = regionalOfflineCenterLocationsListModel.locationList;
        }
        return regionalOfflineCenterLocationsListModel.copy(list);
    }

    public final List<CenterLocationModel> component1() {
        return this.locationList;
    }

    public final RegionalOfflineCenterLocationsListModel copy(List<CenterLocationModel> list) {
        return new RegionalOfflineCenterLocationsListModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RegionalOfflineCenterLocationsListModel) && i.b(this.locationList, ((RegionalOfflineCenterLocationsListModel) obj).locationList)) {
            return true;
        }
        return false;
    }

    public final List<CenterLocationModel> getLocationList() {
        return this.locationList;
    }

    public int hashCode() {
        List<CenterLocationModel> list = this.locationList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "RegionalOfflineCenterLocationsListModel(locationList=" + this.locationList + ')';
    }
}
