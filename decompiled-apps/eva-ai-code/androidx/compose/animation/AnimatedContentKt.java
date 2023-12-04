package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014ø\u0001\u0000\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"AnimatedContent", "", ExifInterface.LATITUDE_SOUTH, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", Constants.ScionAnalytics.PARAM_LABEL, "", "contentKey", "Lkotlin/ParameterName;", "name", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:136:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        Object obj4;
        int i8;
        Modifier modifier2;
        String str2;
        Function1<? super S, ? extends Object> function13;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function14;
        Alignment alignment2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)140@7413L58,141@7487L136:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = function1;
                i3 |= startRestartGroup.changedInstance(obj) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj2 = alignment;
                    i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj3 = str;
                        i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            obj4 = function12;
                        } else {
                            obj4 = function12;
                            if ((i & 458752) == 0) {
                                i3 |= startRestartGroup.changedInstance(obj4) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 64) == 0) {
                            if ((i & 3670016) == 0) {
                                i8 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                            }
                            if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier;
                                AnimatedContentKt$AnimatedContent$1 animatedContentKt$AnimatedContent$1 = i4 == 0 ? AnimatedContentKt$AnimatedContent$1.INSTANCE : obj;
                                Alignment topStart = i5 == 0 ? Alignment.Companion.getTopStart() : obj2;
                                if (i6 != 0) {
                                    obj3 = "AnimatedContent";
                                }
                                AnimatedContentKt$AnimatedContent$2 animatedContentKt$AnimatedContent$2 = i7 == 0 ? AnimatedContentKt$AnimatedContent$2.INSTANCE : obj4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:127)");
                                }
                                int i10 = i3 >> 3;
                                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i10) | (i10 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                str2 = obj3;
                                function13 = animatedContentKt$AnimatedContent$2;
                                function14 = animatedContentKt$AnimatedContent$1;
                                alignment2 = topStart;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                function14 = obj;
                                alignment2 = obj2;
                                function13 = obj4;
                                str2 = obj3;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AnimatedContentKt$AnimatedContent$3(s, modifier2, function14, alignment2, str2, function13, content, i, i2));
                            return;
                        }
                        i8 = 1572864;
                        i3 |= i8;
                        if ((i3 & 2995931) == 599186) {
                        }
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i3 >> 3;
                        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i102) | (i102 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        str2 = obj3;
                        function13 = animatedContentKt$AnimatedContent$2;
                        function14 = animatedContentKt$AnimatedContent$1;
                        alignment2 = topStart;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj3 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    i3 |= i8;
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1022 = i3 >> 3;
                    AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i1022) | (i1022 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    str2 = obj3;
                    function13 = animatedContentKt$AnimatedContent$2;
                    function14 = animatedContentKt$AnimatedContent$1;
                    alignment2 = topStart;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj3 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i3 |= i8;
                if ((i3 & 2995931) == 599186) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i10222 = i3 >> 3;
                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i10222) | (i10222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                str2 = obj3;
                function13 = animatedContentKt$AnimatedContent$2;
                function14 = animatedContentKt$AnimatedContent$1;
                alignment2 = topStart;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj3 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i102222 = i3 >> 3;
            AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i102222) | (i102222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            str2 = obj3;
            function13 = animatedContentKt$AnimatedContent$2;
            function14 = animatedContentKt$AnimatedContent$1;
            alignment2 = topStart;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i8;
        if ((i3 & 2995931) == 599186) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1022222 = i3 >> 3;
        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, obj3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), companion, animatedContentKt$AnimatedContent$1, topStart, animatedContentKt$AnimatedContent$2, content, startRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i1022222) | (i1022222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        str2 = obj3;
        function13 = animatedContentKt$AnimatedContent$2;
        function14 = animatedContentKt$AnimatedContent$1;
        alignment2 = topStart;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z, sizeAnimationSpec);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x027d A[LOOP:2: B:324:0x027b->B:325:0x027d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        AnimatedContentKt$AnimatedContent$4 animatedContentKt$AnimatedContent$4;
        int i5;
        Alignment alignment2;
        int i6;
        AnimatedContentKt$AnimatedContent$5 animatedContentKt$AnimatedContent$5;
        int i7;
        int i8;
        LayoutDirection layoutDirection;
        boolean changed;
        Object rememberedValue;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean changed2;
        Object rememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean changed3;
        LinkedHashMap rememberedValue3;
        Map map;
        int size;
        int i9;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        boolean changed4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function14;
        ContentTransform invoke;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        Function1<? super S, ? extends Object> function16;
        Modifier modifier2;
        Alignment alignment3;
        Iterator<T> it;
        int i10;
        int i11;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,4,1,2)692@32995L7,693@33023L106,698@33218L51,699@33291L62,786@37539L58,787@37631L45,797@37946L52,788@37681L323:AnimatedContent.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                animatedContentKt$AnimatedContent$4 = function1;
                i3 |= startRestartGroup.changedInstance(animatedContentKt$AnimatedContent$4) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    Object obj2 = alignment;
                    i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                    alignment2 = obj2;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        Object obj3 = function12;
                        i3 |= startRestartGroup.changedInstance(obj3) ? 16384 : 8192;
                        animatedContentKt$AnimatedContent$5 = obj3;
                        if ((i2 & 16) == 0) {
                            if ((458752 & i) == 0) {
                                i7 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                            }
                            i8 = i3;
                            if ((374491 & i8) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i12 == 0 ? Modifier.Companion : obj;
                                if (i4 != 0) {
                                    animatedContentKt$AnimatedContent$4 = AnimatedContentKt$AnimatedContent$4.INSTANCE;
                                }
                                if (i5 != 0) {
                                    alignment2 = Alignment.Companion.getTopStart();
                                }
                                if (i6 != 0) {
                                    animatedContentKt$AnimatedContent$5 = AnimatedContentKt$AnimatedContent$5.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i8, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:681)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                layoutDirection = (LayoutDirection) consume;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(transition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                snapshotStateList = (SnapshotStateList) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                map = (Map) rememberedValue3;
                                if (!snapshotStateList.contains(transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment$animation_release(alignment2);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i10 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i11 = -1;
                                            i10 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(animatedContentKt$AnimatedContent$5.invoke((Object) it.next()), animatedContentKt$AnimatedContent$5.invoke(transition.getTargetState()))) {
                                            i11 = -1;
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    if (i10 != i11) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i10, transition.getTargetState());
                                    }
                                }
                                if (map.containsKey(transition.getTargetState()) || !map.containsKey(transition.getCurrentState())) {
                                    map.clear();
                                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                                    size = snapshotStateList2.size();
                                    i9 = 0;
                                    while (i9 < size) {
                                        T t = snapshotStateList2.get(i9);
                                        map = map;
                                        map.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, 885640742, true, new AnimatedContentKt$AnimatedContent$6$1(transition, t, i8, animatedContentKt$AnimatedContent$4, animatedContentTransitionScopeImpl, snapshotStateList, content)));
                                        i9++;
                                        size = size;
                                        snapshotStateList2 = snapshotStateList2;
                                        animatedContentKt$AnimatedContent$4 = animatedContentKt$AnimatedContent$4;
                                        alignment2 = alignment2;
                                    }
                                }
                                function13 = animatedContentKt$AnimatedContent$4;
                                Alignment alignment4 = alignment2;
                                Transition.Segment<S> segment = transition.getSegment();
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed4 = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                                    function14 = function13;
                                    invoke = function14.invoke(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(invoke);
                                } else {
                                    invoke = rememberedValue5;
                                    function14 = function13;
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier then = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue4;
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                                Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
                                startRestartGroup.startReplaceableGroup(-441507761);
                                ComposerKt.sourceInformation(startRestartGroup, "");
                                for (Object obj4 : snapshotStateList) {
                                    startRestartGroup.startMovableGroup(-1739559893, animatedContentKt$AnimatedContent$5.invoke(obj4));
                                    ComposerKt.sourceInformation(startRestartGroup, "793@37870L8");
                                    Function2 function2 = (Function2) map.get(obj4);
                                    if (function2 != null) {
                                        function2.invoke(startRestartGroup, 0);
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function15 = function14;
                                function16 = animatedContentKt$AnimatedContent$5;
                                modifier2 = companion;
                                alignment3 = alignment4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = obj;
                                function15 = animatedContentKt$AnimatedContent$4;
                                alignment3 = alignment2;
                                function16 = animatedContentKt$AnimatedContent$5;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AnimatedContentKt$AnimatedContent$9(transition, modifier2, function15, alignment3, function16, content, i, i2));
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        i8 = i3;
                        if ((374491 & i8) == 74898) {
                        }
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        layoutDirection = (LayoutDirection) consume2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(transition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transition);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        map = (Map) rememberedValue3;
                        if (!snapshotStateList.contains(transition.getCurrentState())) {
                        }
                        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i10 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i10++;
                            }
                            if (i10 != i11) {
                            }
                        }
                        if (map.containsKey(transition.getTargetState())) {
                        }
                        map.clear();
                        SnapshotStateList snapshotStateList22 = snapshotStateList;
                        size = snapshotStateList22.size();
                        i9 = 0;
                        while (i9 < size) {
                        }
                        function13 = animatedContentKt$AnimatedContent$4;
                        Alignment alignment42 = alignment2;
                        Transition.Segment<S> segment2 = transition.getSegment();
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed4 = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                        Object rememberedValue52 = startRestartGroup.rememberedValue();
                        if (changed4) {
                        }
                        function14 = function13;
                        invoke = function14.invoke(animatedContentTransitionScopeImpl);
                        startRestartGroup.updateRememberedValue(invoke);
                        startRestartGroup.endReplaceableGroup();
                        Modifier then2 = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) rememberedValue4;
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then2);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                        Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!m2893constructorimpl.getInserting()) {
                        }
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
                        startRestartGroup.startReplaceableGroup(-441507761);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        while (r0.hasNext()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function15 = function14;
                        function16 = animatedContentKt$AnimatedContent$5;
                        modifier2 = companion;
                        alignment3 = alignment42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    animatedContentKt$AnimatedContent$5 = function12;
                    if ((i2 & 16) == 0) {
                    }
                    i3 |= i7;
                    i8 = i3;
                    if ((374491 & i8) == 74898) {
                    }
                    if (i12 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    layoutDirection = (LayoutDirection) consume22;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(transition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new LinkedHashMap();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue3;
                    if (!snapshotStateList.contains(transition.getCurrentState())) {
                    }
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (map.containsKey(transition.getTargetState())) {
                    }
                    map.clear();
                    SnapshotStateList snapshotStateList222 = snapshotStateList;
                    size = snapshotStateList222.size();
                    i9 = 0;
                    while (i9 < size) {
                    }
                    function13 = animatedContentKt$AnimatedContent$4;
                    Alignment alignment422 = alignment2;
                    Transition.Segment<S> segment22 = transition.getSegment();
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                    Object rememberedValue522 = startRestartGroup.rememberedValue();
                    if (changed4) {
                    }
                    function14 = function13;
                    invoke = function14.invoke(animatedContentTransitionScopeImpl);
                    startRestartGroup.updateRememberedValue(invoke);
                    startRestartGroup.endReplaceableGroup();
                    Modifier then22 = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (AnimatedContentMeasurePolicy) rememberedValue4;
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(then22);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
                    startRestartGroup.startReplaceableGroup(-441507761);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    while (r0.hasNext()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function15 = function14;
                    function16 = animatedContentKt$AnimatedContent$5;
                    modifier2 = companion;
                    alignment3 = alignment422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                animatedContentKt$AnimatedContent$5 = function12;
                if ((i2 & 16) == 0) {
                }
                i3 |= i7;
                i8 = i3;
                if ((374491 & i8) == 74898) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (LayoutDirection) consume222;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) rememberedValue2;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                map = (Map) rememberedValue3;
                if (!snapshotStateList.contains(transition.getCurrentState())) {
                }
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (map.containsKey(transition.getTargetState())) {
                }
                map.clear();
                SnapshotStateList snapshotStateList2222 = snapshotStateList;
                size = snapshotStateList2222.size();
                i9 = 0;
                while (i9 < size) {
                }
                function13 = animatedContentKt$AnimatedContent$4;
                Alignment alignment4222 = alignment2;
                Transition.Segment<S> segment222 = transition.getSegment();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed4 = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                Object rememberedValue5222 = startRestartGroup.rememberedValue();
                if (changed4) {
                }
                function14 = function13;
                invoke = function14.invoke(animatedContentTransitionScopeImpl);
                startRestartGroup.updateRememberedValue(invoke);
                startRestartGroup.endReplaceableGroup();
                Modifier then222 = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (AnimatedContentMeasurePolicy) rememberedValue4;
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(then222);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
                startRestartGroup.startReplaceableGroup(-441507761);
                ComposerKt.sourceInformation(startRestartGroup, "");
                while (r0.hasNext()) {
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                function15 = function14;
                function16 = animatedContentKt$AnimatedContent$5;
                modifier2 = companion;
                alignment3 = alignment4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            animatedContentKt$AnimatedContent$4 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            animatedContentKt$AnimatedContent$5 = function12;
            if ((i2 & 16) == 0) {
            }
            i3 |= i7;
            i8 = i3;
            if ((374491 & i8) == 74898) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            layoutDirection = (LayoutDirection) consume2222;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(transition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue3;
            if (!snapshotStateList.contains(transition.getCurrentState())) {
            }
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (map.containsKey(transition.getTargetState())) {
            }
            map.clear();
            SnapshotStateList snapshotStateList22222 = snapshotStateList;
            size = snapshotStateList22222.size();
            i9 = 0;
            while (i9 < size) {
            }
            function13 = animatedContentKt$AnimatedContent$4;
            Alignment alignment42222 = alignment2;
            Transition.Segment<S> segment2222 = transition.getSegment();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
            Object rememberedValue52222 = startRestartGroup.rememberedValue();
            if (changed4) {
            }
            function14 = function13;
            invoke = function14.invoke(animatedContentTransitionScopeImpl);
            startRestartGroup.updateRememberedValue(invoke);
            startRestartGroup.endReplaceableGroup();
            Modifier then2222 = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (AnimatedContentMeasurePolicy) rememberedValue4;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(then2222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
            startRestartGroup.startReplaceableGroup(-441507761);
            ComposerKt.sourceInformation(startRestartGroup, "");
            while (r0.hasNext()) {
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function15 = function14;
            function16 = animatedContentKt$AnimatedContent$5;
            modifier2 = companion;
            alignment3 = alignment42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        animatedContentKt$AnimatedContent$4 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        animatedContentKt$AnimatedContent$5 = function12;
        if ((i2 & 16) == 0) {
        }
        i3 |= i7;
        i8 = i3;
        if ((374491 & i8) == 74898) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (LayoutDirection) consume22222;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(transition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transition);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new LinkedHashMap();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue3;
        if (!snapshotStateList.contains(transition.getCurrentState())) {
        }
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (map.containsKey(transition.getTargetState())) {
        }
        map.clear();
        SnapshotStateList snapshotStateList222222 = snapshotStateList;
        size = snapshotStateList222222.size();
        i9 = 0;
        while (i9 < size) {
        }
        function13 = animatedContentKt$AnimatedContent$4;
        Alignment alignment422222 = alignment2;
        Transition.Segment<S> segment22222 = transition.getSegment();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
        Object rememberedValue522222 = startRestartGroup.rememberedValue();
        if (changed4) {
        }
        function14 = function13;
        invoke = function14.invoke(animatedContentTransitionScopeImpl);
        startRestartGroup.updateRememberedValue(invoke);
        startRestartGroup.endReplaceableGroup();
        Modifier then22222 = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release(invoke, startRestartGroup, 72));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (AnimatedContentMeasurePolicy) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(then22222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, animatedContentMeasurePolicy22222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740836641, "C:AnimatedContent.kt#xbi5r1");
        startRestartGroup.startReplaceableGroup(-441507761);
        ComposerKt.sourceInformation(startRestartGroup, "");
        while (r0.hasNext()) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function15 = function14;
        function16 = animatedContentKt$AnimatedContent$5;
        modifier2 = companion;
        alignment3 = alignment422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
