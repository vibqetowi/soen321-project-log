package com.ifriend.registration.presentation.ui;

import androidx.exifinterface.media.ExifInterface;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.registration.presentation.databinding.ActivityRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentActivity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "activity", "by/kirich1409/viewbindingdelegate/ActivityViewBindings$viewBinding$5", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class RegistrationActivity$special$$inlined$viewBindingActivity$default$1 extends Lambda implements Function1<RegistrationActivity, ActivityRegistrationBinding> {
    public RegistrationActivity$special$$inlined$viewBindingActivity$default$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityRegistrationBinding invoke(RegistrationActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ActivityRegistrationBinding.bind(UtilsKt.findRootView(activity));
    }
}
