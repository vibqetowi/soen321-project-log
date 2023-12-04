package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ParagraphStyle.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001aq\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", TtmlNode.START, "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-HtYhynw", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();

    public static final ParagraphStyle lerp(ParagraphStyle start, ParagraphStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(start.m4997getTextAlignbuA522U(), stop.m4997getTextAlignbuA522U(), f);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(start.m4999getTextDirectionmmuk1to(), stop.m4999getTextDirectionmmuk1to(), f);
        long m5047lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m5047lerpTextUnitInheritableC3pnCVY(start.m4996getLineHeightXSAIIZE(), stop.m4996getLineHeightXSAIIZE(), f);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(textAlign, textDirection, m5047lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), f), (LineBreak) SpanStyleKt.lerpDiscrete(start.m4994getLineBreakLgCVezo(), stop.m4994getLineBreakLgCVezo(), f), (Hyphens) SpanStyleKt.lerpDiscrete(start.m4992getHyphensEaSxIns(), stop.m4992getHyphensEaSxIns(), f), (TextMotion) SpanStyleKt.lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle style, LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        TextAlign m5462boximpl = TextAlign.m5462boximpl(style.m4998getTextAlignOrDefaulte0LSkKk$ui_text_release());
        TextDirection m5475boximpl = TextDirection.m5475boximpl(TextStyleKt.m5114resolveTextDirectionYj3eThk(direction, style.m4999getTextDirectionmmuk1to()));
        long m4996getLineHeightXSAIIZE = TextUnitKt.m5806isUnspecifiedR2X_6o(style.m4996getLineHeightXSAIIZE()) ? DefaultLineHeight : style.m4996getLineHeightXSAIIZE();
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = style.getPlatformStyle();
        LineHeightStyle lineHeightStyle = style.getLineHeightStyle();
        LineBreak m5390boximpl = LineBreak.m5390boximpl(style.m4995getLineBreakOrDefaultrAG3T2k$ui_text_release());
        Hyphens m5381boximpl = Hyphens.m5381boximpl(style.m4993getHyphensOrDefaultvmbZdU8$ui_text_release());
        TextMotion textMotion = style.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(m5462boximpl, m5475boximpl, m4996getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, m5390boximpl, m5381boximpl, textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (androidx.compose.ui.unit.TextUnit.m5785equalsimpl0(r12, r23.m4996getLineHeightXSAIIZE()) != false) goto L41;
     */
    /* renamed from: fastMerge-HtYhynw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ParagraphStyle m5000fastMergeHtYhynw(ParagraphStyle fastMerge, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        long j2;
        TextAlign textAlign2 = textAlign;
        TextIndent textIndent2 = textIndent;
        Intrinsics.checkNotNullParameter(fastMerge, "$this$fastMerge");
        boolean z = true;
        if (textAlign2 == null || Intrinsics.areEqual(textAlign2, fastMerge.m4997getTextAlignbuA522U())) {
            if (!TextUnitKt.m5806isUnspecifiedR2X_6o(j)) {
                j2 = j;
            } else {
                j2 = j;
            }
            if ((textIndent2 == null || Intrinsics.areEqual(textIndent2, fastMerge.getTextIndent())) && ((textDirection == null || Intrinsics.areEqual(textDirection, fastMerge.m4999getTextDirectionmmuk1to())) && ((platformParagraphStyle == null || Intrinsics.areEqual(platformParagraphStyle, fastMerge.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.areEqual(lineHeightStyle, fastMerge.getLineHeightStyle())) && ((lineBreak == null || Intrinsics.areEqual(lineBreak, fastMerge.m4994getLineBreakLgCVezo())) && ((hyphens == null || Intrinsics.areEqual(hyphens, fastMerge.m4992getHyphensEaSxIns())) && (textMotion == null || Intrinsics.areEqual(textMotion, fastMerge.getTextMotion())))))))) {
                z = false;
            }
        } else {
            j2 = j;
        }
        if (z) {
            long m4996getLineHeightXSAIIZE = TextUnitKt.m5806isUnspecifiedR2X_6o(j) ? fastMerge.m4996getLineHeightXSAIIZE() : j2;
            if (textIndent2 == null) {
                textIndent2 = fastMerge.getTextIndent();
            }
            TextIndent textIndent3 = textIndent2;
            if (textAlign2 == null) {
                textAlign2 = fastMerge.m4997getTextAlignbuA522U();
            }
            return new ParagraphStyle(textAlign2, textDirection == null ? fastMerge.m4999getTextDirectionmmuk1to() : textDirection, m4996getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(fastMerge, platformParagraphStyle), lineHeightStyle == null ? fastMerge.getLineHeightStyle() : lineHeightStyle, lineBreak == null ? fastMerge.m4994getLineBreakLgCVezo() : lineBreak, hyphens == null ? fastMerge.m4992getHyphensEaSxIns() : hyphens, textMotion == null ? fastMerge.getTextMotion() : textMotion, (DefaultConstructorMarker) null);
        }
        return fastMerge;
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }
}
