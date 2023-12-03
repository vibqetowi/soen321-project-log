package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.DateUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class Session implements JsonStream.Streamable, UserAware {
    private App app;
    private final AtomicBoolean autoCaptured;
    private Device device;
    private final File file;
    private final AtomicInteger handledCount;

    /* renamed from: id  reason: collision with root package name */
    private String f5917id;
    final AtomicBoolean isPaused;
    private final Logger logger;
    private final Notifier notifier;
    private Date startedAt;
    private final AtomicBoolean tracked;
    private final AtomicInteger unhandledCount;
    private User user;

    public Session(Map<String, Object> map, Logger logger) {
        this(null, null, logger);
        setId((String) map.get("id"));
        setStartedAt(DateUtils.fromIso8601((String) map.get("startedAt")));
        Map map2 = (Map) map.get("events");
        this.handledCount.set(((Number) map2.get("handled")).intValue());
        this.unhandledCount.set(((Number) map2.get("unhandled")).intValue());
    }

    public static Session copySession(Session session) {
        Session session2 = new Session(session.f5917id, session.startedAt, session.user, session.unhandledCount.get(), session.handledCount.get(), session.notifier, session.logger);
        session2.tracked.set(session.tracked.get());
        session2.autoCaptured.set(session.isAutoCaptured());
        return session2;
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to session." + str + ", ignoring");
    }

    private void serializeV1Payload(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("notifier").value(this.notifier);
        jsonStream.name("app").value(this.app);
        jsonStream.name("device").value(this.device);
        jsonStream.name("sessions").beginArray();
        jsonStream.value(this.file);
        jsonStream.endArray();
        jsonStream.endObject();
    }

    private void serializeV2Payload(JsonStream jsonStream) {
        jsonStream.value(this.file);
    }

    public App getApp() {
        return this.app;
    }

    public Device getDevice() {
        return this.device;
    }

    public int getHandledCount() {
        return this.handledCount.intValue();
    }

    public String getId() {
        return this.f5917id;
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public Date getStartedAt() {
        return this.startedAt;
    }

    public int getUnhandledCount() {
        return this.unhandledCount.intValue();
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.user;
    }

    public Session incrementHandledAndCopy() {
        this.handledCount.incrementAndGet();
        return copySession(this);
    }

    public Session incrementUnhandledAndCopy() {
        this.unhandledCount.incrementAndGet();
        return copySession(this);
    }

    public boolean isAutoCaptured() {
        return this.autoCaptured.get();
    }

    public AtomicBoolean isTracked() {
        return this.tracked;
    }

    public boolean isV2Payload() {
        File file = this.file;
        if (file != null && file.getName().endsWith("_v2.json")) {
            return true;
        }
        return false;
    }

    public void serializeSessionInfo(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("id").value(this.f5917id);
        jsonStream.name("startedAt").value(this.startedAt);
        jsonStream.name("user").value(this.user);
        jsonStream.endObject();
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setAutoCaptured(boolean z10) {
        this.autoCaptured.set(z10);
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setId(String str) {
        if (str != null) {
            this.f5917id = str;
        } else {
            logNull("id");
        }
    }

    public void setStartedAt(Date date) {
        if (date != null) {
            this.startedAt = date;
        } else {
            logNull("startedAt");
        }
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.user = new User(str, str2, str3);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        if (this.file != null) {
            if (isV2Payload()) {
                serializeV2Payload(jsonStream);
                return;
            } else {
                serializeV1Payload(jsonStream);
                return;
            }
        }
        jsonStream.beginObject();
        jsonStream.name("notifier").value(this.notifier);
        jsonStream.name("app").value(this.app);
        jsonStream.name("device").value(this.device);
        jsonStream.name("sessions").beginArray();
        serializeSessionInfo(jsonStream);
        jsonStream.endArray();
        jsonStream.endObject();
    }

    public Session(String str, Date date, User user, boolean z10, Notifier notifier, Logger logger) {
        this(null, notifier, logger);
        this.f5917id = str;
        this.startedAt = new Date(date.getTime());
        this.user = user;
        this.autoCaptured.set(z10);
    }

    public Session(String str, Date date, User user, int i6, int i10, Notifier notifier, Logger logger) {
        this(str, date, user, false, notifier, logger);
        this.unhandledCount.set(i6);
        this.handledCount.set(i10);
        this.tracked.set(true);
    }

    public Session(File file, Notifier notifier, Logger logger) {
        this.autoCaptured = new AtomicBoolean(false);
        this.unhandledCount = new AtomicInteger();
        this.handledCount = new AtomicInteger();
        this.tracked = new AtomicBoolean(false);
        this.isPaused = new AtomicBoolean(false);
        this.file = file;
        this.logger = logger;
        if (notifier != null) {
            Notifier notifier2 = new Notifier(notifier.getName(), notifier.getVersion(), notifier.getUrl());
            notifier2.setDependencies(new ArrayList(notifier.getDependencies()));
            this.notifier = notifier2;
            return;
        }
        this.notifier = null;
    }
}
