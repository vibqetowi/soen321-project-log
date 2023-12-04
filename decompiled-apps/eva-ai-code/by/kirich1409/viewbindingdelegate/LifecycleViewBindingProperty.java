package by.kirich1409.viewbindingdelegate;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
/* compiled from: ViewBindingProperty.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u0000 !*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0002 !B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\tH\u0017J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0097\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0018J\r\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001fR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\u0007X\u0088\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0001X\u0088\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\""}, d2 = {"Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewBinder", "Lkotlin/Function1;", "onViewDestroyed", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "clear", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "getValue", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "isViewInitialized", "", "(Ljava/lang/Object;)Z", "postClear", "postClear$com_github_kirich1409_ViewBindingPropertyDelegate_noreflection", "runStrictModeChecks", "(Ljava/lang/Object;)V", "viewNotInitializedReadableErrorMessage", "", "(Ljava/lang/Object;)Ljava/lang/String;", "ClearOnDestroyLifecycleObserver", "Companion", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LifecycleViewBindingProperty<R, T extends ViewBinding> implements ViewBindingProperty<R, T> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Function1<T, Unit> onViewDestroyed;
    private final Function1<R, T> viewBinder;
    private T viewBinding;

    protected abstract LifecycleOwner getLifecycleOwner(R r);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isViewInitialized(R thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String viewNotInitializedReadableErrorMessage(R thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return "Host view isn't ready. LifecycleViewBindingProperty.isViewInitialized return false";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewBindingProperty(Function1<? super R, ? extends T> viewBinder, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        this.viewBinder = viewBinder;
        this.onViewDestroyed = onViewDestroyed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((LifecycleViewBindingProperty<R, T>) obj, (KProperty<?>) kProperty);
    }

    /* compiled from: ViewBindingProperty.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000\"\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty$1  reason: invalid class name */
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

    public /* synthetic */ LifecycleViewBindingProperty(Function1 function1, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(R thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        UtilsKt.checkMainThread("access to ViewBinding from non UI (Main) thread");
        T t = this.viewBinding;
        if (t == null) {
            if (!isViewInitialized(thisRef)) {
                throw new IllegalStateException(viewNotInitializedReadableErrorMessage(thisRef).toString());
            }
            if (ViewBindingPropertyDelegate.INSTANCE.getStrictMode()) {
                runStrictModeChecks(thisRef);
            }
            Lifecycle lifecycle = getLifecycleOwner(thisRef).getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "getLifecycleOwner(thisRef).lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                this.viewBinding = null;
                Log.w("ViewBindingProperty", "Access to viewBinding after Lifecycle is destroyed or hasn't created yet. The instance of viewBinding will be not cached.");
                return this.viewBinder.invoke(thisRef);
            }
            T invoke = this.viewBinder.invoke(thisRef);
            lifecycle.addObserver(new ClearOnDestroyLifecycleObserver(this));
            this.viewBinding = invoke;
            return invoke;
        }
        return t;
    }

    private final void runStrictModeChecks(R r) {
        Lifecycle lifecycle = getLifecycleOwner(r).getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "getLifecycleOwner(thisRef).lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("Access to viewBinding after Lifecycle is destroyed or hasn't created yet. The instance of viewBinding will be not cached.".toString());
        }
    }

    @Override // by.kirich1409.viewbindingdelegate.ViewBindingProperty
    public void clear() {
        UtilsKt.checkMainThread();
        T t = this.viewBinding;
        this.viewBinding = null;
        if (t != null) {
            this.onViewDestroyed.invoke(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postClear$lambda-1  reason: not valid java name */
    public static final void m6150postClear$lambda1(LifecycleViewBindingProperty this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clear();
    }

    public final void postClear$com_github_kirich1409_ViewBindingPropertyDelegate_noreflection() {
        if (mainHandler.post(new Runnable() { // from class: by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LifecycleViewBindingProperty.m6150postClear$lambda1(LifecycleViewBindingProperty.this);
            }
        })) {
            return;
        }
        clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewBindingProperty.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty$ClearOnDestroyLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "property", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "(Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;)V", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ClearOnDestroyLifecycleObserver implements DefaultLifecycleObserver {
        private final LifecycleViewBindingProperty<?, ?> property;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        public ClearOnDestroyLifecycleObserver(LifecycleViewBindingProperty<?, ?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.property.postClear$com_github_kirich1409_ViewBindingPropertyDelegate_noreflection();
        }
    }

    /* compiled from: ViewBindingProperty.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty$Companion;", "", "()V", "mainHandler", "Landroid/os/Handler;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
