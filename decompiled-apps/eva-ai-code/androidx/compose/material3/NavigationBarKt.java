package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ak\u0010#\u001a\u00020\u00132\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0003¢\u0006\u0002\u0010-\u001a\u0083\u0001\u0010.\u001a\u00020\u0013*\u00020\u001e2\u0006\u0010/\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130%2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020*2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0007¢\u0006\u0002\u00106\u001a;\u00107\u001a\u000208*\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aS\u0010B\u001a\u000208*\u0002092\u0006\u0010C\u001a\u00020;2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemVerticalPadding", "getNavigationBarItemVerticalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemBaselineLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, "Lkotlin/Function0;", NavigationBarKt.IndicatorLayoutIdTag, NavigationBarKt.IconLayoutIdTag, "label", "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight = NavigationBarTokens.INSTANCE.m2559getContainerHeightD9Ej5fM();
    private static final float NavigationBarItemHorizontalPadding = Dp.m5607constructorimpl(8);
    private static final float NavigationBarItemVerticalPadding = Dp.m5607constructorimpl(16);
    private static final float IndicatorVerticalOffset = Dp.m5607constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* renamed from: NavigationBar-HsRjFd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1884NavigationBarHsRjFd4(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        int i4;
        Modifier.Companion companion;
        float f3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1596802123);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBar)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,5)100@4715L14,101@4771L11,103@4929L12,106@4996L503:NavigationBar.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    i4 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i7 != 0 ? Modifier.Companion : obj;
                        if ((i2 & 2) != 0) {
                            j3 = NavigationBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m1686contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), j3);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            f2 = NavigationBarDefaults.INSTANCE.m1880getElevationD9Ej5fM();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = obj;
                    }
                    f3 = f2;
                    long j5 = j4;
                    int i9 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1596802123, i9, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 105663120, true, new NavigationBarKt$NavigationBar$1(windowInsets2, content, i9));
                    int i10 = i9 << 3;
                    WindowInsets windowInsets3 = windowInsets2;
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j5, f3, 0.0f, null, composableLambda, startRestartGroup, 12582912 | (i9 & 14) | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 98);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = windowInsets3;
                    j4 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    f3 = f2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new NavigationBarKt$NavigationBar$2(companion, j3, j4, f3, windowInsets2, content, i, i2));
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i4;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            f3 = f2;
            long j52 = j4;
            int i92 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 105663120, true, new NavigationBarKt$NavigationBar$1(windowInsets2, content, i92));
            int i102 = i92 << 3;
            WindowInsets windowInsets32 = windowInsets2;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j52, f3, 0.0f, null, composableLambda2, startRestartGroup, 12582912 | (i92 & 14) | (i102 & 896) | (i102 & 7168) | (i102 & 57344), 98);
            if (ComposerKt.isTraceInProgress()) {
            }
            windowInsets2 = windowInsets32;
            j4 = j52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        if ((i & 57344) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        f3 = f2;
        long j522 = j4;
        int i922 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 105663120, true, new NavigationBarKt$NavigationBar$1(windowInsets2, content, i922));
        int i1022 = i922 << 3;
        WindowInsets windowInsets322 = windowInsets2;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j522, f3, 0.0f, null, composableLambda22, startRestartGroup, 12582912 | (i922 & 14) | (i1022 & 896) | (i1022 & 7168) | (i1022 & 57344), 98);
        if (ComposerKt.isTraceInProgress()) {
        }
        windowInsets2 = windowInsets322;
        j4 = j522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBarItem(RowScope rowScope, boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z4;
        int i5;
        Object obj;
        int i6;
        boolean z5;
        int i7;
        Modifier.Companion companion;
        NavigationBarItemColors navigationBarItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z6;
        boolean z7;
        int i8;
        NavigationBarItemColors navigationBarItemColors3;
        Composer composer2;
        int i9;
        ComposableLambda composableLambda;
        Object rememberedValue;
        boolean changed;
        NavigationBarKt$NavigationBarItem$2$1 rememberedValue2;
        Density density;
        MutableInteractionSource mutableInteractionSource3;
        boolean changed2;
        Object rememberedValue3;
        Modifier modifier2;
        NavigationBarItemColors navigationBarItemColors4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-663510974);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItem)P(8,7,3,6,2,5)167@7728L8,168@7788L39,189@8761L30,202@9139L52,191@8797L2501:NavigationBar.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    obj = function2;
                    i3 |= startRestartGroup.changedInstance(obj) ? 1048576 : 524288;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(z5) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(navigationBarItemColors)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i3 |= i10;
                        }
                        i10 = 33554432;
                        i3 |= i10;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i11 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                z4 = true;
                            }
                            Object obj2 = i5 == 0 ? null : obj;
                            if (i6 != 0) {
                                z5 = true;
                            }
                            if ((i2 & 128) == 0) {
                                navigationBarItemColors2 = NavigationBarItemDefaults.INSTANCE.m1882colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 12582912, 127);
                                i3 &= -234881025;
                            } else {
                                navigationBarItemColors2 = navigationBarItemColors;
                            }
                            if (i7 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue4;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            obj = obj2;
                            z6 = z4;
                            z7 = z5;
                            i8 = i3;
                            navigationBarItemColors3 = navigationBarItemColors2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -234881025;
                            }
                            companion = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z6 = z4;
                            z7 = z5;
                            navigationBarItemColors3 = navigationBarItemColors;
                            i8 = i3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-663510974, i8, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                        }
                        int i12 = i8;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        NavigationBarItemColors navigationBarItemColors5 = navigationBarItemColors3;
                        composer2 = startRestartGroup;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors3, z, z6, i8, obj, z7, icon));
                        if (obj == null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new NavigationBarKt$NavigationBarItem$styledLabel$1$1(navigationBarItemColors5, z, z6, i12, obj));
                            i9 = -492369756;
                        } else {
                            i9 = -492369756;
                            composableLambda = null;
                        }
                        composer2.startReplaceableGroup(i9);
                        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = composer2.rememberedValue();
                        if (rememberedValue != Composer.Companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue;
                        Modifier weight$default = RowScope.CC.weight$default(rowScope, SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource4, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = composer2.changed(mutableState);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new NavigationBarKt$NavigationBarItem$2$1(mutableState);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(weight$default, (Function1) rememberedValue2);
                        Alignment center = Alignment.Companion.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density2 = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(onSizeChanged);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, density2, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1035149591, "C207@9285L145,*216@9714L7,223@10014L120,248@11007L285:NavigationBar.kt#uh7d8r");
                        boolean z8 = z6;
                        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        long Offset = OffsetKt.Offset((NavigationBarItem$lambda$3(mutableState) - density.mo582roundToPx0680j_4(NavigationBarTokens.INSTANCE.m2557getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) consume4).mo588toPx0680j_4(IndicatorVerticalOffset));
                        Unit unit = Unit.INSTANCE;
                        Offset m3007boximpl = Offset.m3007boximpl(Offset);
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        mutableInteractionSource3 = mutableInteractionSource4;
                        changed2 = composer2.changed(m3007boximpl) | composer2.changed(mutableInteractionSource3);
                        rememberedValue3 = composer2.rememberedValue();
                        if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new MappedInteractionSource(mutableInteractionSource3, Offset, null);
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        NavigationBarItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new NavigationBarKt$NavigationBarItem$3$indicatorRipple$1((MappedInteractionSource) rememberedValue3)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new NavigationBarKt$NavigationBarItem$3$indicator$1(navigationBarItemColors5, animateFloatAsState)), composableLambda2, composableLambda, z7, NavigationBarItem$lambda$9$lambda$6(animateFloatAsState), composer2, ((i12 >> 9) & 57344) | 438);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z8;
                        modifier2 = companion;
                        navigationBarItemColors4 = navigationBarItemColors5;
                        function22 = obj;
                        z5 = z7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        function22 = obj;
                        navigationBarItemColors4 = navigationBarItemColors;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItem$4(rowScope, z, onClick, icon, modifier2, z4, function22, z5, navigationBarItemColors4, mutableInteractionSource3, i, i2));
                    return;
                }
                obj = function2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i7 == 0) {
                }
                obj = obj2;
                z6 = z4;
                z7 = z5;
                i8 = i3;
                navigationBarItemColors3 = navigationBarItemColors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i8;
                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                NavigationBarItemColors navigationBarItemColors52 = navigationBarItemColors3;
                composer2 = startRestartGroup;
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors3, z, z6, i8, obj, z7, icon));
                if (obj == null) {
                }
                composer2.startReplaceableGroup(i9);
                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = composer2.rememberedValue();
                if (rememberedValue != Composer.Companion.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) rememberedValue;
                Modifier weight$default2 = RowScope.CC.weight$default(rowScope, SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource42, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = composer2.changed(mutableState2);
                rememberedValue2 = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new NavigationBarKt$NavigationBarItem$2$1(mutableState2);
                composer2.updateRememberedValue(rememberedValue2);
                composer2.endReplaceableGroup();
                Modifier onSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(weight$default2, (Function1) rememberedValue2);
                Alignment center2 = Alignment.Companion.getCenter();
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density22 = (Density) consume5;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(onSizeChanged2);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density22, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1035149591, "C207@9285L145,*216@9714L7,223@10014L120,248@11007L285:NavigationBar.kt#uh7d8r");
                boolean z82 = z6;
                State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume42 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                long Offset2 = OffsetKt.Offset((NavigationBarItem$lambda$3(mutableState2) - density.mo582roundToPx0680j_4(NavigationBarTokens.INSTANCE.m2557getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) consume42).mo588toPx0680j_4(IndicatorVerticalOffset));
                Unit unit2 = Unit.INSTANCE;
                Offset m3007boximpl2 = Offset.m3007boximpl(Offset2);
                composer2.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                mutableInteractionSource3 = mutableInteractionSource42;
                changed2 = composer2.changed(m3007boximpl2) | composer2.changed(mutableInteractionSource3);
                rememberedValue3 = composer2.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new MappedInteractionSource(mutableInteractionSource3, Offset2, null);
                composer2.updateRememberedValue(rememberedValue3);
                composer2.endReplaceableGroup();
                NavigationBarItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new NavigationBarKt$NavigationBarItem$3$indicatorRipple$1((MappedInteractionSource) rememberedValue3)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new NavigationBarKt$NavigationBarItem$3$indicator$1(navigationBarItemColors52, animateFloatAsState2)), composableLambda22, composableLambda, z7, NavigationBarItem$lambda$9$lambda$6(animateFloatAsState2), composer2, ((i122 >> 9) & 57344) | 438);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z82;
                modifier2 = companion;
                navigationBarItemColors4 = navigationBarItemColors52;
                function22 = obj;
                z5 = z7;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            obj = function2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i7 == 0) {
            }
            obj = obj2;
            z6 = z4;
            z7 = z5;
            i8 = i3;
            navigationBarItemColors3 = navigationBarItemColors2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1222 = i8;
            MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            NavigationBarItemColors navigationBarItemColors522 = navigationBarItemColors3;
            composer2 = startRestartGroup;
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors3, z, z6, i8, obj, z7, icon));
            if (obj == null) {
            }
            composer2.startReplaceableGroup(i9);
            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = composer2.rememberedValue();
            if (rememberedValue != Composer.Companion.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            MutableState mutableState22 = (MutableState) rememberedValue;
            Modifier weight$default22 = RowScope.CC.weight$default(rowScope, SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource422, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = composer2.changed(mutableState22);
            rememberedValue2 = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new NavigationBarKt$NavigationBarItem$2$1(mutableState22);
            composer2.updateRememberedValue(rememberedValue2);
            composer2.endReplaceableGroup();
            Modifier onSizeChanged22 = OnRemeasuredModifierKt.onSizeChanged(weight$default22, (Function1) rememberedValue2);
            Alignment center22 = Alignment.Companion.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume52 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density222 = (Density) consume52;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume322 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(onSizeChanged22);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl22, density222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1035149591, "C207@9285L145,*216@9714L7,223@10014L120,248@11007L285:NavigationBar.kt#uh7d8r");
            boolean z822 = z6;
            State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume422 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            long Offset22 = OffsetKt.Offset((NavigationBarItem$lambda$3(mutableState22) - density.mo582roundToPx0680j_4(NavigationBarTokens.INSTANCE.m2557getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) consume422).mo588toPx0680j_4(IndicatorVerticalOffset));
            Unit unit22 = Unit.INSTANCE;
            Offset m3007boximpl22 = Offset.m3007boximpl(Offset22);
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            mutableInteractionSource3 = mutableInteractionSource422;
            changed2 = composer2.changed(m3007boximpl22) | composer2.changed(mutableInteractionSource3);
            rememberedValue3 = composer2.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new MappedInteractionSource(mutableInteractionSource3, Offset22, null);
            composer2.updateRememberedValue(rememberedValue3);
            composer2.endReplaceableGroup();
            NavigationBarItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new NavigationBarKt$NavigationBarItem$3$indicatorRipple$1((MappedInteractionSource) rememberedValue3)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new NavigationBarKt$NavigationBarItem$3$indicator$1(navigationBarItemColors522, animateFloatAsState22)), composableLambda222, composableLambda, z7, NavigationBarItem$lambda$9$lambda$6(animateFloatAsState22), composer2, ((i1222 >> 9) & 57344) | 438);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z822;
            modifier2 = companion;
            navigationBarItemColors4 = navigationBarItemColors522;
            function22 = obj;
            z5 = z7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        obj = function2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i7 == 0) {
        }
        obj = obj2;
        z6 = z4;
        z7 = z5;
        i8 = i3;
        navigationBarItemColors3 = navigationBarItemColors2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i12222 = i8;
        MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        NavigationBarItemColors navigationBarItemColors5222 = navigationBarItemColors3;
        composer2 = startRestartGroup;
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors3, z, z6, i8, obj, z7, icon));
        if (obj == null) {
        }
        composer2.startReplaceableGroup(i9);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = composer2.rememberedValue();
        if (rememberedValue != Composer.Companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        MutableState mutableState222 = (MutableState) rememberedValue;
        Modifier weight$default222 = RowScope.CC.weight$default(rowScope, SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource4222, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = composer2.changed(mutableState222);
        rememberedValue2 = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new NavigationBarKt$NavigationBarItem$2$1(mutableState222);
        composer2.updateRememberedValue(rememberedValue2);
        composer2.endReplaceableGroup();
        Modifier onSizeChanged222 = OnRemeasuredModifierKt.onSizeChanged(weight$default222, (Function1) rememberedValue2);
        Alignment center222 = Alignment.Companion.getCenter();
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume522 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density2222 = (Density) consume522;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(onSizeChanged222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl222, density2222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1035149591, "C207@9285L145,*216@9714L7,223@10014L120,248@11007L285:NavigationBar.kt#uh7d8r");
        boolean z8222 = z6;
        State<Float> animateFloatAsState222 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        long Offset222 = OffsetKt.Offset((NavigationBarItem$lambda$3(mutableState222) - density.mo582roundToPx0680j_4(NavigationBarTokens.INSTANCE.m2557getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) consume4222).mo588toPx0680j_4(IndicatorVerticalOffset));
        Unit unit222 = Unit.INSTANCE;
        Offset m3007boximpl222 = Offset.m3007boximpl(Offset222);
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        mutableInteractionSource3 = mutableInteractionSource4222;
        changed2 = composer2.changed(m3007boximpl222) | composer2.changed(mutableInteractionSource3);
        rememberedValue3 = composer2.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new MappedInteractionSource(mutableInteractionSource3, Offset222, null);
        composer2.updateRememberedValue(rememberedValue3);
        composer2.endReplaceableGroup();
        NavigationBarItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new NavigationBarKt$NavigationBarItem$3$indicatorRipple$1((MappedInteractionSource) rememberedValue3)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new NavigationBarKt$NavigationBarItem$3$indicator$1(navigationBarItemColors5222, animateFloatAsState222)), composableLambda2222, composableLambda, z7, NavigationBarItem$lambda$9$lambda$6(animateFloatAsState222), composer2, ((i12222 >> 9) & 57344) | 438);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z8222;
        modifier2 = companion;
        navigationBarItemColors4 = navigationBarItemColors5222;
        function22 = obj;
        z5 = z7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final int NavigationBarItem$lambda$3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationBarItem$lambda$4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationBarItemBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(591111291);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItemBaselineLayout)P(4,3,2,5)434@18867L2465:NavigationBar.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591111291, i2, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:426)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    float f2;
                    float f3;
                    Object obj;
                    Placeable placeable;
                    MeasureResult m1888placeLabelAndIconzUg2_y0;
                    MeasureResult m1887placeIconX9ElhV4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                            int width = mo4545measureBRTryo0.getWidth();
                            f2 = NavigationBarKt.IndicatorHorizontalPadding;
                            float f4 = 2;
                            int i3 = width + Layout.mo582roundToPx0680j_4(Dp.m5607constructorimpl(f2 * f4));
                            int roundToInt = MathKt.roundToInt(i3 * f);
                            int height = mo4545measureBRTryo0.getHeight();
                            f3 = NavigationBarKt.IndicatorVerticalPadding;
                            int i4 = height + Layout.mo582roundToPx0680j_4(Dp.m5607constructorimpl(f3 * f4));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                                    Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(i3, i4));
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "indicator")) {
                                            break;
                                        }
                                    }
                                    Measurable measurable3 = (Measurable) obj;
                                    Placeable mo4545measureBRTryo03 = measurable3 != null ? measurable3.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(roundToInt, i4)) : null;
                                    if (function24 != null) {
                                        for (Measurable measurable4 : list) {
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), Constants.ScionAnalytics.PARAM_LABEL)) {
                                                placeable = measurable4.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    placeable = null;
                                    if (function24 == null) {
                                        m1887placeIconX9ElhV4 = NavigationBarKt.m1887placeIconX9ElhV4(Layout, mo4545measureBRTryo0, mo4545measureBRTryo02, mo4545measureBRTryo03, j);
                                        return m1887placeIconX9ElhV4;
                                    }
                                    Intrinsics.checkNotNull(placeable);
                                    m1888placeLabelAndIconzUg2_y0 = NavigationBarKt.m1888placeLabelAndIconzUg2_y0(Layout, placeable, mo4545measureBRTryo0, mo4545measureBRTryo02, mo4545measureBRTryo03, j, z, f);
                                    return m1888placeLabelAndIconzUg2_y0;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -311734425, "C435@18884L17,440@18982L50:NavigationBar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(-311734399);
            ComposerKt.sourceInformation(startRestartGroup, "437@18951L11");
            if (f > 0.0f) {
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, IconLayoutIdTag);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1248851348, "C440@19024L6:NavigationBar.kt#uh7d8r");
            function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1204551908);
            ComposerKt.sourceInformation(startRestartGroup, "443@19075L260");
            if (function24 != null) {
                Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, "label"), z ? 1.0f : f), Dp.m5607constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m750paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1248851650, "C448@19326L7:NavigationBar.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i2 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
        endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m1887placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        return MeasureScope.CC.layout$default(measureScope, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (m5551getMaxWidthimpl - placeable.getWidth()) / 2, (m5550getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m5551getMaxWidthimpl - placeable2.getWidth()) / 2, (m5550getMaxHeightimpl - placeable2.getHeight()) / 2, m5551getMaxWidthimpl, m5550getMaxHeightimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m1888placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        float f2 = NavigationBarItemVerticalPadding;
        int height = (m5550getMaxHeightimpl - placeable.getHeight()) - measureScope.mo582roundToPx0680j_4(f2);
        int i = measureScope.mo582roundToPx0680j_4(f2);
        int roundToInt = MathKt.roundToInt(((z ? i : (m5550getMaxHeightimpl - placeable2.getHeight()) / 2) - i) * (1 - f));
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        return MeasureScope.CC.layout$default(measureScope, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (m5551getMaxWidthimpl - placeable.getWidth()) / 2, height, roundToInt, placeable2, (m5551getMaxWidthimpl - placeable2.getWidth()) / 2, i, placeable3, (m5551getMaxWidthimpl - placeable3.getWidth()) / 2, i - measureScope.mo582roundToPx0680j_4(IndicatorVerticalPadding), m5551getMaxWidthimpl, measureScope), 4, null);
    }

    static {
        float f = 2;
        IndicatorHorizontalPadding = Dp.m5607constructorimpl(Dp.m5607constructorimpl(NavigationBarTokens.INSTANCE.m2557getActiveIndicatorWidthD9Ej5fM() - NavigationBarTokens.INSTANCE.m2560getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = Dp.m5607constructorimpl(Dp.m5607constructorimpl(NavigationBarTokens.INSTANCE.m2556getActiveIndicatorHeightD9Ej5fM() - NavigationBarTokens.INSTANCE.m2560getIconSizeD9Ej5fM()) / f);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return NavigationBarItemVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$9$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }
}
