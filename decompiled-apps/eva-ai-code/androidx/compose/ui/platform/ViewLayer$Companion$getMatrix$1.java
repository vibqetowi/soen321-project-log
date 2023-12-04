package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "matrix", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ViewLayer$Companion$getMatrix$1 extends Lambda implements Function2<View, Matrix, Unit> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
        invoke2(view, matrix);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Matrix matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.set(view.getMatrix());
    }
}
