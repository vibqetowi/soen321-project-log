package io.sentry;

import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryEvent extends SentryBaseEvent implements IUnknownPropertiesConsumer {
    private DebugMeta debugMeta;
    private SentryValues<SentryException> exception;
    private List<String> fingerprint;
    private SentryLevel level;
    private String logger;
    private Message message;
    private Map<String, String> modules;
    private SentryValues<SentryThread> threads;
    private final Date timestamp;
    private String transaction;
    private Map<String, Object> unknown;

    SentryEvent(SentryId sentryId, Date date) {
        super(sentryId);
        this.timestamp = date;
    }

    public SentryEvent(Throwable th) {
        this();
        this.throwable = th;
    }

    public SentryEvent() {
        this(new SentryId(), DateUtils.getCurrentDateTime());
    }

    public SentryEvent(Date date) {
        this(new SentryId(), date);
    }

    public Date getTimestamp() {
        return (Date) this.timestamp.clone();
    }

    public Message getMessage() {
        return this.message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getLogger() {
        return this.logger;
    }

    public void setLogger(String str) {
        this.logger = str;
    }

    public List<SentryThread> getThreads() {
        SentryValues<SentryThread> sentryValues = this.threads;
        if (sentryValues != null) {
            return sentryValues.getValues();
        }
        return null;
    }

    public void setThreads(List<SentryThread> list) {
        this.threads = new SentryValues<>(list);
    }

    public List<SentryException> getExceptions() {
        SentryValues<SentryException> sentryValues = this.exception;
        if (sentryValues == null) {
            return null;
        }
        return sentryValues.getValues();
    }

    public void setExceptions(List<SentryException> list) {
        this.exception = new SentryValues<>(list);
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public void setTransaction(String str) {
        this.transaction = str;
    }

    public List<String> getFingerprints() {
        return this.fingerprint;
    }

    public void setFingerprints(List<String> list) {
        this.fingerprint = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    Map<String, String> getModules() {
        return this.modules;
    }

    public void setModules(Map<String, String> map) {
        this.modules = CollectionUtils.newHashMap(map);
    }

    public void setModule(String str, String str2) {
        if (this.modules == null) {
            this.modules = new HashMap();
        }
        this.modules.put(str, str2);
    }

    public void removeModule(String str) {
        Map<String, String> map = this.modules;
        if (map != null) {
            map.remove(str);
        }
    }

    public String getModule(String str) {
        Map<String, String> map = this.modules;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public DebugMeta getDebugMeta() {
        return this.debugMeta;
    }

    public void setDebugMeta(DebugMeta debugMeta) {
        this.debugMeta = debugMeta;
    }

    public boolean isCrashed() {
        SentryValues<SentryException> sentryValues = this.exception;
        if (sentryValues != null) {
            for (SentryException sentryException : sentryValues.getValues()) {
                if (sentryException.getMechanism() != null && sentryException.getMechanism().isHandled() != null && !sentryException.getMechanism().isHandled().booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean isErrored() {
        SentryValues<SentryException> sentryValues = this.exception;
        return (sentryValues == null || sentryValues.getValues().isEmpty()) ? false : true;
    }
}
