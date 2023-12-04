package com.ifriend.domain.logic.chat.configuration;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.Scopes;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Personality;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatConfig.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001:\bGHIJKLMNBu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003J\t\u00108\u001a\u00020\u0018HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010*J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\u0098\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00112\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006O"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "", "id", "", "chatId", "name", "descriptions", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Descriptions;", "order", "", "promote", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Promote;", "images", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Images;", "animations", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;", "isDefaultSelectedBot", "", "chatType", Scopes.PROFILE, "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Profile;", "tags", "", "subscriptionInfo", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Descriptions;Ljava/lang/Integer;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Promote;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Images;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;ZLjava/lang/String;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Profile;Ljava/util/List;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;)V", "getAnimations", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;", "getChatId", "()Ljava/lang/String;", "getChatType", "getDescriptions", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Descriptions;", "hasAnimations", "getHasAnimations", "()Z", "getId", "getImages", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Images;", "isMainBot", "getName", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProfile", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Profile;", "getPromote", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Promote;", "getSubscriptionInfo", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;", "getTags", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Descriptions;Ljava/lang/Integer;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Promote;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Images;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;ZLjava/lang/String;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Profile;Ljava/util/List;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;)Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "equals", "other", "hashCode", "toString", "Animations", "Descriptions", "Images", "Profile", "Promote", "SubscriptionBadgeStyle", "SubscriptionBadges", "SubscriptionInfo", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfig {
    private final Animations animations;
    private final String chatId;
    private final String chatType;
    private final Descriptions descriptions;
    private final String id;
    private final Images images;
    private final boolean isDefaultSelectedBot;
    private final String name;
    private final Integer order;
    private final Profile profile;
    private final Promote promote;
    private final SubscriptionInfo subscriptionInfo;
    private final List<String> tags;

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.chatType;
    }

    public final Profile component11() {
        return this.profile;
    }

    public final List<String> component12() {
        return this.tags;
    }

    public final SubscriptionInfo component13() {
        return this.subscriptionInfo;
    }

    public final String component2() {
        return this.chatId;
    }

    public final String component3() {
        return this.name;
    }

    public final Descriptions component4() {
        return this.descriptions;
    }

    public final Integer component5() {
        return this.order;
    }

    public final Promote component6() {
        return this.promote;
    }

    public final Images component7() {
        return this.images;
    }

    public final Animations component8() {
        return this.animations;
    }

    public final boolean component9() {
        return this.isDefaultSelectedBot;
    }

    public final ChatConfig copy(String id, String chatId, String name, Descriptions descriptions, Integer num, Promote promote, Images images, Animations animations, boolean z, String chatType, Profile profile, List<String> tags, SubscriptionInfo subscriptionInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(promote, "promote");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(animations, "animations");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(subscriptionInfo, "subscriptionInfo");
        return new ChatConfig(id, chatId, name, descriptions, num, promote, images, animations, z, chatType, profile, tags, subscriptionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatConfig) {
            ChatConfig chatConfig = (ChatConfig) obj;
            return Intrinsics.areEqual(this.id, chatConfig.id) && Intrinsics.areEqual(this.chatId, chatConfig.chatId) && Intrinsics.areEqual(this.name, chatConfig.name) && Intrinsics.areEqual(this.descriptions, chatConfig.descriptions) && Intrinsics.areEqual(this.order, chatConfig.order) && Intrinsics.areEqual(this.promote, chatConfig.promote) && Intrinsics.areEqual(this.images, chatConfig.images) && Intrinsics.areEqual(this.animations, chatConfig.animations) && this.isDefaultSelectedBot == chatConfig.isDefaultSelectedBot && Intrinsics.areEqual(this.chatType, chatConfig.chatType) && Intrinsics.areEqual(this.profile, chatConfig.profile) && Intrinsics.areEqual(this.tags, chatConfig.tags) && Intrinsics.areEqual(this.subscriptionInfo, chatConfig.subscriptionInfo);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.descriptions.hashCode()) * 31;
        Integer num = this.order;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.promote.hashCode()) * 31) + this.images.hashCode()) * 31) + this.animations.hashCode()) * 31;
        boolean z = this.isDefaultSelectedBot;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode2 + i) * 31) + this.chatType.hashCode()) * 31) + this.profile.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.subscriptionInfo.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.chatId;
        String str3 = this.name;
        Descriptions descriptions = this.descriptions;
        Integer num = this.order;
        Promote promote = this.promote;
        Images images = this.images;
        Animations animations = this.animations;
        boolean z = this.isDefaultSelectedBot;
        String str4 = this.chatType;
        Profile profile = this.profile;
        List<String> list = this.tags;
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        return "ChatConfig(id=" + str + ", chatId=" + str2 + ", name=" + str3 + ", descriptions=" + descriptions + ", order=" + num + ", promote=" + promote + ", images=" + images + ", animations=" + animations + ", isDefaultSelectedBot=" + z + ", chatType=" + str4 + ", profile=" + profile + ", tags=" + list + ", subscriptionInfo=" + subscriptionInfo + ")";
    }

    public ChatConfig(String id, String chatId, String name, Descriptions descriptions, Integer num, Promote promote, Images images, Animations animations, boolean z, String chatType, Profile profile, List<String> tags, SubscriptionInfo subscriptionInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(promote, "promote");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(animations, "animations");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(subscriptionInfo, "subscriptionInfo");
        this.id = id;
        this.chatId = chatId;
        this.name = name;
        this.descriptions = descriptions;
        this.order = num;
        this.promote = promote;
        this.images = images;
        this.animations = animations;
        this.isDefaultSelectedBot = z;
        this.chatType = chatType;
        this.profile = profile;
        this.tags = tags;
        this.subscriptionInfo = subscriptionInfo;
    }

    public final String getId() {
        return this.id;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getName() {
        return this.name;
    }

    public final Descriptions getDescriptions() {
        return this.descriptions;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Promote getPromote() {
        return this.promote;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Animations getAnimations() {
        return this.animations;
    }

    public final boolean isDefaultSelectedBot() {
        return this.isDefaultSelectedBot;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public final boolean isMainBot() {
        return Intrinsics.areEqual(this.id, "main");
    }

    public final boolean getHasAnimations() {
        return (StringsKt.isBlank(this.animations.getIdleUrl()) ^ true) || (StringsKt.isBlank(this.animations.getIdleSextingUrl()) ^ true) || (StringsKt.isBlank(this.animations.getIdleStartUrl()) ^ true);
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Images;", "", "profileAvatarUrl", "", "backgroundUrl", "roundAvatarUrl", "subscriptionBackgroundUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundUrl", "()Ljava/lang/String;", "getProfileAvatarUrl", "getRoundAvatarUrl", "getSubscriptionBackgroundUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Images {
        private final String backgroundUrl;
        private final String profileAvatarUrl;
        private final String roundAvatarUrl;
        private final String subscriptionBackgroundUrl;

        public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = images.profileAvatarUrl;
            }
            if ((i & 2) != 0) {
                str2 = images.backgroundUrl;
            }
            if ((i & 4) != 0) {
                str3 = images.roundAvatarUrl;
            }
            if ((i & 8) != 0) {
                str4 = images.subscriptionBackgroundUrl;
            }
            return images.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.profileAvatarUrl;
        }

        public final String component2() {
            return this.backgroundUrl;
        }

        public final String component3() {
            return this.roundAvatarUrl;
        }

        public final String component4() {
            return this.subscriptionBackgroundUrl;
        }

        public final Images copy(String profileAvatarUrl, String backgroundUrl, String roundAvatarUrl, String subscriptionBackgroundUrl) {
            Intrinsics.checkNotNullParameter(profileAvatarUrl, "profileAvatarUrl");
            Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
            Intrinsics.checkNotNullParameter(roundAvatarUrl, "roundAvatarUrl");
            Intrinsics.checkNotNullParameter(subscriptionBackgroundUrl, "subscriptionBackgroundUrl");
            return new Images(profileAvatarUrl, backgroundUrl, roundAvatarUrl, subscriptionBackgroundUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Images) {
                Images images = (Images) obj;
                return Intrinsics.areEqual(this.profileAvatarUrl, images.profileAvatarUrl) && Intrinsics.areEqual(this.backgroundUrl, images.backgroundUrl) && Intrinsics.areEqual(this.roundAvatarUrl, images.roundAvatarUrl) && Intrinsics.areEqual(this.subscriptionBackgroundUrl, images.subscriptionBackgroundUrl);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.profileAvatarUrl.hashCode() * 31) + this.backgroundUrl.hashCode()) * 31) + this.roundAvatarUrl.hashCode()) * 31) + this.subscriptionBackgroundUrl.hashCode();
        }

        public String toString() {
            String str = this.profileAvatarUrl;
            String str2 = this.backgroundUrl;
            String str3 = this.roundAvatarUrl;
            String str4 = this.subscriptionBackgroundUrl;
            return "Images(profileAvatarUrl=" + str + ", backgroundUrl=" + str2 + ", roundAvatarUrl=" + str3 + ", subscriptionBackgroundUrl=" + str4 + ")";
        }

        public Images(String profileAvatarUrl, String backgroundUrl, String roundAvatarUrl, String subscriptionBackgroundUrl) {
            Intrinsics.checkNotNullParameter(profileAvatarUrl, "profileAvatarUrl");
            Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
            Intrinsics.checkNotNullParameter(roundAvatarUrl, "roundAvatarUrl");
            Intrinsics.checkNotNullParameter(subscriptionBackgroundUrl, "subscriptionBackgroundUrl");
            this.profileAvatarUrl = profileAvatarUrl;
            this.backgroundUrl = backgroundUrl;
            this.roundAvatarUrl = roundAvatarUrl;
            this.subscriptionBackgroundUrl = subscriptionBackgroundUrl;
        }

        public final String getProfileAvatarUrl() {
            return this.profileAvatarUrl;
        }

        public final String getBackgroundUrl() {
            return this.backgroundUrl;
        }

        public final String getRoundAvatarUrl() {
            return this.roundAvatarUrl;
        }

        public final String getSubscriptionBackgroundUrl() {
            return this.subscriptionBackgroundUrl;
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;", "", "idleUrl", "", "idleSextingUrl", "idleStartUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdleSextingUrl", "()Ljava/lang/String;", "getIdleStartUrl", "getIdleUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Animations {
        private final String idleSextingUrl;
        private final String idleStartUrl;
        private final String idleUrl;

        public static /* synthetic */ Animations copy$default(Animations animations, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = animations.idleUrl;
            }
            if ((i & 2) != 0) {
                str2 = animations.idleSextingUrl;
            }
            if ((i & 4) != 0) {
                str3 = animations.idleStartUrl;
            }
            return animations.copy(str, str2, str3);
        }

        public final String component1() {
            return this.idleUrl;
        }

        public final String component2() {
            return this.idleSextingUrl;
        }

        public final String component3() {
            return this.idleStartUrl;
        }

        public final Animations copy(String idleUrl, String idleSextingUrl, String idleStartUrl) {
            Intrinsics.checkNotNullParameter(idleUrl, "idleUrl");
            Intrinsics.checkNotNullParameter(idleSextingUrl, "idleSextingUrl");
            Intrinsics.checkNotNullParameter(idleStartUrl, "idleStartUrl");
            return new Animations(idleUrl, idleSextingUrl, idleStartUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Animations) {
                Animations animations = (Animations) obj;
                return Intrinsics.areEqual(this.idleUrl, animations.idleUrl) && Intrinsics.areEqual(this.idleSextingUrl, animations.idleSextingUrl) && Intrinsics.areEqual(this.idleStartUrl, animations.idleStartUrl);
            }
            return false;
        }

        public int hashCode() {
            return (((this.idleUrl.hashCode() * 31) + this.idleSextingUrl.hashCode()) * 31) + this.idleStartUrl.hashCode();
        }

        public String toString() {
            String str = this.idleUrl;
            String str2 = this.idleSextingUrl;
            String str3 = this.idleStartUrl;
            return "Animations(idleUrl=" + str + ", idleSextingUrl=" + str2 + ", idleStartUrl=" + str3 + ")";
        }

        public Animations(String idleUrl, String idleSextingUrl, String idleStartUrl) {
            Intrinsics.checkNotNullParameter(idleUrl, "idleUrl");
            Intrinsics.checkNotNullParameter(idleSextingUrl, "idleSextingUrl");
            Intrinsics.checkNotNullParameter(idleStartUrl, "idleStartUrl");
            this.idleUrl = idleUrl;
            this.idleSextingUrl = idleSextingUrl;
            this.idleStartUrl = idleStartUrl;
        }

        public final String getIdleUrl() {
            return this.idleUrl;
        }

        public final String getIdleSextingUrl() {
            return this.idleSextingUrl;
        }

        public final String getIdleStartUrl() {
            return this.idleStartUrl;
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Profile;", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "interests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "(Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;Lcom/ifriend/domain/models/profile/bot/Personality;Ljava/util/List;)V", "getBirthday", "()Lcom/ifriend/domain/models/profile/Birthday;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getInterests", "()Ljava/util/List;", "getPersonality", "()Lcom/ifriend/domain/models/profile/bot/Personality;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Profile {
        private final Birthday birthday;
        private final Gender gender;
        private final List<ChatInterestsType> interests;
        private final Personality personality;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Profile copy$default(Profile profile, Gender gender, Birthday birthday, Personality personality, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                gender = profile.gender;
            }
            if ((i & 2) != 0) {
                birthday = profile.birthday;
            }
            if ((i & 4) != 0) {
                personality = profile.personality;
            }
            if ((i & 8) != 0) {
                list = profile.interests;
            }
            return profile.copy(gender, birthday, personality, list);
        }

        public final Gender component1() {
            return this.gender;
        }

        public final Birthday component2() {
            return this.birthday;
        }

        public final Personality component3() {
            return this.personality;
        }

        public final List<ChatInterestsType> component4() {
            return this.interests;
        }

        public final Profile copy(Gender gender, Birthday birthday, Personality personality, List<? extends ChatInterestsType> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            return new Profile(gender, birthday, personality, interests);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Profile) {
                Profile profile = (Profile) obj;
                return this.gender == profile.gender && Intrinsics.areEqual(this.birthday, profile.birthday) && this.personality == profile.personality && Intrinsics.areEqual(this.interests, profile.interests);
            }
            return false;
        }

        public int hashCode() {
            Gender gender = this.gender;
            int hashCode = (gender == null ? 0 : gender.hashCode()) * 31;
            Birthday birthday = this.birthday;
            int hashCode2 = (hashCode + (birthday == null ? 0 : birthday.hashCode())) * 31;
            Personality personality = this.personality;
            return ((hashCode2 + (personality != null ? personality.hashCode() : 0)) * 31) + this.interests.hashCode();
        }

        public String toString() {
            Gender gender = this.gender;
            Birthday birthday = this.birthday;
            Personality personality = this.personality;
            List<ChatInterestsType> list = this.interests;
            return "Profile(gender=" + gender + ", birthday=" + birthday + ", personality=" + personality + ", interests=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Profile(Gender gender, Birthday birthday, Personality personality, List<? extends ChatInterestsType> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            this.gender = gender;
            this.birthday = birthday;
            this.personality = personality;
            this.interests = interests;
        }

        public final Gender getGender() {
            return this.gender;
        }

        public final Birthday getBirthday() {
            return this.birthday;
        }

        public final Personality getPersonality() {
            return this.personality;
        }

        public final List<ChatInterestsType> getInterests() {
            return this.interests;
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Promote;", "", "isPromote", "", LogFactory.PRIORITY_KEY, "", "(ZI)V", "()Z", "getPriority", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Promote {
        private final boolean isPromote;
        private final int priority;

        public static /* synthetic */ Promote copy$default(Promote promote, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = promote.isPromote;
            }
            if ((i2 & 2) != 0) {
                i = promote.priority;
            }
            return promote.copy(z, i);
        }

        public final boolean component1() {
            return this.isPromote;
        }

        public final int component2() {
            return this.priority;
        }

        public final Promote copy(boolean z, int i) {
            return new Promote(z, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Promote) {
                Promote promote = (Promote) obj;
                return this.isPromote == promote.isPromote && this.priority == promote.priority;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isPromote;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.priority;
        }

        public String toString() {
            boolean z = this.isPromote;
            int i = this.priority;
            return "Promote(isPromote=" + z + ", priority=" + i + ")";
        }

        public Promote(boolean z, int i) {
            this.isPromote = z;
            this.priority = i;
        }

        public final boolean isPromote() {
            return this.isPromote;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Descriptions;", "", "profileDescription", "", "precondition", "status", "postconditionTitle", "postconditionDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPostconditionDescription", "()Ljava/lang/String;", "getPostconditionTitle", "getPrecondition", "getProfileDescription", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Descriptions {
        private final String postconditionDescription;
        private final String postconditionTitle;
        private final String precondition;
        private final String profileDescription;
        private final String status;

        public static /* synthetic */ Descriptions copy$default(Descriptions descriptions, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = descriptions.profileDescription;
            }
            if ((i & 2) != 0) {
                str2 = descriptions.precondition;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = descriptions.status;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = descriptions.postconditionTitle;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = descriptions.postconditionDescription;
            }
            return descriptions.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.profileDescription;
        }

        public final String component2() {
            return this.precondition;
        }

        public final String component3() {
            return this.status;
        }

        public final String component4() {
            return this.postconditionTitle;
        }

        public final String component5() {
            return this.postconditionDescription;
        }

        public final Descriptions copy(String profileDescription, String precondition, String status, String postconditionTitle, String postconditionDescription) {
            Intrinsics.checkNotNullParameter(profileDescription, "profileDescription");
            Intrinsics.checkNotNullParameter(precondition, "precondition");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(postconditionTitle, "postconditionTitle");
            Intrinsics.checkNotNullParameter(postconditionDescription, "postconditionDescription");
            return new Descriptions(profileDescription, precondition, status, postconditionTitle, postconditionDescription);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Descriptions) {
                Descriptions descriptions = (Descriptions) obj;
                return Intrinsics.areEqual(this.profileDescription, descriptions.profileDescription) && Intrinsics.areEqual(this.precondition, descriptions.precondition) && Intrinsics.areEqual(this.status, descriptions.status) && Intrinsics.areEqual(this.postconditionTitle, descriptions.postconditionTitle) && Intrinsics.areEqual(this.postconditionDescription, descriptions.postconditionDescription);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.profileDescription.hashCode() * 31) + this.precondition.hashCode()) * 31) + this.status.hashCode()) * 31) + this.postconditionTitle.hashCode()) * 31) + this.postconditionDescription.hashCode();
        }

        public String toString() {
            String str = this.profileDescription;
            String str2 = this.precondition;
            String str3 = this.status;
            String str4 = this.postconditionTitle;
            String str5 = this.postconditionDescription;
            return "Descriptions(profileDescription=" + str + ", precondition=" + str2 + ", status=" + str3 + ", postconditionTitle=" + str4 + ", postconditionDescription=" + str5 + ")";
        }

        public Descriptions(String profileDescription, String precondition, String status, String postconditionTitle, String postconditionDescription) {
            Intrinsics.checkNotNullParameter(profileDescription, "profileDescription");
            Intrinsics.checkNotNullParameter(precondition, "precondition");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(postconditionTitle, "postconditionTitle");
            Intrinsics.checkNotNullParameter(postconditionDescription, "postconditionDescription");
            this.profileDescription = profileDescription;
            this.precondition = precondition;
            this.status = status;
            this.postconditionTitle = postconditionTitle;
            this.postconditionDescription = postconditionDescription;
        }

        public final String getProfileDescription() {
            return this.profileDescription;
        }

        public final String getPrecondition() {
            return this.precondition;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getPostconditionTitle() {
            return this.postconditionTitle;
        }

        public final String getPostconditionDescription() {
            return this.postconditionDescription;
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;", "", "style", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo$Style;", "badges", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadges;", "(Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo$Style;Ljava/util/List;)V", "getBadges", "()Ljava/util/List;", "getStyle", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo$Style;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Style", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionInfo {
        private final List<SubscriptionBadges> badges;
        private final Style style;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubscriptionInfo copy$default(SubscriptionInfo subscriptionInfo, Style style, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                style = subscriptionInfo.style;
            }
            if ((i & 2) != 0) {
                list = subscriptionInfo.badges;
            }
            return subscriptionInfo.copy(style, list);
        }

        public final Style component1() {
            return this.style;
        }

        public final List<SubscriptionBadges> component2() {
            return this.badges;
        }

        public final SubscriptionInfo copy(Style style, List<SubscriptionBadges> badges) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            return new SubscriptionInfo(style, badges);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionInfo) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
                return Intrinsics.areEqual(this.style, subscriptionInfo.style) && Intrinsics.areEqual(this.badges, subscriptionInfo.badges);
            }
            return false;
        }

        public int hashCode() {
            Style style = this.style;
            return ((style == null ? 0 : style.hashCode()) * 31) + this.badges.hashCode();
        }

        public String toString() {
            Style style = this.style;
            List<SubscriptionBadges> list = this.badges;
            return "SubscriptionInfo(style=" + style + ", badges=" + list + ")";
        }

        public SubscriptionInfo(Style style, List<SubscriptionBadges> badges) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.style = style;
            this.badges = badges;
        }

        public /* synthetic */ SubscriptionInfo(Style style, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : style, list);
        }

        public final Style getStyle() {
            return this.style;
        }

        public final List<SubscriptionBadges> getBadges() {
            return this.badges;
        }

        /* compiled from: ChatConfig.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo$Style;", "", "hexBackgroundGradient", "", "(Ljava/lang/String;)V", "getHexBackgroundGradient", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Style {
            private final String hexBackgroundGradient;

            public static /* synthetic */ Style copy$default(Style style, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = style.hexBackgroundGradient;
                }
                return style.copy(str);
            }

            public final String component1() {
                return this.hexBackgroundGradient;
            }

            public final Style copy(String hexBackgroundGradient) {
                Intrinsics.checkNotNullParameter(hexBackgroundGradient, "hexBackgroundGradient");
                return new Style(hexBackgroundGradient);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Style) && Intrinsics.areEqual(this.hexBackgroundGradient, ((Style) obj).hexBackgroundGradient);
            }

            public int hashCode() {
                return this.hexBackgroundGradient.hashCode();
            }

            public String toString() {
                String str = this.hexBackgroundGradient;
                return "Style(hexBackgroundGradient=" + str + ")";
            }

            public Style(String hexBackgroundGradient) {
                Intrinsics.checkNotNullParameter(hexBackgroundGradient, "hexBackgroundGradient");
                this.hexBackgroundGradient = hexBackgroundGradient;
            }

            public final String getHexBackgroundGradient() {
                return this.hexBackgroundGradient;
            }
        }
    }

    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadges;", "", "title", "", "subscriptionMonths", "", "type", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;", "(Ljava/lang/String;ILcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;)V", "getSubscriptionMonths", "()I", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionBadges {
        private final int subscriptionMonths;
        private final String title;
        private final SubscriptionBadgeStyle type;

        public static /* synthetic */ SubscriptionBadges copy$default(SubscriptionBadges subscriptionBadges, String str, int i, SubscriptionBadgeStyle subscriptionBadgeStyle, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = subscriptionBadges.title;
            }
            if ((i2 & 2) != 0) {
                i = subscriptionBadges.subscriptionMonths;
            }
            if ((i2 & 4) != 0) {
                subscriptionBadgeStyle = subscriptionBadges.type;
            }
            return subscriptionBadges.copy(str, i, subscriptionBadgeStyle);
        }

        public final String component1() {
            return this.title;
        }

        public final int component2() {
            return this.subscriptionMonths;
        }

        public final SubscriptionBadgeStyle component3() {
            return this.type;
        }

        public final SubscriptionBadges copy(String title, int i, SubscriptionBadgeStyle type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            return new SubscriptionBadges(title, i, type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionBadges) {
                SubscriptionBadges subscriptionBadges = (SubscriptionBadges) obj;
                return Intrinsics.areEqual(this.title, subscriptionBadges.title) && this.subscriptionMonths == subscriptionBadges.subscriptionMonths && this.type == subscriptionBadges.type;
            }
            return false;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subscriptionMonths) * 31) + this.type.hashCode();
        }

        public String toString() {
            String str = this.title;
            int i = this.subscriptionMonths;
            SubscriptionBadgeStyle subscriptionBadgeStyle = this.type;
            return "SubscriptionBadges(title=" + str + ", subscriptionMonths=" + i + ", type=" + subscriptionBadgeStyle + ")";
        }

        public SubscriptionBadges(String title, int i, SubscriptionBadgeStyle type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.subscriptionMonths = i;
            this.type = type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getSubscriptionMonths() {
            return this.subscriptionMonths;
        }

        public final SubscriptionBadgeStyle getType() {
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;", "", "(Ljava/lang/String;I)V", "PURPLE", "ORANGE", "GREEN", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionBadgeStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubscriptionBadgeStyle[] $VALUES;
        public static final Companion Companion;
        public static final SubscriptionBadgeStyle PURPLE = new SubscriptionBadgeStyle("PURPLE", 0);
        public static final SubscriptionBadgeStyle ORANGE = new SubscriptionBadgeStyle("ORANGE", 1);
        public static final SubscriptionBadgeStyle GREEN = new SubscriptionBadgeStyle("GREEN", 2);

        private static final /* synthetic */ SubscriptionBadgeStyle[] $values() {
            return new SubscriptionBadgeStyle[]{PURPLE, ORANGE, GREEN};
        }

        public static EnumEntries<SubscriptionBadgeStyle> getEntries() {
            return $ENTRIES;
        }

        public static SubscriptionBadgeStyle valueOf(String str) {
            return (SubscriptionBadgeStyle) Enum.valueOf(SubscriptionBadgeStyle.class, str);
        }

        public static SubscriptionBadgeStyle[] values() {
            return (SubscriptionBadgeStyle[]) $VALUES.clone();
        }

        private SubscriptionBadgeStyle(String str, int i) {
        }

        static {
            SubscriptionBadgeStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
        }

        /* compiled from: ChatConfig.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle$Companion;", "", "()V", "from", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;", "type", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SubscriptionBadgeStyle from(String type) {
                Object obj;
                Intrinsics.checkNotNullParameter(type, "type");
                Iterator<E> it = SubscriptionBadgeStyle.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String upperCase = ((SubscriptionBadgeStyle) obj).name().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = type.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(upperCase, upperCase2)) {
                        break;
                    }
                }
                SubscriptionBadgeStyle subscriptionBadgeStyle = (SubscriptionBadgeStyle) obj;
                return subscriptionBadgeStyle == null ? SubscriptionBadgeStyle.PURPLE : subscriptionBadgeStyle;
            }
        }
    }
}
