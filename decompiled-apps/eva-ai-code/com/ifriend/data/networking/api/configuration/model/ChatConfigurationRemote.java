package com.ifriend.data.networking.api.configuration.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.ifriend.domain.config.ConfigKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.logging.LogFactory;
/* compiled from: ChatConfigurationRemote.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001:\u0007IJKLMNOB\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000fHÆ\u0003J¼\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\bHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001e¨\u0006P"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote;", "", "uid", "", "serverId", ConfigKeys.CLIENT_ID, "name", "order", "", Scopes.PROFILE, "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Profile;", "defaultSelectedBot", "", "chatType", "images", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Images;", "animations", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;", NotificationCompat.CATEGORY_PROMO, "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;", "tags", "", "descriptions", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Descriptions;", "subscriptionInfo", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Profile;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Images;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;Ljava/util/List;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Descriptions;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo;)V", "getAnimations", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;", "getChatType", "()Ljava/lang/String;", "getClientId", "getDefaultSelectedBot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescriptions", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Descriptions;", "getImages", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Images;", "getName", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProfile", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Profile;", "getPromo", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;", "getServerId", "getSubscriptionInfo", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo;", "getTags", "()Ljava/util/List;", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Profile;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Images;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;Ljava/util/List;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Descriptions;Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo;)Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote;", "equals", "other", "hashCode", "toString", "Animations", "ChatSubscriptionInfo", "Descriptions", "Images", "Profile", "Promo", "SubscriptionBadges", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigurationRemote {
    @SerializedName("animations")
    private final Animations animations;
    @SerializedName("accountType")
    private final String chatType;
    @SerializedName(ConfigKeys.CLIENT_ID)
    private final String clientId;
    @SerializedName("defaultSelectedBot")
    private final Boolean defaultSelectedBot;
    @SerializedName("descriptions")
    private final Descriptions descriptions;
    @SerializedName("images")
    private final Images images;
    @SerializedName("name")
    private final String name;
    @SerializedName("order")
    private final Integer order;
    @SerializedName(Scopes.PROFILE)
    private final Profile profile;
    @SerializedName(NotificationCompat.CATEGORY_PROMO)
    private final Promo promo;
    @SerializedName("serverId")
    private final String serverId;
    @SerializedName("subscriptionView")
    private final ChatSubscriptionInfo subscriptionInfo;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName("uid")
    private final String uid;

    public final String component1() {
        return this.uid;
    }

    public final Animations component10() {
        return this.animations;
    }

    public final Promo component11() {
        return this.promo;
    }

    public final List<String> component12() {
        return this.tags;
    }

    public final Descriptions component13() {
        return this.descriptions;
    }

    public final ChatSubscriptionInfo component14() {
        return this.subscriptionInfo;
    }

    public final String component2() {
        return this.serverId;
    }

    public final String component3() {
        return this.clientId;
    }

    public final String component4() {
        return this.name;
    }

    public final Integer component5() {
        return this.order;
    }

    public final Profile component6() {
        return this.profile;
    }

    public final Boolean component7() {
        return this.defaultSelectedBot;
    }

    public final String component8() {
        return this.chatType;
    }

    public final Images component9() {
        return this.images;
    }

    public final ChatConfigurationRemote copy(String str, String str2, String str3, String str4, Integer num, Profile profile, Boolean bool, String str5, Images images, Animations animations, Promo promo, List<String> list, Descriptions descriptions, ChatSubscriptionInfo chatSubscriptionInfo) {
        return new ChatConfigurationRemote(str, str2, str3, str4, num, profile, bool, str5, images, animations, promo, list, descriptions, chatSubscriptionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatConfigurationRemote) {
            ChatConfigurationRemote chatConfigurationRemote = (ChatConfigurationRemote) obj;
            return Intrinsics.areEqual(this.uid, chatConfigurationRemote.uid) && Intrinsics.areEqual(this.serverId, chatConfigurationRemote.serverId) && Intrinsics.areEqual(this.clientId, chatConfigurationRemote.clientId) && Intrinsics.areEqual(this.name, chatConfigurationRemote.name) && Intrinsics.areEqual(this.order, chatConfigurationRemote.order) && Intrinsics.areEqual(this.profile, chatConfigurationRemote.profile) && Intrinsics.areEqual(this.defaultSelectedBot, chatConfigurationRemote.defaultSelectedBot) && Intrinsics.areEqual(this.chatType, chatConfigurationRemote.chatType) && Intrinsics.areEqual(this.images, chatConfigurationRemote.images) && Intrinsics.areEqual(this.animations, chatConfigurationRemote.animations) && Intrinsics.areEqual(this.promo, chatConfigurationRemote.promo) && Intrinsics.areEqual(this.tags, chatConfigurationRemote.tags) && Intrinsics.areEqual(this.descriptions, chatConfigurationRemote.descriptions) && Intrinsics.areEqual(this.subscriptionInfo, chatConfigurationRemote.subscriptionInfo);
        }
        return false;
    }

    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.order;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Profile profile = this.profile;
        int hashCode6 = (hashCode5 + (profile == null ? 0 : profile.hashCode())) * 31;
        Boolean bool = this.defaultSelectedBot;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.chatType;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Images images = this.images;
        int hashCode9 = (hashCode8 + (images == null ? 0 : images.hashCode())) * 31;
        Animations animations = this.animations;
        int hashCode10 = (hashCode9 + (animations == null ? 0 : animations.hashCode())) * 31;
        Promo promo = this.promo;
        int hashCode11 = (hashCode10 + (promo == null ? 0 : promo.hashCode())) * 31;
        List<String> list = this.tags;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Descriptions descriptions = this.descriptions;
        int hashCode13 = (hashCode12 + (descriptions == null ? 0 : descriptions.hashCode())) * 31;
        ChatSubscriptionInfo chatSubscriptionInfo = this.subscriptionInfo;
        return hashCode13 + (chatSubscriptionInfo != null ? chatSubscriptionInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.serverId;
        String str3 = this.clientId;
        String str4 = this.name;
        Integer num = this.order;
        Profile profile = this.profile;
        Boolean bool = this.defaultSelectedBot;
        String str5 = this.chatType;
        Images images = this.images;
        Animations animations = this.animations;
        Promo promo = this.promo;
        List<String> list = this.tags;
        Descriptions descriptions = this.descriptions;
        ChatSubscriptionInfo chatSubscriptionInfo = this.subscriptionInfo;
        return "ChatConfigurationRemote(uid=" + str + ", serverId=" + str2 + ", clientId=" + str3 + ", name=" + str4 + ", order=" + num + ", profile=" + profile + ", defaultSelectedBot=" + bool + ", chatType=" + str5 + ", images=" + images + ", animations=" + animations + ", promo=" + promo + ", tags=" + list + ", descriptions=" + descriptions + ", subscriptionInfo=" + chatSubscriptionInfo + ")";
    }

    public ChatConfigurationRemote(String str, String str2, String str3, String str4, Integer num, Profile profile, Boolean bool, String str5, Images images, Animations animations, Promo promo, List<String> list, Descriptions descriptions, ChatSubscriptionInfo chatSubscriptionInfo) {
        this.uid = str;
        this.serverId = str2;
        this.clientId = str3;
        this.name = str4;
        this.order = num;
        this.profile = profile;
        this.defaultSelectedBot = bool;
        this.chatType = str5;
        this.images = images;
        this.animations = animations;
        this.promo = promo;
        this.tags = list;
        this.descriptions = descriptions;
        this.subscriptionInfo = chatSubscriptionInfo;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getServerId() {
        return this.serverId;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final Boolean getDefaultSelectedBot() {
        return this.defaultSelectedBot;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Animations getAnimations() {
        return this.animations;
    }

    public final Promo getPromo() {
        return this.promo;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final Descriptions getDescriptions() {
        return this.descriptions;
    }

    public final ChatSubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Descriptions;", "", "profileDescription", "", "precondition", "status", "postconditionTitle", "postconditionDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPostconditionDescription", "()Ljava/lang/String;", "getPostconditionTitle", "getPrecondition", "getProfileDescription", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Descriptions {
        @SerializedName("postconditionDescription")
        private final String postconditionDescription;
        @SerializedName("postconditionTitle")
        private final String postconditionTitle;
        @SerializedName("precondition")
        private final String precondition;
        @SerializedName(Scopes.PROFILE)
        private final String profileDescription;
        @SerializedName("status")
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

        public final Descriptions copy(String str, String str2, String str3, String str4, String str5) {
            return new Descriptions(str, str2, str3, str4, str5);
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
            String str = this.profileDescription;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.precondition;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.status;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.postconditionTitle;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postconditionDescription;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.profileDescription;
            String str2 = this.precondition;
            String str3 = this.status;
            String str4 = this.postconditionTitle;
            String str5 = this.postconditionDescription;
            return "Descriptions(profileDescription=" + str + ", precondition=" + str2 + ", status=" + str3 + ", postconditionTitle=" + str4 + ", postconditionDescription=" + str5 + ")";
        }

        public Descriptions(String str, String str2, String str3, String str4, String str5) {
            this.profileDescription = str;
            this.precondition = str2;
            this.status = str3;
            this.postconditionTitle = str4;
            this.postconditionDescription = str5;
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

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Profile;", "", "birthday", "", HintConstants.AUTOFILL_HINT_GENDER, "personality", "interests", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBirthday", "()Ljava/lang/String;", "getGender", "getInterests", "()Ljava/util/List;", "getPersonality", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Profile {
        @SerializedName("birthday")
        private final String birthday;
        @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
        private final String gender;
        @SerializedName("interests")
        private final List<String> interests;
        @SerializedName("personality")
        private final String personality;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profile.birthday;
            }
            if ((i & 2) != 0) {
                str2 = profile.gender;
            }
            if ((i & 4) != 0) {
                str3 = profile.personality;
            }
            if ((i & 8) != 0) {
                list = profile.interests;
            }
            return profile.copy(str, str2, str3, list);
        }

        public final String component1() {
            return this.birthday;
        }

        public final String component2() {
            return this.gender;
        }

        public final String component3() {
            return this.personality;
        }

        public final List<String> component4() {
            return this.interests;
        }

        public final Profile copy(String str, String str2, String str3, List<String> list) {
            return new Profile(str, str2, str3, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Profile) {
                Profile profile = (Profile) obj;
                return Intrinsics.areEqual(this.birthday, profile.birthday) && Intrinsics.areEqual(this.gender, profile.gender) && Intrinsics.areEqual(this.personality, profile.personality) && Intrinsics.areEqual(this.interests, profile.interests);
            }
            return false;
        }

        public int hashCode() {
            String str = this.birthday;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gender;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.personality;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.interests;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.birthday;
            String str2 = this.gender;
            String str3 = this.personality;
            List<String> list = this.interests;
            return "Profile(birthday=" + str + ", gender=" + str2 + ", personality=" + str3 + ", interests=" + list + ")";
        }

        public Profile(String str, String str2, String str3, List<String> list) {
            this.birthday = str;
            this.gender = str2;
            this.personality = str3;
            this.interests = list;
        }

        public final String getBirthday() {
            return this.birthday;
        }

        public final String getGender() {
            return this.gender;
        }

        public final String getPersonality() {
            return this.personality;
        }

        public final List<String> getInterests() {
            return this.interests;
        }
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Images;", "", "avatarPath", "", "chatAvatarPath", "chatBackgroundPath", "postconditionBackgroundPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarPath", "()Ljava/lang/String;", "getChatAvatarPath", "getChatBackgroundPath", "getPostconditionBackgroundPath", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Images {
        @SerializedName("avatarPath")
        private final String avatarPath;
        @SerializedName("chatAvatarPath")
        private final String chatAvatarPath;
        @SerializedName("chatBackgroundPath")
        private final String chatBackgroundPath;
        @SerializedName("postconditionBackgroundPath")
        private final String postconditionBackgroundPath;

        public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = images.avatarPath;
            }
            if ((i & 2) != 0) {
                str2 = images.chatAvatarPath;
            }
            if ((i & 4) != 0) {
                str3 = images.chatBackgroundPath;
            }
            if ((i & 8) != 0) {
                str4 = images.postconditionBackgroundPath;
            }
            return images.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.avatarPath;
        }

        public final String component2() {
            return this.chatAvatarPath;
        }

        public final String component3() {
            return this.chatBackgroundPath;
        }

        public final String component4() {
            return this.postconditionBackgroundPath;
        }

        public final Images copy(String str, String str2, String str3, String str4) {
            return new Images(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Images) {
                Images images = (Images) obj;
                return Intrinsics.areEqual(this.avatarPath, images.avatarPath) && Intrinsics.areEqual(this.chatAvatarPath, images.chatAvatarPath) && Intrinsics.areEqual(this.chatBackgroundPath, images.chatBackgroundPath) && Intrinsics.areEqual(this.postconditionBackgroundPath, images.postconditionBackgroundPath);
            }
            return false;
        }

        public int hashCode() {
            String str = this.avatarPath;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.chatAvatarPath;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.chatBackgroundPath;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.postconditionBackgroundPath;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.avatarPath;
            String str2 = this.chatAvatarPath;
            String str3 = this.chatBackgroundPath;
            String str4 = this.postconditionBackgroundPath;
            return "Images(avatarPath=" + str + ", chatAvatarPath=" + str2 + ", chatBackgroundPath=" + str3 + ", postconditionBackgroundPath=" + str4 + ")";
        }

        public Images(String str, String str2, String str3, String str4) {
            this.avatarPath = str;
            this.chatAvatarPath = str2;
            this.chatBackgroundPath = str3;
            this.postconditionBackgroundPath = str4;
        }

        public final String getAvatarPath() {
            return this.avatarPath;
        }

        public final String getChatAvatarPath() {
            return this.chatAvatarPath;
        }

        public final String getChatBackgroundPath() {
            return this.chatBackgroundPath;
        }

        public final String getPostconditionBackgroundPath() {
            return this.postconditionBackgroundPath;
        }
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;", "", "idlePath", "", "idleSextingPath", "idleStartPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdlePath", "()Ljava/lang/String;", "getIdleSextingPath", "getIdleStartPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Animations {
        @SerializedName("idlePath")
        private final String idlePath;
        @SerializedName("idleSextingPath")
        private final String idleSextingPath;
        @SerializedName("idleStartPath")
        private final String idleStartPath;

        public static /* synthetic */ Animations copy$default(Animations animations, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = animations.idlePath;
            }
            if ((i & 2) != 0) {
                str2 = animations.idleSextingPath;
            }
            if ((i & 4) != 0) {
                str3 = animations.idleStartPath;
            }
            return animations.copy(str, str2, str3);
        }

        public final String component1() {
            return this.idlePath;
        }

        public final String component2() {
            return this.idleSextingPath;
        }

        public final String component3() {
            return this.idleStartPath;
        }

        public final Animations copy(String str, String str2, String str3) {
            return new Animations(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Animations) {
                Animations animations = (Animations) obj;
                return Intrinsics.areEqual(this.idlePath, animations.idlePath) && Intrinsics.areEqual(this.idleSextingPath, animations.idleSextingPath) && Intrinsics.areEqual(this.idleStartPath, animations.idleStartPath);
            }
            return false;
        }

        public int hashCode() {
            String str = this.idlePath;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.idleSextingPath;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.idleStartPath;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.idlePath;
            String str2 = this.idleSextingPath;
            String str3 = this.idleStartPath;
            return "Animations(idlePath=" + str + ", idleSextingPath=" + str2 + ", idleStartPath=" + str3 + ")";
        }

        public Animations(String str, String str2, String str3) {
            this.idlePath = str;
            this.idleSextingPath = str2;
            this.idleStartPath = str3;
        }

        public final String getIdlePath() {
            return this.idlePath;
        }

        public final String getIdleSextingPath() {
            return this.idleSextingPath;
        }

        public final String getIdleStartPath() {
            return this.idleStartPath;
        }
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;", "", LogFactory.PRIORITY_KEY, "", "(Ljava/lang/Integer;)V", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Promo;", "equals", "", "other", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Promo {
        @SerializedName(LogFactory.PRIORITY_KEY)
        private final Integer priority;

        public static /* synthetic */ Promo copy$default(Promo promo, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = promo.priority;
            }
            return promo.copy(num);
        }

        public final Integer component1() {
            return this.priority;
        }

        public final Promo copy(Integer num) {
            return new Promo(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Promo) && Intrinsics.areEqual(this.priority, ((Promo) obj).priority);
        }

        public int hashCode() {
            Integer num = this.priority;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            Integer num = this.priority;
            return "Promo(priority=" + num + ")";
        }

        public Promo(Integer num) {
            this.priority = num;
        }

        public final Integer getPriority() {
            return this.priority;
        }
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo;", "", "style", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo$Style;", "badges", "", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$SubscriptionBadges;", "(Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo$Style;Ljava/util/List;)V", "getBadges", "()Ljava/util/List;", "getStyle", "()Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo$Style;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Style", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatSubscriptionInfo {
        @SerializedName("badges")
        private final List<SubscriptionBadges> badges;
        @SerializedName("style")
        private final Style style;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChatSubscriptionInfo copy$default(ChatSubscriptionInfo chatSubscriptionInfo, Style style, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                style = chatSubscriptionInfo.style;
            }
            if ((i & 2) != 0) {
                list = chatSubscriptionInfo.badges;
            }
            return chatSubscriptionInfo.copy(style, list);
        }

        public final Style component1() {
            return this.style;
        }

        public final List<SubscriptionBadges> component2() {
            return this.badges;
        }

        public final ChatSubscriptionInfo copy(Style style, List<SubscriptionBadges> list) {
            Intrinsics.checkNotNullParameter(style, "style");
            return new ChatSubscriptionInfo(style, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatSubscriptionInfo) {
                ChatSubscriptionInfo chatSubscriptionInfo = (ChatSubscriptionInfo) obj;
                return Intrinsics.areEqual(this.style, chatSubscriptionInfo.style) && Intrinsics.areEqual(this.badges, chatSubscriptionInfo.badges);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.style.hashCode() * 31;
            List<SubscriptionBadges> list = this.badges;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            Style style = this.style;
            List<SubscriptionBadges> list = this.badges;
            return "ChatSubscriptionInfo(style=" + style + ", badges=" + list + ")";
        }

        public ChatSubscriptionInfo(Style style, List<SubscriptionBadges> list) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.style = style;
            this.badges = list;
        }

        public final Style getStyle() {
            return this.style;
        }

        public final List<SubscriptionBadges> getBadges() {
            return this.badges;
        }

        /* compiled from: ChatConfigurationRemote.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$ChatSubscriptionInfo$Style;", "", "gradient", "", "(Ljava/lang/String;)V", "getGradient", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Style {
            @SerializedName("gradient")
            private final String gradient;

            public Style() {
                this(null, 1, null);
            }

            public static /* synthetic */ Style copy$default(Style style, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = style.gradient;
                }
                return style.copy(str);
            }

            public final String component1() {
                return this.gradient;
            }

            public final Style copy(String str) {
                return new Style(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Style) && Intrinsics.areEqual(this.gradient, ((Style) obj).gradient);
            }

            public int hashCode() {
                String str = this.gradient;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.gradient;
                return "Style(gradient=" + str + ")";
            }

            public Style(String str) {
                this.gradient = str;
            }

            public /* synthetic */ Style(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getGradient() {
                return this.gradient;
            }
        }
    }

    /* compiled from: ChatConfigurationRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$SubscriptionBadges;", "", "duration", "", "title", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionBadges {
        @SerializedName("duration")
        private final String duration;
        @SerializedName("title")
        private final String title;
        @SerializedName("type")
        private final String type;

        public SubscriptionBadges() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ SubscriptionBadges copy$default(SubscriptionBadges subscriptionBadges, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionBadges.duration;
            }
            if ((i & 2) != 0) {
                str2 = subscriptionBadges.title;
            }
            if ((i & 4) != 0) {
                str3 = subscriptionBadges.type;
            }
            return subscriptionBadges.copy(str, str2, str3);
        }

        public final String component1() {
            return this.duration;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.type;
        }

        public final SubscriptionBadges copy(String str, String str2, String str3) {
            return new SubscriptionBadges(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionBadges) {
                SubscriptionBadges subscriptionBadges = (SubscriptionBadges) obj;
                return Intrinsics.areEqual(this.duration, subscriptionBadges.duration) && Intrinsics.areEqual(this.title, subscriptionBadges.title) && Intrinsics.areEqual(this.type, subscriptionBadges.type);
            }
            return false;
        }

        public int hashCode() {
            String str = this.duration;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.duration;
            String str2 = this.title;
            String str3 = this.type;
            return "SubscriptionBadges(duration=" + str + ", title=" + str2 + ", type=" + str3 + ")";
        }

        public SubscriptionBadges(String str, String str2, String str3) {
            this.duration = str;
            this.title = str2;
            this.type = str3;
        }

        public /* synthetic */ SubscriptionBadges(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getDuration() {
            return this.duration;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }
    }
}
