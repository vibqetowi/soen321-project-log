package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ClickableText.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "onHover", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "containsWithinBounds", "Landroidx/compose/ui/text/MultiParagraph;", "positionOffset", "Landroidx/compose/ui/geometry/Offset;", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013e  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* renamed from: ClickableText-4YKlhWE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1021ClickableText4YKlhWE(AnnotatedString text, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Integer, Unit> onClick, Composer composer, int i3, int i4) {
        int i5;
        Modifier.Companion companion;
        int i6;
        Object obj;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ClickableTextKt$ClickableText$1 clickableTextKt$ClickableText$1;
        Object rememberedValue;
        boolean changed;
        ClickableTextKt$ClickableText$pressIndicator$1$1 rememberedValue2;
        boolean changed2;
        ClickableTextKt$ClickableText$2$1 rememberedValue3;
        Composer composer2;
        int i13;
        Modifier modifier2;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle textStyle2;
        boolean z3;
        int i14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-246609449);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)79@3637L52,80@3746L184,95@4151L76,88@3936L297:ClickableText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            Object obj2 = modifier;
            i5 |= startRestartGroup.changed(obj2) ? 32 : 16;
            companion = obj2;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                obj = textStyle;
                i5 |= startRestartGroup.changed(obj) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i3 & 7168) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i3 & 57344) == 0) {
                            i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i5 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            i12 = startRestartGroup.changedInstance(onClick) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i5) == 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                companion = Modifier.Companion;
                            }
                            TextStyle textStyle3 = i6 != 0 ? TextStyle.Companion.getDefault() : obj;
                            boolean z4 = i7 != 0 ? true : z2;
                            int m5516getClipgIe3tQ8 = i8 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i9;
                            int i16 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            clickableTextKt$ClickableText$1 = i11 != 0 ? ClickableTextKt$ClickableText$1.INSTANCE : function1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            MutableState mutableState = (MutableState) rememberedValue;
                            Modifier.Companion companion2 = Modifier.Companion;
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(onClick);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Modifier then = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion2, onClick, (Function2) rememberedValue2));
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(clickableTextKt$ClickableText$1);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new ClickableTextKt$ClickableText$2$1(mutableState, clickableTextKt$ClickableText$1);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Modifier modifier3 = companion;
                            Function1<? super TextLayoutResult, Unit> function13 = clickableTextKt$ClickableText$1;
                            composer2 = startRestartGroup;
                            BasicTextKt.m1016BasicTextRWo7tUw(text, then, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i13 = i16;
                            modifier2 = modifier3;
                            function12 = function13;
                            textStyle2 = textStyle3;
                            z3 = z4;
                            i14 = m5516getClipgIe3tQ8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function12 = function1;
                            modifier2 = companion;
                            textStyle2 = obj;
                            z3 = z2;
                            i14 = i9;
                            composer2 = startRestartGroup;
                            i13 = i2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ClickableTextKt$ClickableText$3(text, modifier2, textStyle2, z3, i14, i13, function12, onClick, i3, i4));
                        return;
                    }
                    i12 = 12582912;
                    i5 |= i12;
                    if ((23967451 & i5) == 4793490) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    Modifier.Companion companion22 = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(onClick);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState2, onClick, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    Modifier then2 = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion22, onClick, (Function2) rememberedValue2));
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(clickableTextKt$ClickableText$1);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = new ClickableTextKt$ClickableText$2$1(mutableState2, clickableTextKt$ClickableText$1);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    Modifier modifier32 = companion;
                    Function1<? super TextLayoutResult, Unit> function132 = clickableTextKt$ClickableText$1;
                    composer2 = startRestartGroup;
                    BasicTextKt.m1016BasicTextRWo7tUw(text, then2, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i13 = i16;
                    modifier2 = modifier32;
                    function12 = function132;
                    textStyle2 = textStyle3;
                    z3 = z4;
                    i14 = m5516getClipgIe3tQ8;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i4 & 128) != 0) {
                }
                i5 |= i12;
                if ((23967451 & i5) == 4793490) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState22 = (MutableState) rememberedValue;
                Modifier.Companion companion222 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changed(onClick);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState22, onClick, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                Modifier then22 = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion222, onClick, (Function2) rememberedValue2));
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(mutableState22) | startRestartGroup.changed(clickableTextKt$ClickableText$1);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new ClickableTextKt$ClickableText$2$1(mutableState22, clickableTextKt$ClickableText$1);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                Modifier modifier322 = companion;
                Function1<? super TextLayoutResult, Unit> function1322 = clickableTextKt$ClickableText$1;
                composer2 = startRestartGroup;
                BasicTextKt.m1016BasicTextRWo7tUw(text, then22, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                i13 = i16;
                modifier2 = modifier322;
                function12 = function1322;
                textStyle2 = textStyle3;
                z3 = z4;
                i14 = m5516getClipgIe3tQ8;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i4 & 128) != 0) {
            }
            i5 |= i12;
            if ((23967451 & i5) == 4793490) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState222 = (MutableState) rememberedValue;
            Modifier.Companion companion2222 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changed(onClick);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState222, onClick, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            Modifier then222 = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion2222, onClick, (Function2) rememberedValue2));
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(mutableState222) | startRestartGroup.changed(clickableTextKt$ClickableText$1);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new ClickableTextKt$ClickableText$2$1(mutableState222, clickableTextKt$ClickableText$1);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            Modifier modifier3222 = companion;
            Function1<? super TextLayoutResult, Unit> function13222 = clickableTextKt$ClickableText$1;
            composer2 = startRestartGroup;
            BasicTextKt.m1016BasicTextRWo7tUw(text, then222, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            i13 = i16;
            modifier2 = modifier3222;
            function12 = function13222;
            textStyle2 = textStyle3;
            z3 = z4;
            i14 = m5516getClipgIe3tQ8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i4 & 128) != 0) {
        }
        i5 |= i12;
        if ((23967451 & i5) == 4793490) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2222 = (MutableState) rememberedValue;
        Modifier.Companion companion22222 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(onClick);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState2222, onClick, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        Modifier then2222 = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion22222, onClick, (Function2) rememberedValue2));
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(clickableTextKt$ClickableText$1);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new ClickableTextKt$ClickableText$2$1(mutableState2222, clickableTextKt$ClickableText$1);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        Modifier modifier32222 = companion;
        Function1<? super TextLayoutResult, Unit> function132222 = clickableTextKt$ClickableText$1;
        composer2 = startRestartGroup;
        BasicTextKt.m1016BasicTextRWo7tUw(text, then2222, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        i13 = i16;
        modifier2 = modifier32222;
        function12 = function132222;
        textStyle2 = textStyle3;
        z3 = z4;
        i14 = m5516getClipgIe3tQ8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* renamed from: ClickableText-03UYbkw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1020ClickableText03UYbkw(AnnotatedString text, Function1<? super Integer, Unit> onHover, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Integer, Unit> onClick, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ClickableTextKt$ClickableText$4 clickableTextKt$ClickableText$4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        ClickableTextKt$ClickableText$5$1 rememberedValue3;
        Composer composer2;
        int i13;
        int i14;
        Modifier modifier2;
        TextStyle textStyle2;
        boolean z3;
        Function1<? super TextLayoutResult, Unit> function12;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onHover, "onHover");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1020774372);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClickableText)P(8,3,1,7,6,5:c#ui.text.style.TextOverflow!1,4)153@6860L52,154@6938L24,183@7878L76,176@7657L303:ClickableText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onHover) ? 32 : 16;
        }
        int i15 = i4 & 4;
        if (i15 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                obj = textStyle;
                i5 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i3 & 458752) == 0) {
                            i5 |= startRestartGroup.changed(i9) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        i5 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) != 0) {
                        if ((234881024 & i3) == 0) {
                            i12 = startRestartGroup.changedInstance(onClick) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((191739611 & i5) == 38347922 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i6 != 0 ? TextStyle.Companion.getDefault() : obj;
                            boolean z4 = i7 != 0 ? true : z2;
                            int m5516getClipgIe3tQ8 = i8 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i9;
                            int i16 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            clickableTextKt$ClickableText$4 = i11 != 0 ? ClickableTextKt$ClickableText$4.INSTANCE : function1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            MutableState mutableState = (MutableState) rememberedValue;
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            Modifier then = companion.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope, onHover, mutableState, onClick, null)));
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(clickableTextKt$ClickableText$4);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new ClickableTextKt$ClickableText$5$1(mutableState, clickableTextKt$ClickableText$4);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i17 = i5 >> 3;
                            Modifier modifier3 = companion;
                            Function1<? super TextLayoutResult, Unit> function13 = clickableTextKt$ClickableText$4;
                            composer2 = startRestartGroup;
                            BasicTextKt.m1016BasicTextRWo7tUw(text, then, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i17 & 896) | (i17 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i13 = m5516getClipgIe3tQ8;
                            i14 = i16;
                            modifier2 = modifier3;
                            textStyle2 = textStyle3;
                            z3 = z4;
                            function12 = function13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i14 = i2;
                            textStyle2 = obj;
                            i13 = i9;
                            z3 = z2;
                            composer2 = startRestartGroup;
                            function12 = function1;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ClickableTextKt$ClickableText$6(text, onHover, modifier2, textStyle2, z3, i13, i14, function12, onClick, i3, i4));
                        return;
                    }
                    i12 = 100663296;
                    i5 |= i12;
                    if ((191739611 & i5) == 38347922) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Modifier then2 = companion.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope2, onHover, mutableState2, onClick, null)));
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(clickableTextKt$ClickableText$4);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new ClickableTextKt$ClickableText$5$1(mutableState2, clickableTextKt$ClickableText$4);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    int i172 = i5 >> 3;
                    Modifier modifier32 = companion;
                    Function1<? super TextLayoutResult, Unit> function132 = clickableTextKt$ClickableText$4;
                    composer2 = startRestartGroup;
                    BasicTextKt.m1016BasicTextRWo7tUw(text, then2, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i172 & 896) | (i172 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i13 = m5516getClipgIe3tQ8;
                    i14 = i16;
                    modifier2 = modifier32;
                    textStyle2 = textStyle3;
                    z3 = z4;
                    function12 = function132;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                if ((i4 & 256) != 0) {
                }
                i5 |= i12;
                if ((191739611 & i5) == 38347922) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState22 = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Modifier then22 = companion.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope22, onHover, mutableState22, onClick, null)));
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changed(clickableTextKt$ClickableText$4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new ClickableTextKt$ClickableText$5$1(mutableState22, clickableTextKt$ClickableText$4);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                int i1722 = i5 >> 3;
                Modifier modifier322 = companion;
                Function1<? super TextLayoutResult, Unit> function1322 = clickableTextKt$ClickableText$4;
                composer2 = startRestartGroup;
                BasicTextKt.m1016BasicTextRWo7tUw(text, then22, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i1722 & 896) | (i1722 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                i13 = m5516getClipgIe3tQ8;
                i14 = i16;
                modifier2 = modifier322;
                textStyle2 = textStyle3;
                z3 = z4;
                function12 = function1322;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = textStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            if ((i4 & 256) != 0) {
            }
            i5 |= i12;
            if ((191739611 & i5) == 38347922) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState222 = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier then222 = companion.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope222, onHover, mutableState222, onClick, null)));
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changed(clickableTextKt$ClickableText$4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new ClickableTextKt$ClickableText$5$1(mutableState222, clickableTextKt$ClickableText$4);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            int i17222 = i5 >> 3;
            Modifier modifier3222 = companion;
            Function1<? super TextLayoutResult, Unit> function13222 = clickableTextKt$ClickableText$4;
            composer2 = startRestartGroup;
            BasicTextKt.m1016BasicTextRWo7tUw(text, then222, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i17222 & 896) | (i17222 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            i13 = m5516getClipgIe3tQ8;
            i14 = i16;
            modifier2 = modifier3222;
            textStyle2 = textStyle3;
            z3 = z4;
            function12 = function13222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        obj = textStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i4 & 256) != 0) {
        }
        i5 |= i12;
        if ((191739611 & i5) == 38347922) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2222 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Modifier then2222 = companion.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope2222, onHover, mutableState2222, onClick, null)));
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(clickableTextKt$ClickableText$4);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new ClickableTextKt$ClickableText$5$1(mutableState2222, clickableTextKt$ClickableText$4);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        int i172222 = i5 >> 3;
        Modifier modifier32222 = companion;
        Function1<? super TextLayoutResult, Unit> function132222 = clickableTextKt$ClickableText$4;
        composer2 = startRestartGroup;
        BasicTextKt.m1016BasicTextRWo7tUw(text, then2222, textStyle3, rememberedValue3, m5516getClipgIe3tQ8, z4, i16, 0, null, null, startRestartGroup, (i5 & 14) | (i172222 & 896) | (i172222 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        i13 = m5516getClipgIe3tQ8;
        i14 = i16;
        modifier2 = modifier32222;
        textStyle2 = textStyle3;
        z3 = z4;
        function12 = function132222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m1022containsWithinBoundsUv8p0NA(multiParagraph, j)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m4970getOffsetForPositionk4lQ0M(j));
        }
        return null;
    }

    /* renamed from: containsWithinBounds-Uv8p0NA  reason: not valid java name */
    private static final boolean m1022containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j) {
        float m3008component1impl = Offset.m3008component1impl(j);
        float m3009component2impl = Offset.m3009component2impl(j);
        return m3008component1impl > 0.0f && m3009component2impl >= 0.0f && m3008component1impl <= multiParagraph.getWidth() && m3009component2impl <= multiParagraph.getHeight();
    }
}
