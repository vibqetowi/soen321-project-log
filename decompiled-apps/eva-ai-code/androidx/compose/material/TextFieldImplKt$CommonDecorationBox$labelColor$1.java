package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/material/InputPhase;", "invoke-XeAY9LY", "(Landroidx/compose/material/InputPhase;Landroidx/compose/runtime/Composer;I)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements Function3<InputPhase, Composer, Integer, Color> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, int i2) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase, Composer composer, Integer num) {
        return Color.m3281boximpl(m1524invokeXeAY9LY(inputPhase, composer, num.intValue()));
    }

    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m1524invokeXeAY9LY(InputPhase it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        composer.startReplaceableGroup(697243846);
        ComposerKt.sourceInformation(composer, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(697243846, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = it == InputPhase.UnfocusedEmpty ? false : this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i2 = this.$$dirty1;
        long m3301unboximpl = textFieldColors.labelColor(z, z2, interactionSource, composer, ((this.$$dirty >> 27) & 14) | ((i2 << 3) & 896) | (i2 & 7168)).getValue().m3301unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3301unboximpl;
    }
}
