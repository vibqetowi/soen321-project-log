package com.ifriend.ui.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
/* compiled from: CoroutineUtils.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072$\b\b\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a[\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072$\b\b\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"launchWithLifecycle", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "fragment", "Landroidx/fragment/app/Fragment;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineUtilsKt {
    public static /* synthetic */ Job launchWithLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 action, int i, Object obj) {
        Job launch$default;
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State minActiveState = state;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.needClassReification();
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new CoroutineUtilsKt$launchWithLifecycle$1(flow, lifecycleOwner, minActiveState, action, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ <T> Job launchWithLifecycle(Flow<? extends T> flow, LifecycleOwner lifecycleOwner, Lifecycle.State minActiveState, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.needClassReification();
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new CoroutineUtilsKt$launchWithLifecycle$1(flow, lifecycleOwner, minActiveState, action, null), 3, null);
        return launch$default;
    }

    public static /* synthetic */ Job launchWithLifecycle$default(Flow flow, Fragment fragment, Lifecycle.State state, Function2 action, int i, Object obj) {
        Job launch$default;
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State minActiveState = state;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Intrinsics.needClassReification();
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CoroutineUtilsKt$launchWithLifecycle$$inlined$launchWithLifecycle$1(flow, viewLifecycleOwner, minActiveState, action, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ <T> Job launchWithLifecycle(Flow<? extends T> flow, Fragment fragment, Lifecycle.State minActiveState, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Intrinsics.needClassReification();
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CoroutineUtilsKt$launchWithLifecycle$$inlined$launchWithLifecycle$1(flow, viewLifecycleOwner, minActiveState, action, null), 3, null);
        return launch$default;
    }
}
