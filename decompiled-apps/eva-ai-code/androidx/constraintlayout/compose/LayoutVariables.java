package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintSetParser.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001J\"\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ6\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\fJ&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eRJ\u0010\u0003\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u00070\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/constraintlayout/compose/LayoutVariables;", "", "()V", "arrayIds", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "generators", "Landroidx/constraintlayout/compose/GeneratedValue;", "margins", "", "get", "", "elementName", "getList", "put", "", TtmlNode.START, "incrementBy", "from", "to", "step", "prefix", "postfix", "element", "elements", "putOverride", "value", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutVariables {
    private final HashMap<String, Integer> margins = new HashMap<>();
    private final HashMap<String, GeneratedValue> generators = new HashMap<>();
    private final HashMap<String, ArrayList<String>> arrayIds = new HashMap<>();

    public final void put(String elementName, int i) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.margins.put(elementName, Integer.valueOf(i));
    }

    public final void put(String elementName, float f, float f2) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        this.generators.put(elementName, new Generator(f, f2));
    }

    public final void put(String elementName, float f, float f2, float f3, String prefix, String postfix) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        FiniteGenerator finiteGenerator = new FiniteGenerator(f, f2, f3, prefix, postfix);
        this.generators.put(elementName, finiteGenerator);
        this.arrayIds.put(elementName, finiteGenerator.array());
    }

    public final void putOverride(String elementName, float f) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.generators.put(elementName, new OverrideValue(f));
    }

    public final float get(Object elementName) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (elementName instanceof CLString) {
            String content = ((CLString) elementName).content();
            if (this.generators.containsKey(content)) {
                GeneratedValue generatedValue = this.generators.get(content);
                Intrinsics.checkNotNull(generatedValue);
                return generatedValue.value();
            } else if (this.margins.containsKey(content)) {
                Integer num = this.margins.get(content);
                Intrinsics.checkNotNull(num);
                return num.intValue();
            } else {
                return 0.0f;
            }
        } else if (elementName instanceof CLNumber) {
            return ((CLNumber) elementName).getFloat();
        } else {
            return 0.0f;
        }
    }

    public final ArrayList<String> getList(String elementName) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (this.arrayIds.containsKey(elementName)) {
            return this.arrayIds.get(elementName);
        }
        return null;
    }

    public final void put(String elementName, ArrayList<String> elements) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.arrayIds.put(elementName, elements);
    }
}
