package com.ifriend.analytics.usecase.screenshot;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsScreenshot.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\u0081\u0002\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006="}, d2 = {"Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenName;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CHAT", "BOT_PROFILE", "SCREENS_AFTER_ONBOARDING", "PHOTO_USER", "PHOTO_BOT", "CHANGE_BOT_GENERATE_AVATAR", "CHOOSE_AVATAR_IMAGE", "CHANGE_BOT_VOICE", "CHANGE_BOT_NAME", "CHANGE_BOT_AGE", "CHANGE_BOT_GENDER", "CHANGE_BOT_PERSONALITY", "CHANGE_BOT_ETHNICITY", "CHANGE_BOT_RESET", "HAMBURGER_MENU", "CHATS_LIST", "DELETE_ACCOUNT", "CHANGE_USER_NAME", "CHANGE_USER_AGE", "CHANGE_USER_GENDER", "MY_PROFILE", "DAIRY", "CHAT_STORE", "OTHER", "WATCH_AI_PHOTO_NEURONS", "WATCH_AI_DREAM_NEURONS", "SEXTING_NEURONS", "LISTEN_AUDIO_AI_NEURONS", "MENU_NEURONS", "CHAT_NEURONS", "GIFTS_NEURONS", "CHAT_LIST", "CHAT_LIST_DIGITAL_COPY_SUBSCRIPTION", "RESET_CHAT_NEURONS", "CHANGE_VOICE_NEURONS", "PLAY_VOICE_NEURONS", "GENERATE_AVATAR_NEURONS", "DIARY_NEURONS", "WATCH_AI_PHOTO_SUBSCRIPTION", "WATCH_AI_DREAM_SUBSCRIPTION", "SEXTING_SUBSCRIPTION", "LISTEN_AUDIO_AI_SUBSCRIPTION", "MENU_SUBSCRIPTION", "RESET_CHAT_SUBSCRIPTION", "CHANGE_VOICE_SUBSCRIPTION", "DIARY_SUBSCRIPTION", "PLAY_VOICE_SUBSCRIPTION", "GENERATE_AVATAR_SUBSCRIPTION", "CALL", "REGISTRATION_SCREEN", "ONBOARDING_SCREEN", "EMAIL_REGISTRATION_SCREEN", "RATE_APP_SCREEN", "Companion", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsScreenName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnalyticsScreenName[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final AnalyticsScreenName CHAT = new AnalyticsScreenName("CHAT", 0, "chat");
    public static final AnalyticsScreenName BOT_PROFILE = new AnalyticsScreenName("BOT_PROFILE", 1, "bot-profile");
    public static final AnalyticsScreenName SCREENS_AFTER_ONBOARDING = new AnalyticsScreenName("SCREENS_AFTER_ONBOARDING", 2, "screens-after-onboarding");
    public static final AnalyticsScreenName PHOTO_USER = new AnalyticsScreenName("PHOTO_USER", 3, "photo-user");
    public static final AnalyticsScreenName PHOTO_BOT = new AnalyticsScreenName("PHOTO_BOT", 4, "photo-bot");
    public static final AnalyticsScreenName CHANGE_BOT_GENERATE_AVATAR = new AnalyticsScreenName("CHANGE_BOT_GENERATE_AVATAR", 5, "change-bot-generate-avatar");
    public static final AnalyticsScreenName CHOOSE_AVATAR_IMAGE = new AnalyticsScreenName("CHOOSE_AVATAR_IMAGE", 6, "choose-avatar-image");
    public static final AnalyticsScreenName CHANGE_BOT_VOICE = new AnalyticsScreenName("CHANGE_BOT_VOICE", 7, "change-bot-voice");
    public static final AnalyticsScreenName CHANGE_BOT_NAME = new AnalyticsScreenName("CHANGE_BOT_NAME", 8, "change-bot-name");
    public static final AnalyticsScreenName CHANGE_BOT_AGE = new AnalyticsScreenName("CHANGE_BOT_AGE", 9, "change-bot-age");
    public static final AnalyticsScreenName CHANGE_BOT_GENDER = new AnalyticsScreenName("CHANGE_BOT_GENDER", 10, "change-bot-gender");
    public static final AnalyticsScreenName CHANGE_BOT_PERSONALITY = new AnalyticsScreenName("CHANGE_BOT_PERSONALITY", 11, "change-bot-personality");
    public static final AnalyticsScreenName CHANGE_BOT_ETHNICITY = new AnalyticsScreenName("CHANGE_BOT_ETHNICITY", 12, "change-bot-ethnicity");
    public static final AnalyticsScreenName CHANGE_BOT_RESET = new AnalyticsScreenName("CHANGE_BOT_RESET", 13, "change-bot-reset");
    public static final AnalyticsScreenName HAMBURGER_MENU = new AnalyticsScreenName("HAMBURGER_MENU", 14, "hamburger-menu");
    public static final AnalyticsScreenName CHATS_LIST = new AnalyticsScreenName("CHATS_LIST", 15, "chats-list");
    public static final AnalyticsScreenName DELETE_ACCOUNT = new AnalyticsScreenName("DELETE_ACCOUNT", 16, "delete-account");
    public static final AnalyticsScreenName CHANGE_USER_NAME = new AnalyticsScreenName("CHANGE_USER_NAME", 17, "change-user-name");
    public static final AnalyticsScreenName CHANGE_USER_AGE = new AnalyticsScreenName("CHANGE_USER_AGE", 18, "change-user-age");
    public static final AnalyticsScreenName CHANGE_USER_GENDER = new AnalyticsScreenName("CHANGE_USER_GENDER", 19, "change-user-gender");
    public static final AnalyticsScreenName MY_PROFILE = new AnalyticsScreenName("MY_PROFILE", 20, "my-profile");
    public static final AnalyticsScreenName DAIRY = new AnalyticsScreenName("DAIRY", 21, "diary");
    public static final AnalyticsScreenName CHAT_STORE = new AnalyticsScreenName("CHAT_STORE", 22, "chat_store");
    public static final AnalyticsScreenName OTHER = new AnalyticsScreenName("OTHER", 23, "other");
    public static final AnalyticsScreenName WATCH_AI_PHOTO_NEURONS = new AnalyticsScreenName("WATCH_AI_PHOTO_NEURONS", 24, "watch-ai-photo-neurons");
    public static final AnalyticsScreenName WATCH_AI_DREAM_NEURONS = new AnalyticsScreenName("WATCH_AI_DREAM_NEURONS", 25, "watch-ai-dream-neurons");
    public static final AnalyticsScreenName SEXTING_NEURONS = new AnalyticsScreenName("SEXTING_NEURONS", 26, "sexting-neurons");
    public static final AnalyticsScreenName LISTEN_AUDIO_AI_NEURONS = new AnalyticsScreenName("LISTEN_AUDIO_AI_NEURONS", 27, "listen-audio-ai-neurons");
    public static final AnalyticsScreenName MENU_NEURONS = new AnalyticsScreenName("MENU_NEURONS", 28, "menu-neurons");
    public static final AnalyticsScreenName CHAT_NEURONS = new AnalyticsScreenName("CHAT_NEURONS", 29, "chat-neurons");
    public static final AnalyticsScreenName GIFTS_NEURONS = new AnalyticsScreenName("GIFTS_NEURONS", 30, "gifts-neurons");
    public static final AnalyticsScreenName CHAT_LIST = new AnalyticsScreenName("CHAT_LIST", 31, "chatlist");
    public static final AnalyticsScreenName CHAT_LIST_DIGITAL_COPY_SUBSCRIPTION = new AnalyticsScreenName("CHAT_LIST_DIGITAL_COPY_SUBSCRIPTION", 32, "chatlist-digital-copy-subscription");
    public static final AnalyticsScreenName RESET_CHAT_NEURONS = new AnalyticsScreenName("RESET_CHAT_NEURONS", 33, "reset-chat-neurons");
    public static final AnalyticsScreenName CHANGE_VOICE_NEURONS = new AnalyticsScreenName("CHANGE_VOICE_NEURONS", 34, "change-voice-neurons");
    public static final AnalyticsScreenName PLAY_VOICE_NEURONS = new AnalyticsScreenName("PLAY_VOICE_NEURONS", 35, "play-voice-neurons");
    public static final AnalyticsScreenName GENERATE_AVATAR_NEURONS = new AnalyticsScreenName("GENERATE_AVATAR_NEURONS", 36, "generate-avatar-neurons");
    public static final AnalyticsScreenName DIARY_NEURONS = new AnalyticsScreenName("DIARY_NEURONS", 37, "diary-neurons");
    public static final AnalyticsScreenName WATCH_AI_PHOTO_SUBSCRIPTION = new AnalyticsScreenName("WATCH_AI_PHOTO_SUBSCRIPTION", 38, "watch-ai-photo-subscription");
    public static final AnalyticsScreenName WATCH_AI_DREAM_SUBSCRIPTION = new AnalyticsScreenName("WATCH_AI_DREAM_SUBSCRIPTION", 39, "watch-ai-dream-subscription");
    public static final AnalyticsScreenName SEXTING_SUBSCRIPTION = new AnalyticsScreenName("SEXTING_SUBSCRIPTION", 40, "sexting-subscription");
    public static final AnalyticsScreenName LISTEN_AUDIO_AI_SUBSCRIPTION = new AnalyticsScreenName("LISTEN_AUDIO_AI_SUBSCRIPTION", 41, "listen-audio-ai-subscription");
    public static final AnalyticsScreenName MENU_SUBSCRIPTION = new AnalyticsScreenName("MENU_SUBSCRIPTION", 42, "menu-subscription");
    public static final AnalyticsScreenName RESET_CHAT_SUBSCRIPTION = new AnalyticsScreenName("RESET_CHAT_SUBSCRIPTION", 43, "reset-chat-subscription");
    public static final AnalyticsScreenName CHANGE_VOICE_SUBSCRIPTION = new AnalyticsScreenName("CHANGE_VOICE_SUBSCRIPTION", 44, "change-voice-subscription");
    public static final AnalyticsScreenName DIARY_SUBSCRIPTION = new AnalyticsScreenName("DIARY_SUBSCRIPTION", 45, "diary-subscription");
    public static final AnalyticsScreenName PLAY_VOICE_SUBSCRIPTION = new AnalyticsScreenName("PLAY_VOICE_SUBSCRIPTION", 46, "play-voice-subscription");
    public static final AnalyticsScreenName GENERATE_AVATAR_SUBSCRIPTION = new AnalyticsScreenName("GENERATE_AVATAR_SUBSCRIPTION", 47, "generate-avatar-subscription");
    public static final AnalyticsScreenName CALL = new AnalyticsScreenName("CALL", 48, "chat-call");
    public static final AnalyticsScreenName REGISTRATION_SCREEN = new AnalyticsScreenName("REGISTRATION_SCREEN", 49, "registration-screen");
    public static final AnalyticsScreenName ONBOARDING_SCREEN = new AnalyticsScreenName("ONBOARDING_SCREEN", 50, "onboarding-screen");
    public static final AnalyticsScreenName EMAIL_REGISTRATION_SCREEN = new AnalyticsScreenName("EMAIL_REGISTRATION_SCREEN", 51, "email-registration-screen");
    public static final AnalyticsScreenName RATE_APP_SCREEN = new AnalyticsScreenName("RATE_APP_SCREEN", 52, "rate-app-screen");

    private static final /* synthetic */ AnalyticsScreenName[] $values() {
        return new AnalyticsScreenName[]{CHAT, BOT_PROFILE, SCREENS_AFTER_ONBOARDING, PHOTO_USER, PHOTO_BOT, CHANGE_BOT_GENERATE_AVATAR, CHOOSE_AVATAR_IMAGE, CHANGE_BOT_VOICE, CHANGE_BOT_NAME, CHANGE_BOT_AGE, CHANGE_BOT_GENDER, CHANGE_BOT_PERSONALITY, CHANGE_BOT_ETHNICITY, CHANGE_BOT_RESET, HAMBURGER_MENU, CHATS_LIST, DELETE_ACCOUNT, CHANGE_USER_NAME, CHANGE_USER_AGE, CHANGE_USER_GENDER, MY_PROFILE, DAIRY, CHAT_STORE, OTHER, WATCH_AI_PHOTO_NEURONS, WATCH_AI_DREAM_NEURONS, SEXTING_NEURONS, LISTEN_AUDIO_AI_NEURONS, MENU_NEURONS, CHAT_NEURONS, GIFTS_NEURONS, CHAT_LIST, CHAT_LIST_DIGITAL_COPY_SUBSCRIPTION, RESET_CHAT_NEURONS, CHANGE_VOICE_NEURONS, PLAY_VOICE_NEURONS, GENERATE_AVATAR_NEURONS, DIARY_NEURONS, WATCH_AI_PHOTO_SUBSCRIPTION, WATCH_AI_DREAM_SUBSCRIPTION, SEXTING_SUBSCRIPTION, LISTEN_AUDIO_AI_SUBSCRIPTION, MENU_SUBSCRIPTION, RESET_CHAT_SUBSCRIPTION, CHANGE_VOICE_SUBSCRIPTION, DIARY_SUBSCRIPTION, PLAY_VOICE_SUBSCRIPTION, GENERATE_AVATAR_SUBSCRIPTION, CALL, REGISTRATION_SCREEN, ONBOARDING_SCREEN, EMAIL_REGISTRATION_SCREEN, RATE_APP_SCREEN};
    }

    public static EnumEntries<AnalyticsScreenName> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsScreenName valueOf(String str) {
        return (AnalyticsScreenName) Enum.valueOf(AnalyticsScreenName.class, str);
    }

    public static AnalyticsScreenName[] values() {
        return (AnalyticsScreenName[]) $VALUES.clone();
    }

    private AnalyticsScreenName(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        AnalyticsScreenName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: AnalyticsScreenshot.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenName$Companion;", "", "()V", "findByTag", "Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenName;", "fragmentTag", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnalyticsScreenName findByTag(String str) {
            AnalyticsScreenName analyticsScreenName;
            AnalyticsScreenName[] values = AnalyticsScreenName.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    analyticsScreenName = null;
                    break;
                }
                analyticsScreenName = values[i];
                if (Intrinsics.areEqual(analyticsScreenName.getValue(), str)) {
                    break;
                }
                i++;
            }
            return analyticsScreenName == null ? AnalyticsScreenName.OTHER : analyticsScreenName;
        }
    }
}
