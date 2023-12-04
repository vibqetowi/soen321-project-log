package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ProfileMenuContent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "textRef", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "invoke", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.profile.menu.view.ComposableSingletons$ProfileMenuContentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ProfileMenuContentKt$lambda1$1 extends Lambda implements Function4<ConstraintLayoutScope, ConstrainedLayoutReference, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProfileMenuContentKt$lambda1$1 INSTANCE = new ComposableSingletons$ProfileMenuContentKt$lambda1$1();

    ComposableSingletons$ProfileMenuContentKt$lambda1$1() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayoutScope constraintLayoutScope, ConstrainedLayoutReference constrainedLayoutReference, Composer composer, Integer num) {
        invoke(constraintLayoutScope, constrainedLayoutReference, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ConstraintLayoutScope ProfileMenuItem, ConstrainedLayoutReference textRef, Composer composer, int i) {
        int i2;
        long j;
        Intrinsics.checkNotNullParameter(ProfileMenuItem, "$this$ProfileMenuItem");
        Intrinsics.checkNotNullParameter(textRef, "textRef");
        if ((i & 14) == 0) {
            i2 = (composer.changed(ProfileMenuItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(textRef) ? 32 : 16;
        }
        if ((i2 & 731) != 146 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1253695435, i2, -1, "com.ifriend.presentation.features.profile.menu.view.ComposableSingletons$ProfileMenuContentKt.lambda-1.<anonymous> (ProfileMenuContent.kt:96)");
            }
            ConstrainedLayoutReference createRef = ProfileMenuItem.createRef();
            Modifier m795size3ABfNKs = SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(8));
            j = ProfileMenuContentKt.circleIndicatorColor;
            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(m795size3ABfNKs, j, RoundedCornerShapeKt.getCircleShape());
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(textRef);
            ComposableSingletons$ProfileMenuContentKt$lambda1$1$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ComposableSingletons$ProfileMenuContentKt$lambda1$1$1$1(textRef);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SpacerKt.Spacer(ProfileMenuItem.constrainAs(m420backgroundbw27NRU, createRef, (Function1) rememberedValue), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
