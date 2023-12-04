package com.ifriend.data.socket;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SocketMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/data/socket/SocketMessageType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TAGS_ADDED", "TAGS_REMOVED", "AVATARS_GENERATED", "AVATAR_ANIMATION_GENERATED", "CHAT_MESSAGE", "CHAT_MESSAGE_REMOVED", "CHAT_MESSAGE_UPDATED", "CHAT_CALL_MESSAGE", "CHAT_SUBSCRIPTION_AVAILABLE", "CHAT_SUBSCRIPTION_UNAVAILABLE", "LULLABY_AVAILABILITY_CHANGED", "REGENERATE_ANSWER_FAILED", "NEURONS_CHANGED", "UPGRADED_ACCOUNT", "DAILY_NEURONS_RECEIVED", "NEURONS_PURCHASED", "BOT_CHANGED", "ADD_DIARY_NOTES", "LEVEL_UPDATED", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketMessageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SocketMessageType[] $VALUES;
    private final String key;
    public static final SocketMessageType TAGS_ADDED = new SocketMessageType("TAGS_ADDED", 0, "event.users.tags.set");
    public static final SocketMessageType TAGS_REMOVED = new SocketMessageType("TAGS_REMOVED", 1, "event.users.tags.unset");
    public static final SocketMessageType AVATARS_GENERATED = new SocketMessageType("AVATARS_GENERATED", 2, "event.ai.avatars.generated.v2");
    public static final SocketMessageType AVATAR_ANIMATION_GENERATED = new SocketMessageType("AVATAR_ANIMATION_GENERATED", 3, "event.ai.avatars.animate.completed");
    public static final SocketMessageType CHAT_MESSAGE = new SocketMessageType("CHAT_MESSAGE", 4, "message:message:v2");
    public static final SocketMessageType CHAT_MESSAGE_REMOVED = new SocketMessageType("CHAT_MESSAGE_REMOVED", 5, "event.dialogs.messages.message.removed");
    public static final SocketMessageType CHAT_MESSAGE_UPDATED = new SocketMessageType("CHAT_MESSAGE_UPDATED", 6, "event.dialogs.messages.message.updated");
    public static final SocketMessageType CHAT_CALL_MESSAGE = new SocketMessageType("CHAT_CALL_MESSAGE", 7, "event.ai.calls.bot.message.added");
    public static final SocketMessageType CHAT_SUBSCRIPTION_AVAILABLE = new SocketMessageType("CHAT_SUBSCRIPTION_AVAILABLE", 8, "event.ai.chats.bot.available.became");
    public static final SocketMessageType CHAT_SUBSCRIPTION_UNAVAILABLE = new SocketMessageType("CHAT_SUBSCRIPTION_UNAVAILABLE", 9, "event.ai.chats.bot.unavailable.became");
    public static final SocketMessageType LULLABY_AVAILABILITY_CHANGED = new SocketMessageType("LULLABY_AVAILABILITY_CHANGED", 10, "event.ai.topics.manager.lullaby.topic.availability.changed");
    public static final SocketMessageType REGENERATE_ANSWER_FAILED = new SocketMessageType("REGENERATE_ANSWER_FAILED", 11, "event.automation.regenerate.answer.failed");
    public static final SocketMessageType NEURONS_CHANGED = new SocketMessageType("NEURONS_CHANGED", 12, "account:credits");
    public static final SocketMessageType UPGRADED_ACCOUNT = new SocketMessageType("UPGRADED_ACCOUNT", 13, "tariffication.invites.changed");
    public static final SocketMessageType DAILY_NEURONS_RECEIVED = new SocketMessageType("DAILY_NEURONS_RECEIVED", 14, "dailycoins.received");
    public static final SocketMessageType NEURONS_PURCHASED = new SocketMessageType("NEURONS_PURCHASED", 15, "event.credits.mall.exchanged");
    public static final SocketMessageType BOT_CHANGED = new SocketMessageType("BOT_CHANGED", 16, "event.objects.users.preferences.updated");
    public static final SocketMessageType ADD_DIARY_NOTES = new SocketMessageType("ADD_DIARY_NOTES", 17, "event.users.diary.notes.add");
    public static final SocketMessageType LEVEL_UPDATED = new SocketMessageType("LEVEL_UPDATED", 18, "event.users.experience.updated..ai");

    private static final /* synthetic */ SocketMessageType[] $values() {
        return new SocketMessageType[]{TAGS_ADDED, TAGS_REMOVED, AVATARS_GENERATED, AVATAR_ANIMATION_GENERATED, CHAT_MESSAGE, CHAT_MESSAGE_REMOVED, CHAT_MESSAGE_UPDATED, CHAT_CALL_MESSAGE, CHAT_SUBSCRIPTION_AVAILABLE, CHAT_SUBSCRIPTION_UNAVAILABLE, LULLABY_AVAILABILITY_CHANGED, REGENERATE_ANSWER_FAILED, NEURONS_CHANGED, UPGRADED_ACCOUNT, DAILY_NEURONS_RECEIVED, NEURONS_PURCHASED, BOT_CHANGED, ADD_DIARY_NOTES, LEVEL_UPDATED};
    }

    public static EnumEntries<SocketMessageType> getEntries() {
        return $ENTRIES;
    }

    public static SocketMessageType valueOf(String str) {
        return (SocketMessageType) Enum.valueOf(SocketMessageType.class, str);
    }

    public static SocketMessageType[] values() {
        return (SocketMessageType[]) $VALUES.clone();
    }

    private SocketMessageType(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        SocketMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
