package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
/* compiled from: UserStatisticsDetail.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/theinnerhour/b2b/model/UserStatisticsDetail;", "", "()V", Constants.COURSE_ANGER, "", "getAnger", "()J", "setAnger", "(J)V", "custom", "getCustom", "()Ljava/lang/Long;", "setCustom", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", Constants.COURSE_DEPRESSION, "getDepression", "setDepression", Constants.COURSE_GENERIC, "getGeneric", "setGeneric", Constants.COURSE_HAPPINESS, "getHappiness", "setHappiness", "label", "", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", Constants.COURSE_SLEEP, "getSleep", "setSleep", Constants.COURSE_STRESS, "getStress", "setStress", "total", "getTotal", "setTotal", Constants.NOTIFICATION_URL, "getUrl", "setUrl", Constants.COURSE_WORRY, "getWorry", "setWorry", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserStatisticsDetail {
    private long anger;
    private Long custom;
    private long depression;
    private Long generic;
    private long happiness;
    private String label;
    private long sleep;
    private long stress;
    private long total;
    private String url;
    private long worry;

    public final long getAnger() {
        return this.anger;
    }

    public final Long getCustom() {
        return this.custom;
    }

    public final long getDepression() {
        return this.depression;
    }

    public final Long getGeneric() {
        return this.generic;
    }

    public final long getHappiness() {
        return this.happiness;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getSleep() {
        return this.sleep;
    }

    public final long getStress() {
        return this.stress;
    }

    public final long getTotal() {
        return this.total;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getWorry() {
        return this.worry;
    }

    public final void setAnger(long j10) {
        this.anger = j10;
    }

    public final void setCustom(Long l2) {
        this.custom = l2;
    }

    public final void setDepression(long j10) {
        this.depression = j10;
    }

    public final void setGeneric(Long l2) {
        this.generic = l2;
    }

    public final void setHappiness(long j10) {
        this.happiness = j10;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setSleep(long j10) {
        this.sleep = j10;
    }

    public final void setStress(long j10) {
        this.stress = j10;
    }

    public final void setTotal(long j10) {
        this.total = j10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWorry(long j10) {
        this.worry = j10;
    }
}
