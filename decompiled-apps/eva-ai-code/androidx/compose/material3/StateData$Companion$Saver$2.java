package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/StateData;", "value", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StateData$Companion$Saver$2 extends Lambda implements Function1<List, StateData> {
    public static final StateData$Companion$Saver$2 INSTANCE = new StateData$Companion$Saver$2();

    StateData$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StateData invoke(List list) {
        return invoke2((List<? extends Object>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final StateData invoke2(List<? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Long l = (Long) value.get(0);
        Long l2 = (Long) value.get(1);
        Long l3 = (Long) value.get(2);
        Object obj = value.get(3);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = value.get(4);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        IntRange intRange = new IntRange(intValue, ((Integer) obj2).intValue());
        Object obj3 = value.get(5);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        return new StateData(l, l2, l3, intRange, DisplayMode.m1760constructorimpl(((Integer) obj3).intValue()), null);
    }
}
