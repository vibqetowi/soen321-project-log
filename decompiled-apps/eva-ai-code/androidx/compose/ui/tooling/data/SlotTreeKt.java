package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* compiled from: SlotTree.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002\u001a(\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0003\u001a\u0014\u0010+\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010(H\u0003\u001a\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020.0%2\u0006\u0010/\u001a\u00020\u0006H\u0002\u001a\u001e\u00100\u001a\u0004\u0018\u00010*2\u0006\u00101\u001a\u00020\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010*H\u0003\u001a\u001a\u00103\u001a\u0004\u0018\u000104*\u0006\u0012\u0002\b\u0003052\u0006\u00106\u001a\u00020\u0006H\u0002\u001a\f\u00107\u001a\u00020\u0019*\u000208H\u0007\u001a\f\u00109\u001a\u00020\u0006*\u00020\u0015H\u0002\u001a\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0007\u001a\u0016\u0010>\u001a\u00020\u0019*\u00020;2\b\u0010?\u001a\u0004\u0018\u00010*H\u0003\u001a\f\u0010@\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\u0014\u0010A\u001a\u00020\u0014*\u00020\u00152\u0006\u0010B\u001a\u00020\u0006H\u0002\u001a\f\u0010C\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010D\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010E\u001a\u00020\u0014*\u00020\u0015H\u0002\u001aK\u0010F\u001a\u0004\u0018\u0001HG\"\u0004\b\u0000\u0010G*\u0002082&\u0010H\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020J\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0%\u0012\u0006\u0012\u0004\u0018\u0001HG0I2\b\b\u0002\u0010<\u001a\u00020=H\u0007¢\u0006\u0002\u0010K\u001a\f\u0010L\u001a\u00020\u0001*\u00020\u0015H\u0002\u001a\f\u0010M\u001a\u00020\u0001*\u00020\u0006H\u0002\u001a\u0014\u0010M\u001a\u00020\u0001*\u00020\u00062\u0006\u0010N\u001a\u00020\u0001H\u0002\u001a\u001c\u0010O\u001a\u00020\u0006*\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0006H\u0002\u001a\u0014\u0010R\u001a\u00020\t*\u00020\t2\u0006\u0010S\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016\" \u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0018\u0010\u001e\u001a\u00020\u0006*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006T"}, d2 = {"BITS_PER_SLOT", "", "SLOT_MASK", "STABLE_BITS", "STATIC_BITS", "changedFieldName", "", "defaultFieldName", "emptyBox", "Landroidx/compose/ui/unit/IntRect;", "getEmptyBox", "()Landroidx/compose/ui/unit/IntRect;", "internalFieldPrefix", "jacocoDataField", "parameterPrefix", "parametersInformationTokenizer", "Lkotlin/text/Regex;", "recomposeScopeNameSuffix", "tokenizer", "isANumber", "", "Lkotlin/text/MatchResult;", "(Lkotlin/text/MatchResult;)Z", "isClassName", "position", "Landroidx/compose/ui/tooling/data/Group;", "getPosition$annotations", "(Landroidx/compose/ui/tooling/data/Group;)V", "getPosition", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "text", "getText", "(Lkotlin/text/MatchResult;)Ljava/lang/String;", "boundsOfLayoutNode", "node", "Landroidx/compose/ui/layout/LayoutInfo;", "extractParameterInfo", "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "data", "", "context", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", "keyPosition", "key", "parseParameters", "Landroidx/compose/ui/tooling/data/Parameter;", "parameters", "sourceInformationContextOf", TtmlNode.TAG_INFORMATION, "parent", "accessibleField", "Ljava/lang/reflect/Field;", "Ljava/lang/Class;", "name", "asTree", "Landroidx/compose/runtime/tooling/CompositionData;", "callName", "findParameters", "Landroidx/compose/runtime/tooling/CompositionGroup;", "cache", "Landroidx/compose/ui/tooling/data/ContextCache;", "getGroup", "parentContext", "isCallWithName", "isChar", "c", "isFileName", "isNumber", "isParameterInformation", "mapTree", ExifInterface.GPS_DIRECTION_TRUE, "factory", "Lkotlin/Function3;", "Landroidx/compose/ui/tooling/data/SourceContext;", "(Landroidx/compose/runtime/tooling/CompositionData;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/lang/Object;", "number", "parseToInt", "radix", "replacePrefix", "prefix", "replacement", "union", "other", "ui-tooling-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;
    private static final String changedFieldName = "$$changed";
    private static final String defaultFieldName = "$$default";
    private static final String internalFieldPrefix = "$$";
    private static final String jacocoDataField = "$jacoco";
    private static final String parameterPrefix = "$";
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";
    private static final IntRect emptyBox = new IntRect(0, 0, 0, 0);
    private static final Regex tokenizer = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");
    private static final Regex parametersInformationTokenizer = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    public static /* synthetic */ void getPosition$annotations(Group group) {
    }

    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    private static final boolean isNumber(MatchResult matchResult) {
        return matchResult.getGroups().get(1) != null;
    }

    private static final int number(MatchResult matchResult) {
        return parseToInt(matchResult.getGroupValues().get(1));
    }

    private static final String getText(MatchResult matchResult) {
        return matchResult.getGroupValues().get(0);
    }

    private static final boolean isChar(MatchResult matchResult, String str) {
        return Intrinsics.areEqual(getText(matchResult), str);
    }

    private static final boolean isFileName(MatchResult matchResult) {
        return matchResult.getGroups().get(4) != null;
    }

    private static final boolean isParameterInformation(MatchResult matchResult) {
        return matchResult.getGroups().get(5) != null;
    }

    private static final boolean isCallWithName(MatchResult matchResult) {
        return matchResult.getGroups().get(6) != null;
    }

    private static final String callName(MatchResult matchResult) {
        return matchResult.getGroupValues().get(8);
    }

    private static final boolean isANumber(MatchResult matchResult) {
        return matchResult.getGroups().get(1) != null;
    }

    private static final boolean isClassName(MatchResult matchResult) {
        return matchResult.getGroups().get(2) != null;
    }

    private static final int parseToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    private static final int parseToInt(String str, int i) {
        try {
            return Integer.parseInt(str, CharsKt.checkRadix(i));
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.text.MatchResult, T] */
    private static final List<Parameter> parseParameters(String str) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(parametersInformationTokenizer, str, 0, 2, null);
        List mutableListOf = CollectionsKt.mutableListOf(0, 1, 2, 3);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = mutableListOf.size() - 1;
        ArrayList arrayList = new ArrayList();
        try {
            parseParameters$expect(objectRef, "P");
            parseParameters$expect(objectRef, "(");
            while (!parseParameters$isChar(objectRef, ")")) {
                if (parseParameters$isChar(objectRef, "!")) {
                    parseParameters$next(objectRef);
                    int parseParameters$expectNumber = parseParameters$expectNumber(objectRef);
                    parseParameters$ensureIndexes(intRef, mutableListOf, arrayList.size() + parseParameters$expectNumber);
                    for (int i = 0; i < parseParameters$expectNumber; i++) {
                        arrayList.add(new Parameter(((Number) CollectionsKt.first((List<? extends Object>) mutableListOf)).intValue(), null, 2, null));
                        mutableListOf.remove(0);
                    }
                } else if (parseParameters$isChar(objectRef, ",")) {
                    parseParameters$next(objectRef);
                } else {
                    int parseParameters$expectNumber2 = parseParameters$expectNumber(objectRef);
                    arrayList.add(new Parameter(parseParameters$expectNumber2, parseParameters$isClassName(objectRef) ? parseParameters$expectClassName(objectRef) : null));
                    parseParameters$ensureIndexes(intRef, mutableListOf, parseParameters$expectNumber2);
                    mutableListOf.remove(Integer.valueOf(parseParameters$expectNumber2));
                }
            }
            parseParameters$expect(objectRef, ")");
            while (mutableListOf.size() > 0) {
                arrayList.add(new Parameter(((Number) CollectionsKt.first((List<? extends Object>) mutableListOf)).intValue(), null, 2, null));
                mutableListOf.remove(0);
            }
            return arrayList;
        } catch (ParseError unused) {
            return CollectionsKt.emptyList();
        } catch (NumberFormatException unused2) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatchResult, T] */
    private static final MatchResult parseParameters$next(Ref.ObjectRef<MatchResult> objectRef) {
        MatchResult matchResult = objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return objectRef.element;
    }

    private static final int parseParameters$expectNumber(Ref.ObjectRef<MatchResult> objectRef) {
        MatchResult matchResult = objectRef.element;
        if (matchResult == null || !isANumber(matchResult)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
        return parseToInt(getText(matchResult));
    }

    private static final String parseParameters$expectClassName(Ref.ObjectRef<MatchResult> objectRef) {
        MatchResult matchResult = objectRef.element;
        if (matchResult == null || !isClassName(matchResult)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
        String substring = getText(matchResult).substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return replacePrefix(substring, "c#", "androidx.compose.");
    }

    private static final void parseParameters$expect(Ref.ObjectRef<MatchResult> objectRef, String str) {
        MatchResult matchResult = objectRef.element;
        if (matchResult == null || !Intrinsics.areEqual(getText(matchResult), str)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
    }

    private static final boolean parseParameters$isChar(Ref.ObjectRef<MatchResult> objectRef, String str) {
        MatchResult matchResult = objectRef.element;
        return matchResult == null || Intrinsics.areEqual(getText(matchResult), str);
    }

    private static final boolean parseParameters$isClassName(Ref.ObjectRef<MatchResult> objectRef) {
        MatchResult matchResult = objectRef.element;
        return matchResult != null && isClassName(matchResult);
    }

    private static final void parseParameters$ensureIndexes(Ref.IntRef intRef, List<Integer> list, int i) {
        int i2 = i - intRef.element;
        if (i2 > 0) {
            if (i2 < 4) {
                i2 = 4;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                list.add(Integer.valueOf(intRef.element + i3 + 1));
            }
            intRef.element += i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String str, SourceInformationContext sourceInformationContext, int i, Object obj) {
        if ((i & 2) != 0) {
            sourceInformationContext = null;
        }
        return sourceInformationContextOf(str, sourceInformationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.text.MatchResult, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SourceInformationContext sourceInformationContextOf(String str, SourceInformationContext sourceInformationContext) {
        String str2;
        String str3;
        MatchResult matchResult;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(tokenizer, str, 0, 2, null);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = -1;
        boolean z = false;
        boolean z2 = false;
        String str4 = null;
        List<Parameter> list = null;
        do {
            if (objectRef.element != 0) {
                T t = objectRef.element;
                Intrinsics.checkNotNull(t);
                matchResult = (MatchResult) t;
                if (isNumber(matchResult) || isChar(matchResult, "@")) {
                    SourceLocationInfo sourceInformationContextOf$parseLocation = sourceInformationContextOf$parseLocation(objectRef);
                    if (sourceInformationContextOf$parseLocation != null) {
                        arrayList.add(sourceInformationContextOf$parseLocation);
                    }
                } else {
                    if (isChar(matchResult, "C")) {
                        if (z) {
                            z2 = true;
                        }
                        sourceInformationContextOf$next$4(objectRef);
                    } else if (isCallWithName(matchResult)) {
                        if (z) {
                            z2 = true;
                        }
                        str4 = callName(matchResult);
                        sourceInformationContextOf$next$4(objectRef);
                    } else if (isParameterInformation(matchResult)) {
                        list = parseParameters(getText(matchResult));
                        sourceInformationContextOf$next$4(objectRef);
                    } else if (isChar(matchResult, WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD)) {
                        i2 = arrayList.size();
                        sourceInformationContextOf$next$4(objectRef);
                    } else if (isChar(matchResult, ",")) {
                        sourceInformationContextOf$next$4(objectRef);
                    } else if (isFileName(matchResult)) {
                        str2 = str.substring(matchResult.getRange().getLast() + 1);
                        Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).substring(startIndex)");
                        String substringAfterLast = StringsKt.substringAfterLast(str2, "#", "");
                        if (substringAfterLast.length() > 0) {
                            str2 = StringsKt.substring(str2, RangesKt.until(0, (str2.length() - substringAfterLast.length()) - 1));
                            try {
                                i = parseToInt(substringAfterLast, 36);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (str2 != null) {
                            str3 = sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null;
                        } else {
                            str3 = str2;
                        }
                        return new SourceInformationContext(str4, str3, (str2 == null && sourceInformationContext != null) ? sourceInformationContext.getPackageHash() : i, arrayList, i2, list, z, z2);
                    }
                    z = true;
                }
            }
            str2 = null;
            if (str2 != null) {
            }
            if (str2 == null) {
                return new SourceInformationContext(str4, str3, (str2 == null && sourceInformationContext != null) ? sourceInformationContext.getPackageHash() : i, arrayList, i2, list, z, z2);
            }
            return new SourceInformationContext(str4, str3, (str2 == null && sourceInformationContext != null) ? sourceInformationContext.getPackageHash() : i, arrayList, i2, list, z, z2);
        } while (!Intrinsics.areEqual(matchResult, objectRef.element));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatchResult, T] */
    private static final MatchResult sourceInformationContextOf$next$4(Ref.ObjectRef<MatchResult> objectRef) {
        MatchResult matchResult = objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return objectRef.element;
    }

    private static final SourceLocationInfo sourceInformationContextOf$parseLocation(Ref.ObjectRef<MatchResult> objectRef) {
        Integer num;
        Integer num2;
        Integer num3;
        try {
            MatchResult matchResult = objectRef.element;
            if (matchResult == null || !isNumber(matchResult)) {
                num = null;
            } else {
                num = Integer.valueOf(number(matchResult) + 1);
                matchResult = sourceInformationContextOf$next$4(objectRef);
            }
            if (matchResult != null && isChar(matchResult, "@")) {
                MatchResult sourceInformationContextOf$next$4 = sourceInformationContextOf$next$4(objectRef);
                if (sourceInformationContextOf$next$4 != null && isNumber(sourceInformationContextOf$next$4)) {
                    num3 = Integer.valueOf(number(sourceInformationContextOf$next$4));
                    MatchResult sourceInformationContextOf$next$42 = sourceInformationContextOf$next$4(objectRef);
                    if (sourceInformationContextOf$next$42 != null && isChar(sourceInformationContextOf$next$42, "L")) {
                        MatchResult sourceInformationContextOf$next$43 = sourceInformationContextOf$next$4(objectRef);
                        if (sourceInformationContextOf$next$43 != null && isNumber(sourceInformationContextOf$next$43)) {
                            num2 = Integer.valueOf(number(sourceInformationContextOf$next$43));
                        }
                        return null;
                    }
                    num2 = null;
                }
                return null;
            }
            num2 = null;
            num3 = null;
            if (num != null && num3 != null && num2 != null) {
                return new SourceLocationInfo(num, num3, num2);
            }
        } catch (ParseError unused) {
        }
        return null;
    }

    private static final Group getGroup(CompositionGroup compositionGroup, SourceInformationContext sourceInformationContext) {
        List<ModifierInfo> emptyList;
        IntRect intRect;
        Object key = compositionGroup.getKey();
        String sourceInfo = compositionGroup.getSourceInfo();
        SourceInformationContext sourceInformationContextOf = sourceInfo != null ? sourceInformationContextOf(sourceInfo, sourceInformationContext) : null;
        Object node = compositionGroup.getNode();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList;
        CollectionsKt.addAll(arrayList3, compositionGroup.getData());
        for (CompositionGroup compositionGroup2 : compositionGroup.getCompositionGroups()) {
            arrayList2.add(getGroup(compositionGroup2, sourceInformationContextOf));
        }
        boolean z = node instanceof LayoutInfo;
        if (z) {
            emptyList = ((LayoutInfo) node).getModifierInfo();
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (z) {
            intRect = boundsOfLayoutNode((LayoutInfo) node);
        } else if (arrayList2.isEmpty()) {
            intRect = emptyBox;
        } else {
            ArrayList<Group> arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            for (Group group : arrayList4) {
                arrayList5.add(group.getBox());
            }
            Iterator it = arrayList5.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = union((IntRect) it.next(), (IntRect) next);
            }
            intRect = (IntRect) next;
        }
        boolean z2 = true;
        SourceLocation nextSourceLocation = (!(sourceInformationContextOf != null && sourceInformationContextOf.isCall()) || sourceInformationContext == null) ? null : sourceInformationContext.nextSourceLocation();
        if (node != null) {
            return new NodeGroup(key, node, intRect, arrayList3, emptyList, arrayList2);
        }
        String name = sourceInformationContextOf != null ? sourceInformationContextOf.getName() : null;
        String name2 = sourceInformationContextOf != null ? sourceInformationContextOf.getName() : null;
        return new CallGroup(key, name, intRect, nextSourceLocation, ((name2 == null || name2.length() == 0) || (intRect.getBottom() - intRect.getTop() <= 0 && intRect.getRight() - intRect.getLeft() <= 0)) ? null : compositionGroup.getIdentity(), extractParameterInfo(arrayList, sourceInformationContextOf), arrayList3, arrayList2, (sourceInformationContextOf == null || !sourceInformationContextOf.isInline()) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect boundsOfLayoutNode(LayoutInfo layoutInfo) {
        if (!layoutInfo.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(layoutInfo.getCoordinates());
        long mo4552getSizeYbymL2g = layoutInfo.getCoordinates().mo4552getSizeYbymL2g();
        int roundToInt = MathKt.roundToInt(Offset.m3018getXimpl(positionInWindow));
        int roundToInt2 = MathKt.roundToInt(Offset.m3019getYimpl(positionInWindow));
        return new IntRect(roundToInt, roundToInt2, IntSize.m5767getWidthimpl(mo4552getSizeYbymL2g) + roundToInt, IntSize.m5766getHeightimpl(mo4552getSizeYbymL2g) + roundToInt2);
    }

    public static /* synthetic */ Object mapTree$default(CompositionData compositionData, Function3 function3, ContextCache contextCache, int i, Object obj) {
        if ((i & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(compositionData, function3, contextCache);
    }

    public static final <T> T mapTree(CompositionData compositionData, Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> factory, ContextCache cache) {
        Intrinsics.checkNotNullParameter(compositionData, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cache, "cache");
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(factory, cache.getContexts$ui_tooling_data_release());
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(compositionGroup, 0, arrayList);
        return (T) CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup compositionGroup, ContextCache contextCache, int i, Object obj) {
        if ((i & 1) != 0) {
            contextCache = null;
        }
        return findParameters(compositionGroup, contextCache);
    }

    public static final List<ParameterInformation> findParameters(CompositionGroup compositionGroup, ContextCache contextCache) {
        Intrinsics.checkNotNullParameter(compositionGroup, "<this>");
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return CollectionsKt.emptyList();
        }
        SourceInformationContext sourceInformationContext = null;
        if (contextCache == null) {
            sourceInformationContext = sourceInformationContextOf$default(sourceInfo, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data_release = contextCache.getContexts$ui_tooling_data_release();
            Object obj = contexts$ui_tooling_data_release.get(sourceInfo);
            if (obj == null) {
                obj = sourceInformationContextOf$default(sourceInfo, null, 2, null);
                contexts$ui_tooling_data_release.put(sourceInfo, obj);
            }
            if (obj instanceof SourceInformationContext) {
                sourceInformationContext = (SourceInformationContext) obj;
            }
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, compositionGroup.getData());
        return extractParameterInfo(arrayList, sourceInformationContext);
    }

    public static final Group asTree(CompositionData compositionData) {
        Group group;
        Intrinsics.checkNotNullParameter(compositionData, "<this>");
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        return (compositionGroup == null || (group = getGroup(compositionGroup, null)) == null) ? EmptyGroup.INSTANCE : group;
    }

    public static final IntRect union(IntRect intRect, IntRect other) {
        Intrinsics.checkNotNullParameter(intRect, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        IntRect intRect2 = emptyBox;
        if (Intrinsics.areEqual(intRect, intRect2)) {
            return other;
        }
        if (Intrinsics.areEqual(other, intRect2)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), other.getLeft()), Math.min(intRect.getTop(), other.getTop()), Math.max(intRect.getRight(), other.getRight()), Math.max(intRect.getBottom(), other.getBottom()));
    }

    private static final String keyPosition(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JoinedKey) {
            JoinedKey joinedKey = (JoinedKey) obj;
            String keyPosition = keyPosition(joinedKey.getLeft());
            return keyPosition == null ? keyPosition(joinedKey.getRight()) : keyPosition;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[Catch: all -> 0x018d, TryCatch #0 {all -> 0x018d, blocks: (B:17:0x0043, B:19:0x004f, B:21:0x0055, B:24:0x0069, B:27:0x007a, B:29:0x0089, B:31:0x009f, B:33:0x00b3, B:35:0x00c2, B:40:0x00d6, B:41:0x00d9, B:42:0x00dc, B:44:0x00f4, B:47:0x00fe, B:49:0x0105, B:51:0x010b, B:53:0x0117, B:55:0x0121, B:59:0x013c, B:66:0x0153, B:70:0x015c, B:75:0x017a, B:52:0x0112, B:46:0x00fa), top: B:81:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0041 A[EDGE_INSN: B:83:0x0041->B:16:0x0041 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<ParameterInformation> extractParameterInfo(List<? extends Object> list, SourceInformationContext sourceInformationContext) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Field[] fieldArr;
        List<Parameter> emptyList;
        boolean z;
        boolean z2;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                i = 2;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj != null) {
                    String name = obj.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
                    if (StringsKt.endsWith$default(name, recomposeScopeNameSuffix, false, 2, (Object) null)) {
                        z2 = true;
                        continue;
                        if (z2) {
                            break;
                        }
                    }
                }
                z2 = false;
                continue;
                if (z2) {
                }
            }
            if (obj != null) {
                try {
                    Field accessibleField = accessibleField(obj.getClass(), "block");
                    if (accessibleField != null && (obj2 = accessibleField.get(obj)) != null) {
                        Class<?> cls = obj2.getClass();
                        Field accessibleField2 = accessibleField(cls, defaultFieldName);
                        Field accessibleField3 = accessibleField(cls, changedFieldName);
                        if (accessibleField2 != null) {
                            Object obj3 = accessibleField2.get(obj2);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                            i2 = ((Integer) obj3).intValue();
                        } else {
                            i2 = 0;
                        }
                        if (accessibleField3 != null) {
                            Object obj4 = accessibleField3.get(obj2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            i3 = ((Integer) obj4).intValue();
                        } else {
                            i3 = 0;
                        }
                        Field[] declaredFields = cls.getDeclaredFields();
                        Intrinsics.checkNotNullExpressionValue(declaredFields, "blockClass.declaredFields");
                        ArrayList arrayList = new ArrayList();
                        for (Field field : declaredFields) {
                            Field field2 = field;
                            String name2 = field2.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                            if (StringsKt.startsWith$default(name2, parameterPrefix, false, 2, (Object) null)) {
                                String name3 = field2.getName();
                                Intrinsics.checkNotNullExpressionValue(name3, "it.name");
                                if (!StringsKt.startsWith$default(name3, internalFieldPrefix, false, 2, (Object) null)) {
                                    String name4 = field2.getName();
                                    Intrinsics.checkNotNullExpressionValue(name4, "it.name");
                                    if (!StringsKt.startsWith$default(name4, jacocoDataField, false, 2, (Object) null)) {
                                        z = true;
                                        if (!z) {
                                            arrayList.add(field);
                                        }
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractParameterInfo$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(((Field) t).getName(), ((Field) t2).getName());
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        if (sourceInformationContext == null || (emptyList = sourceInformationContext.getParameters()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        int size = sortedWith.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Parameter parameter = i4 < emptyList.size() ? emptyList.get(i4) : new Parameter(i4, null, i, null);
                            if (parameter.getSortedIndex() < sortedWith.size()) {
                                Field field3 = (Field) sortedWith.get(parameter.getSortedIndex());
                                field3.setAccessible(true);
                                Object obj5 = field3.get(obj2);
                                boolean z3 = ((1 << i4) & i2) != 0;
                                int i5 = (i4 * 3) + 1;
                                int i6 = ((7 << i5) & i3) >> i5;
                                int i7 = i6 & 3;
                                boolean z4 = i7 == 3;
                                boolean z5 = i7 == 0;
                                boolean z6 = (i6 & 4) == 0;
                                String name5 = field3.getName();
                                Intrinsics.checkNotNullExpressionValue(name5, "field.name");
                                String substring = name5.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                                arrayList2.add(new ParameterInformation(substring, obj5, z3, z4, z5 && !z3, parameter.getInlineClass(), z6));
                            }
                            i4++;
                            i = 2;
                        }
                        return arrayList2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    public static final String getPosition(Group group) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        return keyPosition(group.getKey());
    }

    private static final Field accessibleField(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        Field[] fieldArr = declaredFields;
        int length = fieldArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = fieldArr[i];
            if (Intrinsics.areEqual(field.getName(), str)) {
                break;
            }
            i++;
        }
        Field field2 = field;
        if (field2 != null) {
            field2.setAccessible(true);
            return field2;
        }
        return null;
    }

    private static final String replacePrefix(String str, String str2, String str3) {
        if (StringsKt.startsWith$default(str, str2, false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }
}
