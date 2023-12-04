package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.compose.ComposeNavigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.KeychainModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 °\u00012\u00020\u0001:\n°\u0001±\u0001²\u0001³\u0001´\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020XH\u0002J\u0006\u0010Y\u001a\u00020ZJ\u0011\u0010[\u001a\u00020UH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\\J\u0011\u0010]\u001a\u00020UH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\\J\u0006\u0010^\u001a\u00020UJ\u0006\u0010_\u001a\u00020UJ*\u0010`\u001a\u00020U2\u0006\u0010a\u001a\u00020\u00172\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020U0c¢\u0006\u0002\bdH\u0010¢\u0006\u0004\be\u0010fJ:\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h2\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010K2\f\u0010j\u001a\b\u0012\u0004\u0012\u0002Hh0cH\u0082\b¢\u0006\u0002\u0010kJ\u0015\u0010l\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001aH\u0010¢\u0006\u0002\bnJ\u0010\u0010o\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TH\u0002J\b\u0010p\u001a\u00020UH\u0002J\u0015\u0010q\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001aH\u0010¢\u0006\u0002\brJ\u0015\u0010s\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010¢\u0006\u0002\btJ\u0015\u0010u\u001a\u00020U2\u0006\u0010v\u001a\u00020wH\u0010¢\u0006\u0002\bxJ\u0011\u0010y\u001a\u00020UH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\\J\u001d\u0010z\u001a\u00020U2\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001bH\u0010¢\u0006\u0002\b|J\u0017\u0010}\u001a\u0004\u0018\u00010\u001b2\u0006\u0010m\u001a\u00020\u001aH\u0010¢\u0006\u0002\b~J\u0006\u0010\u007f\u001a\u00020UJ\u0011\u0010\u0080\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0002J0\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0082\u00012\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0082\u00012\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002J#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002J0\u0010\u0085\u0001\u001a\u00020U2\r\u0010\u0086\u0001\u001a\b0\u0087\u0001j\u0003`\u0088\u00012\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00172\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0012H\u0002J\u001e\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020U0\u008c\u00012\u0006\u0010a\u001a\u00020\u0017H\u0002JY\u0010\u008d\u0001\u001a\u00020U2D\u0010j\u001a@\b\u0001\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0017\u0012\u00150\u0090\u0001¢\u0006\u000f\b\u0091\u0001\u0012\n\b\u0092\u0001\u0012\u0005\b\b(\u0093\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020U0\u0094\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u008e\u0001¢\u0006\u0003\b\u0095\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020\u0012H\u0002J \u0010\u0097\u0001\u001a\u00020U2\u0014\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020U0\u008c\u0001H\u0082\bJ\u001f\u0010\u0099\u0001\u001a\u00020U2\u000e\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\"H\u0010¢\u0006\u0003\b\u009c\u0001J\u0017\u0010\u009d\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010¢\u0006\u0003\b\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020U2\u0007\u0010 \u0001\u001a\u00020GH\u0002J\u0017\u0010¡\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010¢\u0006\u0003\b¢\u0001J\u000b\u0010£\u0001\u001a\u0004\u0018\u000101H\u0002J\u0007\u0010¤\u0001\u001a\u00020UJ\t\u0010¥\u0001\u001a\u00020UH\u0002J'\u0010¦\u0001\u001a\u00020U2\b\u0010\u0093\u0001\u001a\u00030\u0090\u00012\b\u0010§\u0001\u001a\u00030¨\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010©\u0001J\u0012\u0010ª\u0001\u001a\u00020UH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\\J\u001b\u0010«\u0001\u001a\u00020U2\u0006\u0010B\u001a\u00020\u0003H\u0087@ø\u0001\u0000¢\u0006\u0003\u0010¬\u0001J\u0017\u0010\u00ad\u0001\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0017H\u0010¢\u0006\u0003\b®\u0001J.\u0010¯\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020U0\u008c\u00012\u0006\u0010a\u001a\u00020\u00172\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010KH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00160\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0014R\u0014\u00106\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0014R\u0014\u00108\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0014R\u0014\u0010:\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R\u0011\u0010<\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010\u0014R\u0014\u0010>\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0014R\u000e\u0010@\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bC\u0010-R\u0012\u0010D\u001a\u00060ER\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0014R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001f0KX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070M8FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006µ\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingParameterInformation", "", "getCollectingParameterInformation$runtime_release", "()Z", "compositionInvalidations", "", "Landroidx/compose/runtime/ControlledComposition;", "compositionValueStatesAvailable", "", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContentState;", "compositionValuesAwaitingInsert", "compositionValuesRemoved", "Landroidx/compose/runtime/MovableContent;", "", "compositionsAwaitingApply", "compositionsRemoved", "", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "concurrentCompositionsOutstanding", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "failedCompositions", "frameClockPaused", "hasBroadcastFrameClockAwaiters", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaitersLocked", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "Landroidx/compose/runtime/collection/IdentityArraySet;", "state", "Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "()V", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", KeychainModule.AuthPromptOptions.CANCEL, "close", "composeInitial", "composition", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composing", ExifInterface.GPS_DIRECTION_TRUE, "modifiedValues", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deletedMovableContent", "reference", "deletedMovableContent$runtime_release", "deriveStateLocked", "discardUnusedValues", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "join", "movableContentStateReleased", "data", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "pauseCompositionFrameClock", "performInitialMovableContentInserts", "performInsertValues", "", "references", "performRecompose", "processCompositionError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failedInitialComposition", "recoverable", "readObserverOf", "Lkotlin/Function1;", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModifications", "onEachInvalidComposition", "recordInspectionTable", "table", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposition", "registerComposition$runtime_release", "registerRunnerJob", "callingJob", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "resetErrorState", "resumeCompositionFrameClock", "retryFailedCompositions", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime_release", "writeObserverOf", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recomposer extends CompositionContext {
    private final MutableStateFlow<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final List<ControlledComposition> compositionInvalidations;
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<ControlledComposition> knownCompositions;
    private final RecomposerInfoImpl recomposerInfo;
    private Job runnerJob;
    private IdentityArraySet<Object> snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation<? super Unit> workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(false);

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
    }

    public Recomposer(CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new IdentityArraySet<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob Job = JobKt.Job((Job) effectCoroutineContext.get(Job.Key));
        Job.invokeOnCompletion(new Recomposer$effectJob$1$1(this));
        this.effectJob = Job;
        this.effectCoroutineContext = effectCoroutineContext.plus(broadcastFrameClock).plus(Job);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation<Unit> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if ((!this.compositionInvalidations.isEmpty()) || this.snapshotInvalidations.isNotEmpty() || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.setValue(state);
        if (state == State.PendingWork) {
            CancellableContinuation cancellableContinuation2 = this.workContinuation;
            this.workContinuation = null;
            return cancellableContinuation2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        boolean z2;
        synchronized (this.stateLock) {
            z = !this.isClosed;
        }
        if (z) {
            return true;
        }
        Iterator<Job> it = this.effectJob.getChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (it.next().isActive()) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    public final Flow<State> getState() {
        return getCurrentState();
    }

    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", "key", "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public Flow<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        public final void invalidateGroupsWithKey(int i) {
            List mutableList;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt.toMutableList((Collection) recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((CompositionImpl) arrayList2.get(i3)).invalidateGroupsWithKey(i);
            }
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List mutableList;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt.toMutableList((Collection) recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList2.get(i2));
                hotReloadable.clearContent();
                arrayList3.add(hotReloadable);
            }
            return arrayList3;
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", ComposeNavigator.NAME, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.composition = composition;
            this.composable = composition.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m2862getLambda1$runtime_release());
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.recoverable = z;
            this.cause = cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Exception getCause() {
            return this.cause;
        }
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List mutableList;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            IdentityArraySet<Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new IdentityArraySet<>();
            synchronized (this.stateLock) {
                mutableList = CollectionsKt.toMutableList((Collection) this.knownCompositions);
            }
            try {
                Recomposer recomposer = this;
                int size = mutableList.size();
                for (int i = 0; i < size; i++) {
                    ((ControlledComposition) mutableList.get(i)).recordModificationsOf(identityArraySet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((Collection<? extends Object>) identityArraySet);
                    Unit unit = Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> function1) {
        IdentityArraySet identityArraySet = this.snapshotInvalidations;
        if (identityArraySet.isNotEmpty()) {
            List list = this.knownCompositions;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ControlledComposition) list.get(i)).recordModificationsOf(identityArraySet);
            }
            this.snapshotInvalidations = new IdentityArraySet();
        }
        List list2 = this.compositionInvalidations;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            function1.invoke(list2.get(i2));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job job) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = job;
            deriveStateLocked();
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        return recompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z) {
        Boolean bool = _hotReloadEnabled.get();
        Intrinsics.checkNotNullExpressionValue(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new IdentityArraySet<>();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z, exc);
                if (controlledComposition != null) {
                    ArrayList arrayList = this.failedCompositions;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.failedCompositions = arrayList;
                    }
                    if (!arrayList.contains(controlledComposition)) {
                        arrayList.add(controlledComposition);
                    }
                    this.knownCompositions.remove(controlledComposition);
                }
                deriveStateLocked();
            }
            return;
        }
        throw exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        List<ControlledComposition> list2 = this.failedCompositions;
                        if (list2 != null) {
                            list2.addAll(list);
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                        this.failedCompositions = list;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                throw th;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.stateLock) {
                List<ControlledComposition> list3 = this.failedCompositions;
                if (list3 != null) {
                    list3.addAll(list);
                    if (list3 != null) {
                        list = list3;
                    }
                }
                this.failedCompositions = list;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), continuation);
        return recompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a9 -> B:13:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFrameLoop(MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, Continuation<? super Unit> continuation) {
        Recomposer$runFrameLoop$1 recomposer$runFrameLoop$1;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Recomposer recomposer;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Recomposer recomposer2;
        MonotonicFrameClock monotonicFrameClock2;
        ProduceFrameSignal produceFrameSignal2;
        Object withFrameNanos;
        Object obj;
        ArrayList arrayList5;
        ArrayList arrayList6;
        if (continuation instanceof Recomposer$runFrameLoop$1) {
            recomposer$runFrameLoop$1 = (Recomposer$runFrameLoop$1) continuation;
            if ((recomposer$runFrameLoop$1.label & Integer.MIN_VALUE) != 0) {
                recomposer$runFrameLoop$1.label -= Integer.MIN_VALUE;
                Object obj2 = recomposer$runFrameLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recomposer$runFrameLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    recomposer = this;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$2;
                    monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$1;
                    recomposer2 = (Recomposer) recomposer$runFrameLoop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    arrayList4 = (List) recomposer$runFrameLoop$1.L$4;
                    arrayList3 = (List) recomposer$runFrameLoop$1.L$3;
                    recomposer$runFrameLoop$1.L$0 = recomposer2;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$3 = arrayList3;
                    recomposer$runFrameLoop$1.L$4 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    withFrameNanos = monotonicFrameClock2.withFrameNanos(new Recomposer$runFrameLoop$2(recomposer2, arrayList3, arrayList4, produceFrameSignal2), recomposer$runFrameLoop$1);
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (withFrameNanos == coroutine_suspended) {
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$2;
                    monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$1;
                    recomposer2 = (Recomposer) recomposer$runFrameLoop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    arrayList6 = (List) recomposer$runFrameLoop$1.L$4;
                    arrayList5 = (List) recomposer$runFrameLoop$1.L$3;
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recomposer2 = recomposer;
                    monotonicFrameClock2 = monotonicFrameClock;
                    arrayList4 = arrayList2;
                    produceFrameSignal2 = produceFrameSignal;
                    arrayList3 = arrayList;
                    recomposer$runFrameLoop$1.L$0 = recomposer2;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$3 = arrayList3;
                    recomposer$runFrameLoop$1.L$4 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    withFrameNanos = monotonicFrameClock2.withFrameNanos(new Recomposer$runFrameLoop$2(recomposer2, arrayList3, arrayList4, produceFrameSignal2), recomposer$runFrameLoop$1);
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (withFrameNanos == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                }
            }
        }
        recomposer$runFrameLoop$1 = new Recomposer$runFrameLoop$1(this, continuation);
        Object obj22 = recomposer$runFrameLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recomposer$runFrameLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this.stateLock) {
            if (!getHasSchedulingWork()) {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl2 = null;
            }
        }
        if (cancellableContinuationImpl2 != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        Job.DefaultImpls.cancel$default((Job) this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object first = FlowKt.first(getCurrentState(), new Recomposer$join$2(null), continuation);
        return first == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? first : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean isComposing = composition.isComposing();
        try {
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            MutableSnapshot mutableSnapshot = takeMutableSnapshot;
            Snapshot makeCurrent = mutableSnapshot.makeCurrent();
            try {
                composition.composeContent(content);
                Unit unit = Unit.INSTANCE;
                applyAndCheck(takeMutableSnapshot);
                if (!isComposing) {
                    Snapshot.Companion.notifyObjectsInitialized();
                }
                synchronized (this.stateLock) {
                    if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(composition)) {
                        this.knownCompositions.add(composition);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                try {
                    performInitialMovableContentInserts(composition);
                    try {
                        composition.applyChanges();
                        composition.applyLateChanges();
                        if (isComposing) {
                            return;
                        }
                        Snapshot.Companion.notifyObjectsInitialized();
                    } catch (Exception e) {
                        processCompositionError$default(this, e, null, false, 6, null);
                    }
                } catch (Exception e2) {
                    processCompositionError(e2, composition, true);
                }
            } finally {
                mutableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Exception e3) {
            processCompositionError(e3, composition, true);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (Intrinsics.areEqual(list.get(i).getComposition$runtime_release(), controlledComposition)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                Unit unit = Unit.INSTANCE;
                ArrayList arrayList = new ArrayList();
                performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                while (!arrayList.isEmpty()) {
                    performInsertValues(arrayList, null);
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (Intrinsics.areEqual(next.getComposition$runtime_release(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        if (!controlledComposition.isComposing() && !controlledComposition.isDisposed()) {
            Set<ControlledComposition> set = this.compositionsRemoved;
            boolean z = true;
            if (!(set != null && set.contains(controlledComposition))) {
                MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
                try {
                    MutableSnapshot mutableSnapshot = takeMutableSnapshot;
                    Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                    if (identityArraySet == null || !identityArraySet.isNotEmpty()) {
                        z = false;
                    }
                    if (z) {
                        controlledComposition.prepareCompose(new Recomposer$performRecompose$1$1(identityArraySet, controlledComposition));
                    }
                    boolean recompose = controlledComposition.recompose();
                    mutableSnapshot.restoreCurrent(makeCurrent);
                    if (recompose) {
                        return controlledComposition;
                    }
                    return null;
                } finally {
                    applyAndCheck(takeMutableSnapshot);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i;
        ArrayList emptyList;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                List flatten = CollectionsKt.flatten(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                ArrayList arrayList = new ArrayList(flatten.size());
                int size = flatten.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) flatten.get(i2);
                    arrayList.add(TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                emptyList = arrayList;
                this.compositionValueStatesAvailable.clear();
            } else {
                emptyList = CollectionsKt.emptyList();
            }
        }
        int size2 = emptyList.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) emptyList.get(i);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    private final Function1<Object, Unit> readObserverOf(ControlledComposition controlledComposition) {
        return new Recomposer$readObserverOf$1(controlledComposition);
    }

    private final Function1<Object, Unit> writeObserverOf(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        return new Recomposer$writeObserverOf$1(controlledComposition, identityArraySet);
    }

    private final <T> T composing(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet, Function0<? extends T> function0) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            MutableSnapshot mutableSnapshot = takeMutableSnapshot;
            Snapshot makeCurrent = mutableSnapshot.makeCurrent();
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            mutableSnapshot.restoreCurrent(makeCurrent);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
            InlineMarker.finallyStart(1);
            applyAndCheck(takeMutableSnapshot);
            InlineMarker.finallyEnd(1);
        }
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    private final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    public final Object awaitIdle(Continuation<? super Unit> continuation) {
        Object collect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new Recomposer$awaitIdle$2(null)), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuation;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuation = deriveStateLocked();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition composition) {
        CancellableContinuation<Unit> cancellableContinuation;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuation = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuation = deriveStateLocked();
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
        CancellableContinuation<Unit> deriveStateLocked;
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            deriveStateLocked.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
        CancellableContinuation<Unit> deriveStateLocked;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            deriveStateLocked.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            LinkedHashSet linkedHashSet = this.compositionsRemoved;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.compositionsRemoved = linkedHashSet;
            }
            linkedHashSet.add(composition);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
        MovableContentState remove;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(reference);
        }
        return remove;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\"J\u0014\u0010#\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010$\u001a\u00020\u0001H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\b(R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, remove));
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(true);
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                CollectionsKt.addAll(arrayList, recomposerInfoImpl.saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object token) {
            Intrinsics.checkNotNullParameter(token, "token");
            Recomposer._hotReloadEnabled.set(true);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                recomposerInfoImpl.resetErrorState();
            }
            List list = (List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            for (RecomposerInfoImpl recomposerInfoImpl2 : (Iterable) Recomposer._runningRecomposers.getValue()) {
                recomposerInfoImpl2.retryFailedCompositions();
            }
        }

        public final void invalidateGroupsWithKey$runtime_release(int i) {
            Recomposer._hotReloadEnabled.set(true);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                boolean z = false;
                if (currentError != null && !currentError.getRecoverable()) {
                    z = true;
                }
                if (!z) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final void clearErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorState resetErrorState = recomposerInfoImpl.resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> identityArraySet) {
        Iterator it;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = list.get(i);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition$runtime_release();
            HashMap hashMap2 = hashMap;
            Object obj = hashMap2.get(composition$runtime_release);
            if (obj == null) {
                obj = new ArrayList();
                hashMap2.put(composition$runtime_release, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        HashMap hashMap3 = hashMap;
        Iterator it2 = hashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
            try {
                MutableSnapshot mutableSnapshot = takeMutableSnapshot;
                Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                synchronized (this.stateLock) {
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i2);
                        arrayList2.add(TuplesKt.to(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        i2++;
                        it2 = it2;
                    }
                    it = it2;
                    arrayList = arrayList2;
                }
                controlledComposition.insertMovableContent(arrayList);
                Unit unit = Unit.INSTANCE;
                mutableSnapshot.restoreCurrent(makeCurrent);
                applyAndCheck(takeMutableSnapshot);
                it2 = it;
            } catch (Throwable th) {
                applyAndCheck(takeMutableSnapshot);
                throw th;
            }
        }
        return CollectionsKt.toList(hashMap3.keySet());
    }
}
