package androidx.compose.material3;

import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: IncludeFontPaddingHelper.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"copyAndSetFontPadding", "Landroidx/compose/ui/text/TextStyle;", "style", "includeFontPadding", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle style, boolean z) {
        TextStyle m5096copyCXVQc50;
        Intrinsics.checkNotNullParameter(style, "style");
        m5096copyCXVQc50 = style.m5096copyCXVQc50((r46 & 1) != 0 ? style.spanStyle.m5041getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? style.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? style.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? style.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? style.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? style.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? style.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? style.paragraphStyle.m4997getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? style.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? style.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z), (r46 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? style.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? style.paragraphStyle.m4992getHyphensEaSxIns() : null);
        return m5096copyCXVQc50;
    }
}
