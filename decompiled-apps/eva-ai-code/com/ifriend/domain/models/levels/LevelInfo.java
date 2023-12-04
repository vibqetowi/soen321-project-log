package com.ifriend.domain.models.levels;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LevelInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/models/levels/LevelInfo;", "", FirebaseAnalytics.Param.LEVEL, "", "currentPoints", "nextLevelPoints", "(III)V", "getCurrentPoints", "()I", "getLevel", "getNextLevelPoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelInfo {
    private final int currentPoints;
    private final int level;
    private final int nextLevelPoints;

    public static /* synthetic */ LevelInfo copy$default(LevelInfo levelInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = levelInfo.level;
        }
        if ((i4 & 2) != 0) {
            i2 = levelInfo.currentPoints;
        }
        if ((i4 & 4) != 0) {
            i3 = levelInfo.nextLevelPoints;
        }
        return levelInfo.copy(i, i2, i3);
    }

    public final int component1() {
        return this.level;
    }

    public final int component2() {
        return this.currentPoints;
    }

    public final int component3() {
        return this.nextLevelPoints;
    }

    public final LevelInfo copy(int i, int i2, int i3) {
        return new LevelInfo(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LevelInfo) {
            LevelInfo levelInfo = (LevelInfo) obj;
            return this.level == levelInfo.level && this.currentPoints == levelInfo.currentPoints && this.nextLevelPoints == levelInfo.nextLevelPoints;
        }
        return false;
    }

    public int hashCode() {
        return (((this.level * 31) + this.currentPoints) * 31) + this.nextLevelPoints;
    }

    public String toString() {
        int i = this.level;
        int i2 = this.currentPoints;
        int i3 = this.nextLevelPoints;
        return "LevelInfo(level=" + i + ", currentPoints=" + i2 + ", nextLevelPoints=" + i3 + ")";
    }

    public LevelInfo(int i, int i2, int i3) {
        this.level = i;
        this.currentPoints = i2;
        this.nextLevelPoints = i3;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getCurrentPoints() {
        return this.currentPoints;
    }

    public final int getNextLevelPoints() {
        return this.nextLevelPoints;
    }
}
