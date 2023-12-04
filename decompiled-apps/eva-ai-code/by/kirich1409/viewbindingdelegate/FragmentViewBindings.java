package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aZ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001aZ\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007¢\u0006\u0002\b\u000e\u001a[\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u000f\u001aa\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0006\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00110\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u001aw\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0006\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\n\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000f\u001aU\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u001ak\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00142\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"dialogFragmentViewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "F", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Landroidx/viewbinding/ViewBinding;", "onViewDestroyed", "Lkotlin/Function1;", "", "viewBinder", "viewNeedInitialization", "", "fragmentViewBinding", "viewBinding", "viewBindingFragment", "viewBindingFragmentWithCallbacks", "vbFactory", "Landroid/view/View;", "viewProvider", "viewBindingRootId", "", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentViewBindings {
    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragment(Fragment fragment, Function1<? super F, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return viewBindingFragmentWithCallbacks(fragment, viewBinder, UtilsKt.emptyVbCallback());
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragmentWithCallbacks$default(Fragment fragment, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = FragmentViewBindings$viewBinding$1.INSTANCE;
        }
        return viewBindingFragmentWithCallbacks(fragment, function1, function12);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragmentWithCallbacks(Fragment fragment, Function1<? super F, ? extends T> viewBinder, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return fragment instanceof DialogFragment ? dialogFragmentViewBinding$default(onViewDestroyed, viewBinder, false, 4, null) : fragmentViewBinding$default(onViewDestroyed, viewBinder, false, 4, null);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(Fragment fragment, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = FragmentViewBindings$viewBinding$2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$5(vbFactory, viewProvider), UtilsKt.emptyVbCallback());
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragment(Fragment fragment, Function1<? super View, ? extends T> vbFactory, Function1<? super F, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$5(vbFactory, viewProvider), UtilsKt.emptyVbCallback());
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragmentWithCallbacks$default(Fragment fragment, Function1 vbFactory, Function1 viewProvider, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = FragmentViewBindings$viewBinding$3.INSTANCE;
        }
        if ((i & 4) != 0) {
            onViewDestroyed = FragmentViewBindings$viewBinding$4.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$5(vbFactory, viewProvider), onViewDestroyed);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragmentWithCallbacks(Fragment fragment, Function1<? super View, ? extends T> vbFactory, Function1<? super F, ? extends View> viewProvider, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$5(vbFactory, viewProvider), onViewDestroyed);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragment(Fragment fragment, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (fragment instanceof DialogFragment) {
            return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$$inlined$viewBindingFragmentWithCallbacks$1(vbFactory, i), emptyVbCallback);
        }
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$$inlined$viewBindingFragmentWithCallbacks$2(vbFactory, i), emptyVbCallback);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> viewBindingFragmentWithCallbacks(Fragment fragment, Function1<? super View, ? extends T> vbFactory, int i, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        if (fragment instanceof DialogFragment) {
            return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$$inlined$viewBindingFragmentWithCallbacks$1(vbFactory, i), onViewDestroyed);
        }
        return viewBindingFragmentWithCallbacks(fragment, new FragmentViewBindings$viewBinding$$inlined$viewBindingFragmentWithCallbacks$2(vbFactory, i), onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty fragmentViewBinding$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return fragmentViewBinding(function1, function12, z);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> fragmentViewBinding(Function1<? super T, Unit> onViewDestroyed, Function1<? super F, ? extends T> viewBinder, boolean z) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new FragmentViewBindingProperty(z, viewBinder, onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty dialogFragmentViewBinding$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return dialogFragmentViewBinding(function1, function12, z);
    }

    public static final <F extends Fragment, T extends ViewBinding> ViewBindingProperty<F, T> dialogFragmentViewBinding(Function1<? super T, Unit> onViewDestroyed, Function1<? super F, ? extends T> viewBinder, boolean z) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new DialogFragmentViewBindingProperty(z, viewBinder, onViewDestroyed);
    }
}
