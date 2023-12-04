package kotlinx.coroutines.channels;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.Longs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.KeychainModule;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\"\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004Þ\u0001ß\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\"\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002ø\u0001\u0000J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0013\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001J%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001JD\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ2\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J\u001f\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0084\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J;\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J!\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J*\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J(\u0010Ç\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J5\u0010Ê\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Ë\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Ì\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001JK\u0010Ï\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001J\u0012\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Ó\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÔ\u0001J$\u0010Õ\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ö\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Û\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Ü\u0001J#\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006à\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", "", "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", "", "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", "", "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", KeychainModule.AuthPromptOptions.CANCEL, "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", FirebaseAnalytics.Param.INDEX, "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "r", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", "i", "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", "value", "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BufferedChannel<E> implements Channel<E> {
    @Volatile
    private volatile Object _closeCause;
    @Volatile
    private volatile long bufferEnd;
    @Volatile
    private volatile Object bufferEndSegment;
    private final int capacity;
    @Volatile
    private volatile Object closeHandler;
    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    public final Function1<E, Unit> onUndeliveredElement;
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    @Volatile
    private volatile Object receiveSegment;
    @Volatile
    private volatile long receivers;
    @Volatile
    private volatile Object sendSegment;
    @Volatile
    private volatile long sendersAndCloseStatus;
    private static final AtomicLongFieldUpdater sendersAndCloseStatus$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater receivers$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");
    private static final AtomicLongFieldUpdater bufferEnd$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");
    private static final AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater sendSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater receiveSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");
    private static final AtomicReferenceFieldUpdater bufferEndSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater _closeCause$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater closeHandler$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");

    private final Object getAndUpdate$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
        return obj2;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void update$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1, Object obj) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, function1.invoke(Long.valueOf(j)).longValue()));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU  reason: not valid java name */
    public Object mo8821receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        return m8819receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, Continuation<? super Unit> continuation) {
        return send$suspendImpl(this, e, continuation);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, Function1<? super E, Unit> function1) {
        long initialBufferEnd;
        Symbol symbol;
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            initialBufferEnd = BufferedChannelKt.initialBufferEnd(i);
            this.bufferEnd = initialBufferEnd;
            this.completedExpandBuffersAndPauseFlag = getBufferEndCounter();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment = channelSegment;
            this.receiveSegment = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = BufferedChannelKt.NULL_SEGMENT;
                Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1(this) : null;
            symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
            this._closeCause = symbol;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    public /* synthetic */ BufferedChannel(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return Channel.DefaultImpls.offer(this, e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$FU.get(this) & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$FU.get(this);
    }

    private final long getBufferEndCounter() {
        return bufferEnd$FU.get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Unit> continuation) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                ChannelSegment<E> findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    Object onClosedSend = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend;
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, null, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            } else if (updateCellSend == 1) {
                break;
            } else if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i, e, j, continuation);
                    if (sendOnNoWaiterSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return sendOnNoWaiterSuspend;
                    }
                } else if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object onClosedSend2 = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend2;
                    }
                }
            } else if (!isClosedForSend0) {
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    throw new AssertionError();
                }
            } else {
                channelSegment.onSlotCleaned();
                Object onClosedSend3 = bufferedChannel.onClosedSend(e, continuation);
                if (onClosedSend3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return onClosedSend3;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E e, CancellableContinuation<? super Unit> cancellableContinuation) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, e, cancellableContinuation.getContext());
        }
        CancellableContinuation<? super Unit> cancellableContinuation2 = cancellableContinuation;
        Throwable sendException = getSendException();
        if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation2 instanceof CoroutineStackFrame)) {
            sendException = StackTraceRecoveryKt.recoverFromStackFrame(sendException, (CoroutineStackFrame) cancellableContinuation2);
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuation2.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(sendException)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
        return kotlinx.coroutines.channels.ChannelResult.Companion.m8842successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8817trySendJP2dKIU(E e) {
        Symbol symbol;
        ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$FU.get(this))) {
            return ChannelResult.Companion.m8841failurePtdJZtk();
        }
        symbol = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, e, j, symbol, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            } else if (updateCellSend == 1) {
                break;
            } else if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                Waiter waiter = symbol instanceof Waiter ? (Waiter) symbol : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                }
                channelSegment.onSlotCleaned();
                return ChannelResult.Companion.m8841failurePtdJZtk();
            }
        }
        return ChannelResult.Companion.m8840closedJP2dKIU(getSendException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", FirebaseAnalytics.Param.INDEX, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.$$delegate_0.invokeOnCancellation(segment, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.cont = cancellableContinuation;
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, Function0 function0, Function2 function2, Function0 function02, Function4 function4, int i, Object obj3) {
        ChannelSegment channelSegment;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        BufferedChannel$sendImpl$1 bufferedChannel$sendImpl$1 = (i & 32) != 0 ? BufferedChannel$sendImpl$1.INSTANCE : function4;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return function02.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i2, obj, j, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            } else if (updateCellSend == 1) {
                return function0.invoke();
            } else {
                if (updateCellSend == 2) {
                    if (isClosedForSend0) {
                        channelSegment.onSlotCleaned();
                        return function02.invoke();
                    }
                    Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                    if (waiter != null) {
                        bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i2);
                    }
                    return function2.invoke(channelSegment, Integer.valueOf(i2));
                } else if (updateCellSend == 3) {
                    return bufferedChannel$sendImpl$1.invoke(channelSegment, Integer.valueOf(i2), obj, Long.valueOf(j));
                } else {
                    if (updateCellSend == 4) {
                        if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        return function02.invoke();
                    }
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                }
            }
        }
    }

    protected final <R> R sendImpl(E e, Object obj, Function0<? extends R> function0, Function2<? super ChannelSegment<E>, ? super Integer, ? extends R> function2, Function0<? extends R> function02, Function4<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> function4) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return function02.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, e, j, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            } else if (updateCellSend == 1) {
                return function0.invoke();
            } else {
                if (updateCellSend == 2) {
                    if (isClosedForSend0) {
                        channelSegment.onSlotCleaned();
                        return function02.invoke();
                    }
                    Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                    if (waiter != null) {
                        prepareSenderForSuspension(waiter, channelSegment, i);
                    }
                    return function2.invoke(channelSegment, Integer.valueOf(i));
                } else if (updateCellSend == 3) {
                    return function4.invoke(channelSegment, Integer.valueOf(i), e, Long.valueOf(j));
                } else {
                    if (updateCellSend == 4) {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        return function02.invoke();
                    }
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                }
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, E e, long j, Waiter waiter, Function0<Unit> function0, Function0<Unit> function02) {
        ChannelSegment channelSegment2;
        Waiter waiter2 = waiter;
        int updateCellSend = updateCellSend(channelSegment, i, e, j, waiter, false);
        if (updateCellSend == 0) {
            channelSegment.cleanPrev();
            function0.invoke();
        } else if (updateCellSend == 1) {
            function0.invoke();
        } else if (updateCellSend == 2) {
            prepareSenderForSuspension(waiter2, channelSegment, i);
        } else if (updateCellSend == 4) {
            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            function02.invoke();
        } else if (updateCellSend == 5) {
            channelSegment.cleanPrev();
            ChannelSegment channelSegment3 = (ChannelSegment) sendSegment$FU.get(this);
            while (true) {
                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                long j3 = j2 / BufferedChannelKt.SEGMENT_SIZE;
                int i2 = (int) (j2 % BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment3.id != j3) {
                    ChannelSegment findSegmentSend = findSegmentSend(j3, channelSegment3);
                    if (findSegmentSend != null) {
                        channelSegment2 = findSegmentSend;
                    } else if (isClosedForSend0) {
                        function02.invoke();
                        return;
                    }
                } else {
                    channelSegment2 = channelSegment3;
                }
                ChannelSegment channelSegment4 = channelSegment2;
                int updateCellSend2 = updateCellSend(channelSegment2, i2, e, j2, waiter, isClosedForSend0);
                if (updateCellSend2 == 0) {
                    channelSegment4.cleanPrev();
                    function0.invoke();
                    return;
                } else if (updateCellSend2 == 1) {
                    function0.invoke();
                    return;
                } else if (updateCellSend2 == 2) {
                    if (isClosedForSend0) {
                        channelSegment4.onSlotCleaned();
                        function02.invoke();
                        return;
                    }
                    if (!(waiter2 instanceof Waiter)) {
                        waiter2 = null;
                    }
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment4, i2);
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                } else if (updateCellSend2 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                } else {
                    if (updateCellSend2 == 4) {
                        if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment4.cleanPrev();
                        }
                        function02.invoke();
                        return;
                    }
                    if (updateCellSend2 == 5) {
                        channelSegment4.cleanPrev();
                    }
                    channelSegment3 = channelSegment4;
                }
            }
        } else {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        channelSegment.storeElement$kotlinx_coroutines_core(i, e);
        if (z) {
            return updateCellSendSlow(channelSegment, i, e, j, obj, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                symbol3 = BufferedChannelKt.DONE_RCV;
                channelSegment.setState$kotlinx_coroutines_core(i, symbol3);
                onReceiveDequeued();
                return 0;
            }
            symbol = BufferedChannelKt.INTERRUPTED_RCV;
            Object andSetState$kotlinx_coroutines_core = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol);
            symbol2 = BufferedChannelKt.INTERRUPTED_RCV;
            if (andSetState$kotlinx_coroutines_core != symbol2) {
                channelSegment.onCancelledRequest(i, true);
            }
            return 5;
        }
        return updateCellSendSlow(channelSegment, i, e, j, obj, z);
    }

    private final int updateCellSendSlow(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    symbol3 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core != symbol3) {
                        symbol4 = BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol4) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            return 5;
                        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            completeCloseOrCancel();
                            return 4;
                        } else {
                            if (DebugKt.getASSERTIONS_ENABLED()) {
                                if (!((state$kotlinx_coroutines_core instanceof Waiter) || (state$kotlinx_coroutines_core instanceof WaiterEB))) {
                                    throw new AssertionError();
                                }
                            }
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                                symbol7 = BufferedChannelKt.DONE_RCV;
                                channelSegment.setState$kotlinx_coroutines_core(i, symbol7);
                                onReceiveDequeued();
                                return 0;
                            }
                            symbol5 = BufferedChannelKt.INTERRUPTED_RCV;
                            Object andSetState$kotlinx_coroutines_core = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol5);
                            symbol6 = BufferedChannelKt.INTERRUPTED_RCV;
                            if (andSetState$kotlinx_coroutines_core != symbol6) {
                                channelSegment.onCancelledRequest(i, true);
                            }
                            return 5;
                        }
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    return 5;
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(j) || z) {
                if (z) {
                    symbol = BufferedChannelKt.INTERRUPTED_SEND;
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, symbol)) {
                        channelSegment.onCancelledRequest(i, false);
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                        return 2;
                    }
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final boolean shouldSendSuspend(long j) {
        if (isClosedForSend0(j)) {
            return false;
        }
        return !bufferOrRendezvousSend(j & 1152921504606846975L);
    }

    private final boolean bufferOrRendezvousSend(long j) {
        return j < getBufferEndCounter() || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$FU.get(this));
    }

    private final boolean tryResumeReceiver(Object obj, E e) {
        boolean tryResume0;
        boolean tryResume02;
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof ReceiveCatching) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            ReceiveCatching receiveCatching = (ReceiveCatching) obj;
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = receiveCatching.cont;
            ChannelResult m8827boximpl = ChannelResult.m8827boximpl(ChannelResult.Companion.m8842successJP2dKIU(e));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            tryResume02 = BufferedChannelKt.tryResume0(cancellableContinuationImpl, m8827boximpl, function1 != null ? OnUndeliveredElementKt.bindCancellationFun(function1, e, receiveCatching.cont.getContext()) : null);
            return tryResume02;
        } else if (obj instanceof BufferedChannelIterator) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e);
        } else if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1<E, Unit> function12 = this.onUndeliveredElement;
            tryResume0 = BufferedChannelKt.tryResume0(cancellableContinuation, e, function12 != null ? OnUndeliveredElementKt.bindCancellationFun(function12, e, cancellableContinuation.getContext()) : null);
            return tryResume0;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) {
        ChannelSegment<E> channelSegment;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j) {
                ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return updateCellReceive;
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <E> Object m8819receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super ChannelResult<? extends E>> continuation) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        ChannelSegment<E> channelSegment;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            if ((bufferedChannel$receiveCatching$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label -= Integer.MIN_VALUE;
                BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                Object obj = bufferedChannel$receiveCatching$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bufferedChannel$receiveCatching$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((ChannelResult) obj).m8839unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ChannelSegment<E> channelSegment2 = (ChannelSegment) receiveSegment$FU.get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
                    long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                    int i2 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment2.id != j) {
                        ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    } else {
                        channelSegment = channelSegment2;
                    }
                    Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
                    symbol = BufferedChannelKt.SUSPEND;
                    if (updateCellReceive != symbol) {
                        symbol2 = BufferedChannelKt.FAILED;
                        if (updateCellReceive != symbol2) {
                            symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                            if (updateCellReceive == symbol3) {
                                bufferedChannel$receiveCatching$12.label = 1;
                                Object m8820receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel.m8820receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i2, andIncrement, bufferedChannel$receiveCatching$12);
                                return m8820receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : m8820receiveCatchingOnNoWaiterSuspendGKJJFZk;
                            }
                            channelSegment.cleanPrev();
                            return ChannelResult.Companion.m8842successJP2dKIU(updateCellReceive);
                        }
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        channelSegment2 = channelSegment;
                    } else {
                        throw new IllegalStateException("unexpected".toString());
                    }
                }
                return ChannelResult.Companion.m8840closedJP2dKIU(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        Object obj2 = bufferedChannel$receiveCatching$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bufferedChannel$receiveCatching$122.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8820receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super ChannelResult<? extends E>> continuation) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        Symbol symbol;
        Symbol symbol2;
        ChannelResult m8827boximpl;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            if ((bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label -= Integer.MIN_VALUE;
                Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
                    CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12));
                    try {
                        Intrinsics.checkNotNull(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>");
                        ReceiveCatching receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
                        Object updateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                        symbol = BufferedChannelKt.SUSPEND;
                        if (updateCellReceive != symbol) {
                            symbol2 = BufferedChannelKt.FAILED;
                            Function1<Throwable, Unit> function1 = null;
                            function1 = null;
                            if (updateCellReceive == symbol2) {
                                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                        break;
                                    }
                                    long andIncrement = receivers$FU.getAndIncrement(this);
                                    long j2 = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                                    int i3 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                                    if (channelSegment2.id != j2) {
                                        ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                                        if (findSegmentReceive != null) {
                                            channelSegment2 = findSegmentReceive;
                                        }
                                    }
                                    Object updateCellReceive2 = updateCellReceive(channelSegment2, i3, andIncrement, receiveCatching);
                                    symbol3 = BufferedChannelKt.SUSPEND;
                                    if (updateCellReceive2 != symbol3) {
                                        symbol4 = BufferedChannelKt.FAILED;
                                        if (updateCellReceive2 != symbol4) {
                                            symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                            if (updateCellReceive2 == symbol5) {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                            channelSegment2.cleanPrev();
                                            m8827boximpl = ChannelResult.m8827boximpl(ChannelResult.Companion.m8842successJP2dKIU(updateCellReceive2));
                                            Function1<E, Unit> function12 = this.onUndeliveredElement;
                                            if (function12 != null) {
                                                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                            }
                                        } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    } else {
                                        ReceiveCatching receiveCatching2 = receiveCatching instanceof Waiter ? receiveCatching : null;
                                        if (receiveCatching2 != null) {
                                            prepareReceiverForSuspension(receiveCatching2, channelSegment2, i3);
                                        }
                                    }
                                }
                            } else {
                                channelSegment.cleanPrev();
                                m8827boximpl = ChannelResult.m8827boximpl(ChannelResult.Companion.m8842successJP2dKIU(updateCellReceive));
                                Function1<E, Unit> function13 = this.onUndeliveredElement;
                                if (function13 != null) {
                                    function1 = OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            }
                            orCreateCancellableContinuation.resume(m8827boximpl, function1);
                        } else {
                            prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                        }
                        obj = orCreateCancellableContinuation.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    long j3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0;
                    int i4 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0;
                    ChannelSegment channelSegment3 = (ChannelSegment) bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1;
                    BufferedChannel bufferedChannel = (BufferedChannel) bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return ((ChannelResult) obj).m8839unboximpl();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i2 != 0) {
        }
        return ((ChannelResult) obj2).m8839unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m7271constructorimpl(ChannelResult.m8827boximpl(ChannelResult.Companion.m8840closedJP2dKIU(getCloseCause()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk  reason: not valid java name */
    public Object mo8822tryReceivePtdJZtk() {
        Symbol symbol;
        ChannelSegment channelSegment;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        long j = receivers$FU.get(this);
        long j2 = sendersAndCloseStatus$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return ChannelResult.Companion.m8840closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            symbol = BufferedChannelKt.INTERRUPTED_RCV;
            ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = receivers$FU.getAndIncrement(this);
                long j3 = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j3) {
                    ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, symbol);
                symbol2 = BufferedChannelKt.SUSPEND;
                if (updateCellReceive != symbol2) {
                    symbol3 = BufferedChannelKt.FAILED;
                    if (updateCellReceive != symbol3) {
                        symbol4 = BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive == symbol4) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        channelSegment.cleanPrev();
                        return ChannelResult.Companion.m8842successJP2dKIU(updateCellReceive);
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    Waiter waiter = symbol instanceof Waiter ? (Waiter) symbol : null;
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegment, i);
                    }
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m8841failurePtdJZtk();
                }
            }
            return ChannelResult.Companion.m8840closedJP2dKIU(getCloseCause());
        }
        return ChannelResult.Companion.m8841failurePtdJZtk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        Symbol symbol;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        if (DebugKt.getASSERTIONS_ENABLED() && !isConflatedDropOldest()) {
            throw new AssertionError();
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.capacity + j2, getBufferEndCounter())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = j2 / BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j2 % BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment.id != j3) {
                    ChannelSegment<E> findSegmentReceive = findSegmentReceive(j3, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                Object updateCellReceive = updateCellReceive(channelSegment, i, j2, null);
                symbol = BufferedChannelKt.FAILED;
                if (updateCellReceive == symbol) {
                    if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                }
            }
        }
    }

    static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, Function1 function1, Function3 function3, Function0 function0, Function3 function32, int i, Object obj2) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i & 16) != 0) {
            function32 = BufferedChannel$receiveImpl$1.INSTANCE;
        }
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, obj);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        return function32.invoke(channelSegment, Integer.valueOf(i2), Long.valueOf(andIncrement));
                    }
                    channelSegment.cleanPrev();
                    return function1.invoke(updateCellReceive);
                } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                return function3.invoke(channelSegment, Integer.valueOf(i2), Long.valueOf(andIncrement));
            }
        }
        return function0.invoke();
    }

    private final <R> R receiveImpl(Object obj, Function1<? super E, ? extends R> function1, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> function3, Function0<? extends R> function0, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> function32) {
        ChannelSegment channelSegment;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object obj2 = (Object) updateCellReceive(channelSegment, i, andIncrement, obj);
            symbol = BufferedChannelKt.SUSPEND;
            if (obj2 != symbol) {
                symbol2 = BufferedChannelKt.FAILED;
                if (obj2 != symbol2) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (obj2 == symbol3) {
                        return function32.invoke(channelSegment, Integer.valueOf(i), Long.valueOf(andIncrement));
                    }
                    channelSegment.cleanPrev();
                    return function1.invoke(obj2);
                }
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            } else {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                }
                return function3.invoke(channelSegment, Integer.valueOf(i), Long.valueOf(andIncrement));
            }
        }
        return function0.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, long j, Waiter waiter, Function1<? super E, Unit> function1, Function0<Unit> function0) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Object obj = (Object) updateCellReceive(channelSegment, i, j, waiter);
        symbol = BufferedChannelKt.SUSPEND;
        if (obj != symbol) {
            symbol2 = BufferedChannelKt.FAILED;
            if (obj == symbol2) {
                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
                while (!isClosedForReceive()) {
                    long andIncrement = receivers$FU.getAndIncrement(this);
                    long j2 = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                    int i2 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment2.id != j2) {
                        ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment2 = findSegmentReceive;
                        }
                    }
                    Object obj2 = (Object) updateCellReceive(channelSegment2, i2, andIncrement, waiter);
                    symbol3 = BufferedChannelKt.SUSPEND;
                    if (obj2 != symbol3) {
                        symbol4 = BufferedChannelKt.FAILED;
                        if (obj2 != symbol4) {
                            symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                            if (obj2 == symbol5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            channelSegment2.cleanPrev();
                            function1.invoke(obj2);
                            return;
                        } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment2.cleanPrev();
                        }
                    } else {
                        if (!(waiter instanceof Waiter)) {
                            waiter = null;
                        }
                        if (waiter != null) {
                            prepareReceiverForSuspension(waiter, channelSegment2, i2);
                        }
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                }
                function0.invoke();
                return;
            }
            channelSegment.cleanPrev();
            function1.invoke(obj);
            return;
        }
        prepareReceiverForSuspension(waiter, channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    symbol2 = BufferedChannelKt.SUSPEND;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
            symbol = BufferedChannelKt.DONE_RCV;
            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                expandBuffer();
                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
            }
        }
        return updateCellReceiveSlow(channelSegment, i, j, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        Symbol symbol9;
        Symbol symbol10;
        Symbol symbol11;
        Symbol symbol12;
        Symbol symbol13;
        Symbol symbol14;
        Symbol symbol15;
        Symbol symbol16;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        symbol6 = BufferedChannelKt.DONE_RCV;
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol6)) {
                            expandBuffer();
                            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                        }
                    } else {
                        symbol7 = BufferedChannelKt.INTERRUPTED_SEND;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = BufferedChannelKt.FAILED;
                            return symbol8;
                        }
                        symbol9 = BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = BufferedChannelKt.FAILED;
                            return symbol10;
                        } else if (state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                            symbol12 = BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != symbol12) {
                                symbol13 = BufferedChannelKt.RESUMING_BY_RCV;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol13)) {
                                    boolean z = state$kotlinx_coroutines_core instanceof WaiterEB;
                                    if (z) {
                                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                                    }
                                    if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                                        symbol16 = BufferedChannelKt.DONE_RCV;
                                        channelSegment.setState$kotlinx_coroutines_core(i, symbol16);
                                        expandBuffer();
                                        return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                                    }
                                    symbol14 = BufferedChannelKt.INTERRUPTED_SEND;
                                    channelSegment.setState$kotlinx_coroutines_core(i, symbol14);
                                    channelSegment.onCancelledRequest(i, false);
                                    if (z) {
                                        expandBuffer();
                                    }
                                    symbol15 = BufferedChannelKt.FAILED;
                                    return symbol15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            expandBuffer();
                            symbol11 = BufferedChannelKt.FAILED;
                            return symbol11;
                        }
                    }
                }
            }
            if (j < (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                symbol = BufferedChannelKt.POISONED;
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                    expandBuffer();
                    symbol2 = BufferedChannelKt.FAILED;
                    return symbol2;
                }
            } else if (obj == null) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                return symbol3;
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                expandBuffer();
                symbol4 = BufferedChannelKt.SUSPEND;
                return symbol4;
            }
        }
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        } else if (obj instanceof SelectInstance) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, Unit.INSTANCE);
            if (trySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        } else if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), true, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$FU.getAndIncrement(this);
            long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                ChannelSegment<E> findSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> channelSegment, int i, long j) {
        Symbol symbol;
        Symbol symbol2;
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && j >= receivers$FU.get(this)) {
            symbol = BufferedChannelKt.RESUMING_BY_EB;
            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                if (!tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                    symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                    channelSegment.setState$kotlinx_coroutines_core(i, symbol2);
                    channelSegment.onCancelledRequest(i, false);
                    return false;
                }
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                return true;
            }
        }
        return updateCellExpandBufferSlow(channelSegment, i, j);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> channelSegment, int i, long j) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                symbol3 = BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core != symbol3) {
                    if (state$kotlinx_coroutines_core == null) {
                        symbol4 = BufferedChannelKt.IN_BUFFER;
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol4)) {
                            return true;
                        }
                    } else if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        symbol5 = BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol5) {
                            break;
                        }
                        symbol6 = BufferedChannelKt.DONE_RCV;
                        if (state$kotlinx_coroutines_core == symbol6) {
                            break;
                        }
                        symbol7 = BufferedChannelKt.INTERRUPTED_RCV;
                        if (state$kotlinx_coroutines_core == symbol7 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            return true;
                        }
                        symbol8 = BufferedChannelKt.RESUMING_BY_RCV;
                        if (state$kotlinx_coroutines_core != symbol8) {
                            throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else if (j >= receivers$FU.get(this)) {
                symbol = BufferedChannelKt.RESUMING_BY_EB;
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                    if (!tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                        symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                        channelSegment.setState$kotlinx_coroutines_core(i, symbol2);
                        channelSegment.onCancelledRequest(i, false);
                        return false;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                    return true;
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                return true;
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long j) {
        boolean z;
        if ((completedExpandBuffersAndPauseFlag$FU.addAndGet(this, j) & Longs.MAX_POWER_OF_TWO) != 0) {
            do {
                if ((completedExpandBuffersAndPauseFlag$FU.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } while (z);
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        int i;
        long j2;
        long constructEBCompletedAndPauseFlag;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long constructEBCompletedAndPauseFlag2;
        long j3;
        long constructEBCompletedAndPauseFlag3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        do {
        } while (getBufferEndCounter() <= j);
        i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (DurationKt.MAX_MILLIS & completedExpandBuffersAndPauseFlag$FU.get(this)) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$FU;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
            constructEBCompletedAndPauseFlag = BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & DurationKt.MAX_MILLIS, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, constructEBCompletedAndPauseFlag));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$FU;
            long j4 = atomicLongFieldUpdater.get(this);
            long j5 = j4 & DurationKt.MAX_MILLIS;
            boolean z = (Longs.MAX_POWER_OF_TWO & j4) != 0;
            if (bufferEndCounter2 == j5 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z) {
                constructEBCompletedAndPauseFlag2 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j5, true);
                atomicLongFieldUpdater.compareAndSet(this, j4, constructEBCompletedAndPauseFlag2);
            }
        }
        do {
            j3 = atomicLongFieldUpdater.get(this);
            constructEBCompletedAndPauseFlag3 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j3 & DurationKt.MAX_MILLIS, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, constructEBCompletedAndPauseFlag3));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    private final void onClosedSelectOnSend(E e, SelectInstance<?> selectInstance) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, e, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) {
        if (obj2 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            if (getCloseCause() == null) {
                return null;
            }
            throw getReceiveException();
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return ChannelResult.m8827boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.Companion.m8840closedJP2dKIU(getCloseCause()) : ChannelResult.Companion.m8842successJP2dKIU(obj2));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "receiveResult", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", FirebaseAnalytics.Param.INDEX, "", "r", "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult;

        public BufferedChannelIterator() {
            Symbol symbol;
            symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) {
            ChannelSegment<E> channelSegment;
            Symbol symbol;
            Symbol symbol2;
            Symbol symbol3;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            ChannelSegment<E> channelSegment2 = (ChannelSegment) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j) {
                    ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
                symbol = BufferedChannelKt.SUSPEND;
                if (updateCellReceive != symbol) {
                    symbol2 = BufferedChannelKt.FAILED;
                    if (updateCellReceive != symbol2) {
                        symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive == symbol3) {
                            return hasNextOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                        }
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        return Boxing.boxBoolean(true);
                    }
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return Boxing.boxBoolean(onClosedHasNext());
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super Boolean> continuation) {
            Symbol symbol;
            Symbol symbol2;
            Boolean boxBoolean;
            Symbol symbol3;
            Symbol symbol4;
            Symbol symbol5;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                symbol = BufferedChannelKt.SUSPEND;
                if (updateCellReceive != symbol) {
                    symbol2 = BufferedChannelKt.FAILED;
                    Function1<Throwable, Unit> function1 = null;
                    function1 = null;
                    if (updateCellReceive == symbol2) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                            long j2 = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                            int i2 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                            if (channelSegment2.id != j2) {
                                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                                if (findSegmentReceive != null) {
                                    channelSegment2 = findSegmentReceive;
                                }
                            }
                            Object updateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i2, andIncrement, this);
                            symbol3 = BufferedChannelKt.SUSPEND;
                            if (updateCellReceive2 != symbol3) {
                                symbol4 = BufferedChannelKt.FAILED;
                                if (updateCellReceive2 != symbol4) {
                                    symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                    if (updateCellReceive2 == symbol5) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    channelSegment2.cleanPrev();
                                    this.receiveResult = updateCellReceive2;
                                    this.continuation = null;
                                    boxBoolean = Boxing.boxBoolean(true);
                                    Function1<E, Unit> function12 = bufferedChannel.onUndeliveredElement;
                                    if (function12 != null) {
                                        function1 = OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                    }
                                } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            } else {
                                BufferedChannelIterator bufferedChannelIterator = this instanceof Waiter ? this : null;
                                if (bufferedChannelIterator != null) {
                                    bufferedChannel.prepareReceiverForSuspension(bufferedChannelIterator, channelSegment2, i2);
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        boxBoolean = Boxing.boxBoolean(true);
                        Function1<E, Unit> function13 = bufferedChannel.onUndeliveredElement;
                        if (function13 != null) {
                            function1 = OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boxBoolean, function1);
                } else {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m7271constructorimpl(false));
                return;
            }
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                closeCause = StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(closeCause)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            Symbol symbol;
            Symbol symbol2;
            E e = (E) this.receiveResult;
            symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e != symbol) {
                symbol2 = BufferedChannelKt.NO_RECEIVE_RESULT;
                this.receiveResult = symbol2;
                if (e != BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return e;
                }
                throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean tryResumeHasNext(E e) {
            boolean tryResume0;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = e;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            Function1<E, Unit> function1 = BufferedChannel.this.onUndeliveredElement;
            tryResume0 = BufferedChannelKt.tryResume0(cancellableContinuationImpl2, true, function1 != null ? OnUndeliveredElementKt.bindCancellationFun(function1, e, cancellableContinuationImpl.getContext()) : null);
            return tryResume0;
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m7271constructorimpl(false));
                return;
            }
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                closeCause = StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(closeCause)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$FU.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th, true);
    }

    protected boolean closeOrCancelImpl(Throwable th, boolean z) {
        Symbol symbol;
        if (z) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$FU;
        symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        boolean m = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol, th);
        if (z) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (m) {
            invokeCloseHandler();
        }
        return m;
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        Function1 function1 = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1);
        ((Function1) obj).invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> function1) {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$FU;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            if (obj != symbol) {
                symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                if (obj == symbol2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = closeHandler$FU;
            symbol3 = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            symbol4 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        function1.invoke(getCloseCause());
    }

    private final void markClosed() {
        long j;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancellationStarted() {
        long j;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final ChannelSegment<E> completeClose(long j) {
        ChannelSegment<E> closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, j);
        return closeLinkedList;
    }

    private final void completeCancel(long j) {
        removeUnprocessedElements(completeClose(j));
    }

    private final ChannelSegment<E> closeLinkedList() {
        ChannelSegment channelSegment = bufferEndSegment$FU.get(this);
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) channelSegment).id) {
            channelSegment = channelSegment2;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) receiveSegment$FU.get(this);
        if (channelSegment3.id > ((ChannelSegment) channelSegment).id) {
            channelSegment = channelSegment3;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) channelSegment);
    }

    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> channelSegment) {
        Symbol symbol;
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i;
                    if (j >= getReceiversCounter$kotlinx_coroutines_core()) {
                        while (true) {
                            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core != null) {
                                symbol = BufferedChannelKt.IN_BUFFER;
                                if (state$kotlinx_coroutines_core != symbol) {
                                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                                        return j;
                                    }
                                }
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    channelSegment = (ChannelSegment) channelSegment.getPrev();
                }
            }
        } while (channelSegment != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeUnprocessedElements(ChannelSegment<E> channelSegment) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementException = null;
        Object m8864constructorimpl$default = InlineList.m8864constructorimpl$default(null, 1, null);
        loop0: do {
            int i = BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                long j = (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i;
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    symbol = BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol) {
                        break loop0;
                    } else if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        symbol2 = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core == symbol2 || state$kotlinx_coroutines_core == null) {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        } else if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            symbol3 = BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core == symbol3) {
                                break loop0;
                            }
                            symbol4 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core == symbol4) {
                                break loop0;
                            }
                            symbol5 = BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != symbol5) {
                                break;
                            }
                        } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        } else {
                            Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (function1 != null) {
                                    undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                                }
                                m8864constructorimpl$default = InlineList.m8869plusFjFbRPM(m8864constructorimpl$default, waiter);
                                channelSegment.cleanElement$kotlinx_coroutines_core(i);
                                channelSegment.onSlotCleaned();
                            }
                        }
                    } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                        break loop0;
                    } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (function1 != null) {
                            undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                        }
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        channelSegment.onSlotCleaned();
                    }
                }
                i--;
            }
        } while (channelSegment != null);
        if (m8864constructorimpl$default != null) {
            if (!(m8864constructorimpl$default instanceof ArrayList)) {
                resumeSenderOnCancelledChannel((Waiter) m8864constructorimpl$default);
            } else {
                Intrinsics.checkNotNull(m8864constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) m8864constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((Waiter) arrayList.get(size));
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> channelSegment, long j) {
        Symbol symbol;
        Object m8864constructorimpl$default = InlineList.m8864constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m8864constructorimpl$default = InlineList.m8869plusFjFbRPM(m8864constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                    channelSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            } else if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                m8864constructorimpl$default = InlineList.m8869plusFjFbRPM(m8864constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        channelSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (m8864constructorimpl$default != null) {
            if (!(m8864constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) m8864constructorimpl$default);
                return;
            }
            Intrinsics.checkNotNull(m8864constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m8864constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof SendBroadcast) {
            Result.Companion companion = Result.Companion;
            ((SendBroadcast) waiter).getCont().resumeWith(Result.m7271constructorimpl(false));
        } else if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.Companion;
            continuation.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(z ? getReceiveException() : getSendException())));
        } else if (waiter instanceof ReceiveCatching) {
            Result.Companion companion3 = Result.Companion;
            ((ReceiveCatching) waiter).cont.resumeWith(Result.m7271constructorimpl(ChannelResult.m8827boximpl(ChannelResult.Companion.m8840closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$FU.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$FU.get(this));
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    private final boolean isClosed(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(j & 1152921504606846975L);
            if (z && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else if (i == 3) {
            completeCancel(j & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
            ChannelSegment<E> channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            long j = receiversCounter$kotlinx_coroutines_core / BufferedChannelKt.SEGMENT_SIZE;
            if (channelSegment.id != j && (channelSegment = findSegmentReceive(j, channelSegment)) == null) {
                if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).id < j) {
                    return false;
                }
            } else {
                channelSegment.cleanPrev();
                if (isCellNonEmpty(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % BufferedChannelKt.SEGMENT_SIZE), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            }
        }
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    symbol3 = BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core == symbol3 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return false;
                    }
                    symbol4 = BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        return false;
                    }
                    symbol5 = BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol5) {
                        return false;
                    }
                    symbol6 = BufferedChannelKt.RESUMING_BY_EB;
                    if (state$kotlinx_coroutines_core == symbol6) {
                        return true;
                    }
                    symbol7 = BufferedChannelKt.RESUMING_BY_RCV;
                    return state$kotlinx_coroutines_core != symbol7 && j == getReceiversCounter$kotlinx_coroutines_core();
                }
            }
            symbol = BufferedChannelKt.POISONED;
        } while (!channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol));
        expandBuffer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long j, ChannelSegment<E> channelSegment) {
        Object findSegmentInternal;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        do {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m8876getSegmentimpl = SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m8876getSegmentimpl.id) {
                    break;
                } else if (!m8876getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z = false;
                    continue;
                    break;
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m8876getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m8876getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m8876getSegmentimpl.remove();
                }
            }
            z = true;
            continue;
        } while (!z);
        if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
                return null;
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
        if (channelSegment2.id > j) {
            updateSendersCounterIfLower(channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
                return null;
            }
            return null;
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(channelSegment2.id == j)) {
                throw new AssertionError();
            }
        }
        return channelSegment2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long j, ChannelSegment<E> channelSegment) {
        Object findSegmentInternal;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        do {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m8876getSegmentimpl = SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m8876getSegmentimpl.id) {
                    break;
                } else if (!m8876getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z = false;
                    continue;
                    break;
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m8876getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m8876getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m8876getSegmentimpl.remove();
                }
            }
            z = true;
            continue;
        } while (!z);
        if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
                return null;
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && j <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                ChannelSegment<E> channelSegment3 = channelSegment2;
                if (segment2.id >= channelSegment3.id || !channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment3)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                    channelSegment3.remove();
                }
            }
        }
        if (channelSegment2.id > j) {
            updateReceiversCounterIfLower(channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
                return null;
            }
            return null;
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(channelSegment2.id == j)) {
                throw new AssertionError();
            }
        }
        return channelSegment2;
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long j, ChannelSegment<E> channelSegment, long j2) {
        Object findSegmentInternal;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        do {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m8876getSegmentimpl = SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m8876getSegmentimpl.id) {
                    break;
                } else if (!m8876getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z = false;
                    continue;
                    break;
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m8876getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m8876getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m8876getSegmentimpl.remove();
                }
            }
            z = true;
            continue;
        } while (!z);
        if (SegmentOrClosed.m8878isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m8876getSegmentimpl(findSegmentInternal);
        if (channelSegment2.id > j) {
            if (bufferEnd$FU.compareAndSet(this, j2 + 1, channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE)) {
                incCompletedExpandBufferAttempts((channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE) - j2);
                return null;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(channelSegment2.id == j)) {
                throw new AssertionError();
            }
        }
        return channelSegment2;
    }

    private final void moveSegmentBufferEndToSpecifiedOrLast(long j, ChannelSegment<E> channelSegment) {
        boolean z;
        ChannelSegment<E> channelSegment2;
        ChannelSegment<E> channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (ChannelSegment) channelSegment.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    ChannelSegment<E> channelSegment4 = channelSegment;
                    z = true;
                    if (segment.id >= channelSegment4.id) {
                        break;
                    } else if (!channelSegment4.tryIncPointers$kotlinx_coroutines_core()) {
                        z = false;
                        break;
                    } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, channelSegment4)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (channelSegment4.decPointers$kotlinx_coroutines_core()) {
                        channelSegment4.remove();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    private final void updateSendersCounterIfLower(long j) {
        long j2;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
            constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j3, (int) (j2 >> 60));
        } while (!sendersAndCloseStatus$FU.compareAndSet(this, j2, constructSendersAndCloseStatus));
    }

    private final void updateReceiversCounterIfLower(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!receivers$FU.compareAndSet(this, j2, j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
        if (r3 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de A[EDGE_INSN: B:112:0x01de->B:94:0x01de ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i;
        int i2;
        Symbol symbol;
        Symbol symbol2;
        boolean areEqual;
        Symbol symbol3;
        boolean areEqual2;
        Symbol symbol4;
        boolean areEqual3;
        Symbol symbol5;
        boolean areEqual4;
        Symbol symbol6;
        boolean areEqual5;
        Symbol symbol7;
        boolean areEqual6;
        String obj;
        ChannelSegment channelSegment;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (sendersAndCloseStatus$FU.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i4 = 0;
        ChannelSegment[] channelSegmentArr = {receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : CollectionsKt.listOf((Object[]) channelSegmentArr)) {
            ChannelSegment channelSegment2 = (ChannelSegment) obj2;
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            ChannelSegment channelSegment3 = (ChannelSegment) next;
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
            loop2: while (true) {
                i = BufferedChannelKt.SEGMENT_SIZE;
                i2 = i4;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    long j = (channelSegment3.id * BufferedChannelKt.SEGMENT_SIZE) + i2;
                    int i5 = (j > sendersCounter$kotlinx_coroutines_core ? 1 : (j == sendersCounter$kotlinx_coroutines_core ? 0 : -1));
                    if (i5 >= 0 && j >= receiversCounter$kotlinx_coroutines_core) {
                        break loop2;
                    }
                    Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i2);
                    Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                        int i6 = (j > receiversCounter$kotlinx_coroutines_core ? 1 : (j == receiversCounter$kotlinx_coroutines_core ? 0 : -1));
                        obj = (i6 >= 0 || i5 < 0) ? (i5 >= 0 || i6 < 0) ? "cont" : "send" : "receive";
                    } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                        int i7 = (j > receiversCounter$kotlinx_coroutines_core ? 1 : (j == receiversCounter$kotlinx_coroutines_core ? 0 : -1));
                        obj = (i7 >= 0 || i5 < 0) ? (i5 >= 0 || i7 < 0) ? "select" : "onSend" : "onReceive";
                    } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                        obj = "receiveCatching";
                    } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                        obj = "sendBroadcast";
                    } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        obj = "EB(" + state$kotlinx_coroutines_core + ')';
                    } else {
                        symbol = BufferedChannelKt.RESUMING_BY_RCV;
                        if (Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                            areEqual = true;
                        } else {
                            symbol2 = BufferedChannelKt.RESUMING_BY_EB;
                            areEqual = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2);
                        }
                        if (areEqual) {
                            obj = "resuming_sender";
                        } else {
                            if (state$kotlinx_coroutines_core == null) {
                                areEqual2 = true;
                            } else {
                                symbol3 = BufferedChannelKt.IN_BUFFER;
                                areEqual2 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3);
                            }
                            if (areEqual2) {
                                areEqual3 = true;
                            } else {
                                symbol4 = BufferedChannelKt.DONE_RCV;
                                areEqual3 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4);
                            }
                            if (areEqual3) {
                                areEqual4 = true;
                            } else {
                                symbol5 = BufferedChannelKt.POISONED;
                                areEqual4 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol5);
                            }
                            if (areEqual4) {
                                areEqual5 = true;
                            } else {
                                symbol6 = BufferedChannelKt.INTERRUPTED_RCV;
                                areEqual5 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol6);
                            }
                            if (areEqual5) {
                                areEqual6 = true;
                            } else {
                                symbol7 = BufferedChannelKt.INTERRUPTED_SEND;
                                areEqual6 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol7);
                            }
                            if (areEqual6 ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                i2++;
                            } else {
                                obj = state$kotlinx_coroutines_core.toString();
                            }
                        }
                    }
                    if (element$kotlinx_coroutines_core != null) {
                        sb.append("(" + obj + ',' + element$kotlinx_coroutines_core + "),");
                    } else {
                        sb.append(obj + ',');
                    }
                    i2++;
                }
                i4 = 0;
            }
            if (StringsKt.last(sb) == ',') {
                Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
            }
            sb.append("]");
            return sb.toString();
        }
        long j2 = ((ChannelSegment) next).id;
        do {
            Object next2 = it.next();
            long j3 = ((ChannelSegment) next2).id;
            if (j2 > j3) {
                next = next2;
                j2 = j3;
            }
        } while (it.hasNext());
        ChannelSegment channelSegment32 = (ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core2 = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core2 = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            i = BufferedChannelKt.SEGMENT_SIZE;
            i2 = i4;
            while (true) {
                if (i2 >= i) {
                }
                i2++;
            }
            i4 = 0;
        }
        if (StringsKt.last(sb) == ',') {
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toStringDebug$kotlinx_coroutines_core() {
        ChannelSegment channelSegment;
        int i;
        int i2;
        String valueOf;
        ChannelSegment channelSegment2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("S=");
        sb2.append(getSendersCounter$kotlinx_coroutines_core());
        sb2.append(",R=");
        sb2.append(getReceiversCounter$kotlinx_coroutines_core());
        sb2.append(",B=");
        sb2.append(getBufferEndCounter());
        sb2.append(",B'=");
        sb2.append(completedExpandBuffersAndPauseFlag$FU.get(this));
        sb2.append(",C=");
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        sb2.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb2.append(',');
        sb.append(sb2.toString());
        int i3 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i3 == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i3 == 2) {
            sb.append("CLOSED,");
        } else if (i3 == 3) {
            sb.append("CANCELLED,");
        }
        StringBuilder sb3 = new StringBuilder("SEND_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        sb3.append(DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater.get(this)));
        sb3.append(",RCV_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = receiveSegment$FU;
        sb3.append(DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$FU.get(this)));
        }
        sb.append("  ");
        ChannelSegment[] channelSegmentArr = {atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), bufferEndSegment$FU.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.listOf((Object[]) channelSegmentArr)) {
            ChannelSegment channelSegment3 = (ChannelSegment) obj;
            channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment3 != channelSegment2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            channelSegment = (ChannelSegment) next;
            do {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(DebugStringsKt.getHexAddress(channelSegment));
                sb4.append("=[");
                sb4.append(!channelSegment.isRemoved() ? WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD : "");
                sb4.append(channelSegment.id);
                sb4.append(",prev=");
                ChannelSegment channelSegment4 = (ChannelSegment) channelSegment.getPrev();
                sb4.append(channelSegment4 == null ? DebugStringsKt.getHexAddress(channelSegment4) : null);
                sb4.append(',');
                sb.append(sb4.toString());
                i = BufferedChannelKt.SEGMENT_SIZE;
                for (i2 = 0; i2 < i; i2++) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
                    Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                        valueOf = "cont";
                    } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                        valueOf = "select";
                    } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                        valueOf = "receiveCatching";
                    } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                        valueOf = "send(broadcast)";
                    } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        valueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                    } else {
                        valueOf = String.valueOf(state$kotlinx_coroutines_core);
                    }
                    sb.append("[" + i2 + "]=(" + valueOf + ',' + element$kotlinx_coroutines_core + "),");
                }
                StringBuilder sb5 = new StringBuilder("next=");
                ChannelSegment channelSegment5 = (ChannelSegment) channelSegment.getNext();
                sb5.append(channelSegment5 != null ? DebugStringsKt.getHexAddress(channelSegment5) : null);
                sb5.append("]  ");
                sb.append(sb5.toString());
                channelSegment = (ChannelSegment) channelSegment.getNext();
            } while (channelSegment != null);
            return sb.toString();
        }
        long j = ((ChannelSegment) next).id;
        do {
            Object next2 = it.next();
            long j2 = ((ChannelSegment) next2).id;
            if (j > j2) {
                next = next2;
                j = j2;
            }
        } while (it.hasNext());
        channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sb42 = new StringBuilder();
            sb42.append(DebugStringsKt.getHexAddress(channelSegment));
            sb42.append("=[");
            sb42.append(!channelSegment.isRemoved() ? WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD : "");
            sb42.append(channelSegment.id);
            sb42.append(",prev=");
            ChannelSegment channelSegment42 = (ChannelSegment) channelSegment.getPrev();
            sb42.append(channelSegment42 == null ? DebugStringsKt.getHexAddress(channelSegment42) : null);
            sb42.append(',');
            sb.append(sb42.toString());
            i = BufferedChannelKt.SEGMENT_SIZE;
            while (i2 < i) {
            }
            StringBuilder sb52 = new StringBuilder("next=");
            ChannelSegment channelSegment52 = (ChannelSegment) channelSegment.getNext();
            sb52.append(channelSegment52 != null ? DebugStringsKt.getHexAddress(channelSegment52) : null);
            sb52.append("]  ");
            sb.append(sb52.toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[LOOP:2: B:42:0x00d8->B:106:0x01df, LOOP_START, PHI: r3 
      PHI: (r3v15 kotlinx.coroutines.channels.ChannelSegment) = (r3v14 kotlinx.coroutines.channels.ChannelSegment), (r3v17 kotlinx.coroutines.channels.ChannelSegment) binds: [B:41:0x00d6, B:106:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkSegmentStructureInvariants() {
        ChannelSegment channelSegment;
        boolean z;
        Symbol symbol;
        Symbol symbol2;
        boolean areEqual;
        Symbol symbol3;
        Symbol symbol4;
        boolean areEqual2;
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        if (isRendezvousOrUnlimited()) {
            Object obj = bufferEndSegment$FU.get(this);
            channelSegment3 = BufferedChannelKt.NULL_SEGMENT;
            if (!(obj == channelSegment3)) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (!(((ChannelSegment) receiveSegment$FU.get(this)).id <= ((ChannelSegment) bufferEndSegment$FU.get(this)).id)) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        ChannelSegment[] channelSegmentArr = {receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : CollectionsKt.listOf((Object[]) channelSegmentArr)) {
            ChannelSegment channelSegment4 = (ChannelSegment) obj2;
            channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment4 != channelSegment2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            channelSegment = (ChannelSegment) next;
            if (channelSegment.getPrev() != 0) {
                throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
            }
            while (channelSegment.getNext() != 0) {
                S next2 = channelSegment.getNext();
                Intrinsics.checkNotNull(next2);
                if (((ChannelSegment) next2).getPrev() != 0) {
                    S next3 = channelSegment.getNext();
                    Intrinsics.checkNotNull(next3);
                    if (((ChannelSegment) next3).getPrev() != channelSegment) {
                        z = false;
                        if (z) {
                            throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                        }
                        int i = BufferedChannelKt.SEGMENT_SIZE;
                        int i2 = 0;
                        for (int i3 = 0; i3 < i; i3++) {
                            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                            if (!Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                                symbol = BufferedChannelKt.INTERRUPTED_RCV;
                                if (Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                                    areEqual = true;
                                } else {
                                    symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                                    areEqual = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2);
                                }
                                if (!(areEqual ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED()))) {
                                    symbol3 = BufferedChannelKt.POISONED;
                                    if (Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                        areEqual2 = true;
                                    } else {
                                        symbol4 = BufferedChannelKt.DONE_RCV;
                                        areEqual2 = Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4);
                                    }
                                    if (!areEqual2) {
                                        throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                                    }
                                    if (!(channelSegment.getElement$kotlinx_coroutines_core(i3) == null)) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                } else {
                                    if (!(channelSegment.getElement$kotlinx_coroutines_core(i3) == null)) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    i2++;
                                }
                            }
                        }
                        if (i2 == BufferedChannelKt.SEGMENT_SIZE) {
                            if (!(channelSegment == receiveSegment$FU.get(this) || channelSegment == sendSegment$FU.get(this) || channelSegment == bufferEndSegment$FU.get(this))) {
                                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
                            }
                        }
                        S next4 = channelSegment.getNext();
                        Intrinsics.checkNotNull(next4);
                        channelSegment = (ChannelSegment) next4;
                    }
                }
                z = true;
                if (z) {
                }
            }
            return;
        }
        long j = ((ChannelSegment) next).id;
        do {
            Object next5 = it.next();
            long j2 = ((ChannelSegment) next5).id;
            if (j > j2) {
                next = next5;
                j = j2;
            }
        } while (it.hasNext());
        channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e, Continuation<? super Unit> continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e, null, 2, null)) != null) {
            UndeliveredElementException undeliveredElementException = callUndeliveredElementCatchingException$default;
            ExceptionsKt.addSuppressed(undeliveredElementException, getSendException());
            CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            Result.Companion companion = Result.Companion;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl3 instanceof CoroutineStackFrame)) {
                undeliveredElementException = StackTraceRecoveryKt.recoverFromStackFrame(undeliveredElementException, cancellableContinuationImpl3);
            }
            cancellableContinuationImpl3.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(undeliveredElementException)));
        } else {
            CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl2;
            Throwable sendException = getSendException();
            Result.Companion companion2 = Result.Companion;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl4 instanceof CoroutineStackFrame)) {
                sendException = StackTraceRecoveryKt.recoverFromStackFrame(sendException, cancellableContinuationImpl4);
            }
            cancellableContinuationImpl4.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(sendException)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, E e, long j, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object m7271constructorimpl;
        Object result;
        CancellableContinuationImpl cancellableContinuationImpl2;
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            int updateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                cancellableContinuationImpl = orCreateCancellableContinuation;
                Result.Companion companion = Result.Companion;
                m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
            } else if (updateCellSend != 1) {
                if (updateCellSend != 2) {
                    if (updateCellSend == 4) {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        cancellableContinuationImpl2 = orCreateCancellableContinuation;
                    } else if (updateCellSend != 5) {
                        throw new IllegalStateException("unexpected".toString());
                    } else {
                        channelSegment.cleanPrev();
                        ChannelSegment channelSegment3 = (ChannelSegment) sendSegment$FU.get(this);
                        while (true) {
                            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                            long j2 = andIncrement & 1152921504606846975L;
                            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                            long j3 = j2 / BufferedChannelKt.SEGMENT_SIZE;
                            int i2 = (int) (j2 % BufferedChannelKt.SEGMENT_SIZE);
                            if (channelSegment3.id != j3) {
                                ChannelSegment findSegmentSend = findSegmentSend(j3, channelSegment3);
                                if (findSegmentSend != null) {
                                    channelSegment2 = findSegmentSend;
                                } else if (isClosedForSend0) {
                                    cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                    break;
                                }
                            } else {
                                channelSegment2 = channelSegment3;
                            }
                            ChannelSegment channelSegment4 = channelSegment2;
                            int updateCellSend2 = updateCellSend(channelSegment2, i2, e, j2, orCreateCancellableContinuation, isClosedForSend0);
                            if (updateCellSend2 == 0) {
                                channelSegment4.cleanPrev();
                                cancellableContinuationImpl = orCreateCancellableContinuation;
                                Result.Companion companion2 = Result.Companion;
                                m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                                break;
                            } else if (updateCellSend2 == 1) {
                                cancellableContinuationImpl = orCreateCancellableContinuation;
                                Result.Companion companion3 = Result.Companion;
                                m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                                break;
                            } else if (updateCellSend2 != 2) {
                                if (updateCellSend2 == 3) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                if (updateCellSend2 != 4) {
                                    if (updateCellSend2 == 5) {
                                        channelSegment4.cleanPrev();
                                    }
                                    channelSegment3 = channelSegment4;
                                } else {
                                    if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegment4.cleanPrev();
                                    }
                                    cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                }
                            } else if (isClosedForSend0) {
                                channelSegment4.onSlotCleaned();
                                cancellableContinuationImpl2 = orCreateCancellableContinuation;
                            } else {
                                CancellableContinuationImpl cancellableContinuationImpl3 = orCreateCancellableContinuation instanceof Waiter ? orCreateCancellableContinuation : null;
                                if (cancellableContinuationImpl3 != null) {
                                    prepareSenderForSuspension(cancellableContinuationImpl3, channelSegment4, i2);
                                }
                            }
                        }
                    }
                    onClosedSendOnNoWaiterSuspend(e, cancellableContinuationImpl2);
                } else {
                    prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                }
                result = orCreateCancellableContinuation.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            } else {
                cancellableContinuationImpl = orCreateCancellableContinuation;
                Result.Companion companion4 = Result.Companion;
                m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
            }
            cancellableContinuationImpl.resumeWith(m7271constructorimpl);
            result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        r0 = kotlin.Result.Companion;
        r11.resumeWith(kotlin.Result.m7271constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Boolean> continuation) {
        ChannelSegment channelSegment;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (!(bufferedChannel.onUndeliveredElement == null)) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
        }
        SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl2);
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            ChannelSegment channelSegment3 = channelSegment;
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, sendBroadcast, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment3.cleanPrev();
                break;
            } else if (updateCellSend == 1) {
                break;
            } else if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                } else if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment3.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment3.onSlotCleaned();
            } else {
                SendBroadcast sendBroadcast2 = sendBroadcast instanceof Waiter ? sendBroadcast : null;
                if (sendBroadcast2 != null) {
                    bufferedChannel.prepareSenderForSuspension(sendBroadcast2, channelSegment3, i);
                }
            }
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(Boxing.boxBoolean(false)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super E> continuation) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object updateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = BufferedChannelKt.FAILED;
                Function1<Throwable, Unit> function1 = null;
                function1 = null;
                if (updateCellReceive == symbol2) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = receivers$FU.getAndIncrement(this);
                        long j2 = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
                        int i2 = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
                        if (channelSegment2.id != j2) {
                            ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                            if (findSegmentReceive != null) {
                                channelSegment2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(channelSegment2, i2, andIncrement, orCreateCancellableContinuation);
                        symbol3 = BufferedChannelKt.SUSPEND;
                        if (updateCellReceive != symbol3) {
                            symbol4 = BufferedChannelKt.FAILED;
                            if (updateCellReceive != symbol4) {
                                symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive == symbol5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                Function1<E, Unit> function12 = this.onUndeliveredElement;
                                if (function12 != null) {
                                    function1 = OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i2);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function13 = this.onUndeliveredElement;
                    if (function13 != null) {
                        function1 = OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(updateCellReceive, function1);
            } else {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            }
            int updateCellSend = updateCellSend(channelSegment, i, obj, j, selectInstance, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            } else if (updateCellSend == 1) {
                break;
            } else if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnSend(obj, selectInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> selectInstance, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j = andIncrement / BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, selectInstance);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        throw new IllegalStateException("unexpected".toString());
                    }
                    channelSegment.cleanPrev();
                    selectInstance.selectInRegistrationPhase(updateCellReceive);
                    return;
                } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnReceive(selectInstance);
    }
}
