package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/DateRangePickerState;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerState$Companion$Saver$2 extends Lambda implements Function1<Object, DateRangePickerState> {
    public static final DateRangePickerState$Companion$Saver$2 INSTANCE = new DateRangePickerState$Companion$Saver$2();

    DateRangePickerState$Companion$Saver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final DateRangePickerState invoke(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StateData restore = StateData.Companion.Saver().restore(value);
        Intrinsics.checkNotNull(restore);
        return new DateRangePickerState(restore, null);
    }
}
