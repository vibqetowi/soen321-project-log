package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"DividerAlpha", "", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: Divider-oMI9zvI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1344DivideroMI9zvI(Modifier modifier, long j, float f, float f2, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        Modifier.Companion companion;
        long m3290copywmQWz5c$default;
        Modifier.Companion companion2;
        float f5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1249392198);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,2:c#ui.unit.Dp)45@1819L6,59@2200L147:Divider.kt#jmzs0o");
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
        if ((i & 112) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i5 != 0 ? Modifier.Companion : obj;
                        m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                        if (i6 != 0) {
                            f3 = Dp.m5607constructorimpl(1);
                        }
                        if (i4 != 0) {
                            f4 = Dp.m5607constructorimpl(0);
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = obj;
                        m3290copywmQWz5c$default = j2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249392198, i, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                    }
                    if (!(f4 == 0.0f)) {
                        companion2 = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, f4, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        companion2 = Modifier.Companion;
                    }
                    startRestartGroup.startReplaceableGroup(1228914189);
                    ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
                    if (Dp.m5612equalsimpl0(f3, Dp.Companion.m5625getHairlineD9Ej5fM())) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        f5 = Dp.m5607constructorimpl(1.0f / ((Density) consume).getDensity());
                    } else {
                        f5 = f3;
                    }
                    startRestartGroup.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(companion2), 0.0f, 1, null), f5), m3290copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    m3290copywmQWz5c$default = j2;
                }
                float f6 = f4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new DividerKt$Divider$1(companion, m3290copywmQWz5c$default, f3, f6, i, i2));
                return;
            }
            f4 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(f4 == 0.0f)) {
            }
            startRestartGroup.startReplaceableGroup(1228914189);
            ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
            if (Dp.m5612equalsimpl0(f3, Dp.Companion.m5625getHairlineD9Ej5fM())) {
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(companion2), 0.0f, 1, null), f5), m3290copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            float f62 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!(f4 == 0.0f)) {
        }
        startRestartGroup.startReplaceableGroup(1228914189);
        ComposerKt.sourceInformation(startRestartGroup, "*55@2139L7");
        if (Dp.m5612equalsimpl0(f3, Dp.Companion.m5625getHairlineD9Ej5fM())) {
        }
        startRestartGroup.endReplaceableGroup();
        BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(companion2), 0.0f, 1, null), f5), m3290copywmQWz5c$default, null, 2, null), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        float f622 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
