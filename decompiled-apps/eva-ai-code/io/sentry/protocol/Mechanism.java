package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
/* loaded from: classes4.dex */
public final class Mechanism implements IUnknownPropertiesConsumer {
    private Map<String, Object> data;
    private String description;
    private Boolean handled;
    private String helpLink;
    private Map<String, Object> meta;
    private Boolean synthetic;
    private final transient Thread thread;
    private String type;
    private Map<String, Object> unknown;

    public Mechanism() {
        this(null);
    }

    public Mechanism(Thread thread) {
        this.thread = thread;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getHelpLink() {
        return this.helpLink;
    }

    public void setHelpLink(String str) {
        this.helpLink = str;
    }

    public Boolean isHandled() {
        return this.handled;
    }

    public void setHandled(Boolean bool) {
        this.handled = bool;
    }

    public Map<String, Object> getMeta() {
        return this.meta;
    }

    public void setMeta(Map<String, Object> map) {
        this.meta = CollectionUtils.newHashMap(map);
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> map) {
        this.data = CollectionUtils.newHashMap(map);
    }

    Thread getThread() {
        return this.thread;
    }

    public Boolean getSynthetic() {
        return this.synthetic;
    }

    public void setSynthetic(Boolean bool) {
        this.synthetic = bool;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
