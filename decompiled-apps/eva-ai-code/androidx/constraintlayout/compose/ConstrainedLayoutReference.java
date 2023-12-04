package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\u0016¨\u0006\""}, d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "", "id", "(Ljava/lang/Object;)V", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft$annotations", "()V", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "absoluteRight", "getAbsoluteRight$annotations", "getAbsoluteRight", "baseline", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline$annotations", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom$annotations", "getBottom", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", TtmlNode.END, "getEnd$annotations", "getEnd", "getId", "()Ljava/lang/Object;", TtmlNode.START, "getStart$annotations", "getStart", ViewHierarchyConstants.DIMENSION_TOP_KEY, "getTop$annotations", "getTop", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstrainedLayoutReference {
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    private final ConstraintLayoutBaseScope.VerticalAnchor end;
    private final Object id;
    private final ConstraintLayoutBaseScope.VerticalAnchor start;
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    public static /* synthetic */ void getBaseline$annotations() {
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public ConstrainedLayoutReference(Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(id, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(id, 0);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(id, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(id, 1);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 1);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(id);
    }

    public final Object getId() {
        return this.id;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public final ConstraintLayoutBaseScope.BaselineAnchor getBaseline() {
        return this.baseline;
    }
}
