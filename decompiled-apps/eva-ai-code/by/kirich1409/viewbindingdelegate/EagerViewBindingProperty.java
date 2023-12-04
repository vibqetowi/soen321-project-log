package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
/* compiled from: ViewBindingProperty.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0017J\"\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0097\u0002¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0006\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"Lby/kirich1409/viewbindingdelegate/EagerViewBindingProperty;", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "clear", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public class EagerViewBindingProperty<R, T extends ViewBinding> implements ViewBindingProperty<R, T> {
    private final T viewBinding;

    @Override // by.kirich1409.viewbindingdelegate.ViewBindingProperty
    public void clear() {
    }

    public EagerViewBindingProperty(T viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        this.viewBinding = viewBinding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((EagerViewBindingProperty<R, T>) obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(R thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.viewBinding;
    }
}
