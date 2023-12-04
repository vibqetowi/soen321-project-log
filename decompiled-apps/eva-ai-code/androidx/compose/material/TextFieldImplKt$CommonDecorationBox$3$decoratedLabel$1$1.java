package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
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
        TextStyle m5100copyv2rsoow;
        ComposerKt.sourceInformation(composer, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362863774, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
            }
            TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption(), this.$labelProgress);
            boolean z = this.$shouldOverrideTextStyleColor;
            long j = this.$labelTextStyleColor;
            if (z) {
                m5100copyv2rsoow = lerp.m5100copyv2rsoow((r48 & 1) != 0 ? lerp.spanStyle.m5041getColor0d7_KjU() : j, (r48 & 2) != 0 ? lerp.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? lerp.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? lerp.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? lerp.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? lerp.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? lerp.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                textStyle = m5100copyv2rsoow;
            } else {
                textStyle = lerp;
            }
            TextFieldImplKt.m1521DecorationeuL9pac(this.$labelContentColor, textStyle, null, this.$it, composer, ((this.$$dirty >> 6) & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
