package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "needle", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 extends Lambda implements Function1<Object, Integer> {
    final /* synthetic */ Function0<LazyLayoutItemProvider> $itemProviderLambda;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(Function0<? extends LazyLayoutItemProvider> function0) {
        super(1);
        this.$itemProviderLambda = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object needle) {
        Intrinsics.checkNotNullParameter(needle, "needle");
        LazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
        int itemCount = invoke.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(invoke.getKey(i), needle)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
