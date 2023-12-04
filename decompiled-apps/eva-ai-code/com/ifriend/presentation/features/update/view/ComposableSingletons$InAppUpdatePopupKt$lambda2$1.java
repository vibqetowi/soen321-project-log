package com.ifriend.presentation.features.update.view;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.ifriend.presentation.R;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$InAppUpdatePopupKt$lambda2$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$InAppUpdatePopupKt$lambda2$1 INSTANCE = new ComposableSingletons$InAppUpdatePopupKt$lambda2$1();

    ComposableSingletons$InAppUpdatePopupKt$lambda2$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880388065, i, -1, "com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt.lambda-2.<anonymous> (InAppUpdatePopup.kt:190)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.in_app_update__action, composer, 0);
            long sp = TextUnitKt.getSp(16);
            FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
            TextKt.m2145Text4IGK_g(stringResource, (Modifier) null, AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getBold(), sfProDisplay, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130450);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
