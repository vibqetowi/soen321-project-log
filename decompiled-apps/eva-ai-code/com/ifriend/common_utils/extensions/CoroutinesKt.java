package com.ifriend.common_utils.extensions;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
/* compiled from: coroutines.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\b"}, d2 = {"isActive", "", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)Z", "coroutineTimer", "Lkotlinx/coroutines/flow/Flow;", "", TypedValues.CycleType.S_WAVE_PERIOD, "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutinesKt {
    public static final Flow<Long> coroutineTimer(long j) {
        return kotlinx.coroutines.flow.FlowKt.flow(new CoroutinesKt$coroutineTimer$1(j, null));
    }

    public static final boolean isActive(Job job) {
        return job != null && job.isActive();
    }
}
