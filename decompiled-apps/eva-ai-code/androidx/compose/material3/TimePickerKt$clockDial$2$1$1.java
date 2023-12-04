package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$clockDial$2$1$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$clockDial$2$1$1(TimePickerState timePickerState) {
        super(1);
        this.$state = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m2171invokeozmzZPI(intSize.m5771unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m2171invokeozmzZPI(long j) {
        this.$state.m2187setCentergyyYBs$material3_release(IntSizeKt.m5773getCenterozmzZPI(j));
    }
}
