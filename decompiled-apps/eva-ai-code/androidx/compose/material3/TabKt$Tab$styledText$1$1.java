package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tab.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt$Tab$styledText$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$Tab$styledText$1$1(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$text = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TextStyle m5096copyCXVQc50;
        ComposerKt.sourceInformation(composer, "C106@4794L10,108@4921L39:Tab.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(708874428, i, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
            }
            m5096copyCXVQc50 = r4.m5096copyCXVQc50((r46 & 1) != 0 ? r4.spanStyle.m5041getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r4.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r4.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? r4.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r4.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r4.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? r4.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r4.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r4.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r4.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r4.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? r4.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r4.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? r4.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? r4.paragraphStyle.m4997getTextAlignbuA522U() : TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (r46 & 32768) != 0 ? r4.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r4.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r4.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? r4.platformStyle : null, (r46 & 524288) != 0 ? r4.paragraphStyle.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r4.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).paragraphStyle.m4992getHyphensEaSxIns() : null);
            TextKt.ProvideTextStyle(m5096copyCXVQc50, this.$text, composer, (this.$$dirty >> 9) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
