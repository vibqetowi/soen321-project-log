package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/StateData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StateData$Companion$Saver$1 extends Lambda implements Function2<SaverScope, StateData, List<? extends Object>> {
    public static final StateData$Companion$Saver$1 INSTANCE = new StateData$Companion$Saver$1();

    StateData$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(SaverScope listSaver, StateData it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[6];
        CalendarDate value = it.getSelectedStartDate().getValue();
        objArr[0] = value != null ? Long.valueOf(value.getUtcTimeMillis()) : null;
        CalendarDate value2 = it.getSelectedEndDate().getValue();
        objArr[1] = value2 != null ? Long.valueOf(value2.getUtcTimeMillis()) : null;
        objArr[2] = Long.valueOf(it.getDisplayedMonth().getStartUtcTimeMillis());
        objArr[3] = Integer.valueOf(it.getYearRange().getFirst());
        objArr[4] = Integer.valueOf(it.getYearRange().getLast());
        objArr[5] = Integer.valueOf(it.getDisplayMode().getValue().m1765unboximpl());
        return CollectionsKt.listOf(objArr);
    }
}
