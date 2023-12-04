package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
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
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumPlansScreen$1$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ BuyPremiumViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPlansScreen$1$2(BuyPremiumViewModel.UiState uiState) {
        super(3);
        this.$state = uiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-59183538, i, -1, "com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumPlansScreen.<anonymous>.<anonymous> (BuyPremiumScreen.kt:231)");
        }
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        BuyPremiumViewModel.UiState uiState = this.$state;
        composer.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
        String upperCase = StringResources_androidKt.stringResource(R.string.buy_premium__congrats__title, new Object[]{uiState.getUserName()}, composer, 64).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        long sp = TextUnitKt.getSp(30);
        FontFamily generalSans = AppFontFamily.INSTANCE.getGeneralSans();
        TextKt.m2145Text4IGK_g(upperCase, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getBold(), generalSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
        String stringResource = StringResources_androidKt.stringResource(R.string.buy_premium__congrats__description, composer, 0);
        long sp2 = TextUnitKt.getSp(15);
        FontFamily generalSans2 = AppFontFamily.INSTANCE.getGeneralSans();
        TextKt.m2145Text4IGK_g(stringResource, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp2, (FontStyle) null, FontWeight.Companion.getMedium(), generalSans2, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(5), 0.0f, 0.0f, 13, null);
        composer.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
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
        Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m2145Text4IGK_g(StringResources_androidKt.stringResource(R.string.buy_premium__congrats__app_name, composer, 0), (Modifier) null, AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.Companion.getMedium(), AppFontFamily.INSTANCE.getGeneralSans(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130962);
        BuyPremiumScreenKt.ProLabel(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), composer, 0);
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
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
