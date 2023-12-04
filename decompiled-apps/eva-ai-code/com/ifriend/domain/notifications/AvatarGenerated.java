package com.ifriend.domain.notifications;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LongTermNotification.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/notifications/AvatarGenerated;", "Lcom/ifriend/domain/notifications/LongTermNotification;", LogFactory.PRIORITY_KEY, "", "(I)V", "getPriority", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerated extends LongTermNotification {
    private final int priority;

    public AvatarGenerated() {
        this(0, 1, null);
    }

    public static /* synthetic */ AvatarGenerated copy$default(AvatarGenerated avatarGenerated, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = avatarGenerated.priority;
        }
        return avatarGenerated.copy(i);
    }

    public final int component1() {
        return this.priority;
    }

    public final AvatarGenerated copy(int i) {
        return new AvatarGenerated(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarGenerated) && this.priority == ((AvatarGenerated) obj).priority;
    }

    public int hashCode() {
        return this.priority;
    }

    public String toString() {
        int i = this.priority;
        return "AvatarGenerated(priority=" + i + ")";
    }

    public /* synthetic */ AvatarGenerated(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // com.ifriend.domain.notifications.LongTermNotification
    public int getPriority() {
        return this.priority;
    }

    public AvatarGenerated(int i) {
        super(null);
        this.priority = i;
    }
}
