package com.ifriend.data.repository.chat.messages.contenttypes;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatMessageType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/contenttypes/ChatMessageType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "GIFT_RESPONSE", "CALL", "UNKNOWN", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatMessageType[] $VALUES;
    public static final Companion Companion;
    private final String type;
    public static final ChatMessageType GIFT_RESPONSE = new ChatMessageType("GIFT_RESPONSE", 0, "gift-response");
    public static final ChatMessageType CALL = new ChatMessageType("CALL", 1, "aiCall");
    public static final ChatMessageType UNKNOWN = new ChatMessageType("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ ChatMessageType[] $values() {
        return new ChatMessageType[]{GIFT_RESPONSE, CALL, UNKNOWN};
    }

    public static EnumEntries<ChatMessageType> getEntries() {
        return $ENTRIES;
    }

    public static ChatMessageType valueOf(String str) {
        return (ChatMessageType) Enum.valueOf(ChatMessageType.class, str);
    }

    public static ChatMessageType[] values() {
        return (ChatMessageType[]) $VALUES.clone();
    }

    private ChatMessageType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ChatMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: ChatMessageType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/contenttypes/ChatMessageType$Companion;", "", "()V", "from", "Lcom/ifriend/data/repository/chat/messages/contenttypes/ChatMessageType;", "type", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatMessageType from(String type) {
            Object obj;
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it = ChatMessageType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((ChatMessageType) obj).getType(), type)) {
                    break;
                }
            }
            ChatMessageType chatMessageType = (ChatMessageType) obj;
            return chatMessageType == null ? ChatMessageType.UNKNOWN : chatMessageType;
        }
    }
}
