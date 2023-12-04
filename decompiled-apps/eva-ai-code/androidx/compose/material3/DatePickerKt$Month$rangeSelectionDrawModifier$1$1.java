package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$Month$rangeSelectionDrawModifier$1$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ State<SelectedRangeInfo> $rangeSelectionInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$rangeSelectionDrawModifier$1$1(State<SelectedRangeInfo> state, DatePickerColors datePickerColors) {
        super(1);
        this.$rangeSelectionInfo = state;
        this.$colors = datePickerColors;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        SelectedRangeInfo value = this.$rangeSelectionInfo.getValue();
        if (value != null) {
            DateRangePickerKt.m1745drawRangeBackgroundmxwnekA(drawWithContent, value, this.$colors.m1728getDayInSelectionRangeContainerColor0d7_KjU$material3_release());
        }
        drawWithContent.drawContent();
    }
}
