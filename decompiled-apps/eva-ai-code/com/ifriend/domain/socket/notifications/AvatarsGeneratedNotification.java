package com.ifriend.domain.socket.notifications;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarsGeneratedNotification.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/notifications/AvatarsGeneratedNotification;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "isSuccess", "", "description", "", "(ZLjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarsGeneratedNotification extends InternalNotification {
    private final String description;
    private final boolean isSuccess;

    public static /* synthetic */ AvatarsGeneratedNotification copy$default(AvatarsGeneratedNotification avatarsGeneratedNotification, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = avatarsGeneratedNotification.isSuccess;
        }
        if ((i & 2) != 0) {
            str = avatarsGeneratedNotification.description;
        }
        return avatarsGeneratedNotification.copy(z, str);
    }

    public final boolean component1() {
        return this.isSuccess;
    }

    public final String component2() {
        return this.description;
    }

    public final AvatarsGeneratedNotification copy(boolean z, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new AvatarsGeneratedNotification(z, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarsGeneratedNotification) {
            AvatarsGeneratedNotification avatarsGeneratedNotification = (AvatarsGeneratedNotification) obj;
            return this.isSuccess == avatarsGeneratedNotification.isSuccess && Intrinsics.areEqual(this.description, avatarsGeneratedNotification.description);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.description.hashCode();
    }

    public String toString() {
        boolean z = this.isSuccess;
        String str = this.description;
        return "AvatarsGeneratedNotification(isSuccess=" + z + ", description=" + str + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsGeneratedNotification(boolean z, String description) {
        super(new HandlingStrategy.WaitUntilHandledWithTTL(0, 0L, 3, null));
        Intrinsics.checkNotNullParameter(description, "description");
        this.isSuccess = z;
        this.description = description;
    }
}
