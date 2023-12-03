package dl;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends ProviderDetailHolderModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13117u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13117u = v3DashboardActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:9:0x0016, B:11:0x001e, B:17:0x002a, B:21:0x0037, B:23:0x003d, B:24:0x0045, B:26:0x0061, B:27:0x0070, B:32:0x00c0, B:34:0x00d5, B:36:0x00fa, B:43:0x011f, B:45:0x012e, B:46:0x0132, B:39:0x0112, B:35:0x00e8, B:20:0x0034, B:28:0x009a, B:30:0x00ab, B:31:0x00b5), top: B:52:0x0016 }] */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar) {
        ProviderDetailHolderModel providerDetailHolderModel;
        boolean z10;
        String providerType;
        String str;
        User user;
        hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar2 = fVar;
        String str2 = null;
        if (fVar2 != null) {
            providerDetailHolderModel = (ProviderDetailHolderModel) fVar2.f19465v;
        } else {
            providerDetailHolderModel = null;
        }
        int i6 = V3DashboardActivity.f10714r1;
        V3DashboardActivity v3DashboardActivity = this.f13117u;
        v3DashboardActivity.getClass();
        if (providerDetailHolderModel != null) {
            try {
                String videoLink = providerDetailHolderModel.getVideoLink();
                if (videoLink != null && !gv.n.B0(videoLink)) {
                    z10 = false;
                    if (!z10) {
                        View n02 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                        if (n02 != null) {
                            n02.setVisibility(0);
                        }
                        View n03 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                        if (n03 != null) {
                            n03.setOnClickListener(new z(v3DashboardActivity, providerDetailHolderModel, 0));
                        }
                        BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clProviderVideoViewParentContainer)).setState(3);
                        ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.innerContainer);
                        if (constraintLayout != null) {
                            constraintLayout.setPaddingRelative(0, 0, 0, (int) v3DashboardActivity.getResources().getDimension(R.dimen._100sdp));
                        }
                        v3DashboardActivity.S0().c(v3DashboardActivity.findViewById(R.id.clProviderVideoViewParentContainer), providerDetailHolderModel, new a1(v3DashboardActivity, providerDetailHolderModel), new b1(v3DashboardActivity, providerDetailHolderModel), true);
                        BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clProviderVideoViewParentContainer)).addBottomSheetCallback(new c1(v3DashboardActivity));
                    } else {
                        Dialog b10 = v3DashboardActivity.S0().b(providerDetailHolderModel);
                        View findViewById = b10.findViewById(R.id.inAppPromptDialogBg);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new dk.t(11, v3DashboardActivity, providerDetailHolderModel, b10));
                        }
                        b10.setOnDismissListener(new tk.a(v3DashboardActivity, 1, providerDetailHolderModel));
                        b10.show();
                    }
                    String str3 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    if (!kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                        bundle.putString("psychiatrist_name", providerDetailHolderModel.getName());
                        bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                    } else {
                        bundle.putString("therapist_name", providerDetailHolderModel.getName());
                        bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                    }
                    bundle.putString("source", "in_app_provider_video");
                    providerType = providerDetailHolderModel.getProviderType();
                    if (!kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
                        str = "couples";
                    } else if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
                        str = "therapy";
                    } else {
                        str = "psychiatry";
                    }
                    bundle.putString("flow", str);
                    user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str2 = user.getCurrentCourseName();
                    }
                    bundle.putString("domain", str2);
                    bundle.putString("platform", "android_app");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "in_app_provider_video_dialog_shown");
                }
                z10 = true;
                if (!z10) {
                }
                String str32 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                if (!kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                }
                bundle2.putString("source", "in_app_provider_video");
                providerType = providerDetailHolderModel.getProviderType();
                if (!kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
                }
                bundle2.putString("flow", str);
                user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                }
                bundle2.putString("domain", str2);
                bundle2.putString("platform", "android_app");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "in_app_provider_video_dialog_shown");
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
