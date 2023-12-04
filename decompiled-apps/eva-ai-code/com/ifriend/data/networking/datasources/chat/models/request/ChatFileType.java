package com.ifriend.data.networking.datasources.chat.models.request;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplyFileRequestRemoteParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/request/ChatFileType;", "", "(Ljava/lang/String;I)V", ShareConstants.IMAGE_URL, "AUDIO", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFileType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatFileType[] $VALUES;
    public static final ChatFileType IMAGE = new ChatFileType(ShareConstants.IMAGE_URL, 0);
    public static final ChatFileType AUDIO = new ChatFileType("AUDIO", 1);

    private static final /* synthetic */ ChatFileType[] $values() {
        return new ChatFileType[]{IMAGE, AUDIO};
    }

    public static EnumEntries<ChatFileType> getEntries() {
        return $ENTRIES;
    }

    public static ChatFileType valueOf(String str) {
        return (ChatFileType) Enum.valueOf(ChatFileType.class, str);
    }

    public static ChatFileType[] values() {
        return (ChatFileType[]) $VALUES.clone();
    }

    private ChatFileType(String str, int i) {
    }

    static {
        ChatFileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
