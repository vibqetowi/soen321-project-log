package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B°\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0002\u0010 J&\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012J\u000e\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u000203J\u0010\u0010'\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0002J\u001e\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0014J\u001e\u0010<\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0014J+\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u00109\u001a\u00020B2\u0006\u0010C\u001a\u00020Dø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001e\u0010G\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0014J\u001e\u0010H\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0014JD\u0010I\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u001c\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0018\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\bJY\u0010L\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u000e\u0010O\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010P\u001a\u00020\u000e*\u00020QH\u0016J\f\u0010R\u001a\u00020\u000e*\u000203H\u0016J\u001c\u0010S\u001a\u00020\u0014*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0014H\u0016J\u001c\u0010T\u001a\u00020\u0014*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0014H\u0016J)\u0010U\u001a\u00020?*\u00020A2\u0006\u00109\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010FJ\u001c\u0010W\u001a\u00020\u0014*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0014H\u0016J\u001c\u0010X\u001a\u00020\u0014*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0014H\u0016R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0014\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010*\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0+\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "baselineCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "layoutCache", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "I", "semanticsTextLayoutResult", "", "doInvalidations", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "drawNonExtension", "contentDrawScope", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "maxIntrinsicHeightNonExtension", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidthNonExtension", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measureNonExtension", "Landroidx/compose/ui/layout/MeasureResult;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeightNonExtension", "minIntrinsicWidthNonExtension", "updateCallbacks", "updateDraw", "color", "updateLayoutRelatedArgs", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateText", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "measure-3p2s80s", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    private MultiParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private Function1<? super List<Rect>, Unit> onPlaceholderLayout;
    private Function1<? super TextLayoutResult, Unit> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function12, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, null);
    }

    private TextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache();
        layoutCache.setDensity$foundation_release(density);
        return layoutCache;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z = !Intrinsics.areEqual(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return z || !style.hasSameDrawAffectingAttributes(this.style);
    }

    public final boolean updateText(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(this.text, text)) {
            return false;
        }
        this.text = text;
        return true;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk  reason: not valid java name */
    public final boolean m1143updateLayoutRelatedArgsMPT68mk(TextStyle style, List<AnnotatedString.Range<Placeholder>> list, int i, int i2, boolean z, FontFamily.Resolver fontFamilyResolver, int i3) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (!Intrinsics.areEqual(this.placeholders, list)) {
            this.placeholders = list;
            z2 = true;
        }
        if (this.minLines != i) {
            this.minLines = i;
            z2 = true;
        }
        if (this.maxLines != i2) {
            this.maxLines = i2;
            z2 = true;
        }
        if (this.softWrap != z) {
            this.softWrap = z;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z2 = true;
        }
        if (TextOverflow.m5509equalsimpl0(this.overflow, i3)) {
            return z2;
        }
        this.overflow = i3;
        return true;
    }

    public final boolean updateCallbacks(Function1<? super TextLayoutResult, Unit> function1, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController) {
        boolean z;
        if (Intrinsics.areEqual(this.onTextLayout, function1)) {
            z = false;
        } else {
            this.onTextLayout = function1;
            z = true;
        }
        if (!Intrinsics.areEqual(this.onPlaceholderLayout, function12)) {
            this.onPlaceholderLayout = function12;
            z = true;
        }
        if (Intrinsics.areEqual(this.selectionController, selectionController)) {
            return z;
        }
        this.selectionController = selectionController;
        return true;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z2 || z3 || z4) {
            getLayoutCache().m1125updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        TextAnnotatedStringNode$applySemantics$1 textAnnotatedStringNode$applySemantics$1 = this.semanticsTextLayoutResult;
        if (textAnnotatedStringNode$applySemantics$1 == null) {
            textAnnotatedStringNode$applySemantics$1 = new TextAnnotatedStringNode$applySemantics$1(this);
            this.semanticsTextLayoutResult = textAnnotatedStringNode$applySemantics$1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, textAnnotatedStringNode$applySemantics$1, 1, null);
    }

    /* renamed from: measureNonExtension-3p2s80s  reason: not valid java name */
    public final MeasureResult m1142measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return mo500measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo500measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measure);
        boolean m1124layoutWithConstraintsK40F9xA = layoutCache.m1124layoutWithConstraintsK40F9xA(j, measure.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m1124layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1<? super TextLayoutResult, Unit> function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            this.baselineCache = MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline()))));
        }
        Function1<? super List<Rect>, Unit> function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResult.getPlaceholderRects());
        }
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(IntSize.m5767getWidthimpl(textLayoutResult.m5055getSizeYbymL2g()), IntSize.m5766getHeightimpl(textLayoutResult.m5055getSizeYbymL2g())));
        int m5767getWidthimpl = IntSize.m5767getWidthimpl(textLayoutResult.m5055getSizeYbymL2g());
        int m5766getHeightimpl = IntSize.m5766getHeightimpl(textLayoutResult.m5055getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measure.layout(m5767getWidthimpl, m5766getHeightimpl, map, new TextAnnotatedStringNode$measure$1(mo4545measureBRTryo0));
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "contentDrawScope");
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.draw(contentDrawScope);
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        TextLayoutResult textLayoutResult = getLayoutCache().getTextLayoutResult();
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        boolean z = true;
        boolean z2 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5509equalsimpl0(this.overflow, TextOverflow.Companion.m5518getVisiblegIe3tQ8());
        if (z2) {
            Rect m3058Recttz77jQw = RectKt.m3058Recttz77jQw(Offset.Companion.m3034getZeroF1C5BW0(), SizeKt.Size(IntSize.m5767getWidthimpl(textLayoutResult.m5055getSizeYbymL2g()), IntSize.m5766getHeightimpl(textLayoutResult.m5055getSizeYbymL2g())));
            canvas.save();
            Canvas.CC.m3265clipRectmtrdDE$default(canvas, m3058Recttz77jQw, 0, 2, null);
        }
        try {
            TextDecoration textDecoration = this.style.getTextDecoration();
            if (textDecoration == null) {
                textDecoration = TextDecoration.Companion.getNone();
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = this.style.getShadow();
            if (shadow == null) {
                shadow = Shadow.Companion.getNone();
            }
            Shadow shadow2 = shadow;
            Fill drawStyle = this.style.getDrawStyle();
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = this.style.getBrush();
            if (brush == null) {
                ColorProducer colorProducer = this.overrideColor;
                long mo1534invoke0d7_KjU = colorProducer != null ? colorProducer.mo1534invoke0d7_KjU() : Color.Companion.m3327getUnspecified0d7_KjU();
                if (!(mo1534invoke0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                    if (this.style.m5103getColor0d7_KjU() != Color.Companion.m3327getUnspecified0d7_KjU()) {
                        mo1534invoke0d7_KjU = this.style.m5103getColor0d7_KjU();
                    } else {
                        mo1534invoke0d7_KjU = Color.Companion.m3317getBlack0d7_KjU();
                    }
                }
                multiParagraph.m4972paintLG529CI(canvas, (r14 & 2) != 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : mo1534invoke0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m3845getDefaultBlendMode0nO6VwU() : 0);
            } else {
                multiParagraph.m4974painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : this.style.getAlpha(), (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? DrawScope.Companion.m3845getDefaultBlendMode0nO6VwU() : 0);
            }
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z) {
                return;
            }
            contentDrawScope.drawContent();
        } finally {
            if (z2) {
                canvas.restore();
            }
        }
    }
}
