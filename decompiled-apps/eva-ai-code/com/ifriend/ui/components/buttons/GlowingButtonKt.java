package com.ifriend.ui.components.buttons;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.MultipleEventsCutterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GlowingButton.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"GlowingButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "isActive", "", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "common_ui_release", "animatedButtonTextColor", "Landroidx/compose/ui/graphics/Color;", "animatedButtonColor", "animatedShadowAlpha", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GlowingButton(Modifier modifier, String text, boolean z, Function0<Unit> onClick, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1070903009);
        ComposerKt.sourceInformation(startRestartGroup, "C(GlowingButton)P(1,3)");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                boolean z4 = i6 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1070903009, i4, -1, "com.ifriend.ui.components.buttons.GlowingButton (GlowingButton.kt:27)");
                }
                State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(ColorKt.Color(!z4 ? 4284640478L : 4279047715L), null, null, null, startRestartGroup, 0, 14);
                Color.Companion companion2 = Color.Companion;
                MultipleEventsCutterKt.multipleEventsCutter(ComposableLambdaKt.composableLambda(startRestartGroup, -2034023463, true, new GlowingButtonKt$GlowingButton$1(companion, z4, i4, AnimateAsStateKt.animateFloatAsState(!z4 ? 0.7f : 0.0f, null, 0.0f, null, null, startRestartGroup, 0, 30), SingleValueAnimationKt.m329animateColorAsStateeuL9pac(!z4 ? companion2.m3328getWhite0d7_KjU() : Color.m3290copywmQWz5c$default(companion2.m3328getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, startRestartGroup, 0, 14), m329animateColorAsStateeuL9pac, onClick, text)), startRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z3 = z4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                z3 = z2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new GlowingButtonKt$GlowingButton$2(modifier2, text, z3, onClick, i, i2));
            return;
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(ColorKt.Color(!z4 ? 4284640478L : 4279047715L), null, null, null, startRestartGroup, 0, 14);
        Color.Companion companion22 = Color.Companion;
        MultipleEventsCutterKt.multipleEventsCutter(ComposableLambdaKt.composableLambda(startRestartGroup, -2034023463, true, new GlowingButtonKt$GlowingButton$1(companion, z4, i4, AnimateAsStateKt.animateFloatAsState(!z4 ? 0.7f : 0.0f, null, 0.0f, null, null, startRestartGroup, 0, 30), SingleValueAnimationKt.m329animateColorAsStateeuL9pac(!z4 ? companion22.m3328getWhite0d7_KjU() : Color.m3290copywmQWz5c$default(companion22.m3328getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, startRestartGroup, 0, 14), m329animateColorAsStateeuL9pac2, onClick, text)), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z3 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long GlowingButton$lambda$0(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long GlowingButton$lambda$1(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GlowingButton$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
