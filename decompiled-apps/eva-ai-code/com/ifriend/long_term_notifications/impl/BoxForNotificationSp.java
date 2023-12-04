package com.ifriend.long_term_notifications.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/BoxForNotificationSp;", "", "type", "Lcom/ifriend/long_term_notifications/impl/TypeEnum;", "json", "", "(Lcom/ifriend/long_term_notifications/impl/TypeEnum;Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "getType", "()Lcom/ifriend/long_term_notifications/impl/TypeEnum;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoxForNotificationSp {
    private final String json;
    private final TypeEnum type;

    public static /* synthetic */ BoxForNotificationSp copy$default(BoxForNotificationSp boxForNotificationSp, TypeEnum typeEnum, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            typeEnum = boxForNotificationSp.type;
        }
        if ((i & 2) != 0) {
            str = boxForNotificationSp.json;
        }
        return boxForNotificationSp.copy(typeEnum, str);
    }

    public final TypeEnum component1() {
        return this.type;
    }

    public final String component2() {
        return this.json;
    }

    public final BoxForNotificationSp copy(TypeEnum type, String json) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(json, "json");
        return new BoxForNotificationSp(type, json);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxForNotificationSp) {
            BoxForNotificationSp boxForNotificationSp = (BoxForNotificationSp) obj;
            return this.type == boxForNotificationSp.type && Intrinsics.areEqual(this.json, boxForNotificationSp.json);
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.json.hashCode();
    }

    public String toString() {
        TypeEnum typeEnum = this.type;
        String str = this.json;
        return "BoxForNotificationSp(type=" + typeEnum + ", json=" + str + ")";
    }

    public BoxForNotificationSp(TypeEnum type, String json) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(json, "json");
        this.type = type;
        this.json = json;
    }

    public final TypeEnum getType() {
        return this.type;
    }

    public final String getJson() {
        return this.json;
    }
}
