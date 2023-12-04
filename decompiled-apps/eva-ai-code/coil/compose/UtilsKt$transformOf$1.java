package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import coil.compose.AsyncImagePainter;
import coil.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", "state", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt$transformOf$1 extends Lambda implements Function1<AsyncImagePainter.State, AsyncImagePainter.State> {
    final /* synthetic */ Painter $error;
    final /* synthetic */ Painter $fallback;
    final /* synthetic */ Painter $placeholder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$transformOf$1(Painter painter, Painter painter2, Painter painter3) {
        super(1);
        this.$placeholder = painter;
        this.$fallback = painter2;
        this.$error = painter3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AsyncImagePainter.State invoke(AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            Painter painter = this.$placeholder;
            AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
            if (painter != null) {
                loading = loading.copy(painter);
            }
            return loading;
        } else if (state instanceof AsyncImagePainter.State.Error) {
            AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
            if (error.getResult().getThrowable() instanceof NullRequestDataException) {
                Painter painter2 = this.$fallback;
                if (painter2 != null) {
                    error = AsyncImagePainter.State.Error.copy$default(error, painter2, null, 2, null);
                }
            } else {
                Painter painter3 = this.$error;
                if (painter3 != null) {
                    error = AsyncImagePainter.State.Error.copy$default(error, painter3, null, 2, null);
                }
            }
            return error;
        } else {
            return state;
        }
    }
}
