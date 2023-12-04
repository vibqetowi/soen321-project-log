package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$4$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$4$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m2170invokeZmokQxo(keyEvent.m4277unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m2170invokeZmokQxo(android.view.KeyEvent event) {
        boolean z;
        TextFieldValue TimeInputImpl$lambda$8;
        Intrinsics.checkNotNullParameter(event, "event");
        if (KeyEvent_androidKt.m4290getUtf16CodePointZmokQxo(event) == 0) {
            TimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(this.$minuteValue$delegate);
            if (TextRange.m5082getStartimpl(TimeInputImpl$lambda$8.m5325getSelectiond9O1mEE()) == 0) {
                z = true;
                if (z) {
                    this.$state.m2188setSelectioniHAOin8$material3_release(Selection.Companion.m1972getHourJiIwxys());
                }
                return Boolean.valueOf(z);
            }
        }
        z = false;
        if (z) {
        }
        return Boolean.valueOf(z);
    }
}
