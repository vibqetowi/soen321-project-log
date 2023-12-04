package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!2\b\b\u0002\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u007f\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\b\b\u0002\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00104\u001ak\u00105\u001a\u00020\u00172\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0003¢\u0006\u0002\u0010:\u001a;\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aS\u0010F\u001a\u00020<*\u00020=2\u0006\u0010G\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020C2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0013\u0010\u000f\"\u0019\u0010\u0014\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalPaddingNoLabel", "IndicatorVerticalPaddingWithLabel", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationRailHeaderPadding", "NavigationRailItemHeight", "getNavigationRailItemHeight", "()F", "NavigationRailItemVerticalPadding", "getNavigationRailItemVerticalPadding", "NavigationRailItemWidth", "getNavigationRailItemWidth", "NavigationRailVerticalPadding", "getNavigationRailVerticalPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", FirebaseAnalytics.Param.CONTENT, "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", NavigationRailKt.IconLayoutIdTag, "enabled", "label", "alwaysShowLabel", "colors", "Landroidx/compose/material3/NavigationRailItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", NavigationRailKt.IndicatorRippleLayoutIdTag, NavigationRailKt.IndicatorLayoutIdTag, "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailVerticalPadding;
    private static final float NavigationRailHeaderPadding = Dp.m5607constructorimpl(8);
    private static final float NavigationRailItemWidth = NavigationRailTokens.INSTANCE.m2570getContainerWidthD9Ej5fM();
    private static final float NavigationRailItemHeight = NavigationRailTokens.INSTANCE.m2573getNoLabelActiveIndicatorHeightD9Ej5fM();

    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /* renamed from: NavigationRail-qi6gXK8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1903NavigationRailqi6gXK8(Modifier modifier, long j, long j2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j3;
        long j4;
        Object obj2;
        Object obj3;
        int i4;
        Modifier.Companion companion;
        WindowInsets windowInsets2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(118552648);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRail)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,5)102@4774L14,103@4816L31,105@4963L12,108@5033L748:NavigationRail.kt#uh7d8r");
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
            obj2 = function3;
            i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
            if ((57344 & i) != 0) {
                if ((i2 & 16) == 0) {
                    obj3 = windowInsets;
                    if (startRestartGroup.changed(obj3)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    obj3 = windowInsets;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                obj3 = windowInsets;
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
                            j3 = NavigationRailDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            obj2 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            windowInsets2 = NavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            function32 = obj2;
                            long j5 = j4;
                            int i9 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(118552648, i9, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                            }
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -2092683357, true, new NavigationRailKt$NavigationRail$1(windowInsets2, function32, i9, content));
                            int i10 = i9 << 3;
                            WindowInsets windowInsets3 = windowInsets2;
                            SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j5, 0.0f, 0.0f, null, composableLambda, startRestartGroup, (i9 & 14) | 12582912 | (i10 & 896) | (i10 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            obj3 = windowInsets3;
                            j4 = j5;
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
                    function32 = obj2;
                    windowInsets2 = obj3;
                    long j52 = j4;
                    int i92 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -2092683357, true, new NavigationRailKt$NavigationRail$1(windowInsets2, function32, i92, content));
                    int i102 = i92 << 3;
                    WindowInsets windowInsets32 = windowInsets2;
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j52, 0.0f, 0.0f, null, composableLambda2, startRestartGroup, (i92 & 14) | 12582912 | (i102 & 896) | (i102 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    obj3 = windowInsets32;
                    j4 = j52;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    function32 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new NavigationRailKt$NavigationRail$2(companion, j3, j4, function32, obj3, content, i, i2));
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
            function32 = obj2;
            windowInsets2 = obj3;
            long j522 = j4;
            int i922 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -2092683357, true, new NavigationRailKt$NavigationRail$1(windowInsets2, function32, i922, content));
            int i1022 = i922 << 3;
            WindowInsets windowInsets322 = windowInsets2;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j522, 0.0f, 0.0f, null, composableLambda22, startRestartGroup, (i922 & 14) | 12582912 | (i1022 & 896) | (i1022 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj3 = windowInsets322;
            j4 = j522;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj2 = function3;
        if ((57344 & i) != 0) {
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
        function32 = obj2;
        windowInsets2 = obj3;
        long j5222 = j4;
        int i9222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -2092683357, true, new NavigationRailKt$NavigationRail$1(windowInsets2, function32, i9222, content));
        int i10222 = i9222 << 3;
        WindowInsets windowInsets3222 = windowInsets2;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j5222, 0.0f, 0.0f, null, composableLambda222, startRestartGroup, (i9222 & 14) | 12582912 | (i10222 & 896) | (i10222 & 7168), 114);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj3 = windowInsets3222;
        j4 = j5222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationRailItem(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        InteractionSource interactionSource;
        int i9;
        NavigationRailItemColors navigationRailItemColors2;
        Object obj;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        boolean z6;
        boolean z7;
        NavigationRailItemColors navigationRailItemColors3;
        int i10;
        Composer composer2;
        float f;
        boolean changed;
        Object rememberedValue;
        Shape shape;
        NavigationRailItemColors navigationRailItemColors4;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        boolean z8;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1533971045);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItem)P(8,7,3,6,2,5)168@7563L8,169@7623L39,190@8581L2637:NavigationRail.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(icon) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(navigationRailItemColors)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i8 = i7;
                        interactionSource = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(interactionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i12 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function24 = i5 != 0 ? null : function2;
                                if (i6 != 0) {
                                    z5 = true;
                                }
                                if ((i2 & 128) != 0) {
                                    i9 = i8;
                                    navigationRailItemColors2 = NavigationRailItemDefaults.INSTANCE.m1901colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 12582912, 127);
                                    i3 &= -29360129;
                                } else {
                                    i9 = i8;
                                    navigationRailItemColors2 = navigationRailItemColors;
                                }
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    modifier2 = companion;
                                    function22 = function24;
                                    obj = (MutableInteractionSource) rememberedValue2;
                                } else {
                                    obj = mutableInteractionSource;
                                    modifier2 = companion;
                                    function22 = function24;
                                }
                                z6 = z4;
                                z7 = z5;
                                navigationRailItemColors3 = navigationRailItemColors2;
                                i10 = i3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                function22 = function2;
                                navigationRailItemColors3 = navigationRailItemColors;
                                obj = mutableInteractionSource;
                                i10 = i3;
                                z6 = z4;
                                z7 = z5;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1533971045, i10, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                            }
                            composer2 = startRestartGroup;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors3, z, z6, i10, function22, z7, icon));
                            ComposableLambda composableLambda2 = function22 != null ? ComposableLambdaKt.composableLambda(composer2, -105269599, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(navigationRailItemColors3, z, z6, i10, function22)) : null;
                            Modifier m802widthInVpY3zN4$default = SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(SelectableKt.m980selectableO2vRcR0(modifier2, z, obj, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), NavigationRailItemHeight), NavigationRailItemWidth, 0.0f, 2, null);
                            Alignment center = Alignment.Companion.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            NavigationRailItemColors navigationRailItemColors5 = navigationRailItemColors3;
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume;
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m802widthInVpY3zN4$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1104516053, "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r");
                            int i13 = i10;
                            InteractionSource interactionSource2 = obj;
                            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density2 = (Density) consume4;
                            long Offset = OffsetKt.Offset((density2.mo582roundToPx0680j_4(f) - density2.mo582roundToPx0680j_4(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                            Unit unit = Unit.INSTANCE;
                            Offset m3007boximpl = Offset.m3007boximpl(Offset);
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = composer2.changed(m3007boximpl) | composer2.changed(interactionSource2);
                            rememberedValue = composer2.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new MappedInteractionSource(interactionSource2, Offset, null);
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) rememberedValue;
                            if (function22 != null) {
                                composer2.startReplaceableGroup(1104516975);
                                ComposerKt.sourceInformation(composer2, "223@10018L9");
                                shape = ShapesKt.toShape(NavigationRailTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(1104517056);
                                ComposerKt.sourceInformation(composer2, "225@10106L9");
                                shape = ShapesKt.toShape(NavigationRailTokens.INSTANCE.getNoLabelActiveIndicatorShape(), composer2, 6);
                                composer2.endReplaceableGroup();
                            }
                            NavigationRailItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new NavigationRailKt$NavigationRailItem$2$indicatorRipple$1(shape, mappedInteractionSource)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new NavigationRailKt$NavigationRailItem$2$indicator$1(navigationRailItemColors5, i13, shape, animateFloatAsState)), composableLambda, composableLambda2, z7, NavigationRailItem$lambda$5$lambda$2(animateFloatAsState), composer2, ((i13 >> 6) & 57344) | 438);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            interactionSource = interactionSource2;
                            navigationRailItemColors4 = navigationRailItemColors5;
                            modifier3 = modifier2;
                            z4 = z6;
                            function23 = function22;
                            z8 = z7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            navigationRailItemColors4 = navigationRailItemColors;
                            composer2 = startRestartGroup;
                            z8 = z5;
                            function23 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItem$3(z, onClick, icon, modifier3, z4, function23, z8, navigationRailItemColors4, interactionSource, i, i2));
                        return;
                    }
                    i8 = i7;
                    interactionSource = mutableInteractionSource;
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    z6 = z4;
                    z7 = z5;
                    navigationRailItemColors3 = navigationRailItemColors2;
                    i10 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors3, z, z6, i10, function22, z7, icon));
                    if (function22 != null) {
                    }
                    Modifier m802widthInVpY3zN4$default2 = SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(SelectableKt.m980selectableO2vRcR0(modifier2, z, obj, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), NavigationRailItemHeight), NavigationRailItemWidth, 0.0f, 2, null);
                    Alignment center2 = Alignment.Companion.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    NavigationRailItemColors navigationRailItemColors52 = navigationRailItemColors3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density3 = (Density) consume5;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m802widthInVpY3zN4$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl2, density3, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1104516053, "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r");
                    int i132 = i10;
                    InteractionSource interactionSource22 = obj;
                    State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume42 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density22 = (Density) consume42;
                    long Offset2 = OffsetKt.Offset((density22.mo582roundToPx0680j_4(f) - density22.mo582roundToPx0680j_4(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit2 = Unit.INSTANCE;
                    Offset m3007boximpl2 = Offset.m3007boximpl(Offset2);
                    composer2.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = composer2.changed(m3007boximpl2) | composer2.changed(interactionSource22);
                    rememberedValue = composer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new MappedInteractionSource(interactionSource22, Offset2, null);
                    composer2.updateRememberedValue(rememberedValue);
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) rememberedValue;
                    if (function22 != null) {
                    }
                    NavigationRailItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new NavigationRailKt$NavigationRailItem$2$indicatorRipple$1(shape, mappedInteractionSource2)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new NavigationRailKt$NavigationRailItem$2$indicator$1(navigationRailItemColors52, i132, shape, animateFloatAsState2)), composableLambda3, composableLambda2, z7, NavigationRailItem$lambda$5$lambda$2(animateFloatAsState2), composer2, ((i132 >> 6) & 57344) | 438);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    interactionSource = interactionSource22;
                    navigationRailItemColors4 = navigationRailItemColors52;
                    modifier3 = modifier2;
                    z4 = z6;
                    function23 = function22;
                    z8 = z7;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                interactionSource = mutableInteractionSource;
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i9 != 0) {
                }
                z6 = z4;
                z7 = z5;
                navigationRailItemColors3 = navigationRailItemColors2;
                i10 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors3, z, z6, i10, function22, z7, icon));
                if (function22 != null) {
                }
                Modifier m802widthInVpY3zN4$default22 = SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(SelectableKt.m980selectableO2vRcR0(modifier2, z, obj, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), NavigationRailItemHeight), NavigationRailItemWidth, 0.0f, 2, null);
                Alignment center22 = Alignment.Companion.getCenter();
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                NavigationRailItemColors navigationRailItemColors522 = navigationRailItemColors3;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume52 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density32 = (Density) consume52;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m802widthInVpY3zN4$default22);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl22, density32, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1104516053, "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r");
                int i1322 = i10;
                InteractionSource interactionSource222 = obj;
                State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume422 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density222 = (Density) consume422;
                long Offset22 = OffsetKt.Offset((density222.mo582roundToPx0680j_4(f) - density222.mo582roundToPx0680j_4(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit22 = Unit.INSTANCE;
                Offset m3007boximpl22 = Offset.m3007boximpl(Offset22);
                composer2.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = composer2.changed(m3007boximpl22) | composer2.changed(interactionSource222);
                rememberedValue = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new MappedInteractionSource(interactionSource222, Offset22, null);
                composer2.updateRememberedValue(rememberedValue);
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource22 = (MappedInteractionSource) rememberedValue;
                if (function22 != null) {
                }
                NavigationRailItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new NavigationRailKt$NavigationRailItem$2$indicatorRipple$1(shape, mappedInteractionSource22)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new NavigationRailKt$NavigationRailItem$2$indicator$1(navigationRailItemColors522, i1322, shape, animateFloatAsState22)), composableLambda32, composableLambda2, z7, NavigationRailItem$lambda$5$lambda$2(animateFloatAsState22), composer2, ((i1322 >> 6) & 57344) | 438);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                interactionSource = interactionSource222;
                navigationRailItemColors4 = navigationRailItemColors522;
                modifier3 = modifier2;
                z4 = z6;
                function23 = function22;
                z8 = z7;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            interactionSource = mutableInteractionSource;
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i9 != 0) {
            }
            z6 = z4;
            z7 = z5;
            navigationRailItemColors3 = navigationRailItemColors2;
            i10 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors3, z, z6, i10, function22, z7, icon));
            if (function22 != null) {
            }
            Modifier m802widthInVpY3zN4$default222 = SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(SelectableKt.m980selectableO2vRcR0(modifier2, z, obj, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), NavigationRailItemHeight), NavigationRailItemWidth, 0.0f, 2, null);
            Alignment center222 = Alignment.Companion.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            NavigationRailItemColors navigationRailItemColors5222 = navigationRailItemColors3;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume522 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density322 = (Density) consume522;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m802widthInVpY3zN4$default222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl222, density322, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1104516053, "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r");
            int i13222 = i10;
            InteractionSource interactionSource2222 = obj;
            State<Float> animateFloatAsState222 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density2222 = (Density) consume4222;
            long Offset222 = OffsetKt.Offset((density2222.mo582roundToPx0680j_4(f) - density2222.mo582roundToPx0680j_4(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
            Unit unit222 = Unit.INSTANCE;
            Offset m3007boximpl222 = Offset.m3007boximpl(Offset222);
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = composer2.changed(m3007boximpl222) | composer2.changed(interactionSource2222);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new MappedInteractionSource(interactionSource2222, Offset222, null);
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            MappedInteractionSource mappedInteractionSource222 = (MappedInteractionSource) rememberedValue;
            if (function22 != null) {
            }
            NavigationRailItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new NavigationRailKt$NavigationRailItem$2$indicatorRipple$1(shape, mappedInteractionSource222)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new NavigationRailKt$NavigationRailItem$2$indicator$1(navigationRailItemColors5222, i13222, shape, animateFloatAsState222)), composableLambda322, composableLambda2, z7, NavigationRailItem$lambda$5$lambda$2(animateFloatAsState222), composer2, ((i13222 >> 6) & 57344) | 438);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            interactionSource = interactionSource2222;
            navigationRailItemColors4 = navigationRailItemColors5222;
            modifier3 = modifier2;
            z4 = z6;
            function23 = function22;
            z8 = z7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        interactionSource = mutableInteractionSource;
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i9 != 0) {
        }
        z6 = z4;
        z7 = z5;
        navigationRailItemColors3 = navigationRailItemColors2;
        i10 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors3, z, z6, i10, function22, z7, icon));
        if (function22 != null) {
        }
        Modifier m802widthInVpY3zN4$default2222 = SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(SelectableKt.m980selectableO2vRcR0(modifier2, z, obj, null, z6, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), NavigationRailItemHeight), NavigationRailItemWidth, 0.0f, 2, null);
        Alignment center2222 = Alignment.Companion.getCenter();
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        NavigationRailItemColors navigationRailItemColors52222 = navigationRailItemColors3;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume5222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density3222 = (Density) consume5222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume32222;
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(m802widthInVpY3zN4$default2222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl2222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl2222, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2222, density3222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl2222, layoutDirection2222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl2222, viewConfiguration2222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1104516053, "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r");
        int i132222 = i10;
        InteractionSource interactionSource22222 = obj;
        State<Float> animateFloatAsState2222 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume42222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density22222 = (Density) consume42222;
        long Offset2222 = OffsetKt.Offset((density22222.mo582roundToPx0680j_4(f) - density22222.mo582roundToPx0680j_4(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
        Unit unit2222 = Unit.INSTANCE;
        Offset m3007boximpl2222 = Offset.m3007boximpl(Offset2222);
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = composer2.changed(m3007boximpl2222) | composer2.changed(interactionSource22222);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new MappedInteractionSource(interactionSource22222, Offset2222, null);
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        MappedInteractionSource mappedInteractionSource2222 = (MappedInteractionSource) rememberedValue;
        if (function22 != null) {
        }
        NavigationRailItemBaselineLayout(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new NavigationRailKt$NavigationRailItem$2$indicatorRipple$1(shape, mappedInteractionSource2222)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new NavigationRailKt$NavigationRailItem$2$indicator$1(navigationRailItemColors52222, i132222, shape, animateFloatAsState2222)), composableLambda3222, composableLambda2, z7, NavigationRailItem$lambda$5$lambda$2(animateFloatAsState2222), composer2, ((i132222 >> 6) & 57344) | 438);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        interactionSource = interactionSource22222;
        navigationRailItemColors4 = navigationRailItemColors52222;
        modifier3 = modifier2;
        z4 = z6;
        function23 = function22;
        z8 = z7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-876426901);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)P(4,3,2,5)434@18778L2562:NavigationRail.kt#uh7d8r");
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
                ComposerKt.traceEventStart(-876426901, i2, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:426)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemBaselineLayout$2
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
                    Object obj;
                    Placeable placeable;
                    MeasureResult m1907placeLabelAndIconzUg2_y0;
                    MeasureResult m1906placeIconX9ElhV4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                            int width = mo4545measureBRTryo0.getWidth();
                            f2 = NavigationRailKt.IndicatorHorizontalPadding;
                            float f3 = 2;
                            int i3 = width + Layout.mo582roundToPx0680j_4(Dp.m5607constructorimpl(f2 * f3));
                            int roundToInt = MathKt.roundToInt(i3 * f);
                            int height = mo4545measureBRTryo0.getHeight() + Layout.mo582roundToPx0680j_4(Dp.m5607constructorimpl((function24 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * f3));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                                    Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(i3, height));
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
                                    Placeable mo4545measureBRTryo03 = measurable3 != null ? measurable3.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(roundToInt, height)) : null;
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
                                        m1906placeIconX9ElhV4 = NavigationRailKt.m1906placeIconX9ElhV4(Layout, mo4545measureBRTryo0, mo4545measureBRTryo02, mo4545measureBRTryo03, j);
                                        return m1906placeIconX9ElhV4;
                                    }
                                    Intrinsics.checkNotNull(placeable);
                                    m1907placeLabelAndIconzUg2_y0 = NavigationRailKt.m1907placeLabelAndIconzUg2_y0(Layout, placeable, mo4545measureBRTryo0, mo4545measureBRTryo02, mo4545measureBRTryo03, j, z, f);
                                    return m1907placeLabelAndIconzUg2_y0;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 935757153, "C435@18795L17,440@18893L50:NavigationRail.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(935757179);
            ComposerKt.sourceInformation(startRestartGroup, "437@18862L11");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -601536754, "C440@18935L6:NavigationRail.kt#uh7d8r");
            function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-853550242);
            ComposerKt.sourceInformation(startRestartGroup, "443@18986L178");
            if (function24 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, "label"), z ? 1.0f : f);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(alpha);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -601536534, "C447@19155L7:NavigationRail.kt#uh7d8r");
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
        endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m1906placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m5565constrainWidthK40F9xA = ConstraintsKt.m5565constrainWidthK40F9xA(j, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        return MeasureScope.CC.layout$default(measureScope, m5565constrainWidthK40F9xA, m5550getMaxHeightimpl, null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (m5565constrainWidthK40F9xA - placeable.getWidth()) / 2, (m5550getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m5565constrainWidthK40F9xA - placeable2.getWidth()) / 2, (m5550getMaxHeightimpl - placeable2.getHeight()) / 2, m5565constrainWidthK40F9xA, m5550getMaxHeightimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m1907placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        float f2 = NavigationRailItemVerticalPadding;
        int height = (m5550getMaxHeightimpl - placeable.getHeight()) - measureScope.mo582roundToPx0680j_4(f2);
        int i = measureScope.mo582roundToPx0680j_4(f2);
        int roundToInt = MathKt.roundToInt(((z ? i : (m5550getMaxHeightimpl - placeable2.getHeight()) / 2) - i) * (1 - f));
        int m5565constrainWidthK40F9xA = ConstraintsKt.m5565constrainWidthK40F9xA(j, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        return MeasureScope.CC.layout$default(measureScope, m5565constrainWidthK40F9xA, m5550getMaxHeightimpl, null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (m5565constrainWidthK40F9xA - placeable.getWidth()) / 2, height, roundToInt, placeable2, (m5565constrainWidthK40F9xA - placeable2.getWidth()) / 2, i, placeable3, (m5565constrainWidthK40F9xA - placeable3.getWidth()) / 2, i - measureScope.mo582roundToPx0680j_4(IndicatorVerticalPaddingWithLabel), m5565constrainWidthK40F9xA, measureScope), 4, null);
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailItem$lambda$5$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 4;
        NavigationRailVerticalPadding = Dp.m5607constructorimpl(f);
        NavigationRailItemVerticalPadding = Dp.m5607constructorimpl(f);
        float f2 = 2;
        IndicatorHorizontalPadding = Dp.m5607constructorimpl(Dp.m5607constructorimpl(NavigationRailTokens.INSTANCE.m2568getActiveIndicatorWidthD9Ej5fM() - NavigationRailTokens.INSTANCE.m2571getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingWithLabel = Dp.m5607constructorimpl(Dp.m5607constructorimpl(NavigationRailTokens.INSTANCE.m2567getActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m2571getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingNoLabel = Dp.m5607constructorimpl(Dp.m5607constructorimpl(NavigationRailTokens.INSTANCE.m2573getNoLabelActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m2571getIconSizeD9Ej5fM()) / f2);
    }
}
