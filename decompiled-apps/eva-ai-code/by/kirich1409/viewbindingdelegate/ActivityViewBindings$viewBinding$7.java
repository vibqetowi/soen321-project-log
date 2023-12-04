package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.ActivityCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/activity/ComponentActivity;", "activity", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ActivityViewBindings$viewBinding$7 extends Lambda implements Function1<ComponentActivity, T> {
    final /* synthetic */ Function1<View, T> $vbFactory;
    final /* synthetic */ int $viewBindingRootId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewBindings$viewBinding$7(Function1<? super View, ? extends T> function1, int i) {
        super(1);
        this.$vbFactory = function1;
        this.$viewBindingRootId = i;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/activity/ComponentActivity;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Function1<View, T> function1 = this.$vbFactory;
        View requireViewById = ActivityCompat.requireViewById(activity, this.$viewBindingRootId);
        Intrinsics.checkNotNullExpressionValue(requireViewById, "requireViewById(this, id)");
        return (ViewBinding) function1.invoke(requireViewById);
    }
}
