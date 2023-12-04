package com.google.accompanist.flowlayout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ap\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001av\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\b\u0002\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001av\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\b\u0002\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018*\n\u0010\u001b\"\u00020\t2\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Flow", "", "modifier", "Landroidx/compose/ui/Modifier;", "orientation", "Lcom/google/accompanist/flowlayout/LayoutOrientation;", "mainAxisSize", "Lcom/google/accompanist/flowlayout/SizeMode;", "mainAxisAlignment", "Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "Lcom/google/accompanist/flowlayout/FlowMainAxisAlignment;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;", "crossAxisSpacing", "lastLineMainAxisAlignment", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Flow-F4y8cZ0", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/LayoutOrientation;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FlowColumn", "FlowColumn-07r0xoM", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "FlowRow-07r0xoM", "FlowMainAxisAlignment", "flowlayout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* renamed from: FlowRow-07r0xoM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6459FlowRow07r0xoM(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        float f3;
        int i6;
        Object obj3;
        int i7;
        int i8;
        MainAxisAlignment mainAxisAlignment3;
        float f4;
        Object obj4;
        Object obj5;
        float f5;
        Object obj6;
        Modifier modifier2;
        Modifier modifier3;
        SizeMode sizeMode2;
        MainAxisAlignment mainAxisAlignment4;
        float f6;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        float f7;
        MainAxisAlignment mainAxisAlignment5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-137566119);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowRow)P(7,5,4,6:c#ui.unit.Dp,1,2:c#ui.unit.Dp,3)");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = sizeMode;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = mainAxisAlignment;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    f3 = f;
                    i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                        obj3 = flowCrossAxisAlignment;
                    } else {
                        obj3 = flowCrossAxisAlignment;
                        if ((i & 57344) == 0) {
                            i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(mainAxisAlignment2)) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 29360128) == 0) {
                            i8 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : modifier;
                                if (i10 != 0) {
                                    obj = SizeMode.Wrap;
                                }
                                if (i4 != 0) {
                                    obj2 = MainAxisAlignment.Start;
                                }
                                if (i5 != 0) {
                                    f3 = Dp.m5607constructorimpl(0);
                                }
                                if (i6 != 0) {
                                    obj3 = FlowCrossAxisAlignment.Start;
                                }
                                float m5607constructorimpl = i7 != 0 ? Dp.m5607constructorimpl(0) : f2;
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    f4 = m5607constructorimpl;
                                    obj4 = obj;
                                    obj5 = obj2;
                                    mainAxisAlignment3 = obj5;
                                } else {
                                    mainAxisAlignment3 = mainAxisAlignment2;
                                    f4 = m5607constructorimpl;
                                    obj4 = obj;
                                    obj5 = obj2;
                                }
                                f5 = f3;
                                obj6 = obj3;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                f4 = f2;
                                mainAxisAlignment3 = mainAxisAlignment2;
                                obj4 = obj;
                                obj5 = obj2;
                                f5 = f3;
                                obj6 = obj3;
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-137566119, i3, -1, "com.google.accompanist.flowlayout.FlowRow (Flow.kt:46)");
                            }
                            int i11 = i3 << 3;
                            m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Horizontal, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            sizeMode2 = obj4;
                            mainAxisAlignment4 = obj5;
                            f6 = f5;
                            flowCrossAxisAlignment2 = obj6;
                            f7 = f4;
                            mainAxisAlignment5 = mainAxisAlignment3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            f7 = f2;
                            sizeMode2 = obj;
                            mainAxisAlignment4 = obj2;
                            f6 = f3;
                            flowCrossAxisAlignment2 = obj3;
                            mainAxisAlignment5 = mainAxisAlignment2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new FlowKt$FlowRow$1(modifier3, sizeMode2, mainAxisAlignment4, f6, flowCrossAxisAlignment2, f7, mainAxisAlignment5, content, i, i2));
                        return;
                    }
                    i8 = 12582912;
                    i3 |= i8;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
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
                    if ((i2 & 64) != 0) {
                    }
                    f5 = f3;
                    obj6 = obj3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i3 << 3;
                    m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Horizontal, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (i112 & 458752) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    sizeMode2 = obj4;
                    mainAxisAlignment4 = obj5;
                    f6 = f5;
                    flowCrossAxisAlignment2 = obj6;
                    f7 = f4;
                    mainAxisAlignment5 = mainAxisAlignment3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f3 = f;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i8;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
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
                if ((i2 & 64) != 0) {
                }
                f5 = f3;
                obj6 = obj3;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i3 << 3;
                m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Horizontal, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i1122 & 896) | (i1122 & 7168) | (57344 & i1122) | (i1122 & 458752) | (i1122 & 3670016) | (i1122 & 29360128) | (i1122 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                sizeMode2 = obj4;
                mainAxisAlignment4 = obj5;
                f6 = f5;
                flowCrossAxisAlignment2 = obj6;
                f7 = f4;
                mainAxisAlignment5 = mainAxisAlignment3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = mainAxisAlignment;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f3 = f;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i8;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
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
            if ((i2 & 64) != 0) {
            }
            f5 = f3;
            obj6 = obj3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i3 << 3;
            m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Horizontal, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i11222 & 896) | (i11222 & 7168) | (57344 & i11222) | (i11222 & 458752) | (i11222 & 3670016) | (i11222 & 29360128) | (i11222 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            sizeMode2 = obj4;
            mainAxisAlignment4 = obj5;
            f6 = f5;
            flowCrossAxisAlignment2 = obj6;
            f7 = f4;
            mainAxisAlignment5 = mainAxisAlignment3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = sizeMode;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = mainAxisAlignment;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f3 = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i8;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
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
        if ((i2 & 64) != 0) {
        }
        f5 = f3;
        obj6 = obj3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i3 << 3;
        m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Horizontal, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i112222 & 896) | (i112222 & 7168) | (57344 & i112222) | (i112222 & 458752) | (i112222 & 3670016) | (i112222 & 29360128) | (i112222 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        sizeMode2 = obj4;
        mainAxisAlignment4 = obj5;
        f6 = f5;
        flowCrossAxisAlignment2 = obj6;
        f7 = f4;
        mainAxisAlignment5 = mainAxisAlignment3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* renamed from: FlowColumn-07r0xoM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6458FlowColumn07r0xoM(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        float f3;
        int i6;
        Object obj3;
        int i7;
        int i8;
        MainAxisAlignment mainAxisAlignment3;
        float f4;
        Object obj4;
        Object obj5;
        float f5;
        Object obj6;
        Modifier modifier2;
        Modifier modifier3;
        SizeMode sizeMode2;
        MainAxisAlignment mainAxisAlignment4;
        float f6;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        float f7;
        MainAxisAlignment mainAxisAlignment5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(203669733);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowColumn)P(7,5,4,6:c#ui.unit.Dp,1,2:c#ui.unit.Dp,3)");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = sizeMode;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = mainAxisAlignment;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    f3 = f;
                    i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                        obj3 = flowCrossAxisAlignment;
                    } else {
                        obj3 = flowCrossAxisAlignment;
                        if ((i & 57344) == 0) {
                            i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(mainAxisAlignment2)) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 29360128) == 0) {
                            i8 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : modifier;
                                if (i10 != 0) {
                                    obj = SizeMode.Wrap;
                                }
                                if (i4 != 0) {
                                    obj2 = MainAxisAlignment.Start;
                                }
                                if (i5 != 0) {
                                    f3 = Dp.m5607constructorimpl(0);
                                }
                                if (i6 != 0) {
                                    obj3 = FlowCrossAxisAlignment.Start;
                                }
                                float m5607constructorimpl = i7 != 0 ? Dp.m5607constructorimpl(0) : f2;
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    f4 = m5607constructorimpl;
                                    obj4 = obj;
                                    obj5 = obj2;
                                    mainAxisAlignment3 = obj5;
                                } else {
                                    mainAxisAlignment3 = mainAxisAlignment2;
                                    f4 = m5607constructorimpl;
                                    obj4 = obj;
                                    obj5 = obj2;
                                }
                                f5 = f3;
                                obj6 = obj3;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                f4 = f2;
                                mainAxisAlignment3 = mainAxisAlignment2;
                                obj4 = obj;
                                obj5 = obj2;
                                f5 = f3;
                                obj6 = obj3;
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(203669733, i3, -1, "com.google.accompanist.flowlayout.FlowColumn (Flow.kt:84)");
                            }
                            int i11 = i3 << 3;
                            m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Vertical, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            sizeMode2 = obj4;
                            mainAxisAlignment4 = obj5;
                            f6 = f5;
                            flowCrossAxisAlignment2 = obj6;
                            f7 = f4;
                            mainAxisAlignment5 = mainAxisAlignment3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            f7 = f2;
                            sizeMode2 = obj;
                            mainAxisAlignment4 = obj2;
                            f6 = f3;
                            flowCrossAxisAlignment2 = obj3;
                            mainAxisAlignment5 = mainAxisAlignment2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new FlowKt$FlowColumn$1(modifier3, sizeMode2, mainAxisAlignment4, f6, flowCrossAxisAlignment2, f7, mainAxisAlignment5, content, i, i2));
                        return;
                    }
                    i8 = 12582912;
                    i3 |= i8;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
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
                    if ((i2 & 64) != 0) {
                    }
                    f5 = f3;
                    obj6 = obj3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i3 << 3;
                    m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Vertical, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (i112 & 458752) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    sizeMode2 = obj4;
                    mainAxisAlignment4 = obj5;
                    f6 = f5;
                    flowCrossAxisAlignment2 = obj6;
                    f7 = f4;
                    mainAxisAlignment5 = mainAxisAlignment3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f3 = f;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i8;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
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
                if ((i2 & 64) != 0) {
                }
                f5 = f3;
                obj6 = obj3;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i3 << 3;
                m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Vertical, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i1122 & 896) | (i1122 & 7168) | (57344 & i1122) | (i1122 & 458752) | (i1122 & 3670016) | (i1122 & 29360128) | (i1122 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                sizeMode2 = obj4;
                mainAxisAlignment4 = obj5;
                f6 = f5;
                flowCrossAxisAlignment2 = obj6;
                f7 = f4;
                mainAxisAlignment5 = mainAxisAlignment3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = mainAxisAlignment;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f3 = f;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i8;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
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
            if ((i2 & 64) != 0) {
            }
            f5 = f3;
            obj6 = obj3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i3 << 3;
            m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Vertical, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i11222 & 896) | (i11222 & 7168) | (57344 & i11222) | (i11222 & 458752) | (i11222 & 3670016) | (i11222 & 29360128) | (i11222 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            sizeMode2 = obj4;
            mainAxisAlignment4 = obj5;
            f6 = f5;
            flowCrossAxisAlignment2 = obj6;
            f7 = f4;
            mainAxisAlignment5 = mainAxisAlignment3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = sizeMode;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = mainAxisAlignment;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f3 = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i8;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
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
        if ((i2 & 64) != 0) {
        }
        f5 = f3;
        obj6 = obj3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i3 << 3;
        m6457FlowF4y8cZ0(modifier2, LayoutOrientation.Vertical, obj4, obj5, f5, obj6, f4, mainAxisAlignment3, content, startRestartGroup, (i3 & 14) | 48 | (i112222 & 896) | (i112222 & 7168) | (57344 & i112222) | (i112222 & 458752) | (i112222 & 3670016) | (i112222 & 29360128) | (i112222 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        sizeMode2 = obj4;
        mainAxisAlignment4 = obj5;
        f6 = f5;
        flowCrossAxisAlignment2 = obj6;
        f7 = f4;
        mainAxisAlignment5 = mainAxisAlignment3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Flow-F4y8cZ0  reason: not valid java name */
    public static final void m6457FlowF4y8cZ0(Modifier modifier, final LayoutOrientation layoutOrientation, final SizeMode sizeMode, final MainAxisAlignment mainAxisAlignment, final float f, final FlowCrossAxisAlignment flowCrossAxisAlignment, final float f2, final MainAxisAlignment mainAxisAlignment2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1567419051);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(layoutOrientation) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(sizeMode) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mainAxisAlignment) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(flowCrossAxisAlignment) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(mainAxisAlignment2) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1567419051, i2, -1, "com.google.accompanist.flowlayout.Flow (Flow.kt:131)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.google.accompanist.flowlayout.FlowKt$Flow$1
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
                    long Constraints$default;
                    int max;
                    Ref.IntRef intRef;
                    Ref.IntRef intRef2;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    int Flow_F4y8cZ0$mainAxisSize;
                    int Flow_F4y8cZ0$crossAxisSize;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    ArrayList arrayList6 = new ArrayList();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    Ref.IntRef intRef6 = new Ref.IntRef();
                    OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, LayoutOrientation.this, null);
                    if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                        Constraints$default = ConstraintsKt.Constraints$default(0, orientationIndependentConstraints.getMainAxisMax(), 0, 0, 13, null);
                    } else {
                        Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, orientationIndependentConstraints.getMainAxisMax(), 7, null);
                    }
                    long j2 = Constraints$default;
                    for (Measurable measurable : measurables) {
                        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j2);
                        long j3 = j2;
                        OrientationIndependentConstraints orientationIndependentConstraints2 = orientationIndependentConstraints;
                        Ref.IntRef intRef7 = intRef6;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList6, intRef5, Layout, f, orientationIndependentConstraints, LayoutOrientation.this, mo4545measureBRTryo0)) {
                            intRef = intRef5;
                            intRef2 = intRef4;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                        } else {
                            intRef = intRef5;
                            ArrayList arrayList7 = arrayList5;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            intRef2 = intRef4;
                            measure_3p2s80s$startNewSequence(arrayList3, intRef4, Layout, f2, arrayList6, arrayList4, intRef7, arrayList7, intRef3, intRef);
                        }
                        Ref.IntRef intRef8 = intRef;
                        if (!arrayList2.isEmpty()) {
                            intRef8.element += Layout.mo582roundToPx0680j_4(f);
                        }
                        arrayList2.add(mo4545measureBRTryo0);
                        int i3 = intRef8.element;
                        Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize(mo4545measureBRTryo0, LayoutOrientation.this);
                        intRef8.element = i3 + Flow_F4y8cZ0$mainAxisSize;
                        intRef6 = intRef7;
                        int i4 = intRef6.element;
                        Flow_F4y8cZ0$crossAxisSize = FlowKt.Flow_F4y8cZ0$crossAxisSize(mo4545measureBRTryo0, LayoutOrientation.this);
                        intRef6.element = Math.max(i4, Flow_F4y8cZ0$crossAxisSize);
                        intRef5 = intRef8;
                        arrayList6 = arrayList2;
                        arrayList5 = arrayList;
                        orientationIndependentConstraints = orientationIndependentConstraints2;
                        j2 = j3;
                        intRef4 = intRef2;
                    }
                    OrientationIndependentConstraints orientationIndependentConstraints3 = orientationIndependentConstraints;
                    Ref.IntRef intRef9 = intRef4;
                    ArrayList arrayList8 = arrayList5;
                    Ref.IntRef intRef10 = intRef5;
                    ArrayList arrayList9 = arrayList6;
                    if (!arrayList9.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList3, intRef9, Layout, f2, arrayList9, arrayList4, intRef6, arrayList8, intRef3, intRef10);
                    }
                    if (orientationIndependentConstraints3.getMainAxisMax() != Integer.MAX_VALUE && sizeMode == SizeMode.Expand) {
                        max = orientationIndependentConstraints3.getMainAxisMax();
                    } else {
                        max = Math.max(intRef3.element, orientationIndependentConstraints3.getMainAxisMin());
                    }
                    int i5 = max;
                    int max2 = Math.max(intRef9.element, orientationIndependentConstraints3.getCrossAxisMin());
                    return MeasureScope.CC.layout$default(Layout, LayoutOrientation.this == LayoutOrientation.Horizontal ? i5 : max2, LayoutOrientation.this == LayoutOrientation.Horizontal ? max2 : i5, null, new FlowKt$Flow$1$measure$1(arrayList3, Layout, f, mainAxisAlignment, mainAxisAlignment2, LayoutOrientation.this, i5, flowCrossAxisAlignment, arrayList4, arrayList8), 4, null);
                }

                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation2, Placeable placeable) {
                    int Flow_F4y8cZ0$mainAxisSize;
                    if (!list.isEmpty()) {
                        int i3 = intRef.element + measureScope.mo582roundToPx0680j_4(f3);
                        Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize(placeable, layoutOrientation2);
                        if (i3 + Flow_F4y8cZ0$mainAxisSize > orientationIndependentConstraints.getMainAxisMax()) {
                            return false;
                        }
                    }
                    return true;
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        intRef.element += measureScope.mo582roundToPx0680j_4(f3);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(intRef2.element));
                    list4.add(Integer.valueOf(intRef.element));
                    intRef.element += intRef2.element;
                    intRef3.element = Math.max(intRef3.element, intRef4.element);
                    list2.clear();
                    intRef4.element = 0;
                    intRef2.element = 0;
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i3 = (((((i2 << 3) & 112) | ((i2 >> 24) & 14)) << 9) & 7168) | 6;
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
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
        endRestartGroup.updateScope(new FlowKt$Flow$2(modifier, layoutOrientation, sizeMode, mainAxisAlignment, f, flowCrossAxisAlignment, f2, mainAxisAlignment2, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }
}
