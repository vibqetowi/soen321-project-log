package com.ifriend.presentation.features.chatcall.ui;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.common.uistate.ViewModelExtKt;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import com.ifriend.ui.components.dialogs.AppMessageInfoPopupKt;
import com.ifriend.ui.components.text.TypewriterTextKt;
import com.ifriend.ui.features.image.AppAvatarAsyncImageKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.utils.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallScreenKt$ChatCallScreen$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ ChatCallViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallScreenKt$ChatCallScreen$1(ChatCallViewModel chatCallViewModel, Function0<Unit> function0) {
        super(2);
        this.$viewModel = chatCallViewModel;
        this.$onBackClick = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final void invoke(Composer composer, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        Composer composer2;
        ?? r12;
        TextStyle m5100copyv2rsoow;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(941474430, i, -1, "com.ifriend.presentation.features.chatcall.ui.ChatCallScreen.<anonymous> (ChatCallScreen.kt:49)");
            }
            State collectUiState = UiStateDelegateExKt.collectUiState(this.$viewModel, null, composer, 8, 1);
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new ChatCallScreenKt$ChatCallScreen$1$audioPermissionLauncher$1(this.$viewModel), composer, 8);
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer);
            final Context context = (Context) consume;
            composer.startReplaceableGroup(-316570205);
            ChatCallViewModel chatCallViewModel = this.$viewModel;
            final Function0<Unit> function0 = this.$onBackClick;
            ViewModelExtKt.RegisterObserverEffect(chatCallViewModel, null, new Object[0], composer, 520, 1);
            UiStateDelegateExKt.CollectEventEffect(chatCallViewModel, new Object[0], null, null, new FlowCollector<ChatCallViewModel.Event>() { // from class: com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt$ChatCallScreen$1$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(ChatCallViewModel.Event event, Continuation continuation) {
                    return emit2(event, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(ChatCallViewModel.Event event, Continuation<? super Unit> continuation) {
                    if (Intrinsics.areEqual(event, ChatCallViewModel.Event.CloseFeature.INSTANCE)) {
                        function0.invoke();
                    } else if (Intrinsics.areEqual(event, ChatCallViewModel.Event.OpenSettings.INSTANCE)) {
                        ContextKt.openAppSettings(context);
                    } else if (!(event instanceof ChatCallViewModel.Event.ShowRecordAudioPermission)) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        rememberLauncherForActivityResult.launch(((ChatCallViewModel.Event.ShowRecordAudioPermission) event).getPermission());
                    }
                    return Unit.INSTANCE;
                }
            }, composer, 72, 6);
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            BackHandlerKt.BackHandler(true, AnonymousClass2.INSTANCE, composer, 54, 0);
            composer.startReplaceableGroup(-316569723);
            if (invoke$lambda$0(collectUiState).isVisibleInfoPopup()) {
                i2 = 0;
                AppMessageInfoPopupKt.AppMessageInfoPopup(StringResources_androidKt.stringResource(R.string.permissions__microphone_access, composer, 0), StringResources_androidKt.stringResource(R.string.permissions__uses_microphone, composer, 0), StringResources_androidKt.stringResource(com.ifriend.ui.R.string.common__open_settings, composer, 0), new AnonymousClass3(this.$viewModel), new AnonymousClass4(this.$viewModel), new AnonymousClass5(this.$viewModel), false, false, composer, 0, PsExtractor.AUDIO_STREAM);
            } else {
                i2 = 0;
            }
            composer.endReplaceableGroup();
            Modifier systemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), AppColors.Companion.getBackgroundColorGradient(), null, 0.0f, 6, null));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ChatCallViewModel chatCallViewModel2 = this.$viewModel;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, i2);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(systemBarsPadding);
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
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf(i2));
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2145Text4IGK_g(invoke$lambda$0(collectUiState).getTitle(), PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7173getLargerD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getScreenTitleSemiBold(), composer, 0, 0, 65532);
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
            if (invoke$lambda$0(collectUiState).isLoading()) {
                composer.startReplaceableGroup(-503528829);
                String loadingTitle = invoke$lambda$0(collectUiState).getLoadingTitle();
                long m7100getLight0d7_KjU = AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7100getLight0d7_KjU();
                str = "C71@3331L9:Box.kt#2w3rfo";
                str2 = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
                str3 = "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo";
                m5100copyv2rsoow = r33.m5100copyv2rsoow((r48 & 1) != 0 ? r33.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r33.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(20), (r48 & 4) != 0 ? r33.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r33.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r33.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r33.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r33.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r33.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r33.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r33.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r33.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r33.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r33.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r33.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r33.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r33.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r33.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r33.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r33.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r33.platformStyle : null, (r48 & 1048576) != 0 ? r33.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r33.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r33.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getTitleItemMedium().paragraphStyle.getTextMotion() : null);
                composer2 = composer;
                TextKt.m2145Text4IGK_g(loadingTitle, (Modifier) null, m7100getLight0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5100copyv2rsoow, composer, 0, 0, 65530);
                composer.endReplaceableGroup();
                r12 = 0;
            } else {
                str = "C71@3331L9:Box.kt#2w3rfo";
                str2 = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
                str3 = "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo";
                composer2 = composer;
                composer2.startReplaceableGroup(-503528582);
                r12 = 0;
                ChatCallScreenKt.CallTimerContent(invoke$lambda$0(collectUiState).getDurationLabel(), composer2, 0);
                composer.endReplaceableGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            AppAvatarAsyncImageKt.AppAvatarAsyncImage(SizeKt.m795size3ABfNKs(ClipKt.clip(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.getCircleShape()), Dp.m5607constructorimpl((float) TsExtractor.TS_STREAM_TYPE_E_AC3)), invoke$lambda$0(collectUiState).getAvatarUrl(), composer2, r12, r12);
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 1, null);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, str3);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), r12, composer2, r12);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, str2);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r12);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer2, Integer.valueOf((int) r12));
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, str);
            TypewriterTextKt.TypewriterText(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter()), invoke$lambda$0(collectUiState).getLastMessage(), AppTheme.INSTANCE.getTypography(composer2, AppTheme.$stable).getChatText(), 0L, 0L, false, composer, 0, 56);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ChatCallScreenKt.ButtonContent(new ChatCallScreenKt$ChatCallScreen$1$6$3(chatCallViewModel2), composer2, r12);
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
    /* compiled from: ChatCallScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt$ChatCallScreen$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt$ChatCallScreen$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass3(Object obj) {
            super(0, obj, ChatCallViewModel.class, "onMessageInfoPopupClick", "onMessageInfoPopupClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ChatCallViewModel) this.receiver).onMessageInfoPopupClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt$ChatCallScreen$1$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass4(Object obj) {
            super(0, obj, ChatCallViewModel.class, "onCancelMessageInfoPopupClick", "onCancelMessageInfoPopupClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ChatCallViewModel) this.receiver).onCancelMessageInfoPopupClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt$ChatCallScreen$1$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass5(Object obj) {
            super(0, obj, ChatCallViewModel.class, "onCancelMessageInfoPopupClick", "onCancelMessageInfoPopupClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ChatCallViewModel) this.receiver).onCancelMessageInfoPopupClick();
        }
    }

    private static final ChatCallViewModel.UiState invoke$lambda$0(State<ChatCallViewModel.UiState> state) {
        return state.getValue();
    }
}
