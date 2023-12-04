package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryThread implements IUnknownPropertiesConsumer {
    private Boolean crashed;
    private Boolean current;
    private Boolean daemon;
    private Long id;
    private String name;
    private Integer priority;
    private SentryStackTrace stacktrace;
    private String state;
    private Map<String, Object> unknown;

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Boolean isCrashed() {
        return this.crashed;
    }

    public void setCrashed(Boolean bool) {
        this.crashed = bool;
    }

    public Boolean isCurrent() {
        return this.current;
    }

    public void setCurrent(Boolean bool) {
        this.current = bool;
    }

    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public void setStacktrace(SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer num) {
        this.priority = num;
    }

    public Boolean isDaemon() {
        return this.daemon;
    }

    public void setDaemon(Boolean bool) {
        this.daemon = bool;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
