package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PermissionsUtil.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0015H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\u001a"}, d2 = {"isGranted", "", "Lcom/google/accompanist/permissions/PermissionStatus;", "isGranted$annotations", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "(Lcom/google/accompanist/permissions/PermissionStatus;)Z", "shouldShowRationale", "getShouldShowRationale$annotations", "getShouldShowRationale", "PermissionLifecycleCheckerEffect", "", "permissionState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "lifecycleEvent", "Landroidx/lifecycle/Lifecycle$Event;", "(Lcom/google/accompanist/permissions/MutablePermissionState;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "PermissionsLifecycleCheckerEffect", "permissions", "", "(Ljava/util/List;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "checkPermission", "Landroid/content/Context;", "permission", "", "findActivity", "Landroid/app/Activity;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsUtilKt {
    public static /* synthetic */ void getShouldShowRationale$annotations(PermissionStatus permissionStatus) {
    }

    public static /* synthetic */ void isGranted$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean isGranted(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        return Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE);
    }

    public static final boolean getShouldShowRationale(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        if (Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE)) {
            return false;
        }
        if (permissionStatus instanceof PermissionStatus.Denied) {
            return ((PermissionStatus.Denied) permissionStatus).getShouldShowRationale();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void PermissionLifecycleCheckerEffect(final MutablePermissionState permissionState, final Lifecycle.Event event, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer startRestartGroup = composer.startRestartGroup(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(permissionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770945943, i3, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:75)");
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(permissionState);
            LifecycleEventObserver rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$permissionCheckerObserver$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event2, "event");
                        if (event2 != Lifecycle.Event.this || Intrinsics.areEqual(permissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
                            return;
                        }
                        permissionState.refreshPermissionStatus$permissions_release();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Lifecycle lifecycle = ((LifecycleOwner) consume).getLifecycle();
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new PermissionsUtilKt$PermissionLifecycleCheckerEffect$1(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PermissionsUtilKt$PermissionLifecycleCheckerEffect$2(permissionState, event, i, i2));
    }

    public static final void PermissionsLifecycleCheckerEffect(final List<MutablePermissionState> permissions2, final Lifecycle.Event event, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        Composer startRestartGroup = composer.startRestartGroup(1533427666);
        if ((i2 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533427666, i, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:105)");
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(permissions2);
        LifecycleEventObserver rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$permissionsCheckerObserver$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event2, "event");
                    if (event2 == Lifecycle.Event.this) {
                        for (MutablePermissionState mutablePermissionState : permissions2) {
                            if (!Intrinsics.areEqual(mutablePermissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
                                mutablePermissionState.refreshPermissionStatus$permissions_release();
                            }
                        }
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Lifecycle lifecycle = ((LifecycleOwner) consume).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2(permissions2, event, i, i2));
    }

    public static final Activity findActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean checkPermission(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final boolean shouldShowRationale(Activity activity, String permission) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
