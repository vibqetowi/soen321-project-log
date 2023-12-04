package com.ifriend.registration.presentation.ui.internalNotifications;

import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.notifications.ResetPasswordLinkSentNotification;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.registration.presentation.R;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NotificationToSnackbarMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/registration/presentation/ui/internalNotifications/NotificationToSnackbarMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "map", "from", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapper implements Mapper<InternalNotification, SnackbarDescription> {
    public static final int $stable = 8;
    private final Resources resources;

    @Inject
    public NotificationToSnackbarMapper(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.ifriend.domain.data.Mapper
    public SnackbarDescription map(InternalNotification from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (from instanceof ResetPasswordLinkSentNotification) {
            return new SnackbarDescription(this.resources, R.string.reset_password_link_sent, null, null, null, null, null, 0, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return null;
    }
}
