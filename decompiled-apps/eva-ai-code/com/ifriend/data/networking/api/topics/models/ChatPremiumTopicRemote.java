package com.ifriend.data.networking.api.topics.models;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPremiumTopicRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/topics/models/ChatPremiumTopicRemote;", "", "id", "", "name", "icon", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "getId", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicRemote {
    @SerializedName(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
    private final String backgroundColor;
    @SerializedName("Icon")
    private final String icon;
    @SerializedName("Id")
    private final String id;
    @SerializedName("Name")
    private final String name;

    public static /* synthetic */ ChatPremiumTopicRemote copy$default(ChatPremiumTopicRemote chatPremiumTopicRemote, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPremiumTopicRemote.id;
        }
        if ((i & 2) != 0) {
            str2 = chatPremiumTopicRemote.name;
        }
        if ((i & 4) != 0) {
            str3 = chatPremiumTopicRemote.icon;
        }
        if ((i & 8) != 0) {
            str4 = chatPremiumTopicRemote.backgroundColor;
        }
        return chatPremiumTopicRemote.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.backgroundColor;
    }

    public final ChatPremiumTopicRemote copy(String str, String str2, String str3, String str4) {
        return new ChatPremiumTopicRemote(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPremiumTopicRemote) {
            ChatPremiumTopicRemote chatPremiumTopicRemote = (ChatPremiumTopicRemote) obj;
            return Intrinsics.areEqual(this.id, chatPremiumTopicRemote.id) && Intrinsics.areEqual(this.name, chatPremiumTopicRemote.name) && Intrinsics.areEqual(this.icon, chatPremiumTopicRemote.icon) && Intrinsics.areEqual(this.backgroundColor, chatPremiumTopicRemote.backgroundColor);
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColor;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.icon;
        String str4 = this.backgroundColor;
        return "ChatPremiumTopicRemote(id=" + str + ", name=" + str2 + ", icon=" + str3 + ", backgroundColor=" + str4 + ")";
    }

    public ChatPremiumTopicRemote(String str, String str2, String str3, String str4) {
        this.id = str;
        this.name = str2;
        this.icon = str3;
        this.backgroundColor = str4;
    }

    public /* synthetic */ ChatPremiumTopicRemote(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }
}
