package com.ifriend.ui.theme;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppIcons.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"IcVoice", "", "Lcom/ifriend/ui/theme/AppIcons;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "IcVoice-ww6aTOc", "(Lcom/ifriend/ui/theme/AppIcons;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppIconsKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: IcVoice-ww6aTOc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7183IcVoiceww6aTOc(AppIcons IcVoice, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        long j2;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(IcVoice, "$this$IcVoice");
        Composer startRestartGroup = composer.startRestartGroup(131023556);
        ComposerKt.sourceInformation(startRestartGroup, "C(IcVoice)P(!,2:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(str) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((i3 & 5841) == 1168 || !startRestartGroup.getSkipping()) {
                    companion = i5 != 0 ? Modifier.Companion : obj;
                    long m3327getUnspecified0d7_KjU = i4 != 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : j2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(131023556, i3, -1, "com.ifriend.ui.theme.IcVoice (AppIcons.kt:16)");
                    }
                    IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_voice_white, startRestartGroup, 0), str, companion, m3327getUnspecified0d7_KjU, startRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = m3327getUnspecified0d7_KjU;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AppIconsKt$IcVoice$1(IcVoice, str, companion, j2, i, i2));
                return;
            }
            j2 = j;
            if ((i3 & 5841) == 1168) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_voice_white, startRestartGroup, 0), str, companion, m3327getUnspecified0d7_KjU, startRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j2 = m3327getUnspecified0d7_KjU;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j2 = j;
        if ((i3 & 5841) == 1168) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_voice_white, startRestartGroup, 0), str, companion, m3327getUnspecified0d7_KjU, startRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = m3327getUnspecified0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
