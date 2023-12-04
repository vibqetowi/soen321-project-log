package com.google.accompanist.permissions;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MutablePermissionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberMutablePermissionState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "permission", "", "onPermissionResult", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MutablePermissionState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutablePermissionStateKt {
    public static final MutablePermissionState rememberMutablePermissionState(String permission, Function1<? super Boolean, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        composer.startReplaceableGroup(1424240517);
        if ((i2 & 2) != 0) {
            function1 = MutablePermissionStateKt$rememberMutablePermissionState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1424240517, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:47)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(permission);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MutablePermissionState(permission, context, PermissionsUtilKt.findActivity(context));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutablePermissionState mutablePermissionState = (MutablePermissionState) rememberedValue;
        PermissionsUtilKt.PermissionLifecycleCheckerEffect(mutablePermissionState, null, composer, 0, 2);
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(mutablePermissionState) | composer.changed(function1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = (Function1) new MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1(mutablePermissionState, function1);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutablePermissionState, rememberLauncherForActivityResult, new MutablePermissionStateKt$rememberMutablePermissionState$2(mutablePermissionState, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutablePermissionState;
    }
}
