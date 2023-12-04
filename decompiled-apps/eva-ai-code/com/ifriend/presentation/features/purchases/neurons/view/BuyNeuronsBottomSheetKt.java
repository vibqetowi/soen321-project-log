package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.common.view.PurchasesCommonComponentsKt;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.components.modifier.ColoredShadowModifierKt;
import com.ifriend.ui.features.purchases.PurchaseKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u001f\u001a1\u0010 \u001a\u00020\u0006*\u00020!2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\n\u0010)\u001a\u00020#X\u008a\u0084\u0002²\u0006\u0010\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+X\u008a\u008e\u0002"}, d2 = {"itemBackground", "Landroidx/compose/ui/graphics/Color;", "J", "priceColor", "shadowColor", "BuyNeuronsCard", "", "state", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "clicks", "Lcom/ifriend/presentation/features/purchases/neurons/view/BuyNeuronsClicks;", "onDismissRequest", "Lkotlin/Function0;", "(Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;Lcom/ifriend/presentation/features/purchases/neurons/view/BuyNeuronsClicks;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BuyNeuronsContent", "list", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "isContinueEnabled", "", "actionLabel", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Lcom/ifriend/presentation/features/purchases/neurons/view/BuyNeuronsClicks;Landroidx/compose/runtime/Composer;I)V", "BuyNeuronsItem", "item", "onClick", "Lcom/ifriend/ui/tools/OnClick;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BuyNeuronsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "BuyNeuronsItemIndicator", "Landroidx/compose/foundation/layout/BoxScope;", "alpha", "", "topPadding", "Landroidx/compose/ui/unit/Dp;", "BuyNeuronsItemIndicator-gwO9Abs", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;FFLandroidx/compose/runtime/Composer;I)V", "presentation_release", "animatedAlpha", FirebaseAnalytics.Param.ITEMS, "Lkotlinx/collections/immutable/PersistentList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt {
    private static final long priceColor = ColorKt.Color(4287932906L);
    private static final long itemBackground = ColorKt.Color(4280753712L);
    private static final long shadowColor = ColorKt.Color(4287067135L);

    public static final void BuyNeuronsCard(BuyNeuronsViewModel.UiState state, BuyNeuronsClicks clicks, Function0<Unit> onDismissRequest, Composer composer, int i) {
        int i2;
        Modifier m7044coloredShadowPRYyx80;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(clicks, "clicks");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer startRestartGroup = composer.startRestartGroup(-1999282350);
        ComposerKt.sourceInformation(startRestartGroup, "C(BuyNeuronsCard)P(2)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(clicks) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1999282350, i2, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsCard (BuyNeuronsBottomSheet.kt:83)");
            }
            Modifier noIndicationClickable$default = ClickableModifierKt.noIndicationClickable$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), false, onDismissRequest, 1, null);
            Alignment bottomCenter = Alignment.Companion.getBottomCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(noIndicationClickable$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f = 35;
            float f2 = 0;
            RoundedCornerShape m1010RoundedCornerShapea9UjIt4 = RoundedCornerShapeKt.m1010RoundedCornerShapea9UjIt4(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2));
            long m3317getBlack0d7_KjU = Color.Companion.m3317getBlack0d7_KjU();
            m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), shadowColor, (r17 & 2) != 0 ? 0.2f : 0.0f, (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(-2), (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
            composer2 = startRestartGroup;
            SurfaceKt.m2067SurfaceT9BRK9s(ClickableModifierKt.noIndicationClickable$default(m7044coloredShadowPRYyx80, false, BuyNeuronsBottomSheetKt$BuyNeuronsCard$1$1.INSTANCE, 1, null), m1010RoundedCornerShapea9UjIt4, m3317getBlack0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1113521843, true, new BuyNeuronsBottomSheetKt$BuyNeuronsCard$1$2(state, clicks, i2)), startRestartGroup, 12583296, 120);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BuyNeuronsBottomSheetKt$BuyNeuronsCard$2(state, clicks, onDismissRequest, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BuyNeuronsContent(ImmutableList<BuyNeuronsProductUiParams> immutableList, boolean z, String str, BuyNeuronsClicks buyNeuronsClicks, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1461241701);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(buyNeuronsClicks) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461241701, i2, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsContent (BuyNeuronsBottomSheet.kt:142)");
            }
            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m3317getBlack0d7_KjU(), null, 2, null));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(navigationBarsPadding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(R.string.buy_neurons__title, startRestartGroup, 0);
            FontFamily generalSans = AppFontFamily.INSTANCE.getGeneralSans();
            FontWeight semiBold = FontWeight.Companion.getSemiBold();
            TextKt.m2145Text4IGK_g(stringResource, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, semiBold, generalSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 130448);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.buy_neurons__description, startRestartGroup, 0);
            FontFamily generalSans2 = AppFontFamily.INSTANCE.getGeneralSans();
            FontWeight normal = FontWeight.Companion.getNormal();
            TextKt.m2145Text4IGK_g(stringResource2, PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, normal, generalSans2, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 130448);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            int i3 = i2 >> 6;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(immutableList) | startRestartGroup.changed(buyNeuronsClicks);
            BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1(immutableList, buyNeuronsClicks);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, m752paddingqDBjuR0$default, null, null, false, null, null, null, false, (Function1) rememberedValue, startRestartGroup, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
            PurchasesCommonComponentsKt.PurchaseButton(str, z, buyNeuronsClicks.getOnContinueClick(), PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), startRestartGroup, (i3 & 14) | (i2 & 112), 0);
            PurchaseKt.PurchaseScreenFooter(null, buyNeuronsClicks.getOnTermsClick(), buyNeuronsClicks.getOnPrivacyClick(), buyNeuronsClicks.getOnRestorePurchaseClick(), startRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new BuyNeuronsBottomSheetKt$BuyNeuronsContent$2(immutableList, z, str, buyNeuronsClicks, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BuyNeuronsItem(BuyNeuronsProductUiParams buyNeuronsProductUiParams, Function0<Unit> function0, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int currentCompositeKeyHash2;
        Composer m2893constructorimpl2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1869087831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(buyNeuronsProductUiParams) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i3;
            if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1869087831, i4, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsItem (BuyNeuronsBottomSheet.kt:213)");
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!buyNeuronsProductUiParams.isSelected() ? 1.0f : 0.0f, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), 0.0f, "Alpha Animation", null, startRestartGroup, 3120, 20);
                float m7176getSmallD9Ej5fM = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM();
                int i6 = (i4 >> 6) & 14;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                int i7 = i6 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i7 & 112) | (i7 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                int i9 = ((i6 >> 6) & 112) | 6;
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier noIndicationClickable$default = ClickableModifierKt.noIndicationClickable$default(AlphaKt.alpha(BackgroundKt.m420backgroundbw27NRU(PaddingKt.m748padding3ABfNKs(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0.0f, m7176getSmallD9Ej5fM, 0.0f, 0.0f, 13, null), Dp.m5607constructorimpl(5)), itemBackground, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(18))), MathHelpersKt.lerp(0.5f, 1.0f, BuyNeuronsItem$lambda$3(animateFloatAsState))), false, function0, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceAround, centerHorizontally, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(noIndicationClickable$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(buyNeuronsProductUiParams.getIconRes(), startRestartGroup, 0), (String) null, SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), Dp.m5607constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
                String titleLabel = buyNeuronsProductUiParams.getTitleLabel();
                FontFamily generalSans = AppFontFamily.INSTANCE.getGeneralSans();
                FontWeight bold = FontWeight.Companion.getBold();
                TextKt.m2145Text4IGK_g(titleLabel, PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, bold, generalSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 130448);
                String priceLabel = buyNeuronsProductUiParams.getPriceLabel();
                FontFamily generalSans2 = AppFontFamily.INSTANCE.getGeneralSans();
                TextKt.m2145Text4IGK_g(priceLabel, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 7, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 2, null), priceColor, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getSemiBold(), generalSans2, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130448);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                m6989BuyNeuronsItemIndicatorgwO9Abs(boxScopeInstance, buyNeuronsProductUiParams, BuyNeuronsItem$lambda$3(animateFloatAsState), m7176getSmallD9Ej5fM, startRestartGroup, (i9 & 14) | ((i4 << 3) & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new BuyNeuronsBottomSheetKt$BuyNeuronsItem$2(buyNeuronsProductUiParams, function0, companion, i, i2));
            return;
        }
        obj = modifier;
        i4 = i3;
        if ((i4 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!buyNeuronsProductUiParams.isSelected() ? 1.0f : 0.0f, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), 0.0f, "Alpha Animation", null, startRestartGroup, 3120, 20);
        float m7176getSmallD9Ej5fM2 = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM();
        int i62 = (i4 >> 6) & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i72 = i62 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i72 & 112) | (i72 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
        int i82 = ((((i62 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i82 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        int i92 = ((i62 >> 6) & 112) | 6;
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier noIndicationClickable$default2 = ClickableModifierKt.noIndicationClickable$default(AlphaKt.alpha(BackgroundKt.m420backgroundbw27NRU(PaddingKt.m748padding3ABfNKs(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0.0f, m7176getSmallD9Ej5fM2, 0.0f, 0.0f, 13, null), Dp.m5607constructorimpl(5)), itemBackground, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(18))), MathHelpersKt.lerp(0.5f, 1.0f, BuyNeuronsItem$lambda$3(animateFloatAsState2))), false, function0, 1, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
        Arrangement.HorizontalOrVertical spaceAround2 = Arrangement.INSTANCE.getSpaceAround();
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceAround2, centerHorizontally2, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(noIndicationClickable$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl2.getInserting()) {
        }
        m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(buyNeuronsProductUiParams.getIconRes(), startRestartGroup, 0), (String) null, SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), Dp.m5607constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
        String titleLabel2 = buyNeuronsProductUiParams.getTitleLabel();
        FontFamily generalSans3 = AppFontFamily.INSTANCE.getGeneralSans();
        FontWeight bold2 = FontWeight.Companion.getBold();
        TextKt.m2145Text4IGK_g(titleLabel2, PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, bold2, generalSans3, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 130448);
        String priceLabel2 = buyNeuronsProductUiParams.getPriceLabel();
        FontFamily generalSans22 = AppFontFamily.INSTANCE.getGeneralSans();
        TextKt.m2145Text4IGK_g(priceLabel2, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 7, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 2, null), priceColor, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getSemiBold(), generalSans22, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130448);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        m6989BuyNeuronsItemIndicatorgwO9Abs(boxScopeInstance2, buyNeuronsProductUiParams, BuyNeuronsItem$lambda$3(animateFloatAsState2), m7176getSmallD9Ej5fM2, startRestartGroup, (i92 & 14) | ((i4 << 3) & 112));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BuyNeuronsItemIndicator-gwO9Abs  reason: not valid java name */
    public static final void m6989BuyNeuronsItemIndicatorgwO9Abs(BoxScope boxScope, BuyNeuronsProductUiParams buyNeuronsProductUiParams, float f, float f2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-125577960);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(buyNeuronsProductUiParams) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125577960, i2, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsItemIndicator (BuyNeuronsBottomSheet.kt:277)");
            }
            Modifier alpha = AlphaKt.alpha(boxScope.matchParentSize(Modifier.Companion), f);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            Dp m5605boximpl = Dp.m5605boximpl(f2);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m5605boximpl);
            BuyNeuronsBottomSheetKt$BuyNeuronsItemIndicator$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BuyNeuronsBottomSheetKt$BuyNeuronsItemIndicator$1$1$1(f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(80030259);
            if (buyNeuronsProductUiParams.isMostPopular()) {
                Modifier align = boxScopeInstance.align(BackgroundKt.background$default(Modifier.Companion, PurchasesCommonComponentsKt.getPurchaseGradient(), AppTheme.INSTANCE.getShapes(startRestartGroup, AppTheme.$stable).getExtraSmall(), 0.0f, 4, null), Alignment.Companion.getTopCenter());
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                String upperCase = StringResources_androidKt.stringResource(R.string.buy_neurons__most_popular, startRestartGroup, 0).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
                FontWeight bold = FontWeight.Companion.getBold();
                TextKt.m2145Text4IGK_g(upperCase, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 1, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, bold, sfProDisplay, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 130448);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new BuyNeuronsBottomSheetKt$BuyNeuronsItemIndicator$2(boxScope, buyNeuronsProductUiParams, f, f2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void BuyNeuronsScreenPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2063326218);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2063326218, i, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsScreenPreview (BuyNeuronsBottomSheet.kt:326)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m3320getDarkGray0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m421backgroundbw27NRU$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentListOf(new BuyNeuronsProductUiParams("1", R.drawable.ic_buy_neurons_large_amount, "10k\nNeurons", "$99.99", false, false), new BuyNeuronsProductUiParams(ExifInterface.GPS_MEASUREMENT_2D, R.drawable.ic_buy_neurons_small_amount, "500\nNeurons", "$9.99", true, true), new BuyNeuronsProductUiParams(ExifInterface.GPS_MEASUREMENT_3D, R.drawable.ic_buy_neurons_medium_amount, "2k\nNeurons", "$29.99", false, false)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            PersistentList<BuyNeuronsProductUiParams> BuyNeuronsScreenPreview$lambda$13$lambda$10 = BuyNeuronsScreenPreview$lambda$13$lambda$10(mutableState);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            BuyNeuronsContent(BuyNeuronsScreenPreview$lambda$13$lambda$10, true, "Buy for $10", new BuyNeuronsClicks(rememberedValue2, BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$2.INSTANCE, BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$3.INSTANCE, BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$4.INSTANCE, BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$5.INSTANCE), startRestartGroup, 432);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersistentList<BuyNeuronsProductUiParams> BuyNeuronsScreenPreview$lambda$13$lambda$10(MutableState<PersistentList<BuyNeuronsProductUiParams>> mutableState) {
        return mutableState.getValue();
    }

    private static final float BuyNeuronsItem$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
