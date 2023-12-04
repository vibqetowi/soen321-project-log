package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemote.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "", "id", "", ViewHierarchyConstants.TAG_KEY, "", "sender", "recipient", "read", "", AnalyticsConstants.TIMESTAMP, "", "text", "meta", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;)V", "getId", "()I", "getMeta", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageMetaRemote;", "getRead", "()Z", "getRecipient", "()Ljava/lang/String;", "getSender", "getTag", "getText", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageRemote {
    @SerializedName("id")
    private final int id;
    @SerializedName("meta")
    private final ChatMessageMetaRemote meta;
    @SerializedName("read")
    private final boolean read;
    @SerializedName("recipient")
    private final String recipient;
    @SerializedName("sender")
    private final String sender;
    @SerializedName(ViewHierarchyConstants.TAG_KEY)
    private final String tag;
    @SerializedName("text")
    private final String text;
    @SerializedName(AnalyticsConstants.TIMESTAMP)
    private final long timestamp;

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.tag;
    }

    public final String component3() {
        return this.sender;
    }

    public final String component4() {
        return this.recipient;
    }

    public final boolean component5() {
        return this.read;
    }

    public final long component6() {
        return this.timestamp;
    }

    public final String component7() {
        return this.text;
    }

    public final ChatMessageMetaRemote component8() {
        return this.meta;
    }

    public final ChatMessageRemote copy(int i, String str, String sender, String recipient, boolean z, long j, String text, ChatMessageMetaRemote chatMessageMetaRemote) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChatMessageRemote(i, str, sender, recipient, z, j, text, chatMessageMetaRemote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatMessageRemote) {
            ChatMessageRemote chatMessageRemote = (ChatMessageRemote) obj;
            return this.id == chatMessageRemote.id && Intrinsics.areEqual(this.tag, chatMessageRemote.tag) && Intrinsics.areEqual(this.sender, chatMessageRemote.sender) && Intrinsics.areEqual(this.recipient, chatMessageRemote.recipient) && this.read == chatMessageRemote.read && this.timestamp == chatMessageRemote.timestamp && Intrinsics.areEqual(this.text, chatMessageRemote.text) && Intrinsics.areEqual(this.meta, chatMessageRemote.meta);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.id * 31;
        String str = this.tag;
        int hashCode = (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.sender.hashCode()) * 31) + this.recipient.hashCode()) * 31;
        boolean z = this.read;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int m = (((((hashCode + i2) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp)) * 31) + this.text.hashCode()) * 31;
        ChatMessageMetaRemote chatMessageMetaRemote = this.meta;
        return m + (chatMessageMetaRemote != null ? chatMessageMetaRemote.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.tag;
        String str2 = this.sender;
        String str3 = this.recipient;
        boolean z = this.read;
        long j = this.timestamp;
        String str4 = this.text;
        ChatMessageMetaRemote chatMessageMetaRemote = this.meta;
        return "ChatMessageRemote(id=" + i + ", tag=" + str + ", sender=" + str2 + ", recipient=" + str3 + ", read=" + z + ", timestamp=" + j + ", text=" + str4 + ", meta=" + chatMessageMetaRemote + ")";
    }

    public ChatMessageRemote(int i, String str, String sender, String recipient, boolean z, long j, String text, ChatMessageMetaRemote chatMessageMetaRemote) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i;
        this.tag = str;
        this.sender = sender;
        this.recipient = recipient;
        this.read = z;
        this.timestamp = j;
        this.text = text;
        this.meta = chatMessageMetaRemote;
    }

    public /* synthetic */ ChatMessageRemote(int i, String str, String str2, String str3, boolean z, long j, String str4, ChatMessageMetaRemote chatMessageMetaRemote, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? false : z, j, str4, chatMessageMetaRemote);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getText() {
        return this.text;
    }

    public final ChatMessageMetaRemote getMeta() {
        return this.meta;
    }
}
