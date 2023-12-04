package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$2$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$2$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<TextFieldValue, Unit> {
        final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<TextFieldValue> mutableState) {
            super(1);
            this.$hourValue$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$hourValue$delegate.setValue(it);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TextFieldValue newValue) {
        TextFieldValue TimeInputImpl$lambda$5;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int m1972getHourJiIwxys = Selection.Companion.m1972getHourJiIwxys();
        TimePickerState timePickerState = this.$state;
        TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
        TimePickerKt.m2168timeInputOnChangegIWD5Rc(m1972getHourJiIwxys, timePickerState, newValue, TimeInputImpl$lambda$5, this.$state.is24hour() ? 23 : 12, new AnonymousClass1(this.$hourValue$delegate));
    }
}
