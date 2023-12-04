package com.ifriend.presentation.features.chatcall.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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
import com.google.android.exoplayer2.audio.WavUtil;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import com.ifriend.ui.components.surface.AppSurfaceKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0004H\u0003¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0004H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"ButtonContent", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CallTimerContent", "duration", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ChatCallScreen", "viewModel", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel;", "onBackClick", "(Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallScreenKt {
    public static final void ChatCallScreen(ChatCallViewModel viewModel, Function0<Unit> onBackClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(1059715581);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatCallScreen)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1059715581, i, -1, "com.ifriend.presentation.features.chatcall.ui.ChatCallScreen (ChatCallScreen.kt:48)");
        }
        AppSurfaceKt.m7071AppSurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 941474430, true, new ChatCallScreenKt$ChatCallScreen$1(viewModel, onBackClick)), startRestartGroup, 1572864, 63);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatCallScreenKt$ChatCallScreen$2(viewModel, onBackClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CallTimerContent(String str, Composer composer, int i) {
        int i2;
        TextStyle m5100copyv2rsoow;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-856000940);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856000940, i2, -1, "com.ifriend.presentation.features.chatcall.ui.CallTimerContent (ChatCallScreen.kt:137)");
            }
            m5100copyv2rsoow = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7100getLight0d7_KjU(), (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(20), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemMedium().paragraphStyle.getTextMotion() : null);
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5100copyv2rsoow, startRestartGroup, i2 & 14, 0, (int) WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        endRestartGroup.updateScope(new ChatCallScreenKt$CallTimerContent$1(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonContent(Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        TextStyle m5100copyv2rsoow;
        Composer startRestartGroup = composer.startRestartGroup(-312707228);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312707228, i2, -1, "com.ifriend.presentation.features.chatcall.ui.ButtonContent (ChatCallScreen.kt:150)");
            }
            composer2 = startRestartGroup;
            ButtonWidgetsKt.m7022AppShadowButtonWithContentBHesuOE(SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(55)), 0.0f, 0.0f, Dp.m5607constructorimpl((float) 27.5d), AppColors.Companion.m7139getRed0d7_KjU(), false, function0, 0L, ComposableSingletons$ChatCallScreenKt.INSTANCE.m6926getLambda1$presentation_release(), startRestartGroup, ((i2 << 18) & 3670016) | 100690950, 166);
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 0.0f, AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7172getLargeD9Ej5fM(), 5, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.chat_call__end_call, composer2, 0);
            long m7100getLight0d7_KjU = AppTheme.INSTANCE.getColors(composer2, AppTheme.$stable).m7100getLight0d7_KjU();
            m5100copyv2rsoow = r20.m5100copyv2rsoow((r48 & 1) != 0 ? r20.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r20.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (r48 & 4) != 0 ? r20.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r20.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r20.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r20.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r20.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r20.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r20.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r20.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r20.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r20.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r20.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r20.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r20.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r20.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r20.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r20.paragraphStyle.m4996getLineHeightXSAIIZE() : TextUnitKt.getSp(11), (r48 & 262144) != 0 ? r20.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r20.platformStyle : null, (r48 & 1048576) != 0 ? r20.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r20.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r20.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(composer2, AppTheme.$stable).getTitleItemMedium().paragraphStyle.getTextMotion() : null);
            TextKt.m2145Text4IGK_g(stringResource, m752paddingqDBjuR0$default, m7100getLight0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5100copyv2rsoow, composer2, 0, 0, 65528);
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
        endRestartGroup.updateScope(new ChatCallScreenKt$ButtonContent$1(function0, i));
    }
}
