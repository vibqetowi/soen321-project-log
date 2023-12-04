package com.ifriend.domain.logic.topics.models;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatPremiumTopic.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "", "id", "", "name", "iconName", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIconName", "getId", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopic {
    private final String backgroundColor;
    private final String iconName;
    private final String id;
    private final String name;

    public static /* synthetic */ ChatPremiumTopic copy$default(ChatPremiumTopic chatPremiumTopic, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPremiumTopic.id;
        }
        if ((i & 2) != 0) {
            str2 = chatPremiumTopic.name;
        }
        if ((i & 4) != 0) {
            str3 = chatPremiumTopic.iconName;
        }
        if ((i & 8) != 0) {
            str4 = chatPremiumTopic.backgroundColor;
        }
        return chatPremiumTopic.copy(str, str2, str3, str4);
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

    public final String component4() {
        return this.backgroundColor;
    }

    public final ChatPremiumTopic copy(String id, String name, String iconName, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        return new ChatPremiumTopic(id, name, iconName, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPremiumTopic) {
            ChatPremiumTopic chatPremiumTopic = (ChatPremiumTopic) obj;
            return Intrinsics.areEqual(this.id, chatPremiumTopic.id) && Intrinsics.areEqual(this.name, chatPremiumTopic.name) && Intrinsics.areEqual(this.iconName, chatPremiumTopic.iconName) && Intrinsics.areEqual(this.backgroundColor, chatPremiumTopic.backgroundColor);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.iconName.hashCode()) * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.iconName;
        String str4 = this.backgroundColor;
        return "ChatPremiumTopic(id=" + str + ", name=" + str2 + ", iconName=" + str3 + ", backgroundColor=" + str4 + ")";
    }

    public ChatPremiumTopic(String id, String name, String iconName, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.id = id;
        this.name = name;
        this.iconName = iconName;
        this.backgroundColor = str;
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

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }
}
