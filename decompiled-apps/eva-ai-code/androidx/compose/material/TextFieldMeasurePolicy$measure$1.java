package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $effectiveLabelBaseline;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $lastBaseline;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i, int i2, int i3, int i4, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i5, int i6, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$topPaddingValue = i;
        this.$lastBaseline = i2;
        this.$width = i3;
        this.$height = i4;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i5;
        this.$topPadding = i6;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        boolean z;
        PaddingValues paddingValues;
        boolean z2;
        float f;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (this.$labelPlaceable != null) {
            int coerceAtLeast = RangesKt.coerceAtLeast(this.$topPaddingValue - this.$lastBaseline, 0);
            int i = this.$width;
            int i2 = this.$height;
            Placeable placeable = this.$textFieldPlaceable;
            Placeable placeable2 = this.$labelPlaceable;
            Placeable placeable3 = this.$placeholderPlaceable;
            Placeable placeable4 = this.$leadingPlaceable;
            Placeable placeable5 = this.$trailingPlaceable;
            z2 = this.this$0.singleLine;
            int i3 = this.$topPadding + this.$effectiveLabelBaseline;
            f = this.this$0.animationProgress;
            TextFieldKt.placeWithLabel(layout, i, i2, placeable, placeable2, placeable3, placeable4, placeable5, z2, coerceAtLeast, i3, f, this.$this_measure.getDensity());
            return;
        }
        int i4 = this.$width;
        int i5 = this.$height;
        Placeable placeable6 = this.$textFieldPlaceable;
        Placeable placeable7 = this.$placeholderPlaceable;
        Placeable placeable8 = this.$leadingPlaceable;
        Placeable placeable9 = this.$trailingPlaceable;
        z = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        paddingValues = this.this$0.paddingValues;
        TextFieldKt.placeWithoutLabel(layout, i4, i5, placeable6, placeable7, placeable8, placeable9, z, density, paddingValues);
    }
}
