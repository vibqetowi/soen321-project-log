package com.ifriend.ui.components.insets;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
/* compiled from: Insets.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"NavigationBarInset", "", "color", "Landroidx/compose/ui/graphics/Color;", "NavigationBarInset-Iv8Zu3U", "(JLandroidx/compose/runtime/Composer;II)V", "StatusBarInset", "StatusBarInset-Iv8Zu3U", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetsKt {
    /* renamed from: StatusBarInset-Iv8Zu3U  reason: not valid java name */
    public static final void m7043StatusBarInsetIv8Zu3U(long j, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-577637169);
        ComposerKt.sourceInformation(startRestartGroup, "C(StatusBarInset)P(0:c#ui.graphics.Color)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                j = Color.Companion.m3326getTransparent0d7_KjU();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577637169, i, -1, "com.ifriend.ui.components.insets.StatusBarInset (Insets.kt:15)");
            }
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(WindowInsetsSizeKt.windowInsetsTopHeight(BackgroundKt.m421backgroundbw27NRU$default(Modifier.Companion, j, null, 2, null), WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, startRestartGroup, 8)), 0.0f, 1, null), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new InsetsKt$StatusBarInset$1(j, i, i2));
    }

    /* renamed from: NavigationBarInset-Iv8Zu3U  reason: not valid java name */
    public static final void m7042NavigationBarInsetIv8Zu3U(long j, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1831590035);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarInset)P(0:c#ui.graphics.Color)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                j = Color.Companion.m3326getTransparent0d7_KjU();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831590035, i, -1, "com.ifriend.ui.components.insets.NavigationBarInset (Insets.kt:25)");
            }
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(WindowInsetsSizeKt.windowInsetsBottomHeight(BackgroundKt.m421backgroundbw27NRU$default(Modifier.Companion, j, null, 2, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, startRestartGroup, 8)), 0.0f, 1, null), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new InsetsKt$NavigationBarInset$1(j, i, i2));
    }
}
