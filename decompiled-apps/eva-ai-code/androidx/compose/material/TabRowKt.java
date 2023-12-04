package androidx.compose.material;

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
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a¢\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m5607constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* renamed from: TabRow-pAZo6Ak  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1501TabRowpAZo6Ak(int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Object obj;
        int i6;
        Function2<Composer, Integer, Unit> function22;
        Modifier.Companion companion;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-249175289);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)131@6500L6,132@6549L32,145@7006L1504:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i4 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i4 |= i7;
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
                    function22 = function2;
                    i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changedInstance(tabs) ? 1048576 : 524288;
                    }
                    if ((i4 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 == 0 ? Modifier.Companion : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            ComposableLambda composableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -553782708, true, new TabRowKt$TabRow$1(i)) : obj;
                            if (i6 != 0) {
                                function22 = ComposableSingletons$TabRowKt.INSTANCE.m1340getLambda1$material_release();
                            }
                            function32 = composableLambda;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            function32 = obj;
                        }
                        long j5 = j4;
                        int i9 = i4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-249175289, i9, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                        }
                        function23 = function22;
                        SurfaceKt.m1471SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j3, j5, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new TabRowKt$TabRow$2(tabs, function22, function32, i9)), startRestartGroup, (i9 & 896) | 1572864 | (i9 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j5;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function32 = obj;
                        function23 = function22;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabRowKt$TabRow$3(i, modifier2, j3, j4, function32, function23, tabs, i2, i3));
                    return;
                }
                function22 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                function32 = composableLambda;
                long j52 = j4;
                int i92 = i4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                function23 = function22;
                SurfaceKt.m1471SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j3, j52, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new TabRowKt$TabRow$2(tabs, function22, function32, i92)), startRestartGroup, (i92 & 896) | 1572864 | (i92 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = j52;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            function32 = composableLambda;
            long j522 = j4;
            int i922 = i4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            function23 = function22;
            SurfaceKt.m1471SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j3, j522, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new TabRowKt$TabRow$2(tabs, function22, function32, i922)), startRestartGroup, (i922 & 896) | 1572864 | (i922 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j522;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        function22 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        function32 = composableLambda;
        long j5222 = j4;
        int i9222 = i4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        function23 = function22;
        SurfaceKt.m1471SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j3, j5222, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new TabRowKt$TabRow$2(tabs, function22, function32, i9222)), startRestartGroup, (i9222 & 896) | 1572864 | (i9222 & 7168), 50);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j5222;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* renamed from: ScrollableTabRow-sKfQg0A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1500ScrollableTabRowsKfQg0A(int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        Modifier.Companion companion;
        float m1499getScrollableTabRowPaddingD9Ej5fM;
        Function2<Composer, Integer, Unit> m1341getLambda2$material_release;
        int i9;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-1473476840);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)225@11118L6,226@11167L32,240@11686L3006:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i11 = 256;
                        i4 |= i11;
                    }
                } else {
                    j3 = j;
                }
                i11 = 128;
                i4 |= i11;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j4 = j2;
                }
                i10 = 1024;
                i4 |= i10;
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
                if ((i3 & 128) == 0) {
                    if ((29360128 & i2) == 0) {
                        i8 = startRestartGroup.changedInstance(tabs) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.Companion : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            m1499getScrollableTabRowPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m1499getScrollableTabRowPaddingD9Ej5fM() : f2;
                            ComposableLambda composableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -655609869, true, new TabRowKt$ScrollableTabRow$1(i)) : function3;
                            m1341getLambda2$material_release = i7 == 0 ? ComposableSingletons$TabRowKt.INSTANCE.m1341getLambda2$material_release() : function2;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = composableLambda;
                            i9 = i4;
                            function32 = function34;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            m1341getLambda2$material_release = function2;
                            i9 = i4;
                            m1499getScrollableTabRowPaddingD9Ej5fM = f2;
                            function32 = function3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473476840, i9, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                        }
                        SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j4, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new TabRowKt$ScrollableTabRow$2(m1499getScrollableTabRowPaddingD9Ej5fM, tabs, m1341getLambda2$material_release, i, function32, i9)), startRestartGroup, ((i9 >> 3) & 14) | 1572864 | (i9 & 896) | (i9 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function33 = function32;
                        f2 = m1499getScrollableTabRowPaddingD9Ej5fM;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function33 = function3;
                        m1341getLambda2$material_release = function2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabRowKt$ScrollableTabRow$3(i, modifier2, j3, j4, f2, function33, m1341getLambda2$material_release, tabs, i2, i3));
                    return;
                }
                i8 = 12582912;
                i4 |= i8;
                if ((23967451 & i4) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = composableLambda;
                i9 = i4;
                function32 = function342;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j4, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new TabRowKt$ScrollableTabRow$2(m1499getScrollableTabRowPaddingD9Ej5fM, tabs, m1341getLambda2$material_release, i, function32, i9)), startRestartGroup, ((i9 >> 3) & 14) | 1572864 | (i9 & 896) | (i9 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                }
                function33 = function32;
                f2 = m1499getScrollableTabRowPaddingD9Ej5fM;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 128) == 0) {
            }
            i4 |= i8;
            if ((23967451 & i4) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3422 = composableLambda;
            i9 = i4;
            function32 = function3422;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j4, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new TabRowKt$ScrollableTabRow$2(m1499getScrollableTabRowPaddingD9Ej5fM, tabs, m1341getLambda2$material_release, i, function32, i9)), startRestartGroup, ((i9 >> 3) & 14) | 1572864 | (i9 & 896) | (i9 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
            }
            function33 = function32;
            f2 = m1499getScrollableTabRowPaddingD9Ej5fM;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i3 & 128) == 0) {
        }
        i4 |= i8;
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34222 = composableLambda;
        i9 = i4;
        function32 = function34222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m1471SurfaceFjzlyU(companion, null, j3, j4, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new TabRowKt$ScrollableTabRow$2(m1499getScrollableTabRowPaddingD9Ej5fM, tabs, m1341getLambda2$material_release, i, function32, i9)), startRestartGroup, ((i9 >> 3) & 14) | 1572864 | (i9 & 896) | (i9 & 7168), 50);
        if (ComposerKt.isTraceInProgress()) {
        }
        function33 = function32;
        f2 = m1499getScrollableTabRowPaddingD9Ej5fM;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
