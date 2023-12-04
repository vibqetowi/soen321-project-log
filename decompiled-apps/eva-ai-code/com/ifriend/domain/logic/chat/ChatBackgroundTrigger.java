package com.ifriend.domain.logic.chat;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatBackgroundUseCase.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;", "", "videoName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVideoName", "()Ljava/lang/String;", "IDLE", "SEXTING", "DIARY", "ENTERING_PRODUCT", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackgroundTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatBackgroundTrigger[] $VALUES;
    private final String videoName;
    public static final ChatBackgroundTrigger IDLE = new ChatBackgroundTrigger("IDLE", 0, "idle");
    public static final ChatBackgroundTrigger SEXTING = new ChatBackgroundTrigger("SEXTING", 1, "idle_sexting");
    public static final ChatBackgroundTrigger DIARY = new ChatBackgroundTrigger("DIARY", 2, "idle_sexting");
    public static final ChatBackgroundTrigger ENTERING_PRODUCT = new ChatBackgroundTrigger("ENTERING_PRODUCT", 3, "idle_start");

    private static final /* synthetic */ ChatBackgroundTrigger[] $values() {
        return new ChatBackgroundTrigger[]{IDLE, SEXTING, DIARY, ENTERING_PRODUCT};
    }

    public static EnumEntries<ChatBackgroundTrigger> getEntries() {
        return $ENTRIES;
    }

    public static ChatBackgroundTrigger valueOf(String str) {
        return (ChatBackgroundTrigger) Enum.valueOf(ChatBackgroundTrigger.class, str);
    }

    public static ChatBackgroundTrigger[] values() {
        return (ChatBackgroundTrigger[]) $VALUES.clone();
    }

    private ChatBackgroundTrigger(String str, int i, String str2) {
        this.videoName = str2;
    }

    public final String getVideoName() {
        return this.videoName;
    }

    static {
        ChatBackgroundTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
