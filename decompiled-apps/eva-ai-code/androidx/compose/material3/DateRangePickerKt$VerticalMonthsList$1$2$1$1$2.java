package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ String $scrollToNextMonthLabel;
    final /* synthetic */ String $scrollToPreviousMonthLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        super(1);
        this.$lazyListState = lazyListState;
        this.$coroutineScope = coroutineScope;
        this.$scrollToPreviousMonthLabel = str;
        this.$scrollToNextMonthLabel = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        List customScrollActions;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        customScrollActions = DateRangePickerKt.customScrollActions(this.$lazyListState, this.$coroutineScope, this.$scrollToPreviousMonthLabel, this.$scrollToNextMonthLabel);
        SemanticsPropertiesKt.setCustomActions(semantics, customScrollActions);
    }
}
