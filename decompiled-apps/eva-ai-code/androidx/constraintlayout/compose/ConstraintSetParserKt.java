package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: ConstraintSetParser.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0000\u001a \u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0018\u001a0\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000\u001a \u0010#\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u001a(\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00032\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)H\u0000\u001a \u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a \u0010.\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0000\u001a \u0010/\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a(\u00100\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0005H\u0002\u001a\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000\u001a \u00104\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\"H\u0000\u001a \u00105\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0013H\u0000\u001a \u00105\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\f\u001a\u00020\u0011H\u0000\u001a\u0018\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0000\u001a\u0018\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0000\u001a\u0018\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0000\u001a\u0018\u0010>\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0003H\u0000\u001a\u0018\u0010?\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0000\u001a\u0018\u0010@\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000\u001a \u0010A\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0000\u001a(\u0010B\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"PARSER_DEBUG", "", "lookForType", "", "element", "Landroidx/constraintlayout/core/parser/CLObject;", "override", "", "baseJson", "name", "overrideValue", "parseBarrier", "state", "Landroidx/constraintlayout/compose/State;", "elementName", "parseChain", "orientation", "", "margins", "Landroidx/constraintlayout/compose/LayoutVariables;", "helper", "Landroidx/constraintlayout/core/parser/CLArray;", "parseColorString", "value", "(Ljava/lang/String;)Ljava/lang/Integer;", "parseConstraint", "layoutVariables", "reference", "Landroidx/constraintlayout/core/state/ConstraintReference;", "constraintName", "parseConstraintSets", "scene", "Landroidx/constraintlayout/compose/MotionScene;", "json", "", "parseCustomProperties", "parseDesignElementsJSON", FirebaseAnalytics.Param.CONTENT, "list", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "parseDimension", "Landroidx/constraintlayout/core/state/Dimension;", "parseDimensionMode", "dimensionString", "parseGenerate", "parseGuideline", "parseGuidelineParams", "guidelineId", NativeProtocol.WEB_DIALOG_PARAMS, "parseHeader", "parseHelpers", "parseJSON", "transition", "Landroidx/constraintlayout/core/state/Transition;", "parseKeyAttribute", "keyAttribute", "parseKeyCycle", "keyCycleData", "parseKeyPosition", "keyPosition", "parseMotionSceneJSON", "parseTransition", "parseTransitions", "parseVariables", "parseWidget", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintSetParserKt {
    public static final boolean PARSER_DEBUG = false;

    public static final void parseTransition(CLObject json, androidx.constraintlayout.core.state.Transition transition) {
        boolean z;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(transition, "transition");
        String stringOrNull = json.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z2 = true;
        if (stringOrNull != null) {
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        typedBundle.add(509, 1);
                        break;
                    }
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        typedBundle.add(509, 2);
                        break;
                    }
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        typedBundle.add(509, 3);
                        break;
                    }
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        typedBundle.add(509, 0);
                        break;
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        String stringOrNull2 = json.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z = true;
        }
        float floatOrNaN = json.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (Float.isNaN(floatOrNaN)) {
            z2 = z;
        } else {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        if (z2) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = json.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            Iterator<Integer> it = RangesKt.until(0, arrayOrNull.size()).iterator();
            while (it.hasNext()) {
                CLElement cLElement = arrayOrNull.get(((IntIterator) it).nextInt());
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull2 != null) {
            Iterator<Integer> it2 = RangesKt.until(0, arrayOrNull2.size()).iterator();
            while (it2.hasNext()) {
                CLElement cLElement2 = arrayOrNull2.get(((IntIterator) it2).nextInt());
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            Iterator<Integer> it3 = RangesKt.until(0, arrayOrNull3.size()).iterator();
            while (it3.hasNext()) {
                CLElement cLElement3 = arrayOrNull3.get(((IntIterator) it3).nextInt());
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    public static final void parseKeyPosition(CLObject keyPosition, androidx.constraintlayout.core.state.Transition transition) {
        int i;
        Intrinsics.checkNotNullParameter(keyPosition, "keyPosition");
        Intrinsics.checkNotNullParameter(transition, "transition");
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = keyPosition.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = keyPosition.getArray("frames");
        CLArray arrayOrNull = keyPosition.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = keyPosition.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = keyPosition.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = keyPosition.getArrayOrNull("percentHeight");
        String stringOrNull = keyPosition.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = keyPosition.getStringOrNull("transitionEasing");
        String stringOrNull3 = keyPosition.getStringOrNull("curveFit");
        String stringOrNull4 = keyPosition.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                Iterator<Integer> it = RangesKt.until(0, array.size()).iterator();
                while (it.hasNext()) {
                    String string = array.getString(((IntIterator) it).nextInt());
                    typedBundle.clear();
                    int hashCode = stringOrNull4.hashCode();
                    CLArray cLArray = array;
                    Iterator<Integer> it2 = it;
                    if (hashCode != -1740452335) {
                        if (hashCode == -960240988) {
                            stringOrNull4.equals("deltaRelative");
                        } else if (hashCode == 1700994454 && stringOrNull4.equals("parentRelative")) {
                            i = 2;
                        }
                        i = 0;
                    } else {
                        if (stringOrNull4.equals("pathRelative")) {
                            i = 1;
                        }
                        i = 0;
                    }
                    typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, i);
                    if (stringOrNull3 != null) {
                        if (Intrinsics.areEqual(stringOrNull3, "spline")) {
                            typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                        } else if (Intrinsics.areEqual(stringOrNull3, "linear")) {
                            typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                        }
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        switch (stringOrNull.hashCode()) {
                            case -1857024520:
                                if (stringOrNull.equals("startVertical")) {
                                    typedBundle.add(509, 1);
                                    break;
                                }
                                break;
                            case -1007052250:
                                if (stringOrNull.equals("startHorizontal")) {
                                    typedBundle.add(509, 2);
                                    break;
                                }
                                break;
                            case 3145837:
                                if (stringOrNull.equals("flip")) {
                                    typedBundle.add(509, 3);
                                    break;
                                }
                                break;
                            case 3387192:
                                if (stringOrNull.equals("none")) {
                                    typedBundle.add(509, 0);
                                    break;
                                }
                                break;
                        }
                    }
                    boolean z = false;
                    Iterator<Integer> it3 = RangesKt.until(0, array2.size()).iterator();
                    while (it3.hasNext()) {
                        int nextInt = ((IntIterator) it3).nextInt();
                        String str = stringOrNull4;
                        typedBundle.add(100, array2.getInt(nextInt));
                        if (arrayOrNull != null) {
                            typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull.getFloat(nextInt));
                        }
                        if (arrayOrNull2 != null) {
                            typedBundle.add(507, arrayOrNull2.getFloat(nextInt));
                        }
                        if (arrayOrNull3 != null) {
                            typedBundle.add(503, arrayOrNull3.getFloat(nextInt));
                        }
                        if (arrayOrNull4 != null) {
                            typedBundle.add(504, arrayOrNull4.getFloat(nextInt));
                        }
                        transition.addKeyPosition(string, typedBundle);
                        stringOrNull4 = str;
                        z = false;
                    }
                    array = cLArray;
                    it = it2;
                }
            }
        }
    }

    public static final void parseKeyAttribute(CLObject keyAttribute, androidx.constraintlayout.core.state.Transition transition) {
        CLArray arrayOrNull;
        Intrinsics.checkNotNullParameter(keyAttribute, "keyAttribute");
        Intrinsics.checkNotNullParameter(transition, "transition");
        CLArray arrayOrNull2 = keyAttribute.getArrayOrNull(TypedValues.AttributesType.S_TARGET);
        if (arrayOrNull2 == null || (arrayOrNull = keyAttribute.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = keyAttribute.getStringOrNull("transitionEasing");
        ArrayList arrayListOf = CollectionsKt.arrayListOf("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha");
        ArrayList arrayListOf2 = CollectionsKt.arrayListOf(311, 312, 304, 305, 306, 308, 309, 310, 303);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.until(0, arrayOrNull.size()).iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(new TypedBundle());
        }
        int size = arrayListOf.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = arrayListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "attrNames[k]");
                String str = (String) obj;
                Object obj2 = arrayListOf2.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "attrIds[k]");
                int intValue = ((Number) obj2).intValue();
                CLArray arrayOrNull3 = keyAttribute.getArrayOrNull(str);
                if (arrayOrNull3 != null && arrayOrNull3.size() != arrayList.size()) {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", keyAttribute);
                }
                if (arrayOrNull3 == null) {
                    float floatOrNaN = keyAttribute.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        Iterator<Integer> it2 = RangesKt.until(0, arrayList.size()).iterator();
                        while (it2.hasNext()) {
                            ((TypedBundle) arrayList.get(((IntIterator) it2).nextInt())).add(intValue, floatOrNaN);
                        }
                    }
                } else {
                    Iterator<Integer> it3 = RangesKt.until(0, arrayList.size()).iterator();
                    while (it3.hasNext()) {
                        int nextInt = ((IntIterator) it3).nextInt();
                        ((TypedBundle) arrayList.get(nextInt)).add(intValue, arrayOrNull3.getFloat(nextInt));
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        String stringOrNull2 = keyAttribute.getStringOrNull("curveFit");
        Iterator<Integer> it4 = RangesKt.until(0, arrayOrNull2.size()).iterator();
        while (it4.hasNext()) {
            int nextInt2 = ((IntIterator) it4).nextInt();
            Iterator<Integer> it5 = RangesKt.until(0, arrayList.size()).iterator();
            while (it5.hasNext()) {
                int nextInt3 = ((IntIterator) it5).nextInt();
                String string = arrayOrNull2.getString(nextInt2);
                Object obj3 = arrayList.get(nextInt3);
                Intrinsics.checkNotNullExpressionValue(obj3, "bundles[j]");
                TypedBundle typedBundle = (TypedBundle) obj3;
                if (stringOrNull2 != null) {
                    if (Intrinsics.areEqual(stringOrNull2, "spline")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                    } else if (Intrinsics.areEqual(stringOrNull2, "linear")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                        typedBundle.addIfNotNull(501, stringOrNull);
                        typedBundle.add(100, arrayOrNull.getInt(nextInt3));
                        transition.addKeyAttribute(string, typedBundle);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(nextInt3));
                transition.addKeyAttribute(string, typedBundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0236 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void parseKeyCycle(CLObject keyCycleData, androidx.constraintlayout.core.state.Transition transition) {
        CLArray cLArray;
        Intrinsics.checkNotNullParameter(keyCycleData, "keyCycleData");
        Intrinsics.checkNotNullParameter(transition, "transition");
        CLArray array = keyCycleData.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = keyCycleData.getArray("frames");
        String stringOrNull = keyCycleData.getStringOrNull("transitionEasing");
        ArrayList arrayListOf = CollectionsKt.arrayListOf("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", TypedValues.CycleType.S_WAVE_PERIOD, TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.CycleType.S_WAVE_PHASE);
        ArrayList arrayListOf2 = CollectionsKt.arrayListOf(311, 312, 304, 305, 306, 308, 309, 310, 403, 423, 424, Integer.valueOf((int) TypedValues.CycleType.TYPE_WAVE_PHASE));
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.until(0, array2.size()).iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(new TypedBundle());
        }
        int size = arrayListOf.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = arrayListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "attrNames[k]");
                String str = (String) obj;
                Object obj2 = arrayListOf2.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "attrIds[k]");
                int intValue = ((Number) obj2).intValue();
                CLArray arrayOrNull = keyCycleData.getArrayOrNull(str);
                if (arrayOrNull != null && arrayOrNull.size() != arrayList.size()) {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", keyCycleData);
                }
                if (arrayOrNull == null) {
                    float floatOrNaN = keyCycleData.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        Iterator<Integer> it2 = RangesKt.until(0, arrayList.size()).iterator();
                        while (it2.hasNext()) {
                            ((TypedBundle) arrayList.get(((IntIterator) it2).nextInt())).add(intValue, floatOrNaN);
                        }
                    }
                } else {
                    Iterator<Integer> it3 = RangesKt.until(0, arrayList.size()).iterator();
                    while (it3.hasNext()) {
                        int nextInt = ((IntIterator) it3).nextInt();
                        ((TypedBundle) arrayList.get(nextInt)).add(intValue, arrayOrNull.getFloat(nextInt));
                    }
                }
                if (i == size) {
                    break;
                }
                i = i2;
            }
        }
        String stringOrNull2 = keyCycleData.getStringOrNull("curveFit");
        String stringOrNull3 = keyCycleData.getStringOrNull("easing");
        String stringOrNull4 = keyCycleData.getStringOrNull("waveShape");
        String stringOrNull5 = keyCycleData.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
        int i3 = 0;
        Iterator<Integer> it4 = RangesKt.until(0, array.size()).iterator();
        while (it4.hasNext()) {
            int nextInt2 = ((IntIterator) it4).nextInt();
            Iterator<Integer> it5 = RangesKt.until(i3, arrayList.size()).iterator();
            while (it5.hasNext()) {
                int nextInt3 = ((IntIterator) it5).nextInt();
                String string = array.getString(nextInt2);
                Object obj3 = arrayList.get(nextInt3);
                Intrinsics.checkNotNullExpressionValue(obj3, "bundles.get(j)");
                TypedBundle typedBundle = (TypedBundle) obj3;
                if (stringOrNull2 != null) {
                    cLArray = array;
                    if (Intrinsics.areEqual(stringOrNull2, "spline")) {
                        typedBundle.add(401, 0);
                    } else if (Intrinsics.areEqual(stringOrNull2, "linear")) {
                        typedBundle.add(401, 1);
                        typedBundle.addIfNotNull(501, stringOrNull);
                        if (stringOrNull3 != null) {
                            typedBundle.add(420, stringOrNull3);
                        }
                        if (stringOrNull4 != null) {
                            typedBundle.add(421, stringOrNull4);
                        }
                        if (stringOrNull5 == null) {
                            typedBundle.add(422, stringOrNull5);
                        }
                        typedBundle.add(100, array2.getInt(nextInt3));
                        transition.addKeyCycle(string, typedBundle);
                        array = cLArray;
                    }
                } else {
                    cLArray = array;
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                if (stringOrNull3 != null) {
                }
                if (stringOrNull4 != null) {
                }
                if (stringOrNull5 == null) {
                }
                typedBundle.add(100, array2.getInt(nextInt3));
                transition.addKeyCycle(string, typedBundle);
                array = cLArray;
            }
            i3 = 0;
        }
    }

    public static final void parseJSON(String content, androidx.constraintlayout.core.state.Transition transition, int i) {
        CLObject objectOrNull;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(transition, "transition");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String str = names.get(((IntIterator) it).nextInt());
                CLElement cLElement = parse.get(str);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    ArrayList<String> names2 = objectOrNull.names();
                    if (names2 == null) {
                        return;
                    }
                    Iterator<Integer> it2 = RangesKt.until(0, names2.size()).iterator();
                    while (it2.hasNext()) {
                        String str2 = names2.get(((IntIterator) it2).nextInt());
                        CLElement cLElement2 = objectOrNull.get(str2);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i, str, str2, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            String content2 = cLElement2.content();
                            Intrinsics.checkNotNullExpressionValue(content2, "value.content()");
                            Integer parseColorString = parseColorString(content2);
                            if (parseColorString != null) {
                                transition.addCustomColor(i, str, str2, parseColorString.intValue());
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    public static final void parseMotionSceneJSON(MotionScene scene, String content) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String str = names.get(((IntIterator) it).nextInt());
                CLElement element = parse.get(str);
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2137403731) {
                        if (hashCode != -241441378) {
                            if (hashCode == 1101852654 && str.equals("ConstraintSets")) {
                                Intrinsics.checkNotNullExpressionValue(element, "element");
                                parseConstraintSets(scene, element);
                            }
                        } else if (str.equals(TypedValues.TransitionType.NAME)) {
                            Intrinsics.checkNotNullExpressionValue(element, "element");
                            parseTransitions(scene, element);
                        }
                    } else if (str.equals("Header")) {
                        Intrinsics.checkNotNullExpressionValue(element, "element");
                        parseHeader(scene, element);
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void parseConstraintSets(MotionScene scene, Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        boolean z;
        String constraintSet;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(json, "json");
        if ((json instanceof CLObject) && (names = (cLObject = (CLObject) json).names()) != null) {
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String csName = names.get(((IntIterator) it).nextInt());
                CLObject object = cLObject.getObject(csName);
                String stringOrNull = object.getStringOrNull("Extends");
                if (stringOrNull != null) {
                    z = true;
                    if ((stringOrNull.length() > 0) && (constraintSet = scene.getConstraintSet(stringOrNull)) != null) {
                        CLObject baseJson = CLParser.parse(constraintSet);
                        ArrayList<String> names2 = object.names();
                        if (names2 != null) {
                            Iterator<Integer> it2 = RangesKt.until(0, names2.size()).iterator();
                            while (it2.hasNext()) {
                                String widgetOverrideName = names2.get(((IntIterator) it2).nextInt());
                                CLElement cLElement = object.get(widgetOverrideName);
                                if (cLElement instanceof CLObject) {
                                    Intrinsics.checkNotNullExpressionValue(baseJson, "baseJson");
                                    Intrinsics.checkNotNullExpressionValue(widgetOverrideName, "widgetOverrideName");
                                    override(baseJson, widgetOverrideName, (CLObject) cLElement);
                                }
                            }
                            Intrinsics.checkNotNullExpressionValue(csName, "csName");
                            String json2 = baseJson.toJSON();
                            Intrinsics.checkNotNullExpressionValue(json2, "baseJson.toJSON()");
                            scene.setConstraintSetContent(csName, json2);
                            if (z) {
                                Intrinsics.checkNotNullExpressionValue(csName, "csName");
                                String json3 = object.toJSON();
                                Intrinsics.checkNotNullExpressionValue(json3, "constraintSet.toJSON()");
                                scene.setConstraintSetContent(csName, json3);
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
    }

    public static final void override(CLObject baseJson, String name, CLObject overrideValue) {
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(overrideValue, "overrideValue");
        if (!baseJson.has(name)) {
            baseJson.put(name, overrideValue);
            return;
        }
        CLObject object = baseJson.getObject(name);
        Iterator<String> it = overrideValue.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("clear")) {
                CLArray array = overrideValue.getArray("clear");
                Iterator<Integer> it2 = RangesKt.until(0, array.size()).iterator();
                while (it2.hasNext()) {
                    String stringOrNull = array.getStringOrNull(((IntIterator) it2).nextInt());
                    if (stringOrNull != null) {
                        int hashCode = stringOrNull.hashCode();
                        if (hashCode != -1727069561) {
                            if (hashCode == -1606703562) {
                                if (stringOrNull.equals("constraints")) {
                                    object.remove(TtmlNode.START);
                                    object.remove(TtmlNode.END);
                                    object.remove(ViewHierarchyConstants.DIMENSION_TOP_KEY);
                                    object.remove("bottom");
                                    object.remove("baseline");
                                    object.remove(TtmlNode.CENTER);
                                    object.remove("centerHorizontally");
                                    object.remove("centerVertically");
                                } else {
                                    object.remove(stringOrNull);
                                }
                            } else {
                                if (hashCode == 414334925 && stringOrNull.equals("dimensions")) {
                                    object.remove(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                    object.remove(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                                }
                                object.remove(stringOrNull);
                            }
                        } else if (stringOrNull.equals("transforms")) {
                            object.remove("visibility");
                            object.remove("alpha");
                            object.remove("pivotX");
                            object.remove("pivotY");
                            object.remove("rotationX");
                            object.remove("rotationY");
                            object.remove("rotationZ");
                            object.remove("scaleX");
                            object.remove("scaleY");
                            object.remove("translationX");
                            object.remove("translationY");
                        } else {
                            object.remove(stringOrNull);
                        }
                    }
                }
            } else {
                object.put(next, overrideValue.get(next));
            }
        }
    }

    public static final void parseTransitions(MotionScene scene, Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(json, "json");
        if ((json instanceof CLObject) && (names = (cLObject = (CLObject) json).names()) != null) {
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String elementName = names.get(((IntIterator) it).nextInt());
                CLObject object = cLObject.getObject(elementName);
                Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                String json2 = object.toJSON();
                Intrinsics.checkNotNullExpressionValue(json2, "element.toJSON()");
                scene.setTransitionContent(elementName, json2);
            }
        }
    }

    public static final void parseHeader(MotionScene scene, Object json) {
        String stringOrNull;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(json, "json");
        if ((json instanceof CLObject) && (stringOrNull = ((CLObject) json).getStringOrNull("export")) != null) {
            scene.setDebugName(stringOrNull);
        }
    }

    public static final void parseJSON(String content, State state, LayoutVariables layoutVariables) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutVariables, "layoutVariables");
        try {
            CLObject parse = CLParser.parse(content);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String elementName = names.get(((IntIterator) it).nextInt());
                CLElement element = parse.get(elementName);
                if (elementName != null) {
                    int hashCode = elementName.hashCode();
                    if (hashCode != -1824489883) {
                        if (hashCode != 1875016085) {
                            if (hashCode == 1921490263 && elementName.equals("Variables")) {
                                Intrinsics.checkNotNullExpressionValue(element, "element");
                                parseVariables(state, layoutVariables, element);
                            }
                        } else if (elementName.equals("Generate")) {
                            Intrinsics.checkNotNullExpressionValue(element, "element");
                            parseGenerate(state, layoutVariables, element);
                        }
                    } else if (elementName.equals("Helpers")) {
                        Intrinsics.checkNotNullExpressionValue(element, "element");
                        parseHelpers(state, layoutVariables, element);
                    }
                }
                if (element instanceof CLObject) {
                    String lookForType = lookForType((CLObject) element);
                    if (lookForType != null) {
                        int hashCode2 = lookForType.hashCode();
                        if (hashCode2 != -1785507558) {
                            if (hashCode2 != -333143113) {
                                if (hashCode2 == 965681512 && lookForType.equals("hGuideline")) {
                                    Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                                    parseGuidelineParams(0, state, elementName, (CLObject) element);
                                }
                            } else if (lookForType.equals("barrier")) {
                                Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                                parseBarrier(state, elementName, (CLObject) element);
                            }
                        } else if (lookForType.equals("vGuideline")) {
                            Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                            parseGuidelineParams(1, state, elementName, (CLObject) element);
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                        parseWidget(state, layoutVariables, elementName, (CLObject) element);
                    }
                } else if (element instanceof CLNumber) {
                    Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                    layoutVariables.put(elementName, ((CLNumber) element).getInt());
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    public static final void parseVariables(State state, LayoutVariables layoutVariables, Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutVariables, "layoutVariables");
        Intrinsics.checkNotNullParameter(json, "json");
        if ((json instanceof CLObject) && (names = (cLObject = (CLObject) json).names()) != null) {
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String elementName = names.get(((IntIterator) it).nextInt());
                CLElement cLElement = cLObject.get(elementName);
                if (cLElement instanceof CLNumber) {
                    Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                    layoutVariables.put(elementName, ((CLNumber) cLElement).getInt());
                } else if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    if (cLObject2.has("from") && cLObject2.has("to")) {
                        CLElement cLElement2 = cLObject2.get("from");
                        Intrinsics.checkNotNullExpressionValue(cLElement2, "element[\"from\"]");
                        float f = layoutVariables.get(cLElement2);
                        CLElement cLElement3 = cLObject2.get("to");
                        Intrinsics.checkNotNullExpressionValue(cLElement3, "element[\"to\"]");
                        float f2 = layoutVariables.get(cLElement3);
                        String stringOrNull = cLObject2.getStringOrNull("prefix");
                        String str = stringOrNull == null ? "" : stringOrNull;
                        String stringOrNull2 = cLObject2.getStringOrNull("postfix");
                        if (stringOrNull2 == null) {
                            stringOrNull2 = "";
                        }
                        Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                        layoutVariables.put(elementName, f, f2, 1.0f, str, stringOrNull2);
                    } else if (cLObject2.has("from") && cLObject2.has("step")) {
                        CLElement cLElement4 = cLObject2.get("from");
                        Intrinsics.checkNotNullExpressionValue(cLElement4, "element[\"from\"]");
                        float f3 = layoutVariables.get(cLElement4);
                        CLElement cLElement5 = cLObject2.get("step");
                        Intrinsics.checkNotNullExpressionValue(cLElement5, "element[\"step\"]");
                        float f4 = layoutVariables.get(cLElement5);
                        Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                        layoutVariables.put(elementName, f3, f4);
                    } else if (cLObject2.has("ids")) {
                        CLArray array = cLObject2.getArray("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        int size = array.size();
                        if (size > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                arrayList.add(array.getString(i));
                                if (i2 >= size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                        layoutVariables.put(elementName, arrayList);
                    } else if (cLObject2.has(ViewHierarchyConstants.TAG_KEY)) {
                        ArrayList<String> arrayIds = state.getIdsForTag(cLObject2.getString(ViewHierarchyConstants.TAG_KEY));
                        Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                        Intrinsics.checkNotNullExpressionValue(arrayIds, "arrayIds");
                        layoutVariables.put(elementName, arrayIds);
                    }
                }
            }
        }
    }

    public static final void parseDesignElementsJSON(String content, ArrayList<DesignElement> list) {
        CLObject cLObject;
        ArrayList<String> arrayList;
        Iterator<Integer> it;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(list, "list");
        CLObject parse = CLParser.parse(content);
        ArrayList<String> names = parse.names();
        if (names == null) {
            return;
        }
        int i = 0;
        Iterator<Integer> it2 = RangesKt.until(0, names.size()).iterator();
        while (it2.hasNext()) {
            String str = names.get(((IntIterator) it2).nextInt());
            CLElement cLElement = parse.get(str);
            if (Intrinsics.areEqual(str, "Design")) {
                if (cLElement != null) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    ArrayList<String> names2 = cLObject2.names();
                    if (names2 == null) {
                        return;
                    }
                    Iterator<Integer> it3 = RangesKt.until(i, names2.size()).iterator();
                    while (it3.hasNext()) {
                        String elementName = names2.get(((IntIterator) it3).nextInt());
                        CLElement cLElement2 = cLObject2.get(elementName);
                        if (cLElement2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                        }
                        CLObject cLObject3 = (CLObject) cLElement2;
                        System.out.printf("element found <" + ((Object) elementName) + Typography.greater, new Object[i]);
                        String stringOrNull = cLObject3.getStringOrNull("type");
                        if (stringOrNull != null) {
                            HashMap hashMap = new HashMap();
                            int size = cLObject3.size() - 1;
                            if (size >= 0) {
                                int i2 = i;
                                while (true) {
                                    int i3 = i2 + 1;
                                    CLElement cLElement3 = cLObject3.get(i2);
                                    if (cLElement3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                    }
                                    CLKey cLKey = (CLKey) cLElement3;
                                    String paramName = cLKey.content();
                                    CLElement value = cLKey.getValue();
                                    cLObject = parse;
                                    String content2 = value == null ? null : value.content();
                                    arrayList = names;
                                    if (content2 != null) {
                                        it = it2;
                                        Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                                        hashMap.put(paramName, content2);
                                    } else {
                                        it = it2;
                                    }
                                    if (i2 == size) {
                                        break;
                                    }
                                    i2 = i3;
                                    names = arrayList;
                                    parse = cLObject;
                                    it2 = it;
                                }
                            } else {
                                cLObject = parse;
                                arrayList = names;
                                it = it2;
                            }
                            Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                            list.add(new DesignElement(elementName, stringOrNull, hashMap));
                        } else {
                            cLObject = parse;
                            arrayList = names;
                            it = it2;
                        }
                        names = arrayList;
                        parse = cLObject;
                        it2 = it;
                        i = 0;
                    }
                    continue;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                }
            }
            names = names;
            parse = parse;
            it2 = it2;
            i = 0;
        }
    }

    public static final void parseHelpers(State state, LayoutVariables layoutVariables, Object element) {
        String string;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutVariables, "layoutVariables");
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof CLArray) {
            CLArray cLArray = (CLArray) element;
            Iterator<Integer> it = RangesKt.until(0, cLArray.size()).iterator();
            while (it.hasNext()) {
                CLElement cLElement = cLArray.get(((IntIterator) it).nextInt());
                if (cLElement instanceof CLArray) {
                    CLArray cLArray2 = (CLArray) cLElement;
                    if (cLArray2.size() > 1 && (string = cLArray2.getString(0)) != null) {
                        switch (string.hashCode()) {
                            case -1785507558:
                                if (string.equals("vGuideline")) {
                                    parseGuideline(1, state, cLArray2);
                                    break;
                                } else {
                                    continue;
                                }
                            case -1252464839:
                                if (string.equals("hChain")) {
                                    parseChain(0, state, layoutVariables, cLArray2);
                                    break;
                                } else {
                                    continue;
                                }
                            case -851656725:
                                if (string.equals("vChain")) {
                                    parseChain(1, state, layoutVariables, cLArray2);
                                    break;
                                } else {
                                    continue;
                                }
                            case 965681512:
                                if (string.equals("hGuideline")) {
                                    parseGuideline(0, state, cLArray2);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
            }
        }
    }

    public static final void parseGenerate(State state, LayoutVariables layoutVariables, Object json) {
        CLObject cLObject;
        ArrayList<String> names;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutVariables, "layoutVariables");
        Intrinsics.checkNotNullParameter(json, "json");
        if ((json instanceof CLObject) && (names = (cLObject = (CLObject) json).names()) != null) {
            Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
            while (it.hasNext()) {
                String elementName = names.get(((IntIterator) it).nextInt());
                CLElement cLElement = cLObject.get(elementName);
                Intrinsics.checkNotNullExpressionValue(elementName, "elementName");
                ArrayList<String> list = layoutVariables.getList(elementName);
                if (list != null && (cLElement instanceof CLObject)) {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String id = it2.next();
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        parseWidget(state, layoutVariables, id, (CLObject) cLElement);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void parseChain(int i, State state, LayoutVariables margins, CLArray helper) {
        CLObject cLObject;
        ArrayList<String> names;
        String content;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(helper, "helper");
        ChainReference horizontalChain = i == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = helper.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray = (CLArray) cLElement;
            if (cLArray.size() < 1) {
                return;
            }
            Iterator<Integer> it = RangesKt.until(0, cLArray.size()).iterator();
            while (it.hasNext()) {
                horizontalChain.add(cLArray.getString(((IntIterator) it).nextInt()));
            }
            if (helper.size() > 2) {
                CLElement cLElement2 = helper.get(2);
                if ((cLElement2 instanceof CLObject) && (names = (cLObject = (CLObject) cLElement2).names()) != null) {
                    Iterator<Integer> it2 = RangesKt.until(0, names.size()).iterator();
                    while (it2.hasNext()) {
                        String constraintName = names.get(((IntIterator) it2).nextInt());
                        if (Intrinsics.areEqual(constraintName, "style")) {
                            CLElement cLElement3 = cLObject.get(constraintName);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray2 = (CLArray) cLElement3;
                                if (cLArray2.size() > 1) {
                                    content = cLArray2.getString(0);
                                    Intrinsics.checkNotNullExpressionValue(content, "styleObject.getString(0)");
                                    horizontalChain.bias(cLArray2.getFloat(1));
                                    if (!Intrinsics.areEqual(content, "packed")) {
                                        horizontalChain.style(State.Chain.PACKED);
                                    } else if (Intrinsics.areEqual(content, "spread_inside")) {
                                        horizontalChain.style(State.Chain.SPREAD_INSIDE);
                                    } else {
                                        horizontalChain.style(State.Chain.SPREAD);
                                    }
                                }
                            }
                            content = cLElement3.content();
                            Intrinsics.checkNotNullExpressionValue(content, "styleObject.content()");
                            if (!Intrinsics.areEqual(content, "packed")) {
                            }
                        } else if (horizontalChain == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference");
                        } else {
                            Intrinsics.checkNotNullExpressionValue(constraintName, "constraintName");
                            parseConstraint(state, margins, cLObject, horizontalChain, constraintName);
                        }
                    }
                }
            }
        }
    }

    public static final void parseGuideline(int i, State state, CLArray helper) {
        CLObject cLObject;
        String stringOrNull;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(helper, "helper");
        CLElement cLElement = helper.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i, state, stringOrNull, cLObject);
        }
    }

    private static final void parseGuidelineParams(int i, State state, String str, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        ConstraintReference constraints = state.constraints(str);
        if (i == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        Facade facade = constraints.getFacade();
        if (facade == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
        }
        GuidelineReference guidelineReference = (GuidelineReference) facade;
        Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
        while (it.hasNext()) {
            String str2 = names.get(((IntIterator) it).nextInt());
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -678927291) {
                    if (hashCode != 100571) {
                        if (hashCode == 109757538 && str2.equals(TtmlNode.START)) {
                            guidelineReference.start(Integer.valueOf(state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(cLObject.getFloat(str2))))));
                        }
                    } else if (str2.equals(TtmlNode.END)) {
                        guidelineReference.end(Integer.valueOf(state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(cLObject.getFloat(str2))))));
                    }
                } else if (str2.equals("percent")) {
                    guidelineReference.percent(cLObject.getFloat(str2));
                }
            }
        }
    }

    public static final void parseBarrier(State state, String elementName, CLObject element) {
        CLArray arrayOrNull;
        int size;
        String string;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(element, "element");
        BarrierReference barrier = state.barrier(elementName, State.Direction.END);
        ArrayList<String> names = element.names();
        if (names == null) {
            return;
        }
        Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
        while (it.hasNext()) {
            String str = names.get(((IntIterator) it).nextInt());
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1081309778) {
                    if (hashCode == -962590849) {
                        if (str.equals("direction") && (string = element.getString(str)) != null) {
                            switch (string.hashCode()) {
                                case -1383228885:
                                    if (string.equals("bottom")) {
                                        barrier.setBarrierDirection(State.Direction.BOTTOM);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 100571:
                                    if (string.equals(TtmlNode.END)) {
                                        barrier.setBarrierDirection(State.Direction.END);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 115029:
                                    if (string.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                                        barrier.setBarrierDirection(State.Direction.TOP);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 3317767:
                                    if (string.equals("left")) {
                                        barrier.setBarrierDirection(State.Direction.LEFT);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 108511772:
                                    if (string.equals(TtmlNode.RIGHT)) {
                                        barrier.setBarrierDirection(State.Direction.RIGHT);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 109757538:
                                    if (string.equals(TtmlNode.START)) {
                                        barrier.setBarrierDirection(State.Direction.START);
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    } else if (hashCode == -567445985 && str.equals("contains") && (arrayOrNull = element.getArrayOrNull(str)) != null && (size = arrayOrNull.size()) > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            barrier.add(state.constraints(arrayOrNull.get(i).content()));
                            if (i2 >= size) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } else if (str.equals("margin")) {
                    float floatOrNaN = element.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        barrier.margin((int) floatOrNaN);
                    }
                }
            }
        }
    }

    public static final void parseWidget(State state, LayoutVariables layoutVariables, String elementName, CLObject element) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutVariables, "layoutVariables");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(element, "element");
        ConstraintReference reference = state.constraints(elementName);
        if (reference.getWidth() == null) {
            reference.setWidth(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        if (reference.getHeight() == null) {
            reference.setHeight(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        ArrayList<String> names = element.names();
        if (names == null) {
            return;
        }
        Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
        while (it.hasNext()) {
            String constraintName = names.get(((IntIterator) it).nextInt());
            if (constraintName != null) {
                switch (constraintName.hashCode()) {
                    case -1448775240:
                        if (!constraintName.equals("centerVertically")) {
                            break;
                        } else {
                            String string = element.getString(constraintName);
                            ConstraintReference constraints = string.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string);
                            reference.topToTop(constraints);
                            reference.bottomToBottom(constraints);
                            continue;
                        }
                    case -1364013995:
                        if (!constraintName.equals(TtmlNode.CENTER)) {
                            break;
                        } else {
                            String string2 = element.getString(constraintName);
                            ConstraintReference constraints2 = string2.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string2);
                            reference.startToStart(constraints2);
                            reference.endToEnd(constraints2);
                            reference.topToTop(constraints2);
                            reference.bottomToBottom(constraints2);
                            continue;
                        }
                    case -1349088399:
                        if (!constraintName.equals("custom")) {
                            break;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(reference, "reference");
                            parseCustomProperties(element, reference, constraintName);
                            continue;
                        }
                    case -1249320806:
                        if (!constraintName.equals("rotationX")) {
                            break;
                        } else {
                            CLElement cLElement = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement, "element[constraintName]");
                            reference.rotationX(layoutVariables.get(cLElement));
                            continue;
                        }
                    case -1249320805:
                        if (!constraintName.equals("rotationY")) {
                            break;
                        } else {
                            CLElement cLElement2 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement2, "element[constraintName]");
                            reference.rotationY(layoutVariables.get(cLElement2));
                            continue;
                        }
                    case -1249320804:
                        if (!constraintName.equals("rotationZ")) {
                            break;
                        } else {
                            CLElement cLElement3 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement3, "element[constraintName]");
                            reference.rotationZ(layoutVariables.get(cLElement3));
                            continue;
                        }
                    case -1225497657:
                        if (!constraintName.equals("translationX")) {
                            break;
                        } else {
                            CLElement cLElement4 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement4, "element[constraintName]");
                            reference.translationX(layoutVariables.get(cLElement4));
                            continue;
                        }
                    case -1225497656:
                        if (!constraintName.equals("translationY")) {
                            break;
                        } else {
                            CLElement cLElement5 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement5, "element[constraintName]");
                            reference.translationY(layoutVariables.get(cLElement5));
                            continue;
                        }
                    case -1225497655:
                        if (!constraintName.equals("translationZ")) {
                            break;
                        } else {
                            CLElement cLElement6 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement6, "element[constraintName]");
                            reference.translationZ(layoutVariables.get(cLElement6));
                            continue;
                        }
                    case -1221029593:
                        if (!constraintName.equals(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                            break;
                        } else {
                            reference.setHeight(parseDimension(element, constraintName, state));
                            continue;
                        }
                    case -987906986:
                        if (!constraintName.equals("pivotX")) {
                            break;
                        } else {
                            CLElement cLElement7 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement7, "element[constraintName]");
                            reference.pivotX(layoutVariables.get(cLElement7));
                            continue;
                        }
                    case -987906985:
                        if (!constraintName.equals("pivotY")) {
                            break;
                        } else {
                            CLElement cLElement8 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement8, "element[constraintName]");
                            reference.pivotY(layoutVariables.get(cLElement8));
                            continue;
                        }
                    case -908189618:
                        if (!constraintName.equals("scaleX")) {
                            break;
                        } else {
                            CLElement cLElement9 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement9, "element[constraintName]");
                            reference.scaleX(layoutVariables.get(cLElement9));
                            continue;
                        }
                    case -908189617:
                        if (!constraintName.equals("scaleY")) {
                            break;
                        } else {
                            CLElement cLElement10 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement10, "element[constraintName]");
                            reference.scaleY(layoutVariables.get(cLElement10));
                            continue;
                        }
                    case -61505906:
                        if (!constraintName.equals("vWeight")) {
                            break;
                        } else {
                            CLElement cLElement11 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement11, "element[constraintName]");
                            reference.setVerticalChainWeight(layoutVariables.get(cLElement11));
                            continue;
                        }
                    case 92909918:
                        if (!constraintName.equals("alpha")) {
                            break;
                        } else {
                            CLElement cLElement12 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement12, "element[constraintName]");
                            reference.alpha(layoutVariables.get(cLElement12));
                            continue;
                        }
                    case 98116417:
                        if (!constraintName.equals("hBias")) {
                            break;
                        } else {
                            CLElement cLElement13 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement13, "element[constraintName]");
                            reference.horizontalBias(layoutVariables.get(cLElement13));
                            continue;
                        }
                    case 111045711:
                        if (!constraintName.equals("vBias")) {
                            break;
                        } else {
                            CLElement cLElement14 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement14, "element[constraintName]");
                            reference.verticalBias(layoutVariables.get(cLElement14));
                            continue;
                        }
                    case 113126854:
                        if (!constraintName.equals(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
                            break;
                        } else {
                            reference.setWidth(parseDimension(element, constraintName, state));
                            continue;
                        }
                    case 398344448:
                        if (!constraintName.equals("hWeight")) {
                            break;
                        } else {
                            CLElement cLElement15 = element.get(constraintName);
                            Intrinsics.checkNotNullExpressionValue(cLElement15, "element[constraintName]");
                            reference.setHorizontalChainWeight(layoutVariables.get(cLElement15));
                            continue;
                        }
                    case 1404070310:
                        if (!constraintName.equals("centerHorizontally")) {
                            break;
                        } else {
                            String string3 = element.getString(constraintName);
                            ConstraintReference constraints3 = string3.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string3);
                            reference.startToStart(constraints3);
                            reference.endToEnd(constraints3);
                            continue;
                        }
                    case 1941332754:
                        if (!constraintName.equals("visibility")) {
                            break;
                        } else {
                            String string4 = element.getString(constraintName);
                            if (string4 != null) {
                                int hashCode = string4.hashCode();
                                if (hashCode != -1901805651) {
                                    if (hashCode != 3178655) {
                                        if (hashCode == 466743410 && string4.equals("visible")) {
                                            reference.visibility(0);
                                        }
                                    } else if (string4.equals("gone")) {
                                        reference.visibility(8);
                                    }
                                } else if (string4.equals("invisible")) {
                                    reference.visibility(4);
                                }
                            } else {
                                continue;
                            }
                        }
                        break;
                }
            }
            Intrinsics.checkNotNullExpressionValue(reference, "reference");
            Intrinsics.checkNotNullExpressionValue(constraintName, "constraintName");
            parseConstraint(state, layoutVariables, element, reference, constraintName);
        }
    }

    private static final void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) {
        ArrayList<String> names;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (names = objectOrNull.names()) == null) {
            return;
        }
        Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
        while (it.hasNext()) {
            String str2 = names.get(((IntIterator) it).nextInt());
            CLElement cLElement = objectOrNull.get(str2);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str2, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                String content = cLElement.content();
                Intrinsics.checkNotNullExpressionValue(content, "value.content()");
                Integer parseColorString = parseColorString(content);
                if (parseColorString != null) {
                    constraintReference.addCustomColor(str2, parseColorString.intValue());
                }
            }
        }
    }

    private static final void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) {
        float f;
        float f2;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                ConstraintReference constraints = stringOrNull.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(stringOrNull);
                switch (str.hashCode()) {
                    case -1720785339:
                        if (str.equals("baseline")) {
                            Object key = constraintReference.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "reference.key");
                            state.baselineNeededFor$compose_release(key);
                            Object key2 = constraints.getKey();
                            Intrinsics.checkNotNullExpressionValue(key2, "targetReference.key");
                            state.baselineNeededFor$compose_release(key2);
                            constraintReference.baselineToBaseline(constraints);
                            return;
                        }
                        return;
                    case -1383228885:
                        if (str.equals("bottom")) {
                            constraintReference.bottomToBottom(constraints);
                            return;
                        }
                        return;
                    case 100571:
                        if (str.equals(TtmlNode.END)) {
                            constraintReference.endToEnd(constraints);
                            return;
                        }
                        return;
                    case 115029:
                        if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            constraintReference.topToTop(constraints);
                            return;
                        }
                        return;
                    case 109757538:
                        if (str.equals(TtmlNode.START)) {
                            constraintReference.startToStart(constraints);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        if (arrayOrNull.size() > 2) {
            CLElement orNull = arrayOrNull.getOrNull(2);
            Intrinsics.checkNotNull(orNull);
            f = state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(layoutVariables.get(orNull))));
        } else {
            f = 0.0f;
        }
        if (arrayOrNull.size() > 3) {
            CLElement orNull2 = arrayOrNull.getOrNull(3);
            Intrinsics.checkNotNull(orNull2);
            f2 = state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(layoutVariables.get(orNull2))));
        } else {
            f2 = 0.0f;
        }
        ConstraintReference constraints2 = string.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string);
        float f3 = f2;
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline") && stringOrNull2 != null) {
                    int hashCode = stringOrNull2.hashCode();
                    if (hashCode == -1720785339) {
                        if (stringOrNull2.equals("baseline")) {
                            Object key3 = constraintReference.getKey();
                            Intrinsics.checkNotNullExpressionValue(key3, "reference.key");
                            state.baselineNeededFor$compose_release(key3);
                            Object key4 = constraints2.getKey();
                            Intrinsics.checkNotNullExpressionValue(key4, "targetReference.key");
                            state.baselineNeededFor$compose_release(key4);
                            constraintReference.baselineToBaseline(constraints2);
                            break;
                        }
                    } else if (hashCode == -1383228885) {
                        if (stringOrNull2.equals("bottom")) {
                            Object key5 = constraintReference.getKey();
                            Intrinsics.checkNotNullExpressionValue(key5, "reference.key");
                            state.baselineNeededFor$compose_release(key5);
                            Object key6 = constraints2.getKey();
                            Intrinsics.checkNotNullExpressionValue(key6, "targetReference.key");
                            state.baselineNeededFor$compose_release(key6);
                            constraintReference.baselineToBottom(constraints2);
                            break;
                        }
                    } else if (hashCode == 115029 && stringOrNull2.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        Object key7 = constraintReference.getKey();
                        Intrinsics.checkNotNullExpressionValue(key7, "reference.key");
                        state.baselineNeededFor$compose_release(key7);
                        Object key8 = constraints2.getKey();
                        Intrinsics.checkNotNullExpressionValue(key8, "targetReference.key");
                        state.baselineNeededFor$compose_release(key8);
                        constraintReference.baselineToTop(constraints2);
                        break;
                    }
                }
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    CLElement cLElement = arrayOrNull.get(1);
                    Intrinsics.checkNotNullExpressionValue(cLElement, "constraint.get(1)");
                    constraintReference.circularConstraint(constraints2, layoutVariables.get(cLElement), 0.0f);
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    if (!Intrinsics.areEqual(stringOrNull2, ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        if (Intrinsics.areEqual(stringOrNull2, "bottom")) {
                            constraintReference.bottomToBottom(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.bottomToTop(constraints2);
                        break;
                    }
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    if (!Intrinsics.areEqual(stringOrNull2, TtmlNode.START)) {
                        if (Intrinsics.areEqual(stringOrNull2, TtmlNode.END)) {
                            constraintReference.endToEnd(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.endToStart(constraints2);
                        break;
                    }
                }
                break;
            case 115029:
                if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                    if (!Intrinsics.areEqual(stringOrNull2, ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        if (Intrinsics.areEqual(stringOrNull2, "bottom")) {
                            constraintReference.topToBottom(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.topToTop(constraints2);
                        break;
                    }
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    if (!Intrinsics.areEqual(stringOrNull2, "left")) {
                        if (Intrinsics.areEqual(stringOrNull2, TtmlNode.RIGHT)) {
                            constraintReference.leftToRight(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.leftToLeft(constraints2);
                        break;
                    }
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    if (!Intrinsics.areEqual(stringOrNull2, "left")) {
                        if (Intrinsics.areEqual(stringOrNull2, TtmlNode.RIGHT)) {
                            constraintReference.rightToRight(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.rightToLeft(constraints2);
                        break;
                    }
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    if (!Intrinsics.areEqual(stringOrNull2, TtmlNode.START)) {
                        if (Intrinsics.areEqual(stringOrNull2, TtmlNode.END)) {
                            constraintReference.startToEnd(constraints2);
                            break;
                        }
                    } else {
                        constraintReference.startToStart(constraints2);
                        break;
                    }
                }
                break;
        }
        constraintReference.margin(Float.valueOf(f)).marginGone((int) f3);
    }

    private static final androidx.constraintlayout.core.state.Dimension parseDimensionMode(String str) {
        androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        Intrinsics.checkNotNullExpressionValue(Fixed, "Fixed(0)");
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    androidx.constraintlayout.core.state.Dimension Suggested = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(Suggested, "Suggested(WRAP_DIMENSION)");
                    return Suggested;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    androidx.constraintlayout.core.state.Dimension Parent = androidx.constraintlayout.core.state.Dimension.Parent();
                    Intrinsics.checkNotNullExpressionValue(Parent, "Parent()");
                    return Parent;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    androidx.constraintlayout.core.state.Dimension Suggested2 = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(Suggested2, "Suggested(SPREAD_DIMENSION)");
                    return Suggested2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    androidx.constraintlayout.core.state.Dimension Wrap = androidx.constraintlayout.core.state.Dimension.Wrap();
                    Intrinsics.checkNotNullExpressionValue(Wrap, "Wrap()");
                    return Wrap;
                }
                break;
        }
        String str2 = str;
        if (StringsKt.endsWith$default((CharSequence) str2, '%', false, 2, (Object) null)) {
            androidx.constraintlayout.core.state.Dimension suggested = androidx.constraintlayout.core.state.Dimension.Percent(0, Float.parseFloat(StringsKt.substringBefore$default(str, '%', (String) null, 2, (Object) null)) / 100.0f).suggested(0);
            Intrinsics.checkNotNullExpressionValue(suggested, "Percent(0, percentValue).suggested(0)");
            return suggested;
        } else if (StringsKt.contains$default((CharSequence) str2, (char) AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
            androidx.constraintlayout.core.state.Dimension suggested2 = androidx.constraintlayout.core.state.Dimension.Ratio(str).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
            Intrinsics.checkNotNullExpressionValue(suggested2, "Ratio(dimensionString).suggested(SPREAD_DIMENSION)");
            return suggested2;
        } else {
            return Fixed;
        }
    }

    private static final androidx.constraintlayout.core.state.Dimension parseDimension(CLObject cLObject, String str, State state) {
        CLElement cLElement = cLObject.get(str);
        androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        Intrinsics.checkNotNullExpressionValue(Fixed, "Fixed(0)");
        if (cLElement instanceof CLString) {
            String content = cLElement.content();
            Intrinsics.checkNotNullExpressionValue(content, "dimensionElement.content()");
            return parseDimensionMode(content);
        } else if (cLElement instanceof CLNumber) {
            androidx.constraintlayout.core.state.Dimension Fixed2 = androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(cLObject.getFloat(str)))));
            Intrinsics.checkNotNullExpressionValue(Fixed2, "Fixed(\n            state.convertDimension(\n                Dp(\n                    element.getFloat(constraintName)\n                )\n            )\n        )");
            return Fixed2;
        } else if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                Fixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    Fixed.min(state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(orNull.getFloat()))));
                } else if (orNull instanceof CLString) {
                    Fixed.min(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    Fixed.max(state.convertDimension(Dp.m5605boximpl(Dp.m5607constructorimpl(orNull2.getFloat()))));
                    return Fixed;
                } else if (orNull2 instanceof CLString) {
                    Fixed.max(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    return Fixed;
                } else {
                    return Fixed;
                }
            }
            return Fixed;
        } else {
            return Fixed;
        }
    }

    private static final Integer parseColorString(String str) {
        if (StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            if (str != null) {
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring.length() == 6) {
                    substring = Intrinsics.stringPlus("FF", substring);
                }
                return Integer.valueOf((int) Long.parseLong(substring, 16));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return null;
    }

    public static final String lookForType(CLObject element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ArrayList<String> names = element.names();
        if (names == null) {
            return null;
        }
        Iterator<Integer> it = RangesKt.until(0, names.size()).iterator();
        while (it.hasNext()) {
            if (names.get(((IntIterator) it).nextInt()).equals("type")) {
                return element.getString("type");
            }
        }
        return null;
    }
}
