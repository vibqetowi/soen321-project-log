package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$TimeInputImpl$minuteValue$2$1 extends Lambda implements Function0<MutableState<TextFieldValue>> {
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$minuteValue$2$1(TimePickerState timePickerState) {
        super(0);
        this.$state = timePickerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<TextFieldValue> invoke() {
        String localString;
        MutableState<TextFieldValue> mutableStateOf$default;
        localString = TimePickerKt.toLocalString(this.$state.getMinute(), 2);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(localString, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        return mutableStateOf$default;
    }
}
