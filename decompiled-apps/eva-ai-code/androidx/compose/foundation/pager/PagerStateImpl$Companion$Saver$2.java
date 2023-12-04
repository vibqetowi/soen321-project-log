package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerStateImpl;", "it", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PagerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, PagerStateImpl> {
    public static final PagerStateImpl$Companion$Saver$2 INSTANCE = new PagerStateImpl$Companion$Saver$2();

    PagerStateImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ PagerStateImpl invoke(List list) {
        return invoke2((List<? extends Object>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final PagerStateImpl invoke2(List<? extends Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = it.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new PagerStateImpl(intValue, ((Float) obj2).floatValue(), new AnonymousClass1(it));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Integer> {
        final /* synthetic */ List<Object> $it;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<? extends Object> list) {
            super(0);
            this.$it = list;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Object obj = this.$it.get(2);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }
    }
}
