package com.ifriend.chat.data.chat.sending;

import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/ChatMessagesContentType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", ShareConstants.IMAGE_URL, "AUDIO", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessagesContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatMessagesContentType[] $VALUES;
    private final String type;
    public static final ChatMessagesContentType IMAGE = new ChatMessagesContentType(ShareConstants.IMAGE_URL, 0, "image/png");
    public static final ChatMessagesContentType AUDIO = new ChatMessagesContentType("AUDIO", 1, MimeTypes.AUDIO_MP4);

    private static final /* synthetic */ ChatMessagesContentType[] $values() {
        return new ChatMessagesContentType[]{IMAGE, AUDIO};
    }

    public static EnumEntries<ChatMessagesContentType> getEntries() {
        return $ENTRIES;
    }

    public static ChatMessagesContentType valueOf(String str) {
        return (ChatMessagesContentType) Enum.valueOf(ChatMessagesContentType.class, str);
    }

    public static ChatMessagesContentType[] values() {
        return (ChatMessagesContentType[]) $VALUES.clone();
    }

    private ChatMessagesContentType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ChatMessagesContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
