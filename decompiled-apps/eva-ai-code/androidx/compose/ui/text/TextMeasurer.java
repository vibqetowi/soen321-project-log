package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: TextMeasurer.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008d\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Jw\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "fallbackFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fallbackDensity", "Landroidx/compose/ui/unit/Density;", "fallbackLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density fallbackDensity;
    private final FontFamily.Resolver fallbackFontFamilyResolver;
    private final LayoutDirection fallbackLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver fallbackFontFamilyResolver, Density fallbackDensity, LayoutDirection fallbackLayoutDirection, int i) {
        Intrinsics.checkNotNullParameter(fallbackFontFamilyResolver, "fallbackFontFamilyResolver");
        Intrinsics.checkNotNullParameter(fallbackDensity, "fallbackDensity");
        Intrinsics.checkNotNullParameter(fallbackLayoutDirection, "fallbackLayoutDirection");
        this.fallbackFontFamilyResolver = fallbackFontFamilyResolver;
        this.fallbackDensity = fallbackDensity;
        this.fallbackLayoutDirection = fallbackLayoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measure-xDpz5zY$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m5058measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        return textMeasurer.m5060measurexDpz5zY(annotatedString, (i3 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (i3 & 4) != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? textMeasurer.fallbackLayoutDirection : layoutDirection, (i3 & 256) != 0 ? textMeasurer.fallbackDensity : density, (i3 & 512) != 0 ? textMeasurer.fallbackFontFamilyResolver : resolver, (i3 & 1024) != 0 ? false : z2);
    }

    /* renamed from: measure-xDpz5zY  reason: not valid java name */
    public final TextLayoutResult m5060measurexDpz5zY(AnnotatedString text, TextStyle style, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> placeholders, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean z2) {
        TextLayoutCache textLayoutCache;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, i2, z, i, density, layoutDirection, fontFamilyResolver, j, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (z2 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m5053copyO0kMr_c(textLayoutInput, ConstraintsKt.m5562constrain4WqzIAM(j, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult layout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, layout);
        }
        return layout;
    }

    /* renamed from: measure-wNUYSr0  reason: not valid java name */
    public final TextLayoutResult m5059measurewNUYSr0(String text, TextStyle style, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return m5058measurexDpz5zY$default(this, new AnnotatedString(text, null, null, 6, null), style, i, z, i2, null, j, layoutDirection, density, fontFamilyResolver, z2, 32, null);
    }

    /* compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraph multiParagraph;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m5553getMinWidthimpl = Constraints.m5553getMinWidthimpl(textLayoutInput.m5050getConstraintsmsEJaDk());
            boolean z = false;
            int m5551getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextOverflow.m5509equalsimpl0(textLayoutInput.m5051getOverflowgIe3tQ8(), TextOverflow.Companion.m5517getEllipsisgIe3tQ8())) && Constraints.m5547getHasBoundedWidthimpl(textLayoutInput.m5050getConstraintsmsEJaDk())) ? Constraints.m5551getMaxWidthimpl(textLayoutInput.m5050getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m5509equalsimpl0(textLayoutInput.m5051getOverflowgIe3tQ8(), TextOverflow.Companion.m5517getEllipsisgIe3tQ8())) {
                z = true;
            }
            int maxLines = z ? 1 : textLayoutInput.getMaxLines();
            if (m5553getMinWidthimpl != m5551getMaxWidthimpl) {
                m5551getMaxWidthimpl = RangesKt.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m5553getMinWidthimpl, m5551getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, m5551getMaxWidthimpl, 0, Constraints.m5550getMaxHeightimpl(textLayoutInput.m5050getConstraintsmsEJaDk()), 5, null), maxLines, TextOverflow.m5509equalsimpl0(textLayoutInput.m5051getOverflowgIe3tQ8(), TextOverflow.Companion.m5517getEllipsisgIe3tQ8()), null), ConstraintsKt.m5562constrain4WqzIAM(textLayoutInput.m5050getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) Math.ceil(multiParagraph.getWidth()), (int) Math.ceil(multiParagraph.getHeight()))), null);
        }
    }
}
