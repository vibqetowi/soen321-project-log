package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$6$1 extends Lambda implements Function1<KeyboardActionScope, Unit> {
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$6$1(TimePickerState timePickerState) {
        super(1);
        this.$state = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KeyboardActionScope $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$state.m2188setSelectioniHAOin8$material3_release(Selection.Companion.m1973getMinuteJiIwxys());
    }
}
