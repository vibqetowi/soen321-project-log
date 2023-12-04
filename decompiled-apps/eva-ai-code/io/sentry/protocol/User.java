package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class User implements IUnknownPropertiesConsumer {
    private String email;
    private String id;
    private String ipAddress;
    private Map<String, String> other;
    private Map<String, Object> unknown;
    private String username;

    public User() {
    }

    public User(User user) {
        this.email = user.email;
        this.username = user.username;
        this.id = user.id;
        this.ipAddress = user.ipAddress;
        this.other = CollectionUtils.newConcurrentHashMap(user.other);
        this.unknown = CollectionUtils.newConcurrentHashMap(user.unknown);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public void setOthers(Map<String, String> map) {
        this.other = CollectionUtils.newConcurrentHashMap(map);
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    Map<String, Object> getUnknown() {
        return this.unknown;
    }
}
