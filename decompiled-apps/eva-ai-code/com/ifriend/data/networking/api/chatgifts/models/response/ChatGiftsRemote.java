package com.ifriend.data.networking.api.chatgifts.models.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftsRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "", "giftId", "", "image", FirebaseAnalytics.Param.PRICE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getGiftId", "()Ljava/lang/String;", "getImage", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsRemote {
    @SerializedName("id")
    private final String giftId;
    @SerializedName("image")
    private final String image;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;

    public ChatGiftsRemote() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChatGiftsRemote copy$default(ChatGiftsRemote chatGiftsRemote, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatGiftsRemote.giftId;
        }
        if ((i & 2) != 0) {
            str2 = chatGiftsRemote.image;
        }
        if ((i & 4) != 0) {
            num = chatGiftsRemote.price;
        }
        return chatGiftsRemote.copy(str, str2, num);
    }

    public final String component1() {
        return this.giftId;
    }

    public final String component2() {
        return this.image;
    }

    public final Integer component3() {
        return this.price;
    }

    public final ChatGiftsRemote copy(String str, String str2, Integer num) {
        return new ChatGiftsRemote(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatGiftsRemote) {
            ChatGiftsRemote chatGiftsRemote = (ChatGiftsRemote) obj;
            return Intrinsics.areEqual(this.giftId, chatGiftsRemote.giftId) && Intrinsics.areEqual(this.image, chatGiftsRemote.image) && Intrinsics.areEqual(this.price, chatGiftsRemote.price);
        }
        return false;
    }

    public int hashCode() {
        String str = this.giftId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.price;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.giftId;
        String str2 = this.image;
        Integer num = this.price;
        return "ChatGiftsRemote(giftId=" + str + ", image=" + str2 + ", price=" + num + ")";
    }

    public ChatGiftsRemote(String str, String str2, Integer num) {
        this.giftId = str;
        this.image = str2;
        this.price = num;
    }

    public /* synthetic */ ChatGiftsRemote(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final String getImage() {
        return this.image;
    }

    public final Integer getPrice() {
        return this.price;
    }
}
