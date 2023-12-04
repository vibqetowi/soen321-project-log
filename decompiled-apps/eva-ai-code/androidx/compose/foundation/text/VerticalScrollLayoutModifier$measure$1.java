package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ VerticalScrollLayoutModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = verticalScrollLayoutModifier;
        this.$placeable = placeable;
        this.$height = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Rect cursorRectInScroller;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        MeasureScope measureScope = this.$this_measure;
        int cursorOffset = this.this$0.getCursorOffset();
        TransformedText transformedText = this.this$0.getTransformedText();
        TextLayoutResultProxy invoke = this.this$0.getTextLayoutResultProvider().invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(measureScope, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, false, this.$placeable.getWidth());
        this.this$0.getScrollerPosition().update(Orientation.Vertical, cursorRectInScroller, this.$height, this.$placeable.getHeight());
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, MathKt.roundToInt(-this.this$0.getScrollerPosition().getOffset()), 0.0f, 4, null);
    }
}
