package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tRG\u0010\n\u001a8\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehaviorDefaults;", "", "()V", "MaximumFlingDistance", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "", "getMaximumFlingDistance$annotations", "getMaximumFlingDistance", "()Lkotlin/jvm/functions/Function1;", "SnapIndex", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "getSnapIndex", "()Lkotlin/jvm/functions/Function3;", "SpringAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSpringAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapperFlingBehaviorDefaults {
    public static final SnapperFlingBehaviorDefaults INSTANCE = new SnapperFlingBehaviorDefaults();
    private static final AnimationSpec<Float> SpringAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final Function1<SnapperLayoutInfo, Float> MaximumFlingDistance = SnapperFlingBehaviorDefaults$MaximumFlingDistance$1.INSTANCE;
    private static final Function3<SnapperLayoutInfo, Integer, Integer, Integer> SnapIndex = SnapperFlingBehaviorDefaults$SnapIndex$1.INSTANCE;
    public static final int $stable = 8;

    @Deprecated(message = "The maximumFlingDistance parameter has been deprecated.")
    public static /* synthetic */ void getMaximumFlingDistance$annotations() {
    }

    private SnapperFlingBehaviorDefaults() {
    }

    public final AnimationSpec<Float> getSpringAnimationSpec() {
        return SpringAnimationSpec;
    }

    public final Function1<SnapperLayoutInfo, Float> getMaximumFlingDistance() {
        return MaximumFlingDistance;
    }

    public final Function3<SnapperLayoutInfo, Integer, Integer, Integer> getSnapIndex() {
        return SnapIndex;
    }
}
