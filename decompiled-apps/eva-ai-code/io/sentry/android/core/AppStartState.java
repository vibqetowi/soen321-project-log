package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;
/* loaded from: classes4.dex */
public final class AppStartState {
    private static AppStartState instance = new AppStartState();
    private Long appStartEndMillis;
    private Long appStartMillis;
    private Date appStartTime;
    private Boolean coldStart = null;

    private AppStartState() {
    }

    public static AppStartState getInstance() {
        return instance;
    }

    void resetInstance() {
        instance = new AppStartState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setAppStartEnd() {
        setAppStartEnd(SystemClock.uptimeMillis());
    }

    void setAppStartEnd(long j) {
        this.appStartEndMillis = Long.valueOf(j);
    }

    public synchronized Long getAppStartInterval() {
        Long l;
        if (this.appStartMillis != null && (l = this.appStartEndMillis) != null && this.coldStart != null) {
            return Long.valueOf(l.longValue() - this.appStartMillis.longValue());
        }
        return null;
    }

    public Boolean isColdStart() {
        return this.coldStart;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setColdStart(boolean z) {
        if (this.coldStart != null) {
            return;
        }
        this.coldStart = Boolean.valueOf(z);
    }

    public Date getAppStartTime() {
        return this.appStartTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setAppStartTime(long j, Date date) {
        if (this.appStartTime == null || this.appStartMillis == null) {
            this.appStartTime = date;
            this.appStartMillis = Long.valueOf(j);
        }
    }
}
