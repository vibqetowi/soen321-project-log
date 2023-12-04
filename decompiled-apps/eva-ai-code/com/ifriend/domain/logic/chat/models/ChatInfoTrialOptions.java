package com.ifriend.domain.logic.chat.models;

import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions;", "", "type", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType;", "value", "", "(Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType;Ljava/lang/String;)V", "getType", "()Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TrialOptionType", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInfoTrialOptions {
    private final TrialOptionType type;
    private final String value;

    public static /* synthetic */ ChatInfoTrialOptions copy$default(ChatInfoTrialOptions chatInfoTrialOptions, TrialOptionType trialOptionType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            trialOptionType = chatInfoTrialOptions.type;
        }
        if ((i & 2) != 0) {
            str = chatInfoTrialOptions.value;
        }
        return chatInfoTrialOptions.copy(trialOptionType, str);
    }

    public final TrialOptionType component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final ChatInfoTrialOptions copy(TrialOptionType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ChatInfoTrialOptions(type, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInfoTrialOptions) {
            ChatInfoTrialOptions chatInfoTrialOptions = (ChatInfoTrialOptions) obj;
            return this.type == chatInfoTrialOptions.type && Intrinsics.areEqual(this.value, chatInfoTrialOptions.value);
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        TrialOptionType trialOptionType = this.type;
        String str = this.value;
        return "ChatInfoTrialOptions(type=" + trialOptionType + ", value=" + str + ")";
    }

    public ChatInfoTrialOptions(TrialOptionType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type;
        this.value = value;
    }

    public final TrialOptionType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MESSAGES", "UNKNOWN", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TrialOptionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TrialOptionType[] $VALUES;
        public static final Companion Companion;
        public static final TrialOptionType MESSAGES = new TrialOptionType("MESSAGES", 0, "messages");
        public static final TrialOptionType UNKNOWN = new TrialOptionType("UNKNOWN", 1, "unknown");
        private final String type;

        private static final /* synthetic */ TrialOptionType[] $values() {
            return new TrialOptionType[]{MESSAGES, UNKNOWN};
        }

        public static EnumEntries<TrialOptionType> getEntries() {
            return $ENTRIES;
        }

        public static TrialOptionType valueOf(String str) {
            return (TrialOptionType) Enum.valueOf(TrialOptionType.class, str);
        }

        public static TrialOptionType[] values() {
            return (TrialOptionType[]) $VALUES.clone();
        }

        private TrialOptionType(String str, int i, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            TrialOptionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
        }

        /* compiled from: ChatInfo.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType$Companion;", "", "()V", "from", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions$TrialOptionType;", "type", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TrialOptionType from(String type) {
                Object obj;
                Intrinsics.checkNotNullParameter(type, "type");
                Iterator<E> it = TrialOptionType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String upperCase = ((TrialOptionType) obj).getType().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = type.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(upperCase, upperCase2)) {
                        break;
                    }
                }
                TrialOptionType trialOptionType = (TrialOptionType) obj;
                return trialOptionType == null ? TrialOptionType.UNKNOWN : trialOptionType;
            }
        }
    }
}
