package com.ifriend.domain.logic.chat.models;

import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfoTag;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "VERIFIED_ACCOUNT", "NEW", "UNKNOWN", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInfoTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatInfoTag[] $VALUES;
    public static final Companion Companion;
    private final String key;
    public static final ChatInfoTag VERIFIED_ACCOUNT = new ChatInfoTag("VERIFIED_ACCOUNT", 0, "verified");
    public static final ChatInfoTag NEW = new ChatInfoTag("NEW", 1, "new");
    public static final ChatInfoTag UNKNOWN = new ChatInfoTag("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ ChatInfoTag[] $values() {
        return new ChatInfoTag[]{VERIFIED_ACCOUNT, NEW, UNKNOWN};
    }

    public static EnumEntries<ChatInfoTag> getEntries() {
        return $ENTRIES;
    }

    public static ChatInfoTag valueOf(String str) {
        return (ChatInfoTag) Enum.valueOf(ChatInfoTag.class, str);
    }

    public static ChatInfoTag[] values() {
        return (ChatInfoTag[]) $VALUES.clone();
    }

    private ChatInfoTag(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        ChatInfoTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfoTag$Companion;", "", "()V", "from", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTag;", "type", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatInfoTag from(String type) {
            Object obj;
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it = ChatInfoTag.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String upperCase = ((ChatInfoTag) obj).getKey().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = type.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    break;
                }
            }
            ChatInfoTag chatInfoTag = (ChatInfoTag) obj;
            return chatInfoTag == null ? ChatInfoTag.UNKNOWN : chatInfoTag;
        }
    }
}
