package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class Message implements IUnknownPropertiesConsumer {
    private String formatted;
    private String message;
    private List<String> params;
    private Map<String, Object> unknown;

    public String getFormatted() {
        return this.formatted;
    }

    public void setFormatted(String str) {
        this.formatted = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public List<String> getParams() {
        return this.params;
    }

    public void setParams(List<String> list) {
        this.params = CollectionUtils.newArrayList(list);
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
