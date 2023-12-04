package com.ifriend.domain.logic.experiments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureToggleKey.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "GENERATE_AI_PHOTOS", "MESSAGE_REGENERATION", "CHAT_CALL_FEATURE", "REGISTRATION_NEURONS_BONUS", "DAILY_NEURONS_BONUS", "CONFIRM_EMAIL_PROMOTE_ENABLED", "CONFIRM_EMAIL_BONUS_NEURONS", "DIARY_ENABLED", "TOPICS_ENABLED", "PREMIUM_TOPICS_ENABLED", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureToggleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeatureToggleKey[] $VALUES;
    private final String key;
    public static final FeatureToggleKey GENERATE_AI_PHOTOS = new FeatureToggleKey("GENERATE_AI_PHOTOS", 0, "generate_ai_photos_enabled");
    public static final FeatureToggleKey MESSAGE_REGENERATION = new FeatureToggleKey("MESSAGE_REGENERATION", 1, "message_regeneration");
    public static final FeatureToggleKey CHAT_CALL_FEATURE = new FeatureToggleKey("CHAT_CALL_FEATURE", 2, "ai_audio_call_enabled");
    public static final FeatureToggleKey REGISTRATION_NEURONS_BONUS = new FeatureToggleKey("REGISTRATION_NEURONS_BONUS", 3, "registration_neurons_bonus");
    public static final FeatureToggleKey DAILY_NEURONS_BONUS = new FeatureToggleKey("DAILY_NEURONS_BONUS", 4, "daily_neurons_bonus");
    public static final FeatureToggleKey CONFIRM_EMAIL_PROMOTE_ENABLED = new FeatureToggleKey("CONFIRM_EMAIL_PROMOTE_ENABLED", 5, "confirm_email_promote_enabled");
    public static final FeatureToggleKey CONFIRM_EMAIL_BONUS_NEURONS = new FeatureToggleKey("CONFIRM_EMAIL_BONUS_NEURONS", 6, "confirm_email_bonus_neurons");
    public static final FeatureToggleKey DIARY_ENABLED = new FeatureToggleKey("DIARY_ENABLED", 7, "diary_enabled");
    public static final FeatureToggleKey TOPICS_ENABLED = new FeatureToggleKey("TOPICS_ENABLED", 8, "topics_enabled");
    public static final FeatureToggleKey PREMIUM_TOPICS_ENABLED = new FeatureToggleKey("PREMIUM_TOPICS_ENABLED", 9, "ai_lullaby_enabled");

    private static final /* synthetic */ FeatureToggleKey[] $values() {
        return new FeatureToggleKey[]{GENERATE_AI_PHOTOS, MESSAGE_REGENERATION, CHAT_CALL_FEATURE, REGISTRATION_NEURONS_BONUS, DAILY_NEURONS_BONUS, CONFIRM_EMAIL_PROMOTE_ENABLED, CONFIRM_EMAIL_BONUS_NEURONS, DIARY_ENABLED, TOPICS_ENABLED, PREMIUM_TOPICS_ENABLED};
    }

    public static EnumEntries<FeatureToggleKey> getEntries() {
        return $ENTRIES;
    }

    public static FeatureToggleKey valueOf(String str) {
        return (FeatureToggleKey) Enum.valueOf(FeatureToggleKey.class, str);
    }

    public static FeatureToggleKey[] values() {
        return (FeatureToggleKey[]) $VALUES.clone();
    }

    private FeatureToggleKey(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        FeatureToggleKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
