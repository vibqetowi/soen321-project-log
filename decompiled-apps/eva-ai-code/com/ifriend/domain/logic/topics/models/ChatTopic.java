package com.ifriend.domain.logic.topics.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatTopic.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/logic/topics/models/ChatTopic;", "", "id", "", "name", "iconName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconName", "()Ljava/lang/String;", "getId", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopic {
    private final String iconName;
    private final String id;
    private final String name;

    public static /* synthetic */ ChatTopic copy$default(ChatTopic chatTopic, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatTopic.id;
        }
        if ((i & 2) != 0) {
            str2 = chatTopic.name;
        }
        if ((i & 4) != 0) {
            str3 = chatTopic.iconName;
        }
        return chatTopic.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconName;
    }

    public final ChatTopic copy(String id, String name, String iconName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        return new ChatTopic(id, name, iconName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatTopic) {
            ChatTopic chatTopic = (ChatTopic) obj;
            return Intrinsics.areEqual(this.id, chatTopic.id) && Intrinsics.areEqual(this.name, chatTopic.name) && Intrinsics.areEqual(this.iconName, chatTopic.iconName);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.iconName.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.iconName;
        return "ChatTopic(id=" + str + ", name=" + str2 + ", iconName=" + str3 + ")";
    }

    public ChatTopic(String id, String name, String iconName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.id = id;
        this.name = name;
        this.iconName = iconName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIconName() {
        return this.iconName;
    }
}
