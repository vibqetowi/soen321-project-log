package com.ifriend.domain.socket.notifications;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConfirmationEmailSentNotification.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/socket/notifications/ConfirmationEmailSentNotification;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmationEmailSentNotification extends InternalNotification {
    private final String email;

    public static /* synthetic */ ConfirmationEmailSentNotification copy$default(ConfirmationEmailSentNotification confirmationEmailSentNotification, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmationEmailSentNotification.email;
        }
        return confirmationEmailSentNotification.copy(str);
    }

    public final String component1() {
        return this.email;
    }

    public final ConfirmationEmailSentNotification copy(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new ConfirmationEmailSentNotification(email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmationEmailSentNotification) && Intrinsics.areEqual(this.email, ((ConfirmationEmailSentNotification) obj).email);
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        String str = this.email;
        return "ConfirmationEmailSentNotification(email=" + str + ")";
    }

    public final String getEmail() {
        return this.email;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationEmailSentNotification(String email) {
        super(new HandlingStrategy.WaitUntilHandledWithTTL(0, 0L, 3, null));
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
    }
}
