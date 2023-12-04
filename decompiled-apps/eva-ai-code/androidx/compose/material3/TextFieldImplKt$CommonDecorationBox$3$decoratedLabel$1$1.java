package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f, long j, Function2<? super Composer, ? super Integer, Unit> function2, int i, boolean z, long j2) {
        super(2);
        this.$labelProgress = f;
        this.$labelContentColor = j;
        this.$it = function2;
        this.$$dirty = i;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TextStyle textStyle;
        TextStyle m5096copyCXVQc50;
        ComposerKt.sourceInformation(composer, "C*119@4896L10,120@4952L10,125@5165L49:TextFieldImpl.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382297919, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
            }
            TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer, 6).getBodyLarge(), MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall(), this.$labelProgress);
            boolean z = this.$shouldOverrideTextStyleColor;
            long j = this.$labelTextStyleColor;
            if (z) {
                m5096copyCXVQc50 = lerp.m5096copyCXVQc50((r46 & 1) != 0 ? lerp.spanStyle.m5041getColor0d7_KjU() : j, (r46 & 2) != 0 ? lerp.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? lerp.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? lerp.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? lerp.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? lerp.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? lerp.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? lerp.paragraphStyle.m4997getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? lerp.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? lerp.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? lerp.platformStyle : null, (r46 & 524288) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? lerp.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? lerp.paragraphStyle.m4992getHyphensEaSxIns() : null);
                textStyle = m5096copyCXVQc50;
            } else {
                textStyle = lerp;
            }
            TextFieldImplKt.m2135DecorationKTwxG1Y(this.$labelContentColor, textStyle, this.$it, composer, (this.$$dirty >> 6) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
