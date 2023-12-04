package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NestedScrollNode.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J)\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u001cH\u0002J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b5R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "connection", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "parentConnection", "getParentConnection", "parentModifierLocal", "getParentModifierLocal", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "resolvedDispatcher", "onAttach", "", "onDetach", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "resetDispatcherFields", "updateDispatcher", "newDispatcher", "updateDispatcherFields", "updateNode", "updateNode$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedScrollNode extends Modifier.Node implements ModifierLocalModifierNode, NestedScrollConnection, DelegatableNode {
    private NestedScrollConnection connection;
    private final ModifierLocalMap providedValues;
    private NestedScrollDispatcher resolvedDispatcher;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection, "<set-?>");
        this.connection = nestedScrollConnection;
    }

    public NestedScrollNode(NestedScrollConnection connection, NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    private final NestedScrollNode getParentModifierLocal() {
        if (isAttached()) {
            return (NestedScrollNode) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return (NestedScrollConnection) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope scope$ui_release;
        NestedScrollNode parentModifierLocal = getParentModifierLocal();
        if ((parentModifierLocal == null || (scope$ui_release = parentModifierLocal.getNestedCoroutineScope()) == null) && (scope$ui_release = this.resolvedDispatcher.getScope$ui_release()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope$ui_release;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo598onPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parentConnection = getParentConnection();
        long mo598onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo598onPreScrollOzD1aCk(j, i) : Offset.Companion.m3034getZeroF1C5BW0();
        return Offset.m3023plusMKHz9U(mo598onPreScrollOzD1aCk, this.connection.mo598onPreScrollOzD1aCk(Offset.m3022minusMKHz9U(j, mo598onPreScrollOzD1aCk), i));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo596onPostScrollDzOQY0M(long j, long j2, int i) {
        long m3034getZeroF1C5BW0;
        long mo596onPostScrollDzOQY0M = this.connection.mo596onPostScrollDzOQY0M(j, j2, i);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            m3034getZeroF1C5BW0 = parentConnection.mo596onPostScrollDzOQY0M(Offset.m3023plusMKHz9U(j, mo596onPostScrollDzOQY0M), Offset.m3022minusMKHz9U(j2, mo596onPostScrollDzOQY0M), i);
        } else {
            m3034getZeroF1C5BW0 = Offset.Companion.m3034getZeroF1C5BW0();
        }
        return Offset.m3023plusMKHz9U(mo596onPostScrollDzOQY0M, m3034getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo597onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        long m5843getZero9UxMQ8M;
        NestedScrollNode nestedScrollNode;
        long j2;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            if ((nestedScrollNode$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label -= Integer.MIN_VALUE;
                obj = nestedScrollNode$onPreFling$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection parentConnection = getParentConnection();
                    if (parentConnection == null) {
                        m5843getZero9UxMQ8M = Velocity.Companion.m5843getZero9UxMQ8M();
                        nestedScrollNode = this;
                        long j3 = j;
                        j2 = m5843getZero9UxMQ8M;
                        NestedScrollConnection nestedScrollConnection = nestedScrollNode.connection;
                        long m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j3, j2);
                        nestedScrollNode$onPreFling$1.L$0 = null;
                        nestedScrollNode$onPreFling$1.J$0 = j2;
                        nestedScrollNode$onPreFling$1.label = 2;
                        obj = nestedScrollConnection.mo597onPreFlingQWom1Mo(m5835minusAH228Gc, nestedScrollNode$onPreFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j2, ((Velocity) obj).m5841unboximpl()));
                    }
                    nestedScrollNode$onPreFling$1.L$0 = this;
                    nestedScrollNode$onPreFling$1.J$0 = j;
                    nestedScrollNode$onPreFling$1.label = 1;
                    obj = parentConnection.mo597onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollNode = this;
                } else if (i != 1) {
                    if (i == 2) {
                        j2 = nestedScrollNode$onPreFling$1.J$0;
                        ResultKt.throwOnFailure(obj);
                        return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j2, ((Velocity) obj).m5841unboximpl()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j = nestedScrollNode$onPreFling$1.J$0;
                    nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPreFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
                long j32 = j;
                j2 = m5843getZero9UxMQ8M;
                NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.connection;
                long m5835minusAH228Gc2 = Velocity.m5835minusAH228Gc(j32, j2);
                nestedScrollNode$onPreFling$1.L$0 = null;
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                obj = nestedScrollConnection2.mo597onPreFlingQWom1Mo(m5835minusAH228Gc2, nestedScrollNode$onPreFling$1);
                if (obj == coroutine_suspended) {
                }
                return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j2, ((Velocity) obj).m5841unboximpl()));
            }
        }
        nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, continuation);
        obj = nestedScrollNode$onPreFling$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPreFling$1.label;
        if (i != 0) {
        }
        m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
        long j322 = j;
        j2 = m5843getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection22 = nestedScrollNode.connection;
        long m5835minusAH228Gc22 = Velocity.m5835minusAH228Gc(j322, j2);
        nestedScrollNode$onPreFling$1.L$0 = null;
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        obj = nestedScrollConnection22.mo597onPreFlingQWom1Mo(m5835minusAH228Gc22, nestedScrollNode$onPreFling$1);
        if (obj == coroutine_suspended) {
        }
        return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j2, ((Velocity) obj).m5841unboximpl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo595onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long j4;
        NestedScrollNode nestedScrollNode;
        NestedScrollConnection parentConnection;
        long j5;
        long m5843getZero9UxMQ8M;
        long j6;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            if ((nestedScrollNode$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label -= Integer.MIN_VALUE;
                Object obj = nestedScrollNode$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection nestedScrollConnection = this.connection;
                    nestedScrollNode$onPostFling$1.L$0 = this;
                    j3 = j;
                    nestedScrollNode$onPostFling$1.J$0 = j3;
                    j4 = j2;
                    nestedScrollNode$onPostFling$1.J$1 = j4;
                    nestedScrollNode$onPostFling$1.label = 1;
                    obj = nestedScrollConnection.mo595onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollNode = this;
                } else if (i != 1) {
                    if (i == 2) {
                        j6 = nestedScrollNode$onPostFling$1.J$0;
                        ResultKt.throwOnFailure(obj);
                        m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
                        j5 = j6;
                        return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j5, m5843getZero9UxMQ8M));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    long j7 = nestedScrollNode$onPostFling$1.J$1;
                    long j8 = nestedScrollNode$onPostFling$1.J$0;
                    nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPostFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j4 = j7;
                    j3 = j8;
                }
                long m5841unboximpl = ((Velocity) obj).m5841unboximpl();
                parentConnection = nestedScrollNode.getParentConnection();
                if (parentConnection == null) {
                    long m5836plusAH228Gc = Velocity.m5836plusAH228Gc(j3, m5841unboximpl);
                    long m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j4, m5841unboximpl);
                    nestedScrollNode$onPostFling$1.L$0 = null;
                    nestedScrollNode$onPostFling$1.J$0 = m5841unboximpl;
                    nestedScrollNode$onPostFling$1.label = 2;
                    obj = parentConnection.mo595onPostFlingRZ2iAVY(m5836plusAH228Gc, m5835minusAH228Gc, nestedScrollNode$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j6 = m5841unboximpl;
                    m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
                    j5 = j6;
                    return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j5, m5843getZero9UxMQ8M));
                }
                j5 = m5841unboximpl;
                m5843getZero9UxMQ8M = Velocity.Companion.m5843getZero9UxMQ8M();
                return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j5, m5843getZero9UxMQ8M));
            }
        }
        nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuation);
        Object obj2 = nestedScrollNode$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPostFling$1.label;
        if (i != 0) {
        }
        long m5841unboximpl2 = ((Velocity) obj2).m5841unboximpl();
        parentConnection = nestedScrollNode.getParentConnection();
        if (parentConnection == null) {
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setModifierLocalNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new NestedScrollNode$updateDispatcherFields$1(this));
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getModifierLocalNode$ui_release() == this) {
            this.resolvedDispatcher.setModifierLocalNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(NestedScrollConnection connection, NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
