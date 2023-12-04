package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.models.TopicPopupDataUi;
import com.ifriend.ui.components.buttons.ColoredButtonKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PremiumTopicPopupContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PremiumTopicPopupContentKt$PremiumTopicPopupContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<Boolean, Unit> $onPermissionGranted;
    final /* synthetic */ Function0<Unit> $onRemindClick;
    final /* synthetic */ ChatTopicsUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumTopicPopupContentKt$PremiumTopicPopupContent$2(ChatTopicsUiState chatTopicsUiState, Function1<? super Boolean, Unit> function1, int i, Function0<Unit> function0) {
        super(2);
        this.$state = chatTopicsUiState;
        this.$onPermissionGranted = function1;
        this.$$dirty = i;
        this.$onRemindClick = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240968831, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContent.<anonymous> (PremiumTopicPopupContent.kt:79)");
            }
            TopicPopupDataUi popupData = this.$state.getPopupData();
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), this.$onPermissionGranted, composer, ((this.$$dirty >> 3) & 112) | 8);
            AnimatedVisibilityKt.AnimatedVisibility(this.$state.isVisiblePopupPermissionInfo(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer, AppTheme.$stable).getMedium(), AppTheme.INSTANCE.getAnimationDuration(composer, AppTheme.$stable).getShort(), null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer, AppTheme.$stable).getMedium(), 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableSingletons$PremiumTopicPopupContentKt.INSTANCE.m6921getLambda2$presentation_release(), composer, (int) ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            AnimatedVisibilityKt.AnimatedVisibility(!this.$state.isVisiblePopupPermissionInfo(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer, AppTheme.$stable).getMedium(), 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer, AppTheme.$stable).getMedium(), 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composer, 1835983950, true, new AnonymousClass1(rememberLauncherForActivityResult, popupData, this.$onRemindClick, this.$onPermissionGranted)), composer, (int) ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PremiumTopicPopupContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $onPermissionGranted;
        final /* synthetic */ Function0<Unit> $onRemindClick;
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $permissionLauncher;
        final /* synthetic */ TopicPopupDataUi $popupData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, TopicPopupDataUi topicPopupDataUi, Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
            super(3);
            this.$permissionLauncher = managedActivityResultLauncher;
            this.$popupData = topicPopupDataUi;
            this.$onRemindClick = function0;
            this.$onPermissionGranted = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r102v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v10 */
        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            String str;
            String str2;
            String str3;
            Function1<Boolean, Unit> function1;
            Function0<Unit> function0;
            ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher;
            int i2;
            TopicPopupDataUi topicPopupDataUi;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1835983950, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContent.<anonymous>.<anonymous> (PremiumTopicPopupContent.kt:118)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2 = this.$permissionLauncher;
            TopicPopupDataUi topicPopupDataUi2 = this.$popupData;
            Function0<Unit> function02 = this.$onRemindClick;
            Function1<Boolean, Unit> function12 = this.$onPermissionGranted;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
            SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer, 0);
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Integer iconResId = topicPopupDataUi2 != null ? topicPopupDataUi2.getIconResId() : null;
            composer.startReplaceableGroup(-1685297886);
            if (iconResId != null) {
                str = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
                str2 = "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo";
                str3 = "C77@3893L9:Column.kt#2w3rfo";
                i2 = -483455358;
                function1 = function12;
                function0 = function02;
                managedActivityResultLauncher = managedActivityResultLauncher2;
                topicPopupDataUi = topicPopupDataUi2;
                ImageKt.Image(PainterResources_androidKt.painterResource(iconResId.intValue(), composer, 0), "", SizeKt.m795size3ABfNKs(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopCenter()), Dp.m5607constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) composer, 56, 120);
            } else {
                str = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
                str2 = "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo";
                str3 = "C77@3893L9:Column.kt#2w3rfo";
                function1 = function12;
                function0 = function02;
                managedActivityResultLauncher = managedActivityResultLauncher2;
                i2 = -483455358;
                topicPopupDataUi = topicPopupDataUi2;
            }
            composer.endReplaceableGroup();
            float f = 32;
            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(16), 0.0f, 0.0f, 13, null), Dp.m5607constructorimpl(f), 0.0f, 2, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7101getLight100d7_KjU(), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(20)));
            composer.startReplaceableGroup(i2);
            ComposerKt.sourceInformation(composer, str2);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, str);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl3, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, str3);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(80), 0.0f, 0.0f, 13, null), 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null);
            String title = topicPopupDataUi != null ? topicPopupDataUi.getTitle() : null;
            String str4 = title == null ? "" : title;
            TopicPopupDataUi topicPopupDataUi3 = topicPopupDataUi;
            ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3 = managedActivityResultLauncher;
            TextKt.m2145Text4IGK_g(str4, m750paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4294967295L), TextUnitKt.getSp(36), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGeneralSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65532);
            Modifier m750paddingVpY3zN4$default2 = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m5607constructorimpl(36), 0.0f, Dp.m5607constructorimpl(f), 5, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null);
            String message = topicPopupDataUi3 != null ? topicPopupDataUi3.getMessage() : null;
            String str5 = message != null ? message : "";
            String str6 = str5;
            TextKt.m2145Text4IGK_g(str6, m750paddingVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4294967295L), TextUnitKt.getSp(14), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGeneralSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 13, null), Dp.m5607constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null);
            int i3 = ManagedActivityResultLauncher.$stable;
            composer.startReplaceableGroup(-264211419);
            ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1)");
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(managedActivityResultLauncher3);
            PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1$invoke$lambda$3$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1$invoke$lambda$3$$inlined$rememberAction$1(function0, managedActivityResultLauncher3, function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ColoredButtonKt.m7025ColoredButtonXiNizjQ(fillMaxWidth$default, 0.0f, 0.0f, 0.0f, false, rememberedValue, ComposableLambdaKt.composableLambda(composer, 357289776, true, new PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1$1$3(topicPopupDataUi3)), composer, 1572870, 30);
            SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 0.5f, false, 2, null), composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
