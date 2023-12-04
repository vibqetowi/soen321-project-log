package com.ifriend.ui;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.ifriend.domain.data.Mapper;
import com.ifriend.infrastructure.internalNotifications.LifecycledInternalNotificationHandler;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import com.ifriend.ui.internalNotifications.SnackbarKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnackbarNotificationHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/SnackbarNotificationHandler;", "Lcom/ifriend/infrastructure/internalNotifications/LifecycledInternalNotificationHandler;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "notificationToSnackbarMapper", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/ifriend/domain/data/Mapper;)V", "handle", "", "notification", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SnackbarNotificationHandler extends LifecycledInternalNotificationHandler {
    public static final int $stable = 8;
    private final AppCompatActivity activity;
    private final Mapper<InternalNotification, SnackbarDescription> notificationToSnackbarMapper;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnackbarNotificationHandler(AppCompatActivity activity, Mapper<InternalNotification, SnackbarDescription> notificationToSnackbarMapper) {
        super(r0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(notificationToSnackbarMapper, "notificationToSnackbarMapper");
        Lifecycle lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.activity = activity;
        this.notificationToSnackbarMapper = notificationToSnackbarMapper;
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
    public boolean handle(InternalNotification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        SnackbarDescription map = this.notificationToSnackbarMapper.map(notification);
        if (map == null) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) this.activity.getWindow().getDecorView().findViewById(16908290);
        deactivate();
        Intrinsics.checkNotNull(viewGroup);
        SnackbarKt.showSnackbarNotification(this.activity, viewGroup, map.getTitle(), (r21 & 4) != 0 ? null : map.getBody(), (r21 & 8) != 0 ? null : new SnackbarNotificationHandler$handle$1(this), (r21 & 16) != 0 ? null : null, map.getPresentation(), (r21 & 64) != 0 ? null : map.getOnClick(), (r21 & 128) != 0 ? 0 : map.getDuration());
        return true;
    }
}
