package rm;

import android.os.Bundle;
import android.widget.Toast;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: JournalTodayQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f30797u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(1);
        this.f30797u = hVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        int i6;
        boolean z10;
        String str;
        int intValue = num.intValue();
        Utils utils = Utils.INSTANCE;
        h hVar = this.f30797u;
        if (utils.checkConnectivity(hVar.requireActivity())) {
            ArrayList<JournalAttachImageModel> arrayList = hVar.K;
            boolean z11 = true;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                i6 = 0;
            } else {
                Iterator<JournalAttachImageModel> it = arrayList.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    JournalAttachImageModel next = it.next();
                    if (!(next.getImageUploadStatus() instanceof ImageResponse.Uploading) && !(next.getImageUploadStatus() instanceof ImageResponse.UploadingStarted)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && (i6 = i6 + 1) < 0) {
                        ca.a.s1();
                        throw null;
                    }
                }
            }
            if (i6 <= 0) {
                arrayList.get(intValue).setImageUploadStatus(ImageResponse.Pending.INSTANCE);
                hVar.I = intValue;
                hVar.J();
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("template", hVar.O().A.b());
                int size = arrayList.size();
                int i10 = h.N;
                if (size != 8) {
                    z11 = false;
                }
                bundle.putBoolean("limit_reached", z11);
                if (hVar.O().H && hVar.O().J != null) {
                    JournalModel journalModel = hVar.O().J;
                    if (journalModel != null) {
                        str = journalModel.getId();
                    } else {
                        str = null;
                    }
                } else {
                    str = "fresh_entry";
                }
                bundle.putString("entry_id", str);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "journal_image_add_retry_click");
                mm.b bVar = hVar.H;
                if (bVar != null) {
                    bVar.j(intValue);
                } else {
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            } else {
                Toast.makeText(hVar.requireContext(), "Please wait image is uploading", 0).show();
            }
        }
        return hs.k.f19476a;
    }
}
