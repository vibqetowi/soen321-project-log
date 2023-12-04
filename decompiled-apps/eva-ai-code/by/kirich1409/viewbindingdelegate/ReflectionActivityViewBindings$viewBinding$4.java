package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.InflateViewBinding;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/activity/ComponentActivity;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ReflectionActivityViewBindings$viewBinding$4 extends Lambda implements Function1<ComponentActivity, T> {
    final /* synthetic */ ComponentActivity $this_viewBinding;
    final /* synthetic */ Class<T> $viewBindingClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionActivityViewBindings$viewBinding$4(Class<T> cls, ComponentActivity componentActivity) {
        super(1);
        this.$viewBindingClass = cls;
        this.$this_viewBinding = componentActivity;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/activity/ComponentActivity;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InflateViewBinding inflateWithLayoutInflater = ViewBindingCache.INSTANCE.getInflateWithLayoutInflater(this.$viewBindingClass);
        LayoutInflater layoutInflater = this.$this_viewBinding.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        return inflateWithLayoutInflater.inflate(layoutInflater, null, false);
    }
}
