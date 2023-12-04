package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a#\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010 \u001a\u008c\u0001\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u0007¢\u0006\u0002\b\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003ø\u0001\u0000¢\u0006\u0002\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Lkotlin/ExtensionFunctionType;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyGridMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, LazyGridState state, Function2<? super Density, ? super Constraints, LazyGridSlots> slots, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Function1<? super LazyGridScope, Unit> content, Composer composer, int i, int i2, int i3) {
        Object obj;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        FlingBehavior flingBehavior2;
        Object obj2;
        PaddingValues paddingValues2;
        int i10;
        boolean z4;
        Composer composer2;
        boolean z5;
        PaddingValues paddingValues3;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(152645664);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)66@3113L15,76@3554L18,78@3603L50,80@3679L51,82@3756L221,95@4018L48,102@4304L277,110@4645L125,119@4994L7,98@4159L1320:LazyGrid.kt#7791vq");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i4 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(slots) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & 458752) == 0) {
                    i6 = startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) == 0) {
                        i7 = 100663296;
                    } else {
                        if ((234881024 & i) == 0) {
                            i7 = startRestartGroup.changed(verticalArrangement) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i8 = startRestartGroup.changed(horizontalArrangement) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i9 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i9 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                            } else {
                                i9 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i9 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i11 == 0 ? Modifier.Companion : obj;
                                    PaddingValues m741PaddingValues0680j_4 = i12 == 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : paddingValues;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        paddingValues2 = m741PaddingValues0680j_4;
                                        i10 = i4 & (-3670017);
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        obj2 = companion;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        obj2 = companion;
                                        paddingValues2 = m741PaddingValues0680j_4;
                                        i10 = i4;
                                    }
                                    z4 = z6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    paddingValues2 = paddingValues;
                                    flingBehavior2 = flingBehavior;
                                    obj2 = obj;
                                    i10 = i4;
                                    z4 = z;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(152645664, i10, i9, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                                }
                                OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                                int i13 = i10 >> 3;
                                int i14 = i13 & 14;
                                Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i14 | ((i9 << 3) & 112));
                                int i15 = i10 >> 9;
                                LazyLayoutSemanticState rememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i14 | (i15 & 112));
                                int i16 = i10 & 112;
                                int i17 = i10;
                                boolean z7 = z4;
                                Modifier modifier3 = obj2;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i16 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i15 & 3670016) | (i13 & 29360128), 0);
                                state.setVertical$foundation_release(z2);
                                composer2 = startRestartGroup;
                                ScrollPositionUpdater(rememberLazyGridItemProviderLambda, state, composer2, i16);
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                Modifier overscroll = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda, rememberLazyGridSemanticState, orientation, z3, z7, composer2, (i15 & 57344) | ((i17 << 3) & 458752)), orientation), state, z7, orientation, composer2, i16 | ((i17 >> 6) & 896)), overscrollEffect);
                                ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) consume, orientation, z7), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z7;
                                paddingValues3 = paddingValues2;
                                modifier2 = modifier3;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z;
                                modifier2 = obj;
                                composer2 = startRestartGroup;
                                paddingValues3 = paddingValues;
                                flingBehavior3 = flingBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new LazyGridKt$LazyGrid$1(modifier2, state, slots, paddingValues3, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, i, i2, i3));
                            return;
                        }
                        i8 = C.ENCODING_PCM_32BIT;
                        i4 |= i8;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        z4 = z6;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                        int i132 = i10 >> 3;
                        int i142 = i132 & 14;
                        Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda2 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i142 | ((i9 << 3) & 112));
                        int i152 = i10 >> 9;
                        LazyLayoutSemanticState rememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i142 | (i152 & 112));
                        int i162 = i10 & 112;
                        int i172 = i10;
                        boolean z72 = z4;
                        Modifier modifier32 = obj2;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i162 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i152 & 3670016) | (i132 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = startRestartGroup;
                        ScrollPositionUpdater(rememberLazyGridItemProviderLambda2, state, composer2, i162);
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier overscroll2 = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier32.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda2, rememberLazyGridSemanticState2, orientation2, z3, z72, composer2, (i152 & 57344) | ((i172 << 3) & 458752)), orientation2), state, z72, orientation2, composer2, i162 | ((i172 >> 6) & 896)), overscrollEffect2);
                        ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((LayoutDirection) consume2, orientation2, z72), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy2, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z72;
                        paddingValues3 = paddingValues2;
                        modifier2 = modifier32;
                        flingBehavior3 = flingBehavior2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i7;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i8;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    z4 = z6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i1322 = i10 >> 3;
                    int i1422 = i1322 & 14;
                    Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda22 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i1422 | ((i9 << 3) & 112));
                    int i1522 = i10 >> 9;
                    LazyLayoutSemanticState rememberLazyGridSemanticState22 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i1422 | (i1522 & 112));
                    int i1622 = i10 & 112;
                    int i1722 = i10;
                    boolean z722 = z4;
                    Modifier modifier322 = obj2;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i1622 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i1522 & 3670016) | (i1322 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = startRestartGroup;
                    ScrollPositionUpdater(rememberLazyGridItemProviderLambda22, state, composer2, i1622);
                    Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll22 = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier322.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda22, rememberLazyGridSemanticState22, orientation22, z3, z722, composer2, (i1522 & 57344) | ((i1722 << 3) & 458752)), orientation22), state, z722, orientation22, composer2, i1622 | ((i1722 >> 6) & 896)), overscrollEffect22);
                    ScrollableDefaults scrollableDefaults22 = ScrollableDefaults.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, scrollableDefaults22.reverseDirection((LayoutDirection) consume22, orientation22, z722), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy22, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z722;
                    paddingValues3 = paddingValues2;
                    modifier2 = modifier322;
                    flingBehavior3 = flingBehavior2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                i4 |= i7;
                if ((i3 & 512) == 0) {
                }
                i4 |= i8;
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                z4 = z6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                OverscrollEffect overscrollEffect222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                int i13222 = i10 >> 3;
                int i14222 = i13222 & 14;
                Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i14222 | ((i9 << 3) & 112));
                int i15222 = i10 >> 9;
                LazyLayoutSemanticState rememberLazyGridSemanticState222 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i14222 | (i15222 & 112));
                int i16222 = i10 & 112;
                int i17222 = i10;
                boolean z7222 = z4;
                Modifier modifier3222 = obj2;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda222, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i16222 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i15222 & 3670016) | (i13222 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = startRestartGroup;
                ScrollPositionUpdater(rememberLazyGridItemProviderLambda222, state, composer2, i16222);
                Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier overscroll222 = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3222.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda222, rememberLazyGridSemanticState222, orientation222, z3, z7222, composer2, (i15222 & 57344) | ((i17222 << 3) & 458752)), orientation222), state, z7222, orientation222, composer2, i16222 | ((i17222 >> 6) & 896)), overscrollEffect222);
                ScrollableDefaults scrollableDefaults222 = ScrollableDefaults.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda222, ScrollableKt.scrollable(overscroll222, state, orientation222, overscrollEffect222, z3, scrollableDefaults222.reverseDirection((LayoutDirection) consume222, orientation222, z7222), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy222, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z7222;
                paddingValues3 = paddingValues2;
                modifier2 = modifier3222;
                flingBehavior3 = flingBehavior2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i6;
            if ((i & 3670016) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i4 |= i7;
            if ((i3 & 512) == 0) {
            }
            i4 |= i8;
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            z4 = z6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            OverscrollEffect overscrollEffect2222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i132222 = i10 >> 3;
            int i142222 = i132222 & 14;
            Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda2222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i142222 | ((i9 << 3) & 112));
            int i152222 = i10 >> 9;
            LazyLayoutSemanticState rememberLazyGridSemanticState2222 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i142222 | (i152222 & 112));
            int i162222 = i10 & 112;
            int i172222 = i10;
            boolean z72222 = z4;
            Modifier modifier32222 = obj2;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda2222, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i162222 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i152222 & 3670016) | (i132222 & 29360128), 0);
            state.setVertical$foundation_release(z2);
            composer2 = startRestartGroup;
            ScrollPositionUpdater(rememberLazyGridItemProviderLambda2222, state, composer2, i162222);
            Orientation orientation2222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2222 = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier32222.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda2222, rememberLazyGridSemanticState2222, orientation2222, z3, z72222, composer2, (i152222 & 57344) | ((i172222 << 3) & 458752)), orientation2222), state, z72222, orientation2222, composer2, i162222 | ((i172222 >> 6) & 896)), overscrollEffect2222);
            ScrollableDefaults scrollableDefaults2222 = ScrollableDefaults.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda2222, ScrollableKt.scrollable(overscroll2222, state, orientation2222, overscrollEffect2222, z3, scrollableDefaults2222.reverseDirection((LayoutDirection) consume2222, orientation2222, z72222), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy2222, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z72222;
            paddingValues3 = paddingValues2;
            modifier2 = modifier32222;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i6;
        if ((i & 3670016) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i4 |= i7;
        if ((i3 & 512) == 0) {
        }
        i4 |= i8;
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        z4 = z6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        OverscrollEffect overscrollEffect22222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1322222 = i10 >> 3;
        int i1422222 = i1322222 & 14;
        Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda22222 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, startRestartGroup, i1422222 | ((i9 << 3) & 112));
        int i1522222 = i10 >> 9;
        LazyLayoutSemanticState rememberLazyGridSemanticState22222 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, startRestartGroup, i1422222 | (i1522222 & 112));
        int i1622222 = i10 & 112;
        int i1722222 = i10;
        boolean z722222 = z4;
        Modifier modifier322222 = obj2;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda22222, state, slots, paddingValues2, z4, z2, horizontalArrangement, verticalArrangement, startRestartGroup, (i10 & 896) | i1622222 | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i1522222 & 3670016) | (i1322222 & 29360128), 0);
        state.setVertical$foundation_release(z2);
        composer2 = startRestartGroup;
        ScrollPositionUpdater(rememberLazyGridItemProviderLambda22222, state, composer2, i1622222);
        Orientation orientation22222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22222 = OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier322222.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberLazyGridItemProviderLambda22222, rememberLazyGridSemanticState22222, orientation22222, z3, z722222, composer2, (i1522222 & 57344) | ((i1722222 << 3) & 458752)), orientation22222), state, z722222, orientation22222, composer2, i1622222 | ((i1722222 >> 6) & 896)), overscrollEffect22222);
        ScrollableDefaults scrollableDefaults22222 = ScrollableDefaults.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda22222, ScrollableKt.scrollable(overscroll22222, state, orientation22222, overscrollEffect22222, z3, scrollableDefaults22222.reverseDirection((LayoutDirection) consume22222, orientation22222, z722222), flingBehavior2, state.getInternalInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), rememberLazyGridMeasurePolicy22222, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z722222;
        paddingValues3 = paddingValues2;
        modifier2 = modifier322222;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollPositionUpdater(Function0<? extends LazyGridItemProvider> function0, LazyGridState lazyGridState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-649335720);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyGrid.kt#7791vq");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649335720, i, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:138)");
            }
            LazyGridItemProvider invoke = function0.invoke();
            if (invoke.getItemCount() > 0) {
                LazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyGridState, invoke, 0, 2, null);
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
        endRestartGroup.updateScope(new LazyGridKt$ScrollPositionUpdater$1(function0, lazyGridState, i));
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(Function0<? extends LazyGridItemProvider> function0, LazyGridState lazyGridState, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, PaddingValues paddingValues, boolean z, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1292704639);
        ComposerKt.sourceInformation(composer, "C(rememberLazyGridMeasurePolicy)P(3,6,5!1,4,2)173@6918L8458:LazyGrid.kt#7791vq");
        Arrangement.Horizontal horizontal2 = (i2 & 64) != 0 ? null : horizontal;
        Arrangement.Vertical vertical2 = (i2 & 128) != 0 ? null : vertical;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1292704639, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
        }
        Object[] objArr = {lazyGridState, function2, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i3 = 0; i3 < 7; i3++) {
            z3 |= composer.changed(objArr[i3]);
        }
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1 rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(z2, paddingValues, z, function0, function2, lazyGridState, vertical2, horizontal2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function22;
    }
}
