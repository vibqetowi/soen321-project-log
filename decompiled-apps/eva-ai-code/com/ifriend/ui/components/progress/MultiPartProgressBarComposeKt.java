package com.ifriend.ui.components.progress;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.progress.MultiPartProgressState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MultiPartProgressBarCompose.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"MultiPartProgressBarCompose", "", "state", "Lcom/ifriend/ui/progress/MultiPartProgressState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/ifriend/ui/progress/MultiPartProgressState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiPartProgressBarComposeKt {
    public static final void MultiPartProgressBarCompose(MultiPartProgressState state, Modifier modifier, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(61791856);
        ComposerKt.sourceInformation(startRestartGroup, "C(MultiPartProgressBarCompose)P(1)");
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(61791856, i, -1, "com.ifriend.ui.components.progress.MultiPartProgressBarCompose (MultiPartProgressBarCompose.kt:18)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(modifier, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1842572986, true, new MultiPartProgressBarComposeKt$MultiPartProgressBarCompose$1(state)), startRestartGroup, ((i >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new MultiPartProgressBarComposeKt$MultiPartProgressBarCompose$2(state, modifier, i, i2));
    }
}
