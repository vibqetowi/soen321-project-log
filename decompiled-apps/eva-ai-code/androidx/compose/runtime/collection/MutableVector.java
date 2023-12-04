package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import org.apache.commons.codec.language.bm.Languages;
/* compiled from: MutableVector.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003pqrB\u001f\b\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010!J\u0017\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010$J\u001c\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u001c\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&J\u0014\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0017\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0086\bJ+\u0010'\u001a\u00020\u001c2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0006\u0010+\u001a\u00020\u001fJ\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001eJ\u0014\u0010-\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010-\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010-\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&J\u0014\u0010.\u001a\u00020\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0007J\u000b\u00102\u001a\u00028\u0000¢\u0006\u0002\u00103J0\u00102\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00104J\u0010\u00105\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00103J2\u00105\u001a\u0004\u0018\u00018\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00104JS\u00106\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001a\u0002H72'\u00109\u001a#\u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010>Jh\u0010?\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001a\u0002H72<\u00109\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70@H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010AJS\u0010B\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001a\u0002H72'\u00109\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002H70:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010>Jh\u0010C\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001a\u0002H72<\u00109\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002H70@H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010AJ+\u0010D\u001a\u00020\u001f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010F\u001a\u00020\u001f2\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010G\u001a\u00020\u001f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010H\u001a\u00020\u001f2\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010I\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0007H\u0086\n¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010LJ+\u0010M\u001a\u00020\u00072\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010N\u001a\u00020\u00072\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010O\u001a\u00020\u001cJ\u0006\u0010P\u001a\u00020\u001cJ\u000b\u0010Q\u001a\u00028\u0000¢\u0006\u0002\u00103J0\u0010Q\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00104J\u0013\u0010R\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010LJ\u0010\u0010S\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00103J2\u0010S\u001a\u0004\u0018\u00018\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00104J>\u0010T\u001a\b\u0012\u0004\u0012\u0002H70\u0005\"\u0006\b\u0001\u00107\u0018\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010VJS\u0010W\u001a\b\u0012\u0004\u0012\u0002H70\u0005\"\u0006\b\u0001\u00107\u0018\u00012'\u0010U\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010XJP\u0010Y\u001a\b\u0012\u0004\u0012\u0002H70\u0000\"\u0006\b\u0001\u00107\u0018\u00012)\u0010U\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H70:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J;\u0010Z\u001a\b\u0012\u0004\u0012\u0002H70\u0000\"\u0006\b\u0001\u00107\u0018\u00012\u0014\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H70)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010[\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\\J\u0016\u0010]\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\\J\u0013\u0010^\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u0014\u0010_\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010_\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010_\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&J\u0013\u0010`\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0002\u0010JJ\u0016\u0010a\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0007J\u0014\u0010d\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%J+\u0010e\u001a\u00020\u001c2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001e\u0010f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010gJ\u001e\u0010h\u001a\u00020\u001f2\u0016\u0010i\u001a\u0012\u0012\u0004\u0012\u00028\u00000jj\b\u0012\u0004\u0012\u00028\u0000`kJ+\u0010l\u001a\u00020\u00072\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070)H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010n\u001a\u00020oH\u0001R.\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u000f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u0010\u001a\u00020\u00118Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006s"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", FirebaseAnalytics.Param.CONTENT, "", "size", "", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "list", "", "<set-?>", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "elements", "([Ljava/lang/Object;)Z", "", "", Languages.ANY, "predicate", "Lkotlin/Function1;", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "minusAssign", "(Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", TtmlNode.START, TtmlNode.END, "retainAll", "reversedAny", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "throwNoSuchElementException", "", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    private T[] content;
    private List<T> list;
    private int size;

    public static /* synthetic */ void getContent$annotations() {
    }

    public MutableVector(T[] content, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.size = i;
    }

    public final T[] getContent() {
        return this.content;
    }

    public final void setContent(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<set-?>");
        this.content = tArr;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final IntRange getIndices() {
        return new IntRange(0, getSize() - 1);
    }

    public final boolean add(T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i = this.size;
        tArr[i] = t;
        this.size = i + 1;
        return true;
    }

    public final void add(int i, T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            ArraysKt.copyInto(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.size++;
    }

    public final boolean addAll(int i, List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (i != this.size) {
            ArraysKt.copyInto(tArr, tArr, elements.size() + i, i, this.size);
        }
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i + i2] = elements.get(i2);
        }
        this.size += elements.size();
        return true;
    }

    public final boolean addAll(int i, MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            ArraysKt.copyInto(tArr, tArr, elements.size + i, i, i2);
        }
        ArraysKt.copyInto(elements.content, tArr, i, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean addAll(List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), elements);
    }

    public final boolean addAll(T[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.size + elements.length);
        ArraysKt.copyInto$default(elements, this.content, this.size, 0, 0, 12, (Object) null);
        this.size += elements.length;
        return true;
    }

    public final boolean addAll(int i, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (i != this.size) {
            ArraysKt.copyInto(tArr, tArr, elements.size() + i, i, this.size);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean addAll(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this.size, elements);
    }

    public final boolean any(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!predicate.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list == null) {
            MutableVectorList mutableVectorList = new MutableVectorList(this);
            this.list = mutableVectorList;
            return mutableVectorList;
        }
        return list;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 < size) {
                tArr[size] = null;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public final boolean containsAll(List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (T t : elements) {
            if (!contains(t)) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.areEqual(other.getContent()[i], getContent()[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        T[] tArr = this.content;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[0];
    }

    public final T first(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            throwNoSuchElementException();
            throw new KotlinNothingValueException();
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    public final T firstOrNull(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.invoke(r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.invoke(Integer.valueOf(i), r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r, Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.invoke(content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r, Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.invoke(Integer.valueOf(i), content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    public final void forEach(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachReversed(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                block.invoke(content[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                block.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i) {
        return getContent()[i];
    }

    public final int indexOf(T t) {
        int i = this.size;
        if (i > 0) {
            T[] tArr = this.content;
            int i2 = 0;
            while (!Intrinsics.areEqual(t, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!predicate.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[getSize() - 1];
    }

    public final T last(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            throwNoSuchElementException();
            throw new KotlinNothingValueException();
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T t) {
        int i = this.size;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = this.content;
            while (!Intrinsics.areEqual(t, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    public final T lastOrNull(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(getContent()[i]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R invoke = transform.invoke(Integer.valueOf(i), content[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R invoke = transform.invoke(content[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final boolean remove(T t) {
        int indexOf = indexOf(t);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
        return i != this.size;
    }

    public final boolean removeAll(MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.getContent()[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final boolean removeAll(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        for (T t : elements) {
            remove(t);
        }
        return i != this.size;
    }

    public final T removeAt(int i) {
        T[] tArr = this.content;
        T t = tArr[i];
        if (i != getSize() - 1) {
            ArraysKt.copyInto(tArr, tArr, i, i + 1, this.size);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.size;
            if (i2 < i3) {
                T[] tArr = this.content;
                ArraysKt.copyInto(tArr, tArr, i, i2, i3);
            }
            int i4 = this.size - (i2 - i);
            int size = getSize() - 1;
            if (i4 <= size) {
                int i5 = i4;
                while (true) {
                    this.content[i5] = null;
                    if (i5 == size) {
                        break;
                    }
                    i5++;
                }
            }
            this.size = i4;
        }
    }

    public final boolean retainAll(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final T set(int i, T t) {
        T[] tArr = this.content;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void sortWith(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        int size = getSize();
        int i = 0;
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                i += selector.invoke(content[i2]).intValue();
                i2++;
            } while (i2 < size);
            return i;
        }
        return i;
    }

    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\r\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/util/List;I)V", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.list.add(this.index, t);
            this.index++;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.index, t);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector<T> vector;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public MutableVectorList(MutableVector<T> vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            this.vector = vector;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.getContent()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.vector.add(t);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.vector.add(i, t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.addAll(i, elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.addAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.removeAll(elements);
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.set(i, t);
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            MutableVectorList<T> mutableVectorList = this;
            MutableVectorKt.checkSubIndex(mutableVectorList, i, i2);
            return new SubList(mutableVectorList, i, i2);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", TtmlNode.START, "", TtmlNode.END, "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public SubList(List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), obj)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (!Intrinsics.areEqual(this.list.get(i), obj)) {
                    if (i == i2) {
                        return -1;
                    }
                    i--;
                }
                return i - this.start;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.list.add(i + this.start, t);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(i + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), obj)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.set(i + this.start, t);
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            SubList<T> subList = this;
            MutableVectorKt.checkSubIndex(subList, i, i2);
            return new SubList(subList, i, i2);
        }
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.areEqual(getContent()[i], t); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRange = new IntRange(0, elements.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (contains(elements.getContent()[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }
}
