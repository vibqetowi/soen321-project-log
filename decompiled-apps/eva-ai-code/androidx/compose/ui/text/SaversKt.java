package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010J\u001a\u0004\u0018\u0001HK\"\u0014\b\u0000\u0010L*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0\u0001\"\u0004\b\u0001\u0010M\"\u0004\b\u0002\u0010N\"\u0006\b\u0003\u0010K\u0018\u00012\b\u0010O\u001a\u0004\u0018\u0001HN2\u0006\u0010P\u001a\u0002HLH\u0080\b¢\u0006\u0002\u0010Q\u001a\"\u0010J\u001a\u0004\u0018\u0001HK\"\u0006\b\u0000\u0010K\u0018\u00012\b\u0010O\u001a\u0004\u0018\u00010\u0003H\u0080\b¢\u0006\u0002\u0010R\u001aI\u0010S\u001a\u00020\u0003\"\u0014\b\u0000\u0010L*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0\u0001\"\u0004\b\u0001\u0010M\"\u0004\b\u0002\u0010N2\b\u0010O\u001a\u0004\u0018\u0001HM2\u0006\u0010P\u001a\u0002HL2\u0006\u0010T\u001a\u00020UH\u0000¢\u0006\u0002\u0010V\u001a\u001f\u0010S\u001a\u0004\u0018\u0001HL\"\u0004\b\u0000\u0010L2\b\u0010O\u001a\u0004\u0018\u0001HLH\u0000¢\u0006\u0002\u0010R\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"(\u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b0\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000b\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0005\"\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0005\"\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u000b\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b-\u0010\u000b\"\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001*\u0002018@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00103\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001*\u0002048@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00105\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00107\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001*\u0002088@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00109\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010;\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010=\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010?\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001*\u00020@8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u0010A\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010C\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010E\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001*\u00020F8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010G\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001*\u00020H8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "getAnnotationRangeSaver$annotations", "()V", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ColorSaver", "Landroidx/compose/ui/graphics/Color;", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "getTextUnitSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotationSaver$annotations", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "restore", "Result", ExifInterface.GPS_DIRECTION_TRUE, "Original", "Saveable", "value", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "scope", "Landroidx/compose/runtime/saveable/SaverScope;", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaversKt {
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(SaversKt$AnnotatedStringSaver$1.INSTANCE, SaversKt$AnnotatedStringSaver$2.INSTANCE);
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(SaversKt$AnnotationRangeListSaver$1.INSTANCE, SaversKt$AnnotationRangeListSaver$2.INSTANCE);
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(SaversKt$AnnotationRangeSaver$1.INSTANCE, SaversKt$AnnotationRangeSaver$2.INSTANCE);
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(SaversKt$VerbatimTtsAnnotationSaver$1.INSTANCE, SaversKt$VerbatimTtsAnnotationSaver$2.INSTANCE);
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(SaversKt$UrlAnnotationSaver$1.INSTANCE, SaversKt$UrlAnnotationSaver$2.INSTANCE);
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(SaversKt$ParagraphStyleSaver$1.INSTANCE, SaversKt$ParagraphStyleSaver$2.INSTANCE);
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(SaversKt$SpanStyleSaver$1.INSTANCE, SaversKt$SpanStyleSaver$2.INSTANCE);
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(SaversKt$TextDecorationSaver$1.INSTANCE, SaversKt$TextDecorationSaver$2.INSTANCE);
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(SaversKt$TextGeometricTransformSaver$1.INSTANCE, SaversKt$TextGeometricTransformSaver$2.INSTANCE);
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(SaversKt$TextIndentSaver$1.INSTANCE, SaversKt$TextIndentSaver$2.INSTANCE);
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(SaversKt$FontWeightSaver$1.INSTANCE, SaversKt$FontWeightSaver$2.INSTANCE);
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(SaversKt$BaselineShiftSaver$1.INSTANCE, SaversKt$BaselineShiftSaver$2.INSTANCE);
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(SaversKt$TextRangeSaver$1.INSTANCE, SaversKt$TextRangeSaver$2.INSTANCE);
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(SaversKt$ShadowSaver$1.INSTANCE, SaversKt$ShadowSaver$2.INSTANCE);
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(SaversKt$ColorSaver$1.INSTANCE, SaversKt$ColorSaver$2.INSTANCE);
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(SaversKt$TextUnitSaver$1.INSTANCE, SaversKt$TextUnitSaver$2.INSTANCE);
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(SaversKt$OffsetSaver$1.INSTANCE, SaversKt$OffsetSaver$2.INSTANCE);
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(SaversKt$LocaleListSaver$1.INSTANCE, SaversKt$LocaleListSaver$2.INSTANCE);
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(SaversKt$LocaleSaver$1.INSTANCE, SaversKt$LocaleSaver$2.INSTANCE);

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    private static /* synthetic */ void getTextUnitSaver$annotations() {
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final <T> T save(T t) {
        return t;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, T saver, SaverScope scope) {
        Object save;
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (original == null || (save = saver.save(scope, original)) == null) {
            return false;
        }
        return save;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T saver) {
        Intrinsics.checkNotNullParameter(saver, "saver");
        if (Intrinsics.areEqual((Object) saveable, (Object) false) || saveable == null) {
            return null;
        }
        Result result = (Result) saver.restore(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj != 0) {
            Intrinsics.reifiedOperationMarker(1, "Result");
            return obj;
        }
        return null;
    }

    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final Saver<TextDecoration, Object> getSaver(TextDecoration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextDecorationSaver;
    }

    public static final Saver<TextGeometricTransform, Object> getSaver(TextGeometricTransform.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextGeometricTransformSaver;
    }

    public static final Saver<TextIndent, Object> getSaver(TextIndent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextIndentSaver;
    }

    public static final Saver<FontWeight, Object> getSaver(FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return FontWeightSaver;
    }

    public static final Saver<BaselineShift, Object> getSaver(BaselineShift.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return BaselineShiftSaver;
    }

    public static final Saver<TextRange, Object> getSaver(TextRange.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextRangeSaver;
    }

    public static final Saver<Shadow, Object> getSaver(Shadow.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ShadowSaver;
    }

    public static final Saver<Color, Object> getSaver(Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ColorSaver;
    }

    public static final Saver<TextUnit, Object> getSaver(TextUnit.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextUnitSaver;
    }

    public static final Saver<Offset, Object> getSaver(Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetSaver;
    }

    public static final Saver<LocaleList, Object> getSaver(LocaleList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleListSaver;
    }

    public static final Saver<Locale, Object> getSaver(Locale.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleSaver;
    }
}
