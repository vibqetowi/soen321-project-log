package com.ifriend.domain.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/ifriend/domain/models/Message;", "", "id", "", "sender", "", "recipient", "status", AnalyticsConstants.TIMESTAMP, "", "meta", "Lcom/ifriend/domain/models/MessageMetaInfo;", "text", ViewHierarchyConstants.TAG_KEY, "(ILjava/lang/String;Ljava/lang/String;IJLcom/ifriend/domain/models/MessageMetaInfo;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getMeta", "()Lcom/ifriend/domain/models/MessageMetaInfo;", "getRecipient", "()Ljava/lang/String;", "getSender", "getStatus", "getTag", "getText", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Message {
    private final int id;
    private final MessageMetaInfo meta;
    private final String recipient;
    private final String sender;
    private final int status;
    private final String tag;
    private final String text;
    private final long timestamp;

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.sender;
    }

    public final String component3() {
        return this.recipient;
    }

    public final int component4() {
        return this.status;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final MessageMetaInfo component6() {
        return this.meta;
    }

    public final String component7() {
        return this.text;
    }

    public final String component8() {
        return this.tag;
    }

    public final Message copy(int i, String sender, String recipient, int i2, long j, MessageMetaInfo messageMetaInfo, String text, String tag) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new Message(i, sender, recipient, i2, j, messageMetaInfo, text, tag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            return this.id == message.id && Intrinsics.areEqual(this.sender, message.sender) && Intrinsics.areEqual(this.recipient, message.recipient) && this.status == message.status && this.timestamp == message.timestamp && Intrinsics.areEqual(this.meta, message.meta) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.tag, message.tag);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.id * 31) + this.sender.hashCode()) * 31) + this.recipient.hashCode()) * 31) + this.status) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp)) * 31;
        MessageMetaInfo messageMetaInfo = this.meta;
        return ((((hashCode + (messageMetaInfo == null ? 0 : messageMetaInfo.hashCode())) * 31) + this.text.hashCode()) * 31) + this.tag.hashCode();
    }

    public String toString() {
        int i = this.id;
        String str = this.sender;
        String str2 = this.recipient;
        int i2 = this.status;
        long j = this.timestamp;
        MessageMetaInfo messageMetaInfo = this.meta;
        String str3 = this.text;
        String str4 = this.tag;
        return "Message(id=" + i + ", sender=" + str + ", recipient=" + str2 + ", status=" + i2 + ", timestamp=" + j + ", meta=" + messageMetaInfo + ", text=" + str3 + ", tag=" + str4 + ")";
    }

    public Message(int i, String sender, String recipient, int i2, long j, MessageMetaInfo messageMetaInfo, String text, String tag) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.id = i;
        this.sender = sender;
        this.recipient = recipient;
        this.status = i2;
        this.timestamp = j;
        this.meta = messageMetaInfo;
        this.text = text;
        this.tag = tag;
    }

    public final int getId() {
        return this.id;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final MessageMetaInfo getMeta() {
        return this.meta;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTag() {
        return this.tag;
    }
}
