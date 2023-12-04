package com.ifriend.domain.newChat.chat.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.domain.models.Tags;
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
/* compiled from: MessageInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "FREE", "SUBSCRIPTION", "SUBSCRIPTION_CHAT", "SUBSCRIPTION_THEN_PURCHASE", "SUBSCRIPTION_CHAT_THEN_PURCHASE", ViewHierarchyConstants.PURCHASE, "UNKNOWN", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageAccessType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatMessageAccessType[] $VALUES;
    public static final Companion Companion;
    private final String type;
    public static final ChatMessageAccessType FREE = new ChatMessageAccessType("FREE", 0, "free");
    public static final ChatMessageAccessType SUBSCRIPTION = new ChatMessageAccessType("SUBSCRIPTION", 1, Tags.SUBSCRIPTION);
    public static final ChatMessageAccessType SUBSCRIPTION_CHAT = new ChatMessageAccessType("SUBSCRIPTION_CHAT", 2, "subscription-bot");
    public static final ChatMessageAccessType SUBSCRIPTION_THEN_PURCHASE = new ChatMessageAccessType("SUBSCRIPTION_THEN_PURCHASE", 3, "subscription_then_purchase");
    public static final ChatMessageAccessType SUBSCRIPTION_CHAT_THEN_PURCHASE = new ChatMessageAccessType("SUBSCRIPTION_CHAT_THEN_PURCHASE", 4, "subscription-bot_then_purchase");
    public static final ChatMessageAccessType PURCHASE = new ChatMessageAccessType(ViewHierarchyConstants.PURCHASE, 5, "purchase");
    public static final ChatMessageAccessType UNKNOWN = new ChatMessageAccessType("UNKNOWN", 6, "unknown");

    private static final /* synthetic */ ChatMessageAccessType[] $values() {
        return new ChatMessageAccessType[]{FREE, SUBSCRIPTION, SUBSCRIPTION_CHAT, SUBSCRIPTION_THEN_PURCHASE, SUBSCRIPTION_CHAT_THEN_PURCHASE, PURCHASE, UNKNOWN};
    }

    public static EnumEntries<ChatMessageAccessType> getEntries() {
        return $ENTRIES;
    }

    public static ChatMessageAccessType valueOf(String str) {
        return (ChatMessageAccessType) Enum.valueOf(ChatMessageAccessType.class, str);
    }

    public static ChatMessageAccessType[] values() {
        return (ChatMessageAccessType[]) $VALUES.clone();
    }

    private ChatMessageAccessType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ChatMessageAccessType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: MessageInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType$Companion;", "", "()V", "from", "Lcom/ifriend/domain/newChat/chat/models/ChatMessageAccessType;", "type", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatMessageAccessType from(String type) {
            Object obj;
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it = ChatMessageAccessType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String upperCase = ((ChatMessageAccessType) obj).getType().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = type.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    break;
                }
            }
            ChatMessageAccessType chatMessageAccessType = (ChatMessageAccessType) obj;
            return chatMessageAccessType == null ? ChatMessageAccessType.UNKNOWN : chatMessageAccessType;
        }
    }
}
