package com.theinnerhour.b2b.components.multiTracker.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
/* compiled from: MultiTrackerFirestoreStatsModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jc\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u00064"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFirestoreStatsModel;", "", "dayTrackedCount", "", "mood1TrackCount", "mood2TrackCount", "mood3TrackCount", "mood4TrackCount", "mood5TrackCount", "latestTrackedDateInSeconds", "", "earliestTrackedDateInSeconds", "trackStreak", "(IIIIIIJJI)V", "getDayTrackedCount", "()I", "setDayTrackedCount", "(I)V", "getEarliestTrackedDateInSeconds", "()J", "setEarliestTrackedDateInSeconds", "(J)V", "getLatestTrackedDateInSeconds", "setLatestTrackedDateInSeconds", "getMood1TrackCount", "setMood1TrackCount", "getMood2TrackCount", "setMood2TrackCount", "getMood3TrackCount", "setMood3TrackCount", "getMood4TrackCount", "setMood4TrackCount", "getMood5TrackCount", "setMood5TrackCount", "getTrackStreak", "setTrackStreak", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MultiTrackerFirestoreStatsModel {
    private int dayTrackedCount;
    private long earliestTrackedDateInSeconds;
    private long latestTrackedDateInSeconds;
    private int mood1TrackCount;
    private int mood2TrackCount;
    private int mood3TrackCount;
    private int mood4TrackCount;
    private int mood5TrackCount;
    private int trackStreak;

    public MultiTrackerFirestoreStatsModel() {
        this(0, 0, 0, 0, 0, 0, 0L, 0L, 0, 511, null);
    }

    public static /* synthetic */ MultiTrackerFirestoreStatsModel copy$default(MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel, int i6, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, Object obj) {
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j12;
        long j13;
        int i23;
        if ((i16 & 1) != 0) {
            i17 = multiTrackerFirestoreStatsModel.dayTrackedCount;
        } else {
            i17 = i6;
        }
        if ((i16 & 2) != 0) {
            i18 = multiTrackerFirestoreStatsModel.mood1TrackCount;
        } else {
            i18 = i10;
        }
        if ((i16 & 4) != 0) {
            i19 = multiTrackerFirestoreStatsModel.mood2TrackCount;
        } else {
            i19 = i11;
        }
        if ((i16 & 8) != 0) {
            i20 = multiTrackerFirestoreStatsModel.mood3TrackCount;
        } else {
            i20 = i12;
        }
        if ((i16 & 16) != 0) {
            i21 = multiTrackerFirestoreStatsModel.mood4TrackCount;
        } else {
            i21 = i13;
        }
        if ((i16 & 32) != 0) {
            i22 = multiTrackerFirestoreStatsModel.mood5TrackCount;
        } else {
            i22 = i14;
        }
        if ((i16 & 64) != 0) {
            j12 = multiTrackerFirestoreStatsModel.latestTrackedDateInSeconds;
        } else {
            j12 = j10;
        }
        if ((i16 & 128) != 0) {
            j13 = multiTrackerFirestoreStatsModel.earliestTrackedDateInSeconds;
        } else {
            j13 = j11;
        }
        if ((i16 & 256) != 0) {
            i23 = multiTrackerFirestoreStatsModel.trackStreak;
        } else {
            i23 = i15;
        }
        return multiTrackerFirestoreStatsModel.copy(i17, i18, i19, i20, i21, i22, j12, j13, i23);
    }

    public final int component1() {
        return this.dayTrackedCount;
    }

    public final int component2() {
        return this.mood1TrackCount;
    }

    public final int component3() {
        return this.mood2TrackCount;
    }

    public final int component4() {
        return this.mood3TrackCount;
    }

    public final int component5() {
        return this.mood4TrackCount;
    }

    public final int component6() {
        return this.mood5TrackCount;
    }

    public final long component7() {
        return this.latestTrackedDateInSeconds;
    }

    public final long component8() {
        return this.earliestTrackedDateInSeconds;
    }

    public final int component9() {
        return this.trackStreak;
    }

    public final MultiTrackerFirestoreStatsModel copy(int i6, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15) {
        return new MultiTrackerFirestoreStatsModel(i6, i10, i11, i12, i13, i14, j10, j11, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiTrackerFirestoreStatsModel)) {
            return false;
        }
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = (MultiTrackerFirestoreStatsModel) obj;
        if (this.dayTrackedCount == multiTrackerFirestoreStatsModel.dayTrackedCount && this.mood1TrackCount == multiTrackerFirestoreStatsModel.mood1TrackCount && this.mood2TrackCount == multiTrackerFirestoreStatsModel.mood2TrackCount && this.mood3TrackCount == multiTrackerFirestoreStatsModel.mood3TrackCount && this.mood4TrackCount == multiTrackerFirestoreStatsModel.mood4TrackCount && this.mood5TrackCount == multiTrackerFirestoreStatsModel.mood5TrackCount && this.latestTrackedDateInSeconds == multiTrackerFirestoreStatsModel.latestTrackedDateInSeconds && this.earliestTrackedDateInSeconds == multiTrackerFirestoreStatsModel.earliestTrackedDateInSeconds && this.trackStreak == multiTrackerFirestoreStatsModel.trackStreak) {
            return true;
        }
        return false;
    }

    public final int getDayTrackedCount() {
        return this.dayTrackedCount;
    }

    public final long getEarliestTrackedDateInSeconds() {
        return this.earliestTrackedDateInSeconds;
    }

    public final long getLatestTrackedDateInSeconds() {
        return this.latestTrackedDateInSeconds;
    }

    public final int getMood1TrackCount() {
        return this.mood1TrackCount;
    }

    public final int getMood2TrackCount() {
        return this.mood2TrackCount;
    }

    public final int getMood3TrackCount() {
        return this.mood3TrackCount;
    }

    public final int getMood4TrackCount() {
        return this.mood4TrackCount;
    }

    public final int getMood5TrackCount() {
        return this.mood5TrackCount;
    }

    public final int getTrackStreak() {
        return this.trackStreak;
    }

    public int hashCode() {
        long j10 = this.latestTrackedDateInSeconds;
        long j11 = this.earliestTrackedDateInSeconds;
        return (((((((((((((((this.dayTrackedCount * 31) + this.mood1TrackCount) * 31) + this.mood2TrackCount) * 31) + this.mood3TrackCount) * 31) + this.mood4TrackCount) * 31) + this.mood5TrackCount) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.trackStreak;
    }

    public final void setDayTrackedCount(int i6) {
        this.dayTrackedCount = i6;
    }

    public final void setEarliestTrackedDateInSeconds(long j10) {
        this.earliestTrackedDateInSeconds = j10;
    }

    public final void setLatestTrackedDateInSeconds(long j10) {
        this.latestTrackedDateInSeconds = j10;
    }

    public final void setMood1TrackCount(int i6) {
        this.mood1TrackCount = i6;
    }

    public final void setMood2TrackCount(int i6) {
        this.mood2TrackCount = i6;
    }

    public final void setMood3TrackCount(int i6) {
        this.mood3TrackCount = i6;
    }

    public final void setMood4TrackCount(int i6) {
        this.mood4TrackCount = i6;
    }

    public final void setMood5TrackCount(int i6) {
        this.mood5TrackCount = i6;
    }

    public final void setTrackStreak(int i6) {
        this.trackStreak = i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultiTrackerFirestoreStatsModel(dayTrackedCount=");
        sb2.append(this.dayTrackedCount);
        sb2.append(", mood1TrackCount=");
        sb2.append(this.mood1TrackCount);
        sb2.append(", mood2TrackCount=");
        sb2.append(this.mood2TrackCount);
        sb2.append(", mood3TrackCount=");
        sb2.append(this.mood3TrackCount);
        sb2.append(", mood4TrackCount=");
        sb2.append(this.mood4TrackCount);
        sb2.append(", mood5TrackCount=");
        sb2.append(this.mood5TrackCount);
        sb2.append(", latestTrackedDateInSeconds=");
        sb2.append(this.latestTrackedDateInSeconds);
        sb2.append(", earliestTrackedDateInSeconds=");
        sb2.append(this.earliestTrackedDateInSeconds);
        sb2.append(", trackStreak=");
        return c.s(sb2, this.trackStreak, ')');
    }

    public MultiTrackerFirestoreStatsModel(int i6, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15) {
        this.dayTrackedCount = i6;
        this.mood1TrackCount = i10;
        this.mood2TrackCount = i11;
        this.mood3TrackCount = i12;
        this.mood4TrackCount = i13;
        this.mood5TrackCount = i14;
        this.latestTrackedDateInSeconds = j10;
        this.earliestTrackedDateInSeconds = j11;
        this.trackStreak = i15;
    }

    public /* synthetic */ MultiTrackerFirestoreStatsModel(int i6, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, d dVar) {
        this((i16 & 1) != 0 ? 0 : i6, (i16 & 2) != 0 ? 0 : i10, (i16 & 4) != 0 ? 0 : i11, (i16 & 8) != 0 ? 0 : i12, (i16 & 16) != 0 ? 0 : i13, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) != 0 ? 0L : j10, (i16 & 128) != 0 ? Utils.INSTANCE.getTodayTimeInSeconds() : j11, (i16 & 256) == 0 ? i15 : 0);
    }
}
