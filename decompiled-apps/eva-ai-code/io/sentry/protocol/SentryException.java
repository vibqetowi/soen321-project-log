package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryException implements IUnknownPropertiesConsumer {
    private Mechanism mechanism;
    private String module;
    private SentryStackTrace stacktrace;
    private Long threadId;
    private String type;
    private Map<String, Object> unknown;
    private String value;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public Long getThreadId() {
        return this.threadId;
    }

    public void setThreadId(Long l) {
        this.threadId = l;
    }

    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public void setStacktrace(SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public Mechanism getMechanism() {
        return this.mechanism;
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
