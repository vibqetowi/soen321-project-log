package androidx.compose.ui;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.apache.commons.codec.language.bm.Languages;
/* compiled from: Modifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", TtmlNode.COMBINE_ALL, "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean all(Function1<? super Element, Boolean> function1);

    boolean any(Function1<? super Element, Boolean> function1);

    <R> R foldIn(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <R> R foldOut(R r, Function2<? super Element, ? super R, ? extends R> function2);

    Modifier then(Modifier modifier);

    /* compiled from: Modifier.kt */
    /* renamed from: androidx.compose.ui.Modifier$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        static {
            Companion companion = Modifier.Companion;
        }

        public static Modifier $default$then(Modifier _this, Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other == Modifier.Companion ? _this : new CombinedModifier(_this, other);
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return CC.$default$then(modifier, other);
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", TtmlNode.COMBINE_ALL, "", "predicate", "Lkotlin/Function1;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Element extends Modifier {
        @Override // androidx.compose.ui.Modifier
        boolean all(Function1<? super Element, Boolean> function1);

        @Override // androidx.compose.ui.Modifier
        boolean any(Function1<? super Element, Boolean> function1);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R r, Function2<? super R, ? super Element, ? extends R> function2);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R r, Function2<? super Element, ? super R, ? extends R> function2);

        /* compiled from: Modifier.kt */
        /* renamed from: androidx.compose.ui.Modifier$Element$-CC  reason: invalid class name */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            public static Object $default$foldIn(Element _this, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, _this);
            }

            public static Object $default$foldOut(Element _this, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(_this, obj);
            }

            public static boolean $default$any(Element _this, Function1 predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return ((Boolean) predicate.invoke(_this)).booleanValue();
            }

            public static boolean $default$all(Element _this, Function1 predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return ((Boolean) predicate.invoke(_this)).booleanValue();
            }
        }

        /* compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static Modifier then(Element element, Modifier other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return CC.$default$then(element, other);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) CC.$default$foldIn(element, r, operation);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, Function2<? super Element, ? super R, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) CC.$default$foldOut(element, r, operation);
            }

            @Deprecated
            public static boolean any(Element element, Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return CC.$default$any(element, predicate);
            }

            @Deprecated
            public static boolean all(Element element, Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return CC.$default$all(element, predicate);
            }
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u00106\u001a\u00020\u00182\n\u00107\u001a\u0006\u0012\u0002\b\u000308H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020<H\u0010¢\u0006\u0002\b=J\r\u0010>\u001a\u00020<H\u0010¢\u0006\u0002\b?J\b\u0010@\u001a\u00020<H\u0016J\b\u0010A\u001a\u00020<H\u0016J\b\u0010B\u001a\u00020<H\u0016J\r\u0010C\u001a\u00020<H\u0010¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020<H\u0010¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020<H\u0010¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\u0000H\u0000¢\u0006\u0002\bKJ\u0016\u0010L\u001a\u00020<2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020<0NH\u0007J\u0017\u0010O\u001a\u00020<2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0002\bPR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u000bR\u000e\u0010$\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u0010\u0010/\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u00188VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u001aR\u001a\u00103\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "()V", "aggregateChildKindSet", "", "getAggregateChildKindSet$ui_release", "()I", "setAggregateChildKindSet$ui_release", "(I)V", "child", "getChild$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setChild$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<set-?>", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "insertedNodeAwaitingAttachForInvalidation", "", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "isAttached", "kindSet", "getKindSet$ui_release", "setKindSet$ui_release", "node", "getNode$annotations", "getNode", "onAttachRunExpected", "onDetachRunExpected", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "parent", "getParent$ui_release", "setParent$ui_release", "scope", "shouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "getShouldAutoInvalidate", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "isKind", "kind", "Landroidx/compose/ui/node/NodeKind;", "isKind-H91voCI$ui_release", "(I)Z", "markAsAttached", "", "markAsAttached$ui_release", "markAsDetached", "markAsDetached$ui_release", "onAttach", "onDetach", "onReset", "reset", "reset$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "setAsDelegateTo", "owner", "setAsDelegateTo$ui_release", "sideEffect", "effect", "Lkotlin/Function0;", "updateCoordinator", "updateCoordinator$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private CoroutineScope scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope == null) {
                Node node = this;
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(node).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(node).getCoroutineContext().get(Job.Key))));
                this.scope = CoroutineScope;
                return CoroutineScope;
            }
            return coroutineScope;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public final void setParent$ui_release(Node node) {
            this.parent = node;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final void setChild$ui_release(Node node) {
            this.child = node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        /* renamed from: isKind-H91voCI$ui_release  reason: not valid java name */
        public final boolean m2909isKindH91voCI$ui_release(int i) {
            return (i & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (!(!this.isAttached)) {
                throw new IllegalStateException("node attached multiple times".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.onAttachRunExpected) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("node detached multiple times".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.onDetachRunExpected) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.onDetachRunExpected = false;
            onDetach();
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.onAttachRunExpected)) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.onDetachRunExpected)) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Check failed.".toString());
            }
            onReset();
        }

        public final void sideEffect(Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public final void setAsDelegateTo$ui_release(Node owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.node = owner;
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", TtmlNode.COMBINE_ALL, "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r, Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        public String toString() {
            return "Modifier";
        }

        private Companion() {
        }
    }
}
