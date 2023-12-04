package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", TypedValues.CycleType.S_WAVE_OFFSET, "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> text, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        boolean z2;
        int i6;
        Object obj3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<Composer, Integer, Unit> applyTextStyle;
        Function2<Composer, Integer, Unit> applyTextStyle2;
        Function2<Composer, Integer, Unit> applyTextStyle3;
        Function2<Composer, Integer, Unit> applyTextStyle4;
        Modifier semantics;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        boolean z3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-450923337);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1!1,3,4!1,6)81@3397L10,83@3480L4,84@3570L6,85@3671L4,86@3764L4:ListItem.kt#jmzs0o");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = function2;
            i3 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function22;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        obj3 = function23;
                        i3 |= startRestartGroup.changedInstance(obj3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changedInstance(text) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.Companion : modifier;
                            if (i9 != 0) {
                                obj = null;
                            }
                            function25 = i4 != 0 ? null : obj2;
                            boolean z4 = i5 != 0 ? true : z2;
                            if (i6 != 0) {
                                obj3 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function28 = i7 == 0 ? function24 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-450923337, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                            }
                            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                            applyTextStyle = applyTextStyle(typography.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                            Intrinsics.checkNotNull(applyTextStyle);
                            applyTextStyle2 = applyTextStyle(typography.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function25);
                            applyTextStyle3 = applyTextStyle(typography.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), obj3);
                            applyTextStyle4 = applyTextStyle(typography.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function28);
                            semantics = SemanticsModifierKt.semantics(companion, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
                            if (applyTextStyle2 == null || applyTextStyle3 != null) {
                                function26 = obj3;
                                if ((applyTextStyle3 != null && z4) || applyTextStyle2 == null) {
                                    startRestartGroup.startReplaceableGroup(-210280382);
                                    ComposerKt.sourceInformation(startRestartGroup, "95@4139L184");
                                    TwoLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else {
                                    startRestartGroup.startReplaceableGroup(-210280168);
                                    ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                                    ThreeLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                    startRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                startRestartGroup.startReplaceableGroup(-210280579);
                                ComposerKt.sourceInformation(startRestartGroup, "91@3942L61");
                                function26 = obj3;
                                OneLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle4, startRestartGroup, (i3 & 112) | 24576, 0);
                                startRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function27 = function28;
                            z3 = z4;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function27 = function24;
                            function25 = obj2;
                            z3 = z2;
                            function26 = obj3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ListItemKt$ListItem$1(modifier2, obj, function25, z3, function26, function27, text, i, i2));
                        return;
                    }
                    obj3 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Typography typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    applyTextStyle = applyTextStyle(typography2.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                    Intrinsics.checkNotNull(applyTextStyle);
                    applyTextStyle2 = applyTextStyle(typography2.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function25);
                    applyTextStyle3 = applyTextStyle(typography2.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), obj3);
                    applyTextStyle4 = applyTextStyle(typography2.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function28);
                    semantics = SemanticsModifierKt.semantics(companion, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
                    if (applyTextStyle2 == null) {
                    }
                    function26 = obj3;
                    if (applyTextStyle3 != null) {
                    }
                    startRestartGroup.startReplaceableGroup(-210280168);
                    ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                    ThreeLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function27 = function28;
                    z3 = z4;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj3 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Typography typography22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                applyTextStyle = applyTextStyle(typography22.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                Intrinsics.checkNotNull(applyTextStyle);
                applyTextStyle2 = applyTextStyle(typography22.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function25);
                applyTextStyle3 = applyTextStyle(typography22.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), obj3);
                applyTextStyle4 = applyTextStyle(typography22.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function28);
                semantics = SemanticsModifierKt.semantics(companion, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
                if (applyTextStyle2 == null) {
                }
                function26 = obj3;
                if (applyTextStyle3 != null) {
                }
                startRestartGroup.startReplaceableGroup(-210280168);
                ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                ThreeLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                function27 = function28;
                z3 = z4;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj3 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Typography typography222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            applyTextStyle = applyTextStyle(typography222.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
            Intrinsics.checkNotNull(applyTextStyle);
            applyTextStyle2 = applyTextStyle(typography222.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function25);
            applyTextStyle3 = applyTextStyle(typography222.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), obj3);
            applyTextStyle4 = applyTextStyle(typography222.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function28);
            semantics = SemanticsModifierKt.semantics(companion, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
            if (applyTextStyle2 == null) {
            }
            function26 = obj3;
            if (applyTextStyle3 != null) {
            }
            startRestartGroup.startReplaceableGroup(-210280168);
            ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
            ThreeLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function27 = function28;
            z3 = z4;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Typography typography2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        applyTextStyle = applyTextStyle(typography2222.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
        Intrinsics.checkNotNull(applyTextStyle);
        applyTextStyle2 = applyTextStyle(typography2222.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function25);
        applyTextStyle3 = applyTextStyle(typography2222.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), obj3);
        applyTextStyle4 = applyTextStyle(typography2222.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function28);
        semantics = SemanticsModifierKt.semantics(companion, true, ListItemKt$ListItem$semanticsModifier$1.INSTANCE);
        if (applyTextStyle2 == null) {
        }
        function26 = obj3;
        if (applyTextStyle3 != null) {
        }
        startRestartGroup.startReplaceableGroup(-210280168);
        ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
        ThreeLine.INSTANCE.ListItem(semantics, obj, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function27 = function28;
        z3 = z4;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        ComposerKt.sourceInformation(startRestartGroup, "C(BaselinesOffsetColumn)P(2,1)352@13107L1127:ListItem.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i3) {
                return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                int i3;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                long m5542copyZbe2FdA$default = Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                List<? extends Measurable> list2 = measurables;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (Measurable measurable : list2) {
                    arrayList.add(measurable.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
                }
                ArrayList<Placeable> arrayList2 = arrayList;
                int i4 = 0;
                for (Placeable placeable : arrayList2) {
                    i4 = Math.max(i4, placeable.getWidth());
                }
                int size = arrayList2.size();
                Integer[] numArr = new Integer[size];
                for (int i5 = 0; i5 < size; i5++) {
                    numArr[i5] = 0;
                }
                List<Dp> list3 = list;
                int size2 = arrayList2.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    Placeable placeable2 = (Placeable) arrayList2.get(i7);
                    if (i7 > 0) {
                        int i8 = i7 - 1;
                        i3 = ((Placeable) arrayList2.get(i8)).getHeight() - ((Placeable) arrayList2.get(i8)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(0, (Layout.mo582roundToPx0680j_4(list3.get(i7).m5621unboximpl()) - placeable2.get(AlignmentLineKt.getFirstBaseline())) - i3);
                    numArr[i7] = Integer.valueOf(max + i6);
                    i6 += max + placeable2.getHeight();
                }
                return MeasureScope.CC.layout$default(Layout, i4, i6, null, new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList2, numArr), 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
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
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ListItemKt$BaselinesOffsetColumn$2(list, modifier2, function2, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw  reason: not valid java name */
    public static final void m1392OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        ComposerKt.sourceInformation(startRestartGroup, "C(OffsetToBaselineOrCenter)P(2:c#ui.unit.Dp,1)394@14762L806:ListItem.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    int max;
                    int m5726getYimpl;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    Placeable mo4545measureBRTryo0 = measurables.get(0).mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int i5 = mo4545measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i5 != Integer.MIN_VALUE) {
                        m5726getYimpl = Layout.mo582roundToPx0680j_4(f) - i5;
                        max = Math.max(Constraints.m5552getMinHeightimpl(j), mo4545measureBRTryo0.getHeight() + m5726getYimpl);
                    } else {
                        max = Math.max(Constraints.m5552getMinHeightimpl(j), mo4545measureBRTryo0.getHeight());
                        m5726getYimpl = IntOffset.m5726getYimpl(Alignment.Companion.getCenter().mo2908alignKFBX0sM(IntSize.Companion.m5772getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo4545measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return MeasureScope.CC.layout$default(Layout, mo4545measureBRTryo0.getWidth(), max, null, new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(mo4545measureBRTryo0, m5726getYimpl), 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
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
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ListItemKt$OffsetToBaselineOrCenter$2(f, modifier2, function2, i, i2));
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(TextStyle textStyle, float f, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new ListItemKt$applyTextStyle$1(f, textStyle, function2));
    }
}
