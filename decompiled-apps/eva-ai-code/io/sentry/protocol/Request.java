package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
/* loaded from: classes4.dex */
public final class Request implements IUnknownPropertiesConsumer {
    private String cookies;
    private Object data;
    private Map<String, String> env;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> other;
    private String queryString;
    private Map<String, Object> unknown;
    private String url;

    public Request() {
    }

    public Request(Request request) {
        this.url = request.url;
        this.cookies = request.cookies;
        this.method = request.method;
        this.queryString = request.queryString;
        this.headers = CollectionUtils.newConcurrentHashMap(request.headers);
        this.env = CollectionUtils.newConcurrentHashMap(request.env);
        this.other = CollectionUtils.newConcurrentHashMap(request.other);
        this.unknown = CollectionUtils.newConcurrentHashMap(request.unknown);
        this.data = request.data;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public String getCookies() {
        return this.cookies;
    }

    public void setCookies(String str) {
        this.cookies = str;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = CollectionUtils.newConcurrentHashMap(map);
    }

    public Map<String, String> getEnvs() {
        return this.env;
    }

    public void setEnvs(Map<String, String> map) {
        this.env = CollectionUtils.newConcurrentHashMap(map);
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public void setOthers(Map<String, String> map) {
        this.other = CollectionUtils.newConcurrentHashMap(map);
    }

    Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
