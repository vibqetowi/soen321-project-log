package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", FirebaseAnalytics.Param.CONTENT, "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m5607constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m5607constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m5607constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m5607constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* renamed from: FloatingActionButton-bogVsAg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1387FloatingActionButtonbogVsAg(Function0<Unit> onClick, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        Object obj;
        CornerBasedShape cornerBasedShape;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i5;
        int i6;
        long j4;
        long j5;
        Modifier modifier2;
        Object obj2;
        Object obj3;
        long j6;
        FloatingActionButtonElevation m1385elevationxZ9QkE;
        Composer composer2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        long j7;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1028985328);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)P(6,5,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)84@3963L39,85@4037L6,86@4125L6,87@4169L32,88@4279L11,97@4557L28,91@4336L718:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = mutableInteractionSource;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        cornerBasedShape = shape;
                        if (startRestartGroup.changed(cornerBasedShape)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        cornerBasedShape = shape;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    cornerBasedShape = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                    i8 = 8192;
                    i3 |= i8;
                }
                if ((i & 458752) == 0) {
                    j3 = j2;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                } else {
                    j3 = j2;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                            i7 = 1048576;
                            i3 |= i7;
                        }
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i7 = 524288;
                    i3 |= i7;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj = (MutableInteractionSource) rememberedValue;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            }
                            if ((i2 & 16) == 0) {
                                i6 = i3 & (-57345);
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1311getSecondary0d7_KjU();
                            } else {
                                i6 = i3;
                                j4 = j;
                            }
                            if ((i2 & 32) != 0) {
                                j3 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i6 >> 12) & 14);
                                i6 &= -458753;
                            }
                            if ((i2 & 64) == 0) {
                                j5 = j4;
                                i3 = i6 & (-3670017);
                                modifier2 = companion;
                                obj2 = obj;
                                obj3 = cornerBasedShape;
                                j6 = j3;
                                m1385elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1385elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1028985328, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                                }
                                FloatingActionButtonElevation floatingActionButtonElevation3 = m1385elevationxZ9QkE;
                                long j8 = j6;
                                Modifier modifier4 = modifier2;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$2.INSTANCE, 1, null), false, obj3, j5, j6, null, m1385elevationxZ9QkE.elevation((InteractionSource) obj2, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m5621unboximpl(), obj2, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new FloatingActionButtonKt$FloatingActionButton$3(j6, content, i3)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                mutableInteractionSource2 = obj2;
                                shape2 = obj3;
                                j7 = j5;
                                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                                j3 = j8;
                            } else {
                                j5 = j4;
                                i3 = i6;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            j5 = j;
                        }
                        modifier2 = companion;
                        obj2 = obj;
                        obj3 = cornerBasedShape;
                        m1385elevationxZ9QkE = floatingActionButtonElevation2;
                        j6 = j3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        FloatingActionButtonElevation floatingActionButtonElevation32 = m1385elevationxZ9QkE;
                        long j82 = j6;
                        Modifier modifier42 = modifier2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$2.INSTANCE, 1, null), false, obj3, j5, j6, null, m1385elevationxZ9QkE.elevation((InteractionSource) obj2, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m5621unboximpl(), obj2, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new FloatingActionButtonKt$FloatingActionButton$3(j6, content, i3)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        mutableInteractionSource2 = obj2;
                        shape2 = obj3;
                        j7 = j5;
                        floatingActionButtonElevation2 = floatingActionButtonElevation32;
                        j3 = j82;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = companion;
                        mutableInteractionSource2 = obj;
                        shape2 = cornerBasedShape;
                        composer2 = startRestartGroup;
                        j7 = j;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new FloatingActionButtonKt$FloatingActionButton$4(onClick, modifier3, mutableInteractionSource2, shape2, j7, j3, floatingActionButtonElevation2, content, i, i2));
                    return;
                }
                i5 = 12582912;
                i3 |= i5;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) == 0) {
                }
            }
            obj = mutableInteractionSource;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((3670016 & i) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) == 0) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = mutableInteractionSource;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((3670016 & i) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* renamed from: ExtendedFloatingActionButton-wqdebIU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1386ExtendedFloatingActionButtonwqdebIU(Function2<? super Composer, ? super Integer, Unit> text, Function0<Unit> onClick, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        long j3;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource2;
        CornerBasedShape cornerBasedShape;
        long j4;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Object obj4;
        Shape shape2;
        long j6;
        Object obj5;
        long j7;
        Object obj6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        long j8;
        long j9;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1555720195);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)P(8,6,5,3,4,7,0:c#ui.graphics.Color,1:c#ui.graphics.Color)151@7254L39,152@7328L6,153@7416L6,154@7460L32,155@7570L11,157@7590L849:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        i6 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                    } else {
                        i6 = i3;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                                i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i6 |= i8;
                            }
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i8 = 33554432;
                        i6 |= i8;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if ((i6 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 == 0 ? Modifier.Companion : obj;
                            Object obj7 = i4 == 0 ? null : obj2;
                            if (i5 == 0) {
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
                                mutableInteractionSource2 = obj3;
                            }
                            if ((i2 & 32) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i6 &= -458753;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i2 & 64) == 0) {
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1311getSecondary0d7_KjU();
                                i6 &= -3670017;
                            } else {
                                j4 = j3;
                            }
                            if ((i2 & 128) == 0) {
                                j5 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i6 >> 18) & 14);
                                i6 &= -29360129;
                            } else {
                                j5 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m1385elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i6 &= -234881025;
                            }
                            function22 = obj7;
                            obj4 = mutableInteractionSource2;
                            shape2 = cornerBasedShape;
                            j6 = j4;
                            obj5 = floatingActionButtonElevation2;
                            j7 = j5;
                            int i11 = i6;
                            obj6 = companion;
                            i7 = i11;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i6 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            shape2 = shape;
                            j7 = j2;
                            obj5 = floatingActionButtonElevation2;
                            obj4 = obj3;
                            j6 = j3;
                            i7 = i6;
                            obj6 = obj;
                            function22 = obj2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1555720195, i7, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                        }
                        float f = ExtendedFabSize;
                        int i12 = i7 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                        composer2 = startRestartGroup;
                        m1387FloatingActionButtonbogVsAg(onClick, SizeKt.m799sizeInqDBjuR0$default(obj6, f, f, 0.0f, 0.0f, 12, null), obj4, shape2, j6, j7, obj5, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(function22, i7, text)), startRestartGroup, (i12 & 896) | ((i7 >> 3) & 14) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj6;
                        function23 = function24;
                        mutableInteractionSource3 = obj4;
                        shape3 = shape2;
                        j8 = j6;
                        j9 = j7;
                        floatingActionButtonElevation3 = obj5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        shape3 = shape;
                        modifier2 = obj;
                        function23 = obj2;
                        mutableInteractionSource3 = obj3;
                        j8 = j3;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j9 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$3(text, onClick, modifier2, function23, mutableInteractionSource3, shape3, j8, j9, floatingActionButtonElevation3, i, i2));
                    return;
                }
                obj3 = mutableInteractionSource;
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((i6 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                function22 = obj7;
                obj4 = mutableInteractionSource2;
                shape2 = cornerBasedShape;
                j6 = j4;
                obj5 = floatingActionButtonElevation2;
                j7 = j5;
                int i112 = i6;
                obj6 = companion;
                i7 = i112;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float f2 = ExtendedFabSize;
                int i122 = i7 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                composer2 = startRestartGroup;
                m1387FloatingActionButtonbogVsAg(onClick, SizeKt.m799sizeInqDBjuR0$default(obj6, f2, f2, 0.0f, 0.0f, 12, null), obj4, shape2, j6, j7, obj5, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(function22, i7, text)), startRestartGroup, (i122 & 896) | ((i7 >> 3) & 14) | 12582912 | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (i122 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj6;
                function23 = function242;
                mutableInteractionSource3 = obj4;
                shape3 = shape2;
                j8 = j6;
                j9 = j7;
                floatingActionButtonElevation3 = obj5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj3 = mutableInteractionSource;
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((i6 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            function22 = obj7;
            obj4 = mutableInteractionSource2;
            shape2 = cornerBasedShape;
            j6 = j4;
            obj5 = floatingActionButtonElevation2;
            j7 = j5;
            int i1122 = i6;
            obj6 = companion;
            i7 = i1122;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            float f22 = ExtendedFabSize;
            int i1222 = i7 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function2422 = function22;
            composer2 = startRestartGroup;
            m1387FloatingActionButtonbogVsAg(onClick, SizeKt.m799sizeInqDBjuR0$default(obj6, f22, f22, 0.0f, 0.0f, 12, null), obj4, shape2, j6, j7, obj5, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(function22, i7, text)), startRestartGroup, (i1222 & 896) | ((i7 >> 3) & 14) | 12582912 | (i1222 & 7168) | (57344 & i1222) | (458752 & i1222) | (i1222 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj6;
            function23 = function2422;
            mutableInteractionSource3 = obj4;
            shape3 = shape2;
            j8 = j6;
            j9 = j7;
            floatingActionButtonElevation3 = obj5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj3 = mutableInteractionSource;
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i6 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        function22 = obj7;
        obj4 = mutableInteractionSource2;
        shape2 = cornerBasedShape;
        j6 = j4;
        obj5 = floatingActionButtonElevation2;
        j7 = j5;
        int i11222 = i6;
        obj6 = companion;
        i7 = i11222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float f222 = ExtendedFabSize;
        int i12222 = i7 >> 6;
        Function2<? super Composer, ? super Integer, Unit> function24222 = function22;
        composer2 = startRestartGroup;
        m1387FloatingActionButtonbogVsAg(onClick, SizeKt.m799sizeInqDBjuR0$default(obj6, f222, f222, 0.0f, 0.0f, 12, null), obj4, shape2, j6, j7, obj5, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(function22, i7, text)), startRestartGroup, (i12222 & 896) | ((i7 >> 3) & 14) | 12582912 | (i12222 & 7168) | (57344 & i12222) | (458752 & i12222) | (i12222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj6;
        function23 = function24222;
        mutableInteractionSource3 = obj4;
        shape3 = shape2;
        j8 = j6;
        j9 = j7;
        floatingActionButtonElevation3 = obj5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
