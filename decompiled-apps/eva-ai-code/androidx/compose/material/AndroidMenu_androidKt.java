package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aa\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* renamed from: DropdownMenu-ILWXrKs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1235DropdownMenuILWXrKs(boolean z, Function0 onDismissRequest, Modifier modifier, long j, PopupProperties popupProperties, Function3 content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        long j2;
        int i5;
        Object obj2;
        int i6;
        long j3;
        long j4;
        PopupProperties popupProperties2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-840283139);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)96@4692L21,91@4548L219:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = popupProperties;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.Companion : obj;
                            if (i4 != 0) {
                                float f = 0;
                                j3 = DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
                            } else {
                                j3 = j2;
                            }
                            PopupProperties popupProperties3 = i5 != 0 ? new PopupProperties(true, false, false, null, false, false, 62, null) : obj2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                            }
                            int i8 = i3 << 3;
                            m1234DropdownMenu4kj_NE(z, onDismissRequest, companion, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i8) | (i8 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            obj = companion;
                            j4 = j3;
                            popupProperties2 = popupProperties3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j4 = j2;
                            popupProperties2 = obj2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AndroidMenu_androidKt$DropdownMenu$1(z, onDismissRequest, obj, j4, popupProperties2, content, i, i2));
                        return;
                    }
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i6;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 << 3;
                    m1234DropdownMenu4kj_NE(z, onDismissRequest, companion, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i82) | (i82 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    obj = companion;
                    j4 = j3;
                    popupProperties2 = popupProperties3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = popupProperties;
                if ((i2 & 32) != 0) {
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 << 3;
                m1234DropdownMenu4kj_NE(z, onDismissRequest, companion, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i822) | (i822 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                obj = companion;
                j4 = j3;
                popupProperties2 = popupProperties3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j2 = j;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = popupProperties;
            if ((i2 & 32) != 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 << 3;
            m1234DropdownMenu4kj_NE(z, onDismissRequest, companion, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i8222) | (i8222 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = companion;
            j4 = j3;
            popupProperties2 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = popupProperties;
        if ((i2 & 32) != 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 << 3;
        m1234DropdownMenu4kj_NE(z, onDismissRequest, companion, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i82222) | (i82222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = companion;
        j4 = j3;
        popupProperties2 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* renamed from: DropdownMenu-4kj-_NE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1234DropdownMenu4kj_NE(boolean z, Function0<Unit> onDismissRequest, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        long j2;
        ScrollState scrollState2;
        int i5;
        Object obj2;
        int i6;
        long j3;
        PopupProperties popupProperties2;
        Object obj3;
        ScrollState scrollState3;
        Object obj4;
        int i7;
        Object rememberedValue;
        MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        boolean changed;
        AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 rememberedValue3;
        Modifier modifier2;
        long j4;
        PopupProperties popupProperties3;
        int i8;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2135362555);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,6,5)151@7781L21,155@7950L42,159@8140L51,160@8227L7,164@8351L131,168@8492L443:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                }
            }
            if ((57344 & i) != 0) {
                if ((i2 & 16) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                scrollState2 = scrollState;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                obj2 = popupProperties;
                i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                            if (i4 != 0) {
                                float f = 0;
                                j2 = DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            }
                            if (i5 == 0) {
                                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                                scrollState3 = scrollState2;
                                j3 = j2;
                                obj4 = companion;
                                i7 = i3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2135362555, i7, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                                }
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new MutableTransitionState(false);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableTransitionState = (MutableTransitionState) rememberedValue;
                                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m3669boximpl(TransformOrigin.Companion.m3682getCenterSzJe1aQ()), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    MutableState mutableState = (MutableState) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density = (Density) consume;
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(mutableState);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                        rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j3, density, rememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -47803778, true, new AndroidMenu_androidKt$DropdownMenu$2(mutableTransitionState, mutableState, scrollState3, obj4, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 9) & 896), 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = obj4;
                                j4 = j3;
                                scrollState2 = scrollState3;
                                popupProperties3 = popupProperties2;
                            } else {
                                j3 = j2;
                                popupProperties2 = obj2;
                                obj3 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            j3 = j2;
                            popupProperties2 = obj2;
                            obj3 = obj;
                        }
                        scrollState3 = scrollState2;
                        obj4 = obj3;
                        i7 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableTransitionState = (MutableTransitionState) rememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        }
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState2 = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(mutableState2);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j3, density2, rememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -47803778, true, new AndroidMenu_androidKt$DropdownMenu$2(mutableTransitionState, mutableState2, scrollState3, obj4, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 9) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = obj4;
                        j4 = j3;
                        scrollState2 = scrollState3;
                        popupProperties3 = popupProperties2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        j4 = j2;
                        popupProperties3 = obj2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AndroidMenu_androidKt$DropdownMenu$3(z, onDismissRequest, modifier2, j4, scrollState2, popupProperties3, content, i, i2));
                    return;
                }
                i6 = 1572864;
                i3 |= i6;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 == 0) {
                }
            }
            obj2 = popupProperties;
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 == 0) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((57344 & i) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        obj2 = popupProperties;
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(Function0<Unit> onClick, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1988562892);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)P(5,4,2,1,3)207@10118L39,210@10212L227:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj2 = paddingValues;
                    i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj3 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                                boolean z4 = i4 == 0 ? true : z2;
                                PaddingValues dropdownMenuItemContentPadding = i5 == 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : obj2;
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    obj3 = (MutableInteractionSource) rememberedValue;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                                }
                                MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                mutableInteractionSource2 = obj3;
                                z3 = z4;
                                paddingValues2 = dropdownMenuItemContentPadding;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = obj;
                                z3 = z2;
                                paddingValues2 = obj2;
                                mutableInteractionSource2 = obj3;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AndroidMenu_androidKt$DropdownMenuItem$2(onClick, modifier2, z3, paddingValues2, mutableInteractionSource2, content, i, i2));
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        mutableInteractionSource2 = obj3;
                        z3 = z4;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj3 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    mutableInteractionSource2 = obj3;
                    z3 = z4;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj3 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                mutableInteractionSource2 = obj3;
                z3 = z4;
                paddingValues2 = dropdownMenuItemContentPadding;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj3 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            mutableInteractionSource2 = obj3;
            z3 = z4;
            paddingValues2 = dropdownMenuItemContentPadding;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        MenuKt.DropdownMenuItemContent(onClick, companion, z4, dropdownMenuItemContentPadding, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        mutableInteractionSource2 = obj3;
        z3 = z4;
        paddingValues2 = dropdownMenuItemContentPadding;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
