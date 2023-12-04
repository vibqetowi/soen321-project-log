package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$Month$1$1$1$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ long $dateInMillis;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$Month$1$1$1$1$1$1$1(Function1<? super Long, Unit> function1, long j) {
        super(0);
        this.$onDateSelected = function1;
        this.$dateInMillis = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDateSelected.invoke(Long.valueOf(this.$dateInMillis));
    }
}
