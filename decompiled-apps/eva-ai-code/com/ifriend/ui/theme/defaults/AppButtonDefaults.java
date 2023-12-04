package com.ifriend.ui.theme.defaults;

import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
/* compiled from: AppButtonDefaults.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ifriend/ui/theme/defaults/AppButtonDefaults;", "", "()V", "buttonColors", "Landroidx/compose/material3/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "buttonTranslucentColors", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppButtonDefaults {
    public static final int $stable = 0;
    public static final AppButtonDefaults INSTANCE = new AppButtonDefaults();

    private AppButtonDefaults() {
    }

    public final ButtonColors buttonColors(Composer composer, int i) {
        composer.startReplaceableGroup(335727477);
        ComposerKt.sourceInformation(composer, "C(buttonColors)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(335727477, i, -1, "com.ifriend.ui.theme.defaults.AppButtonDefaults.buttonColors (AppButtonDefaults.kt:10)");
        }
        ButtonColors m1595buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(AppTheme.INSTANCE.getColors(composer, 6).m7105getPrimary0d7_KjU(), 0L, AppTheme.INSTANCE.getColors(composer, 6).m7101getLight100d7_KjU(), 0L, composer, ButtonDefaults.$stable << 12, 10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1595buttonColorsro_MJ88;
    }

    public final ButtonColors buttonTranslucentColors(Composer composer, int i) {
        composer.startReplaceableGroup(-459479250);
        ComposerKt.sourceInformation(composer, "C(buttonTranslucentColors)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-459479250, i, -1, "com.ifriend.ui.theme.defaults.AppButtonDefaults.buttonTranslucentColors (AppButtonDefaults.kt:16)");
        }
        ButtonColors m1595buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(AppColors.Companion.m7141getTranslucentCardColor0d7_KjU(), 0L, AppColors.Companion.m7141getTranslucentCardColor0d7_KjU(), 0L, composer, (ButtonDefaults.$stable << 12) | 390, 10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1595buttonColorsro_MJ88;
    }
}
