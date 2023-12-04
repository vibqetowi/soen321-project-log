package com.ifriend.infrastructure.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.infrastucture.Connectivity;
import com.ifriend.domain.infrastucture.InternetConnection;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InternetConnectionImpl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0002/0B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0016J\u0011\u0010\u001b\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\u000fH\u0016J\b\u0010(\u001a\u00020\u000fH\u0016J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u000e\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010%H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/ifriend/infrastructure/connectivity/InternetConnectionImpl;", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "Landroid/net/ConnectivityManager$NetworkCallback;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "backendUrl", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lkotlin/jvm/functions/Function0;)V", "connectivityFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/infrastucture/Connectivity;", "updateConnectivityState", "Lcom/ifriend/infrastructure/connectivity/InternetConnectionImpl$FetchState;", "getBackendDomain", "getConnectivity", "getConnectivityFlow", "Lkotlinx/coroutines/flow/Flow;", "getLastKnowConnectivityState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInternetAvailable", "", "isNetworkCapabilitiesValid", "onAvailable", "network", "Landroid/net/Network;", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLost", "startMonitorConnectivity", "stopMonitorConnectivity", "triggerCheckNetworkCapabilities", "triggerRecheckNetworkCapabilities", "tryHttpRequest", "url", "tryPing", ClientCookie.DOMAIN_ATTR, "Companion", "FetchState", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternetConnectionImpl extends ConnectivityManager.NetworkCallback implements InternetConnection {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "InternetConnection";
    private static InternetConnectionImpl instance;
    private final Function0<String> backendUrl;
    private final MutableSharedFlow<Unit> connectivityFlow;
    private final ConnectivityManager connectivityManager;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatchers dispatchers;
    private final MutableStateFlow<Connectivity> networkState;
    private final MutableStateFlow<FetchState> updateConnectivityState;

    public /* synthetic */ InternetConnectionImpl(Context context, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, coroutineScope, coroutineDispatchers, function0);
    }

    private InternetConnectionImpl(Context context, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Function0<String> function0) {
        this.coroutineScope = coroutineScope;
        this.dispatchers = coroutineDispatchers;
        this.backendUrl = function0;
        this.networkState = StateFlowKt.MutableStateFlow(Connectivity.Companion.getFULL());
        MutableSharedFlow<Unit> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.connectivityFlow = MutableSharedFlow$default;
        this.updateConnectivityState = StateFlowKt.MutableStateFlow(FetchState.Success);
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.mapLatest(MutableSharedFlow$default, new AnonymousClass1(null)), new AnonymousClass2(null)), coroutineScope);
    }

    /* compiled from: InternetConnectionImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/infrastructure/connectivity/InternetConnectionImpl$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ifriend/infrastructure/connectivity/InternetConnectionImpl;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "backendUrl", "Lkotlin/Function0;", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InternetConnectionImpl instance(Context context, CoroutineScope coroutineScope, CoroutineDispatchers dispatchers, Function0<String> backendUrl) {
            InternetConnectionImpl internetConnectionImpl;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            Intrinsics.checkNotNullParameter(backendUrl, "backendUrl");
            synchronized (this) {
                if (InternetConnectionImpl.instance == null) {
                    synchronized (this) {
                        Companion companion = InternetConnectionImpl.Companion;
                        InternetConnectionImpl.instance = new InternetConnectionImpl(context, coroutineScope, dispatchers, backendUrl, null);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                internetConnectionImpl = InternetConnectionImpl.instance;
                Intrinsics.checkNotNull(internetConnectionImpl);
            }
            return internetConnectionImpl;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InternetConnectionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/infrastructure/connectivity/InternetConnectionImpl$FetchState;", "", "(Ljava/lang/String;I)V", "Loading", "Success", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FetchState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FetchState[] $VALUES;
        public static final FetchState Loading = new FetchState("Loading", 0);
        public static final FetchState Success = new FetchState("Success", 1);

        private static final /* synthetic */ FetchState[] $values() {
            return new FetchState[]{Loading, Success};
        }

        public static EnumEntries<FetchState> getEntries() {
            return $ENTRIES;
        }

        public static FetchState valueOf(String str) {
            return (FetchState) Enum.valueOf(FetchState.class, str);
        }

        public static FetchState[] values() {
            return (FetchState[]) $VALUES.clone();
        }

        private FetchState(String str, int i) {
        }

        static {
            FetchState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: InternetConnectionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lcom/ifriend/domain/infrastucture/Connectivity;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl$1", f = "InternetConnectionImpl.kt", i = {}, l = {SSL.SSL_PROTOCOL_TLS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.infrastructure.connectivity.InternetConnectionImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Connectivity>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Connectivity> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = InternetConnectionImpl.this.getLastKnowConnectivityState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: InternetConnectionImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/infrastucture/Connectivity;", "connectivity", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl$2", f = "InternetConnectionImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.infrastructure.connectivity.InternetConnectionImpl$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Connectivity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Connectivity connectivity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(connectivity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Connectivity connectivity = (Connectivity) this.L$0;
                boolean isFullyConnected = connectivity.isFullyConnected();
                Log.i(InternetConnectionImpl.TAG, "isFullyConnected=" + isFullyConnected);
                this.label = 1;
                if (InternetConnectionImpl.this.networkState.emit(connectivity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.domain.infrastucture.InternetConnection
    public Connectivity getConnectivity() {
        return this.networkState.getValue();
    }

    @Override // com.ifriend.domain.infrastucture.InternetConnection
    public Flow<Connectivity> getConnectivityFlow() {
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.networkState));
    }

    @Override // com.ifriend.domain.infrastucture.InternetConnection
    public void startMonitorConnectivity() {
        triggerCheckNetworkCapabilities();
        this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this);
    }

    @Override // com.ifriend.domain.infrastucture.InternetConnection
    public void stopMonitorConnectivity() {
        this.connectivityManager.unregisterNetworkCallback(this);
    }

    @Override // com.ifriend.domain.infrastucture.InternetConnection
    public void updateConnectivityState() {
        if (this.updateConnectivityState.getValue() == FetchState.Loading) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new InternetConnectionImpl$updateConnectivityState$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkCapabilitiesValid() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        return isNetworkCapabilitiesValid(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        Log.i(TAG, "Internet onAvailable");
        triggerCheckNetworkCapabilities();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        Log.i(TAG, "Internet onLost");
        triggerCheckNetworkCapabilities();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        Log.i(TAG, "onCapabilitiesChanged");
        triggerRecheckNetworkCapabilities();
    }

    private final void triggerRecheckNetworkCapabilities() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new InternetConnectionImpl$triggerRecheckNetworkCapabilities$1(this, null), 3, null);
    }

    private final void triggerCheckNetworkCapabilities() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new InternetConnectionImpl$triggerCheckNetworkCapabilities$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isInternetAvailable(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.dispatchers.getIO(), new InternetConnectionImpl$isInternetAvailable$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBackendDomain() {
        try {
            return (String) CollectionsKt.last((List<? extends Object>) StringsKt.split$default((CharSequence) this.backendUrl.invoke(), new String[]{"//"}, false, 0, 6, (Object) null));
        } catch (Exception e) {
            Log.e(TAG, "Error getting backend domain", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryHttpRequest(String str) {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", "Android");
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return 200 <= responseCode && responseCode < 300;
        } catch (Exception e) {
            Log.e(TAG, "Error checking internet connection", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryPing(String str) {
        try {
            StringBuilder sb = new StringBuilder("ping -c 1 ");
            sb.append(str);
            return Runtime.getRuntime().exec(sb.toString()).waitFor() == 0;
        } catch (Exception e) {
            Log.e(TAG, "Error checking internet connection", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLastKnowConnectivityState(Continuation<? super Connectivity> continuation) {
        InternetConnectionImpl$getLastKnowConnectivityState$1 internetConnectionImpl$getLastKnowConnectivityState$1;
        int i;
        if (continuation instanceof InternetConnectionImpl$getLastKnowConnectivityState$1) {
            internetConnectionImpl$getLastKnowConnectivityState$1 = (InternetConnectionImpl$getLastKnowConnectivityState$1) continuation;
            if ((internetConnectionImpl$getLastKnowConnectivityState$1.label & Integer.MIN_VALUE) != 0) {
                internetConnectionImpl$getLastKnowConnectivityState$1.label -= Integer.MIN_VALUE;
                Object obj = internetConnectionImpl$getLastKnowConnectivityState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = internetConnectionImpl$getLastKnowConnectivityState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!isNetworkCapabilitiesValid()) {
                        return Connectivity.Companion.getNONE();
                    }
                    internetConnectionImpl$getLastKnowConnectivityState$1.label = 1;
                    obj = isInternetAvailable(internetConnectionImpl$getLastKnowConnectivityState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return !((Boolean) obj).booleanValue() ? Connectivity.Companion.getFULL() : new Connectivity(true, false);
            }
        }
        internetConnectionImpl$getLastKnowConnectivityState$1 = new InternetConnectionImpl$getLastKnowConnectivityState$1(this, continuation);
        Object obj2 = internetConnectionImpl$getLastKnowConnectivityState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = internetConnectionImpl$getLastKnowConnectivityState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }

    private final boolean isNetworkCapabilitiesValid(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
        }
        return false;
    }
}
