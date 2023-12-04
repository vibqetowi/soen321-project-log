package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.ui.components.insets.InsetsKt;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileMenuContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt$ProfileMenuContent$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ ProfileMenuNavigator $navigator;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ ProfileMenuUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuContent$1(long j, ProfileMenuUiState profileMenuUiState, Function0<Unit> function0, ProfileMenuNavigator profileMenuNavigator, int i) {
        super(3);
        this.$backgroundColor = j;
        this.$state = profileMenuUiState;
        this.$onDismiss = function0;
        this.$navigator = profileMenuNavigator;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v37 */
    public final void invoke(BoxScope ModalTopSheet, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ModalTopSheet, "$this$ModalTopSheet");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1993311402, i, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuContent.<anonymous> (ProfileMenuContent.kt:74)");
            }
            float f = 0;
            float f2 = 30;
            Modifier noIndicationClickable$default = ClickableModifierKt.noIndicationClickable$default(BackgroundKt.m420backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.$backgroundColor, RoundedCornerShapeKt.m1010RoundedCornerShapea9UjIt4(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2))), false, AnonymousClass1.INSTANCE, 1, null);
            ProfileMenuUiState profileMenuUiState = this.$state;
            Function0<Unit> function0 = this.$onDismiss;
            ProfileMenuNavigator profileMenuNavigator = this.$navigator;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(noIndicationClickable$default);
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
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            InsetsKt.m7043StatusBarInsetIv8Zu3U(0L, composer, 0, 1);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(28)), composer, 6);
            composer.startReplaceableGroup(-1308127900);
            if (profileMenuUiState.isConfirmEmailVisible()) {
                String stringResource = StringResources_androidKt.stringResource(R.string.profile_menu__confirm_email, composer, 0);
                composer.startReplaceableGroup(-546522171);
                ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(function0) | composer.changed(profileMenuNavigator);
                ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$1(function0, profileMenuNavigator);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                i2 = -546522171;
                ProfileMenuContentKt.ProfileMenuItem(stringResource, rememberedValue, ComposableSingletons$ProfileMenuContentKt.INSTANCE.m6948getLambda1$presentation_release(), composer, 384, 0);
            } else {
                i2 = -546522171;
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1308126845);
            if (profileMenuUiState.isEditBotVisible()) {
                String stringResource2 = StringResources_androidKt.stringResource(R.string.profile_menu__edit_bot, new Object[]{profileMenuUiState.getBotName()}, composer, 64);
                composer.startReplaceableGroup(i2);
                ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = composer.changed(function0) | composer.changed(profileMenuNavigator);
                ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$2 rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$2(function0, profileMenuNavigator);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                ProfileMenuContentKt.ProfileMenuItem(stringResource2, rememberedValue2, null, composer, 0, 4);
            }
            composer.endReplaceableGroup();
            String stringResource3 = StringResources_androidKt.stringResource(R.string.profile_menu__edit_profile, composer, 0);
            composer.startReplaceableGroup(i2);
            ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = composer.changed(function0) | composer.changed(profileMenuNavigator);
            ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$3 rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$3(function0, profileMenuNavigator);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ProfileMenuContentKt.ProfileMenuItem(stringResource3, rememberedValue3, null, composer, 0, 4);
            composer.startReplaceableGroup(-1308126184);
            if (profileMenuUiState.isNeuronsItemVisible()) {
                String stringResource4 = StringResources_androidKt.stringResource(R.string.profile_menu__add_neurons, composer, 0);
                composer.startReplaceableGroup(i2);
                ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed4 = composer.changed(function0) | composer.changed(profileMenuNavigator);
                ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$4 rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$4(function0, profileMenuNavigator);
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                ProfileMenuContentKt.ProfileMenuItem(stringResource4, rememberedValue4, ComposableLambdaKt.composableLambda(composer, 2107029651, true, new ProfileMenuContentKt$ProfileMenuContent$1$2$5(profileMenuUiState)), composer, 384, 0);
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1308124839);
            if (profileMenuUiState.isUpgradeVisible()) {
                composer.startReplaceableGroup(i2);
                ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed5 = composer.changed(function0) | composer.changed(profileMenuNavigator);
                ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$5 rememberedValue5 = composer.rememberedValue();
                if (changed5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$5(function0, profileMenuNavigator);
                    composer.updateRememberedValue(rememberedValue5);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                ProfileMenuContentKt.UpgradeItem((Function0) rememberedValue5, composer, 0);
            }
            composer.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM()), composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileMenuContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.menu.view.ProfileMenuContentKt$ProfileMenuContent$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
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
