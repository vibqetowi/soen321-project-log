package by.kirich1409.viewbindingdelegate;

import android.app.Activity;
import android.view.View;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivityViewBindings.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ActivityViewBindings$viewBinding$2 extends FunctionReferenceImpl implements Function1<Activity, View> {
    public static final ActivityViewBindings$viewBinding$2 INSTANCE = new ActivityViewBindings$viewBinding$2();

    public ActivityViewBindings$viewBinding$2() {
        super(1, UtilsKt.class, "findRootView", "findRootView(Landroid/app/Activity;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return UtilsKt.findRootView(p0);
    }
}
