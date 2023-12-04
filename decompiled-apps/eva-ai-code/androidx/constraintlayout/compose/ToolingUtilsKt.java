package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ToolingUtils.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a0\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001aH\u0000\u001a$\u0010'\u001a\n (*\u0004\u0018\u00010 0 *\u00020)2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020\u001a*\u00020)2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u000e\u0010+\u001a\u00020\u001a*\u0004\u0018\u00010)H\u0002\u001aV\u0010,\u001a\u00020\u0015*\u00020 2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a022\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u000200H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"5\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00068@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00067"}, d2 = {"BOUNDS", "", "CONSTRAINTS", "CONSTRAINTS_JSON_VERSION", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "designInfoProvider", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "designInfoProvider$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "addReferencesIds", "", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperReferences", "", "", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "rootId", "createDesignInfoJson", FirebaseAnalytics.Param.CONTENT, "Lorg/json/JSONObject;", "parseConstraintsToJson", "state", "Landroidx/constraintlayout/compose/State;", "startX", "startY", "args", "boundsToJson", "kotlin.jvm.PlatformType", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "putViewIdToBoundsAndConstraints", "viewId", "boxJson", "isHelper", "", "isRoot", "", "constraintsInfoArray", "Lorg/json/JSONArray;", "withConstraints", "withBounds", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ToolingUtilsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey;
    private static final SemanticsPropertyKey designInfoProvider$delegate;

    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    static {
        SemanticsPropertyKey<DesignInfoProvider> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);
        DesignInfoDataKey = semanticsPropertyKey;
        designInfoProvider$delegate = semanticsPropertyKey;
    }

    public static final DesignInfoProvider getDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return (DesignInfoProvider) designInfoProvider$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(designInfoProvider, "<set-?>");
        designInfoProvider$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }

    public static final String parseConstraintsToJson(ConstraintWidgetContainer root, State state, int i, int i2, String args) {
        boolean z;
        boolean z2;
        Iterator it;
        String refId;
        State state2 = state;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(args, "args");
        String valueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        Integer intOrNull = StringsKt.toIntOrNull(args);
        if (intOrNull == null) {
            z = true;
            z2 = true;
        } else {
            int intValue = intOrNull.intValue();
            boolean z3 = (intValue >> 1) == 1;
            z = (intValue >> 0) == 1;
            z2 = z3;
        }
        ArrayList<ConstraintWidget> children = root.getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        Iterator it2 = children.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z4 = constraintWidget instanceof HelperWidget;
            String widgetId = constraintWidget.stringId;
            if (z4) {
                if (constraintWidget == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
                }
                addReferencesIds((HelperWidget) constraintWidget, arrayList, root, valueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            Intrinsics.checkNotNullExpressionValue(anchors, "constraintWidget.anchors");
            for (ConstraintAnchor constraintAnchor : anchors) {
                if (constraintAnchor.isConnected()) {
                    ConstraintWidget targetWidget = constraintAnchor.getTarget().getOwner();
                    it = it2;
                    boolean z5 = targetWidget instanceof HelperWidget;
                    if (Intrinsics.areEqual(root, targetWidget)) {
                        refId = valueOf;
                    } else if (z5) {
                        Intrinsics.checkNotNullExpressionValue(targetWidget, "targetWidget");
                        refId = getHelperId(targetWidget, state2);
                    } else {
                        refId = getRefId(targetWidget);
                    }
                    JSONObject put = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    Intrinsics.checkNotNull(target);
                    jSONArray.put(put.put("targetAnchor", target.getType()).put(TypedValues.AttributesType.S_TARGET, refId).put("margin", constraintAnchor.getMargin()));
                } else {
                    it = it2;
                }
                state2 = state;
                it2 = it;
            }
            Intrinsics.checkNotNullExpressionValue(widgetId, "widgetId");
            Intrinsics.checkNotNullExpressionValue(constraintWidget, "constraintWidget");
            JSONObject boundsToJson = boundsToJson(constraintWidget, i, i2);
            Intrinsics.checkNotNullExpressionValue(boundsToJson, "constraintWidget.boundsToJson(startX, startY)");
            putViewIdToBoundsAndConstraints(jSONObject, widgetId, boundsToJson, z4, false, arrayList, jSONArray, z, z2);
            state2 = state;
        }
        JSONObject boundsToJson2 = boundsToJson(root, i, i2);
        Intrinsics.checkNotNullExpressionValue(boundsToJson2, "root.boundsToJson(startX, startY)");
        putViewIdToBoundsAndConstraints(jSONObject, valueOf, boundsToJson2, false, true, CollectionsKt.emptyList(), new JSONArray(), z, z2);
        return createDesignInfoJson(jSONObject);
    }

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i = helperWidget.mWidgetsCount;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i2];
            list.add(Intrinsics.areEqual(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
            if (i3 >= i) {
                return;
            }
            i2 = i3;
        }
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        return String.valueOf(state.getKeyId$compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        Object companionWidget = constraintWidget == null ? null : constraintWidget.getCompanionWidget();
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        String obj = (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null) ? null : layoutId.toString();
        if (obj == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return obj;
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        String jSONObject2 = new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put(FirebaseAnalytics.Param.CONTENT, jSONObject).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject()\n    .put(\"type\", \"CONSTRAINTS\")\n    .put(\"version\", CONSTRAINTS_JSON_VERSION)\n    .put(\"content\", content).toString()");
        return jSONObject2;
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i, int i2) {
        return new JSONObject().put("left", constraintWidget.getLeft() + i).put(ViewHierarchyConstants.DIMENSION_TOP_KEY, constraintWidget.getTop() + i2).put(TtmlNode.RIGHT, constraintWidget.getRight() + i).put("bottom", constraintWidget.getBottom() + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray, boolean z3, boolean z4) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z4) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj : list) {
            jSONArray2.put(obj);
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z3) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }
}
