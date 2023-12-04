package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PullRefresh.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001at\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000321\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"pullRefresh", "Landroidx/compose/ui/Modifier;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "enabled", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshKt {
    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return pullRefresh(modifier, pullRefreshState, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState, float f, Continuation continuation) {
        return Boxing.boxFloat(pullRefreshState.onRelease$material_release(f));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, Function1 function1, Function2 function2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pullRefresh(modifier, function1, function2, z);
    }

    public static final Modifier pullRefresh(Modifier modifier, PullRefreshState state, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1 pullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(state, z) : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.Companion;
        return InspectableValueKt.inspectableWrapper(modifier, pullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1, pullRefresh(Modifier.Companion, new PullRefreshKt$pullRefresh$2$1(state), new PullRefreshKt$pullRefresh$2$2(state), z));
    }

    public static final Modifier pullRefresh(Modifier modifier, Function1<? super Float, Float> onPull, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> onRelease, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 pullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(onPull, onRelease, z) : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.Companion;
        return InspectableValueKt.inspectableWrapper(modifier, pullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2, NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, new PullRefreshNestedScrollConnection(onPull, onRelease, z), null, 2, null));
    }
}
