package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInHorizontally$1 extends Lambda implements Function1<Integer, Integer> {
    public static final EnterExitTransitionKt$slideInHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideInHorizontally$1();

    EnterExitTransitionKt$slideInHorizontally$1() {
        super(1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf((-i) / 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
