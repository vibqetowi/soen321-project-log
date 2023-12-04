package com.ifriend.data.socket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: SocketMessage.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ifriend/data/socket/SocketMessage;", "", "type", "", "raw", "json", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getJson", "()Lorg/json/JSONObject;", "getRaw", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketMessage {
    private final JSONObject json;
    private final String raw;
    private final String type;

    public static /* synthetic */ SocketMessage copy$default(SocketMessage socketMessage, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socketMessage.type;
        }
        if ((i & 2) != 0) {
            str2 = socketMessage.raw;
        }
        if ((i & 4) != 0) {
            jSONObject = socketMessage.json;
        }
        return socketMessage.copy(str, str2, jSONObject);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.raw;
    }

    public final JSONObject component3() {
        return this.json;
    }

    public final SocketMessage copy(String type, String raw, JSONObject json) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(json, "json");
        return new SocketMessage(type, raw, json);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SocketMessage) {
            SocketMessage socketMessage = (SocketMessage) obj;
            return Intrinsics.areEqual(this.type, socketMessage.type) && Intrinsics.areEqual(this.raw, socketMessage.raw) && Intrinsics.areEqual(this.json, socketMessage.json);
        }
        return false;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.raw.hashCode()) * 31) + this.json.hashCode();
    }

    public String toString() {
        String str = this.type;
        String str2 = this.raw;
        JSONObject jSONObject = this.json;
        return "SocketMessage(type=" + str + ", raw=" + str2 + ", json=" + jSONObject + ")";
    }

    public SocketMessage(String type, String raw, JSONObject json) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(json, "json");
        this.type = type;
        this.raw = raw;
        this.json = json;
    }

    public final String getType() {
        return this.type;
    }

    public final String getRaw() {
        return this.raw;
    }

    public final JSONObject getJson() {
        return this.json;
    }
}
