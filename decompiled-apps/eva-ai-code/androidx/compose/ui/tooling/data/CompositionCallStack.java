package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTree.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\u0010\u000bJ\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\tH\u0002J$\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000000J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0005H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020\u0005H\u0002R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/compose/ui/tooling/data/CompositionCallStack;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/data/SourceContext;", "factory", "Lkotlin/Function3;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "contexts", "", "", "", "(Lkotlin/jvm/functions/Function3;Ljava/util/Map;)V", "<set-?>", "Landroidx/compose/ui/unit/IntRect;", "bounds", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "current", "getCurrent", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "currentCallIndex", "", "depth", "getDepth", "()I", "isInline", "", "()Z", FirebaseAnalytics.Param.LOCATION, "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "name", "getName", "()Ljava/lang/String;", "parameters", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "()Ljava/util/List;", "stack", "Lkotlin/collections/ArrayDeque;", "contextOf", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", TtmlNode.TAG_INFORMATION, "convert", "group", "callIndex", "out", "", "isCall", "parentGroup", "parentDepth", "pop", "push", "", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompositionCallStack<T> implements SourceContext {
    private IntRect bounds;
    private final Map<String, Object> contexts;
    private int currentCallIndex;
    private final Function3<CompositionGroup, SourceContext, List<? extends T>, T> factory;
    private final ArrayDeque<CompositionGroup> stack;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> factory, Map<String, Object> contexts) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(contexts, "contexts");
        this.factory = factory;
        this.contexts = contexts;
        this.stack = new ArrayDeque<>();
        this.bounds = SlotTreeKt.getEmptyBox();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        r2 = androidx.compose.ui.tooling.data.SlotTreeKt.boundsOfLayoutNode(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IntRect convert(CompositionGroup group, int i, List<T> out) {
        IntRect boundsOfLayoutNode;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(out, "out");
        ArrayList arrayList = new ArrayList();
        IntRect emptyBox = SlotTreeKt.getEmptyBox();
        push(group);
        int i2 = 0;
        for (CompositionGroup compositionGroup : group.getCompositionGroups()) {
            emptyBox = SlotTreeKt.union(emptyBox, convert(compositionGroup, i2, arrayList));
            if (isCall(compositionGroup)) {
                i2++;
            }
        }
        Object node = group.getNode();
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (layoutInfo != null && boundsOfLayoutNode != null) {
            emptyBox = boundsOfLayoutNode;
        }
        this.currentCallIndex = i;
        this.bounds = emptyBox;
        T invoke = this.factory.invoke(group, this, arrayList);
        if (invoke != null) {
            out.add(invoke);
        }
        pop();
        return emptyBox;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        int i;
        String sourceInfo = getCurrent().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (StringsKt.startsWith$default(sourceInfo, "CC(", false, 2, (Object) null)) {
            i = 3;
        } else if (!StringsKt.startsWith$default(sourceInfo, "C(", false, 2, (Object) null)) {
            return null;
        } else {
            i = 2;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) sourceInfo, ')', 0, false, 6, (Object) null);
        if (indexOf$default > 2) {
            String substring = sourceInfo.substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = getCurrent().getSourceInfo();
        return sourceInfo != null && StringsKt.startsWith$default(sourceInfo, "CC", false, 2, (Object) null);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String sourceInfo;
        SourceInformationContext contextOf;
        String sourceInfo2;
        CompositionGroup parentGroup = parentGroup(1);
        if (parentGroup == null || (sourceInfo = parentGroup.getSourceInfo()) == null || (contextOf = contextOf(sourceInfo)) == null) {
            return null;
        }
        int i = 2;
        SourceInformationContext sourceInformationContext = contextOf;
        while (i < this.stack.size()) {
            if ((sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null) != null) {
                break;
            }
            int i2 = i + 1;
            CompositionGroup parentGroup2 = parentGroup(i);
            sourceInformationContext = (parentGroup2 == null || (sourceInfo2 = parentGroup2.getSourceInfo()) == null) ? null : contextOf(sourceInfo2);
            i = i2;
        }
        return contextOf.sourceLocation(this.currentCallIndex, sourceInformationContext);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        SourceInformationContext contextOf;
        List<ParameterInformation> extractParameterInfo;
        CompositionGroup current = getCurrent();
        String sourceInfo = current.getSourceInfo();
        if (sourceInfo == null || (contextOf = contextOf(sourceInfo)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, current.getData());
        extractParameterInfo = SlotTreeKt.extractParameterInfo(arrayList, contextOf);
        return extractParameterInfo;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    private final void push(CompositionGroup compositionGroup) {
        this.stack.addLast(compositionGroup);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final CompositionGroup getCurrent() {
        return this.stack.last();
    }

    private final CompositionGroup parentGroup(int i) {
        if (this.stack.size() > i) {
            ArrayDeque<CompositionGroup> arrayDeque = this.stack;
            return arrayDeque.get((arrayDeque.size() - i) - 1);
        }
        return null;
    }

    private final SourceInformationContext contextOf(String str) {
        Map<String, Object> map = this.contexts;
        Object obj = map.get(str);
        if (obj == null) {
            obj = SlotTreeKt.sourceInformationContextOf$default(str, null, 2, null);
            map.put(str, obj);
        }
        if (obj instanceof SourceInformationContext) {
            return (SourceInformationContext) obj;
        }
        return null;
    }

    private final boolean isCall(CompositionGroup compositionGroup) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            return StringsKt.startsWith$default(sourceInfo, "C", false, 2, (Object) null);
        }
        return false;
    }
}
