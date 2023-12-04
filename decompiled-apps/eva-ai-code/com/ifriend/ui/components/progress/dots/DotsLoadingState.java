package com.ifriend.ui.components.progress.dots;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DotsLoading.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J\u001b\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u00020\u00078@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\n8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lcom/ifriend/ui/components/progress/dots/DotsLoadingState;", "", "()V", "_duration", "Landroidx/compose/runtime/MutableState;", "", "_selectedDotsColor", "Landroidx/compose/ui/graphics/Color;", "_selectedDotsCount", "_selectedDotsSize", "Landroidx/compose/ui/unit/Dp;", "_selectedEasing", "Landroidx/compose/animation/core/Easing;", "duration", "getDuration$common_ui_release", "()I", "selectedDotsColor", "getSelectedDotsColor-0d7_KjU$common_ui_release", "()J", "selectedDotsCount", "getSelectedDotsCount$common_ui_release", "selectedDotsSize", "getSelectedDotsSize-D9Ej5fM$common_ui_release", "()F", "selectedEasing", "getSelectedEasing$common_ui_release", "()Landroidx/compose/animation/core/Easing;", "updateSelectedDotsColor", "", "value", "updateSelectedDotsColor-8_81llA", "(J)V", "updateSelectedDotsCount", "updateSelectedDotsDuration", "updateSelectedDotsSize", "updateSelectedDotsSize-0680j_4", "(F)V", "updateSelectedEasing", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsLoadingState {
    public static final float END_FADE_VALUE = 0.2f;
    public static final float START_FADE_VALUE = 1.0f;
    private MutableState<Integer> _duration;
    private MutableState<Color> _selectedDotsColor;
    private MutableState<Integer> _selectedDotsCount;
    private MutableState<Dp> _selectedDotsSize;
    private MutableState<Easing> _selectedEasing;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DotsLoadingState() {
        MutableState<Easing> mutableStateOf$default;
        MutableState<Dp> mutableStateOf$default2;
        MutableState<Color> mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EasingKt.getLinearEasing(), null, 2, null);
        this._selectedEasing = mutableStateOf$default;
        this._selectedDotsCount = SnapshotIntStateKt.mutableIntStateOf(3);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5605boximpl(Dp.m5607constructorimpl(4)), null, 2, null);
        this._selectedDotsSize = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(Color.Companion.m3318getBlue0d7_KjU()), null, 2, null);
        this._selectedDotsColor = mutableStateOf$default3;
        this._duration = SnapshotIntStateKt.mutableIntStateOf(500);
    }

    public final Easing getSelectedEasing$common_ui_release() {
        return this._selectedEasing.getValue();
    }

    public final int getSelectedDotsCount$common_ui_release() {
        return this._selectedDotsCount.getValue().intValue();
    }

    /* renamed from: getSelectedDotsSize-D9Ej5fM$common_ui_release  reason: not valid java name */
    public final float m7063getSelectedDotsSizeD9Ej5fM$common_ui_release() {
        return this._selectedDotsSize.getValue().m5621unboximpl();
    }

    /* renamed from: getSelectedDotsColor-0d7_KjU$common_ui_release  reason: not valid java name */
    public final long m7062getSelectedDotsColor0d7_KjU$common_ui_release() {
        return this._selectedDotsColor.getValue().m3301unboximpl();
    }

    public final int getDuration$common_ui_release() {
        return this._duration.getValue().intValue();
    }

    public final void updateSelectedEasing(Easing value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._selectedEasing.setValue(value);
    }

    public final void updateSelectedDotsCount(int i) {
        this._selectedDotsCount.setValue(Integer.valueOf(i));
    }

    /* renamed from: updateSelectedDotsSize-0680j_4  reason: not valid java name */
    public final void m7065updateSelectedDotsSize0680j_4(float f) {
        this._selectedDotsSize.setValue(Dp.m5605boximpl(f));
    }

    /* renamed from: updateSelectedDotsColor-8_81llA  reason: not valid java name */
    public final void m7064updateSelectedDotsColor8_81llA(long j) {
        this._selectedDotsColor.setValue(Color.m3281boximpl(j));
    }

    public final void updateSelectedDotsDuration(int i) {
        this._duration.setValue(Integer.valueOf(i));
    }

    /* compiled from: DotsLoading.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/components/progress/dots/DotsLoadingState$Companion;", "", "()V", "END_FADE_VALUE", "", "START_FADE_VALUE", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
