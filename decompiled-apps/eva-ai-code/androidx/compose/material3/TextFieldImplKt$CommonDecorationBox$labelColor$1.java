package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements Function3<InputPhase, Composer, Integer, Color> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase, Composer composer, Integer num) {
        return Color.m3281boximpl(m2138invokeXeAY9LY(inputPhase, composer, num.intValue()));
    }

    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m2138invokeXeAY9LY(InputPhase it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        composer.startReplaceableGroup(-502832279);
        ComposerKt.sourceInformation(composer, "C93@3660L47:TextFieldImpl.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-502832279, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i2 = this.$$dirty1;
        long m3301unboximpl = textFieldColors.labelColor$material3_release(z, z2, interactionSource, composer, ((i2 >> 6) & 14) | ((i2 >> 6) & 112) | ((i2 >> 6) & 896) | ((i2 >> 9) & 7168)).getValue().m3301unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3301unboximpl;
    }
}
