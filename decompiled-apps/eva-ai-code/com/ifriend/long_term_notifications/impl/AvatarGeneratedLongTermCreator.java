package com.ifriend.long_term_notifications.impl;

import android.content.res.Resources;
import com.ifriend.domain.notifications.AvatarGenerated;
import com.ifriend.domain.notifications.LongTermNotification;
import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AvatarGeneratedLongTermCreator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/AvatarGeneratedLongTermCreator;", "Lcom/ifriend/domain/notifications/LongTermNotificationByPushCreator;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "createLongTermNotification", "Lcom/ifriend/domain/notifications/LongTermNotification;", "pushData", "", "", "pushType", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGeneratedLongTermCreator implements LongTermNotificationByPushCreator {
    private final Resources resources;

    @Inject
    public AvatarGeneratedLongTermCreator(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.ifriend.domain.notifications.LongTermNotificationByPushCreator
    public String pushType() {
        String string = this.resources.getString(com.ifriend.push_notification.R.string.avatar_generated_push_type);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.ifriend.domain.notifications.LongTermNotificationByPushCreator
    public LongTermNotification createLongTermNotification(Map<String, String> pushData) {
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        return new AvatarGenerated(0, 1, null);
    }
}
