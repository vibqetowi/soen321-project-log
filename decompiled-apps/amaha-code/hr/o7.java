package hr;

import android.app.ProgressDialog;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Arrays;
/* compiled from: ScreenS33Fragment.kt */
/* loaded from: classes2.dex */
public final class o7 extends kotlin.jvm.internal.k implements ss.l<UploadTask.TaskSnapshot, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l7 f18921u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(l7 l7Var) {
        super(1);
        this.f18921u = l7Var;
    }

    @Override // ss.l
    public final hs.k invoke(UploadTask.TaskSnapshot taskSnapshot) {
        UploadTask.TaskSnapshot it = taskSnapshot;
        l7 l7Var = this.f18921u;
        kotlin.jvm.internal.i.g(it, "it");
        try {
            if (l7Var.isAdded()) {
                double bytesTransferred = (it.getBytesTransferred() * 100.0d) / it.getTotalByteCount();
                LogHelper logHelper = LogHelper.INSTANCE;
                String str = l7Var.f18751u;
                logHelper.i(str, "progress " + ((it.getBytesTransferred() * 100.0d) / it.getTotalByteCount()));
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(bytesTransferred)}, 1));
                kotlin.jvm.internal.i.f(format, "format(format, *args)");
                double parseDouble = Double.parseDouble(format);
                ProgressDialog progressDialog = l7Var.C;
                if (progressDialog != null) {
                    progressDialog.setMessage(parseDouble + " % uploaded");
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(l7Var.f18751u, e10);
        }
        return hs.k.f19476a;
    }
}
