package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.sentry.cache.EnvelopeCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: TextFieldDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final Companion Companion = new Companion(null);

    /* compiled from: TextFieldDelegate.kt */
    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016JK\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JE\u0010#\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b*J1\u0010+\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001¢\u0006\u0002\b0JA\u00101\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\b\u00105\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0002\b6JX\u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0001¢\u0006\u0002\b>JX\u0010?\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0001¢\u0006\u0002\b@JI\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0012\u001a\u00020D2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "()V", "applyCompositionDecoration", "Landroidx/compose/ui/text/input/TransformedText;", "compositionRange", "Landroidx/compose/ui/text/TextRange;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "draw$foundation_release", TtmlNode.TAG_LAYOUT, "Lkotlin/Triple;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevResultText", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "notifyFocusedRect", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "hasFocus", "", "notifyFocusedRect$foundation_release", "onBlur", "editProcessor", "Landroidx/compose/ui/text/input/EditProcessor;", "onValueChange", "Lkotlin/Function1;", "onBlur$foundation_release", "onEditCommand", "ops", "", "Landroidx/compose/ui/text/input/EditCommand;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "onEditCommand$foundation_release", "onFocus", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "onFocus$foundation_release", "restartInput", "restartInput$foundation_release", "setCursorOffset", "position", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default  reason: not valid java name */
        public static /* synthetic */ Triple m1082layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m1084layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
        }

        @JvmStatic
        /* renamed from: layout-_EkL_-Y$foundation_release  reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m1084layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            TextLayoutResult m1074layoutNN6EwU = textDelegate.m1074layoutNN6EwU(j, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf(IntSize.m5767getWidthimpl(m1074layoutNN6EwU.m5055getSizeYbymL2g())), Integer.valueOf(IntSize.m5766getHeightimpl(m1074layoutNN6EwU.m5055getSizeYbymL2g())), m1074layoutNN6EwU);
        }

        @JvmStatic
        public final void draw$foundation_release(Canvas canvas, TextFieldValue value, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint selectionPaint) {
            int originalToTransformed;
            int originalToTransformed2;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(selectionPaint, "selectionPaint");
            if (!TextRange.m5076getCollapsedimpl(value.m5325getSelectiond9O1mEE()) && (originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5080getMinimpl(value.m5325getSelectiond9O1mEE()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m5079getMaximpl(value.m5325getSelectiond9O1mEE())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), selectionPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(TextFieldValue value, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            Rect rect;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            if (z) {
                int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5079getMaximpl(value.m5325getSelectiond9O1mEE()));
                if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed);
                } else if (originalToTransformed != 0) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
                } else {
                    rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m5766getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long mo4554localToRootMKHz9U = layoutCoordinates.mo4554localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m3058Recttz77jQw(OffsetKt.Offset(Offset.m3018getXimpl(mo4554localToRootMKHz9U), Offset.m3019getYimpl(mo4554localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(List<? extends EditCommand> ops, EditProcessor editProcessor, Function1<? super TextFieldValue, Unit> onValueChange, TextInputSession textInputSession) {
            Intrinsics.checkNotNullParameter(ops, "ops");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            TextFieldValue apply = editProcessor.apply(ops);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            onValueChange.invoke(apply);
        }

        @JvmStatic
        /* renamed from: setCursorOffset-ULxng0E$foundation_release  reason: not valid java name */
        public final void m1085setCursorOffsetULxng0E$foundation_release(long j, TextLayoutResultProxy textLayoutResult, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1<? super TextFieldValue, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m5320copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(textLayoutResult, j, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @JvmStatic
        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue value, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super ImeAction, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = textInputService.startInput(value, imeOptions, new TextFieldDelegate$Companion$restartInput$1(editProcessor, onValueChange, objectRef), onImeActionPerformed);
            return (TextInputSession) objectRef.element;
        }

        @JvmStatic
        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue value, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super ImeAction, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        @JvmStatic
        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, Function1<? super TextFieldValue, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m5320copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        /* renamed from: applyCompositionDecoration-72CqOWE  reason: not valid java name */
        public final TransformedText m1083applyCompositionDecoration72CqOWE(long j, TransformedText transformed) {
            Intrinsics.checkNotNullParameter(transformed, "transformed");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), transformed.getOffsetMapping().originalToTransformed(TextRange.m5082getStartimpl(j)), transformed.getOffsetMapping().originalToTransformed(TextRange.m5077getEndimpl(j)));
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }
    }
}
