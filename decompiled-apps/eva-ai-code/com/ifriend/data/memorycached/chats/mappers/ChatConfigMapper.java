package com.ifriend.data.memorycached.chats.mappers;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.data.mappers.GenderFromBackendString;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper;
import com.ifriend.data.networking.api.configuration.model.ChatConfigurationRemote;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Personality;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatConfigMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u0007\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper;", "", "personalityFromBackendValueMapper", "Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;", "genderFromBackendString", "Lcom/ifriend/data/mappers/GenderFromBackendString;", "(Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;Lcom/ifriend/data/mappers/GenderFromBackendString;)V", "map", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote;", "apiUrl", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$Animations;", "animations", "Lcom/ifriend/data/networking/api/configuration/model/ChatConfigurationRemote$Animations;", "mapSubscriptionInfo", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionInfo;", "SubscriptionMonths", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigMapper {
    private final GenderFromBackendString genderFromBackendString;
    private final PersonalityFromBackendValueMapper personalityFromBackendValueMapper;

    @Inject
    public ChatConfigMapper(PersonalityFromBackendValueMapper personalityFromBackendValueMapper, GenderFromBackendString genderFromBackendString) {
        Intrinsics.checkNotNullParameter(personalityFromBackendValueMapper, "personalityFromBackendValueMapper");
        Intrinsics.checkNotNullParameter(genderFromBackendString, "genderFromBackendString");
        this.personalityFromBackendValueMapper = personalityFromBackendValueMapper;
        this.genderFromBackendString = genderFromBackendString;
    }

    public final ChatConfig map(ChatConfigurationRemote model, String apiUrl) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        ChatConfigurationRemote.Promo promo = model.getPromo();
        ChatConfigurationRemote.Descriptions descriptions = model.getDescriptions();
        String uid = model.getUid();
        String str = uid == null ? "" : uid;
        String clientId = model.getClientId();
        String str2 = clientId == null ? "" : clientId;
        String name = model.getName();
        String str3 = name == null ? "" : name;
        String profileDescription = descriptions != null ? descriptions.getProfileDescription() : null;
        String str4 = profileDescription == null ? "" : profileDescription;
        String precondition = descriptions != null ? descriptions.getPrecondition() : null;
        String str5 = precondition == null ? "" : precondition;
        String status = descriptions != null ? descriptions.getStatus() : null;
        String str6 = status == null ? "" : status;
        String postconditionTitle = descriptions != null ? descriptions.getPostconditionTitle() : null;
        String str7 = postconditionTitle == null ? "" : postconditionTitle;
        String postconditionDescription = descriptions != null ? descriptions.getPostconditionDescription() : null;
        ChatConfig.Descriptions descriptions2 = new ChatConfig.Descriptions(str4, str5, str6, str7, postconditionDescription == null ? "" : postconditionDescription);
        Integer order = model.getOrder();
        ChatConfig.Promote promote = new ChatConfig.Promote(promo != null, ommonKt.orZero(promo != null ? promo.getPriority() : null));
        Boolean defaultSelectedBot = model.getDefaultSelectedBot();
        boolean booleanValue = defaultSelectedBot != null ? defaultSelectedBot.booleanValue() : false;
        ChatConfigurationRemote.Images images = model.getImages();
        String chatAvatarPath = images != null ? images.getChatAvatarPath() : null;
        if (chatAvatarPath == null) {
            chatAvatarPath = "";
        }
        String str8 = apiUrl + chatAvatarPath;
        ChatConfigurationRemote.Images images2 = model.getImages();
        String avatarPath = images2 != null ? images2.getAvatarPath() : null;
        if (avatarPath == null) {
            avatarPath = "";
        }
        String str9 = apiUrl + avatarPath;
        ChatConfigurationRemote.Images images3 = model.getImages();
        String chatBackgroundPath = images3 != null ? images3.getChatBackgroundPath() : null;
        if (chatBackgroundPath == null) {
            chatBackgroundPath = "";
        }
        String str10 = apiUrl + chatBackgroundPath;
        ChatConfigurationRemote.Images images4 = model.getImages();
        String postconditionBackgroundPath = images4 != null ? images4.getPostconditionBackgroundPath() : null;
        ChatConfig.Images images5 = new ChatConfig.Images(str9, str10, str8, apiUrl + (postconditionBackgroundPath != null ? postconditionBackgroundPath : ""));
        ChatConfig.Animations map = map(model.getAnimations(), apiUrl);
        String chatType = model.getChatType();
        if (chatType == null) {
            chatType = "common";
        }
        String str11 = chatType;
        GenderFromBackendString genderFromBackendString = this.genderFromBackendString;
        ChatConfigurationRemote.Profile profile = model.getProfile();
        Gender map2 = genderFromBackendString.map(profile != null ? profile.getGender() : null);
        PersonalityFromBackendValueMapper personalityFromBackendValueMapper = this.personalityFromBackendValueMapper;
        ChatConfigurationRemote.Profile profile2 = model.getProfile();
        Personality map3 = personalityFromBackendValueMapper.map(profile2 != null ? profile2.getPersonality() : null);
        Birthday.Companion companion = Birthday.Companion;
        ChatConfigurationRemote.Profile profile3 = model.getProfile();
        Birthday fromDatetime = companion.fromDatetime(profile3 != null ? profile3.getBirthday() : null);
        ChatConfigurationRemote.Profile profile4 = model.getProfile();
        List<String> interests = profile4 != null ? profile4.getInterests() : null;
        if (interests == null) {
            interests = CollectionsKt.emptyList();
        }
        ChatInterestsType.Companion companion2 = ChatInterestsType.Companion;
        ArrayList arrayList = new ArrayList();
        for (String str12 : interests) {
            ChatInterestsType from = companion2.from(str12);
            if (from != null) {
                arrayList.add(from);
            }
        }
        ChatConfig.Profile profile5 = new ChatConfig.Profile(map2, fromDatetime, map3, arrayList);
        List<String> tags = model.getTags();
        if (tags == null) {
            tags = CollectionsKt.emptyList();
        }
        return new ChatConfig(str, str2, str3, descriptions2, order, promote, images5, map, booleanValue, str11, profile5, tags, mapSubscriptionInfo(model));
    }

    private final ChatConfig.Animations map(ChatConfigurationRemote.Animations animations, String str) {
        String idlePath = animations != null ? animations.getIdlePath() : null;
        if (idlePath == null) {
            idlePath = "";
        }
        String idleSextingPath = animations != null ? animations.getIdleSextingPath() : null;
        if (idleSextingPath == null) {
            idleSextingPath = "";
        }
        String idleStartPath = animations != null ? animations.getIdleStartPath() : null;
        String str2 = idleStartPath != null ? idleStartPath : "";
        if (idlePath.length() > 0) {
            idlePath = str + idlePath;
        }
        if (idleSextingPath.length() > 0) {
            idleSextingPath = str + idleSextingPath;
        }
        if (str2.length() > 0) {
            str2 = str + str2;
        }
        return new ChatConfig.Animations(idlePath, idleSextingPath, str2);
    }

    private final ChatConfig.SubscriptionInfo mapSubscriptionInfo(ChatConfigurationRemote chatConfigurationRemote) {
        String str;
        ChatConfigurationRemote.ChatSubscriptionInfo subscriptionInfo = chatConfigurationRemote.getSubscriptionInfo();
        ChatConfigurationRemote.ChatSubscriptionInfo.Style style = subscriptionInfo != null ? subscriptionInfo.getStyle() : null;
        List<ChatConfigurationRemote.SubscriptionBadges> badges = subscriptionInfo != null ? subscriptionInfo.getBadges() : null;
        if (badges == null) {
            badges = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : badges) {
            ChatConfigurationRemote.SubscriptionBadges subscriptionBadges = (ChatConfigurationRemote.SubscriptionBadges) obj;
            if ((subscriptionBadges.getTitle() == null || subscriptionBadges.getDuration() == null) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            ChatConfigurationRemote.SubscriptionBadges subscriptionBadges2 = (ChatConfigurationRemote.SubscriptionBadges) it.next();
            String duration = subscriptionBadges2.getDuration();
            if (duration == null) {
                duration = "";
            }
            String title = subscriptionBadges2.getTitle();
            if (title == null) {
                title = "";
            }
            ChatConfig.SubscriptionBadgeStyle.Companion companion = ChatConfig.SubscriptionBadgeStyle.Companion;
            String type = subscriptionBadges2.getType();
            if (type != null) {
                str = type;
            }
            arrayList3.add(new ChatConfig.SubscriptionBadges(title, SubscriptionMonths.Companion.from(duration).getCount(), companion.from(str)));
        }
        ArrayList arrayList4 = arrayList3;
        String gradient = style != null ? style.getGradient() : null;
        return new ChatConfig.SubscriptionInfo(new ChatConfig.SubscriptionInfo.Style(gradient != null ? gradient : ""), arrayList4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatConfigMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper$SubscriptionMonths;", "", "key", "", "count", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getCount", "()I", "getKey", "()Ljava/lang/String;", "EMPTY", "M", "M3", "M12", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionMonths {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubscriptionMonths[] $VALUES;
        public static final Companion Companion;
        private final int count;
        private final String key;
        public static final SubscriptionMonths EMPTY = new SubscriptionMonths("EMPTY", 0, "", 0);
        public static final SubscriptionMonths M = new SubscriptionMonths("M", 1, "1m", 1);
        public static final SubscriptionMonths M3 = new SubscriptionMonths("M3", 2, "3m", 3);
        public static final SubscriptionMonths M12 = new SubscriptionMonths("M12", 3, "12m", 12);

        private static final /* synthetic */ SubscriptionMonths[] $values() {
            return new SubscriptionMonths[]{EMPTY, M, M3, M12};
        }

        public static EnumEntries<SubscriptionMonths> getEntries() {
            return $ENTRIES;
        }

        public static SubscriptionMonths valueOf(String str) {
            return (SubscriptionMonths) Enum.valueOf(SubscriptionMonths.class, str);
        }

        public static SubscriptionMonths[] values() {
            return (SubscriptionMonths[]) $VALUES.clone();
        }

        private SubscriptionMonths(String str, int i, String str2, int i2) {
            this.key = str2;
            this.count = i2;
        }

        public final int getCount() {
            return this.count;
        }

        public final String getKey() {
            return this.key;
        }

        static {
            SubscriptionMonths[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
        }

        /* compiled from: ChatConfigMapper.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper$SubscriptionMonths$Companion;", "", "()V", "from", "Lcom/ifriend/data/memorycached/chats/mappers/ChatConfigMapper$SubscriptionMonths;", TypedValues.CycleType.S_WAVE_PERIOD, "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SubscriptionMonths from(String period) {
                Object obj;
                Intrinsics.checkNotNullParameter(period, "period");
                Iterator<E> it = SubscriptionMonths.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String upperCase = ((SubscriptionMonths) obj).getKey().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = period.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(upperCase, upperCase2)) {
                        break;
                    }
                }
                SubscriptionMonths subscriptionMonths = (SubscriptionMonths) obj;
                return subscriptionMonths == null ? SubscriptionMonths.EMPTY : subscriptionMonths;
            }
        }
    }
}
