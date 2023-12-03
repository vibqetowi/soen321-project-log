package hr;

import android.app.ProgressDialog;
import android.net.Uri;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
/* compiled from: ScreenS33Fragment.kt */
/* loaded from: classes2.dex */
public final class m7 extends kotlin.jvm.internal.k implements ss.l<Uri, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l7 f18843u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(l7 l7Var) {
        super(1);
        this.f18843u = l7Var;
    }

    @Override // ss.l
    public final hs.k invoke(Uri uri) {
        String label;
        Uri uri2 = uri;
        l7 l7Var = this.f18843u;
        l7Var.D = uri2;
        if (l7Var.isAdded()) {
            TemplateActivity templateActivity = l7Var.F;
            if (templateActivity != null) {
                if (templateActivity.W) {
                    androidx.fragment.app.p activity = l7Var.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateModel templateModel = ((TemplateActivity) activity).f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        ((fm.a) l7Var.B.getValue()).l(label);
                    }
                } else {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.i(l7Var.f18751u, "success in uploading image " + uri2);
                    String uri3 = uri2.toString();
                    kotlin.jvm.internal.i.f(uri3, "tt.toString()");
                    String F0 = gv.n.F0(uri3, "https:", "");
                    androidx.fragment.app.p activity2 = l7Var.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity2).y0();
                    kotlin.jvm.internal.i.d(y02);
                    ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(y02.getData().get("result_11"));
                    ArrayList<CompassionLetterStorageModel> gratitude_files = gratitudeLetterMapToObject.getGratitude_files();
                    Utils utils = Utils.INSTANCE;
                    long timeInSeconds = utils.getTimeInSeconds();
                    Uri uri4 = l7Var.E;
                    if (uri4 != null) {
                        String lastPathSegment = uri4.getLastPathSegment();
                        kotlin.jvm.internal.i.d(lastPathSegment);
                        gratitude_files.add(new CompassionLetterStorageModel(timeInSeconds, lastPathSegment, F0));
                        y02.getData().put("result_11", gratitudeLetterMapToObject);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ProgressDialog progressDialog = l7Var.C;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                            l7Var.requireActivity().runOnUiThread(new tl.o(28, l7Var));
                            utils.showCustomToast(l7Var.getActivity(), "Uploaded Successfully");
                        } else {
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("file");
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
