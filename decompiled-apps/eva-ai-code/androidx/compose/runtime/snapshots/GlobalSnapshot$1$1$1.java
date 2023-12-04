package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GlobalSnapshot$1$1$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ List<Function1<Object, Unit>> $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$1$1$1(List<Function1<Object, Unit>> list) {
        super(1);
        this.$it = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<Function1<Object, Unit>> list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(state);
        }
    }
}
