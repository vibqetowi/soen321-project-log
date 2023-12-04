package com.ifriend.common_entities_engine;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.ExceptionListenerRegistry;
import com.ifriend.common_entities_engine.State;
import com.ifriend.common_utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: BaseEngine.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\r\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010)\u001a\u00020#2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150*H\u0016J\b\u0010+\u001a\u00020#H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0019\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u001f\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J\u0011\u00106\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0016J\u0016\u00109\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010:\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\b\u0010;\u001a\u00020#H\u0002J\u0016\u0010<\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\b\u0010=\u001a\u00020#H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u001e\u0010?\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010@\u001a\u00020AH\u0016J\u0011\u0010B\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0002\u00107R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u008c\u0001\u0010\u0012\u001az\u0012(\u0012&\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015 \u0016*\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\u00140\u0014\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00170\u0017 \u0016*<\u0012(\u0012&\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015 \u0016*\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\u00140\u0014\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00180\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lcom/ifriend/common_entities_engine/BaseEngine;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "Lcom/ifriend/common_entities_engine/Engine;", "Lcom/ifriend/common_entities_engine/SystemBinder;", "defaultState", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/common_entities_engine/State;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/common_utils/Logger;)V", "controller", "Lcom/ifriend/common_entities_engine/SystemController;", "getController$common_entities_engine", "()Lcom/ifriend/common_entities_engine/SystemController;", "exceptionListeners", "", "Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry$ExceptionListener;", "plannedUpdatingSystems", "", "Ljava/lang/Class;", "Lcom/ifriend/common_entities_engine/System;", "kotlin.jvm.PlatformType", "", "", "getPlannedUpdatingSystems$common_entities_engine", "()Ljava/util/Map;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "systems", "getSystems$common_entities_engine", "()Ljava/util/List;", "updatingStateMutex", "Lkotlinx/coroutines/sync/Mutex;", "addExceptionListener", "", "exceptionListener", "attach", "system", "currentState", "()Lcom/ifriend/common_entities_engine/State;", "detach", "", "detachAll", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "handle", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalDetach", "internalReportUpdateState", "reportedSystem", "(Lcom/ifriend/common_entities_engine/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalUpdateState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvent", "removeExceptionListener", "reportUpdateState", "resetAllPlannedUpdatingSystems", "restart", "startAll", "stopAll", "throwException", "exception", "", "updateState", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseEngine<S extends State> implements Engine<S>, SystemBinder<S> {
    private final SystemController<S> controller;
    private final CoroutineScope coroutineScope;
    private final List<ExceptionListenerRegistry.ExceptionListener<S>> exceptionListeners;
    private final Logger logger;
    private final Map<Class<? extends System<S>>, Boolean> plannedUpdatingSystems;
    private final MutableStateFlow<S> stateFlow;
    private final List<System<S>> systems;
    private final Mutex updatingStateMutex;

    public BaseEngine(S defaultState, CoroutineScope coroutineScope, Logger logger) {
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.stateFlow = StateFlowKt.MutableStateFlow(defaultState);
        this.systems = new ArrayList();
        this.plannedUpdatingSystems = Collections.synchronizedMap(new LinkedHashMap());
        this.exceptionListeners = new ArrayList();
        this.controller = new SystemController<>();
        this.updatingStateMutex = MutexKt.Mutex(false);
    }

    public final List<System<S>> getSystems$common_entities_engine() {
        return this.systems;
    }

    public final Map<Class<? extends System<S>>, Boolean> getPlannedUpdatingSystems$common_entities_engine() {
        return this.plannedUpdatingSystems;
    }

    public final SystemController<S> getController$common_entities_engine() {
        return this.controller;
    }

    @Override // com.ifriend.common_entities_engine.SystemBinder
    public S currentState() {
        return getState().getValue();
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public StateFlow<S> getState() {
        return this.stateFlow;
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public BaseEngine<S> attach(System<S> system) {
        Intrinsics.checkNotNullParameter(system, "system");
        system.bind(this);
        this.systems.add(system);
        return this;
    }

    private final void internalDetach(System<S> system) {
        this.controller.stop(system);
        system.unbind();
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void detach(System<S> system) {
        Intrinsics.checkNotNullParameter(system, "system");
        internalDetach(system);
        this.systems.remove(system);
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void detachAll() {
        for (System<S> system : this.systems) {
            internalDetach(system);
        }
        this.systems.clear();
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void detach(List<? extends System<S>> systems) {
        Intrinsics.checkNotNullParameter(systems, "systems");
        for (System<S> system : systems) {
            internalDetach(system);
        }
        this.systems.removeAll(systems);
    }

    @Override // com.ifriend.common_entities_engine.SystemBinder
    public void postEvent(Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BaseEngine$postEvent$1(this, event, null), 3, null);
    }

    @Override // com.ifriend.common_entities_engine.EventHandler
    public Object handle(Event event, Continuation<? super Boolean> continuation) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BaseEngine$handle$2(this, event, null), 3, null);
        return Boxing.boxBoolean(false);
    }

    @Override // com.ifriend.common_entities_engine.SystemBinder
    public void reportUpdateState(System<S> reportedSystem) {
        Intrinsics.checkNotNullParameter(reportedSystem, "reportedSystem");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BaseEngine$reportUpdateState$1(this, reportedSystem, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object internalReportUpdateState(System<S> system, Continuation<? super Unit> continuation) {
        if (system.isStarted()) {
            if (Intrinsics.areEqual(this.plannedUpdatingSystems.get(system.getClass()), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            Iterator<T> it = this.systems.iterator();
            while (it.hasNext()) {
                Map<Class<? extends System<S>>, Boolean> map = this.plannedUpdatingSystems;
                Intrinsics.checkNotNull(map);
                map.put(((System) it.next()).getClass(), Boxing.boxBoolean(true));
            }
            Object updateState = updateState(continuation);
            return updateState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateState : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateState(Continuation<? super Unit> continuation) {
        BaseEngine$updateState$1 baseEngine$updateState$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        BaseEngine baseEngine;
        Mutex mutex2;
        Throwable th;
        try {
            if (continuation instanceof BaseEngine$updateState$1) {
                baseEngine$updateState$1 = (BaseEngine$updateState$1) continuation;
                if ((baseEngine$updateState$1.label & Integer.MIN_VALUE) != 0) {
                    baseEngine$updateState$1.label -= Integer.MIN_VALUE;
                    Object obj = baseEngine$updateState$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = baseEngine$updateState$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.updatingStateMutex;
                        baseEngine$updateState$1.L$0 = this;
                        baseEngine$updateState$1.L$1 = mutex;
                        baseEngine$updateState$1.label = 1;
                        if (mutex.lock(null, baseEngine$updateState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        baseEngine = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            mutex2 = (Mutex) baseEngine$updateState$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        baseEngine = (BaseEngine) baseEngine$updateState$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) baseEngine$updateState$1.L$1;
                    }
                    baseEngine$updateState$1.L$0 = mutex;
                    baseEngine$updateState$1.L$1 = null;
                    baseEngine$updateState$1.label = 2;
                    if (baseEngine.internalUpdateState(baseEngine$updateState$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            baseEngine$updateState$1.L$0 = mutex;
            baseEngine$updateState$1.L$1 = null;
            baseEngine$updateState$1.label = 2;
            if (baseEngine.internalUpdateState(baseEngine$updateState$1) != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        baseEngine$updateState$1 = new BaseEngine$updateState$1(this, continuation);
        Object obj2 = baseEngine$updateState$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseEngine$updateState$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:25:0x0089). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateState(Continuation<? super Unit> continuation) {
        BaseEngine$internalUpdateState$1 baseEngine$internalUpdateState$1;
        int i;
        BaseEngine<S> baseEngine;
        ComponentsHolder componentsHolder;
        Iterator<System<S>> it;
        if (continuation instanceof BaseEngine$internalUpdateState$1) {
            baseEngine$internalUpdateState$1 = (BaseEngine$internalUpdateState$1) continuation;
            if ((baseEngine$internalUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                baseEngine$internalUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj = baseEngine$internalUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseEngine$internalUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    baseEngine = this;
                    componentsHolder = (State) this.stateFlow.getValue();
                    it = this.systems.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    System<S> system = (System) baseEngine$internalUpdateState$1.L$3;
                    it = (Iterator) baseEngine$internalUpdateState$1.L$2;
                    componentsHolder = (State) baseEngine$internalUpdateState$1.L$1;
                    baseEngine = (BaseEngine) baseEngine$internalUpdateState$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        baseEngine.logger.logException(new ExceptionInSystem(system, e));
                    }
                    componentsHolder = (State) obj;
                    if (it.hasNext()) {
                        system = it.next();
                        Map<Class<? extends System<S>>, Boolean> map = baseEngine.plannedUpdatingSystems;
                        Intrinsics.checkNotNull(map);
                        map.put(system.getClass(), Boxing.boxBoolean(false));
                        baseEngine$internalUpdateState$1.L$0 = baseEngine;
                        baseEngine$internalUpdateState$1.L$1 = componentsHolder;
                        baseEngine$internalUpdateState$1.L$2 = it;
                        baseEngine$internalUpdateState$1.L$3 = system;
                        baseEngine$internalUpdateState$1.label = 1;
                        obj = baseEngine.controller.updateState$common_entities_engine(componentsHolder, system, baseEngine$internalUpdateState$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        componentsHolder = (State) obj;
                        if (it.hasNext()) {
                            baseEngine.stateFlow.setValue(componentsHolder);
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        baseEngine$internalUpdateState$1 = new BaseEngine$internalUpdateState$1(this, continuation);
        Object obj2 = baseEngine$internalUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseEngine$internalUpdateState$1.label;
        if (i != 0) {
        }
    }

    @Override // com.ifriend.common_entities_engine.ExceptionListenerRegistry
    public void addExceptionListener(ExceptionListenerRegistry.ExceptionListener<S> exceptionListener) {
        Intrinsics.checkNotNullParameter(exceptionListener, "exceptionListener");
        this.exceptionListeners.add(exceptionListener);
    }

    @Override // com.ifriend.common_entities_engine.ExceptionListenerRegistry
    public void removeExceptionListener(ExceptionListenerRegistry.ExceptionListener<S> exceptionListener) {
        Intrinsics.checkNotNullParameter(exceptionListener, "exceptionListener");
        this.exceptionListeners.remove(exceptionListener);
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void startAll() {
        for (System<S> system : this.systems) {
            this.controller.start(system);
        }
        resetAllPlannedUpdatingSystems();
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void stopAll() {
        for (System<S> system : this.systems) {
            this.controller.stop(system);
        }
        resetAllPlannedUpdatingSystems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetAllPlannedUpdatingSystems() {
        Iterator<T> it = this.systems.iterator();
        while (it.hasNext()) {
            Map<Class<? extends System<S>>, Boolean> map = this.plannedUpdatingSystems;
            Intrinsics.checkNotNull(map);
            map.put(((System) it.next()).getClass(), false);
        }
    }

    @Override // com.ifriend.common_entities_engine.Engine
    public void restart(System<S> system) {
        Intrinsics.checkNotNullParameter(system, "system");
        BaseEngineKt.restart(this.controller, system);
    }

    @Override // com.ifriend.common_entities_engine.SystemBinder
    public void throwException(System<S> system, Throwable exception) {
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Iterator<T> it = this.exceptionListeners.iterator();
        while (it.hasNext()) {
            ((ExceptionListenerRegistry.ExceptionListener) it.next()).onException(system, exception);
        }
    }
}
