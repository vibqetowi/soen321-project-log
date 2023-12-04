package com.ifriend.ui.features.image;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.ifriend.ui.R;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppAvatarAsyncImage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AppAvatarAsyncImage", "", "modifier", "Landroidx/compose/ui/Modifier;", "avatarUrl", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppAvatarAsyncImageKt {
    public static final void AppAvatarAsyncImage(Modifier modifier, String avatarUrl, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Composer startRestartGroup = composer.startRestartGroup(101200996);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppAvatarAsyncImage)P(1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(avatarUrl) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(101200996, i3, -1, "com.ifriend.ui.features.image.AppAvatarAsyncImage (AppAvatarAsyncImage.kt:12)");
            }
            AppAsyncImageKt.AppAsyncImage(avatarUrl, modifier, null, null, null, PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), startRestartGroup, ((i3 >> 3) & 14) | 2359296 | ((i3 << 3) & 112), 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AppAvatarAsyncImageKt$AppAvatarAsyncImage$1(modifier, avatarUrl, i, i2));
    }
}
