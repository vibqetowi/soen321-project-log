package io.sentry;

import io.sentry.protocol.User;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
public final class Session {
    private final String distinctId;
    private Double duration;
    private final String environment;
    private final AtomicInteger errorCount;
    private Boolean init;
    private final String ipAddress;
    private final String release;
    private Long sequence;
    private final UUID sessionId;
    private final Object sessionLock;
    private final Date started;
    private State status;
    private Date timestamp;
    private String userAgent;

    /* loaded from: classes4.dex */
    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(State state, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5) {
        this.sessionLock = new Object();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new AtomicInteger(i);
        this.distinctId = str;
        this.sessionId = uuid;
        this.init = bool;
        this.sequence = l;
        this.duration = d;
        this.ipAddress = str2;
        this.userAgent = str3;
        this.environment = str4;
        this.release = str5;
    }

    public Session(String str, User user, String str2, String str3) {
        this(State.Ok, DateUtils.getCurrentDateTime(), DateUtils.getCurrentDateTime(), 0, str, UUID.randomUUID(), true, null, null, user != null ? user.getIpAddress() : null, null, str2, str3);
    }

    public Date getStarted() {
        Date date = this.started;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public UUID getSessionId() {
        return this.sessionId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getRelease() {
        return this.release;
    }

    public Boolean getInit() {
        return this.init;
    }

    public void setInitAsTrue() {
        this.init = true;
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    public State getStatus() {
        return this.status;
    }

    public Long getSequence() {
        return this.sequence;
    }

    public Double getDuration() {
        return this.duration;
    }

    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void end() {
        end(DateUtils.getCurrentDateTime());
    }

    public void end(Date date) {
        synchronized (this.sessionLock) {
            this.init = null;
            if (this.status == State.Ok) {
                this.status = State.Exited;
            }
            if (date != null) {
                this.timestamp = date;
            } else {
                this.timestamp = DateUtils.getCurrentDateTime();
            }
            Date date2 = this.timestamp;
            if (date2 != null) {
                this.duration = Double.valueOf(calculateDurationTime(date2));
                this.sequence = Long.valueOf(getSequenceTimestamp(this.timestamp));
            }
        }
    }

    private double calculateDurationTime(Date date) {
        return Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    public boolean update(State state, String str, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.sessionLock) {
            z2 = true;
            if (state != null) {
                try {
                    this.status = state;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.userAgent = str;
                z3 = true;
            }
            if (z) {
                this.errorCount.addAndGet(1);
            } else {
                z2 = z3;
            }
            if (z2) {
                this.init = null;
                Date currentDateTime = DateUtils.getCurrentDateTime();
                this.timestamp = currentDateTime;
                if (currentDateTime != null) {
                    this.sequence = Long.valueOf(getSequenceTimestamp(currentDateTime));
                }
            }
        }
        return z2;
    }

    private long getSequenceTimestamp(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: clone */
    public Session m7250clone() {
        return new Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release);
    }
}
