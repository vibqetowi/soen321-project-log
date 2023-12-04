package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcoil/compose/SubcomposeAsyncImageScope;", "invoke", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeAsyncImageKt$contentOf$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> $error;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> $loading;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> $success;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeAsyncImageKt$contentOf$1(Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43) {
        super(3);
        this.$loading = function4;
        this.$success = function42;
        this.$error = function43;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
        invoke(subcomposeAsyncImageScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(subcomposeAsyncImageScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1302781228, i2, -1, "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:227)");
            }
            AsyncImagePainter.State state = subcomposeAsyncImageScope.getPainter().getState();
            boolean z = false;
            boolean z2 = true;
            if (state instanceof AsyncImagePainter.State.Loading) {
                composer.startReplaceableGroup(-418307549);
                Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> function4 = this.$loading;
                if (function4 != 0) {
                    function4.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                    Unit unit = Unit.INSTANCE;
                } else {
                    z = true;
                }
                composer.endReplaceableGroup();
            } else if (state instanceof AsyncImagePainter.State.Success) {
                composer.startReplaceableGroup(-418307455);
                Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> function42 = this.$success;
                if (function42 != 0) {
                    function42.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    z = true;
                }
                composer.endReplaceableGroup();
            } else if (!(state instanceof AsyncImagePainter.State.Error)) {
                if (state instanceof AsyncImagePainter.State.Empty) {
                    composer.startReplaceableGroup(-418307275);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-418307215);
                    composer.endReplaceableGroup();
                }
                if (z2) {
                    SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, composer, i2 & 14, 127);
                }
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            } else {
                composer.startReplaceableGroup(-418307363);
                Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> function43 = this.$error;
                if (function43 != 0) {
                    function43.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    z = true;
                }
                composer.endReplaceableGroup();
            }
            z2 = z;
            if (z2) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }
}
