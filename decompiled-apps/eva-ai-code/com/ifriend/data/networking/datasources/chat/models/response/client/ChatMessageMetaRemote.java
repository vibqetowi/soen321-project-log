package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemote.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00062"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;", "", "ranking", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRankingMessageRemote;", "reference", "", "preview", "hasAudio", "", "automation", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;", "tariffication", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;", "mediaId", "regeneration", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;", "type", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRankingMessageRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;Ljava/lang/String;)V", "getAutomation", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;", "getHasAudio", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaId", "()Ljava/lang/String;", "getPreview", "getRanking", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRankingMessageRemote;", "getReference", "getRegeneration", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;", "getTariffication", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRankingMessageRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;Ljava/lang/String;)Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageMetaRemote {
    @SerializedName("automation")
    private final ChatAutomationMessageRemote automation;
    @SerializedName("hasAudio")
    private final Boolean hasAudio;
    @SerializedName(alternate = {"media-id"}, value = "MediaId")
    private final String mediaId;
    @SerializedName("preview")
    private final String preview;
    @SerializedName("ranking")
    private final ChatRankingMessageRemote ranking;
    @SerializedName("reference")
    private final String reference;
    @SerializedName(alternate = {"regeneration"}, value = "Regeneration")
    private final ChatRegenerationRemote regeneration;
    @SerializedName("tariffication")
    private final ChatTarifficationRemote tariffication;
    @SerializedName("type")
    private final String type;

    public final ChatRankingMessageRemote component1() {
        return this.ranking;
    }

    public final String component2() {
        return this.reference;
    }

    public final String component3() {
        return this.preview;
    }

    public final Boolean component4() {
        return this.hasAudio;
    }

    public final ChatAutomationMessageRemote component5() {
        return this.automation;
    }

    public final ChatTarifficationRemote component6() {
        return this.tariffication;
    }

    public final String component7() {
        return this.mediaId;
    }

    public final ChatRegenerationRemote component8() {
        return this.regeneration;
    }

    public final String component9() {
        return this.type;
    }

    public final ChatMessageMetaRemote copy(ChatRankingMessageRemote ranking, String str, String str2, Boolean bool, ChatAutomationMessageRemote chatAutomationMessageRemote, ChatTarifficationRemote chatTarifficationRemote, String str3, ChatRegenerationRemote chatRegenerationRemote, String str4) {
        Intrinsics.checkNotNullParameter(ranking, "ranking");
        return new ChatMessageMetaRemote(ranking, str, str2, bool, chatAutomationMessageRemote, chatTarifficationRemote, str3, chatRegenerationRemote, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatMessageMetaRemote) {
            ChatMessageMetaRemote chatMessageMetaRemote = (ChatMessageMetaRemote) obj;
            return Intrinsics.areEqual(this.ranking, chatMessageMetaRemote.ranking) && Intrinsics.areEqual(this.reference, chatMessageMetaRemote.reference) && Intrinsics.areEqual(this.preview, chatMessageMetaRemote.preview) && Intrinsics.areEqual(this.hasAudio, chatMessageMetaRemote.hasAudio) && Intrinsics.areEqual(this.automation, chatMessageMetaRemote.automation) && Intrinsics.areEqual(this.tariffication, chatMessageMetaRemote.tariffication) && Intrinsics.areEqual(this.mediaId, chatMessageMetaRemote.mediaId) && Intrinsics.areEqual(this.regeneration, chatMessageMetaRemote.regeneration) && Intrinsics.areEqual(this.type, chatMessageMetaRemote.type);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ranking.hashCode() * 31;
        String str = this.reference;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.preview;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasAudio;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatAutomationMessageRemote chatAutomationMessageRemote = this.automation;
        int hashCode5 = (hashCode4 + (chatAutomationMessageRemote == null ? 0 : chatAutomationMessageRemote.hashCode())) * 31;
        ChatTarifficationRemote chatTarifficationRemote = this.tariffication;
        int hashCode6 = (hashCode5 + (chatTarifficationRemote == null ? 0 : chatTarifficationRemote.hashCode())) * 31;
        String str3 = this.mediaId;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ChatRegenerationRemote chatRegenerationRemote = this.regeneration;
        int hashCode8 = (hashCode7 + (chatRegenerationRemote == null ? 0 : chatRegenerationRemote.hashCode())) * 31;
        String str4 = this.type;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        ChatRankingMessageRemote chatRankingMessageRemote = this.ranking;
        String str = this.reference;
        String str2 = this.preview;
        Boolean bool = this.hasAudio;
        ChatAutomationMessageRemote chatAutomationMessageRemote = this.automation;
        ChatTarifficationRemote chatTarifficationRemote = this.tariffication;
        String str3 = this.mediaId;
        ChatRegenerationRemote chatRegenerationRemote = this.regeneration;
        String str4 = this.type;
        return "ChatMessageMetaRemote(ranking=" + chatRankingMessageRemote + ", reference=" + str + ", preview=" + str2 + ", hasAudio=" + bool + ", automation=" + chatAutomationMessageRemote + ", tariffication=" + chatTarifficationRemote + ", mediaId=" + str3 + ", regeneration=" + chatRegenerationRemote + ", type=" + str4 + ")";
    }

    public ChatMessageMetaRemote(ChatRankingMessageRemote ranking, String str, String str2, Boolean bool, ChatAutomationMessageRemote chatAutomationMessageRemote, ChatTarifficationRemote chatTarifficationRemote, String str3, ChatRegenerationRemote chatRegenerationRemote, String str4) {
        Intrinsics.checkNotNullParameter(ranking, "ranking");
        this.ranking = ranking;
        this.reference = str;
        this.preview = str2;
        this.hasAudio = bool;
        this.automation = chatAutomationMessageRemote;
        this.tariffication = chatTarifficationRemote;
        this.mediaId = str3;
        this.regeneration = chatRegenerationRemote;
        this.type = str4;
    }

    public final ChatRankingMessageRemote getRanking() {
        return this.ranking;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final Boolean getHasAudio() {
        return this.hasAudio;
    }

    public final ChatAutomationMessageRemote getAutomation() {
        return this.automation;
    }

    public final ChatTarifficationRemote getTariffication() {
        return this.tariffication;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final ChatRegenerationRemote getRegeneration() {
        return this.regeneration;
    }

    public final String getType() {
        return this.type;
    }
}
