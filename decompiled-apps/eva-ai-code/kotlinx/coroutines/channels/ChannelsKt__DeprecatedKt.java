package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", Languages.ANY, "", ExifInterface.LONGITUDE_EAST, "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", FirebaseAnalytics.Param.INDEX, "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class ChannelsKt__DeprecatedKt {
    public static final Function1<Throwable, Unit> consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new ChannelsKt__DeprecatedKt$consumesAll$1(receiveChannelArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006d A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:60:0x0036, B:73:0x0065, B:75:0x006d, B:81:0x007e, B:82:0x0095), top: B:94:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007e A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #2 {all -> 0x003a, blocks: (B:60:0x0036, B:73:0x0065, B:75:0x006d, B:81:0x007e, B:82:0x0095), top: B:94:0x0036 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0060 -> B:73:0x0065). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAt(ReceiveChannel receiveChannel, int i, Continuation continuation) {
        ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$1;
        int i2;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        int i3;
        Object hasNext;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$elementAt$1) {
                channelsKt__DeprecatedKt$elementAt$1 = (ChannelsKt__DeprecatedKt$elementAt$1) continuation;
                if ((channelsKt__DeprecatedKt$elementAt$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$elementAt$1.label -= Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$elementAt$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = channelsKt__DeprecatedKt$elementAt$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (i < 0) {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + ClassUtils.PACKAGE_SEPARATOR_CHAR);
                        }
                        it = receiveChannel.iterator();
                        i3 = 0;
                        channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                        channelsKt__DeprecatedKt$elementAt$1.I$0 = i;
                        channelsKt__DeprecatedKt$elementAt$1.I$1 = i3;
                        channelsKt__DeprecatedKt$elementAt$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        int i4 = channelsKt__DeprecatedKt$elementAt$1.I$1;
                        i = channelsKt__DeprecatedKt$elementAt$1.I$0;
                        ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.L$1;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = channelIterator.next();
                                int i5 = i4 + 1;
                                if (i == i4) {
                                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return next;
                                }
                                it = channelIterator;
                                receiveChannel = receiveChannel2;
                                i3 = i5;
                                channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                                channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                                channelsKt__DeprecatedKt$elementAt$1.I$0 = i;
                                channelsKt__DeprecatedKt$elementAt$1.I$1 = i3;
                                channelsKt__DeprecatedKt$elementAt$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel;
                                i4 = i3;
                                channelIterator = it;
                                obj = hasNext;
                                if (!((Boolean) obj).booleanValue()) {
                                    throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + ClassUtils.PACKAGE_SEPARATOR_CHAR);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
        }
        channelsKt__DeprecatedKt$elementAt$1 = new ChannelsKt__DeprecatedKt$elementAt$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$elementAt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAt$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:76:0x006b, B:78:0x0073, B:72:0x0055, B:71:0x0050), top: B:92:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0066 -> B:76:0x006b). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAtOrNull(ReceiveChannel receiveChannel, int i, Continuation continuation) {
        ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$1;
        int i2;
        ChannelIterator it;
        int i3;
        Throwable th;
        ReceiveChannel receiveChannel2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$elementAtOrNull$1) {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = (ChannelsKt__DeprecatedKt$elementAtOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$elementAtOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$elementAtOrNull$1.label -= Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i >= 0) {
                        try {
                            it = receiveChannel.iterator();
                            i3 = 0;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                            throw th;
                        }
                    } else {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i4 = channelsKt__DeprecatedKt$elementAtOrNull$1.I$1;
                    i = channelsKt__DeprecatedKt$elementAtOrNull$1.I$0;
                    ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i3 = i4;
                        receiveChannel = receiveChannel2;
                        Object obj2 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                        ChannelIterator channelIterator2 = channelIterator;
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = channelIterator2.next();
                            int i5 = i3 + 1;
                            if (i == i3) {
                                ChannelsKt.cancelConsumed(receiveChannel, null);
                                return next;
                            }
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$elementAtOrNull$1 = channelsKt__DeprecatedKt$elementAtOrNull$12;
                            coroutine_suspended = obj2;
                            i3 = i5;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$13 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            obj2 = coroutine_suspended;
                            channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$13;
                            if (!((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel, null);
                                return null;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$elementAtOrNull$1 = new ChannelsKt__DeprecatedKt$elementAtOrNull$1(continuation);
        Object obj3 = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:53:0x002e, B:64:0x0054, B:66:0x005c, B:69:0x0065, B:70:0x006c), top: B:79:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:53:0x002e, B:64:0x0054, B:66:0x005c, B:69:0x0065, B:70:0x006c), top: B:79:0x002e }] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object first(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (continuation instanceof ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (ChannelsKt__DeprecatedKt$first$1) continuation;
            if ((channelsKt__DeprecatedKt$first$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$first$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$first$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$first$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$first$1.L$1 = it;
                        channelsKt__DeprecatedKt$first$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$first$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$first$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$first$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$first$1 = new ChannelsKt__DeprecatedKt$first$1(continuation);
        obj = channelsKt__DeprecatedKt$first$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$first$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0061 A[Catch: all -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:55:0x002e, B:66:0x0054, B:71:0x0061), top: B:80:0x002e }] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object firstOrNull(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (continuation instanceof ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (ChannelsKt__DeprecatedKt$firstOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$firstOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$firstOrNull$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$firstOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$firstOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$firstOrNull$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$firstOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return next;
                }
                ChannelsKt.cancelConsumed(receiveChannel2, null);
                return null;
            }
        }
        channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$firstOrNull$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0071 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:59:0x0034, B:72:0x0068, B:74:0x0071, B:76:0x007b, B:79:0x0085, B:68:0x0054, B:80:0x008c), top: B:91:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008c A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:59:0x0034, B:72:0x0068, B:74:0x0071, B:76:0x007b, B:79:0x0085, B:68:0x0054, B:80:0x008c), top: B:91:0x0034 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0065 -> B:72:0x0068). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object indexOf(ReceiveChannel receiveChannel, Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$indexOf$1 channelsKt__DeprecatedKt$indexOf$1;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref.IntRef intRef;
        Object obj2;
        Object hasNext;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$indexOf$1) {
                channelsKt__DeprecatedKt$indexOf$1 = (ChannelsKt__DeprecatedKt$indexOf$1) continuation;
                if ((channelsKt__DeprecatedKt$indexOf$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$indexOf$1.label -= Integer.MIN_VALUE;
                    Object obj3 = channelsKt__DeprecatedKt$indexOf$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$indexOf$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj3);
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        try {
                            receiveChannel2 = receiveChannel;
                            it = receiveChannel.iterator();
                            intRef = intRef2;
                            obj2 = obj;
                            channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$indexOf$1.L$1 = intRef;
                            channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                            channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                            channelsKt__DeprecatedKt$indexOf$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.L$3;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.L$2;
                        intRef = (Ref.IntRef) channelsKt__DeprecatedKt$indexOf$1.L$1;
                        Object obj4 = channelsKt__DeprecatedKt$indexOf$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            if (((Boolean) obj3).booleanValue()) {
                                if (Intrinsics.areEqual(obj4, it.next())) {
                                    Integer boxInt = Boxing.boxInt(intRef.element);
                                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return boxInt;
                                }
                                intRef.element++;
                                obj2 = obj4;
                                channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                                channelsKt__DeprecatedKt$indexOf$1.L$1 = intRef;
                                channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                                channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                                channelsKt__DeprecatedKt$indexOf$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj4 = obj2;
                                obj3 = hasNext;
                                if (((Boolean) obj3).booleanValue()) {
                                }
                            } else {
                                Unit unit = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return Boxing.boxInt(-1);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.cancelConsumed(receiveChannel2, th);
            throw th4;
        }
        channelsKt__DeprecatedKt$indexOf$1 = new ChannelsKt__DeprecatedKt$indexOf$1(continuation);
        Object obj32 = channelsKt__DeprecatedKt$indexOf$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$indexOf$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009e A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #3 {all -> 0x004f, blocks: (B:78:0x004b, B:87:0x0069, B:89:0x0071, B:101:0x009e, B:102:0x00a5), top: B:115:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0071 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:78:0x004b, B:87:0x0069, B:89:0x0071, B:101:0x009e, B:102:0x00a5), top: B:115:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:71:0x0033, B:95:0x008b, B:97:0x0093), top: B:111:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0087 -> B:95:0x008b). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object last(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$last$1) {
            channelsKt__DeprecatedKt$last$1 = (ChannelsKt__DeprecatedKt$last$1) continuation;
            if ((channelsKt__DeprecatedKt$last$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$last$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$last$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$last$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$last$1.L$1 = it;
                        channelsKt__DeprecatedKt$last$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$last$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = channelsKt__DeprecatedKt$last$1.L$2;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$last$1.L$2 = next;
                            channelsKt__DeprecatedKt$last$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$last$1.L$2 = next;
                channelsKt__DeprecatedKt$last$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$last$1 = new ChannelsKt__DeprecatedKt$last$1(continuation);
        obj = channelsKt__DeprecatedKt$last$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$last$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:58:0x0038, B:71:0x0076, B:73:0x007e, B:75:0x0088, B:76:0x008c, B:67:0x0060, B:77:0x0093), top: B:90:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:58:0x0038, B:71:0x0076, B:73:0x007e, B:75:0x0088, B:76:0x008c, B:67:0x0060, B:77:0x0093), top: B:90:0x0038 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0073 -> B:71:0x0076). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastIndexOf(ReceiveChannel receiveChannel, Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$lastIndexOf$1 channelsKt__DeprecatedKt$lastIndexOf$1;
        int i;
        Ref.IntRef intRef;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref.IntRef intRef2;
        Object obj2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$lastIndexOf$1) {
            channelsKt__DeprecatedKt$lastIndexOf$1 = (ChannelsKt__DeprecatedKt$lastIndexOf$1) continuation;
            if ((channelsKt__DeprecatedKt$lastIndexOf$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastIndexOf$1.label -= Integer.MIN_VALUE;
                Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$lastIndexOf$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    intRef3.element = -1;
                    intRef = new Ref.IntRef();
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        intRef2 = intRef3;
                        obj2 = obj;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = intRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = intRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.L$4;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.L$3;
                    intRef = (Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$2;
                    intRef2 = (Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$1;
                    Object obj4 = channelsKt__DeprecatedKt$lastIndexOf$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        if (((Boolean) obj3).booleanValue()) {
                            if (Intrinsics.areEqual(obj4, it.next())) {
                                intRef2.element = intRef.element;
                            }
                            intRef.element++;
                            obj2 = obj4;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = intRef2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = intRef;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                            channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj4 = obj2;
                            obj3 = hasNext;
                            if (((Boolean) obj3).booleanValue()) {
                            }
                        } else {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return Boxing.boxInt(intRef2.element);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$lastIndexOf$1 = new ChannelsKt__DeprecatedKt$lastIndexOf$1(continuation);
        Object obj32 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastIndexOf$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0098 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:72:0x0034, B:98:0x0090, B:100:0x0098), top: B:116:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0076 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:79:0x004c, B:88:0x006a, B:92:0x0076), top: B:110:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008c -> B:98:0x0090). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastOrNull(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$lastOrNull$1) {
            channelsKt__DeprecatedKt$lastOrNull$1 = (ChannelsKt__DeprecatedKt$lastOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$lastOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$lastOrNull$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$lastOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$lastOrNull$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = channelsKt__DeprecatedKt$lastOrNull$1.L$2;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                            channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                    channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$lastOrNull$1 = new ChannelsKt__DeprecatedKt$lastOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastOrNull$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:76:0x0047, B:85:0x0065, B:87:0x006d, B:97:0x0097, B:98:0x009e), top: B:109:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008f A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:69:0x002f, B:91:0x0082, B:95:0x008f, B:96:0x0096), top: B:107:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0097 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #2 {all -> 0x004b, blocks: (B:76:0x0047, B:85:0x0065, B:87:0x006d, B:97:0x0097, B:98:0x009e), top: B:109:0x0047 }] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object single(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (continuation instanceof ChannelsKt__DeprecatedKt$single$1) {
            channelsKt__DeprecatedKt$single$1 = (ChannelsKt__DeprecatedKt$single$1) continuation;
            if ((channelsKt__DeprecatedKt$single$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$single$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$single$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$single$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$single$1.L$1 = it;
                        channelsKt__DeprecatedKt$single$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$single$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        obj2 = channelsKt__DeprecatedKt$single$1.L$1;
                        receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                            }
                            ChannelsKt.cancelConsumed(receiveChannel3, null);
                            return obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$single$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel2;
                channelsKt__DeprecatedKt$single$1.L$1 = next;
                channelsKt__DeprecatedKt$single$1.label = 2;
                Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$single$1);
                if (hasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj = hasNext2;
                obj2 = next;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }
        channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1(continuation);
        obj = channelsKt__DeprecatedKt$single$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$single$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:77:0x0048, B:86:0x0066, B:90:0x0072), top: B:112:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0093  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object singleOrNull(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (continuation instanceof ChannelsKt__DeprecatedKt$singleOrNull$1) {
            channelsKt__DeprecatedKt$singleOrNull$1 = (ChannelsKt__DeprecatedKt$singleOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$singleOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$singleOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$singleOrNull$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$singleOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$singleOrNull$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        obj2 = channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                        receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                            ChannelsKt.cancelConsumed(receiveChannel3, null);
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel2;
                    channelsKt__DeprecatedKt$singleOrNull$1.L$1 = next;
                    channelsKt__DeprecatedKt$singleOrNull$1.label = 2;
                    Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                    if (hasNext2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    receiveChannel3 = receiveChannel2;
                    obj = hasNext2;
                    obj2 = next;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$singleOrNull$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        ReceiveChannel drop;
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        drop = drop(receiveChannel, i, coroutineContext);
        return drop;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$drop$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        ReceiveChannel dropWhile;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        dropWhile = dropWhile(receiveChannel, coroutineContext, function2);
        return dropWhile;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filter$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        ReceiveChannel filterIndexed;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        filterIndexed = filterIndexed(receiveChannel, coroutineContext, function3);
        return filterIndexed;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        ReceiveChannel filterNot;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        filterNot = filterNot(receiveChannel, coroutineContext, function2);
        return filterNot;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filter(receiveChannel, coroutineContext, new ChannelsKt__DeprecatedKt$filterNot$1(function2, null));
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> filter$default;
        filter$default = filter$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$filterNotNull$1(null), 1, null);
        Intrinsics.checkNotNull(filter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return filter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0065 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:58:0x0032, B:71:0x005d, B:73:0x0065, B:75:0x006b, B:67:0x004b, B:77:0x0070), top: B:86:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:58:0x0032, B:71:0x005d, B:73:0x0065, B:75:0x006b, B:67:0x004b, B:77:0x0070), top: B:86:0x0032 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x005a -> B:71:0x005d). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$1;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Collection collection2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$1) {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = (ChannelsKt__DeprecatedKt$filterNotNullTo$1) continuation;
            if ((channelsKt__DeprecatedKt$filterNotNullTo$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$filterNotNullTo$1.label -= Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        collection2 = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.L$1;
                    Collection collection3 = (Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return collection3;
                        }
                        Object next = it.next();
                        if (next != null) {
                            collection3.add(next);
                        }
                        collection2 = collection3;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection3 = collection2;
                        obj = hasNext;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$filterNotNullTo$1 = new ChannelsKt__DeprecatedKt$filterNotNullTo$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:64:0x0035, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:69:0x004d), top: B:96:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:64:0x0035, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:69:0x004d), top: B:96:0x0023 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x007a -> B:86:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0088 -> B:86:0x008b). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$3 channelsKt__DeprecatedKt$filterNotNullTo$3;
        int i;
        ChannelIterator it;
        ChannelIterator channelIterator;
        SendChannel sendChannel2;
        SendChannel sendChannel3;
        Object hasNext;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$3) {
                channelsKt__DeprecatedKt$filterNotNullTo$3 = (ChannelsKt__DeprecatedKt$filterNotNullTo$3) continuation;
                if ((channelsKt__DeprecatedKt$filterNotNullTo$3.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$filterNotNullTo$3.label -= Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel3 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            sendChannel = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ChannelsKt.cancelConsumed(sendChannel, th);
                                throw th2;
                            }
                        }
                    } else if (i == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        sendChannel = receiveChannel2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel receiveChannel4 = receiveChannel3;
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        sendChannel3 = sendChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SendChannel sendChannel4 = sendChannel3;
                        sendChannel = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                        sendChannel2 = sendChannel4;
                        if (((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(sendChannel, null);
                            return sendChannel2;
                        }
                        Object next = channelIterator.next();
                        receiveChannel4 = sendChannel;
                        if (next != null) {
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel2;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = channelIterator;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 2;
                            receiveChannel4 = sendChannel;
                            if (sendChannel2.send(next, channelsKt__DeprecatedKt$filterNotNullTo$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        sendChannel3 = sendChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$filterNotNullTo$3 = new ChannelsKt__DeprecatedKt$filterNotNullTo$3(continuation);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        ReceiveChannel take;
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        take = take(receiveChannel, i, coroutineContext);
        return take;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$take$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        ReceiveChannel takeWhile;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        takeWhile = takeWhile(receiveChannel, coroutineContext, function2);
        return takeWhile;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, function2, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0079 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:61:0x0035, B:76:0x0071, B:78:0x0079, B:81:0x008c, B:66:0x0050), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008c A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:61:0x0035, B:76:0x0071, B:78:0x0079, B:81:0x008c, B:66:0x0050), top: B:92:0x0023 }] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0089 -> B:62:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c, Continuation<? super C> continuation) {
        ChannelsKt__DeprecatedKt$toChannel$1 channelsKt__DeprecatedKt$toChannel$1;
        int i;
        ChannelIterator<? extends E> it;
        ChannelIterator<? extends E> channelIterator;
        SendChannel sendChannel;
        C c2;
        Object hasNext;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$toChannel$1) {
                channelsKt__DeprecatedKt$toChannel$1 = (ChannelsKt__DeprecatedKt$toChannel$1) continuation;
                if ((channelsKt__DeprecatedKt$toChannel$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$toChannel$1.label -= Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$toChannel$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$toChannel$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            c2 = c;
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = c2;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                            channelsKt__DeprecatedKt$toChannel$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            c = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ChannelsKt.cancelConsumed(c, th);
                                throw th2;
                            }
                        }
                    } else if (i == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        C c3 = (C) ((ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        sendChannel = (SendChannel) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        c = c3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        ?? r7 = (C) ((ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        sendChannel = (SendChannel) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel<? extends E> receiveChannel2 = r7;
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        c2 = (C) sendChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$0 = c2;
                        channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                        channelsKt__DeprecatedKt$toChannel$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelIterator = it;
                        obj = hasNext;
                        sendChannel = c2;
                        c = (C) receiveChannel;
                        if (!((Boolean) obj).booleanValue()) {
                            E next = channelIterator.next();
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = sendChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = (Object) c;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = channelIterator;
                            channelsKt__DeprecatedKt$toChannel$1.label = 2;
                            receiveChannel2 = c;
                            if (sendChannel.send(next, channelsKt__DeprecatedKt$toChannel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = channelIterator;
                            receiveChannel = receiveChannel2;
                            c2 = (C) sendChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = c2;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                            channelsKt__DeprecatedKt$toChannel$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed((ReceiveChannel) c, null);
                            return sendChannel;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$toChannel$1 = new ChannelsKt__DeprecatedKt$toChannel$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toChannel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toChannel$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:55:0x0032, B:68:0x005d, B:70:0x0065, B:64:0x004b, B:71:0x006e), top: B:82:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:55:0x0032, B:68:0x005d, B:70:0x0065, B:64:0x004b, B:71:0x006e), top: B:82:0x0032 }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x005a -> B:68:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c, Continuation<? super C> continuation) {
        ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$1;
        int i;
        ReceiveChannel<? extends E> receiveChannel2;
        Throwable th;
        ChannelIterator<? extends E> it;
        C c2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$toCollection$1) {
            channelsKt__DeprecatedKt$toCollection$1 = (ChannelsKt__DeprecatedKt$toCollection$1) continuation;
            if ((channelsKt__DeprecatedKt$toCollection$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toCollection$1.label -= Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toCollection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toCollection$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        c2 = c;
                        channelsKt__DeprecatedKt$toCollection$1.L$0 = c2;
                        channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                        channelsKt__DeprecatedKt$toCollection$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ChannelIterator<? extends E> channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toCollection$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toCollection$1.L$1;
                    ?? r2 = (Collection) channelsKt__DeprecatedKt$toCollection$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        C c3 = r2;
                        ChannelIterator<? extends E> channelIterator2 = channelIterator;
                        if (!((Boolean) obj).booleanValue()) {
                            c3.add(channelIterator2.next());
                            c2 = c3;
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$toCollection$1.L$0 = c2;
                            channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                            channelsKt__DeprecatedKt$toCollection$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c3 = c2;
                            obj = hasNext;
                            channelIterator2 = it;
                            if (!((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return c3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$toCollection$1 = new ChannelsKt__DeprecatedKt$toCollection$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toCollection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toCollection$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:55:0x0032, B:68:0x005d, B:70:0x0065, B:64:0x004b, B:71:0x0078), top: B:82:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0078 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:55:0x0032, B:68:0x005d, B:70:0x0065, B:64:0x004b, B:71:0x0078), top: B:82:0x0032 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x005a -> B:68:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, M m, Continuation<? super M> continuation) {
        ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$2;
        int i;
        ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel2;
        Throwable th;
        ChannelIterator<? extends Pair<? extends K, ? extends V>> it;
        M m2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$toMap$2) {
            channelsKt__DeprecatedKt$toMap$2 = (ChannelsKt__DeprecatedKt$toMap$2) continuation;
            if ((channelsKt__DeprecatedKt$toMap$2.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toMap$2.label -= Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toMap$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toMap$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        m2 = m;
                        channelsKt__DeprecatedKt$toMap$2.L$0 = m2;
                        channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                        channelsKt__DeprecatedKt$toMap$2.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ChannelIterator<? extends Pair<? extends K, ? extends V>> channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toMap$2.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.L$1;
                    Map map = (Map) channelsKt__DeprecatedKt$toMap$2.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Map map2 = map;
                        ChannelIterator<? extends Pair<? extends K, ? extends V>> channelIterator2 = channelIterator;
                        if (!((Boolean) obj).booleanValue()) {
                            Pair<? extends K, ? extends V> next = channelIterator2.next();
                            map2.put(next.getFirst(), next.getSecond());
                            m2 = map2;
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$toMap$2.L$0 = m2;
                            channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                            channelsKt__DeprecatedKt$toMap$2.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            map2 = m2;
                            obj = hasNext;
                            channelIterator2 = it;
                            if (!((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return map2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$toMap$2 = new ChannelsKt__DeprecatedKt$toMap$2(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toMap$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toMap$2.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        ReceiveChannel flatMap;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        flatMap = flatMap(receiveChannel, coroutineContext, function2);
        return flatMap;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$map$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        ReceiveChannel mapIndexedNotNull;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        mapIndexedNotNull = mapIndexedNotNull(receiveChannel, coroutineContext, function3);
        return mapIndexedNotNull;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        ReceiveChannel mapNotNull;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        mapNotNull = mapNotNull(receiveChannel, coroutineContext, function2);
        return mapNotNull;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i, Object obj) {
        ReceiveChannel withIndex;
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        withIndex = withIndex(receiveChannel, coroutineContext);
        return withIndex;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, function2, null), 6, null);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, Continuation<? super Set<E>> continuation) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object any(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$any$1 channelsKt__DeprecatedKt$any$1;
        int i;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$any$1) {
                channelsKt__DeprecatedKt$any$1 = (ChannelsKt__DeprecatedKt$any$1) continuation;
                if ((channelsKt__DeprecatedKt$any$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$any$1.label -= Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$any$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$any$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$any$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$any$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$any$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$any$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return obj;
        } finally {
        }
        channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$any$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$any$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:59:0x0032, B:72:0x0061, B:74:0x0069, B:75:0x0073), top: B:90:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0073 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:59:0x0032, B:72:0x0061, B:74:0x0069, B:75:0x0073), top: B:90:0x0032 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x005e -> B:72:0x0061). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object count(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$count$1 channelsKt__DeprecatedKt$count$1;
        int i;
        ReceiveChannel receiveChannel2;
        Throwable th;
        Ref.IntRef intRef;
        ReceiveChannel receiveChannel3;
        ChannelIterator it;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$count$1) {
            channelsKt__DeprecatedKt$count$1 = (ChannelsKt__DeprecatedKt$count$1) continuation;
            if ((channelsKt__DeprecatedKt$count$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$count$1.label -= Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$count$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$count$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        intRef = new Ref.IntRef();
                        receiveChannel3 = receiveChannel;
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$count$1.L$0 = intRef;
                        channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                        channelsKt__DeprecatedKt$count$1.L$2 = it;
                        channelsKt__DeprecatedKt$count$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (ChannelIterator) channelsKt__DeprecatedKt$count$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$count$1.L$1;
                    intRef = (Ref.IntRef) channelsKt__DeprecatedKt$count$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            intRef.element++;
                            receiveChannel3 = receiveChannel2;
                            try {
                                channelsKt__DeprecatedKt$count$1.L$0 = intRef;
                                channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                                channelsKt__DeprecatedKt$count$1.L$2 = it;
                                channelsKt__DeprecatedKt$count$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel3;
                                obj = hasNext;
                                if (!((Boolean) obj).booleanValue()) {
                                    Unit unit = Unit.INSTANCE;
                                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return Boxing.boxInt(intRef.element);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$count$1 = new ChannelsKt__DeprecatedKt$count$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$count$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$count$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ad A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:103:0x00a5, B:105:0x00ad, B:99:0x0090, B:89:0x0064), top: B:118:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:84:0x005a, B:93:0x007c, B:97:0x0088), top: B:124:0x005a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a1 -> B:78:0x003e). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object maxWith(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) {
        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$maxWith$1) {
            channelsKt__DeprecatedKt$maxWith$1 = (ChannelsKt__DeprecatedKt$maxWith$1) continuation;
            if ((channelsKt__DeprecatedKt$maxWith$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$maxWith$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$maxWith$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$maxWith$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$maxWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$maxWith$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator2 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = channelsKt__DeprecatedKt$maxWith$1.L$3;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator3 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                        Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        Object obj4 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$13 = channelsKt__DeprecatedKt$maxWith$12;
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) >= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$maxWith$1 = channelsKt__DeprecatedKt$maxWith$13;
                            coroutine_suspended = obj4;
                            channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$maxWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                            obj3 = next;
                            obj = hasNext;
                            Object obj42 = coroutine_suspended;
                            ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$132 = channelsKt__DeprecatedKt$maxWith$12;
                            if (!((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    comparator3 = comparator2;
                    ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                    channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                    channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                    channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                    channelsKt__DeprecatedKt$maxWith$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$maxWith$1 = new ChannelsKt__DeprecatedKt$maxWith$1(continuation);
        obj = channelsKt__DeprecatedKt$maxWith$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$maxWith$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ad A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:103:0x00a5, B:105:0x00ad, B:99:0x0090, B:89:0x0064), top: B:118:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:84:0x005a, B:93:0x007c, B:97:0x0088), top: B:124:0x005a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a1 -> B:78:0x003e). Please submit an issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object minWith(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) {
        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$1;
        Object obj;
        int i;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (continuation instanceof ChannelsKt__DeprecatedKt$minWith$1) {
            channelsKt__DeprecatedKt$minWith$1 = (ChannelsKt__DeprecatedKt$minWith$1) continuation;
            if ((channelsKt__DeprecatedKt$minWith$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$minWith$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$minWith$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$minWith$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$minWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$minWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$minWith$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$minWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator2 = (Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = channelsKt__DeprecatedKt$minWith$1.L$3;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator3 = (Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                        Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        Object obj4 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$13 = channelsKt__DeprecatedKt$minWith$12;
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) <= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$minWith$1 = channelsKt__DeprecatedKt$minWith$13;
                            coroutine_suspended = obj4;
                            channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$minWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                            obj3 = next;
                            obj = hasNext;
                            Object obj42 = coroutine_suspended;
                            ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$132 = channelsKt__DeprecatedKt$minWith$12;
                            if (!((Boolean) obj).booleanValue()) {
                                ChannelsKt.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    comparator3 = comparator2;
                    ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                    channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                    channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                    channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                    channelsKt__DeprecatedKt$minWith$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$minWith$1 = new ChannelsKt__DeprecatedKt$minWith$1(continuation);
        obj = channelsKt__DeprecatedKt$minWith$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$minWith$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object none(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$none$1 channelsKt__DeprecatedKt$none$1;
        Object obj;
        int i;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$none$1) {
                channelsKt__DeprecatedKt$none$1 = (ChannelsKt__DeprecatedKt$none$1) continuation;
                if ((channelsKt__DeprecatedKt$none$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$none$1.label -= Integer.MIN_VALUE;
                    obj = channelsKt__DeprecatedKt$none$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$none$1.label;
                    boolean z = true;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$none$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$none$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$none$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$none$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        z = false;
                    }
                    Boolean boxBoolean = Boxing.boxBoolean(z);
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return boxBoolean;
                }
            }
            if (i != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
            Boolean boxBoolean2 = Boxing.boxBoolean(z);
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return boxBoolean2;
        } finally {
        }
        channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1(continuation);
        obj = channelsKt__DeprecatedKt$none$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$none$1.label;
        boolean z2 = true;
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, CoroutineContext coroutineContext, Function2<? super E, ? super R, ? extends V> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, function2, null), 6, null);
    }

    public static final Function1<Throwable, Unit> consumes(ReceiveChannel<?> receiveChannel) {
        return new ChannelsKt__DeprecatedKt$consumes$1(receiveChannel);
    }
}
