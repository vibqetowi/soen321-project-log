package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1 extends Lambda implements Function0<LazyLayoutItemProvider> {
    final /* synthetic */ State<Function0<LazyLayoutItemProvider>> $currentItemProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(State<? extends Function0<? extends LazyLayoutItemProvider>> state) {
        super(0);
        this.$currentItemProvider = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LazyLayoutItemProvider invoke() {
        return this.$currentItemProvider.getValue().invoke();
    }
}
