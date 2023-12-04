package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010!\u001a\u008d\u0001\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0002\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1<? super LazyListScope, Unit> content, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Alignment.Vertical vertical3;
        Composer composer2;
        Arrangement.Vertical vertical4;
        int i14;
        Alignment.Horizontal horizontal3;
        Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(620764179);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)78@3680L50,80@3756L48,82@3830L292,95@4128L48,97@4224L18,103@4479L277,111@4820L164,121@5208L7,99@4334L1359:LazyList.kt#428nma");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i2 & 458752) == 0) {
                i6 = startRestartGroup.changed(flingBehavior) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i5 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                i7 = i4 & 128;
                if (i7 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                }
                i8 = i4 & 256;
                if (i8 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(horizontal) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(vertical) ? 536870912 : 268435456;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    i11 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i11 = i3 | (startRestartGroup.changed(vertical2) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                i12 = i4 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i3 & 112) == 0) {
                    i11 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
                }
                i13 = i11;
                if ((i4 & 4096) != 0) {
                    i13 |= 384;
                } else if ((i3 & 896) == 0) {
                    i13 |= startRestartGroup.changedInstance(content) ? 256 : 128;
                }
                if ((1533916891 & i5) == 306783378 || (i13 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    int i15 = i7 != 0 ? 0 : i;
                    Alignment.Horizontal horizontal5 = i8 != 0 ? null : horizontal;
                    Arrangement.Vertical vertical5 = i9 != 0 ? null : vertical;
                    vertical3 = i10 != 0 ? null : vertical2;
                    Arrangement.Horizontal horizontal6 = i12 != 0 ? null : horizontal2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i13, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                    }
                    int i16 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> rememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, startRestartGroup, ((i13 >> 3) & 112) | i16);
                    LazyLayoutSemanticState rememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, startRestartGroup, i16 | ((i5 >> 9) & 112));
                    int i17 = i5 & 112;
                    int i18 = i5 & 7168;
                    int i19 = i5 >> 6;
                    int i20 = i13 << 21;
                    int i21 = i5;
                    Arrangement.Vertical vertical6 = vertical5;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda, state, contentPadding, z, z2, i15, horizontal5, vertical3, horizontal6, vertical5, startRestartGroup, (i5 & 896) | i17 | i18 | (i5 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (1879048192 & i5), 0);
                    composer2 = startRestartGroup;
                    ScrollPositionUpdater(rememberLazyListItemProviderLambda, state, composer2, i17);
                    OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
                    Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll = OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, composer2, (i19 & 57344) | ((i21 << 6) & 458752)), orientation), state, i15, z, orientation, composer2, ((i21 >> 15) & 896) | i17 | i18), overscrollEffect);
                    ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) consume, orientation, z), flingBehavior, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyListMeasurePolicy, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical4 = vertical6;
                    i14 = i15;
                    horizontal3 = horizontal5;
                    horizontal4 = horizontal6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    i14 = i;
                    horizontal3 = horizontal;
                    vertical4 = vertical;
                    vertical3 = vertical2;
                    horizontal4 = horizontal2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new LazyListKt$LazyList$1(modifier, state, contentPadding, z, z2, flingBehavior, z3, i14, horizontal3, vertical4, vertical3, horizontal4, content, i2, i3, i4));
                return;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
            }
            i8 = i4 & 256;
            if (i8 != 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i12 = i4 & 2048;
            if (i12 != 0) {
            }
            i13 = i11;
            if ((i4 & 4096) != 0) {
            }
            if ((1533916891 & i5) == 306783378) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> rememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, startRestartGroup, ((i13 >> 3) & 112) | i162);
            LazyLayoutSemanticState rememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, startRestartGroup, i162 | ((i5 >> 9) & 112));
            int i172 = i5 & 112;
            int i182 = i5 & 7168;
            int i192 = i5 >> 6;
            int i202 = i13 << 21;
            int i212 = i5;
            Arrangement.Vertical vertical62 = vertical5;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2, state, contentPadding, z, z2, i15, horizontal5, vertical3, horizontal6, vertical5, startRestartGroup, (i5 & 896) | i172 | i182 | (i5 & 57344) | (i192 & 458752) | (i192 & 3670016) | (i202 & 29360128) | (i202 & 234881024) | (1879048192 & i5), 0);
            composer2 = startRestartGroup;
            ScrollPositionUpdater(rememberLazyListItemProviderLambda2, state, composer2, i172);
            OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
            Orientation orientation2 = z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2 = OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, composer2, (i192 & 57344) | ((i212 << 6) & 458752)), orientation2), state, i15, z, orientation2, composer2, ((i212 >> 15) & 896) | i172 | i182), overscrollEffect2);
            ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((LayoutDirection) consume2, orientation2, z), flingBehavior, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyListMeasurePolicy2, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            vertical4 = vertical62;
            i14 = i15;
            horizontal3 = horizontal5;
            horizontal4 = horizontal6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 |= i6;
        if ((i4 & 64) == 0) {
        }
        i7 = i4 & 128;
        if (i7 != 0) {
        }
        i8 = i4 & 256;
        if (i8 != 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i12 = i4 & 2048;
        if (i12 != 0) {
        }
        i13 = i11;
        if ((i4 & 4096) != 0) {
        }
        if ((1533916891 & i5) == 306783378) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1622 = (i5 >> 3) & 14;
        Function0<LazyListItemProvider> rememberLazyListItemProviderLambda22 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, startRestartGroup, ((i13 >> 3) & 112) | i1622);
        LazyLayoutSemanticState rememberLazyListSemanticState22 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, startRestartGroup, i1622 | ((i5 >> 9) & 112));
        int i1722 = i5 & 112;
        int i1822 = i5 & 7168;
        int i1922 = i5 >> 6;
        int i2022 = i13 << 21;
        int i2122 = i5;
        Arrangement.Vertical vertical622 = vertical5;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda22, state, contentPadding, z, z2, i15, horizontal5, vertical3, horizontal6, vertical5, startRestartGroup, (i5 & 896) | i1722 | i1822 | (i5 & 57344) | (i1922 & 458752) | (i1922 & 3670016) | (i2022 & 29360128) | (i2022 & 234881024) | (1879048192 & i5), 0);
        composer2 = startRestartGroup;
        ScrollPositionUpdater(rememberLazyListItemProviderLambda22, state, composer2, i1722);
        OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(composer2, 6);
        Orientation orientation22 = z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22 = OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyListItemProviderLambda22, rememberLazyListSemanticState22, orientation22, z3, z, composer2, (i1922 & 57344) | ((i2122 << 6) & 458752)), orientation22), state, i15, z, orientation22, composer2, ((i2122 >> 15) & 896) | i1722 | i1822), overscrollEffect22);
        ScrollableDefaults scrollableDefaults22 = ScrollableDefaults.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, scrollableDefaults22.reverseDirection((LayoutDirection) consume22, orientation22, z), flingBehavior, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyListMeasurePolicy22, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        vertical4 = vertical622;
        i14 = i15;
        horizontal3 = horizontal5;
        horizontal4 = horizontal6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollPositionUpdater(Function0<? extends LazyListItemProvider> function0, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-331135862);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyList.kt#428nma");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-331135862, i, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:140)");
            }
            LazyListItemProvider invoke = function0.invoke();
            if (invoke.getItemCount() > 0) {
                LazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyListState, invoke, 0, 2, null);
            }
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
        endRestartGroup.updateScope(new LazyListKt$ScrollPositionUpdater$1(function0, lazyListState, i));
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(Function0<? extends LazyListItemProvider> function0, LazyListState lazyListState, PaddingValues paddingValues, boolean z, boolean z2, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(183156450);
        ComposerKt.sourceInformation(composer, "C(rememberLazyListMeasurePolicy)P(5,7,1,6,4!2,8)173@7248L7052:LazyList.kt#428nma");
        Alignment.Horizontal horizontal3 = (i3 & 64) != 0 ? null : horizontal;
        Alignment.Vertical vertical3 = (i3 & 128) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i3 & 256) != 0 ? null : horizontal2;
        Arrangement.Vertical vertical4 = (i3 & 512) != 0 ? null : vertical2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            z3 |= composer.changed(objArr[i4]);
        }
        LazyListKt$rememberLazyListMeasurePolicy$1$1 rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListKt$rememberLazyListMeasurePolicy$1$1(z2, paddingValues, z, lazyListState, function0, vertical4, horizontal4, i, horizontal3, vertical3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }
}
