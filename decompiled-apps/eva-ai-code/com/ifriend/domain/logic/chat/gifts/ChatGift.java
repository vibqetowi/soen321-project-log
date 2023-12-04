package com.ifriend.domain.logic.chat.gifts;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatGift.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "", "giftId", "", "imageUrl", "imageName", FirebaseAnalytics.Param.PRICE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGiftId", "()Ljava/lang/String;", "getImageName", "getImageUrl", "getPrice", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGift {
    private final String giftId;
    private final String imageName;
    private final String imageUrl;
    private final int price;

    public static /* synthetic */ ChatGift copy$default(ChatGift chatGift, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatGift.giftId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatGift.imageUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = chatGift.imageName;
        }
        if ((i2 & 8) != 0) {
            i = chatGift.price;
        }
        return chatGift.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.giftId;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.imageName;
    }

    public final int component4() {
        return this.price;
    }

    public final ChatGift copy(String giftId, String imageUrl, String imageName, int i) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new ChatGift(giftId, imageUrl, imageName, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatGift) {
            ChatGift chatGift = (ChatGift) obj;
            return Intrinsics.areEqual(this.giftId, chatGift.giftId) && Intrinsics.areEqual(this.imageUrl, chatGift.imageUrl) && Intrinsics.areEqual(this.imageName, chatGift.imageName) && this.price == chatGift.price;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.giftId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.imageName.hashCode()) * 31) + this.price;
    }

    public String toString() {
        String str = this.giftId;
        String str2 = this.imageUrl;
        String str3 = this.imageName;
        int i = this.price;
        return "ChatGift(giftId=" + str + ", imageUrl=" + str2 + ", imageName=" + str3 + ", price=" + i + ")";
    }

    public ChatGift(String giftId, String imageUrl, String imageName, int i) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.giftId = giftId;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        this.price = i;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final int getPrice() {
        return this.price;
    }
}
