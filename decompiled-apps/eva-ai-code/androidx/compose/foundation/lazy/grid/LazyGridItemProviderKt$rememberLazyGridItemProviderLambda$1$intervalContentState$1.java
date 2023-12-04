package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<LazyGridIntervalContent> {
    final /* synthetic */ State<Function1<LazyGridScope, Unit>> $latestContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1(State<? extends Function1<? super LazyGridScope, Unit>> state) {
        super(0);
        this.$latestContent = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LazyGridIntervalContent invoke() {
        return new LazyGridIntervalContent(this.$latestContent.getValue());
    }
}
