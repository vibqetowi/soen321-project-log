package coil.size;

import android.view.ViewTreeObserver;
import androidx.exifinterface.media.ExifInterface;
import coil.size.ViewSizeResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewSizeResolver.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewSizeResolver$size$3$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ViewSizeResolver$size$3$preDrawListener$1 $preDrawListener;
    final /* synthetic */ ViewTreeObserver $viewTreeObserver;
    final /* synthetic */ ViewSizeResolver<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSizeResolver$size$3$1(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1) {
        super(1);
        this.this$0 = viewSizeResolver;
        this.$viewTreeObserver = viewTreeObserver;
        this.$preDrawListener = viewSizeResolver$size$3$preDrawListener$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ViewSizeResolver.CC.$private$removePreDrawListenerSafe(this.this$0, this.$viewTreeObserver, this.$preDrawListener);
    }
}
