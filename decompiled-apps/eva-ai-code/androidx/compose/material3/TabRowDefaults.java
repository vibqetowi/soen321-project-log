package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "()V", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor", "Indicator", "", "modifier", "Landroidx/compose/ui/Modifier;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Landroidx/compose/ui/unit/Dp;", "color", "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material3/TabPosition;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();

    private TabRowDefaults() {
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2026555673);
        ComposerKt.sourceInformation(composer, "C367@16033L9:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:366)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    public final long getContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1163072359);
        ComposerKt.sourceInformation(composer, "C371@16195L9:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:370)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: Indicator-9IZ8Weo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2100Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier.Companion companion;
        float m2685getActiveIndicatorHeightD9Ej5fM;
        long fromToken;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1454716052);
        ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)386@16682L11,388@16769L142:TabRow.kt#uh7d8r");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.Companion : modifier2;
                    m2685getActiveIndicatorHeightD9Ej5fM = i6 == 0 ? PrimaryNavigationTabTokens.INSTANCE.m2685getActiveIndicatorHeightD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        fromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1454716052, i, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)");
                        }
                        BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m2685getActiveIndicatorHeightD9Ej5fM), fromToken, null, 2, null), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m2685getActiveIndicatorHeightD9Ej5fM = f2;
                }
                fromToken = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m2685getActiveIndicatorHeightD9Ej5fM), fromToken, null, 2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                m2685getActiveIndicatorHeightD9Ej5fM = f2;
                fromToken = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TabRowDefaults$Indicator$1(this, companion, m2685getActiveIndicatorHeightD9Ej5fM, fromToken, i, i2));
            return;
        }
        f2 = f;
        if ((i & 896) != 0) {
        }
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        fromToken = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m2685getActiveIndicatorHeightD9Ej5fM), fromToken, null, 2, null), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(currentTabPosition) : InspectableValueKt.getNoInspectorInfo(), new TabRowDefaults$tabIndicatorOffset$2(currentTabPosition));
    }
}
