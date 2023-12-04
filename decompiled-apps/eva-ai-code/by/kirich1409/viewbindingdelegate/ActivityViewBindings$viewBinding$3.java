package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"Landroidx/activity/ComponentActivity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ActivityViewBindings$viewBinding$3 extends Lambda implements Function1<T, Unit> {
    public static final ActivityViewBindings$viewBinding$3 INSTANCE = new ActivityViewBindings$viewBinding$3();

    public ActivityViewBindings$viewBinding$3() {
        super(1);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(ViewBinding it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((ViewBinding) obj);
        return Unit.INSTANCE;
    }
}
