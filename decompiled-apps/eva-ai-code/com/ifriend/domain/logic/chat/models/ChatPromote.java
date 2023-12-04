package com.ifriend.domain.logic.chat.models;

import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPromote;", "", "isPromote", "", LogFactory.PRIORITY_KEY, "", "(ZI)V", "()Z", "getPriority", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPromote {
    private final boolean isPromote;
    private final int priority;

    public static /* synthetic */ ChatPromote copy$default(ChatPromote chatPromote, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = chatPromote.isPromote;
        }
        if ((i2 & 2) != 0) {
            i = chatPromote.priority;
        }
        return chatPromote.copy(z, i);
    }

    public final boolean component1() {
        return this.isPromote;
    }

    public final int component2() {
        return this.priority;
    }

    public final ChatPromote copy(boolean z, int i) {
        return new ChatPromote(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPromote) {
            ChatPromote chatPromote = (ChatPromote) obj;
            return this.isPromote == chatPromote.isPromote && this.priority == chatPromote.priority;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isPromote;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.priority;
    }

    public String toString() {
        boolean z = this.isPromote;
        int i = this.priority;
        return "ChatPromote(isPromote=" + z + ", priority=" + i + ")";
    }

    public ChatPromote(boolean z, int i) {
        this.isPromote = z;
        this.priority = i;
    }

    public final boolean isPromote() {
        return this.isPromote;
    }

    public final int getPriority() {
        return this.priority;
    }
}
