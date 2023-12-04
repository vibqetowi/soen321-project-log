package com.ifriend.presentation.features.chat.gifts.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftUi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "", "id", "", FirebaseAnalytics.Param.PRICE, "priceValue", "", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageUrl", "isFree", "", "()Z", "getPrice", "getPriceValue", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftUi {
    public static final int $stable = 0;
    private final String id;
    private final String imageUrl;
    private final String price;
    private final int priceValue;

    public static /* synthetic */ ChatGiftUi copy$default(ChatGiftUi chatGiftUi, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatGiftUi.id;
        }
        if ((i2 & 2) != 0) {
            str2 = chatGiftUi.price;
        }
        if ((i2 & 4) != 0) {
            i = chatGiftUi.priceValue;
        }
        if ((i2 & 8) != 0) {
            str3 = chatGiftUi.imageUrl;
        }
        return chatGiftUi.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.price;
    }

    public final int component3() {
        return this.priceValue;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final ChatGiftUi copy(String id, String price, int i, String imageUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new ChatGiftUi(id, price, i, imageUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatGiftUi) {
            ChatGiftUi chatGiftUi = (ChatGiftUi) obj;
            return Intrinsics.areEqual(this.id, chatGiftUi.id) && Intrinsics.areEqual(this.price, chatGiftUi.price) && this.priceValue == chatGiftUi.priceValue && Intrinsics.areEqual(this.imageUrl, chatGiftUi.imageUrl);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.price.hashCode()) * 31) + this.priceValue) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.price;
        int i = this.priceValue;
        String str3 = this.imageUrl;
        return "ChatGiftUi(id=" + str + ", price=" + str2 + ", priceValue=" + i + ", imageUrl=" + str3 + ")";
    }

    public ChatGiftUi(String id, String price, int i, String imageUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = id;
        this.price = price;
        this.priceValue = i;
        this.imageUrl = imageUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getPriceValue() {
        return this.priceValue;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean isFree() {
        return this.priceValue == 0;
    }
}
