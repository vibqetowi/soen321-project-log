package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", CookieSpecs.DEFAULT, "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyKt {
    private static final TextStyle DefaultTextStyle;
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m5100copyv2rsoow;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m5100copyv2rsoow = textStyle.m5100copyv2rsoow((r48 & 1) != 0 ? textStyle.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? textStyle.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? textStyle.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? textStyle.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        return m5100copyv2rsoow;
    }

    static {
        TextStyle m5100copyv2rsoow;
        m5100copyv2rsoow = r1.m5100copyv2rsoow((r48 & 1) != 0 ? r1.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r1.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r1.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r1.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r1.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r1.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r1.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r1.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r1.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r1.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r1.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r1.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r1.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r1.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r1.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r1.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r1.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r1.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r1.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r1.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r1.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r1.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r1.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TextStyle.Companion.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m5100copyv2rsoow;
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
