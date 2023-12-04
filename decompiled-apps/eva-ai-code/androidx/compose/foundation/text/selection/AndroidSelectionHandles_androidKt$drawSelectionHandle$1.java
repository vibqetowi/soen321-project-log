package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(3);
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1538687176);
        ComposerKt.sourceInformation(composer, "C112@4160L7,114@4226L847:AndroidSelectionHandles.android.kt#eksfi3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538687176, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:111)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
        ComposerKt.sourceInformationMarkerEnd(composer);
        long m1229getHandleColor0d7_KjU = ((TextSelectionColors) consume).m1229getHandleColor0d7_KjU();
        Modifier.Companion companion = Modifier.Companion;
        Object[] objArr = {Color.m3281boximpl(m1229getHandleColor0d7_KjU), Boolean.valueOf(this.$isStartHandle), this.$direction, Boolean.valueOf(this.$handlesCrossed)};
        boolean z = this.$isStartHandle;
        ResolvedTextDirection resolvedTextDirection = this.$direction;
        boolean z2 = this.$handlesCrossed;
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z3 |= composer.changed(objArr[i2]);
        }
        AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(m1229getHandleColor0d7_KjU, z, resolvedTextDirection, z2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, (Function1) rememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
