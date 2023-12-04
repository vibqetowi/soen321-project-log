package com.ifriend.ui.components.dialogs;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AppMessageInfoPopupKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AppMessageInfoPopupKt$lambda2$1 INSTANCE = new ComposableSingletons$AppMessageInfoPopupKt$lambda2$1();

    ComposableSingletons$AppMessageInfoPopupKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1273186585, i, -1, "com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt.lambda-2.<anonymous> (AppMessageInfoPopup.kt:37)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(mutableState);
        ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$1$1$1 rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$1$1$1(mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ButtonKt.Button(rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$AppMessageInfoPopupKt.INSTANCE.m7035getLambda1$common_ui_release(), composer, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            String stringResource = StringResources_androidKt.stringResource(R.string.no_internet_connection, composer, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.make_sure_you_are_connected, composer, 0);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.text_continue, composer, 0);
            AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(mutableState);
            ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$3$1 rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$3$1(mutableState);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Function0 function0 = rememberedValue3;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = composer.changed(mutableState);
            ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$4$1 rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ComposableSingletons$AppMessageInfoPopupKt$lambda2$1$4$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            AppMessageInfoPopupKt.AppMessageInfoPopup(stringResource, stringResource2, stringResource3, anonymousClass2, function0, (Function0) rememberedValue4, false, false, composer, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, PsExtractor.AUDIO_STREAM);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppMessageInfoPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt$lambda-2$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
