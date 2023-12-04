package com.ifriend.domain.newChat.chat.models;

import java.util.Date;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageTag.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageTag {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static /* synthetic */ MessageTag copy$default(MessageTag messageTag, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageTag.value;
        }
        return messageTag.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final MessageTag copy(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new MessageTag(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageTag) && Intrinsics.areEqual(this.value, ((MessageTag) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String str = this.value;
        return "MessageTag(value=" + str + ")";
    }

    public MessageTag(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: MessageTag.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageTag$Companion;", "", "()V", "createFrom", "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "userId", "", "createRandomTagSeed", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final long createRandomTagSeed() {
            return new Date().getTime() + new Random().nextInt(9000);
        }

        public final MessageTag createFrom(String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            long createRandomTagSeed = createRandomTagSeed();
            return new MessageTag(userId + "_" + createRandomTagSeed);
        }
    }
}
