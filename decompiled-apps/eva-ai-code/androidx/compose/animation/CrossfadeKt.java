package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Crossfade.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", ExifInterface.GPS_DIRECTION_TRUE, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", Constants.ScionAnalytics.PARAM_LABEL, "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(T t, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        Object obj2;
        String str2;
        Modifier modifier2;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-310686752);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(4,3!1,2)55@2280L36,56@2332L53:Crossfade.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = str;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if (i4 == 4 || (46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i6 != 0 ? Modifier.Companion : obj;
                    TweenSpec tween$default = i4 != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec;
                    String str3 = i5 != 0 ? "Crossfade" : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                    }
                    String str4 = str3;
                    Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), companion, tween$default, (Function1) null, content, startRestartGroup, (i3 & 112) | 512 | (i3 & 57344), 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str2 = str4;
                    modifier2 = companion;
                    finiteAnimationSpec2 = tween$default;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier2 = obj;
                    str2 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new CrossfadeKt$Crossfade$1(t, modifier2, finiteAnimationSpec2, str2, content, i, i2));
                return;
            }
            obj2 = str;
            if ((i2 & 16) != 0) {
            }
            if (i4 == 4) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String str42 = str3;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), companion, tween$default, (Function1) null, content, startRestartGroup, (i3 & 112) | 512 | (i3 & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str42;
            modifier2 = companion;
            finiteAnimationSpec2 = tween$default;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        obj2 = str;
        if ((i2 & 16) != 0) {
        }
        if (i4 == 4) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        String str422 = str3;
        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), companion, tween$default, (Function1) null, content, startRestartGroup, (i3 & 112) | 512 | (i3 & 57344), 4);
        if (ComposerKt.isTraceInProgress()) {
        }
        str2 = str422;
        modifier2 = companion;
        finiteAnimationSpec2 = tween$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 content, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(3,2)71@2743L29,72@2788L53:Crossfade.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
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
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if (i5 != 4 || (i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, (i3 & 8) | (i3 & 14), 2), modifier, finiteAnimationSpec, (Function1) null, content, startRestartGroup, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, content, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        CrossfadeKt$Crossfade$3 crossfadeKt$Crossfade$3;
        int i6;
        Object rememberedValue;
        SnapshotStateList snapshotStateList;
        LinkedHashMap rememberedValue2;
        Map map;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int size;
        int i7;
        Function1<? super T, ? extends Object> function12;
        Modifier modifier2;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        boolean changed;
        CrossfadeKt$Crossfade$4$1 rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(679005231);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(3!1,2)103@4375L64,104@4461L66,138@5750L159:Crossfade.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                Object obj2 = function1;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                crossfadeKt$Crossfade$3 = obj2;
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                i6 = i3;
                if (i4 == 2 || (46811 & i6) != 9362 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i8 != 0 ? Modifier.Companion : obj;
                    TweenSpec tween$default = i4 != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec;
                    if (i5 != 0) {
                        crossfadeKt$Crossfade$3 = CrossfadeKt$Crossfade$3.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(679005231, i6, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    SnapshotStateList snapshotStateList2 = rememberedValue;
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                        mutableStateListOf.add(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(mutableStateListOf);
                        snapshotStateList2 = mutableStateListOf;
                    }
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) snapshotStateList2;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(-1621449213);
                    ComposerKt.sourceInformation(startRestartGroup, "111@4841L21");
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState()))) {
                        SnapshotStateList snapshotStateList3 = snapshotStateList;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new CrossfadeKt$Crossfade$4$1(transition);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        CollectionsKt.removeAll((List) snapshotStateList3, (Function1) rememberedValue3);
                        map.clear();
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!map.containsKey(transition.getTargetState())) {
                        SnapshotStateList snapshotStateList4 = snapshotStateList;
                        Iterator<T> it = snapshotStateList4.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            } else if (Intrinsics.areEqual(crossfadeKt$Crossfade$3.invoke((T) it.next()), crossfadeKt$Crossfade$3.invoke(transition.getTargetState()))) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 == -1) {
                            snapshotStateList.add(transition.getTargetState());
                        } else {
                            snapshotStateList.set(i9, transition.getTargetState());
                        }
                        map.clear();
                        int size2 = snapshotStateList4.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            T t = snapshotStateList4.get(i10);
                            Map map2 = map;
                            map2.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i6, tween$default, t, content)));
                            i10++;
                            map = map2;
                            snapshotStateList4 = snapshotStateList4;
                        }
                    }
                    Map map3 = map;
                    int i11 = (i6 >> 3) & 14;
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    int i12 = i11 >> 3;
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i12 & 112) | (i12 & 14));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2072161918, "C:Crossfade.kt#xbi5r1");
                    startRestartGroup.startReplaceableGroup(-1621447954);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    SnapshotStateList snapshotStateList5 = snapshotStateList;
                    size = snapshotStateList5.size();
                    for (i7 = 0; i7 < size; i7++) {
                        Object obj3 = snapshotStateList5.get(i7);
                        startRestartGroup.startMovableGroup(-450541366, crossfadeKt$Crossfade$3.invoke(obj3));
                        ComposerKt.sourceInformation(startRestartGroup, "141@5871L8");
                        Function2 function2 = (Function2) map3.get(obj3);
                        if (function2 != null) {
                            function2.invoke(startRestartGroup, 0);
                        }
                        startRestartGroup.endMovableGroup();
                    }
                    startRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function12 = crossfadeKt$Crossfade$3;
                    modifier2 = companion;
                    finiteAnimationSpec2 = tween$default;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier2 = obj;
                    function12 = crossfadeKt$Crossfade$3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new CrossfadeKt$Crossfade$7(transition, modifier2, finiteAnimationSpec2, function12, content, i, i2));
                return;
            }
            crossfadeKt$Crossfade$3 = function1;
            if ((i2 & 8) != 0) {
            }
            i6 = i3;
            if (i4 == 2) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            SnapshotStateList snapshotStateList22 = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) snapshotStateList22;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-1621449213);
            ComposerKt.sourceInformation(startRestartGroup, "111@4841L21");
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                SnapshotStateList snapshotStateList32 = snapshotStateList;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new CrossfadeKt$Crossfade$4$1(transition);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                CollectionsKt.removeAll((List) snapshotStateList32, (Function1) rememberedValue3);
                map.clear();
            }
            startRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
            }
            Map map32 = map;
            int i112 = (i6 >> 3) & 14;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i122 = i112 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i122 & 112) | (i122 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            int i132 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
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
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i132 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2072161918, "C:Crossfade.kt#xbi5r1");
            startRestartGroup.startReplaceableGroup(-1621447954);
            ComposerKt.sourceInformation(startRestartGroup, "");
            SnapshotStateList snapshotStateList52 = snapshotStateList;
            size = snapshotStateList52.size();
            while (i7 < size) {
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function12 = crossfadeKt$Crossfade$3;
            modifier2 = companion;
            finiteAnimationSpec2 = tween$default;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        crossfadeKt$Crossfade$3 = function1;
        if ((i2 & 8) != 0) {
        }
        i6 = i3;
        if (i4 == 2) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        SnapshotStateList snapshotStateList222 = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) snapshotStateList222;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-1621449213);
        ComposerKt.sourceInformation(startRestartGroup, "111@4841L21");
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!map.containsKey(transition.getTargetState())) {
        }
        Map map322 = map;
        int i1122 = (i6 >> 3) & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i1222 = i1122 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i1222 & 112) | (i1222 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
        int i1322 = ((((i1122 << 3) & 112) << 9) & 7168) | 6;
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
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i1322 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2072161918, "C:Crossfade.kt#xbi5r1");
        startRestartGroup.startReplaceableGroup(-1621447954);
        ComposerKt.sourceInformation(startRestartGroup, "");
        SnapshotStateList snapshotStateList522 = snapshotStateList;
        size = snapshotStateList522.size();
        while (i7 < size) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = crossfadeKt$Crossfade$3;
        modifier2 = companion;
        finiteAnimationSpec2 = tween$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
