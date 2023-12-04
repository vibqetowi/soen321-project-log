package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
/* compiled from: ViewBindingProperty.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001b\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bB-\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\nH\u0017J\"\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0097\u0002¢\u0006\u0002\u0010\u0018R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0007X\u0088\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lby/kirich1409/viewbindingdelegate/LazyViewBindingProperty;", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewBinder", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onViewDestroyed", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getViewBinder", "()Lkotlin/jvm/functions/Function1;", "viewBinding", "getViewBinding", "()Ljava/lang/Object;", "setViewBinding", "(Ljava/lang/Object;)V", "clear", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public class LazyViewBindingProperty<R, T extends ViewBinding> implements ViewBindingProperty<R, T> {
    private final Function1<T, Unit> onViewDestroyed;
    private final Function1<R, T> viewBinder;
    private Object viewBinding;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyViewBindingProperty(Function1<? super T, Unit> onViewDestroyed, Function1<? super R, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.onViewDestroyed = onViewDestroyed;
        this.viewBinder = viewBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((LazyViewBindingProperty<R, T>) obj, (KProperty<?>) kProperty);
    }

    protected final Function1<R, T> getViewBinder() {
        return this.viewBinder;
    }

    /* compiled from: ViewBindingProperty.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000\"\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: by.kirich1409.viewbindingdelegate.LazyViewBindingProperty$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<T, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnonymousClass1) ((ViewBinding) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyViewBindingProperty(Function1<? super R, ? extends T> viewBinder) {
        this(AnonymousClass1.INSTANCE, viewBinder);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
    }

    protected final Object getViewBinding() {
        return this.viewBinding;
    }

    protected final void setViewBinding(Object obj) {
        this.viewBinding = obj;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(R thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj = this.viewBinding;
        T t = obj instanceof ViewBinding ? (T) obj : null;
        if (t == null) {
            T invoke = this.viewBinder.invoke(thisRef);
            setViewBinding(invoke);
            return invoke;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.ViewBindingProperty
    public void clear() {
        ViewBinding viewBinding = (ViewBinding) this.viewBinding;
        if (viewBinding != null) {
            this.onViewDestroyed.invoke(viewBinding);
        }
        this.viewBinding = null;
    }
}
