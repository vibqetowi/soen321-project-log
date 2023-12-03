package d7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class o implements f7.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f12255a = new o();
    }

    @Override // gs.a
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
