package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.core.location.LocationRequestCompat;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chat.input.view.ComposableSingletons$ChatInputContentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatInputContentKt$lambda1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatInputContentKt$lambda1$1 INSTANCE = new ComposableSingletons$ChatInputContentKt$lambda1$1();

    ComposableSingletons$ChatInputContentKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        float f;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1503255322, i, -1, "com.ifriend.presentation.features.chat.input.view.ComposableSingletons$ChatInputContentKt.lambda-1.<anonymous> (ChatInputContent.kt:288)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.audio_track_1, composer, 0);
        ContentScale fillHeight = ContentScale.Companion.getFillHeight();
        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        f = ChatInputContentKt.lineHeight;
        ImageKt.Image(painterResource, (String) null, SizeKt.m781height3ABfNKs(m752paddingqDBjuR0$default, f), (Alignment) null, fillHeight, 0.0f, (ColorFilter) null, composer, 24632, (int) LocationRequestCompat.QUALITY_LOW_POWER);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
