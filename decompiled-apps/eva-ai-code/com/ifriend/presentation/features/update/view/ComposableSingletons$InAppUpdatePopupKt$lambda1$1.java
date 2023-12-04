package com.ifriend.presentation.features.update.view;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.ifriend.presentation.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$InAppUpdatePopupKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InAppUpdatePopupKt$lambda1$1 INSTANCE = new ComposableSingletons$InAppUpdatePopupKt$lambda1$1();

    ComposableSingletons$InAppUpdatePopupKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221573873, i, -1, "com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt.lambda-1.<anonymous> (InAppUpdatePopup.kt:142)");
            }
            IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close, composer, 0), StringResources_androidKt.stringResource(R.string.content_description__close_button, composer, 0), (Modifier) null, AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7099getIconPrimary0d7_KjU(), composer, 8, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
