package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u009d\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00012.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0093\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowPadding", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m5607constructorimpl(90);
    private static final float ScrollableTabRowPadding = Dp.m5607constructorimpl(52);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* renamed from: TabRow-pAZo6Ak  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2102TabRowpAZo6Ak(int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Object obj;
        int i6;
        Object obj2;
        int i7;
        Modifier.Companion companion;
        long j5;
        ComposableLambda composableLambda;
        int i8;
        Function2<Composer, Integer, Unit> m1720getLambda1$material3_release;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)128@6357L14,129@6414L12,142@6844L1858:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                obj = function3;
                i4 |= startRestartGroup.changedInstance(obj) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    obj2 = function2;
                    i4 |= startRestartGroup.changedInstance(obj2) ? 131072 : 65536;
                    if ((i3 & 64) != 0) {
                        if ((i2 & 3670016) == 0) {
                            i7 = startRestartGroup.changedInstance(tabs) ? 1048576 : 524288;
                        }
                        if ((i4 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j5 = TabRowDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j5 = j4;
                                }
                                composableLambda = i5 != 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -2052073983, true, new TabRowKt$TabRow$1(i)) : obj;
                                if (i6 != 0) {
                                    i8 = i4;
                                    m1720getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1720getLambda1$material3_release();
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1199178586, i8, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                                    }
                                    SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    obj2 = m1720getLambda1$material3_release;
                                    j4 = j5;
                                    modifier2 = companion;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                companion = modifier;
                                j5 = j4;
                                composableLambda = obj;
                            }
                            i8 = i4;
                            m1720getLambda1$material3_release = obj2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            obj2 = m1720getLambda1$material3_release;
                            j4 = j5;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            composableLambda = obj;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new TabRowKt$TabRow$3(i, modifier2, j3, j4, composableLambda, obj2, tabs, i2, i3));
                        return;
                    }
                    i7 = 1572864;
                    i4 |= i7;
                    if ((i4 & 2995931) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    i8 = i4;
                    m1720getLambda1$material3_release = obj2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    obj2 = m1720getLambda1$material3_release;
                    j4 = j5;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function2;
                if ((i3 & 64) != 0) {
                }
                i4 |= i7;
                if ((i4 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                i8 = i4;
                m1720getLambda1$material3_release = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                }
                obj2 = m1720getLambda1$material3_release;
                j4 = j5;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            obj2 = function2;
            if ((i3 & 64) != 0) {
            }
            i4 |= i7;
            if ((i4 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            i8 = i4;
            m1720getLambda1$material3_release = obj2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj2 = m1720getLambda1$material3_release;
            j4 = j5;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        obj = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        obj2 = function2;
        if ((i3 & 64) != 0) {
        }
        i4 |= i7;
        if ((i4 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        i8 = i4;
        m1720getLambda1$material3_release = obj2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m2067SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(companion), null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1273256619, true, new TabRowKt$TabRow$2(tabs, m1720getLambda1$material3_release, composableLambda, i8)), startRestartGroup, 12582912 | (i8 & 896) | (i8 & 7168), 114);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj2 = m1720getLambda1$material3_release;
        j4 = j5;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* renamed from: ScrollableTabRow-sKfQg0A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2101ScrollableTabRowsKfQg0A(int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        Modifier.Companion companion;
        long j5;
        float f3;
        ComposableLambda composableLambda;
        int i8;
        Function2<Composer, Integer, Unit> m1721getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier2;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)230@11025L14,231@11082L12,243@11485L3289:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 2048;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 1024;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((29360128 & i2) == 0) {
                    i4 |= startRestartGroup.changedInstance(tabs) ? 8388608 : 4194304;
                }
                if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i11 != 0 ? Modifier.Companion : modifier;
                        if ((i3 & 4) != 0) {
                            j3 = TabRowDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j5 = TabRowDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            j5 = j4;
                        }
                        f3 = i5 != 0 ? ScrollableTabRowPadding : f2;
                        composableLambda = i6 != 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -913748678, true, new TabRowKt$ScrollableTabRow$1(i)) : function3;
                        if (i7 != 0) {
                            i8 = i4;
                            m1721getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1721getLambda2$material3_release();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-497821003, i8, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                            }
                            SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 286469328, true, new TabRowKt$ScrollableTabRow$2(f3, tabs, m1721getLambda2$material3_release, i, composableLambda, i8)), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i8 & 896) | (i8 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = m1721getLambda2$material3_release;
                            f2 = f3;
                            function32 = composableLambda;
                            modifier2 = companion;
                            j4 = j5;
                        } else {
                            i8 = i4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        companion = modifier;
                        i8 = i4;
                        j5 = j4;
                        f3 = f2;
                        composableLambda = function3;
                    }
                    m1721getLambda2$material3_release = function2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j3, j5, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 286469328, true, new TabRowKt$ScrollableTabRow$2(f3, tabs, m1721getLambda2$material3_release, i, composableLambda, i8)), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i8 & 896) | (i8 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function22 = m1721getLambda2$material3_release;
                    f2 = f3;
                    function32 = composableLambda;
                    modifier2 = companion;
                    j4 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    function32 = function3;
                    function22 = function2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new TabRowKt$ScrollableTabRow$3(i, modifier2, j3, j4, f2, function32, function22, tabs, i2, i3));
                return;
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((23967451 & i4) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
    }
}
