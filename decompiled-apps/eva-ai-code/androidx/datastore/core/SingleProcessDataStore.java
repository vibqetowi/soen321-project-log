package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareInternalUtility;
import io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.DiskFileUpload;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003FGHB\u007f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012?\b\u0002\u0010\b\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n0\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001f\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0082@ø\u0001\u0000¢\u0006\u0002\u00102J\u0011\u00103\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00105\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00106\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00107\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00108\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104JL\u00109\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\u0006\u0010<\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>JD\u0010?\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u001b\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\f\u0010E\u001a\u00020\u0010*\u00020\u0005H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'RJ\u0010*\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0018\u00010\tX\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataStore;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "SCRATCH_SUFFIX", "", "actor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "getDownstreamFlow$annotations", "()V", ShareInternalUtility.STAGING_PARAM, "getFile", "()Ljava/io/File;", "file$delegate", "Lkotlin/Lazy;", "initTasks", "handleRead", "read", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readAndInitOrPropagateFailure", "readData", "readDataOrHandleCorruption", "transformAndWrite", "transform", "t", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "Companion", "Message", "UncloseableOutputStream", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final Flow<T> data;
    private final MutableStateFlow<State<T>> downstreamFlow;
    private final Lazy file$delegate;
    private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;
    private final Function0<File> produceFile;
    private final CoroutineScope scope;
    private final Serializer<T> serializer;

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(Function0<? extends File> produceFile, Serializer<T> serializer, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, CorruptionHandler<T> corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = DiskFileUpload.postfix;
        this.file$delegate = LazyKt.lazy(new SingleProcessDataStore$file$2(this));
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.INSTANCE, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, NoOpCorruptionHandler noOpCorruptionHandler, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, serializer, r3, r4, coroutineScope);
        List emptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        CorruptionHandler noOpCorruptionHandler2 = (i & 8) != 0 ? new NoOpCorruptionHandler() : noOpCorruptionHandler;
        if ((i & 16) != 0) {
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
    }

    @Override // androidx.datastore.core.DataStore
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, CompletableDeferred$default, this.downstreamFlow.getValue(), continuation.getContext()));
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Message<T> {
        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract State<T> getLastState();

        private Message() {
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Ba\u00121\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RA\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "ack", "Lkotlinx/coroutines/CompletableDeferred;", "lastState", "Landroidx/datastore/core/State;", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "getLastState", "()Landroidx/datastore/core/State;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Update<T> extends Message<T> {
            private final CompletableDeferred<T> ack;
            private final CoroutineContext callerContext;
            private final State<T> lastState;
            private final Function2<T, Continuation<? super T>, Object> transform;

            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }

            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, CompletableDeferred<T> ack, State<T> state, CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, Continuation<? super Unit> continuation) {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object readAndInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return readAndInitOrPropagateFailure == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else if (Intrinsics.areEqual(value, UnInitialized.INSTANCE)) {
                Object readAndInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                return readAndInitOrPropagateFailure2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure2 : Unit.INSTANCE;
            } else if (value instanceof Final) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.CompletableDeferred] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        Object coroutine_suspended;
        int i;
        Object m7271constructorimpl;
        CompletableDeferred<T> completableDeferred;
        CompletableDeferred<T> ack;
        State<T> value;
        SingleProcessDataStore singleProcessDataStore;
        Object transformAndWrite;
        Message.Update<T> update2;
        Message.Update<T> update3;
        if (continuation instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuation;
            if ((singleProcessDataStore$handleUpdate$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label -= Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$handleUpdate$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$handleUpdate$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ack = update.getAck();
                    try {
                        Result.Companion companion = Result.Companion;
                        SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) this;
                        value = this.downstreamFlow.getValue();
                    } catch (Throwable th) {
                        th = th;
                        update = ack;
                        Result.Companion companion2 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        completableDeferred = update;
                        CompletableDeferredKt.completeWith(completableDeferred, m7271constructorimpl);
                        return Unit.INSTANCE;
                    }
                    if (value instanceof Data) {
                        Function2<T, Continuation<? super T>, Object> transform = update.getTransform();
                        CoroutineContext callerContext = update.getCallerContext();
                        singleProcessDataStore$handleUpdate$1.L$0 = ack;
                        singleProcessDataStore$handleUpdate$1.label = 1;
                        transformAndWrite = transformAndWrite(transform, callerContext, singleProcessDataStore$handleUpdate$1);
                        if (transformAndWrite == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CompletableDeferred<T> completableDeferred2 = ack;
                        obj = transformAndWrite;
                        update = completableDeferred2;
                        m7271constructorimpl = Result.m7271constructorimpl(obj);
                        completableDeferred = update;
                        CompletableDeferredKt.completeWith(completableDeferred, m7271constructorimpl);
                        return Unit.INSTANCE;
                    }
                    if (!(value instanceof ReadException)) {
                        z = value instanceof UnInitialized;
                    }
                    if (z) {
                        if (value == update.getLastState()) {
                            singleProcessDataStore$handleUpdate$1.L$0 = update;
                            singleProcessDataStore$handleUpdate$1.L$1 = this;
                            singleProcessDataStore$handleUpdate$1.L$2 = ack;
                            singleProcessDataStore$handleUpdate$1.label = 2;
                            if (readAndInitOrPropagateAndThrowFailure(singleProcessDataStore$handleUpdate$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            singleProcessDataStore = this;
                            update2 = update;
                        } else {
                            throw ((ReadException) value).getReadException();
                        }
                    } else if (value instanceof Final) {
                        throw ((Final) value).getFinalException();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i == 1) {
                        update3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0;
                    } else if (i == 2) {
                        CompletableDeferred<T> completableDeferred3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$2;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.L$1;
                        Message.Update<T> update4 = (Message.Update) singleProcessDataStore$handleUpdate$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ack = completableDeferred3;
                        update2 = update4;
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        update3 = (Message.Update<T>) ((CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0);
                    }
                    ResultKt.throwOnFailure(obj);
                    update = update3;
                    m7271constructorimpl = Result.m7271constructorimpl(obj);
                    completableDeferred = update;
                    CompletableDeferredKt.completeWith(completableDeferred, m7271constructorimpl);
                    return Unit.INSTANCE;
                }
                Function2<T, Continuation<? super T>, Object> transform2 = update2.getTransform();
                CoroutineContext callerContext2 = update2.getCallerContext();
                singleProcessDataStore$handleUpdate$1.L$0 = ack;
                singleProcessDataStore$handleUpdate$1.L$1 = null;
                singleProcessDataStore$handleUpdate$1.L$2 = null;
                singleProcessDataStore$handleUpdate$1.label = 3;
                transformAndWrite = singleProcessDataStore.transformAndWrite(transform2, callerContext2, singleProcessDataStore$handleUpdate$1);
                if (transformAndWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CompletableDeferred<T> completableDeferred22 = ack;
                obj = transformAndWrite;
                update = completableDeferred22;
                m7271constructorimpl = Result.m7271constructorimpl(obj);
                completableDeferred = update;
                CompletableDeferredKt.completeWith(completableDeferred, m7271constructorimpl);
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
        Object obj2 = singleProcessDataStore$handleUpdate$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$handleUpdate$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        Function2<T, Continuation<? super T>, Object> transform22 = update2.getTransform();
        CoroutineContext callerContext22 = update2.getCallerContext();
        singleProcessDataStore$handleUpdate$1.L$0 = ack;
        singleProcessDataStore$handleUpdate$1.L$1 = null;
        singleProcessDataStore$handleUpdate$1.L$2 = null;
        singleProcessDataStore$handleUpdate$1.label = 3;
        transformAndWrite = singleProcessDataStore.transformAndWrite(transform22, callerContext22, singleProcessDataStore$handleUpdate$1);
        if (transformAndWrite == coroutine_suspended) {
        }
        CompletableDeferred<T> completableDeferred222 = ack;
        obj2 = transformAndWrite;
        update = completableDeferred222;
        m7271constructorimpl = Result.m7271constructorimpl(obj2);
        completableDeferred = update;
        CompletableDeferredKt.completeWith(completableDeferred, m7271constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuation;
            if ((singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label -= Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else if (i == 1) {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation<? super Unit> continuation) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuation;
            if ((singleProcessDataStore$readAndInitOrPropagateFailure$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label -= Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else if (i == 1) {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation<? super Unit> continuation) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        int i;
        Mutex Mutex$default;
        Ref.ObjectRef objectRef;
        SingleProcessDataStore<T> singleProcessDataStore;
        Ref.ObjectRef objectRef2;
        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list;
        SingleProcessDataStore<T> singleProcessDataStore2;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Object obj;
        Mutex mutex2;
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$12;
        SingleProcessDataStore<T> singleProcessDataStore3;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuation;
            if ((singleProcessDataStore$readAndInit$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label -= Integer.MIN_VALUE;
                T t = (T) singleProcessDataStore$readAndInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t);
                    if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Mutex$default = MutexKt.Mutex$default(false, 1, null);
                    objectRef = new Ref.ObjectRef();
                    singleProcessDataStore$readAndInit$1.L$0 = this;
                    singleProcessDataStore$readAndInit$1.L$1 = Mutex$default;
                    singleProcessDataStore$readAndInit$1.L$2 = objectRef;
                    singleProcessDataStore$readAndInit$1.L$3 = objectRef;
                    singleProcessDataStore$readAndInit$1.label = 1;
                    t = (T) readDataOrHandleCorruption(singleProcessDataStore$readAndInit$1);
                    if (t == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleProcessDataStore = this;
                    objectRef2 = objectRef;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            mutex2 = (Mutex) singleProcessDataStore$readAndInit$1.L$3;
                            booleanRef2 = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
                            objectRef4 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
                            singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                            ResultKt.throwOnFailure(t);
                            try {
                                booleanRef2.element = true;
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                MutableStateFlow<State<T>> mutableStateFlow = singleProcessDataStore3.downstreamFlow;
                                T t2 = objectRef4.element;
                                T t3 = objectRef4.element;
                                mutableStateFlow.setValue(new Data(t2, t3 != null ? t3.hashCode() : 0));
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                    singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                    booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                    objectRef3 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                    mutex = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                    singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                    ResultKt.throwOnFailure(t);
                    while (it.hasNext()) {
                        singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore2;
                        singleProcessDataStore$readAndInit$1.L$1 = mutex;
                        singleProcessDataStore$readAndInit$1.L$2 = objectRef3;
                        singleProcessDataStore$readAndInit$1.L$3 = booleanRef;
                        singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                        singleProcessDataStore$readAndInit$1.L$5 = it;
                        singleProcessDataStore$readAndInit$1.label = 2;
                        if (((Function2) it.next()).invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    obj = coroutine_suspended;
                    objectRef2 = objectRef3;
                    mutex2 = mutex;
                    singleProcessDataStore3 = singleProcessDataStore2;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = objectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = booleanRef;
                    singleProcessDataStore$readAndInit$12.L$3 = mutex2;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (mutex2.lock(null, singleProcessDataStore$readAndInit$12) == obj) {
                        return obj;
                    }
                    objectRef4 = objectRef2;
                    booleanRef2 = booleanRef;
                    booleanRef2.element = true;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    MutableStateFlow<State<T>> mutableStateFlow2 = singleProcessDataStore3.downstreamFlow;
                    T t22 = objectRef4.element;
                    T t32 = objectRef4.element;
                    mutableStateFlow2.setValue(new Data(t22, t32 != null ? t32.hashCode() : 0));
                    return Unit.INSTANCE;
                } else {
                    objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
                    objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                    Mutex$default = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                    ResultKt.throwOnFailure(t);
                }
                objectRef.element = t;
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$12 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, booleanRef3, objectRef2, singleProcessDataStore);
                list = singleProcessDataStore.initTasks;
                if (list != null) {
                    obj = coroutine_suspended;
                    mutex2 = Mutex$default;
                    booleanRef = booleanRef3;
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    singleProcessDataStore3 = singleProcessDataStore;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = objectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = booleanRef;
                    singleProcessDataStore$readAndInit$12.L$3 = mutex2;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (mutex2.lock(null, singleProcessDataStore$readAndInit$12) == obj) {
                    }
                } else {
                    singleProcessDataStore2 = singleProcessDataStore;
                    objectRef3 = objectRef2;
                    singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$12;
                    it = list.iterator();
                    mutex = Mutex$default;
                    booleanRef = booleanRef3;
                    while (it.hasNext()) {
                    }
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    obj = coroutine_suspended;
                    objectRef2 = objectRef3;
                    mutex2 = mutex;
                    singleProcessDataStore3 = singleProcessDataStore2;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = objectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = booleanRef;
                    singleProcessDataStore$readAndInit$12.L$3 = mutex2;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (mutex2.lock(null, singleProcessDataStore$readAndInit$12) == obj) {
                    }
                }
            }
        }
        singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
        T t4 = (T) singleProcessDataStore$readAndInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$1.label;
        if (i != 0) {
        }
        objectRef.element = t4;
        Ref.BooleanRef booleanRef32 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$122 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, booleanRef32, objectRef2, singleProcessDataStore);
        list = singleProcessDataStore.initTasks;
        if (list != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation<? super T> continuation) {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        int i;
        SingleProcessDataStore singleProcessDataStore;
        Object handleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuation instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuation;
            if ((singleProcessDataStore$readDataOrHandleCorruption$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label -= Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
                        obj = readData(singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CorruptionException e) {
                        e = e;
                        singleProcessDataStore = this;
                        CorruptionHandler<T> corruptionHandler = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                        corruptionException = e;
                        obj = handleCorruption;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        if (singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended) {
                        }
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                            corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj2;
                            } catch (IOException e2) {
                                e = e2;
                                ExceptionsKt.addSuppressed(corruptionException2, e);
                                throw corruptionException2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                    singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        return singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended ? coroutine_suspended : obj;
                    } catch (IOException e3) {
                        e = e3;
                        corruptionException2 = corruptionException;
                        ExceptionsKt.addSuppressed(corruptionException2, e);
                        throw corruptionException2;
                    }
                } else {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CorruptionException e4) {
                        e = e4;
                        CorruptionHandler<T> corruptionHandler2 = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler2.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                        }
                    }
                }
                return obj;
            }
        }
        singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
        Object obj3 = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        if (i != 0) {
        }
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, androidx.datastore.core.SingleProcessDataStore$readData$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation<? super T> continuation) {
        SingleProcessDataStore singleProcessDataStore;
        int i;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            if (continuation instanceof SingleProcessDataStore$readData$1) {
                SingleProcessDataStore$readData$1 singleProcessDataStore$readData$1 = (SingleProcessDataStore$readData$1) continuation;
                if ((singleProcessDataStore$readData$1.label & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readData$1.label -= Integer.MIN_VALUE;
                    singleProcessDataStore = singleProcessDataStore$readData$1;
                    Object obj = singleProcessDataStore.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            fileInputStream = new FileInputStream(getFile());
                            Throwable th2 = null;
                            try {
                                singleProcessDataStore.L$0 = this;
                                singleProcessDataStore.L$1 = fileInputStream;
                                singleProcessDataStore.L$2 = null;
                                singleProcessDataStore.label = 1;
                                Object readFrom = this.serializer.readFrom(fileInputStream, singleProcessDataStore);
                                if (readFrom == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                th = null;
                                obj = readFrom;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            singleProcessDataStore = this;
                            if (singleProcessDataStore.getFile().exists()) {
                                throw e;
                            }
                            return singleProcessDataStore.serializer.getDefaultValue();
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        th = (Throwable) singleProcessDataStore.L$2;
                        fileInputStream = (Closeable) singleProcessDataStore.L$1;
                        SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    CloseableKt.closeFinally(fileInputStream, th);
                    return obj;
                }
            }
            if (i != 0) {
            }
            CloseableKt.closeFinally(fileInputStream, th);
            return obj;
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        singleProcessDataStore = new SingleProcessDataStore$readData$1(this, continuation);
        Object obj2 = singleProcessDataStore.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        T t;
        int i;
        Data data;
        Object obj;
        SingleProcessDataStore<T> singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuation instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuation;
            if ((singleProcessDataStore$transformAndWrite$1.label & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label -= Integer.MIN_VALUE;
                t = (T) singleProcessDataStore$transformAndWrite$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$transformAndWrite$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t);
                    Data data2 = (Data) this.downstreamFlow.getValue();
                    data2.checkHashCode();
                    Object value = data2.getValue();
                    singleProcessDataStore$transformAndWrite$1.L$0 = this;
                    singleProcessDataStore$transformAndWrite$1.L$1 = data2;
                    singleProcessDataStore$transformAndWrite$1.L$2 = value;
                    singleProcessDataStore$transformAndWrite$1.label = 1;
                    Object withContext = BuildersKt.withContext(coroutineContext, new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null), singleProcessDataStore$transformAndWrite$1);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    data = data2;
                    t = withContext;
                    obj = value;
                    singleProcessDataStore = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = singleProcessDataStore$transformAndWrite$1.L$1;
                    singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                    ResultKt.throwOnFailure(t);
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj, obj == null ? obj.hashCode() : 0));
                    return obj;
                } else {
                    obj = singleProcessDataStore$transformAndWrite$1.L$2;
                    data = (Data) singleProcessDataStore$transformAndWrite$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                    ResultKt.throwOnFailure(t);
                }
                data.checkHashCode();
                if (!Intrinsics.areEqual(obj, t)) {
                    singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
                    singleProcessDataStore$transformAndWrite$1.L$1 = t;
                    singleProcessDataStore$transformAndWrite$1.L$2 = null;
                    singleProcessDataStore$transformAndWrite$1.label = 2;
                    if (singleProcessDataStore.writeData$datastore_core(t, singleProcessDataStore$transformAndWrite$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = t;
                    singleProcessDataStore2 = singleProcessDataStore;
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj, obj == null ? obj.hashCode() : 0));
                }
                return obj;
            }
        }
        singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
        t = (T) singleProcessDataStore$transformAndWrite$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$transformAndWrite$1.label;
        if (i != 0) {
        }
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj, t)) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: IOException -> 0x00ce, TRY_ENTER, TryCatch #4 {IOException -> 0x00ce, blocks: (B:25:0x009f, B:29:0x00af, B:30:0x00c5, B:33:0x00c8), top: B:50:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(T t, Continuation<? super Unit> continuation) {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        int i;
        File file;
        FileOutputStream fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        File file2;
        Throwable th;
        FileOutputStream fileOutputStream2;
        try {
            if (continuation instanceof SingleProcessDataStore$writeData$1) {
                singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
                if ((singleProcessDataStore$writeData$1.label & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$writeData$1.label -= Integer.MIN_VALUE;
                    Object obj = singleProcessDataStore$writeData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore$writeData$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        createParentDirectories(getFile());
                        file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            Throwable th2 = null;
                            try {
                                FileOutputStream fileOutputStream3 = fileOutputStream;
                                singleProcessDataStore$writeData$1.L$0 = this;
                                singleProcessDataStore$writeData$1.L$1 = file;
                                singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                                singleProcessDataStore$writeData$1.L$3 = null;
                                singleProcessDataStore$writeData$1.L$4 = fileOutputStream3;
                                singleProcessDataStore$writeData$1.label = 1;
                                if (this.serializer.writeTo(t, new UncloseableOutputStream(fileOutputStream3), singleProcessDataStore$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                singleProcessDataStore = this;
                                file2 = file;
                                th = null;
                                fileOutputStream2 = fileOutputStream3;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                    } else if (i == 1) {
                        fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                        th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                        fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                        file2 = (File) singleProcessDataStore$writeData$1.L$1;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2.getFD().sync();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, th);
                    if (file2.renameTo(singleProcessDataStore.getFile())) {
                        throw new IOException("Unable to rename " + file2 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            fileOutputStream2.getFD().sync();
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, th);
            if (file2.renameTo(singleProcessDataStore.getFile())) {
            }
        } catch (IOException e2) {
            e = e2;
            file = 1;
        }
        singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        Object obj2 = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$writeData$1.label;
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;)V", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "close", "", "flush", "write", "b", "", "bytes", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "", "len", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.fileOutputStream.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i, int i2) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
