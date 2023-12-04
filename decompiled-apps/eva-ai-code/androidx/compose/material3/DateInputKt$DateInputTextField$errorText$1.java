package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DateInput.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateInputKt$DateInputTextField$errorText$1 extends Lambda implements Function0<MutableState<String>> {
    public static final DateInputKt$DateInputTextField$errorText$1 INSTANCE = new DateInputKt$DateInputTextField$errorText$1();

    DateInputKt$DateInputTextField$errorText$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        MutableState<String> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        return mutableStateOf$default;
    }
}
