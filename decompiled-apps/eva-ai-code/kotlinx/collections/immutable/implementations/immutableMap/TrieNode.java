package kotlinx.collections.immutable.implementations.immutableMap;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0000\u0018\u0000 \u0085\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0085\u0001\u0086\u0001B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0091\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0014H\u0000¢\u0006\u0002\b\u001aJ\u009c\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0002JO\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0002J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0002J+\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00100J#\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00102J+\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00103J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00105\u001a\u00020\u0005H\u0002J#\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u00108J\u001c\u00109\u001a\u00020(2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J\r\u0010;\u001a\u00020\u0005H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\b>JG\u0010?\u001a\u00020(\"\u0004\b\u0002\u0010@\"\u0004\b\u0003\u0010A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H@\u0012\u0004\u0012\u0002HA0\u00002\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020(0DH\u0000¢\u0006\u0002\bEJ%\u0010F\u001a\u0004\u0018\u00018\u00012\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010GJ\u0015\u0010H\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\bIJ\u0010\u0010J\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H\u0002J1\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010LJ\u0015\u0010M\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010NJ[\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010R\u001a\u00028\u00012\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00028\u00002\u0006\u0010U\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010VJI\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010XJ=\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002¢\u0006\u0002\u0010\\J8\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010^\u001a\u00020_2\u0006\u0010$\u001a\u00020\u000bH\u0002J?\u0010`\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002¢\u0006\u0002\u0010\\J7\u0010`\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002¢\u0006\u0002\u0010aJ2\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00105\u001a\u00020\u00052\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002J9\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010dJQ\u0010e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010fJK\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[¢\u0006\u0002\u0010hJJ\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010^\u001a\u00020_2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[JT\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010^\u001a\u00020_2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002JM\u0010k\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[¢\u0006\u0002\u0010hJE\u0010k\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[¢\u0006\u0002\u0010lJ:\u0010m\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002J.\u0010n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002JX\u0010p\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002J8\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010$\u001a\u00020\u000bH\u0002J=\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010/\u001a\u00028\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0002¢\u0006\u0002\u0010uJ!\u0010v\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010o\u001a\u00020\u0005H\u0000¢\u0006\u0002\bwJ\u0015\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\bxJ9\u0010y\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010zJ9\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010|J1\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010}J&\u0010~\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J&\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002JQ\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J9\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010o\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J+\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010/\u001a\u00028\u0001H\u0002¢\u0006\u0003\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010NR0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "dataMap", "", "nodeMap", "buffer", "", "(II[Ljava/lang/Object;)V", "ownedBy", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "(II[Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "<set-?>", "getBuffer$kotlinx_collections_immutable", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "accept", "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "shift", "hash", "accept$kotlinx_collections_immutable", "asInsertResult", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "bufferMoveEntryToNode", "keyIndex", "positionMask", "newKeyHash", "newKey", "newValue", "owner", "(IIILjava/lang/Object;Ljava/lang/Object;ILkotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "calculateSize", "collisionContainsKey", "", "key", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionKeyIndex", "collisionPut", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "collisionRemove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "i", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", "elementsIdentityEquals", "otherNode", "entryCount", "entryCount$kotlinx_collections_immutable", "entryKeyIndex", "entryKeyIndex$kotlinx_collections_immutable", "equalsWith", "K1", "V1", "that", "equalityComparator", "Lkotlin/Function2;", "equalsWith$kotlinx_collections_immutable", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "hasEntryAt", "hasEntryAt$kotlinx_collections_immutable", "hasNodeAt", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyAtIndex", "(I)Ljava/lang/Object;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPut", "mutator", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "intersectionCounter", "Lkotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionRemove", "(Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAll", "mutablePutAllFromOtherNodeCell", "mutableRemove", "(ILjava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveEntryAtIndex", "mutableRemoveNodeAtIndex", "nodeIndex", "mutableReplaceNode", "targetNode", "newNode", "mutableUpdateNodeAtIndex", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "nodeAtIndex$kotlinx_collections_immutable", "nodeIndex$kotlinx_collections_immutable", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "remove", "(ILjava/lang/Object;Ljava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "removeNodeAtIndex", "replaceNode", "updateNodeAtIndex", "updateValueAtIndex", "(ILjava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "valueAtKeyIndex", "Companion", "ModificationResult", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrieNode<K, V> {
    public static final Companion Companion = new Companion(null);
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    public TrieNode(int i, int i2, Object[] buffer, MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = buffer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, int i2, Object[] buffer) {
        this(i, i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJD\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0010\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bø\u0001\u0000R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "node", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ModificationResult<K, V> {
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> node, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.sizeDelta = i;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
            this.node = trieNode;
        }

        public final ModificationResult<K, V> replaceNode(Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            setNode(operation.invoke(getNode()));
            return this;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    public final Object[] getBuffer$kotlinx_collections_immutable() {
        return this.buffer;
    }

    public final int entryCount$kotlinx_collections_immutable() {
        return Integer.bitCount(this.dataMap);
    }

    public final boolean hasEntryAt$kotlinx_collections_immutable(int i) {
        return (i & this.dataMap) != 0;
    }

    private final boolean hasNodeAt(int i) {
        return (i & this.nodeMap) != 0;
    }

    public final int entryKeyIndex$kotlinx_collections_immutable(int i) {
        return Integer.bitCount((i - 1) & this.dataMap) * 2;
    }

    public final int nodeIndex$kotlinx_collections_immutable(int i) {
        return (this.buffer.length - 1) - Integer.bitCount((i - 1) & this.nodeMap);
    }

    private final K keyAtIndex(int i) {
        return (K) this.buffer[i];
    }

    private final V valueAtKeyIndex(int i) {
        return (V) this.buffer[i + 1];
    }

    public final TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable(int i) {
        Object obj = this.buffer[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    private final TrieNode<K, V> insertEntryAt(int i, K k, V v) {
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$kotlinx_collections_immutable(i), k, v));
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i, K k, V v, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(i);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$kotlinx_collections_immutable, k, v);
            this.dataMap = i | this.dataMap;
            return this;
        }
        return new TrieNode<>(i | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$kotlinx_collections_immutable, k, v), mutabilityOwnership);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable()) {
            this.buffer[i + 1] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$kotlinx_collections_immutable(persistentHashMapBuilder.getModCount$kotlinx_collections_immutable() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i, int i2, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            return new TrieNode<>(this.dataMap ^ i2, i2 ^ this.nodeMap, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i, entryKeyIndex$kotlinx_collections_immutable(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m8801assert(trieNode.ownedBy == mutabilityOwnership);
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else if (this.ownedBy == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
        }
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeNodeAtIndex(objArr, i);
            this.nodeMap ^= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i), mutabilityOwnership);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        K keyAtIndex = keyAtIndex(i);
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i, nodeIndex$kotlinx_collections_immutable(i2) + 1, makeNode(keyAtIndex == null ? 0 : keyAtIndex.hashCode(), keyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, mutabilityOwnership));
    }

    private final TrieNode<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, null));
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership);
            this.dataMap ^= i2;
            this.nodeMap |= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k, v, k2, v2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$kotlinx_collections_immutable(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i);
            this.dataMap ^= i2;
            return this;
        }
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr, i));
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$kotlinx_collections_immutable(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i), persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
    }

    private final int collisionKeyIndex(Object obj) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return -1;
        }
        while (true) {
            int i = first + step2;
            if (Intrinsics.areEqual(obj, keyAtIndex(first))) {
                return first;
            }
            if (first == last) {
                return -1;
            }
            first = i;
        }
    }

    private final boolean collisionContainsKey(K k) {
        return collisionKeyIndex(k) != -1;
    }

    private final V collisionGet(K k) {
        int collisionKeyIndex = collisionKeyIndex(k);
        if (collisionKeyIndex != -1) {
            return valueAtKeyIndex(collisionKeyIndex);
        }
        return null;
    }

    private final ModificationResult<K, V> collisionPut(K k, V v) {
        int collisionKeyIndex = collisionKeyIndex(k);
        if (collisionKeyIndex != -1) {
            if (v == valueAtKeyIndex(collisionKeyIndex)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[collisionKeyIndex + 1] = v;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k, v)).asInsertResult();
    }

    private final TrieNode<K, V> mutableCollisionPut(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int collisionKeyIndex = collisionKeyIndex(k);
        if (collisionKeyIndex != -1) {
            persistentHashMapBuilder.setOperationResult$kotlinx_collections_immutable(valueAtKeyIndex(collisionKeyIndex));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable()) {
                this.buffer[collisionKeyIndex + 1] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$kotlinx_collections_immutable(persistentHashMapBuilder.getModCount$kotlinx_collections_immutable() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[collisionKeyIndex + 1] = v;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k, v), persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
    }

    private final TrieNode<K, V> collisionRemove(K k) {
        int collisionKeyIndex = collisionKeyIndex(k);
        return collisionKeyIndex != -1 ? collisionRemoveEntryAtIndex(collisionKeyIndex) : this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int collisionKeyIndex = collisionKeyIndex(k);
        return collisionKeyIndex != -1 ? mutableCollisionRemoveEntryAtIndex(collisionKeyIndex, persistentHashMapBuilder) : this;
    }

    private final TrieNode<K, V> collisionRemove(K k, V v) {
        int collisionKeyIndex = collisionKeyIndex(k);
        return (collisionKeyIndex == -1 || !Intrinsics.areEqual(v, valueAtKeyIndex(collisionKeyIndex))) ? this : collisionRemoveEntryAtIndex(collisionKeyIndex);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int collisionKeyIndex = collisionKeyIndex(k);
        return (collisionKeyIndex == -1 || !Intrinsics.areEqual(v, valueAtKeyIndex(collisionKeyIndex))) ? this : mutableCollisionRemoveEntryAtIndex(collisionKeyIndex, persistentHashMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m8801assert(this.nodeMap == 0);
        CommonFunctionsKt.m8801assert(this.dataMap == 0);
        CommonFunctionsKt.m8801assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m8801assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        IntProgression step = RangesKt.step(RangesKt.until(0, trieNode.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                int i = first + step2;
                if (!collisionContainsKey(trieNode.buffer[first])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(i));
            if (trieNode.hasNodeAt(i)) {
                return nodeAtIndex$kotlinx_collections_immutable.mutablePutAll(trieNode.nodeAtIndex$kotlinx_collections_immutable(trieNode.nodeIndex$kotlinx_collections_immutable(i)), i2 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$kotlinx_collections_immutable(i)) {
                int entryKeyIndex$kotlinx_collections_immutable = trieNode.entryKeyIndex$kotlinx_collections_immutable(i);
                K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$kotlinx_collections_immutable);
                V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
                int size = persistentHashMapBuilder.size();
                TrieNode<K, V> mutablePut = nodeAtIndex$kotlinx_collections_immutable.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, i2 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$kotlinx_collections_immutable;
        } else if (trieNode.hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable2 = trieNode.nodeAtIndex$kotlinx_collections_immutable(trieNode.nodeIndex$kotlinx_collections_immutable(i));
            if (hasEntryAt$kotlinx_collections_immutable(i)) {
                int entryKeyIndex$kotlinx_collections_immutable2 = entryKeyIndex$kotlinx_collections_immutable(i);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$kotlinx_collections_immutable2);
                int i3 = i2 + 5;
                if (!nodeAtIndex$kotlinx_collections_immutable2.containsKey(keyAtIndex2 == null ? 0 : keyAtIndex2.hashCode(), keyAtIndex2, i3)) {
                    return nodeAtIndex$kotlinx_collections_immutable2.mutablePut(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable2), i3, persistentHashMapBuilder);
                }
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return nodeAtIndex$kotlinx_collections_immutable2;
        } else {
            int entryKeyIndex$kotlinx_collections_immutable3 = entryKeyIndex$kotlinx_collections_immutable(i);
            K keyAtIndex3 = keyAtIndex(entryKeyIndex$kotlinx_collections_immutable3);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable3);
            int entryKeyIndex$kotlinx_collections_immutable4 = trieNode.entryKeyIndex$kotlinx_collections_immutable(i);
            K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$kotlinx_collections_immutable4);
            return makeNode(keyAtIndex3 == null ? 0 : keyAtIndex3.hashCode(), keyAtIndex3, valueAtKeyIndex2, keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, trieNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable4), i2 + 5, persistentHashMapBuilder.getOwnership$kotlinx_collections_immutable());
        }
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$kotlinx_collections_immutable(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap == trieNode.nodeMap && this.dataMap == trieNode.dataMap) {
            int length = this.buffer.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.buffer[i] != trieNode.buffer[i]) {
                    return false;
                }
                i = i2;
            }
            return true;
        }
        return false;
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            return Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$kotlinx_collections_immutable.collisionContainsKey(k);
            }
            return nodeAtIndex$kotlinx_collections_immutable.containsKey(i, k, i2 + 5);
        }
        return false;
    }

    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            if (Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable))) {
                return valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
            }
            return null;
        } else if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$kotlinx_collections_immutable.collisionGet(k);
            }
            return nodeAtIndex$kotlinx_collections_immutable.get(i, k, i2 + 5);
        } else {
            return null;
        }
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> otherNode, int i, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            int i2 = this.nodeMap | otherNode.nodeMap;
            int i3 = this.dataMap;
            int i4 = otherNode.dataMap;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$kotlinx_collections_immutable(lowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if (!((i2 & i6) == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            TrieNode<K, V> trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$kotlinx_collections_immutable()) && this.dataMap == i6 && this.nodeMap == i2) ? this : new TrieNode<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
            int i8 = i2;
            int i9 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                trieNode.getBuffer$kotlinx_collections_immutable()[(trieNode.getBuffer$kotlinx_collections_immutable().length - 1) - i9] = mutablePutAllFromOtherNodeCell(otherNode, lowestOneBit2, i, intersectionCounter, mutator);
                i9++;
                i8 ^= lowestOneBit2;
            }
            while (i6 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i6);
                int i10 = i7 * 2;
                if (!otherNode.hasEntryAt$kotlinx_collections_immutable(lowestOneBit3)) {
                    int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(lowestOneBit3);
                    trieNode.getBuffer$kotlinx_collections_immutable()[i10] = keyAtIndex(entryKeyIndex$kotlinx_collections_immutable);
                    trieNode.getBuffer$kotlinx_collections_immutable()[i10 + 1] = valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
                } else {
                    int entryKeyIndex$kotlinx_collections_immutable2 = otherNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit3);
                    trieNode.getBuffer$kotlinx_collections_immutable()[i10] = otherNode.keyAtIndex(entryKeyIndex$kotlinx_collections_immutable2);
                    trieNode.getBuffer$kotlinx_collections_immutable()[i10 + 1] = otherNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable2);
                    if (hasEntryAt$kotlinx_collections_immutable(lowestOneBit3)) {
                        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                    }
                }
                i7++;
                i6 ^= lowestOneBit3;
            }
            return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
        }
    }

    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            if (Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable))) {
                if (valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable) == v) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$kotlinx_collections_immutable, v).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$kotlinx_collections_immutable, indexSegment, i, k, v, i2).asInsertResult();
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                put = nodeAtIndex$kotlinx_collections_immutable.collisionPut(k, v);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$kotlinx_collections_immutable.put(i, k, v, i2 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$kotlinx_collections_immutable, indexSegment, put.getNode()));
            return put;
        } else {
            return insertEntryAt(indexSegment, k, v).asInsertResult();
        }
    }

    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutablePut;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            if (Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable))) {
                mutator.setOperationResult$kotlinx_collections_immutable(valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable));
                return valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable) == v ? this : mutableUpdateValueAtIndex(entryKeyIndex$kotlinx_collections_immutable, v, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$kotlinx_collections_immutable, indexSegment, i, k, v, i2, mutator.getOwnership$kotlinx_collections_immutable());
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                mutablePut = nodeAtIndex$kotlinx_collections_immutable.mutableCollisionPut(k, v, mutator);
            } else {
                mutablePut = nodeAtIndex$kotlinx_collections_immutable.mutablePut(i, k, v, i2 + 5, mutator);
            }
            return nodeAtIndex$kotlinx_collections_immutable == mutablePut ? this : mutableUpdateNodeAtIndex(nodeIndex$kotlinx_collections_immutable, mutablePut, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(indexSegment, k, v, mutator.getOwnership$kotlinx_collections_immutable());
        }
    }

    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable)) ? removeEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                remove = nodeAtIndex$kotlinx_collections_immutable.collisionRemove(k);
            } else {
                remove = nodeAtIndex$kotlinx_collections_immutable.remove(i, k, i2 + 5);
            }
            return replaceNode(nodeAtIndex$kotlinx_collections_immutable, remove, nodeIndex$kotlinx_collections_immutable, indexSegment);
        } else {
            return this;
        }
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i, i2);
        }
        return trieNode != trieNode2 ? updateNodeAtIndex(i, i2, trieNode2) : this;
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable)) ? mutableRemoveEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment, mutator) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$kotlinx_collections_immutable.mutableCollisionRemove(k, mutator);
            } else {
                mutableRemove = nodeAtIndex$kotlinx_collections_immutable.mutableRemove(i, k, i2 + 5, mutator);
            }
            return mutableReplaceNode(nodeAtIndex$kotlinx_collections_immutable, mutableRemove, nodeIndex$kotlinx_collections_immutable, indexSegment, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            return this;
        }
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i, i2, mutabilityOwnership);
        }
        return trieNode != trieNode2 ? mutableUpdateNodeAtIndex(i, trieNode2, mutabilityOwnership) : this;
    }

    public final TrieNode<K, V> remove(int i, K k, V v, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return (Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable)) && Intrinsics.areEqual(v, valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable))) ? removeEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                remove = nodeAtIndex$kotlinx_collections_immutable.collisionRemove(k, v);
            } else {
                remove = nodeAtIndex$kotlinx_collections_immutable.remove(i, k, v, i2 + 5);
            }
            return replaceNode(nodeAtIndex$kotlinx_collections_immutable, remove, nodeIndex$kotlinx_collections_immutable, indexSegment);
        } else {
            return this;
        }
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return (Intrinsics.areEqual(k, keyAtIndex(entryKeyIndex$kotlinx_collections_immutable)) && Intrinsics.areEqual(v, valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable))) ? mutableRemoveEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment, mutator) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode<K, V> nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$kotlinx_collections_immutable.mutableCollisionRemove(k, v, mutator);
            } else {
                mutableRemove = nodeAtIndex$kotlinx_collections_immutable.mutableRemove(i, k, v, i2 + 5, mutator);
            }
            return mutableReplaceNode(nodeAtIndex$kotlinx_collections_immutable, mutableRemove, nodeIndex$kotlinx_collections_immutable, indexSegment, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            return this;
        }
    }

    public final <K1, V1> boolean equalsWith$kotlinx_collections_immutable(TrieNode<K1, V1> that, Function2<? super V, ? super V1, Boolean> equalityComparator) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(that, "that");
        Intrinsics.checkNotNullParameter(equalityComparator, "equalityComparator");
        if (this == that) {
            return true;
        }
        int i2 = this.dataMap;
        if (i2 == that.dataMap && (i = this.nodeMap) == that.nodeMap) {
            if (i2 == 0 && i == 0) {
                Object[] objArr = this.buffer;
                if (objArr.length != that.buffer.length) {
                    return false;
                }
                IntProgression step = RangesKt.step(RangesKt.until(0, objArr.length), 2);
                if ((step instanceof Collection) && ((Collection) step).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = step.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    K1 keyAtIndex = that.keyAtIndex(nextInt);
                    V1 valueAtKeyIndex = that.valueAtKeyIndex(nextInt);
                    int collisionKeyIndex = collisionKeyIndex(keyAtIndex);
                    if (collisionKeyIndex != -1) {
                        z = equalityComparator.invoke(valueAtKeyIndex(collisionKeyIndex), valueAtKeyIndex).booleanValue();
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }
            int bitCount = Integer.bitCount(i2) * 2;
            IntProgression step2 = RangesKt.step(RangesKt.until(0, bitCount), 2);
            int first = step2.getFirst();
            int last = step2.getLast();
            int step3 = step2.getStep();
            if ((step3 > 0 && first <= last) || (step3 < 0 && last <= first)) {
                while (true) {
                    int i3 = first + step3;
                    if (!Intrinsics.areEqual(keyAtIndex(first), that.keyAtIndex(first)) || !equalityComparator.invoke(valueAtKeyIndex(first), that.valueAtKeyIndex(first)).booleanValue()) {
                        return false;
                    }
                    if (first == last) {
                        break;
                    }
                    first = i3;
                }
            }
            int length = this.buffer.length;
            while (bitCount < length) {
                int i4 = bitCount + 1;
                if (!nodeAtIndex$kotlinx_collections_immutable(bitCount).equalsWith$kotlinx_collections_immutable(that.nodeAtIndex$kotlinx_collections_immutable(bitCount), equalityComparator)) {
                    return false;
                }
                bitCount = i4;
            }
            return true;
        }
        return false;
    }

    public final void accept$kotlinx_collections_immutable(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        accept(visitor, 0, 0);
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5, int i, int i2) {
        function5.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i3 = this.nodeMap;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(lowestOneBit)).accept(function5, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$kotlinx_collections_immutable() {
            return TrieNode.EMPTY;
        }
    }
}
