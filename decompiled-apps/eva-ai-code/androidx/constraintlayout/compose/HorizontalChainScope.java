package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChainConstrainScope.kt */
@LayoutScopeMarker
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainScope;", "", "id", "(Ljava/lang/Object;)V", "absoluteLeft", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteRight", "getAbsoluteRight", TtmlNode.END, "getEnd", "getId$compose_release", "()Ljava/lang/Object;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", TtmlNode.START, "getStart", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "getTasks$compose_release", "()Ljava/util/List;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalChainScope {
    private final VerticalAnchorable absoluteLeft;
    private final VerticalAnchorable absoluteRight;
    private final VerticalAnchorable end;
    private final Object id;
    private final ConstrainedLayoutReference parent;
    private final VerticalAnchorable start;
    private final List<Function1<State, Unit>> tasks;

    public HorizontalChainScope(Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = androidx.constraintlayout.core.state.State.PARENT;
        Intrinsics.checkNotNullExpressionValue(PARENT, "PARENT");
        this.parent = new ConstrainedLayoutReference(PARENT);
        this.start = new ChainVerticalAnchorable(arrayList, id, -2);
        this.absoluteLeft = new ChainVerticalAnchorable(arrayList, id, 0);
        this.end = new ChainVerticalAnchorable(arrayList, id, -1);
        this.absoluteRight = new ChainVerticalAnchorable(arrayList, id, 1);
    }

    public final Object getId$compose_release() {
        return this.id;
    }

    public final List<Function1<State, Unit>> getTasks$compose_release() {
        return this.tasks;
    }

    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final VerticalAnchorable getStart() {
        return this.start;
    }

    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }
}
