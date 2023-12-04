package com.ifriend.chat.presentation.ui.internalNotifications;

import android.content.res.Resources;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import com.ifriend.ui.internalNotifications.SnackbarPresentation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NotificationToSnackbarMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"generationAvatarAnimationErrorSnackbar", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "resources", "Landroid/content/res/Resources;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapperKt {
    public static final SnackbarDescription generationAvatarAnimationErrorSnackbar(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new SnackbarDescription(resources, R.string.failed_to_animate_image, Integer.valueOf(R.string.no_face_detected), SnackbarPresentation.BluredError.INSTANCE, null, null, null, 0, null, 496, null);
    }
}
