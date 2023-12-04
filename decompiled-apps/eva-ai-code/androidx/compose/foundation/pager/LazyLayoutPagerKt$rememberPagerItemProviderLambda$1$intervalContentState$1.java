package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<PagerLayoutIntervalContent> {
    final /* synthetic */ Function1<Integer, Object> $key;
    final /* synthetic */ State<Function4<PagerScope, Integer, Composer, Integer, Unit>> $latestContent;
    final /* synthetic */ Function0<Integer> $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(State<? extends Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit>> state, Function1<? super Integer, ? extends Object> function1, Function0<Integer> function0) {
        super(0);
        this.$latestContent = state;
        this.$key = function1;
        this.$pageCount = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PagerLayoutIntervalContent invoke() {
        return new PagerLayoutIntervalContent(this.$latestContent.getValue(), this.$key, this.$pageCount.invoke().intValue());
    }
}
