package com.ifriend.domain.models.topics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatTopicInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/models/topics/ChatTopicInfo;", "", "id", "", "text", "iconName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconName", "()Ljava/lang/String;", "getId", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopicInfo {
    private final String iconName;
    private final String id;
    private final String text;

    public static /* synthetic */ ChatTopicInfo copy$default(ChatTopicInfo chatTopicInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatTopicInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = chatTopicInfo.text;
        }
        if ((i & 4) != 0) {
            str3 = chatTopicInfo.iconName;
        }
        return chatTopicInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.iconName;
    }

    public final ChatTopicInfo copy(String id, String text, String iconName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        return new ChatTopicInfo(id, text, iconName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatTopicInfo) {
            ChatTopicInfo chatTopicInfo = (ChatTopicInfo) obj;
            return Intrinsics.areEqual(this.id, chatTopicInfo.id) && Intrinsics.areEqual(this.text, chatTopicInfo.text) && Intrinsics.areEqual(this.iconName, chatTopicInfo.iconName);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.text.hashCode()) * 31) + this.iconName.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        String str3 = this.iconName;
        return "ChatTopicInfo(id=" + str + ", text=" + str2 + ", iconName=" + str3 + ")";
    }

    public ChatTopicInfo(String id, String text, String iconName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.id = id;
        this.text = text;
        this.iconName = iconName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getIconName() {
        return this.iconName;
    }
}
