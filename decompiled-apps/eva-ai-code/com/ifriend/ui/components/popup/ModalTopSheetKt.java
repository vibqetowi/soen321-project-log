package com.ifriend.ui.components.popup;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ModalTopSheet.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"ModalTopSheet", "", "isVisible", "", "onDismiss", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "scrimColor", "Landroidx/compose/ui/graphics/Color;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ModalTopSheet-cf5BqRc", "(ZLkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalTopSheetLayoutPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModalTopSheetKt {
    public static final void ModalTopSheetLayoutPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1159707878);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalTopSheetLayoutPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159707878, i, -1, "com.ifriend.ui.components.popup.ModalTopSheetLayoutPreview (ModalTopSheet.kt:34)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableSingletons$ModalTopSheetKt.INSTANCE.m7055getLambda3$common_ui_release(), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
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
        endRestartGroup.updateScope(new ModalTopSheetKt$ModalTopSheetLayoutPreview$1(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: ModalTopSheet-cf5BqRc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7056ModalTopSheetcf5BqRc(boolean z, Function0<Unit> onDismiss, long j, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        long j2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2012362656);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalTopSheet)P(1,2,3:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                long m3290copywmQWz5c$default = i4 == 0 ? Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2012362656, i3, -1, "com.ifriend.ui.components.popup.ModalTopSheet (ModalTopSheet.kt:86)");
                }
                composer2 = startRestartGroup;
                AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(z, onDismiss, m3290copywmQWz5c$default, null, null, false, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null), EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null), ComposableLambdaKt.composableLambda(startRestartGroup, 1638962469, true, new ModalTopSheetKt$ModalTopSheet$1(content, i3)), startRestartGroup, 114819072 | (i3 & 14) | (i3 & 112) | (i3 & 896), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j2 = m3290copywmQWz5c$default;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ModalTopSheetKt$ModalTopSheet$2(z, onDismiss, j2, content, i, i2));
            return;
        }
        j2 = j;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(z, onDismiss, m3290copywmQWz5c$default, null, null, false, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null), EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null), ComposableLambdaKt.composableLambda(startRestartGroup, 1638962469, true, new ModalTopSheetKt$ModalTopSheet$1(content, i3)), startRestartGroup, 114819072 | (i3 & 14) | (i3 & 112) | (i3 & 896), 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = m3290copywmQWz5c$default;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
