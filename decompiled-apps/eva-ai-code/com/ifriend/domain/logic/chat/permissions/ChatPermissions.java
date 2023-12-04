package com.ifriend.domain.logic.chat.permissions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckChatPermissionsUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/logic/chat/permissions/ChatPermissions;", "", "(Ljava/lang/String;I)V", "GIFTS", "CHAT_VIDEO_BACKGROUND", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPermissions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatPermissions[] $VALUES;
    public static final ChatPermissions GIFTS = new ChatPermissions("GIFTS", 0);
    public static final ChatPermissions CHAT_VIDEO_BACKGROUND = new ChatPermissions("CHAT_VIDEO_BACKGROUND", 1);

    private static final /* synthetic */ ChatPermissions[] $values() {
        return new ChatPermissions[]{GIFTS, CHAT_VIDEO_BACKGROUND};
    }

    public static EnumEntries<ChatPermissions> getEntries() {
        return $ENTRIES;
    }

    public static ChatPermissions valueOf(String str) {
        return (ChatPermissions) Enum.valueOf(ChatPermissions.class, str);
    }

    public static ChatPermissions[] values() {
        return (ChatPermissions[]) $VALUES.clone();
    }

    private ChatPermissions(String str, int i) {
    }

    static {
        ChatPermissions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
