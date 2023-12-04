package com.ifriend.domain.newChat.chat.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.newChat.chat.models.MessageMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageInfo.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003;<=Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0015HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J}\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006>"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "", "ids", "Lcom/ifriend/domain/newChat/chat/models/MessageIds;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", AnalyticsConstants.TIMESTAMP, "", "isFromUser", "", "read", "isSexting", "topic", "Lcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;", "paymentInfo", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo$PaymentInfo;", "messageAccess", "Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;", "meta", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Meta;", "regenerate", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Regenerate;", "(Lcom/ifriend/domain/newChat/chat/models/MessageIds;Lcom/ifriend/domain/newChat/chat/models/MessageTag;JZZZLcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;Lcom/ifriend/domain/newChat/chat/models/MessageInfo$PaymentInfo;Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Meta;Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Regenerate;)V", "getIds", "()Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "()Z", "getMessageAccess", "()Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;", "getMeta", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Meta;", "getPaymentInfo", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo$PaymentInfo;", "getRead", "getRegenerate", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Regenerate;", "getTag", "()Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "getTimestamp", "()J", "getTopic", "()Lcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "Meta", "PaymentInfo", "Regenerate", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageInfo {
    private final MessageIds ids;
    private final boolean isFromUser;
    private final boolean isSexting;
    private final ChatMessageAccessType messageAccess;
    private final Meta meta;
    private final PaymentInfo paymentInfo;
    private final boolean read;
    private final Regenerate regenerate;
    private final MessageTag tag;
    private final long timestamp;
    private final MessageMeta.Topic topic;

    public final MessageIds component1() {
        return this.ids;
    }

    public final Meta component10() {
        return this.meta;
    }

    public final Regenerate component11() {
        return this.regenerate;
    }

    public final MessageTag component2() {
        return this.tag;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final boolean component4() {
        return this.isFromUser;
    }

    public final boolean component5() {
        return this.read;
    }

    public final boolean component6() {
        return this.isSexting;
    }

    public final MessageMeta.Topic component7() {
        return this.topic;
    }

    public final PaymentInfo component8() {
        return this.paymentInfo;
    }

    public final ChatMessageAccessType component9() {
        return this.messageAccess;
    }

    public final MessageInfo copy(MessageIds ids, MessageTag tag, long j, boolean z, boolean z2, boolean z3, MessageMeta.Topic topic, PaymentInfo paymentInfo, ChatMessageAccessType messageAccess, Meta meta, Regenerate regenerate) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageAccess, "messageAccess");
        Intrinsics.checkNotNullParameter(regenerate, "regenerate");
        return new MessageInfo(ids, tag, j, z, z2, z3, topic, paymentInfo, messageAccess, meta, regenerate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageInfo) {
            MessageInfo messageInfo = (MessageInfo) obj;
            return Intrinsics.areEqual(this.ids, messageInfo.ids) && Intrinsics.areEqual(this.tag, messageInfo.tag) && this.timestamp == messageInfo.timestamp && this.isFromUser == messageInfo.isFromUser && this.read == messageInfo.read && this.isSexting == messageInfo.isSexting && Intrinsics.areEqual(this.topic, messageInfo.topic) && Intrinsics.areEqual(this.paymentInfo, messageInfo.paymentInfo) && this.messageAccess == messageInfo.messageAccess && Intrinsics.areEqual(this.meta, messageInfo.meta) && Intrinsics.areEqual(this.regenerate, messageInfo.regenerate);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.ids.hashCode() * 31) + this.tag.hashCode()) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp)) * 31;
        boolean z = this.isFromUser;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.read;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isSexting;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        MessageMeta.Topic topic = this.topic;
        int hashCode2 = (i5 + (topic == null ? 0 : topic.hashCode())) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int hashCode3 = (((hashCode2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31) + this.messageAccess.hashCode()) * 31;
        Meta meta = this.meta;
        return ((hashCode3 + (meta != null ? meta.hashCode() : 0)) * 31) + this.regenerate.hashCode();
    }

    public String toString() {
        MessageIds messageIds = this.ids;
        MessageTag messageTag = this.tag;
        long j = this.timestamp;
        boolean z = this.isFromUser;
        boolean z2 = this.read;
        boolean z3 = this.isSexting;
        MessageMeta.Topic topic = this.topic;
        PaymentInfo paymentInfo = this.paymentInfo;
        ChatMessageAccessType chatMessageAccessType = this.messageAccess;
        Meta meta = this.meta;
        Regenerate regenerate = this.regenerate;
        return "MessageInfo(ids=" + messageIds + ", tag=" + messageTag + ", timestamp=" + j + ", isFromUser=" + z + ", read=" + z2 + ", isSexting=" + z3 + ", topic=" + topic + ", paymentInfo=" + paymentInfo + ", messageAccess=" + chatMessageAccessType + ", meta=" + meta + ", regenerate=" + regenerate + ")";
    }

    public MessageInfo(MessageIds ids, MessageTag tag, long j, boolean z, boolean z2, boolean z3, MessageMeta.Topic topic, PaymentInfo paymentInfo, ChatMessageAccessType messageAccess, Meta meta, Regenerate regenerate) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageAccess, "messageAccess");
        Intrinsics.checkNotNullParameter(regenerate, "regenerate");
        this.ids = ids;
        this.tag = tag;
        this.timestamp = j;
        this.isFromUser = z;
        this.read = z2;
        this.isSexting = z3;
        this.topic = topic;
        this.paymentInfo = paymentInfo;
        this.messageAccess = messageAccess;
        this.meta = meta;
        this.regenerate = regenerate;
    }

    public final MessageIds getIds() {
        return this.ids;
    }

    public final MessageTag getTag() {
        return this.tag;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isFromUser() {
        return this.isFromUser;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final boolean isSexting() {
        return this.isSexting;
    }

    public final MessageMeta.Topic getTopic() {
        return this.topic;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final ChatMessageAccessType getMessageAccess() {
        return this.messageAccess;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final Regenerate getRegenerate() {
        return this.regenerate;
    }

    /* compiled from: MessageInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageInfo$PaymentInfo;", "", "isPaid", "", "cost", "", "(Ljava/lang/Boolean;I)V", "getCost", "()I", "isNeedPayForMessage", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;I)Lcom/ifriend/domain/newChat/chat/models/MessageInfo$PaymentInfo;", "equals", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PaymentInfo {
        private final int cost;
        private final Boolean isPaid;

        public static /* synthetic */ PaymentInfo copy$default(PaymentInfo paymentInfo, Boolean bool, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bool = paymentInfo.isPaid;
            }
            if ((i2 & 2) != 0) {
                i = paymentInfo.cost;
            }
            return paymentInfo.copy(bool, i);
        }

        public final Boolean component1() {
            return this.isPaid;
        }

        public final int component2() {
            return this.cost;
        }

        public final PaymentInfo copy(Boolean bool, int i) {
            return new PaymentInfo(bool, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentInfo) {
                PaymentInfo paymentInfo = (PaymentInfo) obj;
                return Intrinsics.areEqual(this.isPaid, paymentInfo.isPaid) && this.cost == paymentInfo.cost;
            }
            return false;
        }

        public int hashCode() {
            Boolean bool = this.isPaid;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + this.cost;
        }

        public String toString() {
            Boolean bool = this.isPaid;
            int i = this.cost;
            return "PaymentInfo(isPaid=" + bool + ", cost=" + i + ")";
        }

        public PaymentInfo(Boolean bool, int i) {
            this.isPaid = bool;
            this.cost = i;
        }

        public final Boolean isPaid() {
            return this.isPaid;
        }

        public final int getCost() {
            return this.cost;
        }

        public final boolean isNeedPayForMessage() {
            return Intrinsics.areEqual((Object) this.isPaid, (Object) false) && ommonKt.orZero(Integer.valueOf(this.cost)) > 0;
        }
    }

    /* compiled from: MessageInfo.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Meta;", "", "mediaId", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getMediaId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Meta {
        private final String mediaId;
        private final String type;

        public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.mediaId;
            }
            if ((i & 2) != 0) {
                str2 = meta.type;
            }
            return meta.copy(str, str2);
        }

        public final String component1() {
            return this.mediaId;
        }

        public final String component2() {
            return this.type;
        }

        public final Meta copy(String mediaId, String type) {
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Meta(mediaId, type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Meta) {
                Meta meta = (Meta) obj;
                return Intrinsics.areEqual(this.mediaId, meta.mediaId) && Intrinsics.areEqual(this.type, meta.type);
            }
            return false;
        }

        public int hashCode() {
            return (this.mediaId.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            String str = this.mediaId;
            String str2 = this.type;
            return "Meta(mediaId=" + str + ", type=" + str2 + ")";
        }

        public Meta(String mediaId, String type) {
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.mediaId = mediaId;
            this.type = type;
        }

        public final String getMediaId() {
            return this.mediaId;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: MessageInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageInfo$Regenerate;", "", "isAllowed", "", "oldMessageId", "", "(ZLjava/lang/String;)V", "()Z", "getOldMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Regenerate {
        private final boolean isAllowed;
        private final String oldMessageId;

        public static /* synthetic */ Regenerate copy$default(Regenerate regenerate, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = regenerate.isAllowed;
            }
            if ((i & 2) != 0) {
                str = regenerate.oldMessageId;
            }
            return regenerate.copy(z, str);
        }

        public final boolean component1() {
            return this.isAllowed;
        }

        public final String component2() {
            return this.oldMessageId;
        }

        public final Regenerate copy(boolean z, String oldMessageId) {
            Intrinsics.checkNotNullParameter(oldMessageId, "oldMessageId");
            return new Regenerate(z, oldMessageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Regenerate) {
                Regenerate regenerate = (Regenerate) obj;
                return this.isAllowed == regenerate.isAllowed && Intrinsics.areEqual(this.oldMessageId, regenerate.oldMessageId);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isAllowed;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.oldMessageId.hashCode();
        }

        public String toString() {
            boolean z = this.isAllowed;
            String str = this.oldMessageId;
            return "Regenerate(isAllowed=" + z + ", oldMessageId=" + str + ")";
        }

        public Regenerate(boolean z, String oldMessageId) {
            Intrinsics.checkNotNullParameter(oldMessageId, "oldMessageId");
            this.isAllowed = z;
            this.oldMessageId = oldMessageId;
        }

        public final boolean isAllowed() {
            return this.isAllowed;
        }

        public final String getOldMessageId() {
            return this.oldMessageId;
        }
    }
}
