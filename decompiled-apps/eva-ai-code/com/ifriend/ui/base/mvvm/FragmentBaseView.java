package com.ifriend.ui.base.mvvm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.mvvm.BaseState;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b'\u0018\u0000 \u001f*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001\u001fB\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH'J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0015J\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H'¢\u0006\u0002\u0010\u000fR\u0012\u0010\t\u001a\u00028\u0000X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "VM", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/ui/base/mvvm/BaseState;", "Lcom/ifriend/ui/base/BaseFragment;", "layoutId", "", "(I)V", "viewModel", "getViewModel", "()Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "handleErrors", "", "state", "(Lcom/ifriend/ui/base/mvvm/BaseState;)V", "handleEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "handleNewState", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showErrors", "errors", "", "", "showEvent", "showState", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FragmentBaseView<VM extends BaseViewModel<T>, T extends BaseState> extends BaseFragment {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "iFriendBaseView";

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract VM getViewModel();

    public abstract void showErrors(List<? extends Throwable> list);

    protected void showEvent(BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public abstract void showState(T t);

    public FragmentBaseView(int i) {
        super(i);
    }

    /* compiled from: BaseView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/mvvm/FragmentBaseView$Companion;", "", "()V", "TAG", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new FragmentBaseView$onViewCreated$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new FragmentBaseView$onViewCreated$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(BaseEvent baseEvent) {
        try {
            showEvent(baseEvent);
        } catch (Exception e) {
            String name = getClass().getName();
            String message = e.getMessage();
            Log.e(TAG, name + " showEvent(): " + message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNewState(T t) {
        showState(t);
        if (!t.getErrors().isEmpty()) {
            handleErrors(t);
        }
    }

    private final void handleErrors(T t) {
        try {
            showErrors(t.getErrors());
            t.clearErrors();
        } catch (Exception e) {
            String name = getClass().getName();
            String message = e.getMessage();
            Log.e(TAG, name + " showErrors(): " + message);
        }
    }
}
