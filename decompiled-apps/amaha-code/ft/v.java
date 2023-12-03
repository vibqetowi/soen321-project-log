package ft;

import dt.n;
import is.h0;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: JvmBuiltInsSignatures.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f15909a = h0.H1(ca.a.A0("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashSet f15910b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashSet f15911c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f15912d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashSet f15913e;
    public static final LinkedHashSet f;

    static {
        List<nu.c> P0 = ca.a.P0(nu.c.BOOLEAN, nu.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (nu.c cVar : P0) {
            String f2 = cVar.j().f().f();
            kotlin.jvm.internal.i.f(f2, "it.wrapperFqName.shortName().asString()");
            String[] strArr = new String[1];
            StringBuilder sb2 = new StringBuilder();
            String str = cVar.f26840v;
            if (str != null) {
                sb2.append(str);
                sb2.append("Value()");
                sb2.append(cVar.h());
                strArr[0] = sb2.toString();
                is.q.R1(ca.a.z0(f2, strArr), linkedHashSet);
            } else {
                nu.c.d(11);
                throw null;
            }
        }
        f15910b = h0.I1(h0.I1(h0.I1(h0.I1(h0.I1(h0.I1(linkedHashSet, ca.a.A0("List", "sort(Ljava/util/Comparator;)V")), ca.a.z0("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), ca.a.z0("Double", "isInfinite()Z", "isNaN()Z")), ca.a.z0("Float", "isInfinite()Z", "isNaN()Z")), ca.a.z0("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), ca.a.z0("CharSequence", "isEmpty()Z"));
        f15911c = h0.I1(h0.I1(h0.I1(h0.I1(h0.I1(h0.I1(ca.a.z0("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), ca.a.A0("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), ca.a.z0("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), ca.a.z0("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), ca.a.A0("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), ca.a.A0("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), ca.a.A0("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f15912d = h0.I1(h0.I1(ca.a.A0("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), ca.a.A0("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), ca.a.A0("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        nu.c cVar2 = nu.c.BYTE;
        List<nu.c> P02 = ca.a.P0(nu.c.BOOLEAN, cVar2, nu.c.DOUBLE, nu.c.FLOAT, cVar2, nu.c.INT, nu.c.LONG, nu.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (nu.c cVar3 : P02) {
            String f10 = cVar3.j().f().f();
            kotlin.jvm.internal.i.f(f10, "it.wrapperFqName.shortName().asString()");
            String[] D = ca.a.D("Ljava/lang/String;");
            is.q.R1(ca.a.z0(f10, (String[]) Arrays.copyOf(D, D.length)), linkedHashSet2);
        }
        String[] D2 = ca.a.D("D");
        LinkedHashSet I1 = h0.I1(linkedHashSet2, ca.a.z0("Float", (String[]) Arrays.copyOf(D2, D2.length)));
        String[] D3 = ca.a.D("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f15913e = h0.I1(I1, ca.a.z0("String", (String[]) Arrays.copyOf(D3, D3.length)));
        String[] D4 = ca.a.D("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f = ca.a.z0("Throwable", (String[]) Arrays.copyOf(D4, D4.length));
    }

    public static boolean a(fu.d dVar) {
        boolean z10;
        if (kotlin.jvm.internal.i.b(dVar, n.a.f13402g)) {
            return true;
        }
        if (n.a.c0.get(dVar) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
