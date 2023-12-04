package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "", "()V", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "size", "getSize", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SnapperLayoutItemInfo {
    public static final int $stable = 0;

    public abstract int getIndex();

    public abstract int getOffset();

    public abstract int getSize();

    public String toString() {
        int index = getIndex();
        int offset = getOffset();
        int size = getSize();
        return "SnapperLayoutItemInfo(index=" + index + ", offset=" + offset + ", size=" + size + ")";
    }
}
