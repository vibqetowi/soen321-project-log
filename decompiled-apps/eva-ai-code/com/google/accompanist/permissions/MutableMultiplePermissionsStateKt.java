package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0001¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"rememberMutableMultiplePermissionsState", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions", "", "", "onPermissionsResult", "Lkotlin/Function1;", "", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;", "rememberMutablePermissionsState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutableMultiplePermissionsStateKt {
    public static final MultiplePermissionsState rememberMutableMultiplePermissionsState(List<String> permissions2, Function1<? super Map<String, Boolean>, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        composer.startReplaceableGroup(-2044770427);
        if ((i2 & 2) != 0) {
            function1 = MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2044770427, i, -1, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)");
        }
        List<MutablePermissionState> rememberMutablePermissionsState = rememberMutablePermissionsState(permissions2, composer, 8);
        PermissionsUtilKt.PermissionsLifecycleCheckerEffect(rememberMutablePermissionsState, null, composer, 8, 2);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(permissions2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MutableMultiplePermissionsState(rememberMutablePermissionsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableMultiplePermissionsState mutableMultiplePermissionsState = (MutableMultiplePermissionsState) rememberedValue;
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(mutableMultiplePermissionsState) | composer.changed(function1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = (Function1) new MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1(mutableMultiplePermissionsState, function1);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) rememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutableMultiplePermissionsState, rememberLauncherForActivityResult, new MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2(mutableMultiplePermissionsState, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableMultiplePermissionsState;
    }

    private static final List<MutablePermissionState> rememberMutablePermissionsState(List<String> list, Composer composer, int i) {
        composer.startReplaceableGroup(992349447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992349447, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        Activity findActivity = PermissionsUtilKt.findActivity(context);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(list);
        ArrayList rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str : list2) {
                arrayList.add(new MutablePermissionState(str, context, findActivity));
            }
            rememberedValue = arrayList;
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        List<MutablePermissionState> list3 = (List) rememberedValue;
        for (MutablePermissionState mutablePermissionState : list3) {
            composer.startMovableGroup(-1458104076, mutablePermissionState.getPermission());
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(mutablePermissionState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = (Function1) new MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1(mutablePermissionState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8);
            EffectsKt.DisposableEffect(rememberLauncherForActivityResult, new MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1(mutablePermissionState, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable);
            composer.endMovableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return list3;
    }
}
