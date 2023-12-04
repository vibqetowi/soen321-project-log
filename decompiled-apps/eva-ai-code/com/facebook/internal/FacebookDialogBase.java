package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FacebookDialogBase.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 @*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0002@AB\u0017\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\b\u0014\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u000f\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\u001e\u0010!\u001a\u0018\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0017H\u0002J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0014¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020(H\u0004J\u001f\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020.H$J\u0012\u00101\u001a\u0002022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001e\u00103\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0016J&\u00103\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u00106\u001a\u0002022\u0006\u0010\u0010\u001a\u0002072\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000105H$J\u0010\u00108\u001a\u0002022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u00109\u001a\u0002022\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u001d\u0010;\u001a\u0002022\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0014¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\u0006\u0010\u0006\u001a\u00020\u0007H\u0004R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0017X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\fR\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase;", "CONTENT", "RESULT", "Lcom/facebook/FacebookDialog;", "activity", "Landroid/app/Activity;", "requestCode", "", "(Landroid/app/Activity;I)V", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;I)V", "(I)V", "activityContext", "getActivityContext", "()Landroid/app/Activity;", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager$facebook_common_release", "()Lcom/facebook/CallbackManager;", "setCallbackManager$facebook_common_release", "(Lcom/facebook/CallbackManager;)V", "modeHandlers", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "orderedModeHandlers", "getOrderedModeHandlers", "()Ljava/util/List;", "value", "getRequestCode", "()I", "setRequestCode", "requestCodeField", "cachedModeHandlers", "canShow", "", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/Object;)Z", "canShowImpl", RtspHeaders.Values.MODE, "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createActivityResultContractForShowingDialog", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "createAppCallForMode", "Lcom/facebook/internal/AppCall;", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "createBaseAppCall", "memorizeCallbackManager", "", "registerCallback", "callback", "Lcom/facebook/FacebookCallback;", "registerCallbackImpl", "Lcom/facebook/internal/CallbackManagerImpl;", "setCallbackManager", "show", "(Ljava/lang/Object;)V", "showImpl", "(Ljava/lang/Object;Ljava/lang/Object;)V", "startActivityForResult", "intent", "Landroid/content/Intent;", "Companion", "ModeHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    private static final String TAG = "FacebookDialog";
    private final Activity activity;
    private CallbackManager callbackManager;
    private final FragmentWrapper fragmentWrapper;
    private List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
    private int requestCodeField;
    public static final Companion Companion = new Companion(null);
    public static final Object BASE_AUTOMATIC_MODE = new Object();

    protected abstract AppCall createBaseAppCall();

    protected abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    protected abstract void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    public final CallbackManager getCallbackManager$facebook_common_release() {
        return this.callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FacebookDialogBase(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i;
        this.callbackManager = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FacebookDialogBase(FragmentWrapper fragmentWrapper, int i) {
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i;
        if (fragmentWrapper.getActivity() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FacebookDialogBase(int i) {
        this.requestCodeField = i;
        this.activity = null;
        this.fragmentWrapper = null;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        memorizeCallbackManager(callbackManager);
        registerCallbackImpl((CallbackManagerImpl) callbackManager, callback);
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> callback, int i) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        memorizeCallbackManager(callbackManager);
        setRequestCode(i);
        registerCallback(callbackManager, callback);
    }

    public final int getRequestCode() {
        return this.requestCodeField;
    }

    public final void setRequestCode(int i) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!(!FacebookSdk.isFacebookRequestCode(i))) {
            throw new IllegalArgumentException(("Request code " + i + " cannot be within the range reserved by the Facebook SDK.").toString());
        }
        this.requestCodeField = i;
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean canShowImpl(CONTENT content, Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode == BASE_AUTOMATIC_MODE;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (!z) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                    continue;
                }
            }
            if (modeHandler.canShow(content, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    protected final ActivityResultContract<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(final CallbackManager callbackManager, final Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new ActivityResultContract<CONTENT, CallbackManager.ActivityResultParameters>(this) { // from class: com.facebook.internal.FacebookDialogBase$createActivityResultContractForShowingDialog$1
            final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, CONTENT content) {
                AppCall createAppCallForMode;
                Intrinsics.checkNotNullParameter(context, "context");
                createAppCallForMode = this.this$0.createAppCallForMode(content, mode);
                Intent requestIntent = createAppCallForMode == null ? null : createAppCallForMode.getRequestIntent();
                if (requestIntent != null) {
                    createAppCallForMode.setPending();
                    return requestIntent;
                }
                throw new FacebookException("Content " + content + " is not supported");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public CallbackManager.ActivityResultParameters parseResult(int i, Intent intent) {
                CallbackManager callbackManager2 = callbackManager;
                if (callbackManager2 != null) {
                    callbackManager2.onActivityResult(this.this$0.getRequestCode(), i, intent);
                }
                return new CallbackManager.ActivityResultParameters(this.this$0.getRequestCode(), i, intent);
            }
        };
    }

    @Override // com.facebook.FacebookDialog
    public ActivityResultContract<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(CallbackManager callbackManager) {
        return createActivityResultContractForShowingDialog(callbackManager, BASE_AUTOMATIC_MODE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showImpl(CONTENT content, Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        AppCall createAppCallForMode = createAppCallForMode(content, mode);
        if (createAppCallForMode != null) {
            if (getActivityContext() instanceof ActivityResultRegistryOwner) {
                Activity activityContext = getActivityContext();
                if (activityContext == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
                ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) activityContext).getActivityResultRegistry();
                Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "registryOwner.activityResultRegistry");
                DialogPresenter.present(createAppCallForMode, activityResultRegistry, this.callbackManager);
                createAppCallForMode.setPending();
                return;
            } else if (this.fragmentWrapper != null) {
                DialogPresenter dialogPresenter2 = DialogPresenter.INSTANCE;
                DialogPresenter.present(createAppCallForMode, this.fragmentWrapper);
                return;
            } else if (this.activity != null) {
                DialogPresenter dialogPresenter3 = DialogPresenter.INSTANCE;
                DialogPresenter.present(createAppCallForMode, this.activity);
                return;
            } else {
                return;
            }
        }
        Log.e(TAG, "No code path should ever result in a null appCall");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!(!FacebookSdk.isDebugEnabled())) {
            throw new IllegalStateException("No code path should ever result in a null appCall".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Activity getActivityContext() {
        Activity activity = this.activity;
        if (activity == null) {
            FragmentWrapper fragmentWrapper = this.fragmentWrapper;
            if (fragmentWrapper == null) {
                return null;
            }
            return fragmentWrapper.getActivity();
        }
        return activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void startActivityForResult(Intent intent, int i) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Activity activityContext = getActivityContext();
        if (activityContext instanceof ActivityResultRegistryOwner) {
            DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) activityContext).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            DialogPresenter.startActivityForResultWithAndroidX(activityResultRegistry, this.callbackManager, intent, i);
        } else if (activityContext != null) {
            activityContext.startActivityForResult(intent, i);
        } else {
            FragmentWrapper fragmentWrapper = this.fragmentWrapper;
            if (fragmentWrapper == null) {
                str = "Failed to find Activity or Fragment to startActivityForResult ";
                if (str == null) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
                    companion.log(loggingBehavior, 6, name, str);
                    return;
                }
                return;
            }
            fragmentWrapper.startActivityForResult(intent, i);
        }
        str = null;
        if (str == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCall createAppCallForMode(CONTENT content, Object obj) {
        AppCall appCall;
        boolean z = obj == BASE_AUTOMATIC_MODE;
        Iterator<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> it = cachedModeHandlers().iterator();
        while (true) {
            if (!it.hasNext()) {
                appCall = null;
                break;
            }
            FacebookDialogBase<CONTENT, RESULT>.ModeHandler next = it.next();
            if (!z) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.areObjectsEqual(next.getMode(), obj)) {
                    continue;
                }
            }
            if (next.canShow(content, true)) {
                try {
                    appCall = next.createAppCall(content);
                    break;
                } catch (FacebookException e) {
                    AppCall createBaseAppCall = createBaseAppCall();
                    DialogPresenter dialogPresenter = DialogPresenter.INSTANCE;
                    DialogPresenter.setupAppCallForValidationError(createBaseAppCall, e);
                    appCall = createBaseAppCall;
                }
            }
        }
        if (appCall == null) {
            AppCall createBaseAppCall2 = createBaseAppCall();
            DialogPresenter dialogPresenter2 = DialogPresenter.INSTANCE;
            DialogPresenter.setupAppCallForCannotShowError(createBaseAppCall2);
            return createBaseAppCall2;
        }
        return appCall;
    }

    private final void memorizeCallbackManager(CallbackManager callbackManager) {
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    private final List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        List list = (List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler>) this.modeHandlers;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: FacebookDialogBase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b¤\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "", "(Lcom/facebook/internal/FacebookDialogBase;)V", RtspHeaders.Values.MODE, "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", FirebaseAnalytics.Param.CONTENT, "isBestEffort", "(Ljava/lang/Object;Z)Z", "createAppCall", "Lcom/facebook/internal/AppCall;", "(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public abstract class ModeHandler {
        private Object mode;
        final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

        public abstract boolean canShow(CONTENT content, boolean z);

        public abstract AppCall createAppCall(CONTENT content);

        public ModeHandler(FacebookDialogBase this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }
    }

    /* compiled from: FacebookDialogBase.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$Companion;", "", "()V", "BASE_AUTOMATIC_MODE", "TAG", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
