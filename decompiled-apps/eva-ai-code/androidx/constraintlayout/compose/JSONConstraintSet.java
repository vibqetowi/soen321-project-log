package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: JSONConstraintSet.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0016\u0010#\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", FirebaseAnalytics.Param.CONTENT, "", "overrideVariables", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "_isDirty", "", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "overridedVariables", "Ljava/util/HashMap;", "", "applyLayoutVariables", "", "layoutVariables", "Landroidx/constraintlayout/compose/LayoutVariables;", "applyTo", "transition", "Landroidx/constraintlayout/core/state/Transition;", "type", "", "applyToState", "state", "Landroidx/constraintlayout/compose/State;", "emitDesignElements", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "equals", "other", "", "isDirty", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "onNewContent", "override", "name", "value", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    private boolean _isDirty;
    private final ConstraintSet extendFrom;
    private final String overrideVariables;
    private final HashMap<String, Float> overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(State state, List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONConstraintSet(String content, String str, ConstraintSet constraintSet) {
        super(content);
        Intrinsics.checkNotNullParameter(content, "content");
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str;
        this._isDirty = true;
        initialization();
    }

    public boolean equals(Object obj) {
        if (obj instanceof JSONConstraintSet) {
            return Intrinsics.areEqual(getCurrentContent(), ((JSONConstraintSet) obj).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return this._isDirty;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(androidx.constraintlayout.core.state.Transition transition, int i) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        applyLayoutVariables(new LayoutVariables());
        ConstraintSetParserKt.parseJSON(getCurrentContent(), transition, i);
    }

    public final void emitDesignElements(ArrayList<DesignElement> designElements) {
        Intrinsics.checkNotNullParameter(designElements, "designElements");
        try {
            designElements.clear();
            ConstraintSetParserKt.parseDesignElementsJSON(getCurrentContent(), designElements);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LayoutVariables layoutVariables = new LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParserKt.parseJSON(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        super.onNewContent(content);
        this._isDirty = true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public ConstraintSet override(String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.overridedVariables.put(name, Float.valueOf(f));
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyLayoutVariables(LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject parse = CLParser.parse(str);
                int size = parse.size();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        CLElement cLElement = parse.get(i);
                        if (cLElement == null) {
                            break;
                        }
                        CLKey cLKey = (CLKey) cLElement;
                        float f = cLKey.getValue().getFloat();
                        String content = cLKey.content();
                        Intrinsics.checkNotNullExpressionValue(content, "key.content()");
                        layoutVariables.putOverride(content, f);
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("exception: ", e));
            }
        }
        for (String name : this.overridedVariables.keySet()) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Float f2 = this.overridedVariables.get(name);
            Intrinsics.checkNotNull(f2);
            layoutVariables.putOverride(name, f2.floatValue());
        }
    }
}
