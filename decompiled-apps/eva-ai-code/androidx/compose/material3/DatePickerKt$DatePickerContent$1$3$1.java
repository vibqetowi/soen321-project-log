package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$1$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$3$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$yearPickerVisible$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean DatePickerContent$lambda$5;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        DatePickerContent$lambda$5 = DatePickerKt.DatePickerContent$lambda$5(mutableState);
        DatePickerKt.DatePickerContent$lambda$6(mutableState, !DatePickerContent$lambda$5);
    }
}
