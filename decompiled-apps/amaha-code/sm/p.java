package sm;

import android.os.Bundle;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: JournalThoughtDescriptionFragment.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f31732u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(1);
        this.f31732u = sVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        int i6;
        boolean z10;
        String str;
        int intValue = num.intValue();
        Utils utils = Utils.INSTANCE;
        s sVar = this.f31732u;
        if (utils.checkConnectivity(sVar.requireActivity())) {
            ArrayList<JournalAttachImageModel> arrayList = sVar.H;
            boolean z11 = false;
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
                sVar.F = intValue;
                sVar.J();
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("template", sVar.O().A.b());
                int size = arrayList.size();
                int i10 = s.K;
                if (size == 8) {
                    z11 = true;
                }
                bundle.putBoolean("limit_reached", z11);
                bundle.putInt("step", sVar.f31737x + 1);
                if (sVar.O().H && sVar.O().J != null) {
                    JournalModel journalModel = sVar.O().J;
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
                mm.b bVar = sVar.E;
                if (bVar != null) {
                    bVar.j(intValue);
                } else {
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            }
        }
        return hs.k.f19476a;
    }
}
