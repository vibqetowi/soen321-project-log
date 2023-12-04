package com.ifriend.presentation.common.internalnotification;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InternalNotifications.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/internalnotification/DefaultMessageInternalNotification;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultMessageInternalNotification extends InternalNotification {
    public static final int $stable = 0;
    private final String message;

    public static /* synthetic */ DefaultMessageInternalNotification copy$default(DefaultMessageInternalNotification defaultMessageInternalNotification, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultMessageInternalNotification.message;
        }
        return defaultMessageInternalNotification.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final DefaultMessageInternalNotification copy(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new DefaultMessageInternalNotification(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultMessageInternalNotification) && Intrinsics.areEqual(this.message, ((DefaultMessageInternalNotification) obj).message);
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        String str = this.message;
        return "DefaultMessageInternalNotification(message=" + str + ")";
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageInternalNotification(String message) {
        super(new HandlingStrategy.FireAndForged(0, 0L, 3, null));
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }
}
