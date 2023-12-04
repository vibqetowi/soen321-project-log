package com.ifriend.data.networking.api.chatgifts.models.request;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SendChatGiftsRemoteParams.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams;", "", ViewHierarchyConstants.TAG_KEY, "", "text", "instant", "", "imageUrl", "meta", "Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams$Meta;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams$Meta;)V", "getImageUrl", "()Ljava/lang/String;", "getInstant", "()I", "getMeta", "()Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams$Meta;", "getTag", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Meta", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendChatGiftsRemoteParams {
    @SerializedName("reference")
    private final String imageUrl;
    @SerializedName("instant")
    private final int instant;
    @SerializedName("meta")
    private final Meta meta;
    @SerializedName(ViewHierarchyConstants.TAG_KEY)
    private final String tag;
    @SerializedName("text")
    private final String text;

    public static /* synthetic */ SendChatGiftsRemoteParams copy$default(SendChatGiftsRemoteParams sendChatGiftsRemoteParams, String str, String str2, int i, String str3, Meta meta, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendChatGiftsRemoteParams.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = sendChatGiftsRemoteParams.text;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = sendChatGiftsRemoteParams.instant;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = sendChatGiftsRemoteParams.imageUrl;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            meta = sendChatGiftsRemoteParams.meta;
        }
        return sendChatGiftsRemoteParams.copy(str, str4, i3, str5, meta);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.instant;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final Meta component5() {
        return this.meta;
    }

    public final SendChatGiftsRemoteParams copy(String tag, String text, int i, String imageUrl, Meta meta) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(meta, "meta");
        return new SendChatGiftsRemoteParams(tag, text, i, imageUrl, meta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendChatGiftsRemoteParams) {
            SendChatGiftsRemoteParams sendChatGiftsRemoteParams = (SendChatGiftsRemoteParams) obj;
            return Intrinsics.areEqual(this.tag, sendChatGiftsRemoteParams.tag) && Intrinsics.areEqual(this.text, sendChatGiftsRemoteParams.text) && this.instant == sendChatGiftsRemoteParams.instant && Intrinsics.areEqual(this.imageUrl, sendChatGiftsRemoteParams.imageUrl) && Intrinsics.areEqual(this.meta, sendChatGiftsRemoteParams.meta);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.tag.hashCode() * 31) + this.text.hashCode()) * 31) + this.instant) * 31) + this.imageUrl.hashCode()) * 31) + this.meta.hashCode();
    }

    public String toString() {
        String str = this.tag;
        String str2 = this.text;
        int i = this.instant;
        String str3 = this.imageUrl;
        Meta meta = this.meta;
        return "SendChatGiftsRemoteParams(tag=" + str + ", text=" + str2 + ", instant=" + i + ", imageUrl=" + str3 + ", meta=" + meta + ")";
    }

    public SendChatGiftsRemoteParams(String tag, String text, int i, String imageUrl, Meta meta) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.tag = tag;
        this.text = text;
        this.instant = i;
        this.imageUrl = imageUrl;
        this.meta = meta;
    }

    public /* synthetic */ SendChatGiftsRemoteParams(String str, String str2, int i, String str3, Meta meta, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 1 : i, str3, meta);
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final int getInstant() {
        return this.instant;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: SendChatGiftsRemoteParams.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams$Meta;", "", "giftId", "", "(Ljava/lang/String;)V", "getGiftId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Meta {
        @SerializedName("gift")
        private final String giftId;

        public static /* synthetic */ Meta copy$default(Meta meta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.giftId;
            }
            return meta.copy(str);
        }

        public final String component1() {
            return this.giftId;
        }

        public final Meta copy(String giftId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            return new Meta(giftId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Meta) && Intrinsics.areEqual(this.giftId, ((Meta) obj).giftId);
        }

        public int hashCode() {
            return this.giftId.hashCode();
        }

        public String toString() {
            String str = this.giftId;
            return "Meta(giftId=" + str + ")";
        }

        public Meta(String giftId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            this.giftId = giftId;
        }

        public final String getGiftId() {
            return this.giftId;
        }
    }
}
