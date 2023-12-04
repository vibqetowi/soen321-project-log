package androidx.navigation.dynamicfeatures;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.dynamicfeatures.DynamicInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DynamicInstallManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "sessionId", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicInstallManager$requestInstall$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ DynamicInstallMonitor $installMonitor;
    final /* synthetic */ String $module;
    final /* synthetic */ MutableLiveData<SplitInstallSessionState> $status;
    final /* synthetic */ DynamicInstallManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicInstallManager$requestInstall$2(DynamicInstallMonitor dynamicInstallMonitor, DynamicInstallManager dynamicInstallManager, MutableLiveData<SplitInstallSessionState> mutableLiveData, String str) {
        super(1);
        this.$installMonitor = dynamicInstallMonitor;
        this.this$0 = dynamicInstallManager;
        this.$status = mutableLiveData;
        this.$module = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer sessionId) {
        SplitInstallManager splitInstallManager;
        Context context;
        SplitInstallManager splitInstallManager2;
        DynamicInstallMonitor dynamicInstallMonitor = this.$installMonitor;
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        dynamicInstallMonitor.setSessionId$navigation_dynamic_features_runtime_release(sessionId.intValue());
        DynamicInstallMonitor dynamicInstallMonitor2 = this.$installMonitor;
        splitInstallManager = this.this$0.splitInstallManager;
        dynamicInstallMonitor2.setSplitInstallManager(splitInstallManager);
        if (sessionId.intValue() != 0) {
            context = this.this$0.context;
            DynamicInstallManager.SplitInstallListenerWrapper splitInstallListenerWrapper = new DynamicInstallManager.SplitInstallListenerWrapper(context, this.$status, this.$installMonitor);
            splitInstallManager2 = this.this$0.splitInstallManager;
            splitInstallManager2.registerListener(splitInstallListenerWrapper);
            return;
        }
        this.$status.setValue(SplitInstallSessionState.create(sessionId.intValue(), 5, 0, 0L, 0L, CollectionsKt.listOf(this.$module), CollectionsKt.emptyList()));
        DynamicInstallManager.Companion.terminateLiveData$navigation_dynamic_features_runtime_release(this.$status);
    }
}
