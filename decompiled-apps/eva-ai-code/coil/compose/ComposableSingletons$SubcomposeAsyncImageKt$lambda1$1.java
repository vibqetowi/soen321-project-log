package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcoil/compose/SubcomposeAsyncImageScope;", "invoke", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 INSTANCE = new ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1();

    ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
        invoke(subcomposeAsyncImageScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1692951203, i2, -1, "coil.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda-1.<anonymous> (SubcomposeAsyncImage.kt:238)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, composer, i2 & 14, 127);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
