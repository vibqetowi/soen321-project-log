package com.ifriend.ui.features.neurons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.buttons.NeomorphicButtonsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NeuronsCard.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"NeuronsCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "neurons", "", "onAddNeuronsClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeuronsCardKt {
    public static final void NeuronsCard(Modifier modifier, String neurons, Function0<Unit> onAddNeuronsClick, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(neurons, "neurons");
        Intrinsics.checkNotNullParameter(onAddNeuronsClick, "onAddNeuronsClick");
        Composer startRestartGroup = composer.startRestartGroup(313054447);
        ComposerKt.sourceInformation(startRestartGroup, "C(NeuronsCard)");
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
            i3 |= startRestartGroup.changed(neurons) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onAddNeuronsClick) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(313054447, i3, -1, "com.ifriend.ui.features.neurons.NeuronsCard (NeuronsCard.kt:30)");
            }
            NeomorphicButtonsKt.m7031NeomorphicDarkLightButtonnSlTg7c(modifier, onAddNeuronsClick, false, 0.0f, Dp.m5607constructorimpl(-2), ComposableLambdaKt.composableLambda(startRestartGroup, 887477550, true, new NeuronsCardKt$NeuronsCard$1(neurons, i3)), startRestartGroup, 221184 | (i3 & 14) | ((i3 >> 3) & 112), 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NeuronsCardKt$NeuronsCard$2(modifier2, neurons, onAddNeuronsClick, i, i2));
    }
}
