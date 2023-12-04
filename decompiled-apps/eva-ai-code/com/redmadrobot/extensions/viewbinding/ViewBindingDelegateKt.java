package com.redmadrobot.extensions.viewbinding;

import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
/* compiled from: ViewBindingDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0005H\u0086\b¨\u0006\u0006"}, d2 = {"viewBinding", "Lkotlin/properties/ReadOnlyProperty;", "", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "redmadrobot.viewbinding-ktx"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewBindingDelegateKt {
    public static final /* synthetic */ <VB extends ViewBinding> ReadOnlyProperty<Object, VB> viewBinding(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        return new ViewBindingDelegate(fragment, Reflection.getOrCreateKotlinClass(ViewBinding.class));
    }
}
