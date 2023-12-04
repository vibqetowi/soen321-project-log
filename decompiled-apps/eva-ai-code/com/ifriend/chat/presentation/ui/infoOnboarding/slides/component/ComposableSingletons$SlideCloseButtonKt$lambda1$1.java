package com.ifriend.chat.presentation.ui.infoOnboarding.slides.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.location.LocationRequestCompat;
import com.ifriend.chat.presentation.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.http.protocol.HTTP;
/* compiled from: SlideCloseButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.ComposableSingletons$SlideCloseButtonKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$SlideCloseButtonKt$lambda1$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SlideCloseButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$SlideCloseButtonKt$lambda1$1();

    ComposableSingletons$SlideCloseButtonKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-101057167, i, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.ComposableSingletons$SlideCloseButtonKt.lambda-1.<anonymous> (SlideCloseButton.kt:35)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.info_onboarding_close, composer, 0), HTTP.CONN_CLOSE, AlphaKt.alpha(SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(15)), 0.5f), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25016, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
