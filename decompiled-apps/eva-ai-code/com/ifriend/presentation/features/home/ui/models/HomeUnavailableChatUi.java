package com.ifriend.presentation.features.home.ui.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeChatUi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u000bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00062"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "chatId", "", "chatName", "chatAvatarUri", "isVerified", "", "avatarBadgeLabel", "description", "unlockLevel", "", FirebaseAnalytics.Param.PRICE, "sorting", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "unreadMessagesCount", RtspHeaders.Values.TIME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarBadgeLabel", "()Ljava/lang/String;", "getChatAvatarUri", "getChatId", "getChatName", "getDescription", "isCanChatting", "()Z", "getPrice", "()I", "getSorting", "()Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "getTime", "getUnlockLevel", "getUnreadMessagesCount", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeUnavailableChatUi implements HomeChatUi {
    public static final int $stable = 0;
    private final String avatarBadgeLabel;
    private final String chatAvatarUri;
    private final String chatId;
    private final String chatName;
    private final String description;
    private final boolean isVerified;
    private final int price;
    private final HomeChatUi.Sorting sorting;
    private final String time;
    private final int unlockLevel;
    private final String unreadMessagesCount;

    public final String component1() {
        return this.chatId;
    }

    public final String component10() {
        return this.unreadMessagesCount;
    }

    public final String component11() {
        return this.time;
    }

    public final String component2() {
        return this.chatName;
    }

    public final String component3() {
        return this.chatAvatarUri;
    }

    public final boolean component4() {
        return this.isVerified;
    }

    public final String component5() {
        return this.avatarBadgeLabel;
    }

    public final String component6() {
        return this.description;
    }

    public final int component7() {
        return this.unlockLevel;
    }

    public final int component8() {
        return this.price;
    }

    public final HomeChatUi.Sorting component9() {
        return this.sorting;
    }

    public final HomeUnavailableChatUi copy(String chatId, String chatName, String chatAvatarUri, boolean z, String avatarBadgeLabel, String description, int i, int i2, HomeChatUi.Sorting sorting, String unreadMessagesCount, String time) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(chatAvatarUri, "chatAvatarUri");
        Intrinsics.checkNotNullParameter(avatarBadgeLabel, "avatarBadgeLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
        Intrinsics.checkNotNullParameter(time, "time");
        return new HomeUnavailableChatUi(chatId, chatName, chatAvatarUri, z, avatarBadgeLabel, description, i, i2, sorting, unreadMessagesCount, time);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeUnavailableChatUi) {
            HomeUnavailableChatUi homeUnavailableChatUi = (HomeUnavailableChatUi) obj;
            return Intrinsics.areEqual(this.chatId, homeUnavailableChatUi.chatId) && Intrinsics.areEqual(this.chatName, homeUnavailableChatUi.chatName) && Intrinsics.areEqual(this.chatAvatarUri, homeUnavailableChatUi.chatAvatarUri) && this.isVerified == homeUnavailableChatUi.isVerified && Intrinsics.areEqual(this.avatarBadgeLabel, homeUnavailableChatUi.avatarBadgeLabel) && Intrinsics.areEqual(this.description, homeUnavailableChatUi.description) && this.unlockLevel == homeUnavailableChatUi.unlockLevel && this.price == homeUnavailableChatUi.price && Intrinsics.areEqual(this.sorting, homeUnavailableChatUi.sorting) && Intrinsics.areEqual(this.unreadMessagesCount, homeUnavailableChatUi.unreadMessagesCount) && Intrinsics.areEqual(this.time, homeUnavailableChatUi.time);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.chatId.hashCode() * 31) + this.chatName.hashCode()) * 31) + this.chatAvatarUri.hashCode()) * 31;
        boolean z = this.isVerified;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((((hashCode + i) * 31) + this.avatarBadgeLabel.hashCode()) * 31) + this.description.hashCode()) * 31) + this.unlockLevel) * 31) + this.price) * 31) + this.sorting.hashCode()) * 31) + this.unreadMessagesCount.hashCode()) * 31) + this.time.hashCode();
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public boolean isCanChatting() {
        return false;
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.chatName;
        String str3 = this.chatAvatarUri;
        boolean z = this.isVerified;
        String str4 = this.avatarBadgeLabel;
        String str5 = this.description;
        int i = this.unlockLevel;
        int i2 = this.price;
        HomeChatUi.Sorting sorting = this.sorting;
        String str6 = this.unreadMessagesCount;
        String str7 = this.time;
        return "HomeUnavailableChatUi(chatId=" + str + ", chatName=" + str2 + ", chatAvatarUri=" + str3 + ", isVerified=" + z + ", avatarBadgeLabel=" + str4 + ", description=" + str5 + ", unlockLevel=" + i + ", price=" + i2 + ", sorting=" + sorting + ", unreadMessagesCount=" + str6 + ", time=" + str7 + ")";
    }

    public HomeUnavailableChatUi(String chatId, String chatName, String chatAvatarUri, boolean z, String avatarBadgeLabel, String description, int i, int i2, HomeChatUi.Sorting sorting, String unreadMessagesCount, String time) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(chatAvatarUri, "chatAvatarUri");
        Intrinsics.checkNotNullParameter(avatarBadgeLabel, "avatarBadgeLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
        Intrinsics.checkNotNullParameter(time, "time");
        this.chatId = chatId;
        this.chatName = chatName;
        this.chatAvatarUri = chatAvatarUri;
        this.isVerified = z;
        this.avatarBadgeLabel = avatarBadgeLabel;
        this.description = description;
        this.unlockLevel = i;
        this.price = i2;
        this.sorting = sorting;
        this.unreadMessagesCount = unreadMessagesCount;
        this.time = time;
    }

    public /* synthetic */ HomeUnavailableChatUi(String str, String str2, String str3, boolean z, String str4, String str5, int i, int i2, HomeChatUi.Sorting sorting, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, str4, str5, i, i2, sorting, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? "" : str7);
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatId() {
        return this.chatId;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatName() {
        return this.chatName;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatAvatarUri() {
        return this.chatAvatarUri;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public boolean isVerified() {
        return this.isVerified;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getAvatarBadgeLabel() {
        return this.avatarBadgeLabel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getUnlockLevel() {
        return this.unlockLevel;
    }

    public final int getPrice() {
        return this.price;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public HomeChatUi.Sorting getSorting() {
        return this.sorting;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getTime() {
        return this.time;
    }
}
