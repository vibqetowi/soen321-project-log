package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: UserStatisticsModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/theinnerhour/b2b/model/UserStatisticsModel;", "", "()V", "allieTaps", "", "getAllieTaps", "()J", "setAllieTaps", "(J)V", "audioMinutes", "Lcom/theinnerhour/b2b/model/UserAudioStatisticsDetail;", "getAudioMinutes", "()Lcom/theinnerhour/b2b/model/UserAudioStatisticsDetail;", "setAudioMinutes", "(Lcom/theinnerhour/b2b/model/UserAudioStatisticsDetail;)V", "moodTracks", "Lcom/theinnerhour/b2b/model/UserStatisticsDetail;", "getMoodTracks", "()Lcom/theinnerhour/b2b/model/UserStatisticsDetail;", "setMoodTracks", "(Lcom/theinnerhour/b2b/model/UserStatisticsDetail;)V", "resourcesRead", "getResourcesRead", "setResourcesRead", "uniqueActivities", "getUniqueActivities", "setUniqueActivities", "uniqueGoalTracks", "getUniqueGoalTracks", "setUniqueGoalTracks", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserStatisticsModel {
    private long allieTaps;
    private UserStatisticsDetail uniqueActivities = new UserStatisticsDetail();
    private UserStatisticsDetail uniqueGoalTracks = new UserStatisticsDetail();
    private UserStatisticsDetail resourcesRead = new UserStatisticsDetail();
    private UserStatisticsDetail moodTracks = new UserStatisticsDetail();
    private UserAudioStatisticsDetail audioMinutes = new UserAudioStatisticsDetail();

    public final long getAllieTaps() {
        return this.allieTaps;
    }

    public final UserAudioStatisticsDetail getAudioMinutes() {
        return this.audioMinutes;
    }

    public final UserStatisticsDetail getMoodTracks() {
        return this.moodTracks;
    }

    public final UserStatisticsDetail getResourcesRead() {
        return this.resourcesRead;
    }

    public final UserStatisticsDetail getUniqueActivities() {
        return this.uniqueActivities;
    }

    public final UserStatisticsDetail getUniqueGoalTracks() {
        return this.uniqueGoalTracks;
    }

    public final void setAllieTaps(long j10) {
        this.allieTaps = j10;
    }

    public final void setAudioMinutes(UserAudioStatisticsDetail userAudioStatisticsDetail) {
        i.g(userAudioStatisticsDetail, "<set-?>");
        this.audioMinutes = userAudioStatisticsDetail;
    }

    public final void setMoodTracks(UserStatisticsDetail userStatisticsDetail) {
        i.g(userStatisticsDetail, "<set-?>");
        this.moodTracks = userStatisticsDetail;
    }

    public final void setResourcesRead(UserStatisticsDetail userStatisticsDetail) {
        i.g(userStatisticsDetail, "<set-?>");
        this.resourcesRead = userStatisticsDetail;
    }

    public final void setUniqueActivities(UserStatisticsDetail userStatisticsDetail) {
        i.g(userStatisticsDetail, "<set-?>");
        this.uniqueActivities = userStatisticsDetail;
    }

    public final void setUniqueGoalTracks(UserStatisticsDetail userStatisticsDetail) {
        i.g(userStatisticsDetail, "<set-?>");
        this.uniqueGoalTracks = userStatisticsDetail;
    }
}
