package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0013\b\b\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0083\b¢\u0006\u0002\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\"\u001a\u00020\u001e*\u00020 H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&²\u0006\u0015\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010X\u008a\u0084\u0002"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isPopupLayout", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "testTag", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: Popup-K5zGePQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5848PopupK5zGePQ(Alignment alignment, long j, Function0<Unit> function0, PopupProperties popupProperties, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j2;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Alignment topStart;
        boolean changed;
        Object rememberedValue;
        Function0<Unit> function02;
        PopupProperties popupProperties2;
        Alignment alignment2;
        long j3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(295309329);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)193@8637L128,200@8771L165:AndroidPopup.android.kt#2oxthz");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj = alignment;
        } else if ((i & 14) == 0) {
            obj = alignment;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = alignment;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function0;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj3 = popupProperties;
                    i3 |= startRestartGroup.changed(obj3) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                    }
                    if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                        topStart = i6 == 0 ? Alignment.Companion.getTopStart() : obj;
                        if (i7 != 0) {
                            j2 = IntOffsetKt.IntOffset(0, 0);
                        }
                        if (i4 != 0) {
                            obj2 = null;
                        }
                        if (i5 != 0) {
                            obj3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(295309329, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                        }
                        IntOffset m5716boximpl = IntOffset.m5716boximpl(j2);
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(m5716boximpl) | startRestartGroup.changed(topStart);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i8 = i3 >> 3;
                        long j4 = j2;
                        Popup((AlignmentOffsetPositionProvider) rememberedValue, obj2, obj3, content, startRestartGroup, (i8 & 112) | (i8 & 896) | (i8 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function02 = obj2;
                        popupProperties2 = obj3;
                        alignment2 = topStart;
                        j3 = j4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        alignment2 = obj;
                        j3 = j2;
                        function02 = obj2;
                        popupProperties2 = obj3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AndroidPopup_androidKt$Popup$1(alignment2, j3, function02, popupProperties2, content, i, i2));
                    return;
                }
                obj3 = popupProperties;
                if ((i2 & 16) == 0) {
                }
                if ((46811 & i3) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                IntOffset m5716boximpl2 = IntOffset.m5716boximpl(j2);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m5716boximpl2) | startRestartGroup.changed(topStart);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                int i82 = i3 >> 3;
                long j42 = j2;
                Popup((AlignmentOffsetPositionProvider) rememberedValue, obj2, obj3, content, startRestartGroup, (i82 & 112) | (i82 & 896) | (i82 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function02 = obj2;
                popupProperties2 = obj3;
                alignment2 = topStart;
                j3 = j42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = popupProperties;
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IntOffset m5716boximpl22 = IntOffset.m5716boximpl(j2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m5716boximpl22) | startRestartGroup.changed(topStart);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i822 = i3 >> 3;
            long j422 = j2;
            Popup((AlignmentOffsetPositionProvider) rememberedValue, obj2, obj3, content, startRestartGroup, (i822 & 112) | (i822 & 896) | (i822 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function02 = obj2;
            popupProperties2 = obj3;
            alignment2 = topStart;
            j3 = j422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = popupProperties;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IntOffset m5716boximpl222 = IntOffset.m5716boximpl(j2);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m5716boximpl222) | startRestartGroup.changed(topStart);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AlignmentOffsetPositionProvider(topStart, j2, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i8222 = i3 >> 3;
        long j4222 = j2;
        Popup((AlignmentOffsetPositionProvider) rememberedValue, obj2, obj3, content, startRestartGroup, (i8222 & 112) | (i8222 & 896) | (i8222 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function02 = obj2;
        popupProperties2 = obj3;
        alignment2 = topStart;
        j3 = j4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, PopupProperties popupProperties, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object rememberedValue;
        LayoutDirection layoutDirection;
        Continuation continuation;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Function0<Unit> function02;
        PopupProperties popupProperties2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-830247068);
        ComposerKt.sourceInformation(startRestartGroup, "C(Popup)P(2,1,3)227@9660L7,228@9699L7,229@9743L7,230@9798L7,231@9834L28,232@9889L29,233@9937L38,234@9998L944,262@10948L417,277@11371L229,286@11606L166,298@12335L175,308@12688L771:AndroidPopup.android.kt#2oxthz");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = function0;
            i3 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = popupProperties;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Object obj3 = i6 != 0 ? null : obj;
                    PopupProperties popupProperties3 = i4 != 0 ? new PopupProperties(false, false, false, null, false, false, 63, null) : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-830247068, i5, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    View view = (View) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(LocalPopupTestTag);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    String str = (String) consume3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume4;
                    CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i5 >> 9) & 14);
                    UUID popupId = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AndroidPopup_androidKt$Popup$popupId$1.INSTANCE, startRestartGroup, 3080, 6);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                        layoutDirection = layoutDirection2;
                        continuation = null;
                        PopupLayout popupLayout = new PopupLayout(obj3, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                        popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new AndroidPopup_androidKt$Popup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                        startRestartGroup.updateRememberedValue(popupLayout);
                        rememberedValue = popupLayout;
                    } else {
                        layoutDirection = layoutDirection2;
                        continuation = null;
                    }
                    startRestartGroup.endReplaceableGroup();
                    final PopupLayout popupLayout2 = (PopupLayout) rememberedValue;
                    Function0<Unit> function03 = obj3;
                    PopupProperties popupProperties4 = popupProperties3;
                    LayoutDirection layoutDirection3 = layoutDirection;
                    EffectsKt.DisposableEffect(popupLayout2, new AndroidPopup_androidKt$Popup$2(popupLayout2, function03, popupProperties4, str, layoutDirection3), startRestartGroup, 8);
                    EffectsKt.SideEffect(new AndroidPopup_androidKt$Popup$3(popupLayout2, function03, popupProperties4, str, layoutDirection3), startRestartGroup, 0);
                    EffectsKt.DisposableEffect(popupPositionProvider, new AndroidPopup_androidKt$Popup$4(popupLayout2, popupPositionProvider), startRestartGroup, i5 & 14);
                    EffectsKt.LaunchedEffect(popupLayout2, new AndroidPopup_androidKt$Popup$5(popupLayout2, continuation), startRestartGroup, 72);
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new AndroidPopup_androidKt$Popup$7(popupLayout2));
                    final LayoutDirection layoutDirection4 = layoutDirection;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                            PopupLayout.this.setParentLayoutDirection(layoutDirection4);
                            return MeasureScope.CC.layout$default(Layout, 0, 0, null, AndroidPopup_androidKt$Popup$8$measure$1.INSTANCE, 4, null);
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onGloballyPositioned);
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
                    Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1097164901, "C:AndroidPopup.android.kt#2oxthz");
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function02 = obj3;
                    popupProperties2 = popupProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function02 = obj;
                    popupProperties2 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AndroidPopup_androidKt$Popup$9(popupPositionProvider, function02, popupProperties2, content, i, i2));
                return;
            }
            obj2 = popupProperties;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 5851) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view2 = (View) consume5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume22;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(LocalPopupTestTag);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str2 = (String) consume32;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume42;
            CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i5 >> 9) & 14);
            UUID popupId2 = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AndroidPopup_androidKt$Popup$popupId$1.INSTANCE, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final PopupLayout popupLayout22 = (PopupLayout) rememberedValue;
            Function0<Unit> function032 = obj3;
            PopupProperties popupProperties42 = popupProperties3;
            LayoutDirection layoutDirection32 = layoutDirection;
            EffectsKt.DisposableEffect(popupLayout22, new AndroidPopup_androidKt$Popup$2(popupLayout22, function032, popupProperties42, str2, layoutDirection32), startRestartGroup, 8);
            EffectsKt.SideEffect(new AndroidPopup_androidKt$Popup$3(popupLayout22, function032, popupProperties42, str2, layoutDirection32), startRestartGroup, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new AndroidPopup_androidKt$Popup$4(popupLayout22, popupPositionProvider), startRestartGroup, i5 & 14);
            EffectsKt.LaunchedEffect(popupLayout22, new AndroidPopup_androidKt$Popup$5(popupLayout22, continuation), startRestartGroup, 72);
            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new AndroidPopup_androidKt$Popup$7(popupLayout22));
            final LayoutDirection layoutDirection42 = layoutDirection;
            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                    PopupLayout.this.setParentLayoutDirection(layoutDirection42);
                    return MeasureScope.CC.layout$default(Layout, 0, 0, null, AndroidPopup_androidKt$Popup$8$measure$1.INSTANCE, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(onGloballyPositioned2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1097164901, "C:AndroidPopup.android.kt#2oxthz");
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function02 = obj3;
            popupProperties2 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = popupProperties;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 5851) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume52 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view22 = (View) consume52;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(LocalPopupTestTag);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String str22 = (String) consume322;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume422;
        CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i5 >> 9) & 14);
        UUID popupId22 = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AndroidPopup_androidKt$Popup$popupId$1.INSTANCE, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final PopupLayout popupLayout222 = (PopupLayout) rememberedValue;
        Function0<Unit> function0322 = obj3;
        PopupProperties popupProperties422 = popupProperties3;
        LayoutDirection layoutDirection322 = layoutDirection;
        EffectsKt.DisposableEffect(popupLayout222, new AndroidPopup_androidKt$Popup$2(popupLayout222, function0322, popupProperties422, str22, layoutDirection322), startRestartGroup, 8);
        EffectsKt.SideEffect(new AndroidPopup_androidKt$Popup$3(popupLayout222, function0322, popupProperties422, str22, layoutDirection322), startRestartGroup, 0);
        EffectsKt.DisposableEffect(popupPositionProvider, new AndroidPopup_androidKt$Popup$4(popupLayout222, popupPositionProvider), startRestartGroup, i5 & 14);
        EffectsKt.LaunchedEffect(popupLayout222, new AndroidPopup_androidKt$Popup$5(popupLayout222, continuation), startRestartGroup, 72);
        Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new AndroidPopup_androidKt$Popup$7(popupLayout222));
        final LayoutDirection layoutDirection422 = layoutDirection;
        MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                PopupLayout.this.setParentLayoutDirection(layoutDirection422);
                return MeasureScope.CC.layout$default(Layout, 0, 0, null, AndroidPopup_androidKt$Popup$8$measure$1.INSTANCE, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(onGloballyPositioned22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, measurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1097164901, "C:AndroidPopup.android.kt#2oxthz");
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function02 = obj3;
        popupProperties2 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final void PopupTestTag(String tag, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopupTestTag)P(1)332@13834L75:AndroidPopup.android.kt#2oxthz");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(tag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalPopupTestTag.provides(tag)}, content, startRestartGroup, (i2 & 112) | 8);
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
        endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(tag, content, i));
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(1406149896);
        ComposerKt.sourceInformation(composer, "CC(SimpleStack)P(1)340@14172L979:AndroidPopup.android.kt#2oxthz");
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i2 = (((((i << 3) & 112) | ((i >> 3) & 14)) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
        Updater.m2900setimpl(m2893constructorimpl, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final boolean isFlagSecureEnabled(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    public static final boolean isPopupLayout(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (view instanceof PopupLayout) && (str == null || Intrinsics.areEqual(str, ((PopupLayout) view).getTestTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Popup$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
