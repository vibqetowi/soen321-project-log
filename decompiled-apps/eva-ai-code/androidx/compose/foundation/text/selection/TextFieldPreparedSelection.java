package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0019\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0000J\u0006\u0010\u0018\u001a\u00020\u0000J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "currentValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "layoutResultProxy", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "value", "getValue", "deleteIfSelectedOr", "", "Landroidx/compose/ui/text/input/EditCommand;", "or", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "moveCursorDownByPage", "moveCursorUpByPage", "jumpByPagesOffset", "", "pagesAmount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPreparedSelection(TextFieldValue currentValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState state) {
        super(currentValue.getAnnotatedString(), currentValue.m5325getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, state, null);
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentValue = currentValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m5320copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1148getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final List<EditCommand> deleteIfSelectedOr(Function1<? super TextFieldPreparedSelection, ? extends EditCommand> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        if (TextRange.m5076getCollapsedimpl(m1148getSelectiond9O1mEE())) {
            EditCommand invoke = or.invoke(this);
            if (invoke != null) {
                return CollectionsKt.listOf(invoke);
            }
            return null;
        }
        return CollectionsKt.listOf((Object[]) new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m5080getMinimpl(m1148getSelectiond9O1mEE()), TextRange.m5080getMinimpl(m1148getSelectiond9O1mEE()))});
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        TextFieldPreparedSelection textFieldPreparedSelection = this;
        if ((textFieldPreparedSelection.getText$foundation_release().length() > 0) && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        TextFieldPreparedSelection textFieldPreparedSelection = this;
        if ((textFieldPreparedSelection.getText$foundation_release().length() > 0) && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i) {
        Rect zero;
        LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            LayoutCoordinates decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates();
            zero = decorationBoxCoordinates != null ? LayoutCoordinates.CC.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
        }
        zero = Rect.Companion.getZero();
        Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(TextRange.m5077getEndimpl(this.currentValue.m5325getSelectiond9O1mEE())));
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m5054getOffsetForPositionk4lQ0M(OffsetKt.Offset(cursorRect.getLeft(), cursorRect.getTop() + (Size.m3084getHeightimpl(zero.m3051getSizeNHjbRc()) * i))));
    }
}
