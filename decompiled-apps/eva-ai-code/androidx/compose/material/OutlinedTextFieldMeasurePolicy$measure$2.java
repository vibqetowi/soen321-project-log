package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $borderPlaceable;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$2(int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.$height = i;
        this.$width = i2;
        this.$leadingPlaceable = placeable;
        this.$trailingPlaceable = placeable2;
        this.$textFieldPlaceable = placeable3;
        this.$labelPlaceable = placeable4;
        this.$placeholderPlaceable = placeable5;
        this.$borderPlaceable = placeable6;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        float f;
        boolean z;
        PaddingValues paddingValues;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i = this.$height;
        int i2 = this.$width;
        Placeable placeable = this.$leadingPlaceable;
        Placeable placeable2 = this.$trailingPlaceable;
        Placeable placeable3 = this.$textFieldPlaceable;
        Placeable placeable4 = this.$labelPlaceable;
        Placeable placeable5 = this.$placeholderPlaceable;
        Placeable placeable6 = this.$borderPlaceable;
        f = this.this$0.animationProgress;
        z = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        LayoutDirection layoutDirection = this.$this_measure.getLayoutDirection();
        paddingValues = this.this$0.paddingValues;
        OutlinedTextFieldKt.place(layout, i, i2, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, f, z, density, layoutDirection, paddingValues);
    }
}
