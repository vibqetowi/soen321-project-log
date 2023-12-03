package com.theinnerhour.b2b.components.multiTracker.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: MultiTrackerFirestoreStatsModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/model/UserTrackFirestoreParentModel;", "", "multiTrackerStats", "Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFirestoreStatsModel;", "(Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFirestoreStatsModel;)V", "getMultiTrackerStats", "()Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFirestoreStatsModel;", "setMultiTrackerStats", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserTrackFirestoreParentModel {
    private MultiTrackerFirestoreStatsModel multiTrackerStats;

    public UserTrackFirestoreParentModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ UserTrackFirestoreParentModel copy$default(UserTrackFirestoreParentModel userTrackFirestoreParentModel, MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            multiTrackerFirestoreStatsModel = userTrackFirestoreParentModel.multiTrackerStats;
        }
        return userTrackFirestoreParentModel.copy(multiTrackerFirestoreStatsModel);
    }

    public final MultiTrackerFirestoreStatsModel component1() {
        return this.multiTrackerStats;
    }

    public final UserTrackFirestoreParentModel copy(MultiTrackerFirestoreStatsModel multiTrackerStats) {
        i.g(multiTrackerStats, "multiTrackerStats");
        return new UserTrackFirestoreParentModel(multiTrackerStats);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UserTrackFirestoreParentModel) && i.b(this.multiTrackerStats, ((UserTrackFirestoreParentModel) obj).multiTrackerStats)) {
            return true;
        }
        return false;
    }

    public final MultiTrackerFirestoreStatsModel getMultiTrackerStats() {
        return this.multiTrackerStats;
    }

    public int hashCode() {
        return this.multiTrackerStats.hashCode();
    }

    public final void setMultiTrackerStats(MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel) {
        i.g(multiTrackerFirestoreStatsModel, "<set-?>");
        this.multiTrackerStats = multiTrackerFirestoreStatsModel;
    }

    public String toString() {
        return "UserTrackFirestoreParentModel(multiTrackerStats=" + this.multiTrackerStats + ')';
    }

    public UserTrackFirestoreParentModel(MultiTrackerFirestoreStatsModel multiTrackerStats) {
        i.g(multiTrackerStats, "multiTrackerStats");
        this.multiTrackerStats = multiTrackerStats;
    }

    public /* synthetic */ UserTrackFirestoreParentModel(MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel, int i6, d dVar) {
        this((i6 & 1) != 0 ? new MultiTrackerFirestoreStatsModel(0, 0, 0, 0, 0, 0, 0L, 0L, 0, 511, null) : multiTrackerFirestoreStatsModel);
    }
}
