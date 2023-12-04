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
final class TimePickerKt$TimeInputImpl$1$1$1$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m2169invokeZmokQxo(keyEvent.m4277unboximpl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r6.getText().length() == 2) goto L11;
     */
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m2169invokeZmokQxo(android.view.KeyEvent event) {
        TextFieldValue TimeInputImpl$lambda$5;
        TextFieldValue TimeInputImpl$lambda$52;
        Intrinsics.checkNotNullParameter(event, "event");
        int m4290getUtf16CodePointZmokQxo = KeyEvent_androidKt.m4290getUtf16CodePointZmokQxo(event);
        boolean z = true;
        if (48 <= m4290getUtf16CodePointZmokQxo && m4290getUtf16CodePointZmokQxo < 58) {
            TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
            if (TextRange.m5082getStartimpl(TimeInputImpl$lambda$5.m5325getSelectiond9O1mEE()) == 2) {
                TimeInputImpl$lambda$52 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
            }
        }
        z = false;
        if (z) {
            this.$state.m2188setSelectioniHAOin8$material3_release(Selection.Companion.m1973getMinuteJiIwxys());
        }
        return false;
    }
}
