package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001aÃ\u0001\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u00012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u00010\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0018\u0010;\u001a\u0004\u0018\u00010\u0013*\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0013H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.START, "stop", "fraction", "", "lerpDiscrete", ExifInterface.GPS_DIRECTION_TRUE, "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", TtmlNode.ATTR_TTS_FONT_SIZE, TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpanStyleKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultBackgroundColor = Color.Companion.m3326getTransparent0d7_KjU();
    private static final long DefaultColor = Color.Companion.m3317getBlack0d7_KjU();

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m5047lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (TextUnitKt.m5806isUnspecifiedR2X_6o(j) || TextUnitKt.m5806isUnspecifiedR2X_6o(j2)) {
            return ((TextUnit) lerpDiscrete(TextUnit.m5778boximpl(j), TextUnit.m5778boximpl(j2), f)).m5797unboximpl();
        }
        return TextUnitKt.m5808lerpC3pnCVY(j, j2, f);
    }

    public static final SpanStyle lerp(SpanStyle start, SpanStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle$ui_text_release(), stop.getTextForegroundStyle$ui_text_release(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f);
        long m5047lerpTextUnitInheritableC3pnCVY = m5047lerpTextUnitInheritableC3pnCVY(start.m5042getFontSizeXSAIIZE(), stop.m5042getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.m5043getFontStyle4Lr2A7w(), stop.m5043getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.m5044getFontSynthesisZQGJjVo(), stop.m5044getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f);
        long m5047lerpTextUnitInheritableC3pnCVY2 = m5047lerpTextUnitInheritableC3pnCVY(start.m5045getLetterSpacingXSAIIZE(), stop.m5045getLetterSpacingXSAIIZE(), f);
        BaselineShift m5040getBaselineShift5SSeXJ0 = start.m5040getBaselineShift5SSeXJ0();
        float m5368unboximpl = m5040getBaselineShift5SSeXJ0 != null ? m5040getBaselineShift5SSeXJ0.m5368unboximpl() : BaselineShift.m5363constructorimpl(0.0f);
        BaselineShift m5040getBaselineShift5SSeXJ02 = stop.m5040getBaselineShift5SSeXJ0();
        float m5375lerpjWV1Mfo = BaselineShiftKt.m5375lerpjWV1Mfo(m5368unboximpl, m5040getBaselineShift5SSeXJ02 != null ? m5040getBaselineShift5SSeXJ02.m5368unboximpl() : BaselineShift.m5363constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f);
        long m3342lerpjxsXWHM = ColorKt.m3342lerpjxsXWHM(start.m5039getBackground0d7_KjU(), stop.m5039getBackground0d7_KjU(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m5047lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m5047lerpTextUnitInheritableC3pnCVY2, BaselineShift.m5362boximpl(m5375lerpjWV1Mfo), lerp3, localeList, m3342lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle style) {
        long m5045getLetterSpacingXSAIIZE;
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle takeOrElse = style.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        long m5042getFontSizeXSAIIZE = TextUnitKt.m5806isUnspecifiedR2X_6o(style.m5042getFontSizeXSAIIZE()) ? DefaultFontSize : style.m5042getFontSizeXSAIIZE();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m5043getFontStyle4Lr2A7w = style.m5043getFontStyle4Lr2A7w();
        FontStyle m5199boximpl = FontStyle.m5199boximpl(m5043getFontStyle4Lr2A7w != null ? m5043getFontStyle4Lr2A7w.m5205unboximpl() : FontStyle.Companion.m5207getNormal_LCdwA());
        FontSynthesis m5044getFontSynthesisZQGJjVo = style.m5044getFontSynthesisZQGJjVo();
        FontSynthesis m5208boximpl = FontSynthesis.m5208boximpl(m5044getFontSynthesisZQGJjVo != null ? m5044getFontSynthesisZQGJjVo.m5216unboximpl() : FontSynthesis.Companion.m5217getAllGVVA2EU());
        SystemFontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m5806isUnspecifiedR2X_6o(style.m5045getLetterSpacingXSAIIZE())) {
            m5045getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            m5045getLetterSpacingXSAIIZE = style.m5045getLetterSpacingXSAIIZE();
        }
        long j = m5045getLetterSpacingXSAIIZE;
        BaselineShift m5040getBaselineShift5SSeXJ0 = style.m5040getBaselineShift5SSeXJ0();
        BaselineShift m5362boximpl = BaselineShift.m5362boximpl(m5040getBaselineShift5SSeXJ0 != null ? m5040getBaselineShift5SSeXJ0.m5368unboximpl() : BaselineShift.Companion.m5372getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m5039getBackground0d7_KjU = style.m5039getBackground0d7_KjU();
        if (!(m5039getBackground0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
            m5039getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j2 = m5039getBackground0d7_KjU;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        Fill drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, m5042getFontSizeXSAIIZE, fontWeight2, m5199boximpl, m5208boximpl, fontFamily2, str, j, m5362boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (androidx.compose.ui.graphics.Color.m3292equalsimpl0(r23, r22.getTextForegroundStyle$ui_text_release().mo5376getColor0d7_KjU()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (androidx.compose.ui.unit.TextUnit.m5785equalsimpl0(r34, r22.m5045getLetterSpacingXSAIIZE()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        if ((r26 == r22.getTextForegroundStyle$ui_text_release().getAlpha()) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (androidx.compose.ui.unit.TextUnit.m5785equalsimpl0(r27, r22.m5042getFontSizeXSAIIZE()) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0164  */
    /* renamed from: fastMerge-dSHsh3o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpanStyle m5046fastMergedSHsh3o(SpanStyle fastMerge, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        boolean z;
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle2;
        boolean z2;
        TextForegroundStyle m5488from8_81llA;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String str2 = str;
        BaselineShift baselineShift2 = baselineShift;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        Intrinsics.checkNotNullParameter(fastMerge, "$this$fastMerge");
        if (!(!TextUnitKt.m5806isUnspecifiedR2X_6o(j2))) {
        }
        if (brush == null) {
            if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
            }
        }
        if ((fontStyle2 == null || Intrinsics.areEqual(fontStyle2, fastMerge.m5043getFontStyle4Lr2A7w())) && ((fontWeight2 == null || Intrinsics.areEqual(fontWeight2, fastMerge.getFontWeight())) && (fontFamily == null || fontFamily == fastMerge.getFontFamily()))) {
            z = true;
            if (!(!TextUnitKt.m5806isUnspecifiedR2X_6o(j3))) {
            }
            if ((textDecoration == null || Intrinsics.areEqual(textDecoration, fastMerge.getTextDecoration())) && Intrinsics.areEqual(brush, fastMerge.getTextForegroundStyle$ui_text_release().getBrush())) {
                if (brush != null) {
                }
                if ((fontSynthesis2 == null || Intrinsics.areEqual(fontSynthesis2, fastMerge.m5044getFontSynthesisZQGJjVo())) && ((str2 == null || Intrinsics.areEqual(str2, fastMerge.getFontFeatureSettings())) && ((baselineShift2 == null || Intrinsics.areEqual(baselineShift2, fastMerge.m5040getBaselineShift5SSeXJ0())) && ((textGeometricTransform2 == null || Intrinsics.areEqual(textGeometricTransform2, fastMerge.getTextGeometricTransform())) && (localeList == null || Intrinsics.areEqual(localeList, fastMerge.getLocaleList())))))) {
                    if (!(j4 != Color.Companion.m3327getUnspecified0d7_KjU()) || Color.m3292equalsimpl0(j4, fastMerge.m5039getBackground0d7_KjU())) {
                        shadow2 = shadow;
                        if (shadow2 == null || Intrinsics.areEqual(shadow2, fastMerge.getShadow())) {
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 == null || Intrinsics.areEqual(platformSpanStyle2, fastMerge.getPlatformStyle())) {
                                drawStyle2 = drawStyle;
                                if (drawStyle2 == null || Intrinsics.areEqual(drawStyle2, fastMerge.getDrawStyle())) {
                                    z2 = false;
                                    if (z2) {
                                        return fastMerge;
                                    }
                                    if (brush != null) {
                                        m5488from8_81llA = TextForegroundStyle.Companion.from(brush, f);
                                    } else {
                                        m5488from8_81llA = TextForegroundStyle.Companion.m5488from8_81llA(j);
                                    }
                                    TextForegroundStyle merge = fastMerge.getTextForegroundStyle$ui_text_release().merge(m5488from8_81llA);
                                    FontFamily fontFamily2 = fontFamily == null ? fastMerge.getFontFamily() : fontFamily;
                                    long m5042getFontSizeXSAIIZE = !TextUnitKt.m5806isUnspecifiedR2X_6o(j2) ? j2 : fastMerge.m5042getFontSizeXSAIIZE();
                                    if (fontWeight2 == null) {
                                        fontWeight2 = fastMerge.getFontWeight();
                                    }
                                    if (fontStyle2 == null) {
                                        fontStyle2 = fastMerge.m5043getFontStyle4Lr2A7w();
                                    }
                                    if (fontSynthesis2 == null) {
                                        fontSynthesis2 = fastMerge.m5044getFontSynthesisZQGJjVo();
                                    }
                                    if (str2 == null) {
                                        str2 = fastMerge.getFontFeatureSettings();
                                    }
                                    long m5045getLetterSpacingXSAIIZE = !TextUnitKt.m5806isUnspecifiedR2X_6o(j3) ? j3 : fastMerge.m5045getLetterSpacingXSAIIZE();
                                    if (baselineShift2 == null) {
                                        baselineShift2 = fastMerge.m5040getBaselineShift5SSeXJ0();
                                    }
                                    if (textGeometricTransform2 == null) {
                                        textGeometricTransform2 = fastMerge.getTextGeometricTransform();
                                    }
                                    LocaleList localeList2 = localeList == null ? fastMerge.getLocaleList() : localeList;
                                    long m5039getBackground0d7_KjU = j4 != Color.Companion.m3327getUnspecified0d7_KjU() ? z : false ? j4 : fastMerge.m5039getBackground0d7_KjU();
                                    TextDecoration textDecoration2 = textDecoration == null ? fastMerge.getTextDecoration() : textDecoration;
                                    if (shadow2 == null) {
                                        shadow2 = fastMerge.getShadow();
                                    }
                                    PlatformSpanStyle mergePlatformStyle = mergePlatformStyle(fastMerge, platformSpanStyle2);
                                    if (drawStyle2 == null) {
                                        drawStyle2 = fastMerge.getDrawStyle();
                                    }
                                    return new SpanStyle(merge, m5042getFontSizeXSAIIZE, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, m5045getLetterSpacingXSAIIZE, baselineShift2, textGeometricTransform2, localeList2, m5039getBackground0d7_KjU, textDecoration2, shadow2, mergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
                                }
                                z2 = z;
                                if (z2) {
                                }
                            }
                            drawStyle2 = drawStyle;
                            z2 = z;
                            if (z2) {
                            }
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        drawStyle2 = drawStyle;
                        z2 = z;
                        if (z2) {
                        }
                    }
                }
            }
            shadow2 = shadow;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
            z2 = z;
            if (z2) {
            }
        }
        shadow2 = shadow;
        platformSpanStyle2 = platformSpanStyle;
        drawStyle2 = drawStyle;
        z = true;
        z2 = z;
        if (z2) {
        }
    }
}
