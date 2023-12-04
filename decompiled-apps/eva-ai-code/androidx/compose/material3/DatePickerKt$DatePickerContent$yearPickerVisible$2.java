package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$DatePickerContent$yearPickerVisible$2 extends Lambda implements Function0<MutableState<Boolean>> {
    public static final DatePickerKt$DatePickerContent$yearPickerVisible$2 INSTANCE = new DatePickerKt$DatePickerContent$yearPickerVisible$2();

    DatePickerKt$DatePickerContent$yearPickerVisible$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<Boolean> invoke() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        return mutableStateOf$default;
    }
}
