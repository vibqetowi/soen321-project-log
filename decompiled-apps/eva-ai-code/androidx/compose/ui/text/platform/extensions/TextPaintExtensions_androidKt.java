package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextPaintExtensions.android.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0001\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle style, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, Density density, boolean z) {
        Locale locale;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long m5787getTypeUIouoOA = TextUnit.m5787getTypeUIouoOA(style.m5042getFontSizeXSAIIZE());
        if (TextUnitType.m5816equalsimpl0(m5787getTypeUIouoOA, TextUnitType.Companion.m5821getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo587toPxR2X_6o(style.m5042getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5816equalsimpl0(m5787getTypeUIouoOA, TextUnitType.Companion.m5820getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5788getValueimpl(style.m5042getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m5043getFontStyle4Lr2A7w = style.m5043getFontStyle4Lr2A7w();
            FontStyle m5199boximpl = FontStyle.m5199boximpl(m5043getFontStyle4Lr2A7w != null ? m5043getFontStyle4Lr2A7w.m5205unboximpl() : FontStyle.Companion.m5207getNormal_LCdwA());
            FontSynthesis m5044getFontSynthesisZQGJjVo = style.m5044getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface(resolveTypeface.invoke(fontFamily, fontWeight, m5199boximpl, FontSynthesis.m5208boximpl(m5044getFontSynthesisZQGJjVo != null ? m5044getFontSynthesisZQGJjVo.m5216unboximpl() : FontSynthesis.Companion.m5217getAllGVVA2EU())));
        }
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.Companion.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
            } else {
                if (style.getLocaleList().isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = style.getLocaleList().get(0);
                }
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m5343setColor8_81llA(style.m5041getColor0d7_KjU());
        androidTextPaint.m5342setBrush12SF9DM(style.getBrush(), Size.Companion.m3095getUnspecifiedNHjbRc(), style.getAlpha());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        androidTextPaint.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m5816equalsimpl0(TextUnit.m5787getTypeUIouoOA(style.m5045getLetterSpacingXSAIIZE()), TextUnitType.Companion.m5821getSpUIouoOA())) {
            if (!(TextUnit.m5788getValueimpl(style.m5045getLetterSpacingXSAIIZE()) == 0.0f)) {
                float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
                float mo587toPxR2X_6o = density.mo587toPxR2X_6o(style.m5045getLetterSpacingXSAIIZE());
                if (!(textSize == 0.0f)) {
                    androidTextPaint.setLetterSpacing(mo587toPxR2X_6o / textSize);
                }
                return m5357generateFallbackSpanStyle62GTOB8(style.m5045getLetterSpacingXSAIIZE(), z, style.m5039getBackground0d7_KjU(), style.m5040getBaselineShift5SSeXJ0());
            }
        }
        if (TextUnitType.m5816equalsimpl0(TextUnit.m5787getTypeUIouoOA(style.m5045getLetterSpacingXSAIIZE()), TextUnitType.Companion.m5820getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5788getValueimpl(style.m5045getLetterSpacingXSAIIZE()));
        }
        return m5357generateFallbackSpanStyle62GTOB8(style.m5045getLetterSpacingXSAIIZE(), z, style.m5039getBackground0d7_KjU(), style.m5040getBaselineShift5SSeXJ0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (androidx.compose.ui.text.style.BaselineShift.m5365equalsimpl0(r36.m5368unboximpl(), androidx.compose.ui.text.style.BaselineShift.Companion.m5372getNoney9eOQZs()) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* renamed from: generateFallbackSpanStyle-62GTOB8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SpanStyle m5357generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, BaselineShift baselineShift) {
        boolean z2;
        boolean z3;
        long j3 = j2;
        boolean z4 = true;
        if (z && TextUnitType.m5816equalsimpl0(TextUnit.m5787getTypeUIouoOA(j), TextUnitType.Companion.m5821getSpUIouoOA())) {
            if (!(TextUnit.m5788getValueimpl(j) == 0.0f)) {
                z2 = true;
                z3 = Color.m3292equalsimpl0(j3, Color.Companion.m3327getUnspecified0d7_KjU()) && !Color.m3292equalsimpl0(j3, Color.Companion.m3326getTransparent0d7_KjU());
                if (baselineShift != null) {
                }
                z4 = false;
                if (!z2 || z3 || z4) {
                    long m5799getUnspecifiedXSAIIZE = !z2 ? j : TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
                    if (!z3) {
                        j3 = Color.Companion.m3327getUnspecified0d7_KjU();
                    }
                    return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5799getUnspecifiedXSAIIZE, !z4 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, j3, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
                }
                return null;
            }
        }
        z2 = false;
        if (Color.m3292equalsimpl0(j3, Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        if (baselineShift != null) {
        }
        z4 = false;
        if (z2) {
        }
        if (!z2) {
        }
        if (!z3) {
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5799getUnspecifiedXSAIIZE, !z4 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, j3, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int flags;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m5495getLinearity4e0Vf04$ui_text_release = textMotion.m5495getLinearity4e0Vf04$ui_text_release();
        if (TextMotion.Linearity.m5499equalsimpl0(m5495getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m5504getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5499equalsimpl0(m5495getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m5503getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5499equalsimpl0(m5495getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m5505getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.m5043getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
