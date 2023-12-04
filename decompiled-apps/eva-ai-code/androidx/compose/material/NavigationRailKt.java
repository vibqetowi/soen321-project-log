package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
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
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0091\u0001\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001d2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a=\u0010*\u001a\u00020\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010,\u001aU\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a)\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u000206*\u0002072\u0006\u0010?\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\n\u00102\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", FirebaseAnalytics.Param.CONTENT, "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", Constants.ScionAnalytics.PARAM_LABEL, "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m5607constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m5607constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m5607constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m5607constructorimpl(14);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* renamed from: NavigationRail-HsRjFd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1408NavigationRailHsRjFd4(Modifier modifier, long j, long j2, float f, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        Object obj2;
        int i5;
        Modifier.Companion companion;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        long j5;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1790971523);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRail)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp,4)94@4333L6,95@4375L32,100@4577L552:NavigationRail.kt#jmzs0o");
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
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = function3;
                i3 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i7 == 0 ? Modifier.Companion : obj;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            }
                            if (i8 != 0) {
                                f2 = NavigationRailDefaults.INSTANCE.m1407getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                function32 = null;
                                j5 = j4;
                                int i9 = i3;
                                float f3 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1790971523, i9, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                                }
                                int i10 = i9 << 3;
                                SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j5, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new NavigationRailKt$NavigationRail$1(function32, i9, content)), startRestartGroup, (i9 & 14) | 1572864 | (i10 & 896) | (i10 & 7168) | ((i9 << 6) & 458752), 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j4 = j5;
                                f2 = f3;
                                obj = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            companion = obj;
                        }
                        j5 = j4;
                        function32 = obj2;
                        int i92 = i3;
                        float f32 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i92 << 3;
                        SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j5, null, f32, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new NavigationRailKt$NavigationRail$1(function32, i92, content)), startRestartGroup, (i92 & 14) | 1572864 | (i102 & 896) | (i102 & 7168) | ((i92 << 6) & 458752), 18);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j4 = j5;
                        f2 = f32;
                        obj = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function32 = obj2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new NavigationRailKt$NavigationRail$2(obj, j3, j4, f2, function32, content, i, i2));
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                j5 = j4;
                function32 = obj2;
                int i922 = i3;
                float f322 = f2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i922 << 3;
                SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j5, null, f322, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new NavigationRailKt$NavigationRail$1(function32, i922, content)), startRestartGroup, (i922 & 14) | 1572864 | (i1022 & 896) | (i1022 & 7168) | ((i922 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = j5;
                f2 = f322;
                obj = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function3;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            j5 = j4;
            function32 = obj2;
            int i9222 = i3;
            float f3222 = f2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i10222 = i9222 << 3;
            SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j5, null, f3222, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new NavigationRailKt$NavigationRail$1(function32, i9222, content)), startRestartGroup, (i9222 & 14) | 1572864 | (i10222 & 896) | (i10222 & 7168) | ((i9222 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j5;
            f2 = f3222;
            obj = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj2 = function3;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        j5 = j4;
        function32 = obj2;
        int i92222 = i3;
        float f32222 = f2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102222 = i92222 << 3;
        SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j5, null, f32222, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new NavigationRailKt$NavigationRail$1(function32, i92222, content)), startRestartGroup, (i92222 & 14) | 1572864 | (i102222 & 896) | (i102222 & 7168) | ((i92222 << 6) & 458752), 18);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j5;
        f2 = f32222;
        obj = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /* renamed from: NavigationRailItem-0S3VyRs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1409NavigationRailItem0S3VyRs(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z4;
        int i5;
        Object obj2;
        int i6;
        boolean z5;
        int i7;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        long j4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        MutableInteractionSource mutableInteractionSource3;
        boolean z6;
        Modifier modifier2;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        boolean z7;
        long j6;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1813548445);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItem)P(7,6,2,5,1,4!2,8:c#ui.graphics.Color,9:c#ui.graphics.Color)154@6931L39,155@7020L6,156@7090L7,156@7124L6,171@7922L83,175@8010L791:NavigationRail.kt#jmzs0o");
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
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    obj2 = function2;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        z5 = z3;
                        i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changed(j)) {
                                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i9;
                            }
                            i9 = 33554432;
                            i3 |= i9;
                        }
                        if ((i & 1879048192) == 0) {
                            if ((i2 & 512) == 0 && startRestartGroup.changed(j2)) {
                                i8 = 536870912;
                                i3 |= i8;
                            }
                            i8 = 268435456;
                            i3 |= i8;
                        }
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.Companion : obj;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i5 != 0) {
                                    obj2 = null;
                                }
                                if (i6 != 0) {
                                    z5 = true;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                                    i3 &= -234881025;
                                } else {
                                    j3 = j;
                                }
                                if ((i2 & 512) != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j4 = Color.m3290copywmQWz5c$default(((Color) consume).m3301unboximpl(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i3 &= -1879048193;
                                } else {
                                    j4 = j2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                j4 = j2;
                                companion = obj;
                                j3 = j;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1813548445, i3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                            }
                            ComposableLambda composableLambda = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(obj2, i3)) : null;
                            Modifier m795size3ABfNKs = SizeKt.m795size3ABfNKs(SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), obj2 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                            Alignment center = Alignment.Companion.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifier3 = companion;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m795size3ABfNKs);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1714406692, "C187@8378L417:NavigationRail.kt#jmzs0o");
                            int i11 = i3 >> 24;
                            m1410NavigationRailTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new NavigationRailKt$NavigationRailItem$2$1(z5, icon, composableLambda, i3)), startRestartGroup, (i11 & 112) | (i11 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 6) & 896));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource3 = mutableInteractionSource4;
                            z6 = z4;
                            modifier2 = modifier3;
                            j5 = j3;
                            function22 = obj2;
                            z7 = z5;
                            j6 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier2 = obj;
                            z6 = z4;
                            function22 = obj2;
                            z7 = z5;
                            j5 = j;
                            j6 = j2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItem$3(z, onClick, icon, modifier2, z6, function22, z7, mutableInteractionSource3, j5, j6, i, i2));
                        return;
                    }
                    z5 = z3;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((i & 1879048192) == 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposableLambda composableLambda2 = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(obj2, i3)) : null;
                    Modifier m795size3ABfNKs2 = SizeKt.m795size3ABfNKs(SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), obj2 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                    Alignment center2 = Alignment.Companion.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier32 = companion;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m795size3ABfNKs2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1714406692, "C187@8378L417:NavigationRail.kt#jmzs0o");
                    int i112 = i3 >> 24;
                    m1410NavigationRailTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new NavigationRailKt$NavigationRailItem$2$1(z5, icon, composableLambda2, i3)), startRestartGroup, (i112 & 112) | (i112 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 6) & 896));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    mutableInteractionSource3 = mutableInteractionSource42;
                    z6 = z4;
                    modifier2 = modifier32;
                    j5 = j3;
                    function22 = obj2;
                    z7 = z5;
                    j6 = j4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z5 = z3;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposableLambda composableLambda22 = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(obj2, i3)) : null;
                Modifier m795size3ABfNKs22 = SizeKt.m795size3ABfNKs(SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), obj2 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                Alignment center22 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier322 = companion;
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m795size3ABfNKs22);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1714406692, "C187@8378L417:NavigationRail.kt#jmzs0o");
                int i1122 = i3 >> 24;
                m1410NavigationRailTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new NavigationRailKt$NavigationRailItem$2$1(z5, icon, composableLambda22, i3)), startRestartGroup, (i1122 & 112) | (i1122 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 6) & 896));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource3 = mutableInteractionSource422;
                z6 = z4;
                modifier2 = modifier322;
                j5 = j3;
                function22 = obj2;
                z7 = z5;
                j6 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            obj2 = function2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z5 = z3;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda222 = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(obj2, i3)) : null;
            Modifier m795size3ABfNKs222 = SizeKt.m795size3ABfNKs(SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), obj2 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
            Alignment center222 = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier3222 = companion;
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m795size3ABfNKs222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1714406692, "C187@8378L417:NavigationRail.kt#jmzs0o");
            int i11222 = i3 >> 24;
            m1410NavigationRailTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new NavigationRailKt$NavigationRailItem$2$1(z5, icon, composableLambda222, i3)), startRestartGroup, (i11222 & 112) | (i11222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 6) & 896));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource3 = mutableInteractionSource4222;
            z6 = z4;
            modifier2 = modifier3222;
            j5 = j3;
            function22 = obj2;
            z7 = z5;
            j6 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        obj2 = function2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z5 = z3;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda2222 = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(obj2, i3)) : null;
        Modifier m795size3ABfNKs2222 = SizeKt.m795size3ABfNKs(SelectableKt.m980selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), onClick), obj2 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
        Alignment center2222 = Alignment.Companion.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifier32222 = companion;
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(m795size3ABfNKs2222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1714406692, "C187@8378L417:NavigationRail.kt#jmzs0o");
        int i112222 = i3 >> 24;
        m1410NavigationRailTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new NavigationRailKt$NavigationRailItem$2$1(z5, icon, composableLambda2222, i3)), startRestartGroup, (i112222 & 112) | (i112222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 6) & 896));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource3 = mutableInteractionSource42222;
        z6 = z4;
        modifier2 = modifier32222;
        j5 = j3;
        function22 = obj2;
        z7 = z5;
        j6 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition-Klgx-Pg  reason: not valid java name */
    public static final void m1410NavigationRailTransitionKlgxPg(long j, long j2, boolean z, Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)232@9909L126,239@10110L181:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            composer2 = startRestartGroup;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m3342lerpjxsXWHM = ColorKt.m3342lerpjxsXWHM(j2, j, NavigationRailTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(Color.m3290copywmQWz5c$default(m3342lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3293getAlphaimpl(m3342lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -1688205042, true, new NavigationRailKt$NavigationRailTransition$1(function3, i3, animateFloatAsState)), composer2, 56);
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
        endRestartGroup.updateScope(new NavigationRailKt$NavigationRailTransition$2(j, j2, z, function3, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)P(!1,2)264@10960L1118:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2
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
                    Placeable mo4545measureBRTryo0;
                    MeasureResult m1415placeLabelAndIconDIyivk0;
                    MeasureResult m1414placeIcon3p2s80s;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo4545measureBRTryo02 = measurable.mo4545measureBRTryo0(j);
                            if (function22 != null) {
                                for (Measurable measurable2 : list) {
                                    mo4545measureBRTryo0 = Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), Constants.ScionAnalytics.PARAM_LABEL) ? measurable2.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            if (function22 == null) {
                                m1414placeIcon3p2s80s = NavigationRailKt.m1414placeIcon3p2s80s(Layout, mo4545measureBRTryo02, j);
                                return m1414placeIcon3p2s80s;
                            }
                            Intrinsics.checkNotNull(mo4545measureBRTryo0);
                            m1415placeLabelAndIconDIyivk0 = NavigationRailKt.m1415placeLabelAndIconDIyivk0(Layout, mo4545measureBRTryo0, mo4545measureBRTryo02, j, f);
                            return m1415placeLabelAndIconDIyivk0;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 116750785, "C266@10990L41:NavigationRail.kt#jmzs0o");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2053494659, "C266@11023L6:NavigationRail.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(286683862);
            ComposerKt.sourceInformation(startRestartGroup, "268@11081L168");
            if (function22 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, Constants.ScionAnalytics.PARAM_LABEL), f);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(alpha);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2053494876, "C272@11240L7:NavigationRail.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(function2, function22, f, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s  reason: not valid java name */
    public static final MeasureResult m1414placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j) {
        return MeasureScope.CC.layout$default(measureScope, Constraints.m5551getMaxWidthimpl(j), Constraints.m5550getMaxHeightimpl(j), null, new NavigationRailKt$placeIcon$1(placeable, Math.max(0, (Constraints.m5551getMaxWidthimpl(j) - placeable.getWidth()) / 2), Math.max(0, (Constraints.m5550getMaxHeightimpl(j) - placeable.getHeight()) / 2)), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0  reason: not valid java name */
    public static final MeasureResult m1415placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j, float f) {
        int i = placeable.get(AlignmentLineKt.getLastBaseline());
        int m5550getMaxHeightimpl = (Constraints.m5550getMaxHeightimpl(j) - i) - measureScope.mo582roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        int m5551getMaxWidthimpl = (Constraints.m5551getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        int i2 = measureScope.mo582roundToPx0680j_4(ItemIconTopOffset);
        int m5551getMaxWidthimpl2 = (Constraints.m5551getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        return MeasureScope.CC.layout$default(measureScope, Constraints.m5551getMaxWidthimpl(j), Constraints.m5550getMaxHeightimpl(j), null, new NavigationRailKt$placeLabelAndIcon$1(f, placeable, m5551getMaxWidthimpl, m5550getMaxHeightimpl, MathKt.roundToInt((((Constraints.m5550getMaxHeightimpl(j) - placeable2.getHeight()) / 2) - i2) * (1 - f)), placeable2, m5551getMaxWidthimpl2, i2), 4, null);
    }

    static {
        float f = 8;
        NavigationRailPadding = Dp.m5607constructorimpl(f);
        HeaderPadding = Dp.m5607constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
