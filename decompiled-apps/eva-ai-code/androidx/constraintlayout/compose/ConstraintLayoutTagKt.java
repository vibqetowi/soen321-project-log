package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintLayoutTag.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\u0007\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"constraintLayoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getConstraintLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutTag", "getConstraintLayoutTag", "layoutId", "Landroidx/compose/ui/Modifier;", "", ViewHierarchyConstants.TAG_KEY, "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintLayoutTagKt {
    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }

    public static final Modifier layoutId(Modifier modifier, String layoutId, String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        if (str == null) {
            return LayoutIdKt.layoutId(modifier, layoutId);
        }
        return modifier.then(new ConstraintLayoutTag(str, layoutId, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1(layoutId) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Object getConstraintLayoutTag(Measurable measurable) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutTag();
    }

    public static final Object getConstraintLayoutId(Measurable measurable) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutId();
    }
}
