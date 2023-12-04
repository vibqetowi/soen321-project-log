package com.ifriend.domain.logic.chat.models;

import com.google.android.gms.stats.CodePackage;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MAIN", "INFLUENCER", CodePackage.COMMON, "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatType[] $VALUES;
    public static final Companion Companion;
    private final String type;
    public static final ChatType MAIN = new ChatType("MAIN", 0, "main");
    public static final ChatType INFLUENCER = new ChatType("INFLUENCER", 1, "influencer");
    public static final ChatType COMMON = new ChatType(CodePackage.COMMON, 2, "common");

    private static final /* synthetic */ ChatType[] $values() {
        return new ChatType[]{MAIN, INFLUENCER, COMMON};
    }

    public static EnumEntries<ChatType> getEntries() {
        return $ENTRIES;
    }

    public static ChatType valueOf(String str) {
        return (ChatType) Enum.valueOf(ChatType.class, str);
    }

    public static ChatType[] values() {
        return (ChatType[]) $VALUES.clone();
    }

    private ChatType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ChatType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatType$Companion;", "", "()V", "from", "Lcom/ifriend/domain/logic/chat/models/ChatType;", "type", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatType from(String type) {
            Object obj;
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it = ChatType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String upperCase = ((ChatType) obj).getType().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = type.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    break;
                }
            }
            ChatType chatType = (ChatType) obj;
            return chatType == null ? ChatType.COMMON : chatType;
        }
    }
}
