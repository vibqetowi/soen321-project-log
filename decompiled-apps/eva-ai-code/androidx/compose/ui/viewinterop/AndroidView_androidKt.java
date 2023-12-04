package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001aK\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\b0\u0017\"\b\b\u0000\u0010\b*\u00020\u0002*\u00020\u0014H\u0002\u001aa\u0010\u0018\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\"\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", ExifInterface.GPS_DIRECTION_TRUE, "factory", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "onRelease", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createAndroidViewNodeFactory", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "requireViewFactoryHolder", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "updateViewHolderParams", "Landroidx/compose/runtime/Updater;", "compositeKeyHash", "", "density", "Landroidx/compose/ui/unit/Density;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidView_androidKt {
    private static final Function1<View, Unit> NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    public static final <T extends View> void AndroidView(Function1<? super Context, ? extends T> factory, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidView)105@5394L130:AndroidView.android.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                function1 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:100)");
            }
            AndroidView(factory, modifier, null, NoOpUpdate, function1, startRestartGroup, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        Function1<? super T, Unit> function12 = function1;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$1(factory, modifier2, function12, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends View> void AndroidView(Function1<? super Context, ? extends T> factory, Modifier modifier, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function1<View, Unit> function14;
        int i6;
        Function1<View, Unit> function15;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer startRestartGroup = composer.startRestartGroup(-180024211);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidView)P(!2,3)209@11810L23,211@11934L7,212@11989L7,219@12445L7,220@12516L7:AndroidView.android.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function1;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function14 = function12;
                    i3 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function15 = function13;
                        i3 |= startRestartGroup.changedInstance(function15) ? 16384 : 8192;
                        if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                            companion = i7 != 0 ? Modifier.Companion : obj;
                            if (i4 != 0) {
                                obj2 = null;
                            }
                            if (i5 != 0) {
                                function14 = NoOpUpdate;
                            }
                            if (i6 != 0) {
                                function15 = NoOpUpdate;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                            }
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) consume3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume4 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) consume4;
                            if (obj2 != null) {
                                startRestartGroup.startReplaceableGroup(-88753439);
                                ComposerKt.sourceInformation(startRestartGroup, "224@12626L37,223@12560L843");
                                Function0<LayoutNode> createAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, startRestartGroup, i3 & 14);
                                startRestartGroup.startReplaceableGroup(1405779621);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(new AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1(createAndroidViewNodeFactory));
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                                m5846updateViewHolderParams6NefGtU(m2893constructorimpl, materializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                Updater.m2900setimpl(m2893constructorimpl, obj2, AndroidView_androidKt$AndroidView$2$1.INSTANCE);
                                Updater.m2900setimpl(m2893constructorimpl, function15, AndroidView_androidKt$AndroidView$2$2.INSTANCE);
                                Updater.m2900setimpl(m2893constructorimpl, function14, AndroidView_androidKt$AndroidView$2$3.INSTANCE);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(-88752574);
                                ComposerKt.sourceInformation(startRestartGroup, "242@13483L37,241@13425L756");
                                Function0<LayoutNode> createAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, startRestartGroup, i3 & 14);
                                startRestartGroup.startReplaceableGroup(1886828752);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode):Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(createAndroidViewNodeFactory2));
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                                m5846updateViewHolderParams6NefGtU(m2893constructorimpl2, materializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                Updater.m2900setimpl(m2893constructorimpl2, function15, AndroidView_androidKt$AndroidView$3$1.INSTANCE);
                                Updater.m2900setimpl(m2893constructorimpl2, function14, AndroidView_androidKt$AndroidView$3$2.INSTANCE);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = obj;
                        }
                        Function1<? super T, Unit> function16 = obj2;
                        Function1<? super T, Unit> function17 = function15;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$4(factory, companion, function16, function14, function17, i, i2));
                        return;
                    }
                    function15 = function13;
                    if ((46811 & i3) == 9362) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume5;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) consume32;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume42 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SavedStateRegistryOwner savedStateRegistryOwner2 = (SavedStateRegistryOwner) consume42;
                    if (obj2 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function1<? super T, Unit> function162 = obj2;
                    Function1<? super T, Unit> function172 = function15;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function14 = function12;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function15 = function13;
                if ((46811 & i3) == 9362) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume52;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) consume322;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume422 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SavedStateRegistryOwner savedStateRegistryOwner22 = (SavedStateRegistryOwner) consume422;
                if (obj2 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Function1<? super T, Unit> function1622 = obj2;
                Function1<? super T, Unit> function1722 = function15;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function15 = function13;
            if ((46811 & i3) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int currentCompositeKeyHash222 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density222 = (Density) consume522;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LifecycleOwner lifecycleOwner222 = (LifecycleOwner) consume3222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4222 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SavedStateRegistryOwner savedStateRegistryOwner222 = (SavedStateRegistryOwner) consume4222;
            if (obj2 != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function1<? super T, Unit> function16222 = obj2;
            Function1<? super T, Unit> function17222 = function15;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function15 = function13;
        if ((46811 & i3) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int currentCompositeKeyHash2222 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2222 = (Density) consume5222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LifecycleOwner lifecycleOwner2222 = (LifecycleOwner) consume32222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume42222 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SavedStateRegistryOwner savedStateRegistryOwner2222 = (SavedStateRegistryOwner) consume42222;
        if (obj2 != null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Function1<? super T, Unit> function162222 = obj2;
        Function1<? super T, Unit> function172222 = function15;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final <T extends View> Function0<LayoutNode> createAndroidViewNodeFactory(Function1<? super Context, ? extends T> function1, Composer composer, int i) {
        composer.startReplaceableGroup(2030558801);
        ComposerKt.sourceInformation(composer, "C(createAndroidViewNodeFactory)264@14333L23,265@14388L7,266@14422L28,267@14502L7:AndroidView.android.kt#z33iqn");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:261)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AndroidView_androidKt$createAndroidViewNodeFactory$1 androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1(context, function1, rememberCompositionContext, (SaveableStateRegistry) consume2, currentCompositeKeyHash);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    /* renamed from: updateViewHolderParams-6NefGtU  reason: not valid java name */
    private static final <T extends View> void m5846updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        Updater.m2900setimpl(composer, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m2900setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m2900setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m2900setimpl(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m2900setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m2900setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            composer.apply(Integer.valueOf(i), setCompositeKeyHash);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            Intrinsics.checkNotNull(interopViewFactoryHolder$ui_release, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }
}
