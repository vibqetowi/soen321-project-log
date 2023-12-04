package com.ifriend.presentation.features.chatstore.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatStoreUi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006*"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "", "chatId", "", "name", "backgroundUrl", "description", "actionMessage", FirebaseAnalytics.Param.PRICE, "priceValue", "", "isShowPrice", "", "isShowUnlockLevel", "unlockMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;)V", "getActionMessage", "()Ljava/lang/String;", "getBackgroundUrl", "getChatId", "getDescription", "()Z", "getName", "getPrice", "getPriceValue", "()I", "getUnlockMessage", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStoreUi {
    public static final int $stable = 0;
    private final String actionMessage;
    private final String backgroundUrl;
    private final String chatId;
    private final String description;
    private final boolean isShowPrice;
    private final boolean isShowUnlockLevel;
    private final String name;
    private final String price;
    private final int priceValue;
    private final String unlockMessage;

    public final String component1() {
        return this.chatId;
    }

    public final String component10() {
        return this.unlockMessage;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.backgroundUrl;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.actionMessage;
    }

    public final String component6() {
        return this.price;
    }

    public final int component7() {
        return this.priceValue;
    }

    public final boolean component8() {
        return this.isShowPrice;
    }

    public final boolean component9() {
        return this.isShowUnlockLevel;
    }

    public final ChatStoreUi copy(String chatId, String name, String backgroundUrl, String description, String actionMessage, String price, int i, boolean z, boolean z2, String unlockMessage) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionMessage, "actionMessage");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unlockMessage, "unlockMessage");
        return new ChatStoreUi(chatId, name, backgroundUrl, description, actionMessage, price, i, z, z2, unlockMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatStoreUi) {
            ChatStoreUi chatStoreUi = (ChatStoreUi) obj;
            return Intrinsics.areEqual(this.chatId, chatStoreUi.chatId) && Intrinsics.areEqual(this.name, chatStoreUi.name) && Intrinsics.areEqual(this.backgroundUrl, chatStoreUi.backgroundUrl) && Intrinsics.areEqual(this.description, chatStoreUi.description) && Intrinsics.areEqual(this.actionMessage, chatStoreUi.actionMessage) && Intrinsics.areEqual(this.price, chatStoreUi.price) && this.priceValue == chatStoreUi.priceValue && this.isShowPrice == chatStoreUi.isShowPrice && this.isShowUnlockLevel == chatStoreUi.isShowUnlockLevel && Intrinsics.areEqual(this.unlockMessage, chatStoreUi.unlockMessage);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.chatId.hashCode() * 31) + this.name.hashCode()) * 31) + this.backgroundUrl.hashCode()) * 31) + this.description.hashCode()) * 31) + this.actionMessage.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceValue) * 31;
        boolean z = this.isShowPrice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isShowUnlockLevel;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.unlockMessage.hashCode();
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.name;
        String str3 = this.backgroundUrl;
        String str4 = this.description;
        String str5 = this.actionMessage;
        String str6 = this.price;
        int i = this.priceValue;
        boolean z = this.isShowPrice;
        boolean z2 = this.isShowUnlockLevel;
        String str7 = this.unlockMessage;
        return "ChatStoreUi(chatId=" + str + ", name=" + str2 + ", backgroundUrl=" + str3 + ", description=" + str4 + ", actionMessage=" + str5 + ", price=" + str6 + ", priceValue=" + i + ", isShowPrice=" + z + ", isShowUnlockLevel=" + z2 + ", unlockMessage=" + str7 + ")";
    }

    public ChatStoreUi(String chatId, String name, String backgroundUrl, String description, String actionMessage, String price, int i, boolean z, boolean z2, String unlockMessage) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionMessage, "actionMessage");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unlockMessage, "unlockMessage");
        this.chatId = chatId;
        this.name = name;
        this.backgroundUrl = backgroundUrl;
        this.description = description;
        this.actionMessage = actionMessage;
        this.price = price;
        this.priceValue = i;
        this.isShowPrice = z;
        this.isShowUnlockLevel = z2;
        this.unlockMessage = unlockMessage;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getActionMessage() {
        return this.actionMessage;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getPriceValue() {
        return this.priceValue;
    }

    public final boolean isShowPrice() {
        return this.isShowPrice;
    }

    public final boolean isShowUnlockLevel() {
        return this.isShowUnlockLevel;
    }

    public final String getUnlockMessage() {
        return this.unlockMessage;
    }
}
