package androidx.databinding;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ViewDataBindingKtx.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "()V", "CREATE_STATE_FLOW_LISTENER", "Landroidx/databinding/CreateWeakListener;", "updateStateFlowRegistration", "", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "localFieldId", "", "observable", "Lkotlinx/coroutines/flow/Flow;", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewDataBindingKtx {
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBindingKtx$$ExternalSyntheticLambda0
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0;
            CREATE_STATE_FLOW_LISTENER$lambda$0 = ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i, referenceQueue);
            return CREATE_STATE_FLOW_LISTENER$lambda$0;
        }
    };

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        Intrinsics.checkNotNullExpressionValue(referenceQueue, "referenceQueue");
        return new StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }

    @JvmStatic
    public static final boolean updateStateFlowRegistration(ViewDataBinding viewDataBinding, int i, Flow<?> flow) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i, flow, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }

    /* compiled from: ViewDataBindingKtx.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lkotlinx/coroutines/flow/Flow;", "", "binder", "Landroidx/databinding/ViewDataBinding;", "localFieldId", "", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/databinding/WeakListener;", "observerJob", "Lkotlinx/coroutines/Job;", "addListener", "", TypedValues.AttributesType.S_TARGET, "getListener", "removeListener", "setLifecycleOwner", "lifecycleOwner", "startCollection", "owner", "flow", "databindingKtx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class StateFlowListener implements ObservableReference<Flow<? extends Object>> {
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;
        private final WeakListener<Flow<Object>> listener;
        private Job observerJob;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<Flow<? extends Object>> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(Flow<? extends Object> flow) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || flow == null) {
                return;
            }
            startCollection(lifecycleOwner, flow);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(Flow<? extends Object> flow) {
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observerJob = null;
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, Flow<? extends Object> flow) {
            Job launch$default;
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, flow, this, null), 3, null);
            this.observerJob = launch$default;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            Flow<Object> target = this.listener.getTarget();
            if (target != null) {
                startCollection(lifecycleOwner, target);
            }
        }
    }
}
